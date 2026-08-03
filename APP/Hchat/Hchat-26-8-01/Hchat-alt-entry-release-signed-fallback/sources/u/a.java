package u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class a extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.k f13330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.i f13332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.l f13333e;

    public a(f2.i r1, fg.l r2, n.k r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f13329a = r4
            r0.f13330b = r3
            r0.f13331c = r5
            r0.f13332d = r1
            r0.f13333e = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            if (r3 != 0) goto L6
            goto L3b
        L6:
            java.lang.Class<u.a> r0 = u.a.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L3b
        Lf:
            u.a r3 = (u.a) r3
            boolean r0 = r2.f13329a
            boolean r1 = r3.f13329a
            if (r0 == r1) goto L18
            goto L3b
        L18:
            n.k r0 = r2.f13330b
            n.k r1 = r3.f13330b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L23
            goto L3b
        L23:
            boolean r0 = r2.f13331c
            boolean r1 = r3.f13331c
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            f2.i r0 = r2.f13332d
            f2.i r1 = r3.f13332d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L3b
        L35:
            fg.l r0 = r2.f13333e
            fg.l r3 = r3.f13333e
            if (r0 == r3) goto L3d
        L3b:
            r3 = 0
            return r3
        L3d:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r6 = this;
            u.d r0 = new u.d
            f2.i r1 = r6.f13332d
            fg.l r2 = r6.f13333e
            n.k r3 = r6.f13330b
            boolean r4 = r6.f13329a
            boolean r5 = r6.f13331c
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            r0 = r9
            u.d r0 = (u.d) r0
            boolean r9 = r0.T
            boolean r1 = r8.f13329a
            if (r9 == r1) goto Le
            r0.T = r1
            x1.k.n(r0)
        Le:
            fg.l r9 = r8.f13333e
            r0.U = r9
            r5 = 0
            i.e0 r7 = r0.V
            n.k r1 = r8.f13330b
            r2 = 0
            r3 = 1
            boolean r4 = r8.f13331c
            f2.i r6 = r8.f13332d
            r0.z1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f13329a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            n.k r2 = r3.f13330b
            if (r2 == 0) goto L12
            int r2 = r2.hashCode()
            goto L13
        L12:
            r2 = 0
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 961
            r2 = 1
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f13331c
            int r0 = eh.a.h(r0, r1, r2)
            f2.i r2 = r3.f13332d
            int r2 = r2.f3155a
            int r0 = eh.a.e(r2, r0, r1)
            fg.l r1 = r3.f13333e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
