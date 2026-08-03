package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f16724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashSet f16726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f16728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.a f16729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16733q;

    public /* synthetic */ i7(java.util.ArrayList r1, android.content.Context r2, java.util.LinkedHashSet r3, boolean r4, fg.a r5, fg.a r6, java.util.List r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, int r11) {
            r0 = this;
            r0.f16723g = r11
            r0.f16724h = r1
            r0.f16725i = r2
            r0.f16726j = r3
            r0.f16727k = r4
            r0.f16728l = r5
            r0.f16729m = r6
            r0.f16730n = r7
            r0.f16731o = r8
            r0.f16732p = r9
            r0.f16733q = r10
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f16723g
            th.a r11 = (th.a) r11
            r6 = r12
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            switch(r0) {
                case 0: goto L6b8;
                case 1: goto L59b;
                case 2: goto L480;
                case 3: goto L365;
                case 4: goto L248;
                case 5: goto L12b;
                default: goto L10;
            }
        L10:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L1d
            r11 = r0
            goto L1e
        L1d:
            r11 = r9
        L1e:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L125
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto Ld6
            r12 = 1771844855(0x699c34f7, float:2.3605318E25)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L5f
            if (r5 != r0) goto L6a
        L5f:
            wb.w8 r5 = new wb.w8
            r3 = 0
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L6a:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L7b
            c9.x0 r12 = new c9.x0
            r3 = 2
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L7b:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L8a
            r12 = r1
            goto L91
        L8a:
            if (r4 == 0) goto L8f
            java.lang.String r12 = "取消全选"
            goto L91
        L8f:
            java.lang.String r12 = "全选"
        L91:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto La1
            r11 = 1772506456(0x69a64d58, float:2.5130866E25)
            r6.a0(r11)
        L9d:
            r6.p(r9)
            goto Lc5
        La1:
            r1 = 1772522329(0x69a68b59, float:2.5167467E25)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto Lb8
            if (r7 != r0) goto Lc1
        Lb8:
            wb.x8 r7 = new wb.x8
            r0 = 0
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        Lc1:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L9d
        Lc5:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L128
        Ld6:
            r12 = 1772765741(0x69aa422d, float:2.5728737E25)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto Le6
            r4 = r1
            goto Le9
        Le6:
            java.lang.String r2 = "批量删除"
            r4 = r2
        Le9:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto Lfa
            r11 = 1773084792(0x69af2078, float:2.6464418E25)
            r6.a0(r11)
        Lf5:
            r6.p(r9)
            r5 = r1
            goto L113
        Lfa:
            r12 = 1773100138(0x69af5c6a, float:2.6499804E25)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L10f
            c9.x0 r12 = new c9.x0
            r0 = 3
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L10f:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto Lf5
        L113:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "新增规则"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L128
        L125:
            r6.V()
        L128:
            sf.n r11 = sf.n.f12433a
            return r11
        L12b:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L138
            r11 = r0
            goto L139
        L138:
            r11 = r9
        L139:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L242
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L1f2
            r12 = 1938614939(0x738cea9b, float:2.23291E31)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L17a
            if (r5 != r0) goto L185
        L17a:
            wb.w8 r5 = new wb.w8
            r3 = 3
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L185:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L197
            c9.x0 r12 = new c9.x0
            r3 = 8
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L197:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L1a6
            r12 = r1
            goto L1ad
        L1a6:
            if (r4 == 0) goto L1ab
            java.lang.String r12 = "取消全选"
            goto L1ad
        L1ab:
            java.lang.String r12 = "全选"
        L1ad:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L1bd
            r11 = 1939366750(0x7398635e, float:2.4146867E31)
            r6.a0(r11)
        L1b9:
            r6.p(r9)
            goto L1e1
        L1bd:
            r1 = 1939386591(0x7398b0df, float:2.419484E31)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L1d4
            if (r7 != r0) goto L1dd
        L1d4:
            wb.x8 r7 = new wb.x8
            r0 = 3
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L1dd:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L1b9
        L1e1:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L245
        L1f2:
            r12 = 1939753011(0x739e4833, float:2.5080789E31)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L202
            r4 = r1
            goto L205
        L202:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L205:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L216
            r11 = 1940072062(0x73a3267e, float:2.5852206E31)
            r6.a0(r11)
        L211:
            r6.p(r9)
            r5 = r1
            goto L230
        L216:
            r12 = 1940087408(0x73a36270, float:2.588931E31)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L22c
            c9.x0 r12 = new c9.x0
            r0 = 9
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L22c:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L211
        L230:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "新增规则"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L245
        L242:
            r6.V()
        L245:
            sf.n r11 = sf.n.f12433a
            return r11
        L248:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L255
            r11 = r0
            goto L256
        L255:
            r11 = r9
        L256:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L35f
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L30f
            r12 = 482429745(0x1cc14b31, float:1.2791105E-21)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L297
            if (r5 != r0) goto L2a2
        L297:
            wb.w8 r5 = new wb.w8
            r3 = 5
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L2a2:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L2b4
            c9.x0 r12 = new c9.x0
            r3 = 14
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L2b4:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L2c3
            r12 = r1
            goto L2ca
        L2c3:
            if (r4 == 0) goto L2c8
            java.lang.String r12 = "取消全选"
            goto L2ca
        L2c8:
            java.lang.String r12 = "全选"
        L2ca:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L2da
            r11 = 483189244(0x1ccce1fc, float:1.3558003E-21)
            r6.a0(r11)
        L2d6:
            r6.p(r9)
            goto L2fe
        L2da:
            r1 = 483209085(0x1ccd2f7d, float:1.3578037E-21)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L2f1
            if (r7 != r0) goto L2fa
        L2f1:
            wb.x8 r7 = new wb.x8
            r0 = 5
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L2fa:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L2d6
        L2fe:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L362
        L30f:
            r12 = 483575908(0x1cd2c864, float:1.3948434E-21)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L31f
            r4 = r1
            goto L322
        L31f:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L322:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L333
            r11 = 483907452(0x1cd7d77c, float:1.4283208E-21)
            r6.a0(r11)
        L32e:
            r6.p(r9)
            r5 = r1
            goto L34d
        L333:
            r12 = 483922798(0x1cd8136e, float:1.4298703E-21)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L349
            c9.x0 r12 = new c9.x0
            r0 = 15
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L349:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L32e
        L34d:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "添加聊天"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L362
        L35f:
            r6.V()
        L362:
            sf.n r11 = sf.n.f12433a
            return r11
        L365:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L372
            r11 = r0
            goto L373
        L372:
            r11 = r9
        L373:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L47a
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L42b
            r12 = -894553827(0xffffffffcaae311d, float:-5707918.5)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L3b4
            if (r5 != r0) goto L3bf
        L3b4:
            wb.w8 r5 = new wb.w8
            r3 = 1
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L3bf:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L3d0
            c9.x0 r12 = new c9.x0
            r3 = 4
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L3d0:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L3df
            r12 = r1
            goto L3e6
        L3df:
            if (r4 == 0) goto L3e4
            java.lang.String r12 = "取消全选"
            goto L3e6
        L3e4:
            java.lang.String r12 = "全选"
        L3e6:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L3f6
            r11 = -893794328(0xffffffffcab9c7e8, float:-6087668.0)
            r6.a0(r11)
        L3f2:
            r6.p(r9)
            goto L41a
        L3f6:
            r1 = -893774487(0xffffffffcaba1569, float:-6097588.5)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L40d
            if (r7 != r0) goto L416
        L40d:
            wb.x8 r7 = new wb.x8
            r0 = 1
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L416:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L3f2
        L41a:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L47d
        L42b:
            r12 = -893407881(0xffffffffcabfad77, float:-6280891.5)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L43b
            r4 = r1
            goto L43e
        L43b:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L43e:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L44f
            r11 = -893083064(0xffffffffcac4a248, float:-6443300.0)
            r6.a0(r11)
        L44a:
            r6.p(r9)
            r5 = r1
            goto L468
        L44f:
            r12 = -893067718(0xffffffffcac4de3a, float:-6450973.0)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L464
            c9.x0 r12 = new c9.x0
            r0 = 5
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L464:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L44a
        L468:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "添加聊天"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L47d
        L47a:
            r6.V()
        L47d:
            sf.n r11 = sf.n.f12433a
            return r11
        L480:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L48d
            r11 = r0
            goto L48e
        L48d:
            r11 = r9
        L48e:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L595
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L546
            r12 = 341850467(0x14603963, float:1.13204275E-26)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L4cf
            if (r5 != r0) goto L4da
        L4cf:
            wb.w8 r5 = new wb.w8
            r3 = 2
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L4da:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L4eb
            c9.x0 r12 = new c9.x0
            r3 = 6
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L4eb:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L4fa
            r12 = r1
            goto L501
        L4fa:
            if (r4 == 0) goto L4ff
            java.lang.String r12 = "取消全选"
            goto L501
        L4ff:
            java.lang.String r12 = "全选"
        L501:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L511
            r11 = 342610369(0x146bd1c1, float:1.1905835E-26)
            r6.a0(r11)
        L50d:
            r6.p(r9)
            goto L535
        L511:
            r1 = 342630768(0x146c2170, float:1.19215495E-26)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L528
            if (r7 != r0) goto L531
        L528:
            wb.x8 r7 = new wb.x8
            r0 = 2
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L531:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L50d
        L535:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L598
        L546:
            r12 = 343015292(0x1471ff7c, float:1.2217776E-26)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L556
            r4 = r1
            goto L559
        L556:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L559:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L56a
            r11 = 343353377(0x14772821, float:1.2478227E-26)
            r6.a0(r11)
        L565:
            r6.p(r9)
            r5 = r1
            goto L583
        L56a:
            r12 = 343368909(0x147764cd, float:1.2490193E-26)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L57f
            c9.x0 r12 = new c9.x0
            r0 = 7
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L57f:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L565
        L583:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "选择监听群"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L598
        L595:
            r6.V()
        L598:
            sf.n r11 = sf.n.f12433a
            return r11
        L59b:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L5a8
            r11 = r0
            goto L5a9
        L5a8:
            r11 = r9
        L5a9:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L6b2
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L662
            r12 = -543209028(0xffffffffdf9f49bc, float:-2.2955824E19)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L5ea
            if (r5 != r0) goto L5f5
        L5ea:
            wb.w8 r5 = new wb.w8
            r3 = 6
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L5f5:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L607
            c9.x0 r12 = new c9.x0
            r3 = 16
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L607:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L616
            r12 = r1
            goto L61d
        L616:
            if (r4 == 0) goto L61b
            java.lang.String r12 = "取消全选"
            goto L61d
        L61b:
            java.lang.String r12 = "全选"
        L61d:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L62d
            r11 = -542444383(0xffffffffdfaaf4a1, float:-2.4637296E19)
            r6.a0(r11)
        L629:
            r6.p(r9)
            goto L651
        L62d:
            r1 = -542423922(0xffffffffdfab448e, float:-2.468229E19)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L644
            if (r7 != r0) goto L64d
        L644:
            wb.x8 r7 = new wb.x8
            r0 = 6
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L64d:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L629
        L651:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L6b5
        L662:
            r12 = -542038003(0xffffffffdfb1280d, float:-2.5530935E19)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L672
            r4 = r1
            goto L675
        L672:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L675:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L686
            r11 = -541714271(0xffffffffdfb618a1, float:-2.624283E19)
            r6.a0(r11)
        L681:
            r6.p(r9)
            r5 = r1
            goto L6a0
        L686:
            r12 = -541698801(0xffffffffdfb6550f, float:-2.6276848E19)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L69c
            c9.x0 r12 = new c9.x0
            r0 = 17
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L69c:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L681
        L6a0:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "添加会话"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L6b5
        L6b2:
            r6.V()
        L6b5:
            sf.n r11 = sf.n.f12433a
            return r11
        L6b8:
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            r9 = 0
            if (r11 == r13) goto L6c5
            r11 = r0
            goto L6c6
        L6c5:
            r11 = r9
        L6c6:
            r12 = r12 & r0
            boolean r11 = r6.S(r12, r11)
            if (r11 == 0) goto L7cf
            i0.a1 r11 = r10.f16731o
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            i0.a1 r13 = r10.f16733q
            i0.e r0 = i0.l.f5952a
            r1 = 0
            if (r12 == 0) goto L77f
            r12 = 331238599(0x13be4cc7, float:4.803845E-27)
            r6.a0(r12)
            java.util.ArrayList r12 = r10.f16724h
            int r2 = r12.size()
            java.lang.String r3 = "删除所选（"
            java.lang.String r4 = "）"
            java.lang.String r2 = eh.a.m(r2, r3, r4)
            boolean r3 = r6.h(r12)
            android.content.Context r4 = r10.f16725i
            boolean r5 = r6.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r6.P()
            if (r3 != 0) goto L707
            if (r5 != r0) goto L712
        L707:
            wb.w8 r5 = new wb.w8
            r3 = 7
            i0.a1 r7 = r10.f16732p
            r5.<init>(r12, r4, r7, r3)
            r6.k0(r5)
        L712:
            fg.a r5 = (fg.a) r5
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L724
            c9.x0 r12 = new c9.x0
            r3 = 18
            r12.<init>(r3, r11, r13)
            r6.k0(r12)
        L724:
            r3 = r12
            fg.a r3 = (fg.a) r3
            java.util.LinkedHashSet r11 = r10.f16726j
            boolean r12 = r11.isEmpty()
            boolean r4 = r10.f16727k
            if (r12 == 0) goto L733
            r12 = r1
            goto L73a
        L733:
            if (r4 == 0) goto L738
            java.lang.String r12 = "取消全选"
            goto L73a
        L738:
            java.lang.String r12 = "全选"
        L73a:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L74a
            r11 = 331998501(0x13c9e525, float:5.0965487E-27)
            r6.a0(r11)
        L746:
            r6.p(r9)
            goto L76e
        L74a:
            r1 = 332018900(0x13ca34d4, float:5.104406E-27)
            r6.a0(r1)
            boolean r1 = r6.g(r4)
            boolean r7 = r6.h(r11)
            r1 = r1 | r7
            java.lang.Object r7 = r6.P()
            if (r1 != 0) goto L761
            if (r7 != r0) goto L76a
        L761:
            wb.x8 r7 = new wb.x8
            r0 = 7
            r7.<init>(r4, r11, r13, r0)
            r6.k0(r7)
        L76a:
            r1 = r7
            fg.a r1 = (fg.a) r1
            goto L746
        L76e:
            r7 = 3456(0xd80, float:4.843E-42)
            r8 = 0
            r0 = r2
            java.lang.String r2 = "取消"
            r4 = r5
            r5 = r1
            r1 = r4
            r4 = r12
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L7d2
        L77f:
            r12 = 332403424(0x13d012e0, float:5.2525194E-27)
            r6.a0(r12)
            java.util.List r12 = r10.f16730n
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L78f
            r4 = r1
            goto L792
        L78f:
            java.lang.String r2 = "批量删除"
            r4 = r2
        L792:
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L7a3
            r11 = 332741509(0x13d53b85, float:5.382745E-27)
            r6.a0(r11)
        L79e:
            r6.p(r9)
            r5 = r1
            goto L7bd
        L7a3:
            r12 = 332757041(0x13d57831, float:5.3887277E-27)
            r6.a0(r12)
            java.lang.Object r12 = r6.P()
            if (r12 != r0) goto L7b9
            c9.x0 r12 = new c9.x0
            r0 = 19
            r12.<init>(r0, r11, r13)
            r6.k0(r12)
        L7b9:
            r1 = r12
            fg.a r1 = (fg.a) r1
            goto L79e
        L7bd:
            r7 = 390(0x186, float:5.47E-43)
            r8 = 0
            java.lang.String r0 = "选择监听群"
            fg.a r1 = r10.f16728l
            java.lang.String r2 = "返回"
            fg.a r3 = r10.f16729m
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6.p(r9)
            goto L7d2
        L7cf:
            r6.V()
        L7d2:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
