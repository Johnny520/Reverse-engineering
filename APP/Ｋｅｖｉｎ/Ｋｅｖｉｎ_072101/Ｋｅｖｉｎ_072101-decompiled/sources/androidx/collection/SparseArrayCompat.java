package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public class SparseArrayCompat<E> implements java.lang.Cloneable {
    private static final java.lang.Object DELETED = null;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private java.lang.Object[] mValues;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.SparseArrayCompat.DELETED = r0
            return
    }

    public SparseArrayCompat() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public SparseArrayCompat(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mGarbage = r0
            if (r2 != 0) goto L11
            int[] r0 = androidx.collection.ContainerHelpers.EMPTY_INTS
            r1.mKeys = r0
            java.lang.Object[] r0 = androidx.collection.ContainerHelpers.EMPTY_OBJECTS
            r1.mValues = r0
            goto L1d
        L11:
            int r2 = androidx.collection.ContainerHelpers.idealIntArraySize(r2)
            int[] r0 = new int[r2]
            r1.mKeys = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.mValues = r0
        L1d:
            return
    }

    /* JADX INFO: renamed from: gc */
    private void m8gc() {
            r7 = this;
            int r0 = r7.mSize
            r1 = 0
            int[] r2 = r7.mKeys
            java.lang.Object[] r3 = r7.mValues
            r4 = 0
        L8:
            if (r4 >= r0) goto L20
            r5 = r3[r4]
            java.lang.Object r6 = androidx.collection.SparseArrayCompat.DELETED
            if (r5 == r6) goto L1d
            if (r4 == r1) goto L1b
            r6 = r2[r4]
            r2[r1] = r6
            r3[r1] = r5
            r6 = 0
            r3[r4] = r6
        L1b:
            int r1 = r1 + 1
        L1d:
            int r4 = r4 + 1
            goto L8
        L20:
            r4 = 0
            r7.mGarbage = r4
            r7.mSize = r1
            return
    }

    public void append(int r8, E r9) {
            r7 = this;
            int r0 = r7.mSize
            if (r0 == 0) goto L12
            int[] r0 = r7.mKeys
            int r1 = r7.mSize
            int r1 = r1 + (-1)
            r0 = r0[r1]
            if (r8 > r0) goto L12
            r7.put(r8, r9)
            return
        L12:
            boolean r0 = r7.mGarbage
            if (r0 == 0) goto L20
            int r0 = r7.mSize
            int[] r1 = r7.mKeys
            int r1 = r1.length
            if (r0 < r1) goto L20
            r7.m8gc()
        L20:
            int r0 = r7.mSize
            int[] r1 = r7.mKeys
            int r1 = r1.length
            if (r0 < r1) goto L46
            int r1 = r0 + 1
            int r1 = androidx.collection.ContainerHelpers.idealIntArraySize(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int[] r4 = r7.mKeys
            int[] r5 = r7.mKeys
            int r5 = r5.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r2, r6, r5)
            java.lang.Object[] r4 = r7.mValues
            java.lang.Object[] r5 = r7.mValues
            int r5 = r5.length
            java.lang.System.arraycopy(r4, r6, r3, r6, r5)
            r7.mKeys = r2
            r7.mValues = r3
        L46:
            int[] r1 = r7.mKeys
            r1[r0] = r8
            java.lang.Object[] r1 = r7.mValues
            r1[r0] = r9
            int r1 = r0 + 1
            r7.mSize = r1
            return
    }

    public void clear() {
            r4 = this;
            int r0 = r4.mSize
            java.lang.Object[] r1 = r4.mValues
            r2 = 0
        L5:
            if (r2 >= r0) goto Ld
            r3 = 0
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        Ld:
            r2 = 0
            r4.mSize = r2
            r4.mGarbage = r2
            return
    }

    public androidx.collection.SparseArrayCompat<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1c
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0     // Catch: java.lang.CloneNotSupportedException -> L1c
            int[] r1 = r2.mKeys     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1c
            int[] r1 = (int[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1c
            r0.mKeys = r1     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object[] r1 = r2.mValues     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1c
            r0.mValues = r1     // Catch: java.lang.CloneNotSupportedException -> L1c
            return r0
        L1c:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m774clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.collection.SparseArrayCompat r0 = r1.clone()
            return r0
    }

    public boolean containsKey(int r2) {
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

    public boolean containsValue(E r2) {
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

    @java.lang.Deprecated
    public void delete(int r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public E get(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.get(r2, r0)
            return r0
    }

    public E get(int r4, E r5) {
            r3 = this;
            int[] r0 = r3.mKeys
            int r1 = r3.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r4)
            if (r0 < 0) goto L18
            java.lang.Object[] r1 = r3.mValues
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.SparseArrayCompat.DELETED
            if (r1 != r2) goto L13
            goto L18
        L13:
            java.lang.Object[] r1 = r3.mValues
            r1 = r1[r0]
            return r1
        L18:
            return r5
    }

    public int indexOfKey(int r3) {
            r2 = this;
            boolean r0 = r2.mGarbage
            if (r0 == 0) goto L7
            r2.m8gc()
        L7:
            int[] r0 = r2.mKeys
            int r1 = r2.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r3)
            return r0
    }

    public int indexOfValue(E r3) {
            r2 = this;
            boolean r0 = r2.mGarbage
            if (r0 == 0) goto L7
            r2.m8gc()
        L7:
            r0 = 0
        L8:
            int r1 = r2.mSize
            if (r0 >= r1) goto L16
            java.lang.Object[] r1 = r2.mValues
            r1 = r1[r0]
            if (r1 != r3) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L8
        L16:
            r0 = -1
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int keyAt(int r2) {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.m8gc()
        L7:
            int[] r0 = r1.mKeys
            r0 = r0[r2]
            return r0
    }

    public void put(int r8, E r9) {
            r7 = this;
            int[] r0 = r7.mKeys
            int r1 = r7.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r8)
            if (r0 < 0) goto L10
            java.lang.Object[] r1 = r7.mValues
            r1[r0] = r9
            goto L90
        L10:
            int r0 = ~r0
            int r1 = r7.mSize
            if (r0 >= r1) goto L26
            java.lang.Object[] r1 = r7.mValues
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.SparseArrayCompat.DELETED
            if (r1 != r2) goto L26
            int[] r1 = r7.mKeys
            r1[r0] = r8
            java.lang.Object[] r1 = r7.mValues
            r1[r0] = r9
            return
        L26:
            boolean r1 = r7.mGarbage
            if (r1 == 0) goto L3d
            int r1 = r7.mSize
            int[] r2 = r7.mKeys
            int r2 = r2.length
            if (r1 < r2) goto L3d
            r7.m8gc()
            int[] r1 = r7.mKeys
            int r2 = r7.mSize
            int r1 = androidx.collection.ContainerHelpers.binarySearch(r1, r2, r8)
            int r0 = ~r1
        L3d:
            int r1 = r7.mSize
            int[] r2 = r7.mKeys
            int r2 = r2.length
            if (r1 < r2) goto L65
            int r1 = r7.mSize
            int r1 = r1 + 1
            int r1 = androidx.collection.ContainerHelpers.idealIntArraySize(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int[] r4 = r7.mKeys
            int[] r5 = r7.mKeys
            int r5 = r5.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r2, r6, r5)
            java.lang.Object[] r4 = r7.mValues
            java.lang.Object[] r5 = r7.mValues
            int r5 = r5.length
            java.lang.System.arraycopy(r4, r6, r3, r6, r5)
            r7.mKeys = r2
            r7.mValues = r3
        L65:
            int r1 = r7.mSize
            int r1 = r1 - r0
            if (r1 == 0) goto L82
            int[] r1 = r7.mKeys
            int[] r2 = r7.mKeys
            int r3 = r0 + 1
            int r4 = r7.mSize
            int r4 = r4 - r0
            java.lang.System.arraycopy(r1, r0, r2, r3, r4)
            java.lang.Object[] r1 = r7.mValues
            java.lang.Object[] r2 = r7.mValues
            int r3 = r0 + 1
            int r4 = r7.mSize
            int r4 = r4 - r0
            java.lang.System.arraycopy(r1, r0, r2, r3, r4)
        L82:
            int[] r1 = r7.mKeys
            r1[r0] = r8
            java.lang.Object[] r1 = r7.mValues
            r1[r0] = r9
            int r1 = r7.mSize
            int r1 = r1 + 1
            r7.mSize = r1
        L90:
            return
    }

    public void putAll(androidx.collection.SparseArrayCompat<? extends E> r5) {
            r4 = this;
            r0 = 0
            int r1 = r5.size()
        L5:
            if (r0 >= r1) goto L15
            int r2 = r5.keyAt(r0)
            java.lang.Object r3 = r5.valueAt(r0)
            r4.put(r2, r3)
            int r0 = r0 + 1
            goto L5
        L15:
            return
    }

    public E putIfAbsent(int r2, E r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L9
            r1.put(r2, r3)
        L9:
            return r0
    }

    public void remove(int r4) {
            r3 = this;
            int[] r0 = r3.mKeys
            int r1 = r3.mSize
            int r0 = androidx.collection.ContainerHelpers.binarySearch(r0, r1, r4)
            if (r0 < 0) goto L1b
            java.lang.Object[] r1 = r3.mValues
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.SparseArrayCompat.DELETED
            if (r1 == r2) goto L1b
            java.lang.Object[] r1 = r3.mValues
            java.lang.Object r2 = androidx.collection.SparseArrayCompat.DELETED
            r1[r0] = r2
            r1 = 1
            r3.mGarbage = r1
        L1b:
            return
    }

    public boolean remove(int r4, java.lang.Object r5) {
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

    public void removeAt(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.mValues
            r0 = r0[r3]
            java.lang.Object r1 = androidx.collection.SparseArrayCompat.DELETED
            if (r0 == r1) goto L11
            java.lang.Object[] r0 = r2.mValues
            java.lang.Object r1 = androidx.collection.SparseArrayCompat.DELETED
            r0[r3] = r1
            r0 = 1
            r2.mGarbage = r0
        L11:
            return
    }

    public void removeAtRange(int r3, int r4) {
            r2 = this;
            int r0 = r2.mSize
            int r1 = r3 + r4
            int r0 = java.lang.Math.min(r0, r1)
            r1 = r3
        L9:
            if (r1 >= r0) goto L11
            r2.removeAt(r1)
            int r1 = r1 + 1
            goto L9
        L11:
            return
    }

    public E replace(int r4, E r5) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto Lf
            java.lang.Object[] r1 = r3.mValues
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.mValues
            r2[r0] = r5
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public boolean replace(int r4, E r5, E r6) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.mValues
            r1 = r1[r0]
            if (r1 == r5) goto L14
            if (r5 == 0) goto L1a
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L1a
        L14:
            java.lang.Object[] r2 = r3.mValues
            r2[r0] = r6
            r2 = 1
            return r2
        L1a:
            r1 = 0
            return r1
    }

    public void setValueAt(int r2, E r3) {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.m8gc()
        L7:
            java.lang.Object[] r0 = r1.mValues
            r0[r2] = r3
            return
    }

    public int size() {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.m8gc()
        L7:
            int r0 = r1.mSize
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.size()
            if (r0 > 0) goto L9
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
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            int r2 = r5.keyAt(r1)
            r0.append(r2)
            r3 = 61
            r0.append(r3)
            java.lang.Object r3 = r5.valueAt(r1)
            if (r3 == r5) goto L39
            r0.append(r3)
            goto L3e
        L39:
            java.lang.String r4 = "(this Map)"
            r0.append(r4)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public E valueAt(int r2) {
            r1 = this;
            boolean r0 = r1.mGarbage
            if (r0 == 0) goto L7
            r1.m8gc()
        L7:
            java.lang.Object[] r0 = r1.mValues
            r0 = r0[r2]
            return r0
    }
}
