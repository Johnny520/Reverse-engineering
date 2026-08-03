package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements java.util.Map, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.k0 f2900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.h f2901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f.h f2902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f.u0 f2903j;

    public t(f.k0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2900g = r1
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object r1, java.util.function.Function r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            f.k0 r0 = r1.f2900g
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r2) {
            r1 = this;
            f.k0 r0 = r1.f2900g
            boolean r2 = r0.d(r2)
            return r2
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r3 = this;
            f.h r0 = r3.f2901h
            if (r0 == 0) goto L5
            return r0
        L5:
            f.h r0 = new f.h
            f.k0 r1 = r3.f2900g
            r2 = 0
            r0.<init>(r1, r2)
            r3.f2901h = r0
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<f.t> r0 = f.t.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            f.t r3 = (f.t) r3
            f.k0 r0 = r2.f2900g
            f.k0 r3 = r3.f2900g
            boolean r3 = gg.l.a(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            f.k0 r0 = r1.f2900g
            java.lang.Object r2 = r0.g(r2)
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            f.k0 r0 = r1.f2900g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            f.k0 r0 = r1.f2900g
            boolean r0 = r0.i()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r3 = this;
            f.h r0 = r3.f2902i
            if (r0 == 0) goto L5
            return r0
        L5:
            f.h r0 = new f.h
            f.k0 r1 = r3.f2900g
            r2 = 1
            r0.<init>(r1, r2)
            r3.f2902i = r0
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object r1, java.lang.Object r2, java.util.function.BiFunction r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            f.k0 r0 = r1.f2900g
            int r0 = r0.f2852e
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            f.k0 r0 = r1.f2900g
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            f.u0 r0 = r2.f2903j
            if (r0 == 0) goto L5
            return r0
        L5:
            f.u0 r0 = new f.u0
            f.k0 r1 = r2.f2900g
            r0.<init>(r1)
            r2.f2903j = r0
            return r0
    }
}
