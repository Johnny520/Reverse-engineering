package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class z extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.k f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.a f7117b;

    public z(fg.a r1, n.k r2) {
            r0 = this;
            r0.<init>()
            r0.f7116a = r2
            r0.f7117b = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto L23
        L7:
            java.lang.Class<k.z> r1 = k.z.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L23
        L10:
            k.z r4 = (k.z) r4
            n.k r1 = r3.f7116a
            n.k r2 = r4.f7116a
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L1d
            goto L23
        L1d:
            fg.a r1 = r3.f7117b
            fg.a r4 = r4.f7117b
            if (r1 == r4) goto L25
        L23:
            r4 = 0
            return r4
        L25:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            k.b0 r0 = new k.b0
            fg.a r1 = r3.f7117b
            n.k r2 = r3.f7116a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r11) {
            r10 = this;
            r0 = r11
            k.b0 r0 = (k.b0) r0
            r0.getClass()
            boolean r11 = r0.B
            r8 = 1
            r4 = 1
            r9 = 0
            if (r11 == r4) goto Lf
            r11 = r8
            goto L10
        Lf:
            r11 = r9
        L10:
            n.k r1 = r10.f7116a
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            fg.a r7 = r10.f7117b
            r0.z1(r1, r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L2a
            s1.l0 r11 = r0.F
            if (r11 == 0) goto L24
            r11.m1()
        L24:
            r0.A1(r9)
            r0.A1(r8)
        L2a:
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            n.k r1 = r3.f7116a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 961
            r2 = 31
            int r0 = eh.a.h(r1, r2, r0)
            r1 = 29791(0x745f, float:4.1746E-41)
            r2 = 1
            int r0 = eh.a.h(r0, r1, r2)
            fg.a r1 = r3.f7117b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r0 = 923521(0xe1781, float:1.294129E-39)
            int r1 = r1 * r0
            int r0 = java.lang.Boolean.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }
}
