package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛶᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1150 extends xhss.AbstractC0779 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C1150 f3744 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.Object[] f3745;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f3746;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f3747;

    static {
            xhss.ᲈᛶᲀᲈ r0 = new xhss.ᲈᛶᲀᲈ
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f3747 = r1
            xhss.C1150.f3744 = r0
            return
    }

    public C1150(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f3745 = r1
            return
        La:
            java.lang.String r0 = "capacity must be non-negative."
            xhss.C0532.m959(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ int m1845(xhss.C1150 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m1852()
            int r0 = r2.f3746
            if (r3 < 0) goto L17
            if (r3 > r0) goto L17
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m1850(r3, r1)
            java.lang.Object[] r2 = r2.f3745
            r2[r3] = r4
            return
        L17:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.m1852()
            int r0 = r3.f3746
            int r1 = r3.modCount
            r2 = 1
            int r1 = r1 + r2
            r3.modCount = r1
            r3.m1850(r0, r2)
            java.lang.Object[] r3 = r3.f3745
            r3[r0] = r4
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.m1852()
            int r0 = r2.f3746
            if (r3 < 0) goto L16
            if (r3 > r0) goto L16
            int r0 = r4.size()
            r2.m1851(r3, r4, r0)
            if (r0 <= 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
        L16:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r2.m1852()
            int r0 = r3.size()
            int r1 = r2.f3746
            r2.m1851(r1, r3, r0)
            if (r0 <= 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.m1852()
            r0 = 0
            int r1 = r2.f3746
            r2.m1847(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r6 == r5) goto L28
            boolean r0 = r6 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L27
            java.util.List r6 = (java.util.List) r6
            java.lang.Object[] r0 = r5.f3745
            int r5 = r5.f3746
            int r2 = r6.size()
            if (r5 == r2) goto L14
            goto L27
        L14:
            r2 = r1
        L15:
            if (r2 >= r5) goto L28
            r3 = r0[r2]
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = xhss.AbstractC0007.m97(r3, r4)
            if (r3 != 0) goto L24
            goto L27
        L24:
            int r2 = r2 + 1
            goto L15
        L27:
            return r1
        L28:
            r5 = 1
            return r5
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.f3746
            if (r4 < 0) goto Lb
            if (r4 >= r0) goto Lb
            java.lang.Object[] r3 = r3.f3745
            r3 = r3[r4]
            return r3
        Lb:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.f3745
            int r5 = r5.f3746
            r1 = 1
            r2 = 0
            r3 = r2
        L7:
            if (r3 >= r5) goto L19
            r4 = r0[r3]
            int r1 = r1 * 31
            if (r4 == 0) goto L14
            int r4 = r4.hashCode()
            goto L15
        L14:
            r4 = r2
        L15:
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L7
        L19:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f3746
            if (r0 >= r1) goto L13
            java.lang.Object[] r1 = r2.f3745
            r1 = r1[r0]
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 == 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r2 = -1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f3746
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f3746
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            java.lang.Object[] r1 = r2.f3745
            r1 = r1[r0]
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            r2 = -1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r4) {
            r3 = this;
            int r0 = r3.f3746
            if (r4 < 0) goto Lc
            if (r4 > r0) goto Lc
            xhss.ᲈᛳᛲᛶ r0 = new xhss.ᲈᛳᛲᛶ
            r0.<init>(r3, r4)
            return r0
        Lc:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.m1852()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.mo1228(r1)
        Lc:
            if (r1 < 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r2.m1852()
            int r0 = r2.f3746
            r1 = 0
            int r2 = r2.m1849(r1, r0, r3, r1)
            if (r2 <= 0) goto Le
            r2 = 1
            return r2
        Le:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r3.m1852()
            int r0 = r3.f3746
            r1 = 0
            r2 = 1
            int r3 = r3.m1849(r1, r0, r4, r2)
            if (r3 <= 0) goto Le
            return r2
        Le:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m1852()
            int r0 = r2.f3746
            if (r3 < 0) goto L10
            if (r3 >= r0) goto L10
            java.lang.Object[] r2 = r2.f3745
            r0 = r2[r3]
            r2[r3] = r4
            return r0
        L10:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.f3746
            xhss.AbstractC0561.m997(r8, r9, r0)
            xhss.ᛷᲁᲇᛳ r1 = new xhss.ᛷᲁᲇᛳ
            java.lang.Object[] r2 = r7.f3745
            int r4 = r9 - r8
            r5 = 0
            r6 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.f3745
            int r2 = r2.f3746
            int r1 = r0.length
            xhss.AbstractC0485.m881(r2, r1)
            r1 = 0
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.f3746
            java.lang.Object[] r2 = r4.f3745
            r3 = 0
            if (r0 >= r1) goto L11
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            return r4
        L11:
            xhss.AbstractC0193.m448(r3, r3, r1, r2, r5)
            int r4 = r4.f3746
            int r0 = r5.length
            if (r4 >= r0) goto L1c
            r0 = 0
            r5[r4] = r0
        L1c:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f3745
            r1 = 0
            int r2 = r3.f3746
            java.lang.String r3 = xhss.AbstractC0485.m885(r0, r1, r2, r3)
            return r3
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo1228(int r4) {
            r3 = this;
            r3.m1852()
            int r0 = r3.f3746
            if (r4 < 0) goto Le
            if (r4 >= r0) goto Le
            java.lang.Object r3 = r3.m1848(r4)
            return r3
        Le:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1846(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m1850(r3, r1)
            java.lang.Object[] r2 = r2.f3745
            r2[r3] = r4
            return
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo1230() {
            r0 = this;
            int r0 = r0.f3746
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1847(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L8
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
        L8:
            java.lang.Object[] r0 = r3.f3745
            int r1 = r4 + r5
            int r2 = r3.f3746
            xhss.AbstractC0193.m448(r4, r1, r2, r0, r0)
            java.lang.Object[] r4 = r3.f3745
            int r0 = r3.f3746
            int r1 = r0 - r5
            xhss.AbstractC0485.m888(r4, r1, r0)
            int r4 = r3.f3746
            int r4 = r4 - r5
            r3.f3746 = r4
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.lang.Object m1848(int r5) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.f3745
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.f3746
            xhss.AbstractC0193.m448(r5, r2, r3, r0, r0)
            java.lang.Object[] r5 = r4.f3745
            int r0 = r4.f3746
            int r2 = r0 + (-1)
            r3 = 0
            r5[r2] = r3
            int r0 = r0 + (-1)
            r4.f3746 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int m1849(int r6, int r7, java.util.Collection r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object[] r2 = r5.f3745
            if (r0 >= r7) goto L20
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            java.lang.Object[] r2 = r5.f3745
            int r4 = r1 + 1
            int r1 = r1 + r6
            int r0 = r0 + 1
            r3 = r2[r3]
            r2[r1] = r3
            r1 = r4
            goto L2
        L1d:
            int r0 = r0 + 1
            goto L2
        L20:
            int r8 = r7 - r1
            int r7 = r7 + r6
            int r9 = r5.f3746
            int r6 = r6 + r1
            xhss.AbstractC0193.m448(r6, r7, r9, r2, r2)
            java.lang.Object[] r6 = r5.f3745
            int r7 = r5.f3746
            int r9 = r7 - r8
            xhss.AbstractC0485.m888(r6, r9, r7)
            if (r8 <= 0) goto L3a
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
        L3a:
            int r6 = r5.f3746
            int r6 = r6 - r8
            r5.f3746 = r6
            return r8
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1850(int r6, int r7) {
            r5 = this;
            int r0 = r5.f3746
            int r0 = r0 + r7
            if (r0 < 0) goto L34
            java.lang.Object[] r1 = r5.f3745
            int r2 = r1.length
            if (r0 <= r2) goto L27
            int r2 = r1.length
            int r3 = r2 >> 1
            int r2 = r2 + r3
            int r3 = r2 - r0
            if (r3 >= 0) goto L13
            r2 = r0
        L13:
            r3 = 2147483639(0x7ffffff7, float:NaN)
            int r4 = r2 - r3
            if (r4 <= 0) goto L21
            if (r0 <= r3) goto L20
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L21
        L20:
            r2 = r3
        L21:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r5.f3745 = r1
        L27:
            int r0 = r5.f3746
            int r2 = r6 + r7
            xhss.AbstractC0193.m448(r2, r6, r0, r1, r1)
            int r6 = r5.f3746
            int r6 = r6 + r7
            r5.f3746 = r6
            return
        L34:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1851(int r5, java.util.Collection r6, int r7) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            r4.m1850(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Le:
            if (r0 >= r7) goto L1d
            java.lang.Object[] r1 = r4.f3745
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1852() {
            r0 = this;
            boolean r0 = r0.f3747
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
