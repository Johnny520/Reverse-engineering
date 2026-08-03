package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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
