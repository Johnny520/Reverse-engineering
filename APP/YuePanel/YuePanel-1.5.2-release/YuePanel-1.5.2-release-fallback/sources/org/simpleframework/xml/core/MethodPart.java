package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface MethodPart {
    java.lang.annotation.Annotation getAnnotation();

    <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r1);

    java.lang.Class getDeclaringClass();

    java.lang.Class getDependent();

    java.lang.Class[] getDependents();

    java.lang.reflect.Method getMethod();

    org.simpleframework.xml.core.MethodType getMethodType();

    java.lang.String getName();

    java.lang.Class getType();

    java.lang.String toString();
}
