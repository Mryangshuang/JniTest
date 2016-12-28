package com.itheima.administrator.jnitest;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
public class JniTest {
    static{
        System.loadLibrary("Tool");
    }
    public native String showWords(   );
}
