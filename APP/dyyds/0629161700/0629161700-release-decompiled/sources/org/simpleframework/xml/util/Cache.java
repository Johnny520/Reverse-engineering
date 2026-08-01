package org.simpleframework.xml.util;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface Cache<T> {
    void cache(java.lang.Object r1, T r2);

    boolean contains(java.lang.Object r1);

    T fetch(java.lang.Object r1);

    boolean isEmpty();

    T take(java.lang.Object r1);
}
