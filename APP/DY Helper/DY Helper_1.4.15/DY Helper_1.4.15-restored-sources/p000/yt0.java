package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 extends p000.AbstractC1101 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object[] f12783;

    /* JADX INFO: renamed from: ζ */
    public final int f12784;

    /* JADX INFO: renamed from: η */
    public int f12785;

    /* JADX INFO: renamed from: θ */
    public final p000.yt0 f12786;

    /* JADX INFO: renamed from: ι */
    public final p000.zt0 f12787;

    public yt0(java.lang.Object[] r1, int r2, int r3, p000.yt0 r4, p000.zt0 r5) {
            r0 = this;
            r1.getClass()
            r5.getClass()
            r0.<init>()
            r0.f12783 = r1
            r0.f12784 = r2
            r0.f12785 = r3
            r0.f12786 = r4
            r0.f12787 = r5
            int r1 = p000.zt0.m7225(r5)
            r0.modCount = r1
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ int m7024(p000.yt0 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            r1.m7028()
            r1.m7027()
            int r0 = r1.f12785
            if (r2 < 0) goto L13
            if (r2 > r0) goto L13
            int r0 = r1.f12784
            int r0 = r0 + r2
            r1.m7026(r0, r3)
            return
        L13:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r2, r0, r1, r3)
            p000.C1080.m7269(r1)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.m7028()
            r2.m7027()
            int r0 = r2.f12784
            int r1 = r2.f12785
            int r0 = r0 + r1
            r2.m7026(r0, r3)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r4.getClass()
            r2.m7028()
            r2.m7027()
            int r0 = r2.f12785
            if (r3 < 0) goto L1f
            if (r3 > r0) goto L1f
            int r0 = r4.size()
            int r1 = r2.f12784
            int r1 = r1 + r3
            r2.m7025(r1, r4, r0)
            if (r0 <= 0) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
        L1f:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r4)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.m7028()
            r3.m7027()
            int r0 = r4.size()
            int r1 = r3.f12784
            int r2 = r3.f12785
            int r1 = r1 + r2
            r3.m7025(r1, r4, r0)
            if (r0 <= 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.m7028()
            r2.m7027()
            int r0 = r2.f12784
            int r1 = r2.f12785
            r2.m7030(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r6.m7027()
            if (r7 == r6) goto L2e
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.f12783
            int r2 = r6.f12785
            int r3 = r7.size()
            if (r2 == r3) goto L17
            goto L2d
        L17:
            r3 = r1
        L18:
            if (r3 >= r2) goto L2e
            int r4 = r6.f12784
            int r4 = r4 + r3
            r4 = r0[r4]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = p000.ln0.m3626(r4, r5)
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
    public final java.lang.Object get(int r3) {
            r2 = this;
            r2.m7027()
            int r0 = r2.f12785
            if (r3 < 0) goto L11
            if (r3 >= r0) goto L11
            java.lang.Object[] r0 = r2.f12783
            int r2 = r2.f12784
            int r2 = r2 + r3
            r2 = r0[r2]
            return r2
        L11:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r6.m7027()
            java.lang.Object[] r0 = r6.f12783
            int r1 = r6.f12785
            r2 = 1
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r1) goto L1f
            int r5 = r6.f12784
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
            r3.m7027()
            r0 = 0
        L4:
            int r1 = r3.f12785
            if (r0 >= r1) goto L19
            java.lang.Object[] r1 = r3.f12783
            int r2 = r3.f12784
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = p000.ln0.m3626(r1, r4)
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
            r0.m7027()
            int r0 = r0.f12785
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
            r3.m7027()
            int r0 = r3.f12785
            int r0 = r0 + (-1)
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.f12783
            int r2 = r3.f12784
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = p000.ln0.m3626(r1, r4)
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
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            r2.m7027()
            int r0 = r2.f12785
            if (r3 < 0) goto Lf
            if (r3 > r0) goto Lf
            le0 r0 = new le0
            r0.<init>(r2, r3)
            return r0
        Lf:
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
            r0.m7028()
            r0.m7027()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lf
            r0.mo4828(r1)
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
            r4.getClass()
            r3.m7028()
            r3.m7027()
            int r0 = r3.f12785
            int r1 = r3.f12784
            r2 = 0
            int r3 = r3.m7031(r1, r0, r4, r2)
            if (r3 <= 0) goto L16
            r3 = 1
            return r3
        L16:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.m7028()
            r3.m7027()
            int r0 = r3.f12785
            int r1 = r3.f12784
            r2 = 1
            int r3 = r3.m7031(r1, r0, r4, r2)
            if (r3 <= 0) goto L15
            return r2
        L15:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.m7028()
            r2.m7027()
            int r0 = r2.f12785
            if (r3 < 0) goto L18
            if (r3 >= r0) goto L18
            java.lang.Object[] r0 = r2.f12783
            int r2 = r2.f12784
            int r1 = r2 + r3
            r1 = r0[r1]
            int r2 = r2 + r3
            r0[r2] = r4
            return r1
        L18:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r4)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.f12785
            p000.jx0.m3046(r8, r9, r0)
            yt0 r1 = new yt0
            java.lang.Object[] r2 = r7.f12783
            int r0 = r7.f12784
            int r3 = r0 + r8
            int r4 = r9 - r8
            zt0 r6 = r7.f12787
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r2 = this;
            r2.m7027()
            java.lang.Object[] r0 = r2.f12783
            int r1 = r2.f12785
            int r2 = r2.f12784
            int r1 = r1 + r2
            java.lang.Object[] r2 = p000.AbstractC0312g7.m2242(r0, r2, r1)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            r4.m7027()
            int r0 = r5.length
            int r1 = r4.f12785
            java.lang.Object[] r2 = r4.f12783
            int r3 = r4.f12784
            if (r0 >= r1) goto L1c
            int r1 = r1 + r3
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            r4.getClass()
            return r4
        L1c:
            r0 = 0
            int r1 = r1 + r3
            p000.AbstractC0312g7.m2238(r2, r5, r0, r3, r1)
            int r4 = r4.f12785
            int r0 = r5.length
            if (r4 >= r0) goto L29
            r0 = 0
            r5[r4] = r0
        L29:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            r3.m7027()
            java.lang.Object[] r0 = r3.f12783
            int r1 = r3.f12784
            int r2 = r3.f12785
            java.lang.String r3 = p000.AbstractC0073bd.m869(r0, r1, r2, r3)
            return r3
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: α */
    public final int mo4827() {
            r0 = this;
            r0.m7027()
            int r0 = r0.f12785
            return r0
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo4828(int r3) {
            r2 = this;
            r2.m7028()
            r2.m7027()
            int r0 = r2.f12785
            if (r3 < 0) goto L14
            if (r3 >= r0) goto L14
            int r0 = r2.f12784
            int r0 = r0 + r3
            java.lang.Object r2 = r2.m7029(r0)
            return r2
        L14:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m7025(int r3, java.util.Collection r4, int r5) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            zt0 r0 = r2.f12787
            yt0 r1 = r2.f12786
            if (r1 == 0) goto L10
            r1.m7025(r3, r4, r5)
            goto L15
        L10:
            zt0 r1 = p000.zt0.f13275
            r0.m7226(r3, r4, r5)
        L15:
            java.lang.Object[] r3 = r0.f13276
            r2.f12783 = r3
            int r3 = r2.f12785
            int r3 = r3 + r5
            r2.f12785 = r3
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m7026(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            zt0 r0 = r2.f12787
            yt0 r1 = r2.f12786
            if (r1 == 0) goto L10
            r1.m7026(r3, r4)
            goto L15
        L10:
            zt0 r1 = p000.zt0.f13275
            r0.m7227(r3, r4)
        L15:
            java.lang.Object[] r3 = r0.f13276
            r2.f12783 = r3
            int r3 = r2.f12785
            int r3 = r3 + 1
            r2.f12785 = r3
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7027() {
            r1 = this;
            zt0 r0 = r1.f12787
            int r0 = p000.zt0.m7225(r0)
            int r1 = r1.modCount
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: η */
    public final void m7028() {
            r0 = this;
            zt0 r0 = r0.f12787
            boolean r0 = r0.f13278
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object m7029(int r2) {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            yt0 r0 = r1.f12786
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.m7029(r2)
            goto L17
        Lf:
            zt0 r0 = p000.zt0.f13275
            zt0 r0 = r1.f12787
            java.lang.Object r2 = r0.m7230(r2)
        L17:
            int r0 = r1.f12785
            int r0 = r0 + (-1)
            r1.f12785 = r0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final void m7030(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L8
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
        L8:
            yt0 r0 = r1.f12786
            if (r0 == 0) goto L10
            r0.m7030(r2, r3)
            goto L17
        L10:
            zt0 r0 = p000.zt0.f13275
            zt0 r0 = r1.f12787
            r0.m7231(r2, r3)
        L17:
            int r2 = r1.f12785
            int r2 = r2 - r3
            r1.f12785 = r2
            return
    }

    /* JADX INFO: renamed from: κ */
    public final int m7031(int r2, int r3, java.util.Collection r4, boolean r5) {
            r1 = this;
            yt0 r0 = r1.f12786
            if (r0 == 0) goto L9
            int r2 = r0.m7031(r2, r3, r4, r5)
            goto L11
        L9:
            zt0 r0 = p000.zt0.f13275
            zt0 r0 = r1.f12787
            int r2 = r0.m7232(r2, r3, r4, r5)
        L11:
            if (r2 <= 0) goto L19
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
        L19:
            int r3 = r1.f12785
            int r3 = r3 - r2
            r1.f12785 = r3
            return r2
    }
}
