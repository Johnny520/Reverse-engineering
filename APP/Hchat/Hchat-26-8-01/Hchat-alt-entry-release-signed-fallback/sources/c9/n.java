package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c9.a f1279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ aa.c f1280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1281k;

    public /* synthetic */ n(android.app.Activity r1, c9.a r2, aa.c r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.f1277g = r5
            r0.f1278h = r1
            r0.f1279i = r2
            r0.f1280j = r3
            r0.f1281k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r33) {
            r32 = this;
            r0 = r32
            int r1 = r0.f1277g
            sf.n r2 = sf.n.f12433a
            switch(r1) {
                case 0: goto L15f;
                default: goto L9;
            }
        L9:
            r1 = r33
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.os.Handler r3 = c9.b0.f1104a
            r3 = 4
            android.app.Activity r4 = r0.f1278h
            c9.a r5 = r0.f1279i
            aa.c r6 = r0.f1280j
            java.lang.String r7 = r0.f1281k
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L12f
            r10 = 6
            if (r1 == r9) goto Ld9
            if (r1 == r8) goto La1
            r10 = 3
            if (r1 == r10) goto L82
            if (r1 == r3) goto L63
            r10 = 5
            if (r1 == r10) goto L34
            r18 = r2
            r3 = r6
            r2 = r7
            r0 = r9
            goto L14e
        L34:
            boolean r10 = r5.f1092l
            r16 = r10 ^ 1
            r17 = 2047(0x7ff, float:2.868E-42)
            r10 = r6
            r6 = 0
            r11 = r7
            r7 = 0
            r12 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r14 = r10
            r10 = 0
            r15 = r11
            r11 = 0
            r18 = r12
            r12 = 0
            r19 = r13
            r13 = 0
            r20 = r14
            r14 = 0
            r21 = r15
            r15 = 0
            r18 = r2
            r0 = r19
            r3 = r20
            r2 = r21
            c9.a r5 = c9.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            c9.b0.j(r4, r5, r3)
            goto L14e
        L63:
            r18 = r2
            r3 = r6
            r2 = r7
            r0 = r9
            boolean r6 = r5.f1090j
            r15 = r6 ^ 1
            r16 = 0
            r17 = 3583(0xdff, float:5.021E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            c9.a r5 = c9.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            c9.b0.j(r4, r5, r3)
            goto L14e
        L82:
            r18 = r2
            r3 = r6
            r2 = r7
            r0 = r9
            boolean r6 = r5.f1089i
            r14 = r6 ^ 1
            r16 = 0
            r17 = 3839(0xeff, float:5.38E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            c9.a r5 = c9.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            c9.b0.j(r4, r5, r3)
            goto L14e
        La1:
            r18 = r2
            r3 = r6
            r2 = r7
            r0 = r9
            c9.a r6 = c9.b0.c(r4, r2)
            if (r6 == 0) goto Ld1
            java.lang.String r11 = r6.f1082b
            r5 = r4
            c9.n r4 = new c9.n
            r9 = 0
            r8 = r2
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r14 = r7
            r15 = r8
            bi.c r12 = new bi.c
            r12.<init>(r10)
            r13 = 576(0x240, float:8.07E-43)
            r7 = r11
            r11 = r4
            r4 = r5
            java.lang.String r5 = "命名"
            java.lang.String r6 = "修改当前聊天分组名称"
            java.lang.String r8 = "分组名称"
            r9 = 50
            r10 = 0
            wb.y2.c2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        Lcf:
            r5 = r4
            goto Ld4
        Ld1:
            r15 = r2
            r14 = r3
            goto Lcf
        Ld4:
            r4 = r5
        Ld5:
            r3 = r14
            r2 = r15
            goto L14e
        Ld9:
            r18 = r2
            r5 = r4
            r14 = r6
            r15 = r7
            r0 = r9
            c9.a r2 = c9.b0.c(r5, r15)
            if (r2 == 0) goto Ld4
            java.lang.String r6 = c9.d2.F(r15)
            boolean r3 = d9.o.d(r5, r6)
            java.lang.String r2 = r2.f1082b
            uf.c r4 = a.a.E()
            if (r3 == 0) goto Lf8
            java.lang.String r7 = "更换头像"
            goto Lfa
        Lf8:
            java.lang.String r7 = "选择头像"
        Lfa:
            sf.e r8 = new sf.e
            java.lang.String r9 = "从系统相册或文件中选择"
            r8.<init>(r7, r9)
            r4.add(r8)
            if (r3 == 0) goto L112
            sf.e r3 = new sf.e
            java.lang.String r7 = "恢复默认"
            java.lang.String r8 = "移除当前分组头像"
            r3.<init>(r7, r8)
            r4.add(r3)
        L112:
            uf.c r3 = a.a.t(r4)
            c9.o r4 = new c9.o
            r9 = 0
            r8 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            bi.c r9 = new bi.c
            r9.<init>(r10)
            wb.lv r10 = wb.lv.f17583j
            r8 = r4
            r4 = r5
            java.lang.String r5 = "自定义头像"
            r6 = r2
            r7 = r3
            wb.y2.Q1(r4, r5, r6, r7, r8, r9, r10)
            goto Ld5
        L12f:
            r18 = r2
            r14 = r6
            r15 = r7
            r0 = r9
            boolean r2 = r5.f1087g
            r12 = r2 ^ 1
            r16 = 0
            r17 = 4031(0xfbf, float:5.649E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r3 = r14
            r14 = 0
            r2 = r15
            r15 = 0
            c9.a r5 = c9.a.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            c9.b0.j(r4, r5, r3)
        L14e:
            if (r1 == r0) goto L15e
            r12 = 2
            if (r1 == r12) goto L15e
            android.os.Handler r0 = c9.b0.f1104a
            ac.l r1 = new ac.l
            r5 = 4
            r1.<init>(r5, r4, r3, r2)
            r0.post(r1)
        L15e:
            return r18
        L15f:
            r18 = r2
            r0 = r33
            java.lang.String r0 = (java.lang.String) r0
            android.os.Handler r1 = c9.b0.f1104a
            r0.getClass()
            r1 = r32
            android.app.Activity r2 = r1.f1278h
            java.util.List r3 = c9.o2.i(r2)
            boolean r4 = r3.isEmpty()
            c9.a r5 = r1.f1279i
            if (r4 == 0) goto L17b
            goto L1ad
        L17b:
            java.util.Iterator r3 = r3.iterator()
        L17f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1ad
            java.lang.Object r4 = r3.next()
            c9.a r4 = (c9.a) r4
            java.lang.String r6 = r4.f1081a
            java.lang.String r7 = r1.f1281k
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L17f
            java.lang.String r6 = r4.f1083c
            java.lang.String r7 = r5.f1083c
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L17f
            java.lang.String r4 = r4.f1082b
            boolean r4 = og.t.X(r4, r0)
            if (r4 == 0) goto L17f
            java.lang.String r0 = "同一层级已存在同名分组"
            c9.b0.h(r2, r0)
            goto L1d0
        L1ad:
            r30 = 0
            r31 = 4093(0xffd, float:5.736E-42)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r21 = r0
            r19 = r5
            c9.a r0 = c9.a.a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            aa.c r3 = r1.f1280j
            c9.b0.j(r2, r0, r3)
        L1d0:
            return r18
    }
}
