#include <iostream>
#include "JavaANGLE.h"
#include <GLFW/glfw3.h>
#include <EGL/gl32.h>

#define GLFWWINDOW_LIMIT 64
#define GLFWMONITOR_LIMIT 64

// Limit is 64 because I don't think we're going to have more than one window, much less two.
GLFWwindow** glfwwindows = new GLFWwindow * [GLFWWINDOW_LIMIT];
GLFWmonitor** glfwmonitors = new GLFWmonitor* [GLFWMONITOR_LIMIT];
int glfwwindowsIndex = 1;

/////////////////////////////////////////////////////////////////////////////////////////////
//    _____ _      ________          __
//    / ____| |    |  ____\ \        / /
//   | |  __| |    | |__   \ \  /\  / / 
//   | | |_ | |    |  __|   \ \/  \/ /  
//   | |__| | |____| |       \  /\  /   
//    \_____|______|_|        \/  \/    
//                                      
/////////////////////////////////////////////////////////////////////////////////////////////

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwInit(JNIEnv*, jclass) {
	return glfwInit();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwTerminate
(JNIEnv*, jclass) {
	glfwTerminate();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwInitHint
(JNIEnv*, jclass, jint hint, jint value) {
	glfwInitHint(hint, value);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwWindowHint
(JNIEnv*, jclass, jint hint, jint value) {
	glfwWindowHint((int)hint, (int)value);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwCreateWindow
(JNIEnv* env, jclass, jint width, jint height, jstring title, jobject monitor, jint share) {
	// TODO: 2 jobjects which are using NULL placeholder.
	 
	GLFWwindow* window = glfwCreateWindow((int)width, (int)height, env->GetStringUTFChars(title, NULL), NULL, NULL);

	if (!window) {
		std::cerr << "Failed to create GLFWwindow." << std::endl;
		return 0;
	}

	if (glfwwindowsIndex < GLFWWINDOW_LIMIT) {
		glfwwindows[glfwwindowsIndex++] = window;
		return glfwwindowsIndex - 1;
	}
	else {
		std::cerr << "GLFWwindow limit of " << GLFWWINDOW_LIMIT << " reached." << std::endl;
		return 0;
	}
}

bool checkWindow(int window) {
	if (!glfwwindows[window] || window == 0) {
		std::cerr << "Invalid GLFWwindow " << window << std::endl;
		return false;
	}
	return true;
}

jstring getString(JNIEnv* env, const char* str) {
	if (str == nullptr) return env->NewStringUTF("");
	else return env->NewStringUTF(reinterpret_cast<const char*>(str)); // Convert to jstring
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwMakeContextCurrent
(JNIEnv*, jclass, jint window) {
	if (!checkWindow(window)) return;
	glfwMakeContextCurrent(glfwwindows[window]);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetFramebufferWidth
(JNIEnv*, jclass, jint window) {
	if (!checkWindow(window)) return -1;
	int width, height;
	glfwGetFramebufferSize(glfwwindows[window], &width, &height);
	return width;
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetFramebufferHeight
(JNIEnv*, jclass, jint window) {
	if (!checkWindow(window)) return -1;
	int width, height;
	glfwGetFramebufferSize(glfwwindows[window], &width, &height);
	return height;
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSwapBuffers
(JNIEnv*, jclass, jint window) {
	if (!checkWindow(window)) return;
	glfwSwapBuffers(glfwwindows[window]);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwPollEvents
(JNIEnv*, jclass) {
	glfwPollEvents();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSetWindowShouldClose
(JNIEnv*, jclass, jint window, jint value) {
	if (!checkWindow(window)) return;
	glfwSetWindowShouldClose(glfwwindows[window], value);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwWindowShouldClose
(JNIEnv*, jclass, jint window) {
	if (!checkWindow(window)) return 0;
	return glfwWindowShouldClose(glfwwindows[window]);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetKey
(JNIEnv*, jclass, jint window, jint key) {
	if (!checkWindow(window)) return -1;
	return glfwGetKey(glfwwindows[window], key);
}


JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetVersionMajor
(JNIEnv*, jclass) {
	int major, minor, rev;
	glfwGetVersion(&major, &minor, &rev);
	return major;
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetVersionMinor
(JNIEnv*, jclass) {
	int major, minor, rev;
	glfwGetVersion(&major, &minor, &rev);
	return minor;
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetVersionRev
(JNIEnv*, jclass) {
	int major, minor, rev;
	glfwGetVersion(&major, &minor, &rev);
	return rev;
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetVersionString
(JNIEnv* env, jclass) {
	return getString(env, glfwGetVersionString());
}

// TODO: Have no idea if this works, give it a proper test.
JNIEXPORT jobjectArray JNICALL Java_javaangle_JavaANGLE_glfwGetError
(JNIEnv* env, jclass) {
	const char** strs = new const char* [128];

	glfwGetError(strs);

	jobjectArray stringArray = env->NewObjectArray(sizeof(strs), env->FindClass("java/lang/String"), nullptr);
	for (int i = 0; i < sizeof(strs); i++) {
		
		jstring jstr;
		if (strs[i] == nullptr) jstr = env->NewStringUTF("");
		else jstr = env->NewStringUTF(reinterpret_cast<const char*>(strs[i]));

		env->SetObjectArrayElement(stringArray, i, jstr);
		env->DeleteLocalRef(jstr);

		// Then somehow add jstr to a jarray? I need help here...
	}

	delete[] strs;

	return stringArray;
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetPlatform
(JNIEnv*, jclass) {
	return glfwGetPlatform();
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwPlatformSupported
(JNIEnv*, jclass, jint platform) {
	return glfwPlatformSupported(platform);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwDefaultWindowHints
(JNIEnv*, jclass) {
	glfwDefaultWindowHints();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwWaitEvents
(JNIEnv*, jclass) {
	glfwWaitEvents();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwWaitEventsTimeout
(JNIEnv*, jclass, jdouble timeout) {
	glfwWaitEventsTimeout(timeout);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwPostEmptyEvent
(JNIEnv*, jclass) {
	glfwPostEmptyEvent();
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetInputMode
(JNIEnv*, jclass, jint window, jint mode) {
	if (!checkWindow(window)) return -1;
	glfwGetInputMode(glfwwindows[window], mode);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSetInputMode
(JNIEnv*, jclass, jint window, jint mode, jint value) {
	if (!checkWindow(window)) return;
	glfwSetInputMode(glfwwindows[window], mode, value);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwRawMouseMotionSupported
(JNIEnv*, jclass) {
	return glfwRawMouseMotionSupported();
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetKeyName
(JNIEnv* env, jclass, jint key, jint scancode) {
	return getString(env, glfwGetKeyName(key, scancode));
}


JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetKeyScancode
(JNIEnv*, jclass, jint key) {
	return glfwGetKeyScancode(key);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetMouseButton
(JNIEnv*, jclass, jint window, jint button) {
	if (!checkWindow(window)) return -1;
	return glfwGetMouseButton(glfwwindows[window], button);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSetCursorPos
(JNIEnv*, jclass, jint window, jdouble x, jdouble y) {
	if (!checkWindow(window)) return;
	glfwSetCursorPos(glfwwindows[window], x, y);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwJoystickPresent
(JNIEnv*, jclass, jint jid) {
	return glfwJoystickPresent(jid);
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetJoystickName
(JNIEnv* env, jclass, jint jid) {
	return getString(env, glfwGetJoystickName(jid));
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetJoystickGUID
(JNIEnv* env, jclass, jint jid) {
	return getString(env, glfwGetJoystickGUID(jid));
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwJoystickIsGamepad
(JNIEnv*, jclass, jint jid) {
	return glfwJoystickIsGamepad(jid);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwUpdateGamepadMappings
(JNIEnv* env, jclass, jstring mappings) {
	return glfwUpdateGamepadMappings(env->GetStringUTFChars(mappings, nullptr));
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetGamepadName
(JNIEnv* env, jclass, jint jid) {
	return getString(env, glfwGetGamepadName(jid));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSetClipboardString
(JNIEnv* env, jclass, jint window, jstring text) {
	if (!checkWindow(window)) return;
	glfwSetClipboardString(glfwwindows[window], env->GetStringUTFChars(text, nullptr));
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glfwGetClipboardString
(JNIEnv* env, jclass, jint window) {
	if (!checkWindow(window)) return env->NewStringUTF("");

	return getString(env, glfwGetClipboardString(glfwwindows[window]));
}

JNIEXPORT jdouble JNICALL Java_javaangle_JavaANGLE_glfwGetTime
(JNIEnv*, jclass) {
	return glfwGetTime();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSetTime
(JNIEnv*, jclass, jdouble time) {
	glfwSetTime(time);
}

JNIEXPORT jlong JNICALL Java_javaangle_JavaANGLE_glfwGetTimerValue
(JNIEnv*, jclass) {
	return glfwGetTimerValue();
}

JNIEXPORT jlong JNICALL Java_javaangle_JavaANGLE_glfwGetTimerFrequency
(JNIEnv*, jclass) {
	return glfwGetTimerFrequency();
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwGetCurrentContext
(JNIEnv*, jclass) {
	GLFWwindow* window = glfwGetCurrentContext();
	// We have to perform a linear search
	for (int i = 0; i < GLFWWINDOW_LIMIT; i++) {
		if (window == glfwwindows[i]) return i;
	}
	return -1;
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glfwSwapInterval
(JNIEnv*, jclass, jint interval) {
	glfwSwapInterval(interval);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwExtensionSupported
(JNIEnv* env, jclass, jstring extension) {
	return glfwExtensionSupported(env->GetStringUTFChars(extension, nullptr));
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glfwVulkanSupported
(JNIEnv*, jclass) {
	return glfwVulkanSupported();
}















/////////////////////////////////////////////////////////////////////////////////////////////
//    ____                    _____ _        ______  _____ 
//    / __ \                  / ____| |      |  ____|/ ____|
//   | |  | |_ __   ___ _ __ | |  __| |      | |__  | (___  
//   | |  | | '_ \ / _ \ '_ \| | |_ | |      |  __|  \___ \ 
//   | |__| | |_) |  __/ | | | |__| | |____  | |____ ____) |
//    \____/| .__/ \___|_| |_|\_____|______| |______|_____/ 
//          | |                                             
//          |_|           
/////////////////////////////////////////////////////////////////////////////////////////////

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glViewport
(JNIEnv*, jclass, jint x, jint y, jint w, jint h) {
	glViewport(x, y, w, h);
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glGetString
(JNIEnv* env, jclass, jint name) {
	const GLubyte* str = glGetString(name);
	if (str == nullptr) return env->NewStringUTF("");
	else return env->NewStringUTF(reinterpret_cast<const char*>(str));
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glCreateShader
(JNIEnv*, jclass, jint type) {
	return glCreateShader(type);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glShaderSource
(JNIEnv* env, jclass, jint shader, jint count, jobjectArray string) {
	jsize stringArrayLength = env->GetArrayLength(string);

	const char** stringArray = new const char* [stringArrayLength];
	GLint* lengths = new GLint[stringArrayLength];


	for (jsize i = 0; i < stringArrayLength; ++i) {
		jstring javaString = (jstring)env->GetObjectArrayElement(string, i);
		jsize lengthInChars = env->GetStringLength(javaString);

		const char* cString = env->GetStringUTFChars(javaString, nullptr);

		stringArray[i] = cString;
		lengths[i] = lengthInChars;

		env->ReleaseStringUTFChars(javaString, cString);
	}

	// 4. Call glShaderSource
	glShaderSource(shader, count, stringArray, lengths);

	// 5. Clean up the temporary array
	delete[] stringArray;
	delete[] lengths;
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glCompileShader
(JNIEnv*, jclass, jint shader) {
	glCompileShader(shader);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGetProgramiv
(JNIEnv* env, jclass, jint program, jint pname, jobject params) {
	int* ptr = (int*)env->GetDirectBufferAddress(params);
	glGetProgramiv(program, pname, ptr);
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glGetShaderInfoLog
(JNIEnv* env, jclass, jint shader) {
	char* infoLog = new char[1024];
	int strLen = 0;
	glGetShaderInfoLog(shader, 1024, &strLen, infoLog);
	jstring javaString = env->NewStringUTF(infoLog);


	delete[] infoLog;
	return javaString;
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glGetProgramInfoLog
(JNIEnv* env, jclass, jint program) {
	char* infoLog = new char[1024];
	int strLen = 0;
	glGetShaderInfoLog(program, 1024, &strLen, infoLog);
	jstring javaString = env->NewStringUTF(infoLog);

	delete[] infoLog;
	return javaString;
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glAttachShader
(JNIEnv*, jclass, jint program, jint shader) {
	glAttachShader(program, shader);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDetachShader
(JNIEnv*, jclass, jint program, jint shader) {
	glDetachShader(program, shader);
}


JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glLinkProgram
(JNIEnv*, jclass, jint program) {
	glLinkProgram(program);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDeleteShader
(JNIEnv*, jclass, jint shader) {
	glDeleteShader(shader);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glCreateProgram
(JNIEnv*, jclass) {
	return glCreateProgram();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGenBuffers
(JNIEnv* env, jclass, jint n, jobject buffers) {
	uint32_t* ptr = (uint32_t*)env->GetDirectBufferAddress(buffers);
	glGenBuffers(n, ptr);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glBindBuffer
(JNIEnv* env, jclass, jint target, jint buffer) {
	glBindBuffer(target, buffer);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glBufferData
(JNIEnv* env, jclass, jint target, jint size, jobject data, jint usage) {
	uint32_t* ptr = (uint32_t*)env->GetDirectBufferAddress(data);
	glBufferData(target, size, ptr, usage);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glClearColor
(JNIEnv*, jclass, jfloat r, jfloat g, jfloat b, jfloat a) {
	glClearColor(r, g, b, a);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glClear
(JNIEnv*, jclass, jint mask) {
	glClear(mask);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUseProgram
(JNIEnv*, jclass, jint program) {
	glUseProgram(program);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttribPointer
(JNIEnv*, jclass, jint index, jint size, jint type, jboolean normalized, jint stride, jint offset) {
	glVertexAttribPointer(index, size, type, normalized, stride, (void*)offset);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glEnableVertexAttribArray
(JNIEnv*, jclass, jint index) {
	glEnableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDisableVertexAttribArray
(JNIEnv*, jclass, jint index) {
	glDisableVertexAttribArray(index);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDeleteBuffers
(JNIEnv* env, jclass, jint n, jobject buffers) {
	uint32_t* ptr = (uint32_t*)env->GetDirectBufferAddress(buffers);
	glDeleteBuffers(n, ptr);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDeleteProgram
(JNIEnv*, jclass, jint program) {
	glDeleteProgram(program);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDrawArrays
(JNIEnv*, jclass, jint mode, jint first, jint count) {
	glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDrawElements
(JNIEnv* env, jclass, jint mode, jint count, jint type, jobject indices) {
	uint32_t* ptr = (uint32_t*)env->GetDirectBufferAddress(indices);
	glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glReleaseShaderCompiler
(JNIEnv*, jclass) {
	glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glEnable
(JNIEnv*, jclass, jint cap) {
	glEnable(cap);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDisable
(JNIEnv*, jclass, jint cap) {
	glDisable(cap);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glGetAttribLocation
(JNIEnv* env, jclass, jint program, jstring name) {
	return glGetAttribLocation(program, env->GetStringUTFChars(name, NULL));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glBindAttribLocation
(JNIEnv* env, jclass, jint program, jint index, jstring name) {
	glBindAttribLocation(program, index, env->GetStringUTFChars(name, NULL));
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glGetUniformLocation
(JNIEnv* env, jclass, jint program, jstring name) {
	return glGetUniformLocation(program, env->GetStringUTFChars(name, NULL));
}


JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform1f
(JNIEnv*, jclass, jint location, jfloat v0) {
	glUniform1f(location, v0);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform1fv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform1fv(location, count, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform1i
(JNIEnv*, jclass, jint location, jint v0) {
	glUniform1i(location, v0);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform1iv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform1iv(location, count, (int*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform2f
(JNIEnv*, jclass, jint location, jfloat v0, jfloat v1) {
	glUniform2f(location, v0, v1);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform2fv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform2fv(location, count, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform2i
(JNIEnv*, jclass, jint location, jint v0, jint v1) {
	glUniform2i(location, v0, v1);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform2iv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform2iv(location, count, (int*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform3f
(JNIEnv*, jclass, jint location, jfloat v0, jfloat v1, jfloat v2) {
	glUniform3f(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform3fv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform3fv(location, count, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform3i
(JNIEnv*, jclass, jint location, jint v0, jint v1, jint v2) {
	glUniform3i(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform3iv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform3iv(location, count, (int*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform4f
(JNIEnv*, jclass, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
	glUniform4f(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform4fv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform4fv(location, count, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform4i
(JNIEnv*, jclass, jint location, jint v0, jint v1, jint v2, jint v3) {
	glUniform4i(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniform4iv
(JNIEnv* env, jclass, jint location, jint count, jobject value) {
	glUniform3iv(location, count, (int*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniformMatrix2fv
(JNIEnv* env, jclass, jint location, jint count, jboolean transpose, jobject value) {
	glUniformMatrix2fv(location, count, (bool)transpose, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniformMatrix3fv
(JNIEnv* env, jclass, jint location, jint count, jboolean transpose, jobject value) {
	glUniformMatrix3fv(location, count, (bool)transpose, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glUniformMatrix4fv
(JNIEnv* env, jclass, jint location, jint count, jboolean transpose, jobject value) {
	glUniformMatrix4fv(location, count, (bool)transpose, (float*)env->GetDirectBufferAddress(value));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glValidateProgram
(JNIEnv*, jclass, jint program) {
	glValidateProgram(program);
}

JNIEXPORT jboolean JNICALL Java_javaangle_JavaANGLE_glIsShader
(JNIEnv*, jclass, jint shader) {
	return (jboolean)glIsShader(shader);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGetShaderiv
(JNIEnv* env, jclass, jint shader, jint pname, jobject params) {
	glGetShaderiv(shader, pname, (int*)env->GetDirectBufferAddress(params));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glScissor
(JNIEnv*, jclass, jint x, jint y, jint width, jint height) {
	glScissor(x, y, width, height);
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glGetShaderSource
(JNIEnv* env, jclass, jint shader) {
	char* str = new char[30000];
	int len = 0;
	glGetShaderSource(shader, 30000, &len, str);
	jstring ret = getString(env, str);
	delete[] str;
	return ret;
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glBufferSubData
(JNIEnv* env, jclass, jint target, jint offset, jint size, jobject data) {
	glBufferSubData(target, offset, size, (void*)env->GetDirectBufferAddress(data));
}

JNIEXPORT jboolean JNICALL Java_javaangle_JavaANGLE_glIsBuffer
(JNIEnv*, jclass, jint buffer) {
	return glIsBuffer(buffer);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGetBufferParameteriv
(JNIEnv* env, jclass, jint target, jint value, jobject params) {
	glGetBufferParameteriv(target, value, (int*)env->GetDirectBufferAddress(params));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glMapBufferRange
(JNIEnv*, jclass, jint target, jint offset, jint length, jint access) {
	glMapBufferRange(target, offset, length, access);
}

JNIEXPORT jboolean JNICALL Java_javaangle_JavaANGLE_glUnmapBuffer
(JNIEnv*, jclass, jint target) {
	return (jboolean)glUnmapBuffer(target);
}

JNIEXPORT jlong JNICALL Java_javaangle_JavaANGLE_glFenceSync
(JNIEnv*, jclass, jint condition, jint flags) {
	return (long)glFenceSync(condition, flags);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDeleteSync
(JNIEnv*, jclass, jlong sync) {
	glDeleteSync((GLsync)sync);
}

JNIEXPORT jint JNICALL Java_javaangle_JavaANGLE_glClientWaitSync
(JNIEnv*, jclass, jlong sync, jint flags, jlong timeout) {
	return (jint)glClientWaitSync((GLsync)sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDepthRangef
(JNIEnv*, jclass, jfloat n, jfloat f) {
	glDepthRangef(n, f);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glReadPixels
(JNIEnv* env, jclass, jint x, jint y, jint width, jint height, jint format, jint type, jobject pixels) {
	glReadPixels(x, y, width, height, format, type, (void*)env->GetDirectBufferAddress(pixels));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib1f
(JNIEnv*, jclass, jint index, jfloat x) {
	glVertexAttrib1f(index, x);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib1fv
(JNIEnv* env, jclass, jint index, jobject v) {
	glVertexAttrib1fv(index, (float*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib2f
(JNIEnv*, jclass, jint index, jfloat x, jfloat y) {
	glVertexAttrib2f(index, x, y);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib2fv
(JNIEnv* env, jclass, jint index, jobject v) {
	glVertexAttrib2fv(index, (float*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib3f
(JNIEnv*, jclass, jint index, jfloat x, jfloat y, jfloat z) {
	glVertexAttrib3f(index, x, y, z);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib3fv
(JNIEnv* env, jclass, jint index, jobject v) {
	glVertexAttrib3fv(index, (float*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib4f
(JNIEnv*, jclass, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
	glVertexAttrib4f(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glVertexAttrib4fv
(JNIEnv* env, jclass, jint index, jobject v) {
	glVertexAttrib3fv(index, (float*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glTexImage2D
(JNIEnv* env, jclass, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject v) {
	glTexImage2D(target, level, internalformat, width, height, border, format, type, (void*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glCopyTexImage2D
(JNIEnv*, jclass, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
	glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glTexSubImage2D
(JNIEnv* env, jclass, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject v) {
	glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, (void*)env->GetDirectBufferAddress(v));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glCopyTexSubImage2D
(JNIEnv*, jclass, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
	glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glCompressedTexImage2D
(JNIEnv* env, jclass, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jobject data) {
	glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, (void*)env->GetDirectBufferAddress(data));
}


JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glCompressedTexSubImage2D
(JNIEnv* env, jclass, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jobject data) {
	glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, (void*)env->GetDirectBufferAddress(data));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGenTextures
(JNIEnv* env, jclass, jint n, jobject textures) {
	glGenTextures(n, (uint32_t*)env->GetDirectBufferAddress(textures));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glDeleteTextures
(JNIEnv* env, jclass, jint n, jobject textures) {
	glDeleteTextures(n, (uint32_t*)env->GetDirectBufferAddress(textures));
}

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGenerateMipmap
(JNIEnv*, jclass, jint target) {
	glGenerateMipmap(target);
}

JNIEXPORT jboolean JNICALL Java_javaangle_JavaANGLE_glIsTexture
(JNIEnv*, jclass, jint texture) {
	return glIsTexture(texture);
}

