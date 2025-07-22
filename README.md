# JavaANGLE

A [Google ANGLE](https://github.com/google/angle) binding for Java. This project's primary purpose is for the [Processing](https://github.com/processing/processing4) framework, to replace the deprecated JOGL library.

This project uses Java Native Interfaces (JNI) to interface between C++ code (where OpenGL ES functionality resides) and Java code. Note that this repository does not have a copy of the ANGLE codebase, rather it contains prebuilt ANGLE binary files (`libEGL.dll`, `libGLESv2.dll` and `vulkan-1.dll`) to keep things simple. This also includes GLFW for creating windows to run OpenGL ES programs on.

## Important files & folders
- `WinCPP2Java.dll` - Binding code from C++ to Java.
- `JavaLayer/src/javaangle/JavaANGLE.java` - Java Native Interface file.
- `JavaLayer/dll` - Put `WinCPP2Java.dll` here.
- `libEGL.dll`, `libGLESv2.dll`, `vulkan-1.dll` - It's ANGLE! These must be placed in the working dir of any application that uses it.
- `javaangle_JavaANGLE.h` - Header file for JNI generated from jni.bat/sh.


## Layout

### JavaLayer
Java front-end which provides OpenGL ES and GLFW via a static class (JavaANGLE). In the src folder, there is a batch script which generates a header file to use in the C++ code. This will eventually be made into a Java library that can be popped into Processing.

### WinCPP2Java
Contains a Visual Studio project which implements the binding for Windows. The "Debug" configuration will display a Hello Triangle demo and the "Release" configuration will generate a `WinCPP2Java.dll` file for use with the Java layer.

## How to code
- If you make any changes to `JavaANGLE.java`, run the jni.bat/sh file and copy+paste everything from the generated header file into `JavaANGLE.h` in WinCPP2Java.
- Search the function to add a binding to in `JavaANGLE.h` and copy the function + args to `JavaANGLE.cpp`, then implement binding using OpenGL ES/GLFW.
- (Windows) Set configuration to "Release", go to Build > Build solution, and then find the compiled DLL in WinCPP2Java > x64 > Release.
- Copy `WinCPP2Java.dll` to JavaLayer/dll, replacing the old `WinCPP2Java.dll` file.
- Run your test program!

## TODO
- Still need to implement 99% of the API.
- Compile a release build of ANGLE, right now I'm using the debug version.
- Compile into a Java library.
- Implement into Processing.
- Linux port
- MacOS port
- Apple Silicon port (which is going to be hard because I don't have an Apple Silicon Macbook :c )
- Processing will need an overhaul with IO and inputs if we're going to use GLFW.
