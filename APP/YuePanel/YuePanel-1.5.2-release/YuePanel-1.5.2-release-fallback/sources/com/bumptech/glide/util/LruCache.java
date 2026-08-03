package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public class LruCache<T, Y> {
    private final java.util.Map<T, com.bumptech.glide.util.LruCache.Entry<Y>> cache;
    private long currentSize;
    private final long initialMaxSize;
    private long maxSize;

    public static final class Entry<Y> {
        final int size;
        final Y value;

        public Entry(Y r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.size = r2
                return
        }
    }

    public LruCache(long r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 100
            r0.<init>(r3, r1, r2)
            r4.cache = r0
            r4.initialMaxSize = r5
            r4.maxSize = r5
            return
    }

    private void evict() {
            r2 = this;
            long r0 = r2.maxSize
            r2.trimToSize(r0)
            return
    }

    public void clearMemory() {
            r2 = this;
            r0 = 0
            r2.trimToSize(r0)
            return
    }

    public synchronized boolean contains(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r1.cache     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Yue.InterfaceC4544
    public synchronized Y get(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r1.cache     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.util.LruCache$Entry r2 = (com.bumptech.glide.util.LruCache.Entry) r2     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            Y r2 = r2.value     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r2 = move-exception
            goto L13
        L10:
            r2 = 0
        L11:
            monitor-exit(r1)
            return r2
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized int getCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r1.cache     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized long getCurrentSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.currentSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public int getSize(@Yue.InterfaceC4544 Y r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void onItemEvicted(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4544 Y r2) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    public synchronized Y put(@Yue.InterfaceC4410 T r8, @Yue.InterfaceC4544 Y r9) {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.getSize(r9)     // Catch: java.lang.Throwable -> L12
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L12
            long r3 = r7.maxSize     // Catch: java.lang.Throwable -> L12
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L14
            r7.onItemEvicted(r8, r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r4
        L12:
            r8 = move-exception
            goto L4c
        L14:
            if (r9 == 0) goto L1b
            long r5 = r7.currentSize     // Catch: java.lang.Throwable -> L12
            long r5 = r5 + r1
            r7.currentSize = r5     // Catch: java.lang.Throwable -> L12
        L1b:
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r1 = r7.cache     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L21
            r2 = r4
            goto L26
        L21:
            com.bumptech.glide.util.LruCache$Entry r2 = new com.bumptech.glide.util.LruCache$Entry     // Catch: java.lang.Throwable -> L12
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L12
        L26:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch: java.lang.Throwable -> L12
            com.bumptech.glide.util.LruCache$Entry r0 = (com.bumptech.glide.util.LruCache.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L43
            long r1 = r7.currentSize     // Catch: java.lang.Throwable -> L12
            int r3 = r0.size     // Catch: java.lang.Throwable -> L12
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L12
            long r1 = r1 - r5
            r7.currentSize = r1     // Catch: java.lang.Throwable -> L12
            Y r1 = r0.value     // Catch: java.lang.Throwable -> L12
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L43
            Y r9 = r0.value     // Catch: java.lang.Throwable -> L12
            r7.onItemEvicted(r8, r9)     // Catch: java.lang.Throwable -> L12
        L43:
            r7.evict()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4a
            Y r4 = r0.value     // Catch: java.lang.Throwable -> L12
        L4a:
            monitor-exit(r7)
            return r4
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r8
    }

    @Yue.InterfaceC4544
    public synchronized Y remove(@Yue.InterfaceC4410 T r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r4.cache     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r0.remove(r5)     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.util.LruCache$Entry r5 = (com.bumptech.glide.util.LruCache.Entry) r5     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto Le
            monitor-exit(r4)
            r5 = 0
            return r5
        Le:
            long r0 = r4.currentSize     // Catch: java.lang.Throwable -> L1a
            int r2 = r5.size     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            long r0 = r0 - r2
            r4.currentSize = r0     // Catch: java.lang.Throwable -> L1a
            Y r5 = r5.value     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5
    }

    public synchronized void setSizeMultiplier(float r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L18
            long r0 = r2.initialMaxSize     // Catch: java.lang.Throwable -> L16
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L16
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L16
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L16
            r2.maxSize = r0     // Catch: java.lang.Throwable -> L16
            r2.evict()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            goto L20
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "Multiplier must be >= 0"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public synchronized void trimToSize(long r8) {
            r7 = this;
            monitor-enter(r7)
        L1:
            long r0 = r7.currentSize     // Catch: java.lang.Throwable -> L32
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L34
            java.util.Map<T, com.bumptech.glide.util.LruCache$Entry<Y>> r0 = r7.cache     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            com.bumptech.glide.util.LruCache$Entry r2 = (com.bumptech.glide.util.LruCache.Entry) r2     // Catch: java.lang.Throwable -> L32
            long r3 = r7.currentSize     // Catch: java.lang.Throwable -> L32
            int r5 = r2.size     // Catch: java.lang.Throwable -> L32
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L32
            long r3 = r3 - r5
            r7.currentSize = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L32
            r0.remove()     // Catch: java.lang.Throwable -> L32
            Y r0 = r2.value     // Catch: java.lang.Throwable -> L32
            r7.onItemEvicted(r1, r0)     // Catch: java.lang.Throwable -> L32
            goto L1
        L32:
            r8 = move-exception
            goto L36
        L34:
            monitor-exit(r7)
            return
        L36:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L32
            throw r8
    }
}
