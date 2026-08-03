package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17841j;

    public /* synthetic */ n8(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17838g = r4
            r0.f17839h = r1
            r0.f17840i = r2
            r0.f17841j = r3
            r0.<init>()
            return
    }

    private final java.lang.Object e(java.lang.Object r30, java.lang.Object r31) {
            r29 = this;
            r0 = r29
            r10 = r30
            i0.h0 r10 = (i0.h0) r10
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L17
            r2 = r5
            goto L18
        L17:
            r2 = r4
        L18:
            r1 = r1 & r5
            boolean r1 = r10.S(r1, r2)
            if (r1 == 0) goto L139
            p.e r1 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            p.t r1 = p.s.a(r1, r2, r10, r4)
            long r2 = r10.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r10.l()
            y0.l r4 = y0.l.f21818a
            y0.o r6 = y0.a.c(r10, r4)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r10.d0()
            boolean r8 = r10.S
            if (r8 == 0) goto L49
            r10.k(r7)
            goto L4c
        L49:
            r10.n0()
        L4c:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r10, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r10, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r10, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r10)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r10, r6)
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r1 = r10.j(r1)
            bi.b r1 = (bi.b) r1
            long r1 = r1.g()
            r3 = 14
            long r6 = x6.d.D(r3)
            r22 = 0
            r23 = 262122(0x3ffea, float:3.67311E-40)
            r27 = r1
            r2 = r4
            r3 = r27
            java.lang.String r1 = "检测依据来自微信支付接口返回文案。支付风控或服务端文案变化可能产生检测失败，请先小范围验证结果。"
            r8 = r2
            r2 = 0
            r9 = r5
            r5 = r6
            r7 = 0
            r11 = r8
            r8 = 0
            r12 = r9
            r20 = r10
            r9 = 0
            r13 = r11
            r11 = 0
            r14 = r12
            r15 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r21 = r18
            r18 = 0
            r24 = r19
            r19 = 0
            r25 = r21
            r21 = 24582(0x6006, float:3.4447E-41)
            r26 = r24
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = r20
            android.content.SharedPreferences r1 = r0.f17839h
            boolean r2 = r10.h(r1)
            java.lang.Object r3 = r10.P()
            i0.a1 r13 = r0.f17841j
            i0.e r14 = i0.l.f5952a
            if (r2 != 0) goto Lcc
            if (r3 != r14) goto Ld7
        Lcc:
            wb.k9 r3 = new wb.k9
            r2 = 0
            i0.a1 r4 = r0.f17840i
            r3.<init>(r1, r4, r13, r2)
            r10.k0(r3)
        Ld7:
            r2 = r3
            fg.a r2 = (fg.a) r2
            r15 = 1065353216(0x3f800000, float:1.0)
            r1 = r26
            y0.o r3 = p.h1.d(r1, r15)
            r4 = 12
            float r5 = (float) r4
            r7 = 0
            r8 = 13
            r4 = 0
            r6 = 0
            y0.o r3 = p.d.p(r3, r4, r5, r6, r7, r8)
            sh.q1 r8 = sh.c.a(r10)
            r11 = 390(0x186, float:5.47E-43)
            r12 = 1912(0x778, float:2.679E-42)
            r17 = r1
            java.lang.String r1 = "确认启用"
            r4 = 0
            r5 = 0
            r9 = 0
            r0 = r17
            sh.s.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r10.P()
            if (r1 != r14) goto L111
            wb.l9 r1 = new wb.l9
            r2 = 0
            r1.<init>(r13, r2)
            r10.k0(r1)
        L111:
            r2 = r1
            fg.a r2 = (fg.a) r2
            y0.o r3 = p.h1.d(r0, r15)
            r0 = 8
            float r5 = (float) r0
            r7 = 0
            r8 = 13
            r4 = 0
            r6 = 0
            y0.o r3 = p.d.p(r3, r4, r5, r6, r7, r8)
            sh.q1 r8 = sh.c.a(r10)
            r11 = 438(0x1b6, float:6.14E-43)
            r12 = 1912(0x778, float:2.679E-42)
            java.lang.String r1 = "取消"
            r4 = 0
            r5 = 0
            r9 = 0
            sh.s.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = 1
            r10.p(r14)
            goto L13c
        L139:
            r10.V()
        L13c:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
            r40 = this;
            r0 = r40
            int r1 = r0.f17838g
            switch(r1) {
                case 0: goto Lc15;
                case 1: goto Lb89;
                case 2: goto Lae0;
                case 3: goto La35;
                case 4: goto L983;
                case 5: goto L796;
                case 6: goto L6b2;
                case 7: goto L62f;
                case 8: goto L577;
                case 9: goto L3e2;
                case 10: goto L250;
                case 11: goto L1a0;
                case 12: goto L19b;
                default: goto L7;
            }
        L7:
            r7 = r41
            i0.h0 r7 = (i0.h0) r7
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L1c
            r2 = r10
            goto L1d
        L1c:
            r2 = r11
        L1d:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L195
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r7.h(r12)
            java.lang.Object r4 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto L40
            if (r4 != r13) goto L4a
        L40:
            wb.jo r4 = new wb.jo
            r3 = 9
            r4.<init>(r12, r1, r3)
            r7.k0(r4)
        L4a:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "记录运行日志"
            java.lang.String r4 = "只保留最近 200 条"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L18a
            r1 = -1537986704(0xffffffffa4542f70, float:-4.6010353E-17)
            r7.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r7, r11, r10)
            i0.a1 r2 = r0.f17841j
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L80
            java.lang.String r3 = "暂无记录"
            goto La8
        L80:
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            og.d r4 = new og.d
            r4.<init>(r3)
            r3 = r11
        L8f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La2
            r4.next()
            int r3 = r3 + 1
            if (r3 < 0) goto L9d
            goto L8f
        L9d:
            a.a.P0()
            r1 = 0
            throw r1
        La2:
            java.lang.String r4 = " 条记录"
            java.lang.String r3 = p.a.i(r3, r4)
        La8:
            boolean r4 = r7.h(r12)
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto Lb4
            if (r5 != r13) goto Lbd
        Lb4:
            wb.od r5 = new wb.od
            r4 = 7
            r5.<init>(r12, r2, r4)
            r7.k0(r5)
        Lbd:
            fg.a r5 = (fg.a) r5
            java.lang.String r4 = "刷新日志"
            r6 = 6
            wb.ho.b(r4, r3, r5, r7, r6)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L17c
            r3 = -1537654043(0xffffffffa45942e5, float:-4.7111036E-17)
            r7.a0(r3)
            wb.ho.D1(r1, r7, r11, r10)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 5000(0x1388, float:7.006E-42)
            java.lang.String r3 = og.m.P0(r4, r3)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r7.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            r6 = 12
            long r8 = x6.d.D(r6)
            y0.l r6 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r6 = p.h1.d(r6, r14)
            r14 = 16
            float r14 = (float) r14
            y0.o r6 = p.d.l(r6, r14)
            r23 = 0
            r24 = 261992(0x3ff68, float:3.67129E-40)
            r21 = r7
            r38 = r8
            r9 = r2
            r2 = r3
            r3 = r6
            r6 = r38
            r8 = 0
            r14 = r9
            m2.m r9 = m2.p.f8705b
            r15 = r10
            r16 = r11
            r10 = 0
            r17 = r12
            r12 = 0
            r19 = r13
            r18 = r14
            r13 = 0
            r20 = r15
            r15 = 0
            r22 = r16
            r16 = 0
            r25 = r17
            r17 = 0
            r26 = r18
            r18 = 0
            r27 = r19
            r19 = 0
            r28 = r20
            r20 = 0
            r29 = r22
            r22 = 24624(0x6030, float:3.4506E-41)
            r30 = r26
            r31 = r27
            r0 = r28
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r21
            r2 = 0
            wb.ho.D1(r1, r7, r2, r0)
            r0 = r25
            boolean r1 = r7.h(r0)
            java.lang.Object r3 = r7.P()
            if (r1 != 0) goto L161
            r1 = r31
            if (r3 != r1) goto L16d
        L161:
            wb.od r3 = new wb.od
            r1 = 8
            r14 = r30
            r3.<init>(r0, r14, r1)
            r7.k0(r3)
        L16d:
            fg.a r3 = (fg.a) r3
            r0 = 54
            java.lang.String r1 = "清空日志"
            java.lang.String r4 = "删除当前自动评论运行记录"
            wb.ho.b(r1, r4, r3, r7, r0)
            r7.p(r2)
            goto L186
        L17c:
            r2 = r11
            r0 = -1536879477(0xffffffffa465148b, float:-4.967386E-17)
            r7.a0(r0)
            r7.p(r2)
        L186:
            r7.p(r2)
            goto L198
        L18a:
            r2 = r11
            r0 = -1536853685(0xffffffffa465794b, float:-4.97592E-17)
            r7.a0(r0)
            r7.p(r2)
            goto L198
        L195:
            r7.V()
        L198:
            sf.n r0 = sf.n.f12433a
            return r0
        L19b:
            java.lang.Object r0 = r40.e(r41, r42)
            return r0
        L1a0:
            r6 = r41
            i0.h0 r6 = (i0.h0) r6
            r0 = r42
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 3
            r2 = 2
            r9 = 1
            r10 = 0
            if (r1 == r2) goto L1b5
            r1 = r9
            goto L1b6
        L1b5:
            r1 = r10
        L1b6:
            r0 = r0 & r9
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L248
            r0 = r40
            i0.a1 r11 = r0.f17840i
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L1db
            if (r3 != r13) goto L1e4
        L1db:
            wb.di r3 = new wb.di
            r2 = 5
            r3.<init>(r12, r11, r2)
            r6.k0(r3)
        L1e4:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "朋友圈自动点赞"
            java.lang.String r3 = "按下方规则处理新获取的朋友圈"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L23e
            r1 = 1823974877(0x6cb7a5dd, float:1.7761335E27)
            r6.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r6, r10, r9)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r6.h(r12)
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L221
            if (r4 != r13) goto L22a
        L221:
            wb.di r4 = new wb.di
            r3 = 6
            r4.<init>(r12, r1, r3)
            r6.k0(r4)
        L22a:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            r1 = r2
            java.lang.String r2 = "点赞自己的朋友圈"
            java.lang.String r3 = "自己的朋友圈不受好友名单限制"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r10)
            goto L24d
        L23e:
            r1 = 1824268943(0x6cbc228f, float:1.81953E27)
            r6.a0(r1)
            r6.p(r10)
            goto L24d
        L248:
            r0 = r40
            r6.V()
        L24d:
            sf.n r1 = sf.n.f12433a
            return r1
        L250:
            r7 = r41
            i0.h0 r7 = (i0.h0) r7
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L265
            r2 = r10
            goto L266
        L265:
            r2 = r11
        L266:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L3dc
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r7.h(r12)
            java.lang.Object r4 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto L289
            if (r4 != r13) goto L292
        L289:
            wb.wh r4 = new wb.wh
            r3 = 6
            r4.<init>(r12, r1, r3)
            r7.k0(r4)
        L292:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "记录运行日志"
            java.lang.String r4 = "记录自动转发执行情况"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d1
            r1 = -1491931932(0xffffffffa712ece4, float:-2.0389989E-15)
            r7.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r7, r11, r10)
            i0.a1 r2 = r0.f17841j
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L2c8
            java.lang.String r3 = "暂无记录"
            goto L2f0
        L2c8:
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            og.d r4 = new og.d
            r4.<init>(r3)
            r3 = r11
        L2d7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2ea
            r4.next()
            int r3 = r3 + 1
            if (r3 < 0) goto L2e5
            goto L2d7
        L2e5:
            a.a.P0()
            r1 = 0
            throw r1
        L2ea:
            java.lang.String r4 = " 条记录"
            java.lang.String r3 = p.a.i(r3, r4)
        L2f0:
            boolean r4 = r7.h(r12)
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto L2fc
            if (r5 != r13) goto L305
        L2fc:
            wb.od r5 = new wb.od
            r4 = 4
            r5.<init>(r12, r2, r4)
            r7.k0(r5)
        L305:
            fg.a r5 = (fg.a) r5
            java.lang.String r4 = "刷新日志"
            r6 = 6
            wb.ho.b(r4, r3, r5, r7, r6)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L3c3
            r3 = -1491371514(0xffffffffa71b7a06, float:-2.157672E-15)
            r7.a0(r3)
            wb.ho.D1(r1, r7, r11, r10)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 5000(0x1388, float:7.006E-42)
            java.lang.String r3 = og.m.P0(r4, r3)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r7.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            r6 = 12
            long r8 = x6.d.D(r6)
            y0.l r6 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r6 = p.h1.d(r6, r14)
            r14 = 16
            float r14 = (float) r14
            y0.o r6 = p.d.l(r6, r14)
            r23 = 0
            r24 = 261992(0x3ff68, float:3.67129E-40)
            r21 = r7
            r38 = r8
            r9 = r2
            r2 = r3
            r3 = r6
            r6 = r38
            r8 = 0
            r14 = r9
            m2.m r9 = m2.p.f8705b
            r15 = r10
            r16 = r11
            r10 = 0
            r17 = r12
            r12 = 0
            r19 = r13
            r18 = r14
            r13 = 0
            r20 = r15
            r15 = 0
            r22 = r16
            r16 = 0
            r25 = r17
            r17 = 0
            r26 = r18
            r18 = 0
            r27 = r19
            r19 = 0
            r28 = r20
            r20 = 0
            r29 = r22
            r22 = 24624(0x6030, float:3.4506E-41)
            r33 = r26
            r34 = r27
            r0 = r28
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r21
            r2 = 0
            wb.ho.D1(r1, r7, r2, r0)
            r0 = r25
            boolean r1 = r7.h(r0)
            java.lang.Object r3 = r7.P()
            if (r1 != 0) goto L3a9
            r1 = r34
            if (r3 != r1) goto L3b4
        L3a9:
            wb.od r3 = new wb.od
            r1 = 5
            r14 = r33
            r3.<init>(r0, r14, r1)
            r7.k0(r3)
        L3b4:
            fg.a r3 = (fg.a) r3
            r0 = 54
            java.lang.String r1 = "清空日志"
            java.lang.String r4 = "删除当前自动转发运行记录"
            wb.ho.b(r1, r4, r3, r7, r0)
            r7.p(r2)
            goto L3cd
        L3c3:
            r2 = r11
            r0 = -1490596948(0xffffffffa7274bac, float:-2.3216927E-15)
            r7.a0(r0)
            r7.p(r2)
        L3cd:
            r7.p(r2)
            goto L3df
        L3d1:
            r2 = r11
            r0 = -1490571156(0xffffffffa727b06c, float:-2.3271544E-15)
            r7.a0(r0)
            r7.p(r2)
            goto L3df
        L3dc:
            r7.V()
        L3df:
            sf.n r0 = sf.n.f12433a
            return r0
        L3e2:
            r6 = r41
            i0.h0 r6 = (i0.h0) r6
            r0 = r42
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 3
            r2 = 2
            r9 = 1
            r10 = 0
            if (r1 == r2) goto L3f7
            r1 = r9
            goto L3f8
        L3f7:
            r1 = r10
        L3f8:
            r0 = r0 & r9
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L571
            r0 = r40
            i0.a1 r11 = r0.f17840i
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L41d
            if (r3 != r13) goto L426
        L41d:
            wb.wh r3 = new wb.wh
            r2 = 2
            r3.<init>(r12, r11, r2)
            r6.k0(r3)
        L426:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "记录运行日志"
            java.lang.String r3 = "只保留最近 200 条"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L566
            r1 = 1643313531(0x61f2f97b, float:5.6026113E20)
            r6.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r6, r10, r9)
            i0.a1 r2 = r0.f17841j
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L45c
            java.lang.String r3 = "暂无记录"
            goto L484
        L45c:
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            og.d r4 = new og.d
            r4.<init>(r3)
            r3 = r10
        L46b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L47e
            r4.next()
            int r3 = r3 + 1
            if (r3 < 0) goto L479
            goto L46b
        L479:
            a.a.P0()
            r1 = 0
            throw r1
        L47e:
            java.lang.String r4 = " 条记录"
            java.lang.String r3 = p.a.i(r3, r4)
        L484:
            boolean r4 = r6.h(r12)
            java.lang.Object r5 = r6.P()
            if (r4 != 0) goto L490
            if (r5 != r13) goto L499
        L490:
            wb.od r5 = new wb.od
            r4 = 2
            r5.<init>(r12, r2, r4)
            r6.k0(r5)
        L499:
            fg.a r5 = (fg.a) r5
            java.lang.String r4 = "刷新日志"
            r7 = 6
            wb.ho.b(r4, r3, r5, r6, r7)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L558
            r3 = 1643643309(0x61f801ad, float:5.7186416E20)
            r6.a0(r3)
            wb.ho.D1(r1, r6, r10, r9)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 5000(0x1388, float:7.006E-42)
            java.lang.String r3 = og.m.P0(r4, r3)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r6.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            r7 = 12
            long r7 = x6.d.D(r7)
            y0.l r11 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r11, r14)
            r14 = 16
            float r14 = (float) r14
            y0.o r11 = p.d.l(r11, r14)
            r22 = 0
            r23 = 261992(0x3ff68, float:3.67129E-40)
            r20 = r6
            r38 = r7
            r8 = r1
            r1 = r3
            r3 = r4
            r5 = r38
            r7 = 0
            r14 = r8
            m2.m r8 = m2.p.f8705b
            r15 = r9
            r16 = r10
            r9 = 0
            r17 = r2
            r2 = r11
            r11 = 0
            r18 = r12
            r19 = r13
            r12 = 0
            r21 = r14
            r14 = 0
            r24 = r15
            r15 = 0
            r25 = r16
            r16 = 0
            r26 = r17
            r17 = 0
            r27 = r18
            r18 = 0
            r28 = r19
            r19 = 0
            r29 = r21
            r21 = 24624(0x6030, float:3.4506E-41)
            r35 = r26
            r36 = r28
            r0 = r29
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = r20
            r1 = 0
            r15 = 1
            wb.ho.D1(r0, r6, r1, r15)
            r0 = r27
            boolean r2 = r6.h(r0)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L53e
            r2 = r36
            if (r3 != r2) goto L549
        L53e:
            wb.od r3 = new wb.od
            r2 = 3
            r4 = r35
            r3.<init>(r0, r4, r2)
            r6.k0(r3)
        L549:
            fg.a r3 = (fg.a) r3
            r0 = 54
            java.lang.String r2 = "清空日志"
            java.lang.String r4 = "删除当前自动点赞运行记录"
            wb.ho.b(r2, r4, r3, r6, r0)
            r6.p(r1)
            goto L562
        L558:
            r1 = r10
            r0 = 1644414992(0x6203c810, float:6.077349E20)
            r6.a0(r0)
            r6.p(r1)
        L562:
            r6.p(r1)
            goto L574
        L566:
            r1 = r10
            r0 = 1644440784(0x62042cd0, float:6.095498E20)
            r6.a0(r0)
            r6.p(r1)
            goto L574
        L571:
            r6.V()
        L574:
            sf.n r0 = sf.n.f12433a
            return r0
        L577:
            r6 = r41
            i0.h0 r6 = (i0.h0) r6
            r0 = r42
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 3
            r2 = 2
            r9 = 1
            r10 = 0
            if (r1 == r2) goto L58c
            r1 = r9
            goto L58d
        L58c:
            r1 = r10
        L58d:
            r0 = r0 & r9
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L627
            r0 = r40
            i0.a1 r11 = r0.f17840i
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L5b2
            if (r3 != r13) goto L5bc
        L5b2:
            wb.me r3 = new wb.me
            r2 = 16
            r3.<init>(r12, r11, r2)
            r6.k0(r3)
        L5bc:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "自动发送祝福语"
            java.lang.String r3 = "抢到红包后发送祝福语"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L61d
            r1 = -418355906(0xffffffffe710653e, float:-6.8188836E23)
            r6.a0(r1)
            r11 = 0
            wb.ho.D1(r11, r6, r10, r9)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r6.P()
            if (r2 != r13) goto L5fa
            wb.mf r2 = new wb.mf
            r4 = 24
            r2.<init>(r1, r4)
            r6.k0(r2)
        L5fa:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 24630(0x6036, float:3.4514E-41)
            r8 = 8
            java.lang.String r1 = "祝福语内容"
            java.lang.String r2 = "抢到红包后发送的文字"
            r4 = 0
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            wb.ho.D1(r11, r6, r10, r9)
            r5 = 0
            r7 = 28080(0x6db0, float:3.9348E-41)
            java.lang.String r2 = "hb_wish_random"
            java.lang.String r3 = "随机祝福语"
            java.lang.String r4 = "从模板中随机选择"
            r1 = r12
            wb.ho.O3(r1, r2, r3, r4, r5, r6, r7)
            r6.p(r10)
            goto L62c
        L61d:
            r1 = -418081060(0xffffffffe71496dc, float:-7.016931E23)
            r6.a0(r1)
            r6.p(r10)
            goto L62c
        L627:
            r0 = r40
            r6.V()
        L62c:
            sf.n r1 = sf.n.f12433a
            return r1
        L62f:
            r1 = r41
            i0.h0 r1 = (i0.h0) r1
            r2 = r42
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L643
            r3 = r5
            goto L644
        L643:
            r3 = 0
        L644:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L6ac
            i0.a1 r2 = r0.f17840i
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            i0.a1 r4 = r0.f17841j
            if (r3 > 0) goto L662
            java.lang.String r3 = "尚未执行"
            goto L68a
        L662:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r5 = "MM-dd HH:mm:ss"
            java.util.Locale r6 = java.util.Locale.CHINA
            r3.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            java.lang.Object r6 = r2.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r5.<init>(r6)
            java.lang.String r3 = r3.format(r5)
            java.lang.Object r5 = r4.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = " · "
            java.lang.String r3 = wb.en.h(r3, r6, r5)
        L68a:
            android.content.SharedPreferences r5 = r0.f17839h
            boolean r6 = r1.h(r5)
            java.lang.Object r7 = r1.P()
            if (r6 != 0) goto L69a
            i0.e r6 = i0.l.f5952a
            if (r7 != r6) goto L6a3
        L69a:
            wb.k9 r7 = new wb.k9
            r6 = 1
            r7.<init>(r5, r2, r4, r6)
            r1.k0(r7)
        L6a3:
            fg.a r7 = (fg.a) r7
            r2 = 6
            java.lang.String r4 = "刷新状态"
            wb.ho.b(r4, r3, r7, r1, r2)
            goto L6af
        L6ac:
            r1.V()
        L6af:
            sf.n r1 = sf.n.f12433a
            return r1
        L6b2:
            r7 = r41
            i0.h0 r7 = (i0.h0) r7
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r11 = 1
            r12 = 0
            if (r2 == r3) goto L6c7
            r2 = r11
            goto L6c8
        L6c7:
            r2 = r12
        L6c8:
            r1 = r1 & r11
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L78f
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r13 = "custom"
            boolean r3 = gg.l.a(r2, r13)
            java.lang.String r4 = "hidden"
            if (r3 == 0) goto L6e5
            java.lang.String r2 = "使用自定义时间格式"
        L6e3:
            r3 = r2
            goto L6f1
        L6e5:
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L6ee
            java.lang.String r2 = "隐藏微信原生聊天时间"
            goto L6e3
        L6ee:
            java.lang.String r2 = "保持微信原样"
            goto L6e3
        L6f1:
            wb.dq r2 = new wb.dq
            java.lang.String r5 = "微信原样"
            java.lang.String r6 = "original"
            r2.<init>(r6, r5)
            wb.dq r5 = new wb.dq
            java.lang.String r6 = "自定义"
            r5.<init>(r13, r6)
            wb.dq r6 = new wb.dq
            java.lang.String r8 = "隐藏"
            r6.<init>(r4, r8)
            wb.dq[] r2 = new wb.dq[]{r2, r5, r6}
            java.util.List r4 = a.a.y0(r2)
            java.lang.Object r2 = r1.getValue()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences r14 = r0.f17839h
            boolean r2 = r7.h(r14)
            java.lang.Object r6 = r7.P()
            i0.e r15 = i0.l.f5952a
            if (r2 != 0) goto L727
            if (r6 != r15) goto L730
        L727:
            wb.wb r6 = new wb.wb
            r2 = 3
            r6.<init>(r14, r1, r2)
            r7.k0(r6)
        L730:
            fg.l r6 = (fg.l) r6
            r9 = 6
            r10 = 32
            java.lang.String r2 = "显示方式"
            r8 = r7
            r7 = 0
            wb.ho.I2(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = gg.l.a(r1, r13)
            if (r1 == 0) goto L785
            r1 = 110549503(0x696d9ff, float:5.6744045E-35)
            r8.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r8, r12, r11)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r8.h(r14)
            java.lang.Object r3 = r8.P()
            if (r2 != 0) goto L767
            if (r3 != r15) goto L770
        L767:
            wb.wb r3 = new wb.wb
            r2 = 4
            r3.<init>(r14, r1, r2)
            r8.k0(r3)
        L770:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 54
            r9 = 8
            java.lang.String r2 = "时间格式"
            java.lang.String r3 = "例如 yyyy-MM-dd HH:mm:ss"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            r8.p(r12)
            goto L793
        L785:
            r1 = 111105922(0x69f5782, float:5.9937734E-35)
            r8.a0(r1)
            r8.p(r12)
            goto L793
        L78f:
            r8 = r7
            r8.V()
        L793:
            sf.n r1 = sf.n.f12433a
            return r1
        L796:
            r15 = r41
            i0.h0 r15 = (i0.h0) r15
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 0
            r11 = 1
            if (r2 == r3) goto L7ab
            r2 = r11
            goto L7ac
        L7ab:
            r2 = r10
        L7ac:
            r1 = r1 & r11
            boolean r1 = r15.S(r1, r2)
            if (r1 == 0) goto L97d
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r15.h(r12)
            java.lang.Object r4 = r15.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto L7cf
            if (r4 != r13) goto L7d9
        L7cf:
            wb.wb r4 = new wb.wb
            r3 = 13
            r4.<init>(r12, r1, r3)
            r15.k0(r4)
        L7d9:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "启用圆角头像"
            java.lang.String r4 = "统一应用到微信界面和通知头像"
            r5 = 0
            r7 = r15
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L972
            r1 = -840566175(0xffffffffcde5fa61, float:-4.822989E8)
            r15.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r15, r10, r11)
            y0.l r1 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r1, r2)
            r4 = 16
            float r4 = (float) r4
            r5 = 14
            float r5 = (float) r5
            y0.o r3 = p.d.m(r3, r4, r5)
            p.e r4 = p.j.f9926c
            y0.e r5 = y0.b.f21804s
            p.t r4 = p.s.a(r4, r5, r15, r10)
            long r5 = r15.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r15.l()
            y0.o r3 = y0.a.c(r15, r3)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r15.d0()
            boolean r8 = r15.S
            if (r8 == 0) goto L839
            r15.k(r7)
            goto L83c
        L839:
            r15.n0()
        L83c:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r15, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r15, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r15, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r15)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r15, r3)
            i0.a1 r3 = r0.f17841j
            java.lang.Object r4 = r3.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = r9.e0.q(r4, r5, r6)
            r7 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r7
            int r4 = ig.a.X(r4)
            float r4 = (float) r4
            float r4 = r4 / r7
            float r4 = r4 * r7
            int r4 = ig.a.X(r4)
            java.lang.String r7 = "圆角弧度 "
            java.lang.String r8 = "%"
            java.lang.String r4 = eh.a.m(r4, r7, r8)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r15.j(r7)
            bi.b r7 = (bi.b) r7
            long r7 = r7.g()
            r9 = r5
            r38 = r7
            r7 = r2
            r2 = r4
            r4 = r38
            m2.k r8 = m2.k.f8698j
            r23 = 0
            r24 = 262074(0x3ffba, float:3.67244E-40)
            r14 = r3
            r3 = 0
            r17 = r6
            r16 = r7
            r6 = 0
            r18 = r9
            r9 = 0
            r19 = r10
            r20 = r11
            r10 = 0
            r21 = r12
            r12 = 0
            r25 = r13
            r22 = r14
            r13 = 0
            r26 = r21
            r21 = r15
            r15 = 0
            r27 = r16
            r16 = 0
            r28 = r17
            r17 = 0
            r29 = r18
            r18 = 0
            r30 = r19
            r19 = 0
            r31 = r20
            r20 = 0
            r32 = r22
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r25
            r37 = r26
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15 = r21
            java.lang.Object r2 = r32.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Object r3 = r15.P()
            if (r3 != r0) goto L8fb
            wb.hd r3 = new wb.hd
            r4 = 18
            r14 = r32
            r3.<init>(r14, r4)
            r15.k0(r3)
            goto L8fd
        L8fb:
            r14 = r32
        L8fd:
            fg.l r3 = (fg.l) r3
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r1, r7)
            r1 = 8
            float r10 = (float) r1
            r12 = 0
            r13 = 13
            r9 = 0
            r11 = 0
            y0.o r4 = p.d.p(r8, r9, r10, r11, r12, r13)
            lg.a r6 = new lg.a
            r1 = 1056964608(0x3f000000, float:0.5)
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r6.<init>(r9, r1)
            r5 = r37
            boolean r7 = r15.h(r5)
            java.lang.Object r8 = r15.P()
            if (r7 != 0) goto L929
            if (r8 != r0) goto L932
        L929:
            wb.od r8 = new wb.od
            r0 = 0
            r8.<init>(r5, r14, r0)
            r15.k0(r8)
        L932:
            fg.a r8 = (fg.a) r8
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r9 = 1053609165(0x3ecccccd, float:0.4)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float[] r0 = new java.lang.Float[]{r0, r5, r7, r9, r1}
            java.util.List r13 = a.a.y0(r0)
            r16 = 197040(0x301b0, float:2.76112E-40)
            r17 = 10120(0x2788, float:1.4181E-41)
            r5 = 0
            r7 = 39
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r14 = 0
            sh.f1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 1
            r15.p(r0)
            r0 = 0
            r15.p(r0)
            goto L980
        L972:
            r0 = r10
            r1 = -838970915(0xffffffffcdfe51dd, float:-5.3334723E8)
            r15.a0(r1)
            r15.p(r0)
            goto L980
        L97d:
            r15.V()
        L980:
            sf.n r0 = sf.n.f12433a
            return r0
        L983:
            r6 = r41
            i0.h0 r6 = (i0.h0) r6
            r0 = r42
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r0 & 3
            r2 = 2
            r9 = 1
            r10 = 0
            if (r1 == r2) goto L998
            r1 = r9
            goto L999
        L998:
            r1 = r10
        L999:
            r0 = r0 & r9
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto La2d
            r0 = r40
            i0.a1 r11 = r0.f17840i
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r2 = r6.h(r12)
            java.lang.Object r3 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L9be
            if (r3 != r13) goto L9c8
        L9be:
            wb.wb r3 = new wb.wb
            r2 = 21
            r3.<init>(r12, r11, r2)
            r6.k0(r3)
        L9c8:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "启用消息气泡"
            java.lang.String r3 = "使用本地图片替换微信原生消息气泡"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La23
            r1 = -1041512979(0xffffffffc1ebc5ed, float:-29.471643)
            r6.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r6, r10, r9)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r6.h(r12)
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto La05
            if (r4 != r13) goto La0f
        La05:
            wb.wb r4 = new wb.wb
            r3 = 22
            r4.<init>(r12, r1, r3)
            r6.k0(r4)
        La0f:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            r1 = r2
            java.lang.String r2 = "深色模式单独设置"
            java.lang.String r3 = "未设置深色气泡时自动沿用对应浅色气泡"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r10)
            goto La32
        La23:
            r1 = -1040932535(0xffffffffc1f4a149, float:-30.578753)
            r6.a0(r1)
            r6.p(r10)
            goto La32
        La2d:
            r0 = r40
            r6.V()
        La32:
            sf.n r1 = sf.n.f12433a
            return r1
        La35:
            r6 = r41
            i0.h0 r6 = (i0.h0) r6
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto La4a
            r2 = r10
            goto La4b
        La4a:
            r2 = r11
        La4b:
            r1 = r1 & r10
            boolean r1 = r6.S(r1, r2)
            if (r1 == 0) goto Lad9
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r6.h(r12)
            java.lang.Object r4 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto La6e
            if (r4 != r13) goto La78
        La6e:
            wb.wb r4 = new wb.wb
            r3 = 18
            r4.<init>(r12, r1, r3)
            r6.k0(r4)
        La78:
            fg.l r4 = (fg.l) r4
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "伪造语音时长"
            r7 = r6
            r6 = r4
            java.lang.String r4 = "发送语音时使用自定义显示时长"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lacf
            r1 = 761803436(0x2d6832ac, float:1.3198925E-11)
            r7.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r7, r11, r10)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r7.h(r12)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto Lab3
            if (r3 != r13) goto Labd
        Lab3:
            wb.wb r3 = new wb.wb
            r2 = 19
            r3.<init>(r12, r1, r2)
            r7.k0(r3)
        Labd:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r6 = r7
            r7 = 54
            java.lang.String r2 = "显示时长"
            java.lang.String r3 = "单位秒，1-60"
            wb.ho.w2(r2, r3, r4, r5, r6, r7)
            r7 = r6
            r7.p(r11)
            goto Ladd
        Lacf:
            r1 = 762751943(0x2d76abc7, float:1.4021623E-11)
            r7.a0(r1)
            r7.p(r11)
            goto Ladd
        Lad9:
            r7 = r6
            r7.V()
        Ladd:
            sf.n r1 = sf.n.f12433a
            return r1
        Lae0:
            r7 = r41
            i0.h0 r7 = (i0.h0) r7
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto Laf5
            r2 = r10
            goto Laf6
        Laf5:
            r2 = r11
        Laf6:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto Lb83
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r7.h(r12)
            java.lang.Object r4 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto Lb19
            if (r4 != r13) goto Lb23
        Lb19:
            wb.wb r4 = new wb.wb
            r3 = 14
            r4.<init>(r12, r1, r3)
            r7.k0(r4)
        Lb23:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "朋友圈关键词屏蔽"
            java.lang.String r4 = "隐藏正文命中任意关键词的朋友圈"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb79
            r1 = 421439180(0x191ea6cc, float:8.202093E-24)
            r7.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r7, r11, r10)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r7.h(r12)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto Lb5d
            if (r3 != r13) goto Lb67
        Lb5d:
            wb.wb r3 = new wb.wb
            r2 = 15
            r3.<init>(r12, r1, r2)
            r7.k0(r3)
        Lb67:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 3126(0xc36, float:4.38E-42)
            r9 = 0
            java.lang.String r2 = "屏蔽关键词"
            java.lang.String r3 = "多个关键词用逗号或换行分隔"
            r5 = 3
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto Lb86
        Lb79:
            r1 = 421901421(0x1925b46d, float:8.566737E-24)
            r7.a0(r1)
            r7.p(r11)
            goto Lb86
        Lb83:
            r7.V()
        Lb86:
            sf.n r1 = sf.n.f12433a
            return r1
        Lb89:
            r7 = r41
            i0.h0 r7 = (i0.h0) r7
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 0
            r11 = 1
            if (r2 == r3) goto Lb9e
            r2 = r11
            goto Lb9f
        Lb9e:
            r2 = r10
        Lb9f:
            r1 = r1 & r11
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto Lc0f
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r12 = r0.f17839h
            boolean r3 = r7.h(r12)
            java.lang.Object r4 = r7.P()
            i0.a1 r13 = r0.f17841j
            i0.e r14 = i0.l.f5952a
            if (r3 != 0) goto Lbc4
            if (r4 != r14) goto Lbcd
        Lbc4:
            wb.bc r4 = new wb.bc
            r3 = 1
            r4.<init>(r12, r1, r13, r3)
            r7.k0(r4)
        Lbcd:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "使用固定结果"
            java.lang.String r4 = "直接发送下方设置的骰子点数或猜拳结果"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            wb.ho.D1(r2, r7, r10, r11)
            java.lang.Object r2 = r13.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.h(r12)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto Lbf6
            if (r4 != r14) goto Lbff
        Lbf6:
            wb.bc r4 = new wb.bc
            r3 = 2
            r4.<init>(r12, r13, r1, r3)
            r7.k0(r4)
        Lbff:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "发送时选择"
            java.lang.String r4 = "每次发送骰子或猜拳前弹出结果选择"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lc12
        Lc0f:
            r7.V()
        Lc12:
            sf.n r1 = sf.n.f12433a
            return r1
        Lc15:
            r8 = r41
            i0.h0 r8 = (i0.h0) r8
            r1 = r42
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r10 = 0
            r11 = 1
            r12 = 2
            if (r2 == r12) goto Lc2a
            r2 = r11
            goto Lc2b
        Lc2a:
            r2 = r10
        Lc2b:
            r1 = r1 & r11
            boolean r1 = r8.S(r1, r2)
            if (r1 == 0) goto Ld08
            i0.a1 r1 = r0.f17840i
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = " 点"
            java.lang.String r2 = p.a.i(r2, r3)
            lg.d r4 = new lg.d
            r5 = 6
            r4.<init>(r11, r5, r11)
            r5 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = tf.n.e1(r5)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        Lc58:
            r6 = r5
            lg.c r6 = (lg.c) r6
            boolean r7 = r6.f8047i
            java.lang.String r13 = ""
            if (r7 == 0) goto Lc78
            java.lang.Object r6 = r6.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            wb.bp r7 = new wb.bp
            java.lang.String r9 = p.a.i(r6, r3)
            r7.<init>(r9, r6, r13)
            r4.add(r7)
            goto Lc58
        Lc78:
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            android.content.SharedPreferences r14 = r0.f17839h
            boolean r3 = r8.h(r14)
            java.lang.Object r6 = r8.P()
            i0.e r15 = i0.l.f5952a
            if (r3 != 0) goto Lc92
            if (r6 != r15) goto Lc9c
        Lc92:
            wb.wb r6 = new wb.wb
            r3 = 26
            r6.<init>(r14, r1, r3)
            r8.k0(r6)
        Lc9c:
            fg.l r6 = (fg.l) r6
            r7 = 0
            r9 = 6
            r3 = r2
            java.lang.String r2 = "骰子点数"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            wb.ho.D1(r1, r8, r10, r11)
            i0.a1 r1 = r0.f17841j
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "石头"
            java.lang.String r4 = "布"
            java.lang.String r5 = "剪刀"
            r6 = 3
            if (r2 == r12) goto Lcc5
            if (r2 == r6) goto Lcc3
            r2 = r5
            goto Lcc6
        Lcc3:
            r2 = r4
            goto Lcc6
        Lcc5:
            r2 = r3
        Lcc6:
            wb.bp r7 = new wb.bp
            r7.<init>(r5, r11, r13)
            wb.bp r5 = new wb.bp
            r5.<init>(r3, r12, r13)
            wb.bp r3 = new wb.bp
            r3.<init>(r4, r6, r13)
            wb.bp[] r3 = new wb.bp[]{r7, r5, r3}
            java.util.List r4 = a.a.y0(r3)
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            boolean r3 = r8.h(r14)
            java.lang.Object r6 = r8.P()
            if (r3 != 0) goto Lcf3
            if (r6 != r15) goto Lcfd
        Lcf3:
            wb.wb r6 = new wb.wb
            r3 = 27
            r6.<init>(r14, r1, r3)
            r8.k0(r6)
        Lcfd:
            fg.l r6 = (fg.l) r6
            r7 = 0
            r9 = 6
            r3 = r2
            java.lang.String r2 = "猜拳结果"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Ld0b
        Ld08:
            r8.V()
        Ld0b:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
