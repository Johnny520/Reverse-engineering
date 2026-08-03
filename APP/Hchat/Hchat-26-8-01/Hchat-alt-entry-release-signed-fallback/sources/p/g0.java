package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.s0 f9899a;

    public g0(p.s0 r1) {
            r0 = this;
            r0.<init>()
            r0.f9899a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p.g0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            p.g0 r2 = (p.g0) r2
            p.s0 r2 = r2.f9899a
            p.s0 r0 = r1.f9899a
            boolean r2 = r2.equals(r0)
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.i0 r0 = new p.i0
            p.s0 r1 = r2.f9899a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            p.i0 r3 = (p.i0) r3
            p.r1 r0 = r3.f9918w
            p.s0 r1 = r2.f9899a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L11
            r3.f9918w = r1
            r3.l1()
        L11:
            return
    }

    public final int hashCode() {
            r1 = this;
            p.s0 r0 = r1.f9899a
            int r0 = r0.hashCode()
            return r0
    }
}
