package defpackage;

/* JADX INFO: renamed from: ᛱᲇᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203 extends defpackage.AbstractC1973 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0203 f1275 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f1276;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f1277;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object[] f1278;

    static {
            ᛱᲇᲀᛲ r0 = new ᛱᲇᲀᛲ
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f1276 = r1
            defpackage.C0203.f1275 = r0
            return
    }

    public C0203(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f1278 = r1
            return
        La:
            java.lang.String r0 = "capacity must be non-negative."
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int m743(defpackage.C0203 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m751()
            int r0 = r2.f1277
            if (r3 < 0) goto L17
            if (r3 > r0) goto L17
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m752(r3, r1)
            java.lang.Object[] r2 = r2.f1278
            r2[r3] = r4
            return
        L17:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.m751()
            int r0 = r3.f1277
            int r1 = r3.modCount
            r2 = 1
            int r1 = r1 + r2
            r3.modCount = r1
            r3.m752(r0, r2)
            java.lang.Object[] r3 = r3.f1278
            r3[r0] = r4
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.m751()
            int r0 = r2.f1277
            if (r3 < 0) goto L16
            if (r3 > r0) goto L16
            int r0 = r4.size()
            r2.m747(r3, r4, r0)
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
            java.lang.String r3 = defpackage.AbstractC1124.m2143(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r2.m751()
            int r0 = r3.size()
            int r1 = r2.f1277
            r2.m747(r1, r3, r0)
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
            r2.m751()
            r0 = 0
            int r1 = r2.f1277
            r2.m745(r0, r1)
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
            java.lang.Object[] r0 = r5.f1278
            int r5 = r5.f1277
            int r2 = r6.size()
            if (r5 == r2) goto L14
            goto L27
        L14:
            r2 = r1
        L15:
            if (r2 >= r5) goto L28
            r3 = r0[r2]
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
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
            int r0 = r3.f1277
            if (r4 < 0) goto Lb
            if (r4 >= r0) goto Lb
            java.lang.Object[] r3 = r3.f1278
            r3 = r3[r4]
            return r3
        Lb:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.f1278
            int r5 = r5.f1277
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
            int r1 = r2.f1277
            if (r0 >= r1) goto L13
            java.lang.Object[] r1 = r2.f1278
            r1 = r1[r0]
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
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
            int r0 = r0.f1277
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
            int r0 = r2.f1277
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            java.lang.Object[] r1 = r2.f1278
            r1 = r1[r0]
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
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
            int r0 = r3.f1277
            if (r4 < 0) goto Lc
            if (r4 > r0) goto Lc
            ᛸᛱᛳᛵ r0 = new ᛸᛱᛳᛵ
            r0.<init>(r3, r4)
            return r0
        Lc:
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
            r0.m751()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.mo750(r1)
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
            r2.m751()
            int r0 = r2.f1277
            r1 = 0
            int r2 = r2.m749(r1, r0, r3, r1)
            if (r2 <= 0) goto Le
            r2 = 1
            return r2
        Le:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r3.m751()
            int r0 = r3.f1277
            r1 = 0
            r2 = 1
            int r3 = r3.m749(r1, r0, r4, r2)
            if (r3 <= 0) goto Le
            return r2
        Le:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m751()
            int r0 = r2.f1277
            if (r3 < 0) goto L10
            if (r3 >= r0) goto L10
            java.lang.Object[] r2 = r2.f1278
            r0 = r2[r3]
            r2[r3] = r4
            return r0
        L10:
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
            int r0 = r7.f1277
            defpackage.AbstractC0498.m1276(r8, r9, r0)
            ᛷᛸᛸᛷ r1 = new ᛷᛸᛸᛷ
            java.lang.Object[] r2 = r7.f1278
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
            java.lang.Object[] r0 = r2.f1278
            int r2 = r2.f1277
            int r1 = r0.length
            defpackage.AbstractC2346.m3844(r2, r1)
            r1 = 0
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.f1277
            java.lang.Object[] r2 = r4.f1278
            r3 = 0
            if (r0 >= r1) goto L11
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            return r4
        L11:
            defpackage.AbstractC2315.m3766(r3, r3, r1, r2, r5)
            int r4 = r4.f1277
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
            java.lang.Object[] r0 = r3.f1278
            r1 = 0
            int r2 = r3.f1277
            java.lang.String r3 = defpackage.AbstractC1592.m2884(r0, r1, r2, r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object m744(int r5) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.f1278
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.f1277
            defpackage.AbstractC2315.m3766(r5, r2, r3, r0, r0)
            java.lang.Object[] r5 = r4.f1278
            int r0 = r4.f1277
            int r2 = r0 + (-1)
            r3 = 0
            r5[r2] = r3
            int r0 = r0 + (-1)
            r4.f1277 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m745(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L8
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
        L8:
            java.lang.Object[] r0 = r3.f1278
            int r1 = r4 + r5
            int r2 = r3.f1277
            defpackage.AbstractC2315.m3766(r4, r1, r2, r0, r0)
            java.lang.Object[] r4 = r3.f1278
            int r0 = r3.f1277
            int r1 = r0 - r5
            defpackage.AbstractC1592.m2883(r4, r1, r0)
            int r4 = r3.f1277
            int r4 = r4 - r5
            r3.f1277 = r4
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m746(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m752(r3, r1)
            java.lang.Object[] r2 = r2.f1278
            r2[r3] = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m747(int r5, java.util.Collection r6, int r7) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            r4.m752(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Le:
            if (r0 >= r7) goto L1d
            java.lang.Object[] r1 = r4.f1278
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            return
    }

    @Override // defpackage.AbstractC1973
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int mo748() {
            r0 = this;
            int r0 = r0.f1277
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int m749(int r6, int r7, java.util.Collection r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object[] r2 = r5.f1278
            if (r0 >= r7) goto L20
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            java.lang.Object[] r2 = r5.f1278
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
            int r9 = r5.f1277
            int r6 = r6 + r1
            defpackage.AbstractC2315.m3766(r6, r7, r9, r2, r2)
            java.lang.Object[] r6 = r5.f1278
            int r7 = r5.f1277
            int r9 = r7 - r8
            defpackage.AbstractC1592.m2883(r6, r9, r7)
            if (r8 <= 0) goto L3a
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
        L3a:
            int r6 = r5.f1277
            int r6 = r6 - r8
            r5.f1277 = r6
            return r8
    }

    @Override // defpackage.AbstractC1973
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object mo750(int r4) {
            r3 = this;
            r3.m751()
            int r0 = r3.f1277
            if (r4 < 0) goto Le
            if (r4 >= r0) goto Le
            java.lang.Object r3 = r3.m744(r4)
            return r3
        Le:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m751() {
            r0 = this;
            boolean r0 = r0.f1276
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m752(int r6, int r7) {
            r5 = this;
            int r0 = r5.f1277
            int r0 = r0 + r7
            if (r0 < 0) goto L34
            java.lang.Object[] r1 = r5.f1278
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
            r5.f1278 = r1
        L27:
            int r0 = r5.f1277
            int r2 = r6 + r7
            defpackage.AbstractC2315.m3766(r2, r6, r0, r1, r1)
            int r6 = r5.f1277
            int r6 = r6 + r7
            r5.f1277 = r6
            return
        L34:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }
}
