package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class p0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.k f7034a;

    public p0(n.k r1) {
            r0 = this;
            r0.<init>()
            r0.f7034a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof k.p0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k.p0 r4 = (k.p0) r4
            n.k r4 = r4.f7034a
            n.k r1 = r3.f7034a
            boolean r4 = gg.l.a(r4, r1)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            k.t0 r0 = new k.t0
            r0.<init>()
            n.k r1 = r2.f7034a
            r0.f7069u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            k.t0 r3 = (k.t0) r3
            n.k r0 = r3.f7069u
            n.k r1 = r2.f7034a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L11
            r3.m1()
            r3.f7069u = r1
        L11:
            return
    }

    public final int hashCode() {
            r1 = this;
            n.k r0 = r1.f7034a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
