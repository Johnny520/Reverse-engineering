package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.Map.Entry, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uf.g f13780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13782i;

    public f(uf.g r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f13780g = r1
            r0.f13781h = r2
            int r1 = r1.f13791n
            r0.f13782i = r1
            return
    }

    public final void a() {
            r2 = this;
            uf.g r0 = r2.f13780g
            int r0 = r0.f13791n
            int r1 = r2.f13782i
            if (r0 != r1) goto L9
            return
        L9:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            java.lang.String r1 = "The backing map has been modified after this entry was obtained."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L24
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.getKey()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r0 = r2.getValue()
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r2 = this;
            r2.a()
            uf.g r0 = r2.f13780g
            java.lang.Object[] r0 = r0.f13784g
            int r1 = r2.f13781h
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            r2.a()
            uf.g r0 = r2.f13780g
            java.lang.Object[] r0 = r0.f13785h
            r0.getClass()
            int r1 = r2.f13781h
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.Object r2 = r3.getValue()
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r4) {
            r3 = this;
            r3.a()
            uf.g r0 = r3.f13780g
            r0.d()
            java.lang.Object[] r1 = r0.f13785h
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r1 = r0.f13784g
            int r1 = r1.length
            if (r1 < 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f13785h = r1
        L16:
            int r0 = r3.f13781h
            r2 = r1[r0]
            r1[r0] = r4
            return r2
        L1d:
            java.lang.String r4 = "capacity must be non-negative."
            j8.o.t(r4)
            r4 = 0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
