package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements java.util.List, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0.p f12036g;

    public j0() {
            r1 = this;
            w0.p r0 = new w0.p
            r0.<init>()
            r1.<init>()
            r1.f12036g = r0
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
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof s.h0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            s.h0 r2 = (s.h0) r2
            w0.p r0 = r1.f12036g
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            w0.p r0 = r1.f12036g
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            w0.p r0 = r1.f12036g
            java.lang.Object r2 = r0.get(r2)
            s.h0 r2 = (s.h0) r2
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof s.h0
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            s.h0 r2 = (s.h0) r2
            w0.p r0 = r1.f12036g
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            w0.p r0 = r1.f12036g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            w0.p r0 = r1.f12036g
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof s.h0
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            s.h0 r2 = (s.h0) r2
            w0.p r0 = r1.f12036g
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            w0.p r0 = r1.f12036g
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            w0.p r0 = r2.f12036g
            r0.getClass()
            uf.a r1 = new uf.a
            r1.<init>(r0, r3)
            return r1
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
            r1 = this;
            w0.p r0 = r1.f12036g
            int r0 = r0.size()
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
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            w0.p r0 = r1.f12036g
            java.util.List r2 = r0.subList(r2, r3)
            return r2
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
