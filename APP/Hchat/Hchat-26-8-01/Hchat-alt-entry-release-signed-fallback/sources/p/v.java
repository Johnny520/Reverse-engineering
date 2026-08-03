package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f10022a;

    public v(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f10022a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.v r4 = (p.v) r4
            fg.l r4 = r4.f10022a
            fg.l r1 = r3.f10022a
            if (r4 != r1) goto L13
            return r0
        L13:
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.w r0 = new p.w
            r0.<init>()
            fg.l r1 = r2.f10022a
            r0.f10029w = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            p.w r3 = (p.w) r3
            fg.l r0 = r3.f10029w
            fg.l r1 = r2.f10022a
            if (r1 == r0) goto La
            r3.f10029w = r1
        La:
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f10022a
            int r0 = r0.hashCode()
            return r0
    }
}
