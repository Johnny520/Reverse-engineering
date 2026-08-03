package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f14049a;

    public v0(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f14049a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof v1.v0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v1.v0 r4 = (v1.v0) r4
            fg.l r4 = r4.f14049a
            fg.l r1 = r3.f14049a
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r7 = this;
            v1.w0 r0 = new v1.w0
            r0.<init>()
            fg.l r1 = r7.f14049a
            r0.f14052u = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            long r1 = (long) r1
            r3 = 32
            long r3 = r1 << r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = r1 | r3
            r0.f14053v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r7) {
            r6 = this;
            v1.w0 r7 = (v1.w0) r7
            fg.l r0 = r6.f14049a
            r7.f14052u = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            long r0 = (long) r0
            r2 = 32
            long r2 = r0 << r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r7.f14053v = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f14049a
            int r0 = r0.hashCode()
            return r0
    }
}
