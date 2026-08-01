package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 implements java.util.Map, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.b21 f3318;

    /* JADX INFO: renamed from: ζ */
    public p000.C0705pz f3319;

    /* JADX INFO: renamed from: η */
    public p000.C0705pz f3320;

    /* JADX INFO: renamed from: θ */
    public p000.j12 f3321;

    public dx0(p000.b21 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3318 = r1
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object r1, java.util.function.Function r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            b21 r0 = r0.f3318
            boolean r0 = r0.m691(r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            b21 r0 = r0.f3318
            boolean r0 = r0.m692(r1)
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r3 = this;
            pz r0 = r3.f3319
            if (r0 == 0) goto L5
            return r0
        L5:
            pz r0 = new pz
            b21 r1 = r3.f3318
            r2 = 0
            r0.<init>(r1, r2)
            r3.f3319 = r0
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<dx0> r0 = p000.dx0.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            dx0 r3 = (p000.dx0) r3
            b21 r2 = r2.f3318
            b21 r3 = r3.f3318
            boolean r2 = p000.ln0.m3626(r2, r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            b21 r0 = r0.f3318
            java.lang.Object r0 = r0.m695(r1)
            return r0
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            b21 r0 = r0.f3318
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            b21 r0 = r0.f3318
            boolean r0 = r0.m697()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r3 = this;
            pz r0 = r3.f3320
            if (r0 == 0) goto L5
            return r0
        L5:
            pz r0 = new pz
            b21 r1 = r3.f3318
            r2 = 1
            r0.<init>(r1, r2)
            r3.f3320 = r0
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object r1, java.lang.Object r2, java.util.function.BiFunction r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            b21 r0 = r0.f3318
            int r0 = r0.f1431
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            b21 r0 = r0.f3318
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            j12 r0 = r2.f3321
            if (r0 == 0) goto L5
            return r0
        L5:
            j12 r0 = new j12
            b21 r1 = r2.f3318
            r0.<init>(r1)
            r2.f3321 = r0
            return r0
    }
}
