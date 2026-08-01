package com.alibaba.fastjson2.modules;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectWriterAnnotationProcessor {
    default void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Method method) {
    }

    default void getBeanInfo(BeanInfo beanInfo, Class cls) {
    }

    default void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Field field) {
    }
}
