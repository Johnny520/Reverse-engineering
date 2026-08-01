package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Contact extends org.simpleframework.xml.strategy.Type {
    java.lang.Object get(java.lang.Object r1);

    java.lang.annotation.Annotation getAnnotation();

    java.lang.Class getDeclaringClass();

    java.lang.Class getDependent();

    java.lang.Class[] getDependents();

    java.lang.String getName();

    boolean isReadOnly();

    void set(java.lang.Object r1, java.lang.Object r2);

    @Override // org.simpleframework.xml.strategy.Type
    java.lang.String toString();
}
