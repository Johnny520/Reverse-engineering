package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public interface Transform<T> {
    T read(java.lang.String r1) throws java.lang.Exception;

    java.lang.String write(T r1) throws java.lang.Exception;
}
