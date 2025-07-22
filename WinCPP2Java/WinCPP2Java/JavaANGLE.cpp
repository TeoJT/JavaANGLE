#include <iostream>
#include "JavaANGLE.h"
#include <GLFW/glfw3.h>
#include <EGL/gl32.h>

#define GLFWWINDOW_LIMIT 64

// Limit is 64 because I don't think we're going to have more than one window, much less two.
GLFWwindow** glfwwindows = new GLFWwindow * [GLFWWINDOW_LIMIT];
int glfwwindowsIndex = 1;

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

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glViewport
(JNIEnv*, jclass, jint x, jint y, jint w, jint h) {
	glViewport(x, y, w, h);
}

JNIEXPORT jstring JNICALL Java_javaangle_JavaANGLE_glGetString
(JNIEnv* env, jclass, jint name) {
	const GLubyte* str = glGetString(name);
	if (str == nullptr) return env->NewStringUTF("");
	else return env->NewStringUTF(reinterpret_cast<const char*>(str)); // Convert to jstring
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

JNIEXPORT void JNICALL Java_javaangle_JavaANGLE_glGetShaderiv
(JNIEnv* env, jclass, jint shader, jint pname, jobject params) {
	int* ptr = (int*)env->GetDirectBufferAddress(params);
	glGetShaderiv(shader, pname, ptr);
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

