package javaangle;

import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.nio.LongBuffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class JavaANGLE {

    static {
    	String userDirectory = System.getProperty("user.dir").replaceAll("\\\\", "/");
        System.load(userDirectory+"/dll/WinCPP2Java.dll");
    }

  
    // TODO: Placeholder classes which do nothing, these
    // need to be replaced with ints.
    public class GLFWmonitor {
      
    }
    
    public class GLFWimage {
      
    }

    public class GLFWallocator {

    }
  
    public static final int TRUE = 1;
    public static final int FALSE = 0;
    
    
/////////////////////////////////////////////////////////////////////////////////////////////
//    _____ _      ________          __
//    / ____| |    |  ____\ \        / /
//   | |  __| |    | |__   \ \  /\  / / 
//   | | |_ | |    |  __|   \ \/  \/ /  
//   | |__| | |____| |       \  /\  /   
//    \_____|______|_|        \/  \/    
//                                      
/////////////////////////////////////////////////////////////////////////////////////////////
    // Constants
    public static final int GLFW_VERSION_MAJOR       = 3;

    public static final int GLFW_VERSION_MINOR       = 4;

    public static final int GLFW_VERSION_REVISION    = 0;



    public static final int GLFW_TRUE                = 1;

    public static final int GLFW_FALSE               = 0;



    public static final int GLFW_RELEASE              = 0;

    public static final int GLFW_PRESS                = 1;

    public static final int GLFW_REPEAT               = 2;



    public static final int GLFW_HAT_CENTERED         = 0;
    public static final int GLFW_HAT_UP               = 1;
    public static final int GLFW_HAT_RIGHT            = 2;
    public static final int GLFW_HAT_DOWN             = 4;
    public static final int GLFW_HAT_LEFT             = 8;
    public static final int GLFW_HAT_RIGHT_UP         = (GLFW_HAT_RIGHT | GLFW_HAT_UP);
    public static final int GLFW_HAT_RIGHT_DOWN       = (GLFW_HAT_RIGHT | GLFW_HAT_DOWN);
    public static final int GLFW_HAT_LEFT_UP          = (GLFW_HAT_LEFT  | GLFW_HAT_UP);
    public static final int GLFW_HAT_LEFT_DOWN        = (GLFW_HAT_LEFT  | GLFW_HAT_DOWN);


    public static final int GLFW_KEY_UNKNOWN          = -1;






    public static final int GLFW_KEY_SPACE            = 32;
    public static final int GLFW_KEY_APOSTROPHE       = 39;
    public static final int GLFW_KEY_COMMA            = 44;
    public static final int GLFW_KEY_MINUS            = 45;
    public static final int GLFW_KEY_PERIOD           = 46;
    public static final int GLFW_KEY_SLASH            = 47;
    public static final int GLFW_KEY_0                = 48;
    public static final int GLFW_KEY_1                = 49;
    public static final int GLFW_KEY_2                = 50;
    public static final int GLFW_KEY_3                = 51;
    public static final int GLFW_KEY_4                = 52;
    public static final int GLFW_KEY_5                = 53;
    public static final int GLFW_KEY_6                = 54;
    public static final int GLFW_KEY_7                = 55;
    public static final int GLFW_KEY_8                = 56;
    public static final int GLFW_KEY_9                = 57;
    public static final int GLFW_KEY_SEMICOLON        = 59;
    public static final int GLFW_KEY_EQUAL            = 61;
    public static final int GLFW_KEY_A                = 65;
    public static final int GLFW_KEY_B                = 66;
    public static final int GLFW_KEY_C                = 67;
    public static final int GLFW_KEY_D                = 68;
    public static final int GLFW_KEY_E                = 69;
    public static final int GLFW_KEY_F                = 70;
    public static final int GLFW_KEY_G                = 71;
    public static final int GLFW_KEY_H                = 72;
    public static final int GLFW_KEY_I                = 73;
    public static final int GLFW_KEY_J                = 74;
    public static final int GLFW_KEY_K                = 75;
    public static final int GLFW_KEY_L                = 76;
    public static final int GLFW_KEY_M                = 77;
    public static final int GLFW_KEY_N                = 78;
    public static final int GLFW_KEY_O                = 79;
    public static final int GLFW_KEY_P                = 80;
    public static final int GLFW_KEY_Q                = 81;
    public static final int GLFW_KEY_R                = 82;
    public static final int GLFW_KEY_S                = 83;
    public static final int GLFW_KEY_T                = 84;
    public static final int GLFW_KEY_U                = 85;
    public static final int GLFW_KEY_V                = 86;
    public static final int GLFW_KEY_W                = 87;
    public static final int GLFW_KEY_X                = 88;
    public static final int GLFW_KEY_Y                = 89;
    public static final int GLFW_KEY_Z                = 90;
    public static final int GLFW_KEY_LEFT_BRACKET     = 91;
    public static final int GLFW_KEY_BACKSLASH        = 92;
    public static final int GLFW_KEY_RIGHT_BRACKET    = 93;
    public static final int GLFW_KEY_GRAVE_ACCENT     = 96;
    public static final int GLFW_KEY_WORLD_1          = 161;
    public static final int GLFW_KEY_WORLD_2          = 162;


    public static final int GLFW_KEY_ESCAPE           = 256;
    public static final int GLFW_KEY_ENTER            = 257;
    public static final int GLFW_KEY_TAB              = 258;
    public static final int GLFW_KEY_BACKSPACE        = 259;
    public static final int GLFW_KEY_INSERT           = 260;
    public static final int GLFW_KEY_DELETE           = 261;
    public static final int GLFW_KEY_RIGHT            = 262;
    public static final int GLFW_KEY_LEFT             = 263;
    public static final int GLFW_KEY_DOWN             = 264;
    public static final int GLFW_KEY_UP               = 265;
    public static final int GLFW_KEY_PAGE_UP          = 266;
    public static final int GLFW_KEY_PAGE_DOWN        = 267;
    public static final int GLFW_KEY_HOME             = 268;
    public static final int GLFW_KEY_END              = 269;
    public static final int GLFW_KEY_CAPS_LOCK        = 280;
    public static final int GLFW_KEY_SCROLL_LOCK      = 281;
    public static final int GLFW_KEY_NUM_LOCK         = 282;
    public static final int GLFW_KEY_PRINT_SCREEN     = 283;
    public static final int GLFW_KEY_PAUSE            = 284;
    public static final int GLFW_KEY_F1               = 290;
    public static final int GLFW_KEY_F2               = 291;
    public static final int GLFW_KEY_F3               = 292;
    public static final int GLFW_KEY_F4               = 293;
    public static final int GLFW_KEY_F5               = 294;
    public static final int GLFW_KEY_F6               = 295;
    public static final int GLFW_KEY_F7               = 296;
    public static final int GLFW_KEY_F8               = 297;
    public static final int GLFW_KEY_F9               = 298;
    public static final int GLFW_KEY_F10              = 299;
    public static final int GLFW_KEY_F11              = 300;
    public static final int GLFW_KEY_F12              = 301;
    public static final int GLFW_KEY_F13              = 302;
    public static final int GLFW_KEY_F14              = 303;
    public static final int GLFW_KEY_F15              = 304;
    public static final int GLFW_KEY_F16              = 305;
    public static final int GLFW_KEY_F17              = 306;
    public static final int GLFW_KEY_F18              = 307;
    public static final int GLFW_KEY_F19              = 308;
    public static final int GLFW_KEY_F20              = 309;
    public static final int GLFW_KEY_F21              = 310;
    public static final int GLFW_KEY_F22              = 311;
    public static final int GLFW_KEY_F23              = 312;
    public static final int GLFW_KEY_F24              = 313;
    public static final int GLFW_KEY_F25              = 314;
    public static final int GLFW_KEY_KP_0             = 320;
    public static final int GLFW_KEY_KP_1             = 321;
    public static final int GLFW_KEY_KP_2             = 322;
    public static final int GLFW_KEY_KP_3             = 323;
    public static final int GLFW_KEY_KP_4             = 324;
    public static final int GLFW_KEY_KP_5             = 325;
    public static final int GLFW_KEY_KP_6             = 326;
    public static final int GLFW_KEY_KP_7             = 327;
    public static final int GLFW_KEY_KP_8             = 328;
    public static final int GLFW_KEY_KP_9             = 329;
    public static final int GLFW_KEY_KP_DECIMAL       = 330;
    public static final int GLFW_KEY_KP_DIVIDE        = 331;
    public static final int GLFW_KEY_KP_MULTIPLY      = 332;
    public static final int GLFW_KEY_KP_SUBTRACT      = 333;
    public static final int GLFW_KEY_KP_ADD           = 334;
    public static final int GLFW_KEY_KP_ENTER         = 335;
    public static final int GLFW_KEY_KP_EQUAL         = 336;
    public static final int GLFW_KEY_LEFT_SHIFT       = 340;
    public static final int GLFW_KEY_LEFT_CONTROL     = 341;
    public static final int GLFW_KEY_LEFT_ALT         = 342;
    public static final int GLFW_KEY_LEFT_SUPER       = 343;
    public static final int GLFW_KEY_RIGHT_SHIFT      = 344;
    public static final int GLFW_KEY_RIGHT_CONTROL    = 345;
    public static final int GLFW_KEY_RIGHT_ALT        = 346;
    public static final int GLFW_KEY_RIGHT_SUPER      = 347;
    public static final int GLFW_KEY_MENU             = 348;

    public static final int GLFW_KEY_LAST             = GLFW_KEY_MENU;






    public static final int GLFW_MOD_SHIFT         = 0x0001;

    public static final int GLFW_MOD_CONTROL       = 0x0002;

    public static final int GLFW_MOD_ALT           = 0x0004;

    public static final int GLFW_MOD_SUPER         = 0x0008;

    public static final int GLFW_MOD_CAPS_LOCK     = 0x0010;

    public static final int GLFW_MOD_NUM_LOCK      = 0x0020;




    public static final int GLFW_MOUSE_BUTTON_1       = 0;
    public static final int GLFW_MOUSE_BUTTON_2       = 1;
    public static final int GLFW_MOUSE_BUTTON_3       = 2;
    public static final int GLFW_MOUSE_BUTTON_4       = 3;
    public static final int GLFW_MOUSE_BUTTON_5       = 4;
    public static final int GLFW_MOUSE_BUTTON_6       = 5;
    public static final int GLFW_MOUSE_BUTTON_7       = 6;
    public static final int GLFW_MOUSE_BUTTON_8       = 7;
    public static final int GLFW_MOUSE_BUTTON_LAST    = GLFW_MOUSE_BUTTON_8;
    public static final int GLFW_MOUSE_BUTTON_LEFT    = GLFW_MOUSE_BUTTON_1;
    public static final int GLFW_MOUSE_BUTTON_RIGHT   = GLFW_MOUSE_BUTTON_2;
    public static final int GLFW_MOUSE_BUTTON_MIDDLE  = GLFW_MOUSE_BUTTON_3;



    public static final int GLFW_JOYSTICK_1           = 0;
    public static final int GLFW_JOYSTICK_2           = 1;
    public static final int GLFW_JOYSTICK_3           = 2;
    public static final int GLFW_JOYSTICK_4           = 3;
    public static final int GLFW_JOYSTICK_5           = 4;
    public static final int GLFW_JOYSTICK_6           = 5;
    public static final int GLFW_JOYSTICK_7           = 6;
    public static final int GLFW_JOYSTICK_8           = 7;
    public static final int GLFW_JOYSTICK_9           = 8;
    public static final int GLFW_JOYSTICK_10          = 9;
    public static final int GLFW_JOYSTICK_11          = 10;
    public static final int GLFW_JOYSTICK_12          = 11;
    public static final int GLFW_JOYSTICK_13          = 12;
    public static final int GLFW_JOYSTICK_14          = 13;
    public static final int GLFW_JOYSTICK_15          = 14;
    public static final int GLFW_JOYSTICK_16          = 15;
    public static final int GLFW_JOYSTICK_LAST        = GLFW_JOYSTICK_16;



    public static final int GLFW_GAMEPAD_BUTTON_A             = 0;
    public static final int GLFW_GAMEPAD_BUTTON_B             = 1;
    public static final int GLFW_GAMEPAD_BUTTON_X             = 2;
    public static final int GLFW_GAMEPAD_BUTTON_Y             = 3;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_BUMPER   = 4;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER  = 5;
    public static final int GLFW_GAMEPAD_BUTTON_BACK          = 6;
    public static final int GLFW_GAMEPAD_BUTTON_START         = 7;
    public static final int GLFW_GAMEPAD_BUTTON_GUIDE         = 8;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_THUMB    = 9;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_THUMB   = 10;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_UP       = 11;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_RIGHT    = 12;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_DOWN     = 13;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_LEFT     = 14;
    public static final int GLFW_GAMEPAD_BUTTON_LAST          = GLFW_GAMEPAD_BUTTON_DPAD_LEFT;

    public static final int GLFW_GAMEPAD_BUTTON_CROSS     = GLFW_GAMEPAD_BUTTON_A;
    public static final int GLFW_GAMEPAD_BUTTON_CIRCLE    = GLFW_GAMEPAD_BUTTON_B;
    public static final int GLFW_GAMEPAD_BUTTON_SQUARE    = GLFW_GAMEPAD_BUTTON_X;
    public static final int GLFW_GAMEPAD_BUTTON_TRIANGLE  = GLFW_GAMEPAD_BUTTON_Y;



    public static final int GLFW_GAMEPAD_AXIS_LEFT_X      = 0;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_Y      = 1;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_X     = 2;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_Y     = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_TRIGGER  = 4;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int GLFW_GAMEPAD_AXIS_LAST          = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;




    public static final int GLFW_NO_ERROR             = 0;

    public static final int GLFW_NOT_INITIALIZED      = 0x00010001;

    public static final int GLFW_NO_CURRENT_CONTEXT   = 0x00010002;

    public static final int GLFW_INVALID_ENUM         = 0x00010003;

    public static final int GLFW_INVALID_VALUE        = 0x00010004;

    public static final int GLFW_OUT_OF_MEMORY        = 0x00010005;

    public static final int GLFW_API_UNAVAILABLE      = 0x00010006;

    public static final int GLFW_VERSION_UNAVAILABLE  = 0x00010007;

    public static final int GLFW_PLATFORM_ERROR       = 0x00010008;

    public static final int GLFW_FORMAT_UNAVAILABLE   = 0x00010009;

    public static final int GLFW_NO_WINDOW_CONTEXT    = 0x0001000A;

    public static final int GLFW_CURSOR_UNAVAILABLE   = 0x0001000B;

    public static final int GLFW_FEATURE_UNAVAILABLE  = 0x0001000C;

    public static final int GLFW_FEATURE_UNIMPLEMENTED= 0x0001000D;

    public static final int GLFW_PLATFORM_UNAVAILABLE = 0x0001000E;




    public static final int GLFW_FOCUSED              = 0x00020001;

    public static final int GLFW_ICONIFIED            = 0x00020002;

    public static final int GLFW_RESIZABLE            = 0x00020003;

    public static final int GLFW_VISIBLE              = 0x00020004;

    public static final int GLFW_DECORATED            = 0x00020005;

    public static final int GLFW_AUTO_ICONIFY         = 0x00020006;

    public static final int GLFW_FLOATING             = 0x00020007;

    public static final int GLFW_MAXIMIZED            = 0x00020008;

    public static final int GLFW_CENTER_CURSOR        = 0x00020009;

    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;

    public static final int GLFW_HOVERED              = 0x0002000B;

    public static final int GLFW_FOCUS_ON_SHOW        = 0x0002000C;


    public static final int GLFW_MOUSE_PASSTHROUGH    = 0x0002000D;


    public static final int GLFW_POSITION_X           = 0x0002000E;


    public static final int GLFW_POSITION_Y           = 0x0002000F;


    public static final int GLFW_RED_BITS             = 0x00021001;

    public static final int GLFW_GREEN_BITS           = 0x00021002;

    public static final int GLFW_BLUE_BITS            = 0x00021003;

    public static final int GLFW_ALPHA_BITS           = 0x00021004;

    public static final int GLFW_DEPTH_BITS           = 0x00021005;

    public static final int GLFW_STENCIL_BITS         = 0x00021006;

    public static final int GLFW_ACCUM_RED_BITS       = 0x00021007;

    public static final int GLFW_ACCUM_GREEN_BITS     = 0x00021008;

    public static final int GLFW_ACCUM_BLUE_BITS      = 0x00021009;

    public static final int GLFW_ACCUM_ALPHA_BITS     = 0x0002100A;

    public static final int GLFW_AUX_BUFFERS          = 0x0002100B;

    public static final int GLFW_STEREO               = 0x0002100C;

    public static final int GLFW_SAMPLES              = 0x0002100D;

    public static final int GLFW_SRGB_CAPABLE         = 0x0002100E;

    public static final int GLFW_REFRESH_RATE         = 0x0002100F;

    public static final int GLFW_DOUBLEBUFFER         = 0x00021010;


    public static final int GLFW_CLIENT_API           = 0x00022001;

    public static final int GLFW_CONTEXT_VERSION_MAJOR= 0x00022002;

    public static final int GLFW_CONTEXT_VERSION_MINOR= 0x00022003;

    public static final int GLFW_CONTEXT_REVISION     = 0x00022004;

    public static final int GLFW_CONTEXT_ROBUSTNESS   = 0x00022005;

    public static final int GLFW_OPENGL_FORWARD_COMPAT= 0x00022006;

    public static final int GLFW_CONTEXT_DEBUG        = 0x00022007;

    public static final int GLFW_OPENGL_DEBUG_CONTEXT = GLFW_CONTEXT_DEBUG;

    public static final int GLFW_OPENGL_PROFILE       = 0x00022008;

    public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x00022009;

    public static final int GLFW_CONTEXT_NO_ERROR     = 0x0002200A;

    public static final int GLFW_CONTEXT_CREATION_API = 0x0002200B;

    public static final int GLFW_SCALE_TO_MONITOR     = 0x0002200C;

    public static final int GLFW_SCALE_FRAMEBUFFER    = 0x0002200D;

    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x00023001;

    public static final int GLFW_COCOA_FRAME_NAME       = 0x00023002;

    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x00023003;

    public static final int GLFW_X11_CLASS_NAME       = 0x00024001;

    public static final int GLFW_X11_INSTANCE_NAME    = 0x00024002;
    public static final int GLFW_WIN32_KEYBOARD_MENU  = 0x00025001;

    public static final int GLFW_WIN32_SHOWDEFAULT    = 0x00025002;

    public static final int GLFW_WAYLAND_APP_ID       = 0x00026001;


    public static final int GLFW_NO_API                        = 0;
    public static final int GLFW_OPENGL_API           = 0x00030001;
    public static final int GLFW_OPENGL_ES_API        = 0x00030002;

    public static final int GLFW_NO_ROBUSTNESS                 = 0;
    public static final int GLFW_NO_RESET_NOTIFICATION= 0x00031001;
    public static final int GLFW_LOSE_CONTEXT_ON_RESET= 0x00031002;

    public static final int GLFW_OPENGL_ANY_PROFILE            = 0;
    public static final int GLFW_OPENGL_CORE_PROFILE  = 0x00032001;
    public static final int GLFW_OPENGL_COMPAT_PROFILE= 0x00032002;

    public static final int GLFW_CURSOR               = 0x00033001;
    public static final int GLFW_STICKY_KEYS          = 0x00033002;
    public static final int GLFW_STICKY_MOUSE_BUTTONS = 0x00033003;
    public static final int GLFW_LOCK_KEY_MODS        = 0x00033004;
    public static final int GLFW_RAW_MOUSE_MOTION     = 0x00033005;

    public static final int GLFW_CURSOR_NORMAL        = 0x00034001;
    public static final int GLFW_CURSOR_HIDDEN        = 0x00034002;
    public static final int GLFW_CURSOR_DISABLED      = 0x00034003;
    public static final int GLFW_CURSOR_CAPTURED      = 0x00034004;

    public static final int GLFW_ANY_RELEASE_BEHAVIOR          = 0;
    public static final int GLFW_RELEASE_BEHAVIOR_FLUSH = 0x00035001;
    public static final int GLFW_RELEASE_BEHAVIOR_NONE= 0x00035002;

    public static final int GLFW_NATIVE_CONTEXT_API   = 0x00036001;
    public static final int GLFW_EGL_CONTEXT_API      = 0x00036002;
    public static final int GLFW_OSMESA_CONTEXT_API   = 0x00036003;

    public static final int GLFW_ANGLE_PLATFORM_TYPE_NONE  = 0x00037001;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGL= 0x00037002;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x00037003;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D9  = 0x00037004;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D11 = 0x00037005;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_VULKAN= 0x00037007;
    public static final int GLFW_ANGLE_PLATFORM_TYPE_METAL = 0x00037008;

    public static final int GLFW_WAYLAND_PREFER_LIBDECOR  = 0x00038001;
    public static final int GLFW_WAYLAND_DISABLE_LIBDECOR = 0x00038002;

    public static final int GLFW_ANY_POSITION         = 0x80000000;




    public static final int GLFW_ARROW_CURSOR         = 0x00036001;

    public static final int GLFW_IBEAM_CURSOR         = 0x00036002;

    public static final int GLFW_CROSSHAIR_CURSOR     = 0x00036003;

    public static final int GLFW_POINTING_HAND_CURSOR = 0x00036004;

    public static final int GLFW_RESIZE_EW_CURSOR     = 0x00036005;

    public static final int GLFW_RESIZE_NS_CURSOR     = 0x00036006;

    public static final int GLFW_RESIZE_NWSE_CURSOR   = 0x00036007;

    public static final int GLFW_RESIZE_NESW_CURSOR   = 0x00036008;

    public static final int GLFW_RESIZE_ALL_CURSOR    = 0x00036009;

    public static final int GLFW_NOT_ALLOWED_CURSOR   = 0x0003600A;

    public static final int GLFW_HRESIZE_CURSOR       = GLFW_RESIZE_EW_CURSOR;

    public static final int GLFW_VRESIZE_CURSOR       = GLFW_RESIZE_NS_CURSOR;

    public static final int GLFW_HAND_CURSOR          = GLFW_POINTING_HAND_CURSOR;


    public static final int GLFW_CONNECTED            = 0x00040001;
    public static final int GLFW_DISCONNECTED         = 0x00040002;



    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x00050001;

    public static final int GLFW_ANGLE_PLATFORM_TYPE  = 0x00050002;

    public static final int GLFW_PLATFORM             = 0x00050003;

    public static final int GLFW_COCOA_CHDIR_RESOURCES= 0x00051001;

    public static final int GLFW_COCOA_MENUBAR        = 0x00051002;

    public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x00052001;

    public static final int GLFW_WAYLAND_LIBDECOR     = 0x00053001;




    public static final int GLFW_ANY_PLATFORM         = 0x00060000;
    public static final int GLFW_PLATFORM_WIN32       = 0x00060001;
    public static final int GLFW_PLATFORM_COCOA       = 0x00060002;
    public static final int GLFW_PLATFORM_WAYLAND     = 0x00060003;
    public static final int GLFW_PLATFORM_X11         = 0x00060004;
    public static final int GLFW_PLATFORM_NULL        = 0x00060005;


    public static final int GLFW_DONT_CARE             = -1;



///////////////////////////////////////////
    // Functions
    // Some are commented out because they rely on a custom class/struct/object
    // which isn't implemented on the C++ backend yet.
    // Just to stop weird compile errors.

    public static native int glfwInit();


    public static native void glfwTerminate();


    public static native void glfwInitHint(int hint, int value);
    
    public static native void glfwWindowHint(int hint, int value);


    public static native void glfwInitAllocator(GLFWallocator allocator);

    // public static native void glfwInitVulkanLoader(PFN_vkGetInstanceProcAddr loader);

    public static native int glfwGetVersionMajor();
    public static native int glfwGetVersionMinor();
    public static native int glfwGetVersionRev();

    public static native String glfwGetVersionString();

    public static native String glfwGetError();

    //public static native GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun callback);

    public static native int glfwGetPlatform();


    public static native int glfwPlatformSupported(int platform);


    //public static native GLFWmonitor** glfwGetMonitors(int* count);


    //public static native GLFWmonitor* glfwGetPrimaryMonitor(void);


    //public static native void glfwGetMonitorPos(GLFWmonitor* monitor, int* xpos, int* ypos);


    //public static native void glfwGetMonitorWorkarea(GLFWmonitor* monitor, int* xpos, int* ypos, int* width, int* height);


    //public static native void glfwGetMonitorPhysicalSize(GLFWmonitor* monitor, int* widthMM, int* heightMM);


    //public static native void glfwGetMonitorContentScale(GLFWmonitor* monitor, float* xscale, float* yscale);


    //public static native const char* glfwGetMonitorName(GLFWmonitor* monitor);


    //public static native void glfwSetMonitorUserPointer(GLFWmonitor* monitor, void* pointer);


    //public static native void* glfwGetMonitorUserPointer(GLFWmonitor* monitor);


    //public static native GLFWmonitorfun glfwSetMonitorCallback(GLFWmonitorfun callback);


    //public static native const GLFWvidmode* glfwGetVideoModes(GLFWmonitor* monitor, int* count);


    //public static native const GLFWvidmode* glfwGetVideoMode(GLFWmonitor* monitor);


    //public static native void glfwSetGamma(GLFWmonitor* monitor, float gamma);


    //public static native const GLFWgammaramp* glfwGetGammaRamp(GLFWmonitor* monitor);


    //public static native void glfwSetGammaRamp(GLFWmonitor* monitor, const GLFWgammaramp* ramp);


    public static native void glfwDefaultWindowHints();


    public static native void intHint(int hint, int value);


    public static native void intHintString(int hint, String value);


    public static native int glfwCreateWindow(int width, int height, String title, GLFWmonitor monitor, int share);


    public static native void glfwDestroyWindow(int window);


    public static native int intShouldClose(int window);


    public static native void glfwSetWindowShouldClose(int window, int value);


    public static native char glfwGetWindowTitle(int window);


    public static native void glfwSetWindowTitle(int window, String title);


    public static native void glfwSetWindowIcon(int window, int count, GLFWimage images);


    // public static native void glfwGetWindowPos(int window, int xpos, int ypos);


    public static native void glfwSetWindowPos(int window, int xpos, int ypos);


    // public static native void glfwGetWindowSize(int window, int* width, int* height);


    public static native void glfwSetWindowSizeLimits(int window, int minwidth, int minheight, int maxwidth, int maxheight);


    public static native void glfwSetWindowAspectRatio(int window, int numer, int denom);


    public static native void glfwSetWindowSize(int window, int width, int height);

    public static native int glfwGetFramebufferWidth(int window);
    public static native int glfwGetFramebufferHeight(int window);
    
    public static native int glfwGetWindowFrameLeft(int window);
    public static native int glfwGetWindowFrameTop(int window);
    public static native int glfwGetWindowFrameRight(int window);
    public static native int glfwGetWindowFrameBottom(int window);

    // public static native void glfwGetFramebufferSize(int* window, int* width, int* height);


    // public static native void glfwGetWindowFrameSize(int* window, int* left, int* top, int* right, int* bottom);


    // public static native void glfwGetWindowContentScale(int* window, float* xscale, float* yscale);


    // public static native float glfwGetWindowOpacity(int* window);


    public static native void glfwSetWindowOpacity(int window, float opacity);


    public static native void glfwIconifyWindow(int window);


    public static native void glfwRestoreWindow(int window);


    public static native void glfwMaximizeWindow(int window);


    public static native void glfwShowWindow(int window);


    public static native void glfwHideWindow(int window);


    public static native void glfwFocusWindow(int window);


    public static native void glfwRequestWindowAttention(int window);


    public static native GLFWmonitor glfwGetWindowMonitor(int window);


    public static native void glfwSetWindowMonitor(int window, GLFWmonitor monitor, int xpos, int ypos, int width, int height, int refreshRate);


    public static native int glfwGetWindowAttrib(int window, int attrib);


    public static native void glfwSetWindowAttrib(int window, int attrib, int value);


    // public static native void glfwSetWindowUserPointer(int window, void pointer);


    // public static native void* glfwGetWindowUserPointer(int* window);


    // public static native intposfun glfwSetWindowPosCallback(int* window, intposfun callback);


    // public static native intsizefun glfwSetWindowSizeCallback(int* window, intsizefun callback);


    // public static native intclosefun glfwSetWindowCloseCallback(int* window, intclosefun callback);


    // public static native intrefreshfun glfwSetWindowRefreshCallback(int* window, intrefreshfun callback);


    // public static native intfocusfun glfwSetWindowFocusCallback(int* window, intfocusfun callback);


    // public static native inticonifyfun glfwSetWindowIconifyCallback(int* window, inticonifyfun callback);


    // public static native intmaximizefun glfwSetWindowMaximizeCallback(int* window, intmaximizefun callback);


    // public static native GLFWframebuffersizefun glfwSetFramebufferSizeCallback(int* window, GLFWframebuffersizefun callback);


    // public static native intcontentscalefun glfwSetWindowContentScaleCallback(int* window, intcontentscalefun callback);


    public static native void glfwPollEvents();


    public static native void glfwWaitEvents();


    public static native void glfwWaitEventsTimeout(double timeout);


    public static native void glfwPostEmptyEvent();


    public static native int glfwGetInputMode(int window, int mode);


    public static native void glfwSetInputMode(int window, int mode, int value);


    public static native int glfwRawMouseMotionSupported();


    public static native String glfwGetKeyName(int key, int scancode);


    public static native int glfwGetKeyScancode(int key);


    public static native int glfwGetKey(int window, int key);


    public static native int glfwGetMouseButton(int window, int button);


    // public static native void glfwGetCursorPos(int* window, double* xpos, double* ypos);


    public static native void glfwSetCursorPos(int window, double xpos, double ypos);


    // public static native GLFWcursor* glfwCreateCursor(const GLFWimage image, int xhot, int yhot);


    // public static native GLFWcursor* glfwCreateStandardCursor(int shape);


    // public static native void glfwDestroyCursor(GLFWcursor* cursor);


    // public static native void glfwSetCursor(int* window, GLFWcursor* cursor);


    // public static native GLFWkeyfun glfwSetKeyCallback(int* window, GLFWkeyfun callback);


    // public static native GLFWcharfun glfwSetCharCallback(int* window, GLFWcharfun callback);


    // public static native GLFWcharmodsfun glfwSetCharModsCallback(int* window, GLFWcharmodsfun callback);


    // public static native GLFWmousebuttonfun glfwSetMouseButtonCallback(int* window, GLFWmousebuttonfun callback);


    // public static native GLFWcursorposfun glfwSetCursorPosCallback(int* window, GLFWcursorposfun callback);


    // public static native GLFWcursorenterfun glfwSetCursorEnterCallback(int* window, GLFWcursorenterfun callback);


    // public static native GLFWscrollfun glfwSetScrollCallback(int* window, GLFWscrollfun callback);


    // public static native GLFWdropfun glfwSetDropCallback(int* window, GLFWdropfun callback);


    public static native int glfwJoystickPresent(int jid);


    // public static native const float* glfwGetJoystickAxes(int jid, int* count);


    // public static native const unsigned char* glfwGetJoystickButtons(int jid, int* count);


    // public static native const unsigned char* glfwGetJoystickHats(int jid, int* count);


    public static native String glfwGetJoystickName(int jid);


    public static native String glfwGetJoystickGUID(int jid);


    // public static native void glfwSetJoystickUserPointer(int jid, void* pointer);


    // public static native void* glfwGetJoystickUserPointer(int jid);


    public static native int glfwJoystickIsGamepad(int jid);


    // public static native GLFWjoystickfun glfwSetJoystickCallback(GLFWjoystickfun callback);


    public static native int glfwUpdateGamepadMappings(String string);


    public static native String glfwGetGamepadName(int jid);


    // public static native int glfwGetGamepadState(int jid, GLFWgamepadstate* state);


    public static native void glfwSetClipboardString(int window, String string);


    public static native String glfwGetClipboardString(int window);


    public static native double glfwGetTime();


    public static native void glfwSetTime(double time);


    public static native long glfwGetTimerValue();


    public static native long glfwGetTimerFrequency();


    public static native void glfwMakeContextCurrent(int window);


    public static native int glfwGetCurrentContext();


    public static native void glfwSwapBuffers(int window);


    public static native void glfwSwapInterval(int interval);


    public static native int glfwExtensionSupported(String extension);


    // public static native GLFWglproc glfwGetProcAddress(String procname);


    public static native int glfwVulkanSupported();
    
    public static native int glfwWindowShouldClose(int window);


    // public static native const char** glfwGetRequiredInstanceExtensions(int* count);


    // public static native GLFWvkproc glfwGetInstanceProcAddress(VkInstance instance, const char* procname);


    // public static native int glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device, int queuefamily);


    // public static native VkResult glfwCreateWindowSurface(VkInstance instance, int* window, const VkAllocationCallbacks* allocator, VkSurfaceKHR* surface);

    ////////////////
    // End of GLFW here.
    
    
    
    
    
    
    
    
    
    

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
    

	public static final int GL_VERSION_1_1                  = 1;
	public static final int GL_ACCUM                        = 0x0100;
	public static final int GL_LOAD                         = 0x0101;
	public static final int GL_RETURN                       = 0x0102;
	public static final int GL_MULT                         = 0x0103;
	public static final int GL_ADD                          = 0x0104;
	public static final int GL_NEVER                        = 0x0200;
	public static final int GL_LESS                         = 0x0201;
	public static final int GL_EQUAL                        = 0x0202;
	public static final int GL_LEQUAL                       = 0x0203;
	public static final int GL_GREATER                      = 0x0204;
	public static final int GL_NOTEQUAL                     = 0x0205;
	public static final int GL_GEQUAL                       = 0x0206;
	public static final int GL_ALWAYS                       = 0x0207;
	public static final int GL_CURRENT_BIT                  = 0x00000001;
	public static final int GL_POINT_BIT                    = 0x00000002;
	public static final int GL_LINE_BIT                     = 0x00000004;
	public static final int GL_POLYGON_BIT                  = 0x00000008;
	public static final int GL_POLYGON_STIPPLE_BIT          = 0x00000010;
	public static final int GL_PIXEL_MODE_BIT               = 0x00000020;
	public static final int GL_LIGHTING_BIT                 = 0x00000040;
	public static final int GL_FOG_BIT                      = 0x00000080;
	public static final int GL_DEPTH_BUFFER_BIT             = 0x00000100;
	public static final int GL_ACCUM_BUFFER_BIT             = 0x00000200;
	public static final int GL_STENCIL_BUFFER_BIT           = 0x00000400;
	public static final int GL_VIEWPORT_BIT                 = 0x00000800;
	public static final int GL_TRANSFORM_BIT                = 0x00001000;
	public static final int GL_ENABLE_BIT                   = 0x00002000;
	public static final int GL_COLOR_BUFFER_BIT             = 0x00004000;
	public static final int GL_HINT_BIT                     = 0x00008000;
	public static final int GL_EVAL_BIT                     = 0x00010000;
	public static final int GL_LIST_BIT                     = 0x00020000;
	public static final int GL_TEXTURE_BIT                  = 0x00040000;
	public static final int GL_SCISSOR_BIT                  = 0x00080000;
	public static final int GL_ALL_ATTRIB_BITS              = 0x000fffff;
	public static final int GL_POINTS                       = 0x0000;
	public static final int GL_LINES                        = 0x0001;
	public static final int GL_LINE_LOOP                    = 0x0002;
	public static final int GL_LINE_STRIP                   = 0x0003;
	public static final int GL_TRIANGLES                    = 0x0004;
	public static final int GL_TRIANGLE_STRIP               = 0x0005;
	public static final int GL_TRIANGLE_FAN                 = 0x0006;
	public static final int GL_QUADS                        = 0x0007;
	public static final int GL_QUAD_STRIP                   = 0x0008;
	public static final int GL_POLYGON                      = 0x0009;
	public static final int GL_ZERO                         = 0;
	public static final int GL_ONE                          = 1;
	public static final int GL_SRC_COLOR                    = 0x0300;
	public static final int GL_ONE_MINUS_SRC_COLOR          = 0x0301;
	public static final int GL_SRC_ALPHA                    = 0x0302;
	public static final int GL_ONE_MINUS_SRC_ALPHA          = 0x0303;
	public static final int GL_DST_ALPHA                    = 0x0304;
	public static final int GL_ONE_MINUS_DST_ALPHA          = 0x0305;
	public static final int GL_DST_COLOR                    = 0x0306;
	public static final int GL_ONE_MINUS_DST_COLOR          = 0x0307;
	public static final int GL_SRC_ALPHA_SATURATE           = 0x0308;
	public static final int GL_TRUE                        =  1;
	public static final int GL_FALSE                       =  0;
	public static final int GL_CLIP_PLANE0                  = 0x3000;
	public static final int GL_CLIP_PLANE1                  = 0x3001;
	public static final int GL_CLIP_PLANE2                  = 0x3002;
	public static final int GL_CLIP_PLANE3                  = 0x3003;
	public static final int GL_CLIP_PLANE4                  = 0x3004;
	public static final int GL_CLIP_PLANE5                  = 0x3005;
	public static final int GL_BYTE                         = 0x1400;
	public static final int GL_UNSIGNED_BYTE                = 0x1401;
	public static final int GL_SHORT                        = 0x1402;
	public static final int GL_UNSIGNED_SHORT               = 0x1403;
	public static final int GL_INT                          = 0x1404;
	public static final int GL_UNSIGNED_INT                 = 0x1405;
	public static final int GL_FLOAT                        = 0x1406;
	public static final int GL_2_BYTES                      = 0x1407;
	public static final int GL_3_BYTES                      = 0x1408;
	public static final int GL_4_BYTES                      = 0x1409;
	public static final int GL_DOUBLE                       = 0x140A;
	public static final int GL_NONE                         = 0;
	public static final int GL_FRONT_LEFT                   = 0x0400;
	public static final int GL_FRONT_RIGHT                  = 0x0401;
	public static final int GL_BACK_LEFT                    = 0x0402;
	public static final int GL_BACK_RIGHT                   = 0x0403;
	public static final int GL_FRONT                        = 0x0404;
	public static final int GL_BACK                         = 0x0405;
	public static final int GL_LEFT                         = 0x0406;
	public static final int GL_RIGHT                        = 0x0407;
	public static final int GL_FRONT_AND_BACK               = 0x0408;
	public static final int GL_AUX0                         = 0x0409;
	public static final int GL_AUX1                         = 0x040A;
	public static final int GL_AUX2                         = 0x040B;
	public static final int GL_AUX3                         = 0x040C;
	public static final int GL_NO_ERROR                     = 0;
	public static final int GL_INVALID_ENUM                 = 0x0500;
	public static final int GL_INVALID_VALUE                = 0x0501;
	public static final int GL_INVALID_OPERATION            = 0x0502;
	public static final int GL_STACK_OVERFLOW               = 0x0503;
	public static final int GL_STACK_UNDERFLOW              = 0x0504;
	public static final int GL_OUT_OF_MEMORY                = 0x0505;
	public static final int GL_2D                           = 0x0600;
	public static final int GL_3D                           = 0x0601;
	public static final int GL_3D_COLOR                     = 0x0602;
	public static final int GL_3D_COLOR_TEXTURE             = 0x0603;
	public static final int GL_4D_COLOR_TEXTURE             = 0x0604;
	public static final int GL_PASS_THROUGH_TOKEN           = 0x0700;
	public static final int GL_POINT_TOKEN                  = 0x0701;
	public static final int GL_LINE_TOKEN                   = 0x0702;
	public static final int GL_POLYGON_TOKEN                = 0x0703;
	public static final int GL_BITMAP_TOKEN                 = 0x0704;
	public static final int GL_DRAW_PIXEL_TOKEN             = 0x0705;
	public static final int GL_COPY_PIXEL_TOKEN             = 0x0706;
	public static final int GL_LINE_RESET_TOKEN             = 0x0707;
	public static final int GL_EXP                          = 0x0800;
	public static final int GL_EXP2                         = 0x0801;
	public static final int GL_CW                           = 0x0900;
	public static final int GL_CCW                          = 0x0901;
	public static final int GL_COEFF                        = 0x0A00;
	public static final int GL_ORDER                        = 0x0A01;
	public static final int GL_DOMAIN                       = 0x0A02;
	public static final int GL_CURRENT_COLOR                = 0x0B00;
	public static final int GL_CURRENT_INDEX                = 0x0B01;
	public static final int GL_CURRENT_NORMAL               = 0x0B02;
	public static final int GL_CURRENT_TEXTURE_COORDS       = 0x0B03;
	public static final int GL_CURRENT_RASTER_COLOR         = 0x0B04;
	public static final int GL_CURRENT_RASTER_INDEX         = 0x0B05;
	public static final int GL_CURRENT_RASTER_TEXTURE_COORDS= 0x0B06;
	public static final int GL_CURRENT_RASTER_POSITION      = 0x0B07;
	public static final int GL_CURRENT_RASTER_POSITION_VALID= 0x0B08;
	public static final int GL_CURRENT_RASTER_DISTANCE      = 0x0B09;
	public static final int GL_POINT_SMOOTH                 = 0x0B10;
	public static final int GL_POINT_SIZE                   = 0x0B11;
	public static final int GL_POINT_SIZE_RANGE             = 0x0B12;
	public static final int GL_POINT_SIZE_GRANULARITY       = 0x0B13;
	public static final int GL_LINE_SMOOTH                  = 0x0B20;
	public static final int GL_LINE_WIDTH                   = 0x0B21;
	public static final int GL_LINE_WIDTH_RANGE             = 0x0B22;
	public static final int GL_LINE_WIDTH_GRANULARITY       = 0x0B23;
	public static final int GL_LINE_STIPPLE                 = 0x0B24;
	public static final int GL_LINE_STIPPLE_PATTERN         = 0x0B25;
	public static final int GL_LINE_STIPPLE_REPEAT          = 0x0B26;
	public static final int GL_LIST_MODE                    = 0x0B30;
	public static final int GL_MAX_LIST_NESTING             = 0x0B31;
	public static final int GL_LIST_BASE                    = 0x0B32;
	public static final int GL_LIST_INDEX                   = 0x0B33;
	public static final int GL_POLYGON_MODE                 = 0x0B40;
	public static final int GL_POLYGON_SMOOTH               = 0x0B41;
	public static final int GL_POLYGON_STIPPLE              = 0x0B42;
	public static final int GL_EDGE_FLAG                    = 0x0B43;
	public static final int GL_CULL_FACE                    = 0x0B44;
	public static final int GL_CULL_FACE_MODE               = 0x0B45;
	public static final int GL_FRONT_FACE                   = 0x0B46;
	public static final int GL_LIGHTING                     = 0x0B50;
	public static final int GL_LIGHT_MODEL_LOCAL_VIEWER     = 0x0B51;
	public static final int GL_LIGHT_MODEL_TWO_SIDE         = 0x0B52;
	public static final int GL_LIGHT_MODEL_AMBIENT          = 0x0B53;
	public static final int GL_SHADE_MODEL                  = 0x0B54;
	public static final int GL_COLOR_MATERIAL_FACE          = 0x0B55;
	public static final int GL_COLOR_MATERIAL_PARAMETER     = 0x0B56;
	public static final int GL_COLOR_MATERIAL               = 0x0B57;
	public static final int GL_FOG                          = 0x0B60;
	public static final int GL_FOG_INDEX                    = 0x0B61;
	public static final int GL_FOG_DENSITY                  = 0x0B62;
	public static final int GL_FOG_START                    = 0x0B63;
	public static final int GL_FOG_END                      = 0x0B64;
	public static final int GL_FOG_MODE                     = 0x0B65;
	public static final int GL_FOG_COLOR                    = 0x0B66;
	public static final int GL_DEPTH_RANGE                  = 0x0B70;
	public static final int GL_DEPTH_TEST                   = 0x0B71;
	public static final int GL_DEPTH_WRITEMASK              = 0x0B72;
	public static final int GL_DEPTH_CLEAR_VALUE            = 0x0B73;
	public static final int GL_DEPTH_FUNC                   = 0x0B74;
	public static final int GL_ACCUM_CLEAR_VALUE            = 0x0B80;
	public static final int GL_STENCIL_TEST                 = 0x0B90;
	public static final int GL_STENCIL_CLEAR_VALUE          = 0x0B91;
	public static final int GL_STENCIL_FUNC                 = 0x0B92;
	public static final int GL_STENCIL_VALUE_MASK           = 0x0B93;
	public static final int GL_STENCIL_FAIL                 = 0x0B94;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL      = 0x0B95;
	public static final int GL_STENCIL_PASS_DEPTH_PASS      = 0x0B96;
	public static final int GL_STENCIL_REF                  = 0x0B97;
	public static final int GL_STENCIL_WRITEMASK            = 0x0B98;
	public static final int GL_MATRIX_MODE                  = 0x0BA0;
	public static final int GL_NORMALIZE                    = 0x0BA1;
	public static final int GL_VIEWPORT                     = 0x0BA2;
	public static final int GL_MODELVIEW_STACK_DEPTH        = 0x0BA3;
	public static final int GL_PROJECTION_STACK_DEPTH       = 0x0BA4;
	public static final int GL_TEXTURE_STACK_DEPTH          = 0x0BA5;
	public static final int GL_MODELVIEW_MATRIX             = 0x0BA6;
	public static final int GL_PROJECTION_MATRIX            = 0x0BA7;
	public static final int GL_TEXTURE_MATRIX               = 0x0BA8;
	public static final int GL_ATTRIB_STACK_DEPTH           = 0x0BB0;
	public static final int GL_CLIENT_ATTRIB_STACK_DEPTH    = 0x0BB1;
	public static final int GL_ALPHA_TEST                   = 0x0BC0;
	public static final int GL_ALPHA_TEST_FUNC              = 0x0BC1;
	public static final int GL_ALPHA_TEST_REF               = 0x0BC2;
	public static final int GL_DITHER                       = 0x0BD0;
	public static final int GL_BLEND_DST                    = 0x0BE0;
	public static final int GL_BLEND_SRC                    = 0x0BE1;
	public static final int GL_BLEND                        = 0x0BE2;
	public static final int GL_LOGIC_OP_MODE                = 0x0BF0;
	public static final int GL_INDEX_LOGIC_OP               = 0x0BF1;
	public static final int GL_COLOR_LOGIC_OP               = 0x0BF2;
	public static final int GL_AUX_BUFFERS                  = 0x0C00;
	public static final int GL_DRAW_BUFFER                  = 0x0C01;
	public static final int GL_READ_BUFFER                  = 0x0C02;
	public static final int GL_SCISSOR_BOX                  = 0x0C10;
	public static final int GL_SCISSOR_TEST                 = 0x0C11;
	public static final int GL_INDEX_CLEAR_VALUE            = 0x0C20;
	public static final int GL_INDEX_WRITEMASK              = 0x0C21;
	public static final int GL_COLOR_CLEAR_VALUE            = 0x0C22;
	public static final int GL_COLOR_WRITEMASK              = 0x0C23;
	public static final int GL_INDEX_MODE                   = 0x0C30;
	public static final int GL_RGBA_MODE                    = 0x0C31;
	public static final int GL_DOUBLEBUFFER                 = 0x0C32;
	public static final int GL_STEREO                       = 0x0C33;
	public static final int GL_RENDER_MODE                  = 0x0C40;
	public static final int GL_PERSPECTIVE_CORRECTION_HINT  = 0x0C50;
	public static final int GL_POINT_SMOOTH_HINT            = 0x0C51;
	public static final int GL_LINE_SMOOTH_HINT             = 0x0C52;
	public static final int GL_POLYGON_SMOOTH_HINT          = 0x0C53;
	public static final int GL_FOG_HINT                     = 0x0C54;
	public static final int GL_TEXTURE_GEN_S                = 0x0C60;
	public static final int GL_TEXTURE_GEN_T                = 0x0C61;
	public static final int GL_TEXTURE_GEN_R                = 0x0C62;
	public static final int GL_TEXTURE_GEN_Q                = 0x0C63;
	public static final int GL_PIXEL_MAP_I_TO_I             = 0x0C70;
	public static final int GL_PIXEL_MAP_S_TO_S             = 0x0C71;
	public static final int GL_PIXEL_MAP_I_TO_R             = 0x0C72;
	public static final int GL_PIXEL_MAP_I_TO_G             = 0x0C73;
	public static final int GL_PIXEL_MAP_I_TO_B             = 0x0C74;
	public static final int GL_PIXEL_MAP_I_TO_A             = 0x0C75;
	public static final int GL_PIXEL_MAP_R_TO_R             = 0x0C76;
	public static final int GL_PIXEL_MAP_G_TO_G             = 0x0C77;
	public static final int GL_PIXEL_MAP_B_TO_B             = 0x0C78;
	public static final int GL_PIXEL_MAP_A_TO_A             = 0x0C79;
	public static final int GL_PIXEL_MAP_I_TO_I_SIZE        = 0x0CB0;
	public static final int GL_PIXEL_MAP_S_TO_S_SIZE        = 0x0CB1;
	public static final int GL_PIXEL_MAP_I_TO_R_SIZE        = 0x0CB2;
	public static final int GL_PIXEL_MAP_I_TO_G_SIZE        = 0x0CB3;
	public static final int GL_PIXEL_MAP_I_TO_B_SIZE        = 0x0CB4;
	public static final int GL_PIXEL_MAP_I_TO_A_SIZE        = 0x0CB5;
	public static final int GL_PIXEL_MAP_R_TO_R_SIZE        = 0x0CB6;
	public static final int GL_PIXEL_MAP_G_TO_G_SIZE        = 0x0CB7;
	public static final int GL_PIXEL_MAP_B_TO_B_SIZE        = 0x0CB8;
	public static final int GL_PIXEL_MAP_A_TO_A_SIZE        = 0x0CB9;
	public static final int GL_UNPACK_SWAP_BYTES            = 0x0CF0;
	public static final int GL_UNPACK_LSB_FIRST             = 0x0CF1;
	public static final int GL_UNPACK_ROW_LENGTH            = 0x0CF2;
	public static final int GL_UNPACK_SKIP_ROWS             = 0x0CF3;
	public static final int GL_UNPACK_SKIP_PIXELS           = 0x0CF4;
	public static final int GL_UNPACK_ALIGNMENT             = 0x0CF5;
	public static final int GL_PACK_SWAP_BYTES              = 0x0D00;
	public static final int GL_PACK_LSB_FIRST               = 0x0D01;
	public static final int GL_PACK_ROW_LENGTH              = 0x0D02;
	public static final int GL_PACK_SKIP_ROWS               = 0x0D03;
	public static final int GL_PACK_SKIP_PIXELS             = 0x0D04;
	public static final int GL_PACK_ALIGNMENT               = 0x0D05;
	public static final int GL_MAP_COLOR                    = 0x0D10;
	public static final int GL_MAP_STENCIL                  = 0x0D11;
	public static final int GL_INDEX_SHIFT                  = 0x0D12;
	public static final int GL_INDEX_OFFSET                 = 0x0D13;
	public static final int GL_RED_SCALE                    = 0x0D14;
	public static final int GL_RED_BIAS                     = 0x0D15;
	public static final int GL_ZOOM_X                       = 0x0D16;
	public static final int GL_ZOOM_Y                       = 0x0D17;
	public static final int GL_GREEN_SCALE                  = 0x0D18;
	public static final int GL_GREEN_BIAS                   = 0x0D19;
	public static final int GL_BLUE_SCALE                   = 0x0D1A;
	public static final int GL_BLUE_BIAS                    = 0x0D1B;
	public static final int GL_ALPHA_SCALE                  = 0x0D1C;
	public static final int GL_ALPHA_BIAS                   = 0x0D1D;
	public static final int GL_DEPTH_SCALE                  = 0x0D1E;
	public static final int GL_DEPTH_BIAS                   = 0x0D1F;
	public static final int GL_MAX_EVAL_ORDER               = 0x0D30;
	public static final int GL_MAX_LIGHTS                   = 0x0D31;
	public static final int GL_MAX_CLIP_PLANES              = 0x0D32;
	public static final int GL_MAX_TEXTURE_SIZE             = 0x0D33;
	public static final int GL_MAX_PIXEL_MAP_TABLE          = 0x0D34;
	public static final int GL_MAX_ATTRIB_STACK_DEPTH       = 0x0D35;
	public static final int GL_MAX_MODELVIEW_STACK_DEPTH    = 0x0D36;
	public static final int GL_MAX_NAME_STACK_DEPTH         = 0x0D37;
	public static final int GL_MAX_PROJECTION_STACK_DEPTH   = 0x0D38;
	public static final int GL_MAX_TEXTURE_STACK_DEPTH      = 0x0D39;
	public static final int GL_MAX_VIEWPORT_DIMS            = 0x0D3A;
	public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH= 0x0D3B;
	public static final int GL_SUBPIXEL_BITS                = 0x0D50;
	public static final int GL_INDEX_BITS                   = 0x0D51;
	public static final int GL_RED_BITS                     = 0x0D52;
	public static final int GL_GREEN_BITS                   = 0x0D53;
	public static final int GL_BLUE_BITS                    = 0x0D54;
	public static final int GL_ALPHA_BITS                   = 0x0D55;
	public static final int GL_DEPTH_BITS                   = 0x0D56;
	public static final int GL_STENCIL_BITS                 = 0x0D57;
	public static final int GL_ACCUM_RED_BITS               = 0x0D58;
	public static final int GL_ACCUM_GREEN_BITS             = 0x0D59;
	public static final int GL_ACCUM_BLUE_BITS              = 0x0D5A;
	public static final int GL_ACCUM_ALPHA_BITS             = 0x0D5B;
	public static final int GL_NAME_STACK_DEPTH             = 0x0D70;
	public static final int GL_AUTO_NORMAL                  = 0x0D80;
	public static final int GL_MAP1_COLOR_4                 = 0x0D90;
	public static final int GL_MAP1_INDEX                   = 0x0D91;
	public static final int GL_MAP1_NORMAL                  = 0x0D92;
	public static final int GL_MAP1_TEXTURE_COORD_1         = 0x0D93;
	public static final int GL_MAP1_TEXTURE_COORD_2         = 0x0D94;
	public static final int GL_MAP1_TEXTURE_COORD_3         = 0x0D95;
	public static final int GL_MAP1_TEXTURE_COORD_4         = 0x0D96;
	public static final int GL_MAP1_VERTEX_3                = 0x0D97;
	public static final int GL_MAP1_VERTEX_4                = 0x0D98;
	public static final int GL_MAP2_COLOR_4                 = 0x0DB0;
	public static final int GL_MAP2_INDEX                   = 0x0DB1;
	public static final int GL_MAP2_NORMAL                  = 0x0DB2;
	public static final int GL_MAP2_TEXTURE_COORD_1         = 0x0DB3;
	public static final int GL_MAP2_TEXTURE_COORD_2         = 0x0DB4;
	public static final int GL_MAP2_TEXTURE_COORD_3         = 0x0DB5;
	public static final int GL_MAP2_TEXTURE_COORD_4         = 0x0DB6;
	public static final int GL_MAP2_VERTEX_3                = 0x0DB7;
	public static final int GL_MAP2_VERTEX_4                = 0x0DB8;
	public static final int GL_MAP1_GRID_DOMAIN             = 0x0DD0;
	public static final int GL_MAP1_GRID_SEGMENTS           = 0x0DD1;
	public static final int GL_MAP2_GRID_DOMAIN             = 0x0DD2;
	public static final int GL_MAP2_GRID_SEGMENTS           = 0x0DD3;
	public static final int GL_TEXTURE_1D                   = 0x0DE0;
	public static final int GL_TEXTURE_2D                   = 0x0DE1;
	public static final int GL_FEEDBACK_BUFFER_POINTER      = 0x0DF0;
	public static final int GL_FEEDBACK_BUFFER_SIZE         = 0x0DF1;
	public static final int GL_FEEDBACK_BUFFER_TYPE         = 0x0DF2;
	public static final int GL_SELECTION_BUFFER_POINTER     = 0x0DF3;
	public static final int GL_SELECTION_BUFFER_SIZE        = 0x0DF4;
	public static final int GL_TEXTURE_WIDTH                = 0x1000;
	public static final int GL_TEXTURE_HEIGHT               = 0x1001;
	public static final int GL_TEXTURE_INTERNAL_FORMAT      = 0x1003;
	public static final int GL_TEXTURE_BORDER_COLOR         = 0x1004;
	public static final int GL_TEXTURE_BORDER               = 0x1005;
	public static final int GL_DONT_CARE                    = 0x1100;
	public static final int GL_FASTEST                      = 0x1101;
	public static final int GL_NICEST                       = 0x1102;
	public static final int GL_LIGHT0                       = 0x4000;
	public static final int GL_LIGHT1                       = 0x4001;
	public static final int GL_LIGHT2                       = 0x4002;
	public static final int GL_LIGHT3                       = 0x4003;
	public static final int GL_LIGHT4                       = 0x4004;
	public static final int GL_LIGHT5                       = 0x4005;
	public static final int GL_LIGHT6                       = 0x4006;
	public static final int GL_LIGHT7                       = 0x4007;
	public static final int GL_AMBIENT                      = 0x1200;
	public static final int GL_DIFFUSE                      = 0x1201;
	public static final int GL_SPECULAR                     = 0x1202;
	public static final int GL_POSITION                     = 0x1203;
	public static final int GL_SPOT_DIRECTION               = 0x1204;
	public static final int GL_SPOT_EXPONENT                = 0x1205;
	public static final int GL_SPOT_CUTOFF                  = 0x1206;
	public static final int GL_CONSTANT_ATTENUATION         = 0x1207;
	public static final int GL_LINEAR_ATTENUATION           = 0x1208;
	public static final int GL_QUADRATIC_ATTENUATION        = 0x1209;
	public static final int GL_COMPILE                      = 0x1300;
	public static final int GL_COMPILE_AND_EXECUTE          = 0x1301;
	public static final int GL_CLEAR                        = 0x1500;
	public static final int GL_AND                          = 0x1501;
	public static final int GL_AND_REVERSE                  = 0x1502;
	public static final int GL_COPY                         = 0x1503;
	public static final int GL_AND_INVERTED                 = 0x1504;
	public static final int GL_NOOP                         = 0x1505;
	public static final int GL_XOR                          = 0x1506;
	public static final int GL_OR                           = 0x1507;
	public static final int GL_NOR                          = 0x1508;
	public static final int GL_EQUIV                        = 0x1509;
	public static final int GL_INVERT                       = 0x150A;
	public static final int GL_OR_REVERSE                   = 0x150B;
	public static final int GL_COPY_INVERTED                = 0x150C;
	public static final int GL_OR_INVERTED                  = 0x150D;
	public static final int GL_NAND                         = 0x150E;
	public static final int GL_SET                          = 0x150F;
	public static final int GL_EMISSION                     = 0x1600;
	public static final int GL_SHININESS                    = 0x1601;
	public static final int GL_AMBIENT_AND_DIFFUSE          = 0x1602;
	public static final int GL_COLOR_INDEXES                = 0x1603;
	public static final int GL_MODELVIEW                    = 0x1700;
	public static final int GL_PROJECTION                   = 0x1701;
	public static final int GL_TEXTURE                      = 0x1702;
	public static final int GL_COLOR                        = 0x1800;
	public static final int GL_DEPTH                        = 0x1801;
	public static final int GL_STENCIL                      = 0x1802;
	public static final int GL_COLOR_INDEX                  = 0x1900;
	public static final int GL_STENCIL_INDEX                = 0x1901;
	public static final int GL_DEPTH_COMPONENT              = 0x1902;
	public static final int GL_RED                          = 0x1903;
	public static final int GL_GREEN                        = 0x1904;
	public static final int GL_BLUE                         = 0x1905;
	public static final int GL_ALPHA                        = 0x1906;
	public static final int GL_RGB                          = 0x1907;
	public static final int GL_RGBA                         = 0x1908;
	public static final int GL_LUMINANCE                    = 0x1909;
	public static final int GL_LUMINANCE_ALPHA              = 0x190A;
	public static final int GL_BITMAP                       = 0x1A00;
	public static final int GL_POINT                        = 0x1B00;
	public static final int GL_LINE                         = 0x1B01;
	public static final int GL_FILL                         = 0x1B02;
	public static final int GL_RENDER                       = 0x1C00;
	public static final int GL_FEEDBACK                     = 0x1C01;
	public static final int GL_SELECT                       = 0x1C02;
	public static final int GL_FLAT                         = 0x1D00;
	public static final int GL_SMOOTH                       = 0x1D01;
	public static final int GL_KEEP                         = 0x1E00;
	public static final int GL_REPLACE                      = 0x1E01;
	public static final int GL_INCR                         = 0x1E02;
	public static final int GL_DECR                         = 0x1E03;
	public static final int GL_VENDOR                       = 0x1F00;
	public static final int GL_RENDERER                     = 0x1F01;
	public static final int GL_VERSION                      = 0x1F02;
	public static final int GL_EXTENSIONS                   = 0x1F03;
	public static final int GL_S                            = 0x2000;
	public static final int GL_T                            = 0x2001;
	public static final int GL_R                            = 0x2002;
	public static final int GL_Q                            = 0x2003;
	public static final int GL_MODULATE                     = 0x2100;
	public static final int GL_DECAL                        = 0x2101;
	public static final int GL_TEXTURE_ENV_MODE             = 0x2200;
	public static final int GL_TEXTURE_ENV_COLOR            = 0x2201;
	public static final int GL_TEXTURE_ENV                  = 0x2300;
	public static final int GL_EYE_LINEAR                   = 0x2400;
	public static final int GL_OBJECT_LINEAR                = 0x2401;
	public static final int GL_SPHERE_MAP                   = 0x2402;
	public static final int GL_TEXTURE_GEN_MODE             = 0x2500;
	public static final int GL_OBJECT_PLANE                 = 0x2501;
	public static final int GL_EYE_PLANE                    = 0x2502;
	public static final int GL_NEAREST                      = 0x2600;
	public static final int GL_LINEAR                       = 0x2601;
	public static final int GL_NEAREST_MIPMAP_NEAREST       = 0x2700;
	public static final int GL_LINEAR_MIPMAP_NEAREST        = 0x2701;
	public static final int GL_NEAREST_MIPMAP_LINEAR        = 0x2702;
	public static final int GL_LINEAR_MIPMAP_LINEAR         = 0x2703;
	public static final int GL_TEXTURE_MAG_FILTER           = 0x2800;
	public static final int GL_TEXTURE_MIN_FILTER           = 0x2801;
	public static final int GL_TEXTURE_WRAP_S               = 0x2802;
	public static final int GL_TEXTURE_WRAP_T               = 0x2803;
	public static final int GL_CLAMP                        = 0x2900;
	public static final int GL_REPEAT                       = 0x2901;
	public static final int GL_CLIENT_PIXEL_STORE_BIT       = 0x00000001;
	public static final int GL_CLIENT_VERTEX_ARRAY_BIT      = 0x00000002;
	public static final int GL_CLIENT_ALL_ATTRIB_BITS       = 0xffffffff;
	public static final int GL_POLYGON_OFFSET_FACTOR        = 0x8038;
	public static final int GL_POLYGON_OFFSET_UNITS         = 0x2A00;
	public static final int GL_POLYGON_OFFSET_POINT         = 0x2A01;
	public static final int GL_POLYGON_OFFSET_LINE          = 0x2A02;
	public static final int GL_POLYGON_OFFSET_FILL          = 0x8037;
	public static final int GL_ALPHA4                       = 0x803B;
	public static final int GL_ALPHA8                       = 0x803C;
	public static final int GL_ALPHA12                      = 0x803D;
	public static final int GL_ALPHA16                      = 0x803E;
	public static final int GL_LUMINANCE4                   = 0x803F;
	public static final int GL_LUMINANCE8                   = 0x8040;
	public static final int GL_LUMINANCE12                  = 0x8041;
	public static final int GL_LUMINANCE16                  = 0x8042;
	public static final int GL_LUMINANCE4_ALPHA4            = 0x8043;
	public static final int GL_LUMINANCE6_ALPHA2            = 0x8044;
	public static final int GL_LUMINANCE8_ALPHA8            = 0x8045;
	public static final int GL_LUMINANCE12_ALPHA4           = 0x8046;
	public static final int GL_LUMINANCE12_ALPHA12          = 0x8047;
	public static final int GL_LUMINANCE16_ALPHA16          = 0x8048;
	public static final int GL_INTENSITY                    = 0x8049;
	public static final int GL_INTENSITY4                   = 0x804A;
	public static final int GL_INTENSITY8                   = 0x804B;
	public static final int GL_INTENSITY12                  = 0x804C;
	public static final int GL_INTENSITY16                  = 0x804D;
	public static final int GL_R3_G3_B2                     = 0x2A10;
	public static final int GL_RGB4                         = 0x804F;
	public static final int GL_RGB5                         = 0x8050;
	public static final int GL_RGB8                         = 0x8051;
	public static final int GL_RGB10                        = 0x8052;
	public static final int GL_RGB12                        = 0x8053;
	public static final int GL_RGB16                        = 0x8054;
	public static final int GL_RGBA2                        = 0x8055;
	public static final int GL_RGBA4                        = 0x8056;
	public static final int GL_RGB5_A1                      = 0x8057;
	public static final int GL_RGBA8                        = 0x8058;
	public static final int GL_RGB10_A2                     = 0x8059;
	public static final int GL_RGBA12                       = 0x805A;
	public static final int GL_RGBA16                       = 0x805B;
	public static final int GL_TEXTURE_RED_SIZE             = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE           = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE            = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE           = 0x805F;
	public static final int GL_TEXTURE_LUMINANCE_SIZE       = 0x8060;
	public static final int GL_TEXTURE_INTENSITY_SIZE       = 0x8061;
	public static final int GL_PROXY_TEXTURE_1D             = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D             = 0x8064;
	public static final int GL_TEXTURE_PRIORITY             = 0x8066;
	public static final int GL_TEXTURE_RESIDENT             = 0x8067;
	public static final int GL_TEXTURE_BINDING_1D           = 0x8068;
	public static final int GL_TEXTURE_BINDING_2D           = 0x8069;
	public static final int GL_VERTEX_ARRAY                 = 0x8074;
	public static final int GL_NORMAL_ARRAY                 = 0x8075;
	public static final int GL_COLOR_ARRAY                  = 0x8076;
	public static final int GL_INDEX_ARRAY                  = 0x8077;
	public static final int GL_TEXTURE_COORD_ARRAY          = 0x8078;
	public static final int GL_EDGE_FLAG_ARRAY              = 0x8079;
	public static final int GL_VERTEX_ARRAY_SIZE            = 0x807A;
	public static final int GL_VERTEX_ARRAY_TYPE            = 0x807B;
	public static final int GL_VERTEX_ARRAY_STRIDE          = 0x807C;
	public static final int GL_NORMAL_ARRAY_TYPE            = 0x807E;
	public static final int GL_NORMAL_ARRAY_STRIDE          = 0x807F;
	public static final int GL_COLOR_ARRAY_SIZE             = 0x8081;
	public static final int GL_COLOR_ARRAY_TYPE             = 0x8082;
	public static final int GL_COLOR_ARRAY_STRIDE           = 0x8083;
	public static final int GL_INDEX_ARRAY_TYPE             = 0x8085;
	public static final int GL_INDEX_ARRAY_STRIDE           = 0x8086;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE     = 0x8088;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE     = 0x8089;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE   = 0x808A;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE       = 0x808C;
	public static final int GL_VERTEX_ARRAY_POINTER         = 0x808E;
	public static final int GL_NORMAL_ARRAY_POINTER         = 0x808F;
	public static final int GL_COLOR_ARRAY_POINTER          = 0x8090;
	public static final int GL_INDEX_ARRAY_POINTER          = 0x8091;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER  = 0x8092;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER      = 0x8093;
	public static final int GL_V2F                          = 0x2A20;
	public static final int GL_V3F                          = 0x2A21;
	public static final int GL_C4UB_V2F                     = 0x2A22;
	public static final int GL_C4UB_V3F                     = 0x2A23;
	public static final int GL_C3F_V3F                      = 0x2A24;
	public static final int GL_N3F_V3F                      = 0x2A25;
	public static final int GL_C4F_N3F_V3F                  = 0x2A26;
	public static final int GL_T2F_V3F                      = 0x2A27;
	public static final int GL_T4F_V4F                      = 0x2A28;
	public static final int GL_T2F_C4UB_V3F                 = 0x2A29;
	public static final int GL_T2F_C3F_V3F                  = 0x2A2A;
	public static final int GL_T2F_N3F_V3F                  = 0x2A2B;
	public static final int GL_T2F_C4F_N3F_V3F              = 0x2A2C;
	public static final int GL_T4F_C4F_N3F_V4F              = 0x2A2D;
	public static final int GL_EXT_vertex_array             = 1;
	public static final int GL_EXT_bgra                     = 1;
	public static final int GL_EXT_paletted_texture         = 1;
	public static final int GL_WIN_swap_hint                = 1;
	public static final int GL_WIN_draw_range_elements      = 1;
	// public static final int GL_WIN_phong_shading         =    1;
	// public static final int GL_WIN_specular_fog          =    1;
	public static final int GL_VERTEX_ARRAY_EXT             = 0x8074;
	public static final int GL_NORMAL_ARRAY_EXT             = 0x8075;
	public static final int GL_COLOR_ARRAY_EXT              = 0x8076;
	public static final int GL_INDEX_ARRAY_EXT              = 0x8077;
	public static final int GL_TEXTURE_COORD_ARRAY_EXT      = 0x8078;
	public static final int GL_EDGE_FLAG_ARRAY_EXT          = 0x8079;
	public static final int GL_VERTEX_ARRAY_SIZE_EXT        = 0x807A;
	public static final int GL_VERTEX_ARRAY_TYPE_EXT        = 0x807B;
	public static final int GL_VERTEX_ARRAY_STRIDE_EXT      = 0x807C;
	public static final int GL_VERTEX_ARRAY_COUNT_EXT       = 0x807D;
	public static final int GL_NORMAL_ARRAY_TYPE_EXT        = 0x807E;
	public static final int GL_NORMAL_ARRAY_STRIDE_EXT      = 0x807F;
	public static final int GL_NORMAL_ARRAY_COUNT_EXT       = 0x8080;
	public static final int GL_COLOR_ARRAY_SIZE_EXT         = 0x8081;
	public static final int GL_COLOR_ARRAY_TYPE_EXT         = 0x8082;
	public static final int GL_COLOR_ARRAY_STRIDE_EXT       = 0x8083;
	public static final int GL_COLOR_ARRAY_COUNT_EXT        = 0x8084;
	public static final int GL_INDEX_ARRAY_TYPE_EXT         = 0x8085;
	public static final int GL_INDEX_ARRAY_STRIDE_EXT       = 0x8086;
	public static final int GL_INDEX_ARRAY_COUNT_EXT        = 0x8087;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
	public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT= 0x808B;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT   = 0x808C;
	public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT    = 0x808D;
	public static final int GL_VERTEX_ARRAY_POINTER_EXT     = 0x808E;
	public static final int GL_NORMAL_ARRAY_POINTER_EXT     = 0x808F;
	public static final int GL_COLOR_ARRAY_POINTER_EXT      = 0x8090;
	public static final int GL_INDEX_ARRAY_POINTER_EXT      = 0x8091;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT  = 0x8093;
	public static final int GL_DOUBLE_EXT                   = GL_DOUBLE;
	public static final int GL_BGR_EXT                      = 0x80E0;
	public static final int GL_BGRA_EXT                     = 0x80E1;
	public static final int GL_COLOR_TABLE_FORMAT_EXT       = 0x80D8;
	public static final int GL_COLOR_TABLE_WIDTH_EXT        = 0x80D9;
	public static final int GL_COLOR_TABLE_RED_SIZE_EXT     = 0x80DA;
	public static final int GL_COLOR_TABLE_GREEN_SIZE_EXT   = 0x80DB;
	public static final int GL_COLOR_TABLE_BLUE_SIZE_EXT    = 0x80DC;
	public static final int GL_COLOR_TABLE_ALPHA_SIZE_EXT   = 0x80DD;
	public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_EXT = 0x80DE;
	public static final int GL_COLOR_TABLE_INTENSITY_SIZE_EXT = 0x80DF;
	public static final int GL_COLOR_INDEX1_EXT             = 0x80E2;
	public static final int GL_COLOR_INDEX2_EXT             = 0x80E3;
	public static final int GL_COLOR_INDEX4_EXT             = 0x80E4;
	public static final int GL_COLOR_INDEX8_EXT             = 0x80E5;
	public static final int GL_COLOR_INDEX12_EXT            = 0x80E6;
	public static final int GL_COLOR_INDEX16_EXT            = 0x80E7;
	public static final int GL_MAX_ELEMENTS_VERTICES_WIN    = 0x80E8;
	public static final int GL_MAX_ELEMENTS_INDICES_WIN     = 0x80E9;
	public static final int GL_PHONG_WIN                    = 0x80EA;
	public static final int GL_PHONG_HINT_WIN               = 0x80EB;
	public static final int GL_FOG_SPECULAR_TEXTURE_WIN     = 0x80EC;
	public static final int GL_LOGIC_OP = GL_INDEX_LOGIC_OP;
	public static final int GL_TEXTURE_COMPONENTS = GL_TEXTURE_INTERNAL_FORMAT;

	public static final int GL_FUNC_ADD                     = 0x8006;
	public static final int GL_BLEND_EQUATION               = 0x8009;
	public static final int GL_BLEND_EQUATION_RGB           = 0x8009;
	public static final int GL_BLEND_EQUATION_ALPHA         = 0x883D;
	public static final int GL_FUNC_SUBTRACT                = 0x800A;
	public static final int GL_FUNC_REVERSE_SUBTRACT        = 0x800B;
	public static final int GL_BLEND_DST_RGB                = 0x80C8;
	public static final int GL_BLEND_SRC_RGB                = 0x80C9;
	public static final int GL_BLEND_DST_ALPHA              = 0x80CA;
	public static final int GL_BLEND_SRC_ALPHA              = 0x80CB;
	public static final int GL_CONSTANT_COLOR               = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR     = 0x8002;
	public static final int GL_CONSTANT_ALPHA               = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA     = 0x8004;
	public static final int GL_BLEND_COLOR                  = 0x8005;
	public static final int GL_ARRAY_BUFFER                 = 0x8892;
	public static final int GL_ELEMENT_ARRAY_BUFFER         = 0x8893;
	public static final int GL_ARRAY_BUFFER_BINDING         = 0x8894;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
	public static final int GL_STREAM_DRAW                  = 0x88E0;
	public static final int GL_STATIC_DRAW                  = 0x88E4;
	public static final int GL_DYNAMIC_DRAW                 = 0x88E8;
	public static final int GL_BUFFER_SIZE                  = 0x8764;
	public static final int GL_BUFFER_USAGE                 = 0x8765;
	public static final int GL_CURRENT_VERTEX_ATTRIB        = 0x8626;
	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE     = 0x809E;
	public static final int GL_SAMPLE_COVERAGE              = 0x80A0;
	public static final int GL_ALIASED_POINT_SIZE_RANGE     = 0x846D;
	public static final int GL_ALIASED_LINE_WIDTH_RANGE     = 0x846E;
	public static final int GL_STENCIL_BACK_FUNC            = 0x8800;
	public static final int GL_STENCIL_BACK_FAIL            = 0x8801;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
	public static final int GL_STENCIL_BACK_REF             = 0x8CA3;
	public static final int GL_STENCIL_BACK_VALUE_MASK      = 0x8CA4;
	public static final int GL_STENCIL_BACK_WRITEMASK       = 0x8CA5;
	public static final int GL_SAMPLE_BUFFERS               = 0x80A8;
	public static final int GL_SAMPLES                      = 0x80A9;
	public static final int GL_SAMPLE_COVERAGE_VALUE        = 0x80AA;
	public static final int GL_SAMPLE_COVERAGE_INVERT       = 0x80AB;
	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
	public static final int GL_COMPRESSED_TEXTURE_FORMATS   = 0x86A3;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4       = 0x8033;
	public static final int GL_UNSIGNED_SHORT_5_5_5_1       = 0x8034;
	public static final int GL_UNSIGNED_SHORT_5_6_5         = 0x8363;
	public static final int GL_FRAGMENT_SHADER              = 0x8B30;
	public static final int GL_VERTEX_SHADER                = 0x8B31;
	public static final int GL_MAX_VERTEX_ATTRIBS           = 0x8869;
	public static final int GL_MAX_VERTEX_UNIFORM_VECTORS   = 0x8DFB;
	public static final int GL_MAX_VARYING_VECTORS          = 0x8DFC;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS      = 0x8872;
	public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
	public static final int GL_SHADER_TYPE                  = 0x8B4F;
	public static final int GL_DELETE_STATUS                = 0x8B80;
	public static final int GL_LINK_STATUS                  = 0x8B82;
	public static final int GL_VALIDATE_STATUS              = 0x8B83;
	public static final int GL_ATTACHED_SHADERS             = 0x8B85;
	public static final int GL_ACTIVE_UNIFORMS              = 0x8B86;
	public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH    = 0x8B87;
	public static final int GL_ACTIVE_ATTRIBUTES            = 0x8B89;
	public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH  = 0x8B8A;
	public static final int GL_SHADING_LANGUAGE_VERSION     = 0x8B8C;
	public static final int GL_CURRENT_PROGRAM              = 0x8B8D;
	public static final int GL_INCR_WRAP                    = 0x8507;
	public static final int GL_DECR_WRAP                    = 0x8508;
	public static final int GL_TEXTURE_CUBE_MAP             = 0x8513;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP     = 0x8514;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X  = 0x8515;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X  = 0x8516;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y  = 0x8517;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y  = 0x8518;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z  = 0x8519;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z  = 0x851A;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE    = 0x851C;
	public static final int GL_TEXTURE0                     = 0x84C0;
	public static final int GL_TEXTURE1                     = 0x84C1;
	public static final int GL_TEXTURE2                     = 0x84C2;
	public static final int GL_TEXTURE3                     = 0x84C3;
	public static final int GL_TEXTURE4                     = 0x84C4;
	public static final int GL_TEXTURE5                     = 0x84C5;
	public static final int GL_TEXTURE6                     = 0x84C6;
	public static final int GL_TEXTURE7                     = 0x84C7;
	public static final int GL_TEXTURE8                     = 0x84C8;
	public static final int GL_TEXTURE9                     = 0x84C9;
	public static final int GL_TEXTURE10                    = 0x84CA;
	public static final int GL_TEXTURE11                    = 0x84CB;
	public static final int GL_TEXTURE12                    = 0x84CC;
	public static final int GL_TEXTURE13                    = 0x84CD;
	public static final int GL_TEXTURE14                    = 0x84CE;
	public static final int GL_TEXTURE15                    = 0x84CF;
	public static final int GL_TEXTURE16                    = 0x84D0;
	public static final int GL_TEXTURE17                    = 0x84D1;
	public static final int GL_TEXTURE18                    = 0x84D2;
	public static final int GL_TEXTURE19                    = 0x84D3;
	public static final int GL_TEXTURE20                    = 0x84D4;
	public static final int GL_TEXTURE21                    = 0x84D5;
	public static final int GL_TEXTURE22                    = 0x84D6;
	public static final int GL_TEXTURE23                    = 0x84D7;
	public static final int GL_TEXTURE24                    = 0x84D8;
	public static final int GL_TEXTURE25                    = 0x84D9;
	public static final int GL_TEXTURE26                    = 0x84DA;
	public static final int GL_TEXTURE27                    = 0x84DB;
	public static final int GL_TEXTURE28                    = 0x84DC;
	public static final int GL_TEXTURE29                    = 0x84DD;
	public static final int GL_TEXTURE30                    = 0x84DE;
	public static final int GL_TEXTURE31                    = 0x84DF;
	public static final int GL_ACTIVE_TEXTURE               = 0x84E0;
	public static final int GL_CLAMP_TO_EDGE                = 0x812F;
	public static final int GL_MIRRORED_REPEAT              = 0x8370;
	public static final int GL_FLOAT_VEC2                   = 0x8B50;
	public static final int GL_FLOAT_VEC3                   = 0x8B51;
	public static final int GL_FLOAT_VEC4                   = 0x8B52;
	public static final int GL_INT_VEC2                     = 0x8B53;
	public static final int GL_INT_VEC3                     = 0x8B54;
	public static final int GL_INT_VEC4                     = 0x8B55;
	public static final int GL_BOOL                         = 0x8B56;
	public static final int GL_BOOL_VEC2                    = 0x8B57;
	public static final int GL_BOOL_VEC3                    = 0x8B58;
	public static final int GL_BOOL_VEC4                    = 0x8B59;
	public static final int GL_FLOAT_MAT2                   = 0x8B5A;
	public static final int GL_FLOAT_MAT3                   = 0x8B5B;
	public static final int GL_FLOAT_MAT4                   = 0x8B5C;
	public static final int GL_SAMPLER_2D                   = 0x8B5E;
	public static final int GL_SAMPLER_CUBE                 = 0x8B60;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED  = 0x8622;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE     = 0x8623;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE   = 0x8624;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE     = 0x8625;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER  = 0x8645;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
	public static final int GL_COMPILE_STATUS               = 0x8B81;
	public static final int GL_INFO_LOG_LENGTH              = 0x8B84;
	public static final int GL_SHADER_SOURCE_LENGTH         = 0x8B88;
	public static final int GL_SHADER_COMPILER              = 0x8DFA;
	public static final int GL_SHADER_BINARY_FORMATS        = 0x8DF8;
	public static final int GL_NUM_SHADER_BINARY_FORMATS    = 0x8DF9;
	public static final int GL_LOW_FLOAT                    = 0x8DF0;
	public static final int GL_MEDIUM_FLOAT                 = 0x8DF1;
	public static final int GL_HIGH_FLOAT                   = 0x8DF2;
	public static final int GL_LOW_INT                      = 0x8DF3;
	public static final int GL_MEDIUM_INT                   = 0x8DF4;
	public static final int GL_HIGH_INT                     = 0x8DF5;
	public static final int GL_FRAMEBUFFER                  = 0x8D40;
	public static final int GL_RENDERBUFFER                 = 0x8D41;
	public static final int GL_RGB565                       = 0x8D62;
	public static final int GL_DEPTH_COMPONENT16            = 0x81A5;
	public static final int GL_STENCIL_INDEX8               = 0x8D48;
	public static final int GL_RENDERBUFFER_WIDTH           = 0x8D42;
	public static final int GL_RENDERBUFFER_HEIGHT          = 0x8D43;
	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
	public static final int GL_RENDERBUFFER_RED_SIZE        = 0x8D50;
	public static final int GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51;
	public static final int GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52;
	public static final int GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53;
	public static final int GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54;
	public static final int GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
	public static final int GL_COLOR_ATTACHMENT0            = 0x8CE0;
	public static final int GL_DEPTH_ATTACHMENT             = 0x8D00;
	public static final int GL_STENCIL_ATTACHMENT           = 0x8D20;
	public static final int GL_FRAMEBUFFER_COMPLETE         = 0x8CD5;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;
	public static final int GL_FRAMEBUFFER_UNSUPPORTED      = 0x8CDD;
	public static final int GL_FRAMEBUFFER_BINDING          = 0x8CA6;
	public static final int GL_RENDERBUFFER_BINDING         = 0x8CA7;
	public static final int GL_MAX_RENDERBUFFER_SIZE        = 0x84E8;
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION= 0x0506;


	public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE = 0x9381;
	public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY = 0x9382;
	public static final int GL_MULTIPLY                     = 0x9294;
	public static final int GL_SCREEN                       = 0x9295;
	public static final int GL_OVERLAY                      = 0x9296;
	public static final int GL_DARKEN                       = 0x9297;
	public static final int GL_LIGHTEN                      = 0x9298;
	public static final int GL_COLORDODGE                   = 0x9299;
	public static final int GL_COLORBURN                    = 0x929A;
	public static final int GL_HARDLIGHT                    = 0x929B;
	public static final int GL_SOFTLIGHT                    = 0x929C;
	public static final int GL_DIFFERENCE                   = 0x929E;
	public static final int GL_EXCLUSION                    = 0x92A0;
	public static final int GL_HSL_HUE                      = 0x92AD;
	public static final int GL_HSL_SATURATION               = 0x92AE;
	public static final int GL_HSL_COLOR                    = 0x92AF;
	public static final int GL_HSL_LUMINOSITY               = 0x92B0;
	public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS     = 0x8242;
	public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
	public static final int GL_DEBUG_CALLBACK_FUNCTION      = 0x8244;
	public static final int GL_DEBUG_CALLBACK_USER_PARAM    = 0x8245;
	public static final int GL_DEBUG_SOURCE_API             = 0x8246;
	public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM   = 0x8247;
	public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
	public static final int GL_DEBUG_SOURCE_THIRD_PARTY     = 0x8249;
	public static final int GL_DEBUG_SOURCE_APPLICATION     = 0x824A;
	public static final int GL_DEBUG_SOURCE_OTHER           = 0x824B;
	public static final int GL_DEBUG_TYPE_ERROR             = 0x824C;
	public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
	public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR= 0x824E;
	public static final int GL_DEBUG_TYPE_PORTABILITY       = 0x824F;
	public static final int GL_DEBUG_TYPE_PERFORMANCE       = 0x8250;
	public static final int GL_DEBUG_TYPE_OTHER             = 0x8251;
	public static final int GL_DEBUG_TYPE_MARKER            = 0x8268;
	public static final int GL_DEBUG_TYPE_PUSH_GROUP        = 0x8269;
	public static final int GL_DEBUG_TYPE_POP_GROUP         = 0x826A;
	public static final int GL_DEBUG_SEVERITY_NOTIFICATION  = 0x826B;
	public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH  = 0x826C;
	public static final int GL_DEBUG_GROUP_STACK_DEPTH      = 0x826D;
	public static final int GL_BUFFER                       = 0x82E0;
	public static final int GL_SHADER                       = 0x82E1;
	public static final int GL_PROGRAM                      = 0x82E2;
	public static final int GL_QUERY                        = 0x82E3;
	public static final int GL_PROGRAM_PIPELINE             = 0x82E4;
	public static final int GL_SAMPLER                      = 0x82E6;
	public static final int GL_MAX_LABEL_LENGTH             = 0x82E8;
	public static final int GL_MAX_DEBUG_MESSAGE_LENGTH     = 0x9143;
	public static final int GL_MAX_DEBUG_LOGGED_MESSAGES    = 0x9144;
	public static final int GL_DEBUG_LOGGED_MESSAGES        = 0x9145;
	public static final int GL_DEBUG_SEVERITY_HIGH          = 0x9146;
	public static final int GL_DEBUG_SEVERITY_MEDIUM        = 0x9147;
	public static final int GL_DEBUG_SEVERITY_LOW           = 0x9148;
	public static final int GL_DEBUG_OUTPUT                 = 0x92E0;
	public static final int GL_CONTEXT_FLAG_DEBUG_BIT       = 0x00000002;
	public static final int GL_GEOMETRY_SHADER              = 0x8DD9;
	public static final int GL_GEOMETRY_SHADER_BIT          = 0x00000004;
	public static final int GL_GEOMETRY_VERTICES_OUT        = 0x8916;
	public static final int GL_GEOMETRY_INPUT_TYPE          = 0x8917;
	public static final int GL_GEOMETRY_OUTPUT_TYPE         = 0x8918;
	public static final int GL_GEOMETRY_SHADER_INVOCATIONS  = 0x887F;
	public static final int GL_LAYER_PROVOKING_VERTEX       = 0x825E;
	public static final int GL_LINES_ADJACENCY              = 0x000A;
	public static final int GL_LINE_STRIP_ADJACENCY         = 0x000B;
	public static final int GL_TRIANGLES_ADJACENCY          = 0x000C;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY     = 0x000D;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
	public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS  = 0x8A2C;
	public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
	public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS= 0x9123;
	public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
	public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
	public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS  = 0x90CD;
	public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
	public static final int GL_FIRST_VERTEX_CONVENTION      = 0x8E4D;
	public static final int GL_LAST_VERTEX_CONVENTION       = 0x8E4E;
	public static final int GL_UNDEFINED_VERTEX             = 0x8260;
	public static final int GL_PRIMITIVES_GENERATED         = 0x8C87;
	public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS   = 0x9312;
	public static final int GL_MAX_FRAMEBUFFER_LAYERS       = 0x9317;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
	public static final int GL_REFERENCED_BY_GEOMETRY_SHADER= 0x9309;
	public static final int GL_PRIMITIVE_BOUNDING_BOX       = 0x92BE;
	public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
	public static final int GL_CONTEXT_FLAGS                = 0x821E;
	public static final int GL_LOSE_CONTEXT_ON_RESET        = 0x8252;
	public static final int GL_GUILTY_CONTEXT_RESET         = 0x8253;
	public static final int GL_INNOCENT_CONTEXT_RESET       = 0x8254;
	public static final int GL_UNKNOWN_CONTEXT_RESET        = 0x8255;
	public static final int GL_RESET_NOTIFICATION_STRATEGY  = 0x8256;
	public static final int GL_NO_RESET_NOTIFICATION        = 0x8261;
	public static final int GL_CONTEXT_LOST                 = 0x0507;
	public static final int GL_SAMPLE_SHADING               = 0x8C36;
	public static final int GL_MIN_SAMPLE_SHADING_VALUE     = 0x8C37;
	public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
	public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
	public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
	public static final int GL_PATCHES                      = 0x000E;
	public static final int GL_PATCH_VERTICES               = 0x8E72;
	public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
	public static final int GL_TESS_GEN_MODE                = 0x8E76;
	public static final int GL_TESS_GEN_SPACING             = 0x8E77;
	public static final int GL_TESS_GEN_VERTEX_ORDER        = 0x8E78;
	public static final int GL_TESS_GEN_POINT_MODE          = 0x8E79;
	public static final int GL_ISOLINES                     = 0x8E7A;
	public static final int GL_FRACTIONAL_ODD               = 0x8E7B;
	public static final int GL_FRACTIONAL_EVEN              = 0x8E7C;
	public static final int GL_MAX_PATCH_VERTICES           = 0x8E7D;
	public static final int GL_MAX_TESS_GEN_LEVEL           = 0x8E7E;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
	public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
	public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
	public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
	public static final int GL_MAX_TESS_PATCH_COMPONENTS    = 0x8E84;
	public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
	public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
	public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
	public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
	public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
	public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
	public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
	public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
	public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
	public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
	public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
	public static final int GL_IS_PER_PATCH                 = 0x92E7;
	public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
	public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
	public static final int GL_TESS_CONTROL_SHADER          = 0x8E88;
	public static final int GL_TESS_EVALUATION_SHADER       = 0x8E87;
	public static final int GL_TESS_CONTROL_SHADER_BIT      = 0x00000008;
	public static final int GL_TESS_EVALUATION_SHADER_BIT   = 0x00000010;
	public static final int GL_CLAMP_TO_BORDER              = 0x812D;
	public static final int GL_TEXTURE_BUFFER               = 0x8C2A;
	public static final int GL_TEXTURE_BUFFER_BINDING       = 0x8C2A;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE      = 0x8C2B;
	public static final int GL_TEXTURE_BINDING_BUFFER       = 0x8C2C;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
	public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
	public static final int GL_SAMPLER_BUFFER               = 0x8DC2;
	public static final int GL_INT_SAMPLER_BUFFER           = 0x8DD0;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER  = 0x8DD8;
	public static final int GL_IMAGE_BUFFER                 = 0x9051;
	public static final int GL_INT_IMAGE_BUFFER             = 0x905C;
	public static final int GL_UNSIGNED_INT_IMAGE_BUFFER    = 0x9067;
	public static final int GL_TEXTURE_BUFFER_OFFSET        = 0x919D;
	public static final int GL_TEXTURE_BUFFER_SIZE          = 0x919E;
	public static final int GL_COMPRESSED_RGBA_ASTC_4x4     = 0x93B0;
	public static final int GL_COMPRESSED_RGBA_ASTC_5x4     = 0x93B1;
	public static final int GL_COMPRESSED_RGBA_ASTC_5x5     = 0x93B2;
	public static final int GL_COMPRESSED_RGBA_ASTC_6x5     = 0x93B3;
	public static final int GL_COMPRESSED_RGBA_ASTC_6x6     = 0x93B4;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x5     = 0x93B5;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x6     = 0x93B6;
	public static final int GL_COMPRESSED_RGBA_ASTC_8x8     = 0x93B7;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x5    = 0x93B8;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x6    = 0x93B9;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x8    = 0x93BA;
	public static final int GL_COMPRESSED_RGBA_ASTC_10x10   = 0x93BB;
	public static final int GL_COMPRESSED_RGBA_ASTC_12x10   = 0x93BC;
	public static final int GL_COMPRESSED_RGBA_ASTC_12x12   = 0x93BD;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4 = 0x93D0;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4 = 0x93D1;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5 = 0x93D2;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5 = 0x93D3;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6 = 0x93D4;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5 = 0x93D5;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6 = 0x93D6;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8 = 0x93D7;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5 = 0x93D8;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6 = 0x93D9;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8 = 0x93DA;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10 = 0x93DB;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10 = 0x93DC;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12 = 0x93DD;
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY       = 0x9009;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY       = 0x900C;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW= 0x900D;
	public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY   = 0x900E;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
	public static final int GL_IMAGE_CUBE_MAP_ARRAY         = 0x9054;
	public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY     = 0x905F;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY  = 0x9105;
	public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;


	public static final int GL_ES_VERSION_3_1 = 1;
	public static final int GL_COMPUTE_SHADER               = 0x91B9;
	public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS   = 0x91BB;
	public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
	public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS   = 0x91BD;
	public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE =  0x8262;
	public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS  = 0x8265;
	public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE  = 0x91BF;
	public static final int GL_COMPUTE_WORK_GROUP_SIZE      = 0x8267;
	public static final int GL_DISPATCH_INDIRECT_BUFFER     = 0x90EE;
	public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
	public static final int GL_COMPUTE_SHADER_BIT           = 0x00000020;
	public static final int GL_DRAW_INDIRECT_BUFFER         = 0x8F3F;
	public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
	public static final int GL_MAX_UNIFORM_LOCATIONS        = 0x826E;
	public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH    = 0x9310;
	public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT   = 0x9311;
	public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES  = 0x9313;
	public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
	public static final int GL_MAX_FRAMEBUFFER_WIDTH        = 0x9315;
	public static final int GL_MAX_FRAMEBUFFER_HEIGHT       = 0x9316;
	public static final int GL_MAX_FRAMEBUFFER_SAMPLES      = 0x9318;
	public static final int GL_UNIFORM                      = 0x92E1;
	public static final int GL_UNIFORM_BLOCK                = 0x92E2;
	public static final int GL_PROGRAM_INPUT                = 0x92E3;
	public static final int GL_PROGRAM_OUTPUT               = 0x92E4;
	public static final int GL_BUFFER_VARIABLE              = 0x92E5;
	public static final int GL_SHADER_STORAGE_BLOCK         = 0x92E6;
	public static final int GL_ATOMIC_COUNTER_BUFFER        = 0x92C0;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING   = 0x92F4;
	public static final int GL_ACTIVE_RESOURCES             = 0x92F5;
	public static final int GL_MAX_NAME_LENGTH              = 0x92F6;
	public static final int GL_MAX_NUM_ACTIVE_VARIABLES     = 0x92F7;
	public static final int GL_NAME_LENGTH                  = 0x92F9;
	public static final int GL_TYPE                         = 0x92FA;
	public static final int GL_ARRAY_SIZE                   = 0x92FB;
	public static final int GL_OFFSET                       = 0x92FC;
	public static final int GL_BLOCK_INDEX                  = 0x92FD;
	public static final int GL_ARRAY_STRIDE                 = 0x92FE;
	public static final int GL_MATRIX_STRIDE                = 0x92FF;
	public static final int GL_IS_ROW_MAJOR                 = 0x9300;
	public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX  = 0x9301;
	public static final int GL_BUFFER_BINDING               = 0x9302;
	public static final int GL_BUFFER_DATA_SIZE             = 0x9303;
	public static final int GL_NUM_ACTIVE_VARIABLES         = 0x9304;
	public static final int GL_ACTIVE_VARIABLES             = 0x9305;
	public static final int GL_REFERENCED_BY_VERTEX_SHADER  = 0x9306;
	public static final int GL_REFERENCED_BY_FRAGMENT_SHADER= 0x930A;
	public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
	public static final int GL_TOP_LEVEL_ARRAY_SIZE         = 0x930C;
	public static final int GL_TOP_LEVEL_ARRAY_STRIDE       = 0x930D;
	public static final int GL_LOCATION                     = 0x930E;
	public static final int GL_VERTEX_SHADER_BIT            = 0x00000001;
	public static final int GL_FRAGMENT_SHADER_BIT          = 0x00000002;
	public static final int GL_ALL_SHADER_BITS              = 0xFFFFFFFF;
	public static final int GL_PROGRAM_SEPARABLE            = 0x8258;
	public static final int GL_ACTIVE_PROGRAM               = 0x8259;
	public static final int GL_PROGRAM_PIPELINE_BINDING     = 0x825A;
	public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING= 0x92C1;
	public static final int GL_ATOMIC_COUNTER_BUFFER_START  = 0x92C2;
	public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE   = 0x92C3;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS   = 0x92D2;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
	public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS= 0x92D9;
	public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER  = 0x92DB;
	public static final int GL_MAX_IMAGE_UNITS              = 0x8F38;
	public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS    = 0x90CA;
	public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS  = 0x90CE;
	public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS  = 0x90CF;
	public static final int GL_IMAGE_BINDING_NAME           = 0x8F3A;
	public static final int GL_IMAGE_BINDING_LEVEL          = 0x8F3B;
	public static final int GL_IMAGE_BINDING_LAYERED        = 0x8F3C;
	public static final int GL_IMAGE_BINDING_LAYER          = 0x8F3D;
	public static final int GL_IMAGE_BINDING_ACCESS         = 0x8F3E;
	public static final int GL_IMAGE_BINDING_FORMAT         = 0x906E;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
	public static final int GL_ELEMENT_ARRAY_BARRIER_BIT    = 0x00000002;
	public static final int GL_UNIFORM_BARRIER_BIT          = 0x00000004;
	public static final int GL_TEXTURE_FETCH_BARRIER_BIT    = 0x00000008;
	public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
	public static final int GL_COMMAND_BARRIER_BIT          = 0x00000040;
	public static final int GL_PIXEL_BUFFER_BARRIER_BIT     = 0x00000080;
	public static final int GL_TEXTURE_UPDATE_BARRIER_BIT   = 0x00000100;
	public static final int GL_BUFFER_UPDATE_BARRIER_BIT    = 0x00000200;
	public static final int GL_FRAMEBUFFER_BARRIER_BIT      = 0x00000400;
	public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
	public static final int GL_ATOMIC_COUNTER_BARRIER_BIT   = 0x00001000;
	public static final int GL_ALL_BARRIER_BITS             = 0xFFFFFFFF;
	public static final int GL_IMAGE_2D                     = 0x904D;
	public static final int GL_IMAGE_3D                     = 0x904E;
	public static final int GL_IMAGE_CUBE                   = 0x9050;
	public static final int GL_IMAGE_2D_ARRAY               = 0x9053;
	public static final int GL_INT_IMAGE_2D                 = 0x9058;
	public static final int GL_INT_IMAGE_3D                 = 0x9059;
	public static final int GL_INT_IMAGE_CUBE               = 0x905B;
	public static final int GL_INT_IMAGE_2D_ARRAY           = 0x905E;
	public static final int GL_UNSIGNED_INT_IMAGE_2D        = 0x9063;
	public static final int GL_UNSIGNED_INT_IMAGE_3D        = 0x9064;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE      = 0x9066;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY  = 0x9069;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
	public static final int GL_READ_ONLY                    = 0x88B8;
	public static final int GL_WRITE_ONLY                   = 0x88B9;
	public static final int GL_READ_WRITE                   = 0x88BA;
	public static final int GL_SHADER_STORAGE_BUFFER        = 0x90D2;
	public static final int GL_SHADER_STORAGE_BUFFER_BINDING= 0x90D3;
	public static final int GL_SHADER_STORAGE_BUFFER_START  = 0x90D4;
	public static final int GL_SHADER_STORAGE_BUFFER_SIZE   = 0x90D5;
	public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
	public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
	public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
	public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
	public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
	public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE= 0x90DE;
	public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
	public static final int GL_SHADER_STORAGE_BARRIER_BIT   = 0x00002000;
	public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
	public static final int GL_DEPTH_STENCIL_TEXTURE_MODE   = 0x90EA;
	public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
	public static final int GL_SAMPLE_POSITION              = 0x8E50;
	public static final int GL_SAMPLE_MASK                  = 0x8E51;
	public static final int GL_SAMPLE_MASK_VALUE            = 0x8E52;
	public static final int GL_TEXTURE_2D_MULTISAMPLE       = 0x9100;
	public static final int GL_MAX_SAMPLE_MASK_WORDS        = 0x8E59;
	public static final int GL_MAX_COLOR_TEXTURE_SAMPLES    = 0x910E;
	public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES    = 0x910F;
	public static final int GL_MAX_INTEGER_SAMPLES          = 0x9110;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
	public static final int GL_TEXTURE_SAMPLES              = 0x9106;
	public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
	public static final int GL_TEXTURE_DEPTH                = 0x8071;
	public static final int GL_TEXTURE_DEPTH_SIZE           = 0x884A;
	public static final int GL_TEXTURE_STENCIL_SIZE         = 0x88F1;
	public static final int GL_TEXTURE_SHARED_SIZE          = 0x8C3F;
	public static final int GL_TEXTURE_RED_TYPE             = 0x8C10;
	public static final int GL_TEXTURE_GREEN_TYPE           = 0x8C11;
	public static final int GL_TEXTURE_BLUE_TYPE            = 0x8C12;
	public static final int GL_TEXTURE_ALPHA_TYPE           = 0x8C13;
	public static final int GL_TEXTURE_DEPTH_TYPE           = 0x8C16;
	public static final int GL_TEXTURE_COMPRESSED           = 0x86A1;
	public static final int GL_SAMPLER_2D_MULTISAMPLE       = 0x9108;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE   = 0x9109;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
	public static final int GL_VERTEX_ATTRIB_BINDING        = 0x82D4;
	public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET= 0x82D5;
	public static final int GL_VERTEX_BINDING_DIVISOR       = 0x82D6;
	public static final int GL_VERTEX_BINDING_OFFSET        = 0x82D7;
	public static final int GL_VERTEX_BINDING_STRIDE        = 0x82D8;
	public static final int GL_VERTEX_BINDING_BUFFER        = 0x8F4F;
	public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
	public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS   = 0x82DA;
	public static final int GL_MAX_VERTEX_ATTRIB_STRIDE     = 0x82E5;


	public static final int GL_ES_VERSION_3_0 = 1;
	public static final int GL_TEXTURE_BINDING_3D           = 0x806A;
	public static final int GL_UNPACK_SKIP_IMAGES           = 0x806D;
	public static final int GL_UNPACK_IMAGE_HEIGHT          = 0x806E;
	public static final int GL_TEXTURE_3D                   = 0x806F;
	public static final int GL_TEXTURE_WRAP_R               = 0x8072;
	public static final int GL_MAX_3D_TEXTURE_SIZE          = 0x8073;
	public static final int GL_UNSIGNED_INT_2_10_10_10_REV  = 0x8368;
	public static final int GL_MAX_ELEMENTS_VERTICES        = 0x80E8;
	public static final int GL_MAX_ELEMENTS_INDICES         = 0x80E9;
	public static final int GL_TEXTURE_MIN_LOD              = 0x813A;
	public static final int GL_TEXTURE_MAX_LOD              = 0x813B;
	public static final int GL_TEXTURE_BASE_LEVEL           = 0x813C;
	public static final int GL_TEXTURE_MAX_LEVEL            = 0x813D;
	public static final int GL_MIN                          = 0x8007;
	public static final int GL_MAX                          = 0x8008;
	public static final int GL_DEPTH_COMPONENT24            = 0x81A6;
	public static final int GL_MAX_TEXTURE_LOD_BIAS         = 0x84FD;
	public static final int GL_TEXTURE_COMPARE_MODE         = 0x884C;
	public static final int GL_TEXTURE_COMPARE_FUNC         = 0x884D;
	public static final int GL_CURRENT_QUERY                = 0x8865;
	public static final int GL_QUERY_RESULT                 = 0x8866;
	public static final int GL_QUERY_RESULT_AVAILABLE       = 0x8867;
	public static final int GL_BUFFER_MAPPED                = 0x88BC;
	public static final int GL_BUFFER_MAP_POINTER           = 0x88BD;
	public static final int GL_STREAM_READ                  = 0x88E1;
	public static final int GL_STREAM_COPY                  = 0x88E2;
	public static final int GL_STATIC_READ                  = 0x88E5;
	public static final int GL_STATIC_COPY                  = 0x88E6;
	public static final int GL_DYNAMIC_READ                 = 0x88E9;
	public static final int GL_DYNAMIC_COPY                 = 0x88EA;
	public static final int GL_MAX_DRAW_BUFFERS             = 0x8824;
	public static final int GL_DRAW_BUFFER0                 = 0x8825;
	public static final int GL_DRAW_BUFFER1                 = 0x8826;
	public static final int GL_DRAW_BUFFER2                 = 0x8827;
	public static final int GL_DRAW_BUFFER3                 = 0x8828;
	public static final int GL_DRAW_BUFFER4                 = 0x8829;
	public static final int GL_DRAW_BUFFER5                 = 0x882A;
	public static final int GL_DRAW_BUFFER6                 = 0x882B;
	public static final int GL_DRAW_BUFFER7                 = 0x882C;
	public static final int GL_DRAW_BUFFER8                 = 0x882D;
	public static final int GL_DRAW_BUFFER9                 = 0x882E;
	public static final int GL_DRAW_BUFFER10                = 0x882F;
	public static final int GL_DRAW_BUFFER11                = 0x8830;
	public static final int GL_DRAW_BUFFER12                = 0x8831;
	public static final int GL_DRAW_BUFFER13                = 0x8832;
	public static final int GL_DRAW_BUFFER14                = 0x8833;
	public static final int GL_DRAW_BUFFER15                = 0x8834;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS= 0x8B4A;
	public static final int GL_SAMPLER_3D                   = 0x8B5F;
	public static final int GL_SAMPLER_2D_SHADOW            = 0x8B62;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
	public static final int GL_PIXEL_PACK_BUFFER            = 0x88EB;
	public static final int GL_PIXEL_UNPACK_BUFFER          = 0x88EC;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING    = 0x88ED;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING  = 0x88EF;
	public static final int GL_FLOAT_MAT2x3                 = 0x8B65;
	public static final int GL_FLOAT_MAT2x4                 = 0x8B66;
	public static final int GL_FLOAT_MAT3x2                 = 0x8B67;
	public static final int GL_FLOAT_MAT3x4                 = 0x8B68;
	public static final int GL_FLOAT_MAT4x2                 = 0x8B69;
	public static final int GL_FLOAT_MAT4x3                 = 0x8B6A;
	public static final int GL_SRGB                         = 0x8C40;
	public static final int GL_SRGB8                        = 0x8C41;
	public static final int GL_SRGB8_ALPHA8                 = 0x8C43;
	public static final int GL_COMPARE_REF_TO_TEXTURE       = 0x884E;
	public static final int GL_MAJOR_VERSION                = 0x821B;
	public static final int GL_MINOR_VERSION                = 0x821C;
	public static final int GL_NUM_EXTENSIONS               = 0x821D;
	public static final int GL_RGBA32F                      = 0x8814;
	public static final int GL_RGB32F                       = 0x8815;
	public static final int GL_RGBA16F                      = 0x881A;
	public static final int GL_RGB16F                       = 0x881B;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER  = 0x88FD;
	public static final int GL_MAX_ARRAY_TEXTURE_LAYERS     = 0x88FF;
	public static final int GL_MIN_PROGRAM_TEXEL_OFFSET     = 0x8904;
	public static final int GL_MAX_PROGRAM_TEXEL_OFFSET     = 0x8905;
	public static final int GL_MAX_VARYING_COMPONENTS       = 0x8B4B;
	public static final int GL_TEXTURE_2D_ARRAY             = 0x8C1A;
	public static final int GL_TEXTURE_BINDING_2D_ARRAY     = 0x8C1D;
	public static final int GL_R11F_G11F_B10F               = 0x8C3A;
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
	public static final int GL_RGB9_E5                      = 0x8C3D;
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV     = 0x8C3E;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS  = 0x8C83;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
	public static final int GL_RASTERIZER_DISCARD           = 0x8C89;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
	public static final int GL_INTERLEAVED_ATTRIBS          = 0x8C8C;
	public static final int GL_SEPARATE_ATTRIBS             = 0x8C8D;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER    = 0x8C8E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
	public static final int GL_RGBA32UI                     = 0x8D70;
	public static final int GL_RGB32UI                      = 0x8D71;
	public static final int GL_RGBA16UI                     = 0x8D76;
	public static final int GL_RGB16UI                      = 0x8D77;
	public static final int GL_RGBA8UI                      = 0x8D7C;
	public static final int GL_RGB8UI                       = 0x8D7D;
	public static final int GL_RGBA32I                      = 0x8D82;
	public static final int GL_RGB32I                       = 0x8D83;
	public static final int GL_RGBA16I                      = 0x8D88;
	public static final int GL_RGB16I                       = 0x8D89;
	public static final int GL_RGBA8I                       = 0x8D8E;
	public static final int GL_RGB8I                        = 0x8D8F;
	public static final int GL_RED_INTEGER                  = 0x8D94;
	public static final int GL_RGB_INTEGER                  = 0x8D98;
	public static final int GL_RGBA_INTEGER                 = 0x8D99;
	public static final int GL_SAMPLER_2D_ARRAY             = 0x8DC1;
	public static final int GL_SAMPLER_2D_ARRAY_SHADOW      = 0x8DC4;
	public static final int GL_SAMPLER_CUBE_SHADOW          = 0x8DC5;
	public static final int GL_UNSIGNED_INT_VEC2            = 0x8DC6;
	public static final int GL_UNSIGNED_INT_VEC3            = 0x8DC7;
	public static final int GL_UNSIGNED_INT_VEC4            = 0x8DC8;
	public static final int GL_INT_SAMPLER_2D               = 0x8DCA;
	public static final int GL_INT_SAMPLER_3D               = 0x8DCB;
	public static final int GL_INT_SAMPLER_CUBE             = 0x8DCC;
	public static final int GL_INT_SAMPLER_2D_ARRAY         = 0x8DCF;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D      = 0x8DD2;
	public static final int GL_UNSIGNED_INT_SAMPLER_3D      = 0x8DD3;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE    = 0x8DD4;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY= 0x8DD7;
	public static final int GL_BUFFER_ACCESS_FLAGS          = 0x911F;
	public static final int GL_BUFFER_MAP_LENGTH            = 0x9120;
	public static final int GL_BUFFER_MAP_OFFSET            = 0x9121;
	public static final int GL_DEPTH_COMPONENT32F           = 0x8CAC;
	public static final int GL_DEPTH32F_STENCIL8            = 0x8CAD;
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
	public static final int GL_FRAMEBUFFER_DEFAULT          = 0x8218;
	public static final int GL_FRAMEBUFFER_UNDEFINED        = 0x8219;
	public static final int GL_DEPTH_STENCIL_ATTACHMENT     = 0x821A;
	public static final int GL_DEPTH_STENCIL                = 0x84F9;
	public static final int GL_UNSIGNED_INT_24_8            = 0x84FA;
	public static final int GL_DEPTH24_STENCIL8             = 0x88F0;
	public static final int GL_UNSIGNED_NORMALIZED          = 0x8C17;
	public static final int GL_DRAW_FRAMEBUFFER_BINDING     = 0x8CA6;
	public static final int GL_READ_FRAMEBUFFER             = 0x8CA8;
	public static final int GL_DRAW_FRAMEBUFFER             = 0x8CA9;
	public static final int GL_READ_FRAMEBUFFER_BINDING     = 0x8CAA;
	public static final int GL_RENDERBUFFER_SAMPLES         = 0x8CAB;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
	public static final int GL_MAX_COLOR_ATTACHMENTS        = 0x8CDF;
	public static final int GL_COLOR_ATTACHMENT1            = 0x8CE1;
	public static final int GL_COLOR_ATTACHMENT2            = 0x8CE2;
	public static final int GL_COLOR_ATTACHMENT3            = 0x8CE3;
	public static final int GL_COLOR_ATTACHMENT4            = 0x8CE4;
	public static final int GL_COLOR_ATTACHMENT5            = 0x8CE5;
	public static final int GL_COLOR_ATTACHMENT6            = 0x8CE6;
	public static final int GL_COLOR_ATTACHMENT7            = 0x8CE7;
	public static final int GL_COLOR_ATTACHMENT8            = 0x8CE8;
	public static final int GL_COLOR_ATTACHMENT9            = 0x8CE9;
	public static final int GL_COLOR_ATTACHMENT10           = 0x8CEA;
	public static final int GL_COLOR_ATTACHMENT11           = 0x8CEB;
	public static final int GL_COLOR_ATTACHMENT12           = 0x8CEC;
	public static final int GL_COLOR_ATTACHMENT13           = 0x8CED;
	public static final int GL_COLOR_ATTACHMENT14           = 0x8CEE;
	public static final int GL_COLOR_ATTACHMENT15           = 0x8CEF;
	public static final int GL_COLOR_ATTACHMENT16           = 0x8CF0;
	public static final int GL_COLOR_ATTACHMENT17           = 0x8CF1;
	public static final int GL_COLOR_ATTACHMENT18           = 0x8CF2;
	public static final int GL_COLOR_ATTACHMENT19           = 0x8CF3;
	public static final int GL_COLOR_ATTACHMENT20           = 0x8CF4;
	public static final int GL_COLOR_ATTACHMENT21           = 0x8CF5;
	public static final int GL_COLOR_ATTACHMENT22           = 0x8CF6;
	public static final int GL_COLOR_ATTACHMENT23           = 0x8CF7;
	public static final int GL_COLOR_ATTACHMENT24           = 0x8CF8;
	public static final int GL_COLOR_ATTACHMENT25           = 0x8CF9;
	public static final int GL_COLOR_ATTACHMENT26           = 0x8CFA;
	public static final int GL_COLOR_ATTACHMENT27           = 0x8CFB;
	public static final int GL_COLOR_ATTACHMENT28           = 0x8CFC;
	public static final int GL_COLOR_ATTACHMENT29           = 0x8CFD;
	public static final int GL_COLOR_ATTACHMENT30           = 0x8CFE;
	public static final int GL_COLOR_ATTACHMENT31           = 0x8CFF;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
	public static final int GL_MAX_SAMPLES                  = 0x8D57;
	public static final int GL_HALF_FLOAT                   = 0x140B;
	public static final int GL_MAP_READ_BIT                 = 0x0001;
	public static final int GL_MAP_WRITE_BIT                = 0x0002;
	public static final int GL_MAP_INVALIDATE_RANGE_BIT     = 0x0004;
	public static final int GL_MAP_INVALIDATE_BUFFER_BIT    = 0x0008;
	public static final int GL_MAP_FLUSH_EXPLICIT_BIT       = 0x0010;
	public static final int GL_MAP_UNSYNCHRONIZED_BIT       = 0x0020;
	public static final int GL_RG                           = 0x8227;
	public static final int GL_RG_INTEGER                   = 0x8228;
	public static final int GL_R8                           = 0x8229;
	public static final int GL_RG8                          = 0x822B;
	public static final int GL_R16F                         = 0x822D;
	public static final int GL_R32F                         = 0x822E;
	public static final int GL_RG16F                        = 0x822F;
	public static final int GL_RG32F                        = 0x8230;
	public static final int GL_R8I                          = 0x8231;
	public static final int GL_R8UI                         = 0x8232;
	public static final int GL_R16I                         = 0x8233;
	public static final int GL_R16UI                        = 0x8234;
	public static final int GL_R32I                         = 0x8235;
	public static final int GL_R32UI                        = 0x8236;
	public static final int GL_RG8I                         = 0x8237;
	public static final int GL_RG8UI                        = 0x8238;
	public static final int GL_RG16I                        = 0x8239;
	public static final int GL_RG16UI                       = 0x823A;
	public static final int GL_RG32I                        = 0x823B;
	public static final int GL_RG32UI                       = 0x823C;
	public static final int GL_VERTEX_ARRAY_BINDING         = 0x85B5;
	public static final int GL_R8_SNORM                     = 0x8F94;
	public static final int GL_RG8_SNORM                    = 0x8F95;
	public static final int GL_RGB8_SNORM                   = 0x8F96;
	public static final int GL_RGBA8_SNORM                  = 0x8F97;
	public static final int GL_SIGNED_NORMALIZED            = 0x8F9C;
	public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX= 0x8D69;
	public static final int GL_COPY_READ_BUFFER             = 0x8F36;
	public static final int GL_COPY_WRITE_BUFFER            = 0x8F37;
	public static final int GL_COPY_READ_BUFFER_BINDING     = 0x8F36;
	public static final int GL_COPY_WRITE_BUFFER_BINDING    = 0x8F37;
	public static final int GL_UNIFORM_BUFFER               = 0x8A11;
	public static final int GL_UNIFORM_BUFFER_BINDING       = 0x8A28;
	public static final int GL_UNIFORM_BUFFER_START         = 0x8A29;
	public static final int GL_UNIFORM_BUFFER_SIZE          = 0x8A2A;
	public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS    = 0x8A2B;
	public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS  = 0x8A2D;
	public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS  = 0x8A2E;
	public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS  = 0x8A2F;
	public static final int GL_MAX_UNIFORM_BLOCK_SIZE       = 0x8A30;
	public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
	public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
	public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
	public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
	public static final int GL_ACTIVE_UNIFORM_BLOCKS        = 0x8A36;
	public static final int GL_UNIFORM_TYPE                 = 0x8A37;
	public static final int GL_UNIFORM_SIZE                 = 0x8A38;
	public static final int GL_UNIFORM_NAME_LENGTH          = 0x8A39;
	public static final int GL_UNIFORM_BLOCK_INDEX          = 0x8A3A;
	public static final int GL_UNIFORM_OFFSET               = 0x8A3B;
	public static final int GL_UNIFORM_ARRAY_STRIDE         = 0x8A3C;
	public static final int GL_UNIFORM_MATRIX_STRIDE        = 0x8A3D;
	public static final int GL_UNIFORM_IS_ROW_MAJOR         = 0x8A3E;
	public static final int GL_UNIFORM_BLOCK_BINDING        = 0x8A3F;
	public static final int GL_UNIFORM_BLOCK_DATA_SIZE      = 0x8A40;
	public static final int GL_UNIFORM_BLOCK_NAME_LENGTH    = 0x8A41;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS= 0x8A42;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
	public static final int GL_INVALID_INDEX                = 0xFFFFFFFF;
	public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
	public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS= 0x9125;
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT      = 0x9111;
	public static final int GL_OBJECT_TYPE                  = 0x9112;
	public static final int GL_SYNC_CONDITION               = 0x9113;
	public static final int GL_SYNC_STATUS                  = 0x9114;
	public static final int GL_SYNC_FLAGS                   = 0x9115;
	public static final int GL_SYNC_FENCE                   = 0x9116;
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE   = 0x9117;
	public static final int GL_UNSIGNALED                   = 0x9118;
	public static final int GL_SIGNALED                     = 0x9119;
	public static final int GL_ALREADY_SIGNALED             = 0x911A;
	public static final int GL_TIMEOUT_EXPIRED              = 0x911B;
	public static final int GL_CONDITION_SATISFIED          = 0x911C;
	public static final int GL_WAIT_FAILED                  = 0x911D;
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT      = 0x00000001;
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR  = 0x88FE;
	public static final int GL_ANY_SAMPLES_PASSED           = 0x8C2F;
	public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
	public static final int GL_SAMPLER_BINDING              = 0x8919;
	public static final int GL_RGB10_A2UI                   = 0x906F;
	public static final int GL_TEXTURE_SWIZZLE_R            = 0x8E42;
	public static final int GL_TEXTURE_SWIZZLE_G            = 0x8E43;
	public static final int GL_TEXTURE_SWIZZLE_B            = 0x8E44;
	public static final int GL_TEXTURE_SWIZZLE_A            = 0x8E45;
	public static final int GL_INT_2_10_10_10_REV           = 0x8D9F;
	public static final int GL_TRANSFORM_FEEDBACK           = 0x8E22;
	public static final int GL_TRANSFORM_FEEDBACK_PAUSED    = 0x8E23;
	public static final int GL_TRANSFORM_FEEDBACK_ACTIVE    = 0x8E24;
	public static final int GL_TRANSFORM_FEEDBACK_BINDING   = 0x8E25;
	public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
	public static final int GL_PROGRAM_BINARY_LENGTH        = 0x8741;
	public static final int GL_NUM_PROGRAM_BINARY_FORMATS   = 0x87FE;
	public static final int GL_PROGRAM_BINARY_FORMATS       = 0x87FF;
	public static final int GL_COMPRESSED_R11_EAC           = 0x9270;
	public static final int GL_COMPRESSED_SIGNED_R11_EAC    = 0x9271;
	public static final int GL_COMPRESSED_RG11_EAC          = 0x9272;
	public static final int GL_COMPRESSED_SIGNED_RG11_EAC   = 0x9273;
	public static final int GL_COMPRESSED_RGB8_ETC2         = 0x9274;
	public static final int GL_COMPRESSED_SRGB8_ETC2        = 0x9275;
	public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
	public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
	public static final int GL_COMPRESSED_RGBA8_ETC2_EAC    = 0x9278;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
	public static final int GL_TEXTURE_IMMUTABLE_FORMAT     = 0x912F;
	public static final int GL_MAX_ELEMENT_INDEX            = 0x8D6B;
	public static final int GL_NUM_SAMPLE_COUNTS            = 0x9380;
	public static final int GL_TEXTURE_IMMUTABLE_LEVELS     = 0x82DF;

    // OpenGL ES 1.0
    public static native void glAccum (int op, float value);
    public static native void glAlphaFunc (int func, int ref);
    public static native boolean glAreTexturesResident (int n, IntBuffer textures, IntBuffer residences);
    public static native void glArrayElement (int i);
    public static native void glBegin (int mode);
    public static native void glBitmap (int width, int height, float xorig, float yorig, float xmove, float ymove, ByteBuffer bitmap);
    public static native void glCallList (int list);
    public static native void glCallLists (int n, int type, Buffer lists);
    public static native void glClearAccum (float red, float green, float blue, float alpha);
    public static native void glClearDepth (int depth);
    public static native void glClearIndex (float c);
    public static native void glClipPlane (int plane, DoubleBuffer equation);
    public static native void glColor3b (byte red, byte green, byte blue);
    public static native void glColor3bv (ByteBuffer v);
    public static native void glColor3d (double red, double green, double blue);
    public static native void glColor3dv (DoubleBuffer v);
    public static native void glColor3f (float red, float green, float blue);
    public static native void glColor3fv (FloatBuffer v);
    public static native void glColor3i (int red, int green, int blue);
    public static native void glColor3iv (IntBuffer v);
    public static native void glColor3s (short red, short green, short blue);
    public static native void glColor3sv (ShortBuffer v);
    public static native void glColor3ub (byte red, byte green, byte blue);
    public static native void glColor3ubv (ByteBuffer v);
    public static native void glColor3ui (int red, int green, int blue);
    public static native void glColor3uiv (IntBuffer v);
    public static native void glColor3us (short red, short green, short blue);
    public static native void glColor3usv (ShortBuffer v);
    public static native void glColor4b (byte red, byte green, byte blue, byte alpha);
    public static native void glColor4bv (ByteBuffer v);
    public static native void glColor4d (double red, double green, double blue, double alpha);
    public static native void glColor4dv (DoubleBuffer v);
    public static native void glColor4f (float red, float green, float blue, float alpha);
    public static native void glColor4fv (FloatBuffer v);
    public static native void glColor4i (int red, int green, int blue, int alpha);
    public static native void glColor4iv (IntBuffer v);
    public static native void glColor4s (short red, short green, short blue, short alpha);
    public static native void glColor4sv (ShortBuffer v);
    public static native void glColor4ub (byte red, byte green, byte blue, byte alpha);
    public static native void glColor4ubv (ByteBuffer v);
    public static native void glColor4ui (int red, int green, int blue, int alpha);
    public static native void glColor4uiv (IntBuffer v);
    public static native void glColor4us (short red, short green, short blue, short alpha);
    public static native void glColor4usv (ShortBuffer v);
    public static native void glColorMaterial (int face, int mode);
    public static native void glColorPointer (int size, int type, int stride, Buffer pointer);
    public static native void glCopyPixels (int x, int y, int width, int height, int type);
    public static native void glCopyTexImage1D (int target, int level, int internalFormat, int x, int y, int width, int border);
    public static native void glCopyTexSubImage1D (int target, int level, int xoffset, int x, int y, int width);
    public static native void glDeleteLists (int list, int range);
    public static native void glDepthRange (int zNear, int zFar);
    public static native void glDisableClientState (int array);
    public static native void glDrawBuffer (int mode);
    public static native void glDrawPixels (int width, int height, int format, int type, Buffer pixels);
    public static native void glEdgeFlag (boolean flag);
    public static native void glEdgeFlagPointer (int stride, Buffer pointer);
    public static native void glEdgeFlagv (IntBuffer flag);
    public static native void glEnableClientState (int array);
    public static native void glEnd ();
    public static native void glEndList ();
    public static native void glEvalCoord1d (double u);
    public static native void glEvalCoord1dv (DoubleBuffer u);
    public static native void glEvalCoord1f (float u);
    public static native void glEvalCoord1fv (FloatBuffer u);
    public static native void glEvalCoord2d (double u, double v);
    public static native void glEvalCoord2dv (DoubleBuffer u);
    public static native void glEvalCoord2f (float u, float v);
    public static native void glEvalCoord2fv (FloatBuffer u);
    public static native void glEvalMesh1 (int mode, int i1, int i2);
    public static native void glEvalMesh2 (int mode, int i1, int i2, int j1, int j2);
    public static native void glEvalPoint1 (int i);
    public static native void glEvalPoint2 (int i, int j);
    public static native void glFeedbackBuffer (int size, int type, FloatBuffer buffer);
    public static native void glFogf (int pname, float param);
    public static native void glFogfv (int pname, FloatBuffer params);
    public static native void glFogi (int pname, int param);
    public static native void glFogiv (int pname, IntBuffer params);
    public static native void glFrustum (double left, double right, double bottom, double top, double zNear, double zFar);
    public static native int glGenLists (int range);
    public static native void glGetClipPlane (int plane, DoubleBuffer equation);
    public static native void glGetDoublev (int pname, DoubleBuffer params);
    public static native void glGetLightfv (int light, int pname, FloatBuffer params);
    public static native void glGetLightiv (int light, int pname, IntBuffer params);
    public static native void glGetMapdv (int target, int query, DoubleBuffer v);
    public static native void glGetMapfv (int target, int query, FloatBuffer v);
    public static native void glGetMapiv (int target, int query, IntBuffer v);
    public static native void glGetMaterialfv (int face, int pname, FloatBuffer params);
    public static native void glGetMaterialiv (int face, int pname, IntBuffer params);
    public static native void glGetPixelMapfv (int map, FloatBuffer values);
    public static native void glGetPixelMapuiv (int map, IntBuffer values);
    public static native void glGetPixelMapusv (int map, ShortBuffer values);
    public static native void glGetPointerv (int pname, Buffer params);
    public static native void glGetPolygonStipple (ByteBuffer mask);
    public static native void glGetTexEnvfv (int target, int pname, FloatBuffer params);
    public static native void glGetTexEnviv (int target, int pname, IntBuffer params);
    public static native void glGetTexGendv (int coord, int pname, DoubleBuffer params);
    public static native void glGetTexGenfv (int coord, int pname, FloatBuffer params);
    public static native void glGetTexGeniv (int coord, int pname, IntBuffer params);
    public static native void glGetTexImage (int target, int level, int format, int type, Buffer pixels);
    public static native void glGetTexLevelParameterfv (int target, int level, int pname, FloatBuffer params);
    public static native void glGetTexLevelParameteriv (int target, int level, int pname, IntBuffer params);
    public static native void glIndexMask (int mask);
    public static native void glIndexPointer (int type, int stride, Buffer pointer);
    public static native void glIndexd (double c);
    public static native void glIndexdv (DoubleBuffer c);
    public static native void glIndexf (float c);
    public static native void glIndexfv (FloatBuffer c);
    public static native void glIndexi (int c);
    public static native void glIndexiv (IntBuffer c);
    public static native void glIndexs (short c);
    public static native void glIndexsv (ShortBuffer c);
    public static native void glIndexub (byte c);
    public static native void glIndexubv (ByteBuffer c);
    public static native void glInitNames ();
    public static native void interleavedArrays (int format, int stride, Buffer pointer);
    public static native boolean glIsList (int list);
    public static native void glLightModelf (int pname, float param);
    public static native void glLightModelfv (int pname, FloatBuffer params);
    public static native void glLightModeli (int pname, int param);
    public static native void glLightModeliv (int pname, IntBuffer params);
    public static native void glLightf (int light, int pname, float param);
    public static native void glLightfv (int light, int pname, FloatBuffer params);
    public static native void glLighti (int light, int pname, int param);
    public static native void glLightiv (int light, int pname, IntBuffer params);
    public static native void glLineStipple (int factor, short pattern);
    public static native void glListBase (int base);
    public static native void glLoadIdentity ();
    public static native void glLoadMatrixd (DoubleBuffer m);
    public static native void glLoadMatrixf (FloatBuffer m);
    public static native void glLoadName (int name);
    public static native void glLogicOp (int opcode);
    public static native void glMap1d (int target, double u1, double u2, int stride, int order, DoubleBuffer points);
    public static native void glMap1f (int target, float u1, float u2, int stride, int order, FloatBuffer points);
    public static native void glMap2d (int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points);
    public static native void glMap2f (int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points);
    public static native void glMapGrid1d (int un, double u1, double u2);
    public static native void glMapGrid1f (int un, float u1, float u2);
    public static native void glMapGrid2d (int un, double u1, double u2, int vn, double v1, double v2);
    public static native void glMapGrid2f (int un, float u1, float u2, int vn, float v1, float v2);
    public static native void glMaterialf (int face, int pname, float param);
    public static native void glMaterialfv (int face, int pname, FloatBuffer params);
    public static native void glMateriali (int face, int pname, int param);
    public static native void glMaterialiv (int face, int pname, IntBuffer params);
    public static native void glMatrixMode (int mode);
    public static native void glMultMatrixd (DoubleBuffer m);
    public static native void glMultMatrixf (FloatBuffer m);
    public static native void glNewList (int list, int mode);
    public static native void glNormal3b (byte nx, byte ny, byte nz);
    public static native void glNormal3bv (ByteBuffer v);
    public static native void glNormal3d (double nx, double ny, double nz);
    public static native void glNormal3dv (DoubleBuffer v);
    public static native void glNormal3f (float nx, float ny, float nz);
    public static native void glNormal3fv (FloatBuffer v);
    public static native void glNormal3i (int nx, int ny, int nz);
    public static native void glNormal3iv (IntBuffer v);
    public static native void glNormal3s (short nx, short ny, short nz);
    public static native void glNormal3sv (ShortBuffer v);
    public static native void glNormalPointer (int type, int stride, Buffer pointer);
    public static native void glOrtho (double left, double right, double bottom, double top, double zNear, double zFar);
    public static native void glPassThrough (float token);
    public static native void glPixelMapfv (int map, int mapsize, FloatBuffer values);
    public static native void glPixelMapuiv (int map, int mapsize, IntBuffer values);
    public static native void glPixelMapusv (int map, int mapsize, ShortBuffer values);
    public static native void glPixelStoref (int pname, float param);
    public static native void glPixelTransferf (int pname, float param);
    public static native void glPixelTransferi (int pname, int param);
    public static native void glPixelZoom (float xfactor, float yfactor);
    public static native void glPointSize (float size);
    public static native void glPolygonMode (int face, int mode);
    public static native void glPolygonStipple (ByteBuffer mask);
    public static native void glPopAttrib ();
    public static native void glPopClientAttrib ();
    public static native void glPopMatrix ();
    public static native void glPopName ();
    public static native void glPushAttrib (int mask);
    public static native void glPushClientAttrib (int mask);
    public static native void glPushMatrix ();
    public static native void glPushName (int name);
    public static native void glRasterPos2d (double x, double y);
    public static native void glRasterPos2dv (DoubleBuffer v);
    public static native void glRasterPos2f (float x, float y);
    public static native void glRasterPos2fv (FloatBuffer v);
    public static native void glRasterPos2i (int x, int y);
    public static native void glRasterPos2iv (IntBuffer v);
    public static native void glRasterPos2s (short x, short y);
    public static native void glRasterPos2sv (ShortBuffer v);
    public static native void glRasterPos3d (double x, double y, double z);
    public static native void glRasterPos3dv (DoubleBuffer v);
    public static native void glRasterPos3f (float x, float y, float z);
    public static native void glRasterPos3fv (FloatBuffer v);
    public static native void glRasterPos3i (int x, int y, int z);
    public static native void glRasterPos3iv (IntBuffer v);
    public static native void glRasterPos3s (short x, short y, short z);
    public static native void glRasterPos3sv (ShortBuffer v);
    public static native void glRasterPos4d (double x, double y, double z, double w);
    public static native void glRasterPos4dv (DoubleBuffer v);
    public static native void glRasterPos4f (float x, float y, float z, float w);
    public static native void glRasterPos4fv (FloatBuffer v);
    public static native void glRasterPos4i (int x, int y, int z, int w);
    public static native void glRasterPos4iv (IntBuffer v);
    public static native void glRasterPos4s (short x, short y, short z, short w);
    public static native void glRasterPos4sv (ShortBuffer v);
    public static native void glRectd (double x1, double y1, double x2, double y2);
    public static native void glRectdv (DoubleBuffer v1, DoubleBuffer v2);
    public static native void glRectf (float x1, float y1, float x2, float y2);
    public static native void glRectfv (FloatBuffer v1, FloatBuffer v2);
    public static native void glRecti (int x1, int y1, int x2, int y2);
    public static native void glRectiv (IntBuffer v1, IntBuffer v2);
    public static native void glRects (short x1, short y1, short x2, short y2);
    public static native void glRectsv (ShortBuffer v1, ShortBuffer v2);
    public static native int glRenderMode (int mode);
    public static native void glRotated (double angle, double x, double y, double z);
    public static native void glRotatef (float angle, float x, float y, float z);
    public static native void glScaled (double x, double y, double z);
    public static native void glScalef (float x, float y, float z);
    public static native void glSelectBuffer (int size, IntBuffer buffer);
    public static native void glShadeModel (int mode);
    public static native void glTexCoord1d (double s);
    public static native void glTexCoord1dv (DoubleBuffer v);
    public static native void glTexCoord1f (float s);
    public static native void glTexCoord1fv (FloatBuffer v);
    public static native void glTexCoord1i (int s);
    public static native void glTexCoord1iv (IntBuffer v);
    public static native void glTexCoord1s (short s);
    public static native void glTexCoord1sv (ShortBuffer v);
    public static native void glTexCoord2d (double s, double t);
    public static native void glTexCoord2dv (DoubleBuffer v);
    public static native void glTexCoord2f (float s, float t);
    public static native void glTexCoord2fv (FloatBuffer v);
    public static native void glTexCoord2i (int s, int t);
    public static native void glTexCoord2iv (IntBuffer v);
    public static native void glTexCoord2s (short s, short t);
    public static native void glTexCoord2sv (ShortBuffer v);
    public static native void glTexCoord3d (double s, double t, double r);
    public static native void glTexCoord3dv (DoubleBuffer v);
    public static native void glTexCoord3f (float s, float t, float r);
    public static native void glTexCoord3fv (FloatBuffer v);
    public static native void glTexCoord3i (int s, int t, int r);
    public static native void glTexCoord3iv (IntBuffer v);
    public static native void glTexCoord3s (short s, short t, short r);
    public static native void glTexCoord3sv (ShortBuffer v);
    public static native void glTexCoord4d (double s, double t, double r, double q);
    public static native void glTexCoord4dv (DoubleBuffer v);
    public static native void glTexCoord4f (float s, float t, float r, float q);
    public static native void glTexCoord4fv (FloatBuffer v);
    public static native void glTexCoord4i (int s, int t, int r, int q);
    public static native void glTexCoord4iv (IntBuffer v);
    public static native void glTexCoord4s (short s, short t, short r, short q);
    public static native void glTexCoord4sv (ShortBuffer v);
    public static native void glTexCoordPointer (int size, int type, int stride, Buffer pointer);
    public static native void glTexEnvf (int target, int pname, float param);
    public static native void glTexEnvfv (int target, int pname, FloatBuffer params);
    public static native void glTexEnvi (int target, int pname, int param);
    public static native void glTexEnviv (int target, int pname, IntBuffer params);
    public static native void glTexGend (int coord, int pname, double param);
    public static native void glTexGendv (int coord, int pname, DoubleBuffer params);
    public static native void glTexGenf (int coord, int pname, float param);
    public static native void glTexGenfv (int coord, int pname, FloatBuffer params);
    public static native void glTexGeni (int coord, int pname, int param);
    public static native void glTexGeniv (int coord, int pname, IntBuffer params);
    public static native void glTexImage1D (int target, int level, int internalformat, int width, int border, int format, int type, Buffer pixels);
    public static native void glTexSubImage1D (int target, int level, int xoffset, int width, int format, int type, Buffer pixels);
    public static native void glTranslated (double x, double y, double z);
    public static native void glTranslatef (float x, float y, float z);
    public static native void glVertex2d (double x, double y);
    public static native void glVertex2dv (DoubleBuffer v);
    public static native void glVertex2f (float x, float y);
    public static native void glVertex2fv (FloatBuffer v);
    public static native void glVertex2i (int x, int y);
    public static native void glVertex2iv (IntBuffer v);
    public static native void glVertex2s (short x, short y);
    public static native void glVertex2sv (ShortBuffer v);
    public static native void glVertex3d (double x, double y, double z);
    public static native void glVertex3dv (DoubleBuffer v);
    public static native void glVertex3f (float x, float y, float z);
    public static native void glVertex3fv (FloatBuffer v);
    public static native void glVertex3i (int x, int y, int z);
    public static native void glVertex3iv (IntBuffer v);
    public static native void glVertex3s (short x, short y, short z);
    public static native void glVertex3sv (ShortBuffer v);
    public static native void glVertex4d (double x, double y, double z, double w);
    public static native void glVertex4dv (DoubleBuffer v);
    public static native void glVertex4f (float x, float y, float z, float w);
    public static native void glVertex4fv (FloatBuffer v);
    public static native void glVertex4i (int x, int y, int z, int w);
    public static native void glVertex4iv (IntBuffer v);
    public static native void glVertex4s (short x, short y, short z, short w);
    public static native void glVertex4sv (ShortBuffer v);
    public static native void glVertexPointer (int size, int type, int stride, Buffer pointer);

    // OpenGL ES 2.0
    public static native void glActiveTexture (int texture);
    public static native void glAttachShader (int program, int shader);
    public static native void glBindAttribLocation (int program, int index, String name);
    public static native void glBindBuffer (int target, int buffer);
    public static native void glBindFramebuffer (int target, int framebuffer);
    public static native void glBindRenderbuffer (int target, int renderbuffer);
    public static native void glBindTexture (int target, int texture);
    public static native void glBlendColor (float red, float green, float blue, float alpha);
    public static native void glBlendEquation (int mode);
    public static native void glBlendEquationSeparate (int modeRGB, int modeAlpha);
    public static native void glBlendFunc (int sfactor, int dfactor);
    public static native void glBlendFuncSeparate (int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);
    public static native void glBufferData (int target, int size, Buffer data, int usage);
    public static native void glBufferSubData (int target, int offset, int size, Buffer data);
    public static native int glCheckFramebufferStatus (int target);
    public static native void glClear (int mask);
    public static native void glClearColor (float red, float green, float blue, float alpha);
    public static native void glClearDepthf (float d);
    public static native void glClearStencil (int s);
    public static native void glColorMask (boolean red, boolean green, boolean blue, boolean alpha);
    public static native void glCompileShader (int shader);
    public static native void glCompressedTexImage2D (int target, int level, int internalformat, int width, int height, int border, int imageSize, Buffer data);
    public static native void glCompressedTexSubImage2D (int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Buffer data);
    public static native void glCopyTexImage2D (int target, int level, int internalformat, int x, int y, int width, int height, int border);
    public static native void glCopyTexSubImage2D (int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);
    public static native int glCreateProgram ();
    public static native int glCreateShader (int type);
    public static native void glCullFace (int mode);
    public static native void glDeleteBuffers (int n, IntBuffer buffers);
    public static native void glDeleteFramebuffers (int n, IntBuffer framebuffers);
    public static native void glDeleteProgram (int program);
    public static native void glDeleteRenderbuffers (int n, IntBuffer renderbuffers);
    public static native void glDeleteShader (int shader);
    public static native void glDeleteTextures (int n, IntBuffer textures);
    public static native void glDepthFunc (int func);
    public static native void glDepthMask (boolean flag);
    public static native void glDepthRangef (float n, float f);
    public static native void glDetachShader (int program, int shader);
    public static native void glDisable (int cap);
    public static native void glDisableVertexAttribArray (int index);
    public static native void glDrawArrays (int mode, int first, int count);
    public static native void glDrawElements (int mode, int count, int type, Buffer indices);
    public static native void glEnable (int cap);
    public static native void glEnableVertexAttribArray (int index);
    public static native void glFinish ();
    public static native void glFlush ();
    public static native void glFramebufferRenderbuffer (int target, int attachment, int renderbuffertarget, int renderbuffer);
    public static native void glFramebufferTexture2D (int target, int attachment, int textarget, int texture, int level);
    public static native void glFrontFace (int mode);
    public static native void glGenBuffers (int n, IntBuffer buffers);
    public static native void glGenerateMipmap (int target);
    public static native void glGenFramebuffers (int n, IntBuffer framebuffers);
    public static native void glGenRenderbuffers (int n, IntBuffer renderbuffers);
    public static native void glGenTextures (int n, IntBuffer textures);
    public static native void glGetActiveAttrib (int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, String name);
    public static native void glGetActiveUniform (int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, String name);
    public static native void glGetAttachedShaders (int program, int maxCount, IntBuffer count, IntBuffer shaders);
    public static native int glGetAttribLocation (int program, String name);
    public static native void glGetBooleanv (int pname, IntBuffer data);
    public static native void glGetBufferParameteriv (int target, int pname, IntBuffer params);
    public static native int glGetError ();
    public static native void glGetFloatv (int pname, FloatBuffer data);
    public static native void glGetFramebufferAttachmentParameteriv (int target, int attachment, int pname, IntBuffer params);
    public static native void glGetIntegerv (int pname, IntBuffer data);
    public static native void glGetProgramiv (int program, int pname, IntBuffer params);
    public static native String glGetProgramInfoLog (int program);
    public static native void glGetRenderbufferParameteriv (int target, int pname, IntBuffer params);
    public static native void glGetShaderiv (int shader, int pname, IntBuffer params);
    public static native String glGetShaderInfoLog (int shader);
    public static native void glGetShaderPrecisionFormat (int shadertype, int precisiontype, IntBuffer range, IntBuffer precision);
    public static native void glGetShaderSource (int shader, int bufSize, IntBuffer length, String source);
    public static native String glGetString (int name);
    public static native void glGetTexParameterfv (int target, int pname, FloatBuffer params);
    public static native void glGetTexParameteriv (int target, int pname, IntBuffer params);
    public static native void glGetUniformfv (int program, int location, FloatBuffer params);
    public static native void glGetUniformiv (int program, int location, IntBuffer params);
    public static native int glGetUniformLocation (int program, String name);
    public static native void glGetVertexAttribfv (int index, int pname, FloatBuffer params);
    public static native void glGetVertexAttribiv (int index, int pname, IntBuffer params);
    // public static native void glGetVertexAttribPointerv (int index, int pname, void **pointer);
    public static native void glHint (int target, int mode);
    public static native boolean glIsBuffer (int buffer);
    public static native boolean glIsEnabled (int cap);
    public static native boolean glIsFramebuffer (int framebuffer);
    public static native boolean glIsProgram (int program);
    public static native boolean glIsRenderbuffer (int renderbuffer);
    public static native boolean glIsShader (int shader);
    public static native boolean glIsTexture (int texture);
    public static native void glLineWidth (float width);
    public static native void glLinkProgram (int program);
    public static native void glPixelStorei (int pname, int param);
    public static native void glPolygonOffset (float factor, float units);
    public static native void glReadPixels (int x, int y, int width, int height, int format, int type, Buffer pixels);
    public static native void glReleaseShaderCompiler ();
    public static native void glRenderbufferStorage (int target, int internalformat, int width, int height);
    public static native void glSampleCoverage (float value, boolean invert);
    public static native void glScissor (int x, int y, int width, int height);
    public static native void glShaderBinary (int count, IntBuffer shaders, int binaryformat, Buffer binary, int length);
    public static native void glShaderSource (int shader, int count, String[] string);
    public static native void glStencilFunc (int func, int ref, int mask);
    public static native void glStencilFuncSeparate (int face, int func, int ref, int mask);
    public static native void glStencilMask (int mask);
    public static native void glStencilMaskSeparate (int face, int mask);
    public static native void glStencilOp (int fail, int zfail, int zpass);
    public static native void glStencilOpSeparate (int face, int sfail, int dpfail, int dppass);
    public static native void glTexImage2D (int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels);
    public static native void glTexParameterf (int target, int pname, float param);
    public static native void glTexParameterfv (int target, int pname, FloatBuffer params);
    public static native void glTexParameteri (int target, int pname, int param);
    public static native void glTexParameteriv (int target, int pname, IntBuffer params);
    public static native void glTexSubImage2D (int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels);
    public static native void glUniform1f (int location, float v0);
    public static native void glUniform1fv (int location, int count, FloatBuffer value);
    public static native void glUniform1i (int location, int v0);
    public static native void glUniform1iv (int location, int count, IntBuffer value);
    public static native void glUniform2f (int location, float v0, float v1);
    public static native void glUniform2fv (int location, int count, FloatBuffer value);
    public static native void glUniform2i (int location, int v0, int v1);
    public static native void glUniform2iv (int location, int count, IntBuffer value);
    public static native void glUniform3f (int location, float v0, float v1, float v2);
    public static native void glUniform3fv (int location, int count, FloatBuffer value);
    public static native void glUniform3i (int location, int v0, int v1, int v2);
    public static native void glUniform3iv (int location, int count, IntBuffer value);
    public static native void glUniform4f (int location, float v0, float v1, float v2, float v3);
    public static native void glUniform4fv (int location, int count, FloatBuffer value);
    public static native void glUniform4i (int location, int v0, int v1, int v2, int v3);
    public static native void glUniform4iv (int location, int count, IntBuffer value);
    public static native void glUniformMatrix2fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix3fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix4fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUseProgram (int program);
    public static native void glValidateProgram (int program);
    public static native void glVertexAttrib1f (int index, float x);
    public static native void glVertexAttrib1fv (int index, FloatBuffer v);
    public static native void glVertexAttrib2f (int index, float x, float y);
    public static native void glVertexAttrib2fv (int index, FloatBuffer v);
    public static native void glVertexAttrib3f (int index, float x, float y, float z);
    public static native void glVertexAttrib3fv (int index, FloatBuffer v);
    public static native void glVertexAttrib4f (int index, float x, float y, float z, float w);
    public static native void glVertexAttrib4fv (int index, FloatBuffer v);
    public static native void glVertexAttribPointer (int index, int size, int type, boolean normalized, int stride, int offset);
    public static native void glViewport (int x, int y, int width, int height);


    // OpenGL ES 3.0
    public static native void glReadBuffer (int src);
    public static native void glDrawRangeElements (int mode, int start, int end, int count, int type, Buffer indices);
    public static native void glTexImage3D (int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Buffer pixels);
    public static native void glTexSubImage3D (int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Buffer pixels);
    public static native void glCopyTexSubImage3D (int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);
    public static native void glCompressedTexImage3D (int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, Buffer data);
    public static native void glCompressedTexSubImage3D (int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, Buffer data);
    public static native void glGenQueries (int n, IntBuffer ids);
    public static native void glDeleteQueries (int n, IntBuffer ids);
    public static native boolean glIsQuery (int id);
    public static native void glBeginQuery (int target, int id);
    public static native void glEndQuery (int target);
    public static native void glGetQueryiv (int target, int pname, IntBuffer params);
    public static native void glGetQueryObjectuiv (int id, int pname, IntBuffer params);
    public static native boolean glUnmapBuffer (int target);
    // public static native void glGetBufferPointerv (int target, int pname, void **params);
    public static native void glDrawBuffers (int n, IntBuffer bufs);
    public static native void glUniformMatrix2x3fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix3x2fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix2x4fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix4x2fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix3x4fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glUniformMatrix4x3fv (int location, int count, boolean transpose, FloatBuffer value);
    public static native void glBlitFramebuffer (int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);
    public static native void glRenderbufferStorageMultisample (int target, int samples, int internalformat, int width, int height);
    public static native void glFramebufferTextureLayer (int target, int attachment, int texture, int level, int layer);
    public static native void glMapBufferRange (int target, int offset, int length, int access);
    public static native void glFlushMappedBufferRange (int target, int offset, int length);
    public static native void glBindVertexArray (int array);
    public static native void glDeleteVertexArrays (int n, IntBuffer arrays);
    public static native void glGenVertexArrays (int n, IntBuffer arrays);
    public static native boolean glIsVertexArray (int array);
    public static native void glGetIntegeri_v (int target, int index, IntBuffer data);
    public static native void glBeginTransformFeedback (int primitiveMode);
    public static native void glEndTransformFeedback ();
    public static native void glBindBufferRange (int target, int index, int buffer, int offset, int size);
    public static native void glBindBufferBase (int target, int index, int buffer);
    // public static native void glTransformFeedbackVaryings (int program, int count, String const*varyings, int bufferMode);
    public static native void glGetTransformFeedbackVarying (int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, String name);
    public static native void glVertexAttribIPointer (int index, int size, int type, int stride, Buffer pointer);
    public static native void glGetVertexAttribIiv (int index, int pname, IntBuffer params);
    public static native void glGetVertexAttribIuiv (int index, int pname, IntBuffer params);
    public static native void glVertexAttribI4i (int index, int x, int y, int z, int w);
    public static native void glVertexAttribI4ui (int index, int x, int y, int z, int w);
    public static native void glVertexAttribI4iv (int index, IntBuffer v);
    public static native void glVertexAttribI4uiv (int index, IntBuffer v);
    public static native void glGetUniformuiv (int program, int location, IntBuffer params);
    public static native int glGetFragDataLocation (int program, String name);
    public static native void glUniform1ui (int location, int v0);
    public static native void glUniform2ui (int location, int v0, int v1);
    public static native void glUniform3ui (int location, int v0, int v1, int v2);
    public static native void glUniform4ui (int location, int v0, int v1, int v2, int v3);
    public static native void glUniform1uiv (int location, int count, IntBuffer value);
    public static native void glUniform2uiv (int location, int count, IntBuffer value);
    public static native void glUniform3uiv (int location, int count, IntBuffer value);
    public static native void glUniform4uiv (int location, int count, IntBuffer value);
    public static native void glClearBufferiv (int buffer, int drawbuffer, IntBuffer value);
    public static native void glClearBufferuiv (int buffer, int drawbuffer, IntBuffer value);
    public static native void glClearBufferfv (int buffer, int drawbuffer, FloatBuffer value);
    public static native void glClearBufferfi (int buffer, int drawbuffer, float depth, int stencil);
    public static native String glGetStringi (int name, int index);
    public static native void glCopyBufferSubData (int readTarget, int writeTarget, int readOffset, int writeOffset, int size);
    public static native void glGetUniformIndices (int program, int uniformCount, String[] uniformNames, IntBuffer uniformIndices);
    public static native void glGetActiveUniformsiv (int program, int uniformCount, IntBuffer uniformIndices, int pname, IntBuffer params);
    public static native int glGetUniformBlockIndex (int program, String uniformBlockName);
    public static native void glGetActiveUniformBlockiv (int program, int uniformBlockIndex, int pname, IntBuffer params);
    public static native void glGetActiveUniformBlockName (int program, int uniformBlockIndex, int bufSize, IntBuffer length, String uniformBlockName);
    public static native void glUniformBlockBinding (int program, int uniformBlockIndex, int uniformBlockBinding);
    public static native void glDrawArraysInstanced (int mode, int first, int count, int instancecount);
    public static native void glDrawElementsInstanced (int mode, int count, int type, Buffer indices, int instancecount);
    public static native int glFenceSync (int condition, int flags);
    public static native boolean glIsSync (int sync);
    public static native void glDeleteSync (int sync);
    public static native int glClientWaitSync (int sync, int flags, long timeout);
    public static native void glWaitSync (int sync, int flags, long timeout);
    public static native void glGetInteger64v (int pname, LongBuffer data);
    public static native void glGetSynciv (int sync, int pname, int bufSize, IntBuffer length, IntBuffer values);
    public static native void glGetInteger64i_v (int target, int index, LongBuffer data);
    public static native void glGetBufferParameteri64v (int target, int pname, LongBuffer params);
    public static native void glGenSamplers (int count, IntBuffer samplers);
    public static native void glDeleteSamplers (int count, IntBuffer samplers);
    public static native boolean glIsSampler (int sampler);
    public static native void glBindSampler (int unit, int sampler);
    public static native void glSamplerParameteri (int sampler, int pname, int param);
    public static native void glSamplerParameteriv (int sampler, int pname, IntBuffer param);
    public static native void glSamplerParameterf (int sampler, int pname, float param);
    public static native void glSamplerParameterfv (int sampler, int pname, FloatBuffer param);
    public static native void glGetSamplerParameteriv (int sampler, int pname, IntBuffer params);
    public static native void glGetSamplerParameterfv (int sampler, int pname, FloatBuffer params);
    public static native void glVertexAttribDivisor (int index, int divisor);
    public static native void glBindTransformFeedback (int target, int id);
    public static native void glDeleteTransformFeedbacks (int n, IntBuffer ids);
    public static native void glGenTransformFeedbacks (int n, IntBuffer ids);
    public static native boolean glIsTransformFeedback (int id);
    public static native void glPauseTransformFeedback ();
    public static native void glResumeTransformFeedback ();
    public static native void glGetProgramBinary (int program, int bufSize, IntBuffer length, IntBuffer binaryFormat, Buffer binary);
    public static native void glProgramBinary (int program, int binaryFormat, Buffer binary, int length);
    public static native void glProgramParameteri (int program, int pname, int value);
    public static native void glInvalidateFramebuffer (int target, int numAttachments, IntBuffer attachments);
    public static native void glInvalidateSubFramebuffer (int target, int numAttachments, IntBuffer attachments, int x, int y, int width, int height);
    public static native void glTexStorage2D (int target, int levels, int internalformat, int width, int height);
    public static native void glTexStorage3D (int target, int levels, int internalformat, int width, int height, int depth);
    public static native void glGetInternalformativ (int target, int internalformat, int pname, int bufSize, IntBuffer params);
	

    
}
