package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class i extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f983a;

    public i(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f983a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof c1.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c1.i r4 = (c1.i) r4
            fg.l r4 = r4.f983a
            fg.l r1 = r3.f983a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            c1.c r0 = new c1.c
            c1.d r1 = new c1.d
            r1.<init>()
            fg.l r2 = r3.f983a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            c1.c r2 = (c1.c) r2
            fg.l r0 = r1.f983a
            r2.f978w = r0
            r2.k1()
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f983a
            int r0 = r0.hashCode()
            return r0
    }
}
