package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f15205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15208m;

    public /* synthetic */ be(android.content.SharedPreferences r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7) {
            r1 = this;
            r0 = 0
            r1.f15202g = r0
            r1.<init>()
            r1.f15207l = r2
            r1.f15203h = r3
            r1.f15204i = r4
            r1.f15208m = r5
            r1.f15205j = r6
            r1.f15206k = r7
            return
    }

    public /* synthetic */ be(java.lang.String r1, java.lang.String r2, boolean r3, fg.a r4, sf.b r5, int r6, int r7) {
            r0 = this;
            r0.f15202g = r7
            r0.f15203h = r1
            r0.f15204i = r2
            r0.f15205j = r3
            r0.f15207l = r4
            r0.f15208m = r5
            r0.f15206k = r6
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f15202g
            switch(r0) {
                case 0: goto L108;
                case 1: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f15207l
            r4 = r0
            fg.a r4 = (fg.a) r4
            java.lang.Object r0 = r10.f15208m
            r5 = r0
            fg.l r5 = (fg.l) r5
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f15206k
            r11 = r11 | 1
            int r7 = i0.r.C(r11)
            java.lang.String r1 = r10.f15203h
            java.lang.String r2 = r10.f15204i
            boolean r3 = r10.f15205j
            wb.ho.W3(r1, r2, r3, r4, r5, r6, r7)
        L28:
            sf.n r11 = sf.n.f12433a
            return r11
        L2b:
            java.lang.Object r0 = r10.f15207l
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r10.f15208m
            fg.a r1 = (fg.a) r1
            r5 = r11
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r2 = 2
            r3 = 1
            r8 = 0
            if (r12 == r2) goto L45
            r12 = r3
            goto L46
        L45:
            r12 = r8
        L46:
            r11 = r11 & r3
            boolean r11 = r5.S(r11, r12)
            if (r11 == 0) goto L102
            java.lang.String r11 = r10.f15203h
            boolean r12 = og.m.t0(r11)
            java.lang.String r2 = r10.f15204i
            if (r12 == 0) goto L5a
            java.lang.String r12 = "未选择"
            goto L73
        L5a:
            boolean r12 = og.m.t0(r2)
            if (r12 == 0) goto L72
            java.io.File r12 = new java.io.File
            r12.<init>(r11)
            java.lang.String r12 = r12.getName()
            boolean r4 = og.m.t0(r12)
            if (r4 == 0) goto L73
            java.lang.String r12 = "已选择文件"
            goto L73
        L72:
            r12 = r2
        L73:
            boolean r4 = r10.f15205j
            boolean r6 = r5.g(r4)
            boolean r7 = r5.f(r0)
            r6 = r6 | r7
            java.lang.Object r7 = r5.P()
            i0.e r9 = i0.l.f5952a
            if (r6 != 0) goto L88
            if (r7 != r9) goto L91
        L88:
            l.g r7 = new l.g
            r6 = 1
            r7.<init>(r4, r0, r6)
            r5.k0(r7)
        L91:
            fg.a r7 = (fg.a) r7
            r0 = 6
            java.lang.String r6 = "选择输入文件"
            wb.ho.b(r6, r12, r7, r5, r0)
            boolean r11 = og.m.t0(r11)
            r12 = 0
            if (r11 != 0) goto Ld2
            r11 = -1184468114(0xffffffffb966736e, float:-2.197751E-4)
            r5.a0(r11)
            wb.ho.D1(r12, r5, r8, r3)
            boolean r11 = r5.g(r4)
            boolean r0 = r5.f(r1)
            r11 = r11 | r0
            java.lang.Object r0 = r5.P()
            if (r11 != 0) goto Lba
            if (r0 != r9) goto Lc3
        Lba:
            l.g r0 = new l.g
            r11 = 2
            r0.<init>(r4, r1, r11)
            r5.k0(r0)
        Lc3:
            fg.a r0 = (fg.a) r0
            r11 = 54
            java.lang.String r1 = "清空输入文件"
            java.lang.String r4 = "移除当前已选文件"
            wb.ho.b(r1, r4, r0, r5, r11)
            r5.p(r8)
            goto Ldb
        Ld2:
            r11 = -1184273031(0xffffffffb9696d79, float:-2.2261393E-4)
            r5.a0(r11)
            r5.p(r8)
        Ldb:
            int r11 = r10.f15206k
            if (r11 == r3) goto Lf8
            r0 = -1184187967(0xffffffffb96ab9c1, float:-2.2385178E-4)
            r5.a0(r0)
            wb.ho.D1(r12, r5, r8, r3)
            java.lang.String r3 = wb.ho.D4(r11, r2)
            r6 = 6
            r7 = 4
            java.lang.String r2 = "输出文件"
            r4 = 0
            wb.ho.B1(r2, r3, r4, r5, r6, r7)
            r5.p(r8)
            goto L105
        Lf8:
            r11 = -1184041895(0xffffffffb96cf459, float:-2.259774E-4)
            r5.a0(r11)
            r5.p(r8)
            goto L105
        L102:
            r5.V()
        L105:
            sf.n r11 = sf.n.f12433a
            return r11
        L108:
            java.lang.Object r0 = r10.f15207l
            r1 = r0
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r0 = r10.f15208m
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f15206k
            r11 = r11 | 1
            int r7 = i0.r.C(r11)
            java.lang.String r2 = r10.f15203h
            java.lang.String r3 = r10.f15204i
            boolean r5 = r10.f15205j
            wb.ho.O3(r1, r2, r3, r4, r5, r6, r7)
            goto L28
    }
}
