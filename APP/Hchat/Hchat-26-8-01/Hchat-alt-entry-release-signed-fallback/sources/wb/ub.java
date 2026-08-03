package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19446u;

    public /* synthetic */ ub(android.content.SharedPreferences r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15) {
            r1 = this;
            r0 = 0
            r1.f19432g = r0
            r1.<init>()
            r1.f19446u = r2
            r1.f19433h = r3
            r1.f19434i = r4
            r1.f19435j = r5
            r1.f19436k = r6
            r1.f19437l = r7
            r1.f19438m = r8
            r1.f19439n = r9
            r1.f19440o = r10
            r1.f19441p = r11
            r1.f19442q = r12
            r1.f19443r = r13
            r1.f19444s = r14
            r1.f19445t = r15
            return
    }

    public /* synthetic */ ub(i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15) {
            r1 = this;
            r0 = 1
            r1.f19432g = r0
            r1.<init>()
            r1.f19433h = r2
            r1.f19434i = r3
            r1.f19435j = r4
            r1.f19436k = r5
            r1.f19437l = r6
            r1.f19438m = r7
            r1.f19439n = r8
            r1.f19440o = r9
            r1.f19441p = r10
            r1.f19442q = r11
            r1.f19443r = r12
            r1.f19444s = r13
            r1.f19445t = r14
            r1.f19446u = r15
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
            r24 = this;
            r0 = r24
            int r1 = r0.f19432g
            switch(r1) {
                case 0: goto L390;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f19446u
            i0.a1 r1 = (i0.a1) r1
            r7 = r25
            i0.h0 r7 = (i0.h0) r7
            r2 = r26
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r10 = 1
            r11 = 0
            if (r3 == r4) goto L20
            r3 = r10
            goto L21
        L20:
            r3 = r11
        L21:
            r2 = r2 & r10
            boolean r2 = r7.S(r2, r3)
            if (r2 == 0) goto L38a
            i0.a1 r12 = r0.f19433h
            java.lang.Object r2 = r12.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != r13) goto L46
            wb.ih r3 = new wb.ih
            r4 = 8
            r3.<init>(r12, r4)
            r7.k0(r3)
        L46:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用震动"
            java.lang.String r4 = "批量修改震动状态"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r12.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r12 = 0
            if (r2 == 0) goto L9b
            r2 = -240955649(0xfffffffff1a34eff, float:-1.6173298E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19434i
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L87
            wb.ih r4 = new wb.ih
            r5 = 13
            r4.<init>(r2, r5)
            r7.k0(r4)
        L87:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "震动"
            java.lang.String r4 = "通知时震动"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto La4
        L9b:
            r2 = -240823992(0xfffffffff1a55148, float:-1.6372253E30)
            r7.a0(r2)
            r7.p(r11)
        La4:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19435j
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto Lc3
            wb.ih r3 = new wb.ih
            r4 = 14
            r3.<init>(r14, r4)
            r7.k0(r3)
        Lc3:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用铃声"
            java.lang.String r4 = "批量修改铃声状态，不修改每个会话已选铃声文件"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L117
            r2 = -240653151(0xfffffffff1a7eca1, float:-1.663042E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19436k
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L103
            wb.ih r4 = new wb.ih
            r5 = 15
            r4.<init>(r2, r5)
            r7.k0(r4)
        L103:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "铃声"
            java.lang.String r4 = "通知时播放铃声"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L120
        L117:
            r2 = -240523416(0xfffffffff1a9e768, float:-1.682647E30)
            r7.a0(r2)
            r7.p(r11)
        L120:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19437l
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L13f
            wb.ih r3 = new wb.ih
            r4 = 16
            r3.<init>(r14, r4)
            r7.k0(r3)
        L13f:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用已读按钮"
            java.lang.String r4 = "批量修改通知栏已读按钮"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L193
            r2 = -240352141(0xfffffffff1ac8473, float:-1.7085294E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19438m
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L17f
            wb.ih r4 = new wb.ih
            r5 = 17
            r4.<init>(r2, r5)
            r7.k0(r4)
        L17f:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "已读按钮"
            java.lang.String r4 = "通知栏直接标记当前会话已读"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L19c
        L193:
            r2 = -240208952(0xfffffffff1aeb3c8, float:-1.7301675E30)
            r7.a0(r2)
            r7.p(r11)
        L19c:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19439n
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L1bb
            wb.ih r3 = new wb.ih
            r4 = 18
            r3.<init>(r14, r4)
            r7.k0(r3)
        L1bb:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用快捷回复"
            java.lang.String r4 = "批量修改通知栏快捷回复"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L20f
            r2 = -240031663(0xfffffffff1b16851, float:-1.7569586E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19440o
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L1fb
            wb.ih r4 = new wb.ih
            r5 = 19
            r4.<init>(r2, r5)
            r7.k0(r4)
        L1fb:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "快捷回复"
            java.lang.String r4 = "通知栏直接回复文本消息"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L218
        L20f:
            r2 = -239886552(0xfffffffff1b39f28, float:-1.7788872E30)
            r7.a0(r2)
            r7.p(r11)
        L218:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19441p
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L237
            wb.ih r3 = new wb.ih
            r4 = 20
            r3.<init>(r14, r4)
            r7.k0(r3)
        L237:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用引用消息回复"
            java.lang.String r4 = "批量修改快捷回复是否引用原消息"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L28b
            r2 = -239642675(0xfffffffff1b757cd, float:-1.8157408E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19442q
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L277
            wb.ih r4 = new wb.ih
            r5 = 21
            r4.<init>(r2, r5)
            r7.k0(r4)
        L277:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "引用消息回复"
            java.lang.String r4 = "快捷回复时引用触发通知的原消息"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L294
        L28b:
            r2 = -239432216(0xfffffffff1ba8de8, float:-1.8475445E30)
            r7.a0(r2)
            r7.p(r11)
        L294:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19443r
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L2b3
            wb.ih r3 = new wb.ih
            r4 = 9
            r3.<init>(r14, r4)
            r7.k0(r3)
        L2b3:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用通知展示方式"
            java.lang.String r4 = "批量设置同会话通知合并或分散"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L307
            r2 = -239240512(0xfffffffff1bd7ac0, float:-1.876514E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r2 = r0.f19444s
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r4 = r7.P()
            if (r4 != r13) goto L2f3
            wb.ih r4 = new wb.ih
            r5 = 10
            r4.<init>(r2, r5)
            r7.k0(r4)
        L2f3:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            r2 = r3
            java.lang.String r3 = "合并同会话通知"
            java.lang.String r4 = "同一 wxid 的新消息更新到一条通知"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L310
        L307:
            r2 = -239079064(0xfffffffff1bff168, float:-1.9009113E30)
            r7.a0(r2)
            r7.p(r11)
        L310:
            wb.ho.D1(r12, r7, r11, r10)
            i0.a1 r14 = r0.f19445t
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L32f
            wb.ih r3 = new wb.ih
            r4 = 11
            r3.<init>(r14, r4)
            r7.k0(r3)
        L32f:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "应用消息详情"
            java.lang.String r4 = "批量修改通知内容是否显示详情"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L380
            r2 = -238898675(0xfffffffff1c2b20d, float:-1.928171E30)
            r7.a0(r2)
            wb.ho.D1(r12, r7, r11, r10)
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L36d
            wb.ih r3 = new wb.ih
            r4 = 12
            r3.<init>(r1, r4)
            r7.k0(r3)
        L36d:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "显示消息详情"
            java.lang.String r4 = "关闭后只显示收到一条新消息"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L38d
        L380:
            r1 = -238749720(0xfffffffff1c4f7e8, float:-1.9506804E30)
            r7.a0(r1)
            r7.p(r11)
            goto L38d
        L38a:
            r7.V()
        L38d:
            sf.n r1 = sf.n.f12433a
            return r1
        L390:
            java.lang.Object r1 = r0.f19446u
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r7 = r25
            i0.h0 r7 = (i0.h0) r7
            r2 = r26
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r3 = r2 & 3
            r14 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r3 == r14) goto L3b5
            r3 = r10
            goto L3b6
        L3b5:
            r3 = r12
        L3b6:
            r2 = r2 & r10
            boolean r2 = r7.S(r2, r3)
            if (r2 == 0) goto L745
            i0.a1 r2 = r0.f19433h
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "只接收白名单"
            java.lang.String r5 = "拒收黑名单"
            java.lang.String r6 = "全部接收"
            if (r3 == r10) goto L3d7
            if (r3 == r14) goto L3d5
            r3 = r6
            goto L3d8
        L3d5:
            r3 = r5
            goto L3d8
        L3d7:
            r3 = r4
        L3d8:
            sf.e r8 = new sf.e
            r8.<init>(r6, r13)
            sf.e r6 = new sf.e
            r6.<init>(r4, r11)
            sf.e r4 = new sf.e
            r4.<init>(r5, r15)
            sf.e[] r4 = new sf.e[]{r8, r6, r4}
            java.util.ArrayList r4 = wb.ho.w6(r4)
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r6 = r7.h(r1)
            java.lang.Object r8 = r7.P()
            i0.e r9 = i0.l.f5952a
            if (r6 != 0) goto L407
            if (r8 != r9) goto L410
        L407:
            wb.me r8 = new wb.me
            r6 = 7
            r8.<init>(r1, r2, r6)
            r7.k0(r8)
        L410:
            r6 = r8
            fg.l r6 = (fg.l) r6
            r8 = r7
            r7 = 0
            r16 = r9
            r9 = 6
            r17 = r2
            java.lang.String r2 = "收款范围"
            r22 = r16
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r17.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 0
            if (r2 == r10) goto L447
            java.lang.Object r2 = r17.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r14) goto L43b
            goto L447
        L43b:
            r2 = 1776408277(0x69e1d6d5, float:3.4127853E25)
            r8.a0(r2)
            r8.p(r12)
            r9 = r22
            goto L4a8
        L447:
            r2 = 1775842248(0x69d933c8, float:3.282268E25)
            r8.a0(r2)
            wb.ho.D1(r3, r8, r12, r10)
            java.lang.Object r2 = r17.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r10) goto L45f
            java.lang.String r2 = "白名单"
            goto L461
        L45f:
            java.lang.String r2 = "黑名单"
        L461:
            java.lang.Object r4 = r17.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            i0.a1 r5 = r0.f19434i
            i0.a1 r6 = r0.f19435j
            if (r4 != r10) goto L478
            java.lang.Object r4 = r5.getValue()
            java.lang.String r4 = (java.lang.String) r4
            goto L47e
        L478:
            java.lang.Object r4 = r6.getValue()
            java.lang.String r4 = (java.lang.String) r4
        L47e:
            java.lang.String r4 = wb.ho.O4(r4)
            java.lang.Object r7 = r8.P()
            r9 = r22
            if (r7 != r9) goto L49e
            wb.af r16 = new wb.af
            r21 = 0
            i0.a1 r7 = r0.f19436k
            r18 = r5
            r19 = r6
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            r7 = r16
            r8.k0(r7)
        L49e:
            fg.a r7 = (fg.a) r7
            r5 = 384(0x180, float:5.38E-43)
            wb.ho.b(r2, r4, r7, r8, r5)
            r8.p(r12)
        L4a8:
            wb.ho.D1(r3, r8, r12, r10)
            i0.a1 r2 = r0.f19437l
            java.lang.Object r4 = r2.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r5 = r8.h(r1)
            java.lang.Object r6 = r8.P()
            if (r5 != 0) goto L4c3
            if (r6 != r9) goto L4cd
        L4c3:
            wb.me r6 = new wb.me
            r5 = 8
            r6.<init>(r1, r2, r5)
            r8.k0(r6)
        L4cd:
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 432(0x1b0, float:6.05E-43)
            r16 = r9
            r9 = 8
            r5 = r3
            java.lang.String r3 = "启用金额规则"
            r17 = r2
            r2 = r4
            java.lang.String r4 = "按转账金额决定接收或拒收"
            r18 = r5
            r5 = 0
            r23 = r16
            r14 = r18
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            java.lang.Object r2 = r17.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5ea
            r2 = 1776696701(0x69e63d7d, float:3.4792914E25)
            r8.a0(r2)
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r2 = r0.f19438m
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "大于"
            java.lang.String r5 = "等于"
            java.lang.String r6 = "小于"
            if (r3 == 0) goto L519
            r7 = 2
            if (r3 == r7) goto L517
            r3 = r6
            goto L51a
        L517:
            r3 = r5
            goto L51a
        L519:
            r3 = r4
        L51a:
            sf.e r7 = new sf.e
            r7.<init>(r4, r13)
            sf.e r4 = new sf.e
            r4.<init>(r6, r11)
            sf.e r6 = new sf.e
            r6.<init>(r5, r15)
            sf.e[] r4 = new sf.e[]{r7, r4, r6}
            java.util.ArrayList r4 = wb.ho.w6(r4)
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r6 = r8.h(r1)
            java.lang.Object r7 = r8.P()
            if (r6 != 0) goto L54a
            r6 = r23
            if (r7 != r6) goto L556
            goto L54c
        L54a:
            r6 = r23
        L54c:
            wb.me r7 = new wb.me
            r9 = 9
            r7.<init>(r1, r2, r9)
            r8.k0(r7)
        L556:
            fg.l r7 = (fg.l) r7
            r16 = r6
            r6 = r7
            r7 = 0
            r9 = 6
            java.lang.String r2 = "金额条件"
            r26 = r15
            r15 = r16
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r2 = r0.f19439n
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r8.P()
            if (r3 != r15) goto L581
            wb.ze r3 = new wb.ze
            r5 = 4
            r3.<init>(r2, r5)
            r8.k0(r3)
        L581:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 24630(0x6036, float:3.4514E-41)
            r9 = 8
            java.lang.String r2 = "金额数值"
            java.lang.String r3 = "单位元，例如 10.5"
            r5 = 0
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r2 = r0.f19440o
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "拒收/忽略"
            java.lang.String r5 = "仅接收满足条件"
            if (r3 != r10) goto L5a9
            r3 = r5
            goto L5aa
        L5a9:
            r3 = r4
        L5aa:
            sf.e r6 = new sf.e
            r6.<init>(r4, r13)
            sf.e r4 = new sf.e
            r4.<init>(r5, r11)
            sf.e[] r4 = new sf.e[]{r6, r4}
            java.util.ArrayList r4 = wb.ho.w6(r4)
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r6 = r8.h(r1)
            java.lang.Object r7 = r8.P()
            if (r6 != 0) goto L5d2
            if (r7 != r15) goto L5dc
        L5d2:
            wb.me r7 = new wb.me
            r6 = 10
            r7.<init>(r1, r2, r6)
            r8.k0(r7)
        L5dc:
            r6 = r7
            fg.l r6 = (fg.l) r6
            r7 = 0
            r9 = 6
            java.lang.String r2 = "命中后动作"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            r8.p(r12)
            goto L5f7
        L5ea:
            r26 = r15
            r15 = r23
            r2 = 1777427061(0x69f16275, float:3.647701E25)
            r8.a0(r2)
            r8.p(r12)
        L5f7:
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r2 = r0.f19441p
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "必须包含关键词"
            java.lang.String r5 = "包含则拒收"
            java.lang.String r6 = "不启用"
            if (r3 == r10) goto L615
            r7 = 2
            if (r3 == r7) goto L613
            r3 = r6
            goto L616
        L613:
            r3 = r5
            goto L616
        L615:
            r3 = r4
        L616:
            sf.e r7 = new sf.e
            r7.<init>(r6, r13)
            sf.e r6 = new sf.e
            r6.<init>(r4, r11)
            sf.e r4 = new sf.e
            r9 = r26
            r4.<init>(r5, r9)
            sf.e[] r4 = new sf.e[]{r7, r6, r4}
            java.util.ArrayList r4 = wb.ho.w6(r4)
            java.lang.Object r5 = r2.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r6 = r8.h(r1)
            java.lang.Object r7 = r8.P()
            if (r6 != 0) goto L645
            if (r7 != r15) goto L64f
        L645:
            wb.me r7 = new wb.me
            r6 = 11
            r7.<init>(r1, r2, r6)
            r8.k0(r7)
        L64f:
            r6 = r7
            fg.l r6 = (fg.l) r6
            r7 = 0
            r9 = 6
            r1 = r2
            java.lang.String r2 = "关键词规则"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L69b
            r1 = 1777790040(0x69f6ec58, float:3.7313982E25)
            r8.a0(r1)
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r1 = r0.f19442q
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r8.P()
            if (r2 != r15) goto L687
            wb.ze r2 = new wb.ze
            r3 = 5
            r2.<init>(r1, r3)
            r8.k0(r2)
        L687:
            r6 = r2
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 27702(0x6c36, float:3.8819E-41)
            r9 = 0
            java.lang.String r2 = "关键词"
            java.lang.String r3 = "多个关键词用 |、逗号或换行分隔"
            r5 = 2
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            r8.p(r12)
            goto L6a4
        L69b:
            r1 = 1777940917(0x69f939b5, float:3.766188E25)
            r8.a0(r1)
            r8.p(r12)
        L6a4:
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r1 = r0.f19443r
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r3 = r8.P()
            if (r3 != r15) goto L6c2
            wb.ze r3 = new wb.ze
            r4 = 6
            r3.<init>(r1, r4)
            r8.k0(r3)
        L6c2:
            r6 = r3
            fg.l r6 = (fg.l) r6
            r7 = r8
            r8 = 25008(0x61b0, float:3.5044E-41)
            r9 = 8
            java.lang.String r3 = "禁收时段"
            java.lang.String r4 = "指定时段内不自动收款"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r7
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L73b
            r1 = 1778132900(0x69fc27a4, float:3.8104563E25)
            r8.a0(r1)
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r1 = r0.f19444s
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r8.P()
            if (r2 != r15) goto L700
            wb.ze r2 = new wb.ze
            r3 = 7
            r2.<init>(r1, r3)
            r8.k0(r2)
        L700:
            r4 = r2
            fg.l r4 = (fg.l) r4
            r2 = 3078(0xc06, float:4.313E-42)
            r3 = 4
            java.lang.String r6 = "开始时间"
            r5 = r8
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r8 = r5
            wb.ho.D1(r14, r8, r12, r10)
            i0.a1 r1 = r0.f19445t
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r8.P()
            if (r2 != r15) goto L729
            wb.ze r2 = new wb.ze
            r3 = 3
            r2.<init>(r1, r3)
            r8.k0(r2)
        L729:
            r4 = r2
            fg.l r4 = (fg.l) r4
            r2 = 3078(0xc06, float:4.313E-42)
            r3 = 4
            java.lang.String r6 = "结束时间"
            r5 = r8
            r8 = 0
            wb.ho.X3(r2, r3, r4, r5, r6, r7, r8)
            r8 = r5
            r8.p(r12)
            goto L749
        L73b:
            r1 = 1778364501(0x69ffb055, float:3.8638599E25)
            r8.a0(r1)
            r8.p(r12)
            goto L749
        L745:
            r8 = r7
            r8.V()
        L749:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
