package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes2.dex */
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
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.remove(r1)
            return r1
    }
}
