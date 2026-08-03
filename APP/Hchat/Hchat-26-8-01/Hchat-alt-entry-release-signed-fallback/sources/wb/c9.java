package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15399i;

    public /* synthetic */ c9(android.content.Context r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f15397g = r3
            r0.f15398h = r1
            r0.f15399i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f15397g
            switch(r0) {
                case 0: goto L301;
                case 1: goto L2bc;
                case 2: goto L251;
                case 3: goto L198;
                case 4: goto L144;
                case 5: goto L6d;
                case 6: goto L39;
                default: goto L5;
            }
        L5:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            android.content.Context r0 = r10.f15398h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1b
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L29
            java.lang.String r11 = "当前页面无法打开文件选择器"
            r12 = 0
            android.widget.Toast r11 = android.widget.Toast.makeText(r0, r11, r12)
            r11.show()
            goto L36
        L29:
            wb.wq r0 = wb.wq.f20020a
            wb.w6 r2 = new wb.w6
            r3 = 0
            i0.a1 r4 = r10.f15399i
            r2.<init>(r11, r12, r4, r3)
            r0.b(r1, r12, r2)
        L36:
            sf.n r11 = sf.n.f12433a
            return r11
        L39:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            android.content.Context r0 = r10.f15398h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4f
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L50
        L4f:
            r1 = 0
        L50:
            if (r1 != 0) goto L5d
            java.lang.String r11 = "当前页面无法打开文件选择器"
            r12 = 0
            android.widget.Toast r11 = android.widget.Toast.makeText(r0, r11, r12)
            r11.show()
            goto L6a
        L5d:
            wb.wq r0 = wb.wq.f20020a
            wb.w6 r2 = new wb.w6
            r3 = 1
            i0.a1 r4 = r10.f15399i
            r2.<init>(r11, r12, r4, r3)
            r0.b(r1, r12, r2)
        L6a:
            sf.n r11 = sf.n.f12433a
            return r11
        L6d:
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = r12 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L7e
            r0 = r2
            goto L7f
        L7e:
            r0 = r3
        L7f:
            r12 = r12 & r2
            boolean r12 = r11.S(r12, r0)
            if (r12 == 0) goto L13e
            i0.a1 r12 = r10.f15399i
            java.lang.Object r0 = r12.getValue()
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r1 = r10.f15398h
            java.lang.String r0 = wb.ho.Q6(r1, r0, r3)
            boolean r4 = r11.h(r1)
            boolean r5 = r11.f(r12)
            r4 = r4 | r5
            java.lang.Object r5 = r11.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto La7
            if (r5 != r6) goto Lb0
        La7:
            wb.dd r5 = new wb.dd
            r4 = 5
            r5.<init>(r1, r12, r4)
            r11.k0(r5)
        Lb0:
            fg.a r5 = (fg.a) r5
            java.lang.String r4 = "选择系统铃声"
            r7 = 6
            wb.ho.b(r4, r0, r5, r11, r7)
            r0 = 0
            wb.ho.D1(r0, r11, r3, r2)
            java.lang.Object r4 = r12.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto Lcb
            java.lang.String r4 = "未选择"
            goto Ld5
        Lcb:
            java.lang.Object r4 = r12.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = wb.ho.Q6(r1, r4, r2)
        Ld5:
            boolean r5 = r11.h(r1)
            boolean r8 = r11.f(r12)
            r5 = r5 | r8
            java.lang.Object r8 = r11.P()
            if (r5 != 0) goto Le6
            if (r8 != r6) goto Lef
        Le6:
            wb.dd r8 = new wb.dd
            r5 = 6
            r8.<init>(r1, r12, r5)
            r11.k0(r8)
        Lef:
            fg.a r8 = (fg.a) r8
            java.lang.String r5 = "从文件选择铃声"
            wb.ho.b(r5, r4, r8, r11, r7)
            java.lang.Object r4 = r12.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L134
            r4 = 1264972725(0x4b65f3b5, float:1.5070133E7)
            r11.a0(r4)
            wb.ho.D1(r0, r11, r3, r2)
            boolean r0 = r11.f(r12)
            boolean r2 = r11.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L11c
            if (r2 != r6) goto L125
        L11c:
            wb.dd r2 = new wb.dd
            r0 = 7
            r2.<init>(r1, r12, r0)
            r11.k0(r2)
        L125:
            fg.a r2 = (fg.a) r2
            r12 = 54
            java.lang.String r0 = "清空铃声"
            java.lang.String r1 = "恢复跟随系统"
            wb.ho.b(r0, r1, r2, r11, r12)
            r11.p(r3)
            goto L141
        L134:
            r12 = 1265239883(0x4b6a074b, float:1.5337291E7)
            r11.a0(r12)
            r11.p(r3)
            goto L141
        L13e:
            r11.V()
        L141:
            sf.n r11 = sf.n.f12433a
            return r11
        L144:
            r5 = r11
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r1 = 1
            if (r12 == r0) goto L155
            r12 = r1
            goto L156
        L155:
            r12 = 0
        L156:
            r11 = r11 & r1
            boolean r11 = r5.S(r11, r12)
            if (r11 == 0) goto L192
            i0.a1 r11 = r10.f15399i
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            android.content.Context r12 = r10.f15398h
            boolean r1 = r5.h(r12)
            java.lang.Object r2 = r5.P()
            if (r1 != 0) goto L179
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L182
        L179:
            wb.q1 r2 = new wb.q1
            r1 = 1
            r2.<init>(r12, r11, r1)
            r5.k0(r2)
        L182:
            r4 = r2
            fg.l r4 = (fg.l) r4
            r6 = 432(0x1b0, float:6.05E-43)
            r7 = 8
            java.lang.String r1 = "悬浮快捷菜单"
            java.lang.String r2 = "在微信页面显示可自由拖动和停放的快捷入口"
            r3 = 0
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L195
        L192:
            r5.V()
        L195:
            sf.n r11 = sf.n.f12433a
            return r11
        L198:
            r3 = r11
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r6 = 0
            r7 = 1
            if (r12 == r0) goto L1aa
            r12 = r7
            goto L1ab
        L1aa:
            r12 = r6
        L1ab:
            r11 = r11 & r7
            boolean r11 = r3.S(r11, r12)
            if (r11 == 0) goto L24b
            i0.a1 r11 = r10.f15399i
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L1c4
            java.lang.String r12 = "微信已在白名单"
        L1c2:
            r1 = r12
            goto L1c7
        L1c4:
            java.lang.String r12 = "微信可能仍受系统省电影响"
            goto L1c2
        L1c7:
            r4 = 6
            r5 = 4
            java.lang.String r0 = "电池优化白名单"
            r2 = 0
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            r12 = 0
            wb.ho.D1(r12, r3, r6, r7)
            android.content.Context r0 = r10.f15398h
            boolean r1 = r3.h(r0)
            java.lang.Object r2 = r3.P()
            i0.e r4 = i0.l.f5952a
            if (r1 != 0) goto L1e3
            if (r2 != r4) goto L1ed
        L1e3:
            h9.c r2 = new h9.c
            r1 = 12
            r2.<init>(r0, r1)
            r3.k0(r2)
        L1ed:
            fg.a r2 = (fg.a) r2
            java.lang.String r1 = "打开电池优化设置"
            java.lang.String r5 = "建议把微信设置为不限制"
            r8 = 54
            wb.ho.b(r1, r5, r2, r3, r8)
            wb.ho.D1(r12, r3, r6, r7)
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L20a
            java.lang.String r1 = "当前已忽略优化"
            goto L20c
        L20a:
            java.lang.String r1 = "当前未忽略优化"
        L20c:
            boolean r2 = r3.h(r0)
            java.lang.Object r5 = r3.P()
            if (r2 != 0) goto L218
            if (r5 != r4) goto L221
        L218:
            wb.dd r5 = new wb.dd
            r2 = 2
            r5.<init>(r0, r11, r2)
            r3.k0(r5)
        L221:
            fg.a r5 = (fg.a) r5
            r2 = 6
            java.lang.String r9 = "刷新状态"
            wb.ho.b(r9, r1, r5, r3, r2)
            wb.ho.D1(r12, r3, r6, r7)
            boolean r12 = r3.h(r0)
            java.lang.Object r1 = r3.P()
            if (r12 != 0) goto L238
            if (r1 != r4) goto L241
        L238:
            wb.dd r1 = new wb.dd
            r12 = 3
            r1.<init>(r0, r11, r12)
            r3.k0(r1)
        L241:
            fg.a r1 = (fg.a) r1
            java.lang.String r11 = "立即应用保活"
            java.lang.String r12 = "重新启动服务并应用 WakeLock / Root 白名单"
            wb.ho.b(r11, r12, r1, r3, r8)
            goto L24e
        L24b:
            r3.V()
        L24e:
            sf.n r11 = sf.n.f12433a
            return r11
        L251:
            r4 = r11
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r6 = 0
            r7 = 1
            if (r12 == r0) goto L263
            r12 = r7
            goto L264
        L263:
            r12 = r6
        L264:
            r11 = r11 & r7
            boolean r11 = r4.S(r11, r12)
            if (r11 == 0) goto L2b6
            i0.a1 r11 = r10.f15399i
            int r2 = wb.ho.g2(r11)
            java.lang.Object r12 = r4.P()
            i0.e r8 = i0.l.f5952a
            if (r12 != r8) goto L282
            wb.ud r12 = new wb.ud
            r0 = 5
            r12.<init>(r11, r0)
            r4.k0(r12)
        L282:
            r3 = r12
            fg.a r3 = (fg.a) r3
            r5 = 3120(0xc30, float:4.372E-42)
            android.content.Context r0 = r10.f15398h
            ba.n r1 = ba.n.f611o
            wb.ho.e2(r0, r1, r2, r3, r4, r5)
            r12 = 0
            wb.ho.D1(r12, r4, r6, r7)
            java.lang.Object r12 = r11.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            java.lang.Object r12 = r4.P()
            if (r12 != r8) goto L2ab
            wb.ud r12 = new wb.ud
            r1 = 6
            r12.<init>(r11, r1)
            r4.k0(r12)
        L2ab:
            r3 = r12
            fg.a r3 = (fg.a) r3
            r5 = 3120(0xc30, float:4.372E-42)
            ba.n r1 = ba.n.f612p
            wb.ho.e2(r0, r1, r2, r3, r4, r5)
            goto L2b9
        L2b6:
            r4.V()
        L2b9:
            sf.n r11 = sf.n.f12433a
            return r11
        L2bc:
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = r12 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L2cc
            r0 = r2
            goto L2cd
        L2cc:
            r0 = 0
        L2cd:
            r12 = r12 & r2
            boolean r12 = r11.S(r12, r0)
            if (r12 == 0) goto L2fb
            android.content.Context r12 = r10.f15398h
            boolean r0 = r11.h(r12)
            java.lang.Object r1 = r11.P()
            if (r0 != 0) goto L2e4
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L2ef
        L2e4:
            wb.dd r1 = new wb.dd
            r0 = 4
            i0.a1 r2 = r10.f15399i
            r1.<init>(r12, r2, r0)
            r11.k0(r1)
        L2ef:
            fg.a r1 = (fg.a) r1
            r12 = 54
            java.lang.String r0 = "恢复默认"
            java.lang.String r2 = "恢复初始菜单名称示例"
            wb.ho.b(r0, r2, r1, r11, r12)
            goto L2fe
        L2fb:
            r11.V()
        L2fe:
            sf.n r11 = sf.n.f12433a
            return r11
        L301:
            r4 = r11
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r6 = 0
            r7 = 1
            if (r12 == r0) goto L313
            r12 = r7
            goto L314
        L313:
            r12 = r6
        L314:
            r11 = r11 & r7
            boolean r11 = r4.S(r11, r12)
            if (r11 == 0) goto L368
            i0.a1 r11 = r10.f15399i
            int r2 = wb.ho.g2(r11)
            java.lang.Object r12 = r4.P()
            i0.e r8 = i0.l.f5952a
            if (r12 != r8) goto L333
            wb.ud r12 = new wb.ud
            r0 = 17
            r12.<init>(r11, r0)
            r4.k0(r12)
        L333:
            r3 = r12
            fg.a r3 = (fg.a) r3
            r5 = 3120(0xc30, float:4.372E-42)
            android.content.Context r0 = r10.f15398h
            ba.n r1 = ba.n.f609m
            wb.ho.e2(r0, r1, r2, r3, r4, r5)
            r12 = 0
            wb.ho.D1(r12, r4, r6, r7)
            java.lang.Object r12 = r11.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            java.lang.Object r12 = r4.P()
            if (r12 != r8) goto L35d
            wb.ud r12 = new wb.ud
            r1 = 18
            r12.<init>(r11, r1)
            r4.k0(r12)
        L35d:
            r3 = r12
            fg.a r3 = (fg.a) r3
            r5 = 3120(0xc30, float:4.372E-42)
            ba.n r1 = ba.n.f610n
            wb.ho.e2(r0, r1, r2, r3, r4, r5)
            goto L36b
        L368:
            r4.V()
        L36b:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
