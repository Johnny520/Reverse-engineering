package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f19471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19473l;

    public /* synthetic */ ug(java.lang.String r1, java.lang.String r2, boolean r3, fg.a r4, y0.o r5, int r6) {
            r0 = this;
            r6 = 0
            r0.f19468g = r6
            r0.<init>()
            r0.f19470i = r1
            r0.f19472k = r2
            r0.f19469h = r3
            r0.f19471j = r4
            r0.f19473l = r5
            return
    }

    public /* synthetic */ ug(wb.y2 r1, java.lang.String r2, java.lang.String r3, boolean r4, fg.a r5, int r6) {
            r0 = this;
            r6 = 2
            r0.f19468g = r6
            r0.<init>()
            r0.f19473l = r1
            r0.f19470i = r2
            r0.f19472k = r3
            r0.f19469h = r4
            r0.f19471j = r5
            return
    }

    public /* synthetic */ ug(boolean r2, fg.l r3, java.lang.String r4, fg.l r5, fg.a r6) {
            r1 = this;
            r0 = 1
            r1.f19468g = r0
            r1.<init>()
            r1.f19469h = r2
            r1.f19472k = r3
            r1.f19470i = r4
            r1.f19473l = r5
            r1.f19471j = r6
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.f19468g
            switch(r1) {
                case 0: goto Lbd;
                case 1: goto L2e;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f19473l
            r2 = r1
            wb.y2 r2 = (wb.y2) r2
            java.lang.Object r1 = r0.f19472k
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r7 = r17
            i0.h0 r7 = (i0.h0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 24577(0x6001, float:3.444E-41)
            int r8 = i0.r.C(r1)
            java.lang.String r3 = r0.f19470i
            boolean r5 = r0.f19469h
            fg.a r6 = r0.f19471j
            r2.A(r3, r4, r5, r6, r7, r8)
        L2b:
            sf.n r1 = sf.n.f12433a
            return r1
        L2e:
            java.lang.Object r1 = r0.f19472k
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f19473l
            r11 = r1
            fg.l r11 = (fg.l) r11
            r7 = r17
            i0.h0 r7 = (i0.h0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r15 = 1
            r10 = 0
            if (r2 == r3) goto L4d
            r2 = r15
            goto L4e
        L4d:
            r2 = r10
        L4e:
            r1 = r1 & r15
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto Lb7
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            boolean r2 = r0.f19469h
            java.lang.String r3 = "自动压缩上下文"
            java.lang.String r4 = "达到设定阈值后压缩较早对话"
            r5 = 0
            wb.ho.P3(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            if (r2 == 0) goto L84
            r2 = -1592709104(0xffffffffa1113010, float:-4.919152E-19)
            r7.a0(r2)
            wb.ho.D1(r1, r7, r10, r15)
            r13 = 54
            r14 = 8
            r12 = r7
            java.lang.String r7 = "压缩阈值"
            java.lang.String r8 = "Token 估算值，范围 2000 到 1000000"
            java.lang.String r9 = r0.f19470i
            r2 = r10
            r10 = 0
            wb.ho.C1(r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = r12
            r7.p(r2)
            goto L8e
        L84:
            r2 = r10
            r3 = -1592380442(0xffffffffa11633e6, float:-5.0890664E-19)
            r7.a0(r3)
            r7.p(r2)
        L8e:
            wb.ho.D1(r1, r7, r2, r15)
            fg.a r1 = r0.f19471j
            boolean r2 = r7.f(r1)
            java.lang.Object r3 = r7.P()
            if (r2 != 0) goto La1
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto Lab
        La1:
            wb.kc r3 = new wb.kc
            r2 = 27
            r3.<init>(r1, r2)
            r7.k0(r3)
        Lab:
            fg.a r3 = (fg.a) r3
            r1 = 54
            java.lang.String r2 = "立即压缩当前会话"
            java.lang.String r4 = "保留本地历史和当前代码草稿"
            wb.ho.b(r2, r4, r3, r7, r1)
            goto Lba
        Lb7:
            r7.V()
        Lba:
            sf.n r1 = sf.n.f12433a
            return r1
        Lbd:
            java.lang.Object r1 = r0.f19472k
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.f19473l
            r7 = r1
            y0.o r7 = (y0.o) r7
            r4 = r17
            i0.h0 r4 = (i0.h0) r4
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 3079(0xc07, float:4.315E-42)
            int r2 = i0.r.C(r1)
            fg.a r3 = r0.f19471j
            java.lang.String r5 = r0.f19470i
            boolean r8 = r0.f19469h
            wb.ho.U(r2, r3, r4, r5, r6, r7, r8)
            goto L2b
    }
}
