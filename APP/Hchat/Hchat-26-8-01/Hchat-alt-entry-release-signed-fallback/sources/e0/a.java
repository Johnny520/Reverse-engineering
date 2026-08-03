package e0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class a extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.a f2278a;

    public a(fg.a r1) {
            r0 = this;
            r0.<init>()
            r0.f2278a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof e0.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e0.a r4 = (e0.a) r4
            fg.a r4 = r4.f2278a
            fg.a r1 = r3.f2278a
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            e0.d r0 = new e0.d
            fg.a r1 = r2.f2278a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            e0.d r2 = (e0.d) r2
            fg.a r0 = r1.f2278a
            r2.f2286w = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.a r0 = r1.f2278a
            int r0 = r0.hashCode()
            return r0
    }
}
