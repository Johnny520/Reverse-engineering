package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21742h;

    public /* synthetic */ q(i0.a1 r1, int r2) {
            r0 = this;
            r0.f21741g = r2
            r0.f21742h = r1
            r0.<init>()
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            r4 = this;
            int r0 = r4.f21741g
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            fg.p r6 = (fg.p) r6
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            switch(r0) {
                case 0: goto L9b;
                default: goto L15;
            }
        L15:
            r6.getClass()
            r0 = r8 & 6
            if (r0 != 0) goto L27
            boolean r0 = r7.g(r5)
            if (r0 == 0) goto L24
            r0 = 4
            goto L25
        L24:
            r0 = 2
        L25:
            r0 = r0 | r8
            goto L28
        L27:
            r0 = r8
        L28:
            r8 = r8 & 48
            if (r8 != 0) goto L38
            boolean r8 = r7.h(r6)
            if (r8 == 0) goto L35
            r8 = 32
            goto L37
        L35:
            r8 = 16
        L37:
            r0 = r0 | r8
        L38:
            r8 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            r2 = 1
            r3 = 0
            if (r8 == r1) goto L42
            r8 = r2
            goto L43
        L42:
            r8 = r3
        L43:
            r0 = r0 & r2
            boolean r8 = r7.S(r0, r8)
            if (r8 == 0) goto L95
            if (r5 == 0) goto L8b
            r5 = 1909785122(0x71d50222, float:2.1095323E30)
            r7.a0(r5)
            i0.a1 r5 = r4.f21742h
            boolean r8 = r7.f(r5)
            java.lang.Object r0 = r7.P()
            if (r8 != 0) goto L62
            i0.e r8 = i0.l.f5952a
            if (r0 != r8) goto L6c
        L62:
            wb.ht r0 = new wb.ht
            r8 = 8
            r0.<init>(r5, r8)
            r7.k0(r0)
        L6c:
            fg.a r0 = (fg.a) r0
            y2.u r5 = new y2.u
            y2.d0 r8 = y2.d0.f22212g
            r5.<init>(r3, r8, r3, r3)
            sh.i0 r8 = new sh.i0
            r1 = 7
            r8.<init>(r1, r6)
            r6 = -1400467783(0xffffffffac868eb9, float:-3.8243545E-12)
            s0.d r6 = s0.i.e(r6, r8, r7)
            r8 = 384(0x180, float:5.38E-43)
            x6.d.a(r0, r5, r6, r7, r8)
            r7.p(r3)
            goto L98
        L8b:
            r5 = 1910085915(0x71d9991b, float:2.1549869E30)
            r7.a0(r5)
            r7.p(r3)
            goto L98
        L95:
            r7.V()
        L98:
            sf.n r5 = sf.n.f12433a
            return r5
        L9b:
            r6.getClass()
            r0 = r8 & 6
            if (r0 != 0) goto Lad
            boolean r0 = r7.g(r5)
            if (r0 == 0) goto Laa
            r0 = 4
            goto Lab
        Laa:
            r0 = 2
        Lab:
            r0 = r0 | r8
            goto Lae
        Lad:
            r0 = r8
        Lae:
            r8 = r8 & 48
            if (r8 != 0) goto Lbe
            boolean r8 = r7.h(r6)
            if (r8 == 0) goto Lbb
            r8 = 32
            goto Lbd
        Lbb:
            r8 = 16
        Lbd:
            r0 = r0 | r8
        Lbe:
            r8 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            r2 = 1
            r3 = 0
            if (r8 == r1) goto Lc8
            r8 = r2
            goto Lc9
        Lc8:
            r8 = r3
        Lc9:
            r0 = r0 & r2
            boolean r8 = r7.S(r0, r8)
            if (r8 == 0) goto L11a
            if (r5 == 0) goto L110
            r5 = 276430998(0x107a0096, float:4.9304258E-29)
            r7.a0(r5)
            i0.a1 r5 = r4.f21742h
            boolean r8 = r7.f(r5)
            java.lang.Object r0 = r7.P()
            if (r8 != 0) goto Le8
            i0.e r8 = i0.l.f5952a
            if (r0 != r8) goto Lf1
        Le8:
            wb.ht r0 = new wb.ht
            r8 = 4
            r0.<init>(r5, r8)
            r7.k0(r0)
        Lf1:
            fg.a r0 = (fg.a) r0
            y2.u r5 = new y2.u
            y2.d0 r8 = y2.d0.f22212g
            r5.<init>(r3, r8, r3, r3)
            sh.i0 r8 = new sh.i0
            r1 = 6
            r8.<init>(r1, r6)
            r6 = -1792426939(0xffffffff9529bc45, float:-3.4277797E-26)
            s0.d r6 = s0.i.e(r6, r8, r7)
            r8 = 384(0x180, float:5.38E-43)
            x6.d.a(r0, r5, r6, r7, r8)
            r7.p(r3)
            goto L11d
        L110:
            r5 = 276731791(0x107e978f, float:5.0209424E-29)
            r7.a0(r5)
            r7.p(r3)
            goto L11d
        L11a:
            r7.V()
        L11d:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
