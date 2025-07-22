package javaangle;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class TestProgram {
	
	static final String vertexShaderSource = "#version 320 es\n"+
			"in vec3 aPos;\n"+
			"in vec3 aColor;\n"+

			"out vec4 vColor;\n"+

			"void main()\n"+
			"{\n"+
			"    vColor = vec4(aColor.x, aColor.y, aColor.z, 1.0);\n"+
			"    gl_Position = vec4(aPos.x, aPos.y, aPos.z, 1.0);\n"+
			"}\n";
	
	static final String fragmentShaderSource = "#version 320 es\n"+
			"precision mediump float;\n"+

			"in vec4 vColor;\n"+
			"out vec4 fragColor;\n"+

			"void main()\n"+
			"{\n"+
			"    fragColor = vColor;\n"+
			"}\n";
	
	static IntBuffer alloc(int sizeInt) {
	    ByteBuffer buffer = ByteBuffer.allocateDirect(Integer.BYTES*sizeInt);
	    buffer.order(ByteOrder.LITTLE_ENDIAN);
		return buffer.asIntBuffer();
	}
	
	static FloatBuffer allocFloat(int sizeFloat) {
	    ByteBuffer buffer = ByteBuffer.allocateDirect(Float.BYTES*sizeFloat);
	    buffer.order(ByteOrder.LITTLE_ENDIAN);
		return buffer.asFloatBuffer();
	}
	
	static void checkShaderErrors(int shader, String type) {
		IntBuffer buffer = alloc(1);
	    String infoLog = "";
	    if (!type.equals("PROGRAM")) {
	    	JavaANGLE.glGetShaderiv(shader, JavaANGLE.GL_COMPILE_STATUS, buffer);
	    	boolean success = (buffer.get(0) == 1);
	        if (!success) {
	        	infoLog = JavaANGLE.glGetShaderInfoLog(shader);
	            System.out.println("ERROR::SHADER_COMPILATION_ERROR of type: "+type+"\n"+infoLog+"\n -- --------------------------------------------------- -- \n");
	        }
	    }
	    else {
	    	JavaANGLE.glGetProgramiv(shader, JavaANGLE.GL_LINK_STATUS, buffer);
	    	boolean success = (buffer.get(0) == 1);
	        if (!success) {
	        	infoLog = JavaANGLE.glGetProgramInfoLog(shader);
	            System.out.println("ERROR::PROGRAM_LINKING_ERROR of type: " + type + "\n" + infoLog + "\n -- --------------------------------------------------- -- \n");
	        }
	    }
	}

	public static void main(String[] args) {
		JavaANGLE.glfwInitHint(JavaANGLE.GLFW_ANGLE_PLATFORM_TYPE, JavaANGLE.GLFW_ANGLE_PLATFORM_TYPE_VULKAN);
		
		int initResult = JavaANGLE.glfwInit();
		if (initResult == 0) {
			System.out.println("Failed to init");
			System.exit(0);
		}

		JavaANGLE.glfwWindowHint(JavaANGLE.GLFW_CONTEXT_CREATION_API, JavaANGLE.GLFW_EGL_CONTEXT_API);
		JavaANGLE.glfwWindowHint(JavaANGLE.GLFW_CONTEXT_VERSION_MAJOR, 3);
		JavaANGLE.glfwWindowHint(JavaANGLE.GLFW_CONTEXT_VERSION_MINOR, 2);
		JavaANGLE.glfwWindowHint(JavaANGLE.GLFW_CLIENT_API, JavaANGLE.GLFW_OPENGL_ES_API);

		int window = JavaANGLE.glfwCreateWindow(800, 600, "Hello Triangle (OpenGL ES 3.2)", null, 0);
		if (window == 0) {
		    System.out.println("Failed to create GLFW window");
		    JavaANGLE.glfwTerminate();
		    System.exit(0);
		}

		JavaANGLE.glfwMakeContextCurrent(window);
		
		int width = JavaANGLE.glfwGetFramebufferWidth(window);
		int height = JavaANGLE.glfwGetFramebufferHeight(window);
		JavaANGLE.glViewport(0, 0, width, height);
		
//		glfwSetFramebufferSizeCallback(window, [](GLFWwindow* window, int w, int h) {
//		    glViewport(0, 0, w, h);
//		    });

	    System.out.println(JavaANGLE.glGetString(JavaANGLE.GL_RENDERER));
	    
	    int vertexShader = JavaANGLE.glCreateShader(JavaANGLE.GL_VERTEX_SHADER);
	    JavaANGLE.glShaderSource(vertexShader, 1, new String[] { vertexShaderSource });
	    JavaANGLE.glCompileShader(vertexShader);
	    checkShaderErrors(vertexShader, "VERTEX");

	    int fragmentShader = JavaANGLE.glCreateShader(JavaANGLE.GL_FRAGMENT_SHADER);
	    JavaANGLE.glShaderSource(fragmentShader, 1, new String[] { fragmentShaderSource });
	    JavaANGLE.glCompileShader(fragmentShader);
	    checkShaderErrors(fragmentShader, "FRAGMENT");
	    
	    int shaderProgram = JavaANGLE.glCreateProgram();
	    JavaANGLE.glAttachShader(shaderProgram, vertexShader);
	    JavaANGLE.glAttachShader(shaderProgram, fragmentShader);
	    JavaANGLE.glLinkProgram(shaderProgram);
	    checkShaderErrors(shaderProgram, "PROGRAM");

	    JavaANGLE.glDeleteShader(vertexShader);
	    JavaANGLE.glDeleteShader(fragmentShader);
	    
	    float vertices[] = {
	        -0.5f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, // Left bottom
	         0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, // Right bottom
	         0.0f,  0.5f, 0.0f, 0.0f, 0.0f, 1.0f, // Top
	    };
	    
	    FloatBuffer data = allocFloat(vertices.length);
	    data.put(vertices);
	    
	    IntBuffer getVBO = alloc(1);
	    JavaANGLE.glGenBuffers(1, getVBO);
	    int vbo = getVBO.get(0);


	    JavaANGLE.glBindBuffer(JavaANGLE.GL_ARRAY_BUFFER, 0);
	    
	    float delta = 0f;
		
		while (JavaANGLE.glfwWindowShouldClose(window) == JavaANGLE.FALSE) {
		    if (JavaANGLE.glfwGetKey(window, JavaANGLE.GLFW_KEY_ESCAPE) == JavaANGLE.GLFW_PRESS) {
		    	JavaANGLE.glfwSetWindowShouldClose(window, JavaANGLE.TRUE);
		    }

		    JavaANGLE.glClearColor(0.0f, 0.0f, 0.5f, 1.0f);
		    JavaANGLE.glClear(JavaANGLE.GL_COLOR_BUFFER_BIT);

		    JavaANGLE.glUseProgram(shaderProgram);
		    
		    float y = (float)Math.sin(delta)*0.2f;

		    JavaANGLE.glBindBuffer(JavaANGLE.GL_ARRAY_BUFFER, vbo);
		    float movingVertices[] = {
		        -0.5f, -0.5f+y, 0.0f, 1.0f, 0.0f, 0.0f, // Left bottom
		         0.5f, -0.5f+y, 0.0f, 0.0f, 1.0f, 0.0f, // Right bottom
		         0.0f,  0.5f+y, 0.0f, 0.0f, 0.0f, 1.0f, // Top
		    };
		    data.rewind();
		    data.put(movingVertices);
		    JavaANGLE.glBufferData(JavaANGLE.GL_ARRAY_BUFFER, vertices.length*4, data, JavaANGLE.GL_STATIC_DRAW);
		    
		    delta += 0.05;
		    
		    JavaANGLE.glVertexAttribPointer(0, 3, JavaANGLE.GL_FLOAT, false, 6 * Float.BYTES, 0);
		    JavaANGLE.glEnableVertexAttribArray(0);
		    JavaANGLE.glVertexAttribPointer(1, 3, JavaANGLE.GL_FLOAT, false, 6 * Float.BYTES, 3 * Float.BYTES);
		    JavaANGLE.glEnableVertexAttribArray(1);
		    
		    JavaANGLE.glDrawArrays(JavaANGLE.GL_TRIANGLES, 0, 3);

		    JavaANGLE.glBindBuffer(JavaANGLE.GL_ARRAY_BUFFER, 0);

		    JavaANGLE.glfwSwapBuffers(window);
		    
		    JavaANGLE.glfwPollEvents();
		}
		
		IntBuffer deletes = alloc(1);
		deletes.put(0, vbo);
		JavaANGLE.glDeleteBuffers(1, deletes);
		JavaANGLE.glDeleteProgram(shaderProgram);

		JavaANGLE.glfwTerminate();
		
	}

}
