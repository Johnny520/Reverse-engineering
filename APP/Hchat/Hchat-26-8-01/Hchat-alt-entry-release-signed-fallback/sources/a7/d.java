package a7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a7.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Object f72r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f73s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.lang.String f74t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.String f75u;

    public d(java.lang.String r1, c7.f r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f72r = r1
            r1 = 0
            r0.f63i = r1
            r1 = 1
            r0.f64j = r1
            return
    }

    @Override // a7.c
    public final l7.l e() {
            r1 = this;
            l7.l r0 = r1.f65k
            t7.a r0 = (t7.a) r0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            java.lang.Class<a7.d> r0 = a7.d.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            r3 = 0
            return r3
        Le:
            a7.d r3 = (a7.d) r3
            java.lang.String r0 = r2.s()
            java.lang.String r3 = r3.s()
            boolean r3 = r0.equals(r3)
            return r3
    }

    @Override // a7.c
    public final l7.l g() {
            r1 = this;
            l7.l r0 = super.g()
            t7.a r0 = (t7.a) r0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class<a7.d> r0 = a7.d.class
            java.lang.String r1 = r2.s()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    @Override // a7.c
    public final l7.l o() {
            r5 = this;
            java.lang.String r0 = "resources.arsc"
            c7.f r1 = r5.f62h
            c7.e r0 = r1.b(r0)
            if (r0 == 0) goto L30
            java.io.InputStream r2 = r0.b()
            t7.a r3 = new t7.a
            r3.<init>()
            q7.b r4 = new q7.b
            r4.<init>(r2)
            r3.G(r4)
            r3.f7888r = r5
            c7.d r2 = new c7.d
            java.lang.String r4 = r0.f1036a
            r2.<init>(r4, r3)
            int r4 = r0.f1038c
            r2.f1038c = r4
            int r0 = r0.f1039d
            r2.f1039d = r0
            r1.a(r2)
            return r3
        L30:
            java.lang.String r0 = "Entry not found: resources.arsc"
            j8.o.y(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String s() {
            r2 = this;
            r2.x()
            java.lang.String r0 = r2.f75u
            if (r0 != 0) goto La
            r2.w()
        La:
            java.lang.String r0 = r2.f75u
            if (r0 != 0) goto L11
            java.lang.String r0 = ""
            return r0
        L11:
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = bc.e.n(r0, r1)
            int r1 = r2.u()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final t7.a t() {
            r1 = this;
            l7.l r0 = super.g()
            t7.a r0 = (t7.a) r0
            return r0
    }

    @Override // a7.c
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.s()
            return r0
    }

    public final int u() {
            r1 = this;
            int r0 = r1.f73s
            if (r0 != 0) goto L7
            r1.w()
        L7:
            int r0 = r1.f73s
            return r0
    }

    public final void w() {
            r3 = this;
            m7.a r0 = r3.f67m
            if (r0 != 0) goto Le
            c7.f r0 = r3.f62h
            java.lang.String r1 = "AndroidManifest.xml"
            c7.e r0 = r0.b(r1)
            if (r0 == 0) goto L38
        Le:
            m7.a r0 = r3.c()
            r1 = 16843291(0x101021b, float:2.369507E-38)
            java.lang.Integer r1 = r0.V(r1)
            if (r1 == 0) goto L21
            int r1 = r1.intValue()
            r3.f73s = r1
        L21:
            java.lang.String r1 = r3.f74t
            if (r1 != 0) goto L2e
            r1 = 16843292(0x101021c, float:2.3695071E-38)
            java.lang.String r1 = r0.W(r1)
            r3.f74t = r1
        L2e:
            java.lang.String r1 = r3.f75u
            if (r1 != 0) goto L38
            java.lang.String r0 = r0.X()
            r3.f75u = r0
        L38:
            boolean r0 = r3.i()
            if (r0 == 0) goto L70
            l7.l r0 = super.g()
            t7.a r0 = (t7.a) r0
            boolean r1 = r0.d0()
            if (r1 == 0) goto L60
            int r1 = r3.f73s
            if (r1 != 0) goto L60
            int r1 = r0.c0()
            if (r1 == 0) goto L60
            r3.f73s = r1
            java.lang.String r2 = r3.f74t
            if (r2 != 0) goto L60
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.f74t = r1
        L60:
            java.lang.String r1 = r3.f75u
            if (r1 != 0) goto L70
            l7.f r0 = r0.Z()
            if (r0 == 0) goto L70
            java.lang.String r0 = r0.V()
            r3.f75u = r0
        L70:
            return
    }

    public final boolean x() {
            r2 = this;
            java.lang.Object r0 = r2.f72r
            monitor-enter(r0)
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            return r1
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }
}
