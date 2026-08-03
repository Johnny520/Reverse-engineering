package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements java.util.Collection, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f13160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13161h;

    public j(java.lang.Object[] r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f13160g = r1
            r0.f13161h = r2
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f13160g
            boolean r2 = tf.l.m0(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            java.lang.Object[] r2 = r3.f13160g
            boolean r0 = tf.l.m0(r2, r0)
            if (r0 != 0) goto L14
            r4 = 0
            return r4
        L28:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object[] r0 = r1.f13160g
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            java.lang.Object[] r0 = r2.f13160g
            r0.getClass()
            gg.b r1 = new gg.b
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.f13160g
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.f13160g
            r0.getClass()
            boolean r1 = r3.f13161h
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            if (r1 == 0) goto L16
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            r0.getClass()
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }
}
