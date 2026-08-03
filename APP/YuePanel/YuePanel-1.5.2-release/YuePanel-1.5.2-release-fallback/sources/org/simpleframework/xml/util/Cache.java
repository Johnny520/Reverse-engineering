package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes2.dex */
public interface Cache<T> {
    void cache(java.lang.Object r1, T r2);

    boolean contains(java.lang.Object r1);

    T fetch(java.lang.Object r1);

    boolean isEmpty();

    T take(java.lang.Object r1);
}
