package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final java.util.LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int r5) {
            r4 = this;
            r4.<init>()
            if (r5 <= 0) goto L13
            r4.maxSize = r5
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            r4.map = r0
            return
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxSize <= 0"
            r0.<init>(r1)
            throw r0
    }

    private int safeSizeOf(K r5, V r6) {
            r4 = this;
            int r0 = r4.sizeOf(r5, r6)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Negative size: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    protected V create(K r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public final synchronized int createCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.createCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    protected void entryRemoved(boolean r1, K r2, V r3, V r4) {
            r0 = this;
            return
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final synchronized int evictionCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.evictionCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final V get(K r5) {
            r4 = this;
            if (r5 == 0) goto L55
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L13
            int r1 = r4.hitCount     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + 1
            r4.hitCount = r1     // Catch: java.lang.Throwable -> L52
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            return r0
        L13:
            int r1 = r4.missCount     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + 1
            r4.missCount = r1     // Catch: java.lang.Throwable -> L52
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r4.create(r5)
            if (r1 != 0) goto L22
            r2 = 0
            return r2
        L22:
            monitor-enter(r4)
            int r2 = r4.createCount     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + 1
            r4.createCount = r2     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.put(r5, r1)     // Catch: java.lang.Throwable -> L4f
            r0 = r2
            if (r0 == 0) goto L38
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch: java.lang.Throwable -> L4f
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L4f
            goto L41
        L38:
            int r2 = r4.size     // Catch: java.lang.Throwable -> L4f
            int r3 = r4.safeSizeOf(r5, r1)     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + r3
            r4.size = r2     // Catch: java.lang.Throwable -> L4f
        L41:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L49
            r2 = 0
            r4.entryRemoved(r2, r5, r1, r0)
            return r0
        L49:
            int r2 = r4.maxSize
            r4.trimToSize(r2)
            return r1
        L4f:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r2
        L52:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            throw r0
        L55:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int maxSize() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int missCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.missCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final V put(K r4, V r5) {
            r3 = this;
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            monitor-enter(r3)
            int r0 = r3.putCount     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            r3.putCount = r0     // Catch: java.lang.Throwable -> L32
            int r0 = r3.size     // Catch: java.lang.Throwable -> L32
            int r1 = r3.safeSizeOf(r4, r5)     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + r1
            r3.size = r0     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.put(r4, r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L25
            int r1 = r3.size     // Catch: java.lang.Throwable -> L32
            int r2 = r3.safeSizeOf(r4, r0)     // Catch: java.lang.Throwable -> L32
            int r1 = r1 - r2
            r3.size = r1     // Catch: java.lang.Throwable -> L32
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
            r1 = 0
            r3.entryRemoved(r1, r4, r0, r5)
        L2c:
            int r1 = r3.maxSize
            r3.trimToSize(r1)
            return r0
        L32:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null || value == null"
            r0.<init>(r1)
            throw r0
    }

    public final synchronized int putCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.putCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final V remove(K r4) {
            r3 = this;
            if (r4 == 0) goto L20
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.remove(r4)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L14
            int r1 = r3.size     // Catch: java.lang.Throwable -> L1d
            int r2 = r3.safeSizeOf(r4, r0)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 - r2
            r3.size = r1     // Catch: java.lang.Throwable -> L1d
        L14:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r1 = 0
            r2 = 0
            r3.entryRemoved(r1, r4, r0, r2)
        L1c:
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
    }

    public void resize(int r3) {
            r2 = this;
            if (r3 <= 0) goto Ld
            monitor-enter(r2)
            r2.maxSize = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            r2.trimToSize(r3)
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxSize <= 0"
            r0.<init>(r1)
            throw r0
    }

    public final synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    protected int sizeOf(K r2, V r3) {
            r1 = this;
            r0 = 1
            return r0
    }

    public final synchronized java.util.Map<K, V> snapshot() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap<K, V> r1 = r2.map     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public final synchronized java.lang.String toString() {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.hitCount     // Catch: java.lang.Throwable -> L33
            int r1 = r8.missCount     // Catch: java.lang.Throwable -> L33
            int r0 = r0 + r1
            if (r0 == 0) goto Le
            int r1 = r8.hitCount     // Catch: java.lang.Throwable -> L33
            int r1 = r1 * 100
            int r1 = r1 / r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            int r4 = r8.maxSize     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            int r5 = r8.hitCount     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L33
            int r6 = r8.missCount     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = java.lang.String.format(r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r8)
            return r2
        L33:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public void trimToSize(int r6) {
            r5 = this;
        L1:
            monitor-enter(r5)
            int r0 = r5.size     // Catch: java.lang.Throwable -> L74
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L12
            int r0 = r5.size     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L53
        L12:
            int r0 = r5.size     // Catch: java.lang.Throwable -> L74
            if (r0 <= r6) goto L51
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L1f
            goto L51
        L1f:
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L74
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L74
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L74
            r3.remove(r1)     // Catch: java.lang.Throwable -> L74
            int r3 = r5.size     // Catch: java.lang.Throwable -> L74
            int r4 = r5.safeSizeOf(r1, r2)     // Catch: java.lang.Throwable -> L74
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L74
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L74
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L74
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r5.entryRemoved(r4, r1, r2, r0)
            goto L1
        L51:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            return
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r0
    }
}
