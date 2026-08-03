package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class k extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.c f9933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9934b;

    public k(y0.c r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f9933a = r1
            r0.f9934b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof p.k
            if (r0 == 0) goto La
            p.k r3 = (p.k) r3
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 != 0) goto Le
            goto L20
        Le:
            y0.c r0 = r2.f9933a
            y0.c r1 = r3.f9933a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L20
            boolean r0 = r2.f9934b
            boolean r3 = r3.f9934b
            if (r0 != r3) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.l r0 = new p.l
            r0.<init>()
            y0.c r1 = r2.f9933a
            r0.f9941u = r1
            boolean r1 = r2.f9934b
            r0.f9942v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.l r2 = (p.l) r2
            y0.c r0 = r1.f9933a
            r2.f9941u = r0
            boolean r0 = r1.f9934b
            r2.f9942v = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            y0.c r0 = r2.f9933a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f9934b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
