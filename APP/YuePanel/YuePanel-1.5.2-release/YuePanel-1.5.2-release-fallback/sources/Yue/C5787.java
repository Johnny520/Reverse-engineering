package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5787<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";

    @Yue.InterfaceC4544
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;

    @Yue.InterfaceC4544
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    int[] mHashes;
    int mSize;

    public C5787() {
            r1 = this;
            r1.<init>()
            int[] r0 = Yue.C1537.f4954
            r1.mHashes = r0
            java.lang.Object[] r0 = Yue.C1537.f4956
            r1.mArray = r0
            r0 = 0
            r1.mSize = r0
            return
    }

    public C5787(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = Yue.C1537.f4954
            r0.mHashes = r1
            java.lang.Object[] r1 = Yue.C1537.f4956
            r0.mArray = r1
            goto L11
        Le:
            r0.m21623(r1)
        L11:
            r1 = 0
            r0.mSize = r1
            return
    }

    public C5787(Yue.C5787<K, V> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.putAll(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m21621(int[] r0, int r1, int r2) {
            int r0 = Yue.C1537.m7665(r0, r1, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r0
        L5:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m21622(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2f
            java.lang.Class<Yue.ۥۢ۟ۡ> r0 = Yue.C5787.class
            monitor-enter(r0)
            int r1 = Yue.C5787.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L22
            if (r1 >= r5) goto L2b
            java.lang.Object[] r1 = Yue.C5787.mTwiceBaseCache     // Catch: java.lang.Throwable -> L22
            r8[r4] = r1     // Catch: java.lang.Throwable -> L22
            r8[r6] = r7     // Catch: java.lang.Throwable -> L22
            int r7 = r9 << 1
            int r7 = r7 - r6
        L1b:
            if (r7 < r3) goto L24
            r8[r7] = r2     // Catch: java.lang.Throwable -> L22
            int r7 = r7 + (-1)
            goto L1b
        L22:
            r7 = move-exception
            goto L2d
        L24:
            Yue.C5787.mTwiceBaseCache = r8     // Catch: java.lang.Throwable -> L22
            int r7 = Yue.C5787.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L22
            int r7 = r7 + r6
            Yue.C5787.mTwiceBaseCacheSize = r7     // Catch: java.lang.Throwable -> L22
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L57
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r7
        L2f:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L57
            java.lang.Class<Yue.ۥۢ۟ۡ> r0 = Yue.C5787.class
            monitor-enter(r0)
            int r1 = Yue.C5787.mBaseCacheSize     // Catch: java.lang.Throwable -> L4a
            if (r1 >= r5) goto L53
            java.lang.Object[] r1 = Yue.C5787.mBaseCache     // Catch: java.lang.Throwable -> L4a
            r8[r4] = r1     // Catch: java.lang.Throwable -> L4a
            r8[r6] = r7     // Catch: java.lang.Throwable -> L4a
            int r7 = r9 << 1
            int r7 = r7 - r6
        L43:
            if (r7 < r3) goto L4c
            r8[r7] = r2     // Catch: java.lang.Throwable -> L4a
            int r7 = r7 + (-1)
            goto L43
        L4a:
            r7 = move-exception
            goto L55
        L4c:
            Yue.C5787.mBaseCache = r8     // Catch: java.lang.Throwable -> L4a
            int r7 = Yue.C5787.mBaseCacheSize     // Catch: java.lang.Throwable -> L4a
            int r7 = r7 + r6
            Yue.C5787.mBaseCacheSize = r7     // Catch: java.lang.Throwable -> L4a
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            goto L57
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r7
        L57:
            return
    }

    public void clear() {
            r4 = this;
            int r0 = r4.mSize
            if (r0 <= 0) goto L16
            int[] r1 = r4.mHashes
            java.lang.Object[] r2 = r4.mArray
            int[] r3 = Yue.C1537.f4954
            r4.mHashes = r3
            java.lang.Object[] r3 = Yue.C1537.f4956
            r4.mArray = r3
            r3 = 0
            r4.mSize = r3
            m21622(r1, r2, r0)
        L16:
            int r0 = r4.mSize
            if (r0 > 0) goto L1b
            return
        L1b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOfValue(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public void ensureCapacity(int r6) {
            r5 = this;
            int r0 = r5.mSize
            int[] r1 = r5.mHashes
            int r2 = r1.length
            if (r2 >= r6) goto L20
            java.lang.Object[] r2 = r5.mArray
            r5.m21623(r6)
            int r6 = r5.mSize
            if (r6 <= 0) goto L1d
            int[] r6 = r5.mHashes
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            java.lang.Object[] r6 = r5.mArray
            int r4 = r0 << 1
            java.lang.System.arraycopy(r2, r3, r6, r3, r4)
        L1d:
            m21622(r1, r2, r0)
        L20:
            int r6 = r5.mSize
            if (r6 != r0) goto L25
            return
        L25:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof Yue.C5787
            r2 = 0
            if (r1 == 0) goto L3e
            Yue.ۥۢ۟ۡ r7 = (Yue.C5787) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L16
            return r2
        L16:
            r1 = r2
        L17:
            int r3 = r6.mSize     // Catch: java.lang.Throwable -> L3d
            if (r1 >= r3) goto L3c
            java.lang.Object r3 = r6.keyAt(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L32
            if (r5 != 0) goto L31
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L39
        L31:
            return r2
        L32:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L39
            return r2
        L39:
            int r1 = r1 + 1
            goto L17
        L3c:
            return r0
        L3d:
            return r2
        L3e:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L76
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L4f
            return r2
        L4f:
            r1 = r2
        L50:
            int r3 = r6.mSize     // Catch: java.lang.Throwable -> L76
            if (r1 >= r3) goto L75
            java.lang.Object r3 = r6.keyAt(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L6b
            if (r5 != 0) goto L6a
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L72
        L6a:
            return r2
        L6b:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L72
            return r2
        L72:
            int r1 = r1 + 1
            goto L50
        L75:
            return r0
        L76:
            return r2
    }

    @Yue.InterfaceC4544
    public V get(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r0)
            return r2
    }

    public V getOrDefault(java.lang.Object r1, V r2) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Le
            java.lang.Object[] r2 = r0.mArray
            int r1 = r1 << 1
            int r1 = r1 + 1
            r2 = r2[r1]
        Le:
            return r2
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.mHashes
            java.lang.Object[] r1 = r9.mArray
            int r2 = r9.mSize
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
        La:
            if (r5 >= r2) goto L1f
            r7 = r1[r4]
            r8 = r0[r5]
            if (r7 != 0) goto L14
            r7 = r3
            goto L18
        L14:
            int r7 = r7.hashCode()
        L18:
            r7 = r7 ^ r8
            int r6 = r6 + r7
            int r5 = r5 + 1
            int r4 = r4 + 2
            goto La
        L1f:
            return r6
    }

    public int indexOf(java.lang.Object r6, int r7) {
            r5 = this;
            int r0 = r5.mSize
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int[] r1 = r5.mHashes
            int r1 = m21621(r1, r0, r7)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r5.mArray
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.mHashes
            r3 = r3[r2]
            if (r3 != r7) goto L36
            java.lang.Object[] r3 = r5.mArray
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.mHashes
            r0 = r0[r1]
            if (r0 != r7) goto L50
            java.lang.Object[] r0 = r5.mArray
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r6 = ~r2
            return r6
    }

    public int indexOfKey(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.indexOfNull()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.indexOf(r2, r0)
        Lf:
            return r2
    }

    public int indexOfNull() {
            r5 = this;
            int r0 = r5.mSize
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r5.mHashes
            r2 = 0
            int r1 = m21621(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r5.mArray
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.mHashes
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.mArray
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.mHashes
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.mArray
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r0 = ~r2
            return r0
    }

    public int indexOfValue(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.mSize
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.mArray
            r2 = 1
            if (r6 != 0) goto L15
            r6 = r2
        La:
            if (r6 >= r0) goto L26
            r3 = r1[r6]
            if (r3 != 0) goto L12
            int r6 = r6 >> r2
            return r6
        L12:
            int r6 = r6 + 2
            goto La
        L15:
            r3 = r2
        L16:
            if (r3 >= r0) goto L26
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L23
            int r6 = r3 >> 1
            return r6
        L23:
            int r3 = r3 + 2
            goto L16
        L26:
            r6 = -1
            return r6
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.mSize
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public K keyAt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.mArray
            int r2 = r2 << 1
            r2 = r0[r2]
            return r2
    }

    @Yue.InterfaceC4544
    public V put(K r10, V r11) {
            r9 = this;
            int r0 = r9.mSize
            r1 = 0
            if (r10 != 0) goto Lb
            int r2 = r9.indexOfNull()
            r3 = r1
            goto L16
        Lb:
            int r2 = r10.hashCode()
            int r3 = r9.indexOf(r10, r2)
            r8 = r3
            r3 = r2
            r2 = r8
        L16:
            if (r2 < 0) goto L23
            int r10 = r2 << 1
            int r10 = r10 + 1
            java.lang.Object[] r0 = r9.mArray
            r1 = r0[r10]
            r0[r10] = r11
            return r1
        L23:
            int r2 = ~r2
            int[] r4 = r9.mHashes
            int r5 = r4.length
            if (r0 < r5) goto L58
            r5 = 8
            if (r0 < r5) goto L31
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L36
        L31:
            r6 = 4
            if (r0 < r6) goto L35
            goto L36
        L35:
            r5 = r6
        L36:
            java.lang.Object[] r6 = r9.mArray
            r9.m21623(r5)
            int r5 = r9.mSize
            if (r0 != r5) goto L52
            int[] r5 = r9.mHashes
            int r7 = r5.length
            if (r7 <= 0) goto L4e
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r1, r5, r1, r7)
            java.lang.Object[] r5 = r9.mArray
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r1, r5, r1, r7)
        L4e:
            m21622(r4, r6, r0)
            goto L58
        L52:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L58:
            if (r2 >= r0) goto L71
            int[] r1 = r9.mHashes
            int r4 = r2 + 1
            int r5 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r4, r5)
            java.lang.Object[] r1 = r9.mArray
            int r5 = r2 << 1
            int r4 = r4 << 1
            int r6 = r9.mSize
            int r6 = r6 - r2
            int r6 = r6 << 1
            java.lang.System.arraycopy(r1, r5, r1, r4, r6)
        L71:
            int r1 = r9.mSize
            if (r0 != r1) goto L8c
            int[] r0 = r9.mHashes
            int r4 = r0.length
            if (r2 >= r4) goto L8c
            r0[r2] = r3
            java.lang.Object[] r0 = r9.mArray
            int r2 = r2 << 1
            r0[r2] = r10
            int r2 = r2 + 1
            r0[r2] = r11
            int r1 = r1 + 1
            r9.mSize = r1
            r10 = 0
            return r10
        L8c:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public void putAll(@Yue.InterfaceC4410 Yue.C5787<? extends K, ? extends V> r5) {
            r4 = this;
            int r0 = r5.mSize
            int r1 = r4.mSize
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r1 = r4.mSize
            r2 = 0
            if (r1 != 0) goto L22
            if (r0 <= 0) goto L32
            int[] r1 = r5.mHashes
            int[] r3 = r4.mHashes
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.mArray
            java.lang.Object[] r1 = r4.mArray
            int r3 = r0 << 1
            java.lang.System.arraycopy(r5, r2, r1, r2, r3)
            r4.mSize = r0
            goto L32
        L22:
            if (r2 >= r0) goto L32
            java.lang.Object r1 = r5.keyAt(r2)
            java.lang.Object r3 = r5.valueAt(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L22
        L32:
            return
    }

    @Yue.InterfaceC4544
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto La
            java.lang.Object r0 = r1.put(r2, r3)
        La:
            return r0
    }

    @Yue.InterfaceC4544
    public V remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.valueAt(r2)
            if (r3 == r0) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.removeAt(r2)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public V removeAt(int r11) {
            r10 = this;
            java.lang.Object[] r0 = r10.mArray
            int r1 = r11 << 1
            int r2 = r1 + 1
            r2 = r0[r2]
            int r3 = r10.mSize
            r4 = 0
            r5 = 1
            if (r3 > r5) goto L1c
            int[] r11 = r10.mHashes
            m21622(r11, r0, r3)
            int[] r11 = Yue.C1537.f4954
            r10.mHashes = r11
            java.lang.Object[] r11 = Yue.C1537.f4956
            r10.mArray = r11
            goto L79
        L1c:
            int r6 = r3 + (-1)
            int[] r7 = r10.mHashes
            int r8 = r7.length
            r9 = 8
            if (r8 <= r9) goto L5e
            int r8 = r7.length
            int r8 = r8 / 3
            if (r3 >= r8) goto L5e
            if (r3 <= r9) goto L30
            int r8 = r3 >> 1
            int r9 = r3 + r8
        L30:
            r10.m21623(r9)
            int r8 = r10.mSize
            if (r3 != r8) goto L58
            if (r11 <= 0) goto L43
            int[] r8 = r10.mHashes
            java.lang.System.arraycopy(r7, r4, r8, r4, r11)
            java.lang.Object[] r8 = r10.mArray
            java.lang.System.arraycopy(r0, r4, r8, r4, r1)
        L43:
            if (r11 >= r6) goto L78
            int r4 = r11 + 1
            int[] r8 = r10.mHashes
            int r9 = r6 - r11
            java.lang.System.arraycopy(r7, r4, r8, r11, r9)
            int r11 = r4 << 1
            java.lang.Object[] r4 = r10.mArray
            int r5 = r9 << 1
            java.lang.System.arraycopy(r0, r11, r4, r1, r5)
            goto L78
        L58:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L5e:
            if (r11 >= r6) goto L6e
            int r0 = r11 + 1
            int r4 = r6 - r11
            java.lang.System.arraycopy(r7, r0, r7, r11, r4)
            java.lang.Object[] r11 = r10.mArray
            int r0 = r0 << r5
            int r4 = r4 << r5
            java.lang.System.arraycopy(r11, r0, r11, r1, r4)
        L6e:
            java.lang.Object[] r11 = r10.mArray
            int r0 = r6 << 1
            r1 = 0
            r11[r0] = r1
            int r0 = r0 + r5
            r11[r0] = r1
        L78:
            r4 = r6
        L79:
            int r11 = r10.mSize
            if (r3 != r11) goto L80
            r10.mSize = r4
            return r2
        L80:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

    @Yue.InterfaceC4544
    public V replace(K r1, V r2) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.setValueAt(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.valueAt(r2)
            if (r0 == r3) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.setValueAt(r2, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public V setValueAt(int r3, V r4) {
            r2 = this;
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.mArray
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    public int size() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.mSize
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.mSize
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r4.keyAt(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r4) goto L2f
            r0.append(r2)
            goto L32
        L2f:
            r0.append(r3)
        L32:
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.valueAt(r1)
            if (r2 == r4) goto L41
            r0.append(r2)
            goto L44
        L41:
            r0.append(r3)
        L44:
            int r1 = r1 + 1
            goto L18
        L47:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public V valueAt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.mArray
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m21623(int r6) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 != r0) goto L2d
            java.lang.Class<Yue.ۥۢ۟ۡ> r0 = Yue.C5787.class
            monitor-enter(r0)
            java.lang.Object[] r4 = Yue.C5787.mTwiceBaseCache     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            r5.mArray = r4     // Catch: java.lang.Throwable -> L27
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L27
            Yue.C5787.mTwiceBaseCache = r6     // Catch: java.lang.Throwable -> L27
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L27
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L27
            r5.mHashes = r6     // Catch: java.lang.Throwable -> L27
            r4[r3] = r1     // Catch: java.lang.Throwable -> L27
            r4[r2] = r1     // Catch: java.lang.Throwable -> L27
            int r6 = Yue.C5787.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L27
            int r6 = r6 - r3
            Yue.C5787.mTwiceBaseCacheSize = r6     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r6 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L56
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
        L2d:
            r0 = 4
            if (r6 != r0) goto L56
            java.lang.Class<Yue.ۥۢ۟ۡ> r0 = Yue.C5787.class
            monitor-enter(r0)
            java.lang.Object[] r4 = Yue.C5787.mBaseCache     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            r5.mArray = r4     // Catch: java.lang.Throwable -> L50
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L50
            Yue.C5787.mBaseCache = r6     // Catch: java.lang.Throwable -> L50
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L50
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L50
            r5.mHashes = r6     // Catch: java.lang.Throwable -> L50
            r4[r3] = r1     // Catch: java.lang.Throwable -> L50
            r4[r2] = r1     // Catch: java.lang.Throwable -> L50
            int r6 = Yue.C5787.mBaseCacheSize     // Catch: java.lang.Throwable -> L50
            int r6 = r6 - r3
            Yue.C5787.mBaseCacheSize = r6     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r6 = move-exception
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        L56:
            int[] r0 = new int[r6]
            r5.mHashes = r0
            int r6 = r6 << r3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.mArray = r6
            return
    }
}
