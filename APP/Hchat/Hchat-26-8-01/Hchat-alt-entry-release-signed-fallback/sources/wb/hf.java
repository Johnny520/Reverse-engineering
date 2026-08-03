package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f16560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.p f16563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16565m;

    public /* synthetic */ hf(java.util.ArrayList r2, java.util.List r3, java.util.List r4, fg.p r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f16559g = r0
            r1.<init>()
            r1.f16560h = r2
            r1.f16561i = r3
            r1.f16562j = r4
            r1.f16563k = r5
            r1.f16564l = r6
            r1.f16565m = r7
            return
    }

    public /* synthetic */ hf(java.util.List r1, java.util.ArrayList r2, java.util.List r3, fg.p r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f16559g = r7
            r0.f16561i = r1
            r0.f16560h = r2
            r0.f16562j = r3
            r0.f16563k = r4
            r0.f16564l = r5
            r0.f16565m = r6
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f16559g
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            switch(r0) {
                case 0: goto L257;
                case 1: goto L139;
                default: goto Ld;
            }
        Ld:
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L133
            java.util.List r15 = r13.f16561i
            boolean r15 = r15.isEmpty()
            r0 = 6
            if (r15 == 0) goto L37
            r15 = -1082883563(0xffffffffbf748215, float:-0.9551099)
            r14.a0(r15)
            java.lang.String r15 = "暂无适用聊天。添加群聊或好友后，再给它分配红包模板。"
            wb.ho.s0(r15, r14, r0)
            r14.p(r3)
            goto L136
        L37:
            java.util.ArrayList r15 = r13.f16560h
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L4f
            r15 = -1082760679(0xffffffffbf766219, float:-0.96243435)
            r14.a0(r15)
            java.lang.String r15 = "没有匹配结果。可按昵称、ID 或模板名搜索。"
            wb.ho.s0(r15, r14, r0)
            r14.p(r3)
            goto L136
        L4f:
            r0 = -1082626263(0xffffffffbf786f29, float:-0.97044617)
            r14.a0(r0)
            java.util.Iterator r0 = r15.iterator()
            r1 = r3
        L5a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L12f
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L12a
            sf.e r4 = (sf.e) r4
            java.lang.Object r6 = r4.f12418g
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.f12419h
            na.i r4 = (na.i) r4
            i0.a1 r7 = r13.f16564l
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.util.List r8 = r13.f16562j
            i0.e r9 = i0.l.f5952a
            if (r7 == 0) goto Lce
            r7 = -1350924915(0xffffffffaf7a858d, float:-2.2784814E-10)
            r14.a0(r7)
            java.lang.String r7 = r4.f9145c
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L98
            java.lang.String r7 = r4.f9144b
        L98:
            java.lang.String r8 = wb.ho.s5(r4, r8)
            wb.bp r10 = new wb.bp
            r10.<init>(r7, r6, r8)
            i0.a1 r6 = r13.f16565m
            java.lang.Object r7 = r6.getValue()
            java.util.Set r7 = (java.util.Set) r7
            java.lang.String r8 = r4.f9143a
            boolean r7 = r7.contains(r8)
            boolean r8 = r14.h(r4)
            java.lang.Object r11 = r14.P()
            if (r8 != 0) goto Lbb
            if (r11 != r9) goto Lc5
        Lbb:
            sh.v1 r11 = new sh.v1
            r8 = 18
            r11.<init>(r4, r8, r6)
            r14.k0(r11)
        Lc5:
            fg.a r11 = (fg.a) r11
            wb.ho.x2(r10, r7, r11, r14, r3)
            r14.p(r3)
            goto L10b
        Lce:
            r7 = -1350017669(0xffffffffaf885d7b, float:-2.4804678E-10)
            r14.a0(r7)
            java.lang.String r7 = r4.f9145c
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto Lde
            java.lang.String r7 = r4.f9144b
        Lde:
            java.lang.String r8 = wb.ho.s5(r4, r8)
            fg.p r10 = r13.f16563k
            boolean r11 = r14.f(r10)
            boolean r12 = r14.d(r6)
            r11 = r11 | r12
            boolean r12 = r14.h(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r14.P()
            if (r11 != 0) goto Lfa
            if (r12 != r9) goto L103
        Lfa:
            hb.e0 r12 = new hb.e0
            r9 = 2
            r12.<init>(r10, r6, r4, r9)
            r14.k0(r12)
        L103:
            fg.a r12 = (fg.a) r12
            wb.ho.x3(r7, r8, r12, r14, r3)
            r14.p(r3)
        L10b:
            int r4 = r15.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L120
            r1 = 95012069(0x5a9c4e5, float:1.5965011E-35)
            r14.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r14, r3, r2)
        L11c:
            r14.p(r3)
            goto L127
        L120:
            r1 = -1349579701(0xffffffffaf8f0c4b, float:-2.6020283E-10)
            r14.a0(r1)
            goto L11c
        L127:
            r1 = r5
            goto L5a
        L12a:
            a.a.Q0()
            r14 = 0
            throw r14
        L12f:
            r14.p(r3)
            goto L136
        L133:
            r14.V()
        L136:
            sf.n r14 = sf.n.f12433a
            return r14
        L139:
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L142
            r0 = r2
            goto L143
        L142:
            r0 = r3
        L143:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L251
            java.util.ArrayList r15 = r13.f16560h
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L16d
            r15 = 856045271(0x330636d7, float:3.1249183E-8)
            r14.a0(r15)
            java.util.List r15 = r13.f16561i
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L163
            java.lang.String r15 = "暂无适用聊天。"
            goto L165
        L163:
            java.lang.String r15 = "没有匹配结果。"
        L165:
            wb.ho.s0(r15, r14, r3)
            r14.p(r3)
            goto L254
        L16d:
            r0 = 856199651(0x330891e3, float:3.179765E-8)
            r14.a0(r0)
            java.util.Iterator r0 = r15.iterator()
            r1 = r3
        L178:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L24d
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L248
            sf.e r4 = (sf.e) r4
            java.lang.Object r6 = r4.f12418g
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.f12419h
            ua.h r4 = (ua.h) r4
            i0.a1 r7 = r13.f16564l
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.util.List r8 = r13.f16562j
            i0.e r9 = i0.l.f5952a
            if (r7 == 0) goto L1ec
            r7 = 16168934(0xf6b7e6, float:2.2657502E-38)
            r14.a0(r7)
            java.lang.String r7 = r4.f13620c
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L1b6
            java.lang.String r7 = r4.f13619b
        L1b6:
            java.lang.String r8 = wb.ho.v5(r4, r8)
            wb.bp r10 = new wb.bp
            r10.<init>(r7, r6, r8)
            i0.a1 r6 = r13.f16565m
            java.lang.Object r7 = r6.getValue()
            java.util.Set r7 = (java.util.Set) r7
            java.lang.String r8 = r4.f13618a
            boolean r7 = r7.contains(r8)
            boolean r8 = r14.h(r4)
            java.lang.Object r11 = r14.P()
            if (r8 != 0) goto L1d9
            if (r11 != r9) goto L1e3
        L1d9:
            sh.v1 r11 = new sh.v1
            r8 = 23
            r11.<init>(r4, r8, r6)
            r14.k0(r11)
        L1e3:
            fg.a r11 = (fg.a) r11
            wb.ho.x2(r10, r7, r11, r14, r3)
            r14.p(r3)
            goto L229
        L1ec:
            r7 = 17072956(0x104833c, float:2.4338727E-38)
            r14.a0(r7)
            java.lang.String r7 = r4.f13620c
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L1fc
            java.lang.String r7 = r4.f13619b
        L1fc:
            java.lang.String r8 = wb.ho.v5(r4, r8)
            fg.p r10 = r13.f16563k
            boolean r11 = r14.f(r10)
            boolean r12 = r14.d(r6)
            r11 = r11 | r12
            boolean r12 = r14.h(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r14.P()
            if (r11 != 0) goto L218
            if (r12 != r9) goto L221
        L218:
            hb.e0 r12 = new hb.e0
            r9 = 6
            r12.<init>(r10, r6, r4, r9)
            r14.k0(r12)
        L221:
            fg.a r12 = (fg.a) r12
            wb.ho.x3(r7, r8, r12, r14, r3)
            r14.p(r3)
        L229:
            int r4 = r15.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L23e
            r1 = 1663129741(0x6321588d, float:2.9763066E21)
            r14.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r14, r3, r2)
        L23a:
            r14.p(r3)
            goto L245
        L23e:
            r1 = 17427875(0x109eda3, float:2.5333422E-38)
            r14.a0(r1)
            goto L23a
        L245:
            r1 = r5
            goto L178
        L248:
            a.a.Q0()
            r14 = 0
            throw r14
        L24d:
            r14.p(r3)
            goto L254
        L251:
            r14.V()
        L254:
            sf.n r14 = sf.n.f12433a
            return r14
        L257:
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L260
            r0 = r2
            goto L261
        L260:
            r0 = r3
        L261:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L37d
            java.util.List r15 = r13.f16561i
            boolean r15 = r15.isEmpty()
            r0 = 6
            if (r15 == 0) goto L281
            r15 = 1251457993(0x4a97bbc9, float:4972004.5)
            r14.a0(r15)
            java.lang.String r15 = "暂无名单。添加好友、群聊、公众号或群成员后，再给名单分配模板。"
            wb.ho.s0(r15, r14, r0)
            r14.p(r3)
            goto L380
        L281:
            java.util.ArrayList r15 = r13.f16560h
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L299
            r15 = 1251585682(0x4a99ae92, float:5035849.0)
            r14.a0(r15)
            java.lang.String r15 = "没有匹配名单。可按昵称、ID 或模板名搜索。"
            wb.ho.s0(r15, r14, r0)
            r14.p(r3)
            goto L380
        L299:
            r0 = 1251720284(0x4a9bbc5c, float:5103150.0)
            r14.a0(r0)
            java.util.Iterator r0 = r15.iterator()
            r1 = r3
        L2a4:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L379
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L374
            sf.e r4 = (sf.e) r4
            java.lang.Object r6 = r4.f12418g
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.f12419h
            aa.a r4 = (aa.a) r4
            i0.a1 r7 = r13.f16564l
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.util.List r8 = r13.f16562j
            i0.e r9 = i0.l.f5952a
            if (r7 == 0) goto L318
            r7 = -274992923(0xffffffffef9bf0e5, float:-9.65228E28)
            r14.a0(r7)
            java.lang.String r7 = r4.f107d
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L2e2
            java.lang.String r7 = r4.f106c
        L2e2:
            java.lang.String r8 = wb.ho.o5(r4, r8)
            wb.bp r10 = new wb.bp
            r10.<init>(r7, r6, r8)
            i0.a1 r6 = r13.f16565m
            java.lang.Object r7 = r6.getValue()
            java.util.Set r7 = (java.util.Set) r7
            java.lang.String r8 = r4.f104a
            boolean r7 = r7.contains(r8)
            boolean r8 = r14.h(r4)
            java.lang.Object r11 = r14.P()
            if (r8 != 0) goto L305
            if (r11 != r9) goto L30f
        L305:
            sh.v1 r11 = new sh.v1
            r8 = 21
            r11.<init>(r4, r8, r6)
            r14.k0(r11)
        L30f:
            fg.a r11 = (fg.a) r11
            wb.ho.x2(r10, r7, r11, r14, r3)
            r14.p(r3)
            goto L355
        L318:
            r7 = -274082701(0xffffffffefa9d473, float:-1.051196E29)
            r14.a0(r7)
            java.lang.String r7 = r4.f107d
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L328
            java.lang.String r7 = r4.f106c
        L328:
            java.lang.String r8 = wb.ho.o5(r4, r8)
            fg.p r10 = r13.f16563k
            boolean r11 = r14.f(r10)
            boolean r12 = r14.d(r6)
            r11 = r11 | r12
            boolean r12 = r14.h(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r14.P()
            if (r11 != 0) goto L344
            if (r12 != r9) goto L34d
        L344:
            hb.e0 r12 = new hb.e0
            r9 = 3
            r12.<init>(r10, r6, r4, r9)
            r14.k0(r12)
        L34d:
            fg.a r12 = (fg.a) r12
            wb.ho.x3(r7, r8, r12, r14, r3)
            r14.p(r3)
        L355:
            int r4 = r15.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L36a
            r1 = 545361738(0x20818f4a, float:2.194827E-19)
            r14.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r14, r3, r2)
        L366:
            r14.p(r3)
            goto L371
        L36a:
            r1 = -273641850(0xffffffffefb08e86, float:-1.0928332E29)
            r14.a0(r1)
            goto L366
        L371:
            r1 = r5
            goto L2a4
        L374:
            a.a.Q0()
            r14 = 0
            throw r14
        L379:
            r14.p(r3)
            goto L380
        L37d:
            r14.V()
        L380:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
