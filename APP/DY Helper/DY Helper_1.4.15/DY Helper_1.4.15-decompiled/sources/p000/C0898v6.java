package p000;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0898v6 implements java.util.Collection, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object[] f11114;

    /* JADX INFO: renamed from: ζ */
    public final boolean f11115;

    public C0898v6(java.lang.Object[] r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11114 = r1
            r0.f11115 = r2
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f11114
            boolean r0 = p000.AbstractC0312g7.m2234(r0, r1)
            return r0
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
            java.lang.Object[] r2 = r3.f11114
            boolean r0 = p000.AbstractC0312g7.m2234(r2, r0)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L28:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            java.lang.Object[] r0 = r0.f11114
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
            r0 = this;
            java.lang.Object[] r0 = r0.f11114
            τ r0 = p000.h62.m2434(r0)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final int size() {
            r0 = this;
            java.lang.Object[] r0 = r0.f11114
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.f11114
            r0.getClass()
            boolean r2 = r2.f11115
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            if (r2 == 0) goto L16
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L16
            return r0
        L16:
            int r2 = r0.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2, r1)
            r2.getClass()
            return r2
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }
}
