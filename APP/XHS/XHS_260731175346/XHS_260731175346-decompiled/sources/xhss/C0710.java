package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲁᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0710 extends xhss.AbstractC0779 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.Object[] f2379;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f2380;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0710 f2381;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2382;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C1150 f2383;

    public C0710(java.lang.Object[] r1, int r2, int r3, xhss.C0710 r4, xhss.C1150 r5) {
            r0 = this;
            r0.<init>()
            r0.f2379 = r1
            r0.f2380 = r2
            r0.f2382 = r3
            r0.f2381 = r4
            r0.f2383 = r5
            int r1 = xhss.C1150.m1845(r5)
            r0.modCount = r1
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ int m1227(xhss.C0710 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m1234()
            r2.m1236()
            int r0 = r2.f2382
            if (r3 < 0) goto L13
            if (r3 > r0) goto L13
            int r0 = r2.f2380
            int r0 = r0 + r3
            r2.m1229(r0, r4)
            return
        L13:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.m1234()
            r2.m1236()
            int r0 = r2.f2380
            int r1 = r2.f2382
            int r0 = r0 + r1
            r2.m1229(r0, r3)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.m1234()
            r2.m1236()
            int r0 = r2.f2382
            if (r3 < 0) goto L1c
            if (r3 > r0) goto L1c
            int r0 = r4.size()
            int r1 = r2.f2380
            int r1 = r1 + r3
            r2.m1235(r1, r4, r0)
            if (r0 <= 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
        L1c:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r3.m1234()
            r3.m1236()
            int r0 = r4.size()
            int r1 = r3.f2380
            int r2 = r3.f2382
            int r1 = r1 + r2
            r3.m1235(r1, r4, r0)
            if (r0 <= 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.m1234()
            r2.m1236()
            int r0 = r2.f2380
            int r1 = r2.f2382
            r2.m1231(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r6.m1236()
            if (r7 == r6) goto L2e
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.f2379
            int r2 = r6.f2382
            int r3 = r7.size()
            if (r2 == r3) goto L17
            goto L2d
        L17:
            r3 = r1
        L18:
            if (r3 >= r2) goto L2e
            int r4 = r6.f2380
            int r4 = r4 + r3
            r4 = r0[r4]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L2a
            goto L2d
        L2a:
            int r3 = r3 + 1
            goto L18
        L2d:
            return r1
        L2e:
            r6 = 1
            return r6
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            r3.m1236()
            int r0 = r3.f2382
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            java.lang.Object[] r0 = r3.f2379
            int r3 = r3.f2380
            int r3 = r3 + r4
            r3 = r0[r3]
            return r3
        L11:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r6.m1236()
            java.lang.Object[] r0 = r6.f2379
            int r1 = r6.f2382
            r2 = 1
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r1) goto L1f
            int r5 = r6.f2380
            int r5 = r5 + r4
            r5 = r0[r5]
            int r2 = r2 * 31
            if (r5 == 0) goto L1a
            int r5 = r5.hashCode()
            goto L1b
        L1a:
            r5 = r3
        L1b:
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto La
        L1f:
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            r3.m1236()
            r0 = 0
        L4:
            int r1 = r3.f2382
            if (r0 >= r1) goto L19
            java.lang.Object[] r1 = r3.f2379
            int r2 = r3.f2380
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = xhss.AbstractC0007.m97(r1, r4)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L4
        L19:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            r0.m1236()
            int r0 = r0.f2382
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
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
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.m1236()
            int r0 = r3.f2382
            int r0 = r0 + (-1)
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.f2379
            int r2 = r3.f2380
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = xhss.AbstractC0007.m97(r1, r4)
            if (r1 == 0) goto L17
            return r0
        L17:
            int r0 = r0 + (-1)
            goto L7
        L1a:
            r3 = -1
            return r3
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
            r3.m1236()
            int r0 = r3.f2382
            if (r4 < 0) goto Lf
            if (r4 > r0) goto Lf
            xhss.ᲈᛳᛲᛶ r0 = new xhss.ᲈᛳᛲᛶ
            r0.<init>(r3, r4)
            return r0
        Lf:
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
            r0.m1234()
            r0.m1236()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lf
            r0.mo1228(r1)
        Lf:
            if (r1 < 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            r3.m1234()
            r3.m1236()
            int r0 = r3.f2382
            int r1 = r3.f2380
            r2 = 0
            int r3 = r3.m1233(r1, r0, r4, r2)
            if (r3 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r3.m1234()
            r3.m1236()
            int r0 = r3.f2382
            int r1 = r3.f2380
            r2 = 1
            int r3 = r3.m1233(r1, r0, r4, r2)
            if (r3 <= 0) goto L12
            return r2
        L12:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m1234()
            r2.m1236()
            int r0 = r2.f2382
            if (r3 < 0) goto L18
            if (r3 >= r0) goto L18
            java.lang.Object[] r0 = r2.f2379
            int r2 = r2.f2380
            int r1 = r2 + r3
            r1 = r0[r1]
            int r2 = r2 + r3
            r0[r2] = r4
            return r1
        L18:
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
            int r0 = r7.f2382
            xhss.AbstractC0561.m997(r8, r9, r0)
            xhss.ᛷᲁᲇᛳ r1 = new xhss.ᛷᲁᲇᛳ
            java.lang.Object[] r2 = r7.f2379
            int r0 = r7.f2380
            int r3 = r0 + r8
            int r4 = r9 - r8
            xhss.ᲈᛶᲀᲈ r6 = r7.f2383
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r3 = this;
            r3.m1236()
            java.lang.Object[] r0 = r3.f2379
            int r1 = r3.f2382
            int r3 = r3.f2380
            int r1 = r1 + r3
            int r2 = r0.length
            xhss.AbstractC0485.m881(r1, r2)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r0, r3, r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r4.m1236()
            int r0 = r5.length
            int r1 = r4.f2382
            java.lang.Object[] r2 = r4.f2379
            int r3 = r4.f2380
            if (r0 >= r1) goto L16
            int r1 = r1 + r3
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            return r4
        L16:
            r0 = 0
            int r1 = r1 + r3
            xhss.AbstractC0193.m448(r0, r3, r1, r2, r5)
            int r4 = r4.f2382
            int r0 = r5.length
            if (r4 >= r0) goto L23
            r0 = 0
            r5[r4] = r0
        L23:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            r3.m1236()
            java.lang.Object[] r0 = r3.f2379
            int r1 = r3.f2380
            int r2 = r3.f2382
            java.lang.String r3 = xhss.AbstractC0485.m885(r0, r1, r2, r3)
            return r3
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object mo1228(int r4) {
            r3 = this;
            r3.m1234()
            r3.m1236()
            int r0 = r3.f2382
            if (r4 < 0) goto L14
            if (r4 >= r0) goto L14
            int r0 = r3.f2380
            int r0 = r0 + r4
            java.lang.Object r3 = r3.m1232(r0)
            return r3
        L14:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1229(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            xhss.ᲈᛶᲀᲈ r0 = r2.f2383
            xhss.ᛷᲁᲇᛳ r1 = r2.f2381
            if (r1 == 0) goto L10
            r1.m1229(r3, r4)
            goto L15
        L10:
            xhss.ᲈᛶᲀᲈ r1 = xhss.C1150.f3744
            r0.m1846(r3, r4)
        L15:
            java.lang.Object[] r3 = r0.f3745
            r2.f2379 = r3
            int r3 = r2.f2382
            int r3 = r3 + 1
            r2.f2382 = r3
            return
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int mo1230() {
            r0 = this;
            r0.m1236()
            int r0 = r0.f2382
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1231(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L8
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
        L8:
            xhss.ᛷᲁᲇᛳ r0 = r1.f2381
            if (r0 == 0) goto L10
            r0.m1231(r2, r3)
            goto L17
        L10:
            xhss.ᲈᛶᲀᲈ r0 = xhss.C1150.f3744
            xhss.ᲈᛶᲀᲈ r0 = r1.f2383
            r0.m1847(r2, r3)
        L17:
            int r2 = r1.f2382
            int r2 = r2 - r3
            r1.f2382 = r2
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.lang.Object m1232(int r2) {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            xhss.ᛷᲁᲇᛳ r0 = r1.f2381
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.m1232(r2)
            goto L17
        Lf:
            xhss.ᲈᛶᲀᲈ r0 = xhss.C1150.f3744
            xhss.ᲈᛶᲀᲈ r0 = r1.f2383
            java.lang.Object r2 = r0.m1848(r2)
        L17:
            int r0 = r1.f2382
            int r0 = r0 + (-1)
            r1.f2382 = r0
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int m1233(int r2, int r3, java.util.Collection r4, boolean r5) {
            r1 = this;
            xhss.ᛷᲁᲇᛳ r0 = r1.f2381
            if (r0 == 0) goto L9
            int r2 = r0.m1233(r2, r3, r4, r5)
            goto L11
        L9:
            xhss.ᲈᛶᲀᲈ r0 = xhss.C1150.f3744
            xhss.ᲈᛶᲀᲈ r0 = r1.f2383
            int r2 = r0.m1849(r2, r3, r4, r5)
        L11:
            if (r2 <= 0) goto L19
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
        L19:
            int r3 = r1.f2382
            int r3 = r3 - r2
            r1.f2382 = r3
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1234() {
            r0 = this;
            xhss.ᲈᛶᲀᲈ r0 = r0.f2383
            boolean r0 = r0.f3747
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1235(int r3, java.util.Collection r4, int r5) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            xhss.ᲈᛶᲀᲈ r0 = r2.f2383
            xhss.ᛷᲁᲇᛳ r1 = r2.f2381
            if (r1 == 0) goto L10
            r1.m1235(r3, r4, r5)
            goto L15
        L10:
            xhss.ᲈᛶᲀᲈ r1 = xhss.C1150.f3744
            r0.m1851(r3, r4, r5)
        L15:
            java.lang.Object[] r3 = r0.f3745
            r2.f2379 = r3
            int r3 = r2.f2382
            int r3 = r3 + r5
            r2.f2382 = r3
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1236() {
            r1 = this;
            xhss.ᲈᛶᲀᲈ r0 = r1.f2383
            int r0 = xhss.C1150.m1845(r0)
            int r1 = r1.modCount
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }
}
