package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class x1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.i2 f7104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.p1 f7105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m.p f7107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n.k f7108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k.k1 f7110g;

    public x1(k.k1 r1, m.p r2, m.p1 r3, m.i2 r4, n.k r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.f7104a = r4
            r0.f7105b = r3
            r0.f7106c = r6
            r0.f7107d = r2
            r0.f7108e = r5
            r0.f7109f = r7
            r0.f7110g = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L51
        L3:
            if (r3 == 0) goto L53
            java.lang.Class<k.x1> r0 = k.x1.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L53
        Le:
            k.x1 r3 = (k.x1) r3
            m.i2 r0 = r2.f7104a
            m.i2 r1 = r3.f7104a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1b
            goto L53
        L1b:
            m.p1 r0 = r2.f7105b
            m.p1 r1 = r3.f7105b
            if (r0 == r1) goto L22
            goto L53
        L22:
            boolean r0 = r2.f7106c
            boolean r1 = r3.f7106c
            if (r0 == r1) goto L29
            goto L53
        L29:
            m.p r0 = r2.f7107d
            m.p r1 = r3.f7107d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L34
            goto L53
        L34:
            n.k r0 = r2.f7108e
            n.k r1 = r3.f7108e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3f
            goto L53
        L3f:
            boolean r0 = r2.f7109f
            boolean r1 = r3.f7109f
            if (r0 == r1) goto L46
            goto L53
        L46:
            k.k1 r0 = r2.f7110g
            k.k1 r3 = r3.f7110g
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L51
            goto L53
        L51:
            r3 = 1
            return r3
        L53:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            k.y1 r0 = new k.y1
            r0.<init>()
            m.i2 r1 = r2.f7104a
            r0.f7112w = r1
            m.p1 r1 = r2.f7105b
            r0.f7113x = r1
            boolean r1 = r2.f7106c
            r0.f7114y = r1
            m.p r1 = r2.f7107d
            r0.f7115z = r1
            n.k r1 = r2.f7108e
            r0.A = r1
            boolean r1 = r2.f7109f
            r0.B = r1
            k.k1 r1 = r2.f7110g
            r0.C = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            r0 = r9
            k.y1 r0 = (k.y1) r0
            m.p r2 = r8.f7107d
            n.k r5 = r8.f7108e
            k.k1 r1 = r8.f7110g
            m.p1 r3 = r8.f7105b
            m.i2 r4 = r8.f7104a
            boolean r6 = r8.f7109f
            boolean r7 = r8.f7106c
            r0.p1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r4 = this;
            m.i2 r0 = r4.f7104a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            m.p1 r2 = r4.f7105b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f7106c
            int r0 = eh.a.h(r2, r1, r0)
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            m.p r3 = r4.f7107d
            if (r3 == 0) goto L25
            int r3 = r3.hashCode()
            goto L26
        L25:
            r3 = r2
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            n.k r3 = r4.f7108e
            if (r3 == 0) goto L31
            int r3 = r3.hashCode()
            goto L32
        L31:
            r3 = r2
        L32:
            int r0 = r0 + r3
            int r0 = r0 * 961
            boolean r3 = r4.f7109f
            int r0 = eh.a.h(r0, r1, r3)
            k.k1 r1 = r4.f7110g
            if (r1 == 0) goto L43
            int r2 = r1.hashCode()
        L43:
            int r0 = r0 + r2
            return r0
    }
}
