package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1323k;

    public /* synthetic */ q0(f9.e r2, f9.h r3, f9.c r4, android.app.Activity r5) {
            r1 = this;
            r0 = 2
            r1.f1319g = r0
            r1.<init>()
            r1.f1321i = r2
            r1.f1320h = r3
            r1.f1323k = r4
            r1.f1322j = r5
            return
    }

    public /* synthetic */ q0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1319g = r5
            r0.f1321i = r1
            r0.f1322j = r2
            r0.f1320h = r3
            r0.f1323k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ q0(java.lang.Object r1, java.lang.Object r2, sf.b r3, sf.b r4, int r5, int r6) {
            r0 = this;
            r0.f1319g = r6
            r0.f1321i = r1
            r0.f1322j = r2
            r0.f1320h = r3
            r0.f1323k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ q0(y0.o r2, v.d r3, sh.f r4, s0.d r5) {
            r1 = this;
            r0 = 3
            r1.f1319g = r0
            r1.<init>()
            r1.f1321i = r2
            r1.f1322j = r3
            r1.f1323k = r4
            r1.f1320h = r5
            return
    }

    private final java.lang.Object e(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.f1321i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f1322j
            wb.i5 r2 = (wb.i5) r2
            java.lang.Object r3 = r0.f1320h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f1323k
            i0.a1 r4 = (i0.a1) r4
            r10 = r17
            i0.h0 r10 = (i0.h0) r10
            r5 = r18
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r13 = 0
            r14 = 1
            if (r6 == r7) goto L27
            r6 = r14
            goto L28
        L27:
            r6 = r13
        L28:
            r5 = r5 & r14
            boolean r5 = r10.S(r5, r6)
            if (r5 == 0) goto Lb4
            aa.a r2 = r2.f16719b
            java.lang.String r2 = wb.ho.l6(r2)
            java.lang.Object r5 = r10.P()
            i0.e r15 = i0.l.f5952a
            if (r5 != r15) goto L47
            k.s1 r5 = new k.s1
            r6 = 25
            r5.<init>(r6)
            r10.k0(r5)
        L47:
            fg.a r5 = (fg.a) r5
            r6 = 384(0x180, float:5.38E-43)
            wb.ho.x3(r1, r2, r5, r10, r6)
            r1 = 0
            wb.ho.D1(r1, r10, r13, r14)
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            boolean r2 = r10.f(r3)
            java.lang.Object r6 = r10.P()
            if (r2 != 0) goto L68
            if (r6 != r15) goto L71
        L68:
            wb.oh r6 = new wb.oh
            r2 = 0
            r6.<init>(r3, r2)
            r10.k0(r6)
        L71:
            r9 = r6
            fg.l r9 = (fg.l) r9
            r11 = 432(0x1b0, float:6.05E-43)
            r12 = 8
            java.lang.String r6 = "启用名单"
            java.lang.String r7 = "关闭后该名单不参与屏蔽消息匹配"
            r8 = 0
            wb.ho.P3(r5, r6, r7, r8, r9, r10, r11, r12)
            wb.ho.D1(r1, r10, r13, r14)
            java.lang.Object r1 = r4.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "exclude"
            boolean r5 = gg.l.a(r1, r2)
            boolean r1 = r10.f(r4)
            java.lang.Object r2 = r10.P()
            if (r1 != 0) goto L9b
            if (r2 != r15) goto La4
        L9b:
            wb.oh r2 = new wb.oh
            r1 = 1
            r2.<init>(r4, r1)
            r10.k0(r2)
        La4:
            r9 = r2
            fg.l r9 = (fg.l) r9
            r11 = 432(0x1b0, float:6.05E-43)
            r12 = 8
            java.lang.String r6 = "排除名单"
            java.lang.String r7 = "开启后命中该名单时跳过屏蔽；关闭时按下方模板屏蔽"
            r8 = 0
            wb.ho.P3(r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lb7
        Lb4:
            r10.V()
        Lb7:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private final java.lang.Object f(java.lang.Object r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.f1321i
            x8.b r1 = (x8.b) r1
            java.lang.Object r2 = r0.f1322j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1320h
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r0.f1323k
            fg.l r4 = (fg.l) r4
            r11 = r20
            i0.h0 r11 = (i0.h0) r11
            r5 = r21
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            r7 = 2
            r13 = 0
            r14 = 1
            if (r6 == r7) goto L27
            r6 = r14
            goto L28
        L27:
            r6 = r13
        L28:
            r5 = r5 & r14
            boolean r5 = r11.S(r5, r6)
            if (r5 == 0) goto L243
            int r5 = r1.f21237g
            java.util.Set r15 = r1.f21239i
            java.util.Set r6 = r1.f21238h
            java.lang.String r5 = wb.ho.T4(r5)
            java.util.List r7 = wb.ho.U4()
            int r8 = r1.f21237g
            boolean r9 = r11.f(r2)
            boolean r10 = r11.h(r1)
            r9 = r9 | r10
            java.lang.Object r10 = r11.P()
            i0.e r12 = i0.l.f5952a
            if (r9 != 0) goto L52
            if (r10 != r12) goto L5b
        L52:
            wb.mj r10 = new wb.mj
            r9 = 5
            r10.<init>(r9, r2, r1)
            r11.k0(r10)
        L5b:
            r9 = r10
            fg.l r9 = (fg.l) r9
            r10 = 0
            r16 = r12
            r12 = 6
            r17 = r6
            r6 = r5
            java.lang.String r5 = "生效范围"
            r18 = r16
            wb.ho.J2(r5, r6, r7, r8, r9, r10, r11, r12)
            int r5 = r1.f21237g
            r6 = 6
            r7 = 0
            r8 = 3
            if (r5 != r8) goto L15e
            r5 = 182267203(0xadd2d43, float:2.1298551E-32)
            r11.a0(r5)
            wb.ho.D1(r7, r11, r13, r14)
            r5 = r17
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r5.iterator()
        L89:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La0
            java.lang.Object r10 = r9.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = wb.ho.Z5(r12)
            if (r12 != 0) goto L89
            r8.add(r10)
            goto L89
        La0:
            java.lang.String r8 = wb.ho.D5(r8)
            java.lang.String r8 = wb.ho.O4(r8)
            boolean r9 = r11.f(r3)
            boolean r10 = r11.h(r1)
            r9 = r9 | r10
            boolean r10 = r11.f(r2)
            r9 = r9 | r10
            java.lang.Object r10 = r11.P()
            if (r9 != 0) goto Lc1
            r9 = r18
            if (r10 != r9) goto Lcc
            goto Lc3
        Lc1:
            r9 = r18
        Lc3:
            wb.nj r10 = new wb.nj
            r12 = 0
            r10.<init>(r3, r1, r2, r12)
            r11.k0(r10)
        Lcc:
            fg.a r10 = (fg.a) r10
            java.lang.String r12 = "选择指定好友"
            wb.ho.b(r12, r8, r10, r11, r6)
            wb.ho.D1(r7, r11, r13, r14)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ldf:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lf6
            java.lang.Object r10 = r5.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = wb.ho.Z5(r12)
            if (r12 == 0) goto Ldf
            r8.add(r10)
            goto Ldf
        Lf6:
            java.lang.String r5 = wb.ho.D5(r8)
            java.lang.String r5 = wb.ho.O4(r5)
            boolean r8 = r11.f(r3)
            boolean r10 = r11.h(r1)
            r8 = r8 | r10
            boolean r10 = r11.f(r2)
            r8 = r8 | r10
            java.lang.Object r10 = r11.P()
            if (r8 != 0) goto L114
            if (r10 != r9) goto L11d
        L114:
            wb.nj r10 = new wb.nj
            r8 = 1
            r10.<init>(r3, r1, r2, r8)
            r11.k0(r10)
        L11d:
            fg.a r10 = (fg.a) r10
            java.lang.String r3 = "选择指定群聊"
            wb.ho.b(r3, r5, r10, r11, r6)
            wb.ho.D1(r7, r11, r13, r14)
            java.util.Set r3 = r1.f21240j
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r3 = wb.ho.D5(r3)
            java.lang.String r3 = wb.ho.O4(r3)
            boolean r5 = r11.f(r4)
            boolean r7 = r11.h(r1)
            r5 = r5 | r7
            boolean r7 = r11.f(r2)
            r5 = r5 | r7
            java.lang.Object r7 = r11.P()
            if (r5 != 0) goto L149
            if (r7 != r9) goto L152
        L149:
            wb.nj r7 = new wb.nj
            r5 = 2
            r7.<init>(r4, r1, r2, r5)
            r11.k0(r7)
        L152:
            fg.a r7 = (fg.a) r7
            java.lang.String r1 = "选择指定群成员"
            wb.ho.b(r1, r3, r7, r11, r6)
            r11.p(r13)
            goto L246
        L15e:
            r9 = r18
            r5 = 184346931(0xafce933, float:2.4354437E-32)
            r11.a0(r5)
            wb.ho.D1(r7, r11, r13, r14)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r15.iterator()
        L174:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L18b
            java.lang.Object r10 = r8.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = wb.ho.Z5(r12)
            if (r12 != 0) goto L174
            r5.add(r10)
            goto L174
        L18b:
            java.lang.String r5 = wb.ho.D5(r5)
            java.lang.String r5 = wb.ho.O4(r5)
            boolean r8 = r11.f(r3)
            boolean r10 = r11.h(r1)
            r8 = r8 | r10
            boolean r10 = r11.f(r2)
            r8 = r8 | r10
            java.lang.Object r10 = r11.P()
            if (r8 != 0) goto L1a9
            if (r10 != r9) goto L1b2
        L1a9:
            wb.nj r10 = new wb.nj
            r8 = 3
            r10.<init>(r3, r1, r2, r8)
            r11.k0(r10)
        L1b2:
            fg.a r10 = (fg.a) r10
            java.lang.String r8 = "选择排除好友"
            wb.ho.b(r8, r5, r10, r11, r6)
            wb.ho.D1(r7, r11, r13, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r15.iterator()
        L1c5:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L1dc
            java.lang.Object r10 = r8.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = wb.ho.Z5(r12)
            if (r12 == 0) goto L1c5
            r5.add(r10)
            goto L1c5
        L1dc:
            java.lang.String r5 = wb.ho.D5(r5)
            java.lang.String r5 = wb.ho.O4(r5)
            boolean r8 = r11.f(r3)
            boolean r10 = r11.h(r1)
            r8 = r8 | r10
            boolean r10 = r11.f(r2)
            r8 = r8 | r10
            java.lang.Object r10 = r11.P()
            if (r8 != 0) goto L1fa
            if (r10 != r9) goto L203
        L1fa:
            wb.nj r10 = new wb.nj
            r8 = 4
            r10.<init>(r3, r1, r2, r8)
            r11.k0(r10)
        L203:
            fg.a r10 = (fg.a) r10
            java.lang.String r3 = "选择排除群聊"
            wb.ho.b(r3, r5, r10, r11, r6)
            wb.ho.D1(r7, r11, r13, r14)
            java.util.Set r3 = r1.f21241k
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r3 = wb.ho.D5(r3)
            java.lang.String r3 = wb.ho.O4(r3)
            boolean r5 = r11.f(r4)
            boolean r7 = r11.h(r1)
            r5 = r5 | r7
            boolean r7 = r11.f(r2)
            r5 = r5 | r7
            java.lang.Object r7 = r11.P()
            if (r5 != 0) goto L22f
            if (r7 != r9) goto L238
        L22f:
            wb.nj r7 = new wb.nj
            r5 = 5
            r7.<init>(r4, r1, r2, r5)
            r11.k0(r7)
        L238:
            fg.a r7 = (fg.a) r7
            java.lang.String r1 = "选择排除群成员"
            wb.ho.b(r1, r3, r7, r11, r6)
            r11.p(r13)
            goto L246
        L243:
            r11.V()
        L246:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private final java.lang.Object g(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Object r0 = r4.f1321i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r4.f1322j
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r4.f1320h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r4.f1323k
            i0.a1 r3 = (i0.a1) r3
            vb.a r5 = (vb.a) r5
            wb.c3 r6 = (wb.c3) r6
            r5.getClass()
            wb.ho.H3(r1, r2, r3)
            r0.invoke(r5, r6)
            sf.n r5 = sf.n.f12433a
            return r5
    }

    private final java.lang.Object h(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.f1321i
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r7.f1322j
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r7.f1320h
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r7.f1323k
            r4 = r0
            fg.p r4 = (fg.p) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 385(0x181, float:5.4E-43)
            int r6 = i0.r.C(r8)
            wb.ho.t0(r1, r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }

    private final java.lang.Object i(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.f1321i
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r7.f1322j
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r7.f1320h
            r2 = r0
            fg.a r2 = (fg.a) r2
            java.lang.Object r0 = r7.f1323k
            r3 = r0
            fg.l r3 = (fg.l) r3
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 385(0x181, float:5.4E-43)
            int r1 = i0.r.C(r8)
            wb.ho.G(r1, r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }

    private final java.lang.Object j(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.f1321i
            r1 = r0
            x9.f r1 = (x9.f) r1
            java.lang.Object r0 = r7.f1322j
            r2 = r0
            fg.a r2 = (fg.a) r2
            java.lang.Object r0 = r7.f1320h
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r7.f1323k
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 49
            int r6 = i0.r.C(r8)
            wb.ho.F1(r1, r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }

    private final java.lang.Object k(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Object r0 = r5.f1321i
            wb.d4 r0 = (wb.d4) r0
            java.lang.Object r1 = r5.f1322j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r5.f1320h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r5.f1323k
            i0.a1 r3 = (i0.a1) r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            og.k r4 = wb.ho.f16633a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.setValue(r4)
            if (r7 == 0) goto L2a
            java.lang.String r6 = r7.getMessage()
            if (r6 == 0) goto L24
            goto L26
        L24:
            java.lang.String r6 = "读取群聊失败"
        L26:
            r2.setValue(r6)
            goto L56
        L2a:
            java.util.Set r7 = r0.f15607d
            if (r7 == 0) goto L53
            java.util.Set r7 = (java.util.Set) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L39:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r6.next()
            r2 = r1
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            boolean r2 = r7.contains(r2)
            if (r2 == 0) goto L39
            r0.add(r1)
            goto L39
        L52:
            r6 = r0
        L53:
            r3.setValue(r6)
        L56:
            sf.n r6 = sf.n.f12433a
            return r6
    }

    private final java.lang.Object l(java.lang.Object r31, java.lang.Object r32) {
            r30 = this;
            r0 = r30
            java.lang.Object r1 = r0.f1321i
            r5 = r1
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r1 = r0.f1322j
            r3 = r1
            fg.l r3 = (fg.l) r3
            java.lang.Object r1 = r0.f1320h
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r0.f1323k
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            r12 = r31
            i0.h0 r12 = (i0.h0) r12
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r7 = 2
            r8 = 0
            r15 = 1
            if (r2 == r7) goto L2b
            r2 = r15
            goto L2c
        L2b:
            r2 = r8
        L2c:
            r1 = r1 & r15
            boolean r1 = r12.S(r1, r2)
            if (r1 == 0) goto L1c0
            p.e r1 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            p.t r1 = p.s.a(r1, r2, r12, r8)
            long r7 = r12.T
            int r2 = java.lang.Long.hashCode(r7)
            s0.h r7 = r12.l()
            y0.l r8 = y0.l.f21818a
            y0.o r9 = y0.a.c(r12, r8)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r12.d0()
            boolean r11 = r12.S
            if (r11 == 0) goto L5d
            r12.k(r10)
            goto L60
        L5d:
            r12.n0()
        L60:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r12, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r12, r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r12, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r12)
            x1.e r13 = x1.f.f20884c
            i0.r.A(r13, r12, r9)
            java.lang.Object r9 = r5.getValue()
            java.lang.String r9 = (java.lang.String) r9
            boolean r14 = r12.f(r5)
            java.lang.Object r15 = r12.P()
            r32 = r10
            i0.e r10 = i0.l.f5952a
            if (r14 != 0) goto L93
            if (r15 != r10) goto L9d
        L93:
            wb.lp r15 = new wb.lp
            r14 = 17
            r15.<init>(r5, r14)
            r12.k0(r15)
        L9d:
            fg.l r15 = (fg.l) r15
            r14 = r13
            r13 = 54
            r16 = r14
            r14 = 8
            r17 = r7
            java.lang.String r7 = "配置名称"
            r18 = r8
            java.lang.String r8 = "用于区分不同服务和模型"
            r19 = r10
            r10 = 0
            r20 = r3
            r21 = r5
            r22 = r6
            r0 = r11
            r11 = r15
            r3 = r16
            r6 = r18
            r5 = r19
            r15 = r32
            r19 = r4
            r4 = r17
            wb.ho.C1(r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r23 = p.h1.d(r6, r7)
            r6 = 8
            float r6 = (float) r6
            r27 = 0
            r28 = 13
            r24 = 0
            r26 = 0
            r25 = r6
            y0.o r6 = p.d.p(r23, r24, r25, r26, r27, r28)
            r8 = 10
            float r8 = (float) r8
            p.h r8 = p.j.g(r8)
            y0.f r9 = y0.b.f21801p
            r10 = 6
            p.e1 r8 = p.d1.a(r8, r9, r12, r10)
            long r9 = r12.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r12.l()
            y0.o r6 = y0.a.c(r12, r6)
            r12.d0()
            boolean r11 = r12.S
            if (r11 == 0) goto L106
            r12.k(r15)
            goto L109
        L106:
            r12.n0()
        L109:
            i0.r.A(r0, r12, r8)
            i0.r.A(r1, r12, r10)
            j8.b.p(r9, r12, r4, r12, r2)
            i0.r.A(r3, r12, r6)
            java.lang.Object r0 = r12.P()
            if (r0 != r5) goto L128
            wb.jp r0 = new wb.jp
            r1 = 28
            r6 = r22
            r0.<init>(r6, r1)
            r12.k0(r0)
            goto L12a
        L128:
            r6 = r22
        L12a:
            r8 = r0
            fg.a r8 = (fg.a) r8
            double r0 = (double) r7
            r22 = 0
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            java.lang.String r1 = "invalid weight; must be greater than zero"
            if (r0 <= 0) goto L137
            goto L13a
        L137:
            q.a.a(r1)
        L13a:
            p.q0 r9 = new p.q0
            r0 = 1
            r9.<init>(r7, r0)
            sh.q1 r14 = sh.c.a(r12)
            r17 = 54
            r18 = 1912(0x778, float:2.679E-42)
            r2 = r7
            java.lang.String r7 = "取消"
            r10 = 0
            r11 = 0
            r16 = r12
            r12 = 0
            r13 = 0
            r15 = 0
            r29 = r2
            r2 = r0
            r0 = r29
            sh.s.o(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r16
            r3 = r21
            boolean r4 = r12.f(r3)
            r7 = r20
            boolean r8 = r12.f(r7)
            r4 = r4 | r8
            r8 = r19
            boolean r9 = r12.f(r8)
            r4 = r4 | r9
            java.lang.Object r9 = r12.P()
            if (r4 != 0) goto L178
            if (r9 != r5) goto L17a
        L178:
            r4 = r2
            goto L17c
        L17a:
            r8 = r2
            goto L18f
        L17c:
            c9.n0 r2 = new c9.n0
            r20 = r7
            r7 = 26
            r5 = r8
            r8 = r4
            r4 = r5
            r5 = r3
            r3 = r20
            r2.<init>(r3, r4, r5, r6, r7)
            r12.k0(r2)
            r9 = r2
        L18f:
            fg.a r9 = (fg.a) r9
            double r2 = (double) r0
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 <= 0) goto L198
        L196:
            r1 = r9
            goto L19c
        L198:
            q.a.a(r1)
            goto L196
        L19c:
            p.q0 r9 = new p.q0
            r9.<init>(r0, r8)
            sh.q1 r14 = sh.c.a(r12)
            r17 = 6
            r18 = 1912(0x778, float:2.679E-42)
            java.lang.String r7 = "确认"
            r10 = 0
            r11 = 0
            r16 = r12
            r12 = 0
            r13 = 0
            r15 = 0
            r0 = r8
            r8 = r1
            sh.s.o(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r16
            r12.p(r0)
            r12.p(r0)
            goto L1c3
        L1c0:
            r12.V()
        L1c3:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object m(java.lang.Object r31, java.lang.Object r32) {
            r30 = this;
            r0 = r30
            java.lang.Object r1 = r0.f1321i
            r5 = r1
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r1 = r0.f1322j
            r3 = r1
            fg.p r3 = (fg.p) r3
            java.lang.Object r1 = r0.f1320h
            r4 = r1
            fb.d1 r4 = (fb.d1) r4
            java.lang.Object r1 = r0.f1323k
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            r12 = r31
            i0.h0 r12 = (i0.h0) r12
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r7 = 2
            r8 = 0
            r15 = 1
            if (r2 == r7) goto L2b
            r2 = r15
            goto L2c
        L2b:
            r2 = r8
        L2c:
            r1 = r1 & r15
            boolean r1 = r12.S(r1, r2)
            if (r1 == 0) goto L1af
            p.e r1 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            p.t r1 = p.s.a(r1, r2, r12, r8)
            long r7 = r12.T
            int r2 = java.lang.Long.hashCode(r7)
            s0.h r7 = r12.l()
            y0.l r8 = y0.l.f21818a
            y0.o r9 = y0.a.c(r12, r8)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r12.d0()
            boolean r11 = r12.S
            if (r11 == 0) goto L5d
            r12.k(r10)
            goto L60
        L5d:
            r12.n0()
        L60:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r12, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r12, r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r12, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r12)
            x1.e r13 = x1.f.f20884c
            i0.r.A(r13, r12, r9)
            java.lang.Object r9 = r5.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r14 = r12.P()
            i0.e r15 = i0.l.f5952a
            if (r14 != r15) goto L94
            wb.lp r14 = new wb.lp
            r0 = 2
            r14.<init>(r5, r0)
            r12.k0(r14)
        L94:
            fg.l r14 = (fg.l) r14
            r0 = r13
            r13 = 24630(0x6036, float:3.4514E-41)
            r16 = r11
            r11 = r14
            r14 = 8
            r17 = r7
            java.lang.String r7 = "对话标题"
            r18 = r8
            java.lang.String r8 = "最多 32 个字符"
            r19 = r10
            r10 = 0
            r21 = r3
            r20 = r4
            r22 = r6
            r4 = r17
            r6 = r18
            r3 = r0
            r0 = r19
            r19 = r5
            r5 = r16
            wb.ho.C1(r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r23 = p.h1.d(r6, r7)
            r6 = 8
            float r6 = (float) r6
            r27 = 0
            r28 = 13
            r24 = 0
            r26 = 0
            r25 = r6
            y0.o r6 = p.d.p(r23, r24, r25, r26, r27, r28)
            r8 = 10
            float r8 = (float) r8
            p.h r8 = p.j.g(r8)
            y0.f r9 = y0.b.f21801p
            r10 = 6
            p.e1 r8 = p.d1.a(r8, r9, r12, r10)
            long r9 = r12.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r12.l()
            y0.o r6 = y0.a.c(r12, r6)
            r12.d0()
            boolean r11 = r12.S
            if (r11 == 0) goto Lfb
            r12.k(r0)
            goto Lfe
        Lfb:
            r12.n0()
        Lfe:
            i0.r.A(r5, r12, r8)
            i0.r.A(r1, r12, r10)
            j8.b.p(r9, r12, r4, r12, r2)
            i0.r.A(r3, r12, r6)
            java.lang.Object r0 = r12.P()
            if (r0 != r15) goto L11c
            wb.jp r0 = new wb.jp
            r1 = 5
            r6 = r22
            r0.<init>(r6, r1)
            r12.k0(r0)
            goto L11e
        L11c:
            r6 = r22
        L11e:
            r8 = r0
            fg.a r8 = (fg.a) r8
            double r0 = (double) r7
            r22 = 0
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            java.lang.String r1 = "invalid weight; must be greater than zero"
            if (r0 <= 0) goto L12b
            goto L12e
        L12b:
            q.a.a(r1)
        L12e:
            p.q0 r9 = new p.q0
            r0 = 1
            r9.<init>(r7, r0)
            sh.q1 r14 = sh.c.a(r12)
            r17 = 54
            r18 = 1912(0x778, float:2.679E-42)
            r2 = r7
            java.lang.String r7 = "取消"
            r10 = 0
            r11 = 0
            r16 = r12
            r12 = 0
            r13 = 0
            r3 = r15
            r15 = 0
            r29 = r2
            r2 = r0
            r0 = r29
            sh.s.o(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r16
            r4 = r21
            boolean r5 = r12.f(r4)
            r7 = r20
            boolean r8 = r12.h(r7)
            r5 = r5 | r8
            java.lang.Object r8 = r12.P()
            if (r5 != 0) goto L166
            if (r8 != r3) goto L168
        L166:
            r3 = r2
            goto L16e
        L168:
            r29 = r8
            r8 = r2
            r2 = r29
            goto L180
        L16e:
            c9.n0 r2 = new c9.n0
            r20 = r7
            r7 = 23
            r8 = r3
            r3 = r4
            r5 = r19
            r4 = r20
            r2.<init>(r3, r4, r5, r6, r7)
            r12.k0(r2)
        L180:
            fg.a r2 = (fg.a) r2
            double r3 = (double) r0
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 <= 0) goto L188
            goto L18b
        L188:
            q.a.a(r1)
        L18b:
            p.q0 r9 = new p.q0
            r9.<init>(r0, r8)
            sh.q1 r14 = sh.c.a(r12)
            r17 = 6
            r18 = 1912(0x778, float:2.679E-42)
            java.lang.String r7 = "保存"
            r10 = 0
            r11 = 0
            r16 = r12
            r12 = 0
            r13 = 0
            r15 = 0
            r0 = r8
            r8 = r2
            sh.s.o(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r16
            r12.p(r0)
            r12.p(r0)
            goto L1b2
        L1af:
            r12.V()
        L1b2:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object n(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.f1321i
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r7.f1322j
            r2 = r0
            fb.q1 r2 = (fb.q1) r2
            java.lang.Object r0 = r7.f1320h
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r7.f1323k
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3073(0xc01, float:4.306E-42)
            int r6 = i0.r.C(r8)
            r1.o0(r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }

    private final java.lang.Object o(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.f1321i
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r7.f1322j
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.f1320h
            r3 = r0
            wb.k6 r3 = (wb.k6) r3
            java.lang.Object r0 = r7.f1323k
            r4 = r0
            ia.n r4 = (ia.n) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3073(0xc01, float:4.306E-42)
            int r6 = i0.r.C(r8)
            r1.u0(r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }

    private final java.lang.Object p(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            java.lang.Object r0 = r8.f1321i
            u2.c r0 = (u2.c) r0
            java.lang.Object r1 = r8.f1322j
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r8.f1320h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r8.f1323k
            i0.a1 r3 = (i0.a1) r3
            s1.t r9 = (s1.t) r9
            e1.b r10 = (e1.b) r10
            r9.getClass()
            r9.a()
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            long r4 = r10.f2294a
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r10 = (int) r4
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r9
            java.lang.Float r9 = java.lang.Float.valueOf(r10)
            r1.setValue(r9)
            java.lang.Object r9 = r2.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L4d
            goto L4e
        L4d:
            r10 = 0
        L4e:
            if (r10 == 0) goto L55
            float r9 = r10.floatValue()
            goto L5c
        L55:
            r9 = 56
            float r9 = (float) r9
            float r9 = r0.x0(r9)
        L5c:
            r10 = 6
            float r10 = (float) r10
            float r10 = r0.x0(r10)
            float r10 = r10 + r9
        L63:
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r0 = -r10
            r2 = 1056964608(0x3f000000, float:0.5)
            float r4 = r0 * r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r4 = 1055286886(0x3ee66666, float:0.45)
            if (r9 > 0) goto Lab
            java.lang.Object r9 = r3.getValue()
            fg.l r9 = (fg.l) r9
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r9 = r9.invoke(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La3
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = r9 + r10
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r1.setValue(r9)
            goto L63
        La3:
            float r0 = r0 * r4
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            r1.setValue(r9)
        Lab:
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r0 = r10 * r2
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto Led
            java.lang.Object r9 = r3.getValue()
            fg.l r9 = (fg.l) r9
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r9 = r9.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le5
            java.lang.Object r9 = r1.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = r9 - r10
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r1.setValue(r9)
            goto Lab
        Le5:
            float r10 = r10 * r4
            java.lang.Float r9 = java.lang.Float.valueOf(r10)
            r1.setValue(r9)
        Led:
            sf.n r9 = sf.n.f12433a
            return r9
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r49, java.lang.Object r50) {
            r48 = this;
            r0 = r48
            int r1 = r0.f1319g
            y0.l r6 = y0.l.f21818a
            java.lang.String r7 = "已选择 "
            r10 = 48
            r12 = 6
            i0.e r13 = i0.l.f5952a
            sf.n r14 = sf.n.f12433a
            r15 = 0
            r16 = 385(0x181, float:5.4E-43)
            r2 = 2
            r17 = 0
            java.lang.Object r9 = r0.f1323k
            r18 = 13
            java.lang.Object r8 = r0.f1320h
            r19 = 14
            java.lang.Object r5 = r0.f1322j
            java.lang.Object r3 = r0.f1321i
            r4 = 1
            switch(r1) {
                case 0: goto Lc6e;
                case 1: goto Lbc5;
                case 2: goto L95c;
                case 3: goto L8b8;
                case 4: goto L86f;
                case 5: goto L7fc;
                case 6: goto L7dd;
                case 7: goto L7be;
                case 8: goto L782;
                case 9: goto L723;
                case 10: goto L57a;
                case 11: goto L3b4;
                case 12: goto L34a;
                case 13: goto L296;
                case 14: goto L204;
                case 15: goto L129;
                case 16: goto L124;
                case 17: goto L99;
                case 18: goto L94;
                case 19: goto L8f;
                case 20: goto L8a;
                case 21: goto L85;
                case 22: goto L80;
                case 23: goto L7b;
                case 24: goto L76;
                case 25: goto L71;
                case 26: goto L6c;
                case 27: goto L67;
                case 28: goto L62;
                default: goto L25;
            }
        L25:
            c9.a1 r3 = (c9.a1) r3
            android.app.Activity r5 = (android.app.Activity) r5
            s0.d r8 = (s0.d) r8
            wb.n7 r9 = (wb.n7) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r6 = r50
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            if (r7 == r2) goto L3e
            r15 = r4
        L3e:
            r2 = r6 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L5e
            i0.u r2 = s3.b.f12341a
            i0.q1 r2 = r2.a(r3)
            wb.rj r3 = new wb.rj
            r4 = 22
            r3.<init>(r5, r8, r9, r4)
            r4 = -1124104542(0xffffffffbcff86a2, float:-0.031192128)
            s0.d r3 = s0.i.e(r4, r3, r1)
            i0.r.a(r2, r3, r1, r10)
            goto L61
        L5e:
            r1.V()
        L61:
            return r14
        L62:
            java.lang.Object r1 = r48.p(r49, r50)
            return r1
        L67:
            java.lang.Object r1 = r48.o(r49, r50)
            return r1
        L6c:
            java.lang.Object r1 = r48.n(r49, r50)
            return r1
        L71:
            java.lang.Object r1 = r48.m(r49, r50)
            return r1
        L76:
            java.lang.Object r1 = r48.l(r49, r50)
            return r1
        L7b:
            java.lang.Object r1 = r48.k(r49, r50)
            return r1
        L80:
            java.lang.Object r1 = r48.j(r49, r50)
            return r1
        L85:
            java.lang.Object r1 = r48.i(r49, r50)
            return r1
        L8a:
            java.lang.Object r1 = r48.h(r49, r50)
            return r1
        L8f:
            java.lang.Object r1 = r48.g(r49, r50)
            return r1
        L94:
            java.lang.Object r1 = r48.f(r49, r50)
            return r1
        L99:
            x8.u r3 = (x8.u) r3
            android.content.Context r5 = (android.content.Context) r5
            i0.a1 r8 = (i0.a1) r8
            i0.a1 r9 = (i0.a1) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r6 = r50
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            if (r7 == r2) goto Lb3
            r7 = r4
            goto Lb4
        Lb3:
            r7 = r15
        Lb4:
            r4 = r4 & r6
            boolean r4 = r1.S(r4, r7)
            if (r4 == 0) goto L120
            java.lang.String r4 = r3.f21365a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r3.f21369e
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto Lcc
            java.lang.String r7 = "未设置模型"
        Lcc:
            r6.append(r7)
            java.lang.Object r7 = r8.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = gg.l.a(r4, r7)
            if (r7 == 0) goto Le0
            java.lang.String r7 = " · 当前"
            r6.append(r7)
        Le0:
            java.lang.Object r7 = r9.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = gg.l.a(r4, r7)
            if (r7 == 0) goto Lfd
            java.lang.Object r7 = r8.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = gg.l.a(r4, r7)
            if (r7 != 0) goto Lfd
            java.lang.String r7 = " · 已选择"
            r6.append(r7)
        Lfd:
            java.lang.String r6 = r6.toString()
            boolean r7 = r1.h(r3)
            boolean r8 = r1.h(r5)
            r7 = r7 | r8
            java.lang.Object r8 = r1.P()
            if (r7 != 0) goto L112
            if (r8 != r13) goto L11a
        L112:
            wb.zh r8 = new wb.zh
            r8.<init>(r3, r5, r9, r2)
            r1.k0(r8)
        L11a:
            fg.a r8 = (fg.a) r8
            wb.ho.b(r4, r6, r8, r1, r15)
            goto L123
        L120:
            r1.V()
        L123:
            return r14
        L124:
            java.lang.Object r1 = r48.e(r49, r50)
            return r1
        L129:
            v8.a r3 = (v8.a) r3
            fg.p r5 = (fg.p) r5
            android.content.Context r8 = (android.content.Context) r8
            fg.l r9 = (fg.l) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r6 = r50
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10 = r6 & 3
            if (r10 == r2) goto L143
            r2 = r4
            goto L144
        L143:
            r2 = r15
        L144:
            r6 = r6 & r4
            boolean r2 = r1.S(r6, r2)
            if (r2 == 0) goto L200
            java.util.Set r2 = r3.f14205e
            java.util.Set r6 = r3.f14206f
            boolean r10 = r2.isEmpty()
            java.lang.String r4 = " 个会话"
            java.lang.String r16 = "未选择"
            if (r10 == 0) goto L15c
            r2 = r16
            goto L164
        L15c:
            int r2 = r2.size()
            java.lang.String r2 = eh.a.m(r2, r7, r4)
        L164:
            boolean r10 = r1.f(r5)
            boolean r17 = r1.h(r3)
            r10 = r10 | r17
            java.lang.Object r11 = r1.P()
            if (r10 != 0) goto L176
            if (r11 != r13) goto L17e
        L176:
            wb.ki r11 = new wb.ki
            r11.<init>(r5, r3, r15)
            r1.k0(r11)
        L17e:
            fg.a r11 = (fg.a) r11
            java.lang.String r10 = "监听会话"
            wb.ho.b(r10, r2, r11, r1, r12)
            r2 = 0
            r10 = 1
            wb.ho.D1(r2, r1, r15, r10)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L193
            java.lang.String r2 = "不限群成员"
            goto L19d
        L193:
            int r2 = r6.size()
            java.lang.String r6 = " 个群成员"
            java.lang.String r2 = eh.a.m(r2, r7, r6)
        L19d:
            boolean r6 = r1.h(r3)
            boolean r10 = r1.h(r8)
            r6 = r6 | r10
            boolean r10 = r1.f(r9)
            r6 = r6 | r10
            java.lang.Object r10 = r1.P()
            if (r6 != 0) goto L1b6
            if (r10 != r13) goto L1b4
            goto L1b6
        L1b4:
            r6 = 1
            goto L1bf
        L1b6:
            wb.zh r10 = new wb.zh
            r6 = 1
            r10.<init>(r3, r8, r9, r6)
            r1.k0(r10)
        L1bf:
            fg.a r10 = (fg.a) r10
            java.lang.String r8 = "群成员范围"
            wb.ho.b(r8, r2, r10, r1, r12)
            r2 = 0
            wb.ho.D1(r2, r1, r15, r6)
            java.util.Set r2 = r3.f14207g
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L1d5
        L1d2:
            r2 = r16
            goto L1de
        L1d5:
            int r2 = r2.size()
            java.lang.String r16 = eh.a.m(r2, r7, r4)
            goto L1d2
        L1de:
            boolean r4 = r1.f(r5)
            boolean r6 = r1.h(r3)
            r4 = r4 | r6
            java.lang.Object r6 = r1.P()
            if (r4 != 0) goto L1ef
            if (r6 != r13) goto L1f8
        L1ef:
            wb.ki r6 = new wb.ki
            r10 = 1
            r6.<init>(r5, r3, r10)
            r1.k0(r6)
        L1f8:
            fg.a r6 = (fg.a) r6
            java.lang.String r3 = "转发会话"
            wb.ho.b(r3, r2, r6, r1, r12)
            goto L203
        L200:
            r1.V()
        L203:
            return r14
        L204:
            i0.a1 r3 = (i0.a1) r3
            java.util.Set r5 = (java.util.Set) r5
            fg.l r8 = (fg.l) r8
            n9.a r9 = (n9.a) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r2) goto L220
            r6 = 1
        L21d:
            r22 = 1
            goto L222
        L220:
            r6 = r15
            goto L21d
        L222:
            r4 = r4 & 1
            boolean r4 = r1.S(r4, r6)
            if (r4 == 0) goto L292
            java.lang.Object r4 = r3.getValue()
            r26 = r4
            java.lang.String r26 = (java.lang.String) r26
            boolean r4 = r1.f(r3)
            java.lang.Object r6 = r1.P()
            if (r4 != 0) goto L23e
            if (r6 != r13) goto L246
        L23e:
            wb.ih r6 = new wb.ih
            r6.<init>(r3, r2)
            r1.k0(r6)
        L246:
            r28 = r6
            fg.l r28 = (fg.l) r28
            r30 = 54
            r31 = 8
            java.lang.String r24 = "标签名称"
            java.lang.String r25 = "用于任务和名单选择器"
            r27 = 0
            r29 = r1
            wb.ho.C1(r24, r25, r26, r27, r28, r29, r30, r31)
            r2 = 0
            r10 = 1
            wb.ho.D1(r2, r1, r15, r10)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L267
            java.lang.String r2 = "未选择群聊"
            goto L271
        L267:
            int r2 = r5.size()
            java.lang.String r3 = " 个群聊"
            java.lang.String r2 = eh.a.m(r2, r7, r3)
        L271:
            boolean r3 = r1.f(r8)
            boolean r4 = r1.h(r9)
            r3 = r3 | r4
            java.lang.Object r4 = r1.P()
            if (r3 != 0) goto L282
            if (r4 != r13) goto L28a
        L282:
            wb.jh r4 = new wb.jh
            r4.<init>(r8, r9, r15)
            r1.k0(r4)
        L28a:
            fg.a r4 = (fg.a) r4
            java.lang.String r3 = "标签群聊"
            wb.ho.b(r3, r2, r4, r1, r12)
            goto L295
        L292:
            r1.V()
        L295:
            return r14
        L296:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            android.content.Context r5 = (android.content.Context) r5
            r28 = r8
            i0.a1 r28 = (i0.a1) r28
            r27 = r9
            i0.a1 r27 = (i0.a1) r27
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r2) goto L2b6
            r2 = 1
        L2b3:
            r22 = 1
            goto L2b8
        L2b6:
            r2 = r15
            goto L2b3
        L2b8:
            r4 = r4 & 1
            boolean r2 = r1.S(r4, r2)
            if (r2 == 0) goto L346
            java.util.Iterator r2 = r3.iterator()
            r4 = r15
        L2c5:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L349
            java.lang.Object r6 = r2.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L342
            wb.s0 r6 = (wb.s0) r6
            java.lang.Object r8 = r28.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            boolean r9 = r1.h(r6)
            boolean r10 = r1.h(r5)
            r9 = r9 | r10
            java.lang.Object r10 = r1.P()
            if (r9 != 0) goto L2fa
            if (r10 != r13) goto L2f1
            goto L2fa
        L2f1:
            r24 = r5
            r25 = r6
            r9 = r27
            r5 = r28
            goto L310
        L2fa:
            c9.n0 r24 = new c9.n0
            r29 = 13
            r26 = r5
            r25 = r6
            r24.<init>(r25, r26, r27, r28, r29)
            r10 = r24
            r24 = r26
            r9 = r27
            r5 = r28
            r1.k0(r10)
        L310:
            r27 = r10
            fg.a r27 = (fg.a) r27
            r29 = 0
            r28 = r1
            r26 = r8
            wb.ho.h0(r24, r25, r26, r27, r28, r29)
            int r6 = r3.size()
            r10 = 1
            int r6 = r6 - r10
            if (r4 == r6) goto L333
            r4 = -29711368(0xfffffffffe3aa3f8, float:-6.2021945E37)
            r1.a0(r4)
            r4 = 0
            wb.ho.D1(r4, r1, r15, r10)
        L32f:
            r1.p(r15)
            goto L33a
        L333:
            r4 = -921038952(0xffffffffc91a0f98, float:-631033.5)
            r1.a0(r4)
            goto L32f
        L33a:
            r28 = r5
            r4 = r7
            r27 = r9
            r5 = r24
            goto L2c5
        L342:
            a.a.Q0()
            throw r17
        L346:
            r1.V()
        L349:
            return r14
        L34a:
            vb.a r3 = (vb.a) r3
            i0.a1 r5 = (i0.a1) r5
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r9 = (java.lang.String) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r2) goto L363
            r15 = 1
        L363:
            r22 = 1
            r2 = r4 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L3ae
            java.lang.Object r2 = r5.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r23 = r2.booleanValue()
            java.lang.String r24 = r3.b()
            java.lang.String r25 = r3.d()
            boolean r2 = r1.f(r5)
            boolean r3 = r1.h(r8)
            r2 = r2 | r3
            boolean r3 = r1.f(r9)
            r2 = r2 | r3
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L395
            if (r3 != r13) goto L39e
        L395:
            wb.vb r3 = new wb.vb
            r2 = 5
            r3.<init>(r8, r9, r5, r2)
            r1.k0(r3)
        L39e:
            r27 = r3
            fg.l r27 = (fg.l) r27
            r29 = 0
            r30 = 8
            r26 = 0
            r28 = r1
            wb.ho.P3(r23, r24, r25, r26, r27, r28, r29, r30)
            goto L3b3
        L3ae:
            r28 = r1
            r28.V()
        L3b3:
            return r14
        L3b4:
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r24 = r8
            fg.a r24 = (fg.a) r24
            fg.a r9 = (fg.a) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7 = r4 & 3
            if (r7 == r2) goto L3d2
            r2 = 1
        L3cf:
            r22 = 1
            goto L3d4
        L3d2:
            r2 = r15
            goto L3cf
        L3d4:
            r4 = r4 & 1
            boolean r2 = r1.S(r4, r2)
            if (r2 == 0) goto L576
            p.e r2 = p.j.f9926c
            y0.e r4 = y0.b.f21804s
            p.t r2 = p.s.a(r2, r4, r1, r15)
            long r7 = r1.T
            int r4 = java.lang.Long.hashCode(r7)
            s0.h r7 = r1.l()
            y0.o r8 = y0.a.c(r1, r6)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r1.d0()
            boolean r11 = r1.S
            if (r11 == 0) goto L404
            r1.k(r10)
            goto L407
        L404:
            r1.n0()
        L407:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r1, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r1, r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r1, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r1)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r1, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L435:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L44c
            java.lang.Object r7 = r4.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L435
            r3.add(r7)
            goto L435
        L44c:
            java.util.List r25 = tf.m.L1(r12, r3)
            r29 = 0
            r30 = 62
            java.lang.String r26 = "、"
            r27 = 0
            r28 = 0
            java.lang.String r3 = tf.m.A1(r25, r26, r27, r28, r29, r30)
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L46c
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            r2.append(r3)
        L46c:
            int r3 = r5.size()
            if (r3 <= r12) goto L477
            java.lang.String r3 = " 等"
            r2.append(r3)
        L477:
            java.lang.String r25 = r2.toString()
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r1.j(r2)
            bi.b r2 = (bi.b) r2
            long r27 = r2.g()
            long r29 = x6.d.D(r19)
            r46 = 0
            r47 = 262122(0x3ffea, float:3.67311E-40)
            r26 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 24576(0x6000, float:3.4438E-41)
            r44 = r1
            sh.s.n(r25, r26, r27, r29, r31, r32, r33, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r6, r2)
            r3 = 12
            float r3 = (float) r3
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r3
            y0.o r3 = p.d.p(r15, r16, r17, r18, r19, r20)
            r4 = 10
            float r4 = (float) r4
            p.h r4 = p.j.g(r4)
            y0.f r5 = y0.b.f21801p
            p.e1 r4 = p.d1.a(r4, r5, r1, r12)
            long r5 = r1.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r1.l()
            y0.o r3 = y0.a.c(r1, r3)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r1.d0()
            boolean r8 = r1.S
            if (r8 == 0) goto L4f3
            r1.k(r7)
            goto L4f6
        L4f3:
            r1.n0()
        L4f6:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r1, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r1, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r1, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r1)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r1, r3)
            double r3 = (double) r2
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "invalid weight; must be greater than zero"
            if (r3 <= 0) goto L51d
            goto L520
        L51d:
            q.a.a(r4)
        L520:
            p.q0 r3 = new p.q0
            r10 = 1
            r3.<init>(r2, r10)
            sh.q1 r30 = sh.c.a(r1)
            r33 = 6
            r34 = 1912(0x778, float:2.679E-42)
            java.lang.String r23 = "取消"
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = r1
            r25 = r3
            sh.s.o(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            double r7 = (double) r2
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L547
            goto L54a
        L547:
            q.a.a(r4)
        L54a:
            p.q0 r1 = new p.q0
            r10 = 1
            r1.<init>(r2, r10)
            r34 = r32
            sh.q1 r32 = sh.c.a(r34)
            r35 = 6
            r36 = 1912(0x778, float:2.679E-42)
            java.lang.String r25 = "确认删除"
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r27 = r1
            r26 = r9
            sh.s.o(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r34
            r1.p(r10)
            r1.p(r10)
            goto L579
        L576:
            r1.V()
        L579:
            return r14
        L57a:
            java.util.List r3 = (java.util.List) r3
            android.content.Context r5 = (android.content.Context) r5
            fg.l r8 = (fg.l) r8
            i0.a1 r9 = (i0.a1) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7 = r4 & 3
            if (r7 == r2) goto L596
            r2 = 1
        L593:
            r22 = 1
            goto L598
        L596:
            r2 = r15
            goto L593
        L598:
            r4 = r4 & 1
            boolean r2 = r1.S(r4, r2)
            if (r2 == 0) goto L71f
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L5ef
            r2 = -586914986(0xffffffffdd046356, float:-5.962227E17)
            r1.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r1.j(r2)
            bi.b r2 = (bi.b) r2
            long r26 = r2.h()
            long r28 = x6.d.D(r18)
            r2 = 16
            float r2 = (float) r2
            r3 = r19
            float r3 = (float) r3
            y0.o r25 = p.d.m(r6, r2, r3)
            r45 = 0
            r46 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r24 = "暂无插件"
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 24630(0x6036, float:3.4514E-41)
            r43 = r1
            sh.s.n(r24, r25, r26, r28, r30, r31, r32, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r1.p(r15)
            goto L722
        L5ef:
            r2 = -586560160(0xffffffffdd09cd60, float:-6.2060614E17)
            r1.a0(r2)
            java.util.Iterator r2 = r3.iterator()
            r4 = r15
        L5fa:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L71b
            java.lang.Object r6 = r2.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L717
            eb.c0 r6 = (eb.c0) r6
            java.lang.Object r10 = r9.getValue()
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r11 = r6.f2506a
            java.lang.Object r10 = r10.get(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L621
            boolean r10 = r10.booleanValue()
        L61e:
            r24 = r10
            goto L62a
        L621:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r10 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r11 = r6.f2506a
            boolean r10 = r10.isPluginEnabled(r5, r11)
            goto L61e
        L62a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.io.File r11 = r6.f2508c
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = "\n作者: "
            r10.append(r11)
            java.lang.String r11 = r6.f2510e
            boolean r12 = og.m.t0(r11)
            java.lang.String r16 = "未知"
            if (r12 == 0) goto L649
            r11 = r16
        L649:
            r10.append(r11)
            java.lang.String r11 = " | 更新于: "
            r10.append(r11)
            java.lang.String r11 = r6.f2512g
            boolean r12 = og.m.t0(r11)
            if (r12 == 0) goto L65b
            r11 = r16
        L65b:
            r10.append(r11)
            java.lang.String r26 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r6.f2513h
            if (r11 == 0) goto L66c
            goto L66e
        L66c:
            r11 = r16
        L66e:
            r10.append(r11)
            java.lang.String r11 = "("
            r10.append(r11)
            java.lang.String r11 = r6.f2511f
            boolean r12 = og.m.t0(r11)
            if (r12 == 0) goto L680
            r11 = r16
        L680:
            java.lang.String r12 = ")"
            java.lang.String r25 = eh.a.r(r10, r11, r12)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r10 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            boolean r27 = r10.canOpenSettings(r6)
            boolean r10 = r1.f(r8)
            boolean r11 = r1.h(r6)
            r10 = r10 | r11
            java.lang.Object r11 = r1.P()
            if (r10 != 0) goto L69d
            if (r11 != r13) goto L6a6
        L69d:
            wb.q9 r11 = new wb.q9
            r10 = 1
            r11.<init>(r8, r6, r10)
            r1.k0(r11)
        L6a6:
            r28 = r11
            fg.a r28 = (fg.a) r28
            boolean r10 = r1.h(r6)
            boolean r11 = r1.h(r5)
            r10 = r10 | r11
            java.lang.Object r11 = r1.P()
            if (r10 != 0) goto L6bb
            if (r11 != r13) goto L6c5
        L6bb:
            sh.v1 r11 = new sh.v1
            r10 = r18
            r11.<init>(r6, r10, r5)
            r1.k0(r11)
        L6c5:
            r29 = r11
            fg.a r29 = (fg.a) r29
            boolean r10 = r1.f(r9)
            boolean r11 = r1.h(r6)
            r10 = r10 | r11
            boolean r11 = r1.h(r5)
            r10 = r10 | r11
            java.lang.Object r11 = r1.P()
            if (r10 != 0) goto L6df
            if (r11 != r13) goto L6e9
        L6df:
            b0.s r11 = new b0.s
            r10 = 29
            r11.<init>(r10, r5, r6, r9)
            r1.k0(r11)
        L6e9:
            r30 = r11
            fg.l r30 = (fg.l) r30
            r32 = 0
            r31 = r1
            wb.ho.s3(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r6 = r3.size()
            r10 = 1
            int r6 = r6 - r10
            if (r4 == r6) goto L70a
            r4 = -214649195(0xfffffffff334b695, float:-1.4317576E31)
            r1.a0(r4)
            r4 = 0
            wb.ho.D1(r4, r1, r15, r10)
        L706:
            r1.p(r15)
            goto L712
        L70a:
            r4 = 0
            r6 = 1935823003(0x7362509b, float:1.7930511E31)
            r1.a0(r6)
            goto L706
        L712:
            r4 = r7
            r18 = 13
            goto L5fa
        L717:
            a.a.Q0()
            throw r17
        L71b:
            r1.p(r15)
            goto L722
        L71f:
            r1.V()
        L722:
            return r14
        L723:
            android.content.Context r3 = (android.content.Context) r3
            i0.a1 r5 = (i0.a1) r5
            i0.a1 r8 = (i0.a1) r8
            i0.a1 r9 = (i0.a1) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r2) goto L73c
            r15 = 1
        L73c:
            r22 = 1
            r2 = r4 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L77e
            java.lang.Object r2 = r5.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r4 = r1.P()
            if (r4 != r13) goto L760
            wb.l9 r4 = new wb.l9
            r10 = 13
            r4.<init>(r8, r10)
            r1.k0(r4)
        L760:
            fg.a r4 = (fg.a) r4
            boolean r6 = r1.h(r3)
            java.lang.Object r7 = r1.P()
            if (r6 != 0) goto L76e
            if (r7 != r13) goto L776
        L76e:
            wb.oc r7 = new wb.oc
            r7.<init>(r5, r3, r9)
            r1.k0(r7)
        L776:
            fg.l r7 = (fg.l) r7
            r3 = 3504(0xdb0, float:4.91E-42)
            wb.ho.D2(r2, r4, r7, r1, r3)
            goto L781
        L77e:
            r1.V()
        L781:
            return r14
        L782:
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            vb.a r8 = (vb.a) r8
            r18 = r9
            java.lang.String r18 = (java.lang.String) r18
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r2) goto L79f
            r15 = 1
        L79f:
            r22 = 1
            r2 = r4 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L7b8
            java.lang.String r17 = r8.b()
            r21 = 0
            r19 = 0
            r20 = r1
            r15 = r3
            wb.ho.O3(r15, r16, r17, r18, r19, r20, r21)
            goto L7bd
        L7b8:
            r20 = r1
            r20.V()
        L7bd:
            return r14
        L7be:
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1
            r2 = r5
            wb.n5 r2 = (wb.n5) r2
            r3 = r8
            fg.a r3 = (fg.a) r3
            r4 = r9
            fg.l r4 = (fg.l) r4
            r5 = r49
            i0.h0 r5 = (i0.h0) r5
            r6 = r50
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = i0.r.C(r16)
            wb.ho.V1(r1, r2, r3, r4, r5, r6)
            return r14
        L7dd:
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            java.util.List r5 = (java.util.List) r5
            fg.a r8 = (fg.a) r8
            r10 = r9
            fg.l r10 = (fg.l) r10
            r11 = r49
            i0.h0 r11 = (i0.h0) r11
            r1 = r50
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r12 = i0.r.C(r16)
            r9 = r8
            r8 = r5
            wb.ho.Y3(r7, r8, r9, r10, r11, r12)
            return r14
        L7fc:
            r16 = r3
            f9.h r16 = (f9.h) r16
            c9.q0 r5 = (c9.q0) r5
            fg.a r8 = (fg.a) r8
            c9.n0 r9 = (c9.n0) r9
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r3 = r50
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r3 & 3
            if (r4 == r2) goto L817
            r15 = 1
        L817:
            r22 = 1
            r2 = r3 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L869
            wb.y2 r15 = wb.y2.f20283h
            boolean r2 = r1.f(r5)
            boolean r3 = r1.f(r8)
            r2 = r2 | r3
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L834
            if (r3 != r13) goto L83e
        L834:
            b0.q r3 = new b0.q
            r2 = 16
            r3.<init>(r5, r2, r8)
            r1.k0(r3)
        L83e:
            r17 = r3
            fg.p r17 = (fg.p) r17
            boolean r2 = r1.f(r9)
            boolean r3 = r1.f(r8)
            r2 = r2 | r3
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L853
            if (r3 != r13) goto L85b
        L853:
            sh.v1 r3 = new sh.v1
            r3.<init>(r9, r12, r8)
            r1.k0(r3)
        L85b:
            r18 = r3
            fg.a r18 = (fg.a) r18
            r21 = 24576(0x6000, float:3.4438E-41)
            r20 = r1
            r19 = r8
            r15.q(r16, r17, r18, r19, r20, r21)
            goto L86e
        L869:
            r20 = r1
            r20.V()
        L86e:
            return r14
        L86f:
            c9.a1 r3 = (c9.a1) r3
            r18 = r5
            android.app.Activity r18 = (android.app.Activity) r18
            r19 = r8
            s0.d r19 = (s0.d) r19
            r20 = r9
            c9.r0 r20 = (c9.r0) r20
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r2) goto L88e
            r15 = 1
        L88e:
            r22 = 1
            r2 = r4 & 1
            boolean r2 = r1.S(r2, r15)
            if (r2 == 0) goto L8b4
            i0.u r2 = s3.b.f12341a
            i0.q1 r2 = r2.a(r3)
            b0.k r16 = new b0.k
            r17 = 8
            r21 = 0
            r16.<init>(r17, r18, r19, r20, r21)
            r3 = r16
            r4 = -1790801080(0xffffffff95428b48, float:-3.928786E-26)
            s0.d r3 = s0.i.e(r4, r3, r1)
            i0.r.a(r2, r3, r1, r10)
            goto L8b7
        L8b4:
            r1.V()
        L8b7:
            return r14
        L8b8:
            y0.o r3 = (y0.o) r3
            v.d r5 = (v.d) r5
            sh.f r9 = (sh.f) r9
            s0.d r8 = (s0.d) r8
            r1 = r49
            i0.h0 r1 = (i0.h0) r1
            r4 = r50
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r2) goto L8d4
            r6 = 1
        L8d1:
            r22 = 1
            goto L8d6
        L8d4:
            r6 = r15
            goto L8d1
        L8d6:
            r4 = r4 & 1
            boolean r4 = r1.S(r4, r6)
            if (r4 == 0) goto L958
            java.lang.Object r4 = r1.P()
            if (r4 != r13) goto L8ec
            r9.p r4 = new r9.p
            r4.<init>(r2)
            r1.k0(r4)
        L8ec:
            fg.l r4 = (fg.l) r4
            java.util.concurrent.atomic.AtomicInteger r2 = f2.o.f3208a
            f2.b r2 = new f2.b
            r2.<init>(r15, r4)
            y0.o r2 = r3.d(r2)
            y0.o r2 = c1.h.b(r2, r5)
            long r3 = r9.f12575a
            f1.m0 r5 = f1.c0.f3038b
            y0.o r2 = k.n.g(r2, r3, r5)
            y0.g r3 = y0.b.f21792g
            r10 = 1
            v1.n0 r3 = p.o.d(r3, r10)
            long r4 = r1.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r1.l()
            y0.o r2 = y0.a.c(r1, r2)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r1.d0()
            boolean r7 = r1.S
            if (r7 == 0) goto L92c
            r1.k(r6)
            goto L92f
        L92c:
            r1.n0()
        L92f:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r1, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r1, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.t(r1, r3, r4)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r1)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r8.invoke(r1, r2)
            r10 = 1
            r1.p(r10)
            goto L95b
        L958:
            r1.V()
        L95b:
            return r14
        L95c:
            f9.e r3 = (f9.e) r3
            f9.h r8 = (f9.h) r8
            f9.c r9 = (f9.c) r9
            android.app.Activity r5 = (android.app.Activity) r5
            r1 = r49
            java.lang.String r1 = (java.lang.String) r1
            r2 = r50
            java.lang.String r2 = (java.lang.String) r2
            r1.getClass()
            r2.getClass()
            r8.g r3 = r3.f3359a
            android.content.Context r3 = r3.f11620a
            long r6 = r8.f3376a
            java.lang.Object r4 = r9.f3355b
            i8.c r8 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r8 == 0) goto Lba3
            k8.s r8 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r8 == 0) goto Lba3
            h.Hchat.hooks.api.model.WeChatMessage r6 = r8.c(r6)
            if (r6 == 0) goto Lba3
            boolean r7 = be.h.C(r6)
            if (r7 != 0) goto L99b
            f9.g r1 = new f9.g
            r1.<init>()
            r19 = r5
            goto Lbaa
        L99b:
            java.lang.String r9 = r6.content
            java.lang.String r7 = "Hchat_edit_message_backup"
            android.content.SharedPreferences r8 = ub.b.c(r3, r7)
            long r10 = r6.msgId
            java.lang.String r10 = be.h.l(r10)
            boolean r11 = r8.contains(r10)
            if (r11 != 0) goto L9bc
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r11 = r6.content
            android.content.SharedPreferences$Editor r8 = r8.putString(r10, r11)
            r8.apply()
        L9bc:
            boolean r8 = r6.isTransfer()
            java.lang.String r10 = "title"
            if (r8 == 0) goto Lac9
            java.lang.String r8 = r6.bodyContent()
            java.lang.String r1 = be.h.h(r1)
            if (r1 == 0) goto Labb
            java.lang.Long r11 = be.h.i(r1)
            if (r11 == 0) goto Labb
            long r11 = r11.longValue()
            java.lang.String r13 = "￥"
            java.lang.String r1 = r13.concat(r1)
            java.lang.String r14 = "feederval"
            java.lang.String r15 = "fee"
            java.lang.String r0 = "total_fee"
            java.lang.String[] r0 = new java.lang.String[]{r0, r14, r15}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
            r15 = r8
            r14 = 0
        L9f2:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto La19
            java.lang.Object r18 = r0.next()
            r49 = r0
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r50 = r8
            java.lang.String r8 = java.lang.String.valueOf(r11)
            java.lang.String r0 = be.h.W(r15, r0, r8)
            boolean r8 = gg.l.a(r0, r15)
            if (r8 != 0) goto La14
            r15 = r0
            r14 = 1
        La14:
            r0 = r49
            r8 = r50
            goto L9f2
        La19:
            r50 = r8
            java.lang.String r0 = "feedesc"
            java.lang.String r0 = be.h.W(r15, r0, r1)
            boolean r8 = gg.l.a(r0, r15)
            if (r8 != 0) goto La29
            r15 = r0
            r14 = 1
        La29:
            java.lang.String r0 = "payerdes"
            java.lang.String r8 = "receiverdes"
            java.lang.String r11 = "desc"
            java.lang.String[] r0 = new java.lang.String[]{r10, r11, r0, r8}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        La3b:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Lab0
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r11 = be.h.p0(r15, r8)
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto Laa5
            java.lang.CharSequence r12 = og.m.R0(r11)
            java.lang.String r12 = r12.toString()
            r49 = r0
            java.lang.String r0 = ","
            r18 = r14
            java.lang.String r14 = ""
            r19 = r5
            r5 = 0
            java.lang.String r0 = og.t.a0(r12, r0, r14, r5)
            boolean r12 = og.m.h0(r11, r13, r5)
            if (r12 != 0) goto La91
            java.lang.String r12 = "¥"
            boolean r12 = og.m.h0(r11, r12, r5)
            if (r12 != 0) goto La91
            java.lang.String r12 = "元"
            boolean r11 = og.m.h0(r11, r12, r5)
            if (r11 != 0) goto La91
            java.lang.String r5 = "[0-9]+(?:\\.[0-9]{1,2})?"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r5.getClass()
            java.util.regex.Matcher r0 = r5.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Laab
        La91:
            java.lang.String r0 = be.h.W(r15, r8, r1)
            boolean r5 = gg.l.a(r0, r15)
            if (r5 != 0) goto La9e
            r15 = r0
            r14 = 1
            goto Laa0
        La9e:
            r14 = r18
        Laa0:
            r0 = r49
        Laa2:
            r5 = r19
            goto La3b
        Laa5:
            r49 = r0
            r19 = r5
            r18 = r14
        Laab:
            r0 = r49
            r14 = r18
            goto Laa2
        Lab0:
            r19 = r5
            r18 = r14
            if (r18 == 0) goto Lab8
            r1 = r15
            goto Labf
        Lab8:
            r1 = r50
            goto Labf
        Labb:
            r19 = r5
            r1 = r17
        Labf:
            if (r1 == 0) goto Lac2
            goto Lad9
        Lac2:
            f9.g r1 = new f9.g
            r1.<init>()
            goto Lbaa
        Lac9:
            r19 = r5
            boolean r0 = r6.isQuote()
            if (r0 == 0) goto Lad9
            java.lang.String r0 = r6.bodyContent()
            java.lang.String r1 = be.h.g0(r0, r1, r2)
        Lad9:
            java.lang.String r0 = be.h.j0(r6, r1)
            f9.f r1 = be.h.f0(r6, r0, r4)
            boolean r4 = r1.f3366a
            if (r4 == 0) goto Lb7c
            boolean r5 = r6.isQuote()
            if (r5 == 0) goto Lb7c
            boolean r5 = og.m.t0(r2)
            if (r5 != 0) goto Lb7c
            java.lang.String r5 = r6.bodyContent()
            java.lang.String r8 = be.h.o0(r5)
            java.lang.String r11 = "svrid"
            java.lang.String r8 = be.h.p0(r8, r11)
            java.lang.String r5 = be.h.p0(r5, r11)
            java.lang.String[] r5 = new java.lang.String[]{r8, r5}
            java.lang.String r5 = be.h.x(r5)
            java.lang.Long r5 = og.t.g0(r5)
            r11 = 0
            if (r5 == 0) goto Lb18
            long r13 = r5.longValue()
            goto Lb19
        Lb18:
            r13 = r11
        Lb19:
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 > 0) goto Lb1e
            goto Lb7c
        Lb1e:
            i8.c r5 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r5 == 0) goto Lb7c
            k8.s r5 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r5 == 0) goto Lb7c
            java.lang.String r8 = r6.talker
            h.Hchat.hooks.api.model.WeChatMessage r8 = r5.e(r13, r8)
            if (r8 == 0) goto Lb33
            goto Lb39
        Lb33:
            h.Hchat.hooks.api.model.WeChatMessage r8 = r5.d(r13)
            if (r8 == 0) goto Lb7c
        Lb39:
            boolean r5 = be.h.C(r8)
            if (r5 != 0) goto Lb40
            goto Lb7c
        Lb40:
            android.content.SharedPreferences r3 = ub.b.c(r3, r7)
            long r11 = r8.msgId
            java.lang.String r5 = be.h.l(r11)
            boolean r7 = r3.contains(r5)
            if (r7 != 0) goto Lb5d
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r7 = r8.content
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r7)
            r3.apply()
        Lb5d:
            boolean r3 = r8.isQuote()
            if (r3 == 0) goto Lb73
            java.lang.String r3 = r8.bodyContent()
            java.lang.String r5 = r8.bodyContent()
            java.lang.String r5 = be.h.p0(r5, r10)
            java.lang.String r2 = be.h.g0(r3, r5, r2)
        Lb73:
            java.lang.String r2 = be.h.j0(r8, r2)
            r3 = r17
            be.h.f0(r8, r2, r3)
        Lb7c:
            if (r4 == 0) goto Lb81
            be.h.a0(r6, r0)
        Lb81:
            f9.g r2 = new f9.g
            boolean r13 = r1.f3366a
            if (r13 == 0) goto Lb8d
            boolean r1 = r1.f3367b
            if (r1 != 0) goto Lb8d
            r14 = 1
            goto Lb8e
        Lb8d:
            r14 = 0
        Lb8e:
            long r7 = r6.msgId
            boolean r15 = r6.isTransfer()
            java.lang.String r11 = be.h.s(r6, r9)
            java.lang.String r12 = be.h.s(r6, r0)
            r10 = r0
            r6 = r2
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15)
            r1 = r6
            goto Lbaa
        Lba3:
            r19 = r5
            f9.g r1 = new f9.g
            r1.<init>()
        Lbaa:
            boolean r0 = r1.f3368a
            if (r0 != 0) goto Lbb3
            java.lang.String r1 = "修改失败"
        Lbb0:
            r5 = r19
            goto Lbbd
        Lbb3:
            boolean r1 = r1.f3369b
            if (r1 == 0) goto Lbba
            java.lang.String r1 = "已修改，退出重进聊天后生效"
            goto Lbb0
        Lbba:
            java.lang.String r1 = "已修改"
            goto Lbb0
        Lbbd:
            f9.e.d(r5, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lbc5:
            y0.o r3 = (y0.o) r3
            i0.a1 r5 = (i0.a1) r5
            s0.d r8 = (s0.d) r8
            d0.c r9 = (d0.c) r9
            r0 = r49
            i0.h0 r0 = (i0.h0) r0
            r1 = r50
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r2) goto Lbe1
            r2 = 1
        Lbde:
            r22 = 1
            goto Lbe3
        Lbe1:
            r2 = 0
            goto Lbde
        Lbe3:
            r1 = r1 & 1
            boolean r1 = r0.S(r1, r2)
            if (r1 == 0) goto Lc6a
            java.lang.Object r1 = r0.P()
            if (r1 != r13) goto Lbfa
            b0.l r1 = new b0.l
            r2 = 7
            r1.<init>(r5, r2)
            r0.k0(r1)
        Lbfa:
            fg.l r1 = (fg.l) r1
            y0.o r1 = v1.w.m(r3, r1)
            y0.g r2 = y0.b.f21792g
            r10 = 1
            v1.n0 r2 = p.o.d(r2, r10)
            long r3 = r0.T
            int r3 = java.lang.Long.hashCode(r3)
            s0.h r4 = r0.l()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r0.d0()
            boolean r7 = r0.S
            if (r7 == 0) goto Lc27
            r0.k(r6)
            goto Lc2a
        Lc27:
            r0.n0()
        Lc2a:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r0, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r0, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r0, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r0)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r0, r1)
            r16 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r8.invoke(r0, r1)
            java.lang.Object r1 = r0.P()
            if (r1 != r13) goto Lc60
            b0.j r1 = new b0.j
            r4 = 10
            r1.<init>(r5, r4)
            r0.k0(r1)
        Lc60:
            fg.a r1 = (fg.a) r1
            r9.b(r1, r0, r12)
            r10 = 1
            r0.p(r10)
            goto Lc6d
        Lc6a:
            r0.V()
        Lc6d:
            return r14
        Lc6e:
            r16 = r15
            c9.a1 r3 = (c9.a1) r3
            r25 = r5
            android.app.Activity r25 = (android.app.Activity) r25
            r26 = r8
            s0.d r26 = (s0.d) r26
            r27 = r9
            c9.p0 r27 = (c9.p0) r27
            r0 = r49
            i0.h0 r0 = (i0.h0) r0
            r1 = r50
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r2) goto Lc92
            r15 = 1
        Lc8f:
            r22 = 1
            goto Lc95
        Lc92:
            r15 = r16
            goto Lc8f
        Lc95:
            r1 = r1 & 1
            boolean r1 = r0.S(r1, r15)
            if (r1 == 0) goto Lcb9
            i0.u r1 = s3.b.f12341a
            i0.q1 r1 = r1.a(r3)
            b0.k r23 = new b0.k
            r24 = 1
            r28 = 0
            r23.<init>(r24, r25, r26, r27, r28)
            r2 = r23
            r3 = -202705722(0xfffffffff3eaf4c6, float:-3.7230287E31)
            s0.d r2 = s0.i.e(r3, r2, r0)
            i0.r.a(r1, r2, r0, r10)
            goto Lcbc
        Lcb9:
            r0.V()
        Lcbc:
            return r14
    }
}
