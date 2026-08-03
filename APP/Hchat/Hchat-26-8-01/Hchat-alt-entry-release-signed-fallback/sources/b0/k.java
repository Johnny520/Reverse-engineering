package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f386j;

    public /* synthetic */ k(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.f383g = r1
            r0.f385i = r2
            r0.f384h = r3
            r0.f386j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ k(i0.a1 r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f383g = r4
            r0.f386j = r1
            r0.f385i = r2
            r0.f384h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f383g = r4
            r0.f385i = r1
            r0.f386j = r2
            r0.f384h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, sf.b r3, int r4, int r5) {
            r0 = this;
            r0.f383g = r5
            r0.f385i = r1
            r0.f386j = r2
            r0.f384h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.String r1, fg.l r2, y0.o r3, int r4) {
            r0 = this;
            r4 = 28
            r0.f383g = r4
            r0.<init>()
            r0.f386j = r1
            r0.f384h = r2
            r0.f385i = r3
            return
    }

    private final java.lang.Object e(java.lang.Object r18, java.lang.Object r19) {
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.f385i
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.f384h
            wb.hq r1 = (wb.hq) r1
            java.lang.Object r2 = r0.f386j
            r8 = r2
            i0.a1 r8 = (i0.a1) r8
            r14 = r18
            i0.h0 r14 = (i0.h0) r14
            r2 = r19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 3
            r5 = 2
            r15 = 0
            r9 = 1
            if (r4 == r5) goto L25
            r4 = r9
            goto L26
        L25:
            r4 = r15
        L26:
            r2 = r2 & r9
            boolean r2 = r14.S(r2, r4)
            if (r2 == 0) goto L7e
            r6 = 6
            r7 = 4
            java.lang.String r2 = "名称"
            r4 = 0
            r5 = r14
            wb.ho.B1(r2, r3, r4, r5, r6, r7)
            r2 = 0
            wb.ho.D1(r2, r14, r15, r9)
            na.i r1 = r1.f16679b
            java.lang.String r10 = r1.f9144b
            r13 = 6
            r14 = 4
            r1 = r9
            java.lang.String r9 = "ID"
            r11 = 0
            r12 = r5
            wb.ho.B1(r9, r10, r11, r12, r13, r14)
            r14 = r12
            wb.ho.D1(r2, r14, r15, r1)
            java.lang.Object r1 = r8.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            boolean r1 = r14.f(r8)
            java.lang.Object r2 = r14.P()
            if (r1 != 0) goto L64
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L6e
        L64:
            wb.gi r2 = new wb.gi
            r1 = 14
            r2.<init>(r8, r1)
            r14.k0(r2)
        L6e:
            r13 = r2
            fg.l r13 = (fg.l) r13
            r15 = 432(0x1b0, float:6.05E-43)
            r16 = 8
            java.lang.String r10 = "启用"
            java.lang.String r11 = "关闭后这个聊天不会按模板自动抢红包"
            r12 = 0
            wb.ho.P3(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L81
        L7e:
            r14.V()
        L81:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private final java.lang.Object f(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            java.lang.Object r0 = r9.f385i
            wb.v0 r0 = (wb.v0) r0
            java.lang.Object r1 = r9.f386j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r9.f384h
            i0.a1 r2 = (i0.a1) r2
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r11 == r3) goto L1e
            r11 = r5
            goto L1f
        L1e:
            r11 = r4
        L1f:
            r10 = r10 & r5
            boolean r10 = r7.S(r10, r11)
            if (r10 == 0) goto L5d
            java.lang.Object r10 = r1.getValue()
            r3 = r10
            wb.t0 r3 = (wb.t0) r3
            r10 = r4
            boolean r4 = r0.f19588f
            wb.u0 r11 = r0.f19584b
            wb.u0 r0 = wb.u0.f19347j
            if (r11 != r0) goto L37
            goto L38
        L37:
            r5 = r10
        L38:
            boolean r10 = r7.f(r1)
            boolean r11 = r7.f(r2)
            r10 = r10 | r11
            java.lang.Object r11 = r7.P()
            if (r10 != 0) goto L4b
            i0.e r10 = i0.l.f5952a
            if (r11 != r10) goto L55
        L4b:
            sh.m1 r11 = new sh.m1
            r10 = 10
            r11.<init>(r10, r1, r2)
            r7.k0(r11)
        L55:
            r6 = r11
            fg.l r6 = (fg.l) r6
            r8 = 0
            wb.ho.Y(r3, r4, r5, r6, r7, r8)
            goto L60
        L5d:
            r7.V()
        L60:
            sf.n r10 = sf.n.f12433a
            return r10
    }

    private final java.lang.Object g(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            java.lang.Object r0 = r13.f385i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r13.f386j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r13.f384h
            fg.l r2 = (fg.l) r2
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r3 = r15 & 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L1d
            r3 = r5
            goto L1e
        L1d:
            r3 = r6
        L1e:
            r15 = r15 & r5
            boolean r15 = r14.S(r15, r3)
            if (r15 == 0) goto Le9
            boolean r15 = r0.isEmpty()
            if (r15 == 0) goto L3c
            r15 = 1331936459(0x4f63bccb, float:3.8208008E9)
            r14.a0(r15)
            java.lang.String r15 = "请先新增收款规则模板。"
            r0 = 6
            wb.ho.s0(r15, r14, r0)
            r14.p(r6)
            goto Lec
        L3c:
            r15 = 1332026452(0x4f651c54, float:3.843839E9)
            r14.a0(r15)
            java.util.Iterator r15 = r0.iterator()
            r3 = r6
        L47:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto Le5
            java.lang.Object r4 = r15.next()
            int r7 = r3 + 1
            r8 = 0
            if (r3 < 0) goto Le1
            ua.i r4 = (ua.i) r4
            if (r1 == 0) goto L62
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L62
            r10 = r6
            goto L86
        L62:
            java.util.Iterator r9 = r1.iterator()
            r10 = r6
        L67:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L86
            java.lang.Object r11 = r9.next()
            ua.h r11 = (ua.h) r11
            java.lang.String r11 = r11.f13622e
            java.lang.String r12 = r4.f13623a
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L67
            int r10 = r10 + 1
            if (r10 < 0) goto L82
            goto L67
        L82:
            a.a.P0()
            throw r8
        L86:
            java.lang.String r8 = r4.f13624b
            java.lang.String r9 = wb.ho.w5(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = " 个聊天 · "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            boolean r10 = r14.f(r2)
            boolean r11 = r14.h(r4)
            r10 = r10 | r11
            java.lang.Object r11 = r14.P()
            if (r10 != 0) goto Lb3
            i0.e r10 = i0.l.f5952a
            if (r11 != r10) goto Lbd
        Lb3:
            sh.v1 r11 = new sh.v1
            r10 = 16
            r11.<init>(r2, r10, r4)
            r14.k0(r11)
        Lbd:
            fg.a r11 = (fg.a) r11
            wb.ho.x3(r8, r9, r11, r14, r6)
            int r4 = r0.size()
            int r4 = r4 - r5
            if (r3 >= r4) goto Ld7
            r3 = 540357431(0x20353337, float:1.5348242E-19)
            r14.a0(r3)
            r3 = 0
            wb.ho.D1(r3, r14, r6, r5)
        Ld3:
            r14.p(r6)
            goto Lde
        Ld7:
            r3 = -428775367(0xffffffffe6716839, float:-2.8500322E23)
            r14.a0(r3)
            goto Ld3
        Lde:
            r3 = r7
            goto L47
        Le1:
            a.a.Q0()
            throw r8
        Le5:
            r14.p(r6)
            goto Lec
        Le9:
            r14.V()
        Lec:
            sf.n r14 = sf.n.f12433a
            return r14
    }

    private final java.lang.Object h(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            java.lang.Object r0 = r12.f385i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.f386j
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r12.f384h
            r3 = r2
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r8 = r13
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r2 = 2
            r10 = 0
            r11 = 1
            if (r14 == r2) goto L1f
            r14 = r11
            goto L20
        L1f:
            r14 = r10
        L20:
            r13 = r13 & r11
            boolean r13 = r8.S(r13, r14)
            if (r13 == 0) goto L76
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L30
            java.lang.String r13 = "未添加关键词"
            goto L3a
        L30:
            int r13 = r0.size()
            java.lang.String r14 = " 个关键词"
            java.lang.String r13 = p.a.i(r13, r14)
        L3a:
            boolean r14 = r8.f(r1)
            java.lang.Object r0 = r8.P()
            if (r14 != 0) goto L48
            i0.e r14 = i0.l.f5952a
            if (r0 != r14) goto L51
        L48:
            wb.kc r0 = new wb.kc
            r14 = 5
            r0.<init>(r1, r14)
            r8.k0(r0)
        L51:
            fg.a r0 = (fg.a) r0
            r14 = 6
            java.lang.String r1 = "关键词管理"
            wb.ho.b(r1, r13, r0, r8, r14)
            r13 = 0
            wb.ho.D1(r13, r8, r10, r11)
            r7 = 0
            r9 = 28080(0x6db0, float:3.9348E-41)
            java.lang.String r4 = "keyword_notify_any_group"
            java.lang.String r5 = "任意关键词-群聊通知"
            java.lang.String r6 = "群聊文字或引用消息都触发"
            wb.ho.O3(r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r13, r8, r10, r11)
            java.lang.String r4 = "keyword_notify_any_private"
            java.lang.String r5 = "任意关键词-私聊通知"
            java.lang.String r6 = "私聊文字或引用消息都触发"
            wb.ho.O3(r3, r4, r5, r6, r7, r8, r9)
            goto L79
        L76:
            r8.V()
        L79:
            sf.n r13 = sf.n.f12433a
            return r13
    }

    private final java.lang.Object i(java.lang.Object r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.f385i
            r6 = r1
            db.c r6 = (db.c) r6
            java.lang.Object r1 = r0.f386j
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r0.f384h
            r5 = r1
            fg.l r5 = (fg.l) r5
            r13 = r19
            i0.h0 r13 = (i0.h0) r13
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r10 = 1
            r12 = 2
            if (r2 == r12) goto L25
            r2 = r10
            goto L26
        L25:
            r2 = 0
        L26:
            r1 = r1 & r10
            boolean r1 = r13.S(r1, r2)
            if (r1 == 0) goto L1d0
            java.util.List r4 = a2.a.v(r6)
            int r1 = r6.f2175h
            r2 = 129797599(0x7bc8ddf, float:2.837048E-34)
            r13.a0(r2)
            java.util.Iterator r14 = r4.iterator()
            r9 = 0
        L3e:
            boolean r2 = r14.hasNext()
            i0.e r8 = i0.l.f5952a
            r15 = 0
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r14.next()
            int r7 = r9 + 1
            if (r9 < 0) goto Lc1
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            if (r9 <= 0) goto L66
            r2 = -1034457025(0xffffffffc257703f, float:-53.859615)
            r13.a0(r2)
            r2 = 1
            r12 = 0
            wb.ho.D1(r15, r13, r12, r2)
        L62:
            r13.p(r12)
            goto L6e
        L66:
            r12 = 0
            r2 = -2003383247(0xffffffff8896cc31, float:-9.075802E-34)
            r13.a0(r2)
            goto L62
        L6e:
            java.lang.String r2 = "计划时间 "
            java.lang.String r12 = eh.a.l(r7, r2)
            java.lang.String r15 = wb.ho.b7(r10)
            boolean r2 = r13.h(r3)
            boolean r17 = r13.h(r4)
            r2 = r2 | r17
            boolean r17 = r13.e(r10)
            r2 = r2 | r17
            boolean r17 = r13.d(r9)
            r2 = r2 | r17
            boolean r17 = r13.f(r5)
            r2 = r2 | r17
            boolean r17 = r13.h(r6)
            r2 = r2 | r17
            java.lang.Object r0 = r13.P()
            if (r2 != 0) goto La6
            if (r0 != r8) goto La3
            goto La6
        La3:
            r2 = r0
            r0 = r7
            goto Lb4
        La6:
            wb.qh r2 = new wb.qh
            r8 = r6
            r0 = r7
            r7 = r5
            r5 = r10
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r5 = r7
            r6 = r8
            r13.k0(r2)
        Lb4:
            fg.a r2 = (fg.a) r2
            r7 = 0
            wb.ho.b(r12, r15, r2, r13, r7)
            r9 = r0
            r10 = 1
            r12 = 2
            r0 = r18
            goto L3e
        Lc1:
            a.a.Q0()
            r0 = 0
            throw r0
        Lc6:
            r7 = 0
            r13.p(r7)
            r2 = 1
            wb.ho.D1(r15, r13, r7, r2)
            boolean r0 = r13.h(r3)
            boolean r2 = r13.h(r4)
            r0 = r0 | r2
            boolean r2 = r13.f(r5)
            r0 = r0 | r2
            boolean r2 = r13.h(r6)
            r0 = r0 | r2
            java.lang.Object r2 = r13.P()
            if (r0 != 0) goto Le9
            if (r2 != r8) goto Lf3
        Le9:
            c9.n0 r2 = new c9.n0
            r7 = 14
            r2.<init>(r3, r4, r5, r6, r7)
            r13.k0(r2)
        Lf3:
            fg.a r2 = (fg.a) r2
            r0 = 54
            java.lang.String r3 = "新增计划时间"
            java.lang.String r4 = "同一任务可在多个时间分别执行"
            wb.ho.b(r3, r4, r2, r13, r0)
            r2 = 1
            r7 = 0
            wb.ho.D1(r15, r13, r7, r2)
            java.lang.String r0 = "每天"
            java.lang.String r3 = "每周"
            java.lang.String r4 = "单次"
            if (r1 == r2) goto L112
            r9 = 2
            if (r1 == r9) goto L110
            r10 = r4
            goto L114
        L110:
            r10 = r3
            goto L114
        L112:
            r9 = 2
            r10 = r0
        L114:
            wb.dq r11 = new wb.dq
            java.lang.String r12 = "0"
            r11.<init>(r12, r4)
            wb.dq r4 = new wb.dq
            java.lang.String r12 = "1"
            r4.<init>(r12, r0)
            wb.dq r0 = new wb.dq
            java.lang.String r12 = "2"
            r0.<init>(r12, r3)
            wb.dq[] r0 = new wb.dq[]{r11, r4, r0}
            java.util.List r0 = a.a.y0(r0)
            r3 = r10
            java.lang.String r10 = java.lang.String.valueOf(r1)
            boolean r4 = r13.f(r5)
            boolean r11 = r13.h(r6)
            r4 = r4 | r11
            java.lang.Object r11 = r13.P()
            if (r4 != 0) goto L147
            if (r11 != r8) goto L150
        L147:
            wb.rg r11 = new wb.rg
            r4 = 4
            r11.<init>(r4, r6, r5)
            r13.k0(r11)
        L150:
            fg.l r11 = (fg.l) r11
            r14 = 6
            r4 = r15
            r15 = 32
            r12 = r7
            java.lang.String r7 = "重复方式"
            r16 = r12
            r12 = 0
            r2 = r9
            r9 = r0
            r0 = r8
            r8 = r3
            r3 = r16
            wb.ho.I2(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L196
            r1 = -267694798(0xfffffffff00b4d32, float:-1.7244696E29)
            r13.a0(r1)
            r2 = 1
            wb.ho.D1(r4, r13, r3, r2)
            java.util.Set r1 = r6.f2176i
            boolean r2 = r13.h(r6)
            boolean r7 = r13.f(r5)
            r2 = r2 | r7
            java.lang.Object r7 = r13.P()
            if (r2 != 0) goto L184
            if (r7 != r0) goto L18c
        L184:
            wb.rg r7 = new wb.rg
            r7.<init>(r6, r5)
            r13.k0(r7)
        L18c:
            fg.l r7 = (fg.l) r7
            wb.ho.o3(r1, r7, r13, r3)
            r13.p(r3)
        L194:
            r2 = 1
            goto L1a0
        L196:
            r1 = -267229674(0xfffffffff0126616, float:-1.812329E29)
            r13.a0(r1)
            r13.p(r3)
            goto L194
        L1a0:
            wb.ho.D1(r4, r13, r3, r2)
            boolean r7 = r6.f2179l
            boolean r1 = r13.f(r5)
            boolean r2 = r13.h(r6)
            r1 = r1 | r2
            java.lang.Object r2 = r13.P()
            if (r1 != 0) goto L1b6
            if (r2 != r0) goto L1bf
        L1b6:
            wb.rg r2 = new wb.rg
            r0 = 6
            r2.<init>(r0, r6, r5)
            r13.k0(r2)
        L1bf:
            r11 = r2
            fg.l r11 = (fg.l) r11
            r12 = r13
            r13 = 432(0x1b0, float:6.05E-43)
            r14 = 8
            java.lang.String r8 = "超时补发"
            java.lang.String r9 = "微信进程错过执行时间后，恢复时自动补发"
            r10 = 0
            wb.ho.P3(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1d3
        L1d0:
            r13.V()
        L1d3:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object j(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            java.lang.Object r0 = r12.f385i
            db.c r0 = (db.c) r0
            java.lang.Object r1 = r12.f386j
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r12.f384h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r7 = r13
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r3 = 2
            r9 = 0
            r10 = 1
            if (r14 == r3) goto L1e
            r14 = r10
            goto L1f
        L1e:
            r14 = r9
        L1f:
            r13 = r13 & r10
            boolean r13 = r7.S(r13, r14)
            if (r13 == 0) goto L9f
            int r13 = r0.f2177j
            java.lang.String r5 = java.lang.String.valueOf(r13)
            boolean r13 = r7.f(r1)
            boolean r14 = r7.h(r0)
            r13 = r13 | r14
            java.lang.Object r14 = r7.P()
            i0.e r11 = i0.l.f5952a
            if (r13 != 0) goto L3f
            if (r14 != r11) goto L48
        L3f:
            wb.rg r14 = new wb.rg
            r13 = 7
            r14.<init>(r13, r0, r1)
            r7.k0(r14)
        L48:
            r6 = r14
            fg.l r6 = (fg.l) r6
            r8 = 54
            java.lang.String r3 = "聊天间隔"
            java.lang.String r4 = "单位秒，多个聊天之间的等待时间"
            wb.ho.w2(r3, r4, r5, r6, r7, r8)
            int r13 = r2.size()
            if (r13 <= r10) goto L95
            r13 = 1279064199(0x4c3cf887, float:4.9537564E7)
            r7.a0(r13)
            r13 = 0
            wb.ho.D1(r13, r7, r9, r10)
            int r13 = r0.f2178k
            java.lang.String r5 = java.lang.String.valueOf(r13)
            boolean r13 = r7.f(r1)
            boolean r14 = r7.h(r0)
            r13 = r13 | r14
            java.lang.Object r14 = r7.P()
            if (r13 != 0) goto L7b
            if (r14 != r11) goto L85
        L7b:
            wb.rg r14 = new wb.rg
            r13 = 8
            r14.<init>(r13, r0, r1)
            r7.k0(r14)
        L85:
            r6 = r14
            fg.l r6 = (fg.l) r6
            r8 = 48
            java.lang.String r3 = "多条间隔"
            java.lang.String r4 = "单位秒，同一聊天连续发送的等待时间"
            wb.ho.w2(r3, r4, r5, r6, r7, r8)
            r7.p(r9)
            goto La2
        L95:
            r13 = 1279675395(0x4c464c03, float:5.1982348E7)
            r7.a0(r13)
            r7.p(r9)
            goto La2
        L9f:
            r7.V()
        La2:
            sf.n r13 = sf.n.f12433a
            return r13
    }

    private final java.lang.Object k(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            java.lang.Object r0 = r11.f385i
            wb.cp r0 = (wb.cp) r0
            java.util.ArrayList r0 = r0.f15527b
            java.lang.Object r1 = r11.f386j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r11.f384h
            fg.l r2 = (fg.l) r2
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r3 = r13 & 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r6
        L20:
            r13 = r13 & r5
            boolean r13 = r12.S(r13, r3)
            if (r13 == 0) goto L97
            java.util.Iterator r13 = r0.iterator()
            r3 = r6
        L2c:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r13.next()
            int r7 = r3 + 1
            if (r3 < 0) goto L92
            wb.bp r4 = (wb.bp) r4
            int r8 = r4.f15271b
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r8 != r9) goto L4c
            r8 = r5
            goto L4d
        L4c:
            r8 = r6
        L4d:
            boolean r9 = r12.f(r1)
            boolean r10 = r12.f(r4)
            r9 = r9 | r10
            boolean r10 = r12.f(r2)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L65
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L6f
        L65:
            ab.e r10 = new ab.e
            r9 = 28
            r10.<init>(r4, r2, r1, r9)
            r12.k0(r10)
        L6f:
            fg.a r10 = (fg.a) r10
            wb.ho.x2(r4, r8, r10, r12, r6)
            int r4 = r0.size()
            int r4 = r4 - r5
            if (r3 >= r4) goto L89
            r3 = -956993136(0xffffffffc6f57190, float:-31416.781)
            r12.a0(r3)
            r3 = 0
            wb.ho.D1(r3, r12, r6, r5)
        L85:
            r12.p(r6)
            goto L90
        L89:
            r3 = 397997312(0x17b8f500, float:1.1952568E-24)
            r12.a0(r3)
            goto L85
        L90:
            r3 = r7
            goto L2c
        L92:
            a.a.Q0()
            r12 = 0
            throw r12
        L97:
            r12.V()
        L9a:
            sf.n r12 = sf.n.f12433a
            return r12
    }

    private final java.lang.Object l(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            java.lang.Object r0 = r13.f385i
            wb.h5 r0 = (wb.h5) r0
            java.lang.Object r1 = r13.f386j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r13.f384h
            i0.a1 r2 = (i0.a1) r2
            r8 = r14
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r3 = 2
            r11 = 0
            r12 = 1
            if (r15 == r3) goto L1e
            r15 = r12
            goto L1f
        L1e:
            r15 = r11
        L1f:
            r14 = r14 & r12
            boolean r14 = r8.S(r14, r15)
            if (r14 == 0) goto Lb5
            java.util.ArrayList r14 = r0.f16490b
            int r14 = r14.size()
            java.lang.String r15 = " 个名单项"
            java.lang.String r14 = p.a.i(r14, r15)
            java.lang.Object r15 = r8.P()
            i0.e r0 = i0.l.f5952a
            if (r15 != r0) goto L44
            k.s1 r15 = new k.s1
            r3 = 25
            r15.<init>(r3)
            r8.k0(r15)
        L44:
            fg.a r15 = (fg.a) r15
            r3 = 390(0x186, float:5.47E-43)
            java.lang.String r4 = "已选择"
            wb.ho.x3(r4, r14, r15, r8, r3)
            r14 = 0
            wb.ho.D1(r14, r8, r11, r12)
            java.lang.Object r15 = r1.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r3 = r15.booleanValue()
            boolean r15 = r8.f(r1)
            java.lang.Object r4 = r8.P()
            if (r15 != 0) goto L67
            if (r4 != r0) goto L71
        L67:
            wb.tg r4 = new wb.tg
            r15 = 10
            r4.<init>(r1, r15)
            r8.k0(r4)
        L71:
            r7 = r4
            fg.l r7 = (fg.l) r7
            r9 = 432(0x1b0, float:6.05E-43)
            r10 = 8
            java.lang.String r4 = "启用名单"
            java.lang.String r5 = "关闭后保留名单但不参与匹配"
            r6 = 0
            wb.ho.P3(r3, r4, r5, r6, r7, r8, r9, r10)
            wb.ho.D1(r14, r8, r11, r12)
            java.lang.Object r14 = r2.getValue()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "exclude"
            boolean r3 = gg.l.a(r14, r15)
            boolean r14 = r8.f(r2)
            java.lang.Object r15 = r8.P()
            if (r14 != 0) goto L9b
            if (r15 != r0) goto La5
        L9b:
            wb.tg r15 = new wb.tg
            r14 = 11
            r15.<init>(r2, r14)
            r8.k0(r15)
        La5:
            r7 = r15
            fg.l r7 = (fg.l) r7
            r9 = 432(0x1b0, float:6.05E-43)
            r10 = 8
            java.lang.String r4 = "排除名单"
            java.lang.String r5 = "开启后这些名单命中时跳过屏蔽"
            r6 = 0
            wb.ho.P3(r3, r4, r5, r6, r7, r8, r9, r10)
            goto Lb8
        Lb5:
            r8.V()
        Lb8:
            sf.n r14 = sf.n.f12433a
            return r14
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40) {
            r38 = this;
            r0 = r38
            int r1 = r0.f383g
            switch(r1) {
                case 0: goto Lc85;
                case 1: goto Lc42;
                case 2: goto Lc20;
                case 3: goto Lbe2;
                case 4: goto Lbc0;
                case 5: goto L9f5;
                case 6: goto L8af;
                case 7: goto L88d;
                case 8: goto L849;
                case 9: goto L827;
                case 10: goto L805;
                case 11: goto L79c;
                case 12: goto L727;
                case 13: goto L6a4;
                case 14: goto L4cd;
                case 15: goto L44a;
                case 16: goto L30b;
                case 17: goto L189;
                case 18: goto Le0;
                case 19: goto Ldb;
                case 20: goto Ld6;
                case 21: goto Ld1;
                case 22: goto Lcc;
                case 23: goto Lc7;
                case 24: goto Lc2;
                case 25: goto La1;
                case 26: goto L9c;
                case 27: goto L97;
                case 28: goto L75;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f385i
            x8.b r1 = (x8.b) r1
            java.lang.Object r2 = r0.f386j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f384h
            fg.a r3 = (fg.a) r3
            r9 = r39
            i0.h0 r9 = (i0.h0) r9
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r12 = 0
            r13 = 1
            if (r5 == r6) goto L28
            r5 = r13
            goto L29
        L28:
            r5 = r12
        L29:
            r4 = r4 & r13
            boolean r4 = r9.S(r4, r5)
            if (r4 == 0) goto L6f
            boolean r4 = r1.f21248r
            boolean r5 = r9.f(r2)
            boolean r6 = r9.h(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r9.P()
            if (r5 != 0) goto L45
            i0.e r5 = i0.l.f5952a
            if (r6 != r5) goto L4f
        L45:
            wb.mj r6 = new wb.mj
            r5 = 12
            r6.<init>(r5, r2, r1)
            r9.k0(r6)
        L4f:
            r8 = r6
            fg.l r8 = (fg.l) r8
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 8
            java.lang.String r5 = "引用回复"
            java.lang.String r6 = "文本和 AI 可引用原消息回复"
            r7 = 0
            wb.ho.P3(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = 0
            wb.ho.D1(r2, r9, r12, r13)
            java.util.List r1 = r1.f21249s
            java.lang.String r1 = wb.ho.l5(r1)
            r2 = 6
            java.lang.String r4 = "回复步骤"
            wb.ho.b(r4, r1, r3, r9, r2)
            goto L72
        L6f:
            r9.V()
        L72:
            sf.n r1 = sf.n.f12433a
            return r1
        L75:
            java.lang.Object r1 = r0.f386j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f384h
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f385i
            y0.o r3 = (y0.o) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 1
            int r5 = i0.r.C(r5)
            wb.ho.M2(r1, r2, r3, r4, r5)
        L94:
            sf.n r1 = sf.n.f12433a
            return r1
        L97:
            java.lang.Object r1 = r38.l(r39, r40)
            return r1
        L9c:
            java.lang.Object r1 = r38.k(r39, r40)
            return r1
        La1:
            java.lang.Object r1 = r0.f385i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f386j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f384h
            fg.l r3 = (fg.l) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 391(0x187, float:5.48E-43)
            int r5 = i0.r.C(r5)
            wb.ho.n4(r1, r2, r3, r4, r5)
            goto L94
        Lc2:
            java.lang.Object r1 = r38.j(r39, r40)
            return r1
        Lc7:
            java.lang.Object r1 = r38.i(r39, r40)
            return r1
        Lcc:
            java.lang.Object r1 = r38.h(r39, r40)
            return r1
        Ld1:
            java.lang.Object r1 = r38.g(r39, r40)
            return r1
        Ld6:
            java.lang.Object r1 = r38.f(r39, r40)
            return r1
        Ldb:
            java.lang.Object r1 = r38.e(r39, r40)
            return r1
        Le0:
            java.lang.Object r1 = r0.f385i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f384h
            r5 = r2
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r2 = r0.f386j
            i0.a1 r2 = (i0.a1) r2
            r9 = r39
            i0.h0 r9 = (i0.h0) r9
            r3 = r40
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r3 & 3
            r6 = 2
            r7 = 1
            r12 = 0
            if (r4 == r6) goto L102
            r4 = r7
            goto L103
        L102:
            r4 = r12
        L103:
            r3 = r3 & r7
            boolean r3 = r9.S(r3, r4)
            if (r3 == 0) goto L183
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L120
            r1 = -549788779(0xffffffffdf3ae395, float:-1.3466771E19)
            r9.a0(r1)
            java.lang.String r1 = "暂无模板。先进入“回复模板管理”新增模板。"
            r2 = 6
            wb.ho.s0(r1, r9, r2)
            r9.p(r12)
            goto L186
        L120:
            r3 = -549689579(0xffffffffdf3c6715, float:-1.3575843E19)
            r9.a0(r3)
            java.util.Iterator r1 = r1.iterator()
        L12a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L146
            java.lang.Object r3 = r1.next()
            r4 = r3
            o9.q r4 = (o9.q) r4
            java.lang.String r4 = r4.f9672a
            java.lang.Object r6 = r2.getValue()
            java.lang.String r6 = (java.lang.String) r6
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L12a
            goto L147
        L146:
            r3 = 0
        L147:
            o9.q r3 = (o9.q) r3
            if (r3 == 0) goto L151
            java.lang.String r1 = wb.ho.m5(r3)
        L14f:
            r4 = r1
            goto L154
        L151:
            java.lang.String r1 = "未选择"
            goto L14f
        L154:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            boolean r1 = r9.f(r2)
            java.lang.Object r3 = r9.P()
            if (r1 != 0) goto L169
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L173
        L169:
            wb.oh r3 = new wb.oh
            r1 = 10
            r3.<init>(r2, r1)
            r9.k0(r3)
        L173:
            r7 = r3
            fg.l r7 = (fg.l) r7
            r10 = 6
            r11 = 32
            java.lang.String r3 = "选择模板"
            r8 = 0
            wb.ho.I2(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r12)
            goto L186
        L183:
            r9.V()
        L186:
            sf.n r1 = sf.n.f12433a
            return r1
        L189:
            java.lang.Object r1 = r0.f385i
            db.c r1 = (db.c) r1
            java.lang.Object r2 = r0.f386j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f384h
            fg.a r3 = (fg.a) r3
            r10 = r39
            i0.h0 r10 = (i0.h0) r10
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r13 = 1
            r14 = 0
            if (r5 == r6) goto L1aa
            r5 = r13
            goto L1ab
        L1aa:
            r5 = r14
        L1ab:
            r4 = r4 & r13
            boolean r4 = r10.S(r4, r5)
            if (r4 == 0) goto L305
            java.util.ArrayList r4 = wb.ho.T6(r1)
            int r15 = r1.f2188u
            int r11 = r1.f2185r
            boolean r5 = r4.isEmpty()
            java.lang.String r12 = "1"
            java.lang.String r6 = "0"
            i0.e r7 = i0.l.f5952a
            if (r5 == 0) goto L1cb
        L1c6:
            r17 = r7
            r7 = r10
            r10 = r6
            goto L20d
        L1cb:
            java.util.Iterator r4 = r4.iterator()
        L1cf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1c6
            java.lang.Object r5 = r4.next()
            db.a r5 = (db.a) r5
            int r5 = r5.f2166a
            r8 = 8
            if (r5 != r8) goto L207
            r4 = -355621794(0xffffffffeacda45e, float:-1.24303E26)
            r10.a0(r4)
            r8 = 54
            r9 = 4
            java.lang.String r4 = "发送到"
            java.lang.String r5 = "聊天"
            r16 = r6
            r6 = 0
            r17 = r7
            r7 = r10
            r10 = r16
            wb.ho.B1(r4, r5, r6, r7, r8, r9)
            r7.p(r14)
            r16 = r3
            r0 = r10
            r40 = r11
            r13 = r12
            r3 = r17
            r10 = r7
            goto L276
        L207:
            r17 = r7
            r7 = r10
            r7 = r17
            goto L1cf
        L20d:
            r4 = -355515092(0xffffffffeacf452c, float:-1.2528715E26)
            r7.a0(r4)
            java.lang.String r4 = "聊天"
            java.lang.String r5 = "朋友圈"
            if (r11 != r13) goto L21b
            r6 = r5
            goto L21c
        L21b:
            r6 = r4
        L21c:
            wb.dq r8 = new wb.dq
            r8.<init>(r10, r4)
            wb.dq r4 = new wb.dq
            r4.<init>(r12, r5)
            wb.dq[] r4 = new wb.dq[]{r8, r4}
            java.util.List r4 = a.a.y0(r4)
            java.lang.String r5 = java.lang.String.valueOf(r11)
            boolean r8 = r7.f(r2)
            boolean r9 = r7.h(r1)
            r8 = r8 | r9
            java.lang.Object r9 = r7.P()
            if (r8 != 0) goto L246
            r8 = r17
            if (r9 != r8) goto L252
            goto L248
        L246:
            r8 = r17
        L248:
            wb.rg r9 = new wb.rg
            r13 = 10
            r9.<init>(r13, r1, r2)
            r7.k0(r9)
        L252:
            fg.l r9 = (fg.l) r9
            r13 = r11
            r11 = 6
            r16 = r12
            r12 = 32
            r17 = r10
            r10 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            java.lang.String r4 = "发送到"
            r18 = r8
            r8 = r9
            r9 = 0
            r40 = r13
            r13 = r16
            r0 = r17
            r16 = r3
            r3 = r18
            wb.ho.I2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r10.p(r14)
        L276:
            if (r40 != 0) goto L2fb
            r4 = -354761978(0xffffffffeadac306, float:-1.322334E26)
            r10.a0(r4)
            r4 = 0
            r5 = 1
            wb.ho.D1(r4, r10, r14, r5)
            java.lang.String r6 = "模块通道"
            java.lang.String r7 = "微信原生群发助手"
            if (r15 != r5) goto L28b
            r5 = r7
            goto L28c
        L28b:
            r5 = r6
        L28c:
            wb.dq r8 = new wb.dq
            r8.<init>(r0, r6)
            wb.dq r0 = new wb.dq
            r0.<init>(r13, r7)
            wb.dq[] r0 = new wb.dq[]{r8, r0}
            java.util.List r6 = a.a.y0(r0)
            java.lang.String r7 = java.lang.String.valueOf(r15)
            boolean r0 = r10.f(r2)
            boolean r8 = r10.h(r1)
            r0 = r0 | r8
            java.lang.Object r8 = r10.P()
            if (r0 != 0) goto L2b3
            if (r8 != r3) goto L2bd
        L2b3:
            wb.rg r8 = new wb.rg
            r0 = 11
            r8.<init>(r0, r1, r2)
            r10.k0(r8)
        L2bd:
            fg.l r8 = (fg.l) r8
            r11 = 6
            r12 = 32
            r0 = r4
            java.lang.String r4 = "发送通道"
            r9 = 0
            wb.ho.I2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r5 = 1
            wb.ho.D1(r0, r10, r14, r5)
            if (r15 != r5) goto L2d2
            java.lang.String r0 = "选择好友"
            goto L2d4
        L2d2:
            java.lang.String r0 = "选择聊天"
        L2d4:
            java.util.List r1 = r1.f2173f
            java.lang.String r1 = wb.ho.a7(r1)
            r2 = r16
            boolean r4 = r10.f(r2)
            java.lang.Object r5 = r10.P()
            if (r4 != 0) goto L2e8
            if (r5 != r3) goto L2f2
        L2e8:
            wb.kc r5 = new wb.kc
            r3 = 21
            r5.<init>(r2, r3)
            r10.k0(r5)
        L2f2:
            fg.a r5 = (fg.a) r5
            wb.ho.b(r0, r1, r5, r10, r14)
            r10.p(r14)
            goto L308
        L2fb:
            r0 = -353089838(0xffffffffeaf446d2, float:-1.4765617E26)
            r10.a0(r0)
            r10.p(r14)
            goto L308
        L305:
            r10.V()
        L308:
            sf.n r0 = sf.n.f12433a
            return r0
        L30b:
            java.lang.Object r1 = r0.f385i
            v8.a r1 = (v8.a) r1
            java.lang.Object r2 = r0.f386j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f384h
            fg.l r3 = (fg.l) r3
            r9 = r39
            i0.h0 r9 = (i0.h0) r9
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r12 = 1
            r13 = 0
            if (r5 == r6) goto L32c
            r5 = r12
            goto L32d
        L32c:
            r5 = r13
        L32d:
            r4 = r4 & r12
            boolean r4 = r9.S(r4, r5)
            if (r4 == 0) goto L444
            java.util.Set r4 = r1.f14208h
            java.lang.String r4 = wb.ho.I4(r4)
            boolean r5 = r9.f(r2)
            boolean r6 = r9.h(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r9.P()
            i0.e r14 = i0.l.f5952a
            if (r5 != 0) goto L34d
            if (r6 != r14) goto L356
        L34d:
            wb.ea r6 = new wb.ea
            r5 = 1
            r6.<init>(r2, r1, r5)
            r9.k0(r6)
        L356:
            fg.a r6 = (fg.a) r6
            r2 = 6
            java.lang.String r5 = "选择消息类型"
            wb.ho.b(r5, r4, r6, r9, r2)
            r2 = 0
            wb.ho.D1(r2, r9, r13, r12)
            boolean r4 = r1.f14211k
            boolean r5 = r9.f(r3)
            boolean r6 = r9.h(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r9.P()
            if (r5 != 0) goto L375
            if (r6 != r14) goto L37e
        L375:
            wb.pg r6 = new wb.pg
            r5 = 0
            r6.<init>(r3, r1, r5)
            r9.k0(r6)
        L37e:
            r8 = r6
            fg.l r8 = (fg.l) r8
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 8
            java.lang.String r5 = "包含关键词"
            java.lang.String r6 = "开启后仅转发命中关键词的消息"
            r7 = 0
            wb.ho.P3(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r4 = r1.f14211k
            if (r4 == 0) goto L3c8
            r4 = 1991504166(0x76b3f126, float:1.8248285E33)
            r9.a0(r4)
            wb.ho.D1(r2, r9, r13, r12)
            java.lang.String r6 = r1.f14212l
            boolean r4 = r9.f(r3)
            boolean r5 = r9.h(r1)
            r4 = r4 | r5
            java.lang.Object r5 = r9.P()
            if (r4 != 0) goto L3ad
            if (r5 != r14) goto L3b6
        L3ad:
            wb.pg r5 = new wb.pg
            r4 = 1
            r5.<init>(r3, r1, r4)
            r9.k0(r5)
        L3b6:
            r8 = r5
            fg.l r8 = (fg.l) r8
            r10 = 3126(0xc36, float:4.38E-42)
            r11 = 0
            java.lang.String r4 = "包含关键词内容"
            java.lang.String r5 = "多个关键词用 |、逗号或换行分隔"
            r7 = 2
            wb.ho.C1(r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r13)
            goto L3d1
        L3c8:
            r4 = 1991764597(0x76b7ea75, float:1.8651283E33)
            r9.a0(r4)
            r9.p(r13)
        L3d1:
            wb.ho.D1(r2, r9, r13, r12)
            boolean r4 = r1.f14213m
            boolean r5 = r9.f(r3)
            boolean r6 = r9.h(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r9.P()
            if (r5 != 0) goto L3e7
            if (r6 != r14) goto L3f0
        L3e7:
            wb.pg r6 = new wb.pg
            r5 = 2
            r6.<init>(r3, r1, r5)
            r9.k0(r6)
        L3f0:
            r8 = r6
            fg.l r8 = (fg.l) r8
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 8
            java.lang.String r5 = "排除关键词"
            java.lang.String r6 = "开启后不转发命中关键词的消息"
            r7 = 0
            wb.ho.P3(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r4 = r1.f14213m
            if (r4 == 0) goto L43a
            r4 = 1992056710(0x76bc5f86, float:1.9103306E33)
            r9.a0(r4)
            wb.ho.D1(r2, r9, r13, r12)
            java.lang.String r6 = r1.f14214n
            boolean r2 = r9.f(r3)
            boolean r4 = r9.h(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto L41f
            if (r4 != r14) goto L428
        L41f:
            wb.pg r4 = new wb.pg
            r2 = 3
            r4.<init>(r3, r1, r2)
            r9.k0(r4)
        L428:
            r8 = r4
            fg.l r8 = (fg.l) r8
            r10 = 3126(0xc36, float:4.38E-42)
            r11 = 0
            java.lang.String r4 = "排除关键词内容"
            java.lang.String r5 = "多个关键词用 |、逗号或换行分隔"
            r7 = 2
            wb.ho.C1(r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r13)
            goto L447
        L43a:
            r1 = 1992317141(0x76c058d5, float:1.9506303E33)
            r9.a0(r1)
            r9.p(r13)
            goto L447
        L444:
            r9.V()
        L447:
            sf.n r1 = sf.n.f12433a
            return r1
        L44a:
            java.lang.Object r1 = r0.f385i
            r2 = r1
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r1 = r0.f386j
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r3 = r0.f384h
            r9 = r3
            fg.a r9 = (fg.a) r9
            r7 = r39
            i0.h0 r7 = (i0.h0) r7
            r3 = r40
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r3 & 3
            r5 = 2
            r10 = 0
            r11 = 1
            if (r4 == r5) goto L46d
            r4 = r11
            goto L46e
        L46d:
            r4 = r10
        L46e:
            r3 = r3 & r11
            boolean r3 = r7.S(r3, r4)
            if (r3 == 0) goto L4c7
            r6 = 0
            r8 = 28080(0x6db0, float:3.9348E-41)
            java.lang.String r3 = "qq_music_order_enable"
            java.lang.String r4 = "启用 QQ 点歌"
            java.lang.String r5 = "在聊天中响应点歌指令"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            wb.ho.D1(r12, r7, r10, r11)
            java.lang.String r3 = "qq_music_order_intercept_own_command"
            java.lang.String r4 = "拦截自己的点歌指令"
            java.lang.String r5 = "点击发送后不发送原指令，直接执行点歌"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            wb.ho.D1(r12, r7, r10, r11)
            r6 = 1
            java.lang.String r3 = "qq_music_order_send_as_card"
            java.lang.String r4 = "点歌发送卡片"
            java.lang.String r5 = "开启后发送音乐卡片，可与歌曲语音同时发送"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            wb.ho.D1(r12, r7, r10, r11)
            r6 = 0
            java.lang.String r3 = "qq_music_order_send_as_voice"
            java.lang.String r4 = "点歌发送语音"
            java.lang.String r5 = "开启后发送歌曲语音，可与音乐卡片同时发送"
            wb.ho.O3(r2, r3, r4, r5, r6, r7, r8)
            wb.ho.D1(r12, r7, r10, r11)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L4b4
            java.lang.String r1 = "未选择"
            goto L4c0
        L4b4:
            int r1 = r1.size()
            java.lang.String r2 = "已选 "
            java.lang.String r3 = " 个聊天"
            java.lang.String r1 = eh.a.m(r1, r2, r3)
        L4c0:
            r2 = 6
            java.lang.String r3 = "允许他人点歌的聊天"
            wb.ho.b(r3, r1, r9, r7, r2)
            goto L4ca
        L4c7:
            r7.V()
        L4ca:
            sf.n r1 = sf.n.f12433a
            return r1
        L4cd:
            java.lang.Object r1 = r0.f386j
            r3 = r1
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r1 = r0.f385i
            r6 = r1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.f384h
            i0.a1 r1 = (i0.a1) r1
            r15 = r39
            i0.h0 r15 = (i0.h0) r15
            r2 = r40
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 3
            r5 = 2
            r7 = 1
            r8 = 0
            if (r4 == r5) goto L4f0
            r4 = r7
            goto L4f1
        L4f0:
            r4 = r8
        L4f1:
            r2 = r2 & r7
            boolean r2 = r15.S(r2, r4)
            if (r2 == 0) goto L69e
            java.lang.Object r2 = r3.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            r4 = 0
            i0.e r5 = i0.l.f5952a
            if (r2 == 0) goto L56e
            r2 = 1428165309(0x552012bd, float:1.1000146E13)
            r15.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r15.j(r2)
            bi.b r2 = (bi.b) r2
            long r9 = r2.h()
            y0.l r2 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r2, r6)
            r6 = 16
            float r6 = (float) r6
            r11 = 18
            float r11 = (float) r11
            y0.o r2 = p.d.m(r2, r6, r11)
            t2.k r6 = new t2.k
            r11 = 3
            r6.<init>(r11)
            r28 = 0
            r29 = 261112(0x3fbf8, float:3.65896E-40)
            r11 = r7
            java.lang.String r7 = "暂无快捷项"
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r26 = r15
            r17 = r16
            r15 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 54
            r36 = r8
            r8 = r2
            r2 = r17
            r17 = r6
            r6 = r36
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r15 = r26
            r15.p(r6)
            r12 = r4
            r4 = r5
            r5 = r2
            r2 = r6
            goto L67f
        L56e:
            r2 = r7
            r7 = 1428599154(0x5526b172, float:1.1455066E13)
            r15.a0(r7)
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r17 = r7.iterator()
            r7 = r8
        L580:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L678
            java.lang.Object r9 = r17.next()
            int r18 = r7 + 1
            if (r7 < 0) goto L673
            k9.j r9 = (k9.j) r9
            if (r7 <= 0) goto L59f
            r10 = -193175619(0xfffffffff47c5fbd, float:-7.9980506E31)
            r15.a0(r10)
            wb.ho.D1(r4, r15, r8, r2)
        L59b:
            r15.p(r8)
            goto L5a6
        L59f:
            r10 = -1693463437(0xffffffff9b0fcc73, float:-1.1894744E-22)
            r15.a0(r10)
            goto L59b
        L5a6:
            r10 = r8
            if (r7 <= 0) goto L5aa
            r8 = r2
        L5aa:
            java.lang.Object r11 = r3.getValue()
            java.util.List r11 = (java.util.List) r11
            int r11 = a.a.b0(r11)
            if (r7 >= r11) goto L5b8
            r11 = r2
            goto L5b9
        L5b8:
            r11 = r10
        L5b9:
            boolean r12 = r15.h(r6)
            boolean r13 = r15.d(r7)
            r12 = r12 | r13
            boolean r13 = r15.h(r9)
            r12 = r12 | r13
            java.lang.Object r13 = r15.P()
            if (r12 != 0) goto L5cf
            if (r13 != r5) goto L5d1
        L5cf:
            r13 = r2
            goto L5da
        L5d1:
            r12 = r13
            r13 = r2
            r2 = r12
            r12 = r9
            r9 = r5
            r5 = r12
            r12 = r4
            r4 = r7
            goto L5ea
        L5da:
            ca.k r2 = new ca.k
            r12 = r4
            r4 = r7
            r7 = 7
            r36 = r9
            r9 = r5
            r5 = r36
            r2.<init>(r3, r4, r5, r6, r7)
            r15.k0(r2)
        L5ea:
            fg.l r2 = (fg.l) r2
            boolean r7 = r15.d(r4)
            boolean r14 = r15.h(r6)
            r7 = r7 | r14
            java.lang.Object r14 = r15.P()
            if (r7 != 0) goto L5fd
            if (r14 != r9) goto L606
        L5fd:
            wb.hg r14 = new wb.hg
            r7 = 0
            r14.<init>(r4, r3, r6, r7)
            r15.k0(r14)
        L606:
            fg.a r14 = (fg.a) r14
            boolean r7 = r15.d(r4)
            boolean r16 = r15.h(r6)
            r7 = r7 | r16
            java.lang.Object r10 = r15.P()
            if (r7 != 0) goto L61a
            if (r10 != r9) goto L623
        L61a:
            wb.hg r10 = new wb.hg
            r7 = 1
            r10.<init>(r4, r3, r6, r7)
            r15.k0(r10)
        L623:
            fg.a r10 = (fg.a) r10
            boolean r4 = r15.h(r5)
            java.lang.Object r7 = r15.P()
            if (r4 != 0) goto L631
            if (r7 != r9) goto L63b
        L631:
            sh.v1 r7 = new sh.v1
            r4 = 15
            r7.<init>(r5, r4, r1)
            r15.k0(r7)
        L63b:
            fg.a r7 = (fg.a) r7
            boolean r4 = r15.h(r6)
            boolean r16 = r15.h(r5)
            r4 = r4 | r16
            java.lang.Object r12 = r15.P()
            if (r4 != 0) goto L64f
            if (r12 != r9) goto L659
        L64f:
            ab.e r12 = new ab.e
            r4 = 25
            r12.<init>(r6, r5, r3, r4)
            r15.k0(r12)
        L659:
            fg.a r12 = (fg.a) r12
            r16 = 0
            r4 = r7
            r7 = r5
            r5 = r13
            r13 = r4
            r4 = r9
            r9 = r11
            r11 = r14
            r14 = r12
            r12 = r10
            r10 = r2
            r2 = 0
            wb.ho.W0(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r8 = r2
            r2 = r5
            r7 = r18
            r5 = r4
            r4 = 0
            goto L580
        L673:
            a.a.Q0()
            r1 = 0
            throw r1
        L678:
            r4 = r5
            r5 = r2
            r2 = r8
            r15.p(r2)
            r12 = 0
        L67f:
            wb.ho.D1(r12, r15, r2, r5)
            java.lang.Object r2 = r15.P()
            if (r2 != r4) goto L692
            c9.x0 r2 = new c9.x0
            r4 = 25
            r2.<init>(r4, r3, r1)
            r15.k0(r2)
        L692:
            fg.a r2 = (fg.a) r2
            r1 = 438(0x1b6, float:6.14E-43)
            java.lang.String r3 = "新增快捷项"
            java.lang.String r4 = "添加微信页面、模块设置或插件 Agent 入口"
            wb.ho.b(r3, r4, r2, r15, r1)
            goto L6a1
        L69e:
            r15.V()
        L6a1:
            sf.n r1 = sf.n.f12433a
            return r1
        L6a4:
            java.lang.Object r1 = r0.f385i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r0.f386j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f384h
            fg.a r3 = (fg.a) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L6c5
            r6 = r9
            goto L6c6
        L6c5:
            r6 = r8
        L6c6:
            r5 = r5 & r9
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto L721
            boolean r5 = r4.h(r1)
            boolean r6 = r4.h(r2)
            r5 = r5 | r6
            java.lang.Object r6 = r4.P()
            i0.e r7 = i0.l.f5952a
            if (r5 != 0) goto L6e0
            if (r6 != r7) goto L6ea
        L6e0:
            sh.v1 r6 = new sh.v1
            r5 = 12
            r6.<init>(r1, r5, r2)
            r4.k0(r6)
        L6ea:
            fg.a r6 = (fg.a) r6
            java.lang.String r5 = "导出配置"
            java.lang.String r10 = ""
            r11 = 54
            wb.ho.b(r5, r10, r6, r4, r11)
            r5 = 0
            wb.ho.D1(r5, r4, r8, r9)
            boolean r5 = r4.h(r1)
            boolean r6 = r4.h(r2)
            r5 = r5 | r6
            boolean r6 = r4.f(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r4.P()
            if (r5 != 0) goto L70f
            if (r6 != r7) goto L719
        L70f:
            ab.e r6 = new ab.e
            r5 = 19
            r6.<init>(r1, r2, r3, r5)
            r4.k0(r6)
        L719:
            fg.a r6 = (fg.a) r6
            java.lang.String r1 = "导入配置"
            wb.ho.b(r1, r10, r6, r4, r11)
            goto L724
        L721:
            r4.V()
        L724:
            sf.n r1 = sf.n.f12433a
            return r1
        L727:
            java.lang.Object r1 = r0.f385i
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f384h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f386j
            i0.a1 r3 = (i0.a1) r3
            r9 = r39
            i0.h0 r9 = (i0.h0) r9
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L747
            r5 = r7
            goto L748
        L747:
            r5 = 0
        L748:
            r4 = r4 & r7
            boolean r4 = r9.S(r4, r5)
            if (r4 == 0) goto L796
            java.lang.Object r4 = r3.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L769
            java.lang.String r5 = "记录 Java、Native 和 ANR 异常，并在下次启动时显示日志"
        L767:
            r6 = r5
            goto L76c
        L769:
            java.lang.String r5 = "关闭后不再捕获或弹出异常日志"
            goto L767
        L76c:
            boolean r5 = r9.h(r1)
            boolean r7 = r9.h(r2)
            r5 = r5 | r7
            java.lang.Object r7 = r9.P()
            if (r5 != 0) goto L77f
            i0.e r5 = i0.l.f5952a
            if (r7 != r5) goto L788
        L77f:
            wb.tc r7 = new wb.tc
            r5 = 7
            r7.<init>(r1, r2, r3, r5)
            r9.k0(r7)
        L788:
            r8 = r7
            fg.l r8 = (fg.l) r8
            r10 = 48
            r11 = 8
            java.lang.String r5 = "捕获异常日志"
            r7 = 0
            wb.ho.P3(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L799
        L796:
            r9.V()
        L799:
            sf.n r1 = sf.n.f12433a
            return r1
        L79c:
            java.lang.Object r1 = r0.f386j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r0.f385i
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r0.f384h
            java.lang.String r3 = (java.lang.String) r3
            r9 = r39
            i0.h0 r9 = (i0.h0) r9
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L7bc
            r5 = r7
            goto L7bd
        L7bc:
            r5 = 0
        L7bd:
            r4 = r4 & r7
            boolean r4 = r9.S(r4, r5)
            if (r4 == 0) goto L7ff
            java.lang.Object r4 = r1.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r5 = r9.f(r1)
            boolean r6 = r9.h(r2)
            r5 = r5 | r6
            boolean r6 = r9.f(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r9.P()
            if (r5 != 0) goto L7e6
            i0.e r5 = i0.l.f5952a
            if (r6 != r5) goto L7ef
        L7e6:
            wb.vb r6 = new wb.vb
            r5 = 3
            r6.<init>(r2, r3, r1, r5)
            r9.k0(r6)
        L7ef:
            r8 = r6
            fg.l r8 = (fg.l) r8
            r10 = 432(0x1b0, float:6.05E-43)
            r11 = 8
            java.lang.String r5 = "使用非好友"
            java.lang.String r6 = "仅在伪评论选择器中额外加入群成员"
            r7 = 0
            wb.ho.P3(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L802
        L7ff:
            r9.V()
        L802:
            sf.n r1 = sf.n.f12433a
            return r1
        L805:
            java.lang.Object r1 = r0.f385i
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f386j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f384h
            s0.d r3 = (s0.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 433(0x1b1, float:6.07E-43)
            int r5 = i0.r.C(r5)
            r1.o(r2, r3, r4, r5)
            goto L94
        L827:
            java.lang.Object r1 = r0.f385i
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f386j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f384h
            fg.l r3 = (fg.l) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 28039(0x6d87, float:3.9291E-41)
            int r5 = i0.r.C(r5)
            r1.m(r2, r3, r4, r5)
            goto L94
        L849:
            java.lang.Object r1 = r0.f385i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r0.f384h
            s0.d r2 = (s0.d) r2
            java.lang.Object r3 = r0.f386j
            c9.r0 r3 = (c9.r0) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 1
            if (r6 == r7) goto L869
            r6 = r8
            goto L86a
        L869:
            r6 = 0
        L86a:
            r5 = r5 & r8
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto L887
            wb.y2 r5 = wb.y2.f20283h
            b0.q r6 = new b0.q
            r7 = 15
            r6.<init>(r2, r7, r3)
            r2 = 961891475(0x39554c93, float:2.0341789E-4)
            s0.d r2 = s0.i.e(r2, r6, r4)
            r3 = 432(0x1b0, float:6.05E-43)
            r5.n(r1, r2, r4, r3)
            goto L88a
        L887:
            r4.V()
        L88a:
            sf.n r1 = sf.n.f12433a
            return r1
        L88d:
            java.lang.Object r1 = r0.f385i
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f386j
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r0.f384h
            s0.d r3 = (s0.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 433(0x1b1, float:6.07E-43)
            int r5 = i0.r.C(r5)
            r1.n(r2, r3, r4, r5)
            goto L94
        L8af:
            java.lang.Object r1 = r0.f385i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f386j
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f384h
            fg.l r3 = (fg.l) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r6 == r7) goto L8d0
            r6 = r8
            goto L8d1
        L8d0:
            r6 = r9
        L8d1:
            r5 = r5 & r8
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto L9ef
            boolean r5 = r1.isEmpty()
            r6 = 6
            if (r5 == 0) goto L8ef
            r1 = -685832523(0xffffffffd71f06b5, float:-1.7485116E14)
            r4.a0(r1)
            java.lang.String r1 = "暂无聊天分组"
            wb.ho.s0(r1, r4, r6)
            r4.p(r9)
            goto L9f2
        L8ef:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L905
            r1 = -685830440(0xffffffffd71f0ed8, float:-1.748861E14)
            r4.a0(r1)
            java.lang.String r1 = "没有匹配的聊天分组"
            wb.ho.s0(r1, r4, r6)
            r4.p(r9)
            goto L9f2
        L905:
            r5 = 214180076(0xcc420ec, float:3.0218396E-31)
            r4.a0(r5)
            java.util.Iterator r5 = r2.iterator()
            r6 = r9
        L910:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9eb
            java.lang.Object r7 = r5.next()
            int r10 = r6 + 1
            if (r6 < 0) goto L9e5
            wb.g2 r7 = (wb.g2) r7
            int r12 = r7.f16298b
            c9.a r13 = r7.f16297a
            java.lang.String r14 = "  "
            java.lang.String r12 = og.t.Z(r12, r14)
            java.lang.String r14 = r13.f1082b
            java.lang.String r12 = bc.e.i(r12, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.List r15 = r13.f1085e
            int r15 = r15.size()
            r14.append(r15)
            java.lang.String r15 = " 个直属会话"
            r14.append(r15)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L94d
            r40 = r8
            r8 = r9
            goto L97e
        L94d:
            java.util.Iterator r15 = r1.iterator()
            r16 = r9
        L953:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L97a
            java.lang.Object r17 = r15.next()
            r39 = 0
            r11 = r17
            c9.a r11 = (c9.a) r11
            java.lang.String r11 = r11.f1083c
            r40 = r8
            java.lang.String r8 = r13.f1081a
            boolean r8 = gg.l.a(r11, r8)
            if (r8 == 0) goto L973
            int r16 = r16 + 1
            if (r16 < 0) goto L976
        L973:
            r8 = r40
            goto L953
        L976:
            a.a.P0()
            throw r39
        L97a:
            r40 = r8
            r8 = r16
        L97e:
            if (r8 <= 0) goto L98d
            java.lang.String r11 = " · "
            r14.append(r11)
            r14.append(r8)
            java.lang.String r8 = " 个子分组"
            r14.append(r8)
        L98d:
            int r8 = r7.f16298b
            if (r8 <= 0) goto L99b
            java.lang.String r8 = "\n"
            r14.append(r8)
            java.lang.String r8 = r7.f16299c
            r14.append(r8)
        L99b:
            java.lang.String r8 = r14.toString()
            boolean r11 = r4.f(r3)
            boolean r13 = r4.h(r7)
            r11 = r11 | r13
            java.lang.Object r13 = r4.P()
            if (r11 != 0) goto L9b2
            i0.e r11 = i0.l.f5952a
            if (r13 != r11) goto L9bb
        L9b2:
            wb.b2 r13 = new wb.b2
            r11 = 0
            r13.<init>(r3, r7, r11)
            r4.k0(r13)
        L9bb:
            fg.a r13 = (fg.a) r13
            wb.ho.x3(r12, r8, r13, r4, r9)
            int r7 = r2.size()
            int r7 = r7 + (-1)
            if (r6 >= r7) goto L9d8
            r6 = 582173041(0x22b34171, float:4.8587336E-18)
            r4.a0(r6)
            r6 = 0
            r7 = r40
            wb.ho.D1(r6, r4, r9, r7)
        L9d4:
            r4.p(r9)
            goto L9e1
        L9d8:
            r7 = r40
            r6 = 867508543(0x33b5213f, float:8.434517E-8)
            r4.a0(r6)
            goto L9d4
        L9e1:
            r8 = r7
            r6 = r10
            goto L910
        L9e5:
            r39 = 0
            a.a.Q0()
            throw r39
        L9eb:
            r4.p(r9)
            goto L9f2
        L9ef:
            r4.V()
        L9f2:
            sf.n r1 = sf.n.f12433a
            return r1
        L9f5:
            java.lang.Object r1 = r0.f385i
            c9.a r1 = (c9.a) r1
            java.lang.Object r2 = r0.f386j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f384h
            fg.a r3 = (fg.a) r3
            r13 = r39
            i0.h0 r13 = (i0.h0) r13
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == r6) goto La16
            r5 = r8
            goto La17
        La16:
            r5 = r7
        La17:
            r4 = r4 & r8
            boolean r4 = r13.S(r4, r5)
            if (r4 == 0) goto Lbba
            p.e r4 = p.j.f9926c
            y0.e r5 = y0.b.f21804s
            p.t r4 = p.s.a(r4, r5, r13, r7)
            long r5 = r13.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r13.l()
            y0.l r7 = y0.l.f21818a
            y0.o r9 = y0.a.c(r13, r7)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r13.d0()
            boolean r11 = r13.S
            if (r11 == 0) goto La48
            r13.k(r10)
            goto La4b
        La48:
            r13.n0()
        La4b:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r13, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r13, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r13, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r13)
            x1.e r12 = x1.f.f20884c
            i0.r.A(r12, r13, r9)
            java.lang.String r1 = r1.f1082b
            java.lang.String r9 = "确定删除“"
            java.lang.String r14 = "”？聊天记录、联系人和群聊不会被删除。"
            java.lang.String r1 = eh.a.n(r9, r1, r14)
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r9 = r13.j(r9)
            bi.b r9 = (bi.b) r9
            long r14 = r9.g()
            r9 = 14
            long r16 = x6.d.D(r9)
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r9 = r5
            r5 = 0
            r18 = r10
            r10 = 0
            r19 = r11
            r11 = 0
            r20 = r12
            r23 = r13
            r12 = 0
            r21 = r7
            r36 = r14
            r15 = r6
            r6 = r36
            r14 = 0
            r24 = r8
            r22 = r9
            r8 = r16
            r17 = r15
            r15 = 0
            r27 = r17
            r17 = 0
            r28 = r18
            r18 = 0
            r29 = r19
            r19 = 0
            r30 = r20
            r20 = 0
            r31 = r21
            r21 = 0
            r32 = r22
            r22 = 0
            r33 = r24
            r24 = 24576(0x6000, float:3.4438E-41)
            r0 = r29
            r35 = r30
            r34 = r32
            r29 = r27
            r27 = r3
            r3 = r4
            r4 = r1
            r1 = r28
            r28 = r2
            r2 = r31
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = r23
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r2, r4)
            r2 = 12
            float r7 = (float) r2
            r9 = 0
            r10 = 13
            r6 = 0
            r8 = 0
            y0.o r2 = p.d.p(r5, r6, r7, r8, r9, r10)
            r5 = 10
            float r5 = (float) r5
            p.h r5 = p.j.g(r5)
            y0.f r6 = y0.b.f21801p
            r7 = 6
            p.e1 r5 = p.d1.a(r5, r6, r13, r7)
            long r6 = r13.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r13.l()
            y0.o r2 = y0.a.c(r13, r2)
            r13.d0()
            boolean r8 = r13.S
            if (r8 == 0) goto Lb15
            r13.k(r1)
            goto Lb18
        Lb15:
            r13.n0()
        Lb18:
            i0.r.A(r0, r13, r5)
            i0.r.A(r3, r13, r7)
            r15 = r29
            r9 = r34
            j8.b.p(r6, r13, r15, r13, r9)
            r0 = r35
            i0.r.A(r0, r13, r2)
            r2 = r28
            boolean r0 = r13.f(r2)
            java.lang.Object r1 = r13.P()
            i0.e r3 = i0.l.f5952a
            if (r0 != 0) goto Lb3a
            if (r1 != r3) goto Lb44
        Lb3a:
            b0.j r1 = new b0.j
            r0 = 17
            r1.<init>(r2, r0)
            r13.k0(r1)
        Lb44:
            r5 = r1
            fg.a r5 = (fg.a) r5
            double r0 = (double) r4
            r16 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            java.lang.String r1 = "invalid weight; must be greater than zero"
            if (r0 <= 0) goto Lb51
            goto Lb54
        Lb51:
            q.a.a(r1)
        Lb54:
            p.q0 r6 = new p.q0
            r0 = 1
            r6.<init>(r4, r0)
            sh.q1 r11 = sh.c.a(r13)
            r14 = 6
            r15 = 1912(0x778, float:2.679E-42)
            r7 = r4
            java.lang.String r4 = "取消"
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r18 = r12
            r12 = 0
            r0 = r18
            sh.s.o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = r13.f(r2)
            r5 = r27
            boolean r6 = r13.f(r5)
            r4 = r4 | r6
            java.lang.Object r6 = r13.P()
            if (r4 != 0) goto Lb87
            if (r6 != r3) goto Lb90
        Lb87:
            wb.m1 r6 = new wb.m1
            r3 = 0
            r6.<init>(r5, r2, r3)
            r13.k0(r6)
        Lb90:
            r5 = r6
            fg.a r5 = (fg.a) r5
            double r2 = (double) r0
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto Lb99
            goto Lb9c
        Lb99:
            q.a.a(r1)
        Lb9c:
            p.q0 r6 = new p.q0
            r1 = 1
            r6.<init>(r0, r1)
            sh.q1 r11 = sh.c.a(r13)
            r14 = 6
            r15 = 1912(0x778, float:2.679E-42)
            java.lang.String r4 = "确认删除"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            sh.s.o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r13.p(r1)
            r13.p(r1)
            goto Lbbd
        Lbba:
            r13.V()
        Lbbd:
            sf.n r0 = sf.n.f12433a
            return r0
        Lbc0:
            java.lang.Object r1 = r0.f385i
            y0.o r1 = (y0.o) r1
            java.lang.Object r2 = r0.f386j
            h0.d1 r2 = (h0.d1) r2
            java.lang.Object r3 = r0.f384h
            s0.d r3 = (s0.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 385(0x181, float:5.4E-43)
            int r5 = i0.r.C(r5)
            w.s.g(r1, r2, r3, r4, r5)
            goto L94
        Lbe2:
            java.lang.Object r1 = r0.f385i
            gg.r r1 = (gg.r) r1
            java.lang.Object r2 = r0.f386j
            m.o2 r2 = (m.o2) r2
            java.lang.Object r3 = r0.f384h
            m.m2 r3 = (m.m2) r3
            r4 = r39
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5 = r40
            java.lang.Float r5 = (java.lang.Float) r5
            r5.getClass()
            float r5 = r1.f4561g
            float r4 = r4 - r5
            float r4 = r2.d(r4)
            long r4 = r2.h(r4)
            m.o2 r3 = r3.f8273a
            m.u1 r6 = r3.f8315k
            r7 = 1
            long r3 = r3.c(r6, r4, r7)
            float r3 = r2.g(r3)
            float r2 = r2.d(r3)
            float r3 = r1.f4561g
            float r3 = r3 + r2
            r1.f4561g = r3
            goto L94
        Lc20:
            java.lang.Object r1 = r0.f385i
            c9.j1 r1 = (c9.j1) r1
            java.lang.Object r2 = r0.f386j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f384h
            s0.d r3 = (s0.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            r5 = 433(0x1b1, float:6.07E-43)
            int r5 = i0.r.C(r5)
            r1.h(r2, r3, r4, r5)
            goto L94
        Lc42:
            java.lang.Object r1 = r0.f385i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r0.f384h
            s0.d r2 = (s0.d) r2
            java.lang.Object r3 = r0.f386j
            c9.p0 r3 = (c9.p0) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 1
            if (r6 == r7) goto Lc62
            r6 = r8
            goto Lc63
        Lc62:
            r6 = 0
        Lc63:
            r5 = r5 & r8
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto Lc7f
            c9.j1 r5 = c9.j1.f1228a
            b0.q r6 = new b0.q
            r7 = 4
            r6.<init>(r2, r7, r3)
            r2 = 63693787(0x3cbe3db, float:1.1983581E-36)
            s0.d r2 = s0.i.e(r2, r6, r4)
            r3 = 432(0x1b0, float:6.05E-43)
            r5.h(r1, r2, r4, r3)
            goto Lc82
        Lc7f:
            r4.V()
        Lc82:
            sf.n r1 = sf.n.f12433a
            return r1
        Lc85:
            java.lang.Object r1 = r0.f385i
            y0.o r1 = (y0.o) r1
            java.lang.Object r2 = r0.f386j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f384h
            s0.d r3 = (s0.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r6 == r7) goto Lca6
            r6 = r9
            goto Lca7
        Lca6:
            r6 = r8
        Lca7:
            r5 = r5 & r9
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto Ld16
            java.lang.Object r5 = r4.P()
            i0.e r6 = i0.l.f5952a
            if (r5 != r6) goto Lcbf
            b0.l r5 = new b0.l
            r6 = 0
            r5.<init>(r2, r6)
            r4.k0(r5)
        Lcbf:
            fg.l r5 = (fg.l) r5
            y0.o r1 = v1.w.m(r1, r5)
            y0.g r2 = y0.b.f21792g
            v1.n0 r2 = p.o.d(r2, r9)
            long r5 = r4.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r4.l()
            y0.o r1 = y0.a.c(r4, r1)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r4.d0()
            boolean r10 = r4.S
            if (r10 == 0) goto Lceb
            r4.k(r7)
            goto Lcee
        Lceb:
            r4.n0()
        Lcee:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r4, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r4, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r4, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r4)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r3.invoke(r4, r1)
            r4.p(r9)
            goto Ld19
        Ld16:
            r4.V()
        Ld19:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
