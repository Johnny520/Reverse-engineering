package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15615n;

    public /* synthetic */ d5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, fg.a r6, fg.l r7, int r8, int r9) {
            r0 = this;
            r0.f15608g = r9
            r0.f15609h = r1
            r0.f15610i = r2
            r0.f15611j = r3
            r0.f15612k = r4
            r0.f15613l = r5
            r0.f15614m = r6
            r0.f15615n = r7
            r0.<init>()
            return
    }

    public /* synthetic */ d5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, int r8) {
            r0 = this;
            r0.f15608g = r8
            r0.f15609h = r1
            r0.f15610i = r2
            r0.f15611j = r3
            r0.f15612k = r4
            r0.f15613l = r5
            r0.f15614m = r6
            r0.f15615n = r7
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44) {
            r42 = this;
            r0 = r42
            int r1 = r0.f15608g
            switch(r1) {
                case 0: goto L864;
                case 1: goto L727;
                case 2: goto L544;
                case 3: goto L50b;
                case 4: goto L4d0;
                case 5: goto L3da;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f15609h
            r6 = r1
            fb.q1 r6 = (fb.q1) r6
            java.lang.String r12 = r6.f3724d
            java.lang.Object r1 = r0.f15610i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f15611j
            r4 = r2
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r0.f15612k
            r3 = r2
            qg.t r3 = (qg.t) r3
            java.lang.Object r2 = r0.f15613l
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r5 = r0.f15614m
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r0.f15615n
            r14 = r7
            fg.a r14 = (fg.a) r14
            r11 = r43
            i0.h0 r11 = (i0.h0) r11
            r7 = r44
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            r9 = 2
            r13 = 1
            r10 = 0
            if (r8 == r9) goto L3e
            r8 = r13
            goto L3f
        L3e:
            r8 = r10
        L3f:
            r7 = r7 & r13
            boolean r7 = r11.S(r7, r8)
            if (r7 == 0) goto L3d4
            y0.l r7 = y0.l.f21818a
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r7, r8)
            r15 = 460(0x1cc, float:6.45E-43)
            float r15 = (float) r15
            r8 = 0
            y0.o r8 = p.h1.g(r9, r8, r15, r13)
            k.w1 r9 = k.n.q(r11)
            y0.o r8 = k.n.r(r8, r9, r13, r13)
            p.e r9 = p.j.f9926c
            y0.e r15 = y0.b.f21804s
            p.t r9 = p.s.a(r9, r15, r11, r10)
            r44 = r13
            r38 = r14
            long r13 = r11.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r11.l()
            y0.o r8 = y0.a.c(r11, r8)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r11.d0()
            boolean r10 = r11.S
            if (r10 == 0) goto L8a
            r11.k(r15)
            goto L8d
        L8a:
            r11.n0()
        L8d:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r11, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r11, r14)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r11, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r11)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r11, r8)
            wb.y2 r13 = wb.y2.f20289n
            boolean r14 = wb.y2.M1(r6)
            java.lang.String r8 = r6.f3725e
            java.lang.String r9 = r6.f3726f
            r10 = 48
            if (r14 == 0) goto Lcc
            boolean r15 = og.m.t0(r9)
            if (r15 != 0) goto Lcc
            r15 = -204731985(0xfffffffff3cc09af, float:-3.2331084E31)
            r11.a0(r15)
            r13.T(r9, r11, r10)
            r15 = 0
            r11.p(r15)
            goto Ld6
        Lcc:
            r15 = 0
            r10 = -204653183(0xfffffffff3cd3d81, float:-3.2521616E31)
            r11.a0(r10)
            r11.p(r15)
        Ld6:
            r10 = 4
            r39 = 12
            if (r14 != 0) goto L15a
            boolean r16 = og.m.t0(r12)
            if (r16 != 0) goto L15a
            r15 = -204572149(0xfffffffff3ce7a0b, float:-3.2717544E31)
            r11.a0(r15)
            i0.m2 r15 = bi.d.f892a
            java.lang.Object r15 = r11.j(r15)
            bi.b r15 = (bi.b) r15
            long r17 = r15.h()
            long r19 = x6.d.D(r39)
            float r15 = (float) r10
            y0.o r15 = p.d.m(r7, r15, r15)
            r36 = 0
            r37 = 262120(0x3ffe8, float:3.67308E-40)
            r16 = r15
            r21 = 0
            java.lang.String r15 = "调用参数"
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r26 = r25
            r25 = 0
            r28 = r26
            r26 = 0
            r29 = r28
            r28 = 0
            r30 = r29
            r29 = 0
            r31 = r30
            r30 = 0
            r32 = r31
            r31 = 0
            r33 = r32
            r32 = 0
            r34 = r33
            r33 = 0
            r35 = 24630(0x6036, float:3.4514E-41)
            r40 = r34
            r34 = r11
            r11 = r40
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r15 = r7
            wb.y2 r7 = wb.y2.f20284i
            r16 = r8
            r8 = 384(0x180, float:5.38E-43)
            r17 = r9
            r9 = 2
            r18 = r10
            r10 = 0
            r43 = r14
            r0 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r14 = r11
            r11 = r34
            r7.c(r8, r9, r10, r11, r12)
            r11.p(r14)
            goto L16d
        L15a:
            r0 = r7
            r16 = r8
            r17 = r9
            r43 = r14
            r14 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r7 = -204212735(0xfffffffff3d3f601, float:-3.3586554E31)
            r11.a0(r7)
            r11.p(r14)
        L16d:
            if (r43 != 0) goto L1c9
            boolean r7 = og.m.t0(r17)
            if (r7 != 0) goto L1c9
            r7 = -204136506(0xfffffffff3d51fc6, float:-3.3770864E31)
            r11.a0(r7)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r11.j(r7)
            bi.b r7 = (bi.b) r7
            long r7 = r7.h()
            long r19 = x6.d.D(r39)
            r9 = 4
            float r10 = (float) r9
            y0.o r9 = p.d.m(r0, r10, r10)
            r36 = 0
            r37 = 262120(0x3ffe8, float:3.67308E-40)
            r10 = r15
            java.lang.String r15 = "代码差异"
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 24630(0x6036, float:3.4514E-41)
            r40 = r7
            r8 = r17
            r17 = r40
            r34 = r11
            r7 = r16
            r16 = r9
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r9 = 48
            r13.T(r8, r11, r9)
            r11.p(r14)
            goto L1d5
        L1c9:
            r10 = r15
            r7 = r16
            r8 = -203772287(0xfffffffff3daae81, float:-3.4651492E31)
            r11.a0(r8)
            r11.p(r14)
        L1d5:
            r9 = 384(0x180, float:5.38E-43)
            i0.e r12 = i0.l.f5952a
            if (r43 != 0) goto L274
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L274
            r8 = -203683503(0xfffffffff3dc0951, float:-3.4866158E31)
            r11.a0(r8)
            java.lang.String r8 = r6.f3727g
            java.lang.String r15 = "success"
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L1f5
            java.lang.String r8 = "执行结果"
        L1f3:
            r15 = r8
            goto L1f8
        L1f5:
            java.lang.String r8 = "执行信息"
            goto L1f3
        L1f8:
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r8 = r11.j(r8)
            bi.b r8 = (bi.b) r8
            long r17 = r8.h()
            long r19 = x6.d.D(r39)
            r8 = 4
            float r14 = (float) r8
            y0.o r16 = p.d.m(r0, r14, r14)
            r36 = 0
            r37 = 262120(0x3ffe8, float:3.67308E-40)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 24624(0x6030, float:3.4506E-41)
            r34 = r11
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r13.r0(r6, r7, r11, r9)
            boolean r7 = r11.f(r1)
            boolean r8 = r11.h(r6)
            r7 = r7 | r8
            java.lang.Object r8 = r11.P()
            if (r7 != 0) goto L244
            if (r8 != r12) goto L24e
        L244:
            wb.xi r8 = new wb.xi
            r7 = 19
            r8.<init>(r1, r7, r6)
            r11.k0(r8)
        L24e:
            r16 = r8
            fg.a r16 = (fg.a) r16
            y0.o r17 = p.h1.d(r0, r10)
            sh.q1 r22 = sh.c.a(r11)
            r25 = 390(0x186, float:5.47E-43)
            r26 = 1912(0x778, float:2.679E-42)
            java.lang.String r15 = "复制结果"
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = r11
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14 = 0
            r11.p(r14)
            goto L27d
        L274:
            r7 = -202991583(0xfffffffff3e69821, float:-3.6539118E31)
            r11.a0(r7)
            r11.p(r14)
        L27d:
            if (r43 != 0) goto L399
            java.lang.String r7 = r6.f3736p
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L399
            r7 = -202869970(0xfffffffff3e8732e, float:-3.683316E31)
            r11.a0(r7)
            int r7 = r6.f3737q
            java.lang.String r8 = "完整结果已保存（"
            java.lang.String r14 = " 字符）"
            java.lang.String r15 = eh.a.m(r7, r8, r14)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r11.j(r7)
            bi.b r7 = (bi.b) r7
            long r17 = r7.h()
            long r19 = x6.d.D(r39)
            r8 = 4
            float r7 = (float) r8
            y0.o r16 = p.d.m(r0, r7, r7)
            r36 = 0
            r37 = 262120(0x3ffe8, float:3.67308E-40)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 24624(0x6030, float:3.4506E-41)
            r34 = r11
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r7 = r4.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L2df
            java.lang.String r7 = "正在读取完整结果"
        L2dd:
            r15 = r7
            goto L2e2
        L2df:
            java.lang.String r7 = "加载完整结果"
            goto L2dd
        L2e2:
            java.lang.Object r7 = r4.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r18 = r7 ^ 1
            y0.o r17 = p.h1.d(r0, r10)
            sh.q1 r22 = sh.c.a(r11)
            boolean r7 = r11.f(r4)
            boolean r8 = r11.h(r3)
            r7 = r7 | r8
            boolean r8 = r11.f(r2)
            r7 = r7 | r8
            boolean r8 = r11.h(r5)
            r7 = r7 | r8
            boolean r8 = r11.h(r6)
            r7 = r7 | r8
            java.lang.Object r8 = r11.P()
            if (r7 != 0) goto L316
            if (r8 != r12) goto L318
        L316:
            r7 = r2
            goto L31a
        L318:
            r7 = r2
            goto L325
        L31a:
            c9.r0 r2 = new c9.r0
            r8 = 25
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.k0(r2)
            r8 = r2
        L325:
            r16 = r8
            fg.a r16 = (fg.a) r16
            r25 = 384(0x180, float:5.38E-43)
            r26 = 1904(0x770, float:2.668E-42)
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = r11
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r7.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L34d
            r1 = -201759613(0xfffffffff3f96483, float:-3.9517839E31)
            r11.a0(r1)
            r14 = 0
            r11.p(r14)
            goto L395
        L34d:
            r3 = -201759612(0xfffffffff3f96484, float:-3.951784E31)
            r11.a0(r3)
            r13.r0(r6, r2, r11, r9)
            boolean r3 = r11.f(r1)
            boolean r4 = r11.f(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r11.P()
            if (r3 != 0) goto L367
            if (r4 != r12) goto L370
        L367:
            wb.u4 r4 = new wb.u4
            r3 = 3
            r4.<init>(r3, r1, r2)
            r11.k0(r4)
        L370:
            r16 = r4
            fg.a r16 = (fg.a) r16
            y0.o r17 = p.h1.d(r0, r10)
            sh.q1 r22 = sh.c.a(r11)
            r25 = 390(0x186, float:5.47E-43)
            r26 = 1912(0x778, float:2.679E-42)
            java.lang.String r15 = "复制完整结果"
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = r11
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14 = 0
            r11.p(r14)
        L395:
            r11.p(r14)
            goto L3a3
        L399:
            r14 = 0
            r1 = -201344863(0xfffffffff3ffb8a1, float:-4.0520643E31)
            r11.a0(r1)
            r11.p(r14)
        L3a3:
            y0.o r2 = p.h1.d(r0, r10)
            r0 = 8
            float r4 = (float) r0
            r6 = 0
            r7 = 13
            r3 = 0
            r5 = 0
            y0.o r15 = p.d.p(r2, r3, r4, r5, r6, r7)
            sh.q1 r20 = sh.c.a(r11)
            r23 = 390(0x186, float:5.47E-43)
            r24 = 1912(0x778, float:2.679E-42)
            java.lang.String r13 = "关闭"
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r0 = r44
            r22 = r11
            r14 = r38
            sh.s.o(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.p(r0)
            goto L3d7
        L3d4:
            r11.V()
        L3d7:
            sf.n r0 = sf.n.f12433a
            return r0
        L3da:
            java.lang.Object r1 = r0.f15609h
            r3 = r1
            qg.t r3 = (qg.t) r3
            java.lang.Object r1 = r0.f15610i
            r6 = r1
            fb.v r6 = (fb.v) r6
            java.lang.Object r1 = r0.f15611j
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r1 = r0.f15612k
            r8 = r1
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r1 = r0.f15613l
            r4 = r1
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r1 = r0.f15614m
            r5 = r1
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r1 = r0.f15615n
            i0.a1 r1 = (i0.a1) r1
            r14 = r43
            i0.h0 r14 = (i0.h0) r14
            r2 = r44
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9 = r2 & 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r9 == r10) goto L411
            r9 = r11
            goto L412
        L411:
            r9 = r12
        L412:
            r2 = r2 & r11
            boolean r2 = r14.S(r2, r9)
            if (r2 == 0) goto L4ca
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L429
            java.lang.String r2 = "正在拉取模型"
        L427:
            r10 = r2
            goto L44f
        L429:
            java.lang.Object r2 = r5.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L43c
            java.lang.Object r2 = r5.getValue()
            java.lang.String r2 = (java.lang.String) r2
            goto L427
        L43c:
            java.lang.Object r2 = r7.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            java.lang.String r9 = "已获取 "
            java.lang.String r10 = " 个模型"
            java.lang.String r2 = eh.a.m(r2, r9, r10)
            goto L427
        L44f:
            boolean r2 = r14.h(r3)
            boolean r9 = r14.h(r6)
            r2 = r2 | r9
            boolean r9 = r14.f(r7)
            r2 = r2 | r9
            boolean r9 = r14.f(r8)
            r2 = r2 | r9
            java.lang.Object r9 = r14.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L46c
            if (r9 != r13) goto L477
        L46c:
            c9.p0 r2 = new c9.p0
            r9 = 15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r14.k0(r2)
            r9 = r2
        L477:
            fg.a r9 = (fg.a) r9
            r2 = 6
            java.lang.String r3 = "拉取模型列表"
            wb.ho.b(r3, r10, r9, r14, r2)
            java.lang.Object r2 = r7.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L4bf
            r2 = 871110371(0x33ec16e3, float:1.09937695E-7)
            r14.a0(r2)
            r2 = 0
            wb.ho.D1(r2, r14, r12, r11)
            java.lang.Object r2 = r1.getValue()
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r14.P()
            if (r2 != r13) goto L4ab
            wb.lp r2 = new wb.lp
            r3 = 5
            r2.<init>(r1, r3)
            r14.k0(r2)
        L4ab:
            r13 = r2
            fg.l r13 = (fg.l) r13
            r15 = 24630(0x6036, float:3.4514E-41)
            r16 = 8
            java.lang.String r9 = "搜索"
            java.lang.String r10 = "输入模型名称"
            r1 = r12
            r12 = 0
            wb.ho.C1(r9, r10, r11, r12, r13, r14, r15, r16)
            r14.p(r1)
            goto L4cd
        L4bf:
            r1 = r12
            r2 = 871238184(0x33ee0a28, float:1.1084586E-7)
            r14.a0(r2)
            r14.p(r1)
            goto L4cd
        L4ca:
            r14.V()
        L4cd:
            sf.n r1 = sf.n.f12433a
            return r1
        L4d0:
            java.lang.Object r1 = r0.f15609h
            r2 = r1
            wb.y2 r2 = (wb.y2) r2
            java.lang.Object r1 = r0.f15610i
            r3 = r1
            vb.a r3 = (vb.a) r3
            java.lang.Object r1 = r0.f15611j
            r4 = r1
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.Object r1 = r0.f15612k
            r5 = r1
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r1 = r0.f15613l
            r6 = r1
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r1 = r0.f15614m
            r7 = r1
            fg.a r7 = (fg.a) r7
            java.lang.Object r1 = r0.f15615n
            r8 = r1
            fg.l r8 = (fg.l) r8
            r9 = r43
            i0.h0 r9 = (i0.h0) r9
            r1 = r44
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 1769473(0x1b0001, float:2.47956E-39)
            int r10 = i0.r.C(r1)
            r2.v(r3, r4, r5, r6, r7, r8, r9, r10)
        L508:
            sf.n r1 = sf.n.f12433a
            return r1
        L50b:
            java.lang.Object r1 = r0.f15609h
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.f15610i
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r0.f15611j
            r4 = r1
            fg.a r4 = (fg.a) r4
            java.lang.Object r1 = r0.f15612k
            r5 = r1
            fg.p r5 = (fg.p) r5
            java.lang.Object r1 = r0.f15613l
            r6 = r1
            fg.a r6 = (fg.a) r6
            java.lang.Object r1 = r0.f15614m
            r7 = r1
            fg.a r7 = (fg.a) r7
            java.lang.Object r1 = r0.f15615n
            r8 = r1
            fg.l r8 = (fg.l) r8
            r9 = r43
            i0.h0 r9 = (i0.h0) r9
            r1 = r44
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 224641(0x36d81, float:3.14789E-40)
            int r10 = i0.r.C(r1)
            wb.ho.a2(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L508
        L544:
            java.lang.Object r1 = r0.f15609h
            r3 = r1
            fg.p r3 = (fg.p) r3
            java.lang.Object r1 = r0.f15610i
            r6 = r1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.f15611j
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r0.f15612k
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f15613l
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r0.f15614m
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r7 = r0.f15615n
            i0.a1 r7 = (i0.a1) r7
            r8 = r43
            i0.h0 r8 = (i0.h0) r8
            r9 = r44
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = r9 & 3
            r11 = 2
            r12 = 0
            r13 = 1
            if (r10 == r11) goto L577
            r10 = r13
            goto L578
        L577:
            r10 = r12
        L578:
            r9 = r9 & r13
            boolean r9 = r8.S(r9, r10)
            if (r9 == 0) goto L720
            p.e r9 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            p.t r9 = p.s.a(r9, r10, r8, r12)
            long r10 = r8.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r8.l()
            y0.l r14 = y0.l.f21818a
            y0.o r15 = y0.a.c(r8, r14)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r13 = x1.f.f20883b
            r8.d0()
            boolean r12 = r8.S
            if (r12 == 0) goto L5a9
            r8.k(r13)
            goto L5ac
        L5a9:
            r8.n0()
        L5ac:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r8, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r8, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r8, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r8)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r8, r15)
            r9 = -1698738577(0xffffffff9abf4e6f, float:-7.9122465E-23)
            r8.a0(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r2.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "将删除已选的 "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = " 位好友"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.append(r10)
            java.lang.Object r10 = r4.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L5ff
            java.lang.String r10 = "，并同时清理聊天记录"
            r9.append(r10)
        L5ff:
            java.lang.String r10 = "。此操作不可撤销。"
            r9.append(r10)
            r10 = 6
            java.util.List r15 = tf.m.L1(r10, r2)
            java.lang.Object r11 = r8.P()
            i0.e r12 = i0.l.f5952a
            if (r11 != r12) goto L61b
            w0.l r11 = new w0.l
            r13 = 27
            r11.<init>(r13)
            r8.k0(r11)
        L61b:
            r19 = r11
            fg.l r19 = (fg.l) r19
            r20 = 30
            java.lang.String r16 = "、"
            r17 = 0
            r18 = 0
            java.lang.String r11 = tf.m.A1(r15, r16, r17, r18, r19, r20)
            boolean r13 = og.m.t0(r11)
            if (r13 != 0) goto L63a
            java.lang.String r13 = "\n\n"
            java.lang.String r11 = r13.concat(r11)
            r9.append(r11)
        L63a:
            int r2 = r2.size()
            if (r2 <= r10) goto L645
            java.lang.String r2 = " 等"
            r9.append(r2)
        L645:
            java.lang.String r2 = r9.toString()
            r9 = 0
            r8.p(r9)
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r9 = r8.j(r9)
            bi.b r9 = (bi.b) r9
            long r10 = r9.g()
            r9 = 14
            long r15 = x6.d.D(r9)
            r29 = 0
            r30 = 262122(0x3ffea, float:3.67311E-40)
            r9 = 0
            r13 = r14
            r14 = 0
            r17 = r12
            r40 = r15
            r16 = r13
            r12 = r40
            r15 = 0
            r18 = r16
            r19 = r17
            r16 = 0
            r20 = r18
            r18 = 0
            r22 = r19
            r21 = r20
            r19 = 0
            r23 = r21
            r21 = 0
            r24 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r26 = r24
            r24 = 0
            r27 = r25
            r25 = 0
            r28 = r26
            r26 = 0
            r31 = r28
            r28 = 24576(0x6000, float:3.4438E-41)
            r40 = r31
            r31 = r1
            r1 = r27
            r27 = r8
            r8 = r2
            r2 = r40
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9 = r27
            boolean r8 = r9.f(r3)
            boolean r10 = r9.h(r6)
            r8 = r8 | r10
            java.lang.Object r10 = r9.P()
            if (r8 != 0) goto L6c1
            if (r10 != r2) goto L6be
            goto L6c1
        L6be:
            r2 = r10
            r10 = 1
            goto L6cc
        L6c1:
            c9.r0 r2 = new c9.r0
            r8 = 11
            r10 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.k0(r2)
        L6cc:
            fg.a r2 = (fg.a) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r1, r3)
            r4 = 12
            float r13 = (float) r4
            r15 = 0
            r16 = 13
            r12 = 0
            r14 = 0
            y0.o r4 = p.d.p(r11, r12, r13, r14, r15, r16)
            sh.q1 r15 = sh.c.a(r9)
            r18 = 390(0x186, float:5.47E-43)
            r19 = 1912(0x778, float:2.679E-42)
            java.lang.String r8 = "确认删除"
            r11 = 0
            r13 = 0
            r16 = 0
            r17 = r9
            r9 = r2
            r2 = r10
            r10 = r4
            sh.s.o(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r16 = r17
            y0.o r4 = p.h1.d(r1, r3)
            r1 = 8
            float r6 = (float) r1
            r8 = 0
            r9 = 13
            r5 = 0
            r7 = 0
            y0.o r9 = p.d.p(r4, r5, r6, r7, r8, r9)
            sh.q1 r14 = sh.c.a(r16)
            r17 = 390(0x186, float:5.47E-43)
            r18 = 1912(0x778, float:2.679E-42)
            java.lang.String r7 = "取消"
            r10 = 0
            r11 = 0
            r15 = 0
            r8 = r31
            sh.s.o(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r9 = r16
            r9.p(r2)
            goto L724
        L720:
            r9 = r8
            r9.V()
        L724:
            sf.n r1 = sf.n.f12433a
            return r1
        L727:
            java.lang.Object r1 = r0.f15609h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f15610i
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f15611j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f15612k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r0.f15613l
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f15614m
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f15615n
            i0.a1 r7 = (i0.a1) r7
            r13 = r43
            i0.h0 r13 = (i0.h0) r13
            r8 = r44
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r8 & 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r9 == r10) goto L758
            r9 = r11
            goto L759
        L758:
            r9 = r12
        L759:
            r8 = r8 & r11
            boolean r8 = r13.S(r8, r9)
            if (r8 == 0) goto L85e
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r8 = 6
            if (r3 == 0) goto L77d
            r1 = 1468117903(0x5781b38f, float:2.852164E14)
            r13.a0(r1)
            java.lang.String r1 = "正在载入监听群..."
            wb.ho.s0(r1, r13, r8)
            r13.p(r12)
            goto L861
        L77d:
            java.lang.Object r3 = r4.getValue()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L79d
            r1 = 1468120136(0x5781bc48, float:2.8529132E14)
            r13.a0(r1)
            java.lang.Object r1 = r4.getValue()
            java.lang.String r1 = (java.lang.String) r1
            wb.ho.s0(r1, r13, r12)
            r13.p(r12)
            goto L861
        L79d:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7b3
            r1 = 1468122261(0x5781c495, float:2.8536263E14)
            r13.a0(r1)
            java.lang.String r1 = "暂无监听群。先选择需要监听的群。"
            wb.ho.s0(r1, r13, r8)
            r13.p(r12)
            goto L861
        L7b3:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L7c9
            r1 = 1468124651(0x5781cdeb, float:2.8544282E14)
            r13.a0(r1)
            java.lang.String r1 = "没有匹配结果"
            wb.ho.s0(r1, r13, r8)
            r13.p(r12)
            goto L861
        L7c9:
            r1 = -1732695628(0xffffffff98b929b4, float:-4.786349E-24)
            r13.a0(r1)
            java.util.Iterator r1 = r2.iterator()
            r3 = r12
        L7d4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L859
            java.lang.Object r4 = r1.next()
            int r16 = r3 + 1
            if (r3 < 0) goto L854
            wb.s0 r4 = (wb.s0) r4
            java.lang.Object r8 = r7.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.lang.String r9 = r4.f18970a
            boolean r8 = r8.contains(r9)
            java.lang.String r10 = r4.f18971b
            boolean r14 = og.m.t0(r10)
            if (r14 == 0) goto L7f9
            r10 = r9
        L7f9:
            java.lang.String r9 = wb.ho.G5(r9, r9, r5, r6)
            boolean r14 = r13.f(r7)
            boolean r15 = r13.h(r4)
            r14 = r14 | r15
            java.lang.Object r15 = r13.P()
            if (r14 != 0) goto L810
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L81a
        L810:
            wb.l7 r15 = new wb.l7
            r14 = 9
            r15.<init>(r4, r14, r7)
            r13.k0(r15)
        L81a:
            fg.l r15 = (fg.l) r15
            r14 = 0
            r4 = r12
            r12 = r15
            r15 = 8
            r17 = r11
            r11 = 0
            r43 = r10
            r10 = r9
            r9 = r43
            r43 = r1
            r1 = r4
            r4 = r17
            wb.ho.P3(r8, r9, r10, r11, r12, r13, r14, r15)
            int r8 = r2.size()
            int r8 = r8 - r4
            if (r3 >= r8) goto L846
            r3 = 201607443(0xc044913, float:1.01909E-31)
            r13.a0(r3)
            r3 = 0
            wb.ho.D1(r3, r13, r1, r4)
        L842:
            r13.p(r1)
            goto L84d
        L846:
            r3 = 1954876893(0x74850ddd, float:8.433309E31)
            r13.a0(r3)
            goto L842
        L84d:
            r12 = r1
            r11 = r4
            r3 = r16
            r1 = r43
            goto L7d4
        L854:
            a.a.Q0()
            r1 = 0
            throw r1
        L859:
            r1 = r12
            r13.p(r1)
            goto L861
        L85e:
            r13.V()
        L861:
            sf.n r1 = sf.n.f12433a
            return r1
        L864:
            java.lang.Object r1 = r0.f15609h
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.f15610i
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r0.f15611j
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.f15612k
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.f15613l
            r7 = r1
            c9.r0 r7 = (c9.r0) r7
            java.lang.Object r1 = r0.f15614m
            db.f r1 = (db.f) r1
            java.lang.Object r2 = r0.f15615n
            wb.xi r2 = (wb.xi) r2
            r10 = r43
            i0.h0 r10 = (i0.h0) r10
            r8 = r44
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r8 & 3
            r11 = 2
            r12 = 1
            if (r9 == r11) goto L899
            r9 = r12
            goto L89a
        L899:
            r9 = 0
        L89a:
            r8 = r8 & r12
            boolean r8 = r10.S(r8, r9)
            if (r8 == 0) goto L8e5
            wb.y2 r8 = wb.y2.f20285j
            boolean r9 = r10.f(r1)
            boolean r11 = r10.f(r7)
            r9 = r9 | r11
            java.lang.Object r11 = r10.P()
            i0.e r12 = i0.l.f5952a
            if (r9 != 0) goto L8b6
            if (r11 != r12) goto L8bf
        L8b6:
            db.f r11 = new db.f
            r9 = 4
            r11.<init>(r1, r9, r7)
            r10.k0(r11)
        L8bf:
            fg.q r11 = (fg.q) r11
            boolean r1 = r10.f(r2)
            boolean r9 = r10.f(r7)
            r1 = r1 | r9
            java.lang.Object r9 = r10.P()
            if (r1 != 0) goto L8d2
            if (r9 != r12) goto L8db
        L8d2:
            sh.v1 r9 = new sh.v1
            r1 = 7
            r9.<init>(r2, r1, r7)
            r10.k0(r9)
        L8db:
            fg.a r9 = (fg.a) r9
            r2 = r8
            r8 = r11
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r2.y(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L8e8
        L8e5:
            r10.V()
        L8e8:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
