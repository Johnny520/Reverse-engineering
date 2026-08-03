package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f15941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15946n;

    public /* synthetic */ ef(android.content.Context r1, n9.a r2, boolean r3, fg.a r4, fg.l r5, fg.l r6, fg.a r7, int r8) {
            r0 = this;
            r8 = 1
            r0.f15939g = r8
            r0.<init>()
            r0.f15943k = r1
            r0.f15944l = r2
            r0.f15940h = r3
            r0.f15945m = r4
            r0.f15941i = r5
            r0.f15942j = r6
            r0.f15946n = r7
            return
    }

    public /* synthetic */ ef(java.util.ArrayList r2, java.util.Set r3, java.lang.String r4, fg.a r5, boolean r6, android.app.Activity r7, fg.l r8) {
            r1 = this;
            r0 = 2
            r1.f15939g = r0
            r1.<init>()
            r1.f15942j = r2
            r1.f15943k = r3
            r1.f15944l = r4
            r1.f15945m = r5
            r1.f15940h = r6
            r1.f15946n = r7
            r1.f15941i = r8
            return
    }

    public /* synthetic */ ef(boolean r2, fg.l r3, i0.a1 r4, fg.l r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 0
            r1.f15939g = r0
            r1.<init>()
            r1.f15940h = r2
            r1.f15941i = r3
            r1.f15943k = r4
            r1.f15942j = r5
            r1.f15944l = r6
            r1.f15945m = r7
            r1.f15946n = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49) {
            r47 = this;
            r0 = r47
            int r1 = r0.f15939g
            switch(r1) {
                case 0: goto L2fe;
                case 1: goto L2c9;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f15942j
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.f15943k
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r3 = r0.f15944l
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.f15945m
            fg.a r3 = (fg.a) r3
            java.lang.Object r5 = r0.f15946n
            r8 = r5
            android.app.Activity r8 = (android.app.Activity) r8
            r14 = r48
            i0.h0 r14 = (i0.h0) r14
            r5 = r49
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r9 = 0
            r10 = 1
            if (r6 == r7) goto L32
            r6 = r10
            goto L33
        L32:
            r6 = r9
        L33:
            r5 = r5 & r10
            boolean r5 = r14.S(r5, r6)
            if (r5 == 0) goto L2c2
            boolean r5 = r14.f(r1)
            boolean r6 = r14.f(r2)
            r5 = r5 | r6
            java.lang.Object r6 = r14.P()
            i0.e r7 = i0.l.f5952a
            if (r5 != 0) goto L4d
            if (r6 != r7) goto L80
        L4d:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r2.next()
            r11 = r6
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 < 0) goto L58
            int r12 = r1.size()
            if (r11 >= r12) goto L58
            r5.add(r6)
            goto L58
        L75:
            java.util.Set r2 = tf.m.U1(r5)
            i0.j1 r6 = i0.r.u(r2)
            r14.k0(r6)
        L80:
            r2 = r6
            i0.a1 r2 = (i0.a1) r2
            y0.l r15 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r6 = p.h1.d(r15, r5)
            p.e r11 = p.j.f9926c
            y0.e r12 = y0.b.f21804s
            p.t r11 = p.s.a(r11, r12, r14, r9)
            long r12 = r14.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r14.l()
            y0.o r6 = y0.a.c(r14, r6)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r10 = x1.f.f20883b
            r14.d0()
            boolean r5 = r14.S
            if (r5 == 0) goto Lb3
            r14.k(r10)
            goto Lb6
        Lb3:
            r14.n0()
        Lb6:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r14, r11)
            x1.e r11 = x1.f.f20885d
            i0.r.A(r11, r14, r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            x1.e r13 = x1.f.f20887f
            i0.r.A(r13, r14, r12)
            x1.d r12 = x1.f.f20888g
            i0.r.w(r12, r14)
            r21 = r10
            x1.e r10 = x1.f.f20884c
            i0.r.A(r10, r14, r6)
            boolean r6 = og.m.t0(r4)
            r22 = r10
            r10 = 10
            if (r6 != 0) goto L16b
            r6 = 1782271921(0x6a3b4fb1, float:5.6611365E25)
            r14.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r14.j(r6)
            bi.b r6 = (bi.b) r6
            long r23 = r6.h()
            r6 = 13
            long r25 = x6.d.D(r6)
            r6 = 4
            float r6 = (float) r6
            float r9 = (float) r10
            r20 = 6
            r17 = 0
            r18 = 0
            r16 = r6
            r19 = r9
            y0.o r6 = p.d.p(r15, r16, r17, r18, r19, r20)
            r16 = r8
            r8 = r25
            r25 = 0
            r26 = 262120(0x3ffe8, float:3.67308E-40)
            r17 = r10
            r10 = 0
            r18 = r11
            r11 = 0
            r20 = r12
            r19 = r13
            r12 = 0
            r27 = r7
            r45 = r23
            r24 = r5
            r5 = r6
            r23 = r14
            r6 = r45
            r14 = 0
            r29 = r15
            r28 = r16
            r15 = 0
            r30 = r17
            r17 = 0
            r31 = r18
            r18 = 0
            r32 = r19
            r19 = 0
            r33 = r20
            r20 = 0
            r34 = r21
            r21 = 0
            r35 = r22
            r22 = 0
            r36 = r24
            r24 = 24624(0x6030, float:3.4506E-41)
            r48 = r2
            r37 = r3
            r44 = r27
            r38 = r28
            r2 = r29
            r40 = r31
            r41 = r32
            r42 = r33
            r43 = r35
            r39 = r36
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14 = r23
            r14.p(r3)
            goto L18c
        L16b:
            r48 = r2
            r37 = r3
            r39 = r5
            r44 = r7
            r38 = r8
            r3 = r9
            r40 = r11
            r42 = r12
            r41 = r13
            r2 = r15
            r34 = r21
            r43 = r22
            r0 = 1065353216(0x3f800000, float:1.0)
            r4 = 1782596584(0x6a4043e8, float:5.810861E25)
            r14.a0(r4)
            r14.p(r3)
        L18c:
            y0.o r4 = p.h1.d(r2, r0)
            r5 = 360(0x168, float:5.04E-43)
            float r5 = (float) r5
            r6 = 0
            r7 = 1
            y0.o r9 = p.h1.g(r4, r6, r5, r7)
            boolean r4 = r14.h(r1)
            r5 = r48
            boolean r6 = r14.f(r5)
            r4 = r4 | r6
            java.lang.Object r6 = r14.P()
            if (r4 != 0) goto L1af
            r4 = r44
            if (r6 != r4) goto L1bb
            goto L1b1
        L1af:
            r4 = r44
        L1b1:
            wb.l7 r6 = new wb.l7
            r8 = 19
            r6.<init>(r1, r8, r5)
            r14.k0(r6)
        L1bb:
            r17 = r6
            fg.l r17 = (fg.l) r17
            r19 = 6
            r20 = 510(0x1fe, float:7.15E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r23 = r14
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = r23
            a.a.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r14 = r18
            y0.o r8 = p.h1.d(r2, r0)
            r1 = 10
            float r10 = (float) r1
            r1 = 6
            float r12 = (float) r1
            r13 = 5
            r9 = 0
            r11 = 0
            y0.o r2 = p.d.p(r8, r9, r10, r11, r12, r13)
            r6 = 8
            float r6 = (float) r6
            p.h r6 = p.j.g(r6)
            y0.f r8 = y0.b.f21801p
            p.e1 r1 = p.d1.a(r6, r8, r14, r1)
            long r8 = r14.T
            int r6 = java.lang.Long.hashCode(r8)
            s0.h r8 = r14.l()
            y0.o r2 = y0.a.c(r14, r2)
            r14.d0()
            boolean r9 = r14.S
            if (r9 == 0) goto L20e
            r9 = r34
            r14.k(r9)
        L20b:
            r9 = r39
            goto L212
        L20e:
            r14.n0()
            goto L20b
        L212:
            i0.r.A(r9, r14, r1)
            r1 = r40
            i0.r.A(r1, r14, r8)
            r1 = r41
            r8 = r42
            j8.b.p(r6, r14, r1, r14, r8)
            r1 = r43
            i0.r.A(r1, r14, r2)
            wb.y2 r9 = wb.y2.f20291p
            double r1 = (double) r0
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            java.lang.String r2 = "invalid weight; must be greater than zero"
            if (r1 <= 0) goto L232
            goto L235
        L232:
            q.a.a(r2)
        L235:
            p.q0 r8 = new p.q0
            r8.<init>(r0, r7)
            r11 = 24582(0x6006, float:3.4447E-41)
            r12 = 8
            java.lang.String r6 = "取消"
            r1 = r5
            r5 = r9
            r9 = 0
            r13 = r7
            r10 = r14
            r7 = r37
            r5.k(r6, r7, r8, r9, r10, r11, r12)
            r12 = r5
            boolean r5 = r14.f(r1)
            r6 = r47
            boolean r8 = r6.f15940h
            boolean r9 = r14.g(r8)
            r5 = r5 | r9
            boolean r9 = r14.f(r7)
            r5 = r5 | r9
            r9 = r38
            boolean r10 = r14.h(r9)
            r5 = r5 | r10
            fg.l r10 = r6.f15941i
            boolean r11 = r14.f(r10)
            r5 = r5 | r11
            java.lang.Object r11 = r14.P()
            if (r5 != 0) goto L278
            if (r11 != r4) goto L274
            goto L278
        L274:
            r9 = r1
            r1 = r6
            r6 = r8
            goto L289
        L278:
            wb.ji r5 = new wb.ji
            r11 = 2
            r45 = r9
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r45
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r14.k0(r5)
            r11 = r5
        L289:
            fg.a r11 = (fg.a) r11
            double r4 = (double) r0
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L292
        L290:
            r5 = r12
            goto L296
        L292:
            q.a.a(r2)
            goto L290
        L296:
            p.q0 r12 = new p.q0
            r12.<init>(r0, r13)
            java.lang.Object r0 = r9.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2ae
            if (r6 == 0) goto L2ac
            goto L2ae
        L2ac:
            r9 = r3
            goto L2af
        L2ae:
            r9 = r13
        L2af:
            r15 = 24582(0x6006, float:3.4447E-41)
            r16 = 0
            java.lang.String r10 = "确定"
            r7 = r13
            r13 = r9
            r9 = r5
            r9.k(r10, r11, r12, r13, r14, r15, r16)
            r14.p(r7)
            r14.p(r7)
            goto L2c6
        L2c2:
            r1 = r0
            r14.V()
        L2c6:
            sf.n r0 = sf.n.f12433a
            return r0
        L2c9:
            r1 = r0
            java.lang.Object r0 = r1.f15943k
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r1.f15944l
            r3 = r0
            n9.a r3 = (n9.a) r3
            java.lang.Object r0 = r1.f15945m
            r5 = r0
            fg.a r5 = (fg.a) r5
            java.lang.Object r0 = r1.f15942j
            r7 = r0
            fg.l r7 = (fg.l) r7
            java.lang.Object r0 = r1.f15946n
            r8 = r0
            fg.a r8 = (fg.a) r8
            r9 = r48
            i0.h0 r9 = (i0.h0) r9
            r0 = r49
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            r0 = 3137(0xc41, float:4.396E-42)
            int r10 = i0.r.C(r0)
            boolean r4 = r1.f15940h
            fg.l r6 = r1.f15941i
            wb.ho.b1(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            sf.n r0 = sf.n.f12433a
            return r0
        L2fe:
            r1 = r0
            java.lang.Object r0 = r1.f15943k
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r2 = r1.f15942j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r1.f15944l
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f15945m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f15946n
            i0.a1 r5 = (i0.a1) r5
            r11 = r48
            i0.h0 r11 = (i0.h0) r11
            r6 = r49
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            r8 = 2
            r14 = 1
            r15 = 0
            if (r7 == r8) goto L328
            r7 = r14
            goto L329
        L328:
            r7 = r15
        L329:
            r6 = r6 & r14
            boolean r6 = r11.S(r6, r7)
            if (r6 == 0) goto L40f
            boolean r6 = r1.f15940h
            r7 = 0
            i0.e r8 = i0.l.f5952a
            if (r6 != 0) goto L3a2
            r6 = 1029214637(0x3d5891ad, float:0.052873302)
            r11.a0(r6)
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = wb.ho.j6(r6)
            fg.l r9 = r1.f15941i
            boolean r10 = r11.f(r9)
            boolean r12 = r11.f(r0)
            r10 = r10 | r12
            java.lang.Object r12 = r11.P()
            if (r10 != 0) goto L35a
            if (r12 != r8) goto L364
        L35a:
            wb.o1 r12 = new wb.o1
            r10 = 9
            r12.<init>(r9, r0, r10)
            r11.k0(r12)
        L364:
            fg.a r12 = (fg.a) r12
            java.lang.String r0 = "仅显示成员通知"
            r9 = 6
            wb.ho.b(r0, r6, r12, r11, r9)
            wb.ho.D1(r7, r11, r15, r14)
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = wb.ho.j6(r0)
            boolean r6 = r11.f(r2)
            boolean r10 = r11.f(r3)
            r6 = r6 | r10
            java.lang.Object r10 = r11.P()
            if (r6 != 0) goto L38a
            if (r10 != r8) goto L394
        L38a:
            wb.o1 r10 = new wb.o1
            r6 = 10
            r10.<init>(r2, r3, r6)
            r11.k0(r10)
        L394:
            fg.a r10 = (fg.a) r10
            java.lang.String r2 = "屏蔽成员通知"
            wb.ho.b(r2, r0, r10, r11, r9)
            wb.ho.D1(r7, r11, r15, r14)
            r11.p(r15)
            goto L3ab
        L3a2:
            r0 = 1029665346(0x3d5f7242, float:0.054552324)
            r11.a0(r0)
            r11.p(r15)
        L3ab:
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            boolean r0 = r11.f(r4)
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L3c1
            if (r2 != r8) goto L3cb
        L3c1:
            wb.gi r2 = new wb.gi
            r0 = 10
            r2.<init>(r4, r0)
            r11.k0(r2)
        L3cb:
            r10 = r2
            fg.l r10 = (fg.l) r10
            r12 = 432(0x1b0, float:6.05E-43)
            r13 = 8
            r0 = r7
            java.lang.String r7 = "屏蔽@所有人"
            r2 = r8
            java.lang.String r8 = "命中 @所有人 时不弹通知"
            r9 = 0
            wb.ho.P3(r6, r7, r8, r9, r10, r11, r12, r13)
            wb.ho.D1(r0, r11, r15, r14)
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            boolean r0 = r11.f(r5)
            java.lang.Object r3 = r11.P()
            if (r0 != 0) goto L3f5
            if (r3 != r2) goto L3ff
        L3f5:
            wb.gi r3 = new wb.gi
            r0 = 11
            r3.<init>(r5, r0)
            r11.k0(r3)
        L3ff:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 432(0x1b0, float:6.05E-43)
            r13 = 8
            java.lang.String r7 = "屏蔽@我"
            java.lang.String r8 = "命中 @我 时不弹通知"
            r9 = 0
            wb.ho.P3(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L412
        L40f:
            r11.V()
        L412:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
