#include <stdio.h>
#include<stdlib.h>
#include<jni.h>
jstring Java_com_itheima_administrator_jnitest_JniTest( JNIEnv* env,jobject thiz ){
    return (*env)->NewStringUTF(env, "Hello from JNI !  Compiled with ABI " ABI ".");
}