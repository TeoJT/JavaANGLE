"C:/Program Files/Java/jdk-17/bin/javac.exe" -d out src/javaangle/JavaANGLE.java
"C:/Program Files/Java/jdk-17/bin/jar.exe" cvf out/JavaANGLE.jar -C out .
copy dll\WinCPP2Java.dll out\WinCPP2Java.dll
pause