package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zt0 extends p000.AbstractC1101 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: θ */
    public static final p000.zt0 f13275 = null;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object[] f13276;

    /* JADX INFO: renamed from: ζ */
    public int f13277;

    /* JADX INFO: renamed from: η */
    public boolean f13278;

    static {
            zt0 r0 = new zt0
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f13278 = r1
            p000.zt0.f13275 = r0
            return
    }

    public zt0(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f13276 = r1
            return
        La:
            java.lang.String r0 = "capacity must be non-negative."
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ int m7225(p000.zt0 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m7228()
            int r0 = r2.f13277
            if (r3 < 0) goto L17
            if (r3 > r0) goto L17
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m7229(r3, r1)
            java.lang.Object[] r2 = r2.f13276
            r2[r3] = r4
            return
        L17:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r4)
            p000.C1080.m7269(r2)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.m7228()
            int r0 = r3.f13277
            int r1 = r3.modCount
            r2 = 1
            int r1 = r1 + r2
            r3.modCount = r1
            r3.m7229(r0, r2)
            java.lang.Object[] r3 = r3.f13276
            r3[r0] = r4
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            r3.getClass()
            r1.m7228()
            int r0 = r1.f13277
            if (r2 < 0) goto L19
            if (r2 > r0) goto L19
            int r0 = r3.size()
            r1.m7226(r2, r3, r0)
            if (r0 <= 0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
        L19:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r2, r0, r1, r3)
            p000.C1080.m7269(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            r2.m7228()
            int r0 = r3.size()
            int r1 = r2.f13277
            r2.m7226(r1, r3, r0)
            if (r0 <= 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.m7228()
            r0 = 0
            int r1 = r2.f13277
            r2.m7231(r0, r1)
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
            java.lang.Object[] r0 = r5.f13276
            int r5 = r5.f13277
            int r2 = r6.size()
            if (r5 == r2) goto L14
            goto L27
        L14:
            r2 = r1
        L15:
            if (r2 >= r5) goto L28
            r3 = r0[r2]
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = p000.ln0.m3626(r3, r4)
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
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.f13277
            if (r3 < 0) goto Lb
            if (r3 >= r0) goto Lb
            java.lang.Object[] r2 = r2.f13276
            r2 = r2[r3]
            return r2
        Lb:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.f13276
            int r5 = r5.f13277
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
            int r1 = r2.f13277
            if (r0 >= r1) goto L13
            java.lang.Object[] r1 = r2.f13276
            r1 = r1[r0]
            boolean r1 = p000.ln0.m3626(r1, r3)
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
            int r0 = r0.f13277
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
            int r0 = r2.f13277
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            java.lang.Object[] r1 = r2.f13276
            r1 = r1[r0]
            boolean r1 = p000.ln0.m3626(r1, r3)
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
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            int r0 = r2.f13277
            if (r3 < 0) goto Lc
            if (r3 > r0) goto Lc
            le0 r0 = new le0
            r0.<init>(r2, r3)
            return r0
        Lc:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.m7228()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.mo4828(r1)
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
            r3.getClass()
            r2.m7228()
            int r0 = r2.f13277
            r1 = 0
            int r2 = r2.m7232(r1, r0, r3, r1)
            if (r2 <= 0) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.m7228()
            int r0 = r3.f13277
            r1 = 0
            r2 = 1
            int r3 = r3.m7232(r1, r0, r4, r2)
            if (r3 <= 0) goto L11
            return r2
        L11:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            r1.m7228()
            int r0 = r1.f13277
            if (r2 < 0) goto L10
            if (r2 >= r0) goto L10
            java.lang.Object[] r1 = r1.f13276
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L10:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r2, r0, r1, r3)
            p000.C1080.m7269(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.f13277
            p000.jx0.m3046(r8, r9, r0)
            yt0 r1 = new yt0
            java.lang.Object[] r2 = r7.f13276
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
            java.lang.Object[] r0 = r2.f13276
            r1 = 0
            int r2 = r2.f13277
            java.lang.Object[] r2 = p000.AbstractC0312g7.m2242(r0, r1, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.length
            int r1 = r4.f13277
            java.lang.Object[] r2 = r4.f13276
            r3 = 0
            if (r0 >= r1) goto L17
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            r4.getClass()
            return r4
        L17:
            p000.AbstractC0312g7.m2238(r2, r5, r3, r3, r1)
            int r4 = r4.f13277
            int r0 = r5.length
            if (r4 >= r0) goto L22
            r0 = 0
            r5[r4] = r0
        L22:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f13276
            r1 = 0
            int r2 = r3.f13277
            java.lang.String r3 = p000.AbstractC0073bd.m869(r0, r1, r2, r3)
            return r3
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: α */
    public final int mo4827() {
            r0 = this;
            int r0 = r0.f13277
            return r0
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo4828(int r3) {
            r2 = this;
            r2.m7228()
            int r0 = r2.f13277
            if (r3 < 0) goto Le
            if (r3 >= r0) goto Le
            java.lang.Object r2 = r2.m7230(r3)
            return r2
        Le:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m7226(int r5, java.util.Collection r6, int r7) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            r4.m7229(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Le:
            if (r0 >= r7) goto L1d
            java.lang.Object[] r1 = r4.f13276
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m7227(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.m7229(r3, r1)
            java.lang.Object[] r2 = r2.f13276
            r2[r3] = r4
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7228() {
            r0 = this;
            boolean r0 = r0.f13278
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public final void m7229(int r6, int r7) {
            r5 = this;
            int r0 = r5.f13277
            int r0 = r0 + r7
            if (r0 < 0) goto L36
            java.lang.Object[] r1 = r5.f13276
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
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            r5.f13276 = r0
        L27:
            java.lang.Object[] r0 = r5.f13276
            int r1 = r5.f13277
            int r2 = r6 + r7
            p000.AbstractC0312g7.m2238(r0, r0, r2, r6, r1)
            int r6 = r5.f13277
            int r6 = r6 + r7
            r5.f13277 = r6
            return
        L36:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object m7230(int r5) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.f13276
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.f13277
            p000.AbstractC0312g7.m2238(r0, r0, r5, r2, r3)
            java.lang.Object[] r5 = r4.f13276
            int r0 = r4.f13277
            int r0 = r0 + (-1)
            r5.getClass()
            r2 = 0
            r5[r0] = r2
            int r5 = r4.f13277
            int r5 = r5 + (-1)
            r4.f13277 = r5
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public final void m7231(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L8
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
        L8:
            java.lang.Object[] r0 = r3.f13276
            int r1 = r4 + r5
            int r2 = r3.f13277
            p000.AbstractC0312g7.m2238(r0, r0, r4, r1, r2)
            java.lang.Object[] r4 = r3.f13276
            int r0 = r3.f13277
            int r1 = r0 - r5
            p000.AbstractC0073bd.m868(r4, r1, r0)
            int r4 = r3.f13277
            int r4 = r4 - r5
            r3.f13277 = r4
            return
    }

    /* JADX INFO: renamed from: κ */
    public final int m7232(int r6, int r7, java.util.Collection r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object[] r2 = r5.f13276
            if (r0 >= r7) goto L20
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            java.lang.Object[] r2 = r5.f13276
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
            int r9 = r5.f13277
            int r6 = r6 + r1
            p000.AbstractC0312g7.m2238(r2, r2, r6, r7, r9)
            java.lang.Object[] r6 = r5.f13276
            int r7 = r5.f13277
            int r9 = r7 - r8
            p000.AbstractC0073bd.m868(r6, r9, r7)
            if (r8 <= 0) goto L3a
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
        L3a:
            int r6 = r5.f13277
            int r6 = r6 - r8
            r5.f13277 = r6
            return r8
    }
}
