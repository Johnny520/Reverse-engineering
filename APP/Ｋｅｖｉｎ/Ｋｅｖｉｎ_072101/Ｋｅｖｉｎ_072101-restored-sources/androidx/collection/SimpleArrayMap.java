package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    int[] mHashes;
    int mSize;

    public SimpleArrayMap() {
            r1 = this;
            r1.<init>()
            int[] r0 = androidx.collection.ContainerHelpers.EMPTY_INTS
            r1.mHashes = r0
            java.lang.Object[] r0 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r1.mArray = r0
            r0 = 0
            r1.mSize = r0
            return
    }

    public SimpleArrayMap(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto Le
            int[] r0 = androidx.collection.ContainerHelpers.EMPTY_INTS
            r1.mHashes = r0
            java.lang.Object[] r0 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r1.mArray = r0
            goto L11
        Le:
            r1.allocArrays(r2)
        L11:
            r0 = 0
            r1.mSize = r0
            return
    }

    public SimpleArrayMap(androidx.collection.SimpleArrayMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.putAll(r1)
        L8:
            return
    }

    private void allocArrays(int r7) {
            r6 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r7 != r0) goto L32
            java.lang.Class<androidx.collection.SimpleArrayMap> r0 = androidx.collection.SimpleArrayMap.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.SimpleArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2d
            java.lang.Object[] r4 = androidx.collection.SimpleArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L2f
            r6.mArray = r4     // Catch: java.lang.Throwable -> L2f
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L2f
            androidx.collection.SimpleArrayMap.mTwiceBaseCache = r5     // Catch: java.lang.Throwable -> L2f
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L2f
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2f
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2f
            r6.mHashes = r5     // Catch: java.lang.Throwable -> L2f
            r4[r3] = r1     // Catch: java.lang.Throwable -> L2f
            r4[r2] = r1     // Catch: java.lang.Throwable -> L2f
            int r1 = androidx.collection.SimpleArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 - r3
            androidx.collection.SimpleArrayMap.mTwiceBaseCacheSize = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            r0 = 4
            if (r7 != r0) goto L60
            java.lang.Class<androidx.collection.SimpleArrayMap> r0 = androidx.collection.SimpleArrayMap.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.SimpleArrayMap.mBaseCache     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L5b
            java.lang.Object[] r4 = androidx.collection.SimpleArrayMap.mBaseCache     // Catch: java.lang.Throwable -> L5d
            r6.mArray = r4     // Catch: java.lang.Throwable -> L5d
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L5d
            androidx.collection.SimpleArrayMap.mBaseCache = r5     // Catch: java.lang.Throwable -> L5d
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L5d
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L5d
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L5d
            r6.mHashes = r5     // Catch: java.lang.Throwable -> L5d
            r4[r3] = r1     // Catch: java.lang.Throwable -> L5d
            r4[r2] = r1     // Catch: java.lang.Throwable -> L5d
            int r1 = androidx.collection.SimpleArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 - r3
            androidx.collection.SimpleArrayMap.mBaseCacheSize = r1     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            return
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r1
        L60:
            int[] r0 = new int[r7]
            r6.mHashes = r0
            int r0 = r7 << 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.mArray = r0
            return
    }

    private static int binarySearchHashes(int[] r2, int r3, int r4) {
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r2, r3, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r0
        L5:
            r0 = move-exception
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    private static void freeArrays(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2e
            java.lang.Class<androidx.collection.SimpleArrayMap> r0 = androidx.collection.SimpleArrayMap.class
            monitor-enter(r0)
            int r1 = androidx.collection.SimpleArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2b
            if (r1 >= r5) goto L29
            java.lang.Object[] r1 = androidx.collection.SimpleArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L2b
            r8[r4] = r1     // Catch: java.lang.Throwable -> L2b
            r8[r6] = r7     // Catch: java.lang.Throwable -> L2b
            int r1 = r9 << 1
            int r1 = r1 - r6
        L1b:
            if (r1 < r3) goto L22
            r8[r1] = r2     // Catch: java.lang.Throwable -> L2b
            int r1 = r1 + (-1)
            goto L1b
        L22:
            androidx.collection.SimpleArrayMap.mTwiceBaseCache = r8     // Catch: java.lang.Throwable -> L2b
            int r1 = androidx.collection.SimpleArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2b
            int r1 = r1 + r6
            androidx.collection.SimpleArrayMap.mTwiceBaseCacheSize = r1     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            goto L55
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
        L2e:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L55
            java.lang.Class<androidx.collection.SimpleArrayMap> r0 = androidx.collection.SimpleArrayMap.class
            monitor-enter(r0)
            int r1 = androidx.collection.SimpleArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> L52
            if (r1 >= r5) goto L50
            java.lang.Object[] r1 = androidx.collection.SimpleArrayMap.mBaseCache     // Catch: java.lang.Throwable -> L52
            r8[r4] = r1     // Catch: java.lang.Throwable -> L52
            r8[r6] = r7     // Catch: java.lang.Throwable -> L52
            int r1 = r9 << 1
            int r1 = r1 - r6
        L42:
            if (r1 < r3) goto L49
            r8[r1] = r2     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + (-1)
            goto L42
        L49:
            androidx.collection.SimpleArrayMap.mBaseCache = r8     // Catch: java.lang.Throwable -> L52
            int r1 = androidx.collection.SimpleArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> L52
            int r1 = r1 + r6
            androidx.collection.SimpleArrayMap.mBaseCacheSize = r1     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r1
        L55:
            return
    }

    public void clear() {
            r4 = this;
            int r0 = r4.mSize
            if (r0 <= 0) goto L18
            int[] r0 = r4.mHashes
            java.lang.Object[] r1 = r4.mArray
            int r2 = r4.mSize
            int[] r3 = androidx.collection.ContainerHelpers.EMPTY_INTS
            r4.mHashes = r3
            java.lang.Object[] r3 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r4.mArray = r3
            r3 = 0
            r4.mSize = r3
            freeArrays(r0, r1, r2)
        L18:
            int r0 = r4.mSize
            if (r0 > 0) goto L1d
            return
        L1d:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.indexOfKey(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.indexOfValue(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void ensureCapacity(int r7) {
            r6 = this;
            int r0 = r6.mSize
            int[] r1 = r6.mHashes
            int r1 = r1.length
            if (r1 >= r7) goto L22
            int[] r1 = r6.mHashes
            java.lang.Object[] r2 = r6.mArray
            r6.allocArrays(r7)
            int r3 = r6.mSize
            if (r3 <= 0) goto L1f
            int[] r3 = r6.mHashes
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r0)
            java.lang.Object[] r3 = r6.mArray
            int r5 = r0 << 1
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
        L1f:
            freeArrays(r1, r2, r0)
        L22:
            int r1 = r6.mSize
            if (r1 != r0) goto L27
            return
        L27:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof androidx.collection.SimpleArrayMap
            r2 = 0
            if (r1 == 0) goto L43
            r1 = r9
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            int r3 = r8.size()
            int r4 = r1.size()
            if (r3 == r4) goto L17
            return r2
        L17:
            r3 = 0
        L18:
            int r4 = r8.mSize     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            if (r3 >= r4) goto L3d
            java.lang.Object r4 = r8.keyAt(r3)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            java.lang.Object r5 = r8.valueAt(r3)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            java.lang.Object r6 = r1.get(r4)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            if (r5 != 0) goto L33
            if (r6 != 0) goto L32
            boolean r7 = r1.containsKey(r4)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            if (r7 != 0) goto L3a
        L32:
            return r2
        L33:
            boolean r7 = r5.equals(r6)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L41
            if (r7 != 0) goto L3a
            return r2
        L3a:
            int r3 = r3 + 1
            goto L18
        L3d:
            return r0
        L3f:
            r0 = move-exception
            return r2
        L41:
            r0 = move-exception
            return r2
        L43:
            boolean r1 = r9 instanceof java.util.Map
            if (r1 == 0) goto L81
            r1 = r9
            java.util.Map r1 = (java.util.Map) r1
            int r3 = r8.size()
            int r4 = r1.size()
            if (r3 == r4) goto L55
            return r2
        L55:
            r3 = 0
        L56:
            int r4 = r8.mSize     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            if (r3 >= r4) goto L7b
            java.lang.Object r4 = r8.keyAt(r3)     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            java.lang.Object r5 = r8.valueAt(r3)     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            java.lang.Object r6 = r1.get(r4)     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            if (r5 != 0) goto L71
            if (r6 != 0) goto L70
            boolean r7 = r1.containsKey(r4)     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            if (r7 != 0) goto L78
        L70:
            return r2
        L71:
            boolean r7 = r5.equals(r6)     // Catch: java.lang.ClassCastException -> L7d java.lang.NullPointerException -> L7f
            if (r7 != 0) goto L78
            return r2
        L78:
            int r3 = r3 + 1
            goto L56
        L7b:
            return r0
        L7d:
            r0 = move-exception
            return r2
        L7f:
            r0 = move-exception
            return r2
        L81:
            return r2
    }

    public V get(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.getOrDefault(r2, r0)
            return r0
    }

    public V getOrDefault(java.lang.Object r4, V r5) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto Lf
            java.lang.Object[] r1 = r3.mArray
            int r2 = r0 << 1
            int r2 = r2 + 1
            r1 = r1[r2]
            goto L10
        Lf:
            r1 = r5
        L10:
            return r1
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.mHashes
            java.lang.Object[] r1 = r9.mArray
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r9.mSize
        L9:
            if (r3 >= r5) goto L1e
            r6 = r1[r4]
            r7 = r0[r3]
            if (r6 != 0) goto L13
            r8 = 0
            goto L17
        L13:
            int r8 = r6.hashCode()
        L17:
            r7 = r7 ^ r8
            int r2 = r2 + r7
            int r3 = r3 + 1
            int r4 = r4 + 2
            goto L9
        L1e:
            return r2
    }

    int indexOf(java.lang.Object r7, int r8) {
            r6 = this;
            int r0 = r6.mSize
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r6.mHashes
            int r1 = binarySearchHashes(r1, r0, r8)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r6.mArray
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r6.mHashes
            r3 = r3[r2]
            if (r3 != r8) goto L36
            java.lang.Object[] r3 = r6.mArray
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r3 = r1 + (-1)
        L38:
            if (r3 < 0) goto L50
            int[] r4 = r6.mHashes
            r4 = r4[r3]
            if (r4 != r8) goto L50
            java.lang.Object[] r4 = r6.mArray
            int r5 = r3 << 1
            r4 = r4[r5]
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L4d
            return r3
        L4d:
            int r3 = r3 + (-1)
            goto L38
        L50:
            int r3 = ~r2
            return r3
    }

    public int indexOfKey(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r0 = r1.indexOfNull()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r0 = r1.indexOf(r2, r0)
        Lf:
            return r0
    }

    int indexOfNull() {
            r6 = this;
            int r0 = r6.mSize
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r6.mHashes
            r2 = 0
            int r1 = binarySearchHashes(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r6.mArray
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r6.mHashes
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r6.mArray
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r3 = r1 + (-1)
        L31:
            if (r3 < 0) goto L45
            int[] r4 = r6.mHashes
            r4 = r4[r3]
            if (r4 != 0) goto L45
            java.lang.Object[] r4 = r6.mArray
            int r5 = r3 << 1
            r4 = r4[r5]
            if (r4 != 0) goto L42
            return r3
        L42:
            int r3 = r3 + (-1)
            goto L31
        L45:
            int r3 = ~r2
            return r3
    }

    int indexOfValue(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.mSize
            int r0 = r0 * 2
            java.lang.Object[] r1 = r4.mArray
            if (r5 != 0) goto L16
            r2 = 1
        L9:
            if (r2 >= r0) goto L15
            r3 = r1[r2]
            if (r3 != 0) goto L12
            int r3 = r2 >> 1
            return r3
        L12:
            int r2 = r2 + 2
            goto L9
        L15:
            goto L27
        L16:
            r2 = 1
        L17:
            if (r2 >= r0) goto L27
            r3 = r1[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            int r3 = r2 >> 1
            return r3
        L24:
            int r2 = r2 + 2
            goto L17
        L27:
            r2 = -1
            return r2
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

    public K keyAt(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.mArray
            int r1 = r3 << 1
            r0 = r0[r1]
            return r0
    }

    public V put(K r10, V r11) {
            r9 = this;
            int r0 = r9.mSize
            if (r10 != 0) goto La
            r1 = 0
            int r2 = r9.indexOfNull()
            goto L12
        La:
            int r1 = r10.hashCode()
            int r2 = r9.indexOf(r10, r1)
        L12:
            if (r2 < 0) goto L21
            int r3 = r2 << 1
            int r3 = r3 + 1
            java.lang.Object[] r2 = r9.mArray
            r2 = r2[r3]
            java.lang.Object[] r4 = r9.mArray
            r4[r3] = r11
            return r2
        L21:
            int r2 = ~r2
            int[] r3 = r9.mHashes
            int r3 = r3.length
            if (r0 < r3) goto L5b
            r3 = 8
            if (r0 < r3) goto L2f
            int r3 = r0 >> 1
            int r3 = r3 + r0
            goto L34
        L2f:
            r4 = 4
            if (r0 < r4) goto L33
            goto L34
        L33:
            r3 = r4
        L34:
            int[] r4 = r9.mHashes
            java.lang.Object[] r5 = r9.mArray
            r9.allocArrays(r3)
            int r6 = r9.mSize
            if (r0 != r6) goto L55
            int[] r6 = r9.mHashes
            int r6 = r6.length
            if (r6 <= 0) goto L51
            int[] r6 = r9.mHashes
            int r7 = r4.length
            r8 = 0
            java.lang.System.arraycopy(r4, r8, r6, r8, r7)
            java.lang.Object[] r6 = r9.mArray
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r8, r6, r8, r7)
        L51:
            freeArrays(r4, r5, r0)
            goto L5b
        L55:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
        L5b:
            if (r2 >= r0) goto L7a
            int[] r3 = r9.mHashes
            int[] r4 = r9.mHashes
            int r5 = r2 + 1
            int r6 = r0 - r2
            java.lang.System.arraycopy(r3, r2, r4, r5, r6)
            java.lang.Object[] r3 = r9.mArray
            int r4 = r2 << 1
            java.lang.Object[] r5 = r9.mArray
            int r6 = r2 + 1
            int r6 = r6 << 1
            int r7 = r9.mSize
            int r7 = r7 - r2
            int r7 = r7 << 1
            java.lang.System.arraycopy(r3, r4, r5, r6, r7)
        L7a:
            int r3 = r9.mSize
            if (r0 != r3) goto L9d
            int[] r3 = r9.mHashes
            int r3 = r3.length
            if (r2 >= r3) goto L9d
            int[] r3 = r9.mHashes
            r3[r2] = r1
            java.lang.Object[] r3 = r9.mArray
            int r4 = r2 << 1
            r3[r4] = r10
            java.lang.Object[] r3 = r9.mArray
            int r4 = r2 << 1
            int r4 = r4 + 1
            r3[r4] = r11
            int r3 = r9.mSize
            int r3 = r3 + 1
            r9.mSize = r3
            r3 = 0
            return r3
        L9d:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> r6) {
            r5 = this;
            int r0 = r6.mSize
            int r1 = r5.mSize
            int r1 = r1 + r0
            r5.ensureCapacity(r1)
            int r1 = r5.mSize
            if (r1 != 0) goto L22
            if (r0 <= 0) goto L33
            int[] r1 = r6.mHashes
            int[] r2 = r5.mHashes
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            java.lang.Object[] r1 = r6.mArray
            java.lang.Object[] r2 = r5.mArray
            int r4 = r0 << 1
            java.lang.System.arraycopy(r1, r3, r2, r3, r4)
            r5.mSize = r0
            goto L33
        L22:
            r1 = 0
        L23:
            if (r1 >= r0) goto L33
            java.lang.Object r2 = r6.keyAt(r1)
            java.lang.Object r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L23
        L33:
            return
    }

    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto La
            java.lang.Object r0 = r1.put(r2, r3)
        La:
            return r0
    }

    public V remove(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.indexOfKey(r3)
            if (r0 < 0) goto Lb
            java.lang.Object r1 = r2.removeAt(r0)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean remove(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L19
            java.lang.Object r1 = r3.valueAt(r0)
            if (r5 == r1) goto L14
            if (r5 == 0) goto L19
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L19
        L14:
            r3.removeAt(r0)
            r2 = 1
            return r2
        L19:
            r1 = 0
            return r1
    }

    public V removeAt(int r12) {
            r11 = this;
            java.lang.Object[] r0 = r11.mArray
            int r1 = r12 << 1
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            int r1 = r11.mSize
            if (r1 > r2) goto L1e
            int[] r2 = r11.mHashes
            java.lang.Object[] r3 = r11.mArray
            freeArrays(r2, r3, r1)
            int[] r2 = androidx.collection.ContainerHelpers.EMPTY_INTS
            r11.mHashes = r2
            java.lang.Object[] r2 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r11.mArray = r2
            r2 = 0
            goto L9c
        L1e:
            int r3 = r1 + (-1)
            int[] r4 = r11.mHashes
            int r4 = r4.length
            r5 = 8
            if (r4 <= r5) goto L71
            int r4 = r11.mSize
            int[] r6 = r11.mHashes
            int r6 = r6.length
            int r6 = r6 / 3
            if (r4 >= r6) goto L71
            if (r1 <= r5) goto L36
            int r4 = r1 >> 1
            int r5 = r1 + r4
        L36:
            r4 = r5
            int[] r5 = r11.mHashes
            java.lang.Object[] r6 = r11.mArray
            r11.allocArrays(r4)
            int r7 = r11.mSize
            if (r1 != r7) goto L6b
            if (r12 <= 0) goto L51
            int[] r7 = r11.mHashes
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r7, r8, r12)
            java.lang.Object[] r7 = r11.mArray
            int r9 = r12 << 1
            java.lang.System.arraycopy(r6, r8, r7, r8, r9)
        L51:
            if (r12 >= r3) goto L6a
            int r7 = r12 + 1
            int[] r8 = r11.mHashes
            int r9 = r3 - r12
            java.lang.System.arraycopy(r5, r7, r8, r12, r9)
            int r7 = r12 + 1
            int r7 = r7 << r2
            java.lang.Object[] r8 = r11.mArray
            int r9 = r12 << 1
            int r10 = r3 - r12
            int r2 = r10 << 1
            java.lang.System.arraycopy(r6, r7, r8, r9, r2)
        L6a:
            goto L9b
        L6b:
            java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
            r2.<init>()
            throw r2
        L71:
            if (r12 >= r3) goto L8d
            int[] r4 = r11.mHashes
            int r5 = r12 + 1
            int[] r6 = r11.mHashes
            int r7 = r3 - r12
            java.lang.System.arraycopy(r4, r5, r6, r12, r7)
            java.lang.Object[] r4 = r11.mArray
            int r5 = r12 + 1
            int r5 = r5 << r2
            java.lang.Object[] r6 = r11.mArray
            int r7 = r12 << 1
            int r8 = r3 - r12
            int r8 = r8 << r2
            java.lang.System.arraycopy(r4, r5, r6, r7, r8)
        L8d:
            java.lang.Object[] r4 = r11.mArray
            int r5 = r3 << 1
            r6 = 0
            r4[r5] = r6
            java.lang.Object[] r4 = r11.mArray
            int r5 = r3 << 1
            int r5 = r5 + r2
            r4[r5] = r6
        L9b:
            r2 = r3
        L9c:
            int r3 = r11.mSize
            if (r1 != r3) goto La3
            r11.mSize = r2
            return r0
        La3:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
    }

    public V replace(K r3, V r4) {
            r2 = this;
            int r0 = r2.indexOfKey(r3)
            if (r0 < 0) goto Lb
            java.lang.Object r1 = r2.setValueAt(r0, r4)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean replace(K r4, V r5, V r6) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L19
            java.lang.Object r1 = r3.valueAt(r0)
            if (r1 == r5) goto L14
            if (r5 == 0) goto L19
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L19
        L14:
            r3.setValueAt(r0, r6)
            r2 = 1
            return r2
        L19:
            r1 = 0
            return r1
    }

    public V setValueAt(int r3, V r4) {
            r2 = this;
            int r0 = r3 << 1
            int r0 = r0 + 1
            java.lang.Object[] r3 = r2.mArray
            r3 = r3[r0]
            java.lang.Object[] r1 = r2.mArray
            r1[r0] = r4
            return r3
    }

    public int size() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.mSize
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r5.mSize
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r5.keyAt(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r5) goto L2f
            r0.append(r2)
            goto L32
        L2f:
            r0.append(r3)
        L32:
            r4 = 61
            r0.append(r4)
            java.lang.Object r4 = r5.valueAt(r1)
            if (r4 == r5) goto L41
            r0.append(r4)
            goto L44
        L41:
            r0.append(r3)
        L44:
            int r1 = r1 + 1
            goto L18
        L47:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public V valueAt(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.mArray
            int r1 = r3 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }
}
