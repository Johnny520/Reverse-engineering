package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class j1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f9932a;

    public j1(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f9932a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof p.j1
            if (r0 != 0) goto L8
            goto L12
        L8:
            p.j1 r2 = (p.j1) r2
            fg.l r2 = r2.f9932a
            fg.l r0 = r1.f9932a
            if (r0 != r2) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.k1 r0 = new p.k1
            p.c0 r1 = p.d.f9874c
            r0.<init>(r1)
            fg.l r1 = r2.f9932a
            r0.f9939x = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            p.k1 r3 = (p.k1) r3
            fg.l r0 = r3.f9939x
            fg.l r1 = r2.f9932a
            if (r0 == r1) goto L21
            r3.f9939x = r1
            p.s1 r0 = r3.f9940y
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.invoke(r0)
            p.r1 r0 = (p.r1) r0
            p.r1 r1 = r3.f9918w
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L21
            r3.f9918w = r0
            r3.l1()
        L21:
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f9932a
            int r0 = r0.hashCode()
            return r0
    }
}
