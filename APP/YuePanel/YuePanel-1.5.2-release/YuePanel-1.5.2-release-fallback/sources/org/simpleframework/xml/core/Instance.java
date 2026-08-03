package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Instance {
    java.lang.Object getInstance() throws java.lang.Exception;

    java.lang.Class getType();

    boolean isReference();

    java.lang.Object setInstance(java.lang.Object r1) throws java.lang.Exception;
}
