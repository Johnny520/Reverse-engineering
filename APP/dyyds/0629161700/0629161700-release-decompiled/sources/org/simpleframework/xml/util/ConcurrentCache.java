package org.simpleframework.xml.util;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ConcurrentCache<T> extends java.util.concurrent.ConcurrentHashMap<java.lang.Object, T> implements org.simpleframework.xml.util.Cache<T> {
    public ConcurrentCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(java.lang.Object r1, T r2) {
            r0 = this;
            r0.put(r1, r2)
            return
    }

    @Override // java.util.concurrent.ConcurrentHashMap, org.simpleframework.xml.util.Cache
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }
}
