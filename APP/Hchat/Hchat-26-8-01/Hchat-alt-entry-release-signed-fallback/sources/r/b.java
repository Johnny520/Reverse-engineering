package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f11136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11144p;

    public /* synthetic */ b(java.lang.String r2, java.util.List r3, java.lang.String r4, fg.l r5, i0.a1 r6, i0.a1 r7, boolean r8, fg.a r9, i0.a1 r10) {
            r1 = this;
            r0 = 1
            r1.f11135g = r0
            r1.<init>()
            r1.f11138j = r2
            r1.f11139k = r3
            r1.f11140l = r4
            r1.f11136h = r5
            r1.f11141m = r6
            r1.f11142n = r7
            r1.f11137i = r8
            r1.f11143o = r9
            r1.f11144p = r10
            return
    }

    public /* synthetic */ b(y0.o r1, r.z r2, p.x0 r3, p.g r4, y0.f r5, m.p r6, boolean r7, k.k1 r8, fg.l r9, int r10) {
            r0 = this;
            r10 = 0
            r0.f11135g = r10
            r0.<init>()
            r0.f11138j = r1
            r0.f11139k = r2
            r0.f11140l = r3
            r0.f11141m = r4
            r0.f11142n = r5
            r0.f11143o = r6
            r0.f11137i = r7
            r0.f11144p = r8
            r0.f11136h = r9
            return
    }

    public /* synthetic */ b(boolean r2, fg.l r3, java.lang.String r4, fg.l r5, java.lang.String r6, java.lang.String r7, fg.l r8, java.util.List r9, fg.p r10) {
            r1 = this;
            r0 = 2
            r1.f11135g = r0
            r1.<init>()
            r1.f11137i = r2
            r1.f11136h = r3
            r1.f11138j = r4
            r1.f11139k = r5
            r1.f11140l = r6
            r1.f11141m = r7
            r1.f11142n = r8
            r1.f11143o = r9
            r1.f11144p = r10
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48) {
            r46 = this;
            r0 = r46
            int r1 = r0.f11135g
            switch(r1) {
                case 0: goto L535;
                case 1: goto L26c;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f11138j
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.f11139k
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f11140l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f11141m
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r0.f11142n
            r12 = r2
            fg.l r12 = (fg.l) r12
            java.lang.Object r2 = r0.f11143o
            r16 = r2
            java.util.List r16 = (java.util.List) r16
            java.lang.Object r2 = r0.f11144p
            r13 = r2
            fg.p r13 = (fg.p) r13
            r8 = r47
            i0.h0 r8 = (i0.h0) r8
            r2 = r48
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r14 = 1
            r15 = 0
            if (r3 == r4) goto L3f
            r3 = r14
            goto L40
        L3f:
            r3 = r15
        L40:
            r2 = r2 & r14
            boolean r2 = r8.S(r2, r3)
            if (r2 == 0) goto L266
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.l r3 = y0.l.f21818a
            y0.o r2 = p.h1.d(r3, r2)
            p.e r4 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            p.t r4 = p.s.a(r4, r7, r8, r15)
            long r9 = r8.T
            int r7 = java.lang.Long.hashCode(r9)
            s0.h r9 = r8.l()
            y0.o r2 = y0.a.c(r8, r2)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r8.d0()
            boolean r14 = r8.S
            if (r14 == 0) goto L77
            r8.k(r10)
            goto L7a
        L77:
            r8.n0()
        L7a:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r8, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r8, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r8, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r8)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r8, r2)
            boolean r2 = r0.f11137i
            if (r2 == 0) goto La0
            java.lang.String r4 = "允许 Agent 按需查询公开资料"
        L9d:
            r19 = r4
            goto La3
        La0:
            java.lang.String r4 = "已关闭，Agent 不会发起搜索"
            goto L9d
        La3:
            r23 = 48
            r24 = 8
            java.lang.String r18 = "联网搜索"
            r20 = 0
            fg.l r4 = r0.f11136h
            r17 = r2
            r21 = r4
            r22 = r8
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            r14 = 0
            r2 = 1
            wb.ho.D1(r14, r8, r15, r2)
            java.lang.String r2 = "ask"
            boolean r4 = gg.l.a(r5, r2)
            if (r4 == 0) goto Lc6
            java.lang.String r4 = "每次询问工具写入和最终提交"
            goto Lc8
        Lc6:
            java.lang.String r4 = "始终允许并自动提交"
        Lc8:
            wb.dq r7 = new wb.dq
            java.lang.String r9 = "每次询问"
            r7.<init>(r2, r9)
            wb.dq r2 = new wb.dq
            java.lang.String r9 = "始终允许"
            java.lang.String r10 = "always_allow"
            r2.<init>(r10, r9)
            wb.dq[] r2 = new wb.dq[]{r7, r2}
            java.util.List r2 = a.a.y0(r2)
            r9 = 6
            r10 = 32
            r7 = r3
            r3 = r4
            r4 = r2
            java.lang.String r2 = "插件文件修改确认"
            r17 = r7
            r7 = 0
            r40 = r17
            wb.ho.I2(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 1
            wb.ho.D1(r14, r8, r15, r2)
            java.lang.String r3 = "gemini"
            boolean r3 = gg.l.a(r11, r3)
            java.lang.String r4 = "off"
            java.lang.String r5 = "force"
            if (r3 == 0) goto L103
            java.lang.String r3 = "Gemini 不使用 OpenAI 或 Anthropic 的显式缓存字段"
            goto L117
        L103:
            boolean r3 = gg.l.a(r1, r5)
            if (r3 == 0) goto L10c
            java.lang.String r3 = "向兼容接口发送稳定缓存标识，不支持时自动回退"
            goto L117
        L10c:
            boolean r3 = gg.l.a(r1, r4)
            if (r3 == 0) goto L115
            java.lang.String r3 = "不发送显式缓存字段"
            goto L117
        L115:
            java.lang.String r3 = "官方接口显式缓存，其他接口使用服务端默认策略"
        L117:
            wb.dq r6 = new wb.dq
            java.lang.String r7 = "自动"
            java.lang.String r9 = "auto"
            r6.<init>(r9, r7)
            wb.dq r7 = new wb.dq
            java.lang.String r9 = "强制"
            r7.<init>(r5, r9)
            wb.dq r5 = new wb.dq
            java.lang.String r9 = "关闭"
            r5.<init>(r4, r9)
            wb.dq[] r4 = new wb.dq[]{r6, r7, r5}
            java.util.List r9 = a.a.y0(r4)
            r4 = r14
            r14 = 6
            r5 = r15
            r15 = 32
            java.lang.String r7 = "提示缓存"
            r11 = r12
            r12 = 0
            r10 = r1
            r1 = r2
            r2 = r13
            r13 = r8
            r8 = r3
            wb.ho.I2(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r8 = r13
            boolean r3 = r16.isEmpty()
            r6 = 16
            r7 = 12
            if (r3 != 0) goto L21b
            r3 = -692094503(0xffffffffd6bf79d9, float:-1.0526503E14)
            r8.a0(r3)
            wb.ho.D1(r4, r8, r5, r1)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r8.j(r3)
            bi.b r3 = (bi.b) r3
            long r19 = r3.h()
            long r21 = x6.d.D(r7)
            float r3 = (float) r6
            r6 = 8
            float r6 = (float) r6
            r9 = r40
            y0.o r18 = p.d.m(r9, r3, r6)
            r38 = 0
            r39 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r17 = "MCP 服务器"
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 24630(0x6036, float:3.4514E-41)
            r36 = r8
            sh.s.n(r17, r18, r19, r21, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.Iterator r3 = r16.iterator()
            r15 = r5
        L19e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L217
            java.lang.Object r6 = r3.next()
            int r7 = r15 + 1
            if (r15 < 0) goto L212
            fb.r0 r6 = (fb.r0) r6
            if (r15 <= 0) goto L1bd
            r9 = 728513736(0x2b6c3cc8, float:8.3928394E-13)
            r8.a0(r9)
            wb.ho.D1(r4, r8, r5, r1)
        L1b9:
            r8.p(r5)
            goto L1c4
        L1bd:
            r9 = 1109102792(0x421b90c8, float:38.891388)
            r8.a0(r9)
            goto L1b9
        L1c4:
            boolean r9 = r6.f3746c
            java.lang.String r10 = r6.f3745b
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto L1d4
            java.lang.String r10 = "MCP "
            java.lang.String r10 = eh.a.l(r7, r10)
        L1d4:
            r18 = r10
            java.lang.String r10 = r6.f3747d
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto L1e0
            java.lang.String r10 = "未配置 Endpoint"
        L1e0:
            r19 = r10
            boolean r10 = r8.f(r2)
            boolean r11 = r8.h(r6)
            r10 = r10 | r11
            java.lang.Object r11 = r8.P()
            if (r10 != 0) goto L1f5
            i0.e r10 = i0.l.f5952a
            if (r11 != r10) goto L1ff
        L1f5:
            wb.l7 r11 = new wb.l7
            r10 = 17
            r11.<init>(r2, r10, r6)
            r8.k0(r11)
        L1ff:
            r21 = r11
            fg.l r21 = (fg.l) r21
            r23 = 0
            r24 = 8
            r20 = 0
            r22 = r8
            r17 = r9
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            r15 = r7
            goto L19e
        L212:
            a.a.Q0()
            r1 = 0
            throw r1
        L217:
            r8.p(r5)
            goto L262
        L21b:
            r9 = r40
            r2 = -691239585(0xffffffffd6cc855f, float:-1.124366E14)
            r8.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            long r19 = r2.h()
            long r21 = x6.d.D(r7)
            float r2 = (float) r6
            r3 = 10
            float r3 = (float) r3
            y0.o r18 = p.d.m(r9, r2, r3)
            r38 = 0
            r39 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r17 = "暂无 MCP 服务器，请先在 Agent 配置中添加。"
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 24630(0x6036, float:3.4514E-41)
            r36 = r8
            sh.s.n(r17, r18, r19, r21, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r8.p(r5)
        L262:
            r8.p(r1)
            goto L269
        L266:
            r8.V()
        L269:
            sf.n r1 = sf.n.f12433a
            return r1
        L26c:
            java.lang.Object r1 = r0.f11138j
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.f11139k
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f11140l
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r0.f11141m
            r11 = r2
            i0.a1 r11 = (i0.a1) r11
            java.lang.Object r2 = r0.f11142n
            r12 = r2
            i0.a1 r12 = (i0.a1) r12
            java.lang.Object r2 = r0.f11143o
            r14 = r2
            fg.a r14 = (fg.a) r14
            java.lang.Object r2 = r0.f11144p
            r13 = r2
            i0.a1 r13 = (i0.a1) r13
            r8 = r47
            i0.h0 r8 = (i0.h0) r8
            r2 = r48
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 3
            r6 = 2
            r9 = 1
            if (r4 == r6) goto L2a2
            r4 = r9
            goto L2a3
        L2a2:
            r4 = 0
        L2a3:
            r2 = r2 & r9
            boolean r2 = r8.S(r2, r4)
            if (r2 == 0) goto L52f
            y0.l r2 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r2, r4)
            r6 = 16
            float r6 = (float) r6
            r10 = 10
            float r10 = (float) r10
            r7 = 8
            float r7 = (float) r7
            r19 = 0
            r20 = 8
            r16 = r6
            r18 = r7
            r17 = r10
            y0.o r6 = p.d.p(r15, r16, r17, r18, r19, r20)
            r7 = r17
            r10 = r18
            y0.f r15 = y0.b.f21802q
            p.c r9 = p.j.f9924a
            r4 = 48
            p.e1 r4 = p.d1.a(r9, r15, r8, r4)
            r39 = r2
            r9 = r3
            long r2 = r8.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r8.l()
            y0.o r6 = y0.a.c(r8, r6)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r8.d0()
            r16 = r2
            boolean r2 = r8.S
            if (r2 == 0) goto L2fc
            r8.k(r15)
            goto L2ff
        L2fc:
            r8.n0()
        L2ff:
            x1.e r2 = x1.f.f20886e
            i0.r.A(r2, r8, r4)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r8, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r8, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r8)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r8, r6)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            long r17 = r2.g()
            m2.k r21 = m2.k.f8698j
            r2 = 1065353216(0x3f800000, float:1.0)
            double r3 = (double) r2
            r15 = 0
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L334
            goto L339
        L334:
            java.lang.String r3 = "invalid weight; must be greater than zero"
            q.a.a(r3)
        L339:
            p.q0 r3 = new p.q0
            r4 = 1
            r3.<init>(r2, r4)
            r36 = 0
            r37 = 262072(0x3ffb8, float:3.67241E-40)
            java.lang.String r15 = "选择模型配置"
            r19 = 0
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
            r35 = 1572870(0x180006, float:2.20406E-39)
            r16 = r3
            r34 = r8
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r3 = 0
            float r4 = (float) r3
            r6 = 34
            float r6 = (float) r6
            r15 = 12
            float r15 = (float) r15
            r2 = 4
            float r2 = (float) r2
            p.z0 r3 = new p.z0
            r3.<init>(r15, r2, r15, r2)
            sh.q1 r22 = sh.c.a(r8)
            boolean r16 = r8.f(r11)
            r27 = r2
            java.lang.Object r2 = r8.P()
            r17 = r7
            i0.e r7 = i0.l.f5952a
            if (r16 != 0) goto L38f
            if (r2 != r7) goto L38c
            goto L38f
        L38c:
            r23 = r3
            goto L39a
        L38f:
            wb.pk r2 = new wb.pk
            r23 = r3
            r3 = 7
            r2.<init>(r3, r11, r12)
            r8.k0(r2)
        L39a:
            r16 = r2
            fg.a r16 = (fg.a) r16
            r25 = 102457350(0x61b6006, float:2.9222807E-35)
            r26 = 1548(0x60c, float:2.169E-42)
            r2 = r15
            java.lang.String r15 = "+ 新建"
            r19 = r17
            r17 = 0
            r18 = 0
            r20 = r4
            r21 = r6
            r24 = r8
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 1
            r8.p(r4)
            r3 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = tf.n.e1(r1)
            r4.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
        L3c7:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L3e5
            java.lang.Object r15 = r6.next()
            fb.t0 r15 = (fb.t0) r15
            wb.dq r3 = new wb.dq
            r16 = r2
            java.lang.String r2 = r15.f3784b
            java.lang.String r15 = r15.f3783a
            r3.<init>(r15, r2)
            r4.add(r3)
            r2 = r16
            r3 = 1
            goto L3c7
        L3e5:
            r16 = r2
            boolean r2 = r8.h(r1)
            fg.l r3 = r0.f11136h
            boolean r6 = r8.f(r3)
            r2 = r2 | r6
            java.lang.Object r6 = r8.P()
            if (r2 != 0) goto L3fa
            if (r6 != r7) goto L403
        L3fa:
            wb.l1 r6 = new wb.l1
            r2 = 5
            r6.<init>(r1, r3, r2)
            r8.k0(r6)
        L403:
            fg.l r6 = (fg.l) r6
            r3 = r9
            r9 = 6
            r18 = r10
            r10 = 32
            java.lang.String r2 = "当前配置"
            r15 = r7
            r7 = 0
            r45 = r15
            r42 = r16
            r41 = r18
            r43 = r27
            r44 = r39
            r15 = 0
            r27 = r1
            r1 = 1
            wb.ho.I2(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            wb.ho.D1(r2, r8, r15, r1)
            r2 = r44
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r4 = p.h1.d(r2, r4)
            r5 = 6
            float r6 = (float) r5
            r10 = r41
            y0.o r4 = p.d.m(r4, r10, r6)
            p.h r6 = p.j.g(r10)
            y0.f r7 = y0.b.f21801p
            p.e1 r5 = p.d1.a(r6, r7, r8, r5)
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r8.l()
            y0.o r4 = y0.a.c(r8, r4)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r8.d0()
            boolean r10 = r8.S
            if (r10 == 0) goto L45e
            r8.k(r9)
            goto L461
        L45e:
            r8.n0()
        L461:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r8, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r8, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r8, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r8)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r8, r4)
            p.f1 r4 = p.f1.f9898a
            y0.o r17 = r4.a(r2, r1)
            p.z0 r5 = new p.z0
            r6 = r42
            r7 = r43
            r5.<init>(r6, r7, r6, r7)
            sh.q1 r22 = sh.c.a(r8)
            boolean r9 = r8.f(r11)
            boolean r10 = r8.f(r3)
            r9 = r9 | r10
            java.lang.Object r10 = r8.P()
            if (r9 != 0) goto L4a5
            r9 = r45
            if (r10 != r9) goto L4b0
            goto L4a7
        L4a5:
            r9 = r45
        L4a7:
            wb.yh r10 = new wb.yh
            r15 = 1
            r10.<init>(r3, r11, r12, r15)
            r8.k0(r10)
        L4b0:
            r16 = r10
            fg.a r16 = (fg.a) r16
            r25 = 102457350(0x61b6006, float:2.9222807E-35)
            r26 = 1544(0x608, float:2.164E-42)
            java.lang.String r15 = "重命名"
            r18 = 0
            r23 = r5
            r24 = r8
            r3 = 0
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r5 = r27.size()
            if (r5 <= r1) goto L4ce
            r18 = r1
            goto L4d0
        L4ce:
            r18 = r3
        L4d0:
            y0.o r17 = r4.a(r2, r1)
            p.z0 r3 = new p.z0
            r3.<init>(r6, r7, r6, r7)
            sh.q1 r22 = sh.c.a(r8)
            java.lang.Object r5 = r8.P()
            if (r5 != r9) goto L4ed
            wb.jp r5 = new wb.jp
            r9 = 9
            r5.<init>(r13, r9)
            r8.k0(r5)
        L4ed:
            r16 = r5
            fg.a r16 = (fg.a) r16
            r25 = 102457398(0x61b6036, float:2.9222945E-35)
            r26 = 1536(0x600, float:2.152E-42)
            java.lang.String r15 = "删除"
            r23 = r3
            r24 = r8
            sh.s.o(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = r0.f11137i
            if (r3 == 0) goto L507
            java.lang.String r5 = "测试中"
        L505:
            r13 = r5
            goto L50a
        L507:
            java.lang.String r5 = "测试连接"
            goto L505
        L50a:
            r16 = r3 ^ 1
            y0.o r15 = r4.a(r2, r1)
            p.z0 r2 = new p.z0
            r2.<init>(r6, r7, r6, r7)
            r18 = r20
            sh.q1 r20 = sh.c.a(r8)
            r23 = 102457344(0x61b6000, float:2.922279E-35)
            r24 = 1536(0x600, float:2.152E-42)
            r22 = r8
            r17 = r19
            r19 = r21
            r21 = r2
            sh.s.o(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r8.p(r1)
            goto L532
        L52f:
            r8.V()
        L532:
            sf.n r1 = sf.n.f12433a
            return r1
        L535:
            java.lang.Object r1 = r0.f11138j
            r2 = r1
            y0.o r2 = (y0.o) r2
            java.lang.Object r1 = r0.f11139k
            r3 = r1
            r.z r3 = (r.z) r3
            java.lang.Object r1 = r0.f11140l
            r4 = r1
            p.x0 r4 = (p.x0) r4
            java.lang.Object r1 = r0.f11141m
            r5 = r1
            p.g r5 = (p.g) r5
            java.lang.Object r1 = r0.f11142n
            r6 = r1
            y0.f r6 = (y0.f) r6
            java.lang.Object r1 = r0.f11143o
            r7 = r1
            m.p r7 = (m.p) r7
            java.lang.Object r1 = r0.f11144p
            r9 = r1
            k.k1 r9 = (k.k1) r9
            r11 = r47
            i0.h0 r11 = (i0.h0) r11
            r1 = r48
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 24583(0x6007, float:3.4448E-41)
            int r12 = i0.r.C(r1)
            boolean r8 = r0.f11137i
            fg.l r10 = r0.f11136h
            a.a.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
