package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1339 extends defpackage.AbstractC1973 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f5913;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f5914;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object[] f5915;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1339 f5916;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0203 f5917;

    public C1339(java.lang.Object[] r1, int r2, int r3, defpackage.C1339 r4, defpackage.C0203 r5) {
            r0 = this;
            r0.<init>()
            r0.f5915 = r1
            r0.f5914 = r2
            r0.f5913 = r3
            r0.f5916 = r4
            r0.f5917 = r5
            int r1 = defpackage.C0203.m743(r5)
            r0.modCount = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int m2485(defpackage.C1339 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m2492()
            r2.m2491()
            int r0 = r2.f5913
            if (r3 < 0) goto L13
            if (r3 > r0) goto L13
            int r0 = r2.f5914
            int r0 = r0 + r3
            r2.m2488(r0, r4)
            return
        L13:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.m2492()
            r2.m2491()
            int r0 = r2.f5914
            int r1 = r2.f5913
            int r0 = r0 + r1
            r2.m2488(r0, r3)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.m2492()
            r2.m2491()
            int r0 = r2.f5913
            if (r3 < 0) goto L1c
            if (r3 > r0) goto L1c
            int r0 = r4.size()
            int r1 = r2.f5914
            int r1 = r1 + r3
            r2.m2489(r1, r4, r0)
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
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r3.m2492()
            r3.m2491()
            int r0 = r4.size()
            int r1 = r3.f5914
            int r2 = r3.f5913
            int r1 = r1 + r2
            r3.m2489(r1, r4, r0)
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
            r2.m2492()
            r2.m2491()
            int r0 = r2.f5914
            int r1 = r2.f5913
            r2.m2487(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r6.m2491()
            if (r7 == r6) goto L2e
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.f5915
            int r2 = r6.f5913
            int r3 = r7.size()
            if (r2 == r3) goto L17
            goto L2d
        L17:
            r3 = r1
        L18:
            if (r3 >= r2) goto L2e
            int r4 = r6.f5914
            int r4 = r4 + r3
            r4 = r0[r4]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
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
            r3.m2491()
            int r0 = r3.f5913
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            java.lang.Object[] r0 = r3.f5915
            int r3 = r3.f5914
            int r3 = r3 + r4
            r3 = r0[r3]
            return r3
        L11:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r6.m2491()
            java.lang.Object[] r0 = r6.f5915
            int r1 = r6.f5913
            r2 = 1
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r1) goto L1f
            int r5 = r6.f5914
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
            r3.m2491()
            r0 = 0
        L4:
            int r1 = r3.f5913
            if (r0 >= r1) goto L19
            java.lang.Object[] r1 = r3.f5915
            int r2 = r3.f5914
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r4)
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
            r0.m2491()
            int r0 = r0.f5913
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
            r3.m2491()
            int r0 = r3.f5913
            int r0 = r0 + (-1)
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.f5915
            int r2 = r3.f5914
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r4)
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
            r3.m2491()
            int r0 = r3.f5913
            if (r4 < 0) goto Lf
            if (r4 > r0) goto Lf
            ᛸᛱᛳᛵ r0 = new ᛸᛱᛳᛵ
            r0.<init>(r3, r4)
            return r0
        Lf:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.m2492()
            r0.m2491()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lf
            r0.mo750(r1)
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
            r3.m2492()
            r3.m2491()
            int r0 = r3.f5913
            int r1 = r3.f5914
            r2 = 0
            int r3 = r3.m2490(r1, r0, r4, r2)
            if (r3 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r3.m2492()
            r3.m2491()
            int r0 = r3.f5913
            int r1 = r3.f5914
            r2 = 1
            int r3 = r3.m2490(r1, r0, r4, r2)
            if (r3 <= 0) goto L12
            return r2
        L12:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m2492()
            r2.m2491()
            int r0 = r2.f5913
            if (r3 < 0) goto L18
            if (r3 >= r0) goto L18
            java.lang.Object[] r0 = r2.f5915
            int r2 = r2.f5914
            int r1 = r2 + r3
            r1 = r0[r1]
            int r2 = r2 + r3
            r0[r2] = r4
            return r1
        L18:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.f5913
            defpackage.AbstractC0498.m1276(r8, r9, r0)
            ᛷᛸᛸᛷ r1 = new ᛷᛸᛸᛷ
            java.lang.Object[] r2 = r7.f5915
            int r0 = r7.f5914
            int r3 = r0 + r8
            int r4 = r9 - r8
            ᛱᲇᲀᛲ r6 = r7.f5917
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r3 = this;
            r3.m2491()
            java.lang.Object[] r0 = r3.f5915
            int r1 = r3.f5913
            int r3 = r3.f5914
            int r1 = r1 + r3
            int r2 = r0.length
            defpackage.AbstractC2346.m3844(r1, r2)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r0, r3, r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r4.m2491()
            int r0 = r5.length
            int r1 = r4.f5913
            java.lang.Object[] r2 = r4.f5915
            int r3 = r4.f5914
            if (r0 >= r1) goto L16
            int r1 = r1 + r3
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            return r4
        L16:
            r0 = 0
            int r1 = r1 + r3
            defpackage.AbstractC2315.m3766(r0, r3, r1, r2, r5)
            int r4 = r4.f5913
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
            r3.m2491()
            java.lang.Object[] r0 = r3.f5915
            int r1 = r3.f5914
            int r2 = r3.f5913
            java.lang.String r3 = defpackage.AbstractC1592.m2884(r0, r1, r2, r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object m2486(int r2) {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            ᛷᛸᛸᛷ r0 = r1.f5916
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.m2486(r2)
            goto L17
        Lf:
            ᛱᲇᲀᛲ r0 = defpackage.C0203.f1275
            ᛱᲇᲀᛲ r0 = r1.f5917
            java.lang.Object r2 = r0.m744(r2)
        L17:
            int r0 = r1.f5913
            int r0 = r0 + (-1)
            r1.f5913 = r0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m2487(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L8
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
        L8:
            ᛷᛸᛸᛷ r0 = r1.f5916
            if (r0 == 0) goto L10
            r0.m2487(r2, r3)
            goto L17
        L10:
            ᛱᲇᲀᛲ r0 = defpackage.C0203.f1275
            ᛱᲇᲀᛲ r0 = r1.f5917
            r0.m745(r2, r3)
        L17:
            int r2 = r1.f5913
            int r2 = r2 - r3
            r1.f5913 = r2
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2488(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            ᛱᲇᲀᛲ r0 = r2.f5917
            ᛷᛸᛸᛷ r1 = r2.f5916
            if (r1 == 0) goto L10
            r1.m2488(r3, r4)
            goto L15
        L10:
            ᛱᲇᲀᛲ r1 = defpackage.C0203.f1275
            r0.m746(r3, r4)
        L15:
            java.lang.Object[] r3 = r0.f1278
            r2.f5915 = r3
            int r3 = r2.f5913
            int r3 = r3 + 1
            r2.f5913 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m2489(int r3, java.util.Collection r4, int r5) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            ᛱᲇᲀᛲ r0 = r2.f5917
            ᛷᛸᛸᛷ r1 = r2.f5916
            if (r1 == 0) goto L10
            r1.m2489(r3, r4, r5)
            goto L15
        L10:
            ᛱᲇᲀᛲ r1 = defpackage.C0203.f1275
            r0.m747(r3, r4, r5)
        L15:
            java.lang.Object[] r3 = r0.f1278
            r2.f5915 = r3
            int r3 = r2.f5913
            int r3 = r3 + r5
            r2.f5913 = r3
            return
    }

    @Override // defpackage.AbstractC1973
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo748() {
            r0 = this;
            r0.m2491()
            int r0 = r0.f5913
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int m2490(int r2, int r3, java.util.Collection r4, boolean r5) {
            r1 = this;
            ᛷᛸᛸᛷ r0 = r1.f5916
            if (r0 == 0) goto L9
            int r2 = r0.m2490(r2, r3, r4, r5)
            goto L11
        L9:
            ᛱᲇᲀᛲ r0 = defpackage.C0203.f1275
            ᛱᲇᲀᛲ r0 = r1.f5917
            int r2 = r0.m749(r2, r3, r4, r5)
        L11:
            if (r2 <= 0) goto L19
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
        L19:
            int r3 = r1.f5913
            int r3 = r3 - r2
            r1.f5913 = r3
            return r2
    }

    @Override // defpackage.AbstractC1973
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo750(int r4) {
            r3 = this;
            r3.m2492()
            r3.m2491()
            int r0 = r3.f5913
            if (r4 < 0) goto L14
            if (r4 >= r0) goto L14
            int r0 = r3.f5914
            int r0 = r0 + r4
            java.lang.Object r3 = r3.m2486(r0)
            return r3
        L14:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2491() {
            r1 = this;
            ᛱᲇᲀᛲ r0 = r1.f5917
            int r0 = defpackage.C0203.m743(r0)
            int r1 = r1.modCount
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2492() {
            r0 = this;
            ᛱᲇᲀᛲ r0 = r0.f5917
            boolean r0 = r0.f1276
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
