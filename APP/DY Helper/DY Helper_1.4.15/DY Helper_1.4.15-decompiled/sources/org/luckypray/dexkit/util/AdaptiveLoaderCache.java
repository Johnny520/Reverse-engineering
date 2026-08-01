package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AdaptiveLoaderCache<K, V> {
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock;
    private java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V>>> multi;
    private java.lang.ref.WeakReference<java.lang.ClassLoader> singleLoaderRef;
    private java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V>> singleMap;
    private final boolean weakValue;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public interface Ref<V> {
        V get();
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class StrongRef<V> implements org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> {

        /* JADX INFO: renamed from: v */
        private final V f8192v;

        public StrongRef(V r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.f8192v = r1
                return
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        public V get() {
                r0 = this;
                V r0 = r0.f8192v
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class WeakRef<V> implements org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> {
        private final java.lang.ref.WeakReference<V> ref;

        public WeakRef(V r2) {
                r1 = this;
                r2.getClass()
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.ref = r0
                return
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        public V get() {
                r0 = this;
                java.lang.ref.WeakReference<V> r0 = r0.ref
                java.lang.Object r0 = r0.get()
                return r0
        }
    }

    public AdaptiveLoaderCache() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public AdaptiveLoaderCache(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.weakValue = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            r0.lock = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.singleMap = r1
            return
    }

    public /* synthetic */ AdaptiveLoaderCache(boolean r1, int r2, p000.AbstractC1067zq r3) {
            r0 = this;
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = r3
        L5:
            r0.<init>(r1)
            return
    }

    private final org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> wrap(V r1) {
            r0 = this;
            boolean r0 = r0.weakValue
            if (r0 == 0) goto La
            org.luckypray.dexkit.util.AdaptiveLoaderCache$WeakRef r0 = new org.luckypray.dexkit.util.AdaptiveLoaderCache$WeakRef
            r0.<init>(r1)
            return r0
        La:
            org.luckypray.dexkit.util.AdaptiveLoaderCache$StrongRef r0 = new org.luckypray.dexkit.util.AdaptiveLoaderCache$StrongRef
            r0.<init>(r1)
            return r0
    }

    public final void clear() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.getClass()
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r2.multi     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r1.clear()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L24
        L16:
            r1 = 0
            r2.multi = r1     // Catch: java.lang.Throwable -> L14
            r2.singleLoaderRef = r1     // Catch: java.lang.Throwable -> L14
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r2 = r2.singleMap     // Catch: java.lang.Throwable -> L14
            r2.clear()     // Catch: java.lang.Throwable -> L14
            r0.unlock()
            return
        L24:
            r0.unlock()
            throw r2
    }

    public final void clear(java.lang.ClassLoader r5) {
            r4 = this;
            r5.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.getClass()
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r4.multi     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L1a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L43
        L1c:
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r4.multi     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            r3 = 1
            if (r1 != r3) goto L2a
            r4.multi = r2     // Catch: java.lang.Throwable -> L1a
        L2a:
            java.lang.ref.WeakReference<java.lang.ClassLoader> r1 = r4.singleLoaderRef     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L35
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1a
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L1a
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 != r5) goto L3f
            r4.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L1a
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r4 = r4.singleMap     // Catch: java.lang.Throwable -> L1a
            r4.clear()     // Catch: java.lang.Throwable -> L1a
        L3f:
            r0.unlock()
            return
        L43:
            r0.unlock()
            throw r4
    }

    public final V get(java.lang.ClassLoader r6, K r7, p000.p70 r8) {
            r5 = this;
            r6.getClass()
            r7.getClass()
            r8.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.getClass()
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r5.multi     // Catch: java.lang.Throwable -> L25
            r2 = 0
            if (r1 != 0) goto L40
            java.lang.ref.WeakReference<java.lang.ClassLoader> r1 = r5.singleLoaderRef     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L28
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r5 = move-exception
            goto Le4
        L28:
            r1 = r2
        L29:
            if (r1 != r6) goto L5b
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r1 = r5.singleMap     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L25
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r1 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r1     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L36
            goto L5b
        L36:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L5b
            r0.unlock()
            return r1
        L40:
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L25
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L25
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r1 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r1     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L51
            goto L5b
        L51:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L5b
            r0.unlock()
            return r1
        L5b:
            r0.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.getClass()
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r5.multi     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto Laa
            java.lang.ref.WeakReference<java.lang.ClassLoader> r3 = r5.singleLoaderRef     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L79
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r5 = move-exception
            goto Le0
        L7b:
            r3 = r2
        L7c:
            if (r3 != 0) goto L8b
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L79
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L79
            r5.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L79
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r2 = r5.singleMap     // Catch: java.lang.Throwable -> L79
            r2.clear()     // Catch: java.lang.Throwable -> L79
            goto Laa
        L8b:
            if (r3 == r6) goto Laa
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r4 = r5.singleMap     // Catch: java.lang.Throwable -> L79
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L79
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L79
            r5.multi = r1     // Catch: java.lang.Throwable -> L79
            r5.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L79
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            r5.singleMap = r2     // Catch: java.lang.Throwable -> L79
        Laa:
            if (r1 == 0) goto Lbd
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto Lba
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L79
        Lba:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L79
            goto Lbf
        Lbd:
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r2 = r5.singleMap     // Catch: java.lang.Throwable -> L79
        Lbf:
            java.lang.Object r6 = r2.get(r7)     // Catch: java.lang.Throwable -> L79
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r6 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r6     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto Ld1
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto Ld1
            r0.unlock()
            return r6
        Ld1:
            java.lang.Object r6 = r8.invoke()     // Catch: java.lang.Throwable -> L79
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r5 = r5.wrap(r6)     // Catch: java.lang.Throwable -> L79
            r2.put(r7, r5)     // Catch: java.lang.Throwable -> L79
            r0.unlock()
            return r6
        Le0:
            r0.unlock()
            throw r5
        Le4:
            r0.unlock()
            throw r5
    }
}
