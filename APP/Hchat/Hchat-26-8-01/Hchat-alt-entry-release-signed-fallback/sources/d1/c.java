package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class c extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f1908a;

    public c(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f1908a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof d1.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d1.c r4 = (d1.c) r4
            fg.l r4 = r4.f1908a
            fg.l r1 = r3.f1908a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            d1.e r0 = new d1.e
            r0.<init>()
            fg.l r1 = r2.f1908a
            r0.f1912u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            d1.e r2 = (d1.e) r2
            fg.l r0 = r1.f1908a
            r2.f1912u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f1908a
            int r0 = r0.hashCode()
            return r0
    }
}
