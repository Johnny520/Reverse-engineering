package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19687i;

    public /* synthetic */ ve(i0.a1 r1, java.util.List r2, int r3) {
            r0 = this;
            r0.f19685g = r3
            r0.f19686h = r1
            r0.f19687i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ve(java.util.List r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f19685g = r3
            r0.f19687i = r1
            r0.f19686h = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f19685g
            switch(r0) {
                case 0: goto L4b5;
                case 1: goto L3fe;
                case 2: goto L339;
                case 3: goto L27d;
                case 4: goto L194;
                default: goto L5;
            }
        L5:
            r5 = r14
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 0
            r10 = 1
            r11 = 2
            if (r15 == r11) goto L17
            r15 = r10
            goto L18
        L17:
            r15 = r0
        L18:
            r14 = r14 & r10
            boolean r14 = r5.S(r14, r15)
            if (r14 == 0) goto L18e
            i0.a1 r14 = r13.f19686h
            java.lang.Object r15 = r14.getValue()
            ua.i r15 = (ua.i) r15
            java.lang.String r4 = r15.f13630h
            boolean r15 = r5.f(r14)
            java.lang.Object r1 = r5.P()
            i0.e r12 = i0.l.f5952a
            if (r15 != 0) goto L37
            if (r1 != r12) goto L40
        L37:
            wb.gi r1 = new wb.gi
            r15 = 1
            r1.<init>(r14, r15)
            r5.k0(r1)
        L40:
            fg.l r1 = (fg.l) r1
            r8 = 54
            r9 = 32
            r7 = r5
            r5 = r1
            java.lang.String r1 = "收款位置"
            java.lang.String r2 = "选择转账到账账户"
            java.util.List r3 = r13.f19687i
            r6 = 0
            wb.ho.I2(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r7
            r15 = 0
            wb.ho.D1(r15, r5, r0, r10)
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            boolean r1 = r1.f13643u
            boolean r2 = r5.f(r14)
            java.lang.Object r3 = r5.P()
            if (r2 != 0) goto L6b
            if (r3 != r12) goto L74
        L6b:
            wb.gi r3 = new wb.gi
            r2 = 2
            r3.<init>(r14, r2)
            r5.k0(r3)
        L74:
            fg.l r3 = (fg.l) r3
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "拒收时退回"
            r6 = r5
            r5 = r3
            java.lang.String r3 = "规则不通过时原路退回"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            r5 = r6
            wb.ho.D1(r15, r5, r0, r10)
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            int r1 = r1.f13626d
            if (r1 == r10) goto L9b
            if (r1 == r11) goto L98
            java.lang.String r1 = "无延迟"
        L96:
            r2 = r1
            goto L9e
        L98:
            java.lang.String r1 = "自定义延迟"
            goto L96
        L9b:
            java.lang.String r1 = "随机延迟"
            goto L96
        L9e:
            java.util.ArrayList r3 = wb.ho.F6()
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            int r4 = r1.f13626d
            boolean r1 = r5.f(r14)
            java.lang.Object r6 = r5.P()
            if (r1 != 0) goto Lb6
            if (r6 != r12) goto Lbf
        Lb6:
            wb.gi r6 = new wb.gi
            r1 = 3
            r6.<init>(r14, r1)
            r5.k0(r6)
        Lbf:
            fg.l r6 = (fg.l) r6
            r7 = r5
            r5 = r6
            r6 = 0
            r8 = 6
            java.lang.String r1 = "收款延迟"
            wb.ho.J2(r1, r2, r3, r4, r5, r6, r7, r8)
            r5 = r7
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            int r1 = r1.f13626d
            if (r1 != r11) goto L110
            r1 = 1690583379(0x64c44153, float:2.8962152E22)
            r5.a0(r1)
            wb.ho.D1(r15, r5, r0, r10)
            java.lang.Object r15 = r14.getValue()
            ua.i r15 = (ua.i) r15
            long r1 = r15.f13627e
            java.lang.String r3 = java.lang.String.valueOf(r1)
            boolean r15 = r5.f(r14)
            java.lang.Object r1 = r5.P()
            if (r15 != 0) goto Lf6
            if (r1 != r12) goto Lff
        Lf6:
            wb.gi r1 = new wb.gi
            r15 = 4
            r1.<init>(r14, r15)
            r5.k0(r1)
        Lff:
            r4 = r1
            fg.l r4 = (fg.l) r4
            r6 = 54
            java.lang.String r1 = "自定义延迟"
            java.lang.String r2 = "单位 ms"
            wb.ho.w2(r1, r2, r3, r4, r5, r6)
            r5.p(r0)
            goto L191
        L110:
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            int r1 = r1.f13626d
            if (r1 != r10) goto L184
            r1 = 1690853203(0x64c85f53, float:2.9569741E22)
            r5.a0(r1)
            wb.ho.D1(r15, r5, r0, r10)
            java.lang.Object r1 = r14.getValue()
            ua.i r1 = (ua.i) r1
            long r1 = r1.f13628f
            java.lang.String r3 = java.lang.String.valueOf(r1)
            boolean r1 = r5.f(r14)
            java.lang.Object r2 = r5.P()
            if (r1 != 0) goto L13b
            if (r2 != r12) goto L144
        L13b:
            wb.gi r2 = new wb.gi
            r1 = 5
            r2.<init>(r14, r1)
            r5.k0(r2)
        L144:
            r4 = r2
            fg.l r4 = (fg.l) r4
            r6 = 54
            java.lang.String r1 = "最小延迟"
            java.lang.String r2 = "单位 ms"
            wb.ho.w2(r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r15, r5, r0, r10)
            java.lang.Object r15 = r14.getValue()
            ua.i r15 = (ua.i) r15
            long r1 = r15.f13629g
            java.lang.String r3 = java.lang.String.valueOf(r1)
            boolean r15 = r5.f(r14)
            java.lang.Object r1 = r5.P()
            if (r15 != 0) goto L16b
            if (r1 != r12) goto L174
        L16b:
            wb.gi r1 = new wb.gi
            r15 = 6
            r1.<init>(r14, r15)
            r5.k0(r1)
        L174:
            r4 = r1
            fg.l r4 = (fg.l) r4
            r6 = 54
            java.lang.String r1 = "最大延迟"
            java.lang.String r2 = "单位 ms"
            wb.ho.w2(r1, r2, r3, r4, r5, r6)
            r5.p(r0)
            goto L191
        L184:
            r14 = 1691263550(0x64cea23e, float:3.049376E22)
            r5.a0(r14)
            r5.p(r0)
            goto L191
        L18e:
            r5.V()
        L191:
            sf.n r14 = sf.n.f12433a
            return r14
        L194:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1a5
            r0 = r2
            goto L1a6
        L1a5:
            r0 = r3
        L1a6:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L277
            wb.bp r15 = new wb.bp
            r0 = -1
            java.lang.String r1 = "启用后按默认规则或旧版全局设置抢红包"
            java.lang.String r4 = "跟随默认规则"
            r15.<init>(r4, r0, r1)
            i0.a1 r0 = r13.f19686h
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            boolean r4 = r14.f(r0)
            java.lang.Object r5 = r14.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto L1d1
            if (r5 != r6) goto L1db
        L1d1:
            wb.bf r5 = new wb.bf
            r4 = 19
            r5.<init>(r0, r4)
            r14.k0(r5)
        L1db:
            fg.a r5 = (fg.a) r5
            wb.ho.x2(r15, r1, r5, r14, r3)
            java.util.List r15 = r13.f19687i
            boolean r1 = r15.isEmpty()
            r4 = 0
            if (r1 != 0) goto L1f6
            r1 = -1611335373(0xffffffff9ff4f933, float:-1.03750285E-19)
            r14.a0(r1)
            wb.ho.D1(r4, r14, r3, r2)
        L1f2:
            r14.p(r3)
            goto L1fd
        L1f6:
            r1 = 1588224445(0x5eaa61bd, float:6.138651E18)
            r14.a0(r1)
            goto L1f2
        L1fd:
            java.util.Iterator r1 = r15.iterator()
            r5 = r3
        L202:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L27a
            java.lang.Object r7 = r1.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L272
            na.j r7 = (na.j) r7
            java.lang.String r9 = r7.f9151b
            boolean r10 = og.m.t0(r9)
            if (r10 == 0) goto L220
            java.lang.String r9 = "模板 "
            java.lang.String r9 = eh.a.l(r8, r9)
        L220:
            java.lang.String r10 = wb.ho.u5(r7)
            wb.bp r11 = new wb.bp
            r11.<init>(r9, r5, r10)
            java.lang.Object r9 = r0.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r7.f9150a
            boolean r9 = gg.l.a(r9, r10)
            boolean r10 = r14.f(r0)
            boolean r12 = r14.h(r7)
            r10 = r10 | r12
            java.lang.Object r12 = r14.P()
            if (r10 != 0) goto L246
            if (r12 != r6) goto L250
        L246:
            sh.v1 r12 = new sh.v1
            r10 = 17
            r12.<init>(r7, r10, r0)
            r14.k0(r12)
        L250:
            fg.a r12 = (fg.a) r12
            wb.ho.x2(r11, r9, r12, r14, r3)
            int r7 = r15.size()
            int r7 = r7 - r2
            if (r5 >= r7) goto L269
            r5 = -1600825573(0xffffffffa095571b, float:-2.5299223E-19)
            r14.a0(r5)
            wb.ho.D1(r4, r14, r3, r2)
        L265:
            r14.p(r3)
            goto L270
        L269:
            r5 = 1914028245(0x7215c0d5, float:2.9661687E30)
            r14.a0(r5)
            goto L265
        L270:
            r5 = r8
            goto L202
        L272:
            a.a.Q0()
            r14 = 0
            throw r14
        L277:
            r14.V()
        L27a:
            sf.n r14 = sf.n.f12433a
            return r14
        L27d:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L28e
            r0 = r2
            goto L28f
        L28e:
            r0 = r3
        L28f:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L333
            java.util.List r15 = r13.f19687i
            java.util.Iterator r0 = r15.iterator()
            r1 = r3
        L29d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L336
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            r6 = 0
            if (r1 < 0) goto L32f
            n9.a r4 = (n9.a) r4
            java.util.Set r7 = r4.f9071c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            i0.a1 r9 = r13.f19686h
            if (r8 == 0) goto L2c3
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L2c3
            r8 = r3
            goto L2e9
        L2c3:
            java.util.Iterator r7 = r7.iterator()
            r8 = r3
        L2c8:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L2e9
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r9.getValue()
            java.util.Set r11 = (java.util.Set) r11
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L2c8
            int r8 = r8 + 1
            if (r8 < 0) goto L2e5
            goto L2c8
        L2e5:
            a.a.P0()
            throw r6
        L2e9:
            boolean r6 = r14.f(r9)
            boolean r7 = r14.d(r8)
            r6 = r6 | r7
            boolean r7 = r14.h(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r14.P()
            if (r6 != 0) goto L301
            i0.e r6 = i0.l.f5952a
            if (r7 != r6) goto L309
        L301:
            hb.e0 r7 = new hb.e0
            r7.<init>(r8, r4, r9)
            r14.k0(r7)
        L309:
            fg.a r7 = (fg.a) r7
            r6 = 8
            wb.ho.f1(r4, r8, r7, r14, r6)
            int r4 = r15.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L325
            r1 = -144951775(0xfffffffff75c3621, float:-4.4664186E33)
            r14.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r14, r3, r2)
        L321:
            r14.p(r3)
            goto L32c
        L325:
            r1 = -198524273(0xfffffffff42ac28f, float:-5.4116E31)
            r14.a0(r1)
            goto L321
        L32c:
            r1 = r5
            goto L29d
        L32f:
            a.a.Q0()
            throw r6
        L333:
            r14.V()
        L336:
            sf.n r14 = sf.n.f12433a
            return r14
        L339:
            r5 = r14
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 2
            r8 = 1
            r9 = 0
            if (r15 == r0) goto L34b
            r15 = r8
            goto L34c
        L34b:
            r15 = r9
        L34c:
            r14 = r14 & r8
            boolean r14 = r5.S(r14, r15)
            if (r14 == 0) goto L3f8
            java.util.List r14 = r13.f19687i
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L36c
            r14 = -1817022569(0xffffffff93b26f97, float:-4.5043553E-27)
            r5.a0(r14)
            java.lang.String r14 = "暂无模板。先新增模板，再回来批量添加名单。"
            r15 = 6
            wb.ho.s0(r14, r5, r15)
            r5.p(r9)
            goto L3fb
        L36c:
            r15 = -1816910380(0xffffffff93b425d4, float:-4.547569E-27)
            r5.a0(r15)
            java.util.Iterator r15 = r14.iterator()
            r10 = r9
        L377:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L3f4
            java.lang.Object r0 = r15.next()
            int r11 = r10 + 1
            if (r10 < 0) goto L3ef
            aa.h r0 = (aa.h) r0
            i0.a1 r1 = r13.f19686h
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r3 = r0.f132a
            boolean r2 = r2.contains(r3)
            java.lang.String r3 = r0.f133b
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L3a3
            java.lang.String r3 = "模板 "
            java.lang.String r3 = eh.a.l(r11, r3)
        L3a3:
            r4 = r0
            r0 = r2
            java.lang.String r2 = wb.ho.r5(r4)
            boolean r6 = r5.f(r1)
            boolean r7 = r5.h(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r5.P()
            if (r6 != 0) goto L3bc
            i0.e r6 = i0.l.f5952a
            if (r7 != r6) goto L3c6
        L3bc:
            wb.l7 r7 = new wb.l7
            r6 = 11
            r7.<init>(r4, r6, r1)
            r5.k0(r7)
        L3c6:
            r4 = r7
            fg.l r4 = (fg.l) r4
            r6 = 0
            r7 = 8
            r1 = r3
            r3 = 0
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            int r0 = r14.size()
            int r0 = r0 - r8
            if (r10 >= r0) goto L3e6
            r0 = -1688119444(0xffffffff9b61576c, float:-1.8639811E-22)
            r5.a0(r0)
            r0 = 0
            wb.ho.D1(r0, r5, r9, r8)
        L3e2:
            r5.p(r9)
            goto L3ed
        L3e6:
            r0 = -792081756(0xffffffffd0c9caa4, float:-2.7084005E10)
            r5.a0(r0)
            goto L3e2
        L3ed:
            r10 = r11
            goto L377
        L3ef:
            a.a.Q0()
            r14 = 0
            throw r14
        L3f4:
            r5.p(r9)
            goto L3fb
        L3f8:
            r5.V()
        L3fb:
            sf.n r14 = sf.n.f12433a
            return r14
        L3fe:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = r15 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L40f
            r0 = r3
            goto L410
        L40f:
            r0 = r2
        L410:
            r15 = r15 & r3
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L4af
            wb.bp r15 = new wb.bp
            r0 = -1
            java.lang.String r1 = "使用默认模板或全局设置"
            java.lang.String r4 = "跟随默认规则"
            r15.<init>(r4, r0, r1)
            i0.a1 r0 = r13.f19686h
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            boolean r4 = r14.f(r0)
            java.lang.Object r5 = r14.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto L43b
            if (r5 != r6) goto L445
        L43b:
            wb.bf r5 = new wb.bf
            r4 = 22
            r5.<init>(r0, r4)
            r14.k0(r5)
        L445:
            fg.a r5 = (fg.a) r5
            wb.ho.x2(r15, r1, r5, r14, r2)
            java.util.List r15 = r13.f19687i
            java.util.Iterator r15 = r15.iterator()
            r1 = r2
        L451:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L4b2
            java.lang.Object r4 = r15.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L4aa
            ua.i r4 = (ua.i) r4
            r7 = 0
            wb.ho.D1(r7, r14, r2, r3)
            java.lang.String r7 = r4.f13624b
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L473
            java.lang.String r7 = "模板 "
            java.lang.String r7 = eh.a.l(r5, r7)
        L473:
            java.lang.String r8 = wb.ho.w5(r4)
            wb.bp r9 = new wb.bp
            r9.<init>(r7, r1, r8)
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r7 = r4.f13623a
            boolean r1 = gg.l.a(r1, r7)
            boolean r7 = r14.f(r0)
            boolean r8 = r14.h(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r14.P()
            if (r7 != 0) goto L499
            if (r8 != r6) goto L4a3
        L499:
            sh.v1 r8 = new sh.v1
            r7 = 22
            r8.<init>(r4, r7, r0)
            r14.k0(r8)
        L4a3:
            fg.a r8 = (fg.a) r8
            wb.ho.x2(r9, r1, r8, r14, r2)
            r1 = r5
            goto L451
        L4aa:
            a.a.Q0()
            r14 = 0
            throw r14
        L4af:
            r14.V()
        L4b2:
            sf.n r14 = sf.n.f12433a
            return r14
        L4b5:
            r5 = r14
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 2
            r8 = 1
            r9 = 0
            if (r15 == r0) goto L4c7
            r15 = r8
            goto L4c8
        L4c7:
            r15 = r9
        L4c8:
            r14 = r14 & r8
            boolean r14 = r5.S(r14, r15)
            if (r14 == 0) goto L543
            java.util.List r14 = r13.f19687i
            java.util.Iterator r14 = r14.iterator()
            r15 = r9
        L4d6:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L546
            java.lang.Object r0 = r14.next()
            int r10 = r15 + 1
            if (r15 < 0) goto L53e
            sf.j r0 = (sf.j) r0
            if (r15 <= 0) goto L4f6
            r15 = 610054091(0x245cafcb, float:4.7853798E-17)
            r5.a0(r15)
            r15 = 0
            wb.ho.D1(r15, r5, r9, r8)
        L4f2:
            r5.p(r9)
            goto L4fd
        L4f6:
            r15 = 1731821093(0x67397e25, float:8.7596476E23)
            r5.a0(r15)
            goto L4f2
        L4fd:
            i0.a1 r15 = r13.f19686h
            java.lang.Object r1 = r15.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.f12428g
            boolean r1 = r1.contains(r2)
            java.lang.Object r2 = r0.f12429h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f12430i
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r5.f(r15)
            boolean r6 = r5.f(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r5.P()
            if (r4 != 0) goto L526
            i0.e r4 = i0.l.f5952a
            if (r6 != r4) goto L52f
        L526:
            wb.l7 r6 = new wb.l7
            r4 = 7
            r6.<init>(r0, r4, r15)
            r5.k0(r6)
        L52f:
            r4 = r6
            fg.l r4 = (fg.l) r4
            r6 = 0
            r7 = 8
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = 0
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            r15 = r10
            goto L4d6
        L53e:
            a.a.Q0()
            r14 = 0
            throw r14
        L543:
            r5.V()
        L546:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
