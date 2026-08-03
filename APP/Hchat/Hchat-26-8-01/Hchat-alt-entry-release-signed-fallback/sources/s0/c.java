package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12180l;

    public /* synthetic */ c(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f12175g = r6
            r0.f12177i = r1
            r0.f12178j = r2
            r0.f12179k = r3
            r0.f12176h = r4
            r0.f12180l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ c(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5, int r6) {
            r0 = this;
            r0.f12175g = r6
            r0.f12177i = r1
            r0.f12178j = r2
            r0.f12179k = r3
            r0.f12180l = r4
            r0.f12176h = r5
            r0.<init>()
            return
    }

    public /* synthetic */ c(java.lang.String r1, java.lang.String r2, int r3, y0.o r4, fg.l r5, int r6) {
            r0 = this;
            r6 = 7
            r0.f12175g = r6
            r0.<init>()
            r0.f12177i = r1
            r0.f12178j = r2
            r0.f12176h = r3
            r0.f12179k = r4
            r0.f12180l = r5
            return
    }

    public /* synthetic */ c(p.f1 r2, fg.a r3, y0.o r4, s0.d r5, int r6) {
            r1 = this;
            r0 = 2
            r1.f12175g = r0
            r1.<init>()
            r1.f12178j = r2
            r1.f12179k = r3
            r1.f12180l = r4
            r1.f12177i = r5
            r1.f12176h = r6
            return
    }

    public /* synthetic */ c(wb.fr r1, android.widget.FrameLayout r2, android.widget.FrameLayout r3, int r4, wb.er r5, int r6) {
            r0 = this;
            r6 = 12
            r0.f12175g = r6
            r0.<init>()
            r0.f12177i = r1
            r0.f12178j = r2
            r0.f12179k = r3
            r0.f12176h = r4
            r0.f12180l = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f12175g
            switch(r0) {
                case 0: goto L26d;
                case 1: goto L244;
                case 2: goto L21b;
                case 3: goto L1f2;
                case 4: goto L1c9;
                case 5: goto L1a0;
                case 6: goto L177;
                case 7: goto L14e;
                case 8: goto L125;
                case 9: goto Lfc;
                case 10: goto Ld4;
                case 11: goto L90;
                case 12: goto L66;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f12177i
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r8.f12178j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r8.f12179k
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r8.f12180l
            sh.t r3 = (sh.t) r3
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4 = r10 & 3
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L25
            r4 = r6
            goto L26
        L25:
            r4 = 0
        L26:
            r10 = r10 & r6
            boolean r10 = r9.S(r10, r4)
            if (r10 == 0) goto L60
            i0.m2 r10 = bi.g.f895a
            java.lang.Object r10 = r9.j(r10)
            fg.a r10 = (fg.a) r10
            i0.a1 r10 = i0.r.y(r10, r9)
            java.lang.Object r4 = r9.P()
            i0.e r5 = i0.l.f5952a
            if (r4 != r5) goto L4b
            wb.ad r4 = new wb.ad
            r5 = 11
            r4.<init>(r0, r1, r10, r5)
            r9.k0(r4)
        L4b:
            fg.l r4 = (fg.l) r4
            b0.r r10 = new b0.r
            int r0 = r8.f12176h
            r10.<init>(r2, r0, r3, r4)
            r0 = 396274525(0x179eab5d, float:1.0253769E-24)
            s0.d r10 = s0.i.e(r0, r10, r9)
            r0 = 6
            sh.s.g(r10, r9, r0)
            goto L63
        L60:
            r9.V()
        L63:
            sf.n r9 = sf.n.f12433a
            return r9
        L66:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            wb.fr r1 = (wb.fr) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.Object r0 = r8.f12180l
            r5 = r0
            wb.er r5 = (wb.er) r5
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 24577(0x6001, float:3.444E-41)
            int r7 = i0.r.C(r9)
            int r4 = r8.f12176h
            r1.a(r2, r3, r4, r5, r6, r7)
        L8d:
            sf.n r9 = sf.n.f12433a
            return r9
        L90:
            java.lang.Object r0 = r8.f12177i
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r8.f12178j
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.Object r2 = r8.f12179k
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r8.f12180l
            wb.er r3 = (wb.er) r3
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4 = r10 & 3
            r5 = 2
            r6 = 1
            if (r4 == r5) goto Lb0
            r4 = r6
            goto Lb1
        Lb0:
            r4 = 0
        Lb1:
            r10 = r10 & r6
            boolean r10 = r9.S(r10, r4)
            if (r10 == 0) goto Lce
            wb.fr r10 = wb.fr.f16252a
            b0.r r4 = new b0.r
            int r5 = r8.f12176h
            r4.<init>(r1, r2, r5, r3)
            r1 = 838213607(0x31f61fe7, float:7.163169E-9)
            s0.d r1 = s0.i.e(r1, r4, r9)
            r2 = 432(0x1b0, float:6.05E-43)
            r10.b(r0, r1, r9, r2)
            goto Ld1
        Lce:
            r9.V()
        Ld1:
            sf.n r9 = sf.n.f12433a
            return r9
        Ld4:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            vb.a r3 = (vb.a) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            r1.L1(r2, r3, r4, r5, r6)
            goto L8d
        Lfc:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            wb.v0 r2 = (wb.v0) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.ho.b0(r1, r2, r3, r4, r5, r6)
            goto L8d
        L125:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            wb.d4 r2 = (wb.d4) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.ho.o1(r1, r2, r3, r4, r5, r6)
            goto L8d
        L14e:
            java.lang.Object r0 = r8.f12177i
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r8.f12178j
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r8.f12179k
            r7 = r0
            y0.o r7 = (y0.o) r7
            java.lang.Object r0 = r8.f12180l
            r3 = r0
            fg.l r3 = (fg.l) r3
            r4 = r9
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 391(0x187, float:5.48E-43)
            int r2 = i0.r.C(r9)
            int r1 = r8.f12176h
            wb.ho.V3(r1, r2, r3, r4, r5, r6, r7)
            goto L8d
        L177:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.ho.w2(r1, r2, r3, r4, r5, r6)
            goto L8d
        L1a0:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            d1.v r2 = (d1.v) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.intValue()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.ho.w3(r1, r2, r3, r4, r5, r6)
            goto L8d
        L1c9:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            fg.l r2 = (fg.l) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.ho.t3(r1, r2, r3, r4, r5, r6)
            goto L8d
        L1f2:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            y0.o r4 = (y0.o) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            r1.M(r2, r3, r4, r5, r6)
            goto L8d
        L21b:
            java.lang.Object r0 = r8.f12178j
            r1 = r0
            p.f1 r1 = (p.f1) r1
            java.lang.Object r0 = r8.f12179k
            r2 = r0
            fg.a r2 = (fg.a) r2
            java.lang.Object r0 = r8.f12180l
            r3 = r0
            y0.o r3 = (y0.o) r3
            java.lang.Object r0 = r8.f12177i
            r4 = r0
            s0.d r4 = (s0.d) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            wb.o3.c(r1, r2, r3, r4, r5, r6)
            goto L8d
        L244:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            wb.h2 r1 = (wb.h2) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r8.f12179k
            r3 = r0
            vb.a r3 = (vb.a) r3
            java.lang.Object r0 = r8.f12180l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            r9 = r9 | 1
            int r6 = i0.r.C(r9)
            r1.e(r2, r3, r4, r5, r6)
            goto L8d
        L26d:
            java.lang.Object r0 = r8.f12177i
            r1 = r0
            s0.d r1 = (s0.d) r1
            java.lang.Object r0 = r8.f12178j
            r2 = r0
            d0.b r2 = (d0.b) r2
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r9 = r8.f12176h
            int r9 = i0.r.C(r9)
            r6 = r9 | 1
            java.lang.Object r3 = r8.f12179k
            java.lang.Object r4 = r8.f12180l
            r1.e(r2, r3, r4, r5, r6)
            goto L8d
    }
}
