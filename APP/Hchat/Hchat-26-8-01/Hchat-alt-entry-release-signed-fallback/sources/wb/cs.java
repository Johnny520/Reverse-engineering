package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fb.d1 f15544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f15546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f15547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15554r;

    public /* synthetic */ cs(fb.d1 r2, boolean r3, fg.l r4, boolean r5, fg.p r6, fg.p r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12) {
            r1 = this;
            r0 = 1
            r1.f15543g = r0
            r1.<init>()
            r1.f15544h = r2
            r1.f15545i = r3
            r1.f15546j = r4
            r1.f15547k = r5
            r1.f15548l = r6
            r1.f15549m = r7
            r1.f15550n = r8
            r1.f15551o = r9
            r1.f15552p = r10
            r1.f15553q = r11
            r1.f15554r = r12
            return
    }

    public /* synthetic */ cs(wb.y2 r1, y0.o r2, fb.d1 r3, boolean r4, boolean r5, fg.a r6, fg.a r7, fg.a r8, fg.a r9, fg.l r10, fg.l r11, int r12) {
            r0 = this;
            r12 = 0
            r0.f15543g = r12
            r0.<init>()
            r0.f15548l = r1
            r0.f15549m = r2
            r0.f15544h = r3
            r0.f15545i = r4
            r0.f15547k = r5
            r0.f15550n = r6
            r0.f15551o = r7
            r0.f15552p = r8
            r0.f15553q = r9
            r0.f15546j = r10
            r0.f15554r = r11
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r38, java.lang.Object r39) {
            r37 = this;
            r0 = r37
            int r1 = r0.f15543g
            switch(r1) {
                case 0: goto L2cd;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f15548l
            fg.p r1 = (fg.p) r1
            java.lang.Object r2 = r0.f15549m
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r0.f15550n
            r6 = r3
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r3 = r0.f15551o
            r7 = r3
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r3 = r0.f15552p
            r12 = r3
            i0.a1 r12 = (i0.a1) r12
            java.lang.Object r3 = r0.f15553q
            r10 = r3
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r3 = r0.f15554r
            i0.a1 r3 = (i0.a1) r3
            r4 = r38
            i0.h0 r4 = (i0.h0) r4
            r5 = r39
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r8 = r5 & 3
            r9 = 0
            r11 = 1
            r13 = 2
            if (r8 == r13) goto L3c
            r8 = r11
            goto L3d
        L3c:
            r8 = r9
        L3d:
            r5 = r5 & r11
            boolean r5 = r4.S(r5, r8)
            if (r5 == 0) goto L2c6
            p.e r5 = p.j.f9926c
            y0.e r8 = y0.b.f21804s
            p.t r5 = p.s.a(r5, r8, r4, r9)
            long r8 = r4.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r4.l()
            y0.l r14 = y0.l.f21818a
            y0.o r15 = y0.a.c(r4, r14)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r11 = x1.f.f20883b
            r4.d0()
            boolean r13 = r4.S
            if (r13 == 0) goto L6e
            r4.k(r11)
            goto L71
        L6e:
            r4.n0()
        L71:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r4, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r4, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r4, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r4)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r4, r15)
            fb.d1 r9 = r0.f15544h
            java.lang.String r5 = r9.f3484b
            boolean r11 = r9.f3495m
            boolean r8 = og.m.t0(r5)
            if (r8 == 0) goto L9c
            java.lang.String r5 = "新对话"
        L9c:
            r13 = r5
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r5 = r4.j(r5)
            bi.b r5 = (bi.b) r5
            long r15 = r5.g()
            r5 = 15
            long r17 = x6.d.D(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r19 = p.h1.d(r14, r5)
            r8 = 8
            float r8 = (float) r8
            r5 = 10
            float r5 = (float) r5
            r24 = 2
            r21 = 0
            r22 = r8
            r23 = r5
            r20 = r8
            y0.o r5 = p.d.p(r19, r20, r21, r22, r23, r24)
            t2.k r8 = new t2.k
            r32 = r4
            r4 = 3
            r8.<init>(r4)
            r34 = 24960(0x6180, float:3.4976E-41)
            r35 = 240616(0x3abe8, float:3.37175E-40)
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r26 = 2
            r27 = 0
            r28 = 2
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 24624(0x6030, float:3.4506E-41)
            r4 = r14
            r14 = r5
            r5 = r4
            r23 = r8
            r4 = 2
            sh.s.n(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r13 = r32
            wb.y2 r14 = wb.y2.f20289n
            m1.f r19 = wb.ap.f15077r
            boolean r8 = r13.h(r9)
            java.lang.Object r15 = r13.P()
            r39 = r14
            i0.e r14 = i0.l.f5952a
            if (r8 != 0) goto L10b
            if (r15 != r14) goto L10d
        L10b:
            r8 = r4
            goto L115
        L10d:
            r8 = r12
            r36 = 1065353216(0x3f800000, float:1.0)
            r12 = r4
            r4 = r15
            r15 = r5
            r5 = r9
            goto L128
        L115:
            c9.n0 r4 = new c9.n0
            r15 = r5
            r5 = r9
            r9 = 27
            r36 = r12
            r12 = r8
            r8 = r36
            r36 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r5, r6, r7, r8, r9)
            r13.k0(r4)
        L128:
            r16 = r4
            fg.a r16 = (fg.a) r16
            r4 = r14
            r14 = 196662(0x30036, float:2.75582E-40)
            r6 = r15
            r15 = 12
            java.lang.String r18 = "编辑标题"
            r20 = 0
            r21 = 0
            r17 = r13
            r13 = r39
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r14 = r13
            r7 = r17
            m1.f r19 = wb.ap.f15079t
            boolean r9 = r7.h(r5)
            r13 = r11
            fg.l r11 = r0.f15546j
            boolean r15 = r7.f(r11)
            r9 = r9 | r15
            java.lang.Object r15 = r7.P()
            if (r9 != 0) goto L159
            if (r15 != r4) goto L15c
        L159:
            r9 = r12
            r12 = r8
            goto L162
        L15c:
            r9 = r5
            r12 = r8
            r5 = r13
            r8 = r15
            r15 = 1
            goto L16f
        L162:
            wb.gt r8 = new wb.gt
            r15 = r13
            r13 = 0
            r9 = r5
            r5 = r15
            r15 = 1
            r8.<init>(r9, r10, r11, r12, r13)
            r7.k0(r8)
        L16f:
            r16 = r8
            fg.a r16 = (fg.a) r16
            r13 = r14
            r14 = 196662(0x30036, float:2.75582E-40)
            r8 = r15
            r15 = 4
            java.lang.String r18 = "上移"
            r20 = 0
            boolean r8 = r0.f15545i
            r17 = r7
            r21 = r8
            r7 = r36
            r8 = 1
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r15 = r13
            r14 = r17
            m1.f r19 = wb.ap.f15080u
            boolean r13 = r14.h(r9)
            boolean r16 = r14.f(r11)
            r13 = r13 | r16
            java.lang.Object r8 = r14.P()
            if (r13 != 0) goto L1a3
            if (r8 != r4) goto L1a1
            goto L1a3
        L1a1:
            r7 = 1
            goto L1ad
        L1a3:
            wb.gt r8 = new wb.gt
            r13 = 1
            r7 = 1
            r8.<init>(r9, r10, r11, r12, r13)
            r14.k0(r8)
        L1ad:
            r16 = r8
            fg.a r16 = (fg.a) r16
            r17 = r14
            r14 = 196662(0x30036, float:2.75582E-40)
            r13 = r15
            r15 = 4
            java.lang.String r18 = "下移"
            r20 = 0
            boolean r8 = r0.f15547k
            r21 = r8
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r14 = r13
            r13 = r17
            m1.f r19 = wb.ap.f15082w
            boolean r8 = r9.f3494l
            if (r8 == 0) goto L1d1
            java.lang.String r8 = "取消置顶"
        L1ce:
            r18 = r8
            goto L1d4
        L1d1:
            java.lang.String r8 = "置顶聊天"
            goto L1ce
        L1d4:
            boolean r8 = r13.f(r1)
            boolean r10 = r13.h(r9)
            r8 = r8 | r10
            java.lang.Object r10 = r13.P()
            if (r8 != 0) goto L1e5
            if (r10 != r4) goto L1ee
        L1e5:
            wb.jr r10 = new wb.jr
            r8 = 0
            r10.<init>(r1, r9, r12, r8)
            r13.k0(r10)
        L1ee:
            r16 = r10
            fg.a r16 = (fg.a) r16
            r15 = r14
            r14 = 196614(0x30006, float:2.75515E-40)
            r17 = r13
            r13 = r15
            r15 = 12
            r20 = 0
            r21 = 0
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r14 = r13
            r13 = r17
            if (r5 == 0) goto L20c
            m1.f r1 = wb.ap.f15084y
        L209:
            r19 = r1
            goto L20f
        L20c:
            m1.f r1 = wb.ap.f15083x
            goto L209
        L20f:
            if (r5 == 0) goto L216
            java.lang.String r1 = "解锁聊天"
        L213:
            r18 = r1
            goto L219
        L216:
            java.lang.String r1 = "锁定聊天"
            goto L213
        L219:
            boolean r1 = r13.f(r2)
            boolean r8 = r13.h(r9)
            r1 = r1 | r8
            java.lang.Object r8 = r13.P()
            if (r1 != 0) goto L22a
            if (r8 != r4) goto L233
        L22a:
            wb.jr r8 = new wb.jr
            r1 = 1
            r8.<init>(r2, r9, r12, r1)
            r13.k0(r8)
        L233:
            r16 = r8
            fg.a r16 = (fg.a) r16
            r15 = r14
            r14 = 196608(0x30000, float:2.75506E-40)
            r17 = r13
            r13 = r15
            r15 = 12
            r20 = 0
            r21 = 0
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r14 = r13
            r13 = r17
            m1.f r19 = wb.ap.f15078s
            if (r5 == 0) goto L252
            java.lang.String r1 = "删除（已锁定）"
        L24f:
            r18 = r1
            goto L255
        L252:
            java.lang.String r1 = "删除"
            goto L24f
        L255:
            r21 = r5 ^ 1
            boolean r1 = r13.h(r9)
            java.lang.Object r2 = r13.P()
            if (r1 != 0) goto L263
            if (r2 != r4) goto L26c
        L263:
            wb.kr r2 = new wb.kr
            r1 = 0
            r2.<init>(r9, r3, r12, r1)
            r13.k0(r2)
        L26c:
            r16 = r2
            fg.a r16 = (fg.a) r16
            r15 = r14
            r14 = 196998(0x30186, float:2.76053E-40)
            r17 = r13
            r13 = r15
            r15 = 0
            r20 = 1
            r13.W(r14, r15, r16, r17, r18, r19, r20, r21)
            r13 = r17
            java.lang.Object r1 = r13.P()
            if (r1 != r4) goto L28e
            wb.jp r1 = new wb.jp
            r2 = 4
            r1.<init>(r12, r2)
            r13.k0(r1)
        L28e:
            r14 = r1
            fg.a r14 = (fg.a) r14
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r6, r1)
            r4 = 2
            float r1 = (float) r4
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r1
            y0.o r15 = p.d.p(r15, r16, r17, r18, r19, r20)
            sh.q1 r20 = sh.c.a(r13)
            r23 = 438(0x1b6, float:6.14E-43)
            r24 = 1912(0x778, float:2.679E-42)
            r17 = r13
            java.lang.String r13 = "取消"
            r16 = 0
            r32 = r17
            r17 = 0
            r21 = 0
            r22 = r32
            sh.s.o(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13 = r22
            r13.p(r7)
            goto L2ca
        L2c6:
            r13 = r4
            r13.V()
        L2ca:
            sf.n r1 = sf.n.f12433a
            return r1
        L2cd:
            java.lang.Object r1 = r0.f15548l
            r2 = r1
            wb.y2 r2 = (wb.y2) r2
            java.lang.Object r1 = r0.f15549m
            r3 = r1
            y0.o r3 = (y0.o) r3
            java.lang.Object r1 = r0.f15550n
            r7 = r1
            fg.a r7 = (fg.a) r7
            java.lang.Object r1 = r0.f15551o
            r8 = r1
            fg.a r8 = (fg.a) r8
            java.lang.Object r1 = r0.f15552p
            r9 = r1
            fg.a r9 = (fg.a) r9
            java.lang.Object r1 = r0.f15553q
            r10 = r1
            fg.a r10 = (fg.a) r10
            java.lang.Object r1 = r0.f15554r
            r12 = r1
            fg.l r12 = (fg.l) r12
            r13 = r38
            i0.h0 r13 = (i0.h0) r13
            r1 = r39
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 1
            int r14 = i0.r.C(r1)
            fb.d1 r4 = r0.f15544h
            boolean r5 = r0.f15545i
            boolean r6 = r0.f15547k
            fg.l r11 = r0.f15546j
            r2.Z(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
