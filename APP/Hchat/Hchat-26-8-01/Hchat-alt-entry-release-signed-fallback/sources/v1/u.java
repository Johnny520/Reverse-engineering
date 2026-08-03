package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class u extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.q f14046a;

    public u(fg.q r1) {
            r0 = this;
            r0.<init>()
            r0.f14046a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof v1.u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v1.u r4 = (v1.u) r4
            fg.q r4 = r4.f14046a
            fg.q r1 = r3.f14046a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            v1.z r0 = new v1.z
            r0.<init>()
            fg.q r1 = r2.f14046a
            r0.f14056u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            v1.z r2 = (v1.z) r2
            fg.q r0 = r1.f14046a
            r2.f14056u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.q r0 = r1.f14046a
            int r0 = r0.hashCode()
            return r0
    }
}
