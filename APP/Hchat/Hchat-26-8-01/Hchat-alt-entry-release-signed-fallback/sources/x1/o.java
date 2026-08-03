package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements java.util.List, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1.p f21006i;

    public o(x1.p r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f21006i = r1
            r0.f21004g = r2
            r0.f21005h = r3
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof y0.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            y0.n r3 = (y0.n) r3
            int r3 = r2.indexOf(r3)
            r0 = -1
            if (r3 == r0) goto L11
            r3 = 1
            return r3
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
            y0.n r0 = (y0.n) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            x1.p r0 = r2.f21006i
            f.f0 r0 = r0.f21015g
            int r1 = r2.f21004g
            int r3 = r3 + r1
            java.lang.Object r3 = r0.f(r3)
            r3.getClass()
            y0.n r3 = (y0.n) r3
            return r3
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof y0.n
            if (r0 != 0) goto L5
            goto L23
        L5:
            y0.n r5 = (y0.n) r5
            int r0 = r4.f21004g
            int r1 = r4.f21005h
            if (r0 > r1) goto L23
            r2 = r0
        Le:
            x1.p r3 = r4.f21006i
            f.f0 r3 = r3.f21015g
            java.lang.Object r3 = r3.f(r2)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L1e
            int r2 = r2 - r0
            return r2
        L1e:
            if (r2 == r1) goto L23
            int r2 = r2 + 1
            goto Le
        L23:
            r5 = -1
            return r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            uf.a r0 = new uf.a
            int r1 = r4.f21004g
            int r2 = r4.f21005h
            x1.p r3 = r4.f21006i
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof y0.n
            if (r0 != 0) goto L5
            goto L22
        L5:
            y0.n r4 = (y0.n) r4
            int r0 = r3.f21005h
            int r1 = r3.f21004g
            if (r1 > r0) goto L22
        Ld:
            x1.p r2 = r3.f21006i
            f.f0 r2 = r2.f21015g
            java.lang.Object r2 = r2.f(r0)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L1d
            int r0 = r0 - r1
            return r0
        L1d:
            if (r0 == r1) goto L22
            int r0 = r0 + (-1)
            goto Ld
        L22:
            r4 = -1
            return r4
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r4 = this;
            uf.a r0 = new uf.a
            int r1 = r4.f21004g
            int r2 = r4.f21005h
            x1.p r3 = r4.f21006i
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r5) {
            r4 = this;
            uf.a r0 = new uf.a
            int r1 = r4.f21004g
            int r5 = r5 + r1
            int r2 = r4.f21005h
            x1.p r3 = r4.f21006i
            r0.<init>(r3, r5, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r2 = this;
            int r0 = r2.f21005h
            int r1 = r2.f21004g
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            x1.o r0 = new x1.o
            int r1 = r2.f21004g
            int r3 = r3 + r1
            int r1 = r1 + r4
            x1.p r4 = r2.f21006i
            r0.<init>(r4, r3, r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }
}
