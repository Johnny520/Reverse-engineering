package org.simpleframework.xml.util;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry<java.lang.Object, T> r1) {
            r0 = this;
            int r1 = r0.size()
            int r0 = r0.capacity
            if (r1 <= r0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }
}
