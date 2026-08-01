package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Parameter {
    java.lang.annotation.Annotation getAnnotation();

    org.simpleframework.xml.core.Expression getExpression();

    int getIndex();

    java.lang.Object getKey();

    java.lang.String getName();

    java.lang.String getPath();

    java.lang.Class getType();

    boolean isAttribute();

    boolean isPrimitive();

    boolean isRequired();

    boolean isText();

    java.lang.String toString();
}
