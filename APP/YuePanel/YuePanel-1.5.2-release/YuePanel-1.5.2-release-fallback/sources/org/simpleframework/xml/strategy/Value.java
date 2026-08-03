package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public interface Value {
    int getLength();

    java.lang.Class getType();

    java.lang.Object getValue();

    boolean isReference();

    void setValue(java.lang.Object r1);
}
