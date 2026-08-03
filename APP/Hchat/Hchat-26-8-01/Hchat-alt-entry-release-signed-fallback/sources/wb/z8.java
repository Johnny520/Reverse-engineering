package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20571v;

    public /* synthetic */ z8(android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16) {
            r1 = this;
            r0 = 0
            r1.f20556g = r0
            r1.<init>()
            r1.f20564o = r2
            r1.f20557h = r3
            r1.f20558i = r4
            r1.f20559j = r5
            r1.f20560k = r6
            r1.f20561l = r7
            r1.f20562m = r8
            r1.f20563n = r9
            r1.f20565p = r10
            r1.f20566q = r11
            r1.f20567r = r12
            r1.f20568s = r13
            r1.f20569t = r14
            r1.f20570u = r15
            r2 = r16
            r1.f20571v = r2
            return
    }

    public /* synthetic */ z8(i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, android.content.Context r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16) {
            r1 = this;
            r0 = 1
            r1.f20556g = r0
            r1.<init>()
            r1.f20557h = r2
            r1.f20558i = r3
            r1.f20559j = r4
            r1.f20560k = r5
            r1.f20561l = r6
            r1.f20562m = r7
            r1.f20563n = r8
            r1.f20564o = r9
            r1.f20565p = r10
            r1.f20566q = r11
            r1.f20567r = r12
            r1.f20568s = r13
            r1.f20569t = r14
            r1.f20570u = r15
            r2 = r16
            r1.f20571v = r2
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
            r20 = this;
            r0 = r20
            int r1 = r0.f20556g
            switch(r1) {
                case 0: goto L3fc;
                default: goto L7;
            }
        L7:
            r7 = r21
            i0.h0 r7 = (i0.h0) r7
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r11 = 1
            r12 = 0
            if (r2 == r3) goto L1c
            r2 = r11
            goto L1d
        L1c:
            r2 = r12
        L1d:
            r1 = r1 & r11
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L3f6
            i0.a1 r1 = r0.f20557h
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r3 != 0) goto L3e
            if (r4 != r13) goto L48
        L3e:
            wb.fg r4 = new wb.fg
            r3 = 21
            r4.<init>(r1, r3)
            r7.k0(r4)
        L48:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "通知栏提醒"
            java.lang.String r4 = "抢到红包时提醒"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r14 = 0
            if (r1 == 0) goto La3
            r1 = 679453875(0x287fa4b3, float:1.4191057E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20558i
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16637e
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L84
            if (r3 != r13) goto L8e
        L84:
            wb.fg r3 = new wb.fg
            r2 = 26
            r3.<init>(r1, r2)
            r7.k0(r3)
        L8e:
            fg.l r3 = (fg.l) r3
            r9 = 54
            r10 = 16
            java.lang.String r2 = "通知栏文案"
            r8 = r7
            r7 = r3
            java.lang.String r3 = "支持下方变量"
            r6 = 0
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            r7.p(r12)
            goto Lac
        La3:
            r1 = 679841158(0x28858d86, float:1.4827342E-14)
            r7.a0(r1)
            r7.p(r12)
        Lac:
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20559j
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto Lc7
            if (r4 != r13) goto Ld1
        Lc7:
            wb.fg r4 = new wb.fg
            r3 = 27
            r4.<init>(r1, r3)
            r7.k0(r4)
        Ld1:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "浮窗提醒"
            java.lang.String r4 = "抢到红包时短暂提示"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12b
            r1 = 680195178(0x288af46a, float:1.5427075E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20560k
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16637e
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L10c
            if (r3 != r13) goto L116
        L10c:
            wb.fg r3 = new wb.fg
            r2 = 28
            r3.<init>(r1, r2)
            r7.k0(r3)
        L116:
            fg.l r3 = (fg.l) r3
            r9 = 54
            r10 = 16
            java.lang.String r2 = "浮窗文案"
            r8 = r7
            r7 = r3
            java.lang.String r3 = "支持下方变量"
            r6 = 0
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            r7.p(r12)
            goto L134
        L12b:
            r1 = 680591110(0x2890ff06, float:1.609781E-14)
            r7.a0(r1)
            r7.p(r12)
        L134:
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20561l
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L14f
            if (r4 != r13) goto L159
        L14f:
            wb.fg r4 = new wb.fg
            r3 = 29
            r4.<init>(r1, r3)
            r7.k0(r4)
        L159:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "通知铃声"
            java.lang.String r4 = "开启后播放通知铃声"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L223
            r1 = 681000558(0x28973e6e, float:1.6791442E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20562m
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "选择系统铃声"
            java.lang.String r4 = "从文件选择铃声"
            if (r2 != r11) goto L191
            r2 = r4
            goto L192
        L191:
            r2 = r3
        L192:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            sf.e r6 = new sf.e
            r6.<init>(r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            sf.e r5 = new sf.e
            r5.<init>(r4, r3)
            sf.e[] r3 = new sf.e[]{r6, r5}
            java.util.ArrayList r4 = wb.ho.w6(r3)
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            boolean r3 = r7.f(r1)
            i0.a1 r10 = r0.f20563n
            boolean r6 = r7.f(r10)
            r3 = r3 | r6
            java.lang.Object r6 = r7.P()
            if (r3 != 0) goto L1c9
            if (r6 != r13) goto L1d3
        L1c9:
            sh.m1 r6 = new sh.m1
            r3 = 9
            r6.<init>(r3, r1, r10)
            r7.k0(r6)
        L1d3:
            fg.l r6 = (fg.l) r6
            r8 = r7
            r7 = 0
            r9 = 6
            r3 = r2
            java.lang.String r2 = "铃声模式"
            wb.ho.J2(r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r8
            wb.ho.D1(r14, r7, r12, r11)
            java.lang.Object r2 = r10.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            android.content.Context r4 = r0.f20564o
            java.lang.String r2 = wb.ho.Q6(r4, r2, r3)
            boolean r3 = r7.h(r4)
            boolean r5 = r7.f(r10)
            r3 = r3 | r5
            boolean r5 = r7.f(r1)
            r3 = r3 | r5
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L20e
            if (r5 != r13) goto L217
        L20e:
            wb.pc r5 = new wb.pc
            r3 = 1
            r5.<init>(r4, r1, r10, r3)
            r7.k0(r5)
        L217:
            fg.a r5 = (fg.a) r5
            r1 = 6
            java.lang.String r3 = "选择铃声"
            wb.ho.b(r3, r2, r5, r7, r1)
            r7.p(r12)
            goto L22c
        L223:
            r1 = 683114758(0x28b78106, float:2.0373036E-14)
            r7.a0(r1)
            r7.p(r12)
        L22c:
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20565p
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L247
            if (r4 != r13) goto L250
        L247:
            wb.tg r4 = new wb.tg
            r3 = 0
            r4.<init>(r1, r3)
            r7.k0(r4)
        L250:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "通知震动"
            java.lang.String r4 = "开启后触发通知震动"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20566q
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L27a
            if (r4 != r13) goto L283
        L27a:
            wb.tg r4 = new wb.tg
            r3 = 1
            r4.<init>(r1, r3)
            r7.k0(r4)
        L283:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "抢到红包播报"
            java.lang.String r4 = "抢到后用系统语音播报"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2dc
            r1 = 683763216(0x28c16610, float:2.1471567E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20567r
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16637e
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L2be
            if (r3 != r13) goto L2c7
        L2be:
            wb.tg r3 = new wb.tg
            r2 = 2
            r3.<init>(r1, r2)
            r7.k0(r3)
        L2c7:
            fg.l r3 = (fg.l) r3
            r9 = 54
            r10 = 16
            java.lang.String r2 = "播报文案"
            r8 = r7
            r7 = r3
            java.lang.String r3 = "支持下方变量"
            r6 = 0
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            r7.p(r12)
            goto L2e5
        L2dc:
            r1 = 684153382(0x28c75a26, float:2.2132534E-14)
            r7.a0(r1)
            r7.p(r12)
        L2e5:
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20568s
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L300
            if (r4 != r13) goto L30a
        L300:
            wb.fg r4 = new wb.fg
            r3 = 22
            r4.<init>(r1, r3)
            r7.k0(r4)
        L30a:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "未抢到提醒"
            java.lang.String r4 = "未抢到红包时通知"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L364
            r1 = 684528420(0x28cd1324, float:2.2767873E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20569t
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16637e
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L345
            if (r3 != r13) goto L34f
        L345:
            wb.fg r3 = new wb.fg
            r2 = 23
            r3.<init>(r1, r2)
            r7.k0(r3)
        L34f:
            fg.l r3 = (fg.l) r3
            r9 = 54
            r10 = 16
            java.lang.String r2 = "未抢到通知栏文案"
            r8 = r7
            r7 = r3
            java.lang.String r3 = "支持下方变量"
            r6 = 0
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            r7.p(r12)
            goto L36d
        L364:
            r1 = 684930118(0x28d33446, float:2.3448376E-14)
            r7.a0(r1)
            r7.p(r12)
        L36d:
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20570u
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r7.f(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L388
            if (r4 != r13) goto L392
        L388:
            wb.fg r4 = new wb.fg
            r3 = 24
            r4.<init>(r1, r3)
            r7.k0(r4)
        L392:
            r6 = r4
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            java.lang.String r3 = "未抢到浮窗"
            java.lang.String r4 = "未抢到红包时短暂提示"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3ec
            r1 = 685304443(0x28d8ea7b, float:2.4082507E-14)
            r7.a0(r1)
            wb.ho.D1(r14, r7, r12, r11)
            i0.a1 r1 = r0.f20571v
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = wb.ho.f16637e
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto L3cd
            if (r3 != r13) goto L3d7
        L3cd:
            wb.fg r3 = new wb.fg
            r2 = 25
            r3.<init>(r1, r2)
            r7.k0(r3)
        L3d7:
            fg.l r3 = (fg.l) r3
            r9 = 54
            r10 = 16
            java.lang.String r2 = "未抢到浮窗文案"
            r8 = r7
            r7 = r3
            java.lang.String r3 = "支持下方变量"
            r6 = 0
            wb.ho.i4(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r8
            r7.p(r12)
            goto L3f9
        L3ec:
            r1 = 685714790(0x28df2d66, float:2.4777662E-14)
            r7.a0(r1)
            r7.p(r12)
            goto L3f9
        L3f6:
            r7.V()
        L3f9:
            sf.n r1 = sf.n.f12433a
            return r1
        L3fc:
            r1 = r21
            i0.h0 r1 = (i0.h0) r1
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L410
            r3 = r5
            goto L411
        L410:
            r3 = 0
        L411:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L460
            android.content.Context r4 = r0.f20564o
            boolean r2 = r1.h(r4)
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L428
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L454
        L428:
            wb.sd r3 = new wb.sd
            r19 = 0
            i0.a1 r5 = r0.f20557h
            i0.a1 r6 = r0.f20558i
            i0.a1 r7 = r0.f20559j
            i0.a1 r8 = r0.f20560k
            i0.a1 r9 = r0.f20561l
            i0.a1 r10 = r0.f20562m
            i0.a1 r11 = r0.f20563n
            i0.a1 r12 = r0.f20565p
            i0.a1 r13 = r0.f20566q
            i0.a1 r14 = r0.f20567r
            i0.a1 r15 = r0.f20568s
            i0.a1 r2 = r0.f20569t
            r16 = r2
            i0.a1 r2 = r0.f20570u
            r17 = r2
            i0.a1 r2 = r0.f20571v
            r18 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.k0(r3)
        L454:
            fg.a r3 = (fg.a) r3
            r2 = 54
            java.lang.String r4 = "恢复默认"
            java.lang.String r5 = "重置本页全部消息显示时间设置"
            wb.ho.b(r4, r5, r3, r1, r2)
            goto L463
        L460:
            r1.V()
        L463:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
