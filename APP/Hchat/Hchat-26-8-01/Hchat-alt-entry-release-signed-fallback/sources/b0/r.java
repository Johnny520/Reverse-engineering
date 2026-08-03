package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f405k;

    public /* synthetic */ r(android.widget.FrameLayout r2, android.widget.FrameLayout r3, int r4, wb.er r5) {
            r1 = this;
            r0 = 14
            r1.f401g = r0
            r1.<init>()
            r1.f403i = r2
            r1.f404j = r3
            r1.f402h = r4
            r1.f405k = r5
            return
    }

    public /* synthetic */ r(java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4, int r5, int r6) {
            r0 = this;
            r0.f401g = r6
            r0.f403i = r1
            r0.f404j = r2
            r0.f402h = r3
            r0.f405k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ r(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.f401g = r5
            r0.f403i = r1
            r0.f404j = r2
            r0.f405k = r3
            r0.f402h = r4
            r0.<init>()
            return
    }

    public /* synthetic */ r(java.util.ArrayList r2, int r3, sh.t r4, fg.l r5) {
            r1 = this;
            r0 = 17
            r1.f401g = r0
            r1.<init>()
            r1.f403i = r2
            r1.f402h = r3
            r1.f404j = r4
            r1.f405k = r5
            return
    }

    public /* synthetic */ r(y0.o r1, l.d r2, fg.l r3, int r4, int r5) {
            r0 = this;
            r4 = 4
            r0.f401g = r4
            r0.<init>()
            r0.f403i = r1
            r0.f404j = r2
            r0.f405k = r3
            r0.f402h = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
            r20 = this;
            r0 = r20
            int r1 = r0.f401g
            switch(r1) {
                case 0: goto L413;
                case 1: goto L3ef;
                case 2: goto L3cb;
                case 3: goto L3a7;
                case 4: goto L381;
                case 5: goto L35d;
                case 6: goto L33d;
                case 7: goto L31b;
                case 8: goto L2fb;
                case 9: goto L2d9;
                case 10: goto L2b5;
                case 11: goto L291;
                case 12: goto L26b;
                case 13: goto L247;
                case 14: goto L20c;
                case 15: goto L96;
                case 16: goto L71;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f403i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.f404j
            r7 = r2
            sh.t r7 = (sh.t) r7
            java.lang.Object r2 = r0.f405k
            r8 = r2
            fg.l r8 = (fg.l) r8
            r9 = r21
            i0.h0 r9 = (i0.h0) r9
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r11 = 0
            r12 = 1
            if (r3 == r4) goto L2a
            r3 = r12
            goto L2b
        L2a:
            r3 = r11
        L2b:
            r2 = r2 & r12
            boolean r2 = r9.S(r2, r3)
            if (r2 == 0) goto L6b
            java.util.Iterator r2 = r1.iterator()
            r6 = r11
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            int r13 = r6 + 1
            r4 = 0
            if (r6 < 0) goto L67
            java.lang.String r3 = (java.lang.String) r3
            r5 = -1923656466(0xffffffff8d5754ee, float:-6.635422E-31)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9.W(r5, r10, r4, r11)
            int r4 = r1.size()
            int r5 = r0.f402h
            if (r5 != r6) goto L5c
            r5 = r12
            goto L5d
        L5c:
            r5 = r11
        L5d:
            r10 = 196608(0x30000, float:2.75506E-40)
            sh.s.f(r3, r4, r5, r6, r7, r8, r9, r10)
            r9.p(r11)
            r6 = r13
            goto L37
        L67:
            a.a.Q0()
            throw r4
        L6b:
            r9.V()
        L6e:
            sf.n r1 = sf.n.f12433a
            return r1
        L71:
            java.lang.Object r1 = r0.f403i
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f404j
            fb.c r2 = (fb.c) r2
            java.lang.Object r3 = r0.f405k
            fg.a r3 = (fg.a) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            r1.c0(r2, r3, r4, r5)
        L93:
            sf.n r1 = sf.n.f12433a
            return r1
        L96:
            java.lang.Object r1 = r0.f403i
            fb.r0 r1 = (fb.r0) r1
            java.lang.String r4 = r1.f3745b
            java.lang.Object r2 = r0.f404j
            r10 = r2
            fg.l r10 = (fg.l) r10
            java.lang.Object r2 = r0.f405k
            r11 = r2
            java.util.List r11 = (java.util.List) r11
            r7 = r21
            i0.h0 r7 = (i0.h0) r7
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r5 = 2
            r12 = 0
            r13 = 1
            if (r3 == r5) goto Lbb
            r3 = r13
            goto Lbc
        Lbb:
            r3 = r12
        Lbc:
            r2 = r2 & r13
            boolean r2 = r7.S(r2, r3)
            if (r2 == 0) goto L206
            boolean r14 = r1.f3746c
            boolean r2 = r7.f(r10)
            boolean r3 = r7.h(r11)
            r2 = r2 | r3
            boolean r3 = r7.h(r1)
            r2 = r2 | r3
            java.lang.Object r3 = r7.P()
            i0.e r15 = i0.l.f5952a
            if (r2 != 0) goto Ldd
            if (r3 != r15) goto Le6
        Ldd:
            wb.gs r3 = new wb.gs
            r2 = 0
            r3.<init>(r2, r1, r10, r11)
            r7.k0(r3)
        Le6:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 54
            r9 = 8
            java.lang.String r2 = "名称"
            java.lang.String r3 = "用于区分工具来源"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            wb.ho.D1(r2, r7, r12, r13)
            r3 = r12
            boolean r12 = r1.f3746c
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L10b
            int r4 = r0.f402h
            int r4 = r4 + r13
            java.lang.String r5 = "MCP "
            java.lang.String r4 = eh.a.l(r4, r5)
        L10b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "启用 "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            if (r14 == 0) goto L11e
            java.lang.String r5 = "此服务器的工具可供 Agent 调用"
            goto L120
        L11e:
            java.lang.String r5 = "此服务器不会连接或提供工具"
        L120:
            boolean r6 = r7.f(r10)
            boolean r8 = r7.h(r11)
            r6 = r6 | r8
            boolean r8 = r7.h(r1)
            r6 = r6 | r8
            java.lang.Object r8 = r7.P()
            if (r6 != 0) goto L136
            if (r8 != r15) goto L13f
        L136:
            wb.gs r8 = new wb.gs
            r6 = 1
            r8.<init>(r6, r1, r10, r11)
            r7.k0(r8)
        L13f:
            r16 = r8
            fg.l r16 = (fg.l) r16
            r18 = 0
            r19 = 8
            r6 = r15
            r15 = 0
            r17 = r4
            r4 = r3
            r3 = r14
            r14 = r5
            r5 = r13
            r13 = r17
            r17 = r7
            wb.ho.P3(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L1ce
            r3 = -1340436194(0xffffffffb01a911e, float:-5.62311E-10)
            r7.a0(r3)
            wb.ho.D1(r2, r7, r4, r5)
            java.lang.String r14 = r1.f3747d
            boolean r3 = r7.f(r10)
            boolean r8 = r7.h(r11)
            r3 = r3 | r8
            boolean r8 = r7.h(r1)
            r3 = r3 | r8
            java.lang.Object r8 = r7.P()
            if (r3 != 0) goto L179
            if (r8 != r6) goto L182
        L179:
            wb.gs r8 = new wb.gs
            r3 = 2
            r8.<init>(r3, r1, r10, r11)
            r7.k0(r8)
        L182:
            r16 = r8
            fg.l r16 = (fg.l) r16
            r18 = 54
            r19 = 8
            java.lang.String r12 = "MCP Endpoint"
            java.lang.String r13 = "例如 https://example.com/mcp"
            r15 = 0
            r17 = r7
            wb.ho.C1(r12, r13, r14, r15, r16, r17, r18, r19)
            wb.ho.D1(r2, r7, r4, r5)
            java.lang.String r14 = r1.f3748e
            boolean r3 = r7.f(r10)
            boolean r8 = r7.h(r11)
            r3 = r3 | r8
            boolean r8 = r7.h(r1)
            r3 = r3 | r8
            java.lang.Object r8 = r7.P()
            if (r3 != 0) goto L1af
            if (r8 != r6) goto L1b8
        L1af:
            wb.gs r8 = new wb.gs
            r3 = 3
            r8.<init>(r3, r1, r10, r11)
            r7.k0(r8)
        L1b8:
            r16 = r8
            fg.l r16 = (fg.l) r16
            r18 = 54
            r19 = 8
            java.lang.String r12 = "Authorization"
            java.lang.String r13 = "可选，例如 Bearer token"
            r15 = 0
            r17 = r7
            wb.ho.C1(r12, r13, r14, r15, r16, r17, r18, r19)
            r7.p(r4)
            goto L1d7
        L1ce:
            r3 = -1339223412(0xffffffffb02d128c, float:-6.296339E-10)
            r7.a0(r3)
            r7.p(r4)
        L1d7:
            wb.ho.D1(r2, r7, r4, r5)
            boolean r2 = r7.f(r10)
            boolean r3 = r7.h(r11)
            r2 = r2 | r3
            boolean r3 = r7.h(r1)
            r2 = r2 | r3
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L1f0
            if (r3 != r6) goto L1fa
        L1f0:
            wb.zh r3 = new wb.zh
            r2 = 10
            r3.<init>(r10, r11, r1, r2)
            r7.k0(r3)
        L1fa:
            fg.a r3 = (fg.a) r3
            r1 = 54
            java.lang.String r2 = "删除 MCP"
            java.lang.String r4 = "移除此服务器配置"
            wb.ho.b(r2, r4, r3, r7, r1)
            goto L209
        L206:
            r7.V()
        L209:
            sf.n r1 = sf.n.f12433a
            return r1
        L20c:
            java.lang.Object r1 = r0.f403i
            r3 = r1
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.Object r1 = r0.f404j
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            java.lang.Object r1 = r0.f405k
            r6 = r1
            wb.er r6 = (wb.er) r6
            r7 = r21
            i0.h0 r7 = (i0.h0) r7
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r5 = 2
            r8 = 1
            if (r2 == r5) goto L22f
            r2 = r8
            goto L230
        L22f:
            r2 = 0
        L230:
            r1 = r1 & r8
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L241
            wb.fr r2 = wb.fr.f16252a
            r8 = 24576(0x6000, float:3.4438E-41)
            int r5 = r0.f402h
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L244
        L241:
            r7.V()
        L244:
            sf.n r1 = sf.n.f12433a
            return r1
        L247:
            java.lang.Object r1 = r0.f403i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f404j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f405k
            fg.l r3 = (fg.l) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            wb.ho.H0(r1, r2, r3, r4, r5)
            goto L93
        L26b:
            java.lang.Object r1 = r0.f403i
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.f404j
            r3 = r1
            wb.s0 r3 = (wb.s0) r3
            java.lang.Object r1 = r0.f405k
            r5 = r1
            fg.a r5 = (fg.a) r5
            r6 = r21
            i0.h0 r6 = (i0.h0) r6
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 1
            int r7 = i0.r.C(r1)
            int r4 = r0.f402h
            wb.ho.h0(r2, r3, r4, r5, r6, r7)
            goto L93
        L291:
            java.lang.Object r1 = r0.f403i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.f404j
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r0.f405k
            fg.a r3 = (fg.a) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            wb.ho.h2(r1, r2, r3, r4, r5)
            goto L93
        L2b5:
            java.lang.Object r1 = r0.f403i
            w.n1 r1 = (w.n1) r1
            java.lang.Object r2 = r0.f404j
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r3 = r0.f405k
            fg.l r3 = (fg.l) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            r1.b(r2, r3, r4, r5)
            goto L93
        L2d9:
            java.lang.Object r1 = r0.f403i
            v0.d r1 = (v0.d) r1
            java.lang.Object r2 = r0.f405k
            s0.d r2 = (s0.d) r2
            r3 = r21
            i0.h0 r3 = (i0.h0) r3
            r4 = r22
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r0.f402h
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            java.lang.Object r5 = r0.f404j
            r1.b(r5, r2, r3, r4)
            goto L93
        L2fb:
            java.lang.Object r1 = r0.f403i
            s0.d r1 = (s0.d) r1
            r2 = r21
            i0.h0 r2 = (i0.h0) r2
            r3 = r22
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r3 = r0.f402h
            int r3 = i0.r.C(r3)
            r3 = r3 | 1
            java.lang.Object r4 = r0.f404j
            java.lang.Object r5 = r0.f405k
            r1.i(r4, r5, r2, r3)
            goto L93
        L31b:
            java.lang.Object r1 = r0.f403i
            s.x0 r1 = (s.x0) r1
            java.lang.Object r2 = r0.f405k
            s0.d r2 = (s0.d) r2
            r3 = r21
            i0.h0 r3 = (i0.h0) r3
            r4 = r22
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r0.f402h
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            java.lang.Object r5 = r0.f404j
            r1.b(r5, r2, r3, r4)
            goto L93
        L33d:
            java.lang.Object r1 = r0.f403i
            r2 = r1
            r.k r2 = (r.k) r2
            r6 = r21
            i0.h0 r6 = (i0.h0) r6
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 1
            int r7 = i0.r.C(r1)
            java.lang.Object r3 = r0.f404j
            int r4 = r0.f402h
            java.lang.Object r5 = r0.f405k
            s.o.d(r2, r3, r4, r5, r6, r7)
            goto L93
        L35d:
            java.lang.Object r1 = r0.f403i
            l.d r1 = (l.d) r1
            java.lang.Object r2 = r0.f404j
            y0.o r2 = (y0.o) r2
            java.lang.Object r3 = r0.f405k
            s0.d r3 = (s0.d) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            l.i.a(r1, r2, r3, r4, r5)
            goto L93
        L381:
            java.lang.Object r1 = r0.f403i
            r2 = r1
            y0.o r2 = (y0.o) r2
            java.lang.Object r1 = r0.f404j
            r3 = r1
            l.d r3 = (l.d) r3
            java.lang.Object r1 = r0.f405k
            r4 = r1
            fg.l r4 = (fg.l) r4
            r5 = r21
            i0.h0 r5 = (i0.h0) r5
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 1
            int r6 = i0.r.C(r1)
            int r7 = r0.f402h
            l.i.b(r2, r3, r4, r5, r6, r7)
            goto L93
        L3a7:
            java.lang.Object r1 = r0.f403i
            h0.l r1 = (h0.l) r1
            java.lang.Object r2 = r0.f404j
            y0.c r2 = (y0.c) r2
            java.lang.Object r3 = r0.f405k
            s0.d r3 = (s0.d) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            oh.h.a(r1, r2, r3, r4, r5)
            goto L93
        L3cb:
            java.lang.Object r1 = r0.f403i
            y0.o r1 = (y0.o) r1
            java.lang.Object r2 = r0.f404j
            i0.p1 r2 = (i0.p1) r2
            java.lang.Object r3 = r0.f405k
            s0.d r3 = (s0.d) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            r9.e0.e(r1, r2, r3, r4, r5)
            goto L93
        L3ef:
            java.lang.Object r1 = r0.f403i
            c9.j1 r1 = (c9.j1) r1
            java.lang.Object r2 = r0.f404j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f405k
            fg.l r3 = (fg.l) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            r1.q(r2, r3, r4, r5)
            goto L93
        L413:
            java.lang.Object r1 = r0.f403i
            z.g r1 = (z.g) r1
            java.lang.Object r2 = r0.f404j
            d0.d r2 = (d0.d) r2
            java.lang.Object r3 = r0.f405k
            fg.a r3 = (fg.a) r3
            r4 = r21
            i0.h0 r4 = (i0.h0) r4
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.intValue()
            int r5 = r0.f402h
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            b0.w.c(r1, r2, r3, r4, r5)
            goto L93
    }
}
