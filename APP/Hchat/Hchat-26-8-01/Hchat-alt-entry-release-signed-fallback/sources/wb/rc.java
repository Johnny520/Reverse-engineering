package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18833n;

    public /* synthetic */ rc(android.content.SharedPreferences r2, java.util.List r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 1
            r1.f18826g = r0
            r1.<init>()
            r1.f18827h = r2
            r1.f18828i = r3
            r1.f18829j = r4
            r1.f18830k = r5
            r1.f18831l = r6
            r1.f18832m = r7
            r1.f18833n = r8
            return
    }

    public /* synthetic */ rc(java.util.List r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8) {
            r1 = this;
            r0 = 0
            r1.f18826g = r0
            r1.<init>()
            r1.f18828i = r2
            r1.f18827h = r3
            r1.f18829j = r4
            r1.f18830k = r5
            r1.f18831l = r6
            r1.f18832m = r7
            r1.f18833n = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f18826g
            switch(r0) {
                case 0: goto L160;
                default: goto L5;
            }
        L5:
            r6 = r14
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 2
            r9 = 1
            r10 = 0
            if (r15 == r0) goto L17
            r15 = r9
            goto L18
        L17:
            r15 = r10
        L18:
            r14 = r14 & r9
            boolean r14 = r6.S(r14, r15)
            if (r14 == 0) goto L15a
            i0.a1 r14 = r13.f18829j
            java.lang.Object r15 = r14.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r1 = r15.booleanValue()
            android.content.SharedPreferences r15 = r13.f18827h
            boolean r0 = r6.h(r15)
            java.lang.Object r2 = r6.P()
            i0.e r11 = i0.l.f5952a
            if (r0 != 0) goto L3b
            if (r2 != r11) goto L45
        L3b:
            wb.me r2 = new wb.me
            r0 = 26
            r2.<init>(r15, r14, r0)
            r6.k0(r2)
        L45:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "包含关键词筛选"
            java.lang.String r3 = "开启后，正文需命中任意关键词才转发"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r0 = 0
            if (r14 == 0) goto L9b
            r14 = 1061595526(0x3f46a986, float:0.7760242)
            r6.a0(r14)
            wb.ho.D1(r0, r6, r10, r9)
            i0.a1 r14 = r13.f18830k
            java.lang.Object r1 = r14.getValue()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r6.h(r15)
            java.lang.Object r2 = r6.P()
            if (r1 != 0) goto L7f
            if (r2 != r11) goto L89
        L7f:
            wb.me r2 = new wb.me
            r1 = 27
            r2.<init>(r15, r14, r1)
            r6.k0(r2)
        L89:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 3126(0xc36, float:4.38E-42)
            r8 = 0
            java.lang.String r1 = "包含关键词"
            java.lang.String r2 = "多个关键词用逗号或换行分隔"
            r4 = 2
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r10)
            goto La4
        L9b:
            r14 = 1062095246(0x3f4e498e, float:0.80580986)
            r6.a0(r14)
            r6.p(r10)
        La4:
            wb.ho.D1(r0, r6, r10, r9)
            i0.a1 r14 = r13.f18831l
            java.lang.Object r1 = r14.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r2 = r6.h(r15)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto Lbf
            if (r3 != r11) goto Lc9
        Lbf:
            wb.me r3 = new wb.me
            r2 = 28
            r3.<init>(r15, r14, r2)
            r6.k0(r3)
        Lc9:
            r5 = r3
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "排除关键词筛选"
            java.lang.String r3 = "开启后，正文命中任意关键词时不转发，优先于包含规则"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L11e
            r14 = 1062673830(0x3f571da6, float:0.84029615)
            r6.a0(r14)
            wb.ho.D1(r0, r6, r10, r9)
            i0.a1 r14 = r13.f18832m
            java.lang.Object r1 = r14.getValue()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r6.h(r15)
            java.lang.Object r2 = r6.P()
            if (r1 != 0) goto L102
            if (r2 != r11) goto L10c
        L102:
            wb.me r2 = new wb.me
            r1 = 29
            r2.<init>(r15, r14, r1)
            r6.k0(r2)
        L10c:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 3126(0xc36, float:4.38E-42)
            r8 = 0
            java.lang.String r1 = "排除关键词"
            java.lang.String r2 = "多个关键词用逗号或换行分隔"
            r4 = 2
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r10)
            goto L127
        L11e:
            r14 = 1063173550(0x3f5ebdae, float:0.8700818)
            r6.a0(r14)
            r6.p(r10)
        L127:
            wb.ho.D1(r0, r6, r10, r9)
            i0.a1 r14 = r13.f18833n
            java.lang.Object r0 = r14.getValue()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r6.h(r15)
            java.lang.Object r1 = r6.P()
            if (r0 != 0) goto L13f
            if (r1 != r11) goto L148
        L13f:
            wb.qg r1 = new wb.qg
            r0 = 0
            r1.<init>(r15, r14, r0)
            r6.k0(r1)
        L148:
            fg.l r1 = (fg.l) r1
            r8 = 24630(0x6036, float:3.4514E-41)
            r9 = 0
            r7 = r6
            r6 = r1
            java.lang.String r1 = "文案模板"
            java.lang.String r2 = "支持下方变量"
            java.util.List r4 = r13.f18828i
            r5 = 3
            wb.ho.i4(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L15d
        L15a:
            r6.V()
        L15d:
            sf.n r14 = sf.n.f12433a
            return r14
        L160:
            r4 = r14
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r9 = 0
            r10 = 1
            r11 = 2
            if (r15 == r11) goto L172
            r15 = r10
            goto L173
        L172:
            r15 = r9
        L173:
            r14 = r14 & r10
            boolean r14 = r4.S(r14, r15)
            if (r14 == 0) goto L2b2
            i0.a1 r14 = r13.f18829j
            java.lang.Object r15 = r14.getValue()
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r15 = r4.P()
            i0.e r12 = i0.l.f5952a
            if (r15 != r12) goto L195
            wb.mf r15 = new wb.mf
            r0 = 12
            r15.<init>(r14, r0)
            r4.k0(r15)
        L195:
            fg.l r15 = (fg.l) r15
            r7 = 24630(0x6036, float:3.4514E-41)
            r8 = 32
            java.lang.String r0 = "收款位置"
            java.lang.String r1 = "使用微信当前账号提供的收款账户"
            java.util.List r2 = r13.f18828i
            r5 = 0
            r6 = r4
            r4 = r15
            wb.ho.I2(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r4 = r6
            r14 = 0
            wb.ho.D1(r14, r4, r9, r10)
            r4 = 0
            r5 = r6
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r13.f18827h
            java.lang.String r1 = "transfer_refund_rejected"
            java.lang.String r2 = "拒收时退回"
            java.lang.String r3 = "规则不通过时原路退回"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r4 = r5
            wb.ho.D1(r14, r4, r9, r10)
            i0.a1 r15 = r13.f18830k
            java.lang.Object r0 = r15.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r10) goto L1d6
            if (r0 == r11) goto L1d3
            java.lang.String r0 = "无延迟"
        L1d1:
            r1 = r0
            goto L1d9
        L1d3:
            java.lang.String r0 = "自定义延迟"
            goto L1d1
        L1d6:
            java.lang.String r0 = "随机延迟"
            goto L1d1
        L1d9:
            java.util.ArrayList r2 = wb.ho.F6()
            java.lang.Object r0 = r15.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r4.P()
            if (r0 != r12) goto L1f7
            wb.mf r0 = new wb.mf
            r5 = 13
            r0.<init>(r15, r5)
            r4.k0(r0)
        L1f7:
            fg.l r0 = (fg.l) r0
            r5 = 0
            r7 = 24582(0x6006, float:3.4447E-41)
            r6 = r4
            r4 = r0
            java.lang.String r0 = "收款延迟"
            wb.ho.J2(r0, r1, r2, r3, r4, r5, r6, r7)
            r4 = r6
            java.lang.Object r0 = r15.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r11) goto L242
            r15 = -1601584279(0xffffffffa089c369, float:-2.3338014E-19)
            r4.a0(r15)
            wb.ho.D1(r14, r4, r9, r10)
            i0.a1 r14 = r13.f18831l
            java.lang.Object r15 = r14.getValue()
            r2 = r15
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r15 = r4.P()
            if (r15 != r12) goto L232
            wb.mf r15 = new wb.mf
            r0 = 14
            r15.<init>(r14, r0)
            r4.k0(r15)
        L232:
            r3 = r15
            fg.l r3 = (fg.l) r3
            r5 = 3126(0xc36, float:4.38E-42)
            java.lang.String r0 = "自定义延迟"
            java.lang.String r1 = "单位 ms"
            wb.ho.w2(r0, r1, r2, r3, r4, r5)
            r4.p(r9)
            goto L2b5
        L242:
            java.lang.Object r15 = r15.getValue()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r15 != r10) goto L2a8
            r15 = -1601388080(0xffffffffa08cc1d0, float:-2.3845177E-19)
            r4.a0(r15)
            wb.ho.D1(r14, r4, r9, r10)
            i0.a1 r15 = r13.f18832m
            java.lang.Object r0 = r15.getValue()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r4.P()
            if (r0 != r12) goto L270
            wb.mf r0 = new wb.mf
            r1 = 15
            r0.<init>(r15, r1)
            r4.k0(r0)
        L270:
            r3 = r0
            fg.l r3 = (fg.l) r3
            r5 = 3126(0xc36, float:4.38E-42)
            java.lang.String r0 = "最小延迟"
            java.lang.String r1 = "单位 ms"
            wb.ho.w2(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r14, r4, r9, r10)
            i0.a1 r14 = r13.f18833n
            java.lang.Object r15 = r14.getValue()
            r2 = r15
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r15 = r4.P()
            if (r15 != r12) goto L298
            wb.mf r15 = new wb.mf
            r0 = 16
            r15.<init>(r14, r0)
            r4.k0(r15)
        L298:
            r3 = r15
            fg.l r3 = (fg.l) r3
            r5 = 3126(0xc36, float:4.38E-42)
            java.lang.String r0 = "最大延迟"
            java.lang.String r1 = "单位 ms"
            wb.ho.w2(r0, r1, r2, r3, r4, r5)
            r4.p(r9)
            goto L2b5
        L2a8:
            r14 = -1601139181(0xffffffffa0908e13, float:-2.4488566E-19)
            r4.a0(r14)
            r4.p(r9)
            goto L2b5
        L2b2:
            r4.V()
        L2b5:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
