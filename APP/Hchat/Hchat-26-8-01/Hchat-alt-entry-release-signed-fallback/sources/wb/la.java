package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17417j;

    public /* synthetic */ la(i0.a1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17414g = r4
            r0.f17415h = r1
            r0.f17416i = r2
            r0.f17417j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ la(wb.n5 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4) {
            r0 = this;
            r1 = 10
            r0.f17414g = r1
            r0.<init>()
            r0.f17415h = r2
            r0.f17416i = r3
            r0.f17417j = r4
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31) {
            r29 = this;
            r0 = r29
            int r1 = r0.f17414g
            r4 = 21
            r5 = 4
            java.lang.String r6 = "读取联系人失败"
            r7 = 390(0x186, float:5.47E-43)
            r10 = 20
            r12 = 0
            r13 = 0
            i0.e r14 = i0.l.f5952a
            r15 = 1
            r11 = 2
            r8 = 3
            sf.n r16 = sf.n.f12433a
            i0.a1 r9 = r0.f17417j
            i0.a1 r2 = r0.f17416i
            i0.a1 r3 = r0.f17415h
            switch(r1) {
                case 0: goto L90c;
                case 1: goto L86a;
                case 2: goto L7c2;
                case 3: goto L717;
                case 4: goto L5f0;
                case 5: goto L53b;
                case 6: goto L4c9;
                case 7: goto L3fc;
                case 8: goto L354;
                case 9: goto L2a8;
                case 10: goto L260;
                case 11: goto L1c2;
                case 12: goto L15c;
                case 13: goto L142;
                case 14: goto L128;
                case 15: goto L108;
                case 16: goto Le6;
                case 17: goto Lc6;
                default: goto L1f;
            }
        L1f:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L31
            r5 = r15
            goto L32
        L31:
            r5 = r13
        L32:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "downloads"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L4c
            java.lang.String r4 = "热门（按下载量）"
        L49:
            r21 = r4
            goto L4f
        L4c:
            java.lang.String r4 = "最新发布"
            goto L49
        L4f:
            wb.dq r4 = new wb.dq
            java.lang.String r6 = "最新"
            java.lang.String r8 = "latest"
            r4.<init>(r8, r6)
            wb.dq r6 = new wb.dq
            java.lang.String r8 = "热门"
            r6.<init>(r5, r8)
            wb.dq[] r4 = new wb.dq[]{r4, r6}
            java.util.List r22 = a.a.y0(r4)
            java.lang.Object r4 = r3.getValue()
            r23 = r4
            java.lang.String r23 = (java.lang.String) r23
            boolean r4 = r1.f(r3)
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L7b
            if (r5 != r14) goto L85
        L7b:
            wb.gj r5 = new wb.gj
            r4 = 29
            r5.<init>(r3, r4)
            r1.k0(r5)
        L85:
            r24 = r5
            fg.l r24 = (fg.l) r24
            r27 = 6
            r28 = 32
            java.lang.String r20 = "排序方式"
            r25 = 0
            r26 = r1
            wb.ho.I2(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La8
            java.lang.String r2 = "正在加载在线插件"
            goto Laa
        La8:
            java.lang.String r2 = "重新获取当前列表"
        Laa:
            java.lang.Object r3 = r1.P()
            if (r3 != r14) goto Lba
            wb.gl r3 = new wb.gl
            r4 = 28
            r3.<init>(r9, r4)
            r1.k0(r3)
        Lba:
            fg.a r3 = (fg.a) r3
            java.lang.String r4 = "刷新"
            wb.ho.b(r4, r2, r3, r1, r7)
            goto Lc5
        Lc2:
            r1.V()
        Lc5:
            return r16
        Lc6:
            r1 = r30
            wb.j5 r1 = (wb.j5) r1
            r4 = r31
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            og.k r5 = wb.ho.f16633a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.setValue(r5)
            if (r4 == 0) goto Le2
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto Lde
            r6 = r1
        Lde:
            r2.setValue(r6)
            goto Le5
        Le2:
            r9.setValue(r1)
        Le5:
            return r16
        Le6:
            r1 = r30
            java.util.List r1 = (java.util.List) r1
            r4 = r31
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            og.k r5 = wb.ho.f16633a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.setValue(r5)
            if (r4 == 0) goto L104
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto Lfe
            goto L100
        Lfe:
            java.lang.String r1 = "读取群成员失败"
        L100:
            r2.setValue(r1)
            goto L107
        L104:
            r9.setValue(r1)
        L107:
            return r16
        L108:
            r1 = r30
            java.util.List r1 = (java.util.List) r1
            r4 = r31
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            og.k r5 = wb.ho.f16633a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.setValue(r5)
            if (r4 == 0) goto L124
            java.lang.String r1 = r4.getMessage()
            if (r1 == 0) goto L120
            r6 = r1
        L120:
            r2.setValue(r6)
            goto L127
        L124:
            r9.setValue(r1)
        L127:
            return r16
        L128:
            r1 = r30
            java.lang.String r1 = (java.lang.String) r1
            r4 = r31
            java.lang.String r4 = (java.lang.String) r4
            r1.getClass()
            r4.getClass()
            r3.setValue(r1)
            r2.setValue(r4)
            java.lang.String r1 = ""
            r9.setValue(r1)
            return r16
        L142:
            r1 = r30
            v8.a r1 = (v8.a) r1
            r4 = r31
            wb.f r4 = (wb.f) r4
            r1.getClass()
            r4.getClass()
            r3.setValue(r1)
            r2.setValue(r4)
            wb.g r1 = wb.g.f16289j
            r9.setValue(r1)
            return r16
        L15c:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r11) goto L16e
            r6 = r15
            goto L16f
        L16e:
            r6 = r13
        L16f:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r6)
            if (r4 == 0) goto L1be
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L184
            java.lang.String r3 = "未设置 WebSocket 地址"
        L184:
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L192
            wb.bj r4 = new wb.bj
            r4.<init>(r2, r8)
            r1.k0(r4)
        L192:
            fg.a r4 = (fg.a) r4
            java.lang.String r6 = "小智AI配置"
            wb.ho.b(r6, r3, r4, r1, r7)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r9.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "当前启用："
            java.lang.String r3 = wb.en.g(r4, r3)
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L1b6
            wb.bj r4 = new wb.bj
            r4.<init>(r2, r5)
            r1.k0(r4)
        L1b6:
            fg.a r4 = (fg.a) r4
            java.lang.String r2 = "智聊AI配置"
            wb.ho.b(r2, r3, r4, r1, r7)
            goto L1c1
        L1be:
            r1.V()
        L1c1:
            return r16
        L1c2:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r5 = r31
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            if (r6 == r11) goto L1d4
            r6 = r15
            goto L1d5
        L1d4:
            r6 = r13
        L1d5:
            r5 = r5 & r15
            boolean r5 = r1.S(r5, r6)
            if (r5 == 0) goto L25c
            java.lang.Object r5 = r3.getValue()
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r5 = r1.P()
            if (r5 != r14) goto L1f2
            wb.ni r5 = new wb.ni
            r5.<init>(r3, r10)
            r1.k0(r5)
        L1f2:
            r21 = r5
            fg.l r21 = (fg.l) r21
            r23 = 24630(0x6036, float:3.4514E-41)
            r24 = 8
            java.lang.String r17 = "WebSocket 地址"
            java.lang.String r18 = "小智服务地址"
            r20 = 0
            r22 = r1
            wb.ho.C1(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r2.getValue()
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r3 = r1.P()
            if (r3 != r14) goto L21e
            wb.ni r3 = new wb.ni
            r3.<init>(r2, r4)
            r1.k0(r3)
        L21e:
            r21 = r3
            fg.l r21 = (fg.l) r21
            r23 = 24630(0x6036, float:3.4514E-41)
            r24 = 8
            java.lang.String r17 = "OTA 地址"
            java.lang.String r18 = "小智 OTA 地址"
            r20 = 0
            r22 = r1
            wb.ho.C1(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r1.P()
            if (r2 != r14) goto L24b
            wb.ni r2 = new wb.ni
            r3 = 22
            r2.<init>(r9, r3)
            r1.k0(r2)
        L24b:
            r12 = r2
            fg.l r12 = (fg.l) r12
            r14 = 24630(0x6036, float:3.4514E-41)
            r15 = 8
            java.lang.String r8 = "控制台地址"
            java.lang.String r9 = "用于查看或绑定设备"
            r11 = 0
            r13 = r1
            wb.ho.C1(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L25f
        L25c:
            r1.V()
        L25f:
            return r16
        L260:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L272
            r5 = r15
            goto L273
        L272:
            r5 = r13
        L273:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto L2a4
            java.lang.Object r4 = r3.getValue()
            wb.k5 r4 = (wb.k5) r4
            boolean r5 = r1.f(r3)
            boolean r6 = r1.f(r2)
            r5 = r5 | r6
            boolean r6 = r1.f(r9)
            r5 = r5 | r6
            java.lang.Object r6 = r1.P()
            if (r5 != 0) goto L296
            if (r6 != r14) goto L29e
        L296:
            wb.ad r6 = new wb.ad
            r6.<init>(r3, r2, r9, r11)
            r1.k0(r6)
        L29e:
            fg.l r6 = (fg.l) r6
            wb.ho.T1(r4, r13, r6, r1, r13)
            goto L2a7
        L2a4:
            r1.V()
        L2a7:
            return r16
        L2a8:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L2ba
            r5 = r15
            goto L2bb
        L2ba:
            r5 = r13
        L2bb:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto L350
            java.lang.Object r4 = r3.getValue()
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            java.util.List r20 = wb.ho.f16642j
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L2db
            wb.tg r4 = new wb.tg
            r5 = 5
            r4.<init>(r3, r5)
            r1.k0(r4)
        L2db:
            r25 = r4
            fg.l r25 = (fg.l) r25
            r27 = 196614(0x30006, float:2.75515E-40)
            r28 = 16
            r23 = r20
            java.lang.String r20 = "通知标题模板"
            java.lang.String r21 = "默认：关键词通知 %sender%"
            r24 = 0
            r26 = r1
            wb.ho.i4(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = r23
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L30b
            wb.tg r4 = new wb.tg
            r5 = 6
            r4.<init>(r2, r5)
            r1.k0(r4)
        L30b:
            r22 = r4
            fg.l r22 = (fg.l) r22
            r24 = 221190(0x36006, float:3.09953E-40)
            r25 = 0
            java.lang.String r17 = "通知内容模板"
            java.lang.String r18 = "默认：%content%"
            r21 = 3
            r23 = r1
            r19 = r3
            wb.ho.i4(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r2 = r1.P()
            if (r2 != r14) goto L33b
            wb.tg r2 = new wb.tg
            r3 = 7
            r2.<init>(r9, r3)
            r1.k0(r2)
        L33b:
            r22 = r2
            fg.l r22 = (fg.l) r22
            r24 = 196614(0x30006, float:2.75515E-40)
            r25 = 16
            java.lang.String r17 = "Toast 文字模板"
            java.lang.String r18 = "默认：收到关注消息"
            r21 = 0
            r23 = r1
            wb.ho.i4(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L353
        L350:
            r1.V()
        L353:
            return r16
        L354:
            r8 = r30
            i0.h0 r8 = (i0.h0) r8
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L366
            r4 = r15
            goto L367
        L366:
            r4 = r13
        L367:
            r1 = r1 & r15
            boolean r1 = r8.S(r1, r4)
            if (r1 == 0) goto L3f8
            java.lang.Object r1 = r3.getValue()
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            java.util.List r22 = wb.ho.f16642j
            java.lang.Object r1 = r8.P()
            if (r1 != r14) goto L388
            wb.tg r1 = new wb.tg
            r4 = 23
            r1.<init>(r3, r4)
            r8.k0(r1)
        L388:
            r24 = r1
            fg.l r24 = (fg.l) r24
            r26 = 196614(0x30006, float:2.75515E-40)
            r27 = 16
            java.lang.String r19 = "通知标题模板"
            java.lang.String r20 = "默认：%keyword% %sender%"
            r23 = 0
            r25 = r8
            wb.ho.i4(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            wb.ho.D1(r12, r8, r13, r15)
            java.lang.Object r1 = r2.getValue()
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            java.lang.Object r1 = r8.P()
            if (r1 != r14) goto L3b7
            wb.tg r1 = new wb.tg
            r3 = 24
            r1.<init>(r2, r3)
            r8.k0(r1)
        L3b7:
            r24 = r1
            fg.l r24 = (fg.l) r24
            r26 = 221190(0x36006, float:3.09953E-40)
            r27 = 0
            java.lang.String r19 = "通知内容模板"
            java.lang.String r20 = "默认：%content%"
            r23 = 3
            r25 = r8
            wb.ho.i4(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            wb.ho.D1(r12, r8, r13, r15)
            java.lang.Object r1 = r9.getValue()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r8.P()
            if (r1 != r14) goto L3e5
            wb.tg r1 = new wb.tg
            r2 = 25
            r1.<init>(r9, r2)
            r8.k0(r1)
        L3e5:
            r7 = r1
            fg.l r7 = (fg.l) r7
            r9 = 196614(0x30006, float:2.75515E-40)
            r10 = 16
            java.lang.String r2 = "Toast 文字模板"
            java.lang.String r3 = "默认：%keyword%"
            r6 = 0
            r5 = r22
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L3fb
        L3f8:
            r8.V()
        L3fb:
            return r16
        L3fc:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r5 = r31
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5 & 3
            if (r6 == r11) goto L40e
            r6 = r15
            goto L40f
        L40e:
            r6 = r13
        L40f:
            r5 = r5 & r15
            boolean r5 = r1.S(r5, r6)
            if (r5 == 0) goto L4c5
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            boolean r6 = r1.f(r3)
            java.lang.Object r7 = r1.P()
            if (r6 != 0) goto L42c
            if (r7 != r14) goto L436
        L42c:
            wb.gi r7 = new wb.gi
            r6 = 19
            r7.<init>(r3, r6)
            r1.k0(r7)
        L436:
            r21 = r7
            fg.l r21 = (fg.l) r21
            r23 = 432(0x1b0, float:6.05E-43)
            r24 = 8
            java.lang.String r18 = "开启时段静默"
            java.lang.String r19 = "指定时间内不弹通知"
            r20 = 0
            r22 = r1
            r17 = r5
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4bb
            r3 = 1093905866(0x4133adca, float:11.229929)
            r1.a0(r3)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r2.getValue()
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            boolean r3 = r1.f(r2)
            java.lang.Object r5 = r1.P()
            if (r3 != 0) goto L474
            if (r5 != r14) goto L47c
        L474:
            wb.gi r5 = new wb.gi
            r5.<init>(r2, r10)
            r1.k0(r5)
        L47c:
            r19 = r5
            fg.l r19 = (fg.l) r19
            r17 = 6
            r18 = 4
            java.lang.String r21 = "开始时间"
            r23 = 0
            r20 = r1
            wb.ho.X3(r17, r18, r19, r20, r21, r22, r23)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r2 = r1.f(r9)
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L4a3
            if (r3 != r14) goto L4ab
        L4a3:
            wb.gi r3 = new wb.gi
            r3.<init>(r9, r4)
            r1.k0(r3)
        L4ab:
            fg.l r3 = (fg.l) r3
            r4 = r1
            r1 = 6
            r2 = 4
            java.lang.String r5 = "结束时间"
            r7 = 0
            wb.ho.X3(r1, r2, r3, r4, r5, r6, r7)
            r1 = r4
            r1.p(r13)
            goto L4c8
        L4bb:
            r2 = 1094154765(0x41377a0d, float:11.467298)
            r1.a0(r2)
            r1.p(r13)
            goto L4c8
        L4c5:
            r1.V()
        L4c8:
            return r16
        L4c9:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L4db
            r5 = r15
            goto L4dc
        L4db:
            r5 = r13
        L4dc:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto L537
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.String r2 = wb.ho.t5(r2)
            boolean r4 = r1.f(r3)
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L4f9
            if (r5 != r14) goto L503
        L4f9:
            wb.bf r5 = new wb.bf
            r4 = 17
            r5.<init>(r3, r4)
            r1.k0(r5)
        L503:
            fg.a r5 = (fg.a) r5
            java.lang.String r4 = "私聊红包回复"
            r6 = 6
            wb.ho.x3(r4, r2, r5, r1, r6)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.String r2 = wb.ho.t5(r2)
            boolean r4 = r1.f(r3)
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L524
            if (r5 != r14) goto L52e
        L524:
            wb.bf r5 = new wb.bf
            r4 = 18
            r5.<init>(r3, r4)
            r1.k0(r5)
        L52e:
            fg.a r5 = (fg.a) r5
            java.lang.String r3 = "群红包回复"
            r6 = 6
            wb.ho.x3(r3, r2, r5, r1, r6)
            goto L53a
        L537:
            r1.V()
        L53a:
            return r16
        L53b:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L54d
            r5 = r15
            goto L54e
        L54d:
            r5 = r13
        L54e:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto L5eb
            java.lang.Object r4 = r3.getValue()
            r19 = r4
            java.lang.String r19 = (java.lang.String) r19
            boolean r4 = r1.f(r3)
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L569
            if (r5 != r14) goto L573
        L569:
            wb.bi r5 = new wb.bi
            r4 = 25
            r5.<init>(r3, r4)
            r1.k0(r5)
        L573:
            r21 = r5
            fg.l r21 = (fg.l) r21
            r23 = 54
            r24 = 8
            java.lang.String r17 = "模板名称"
            java.lang.String r18 = "用于列表和批量套用"
            r20 = 0
            r22 = r1
            wb.ho.C1(r17, r18, r19, r20, r21, r22, r23, r24)
            r11 = r22
            wb.ho.D1(r12, r11, r13, r15)
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            boolean r1 = r11.f(r2)
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L5a1
            if (r3 != r14) goto L5ab
        L5a1:
            wb.bi r3 = new wb.bi
            r1 = 26
            r3.<init>(r2, r1)
            r11.k0(r3)
        L5ab:
            r21 = r3
            fg.l r21 = (fg.l) r21
            r23 = 432(0x1b0, float:6.05E-43)
            r24 = 8
            java.lang.String r18 = "启用模板"
            java.lang.String r19 = "关闭后已绑定群不会发送改名提醒"
            r20 = 0
            r22 = r11
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r11, r13, r15)
            java.lang.Object r1 = r9.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r11.f(r9)
            java.lang.Object r3 = r11.P()
            if (r2 != 0) goto L5d3
            if (r3 != r14) goto L5dd
        L5d3:
            wb.bi r3 = new wb.bi
            r2 = 27
            r3.<init>(r9, r2)
            r11.k0(r3)
        L5dd:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 54
            java.lang.String r7 = "整体延迟"
            java.lang.String r8 = "单位秒，0-600"
            r9 = r1
            wb.ho.w2(r7, r8, r9, r10, r11, r12)
            goto L5ef
        L5eb:
            r11 = r1
            r11.V()
        L5ef:
            return r16
        L5f0:
            r6 = r30
            i0.h0 r6 = (i0.h0) r6
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L602
            r4 = r15
            goto L603
        L602:
            r4 = r13
        L603:
            r1 = r1 & r15
            boolean r1 = r6.S(r1, r4)
            if (r1 == 0) goto L713
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            boolean r1 = r6.f(r3)
            boolean r4 = r6.f(r2)
            r1 = r1 | r4
            java.lang.Object r4 = r6.P()
            if (r1 != 0) goto L625
            if (r4 != r14) goto L62f
        L625:
            sh.m1 r4 = new sh.m1
            r1 = 12
            r4.<init>(r1, r3, r2)
            r6.k0(r4)
        L62f:
            r21 = r4
            fg.l r21 = (fg.l) r21
            r23 = 432(0x1b0, float:6.05E-43)
            r24 = 8
            java.lang.String r18 = "所有消息"
            java.lang.String r19 = "开启后该模板命中范围内全部类型生效"
            r20 = 0
            r22 = r6
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L709
            r1 = 1767041609(0x6952ea49, float:1.59363E25)
            r6.a0(r1)
            r1 = -1189923493(0xffffffffb913355b, float:-1.4038889E-4)
            r6.a0(r1)
            java.util.List r1 = wb.ho.n6()
            java.util.Iterator r1 = r1.iterator()
        L662:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6b3
            java.lang.Object r3 = r1.next()
            wb.e6 r3 = (wb.e6) r3
            wb.ho.D1(r12, r6, r13, r15)
            java.lang.Object r4 = r9.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r5 = r3.f15834a
            boolean r17 = r4.contains(r5)
            java.lang.String r4 = r3.f15835b
            java.lang.String r5 = r3.f15836c
            boolean r7 = r6.f(r9)
            boolean r8 = r6.f(r3)
            r7 = r7 | r8
            boolean r8 = r6.f(r2)
            r7 = r7 | r8
            java.lang.Object r8 = r6.P()
            if (r7 != 0) goto L697
            if (r8 != r14) goto L69f
        L697:
            wb.mh r8 = new wb.mh
            r8.<init>(r3, r9, r2, r15)
            r6.k0(r8)
        L69f:
            r21 = r8
            fg.l r21 = (fg.l) r21
            r23 = 0
            r24 = 8
            r20 = 0
            r18 = r4
            r19 = r5
            r22 = r6
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L662
        L6b3:
            r6.p(r13)
            java.lang.Object r1 = r9.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r3 = "text"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L6fc
            r1 = 1767937540(0x69609604, float:1.6969238E25)
            r6.a0(r1)
            wb.ho.D1(r12, r6, r13, r15)
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r6.f(r2)
            java.lang.Object r4 = r6.P()
            if (r1 != 0) goto L6e0
            if (r4 != r14) goto L6ea
        L6e0:
            wb.oh r4 = new wb.oh
            r1 = 11
            r4.<init>(r2, r1)
            r6.k0(r4)
        L6ea:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r7 = 3126(0xc36, float:4.38E-42)
            r8 = 0
            java.lang.String r1 = "文字关键词"
            java.lang.String r2 = "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中"
            r4 = 2
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r13)
            goto L705
        L6fc:
            r1 = 1768282539(0x6965d9ab, float:1.7366995E25)
            r6.a0(r1)
            r6.p(r13)
        L705:
            r6.p(r13)
            goto L716
        L709:
            r1 = 1768304363(0x69662eeb, float:1.7392156E25)
            r6.a0(r1)
            r6.p(r13)
            goto L716
        L713:
            r6.V()
        L716:
            return r16
        L717:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            if (r5 == r11) goto L729
            r5 = r15
            goto L72a
        L729:
            r5 = r13
        L72a:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r5)
            if (r4 == 0) goto L7be
            java.lang.Object r4 = r3.getValue()
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            java.util.List r21 = wb.ho.f16642j
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L74b
            wb.tg r4 = new wb.tg
            r5 = 18
            r4.<init>(r3, r5)
            r1.k0(r4)
        L74b:
            r23 = r4
            fg.l r23 = (fg.l) r23
            r25 = 196614(0x30006, float:2.75515E-40)
            r26 = 16
            java.lang.String r18 = "通知标题模板"
            java.lang.String r19 = "默认：有人@我 %sender%"
            r22 = 0
            r24 = r1
            wb.ho.i4(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r20 = r21
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r2.getValue()
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r3 = r1.P()
            if (r3 != r14) goto L77c
            wb.tg r3 = new wb.tg
            r6 = 19
            r3.<init>(r2, r6)
            r1.k0(r3)
        L77c:
            r22 = r3
            fg.l r22 = (fg.l) r22
            r24 = 221190(0x36006, float:3.09953E-40)
            r25 = 0
            java.lang.String r17 = "通知内容模板"
            java.lang.String r18 = "默认：%content%"
            r21 = 3
            r23 = r1
            wb.ho.i4(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r2 = r1.P()
            if (r2 != r14) goto L7a9
            wb.tg r2 = new wb.tg
            r2.<init>(r9, r10)
            r1.k0(r2)
        L7a9:
            r22 = r2
            fg.l r22 = (fg.l) r22
            r24 = 196614(0x30006, float:2.75515E-40)
            r25 = 16
            java.lang.String r17 = "Toast 文字模板"
            java.lang.String r18 = "默认：有人 @ 你"
            r21 = 0
            r23 = r1
            wb.ho.i4(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L7c1
        L7be:
            r1.V()
        L7c1:
            return r16
        L7c2:
            r7 = r30
            i0.h0 r7 = (i0.h0) r7
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L7d4
            r4 = r15
            goto L7d5
        L7d4:
            r4 = r13
        L7d5:
            r1 = r1 & r15
            boolean r1 = r7.S(r1, r4)
            if (r1 == 0) goto L866
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L7f6
            wb.ab r1 = new wb.ab
            r4 = 16
            r1.<init>(r3, r4)
            r7.k0(r1)
        L7f6:
            r21 = r1
            fg.l r21 = (fg.l) r21
            r23 = 25008(0x61b0, float:3.5044E-41)
            r24 = 8
            java.lang.String r18 = "消息显示时间"
            java.lang.String r19 = "开启后按所选位置显示自定义消息时间"
            r20 = 0
            r22 = r7
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r7, r13, r15)
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L826
            wb.ab r1 = new wb.ab
            r4 = 17
            r1.<init>(r2, r4)
            r7.k0(r1)
        L826:
            r21 = r1
            fg.l r21 = (fg.l) r21
            r23 = 25008(0x61b0, float:3.5044E-41)
            r24 = 8
            java.lang.String r18 = "点击显详情"
            java.lang.String r19 = "点击详情文字后打开消息内容详情"
            r20 = 0
            r22 = r7
            wb.ho.P3(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r7, r13, r15)
            java.lang.Object r1 = r9.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L856
            wb.ab r1 = new wb.ab
            r4 = 18
            r1.<init>(r9, r4)
            r7.k0(r1)
        L856:
            r6 = r1
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "内容格式化"
            java.lang.String r4 = "打开详情时格式化 XML 内容"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L869
        L866:
            r7.V()
        L869:
            return r16
        L86a:
            r1 = r30
            i0.h0 r1 = (i0.h0) r1
            r4 = r31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = r4 & 3
            if (r6 == r11) goto L87c
            r6 = r15
            goto L87d
        L87c:
            r6 = r13
        L87d:
            r4 = r4 & r15
            boolean r4 = r1.S(r4, r6)
            if (r4 == 0) goto L908
            java.lang.Object r4 = r3.getValue()
            r19 = r4
            java.lang.String r19 = (java.lang.String) r19
            java.util.List r20 = wb.ho.f16645m
            java.lang.Object r4 = r1.P()
            if (r4 != r14) goto L89c
            wb.zd r4 = new wb.zd
            r4.<init>(r3, r11)
            r1.k0(r4)
        L89c:
            r22 = r4
            fg.l r22 = (fg.l) r22
            r24 = 196662(0x30036, float:2.75582E-40)
            r25 = 16
            java.lang.String r17 = "文本格式"
            java.lang.String r18 = "留空使用默认格式"
            r21 = 0
            r23 = r1
            wb.ho.i4(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r3 = r2.getValue()
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r3 = r1.P()
            if (r3 != r14) goto L8c9
            wb.zd r3 = new wb.zd
            r3.<init>(r2, r8)
            r1.k0(r3)
        L8c9:
            r21 = r3
            fg.l r21 = (fg.l) r21
            r23 = 24630(0x6036, float:3.4514E-41)
            r24 = 8
            java.lang.String r17 = "时间格式"
            java.lang.String r18 = "使用日期格式，例如 yyyy-MM-dd HH:mm:ss"
            r20 = 0
            r22 = r1
            wb.ho.C1(r17, r18, r19, r20, r21, r22, r23, r24)
            wb.ho.D1(r12, r1, r13, r15)
            java.lang.Object r2 = r9.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r8 = r2.booleanValue()
            java.lang.Object r2 = r1.P()
            if (r2 != r14) goto L8f7
            wb.zd r2 = new wb.zd
            r2.<init>(r9, r5)
            r1.k0(r2)
        L8f7:
            r12 = r2
            fg.l r12 = (fg.l) r12
            r14 = 25008(0x61b0, float:3.5044E-41)
            r15 = 8
            java.lang.String r9 = "隐藏可见范围"
            java.lang.String r10 = "隐藏朋友圈底部的可见范围图标"
            r11 = 0
            r13 = r1
            wb.ho.P3(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L90b
        L908:
            r1.V()
        L90b:
            return r16
        L90c:
            r7 = r30
            i0.h0 r7 = (i0.h0) r7
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L91e
            r4 = r15
            goto L91f
        L91e:
            r4 = r13
        L91f:
            r1 = r1 & r15
            boolean r1 = r7.S(r1, r4)
            if (r1 == 0) goto L9cd
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r18 = r1.booleanValue()
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L940
            wb.zd r1 = new wb.zd
            r4 = 17
            r1.<init>(r3, r4)
            r7.k0(r1)
        L940:
            r22 = r1
            fg.l r22 = (fg.l) r22
            r24 = 25008(0x61b0, float:3.5044E-41)
            r25 = 8
            java.lang.String r19 = "发送文本格式"
            java.lang.String r20 = "将聊天发送的文字按自定义格式处理"
            r21 = 0
            r23 = r7
            wb.ho.P3(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L9c3
            r1 = -196295545(0xfffffffff44cc487, float:-6.489347E31)
            r7.a0(r1)
            wb.ho.D1(r12, r7, r13, r15)
            java.lang.Object r1 = r2.getValue()
            r20 = r1
            java.lang.String r20 = (java.lang.String) r20
            java.util.List r21 = wb.ho.f16641i
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L982
            wb.zd r1 = new wb.zd
            r4 = 18
            r1.<init>(r2, r4)
            r7.k0(r1)
        L982:
            r23 = r1
            fg.l r23 = (fg.l) r23
            r25 = 221238(0x36036, float:3.1002E-40)
            r26 = 0
            java.lang.String r18 = "文本格式"
            java.lang.String r19 = "点击下方中文变量插入到光标位置"
            r22 = 2
            r24 = r7
            wb.ho.i4(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            wb.ho.D1(r12, r7, r13, r15)
            java.lang.Object r1 = r9.getValue()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r7.P()
            if (r1 != r14) goto L9b0
            wb.zd r1 = new wb.zd
            r6 = 19
            r1.<init>(r9, r6)
            r7.k0(r1)
        L9b0:
            r6 = r1
            fg.l r6 = (fg.l) r6
            r8 = 24630(0x6036, float:3.4514E-41)
            r9 = 8
            java.lang.String r2 = "时间格式"
            java.lang.String r3 = "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r13)
            goto L9d0
        L9c3:
            r1 = -195657441(0xfffffffff456811f, float:-6.797915E31)
            r7.a0(r1)
            r7.p(r13)
            goto L9d0
        L9cd:
            r7.V()
        L9d0:
            return r16
    }
}
