package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
