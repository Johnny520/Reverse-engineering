package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.d f21710i;

    public /* synthetic */ l(i0.a1 r1, s0.d r2, int r3) {
            r0 = this;
            r0.f21708g = r3
            r0.f21709h = r1
            r0.f21710i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f21708g
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            switch(r0) {
                case 0: goto La6;
                case 1: goto L5a;
                default: goto Ld;
            }
        Ld:
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = 0
        L16:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L54
            i0.m2 r5 = bi.g.f895a
            i0.a1 r0 = r3.f21709h
            boolean r1 = r4.f(r0)
            java.lang.Object r2 = r4.P()
            if (r1 != 0) goto L2f
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L39
        L2f:
            wb.ht r2 = new wb.ht
            r1 = 9
            r2.<init>(r0, r1)
            r4.k0(r2)
        L39:
            fg.a r2 = (fg.a) r2
            i0.q1 r5 = r5.a(r2)
            bi.i r0 = new bi.i
            r1 = 7
            s0.d r2 = r3.f21710i
            r0.<init>(r2, r1)
            r1 = -1650834240(0xffffffff9d9a44c0, float:-4.0834546E-21)
            s0.d r0 = s0.i.e(r1, r0, r4)
            r1 = 56
            i0.r.a(r5, r0, r4, r1)
            goto L57
        L54:
            r4.V()
        L57:
            sf.n r4 = sf.n.f12433a
            return r4
        L5a:
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = 0
        L63:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto La0
            i0.m2 r5 = bi.g.f895a
            i0.a1 r0 = r3.f21709h
            boolean r1 = r4.f(r0)
            java.lang.Object r2 = r4.P()
            if (r1 != 0) goto L7c
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L85
        L7c:
            wb.ht r2 = new wb.ht
            r1 = 5
            r2.<init>(r0, r1)
            r4.k0(r2)
        L85:
            fg.a r2 = (fg.a) r2
            i0.q1 r5 = r5.a(r2)
            bi.i r0 = new bi.i
            r1 = 6
            s0.d r2 = r3.f21710i
            r0.<init>(r2, r1)
            r1 = 1218748044(0x48a49e8c, float:337140.38)
            s0.d r0 = s0.i.e(r1, r0, r4)
            r1 = 56
            i0.r.a(r5, r0, r4, r1)
            goto La3
        La0:
            r4.V()
        La3:
            sf.n r4 = sf.n.f12433a
            return r4
        La6:
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Lae
            r0 = r2
            goto Laf
        Lae:
            r0 = 0
        Laf:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto Lec
            i0.m2 r5 = bi.g.f895a
            i0.a1 r0 = r3.f21709h
            boolean r1 = r4.f(r0)
            java.lang.Object r2 = r4.P()
            if (r1 != 0) goto Lc8
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto Ld1
        Lc8:
            wb.ht r2 = new wb.ht
            r1 = 2
            r2.<init>(r0, r1)
            r4.k0(r2)
        Ld1:
            fg.a r2 = (fg.a) r2
            i0.q1 r5 = r5.a(r2)
            bi.i r0 = new bi.i
            r1 = 5
            s0.d r2 = r3.f21710i
            r0.<init>(r2, r1)
            r1 = 373708764(0x164657dc, float:1.6022036E-25)
            s0.d r0 = s0.i.e(r1, r0, r4)
            r1 = 56
            i0.r.a(r5, r0, r4, r1)
            goto Lef
        Lec:
            r4.V()
        Lef:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
