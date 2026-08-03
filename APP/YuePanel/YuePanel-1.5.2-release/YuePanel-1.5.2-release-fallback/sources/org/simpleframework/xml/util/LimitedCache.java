package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes2.dex */
public class LimitedCache<T> extends java.util.LinkedHashMap<java.lang.Object, T> implements org.simpleframework.xml.util.Cache<T> {
    private final int capacity;

    public LimitedCache() {
            r1 = this;
            r0 = 50000(0xc350, float:7.0065E-41)
            r1.<init>(r0)
            return
    }

    public LimitedCache(int r1) {
            r0 = this;
            r0.<init>()
            r0.capacity = r1
            return
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(java.lang.Object r1, T r2) {
            r0 = this;
            r0.put(r1, r2)
            return
    }

    @Override // org.simpleframework.xml.util.Cache
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

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry<java.lang.Object, T> r2) {
            r1 = this;
            int r2 = r1.size()
            int r0 = r1.capacity
            if (r2 <= r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.remove(r1)
            return r1
    }
}
