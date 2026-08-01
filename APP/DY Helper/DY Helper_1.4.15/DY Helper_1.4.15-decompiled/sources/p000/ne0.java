package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ne0 implements java.util.List, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.v11 f7580;

    /* JADX INFO: renamed from: ζ */
    public final p000.q11 f7581;

    /* JADX INFO: renamed from: η */
    public int f7582;

    public ne0() {
            r2 = this;
            r2.<init>()
            v11 r0 = new v11
            r1 = 16
            r0.<init>(r1)
            r2.f7580 = r0
            q11 r0 = new q11
            r0.<init>(r1)
            r2.f7581 = r0
            r0 = -1
            r2.f7582 = r0
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ void addFirst(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ void addLast(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            r0 = -1
            r1.f7582 = r0
            v11 r0 = r1.f7580
            r0.m6018()
            q11 r1 = r1.f7581
            r0 = 0
            r1.f8794 = r0
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.q01
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            q01 r3 = (p000.q01) r3
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            q01 r0 = (p000.q01) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            v11 r0 = r0.f7580
            java.lang.Object r0 = r0.m6020(r1)
            r0.getClass()
            q01 r0 = (p000.q01) r0
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p000.q01
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            q01 r5 = (p000.q01) r5
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L23
            r2 = 0
        L11:
            v11 r3 = r4.f7580
            java.lang.Object r3 = r3.m6020(r2)
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L1e
            return r2
        L1e:
            if (r2 == r0) goto L23
            int r2 = r2 + 1
            goto L11
        L23:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            v11 r0 = r0.f7580
            boolean r0 = r0.m6022()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            le0 r0 = new le0
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p000.q01
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            q01 r4 = (p000.q01) r4
            int r0 = r3.size()
            int r0 = r0 + (-1)
        Le:
            if (r1 >= r0) goto L20
            v11 r2 = r3.f7580
            java.lang.Object r2 = r2.m6020(r0)
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + (-1)
            goto Le
        L20:
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            le0 r0 = new le0
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            le0 r0 = new le0
            r1 = 6
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            v11 r0 = r0.f7580
            int r0 = r0.f11065
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            me0 r0 = new me0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final long m4036() {
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = p000.kn0.m3360(r0, r1, r1)
            int r2 = r7.f7582
            int r2 = r2 + 1
            v11 r3 = r7.f7580
            int r3 = r3.f11065
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            q11 r4 = r7.f7581
            if (r2 < 0) goto L3c
            int r5 = r4.f8794
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f8793
            r4 = r4[r2]
            int r6 = p000.AbstractC0978xb.m6587(r4, r0)
            if (r6 >= 0) goto L26
            r0 = r4
        L26:
            float r4 = p000.AbstractC0978xb.m6558(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = p000.AbstractC0978xb.m6567(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r7 = "Index must be between 0 and size"
            p000.C1080.m7269(r7)
            r0 = 0
        L46:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m4037(int r3, int r4) {
            r2 = this;
            if (r3 < r4) goto L3
            goto L25
        L3:
            v11 r0 = r2.f7580
            r0.m6026(r3, r4)
            q11 r2 = r2.f7581
            if (r3 < 0) goto L2c
            int r0 = r2.f8794
            if (r3 > r0) goto L2f
            if (r4 < 0) goto L2f
            if (r4 > r0) goto L2f
            if (r4 < r3) goto L26
            if (r4 == r3) goto L25
            if (r4 >= r0) goto L1f
            long[] r1 = r2.f8793
            p000.AbstractC0312g7.m2237(r1, r1, r3, r4, r0)
        L1f:
            int r0 = r2.f8794
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f8794 = r0
        L25:
            return
        L26:
            java.lang.String r2 = "The end index must be < start index"
            p000.C1080.m7275(r2)
            return
        L2c:
            r2.getClass()
        L2f:
            java.lang.String r2 = "Index must be between 0 and size"
            p000.C1080.m7269(r2)
            return
    }
}
