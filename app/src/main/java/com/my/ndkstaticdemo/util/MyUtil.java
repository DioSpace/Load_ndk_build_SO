package com.my.ndkstaticdemo.util;

public class MyUtil {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("static_test_lib");
    }

    public native String stringFromJNI2();

    public native String handleString(String str);

}
