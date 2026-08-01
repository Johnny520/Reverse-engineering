package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = null;
    private static final java.lang.Object[] OBJECT = null;
    private static final java.lang.String TAG = "ArraySet";
    private static java.lang.Object[] sBaseCache;
    private static int sBaseCacheSize;
    private static java.lang.Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    private androidx.collection.MapCollections<E, E> mCollections;
    private int[] mHashes;
    int mSize;


    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.ArraySet.INT = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.ArraySet.OBJECT = r0
            return
    }

    public ArraySet() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ArraySet(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto Le
            int[] r0 = androidx.collection.ArraySet.INT
            r1.mHashes = r0
            java.lang.Object[] r0 = androidx.collection.ArraySet.OBJECT
            r1.mArray = r0
            goto L11
        Le:
            r1.allocArrays(r2)
        L11:
            r0 = 0
            r1.mSize = r0
            return
    }

    public ArraySet(androidx.collection.ArraySet<E> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.addAll(r1)
        L8:
            return
    }

    public ArraySet(java.util.Collection<E> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.addAll(r1)
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
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.ArraySet.sTwiceBaseCache     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2d
            java.lang.Object[] r4 = androidx.collection.ArraySet.sTwiceBaseCache     // Catch: java.lang.Throwable -> L2f
            r6.mArray = r4     // Catch: java.lang.Throwable -> L2f
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L2f
            androidx.collection.ArraySet.sTwiceBaseCache = r5     // Catch: java.lang.Throwable -> L2f
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L2f
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2f
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2f
            r6.mHashes = r5     // Catch: java.lang.Throwable -> L2f
            r4[r3] = r1     // Catch: java.lang.Throwable -> L2f
            r4[r2] = r1     // Catch: java.lang.Throwable -> L2f
            int r1 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 - r3
            androidx.collection.ArraySet.sTwiceBaseCacheSize = r1     // Catch: java.lang.Throwable -> L2f
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
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.ArraySet.sBaseCache     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L5b
            java.lang.Object[] r4 = androidx.collection.ArraySet.sBaseCache     // Catch: java.lang.Throwable -> L5d
            r6.mArray = r4     // Catch: java.lang.Throwable -> L5d
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L5d
            androidx.collection.ArraySet.sBaseCache = r5     // Catch: java.lang.Throwable -> L5d
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L5d
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L5d
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L5d
            r6.mHashes = r5     // Catch: java.lang.Throwable -> L5d
            r4[r3] = r1     // Catch: java.lang.Throwable -> L5d
            r4[r2] = r1     // Catch: java.lang.Throwable -> L5d
            int r1 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 - r3
            androidx.collection.ArraySet.sBaseCacheSize = r1     // Catch: java.lang.Throwable -> L5d
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
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r6.mArray = r0
            return
    }

    private static void freeArrays(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2d
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            int r1 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r5) goto L28
            java.lang.Object[] r1 = androidx.collection.ArraySet.sTwiceBaseCache     // Catch: java.lang.Throwable -> L2a
            r8[r4] = r1     // Catch: java.lang.Throwable -> L2a
            r8[r6] = r7     // Catch: java.lang.Throwable -> L2a
            int r1 = r9 + (-1)
        L1a:
            if (r1 < r3) goto L21
            r8[r1] = r2     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + (-1)
            goto L1a
        L21:
            androidx.collection.ArraySet.sTwiceBaseCache = r8     // Catch: java.lang.Throwable -> L2a
            int r1 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + r6
            androidx.collection.ArraySet.sTwiceBaseCacheSize = r1     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
        L2d:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L53
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            int r1 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L50
            if (r1 >= r5) goto L4e
            java.lang.Object[] r1 = androidx.collection.ArraySet.sBaseCache     // Catch: java.lang.Throwable -> L50
            r8[r4] = r1     // Catch: java.lang.Throwable -> L50
            r8[r6] = r7     // Catch: java.lang.Throwable -> L50
            int r1 = r9 + (-1)
        L40:
            if (r1 < r3) goto L47
            r8[r1] = r2     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + (-1)
            goto L40
        L47:
            androidx.collection.ArraySet.sBaseCache = r8     // Catch: java.lang.Throwable -> L50
            int r1 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L50
            int r1 = r1 + r6
            androidx.collection.ArraySet.sBaseCacheSize = r1     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r1
        L53:
            return
    }

    private androidx.collection.MapCollections<E, E> getCollection() {
            r1 = this;
            androidx.collection.MapCollections<E, E> r0 = r1.mCollections
            if (r0 != 0) goto Lb
            androidx.collection.ArraySet$1 r0 = new androidx.collection.ArraySet$1
            r0.<init>(r1)
            r1.mCollections = r0
        Lb:
            androidx.collection.MapCollections<E, E> r0 = r1.mCollections
            return r0
    }

    private int indexOf(java.lang.Object r6, int r7) {
            r5 = this;
            int r0 = r5.mSize
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r5.mHashes
            int r1 = androidx.collection.ContainerHelpers.binarySearch(r1, r0, r7)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r5.mArray
            r2 = r2[r1]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r5.mHashes
            r3 = r3[r2]
            if (r3 != r7) goto L32
            java.lang.Object[] r3 = r5.mArray
            r3 = r3[r2]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r3 = r1 + (-1)
        L34:
            if (r3 < 0) goto L4a
            int[] r4 = r5.mHashes
            r4 = r4[r3]
            if (r4 != r7) goto L4a
            java.lang.Object[] r4 = r5.mArray
            r4 = r4[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L47
            return r3
        L47:
            int r3 = r3 + (-1)
            goto L34
        L4a:
            int r3 = ~r2
            return r3
    }

    private int indexOfNull() {
            r5 = this;
            int r0 = r5.mSize
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r5.mHashes
            r2 = 0
            int r1 = androidx.collection.ContainerHelpers.binarySearch(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r5.mArray
            r2 = r2[r1]
            if (r2 != 0) goto L17
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r5.mHashes
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r5.mArray
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r3 = r1 + (-1)
        L2d:
            if (r3 < 0) goto L3f
            int[] r4 = r5.mHashes
            r4 = r4[r3]
            if (r4 != 0) goto L3f
            java.lang.Object[] r4 = r5.mArray
            r4 = r4[r3]
            if (r4 != 0) goto L3c
            return r3
        L3c:
            int r3 = r3 + (-1)
            goto L2d
        L3f:
            int r3 = ~r2
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r10) {
            r9 = this;
            if (r10 != 0) goto L8
            r0 = 0
            int r1 = r9.indexOfNull()
            goto L10
        L8:
            int r0 = r10.hashCode()
            int r1 = r9.indexOf(r10, r0)
        L10:
            r2 = 0
            if (r1 < 0) goto L14
            return r2
        L14:
            int r1 = ~r1
            int r3 = r9.mSize
            int[] r4 = r9.mHashes
            int r4 = r4.length
            r5 = 1
            if (r3 < r4) goto L4f
            int r3 = r9.mSize
            r4 = 8
            if (r3 < r4) goto L2a
            int r3 = r9.mSize
            int r4 = r9.mSize
            int r4 = r4 >> r5
            int r4 = r4 + r3
            goto L31
        L2a:
            int r3 = r9.mSize
            r6 = 4
            if (r3 < r6) goto L30
            goto L31
        L30:
            r4 = r6
        L31:
            r3 = r4
            int[] r4 = r9.mHashes
            java.lang.Object[] r6 = r9.mArray
            r9.allocArrays(r3)
            int[] r7 = r9.mHashes
            int r7 = r7.length
            if (r7 <= 0) goto L4a
            int[] r7 = r9.mHashes
            int r8 = r4.length
            java.lang.System.arraycopy(r4, r2, r7, r2, r8)
            java.lang.Object[] r7 = r9.mArray
            int r8 = r6.length
            java.lang.System.arraycopy(r6, r2, r7, r2, r8)
        L4a:
            int r2 = r9.mSize
            freeArrays(r4, r6, r2)
        L4f:
            int r2 = r9.mSize
            if (r1 >= r2) goto L6b
            int[] r2 = r9.mHashes
            int[] r3 = r9.mHashes
            int r4 = r1 + 1
            int r6 = r9.mSize
            int r6 = r6 - r1
            java.lang.System.arraycopy(r2, r1, r3, r4, r6)
            java.lang.Object[] r2 = r9.mArray
            java.lang.Object[] r3 = r9.mArray
            int r4 = r1 + 1
            int r6 = r9.mSize
            int r6 = r6 - r1
            java.lang.System.arraycopy(r2, r1, r3, r4, r6)
        L6b:
            int[] r2 = r9.mHashes
            r2[r1] = r0
            java.lang.Object[] r2 = r9.mArray
            r2[r1] = r10
            int r2 = r9.mSize
            int r2 = r2 + r5
            r9.mSize = r2
            return r5
    }

    public void addAll(androidx.collection.ArraySet<? extends E> r5) {
            r4 = this;
            int r0 = r5.mSize
            int r1 = r4.mSize
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r1 = r4.mSize
            if (r1 != 0) goto L20
            if (r0 <= 0) goto L2d
            int[] r1 = r5.mHashes
            int[] r2 = r4.mHashes
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            java.lang.Object[] r1 = r5.mArray
            java.lang.Object[] r2 = r4.mArray
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.mSize = r0
            goto L2d
        L20:
            r1 = 0
        L21:
            if (r1 >= r0) goto L2d
            java.lang.Object r2 = r5.valueAt(r1)
            r4.add(r2)
            int r1 = r1 + 1
            goto L21
        L2d:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r5) {
            r4 = this;
            int r0 = r4.mSize
            int r1 = r5.size()
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            r0 = 0
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            boolean r3 = r4.add(r2)
            r0 = r0 | r3
            goto Lf
        L1f:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.mSize
            if (r0 == 0) goto L18
            int[] r0 = r3.mHashes
            java.lang.Object[] r1 = r3.mArray
            int r2 = r3.mSize
            freeArrays(r0, r1, r2)
            int[] r0 = androidx.collection.ArraySet.INT
            r3.mHashes = r0
            java.lang.Object[] r0 = androidx.collection.ArraySet.OBJECT
            r3.mArray = r0
            r0 = 0
            r3.mSize = r0
        L18:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.indexOf(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            boolean r2 = r3.contains(r1)
            if (r2 != 0) goto L16
            r0 = 0
            return r0
        L16:
            goto L4
        L17:
            r0 = 1
            return r0
    }

    public void ensureCapacity(int r6) {
            r5 = this;
            int[] r0 = r5.mHashes
            int r0 = r0.length
            if (r0 >= r6) goto L24
            int[] r0 = r5.mHashes
            java.lang.Object[] r1 = r5.mArray
            r5.allocArrays(r6)
            int r2 = r5.mSize
            if (r2 <= 0) goto L1f
            int[] r2 = r5.mHashes
            int r3 = r5.mSize
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r2, r4, r3)
            java.lang.Object[] r2 = r5.mArray
            int r3 = r5.mSize
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
        L1f:
            int r2 = r5.mSize
            freeArrays(r0, r1, r2)
        L24:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L30
            r1 = r7
            java.util.Set r1 = (java.util.Set) r1
            int r3 = r6.size()
            int r4 = r1.size()
            if (r3 == r4) goto L17
            return r2
        L17:
            r3 = 0
        L18:
            int r4 = r6.mSize     // Catch: java.lang.ClassCastException -> L2c java.lang.NullPointerException -> L2e
            if (r3 >= r4) goto L2a
            java.lang.Object r4 = r6.valueAt(r3)     // Catch: java.lang.ClassCastException -> L2c java.lang.NullPointerException -> L2e
            boolean r5 = r1.contains(r4)     // Catch: java.lang.ClassCastException -> L2c java.lang.NullPointerException -> L2e
            if (r5 != 0) goto L27
            return r2
        L27:
            int r3 = r3 + 1
            goto L18
        L2a:
            return r0
        L2c:
            r0 = move-exception
            return r2
        L2e:
            r0 = move-exception
            return r2
        L30:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.mHashes
            r1 = 0
            r2 = 0
            int r3 = r5.mSize
        L6:
            if (r2 >= r3) goto Le
            r4 = r0[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r1
    }

    public int indexOf(java.lang.Object r2) {
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

    @Override // java.util.Collection, java.util.Set
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getKeySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            if (r0 < 0) goto Lb
            r2.removeAt(r0)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean removeAll(androidx.collection.ArraySet<? extends E> r5) {
            r4 = this;
            int r0 = r5.mSize
            int r1 = r4.mSize
            r2 = 0
        L5:
            if (r2 >= r0) goto L11
            java.lang.Object r3 = r5.valueAt(r2)
            r4.remove(r3)
            int r2 = r2 + 1
            goto L5
        L11:
            int r2 = r4.mSize
            if (r1 == r2) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r5) {
            r4 = this;
            r0 = 0
            java.util.Iterator r1 = r5.iterator()
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L15
            java.lang.Object r2 = r1.next()
            boolean r3 = r4.remove(r2)
            r0 = r0 | r3
            goto L5
        L15:
            return r0
    }

    public E removeAt(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.mArray
            r0 = r0[r8]
            int r1 = r7.mSize
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L1f
            int[] r1 = r7.mHashes
            java.lang.Object[] r3 = r7.mArray
            int r4 = r7.mSize
            freeArrays(r1, r3, r4)
            int[] r1 = androidx.collection.ArraySet.INT
            r7.mHashes = r1
            java.lang.Object[] r1 = androidx.collection.ArraySet.OBJECT
            r7.mArray = r1
            r7.mSize = r2
            goto L93
        L1f:
            int[] r1 = r7.mHashes
            int r1 = r1.length
            r4 = 8
            if (r1 <= r4) goto L6b
            int r1 = r7.mSize
            int[] r5 = r7.mHashes
            int r5 = r5.length
            int r5 = r5 / 3
            if (r1 >= r5) goto L6b
            int r1 = r7.mSize
            if (r1 <= r4) goto L39
            int r1 = r7.mSize
            int r4 = r7.mSize
            int r4 = r4 >> r3
            int r4 = r4 + r1
        L39:
            r1 = r4
            int[] r4 = r7.mHashes
            java.lang.Object[] r5 = r7.mArray
            r7.allocArrays(r1)
            int r6 = r7.mSize
            int r6 = r6 - r3
            r7.mSize = r6
            if (r8 <= 0) goto L52
            int[] r3 = r7.mHashes
            java.lang.System.arraycopy(r4, r2, r3, r2, r8)
            java.lang.Object[] r3 = r7.mArray
            java.lang.System.arraycopy(r5, r2, r3, r2, r8)
        L52:
            int r2 = r7.mSize
            if (r8 >= r2) goto L6a
            int r2 = r8 + 1
            int[] r3 = r7.mHashes
            int r6 = r7.mSize
            int r6 = r6 - r8
            java.lang.System.arraycopy(r4, r2, r3, r8, r6)
            int r2 = r8 + 1
            java.lang.Object[] r3 = r7.mArray
            int r6 = r7.mSize
            int r6 = r6 - r8
            java.lang.System.arraycopy(r5, r2, r3, r8, r6)
        L6a:
            goto L93
        L6b:
            int r1 = r7.mSize
            int r1 = r1 - r3
            r7.mSize = r1
            int r1 = r7.mSize
            if (r8 >= r1) goto L8c
            int[] r1 = r7.mHashes
            int r2 = r8 + 1
            int[] r3 = r7.mHashes
            int r4 = r7.mSize
            int r4 = r4 - r8
            java.lang.System.arraycopy(r1, r2, r3, r8, r4)
            java.lang.Object[] r1 = r7.mArray
            int r2 = r8 + 1
            java.lang.Object[] r3 = r7.mArray
            int r4 = r7.mSize
            int r4 = r4 - r8
            java.lang.System.arraycopy(r1, r2, r3, r8, r4)
        L8c:
            java.lang.Object[] r1 = r7.mArray
            int r2 = r7.mSize
            r3 = 0
            r1[r2] = r3
        L93:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r4) {
            r3 = this;
            r0 = 0
            int r1 = r3.mSize
            int r1 = r1 + (-1)
        L5:
            if (r1 < 0) goto L18
            java.lang.Object[] r2 = r3.mArray
            r2 = r2[r1]
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L15
            r3.removeAt(r1)
            r0 = 1
        L15:
            int r1 = r1 + (-1)
            goto L5
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.mSize
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r4.mArray
            r2 = 0
            int r3 = r4.mSize
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.mSize
            if (r0 >= r1) goto L19
        L6:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3.mSize
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0
        L19:
            java.lang.Object[] r0 = r3.mArray
            int r1 = r3.mSize
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.mSize
            if (r0 <= r1) goto L2b
            int r0 = r3.mSize
            r1 = 0
            r4[r0] = r1
        L2b:
            return r4
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
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.mSize
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r4.valueAt(r1)
            if (r2 == r4) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r3 = "(this Set)"
            r0.append(r3)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public E valueAt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.mArray
            r0 = r0[r2]
            return r0
    }
}
