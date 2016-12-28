LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := Tool
LOCAL_SRC_FILES := Tool.c
include $(BUILD_SHARED_LIBRARY)
