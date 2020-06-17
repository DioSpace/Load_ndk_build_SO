package com.my.ndkdynamicdemo.util;

public class MyUtil {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("dynamic_test_lib");
    }

    //动态注册
    public native String getHello();

    //动态注册
    public native int meaningOfTheUniverse();

}
