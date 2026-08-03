package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class j extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f984a;

    public j(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f984a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof c1.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c1.j r4 = (c1.j) r4
            fg.l r4 = r4.f984a
            fg.l r1 = r3.f984a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            c1.k r0 = new c1.k
            r0.<init>()
            fg.l r1 = r2.f984a
            r0.f985u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            c1.k r2 = (c1.k) r2
            fg.l r0 = r1.f984a
            r2.f985u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f984a
            int r0 = r0.hashCode()
            return r0
    }
}
