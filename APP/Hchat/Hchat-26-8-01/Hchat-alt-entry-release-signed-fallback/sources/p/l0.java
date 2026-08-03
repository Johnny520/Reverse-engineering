package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class l0 extends x1.x0 {
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p.l0
            if (r1 == 0) goto Lb
            p.l0 r3 = (p.l0) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.m0 r0 = new p.m0
            r1 = 1
            r0.<init>(r1)
            p.n0 r1 = p.n0.f9955g
            r0.f9948v = r1
            r1 = 1
            r0.f9949w = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.m0 r2 = (p.m0) r2
            p.n0 r0 = p.n0.f9955g
            r2.f9948v = r0
            r0 = 1
            r2.f9949w = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            p.n0 r0 = p.n0.f9955g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 1
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
