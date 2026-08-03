package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class zp extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f20694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20701r;

    public zp(android.content.Context r2, gb.o r3, boolean r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, wf.c r11) {
            r1 = this;
            r0 = 0
            r1.f20691h = r0
            r1.f20696m = r2
            r1.f20697n = r3
            r1.f20694k = r4
            r1.f20693j = r5
            r1.f20695l = r6
            r1.f20698o = r7
            r1.f20699p = r8
            r1.f20700q = r9
            r1.f20701r = r10
            r2 = 2
            r1.<init>(r2, r11)
            return
    }

    public zp(i0.a1 r2, i.c r3, boolean r4, p.r1 r5, u2.c r6, y1.g2 r7, i.c r8, i0.a1 r9, wf.c r10) {
            r1 = this;
            r0 = 1
            r1.f20691h = r0
            r1.f20693j = r2
            r1.f20697n = r3
            r1.f20694k = r4
            r1.f20698o = r5
            r1.f20699p = r6
            r1.f20700q = r7
            r1.f20701r = r8
            r1.f20695l = r9
            r2 = 2
            r1.<init>(r2, r10)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r14, wf.c r15) {
            r13 = this;
            int r0 = r13.f20691h
            switch(r0) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            wb.zp r1 = new wb.zp
            java.lang.Object r0 = r13.f20697n
            r3 = r0
            i.c r3 = (i.c) r3
            java.lang.Object r0 = r13.f20698o
            r5 = r0
            p.r1 r5 = (p.r1) r5
            java.lang.Object r0 = r13.f20699p
            r6 = r0
            u2.c r6 = (u2.c) r6
            java.lang.Object r0 = r13.f20700q
            r7 = r0
            y1.g2 r7 = (y1.g2) r7
            java.lang.Object r0 = r13.f20701r
            r8 = r0
            i.c r8 = (i.c) r8
            i0.a1 r9 = r13.f20695l
            i0.a1 r2 = r13.f20693j
            boolean r4 = r13.f20694k
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.f20696m = r14
            return r1
        L2d:
            r10 = r15
            wb.zp r2 = new wb.zp
            java.lang.Object r14 = r13.f20696m
            r3 = r14
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r14 = r13.f20697n
            r4 = r14
            gb.o r4 = (gb.o) r4
            java.lang.Object r14 = r13.f20698o
            r8 = r14
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r14 = r13.f20699p
            r9 = r14
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r14 = r13.f20700q
            i0.a1 r14 = (i0.a1) r14
            java.lang.Object r15 = r13.f20701r
            r11 = r15
            i0.a1 r11 = (i0.a1) r11
            boolean r5 = r13.f20694k
            i0.a1 r6 = r13.f20693j
            i0.a1 r7 = r13.f20695l
            r12 = r10
            r10 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f20691h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.zp r2 = (wb.zp) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.zp r2 = (wb.zp) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            r20 = this;
            r4 = r20
            int r0 = r4.f20691h
            boolean r1 = r4.f20694k
            java.lang.Object r2 = r4.f20697n
            i0.a1 r3 = r4.f20695l
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r6 = xf.a.f21579g
            java.lang.Object r7 = r4.f20701r
            i0.a1 r8 = r4.f20693j
            sf.n r9 = sf.n.f12433a
            r10 = 1
            r11 = 0
            switch(r0) {
                case 0: goto Lac;
                default: goto L19;
            }
        L19:
            i.c r7 = (i.c) r7
            java.lang.Object r0 = r4.f20696m
            qg.t r0 = (qg.t) r0
            int r12 = r4.f20692i
            r13 = 3
            if (r12 == 0) goto L59
            if (r12 == r10) goto L55
            r0 = 2
            if (r12 == r0) goto L35
            if (r12 != r13) goto L2f
            f8.i.I0(r21)
            goto L43
        L2f:
            j8.o.A(r5)
            r6 = r11
            goto Lab
        L35:
            f8.i.I0(r21)
            r4.f20696m = r11
            r4.f20692i = r13
            java.lang.Object r0 = r7.f(r4)
            if (r0 != r6) goto L43
            goto Lab
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.setValue(r0)
            java.lang.Object r0 = r3.getValue()
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L53
            r0.invoke()
        L53:
            r6 = r9
            goto Lab
        L55:
            f8.i.I0(r21)
            goto L53
        L59:
            f8.i.I0(r21)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.setValue(r3)
            wb.n3 r3 = new wb.n3
            r3.<init>(r7, r11, r10)
            qg.v.q(r0, r11, r3, r13)
            r0 = r2
            i.c r0 = (i.c) r0
            r12 = r1
            java.lang.Float r1 = new java.lang.Float
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            if (r12 == 0) goto L8b
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r5 = 1050253722(0x3e99999a, float:0.3)
            double r7 = (double) r5
            double r2 = r2 / r7
            double r2 = r2 * r2
            float r2 = (float) r2
            r3 = 4
            r5 = 1063675494(0x3f666666, float:0.9)
            i.r0 r2 = i.d.o(r5, r2, r11, r3)
            goto L9e
        L8b:
            java.lang.Float r2 = new java.lang.Float
            r3 = 953267991(0x38d1b717, float:1.0E-4)
            r2.<init>(r3)
            i.r0 r3 = new i.r0
            r5 = 1063339950(0x3f6147ae, float:0.88)
            r7 = 1138819072(0x43e10000, float:450.0)
            r3.<init>(r5, r7, r2)
            r2 = r3
        L9e:
            r4.f20696m = r11
            r4.f20692i = r10
            r3 = 0
            r5 = 12
            java.lang.Object r0 = i.c.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L53
        Lab:
            return r6
        Lac:
            r12 = r1
            gb.o r2 = (gb.o) r2
            java.lang.Object r0 = r4.f20696m
            android.content.Context r0 = (android.content.Context) r0
            int r1 = r4.f20692i
            if (r1 == 0) goto Lc5
            if (r1 != r10) goto Lbf
            f8.i.I0(r21)
            r1 = r21
            goto Ldb
        Lbf:
            j8.o.A(r5)
            r6 = r11
            goto L1cd
        Lc5:
            f8.i.I0(r21)
            xg.e r1 = qg.c0.f11038a
            xg.d r1 = xg.d.f21615i
            wb.yp r5 = new wb.yp
            r5.<init>(r0, r2, r12, r11)
            r4.f20692i = r10
            java.lang.Object r1 = qg.v.x(r1, r5, r4)
            if (r1 != r6) goto Ldb
            goto L1cd
        Ldb:
            sf.g r1 = (sf.g) r1
            java.lang.Object r1 = r1.f12421g
            java.lang.Object r5 = r4.f20698o
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r4.f20699p
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r10 = r4.f20700q
            i0.a1 r10 = (i0.a1) r10
            java.lang.Throwable r12 = sf.g.b(r1)
            if (r12 != 0) goto L186
            gb.i r1 = (gb.i) r1
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r8.setValue(r12)
            java.lang.Long r8 = r1.f4436d
            if (r8 == 0) goto L16b
            long r13 = r8.longValue()
            java.lang.Object r8 = r3.getValue()
            r12 = r8
            gb.o r12 = (gb.o) r12
            if (r12 == 0) goto L114
            r17 = 0
            r19 = 3967(0xf7f, float:5.559E-42)
            r15 = 0
            gb.o r8 = gb.o.a(r12, r13, r15, r17, r19)
            goto L115
        L114:
            r8 = r11
        L115:
            r3.setValue(r8)
            java.lang.Object r3 = r5.getValue()
            r12 = r3
            gb.o r12 = (gb.o) r12
            if (r12 == 0) goto L12c
            r17 = 0
            r19 = 3967(0xf7f, float:5.559E-42)
            r15 = 0
            gb.o r3 = gb.o.a(r12, r13, r15, r17, r19)
            goto L12d
        L12c:
            r3 = r11
        L12d:
            r5.setValue(r3)
            java.lang.Object r3 = r6.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            int r8 = tf.n.e1(r3)
            r5.<init>(r8)
            java.util.Iterator r3 = r3.iterator()
        L143:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L168
            java.lang.Object r8 = r3.next()
            r12 = r8
            gb.o r12 = (gb.o) r12
            java.lang.String r8 = r12.f4449a
            java.lang.String r15 = r2.f4449a
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L164
            r17 = 0
            r19 = 3967(0xf7f, float:5.559E-42)
            r15 = 0
            gb.o r12 = gb.o.a(r12, r13, r15, r17, r19)
        L164:
            r5.add(r12)
            goto L143
        L168:
            r6.setValue(r5)
        L16b:
            boolean r1 = r1.f4435c
            if (r1 == 0) goto L172
            java.lang.String r1 = "更新成功，插件已保持禁用"
            goto L174
        L172:
            java.lang.String r1 = "安装成功，插件默认禁用"
        L174:
            r10.setValue(r1)
            java.lang.Object r1 = r10.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L1c7
        L186:
            boolean r0 = r12 instanceof gb.f
            if (r0 == 0) goto L19a
            r0 = r12
            gb.f r0 = (gb.f) r0
            java.lang.String r0 = r0.f4421g
            java.lang.String r1 = "UPLOADER_BLACKLISTED"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L19a
            java.lang.String r0 = "当前微信账号已被禁止上传在线插件"
            goto L1be
        L19a:
            java.lang.String r0 = r12.getMessage()
            if (r0 == 0) goto L1a9
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L1aa
        L1a9:
            r0 = r11
        L1aa:
            if (r0 == 0) goto L1b2
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L1b3
        L1b2:
            r0 = r11
        L1b3:
            if (r0 == 0) goto L1b6
            goto L1be
        L1b6:
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L1be:
            java.lang.String r1 = "安装失败: "
            java.lang.String r0 = r1.concat(r0)
            r10.setValue(r0)
        L1c7:
            i0.a1 r7 = (i0.a1) r7
            r7.setValue(r11)
            r6 = r9
        L1cd:
            return r6
    }
}
