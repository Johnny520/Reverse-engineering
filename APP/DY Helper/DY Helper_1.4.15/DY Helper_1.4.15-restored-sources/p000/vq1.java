package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 implements java.util.Set, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.c21 f11364;

    public vq1(p000.c21 r1) {
            r0 = this;
            r0.<init>()
            r0.f11364 = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            c21 r0 = r0.f11364
            boolean r0 = r0.m1109(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            c21 r2 = r3.f11364
            boolean r0 = r2.m1109(r0)
            if (r0 != 0) goto L15
            r3 = 0
            return r3
        L29:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            c21 r0 = r0.f11364
            boolean r0 = r0.m1113()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            oz r0 = new oz
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2)
            ts1 r3 = p000.e81.m1879(r0)
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            c21 r0 = r0.f11364
            int r0 = r0.f1944
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }
}
