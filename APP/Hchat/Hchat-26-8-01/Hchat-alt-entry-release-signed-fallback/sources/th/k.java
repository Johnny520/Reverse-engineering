package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class k extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th.j f13324a;

    public k(th.j r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f13324a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof th.k
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            th.k r2 = (th.k) r2
            th.j r2 = r2.f13324a
            th.j r0 = r1.f13324a
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            th.l r0 = new th.l
            th.j r1 = r2.f13324a
            r1.getClass()
            r0.<init>()
            r0.f13325u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            th.l r4 = (th.l) r4
            r4.getClass()
            th.j r0 = r4.f13325u
            th.j r1 = r3.f13324a
            if (r0 == r1) goto L16
            r2 = 0
            i0.j1 r0 = r0.f13320c
            r0.setValue(r2)
            r1.getClass()
            r4.f13325u = r1
        L16:
            x1.k.l(r4)
            return
    }

    public final int hashCode() {
            r1 = this;
            th.j r0 = r1.f13324a
            int r0 = r0.hashCode()
            return r0
    }
}
