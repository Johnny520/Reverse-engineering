package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f14672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f14673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14678o;

    public /* synthetic */ u(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, fg.a r6, boolean r7, android.app.Activity r8, fg.l r9) {
            r1 = this;
            r0 = 1
            r1.f14670g = r0
            r1.<init>()
            r1.f14671h = r2
            r1.f14674k = r3
            r1.f14675l = r4
            r1.f14676m = r5
            r1.f14677n = r6
            r1.f14672i = r7
            r1.f14678o = r8
            r1.f14673j = r9
            return
    }

    public /* synthetic */ u(h0.d1 r2, w.q0 r3, boolean r4, fg.l r5, n2.s r6, b5.k r7, u2.c r8, int r9) {
            r1 = this;
            r0 = 0
            r1.f14670g = r0
            r1.<init>()
            r1.f14674k = r2
            r1.f14675l = r3
            r1.f14672i = r4
            r1.f14673j = r5
            r1.f14676m = r6
            r1.f14677n = r7
            r1.f14678o = r8
            r1.f14671h = r9
            return
    }

    public /* synthetic */ u(java.util.ArrayList r1, int r2, boolean r3, fg.a r4, fg.a r5, sh.t r6, n1.a r7, fg.l r8, int r9) {
            r0 = this;
            r9 = 2
            r0.f14670g = r9
            r0.<init>()
            r0.f14674k = r1
            r0.f14671h = r2
            r0.f14672i = r3
            r0.f14675l = r4
            r0.f14676m = r5
            r0.f14677n = r6
            r0.f14678o = r7
            r0.f14673j = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r68, java.lang.Object r69) {
            r67 = this;
            r0 = r67
            int r1 = r0.f14670g
            switch(r1) {
                case 0: goto L51d;
                case 1: goto L3d;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f14674k
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r1 = r0.f14675l
            r5 = r1
            fg.a r5 = (fg.a) r5
            java.lang.Object r1 = r0.f14676m
            r6 = r1
            fg.a r6 = (fg.a) r6
            java.lang.Object r1 = r0.f14677n
            r7 = r1
            sh.t r7 = (sh.t) r7
            java.lang.Object r1 = r0.f14678o
            r8 = r1
            n1.a r8 = (n1.a) r8
            r10 = r68
            i0.h0 r10 = (i0.h0) r10
            r1 = r69
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 27649(0x6c01, float:3.8745E-41)
            int r11 = i0.r.C(r1)
            int r3 = r0.f14671h
            boolean r4 = r0.f14672i
            fg.l r9 = r0.f14673j
            r9.e0.g(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            sf.n r1 = sf.n.f12433a
            return r1
        L3d:
            java.lang.Object r1 = r0.f14674k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f14675l
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.f14676m
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f14677n
            r27 = r4
            fg.a r27 = (fg.a) r27
            java.lang.Object r4 = r0.f14678o
            r8 = r4
            android.app.Activity r8 = (android.app.Activity) r8
            r14 = r68
            i0.h0 r14 = (i0.h0) r14
            r4 = r69
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r9 = 1
            if (r5 == r6) goto L69
            r5 = r9
            goto L6a
        L69:
            r5 = 0
        L6a:
            r4 = r4 & r9
            boolean r4 = r14.S(r4, r5)
            sf.n r5 = sf.n.f12433a
            if (r4 == 0) goto L517
            int r4 = r0.f14671h
            if (r4 >= r9) goto L78
            r4 = r9
        L78:
            boolean r6 = r14.f(r1)
            boolean r10 = r14.d(r4)
            r6 = r6 | r10
            java.lang.Object r10 = r14.P()
            i0.e r11 = i0.l.f5952a
            if (r6 != 0) goto L8b
            if (r10 != r11) goto L92
        L8b:
            java.lang.String r10 = og.m.P0(r4, r1)
            r14.k0(r10)
        L92:
            java.lang.String r10 = (java.lang.String) r10
            boolean r1 = r14.f(r10)
            java.lang.Object r6 = r14.P()
            r12 = 4
            if (r1 != 0) goto La4
            if (r6 != r11) goto La2
            goto La4
        La2:
            r13 = r8
            goto Lb9
        La4:
            n2.s r1 = new n2.s
            int r6 = r10.length()
            r13 = r8
            long r7 = i2.e0.b(r6, r6)
            r1.<init>(r12, r10, r7)
            i0.j1 r6 = i0.r.u(r1)
            r14.k0(r6)
        Lb9:
            r1 = r6
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r6 = r14.P()
            if (r6 != r11) goto Lcb
            java.lang.String r6 = ""
            i0.j1 r6 = i0.r.u(r6)
            r14.k0(r6)
        Lcb:
            r10 = r6
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r6 = r14.P()
            if (r6 != r11) goto Ldc
            d1.v r6 = new d1.v
            r6.<init>()
            r14.k0(r6)
        Ldc:
            d1.v r6 = (d1.v) r6
            java.lang.Object r7 = r14.P()
            if (r7 != r11) goto Lee
            wb.eo r7 = new wb.eo
            r8 = 2
            r15 = 0
            r7.<init>(r6, r15, r8)
            r14.k0(r7)
        Lee:
            fg.p r7 = (fg.p) r7
            i0.r.f(r7, r14, r5)
            y0.l r15 = y0.l.f21818a
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r15, r7)
            p.e r7 = p.j.f9926c
            y0.e r9 = y0.b.f21804s
            r12 = 0
            p.t r7 = p.s.a(r7, r9, r14, r12)
            r68 = r13
            long r12 = r14.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r14.l()
            y0.o r8 = y0.a.c(r14, r8)
            x1.f r17 = x1.g.f20914f
            r17.getClass()
            x1.y r9 = x1.f.f20883b
            r14.d0()
            r26 = r2
            boolean r2 = r14.S
            if (r2 == 0) goto L128
            r14.k(r9)
            goto L12b
        L128:
            r14.n0()
        L12b:
            x1.e r2 = x1.f.f20886e
            i0.r.A(r2, r14, r7)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r14, r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            x1.e r13 = x1.f.f20887f
            i0.r.A(r13, r14, r12)
            x1.d r12 = x1.f.f20888g
            i0.r.w(r12, r14)
            r23 = r9
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r14, r8)
            boolean r8 = og.m.t0(r3)
            r24 = r9
            r9 = 10
            if (r8 != 0) goto L1ea
            r8 = 285690700(0x11074b4c, float:1.0672825E-28)
            r14.a0(r8)
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r8 = r14.j(r8)
            bi.b r8 = (bi.b) r8
            long r28 = r8.h()
            r8 = 13
            long r30 = x6.d.D(r8)
            r8 = 4
            float r8 = (float) r8
            r25 = r3
            float r3 = (float) r9
            r20 = 6
            r17 = 0
            r18 = 0
            r19 = r3
            r16 = r8
            y0.o r3 = p.d.p(r15, r16, r17, r18, r19, r20)
            r8 = r24
            r24 = 0
            r16 = r4
            r4 = r3
            r3 = r25
            r25 = 262120(0x3ffe8, float:3.67308E-40)
            r17 = r9
            r9 = 0
            r18 = r10
            r10 = 0
            r20 = r11
            r19 = r12
            r11 = 0
            r32 = r13
            r13 = 0
            r47 = r14
            r33 = r15
            r14 = 0
            r34 = r16
            r16 = 0
            r35 = r17
            r17 = 0
            r36 = r18
            r18 = 0
            r37 = r19
            r19 = 0
            r38 = r20
            r20 = 0
            r39 = 1
            r21 = 0
            r40 = r23
            r23 = 24624(0x6030, float:3.4506E-41)
            r51 = r68
            r68 = r1
            r69 = r2
            r57 = r5
            r53 = r7
            r56 = r8
            r7 = r30
            r54 = r32
            r1 = r33
            r52 = r36
            r55 = r37
            r58 = r38
            r59 = r40
            r22 = r47
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r65 = r28
            r28 = r6
            r5 = r65
            sh.s.n(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = r22
            r14.p(r0)
            goto L211
        L1ea:
            r51 = r68
            r68 = r1
            r69 = r2
            r34 = r4
            r57 = r5
            r28 = r6
            r53 = r7
            r52 = r10
            r58 = r11
            r55 = r12
            r54 = r13
            r1 = r15
            r59 = r23
            r56 = r24
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 286015363(0x110c3f83, float:1.1063624E-28)
            r14.a0(r3)
            r14.p(r0)
        L211:
            y0.o r3 = p.h1.d(r1, r2)
            r4 = 12
            float r5 = (float) r4
            v.d r6 = v.e.a(r5)
            y0.o r3 = c1.h.b(r3, r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r7 = r14.j(r6)
            bi.b r7 = (bi.b) r7
            long r7 = r7.k()
            f1.m0 r9 = f1.c0.f3038b
            y0.o r3 = k.n.g(r3, r7, r9)
            y0.o r3 = p.d.m(r3, r5, r5)
            y0.g r5 = y0.b.f21792g
            v1.n0 r5 = p.o.d(r5, r0)
            long r7 = r14.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r14.l()
            y0.o r3 = y0.a.c(r14, r3)
            r14.d0()
            boolean r9 = r14.S
            if (r9 == 0) goto L259
            r9 = r59
            r14.k(r9)
        L256:
            r10 = r69
            goto L25f
        L259:
            r9 = r59
            r14.n0()
            goto L256
        L25f:
            i0.r.A(r10, r14, r5)
            r5 = r53
            i0.r.A(r5, r14, r8)
            r8 = r54
            r11 = r55
            j8.b.p(r7, r14, r8, r14, r11)
            r7 = r56
            i0.r.A(r7, r14, r3)
            java.lang.Object r3 = r68.getValue()
            n2.s r3 = (n2.s) r3
            i2.g r3 = r3.f8976a
            java.lang.String r3 = r3.f6314h
            int r3 = r3.length()
            r29 = 16
            if (r3 != 0) goto L2fa
            boolean r3 = og.m.t0(r26)
            if (r3 != 0) goto L2fa
            r3 = 952958905(0x38ccffb9, float:9.77511E-5)
            r14.a0(r3)
            java.lang.Object r3 = r14.j(r6)
            bi.b r3 = (bi.b) r3
            long r12 = r3.h()
            r32 = r8
            r59 = r9
            long r8 = x6.d.D(r29)
            r25 = 0
            r3 = r4
            r4 = r26
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r53 = r5
            r5 = 0
            r15 = r10
            r10 = 0
            r19 = r11
            r11 = 0
            r16 = r6
            r24 = r7
            r6 = r12
            r12 = 0
            r47 = r14
            r14 = 0
            r17 = r15
            r18 = r16
            r15 = 0
            r20 = r17
            r17 = 0
            r21 = r18
            r18 = 0
            r37 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r23 = r21
            r21 = 0
            r30 = r22
            r22 = 0
            r56 = r24
            r24 = 24576(0x6000, float:3.4438E-41)
            r2 = r23
            r60 = r30
            r62 = r32
            r63 = r37
            r23 = r47
            r61 = r53
            r64 = r56
            r30 = r3
            r3 = r59
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14 = r23
            r14.p(r0)
            goto L311
        L2fa:
            r30 = r4
            r61 = r5
            r2 = r6
            r64 = r7
            r62 = r8
            r3 = r9
            r60 = r10
            r63 = r11
            r4 = 953251049(0x38d174e9, float:9.987673E-5)
            r14.a0(r4)
            r14.p(r0)
        L311:
            java.lang.Object r4 = r68.getValue()
            r9 = r4
            n2.s r9 = (n2.s) r9
            w.p0 r4 = new w.p0
            r5 = 123(0x7b, float:1.72E-43)
            r6 = 1
            r4.<init>(r6, r5)
            i2.n0 r13 = new i2.n0
            java.lang.Object r5 = r14.j(r2)
            bi.b r5 = (bi.b) r5
            long r16 = r5.g()
            long r18 = x6.d.D(r29)
            r24 = 0
            r26 = 16777212(0xfffffc, float:2.3509881E-38)
            r20 = 0
            r21 = 0
            r23 = 0
            r15 = r13
            r15.<init>(r16, r18, r20, r21, r23, r24, r26)
            f1.t0 r5 = new f1.t0
            java.lang.Object r2 = r14.j(r2)
            bi.b r2 = (bi.b) r2
            long r7 = r2.j()
            r5.<init>(r7)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r1, r2)
            r2 = r28
            y0.o r11 = d1.d.j(r7, r2)
            r2 = r34
            boolean r7 = r14.d(r2)
            r8 = r68
            boolean r10 = r14.f(r8)
            r7 = r7 | r10
            java.lang.Object r10 = r14.P()
            if (r7 != 0) goto L375
            r7 = r58
            if (r10 != r7) goto L372
            goto L377
        L372:
            r15 = r52
            goto L382
        L375:
            r7 = r58
        L377:
            eb.v0 r10 = new eb.v0
            r12 = 7
            r15 = r52
            r10.<init>(r2, r8, r15, r12)
            r14.k0(r10)
        L382:
            fg.l r10 = (fg.l) r10
            r25 = 0
            r26 = 48792(0xbe98, float:6.8372E-41)
            r12 = 0
            r18 = r15
            r15 = 0
            r16 = 1
            r17 = 0
            r36 = r18
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 102236160(0x6180000, float:2.8588023E-35)
            r21 = r5
            r23 = r14
            r52 = r36
            r14 = r4
            w.i.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14 = r23
            r14.p(r6)
            java.lang.Object r2 = r52.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            r4 = 6
            if (r2 != 0) goto L419
            r2 = 288056496(0x112b64b0, float:1.3520548E-28)
            r14.a0(r2)
            java.lang.Object r2 = r52.getValue()
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            r9 = 4292030255(0xffd32f2f, double:2.1205447E-314)
            long r9 = f1.c0.d(r9)
            long r32 = x6.d.D(r30)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r1, r2)
            float r2 = (float) r4
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r2
            y0.o r29 = p.d.p(r15, r16, r17, r18, r19, r20)
            t2.k r2 = new t2.k
            r5 = 3
            r2.<init>(r5)
            r49 = 0
            r50 = 261096(0x3fbe8, float:3.65873E-40)
            r34 = 0
            r35 = 0
            r36 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 25008(0x61b0, float:3.5044E-41)
            r38 = r2
            r30 = r9
            r47 = r14
            sh.s.n(r28, r29, r30, r32, r34, r35, r36, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r14.p(r0)
        L416:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L423
        L419:
            r2 = 288408067(0x1130c203, float:1.3943736E-28)
            r14.a0(r2)
            r14.p(r0)
            goto L416
        L423:
            y0.o r15 = p.h1.d(r1, r2)
            r1 = 10
            float r1 = (float) r1
            float r2 = (float) r4
            r20 = 5
            r16 = 0
            r18 = 0
            r17 = r1
            r19 = r2
            y0.o r1 = p.d.p(r15, r16, r17, r18, r19, r20)
            r2 = 8
            float r2 = (float) r2
            p.h r2 = p.j.g(r2)
            y0.f r5 = y0.b.f21801p
            p.e1 r2 = p.d1.a(r2, r5, r14, r4)
            long r4 = r14.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r14.l()
            y0.o r1 = y0.a.c(r14, r1)
            r14.d0()
            boolean r9 = r14.S
            if (r9 == 0) goto L461
            r14.k(r3)
        L45e:
            r15 = r60
            goto L465
        L461:
            r14.n0()
            goto L45e
        L465:
            i0.r.A(r15, r14, r2)
            r2 = r61
            i0.r.A(r2, r14, r5)
            r2 = r62
            r11 = r63
            j8.b.p(r4, r14, r2, r14, r11)
            r2 = r64
            i0.r.A(r2, r14, r1)
            wb.y2 r5 = wb.y2.f20291p
            r2 = 1065353216(0x3f800000, float:1.0)
            double r3 = (double) r2
            r15 = 0
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            java.lang.String r3 = "invalid weight; must be greater than zero"
            if (r1 <= 0) goto L488
        L486:
            r9 = r8
            goto L48c
        L488:
            q.a.a(r3)
            goto L486
        L48c:
            p.q0 r8 = new p.q0
            r8.<init>(r2, r6)
            r11 = 24582(0x6006, float:3.4447E-41)
            r12 = 8
            r21 = r6
            java.lang.String r6 = "取消"
            r1 = r9
            r9 = 0
            r2 = r7
            r10 = r14
            r4 = r21
            r7 = r27
            r5.k(r6, r7, r8, r9, r10, r11, r12)
            r12 = r5
            boolean r5 = r14.f(r1)
            r13 = r67
            boolean r6 = r13.f14672i
            boolean r8 = r14.g(r6)
            r5 = r5 | r8
            boolean r8 = r14.f(r7)
            r5 = r5 | r8
            r8 = r51
            boolean r9 = r14.h(r8)
            r5 = r5 | r9
            fg.l r11 = r13.f14673j
            boolean r9 = r14.f(r11)
            r5 = r5 | r9
            java.lang.Object r9 = r14.P()
            if (r5 != 0) goto L4cd
            if (r9 != r2) goto L4d9
        L4cd:
            wb.ok r5 = new wb.ok
            r9 = r1
            r10 = r52
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r14.k0(r5)
            r9 = r5
        L4d9:
            r11 = r9
            fg.a r11 = (fg.a) r11
            r2 = 1065353216(0x3f800000, float:1.0)
            double r7 = (double) r2
            int r5 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r5 <= 0) goto L4e5
        L4e3:
            r5 = r12
            goto L4e9
        L4e5:
            q.a.a(r3)
            goto L4e3
        L4e9:
            p.q0 r12 = new p.q0
            r12.<init>(r2, r4)
            java.lang.Object r1 = r1.getValue()
            n2.s r1 = (n2.s) r1
            i2.g r1 = r1.f8976a
            java.lang.String r1 = r1.f6314h
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L503
            if (r6 == 0) goto L501
            goto L503
        L501:
            r7 = r0
            goto L504
        L503:
            r7 = r4
        L504:
            r15 = 24582(0x6006, float:3.4447E-41)
            r16 = 0
            java.lang.String r10 = "确定"
            r9 = r5
            r0 = r13
            r13 = r7
            r9.k(r10, r11, r12, r13, r14, r15, r16)
            r14.p(r4)
            r14.p(r4)
            goto L51c
        L517:
            r57 = r5
            r14.V()
        L51c:
            return r57
        L51d:
            java.lang.Object r1 = r0.f14674k
            h0.d1 r1 = (h0.d1) r1
            java.lang.Object r2 = r0.f14675l
            r4 = r2
            w.q0 r4 = (w.q0) r4
            java.lang.Object r2 = r0.f14676m
            r6 = r2
            n2.s r6 = (n2.s) r6
            java.lang.Object r2 = r0.f14677n
            r7 = r2
            b5.k r7 = (b5.k) r7
            java.lang.Object r2 = r0.f14678o
            r8 = r2
            u2.c r8 = (u2.c) r8
            r2 = r68
            i0.h0 r2 = (i0.h0) r2
            r3 = r69
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r3 & 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r5 == r9) goto L54a
            r5 = r10
            goto L54b
        L54a:
            r5 = r11
        L54b:
            r3 = r3 & r10
            boolean r3 = r2.S(r3, r5)
            if (r3 == 0) goto L5e5
            w.a0 r3 = new w.a0
            fg.l r5 = r0.f14673j
            int r9 = r0.f14671h
            r3.<init>(r4, r5, r6, r7, r8, r9)
            long r5 = r2.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r2.l()
            y0.l r7 = y0.l.f21818a
            y0.o r7 = y0.a.c(r2, r7)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r2.d0()
            boolean r9 = r2.S
            if (r9 == 0) goto L57d
            r2.k(r8)
            goto L580
        L57d:
            r2.n0()
        L580:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r2, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r2, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r2, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r2)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r2, r7)
            r2.p(r10)
            w.h0 r3 = r4.a()
            w.h0 r5 = w.h0.f14484g
            boolean r6 = r0.f14672i
            if (r3 == r5) goto L5c0
            v1.t r3 = r4.c()
            if (r3 == 0) goto L5c0
            v1.t r3 = r4.c()
            r3.getClass()
            boolean r3 = r3.C()
            if (r3 == 0) goto L5c0
            if (r6 == 0) goto L5c0
            goto L5c1
        L5c0:
            r10 = r11
        L5c1:
            w.s.i(r1, r10, r2, r11)
            w.h0 r3 = r4.a()
            w.h0 r4 = w.h0.f14486i
            if (r3 != r4) goto L5db
            if (r6 == 0) goto L5db
            r3 = -714666198(0xffffffffd5670f2a, float:-1.587827E13)
            r2.a0(r3)
            w.s.j(r1, r2, r11)
            r2.p(r11)
            goto L5e8
        L5db:
            r1 = -714589318(0xffffffffd5683b7a, float:-1.5958884E13)
            r2.a0(r1)
            r2.p(r11)
            goto L5e8
        L5e5:
            r2.V()
        L5e8:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
