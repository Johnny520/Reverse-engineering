package p000;

/* JADX INFO: renamed from: μ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089 implements java.util.Collection, p000.lo0 {
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

    @Override // java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        L1e:
            return r1
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L25
        Lf:
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L13
            r1 = 0
            return r1
        L25:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r0 = this;
            int r0 = r0.mo2340()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.mo2340()
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            θ r5 = new θ
            r0 = 1
            r5.<init>(r0, r7)
            r6 = 24
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r0 = r7
            java.lang.String r7 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: α */
    public abstract int mo2340();
}
