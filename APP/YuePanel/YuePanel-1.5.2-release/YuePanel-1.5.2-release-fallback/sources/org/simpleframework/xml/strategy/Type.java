package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public interface Type {
    <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r1);

    java.lang.Class getType();

    java.lang.String toString();
}
