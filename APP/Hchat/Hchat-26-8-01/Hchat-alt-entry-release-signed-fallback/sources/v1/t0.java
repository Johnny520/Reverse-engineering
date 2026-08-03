package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class t0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f14045a;

    public t0(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f14045a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof v1.t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v1.t0 r4 = (v1.t0) r4
            fg.l r4 = r4.f14045a
            fg.l r1 = r3.f14045a
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            v1.u0 r0 = new v1.u0
            r0.<init>()
            fg.l r1 = r2.f14045a
            r0.f14047u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            v1.u0 r2 = (v1.u0) r2
            fg.l r0 = r1.f14045a
            r2.f14047u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f14045a
            int r0 = r0.hashCode()
            return r0
    }
}
