package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19465m;

    public /* synthetic */ ue(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, java.util.List r6, int r7) {
            r0 = this;
            r0.f19459g = r7
            r0.f19461i = r1
            r0.f19462j = r2
            r0.f19463k = r3
            r0.f19464l = r4
            r0.f19465m = r5
            r0.f19460h = r6
            r0.<init>()
            return
    }

    public /* synthetic */ ue(java.util.List r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f19459g = r7
            r0.f19460h = r1
            r0.f19461i = r2
            r0.f19462j = r3
            r0.f19463k = r4
            r0.f19464l = r5
            r0.f19465m = r6
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
            r26 = this;
            r0 = r26
            int r1 = r0.f19459g
            r7 = r27
            i0.h0 r7 = (i0.h0) r7
            switch(r1) {
                case 0: goto L43b;
                case 1: goto L331;
                case 2: goto L227;
                default: goto Lb;
            }
        Lb:
            r1 = r28
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
            if (r1 == 0) goto L221
            i0.a1 r13 = r0.f19461i
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L40
            java.lang.String r1 = "开启后只按下方勾选屏蔽，不改动模板本身"
        L3e:
            r4 = r1
            goto L43
        L40:
            java.lang.String r1 = "关闭时跟随上方模板；开启后可直接给这个名单勾选文字、红包等类型"
            goto L3e
        L43:
            boolean r1 = r7.f(r13)
            i0.a1 r14 = r0.f19462j
            boolean r3 = r7.f(r14)
            r1 = r1 | r3
            i0.a1 r15 = r0.f19463k
            boolean r3 = r7.f(r15)
            r1 = r1 | r3
            i0.a1 r3 = r0.f19464l
            boolean r5 = r7.f(r3)
            r1 = r1 | r5
            i0.a1 r5 = r0.f19465m
            boolean r6 = r7.f(r5)
            r1 = r1 | r6
            java.util.List r6 = r0.f19460h
            boolean r8 = r7.h(r6)
            r1 = r1 | r8
            java.lang.Object r8 = r7.P()
            i0.e r9 = i0.l.f5952a
            if (r1 != 0) goto L7b
            if (r8 != r9) goto L75
            goto L7b
        L75:
            r1 = r3
            r16 = r5
            r18 = r6
            goto L90
        L7b:
            wb.kh r12 = new wb.kh
            r19 = 1
            r16 = r3
            r17 = r5
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = r16
            r16 = r17
            r7.k0(r12)
            r8 = r12
        L90:
            r6 = r8
            fg.l r6 = (fg.l) r6
            r8 = 48
            r3 = r9
            r9 = 8
            r5 = r3
            java.lang.String r3 = "本名单专属规则"
            r12 = r5
            r5 = 0
            r22 = r12
            r12 = r16
            r21 = r18
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r13.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L217
            r2 = -1060334344(0xffffffffc0cc94f8, float:-6.3931847)
            r7.a0(r2)
            r13 = 0
            wb.ho.D1(r13, r7, r11, r10)
            boolean r2 = r7.f(r12)
            r3 = r21
            boolean r4 = r7.h(r3)
            r2 = r2 | r4
            boolean r4 = r7.f(r14)
            r2 = r2 | r4
            boolean r4 = r7.f(r15)
            r2 = r2 | r4
            boolean r4 = r7.f(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r7.P()
            if (r2 != 0) goto Le6
            r2 = r22
            if (r4 != r2) goto Le3
        Le0:
            r17 = r14
            goto Le9
        Le3:
            r12 = r1
            r1 = r14
            goto L101
        Le6:
            r2 = r22
            goto Le0
        Le9:
            wb.lh r14 = new wb.lh
            r20 = 1
            r19 = r1
            r16 = r12
            r18 = r15
            r15 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1 = r17
            r15 = r18
            r12 = r19
            r7.k0(r14)
            r4 = r14
        L101:
            fg.a r4 = (fg.a) r4
            r3 = 54
            java.lang.String r5 = "套用已选模板规则"
            java.lang.String r6 = "把上方模板的类型和关键词复制到这里"
            wb.ho.b(r5, r6, r4, r7, r3)
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r3 = r1.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r7.f(r1)
            boolean r5 = r7.f(r12)
            r4 = r4 | r5
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto L12a
            if (r5 != r2) goto L134
        L12a:
            sh.m1 r5 = new sh.m1
            r4 = 15
            r5.<init>(r4, r1, r12)
            r7.k0(r5)
        L134:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            r5 = r2
            r2 = r3
            java.lang.String r3 = "所有消息"
            java.lang.String r4 = "开启后该名单命中范围内全部类型生效"
            r22 = r5
            r5 = 0
            r14 = r22
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L20a
            r1 = -1059699805(0xffffffffc0d643a3, float:-6.6957564)
            r7.a0(r1)
            r1 = -311277291(0xffffffffed724915, float:-4.6864827E27)
            r7.a0(r1)
            java.util.List r1 = wb.ho.n6()
            java.util.Iterator r1 = r1.iterator()
        L169:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b5
            java.lang.Object r2 = r1.next()
            wb.e6 r2 = (wb.e6) r2
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r3 = r15.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r4 = r2.f15834a
            boolean r3 = r3.contains(r4)
            r4 = r3
            java.lang.String r3 = r2.f15835b
            r5 = r4
            java.lang.String r4 = r2.f15836c
            boolean r6 = r7.f(r15)
            boolean r8 = r7.f(r2)
            r6 = r6 | r8
            boolean r8 = r7.f(r12)
            r6 = r6 | r8
            java.lang.Object r8 = r7.P()
            if (r6 != 0) goto L1a0
            if (r8 != r14) goto L1a9
        L1a0:
            wb.mh r8 = new wb.mh
            r6 = 2
            r8.<init>(r2, r15, r12, r6)
            r7.k0(r8)
        L1a9:
            r6 = r8
            fg.l r6 = (fg.l) r6
            r8 = 0
            r9 = 8
            r2 = r5
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L169
        L1b5:
            r7.p(r11)
            java.lang.Object r1 = r15.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r2 = "text"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1fd
            r1 = -1058738650(0xffffffffc0e4ee26, float:-7.154071)
            r7.a0(r1)
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r1 = r12.getValue()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = r7.f(r12)
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L1e2
            if (r2 != r14) goto L1eb
        L1e2:
            wb.bi r2 = new wb.bi
            r1 = 7
            r2.<init>(r12, r1)
            r7.k0(r2)
        L1eb:
            r6 = r2
            fg.l r6 = (fg.l) r6
            r8 = 3126(0xc36, float:4.38E-42)
            r9 = 0
            java.lang.String r2 = "文字关键词"
            java.lang.String r3 = "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中"
            r5 = 2
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L206
        L1fd:
            r1 = -1058362899(0xffffffffc0eaa9ed, float:-7.333243)
            r7.a0(r1)
            r7.p(r11)
        L206:
            r7.p(r11)
            goto L213
        L20a:
            r1 = -1058337107(0xffffffffc0eb0ead, float:-7.3455415)
            r7.a0(r1)
            r7.p(r11)
        L213:
            r7.p(r11)
            goto L224
        L217:
            r1 = -1058315283(0xffffffffc0eb63ed, float:-7.355948)
            r7.a0(r1)
            r7.p(r11)
            goto L224
        L221:
            r7.V()
        L224:
            sf.n r1 = sf.n.f12433a
            return r1
        L227:
            r1 = r28
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L238
            r2 = r10
            goto L239
        L238:
            r2 = r11
        L239:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L32b
            java.util.List r1 = r0.f19460h
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L259
            r1 = 1777575515(0x69f3a65b, float:3.681932E25)
            r7.a0(r1)
            java.lang.String r1 = "暂无模板。先新增模板，再回到这里选择。"
            r2 = 6
            wb.ho.s0(r1, r7, r2)
            r7.p(r11)
            goto L32e
        L259:
            r2 = 1777688324(0x69f55f04, float:3.707944E25)
            r7.a0(r2)
            java.util.Iterator r21 = r1.iterator()
            r2 = r11
        L264:
            boolean r3 = r21.hasNext()
            if (r3 == 0) goto L326
            java.lang.Object r3 = r21.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L321
            r13 = r3
            aa.h r13 = (aa.h) r13
            i0.a1 r14 = r0.f19461i
            java.lang.Object r3 = r14.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r5 = r13.f132a
            boolean r3 = r3.contains(r5)
            java.lang.String r5 = r13.f133b
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L291
            java.lang.String r5 = "模板 "
            java.lang.String r5 = eh.a.l(r4, r5)
        L291:
            r6 = r4
            java.lang.String r4 = wb.ho.r5(r13)
            boolean r8 = r7.f(r14)
            boolean r9 = r7.h(r13)
            r8 = r8 | r9
            i0.a1 r15 = r0.f19462j
            boolean r9 = r7.f(r15)
            r8 = r8 | r9
            boolean r9 = r7.h(r1)
            r8 = r8 | r9
            i0.a1 r9 = r0.f19463k
            boolean r12 = r7.f(r9)
            r8 = r8 | r12
            i0.a1 r12 = r0.f19464l
            boolean r16 = r7.f(r12)
            r8 = r8 | r16
            r27 = r10
            i0.a1 r10 = r0.f19465m
            boolean r16 = r7.f(r10)
            r8 = r8 | r16
            java.lang.Object r11 = r7.P()
            if (r8 != 0) goto L2ce
            i0.e r8 = i0.l.f5952a
            if (r11 != r8) goto L2d1
        L2ce:
            r18 = r12
            goto L2d4
        L2d1:
            r16 = r1
            goto L2e5
        L2d4:
            wb.rh r12 = new wb.rh
            r20 = 0
            r16 = r1
            r17 = r9
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r7.k0(r12)
            r11 = r12
        L2e5:
            fg.l r11 = (fg.l) r11
            r8 = 0
            r9 = 8
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = 0
            r25 = r11
            r11 = r1
            r1 = r6
            r6 = r25
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r16.size()
            int r2 = r2 + (-1)
            if (r11 >= r2) goto L310
            r2 = 1752973930(0x687c426a, float:4.765046E24)
            r7.a0(r2)
            r2 = 0
            r3 = r27
            r4 = 0
            wb.ho.D1(r2, r7, r4, r3)
        L30c:
            r7.p(r4)
            goto L31a
        L310:
            r3 = r27
            r4 = 0
            r2 = -1492369562(0xffffffffa70c3f66, float:-1.9463271E-15)
            r7.a0(r2)
            goto L30c
        L31a:
            r2 = r1
            r10 = r3
            r11 = r4
            r1 = r16
            goto L264
        L321:
            a.a.Q0()
            r1 = 0
            throw r1
        L326:
            r4 = r11
            r7.p(r4)
            goto L32e
        L32b:
            r7.V()
        L32e:
            sf.n r1 = sf.n.f12433a
            return r1
        L331:
            r1 = r28
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L342
            r2 = r10
            goto L343
        L342:
            r2 = r11
        L343:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L435
            java.util.List r1 = r0.f19460h
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L363
            r1 = 343475359(0x1479049f, float:1.2572199E-26)
            r7.a0(r1)
            java.lang.String r1 = "暂无模板。先新增模板，或开启下方专属规则。"
            r2 = 6
            wb.ho.s0(r1, r7, r2)
            r7.p(r11)
            goto L438
        L363:
            r2 = 343590090(0x147ac4ca, float:1.2660584E-26)
            r7.a0(r2)
            java.util.Iterator r21 = r1.iterator()
            r2 = r11
        L36e:
            boolean r3 = r21.hasNext()
            if (r3 == 0) goto L430
            java.lang.Object r3 = r21.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L42b
            r13 = r3
            aa.h r13 = (aa.h) r13
            i0.a1 r14 = r0.f19461i
            java.lang.Object r3 = r14.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r5 = r13.f132a
            boolean r3 = r3.contains(r5)
            java.lang.String r5 = r13.f133b
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L39b
            java.lang.String r5 = "模板 "
            java.lang.String r5 = eh.a.l(r4, r5)
        L39b:
            r6 = r4
            java.lang.String r4 = wb.ho.r5(r13)
            boolean r8 = r7.f(r14)
            boolean r9 = r7.h(r13)
            r8 = r8 | r9
            i0.a1 r15 = r0.f19462j
            boolean r9 = r7.f(r15)
            r8 = r8 | r9
            boolean r9 = r7.h(r1)
            r8 = r8 | r9
            i0.a1 r9 = r0.f19463k
            boolean r12 = r7.f(r9)
            r8 = r8 | r12
            i0.a1 r12 = r0.f19464l
            boolean r16 = r7.f(r12)
            r8 = r8 | r16
            r27 = r10
            i0.a1 r10 = r0.f19465m
            boolean r16 = r7.f(r10)
            r8 = r8 | r16
            java.lang.Object r11 = r7.P()
            if (r8 != 0) goto L3d8
            i0.e r8 = i0.l.f5952a
            if (r11 != r8) goto L3db
        L3d8:
            r18 = r12
            goto L3de
        L3db:
            r16 = r1
            goto L3ef
        L3de:
            wb.rh r12 = new wb.rh
            r20 = 1
            r16 = r1
            r17 = r9
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r7.k0(r12)
            r11 = r12
        L3ef:
            fg.l r11 = (fg.l) r11
            r8 = 0
            r9 = 8
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = 0
            r25 = r11
            r11 = r1
            r1 = r6
            r6 = r25
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r16.size()
            int r2 = r2 + (-1)
            if (r11 >= r2) goto L41a
            r2 = 1054221242(0x3ed623ba, float:0.41824132)
            r7.a0(r2)
            r2 = 0
            r3 = r27
            r4 = 0
            wb.ho.D1(r2, r7, r4, r3)
        L416:
            r7.p(r4)
            goto L424
        L41a:
            r3 = r27
            r4 = 0
            r2 = -1678866410(0xffffffff9bee8816, float:-3.946174E-22)
            r7.a0(r2)
            goto L416
        L424:
            r2 = r1
            r10 = r3
            r11 = r4
            r1 = r16
            goto L36e
        L42b:
            a.a.Q0()
            r1 = 0
            throw r1
        L430:
            r4 = r11
            r7.p(r4)
            goto L438
        L435:
            r7.V()
        L438:
            sf.n r1 = sf.n.f12433a
            return r1
        L43b:
            r1 = r28
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r10 = 1
            r11 = 0
            if (r2 == r3) goto L44c
            r2 = r10
            goto L44d
        L44c:
            r2 = r11
        L44d:
            r1 = r1 & r10
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L641
            i0.a1 r13 = r0.f19461i
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            boolean r1 = r7.f(r13)
            i0.a1 r14 = r0.f19462j
            boolean r3 = r7.f(r14)
            r1 = r1 | r3
            i0.a1 r15 = r0.f19463k
            boolean r3 = r7.f(r15)
            r1 = r1 | r3
            i0.a1 r3 = r0.f19464l
            boolean r4 = r7.f(r3)
            r1 = r1 | r4
            i0.a1 r4 = r0.f19465m
            boolean r5 = r7.f(r4)
            r1 = r1 | r5
            java.util.List r5 = r0.f19460h
            boolean r6 = r7.h(r5)
            r1 = r1 | r6
            java.lang.Object r6 = r7.P()
            i0.e r8 = i0.l.f5952a
            if (r1 != 0) goto L498
            if (r6 != r8) goto L492
            goto L498
        L492:
            r1 = r3
            r16 = r4
            r18 = r5
            goto L4ad
        L498:
            wb.kh r12 = new wb.kh
            r19 = 0
            r16 = r3
            r17 = r4
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = r16
            r16 = r17
            r7.k0(r12)
            r6 = r12
        L4ad:
            fg.l r6 = (fg.l) r6
            r3 = r8
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            r4 = r3
            java.lang.String r3 = "默认专属规则"
            r5 = r4
            java.lang.String r4 = "开启后不依赖模板，直接按下方类型和关键词屏蔽"
            r12 = r5
            r5 = 0
            r24 = r12
            r12 = r16
            r23 = r18
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r13.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L637
            r2 = 1313322397(0x4e47b59d, float:8.3764205E8)
            r7.a0(r2)
            r13 = 0
            wb.ho.D1(r13, r7, r11, r10)
            boolean r2 = r7.f(r12)
            r3 = r23
            boolean r4 = r7.h(r3)
            r2 = r2 | r4
            boolean r4 = r7.f(r14)
            r2 = r2 | r4
            boolean r4 = r7.f(r15)
            r2 = r2 | r4
            boolean r4 = r7.f(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r7.P()
            if (r2 != 0) goto L505
            r2 = r24
            if (r4 != r2) goto L502
        L4ff:
            r17 = r14
            goto L508
        L502:
            r12 = r1
            r1 = r14
            goto L520
        L505:
            r2 = r24
            goto L4ff
        L508:
            wb.lh r14 = new wb.lh
            r20 = 0
            r19 = r1
            r16 = r12
            r18 = r15
            r15 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1 = r17
            r15 = r18
            r12 = r19
            r7.k0(r14)
            r4 = r14
        L520:
            fg.a r4 = (fg.a) r4
            r3 = 54
            java.lang.String r5 = "套用已选模板规则"
            java.lang.String r6 = "把上方模板的类型和关键词复制到这里"
            wb.ho.b(r5, r6, r4, r7, r3)
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r3 = r1.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r7.f(r1)
            boolean r5 = r7.f(r12)
            r4 = r4 | r5
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto L549
            if (r5 != r2) goto L553
        L549:
            sh.m1 r5 = new sh.m1
            r4 = 11
            r5.<init>(r4, r1, r12)
            r7.k0(r5)
        L553:
            r6 = r5
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            r4 = r2
            r2 = r3
            java.lang.String r3 = "所有消息"
            r5 = r4
            java.lang.String r4 = "开启后默认范围内全部类型生效"
            r24 = r5
            r5 = 0
            r14 = r24
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L62a
            r1 = 1313954053(0x4e515905, float:8.7806803E8)
            r7.a0(r1)
            r1 = -1620181133(0xffffffff9f6dff73, float:-5.0398005E-20)
            r7.a0(r1)
            java.util.List r1 = wb.ho.n6()
            java.util.Iterator r1 = r1.iterator()
        L589:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d5
            java.lang.Object r2 = r1.next()
            wb.e6 r2 = (wb.e6) r2
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r3 = r15.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r4 = r2.f15834a
            boolean r3 = r3.contains(r4)
            r4 = r3
            java.lang.String r3 = r2.f15835b
            r5 = r4
            java.lang.String r4 = r2.f15836c
            boolean r6 = r7.f(r15)
            boolean r8 = r7.f(r2)
            r6 = r6 | r8
            boolean r8 = r7.f(r12)
            r6 = r6 | r8
            java.lang.Object r8 = r7.P()
            if (r6 != 0) goto L5c0
            if (r8 != r14) goto L5c9
        L5c0:
            wb.mh r8 = new wb.mh
            r6 = 0
            r8.<init>(r2, r15, r12, r6)
            r7.k0(r8)
        L5c9:
            r6 = r8
            fg.l r6 = (fg.l) r6
            r8 = 0
            r9 = 8
            r2 = r5
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L589
        L5d5:
            r7.p(r11)
            java.lang.Object r1 = r15.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r2 = "text"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L61d
            r1 = 1314915208(0x4e600388, float:9.3958195E8)
            r7.a0(r1)
            wb.ho.D1(r13, r7, r11, r10)
            java.lang.Object r1 = r12.getValue()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = r7.f(r12)
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L602
            if (r2 != r14) goto L60b
        L602:
            wb.ih r2 = new wb.ih
            r1 = 6
            r2.<init>(r12, r1)
            r7.k0(r2)
        L60b:
            r6 = r2
            fg.l r6 = (fg.l) r6
            r8 = 3126(0xc36, float:4.38E-42)
            r9 = 0
            java.lang.String r2 = "文字关键词"
            java.lang.String r3 = "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中"
            r5 = 2
            wb.ho.C1(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r11)
            goto L626
        L61d:
            r1 = 1315290959(0x4e65bf4f, float:9.6363E8)
            r7.a0(r1)
            r7.p(r11)
        L626:
            r7.p(r11)
            goto L633
        L62a:
            r1 = 1315316751(0x4e66240f, float:9.652807E8)
            r7.a0(r1)
            r7.p(r11)
        L633:
            r7.p(r11)
            goto L644
        L637:
            r1 = 1315338575(0x4e66794f, float:9.6667744E8)
            r7.a0(r1)
            r7.p(r11)
            goto L644
        L641:
            r7.V()
        L644:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
