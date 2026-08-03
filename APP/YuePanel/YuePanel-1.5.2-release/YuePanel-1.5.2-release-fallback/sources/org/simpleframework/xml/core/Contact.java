package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Contact extends org.simpleframework.xml.strategy.Type {
    java.lang.Object get(java.lang.Object r1) throws java.lang.Exception;

    java.lang.annotation.Annotation getAnnotation();

    java.lang.Class getDeclaringClass();

    java.lang.Class getDependent();

    java.lang.Class[] getDependents();

    java.lang.String getName();

    boolean isReadOnly();

    void set(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception;

    @Override // org.simpleframework.xml.strategy.Type
    java.lang.String toString();
}
