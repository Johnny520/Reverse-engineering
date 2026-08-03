package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class on extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object f18145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f18146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18147p;

    public on(android.content.ContentResolver r2, android.net.Uri r3, y1.u2 r4, sg.c r5, android.content.Context r6, wf.c r7) {
            r1 = this;
            r0 = 2
            r1.f18139h = r0
            r1.f18141j = r2
            r1.f18142k = r3
            r1.f18144m = r4
            r1.f18147p = r5
            r1.f18143l = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public on(android.content.Context r2, java.lang.String r3, java.lang.String r4, i0.a1 r5, i0.a1 r6, qg.t r7, i0.a1 r8, wf.c r9) {
            r1 = this;
            r0 = 0
            r1.f18139h = r0
            r1.f18143l = r2
            r1.f18145n = r3
            r1.f18146o = r4
            r1.f18141j = r5
            r1.f18142k = r6
            r1.f18147p = r7
            r1.f18144m = r8
            r2 = 2
            r1.<init>(r2, r9)
            return
    }

    public on(i0.a1 r2, i0.a1 r3, android.content.Context r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, wf.c r9) {
            r1 = this;
            r0 = 1
            r1.f18139h = r0
            r1.f18141j = r2
            r1.f18142k = r3
            r1.f18143l = r4
            r1.f18144m = r5
            r1.f18145n = r6
            r1.f18146o = r7
            r1.f18147p = r8
            r2 = 2
            r1.<init>(r2, r9)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r12, wf.c r13) {
            r11 = this;
            int r0 = r11.f18139h
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            wb.on r1 = new wb.on
            java.lang.Object r0 = r11.f18141j
            r2 = r0
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            java.lang.Object r0 = r11.f18142k
            r3 = r0
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r0 = r11.f18144m
            r4 = r0
            y1.u2 r4 = (y1.u2) r4
            java.lang.Object r0 = r11.f18147p
            r5 = r0
            sg.c r5 = (sg.c) r5
            android.content.Context r6 = r11.f18143l
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.f18146o = r12
            return r1
        L24:
            r10 = r13
            wb.on r2 = new wb.on
            java.lang.Object r12 = r11.f18141j
            r3 = r12
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r12 = r11.f18142k
            r4 = r12
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r12 = r11.f18144m
            r6 = r12
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r12 = r11.f18145n
            r7 = r12
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r12 = r11.f18146o
            r8 = r12
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r12 = r11.f18147p
            r9 = r12
            i0.a1 r9 = (i0.a1) r9
            android.content.Context r5 = r11.f18143l
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L4b:
            r10 = r13
            wb.on r2 = new wb.on
            java.lang.Object r12 = r11.f18145n
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r12 = r11.f18146o
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.f18141j
            r6 = r12
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r12 = r11.f18142k
            r7 = r12
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r12 = r11.f18147p
            r8 = r12
            qg.t r8 = (qg.t) r8
            java.lang.Object r12 = r11.f18144m
            r9 = r12
            i0.a1 r9 = (i0.a1) r9
            android.content.Context r3 = r11.f18143l
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f18139h
            switch(r0) {
                case 0: goto L27;
                case 1: goto L16;
                default: goto L5;
            }
        L5:
            tg.e r2 = (tg.e) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            wb.on r2 = (wb.on) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            wb.on r2 = (wb.on) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L27:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            wb.on r2 = (wb.on) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            int r0 = r1.f18139h
            java.lang.String r2 = ""
            android.content.Context r3 = r1.f18143l
            r4 = 2
            sf.n r5 = sf.n.f12433a
            java.lang.Object r6 = r1.f18147p
            r7 = 0
            java.lang.Object r8 = r1.f18142k
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r10 = xf.a.f21579g
            java.lang.Object r11 = r1.f18141j
            java.lang.Object r12 = r1.f18144m
            r13 = 0
            r14 = 1
            switch(r0) {
                case 0: goto L17a;
                case 1: goto La8;
                default: goto L1d;
            }
        L1d:
            y1.u2 r12 = (y1.u2) r12
            android.content.ContentResolver r11 = (android.content.ContentResolver) r11
            int r0 = r1.f18140i
            if (r0 == 0) goto L4f
            if (r0 == r14) goto L41
            if (r0 != r4) goto L3c
            java.lang.Object r0 = r1.f18145n
            sg.b r0 = (sg.b) r0
            java.lang.Object r2 = r1.f18146o
            tg.e r2 = (tg.e) r2
            f8.i.I0(r23)     // Catch: java.lang.Throwable -> L3a
        L34:
            r21 = r2
            r2 = r0
            r0 = r21
            goto L62
        L3a:
            r0 = move-exception
            goto La4
        L3c:
            j8.o.A(r9)
            r5 = r13
            goto La3
        L41:
            java.lang.Object r0 = r1.f18145n
            sg.b r0 = (sg.b) r0
            java.lang.Object r2 = r1.f18146o
            tg.e r2 = (tg.e) r2
            f8.i.I0(r23)     // Catch: java.lang.Throwable -> L3a
            r6 = r23
            goto L74
        L4f:
            f8.i.I0(r23)
            java.lang.Object r0 = r1.f18146o
            tg.e r0 = (tg.e) r0
            android.net.Uri r8 = (android.net.Uri) r8
            r11.registerContentObserver(r8, r7, r12)
            sg.c r6 = (sg.c) r6     // Catch: java.lang.Throwable -> L3a
            sg.b r2 = new sg.b     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3a
        L62:
            r1.f18146o = r0     // Catch: java.lang.Throwable -> L3a
            r1.f18145n = r2     // Catch: java.lang.Throwable -> L3a
            r1.f18140i = r14     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r2.b(r1)     // Catch: java.lang.Throwable -> L3a
            if (r6 != r10) goto L6f
            goto L9e
        L6f:
            r21 = r2
            r2 = r0
            r0 = r21
        L74:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L3a
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto La0
            r0.c()     // Catch: java.lang.Throwable -> L3a
            f.k0 r6 = y1.v2.f22138a     // Catch: java.lang.Throwable -> L3a
            android.content.ContentResolver r6 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r6 = android.provider.Settings.Global.getFloat(r6, r7, r8)     // Catch: java.lang.Throwable -> L3a
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L3a
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            r1.f18146o = r2     // Catch: java.lang.Throwable -> L3a
            r1.f18145n = r0     // Catch: java.lang.Throwable -> L3a
            r1.f18140i = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r2.e(r7, r1)     // Catch: java.lang.Throwable -> L3a
            if (r6 != r10) goto L34
        L9e:
            r5 = r10
            goto La3
        La0:
            r11.unregisterContentObserver(r12)
        La3:
            return r5
        La4:
            r11.unregisterContentObserver(r12)
            throw r0
        La8:
            i0.a1 r8 = (i0.a1) r8
            i0.a1 r11 = (i0.a1) r11
            int r0 = r1.f18140i
            r19 = 0
            if (r0 == 0) goto Lc6
            if (r0 == r14) goto Lc2
            if (r0 != r4) goto Lbc
            f8.i.I0(r23)
            r0 = r23
            goto L100
        Lbc:
            j8.o.A(r9)
            r5 = r13
            goto L179
        Lc2:
            f8.i.I0(r23)
            goto Ld4
        Lc6:
            f8.i.I0(r23)
            r1.f18140i = r14
            r13 = 250(0xfa, double:1.235E-321)
            java.lang.Object r0 = qg.v.f(r13, r1)
            if (r0 != r10) goto Ld4
            goto Lfd
        Ld4:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.setValue(r0)
            r8.setValue(r2)
            xg.e r0 = qg.c0.f11038a
            xg.d r0 = xg.d.f21615i
            w.u0 r15 = new w.u0
            r17 = r12
            i0.a1 r17 = (i0.a1) r17
            java.lang.Object r2 = r1.f18145n
            r18 = r2
            i0.a1 r18 = (i0.a1) r18
            r20 = 5
            android.content.Context r2 = r1.f18143l
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r1.f18140i = r4
            java.lang.Object r0 = qg.v.x(r0, r15, r1)
            if (r0 != r10) goto L100
        Lfd:
            r5 = r10
            goto L179
        L100:
            sf.g r0 = (sf.g) r0
            java.lang.Object r0 = r0.f12421g
            java.lang.Object r2 = r1.f18146o
            i0.a1 r2 = (i0.a1) r2
            i0.a1 r6 = (i0.a1) r6
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L121
            gb.n r0 = (gb.n) r0
            java.util.List r3 = r0.f4446a
            r2.setValue(r3)
            int r0 = r0.f4447b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.setValue(r0)
            goto L174
        L121:
            boolean r0 = r3 instanceof gb.f
            if (r0 == 0) goto L135
            r0 = r3
            gb.f r0 = (gb.f) r0
            java.lang.String r0 = r0.f4421g
            java.lang.String r4 = "UPLOADER_BLACKLISTED"
            boolean r0 = gg.l.a(r0, r4)
            if (r0 == 0) goto L135
            java.lang.String r0 = "当前微信账号已被禁止上传在线插件"
            goto L15e
        L135:
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L144
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L146
        L144:
            r0 = r19
        L146:
            if (r0 == 0) goto L151
            boolean r4 = og.m.t0(r0)
            if (r4 == 0) goto L14f
            goto L151
        L14f:
            r19 = r0
        L151:
            if (r19 == 0) goto L156
            r0 = r19
            goto L15e
        L156:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L15e:
            r8.setValue(r0)
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L174
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r6.setValue(r0)
        L174:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setValue(r0)
        L179:
            return r5
        L17a:
            i0.a1 r12 = (i0.a1) r12
            qg.t r6 = (qg.t) r6
            i0.a1 r8 = (i0.a1) r8
            i0.a1 r11 = (i0.a1) r11
            int r0 = r1.f18140i
            if (r0 == 0) goto L193
            if (r0 != r14) goto L18e
            f8.i.I0(r23)
            r0 = r23
            goto L1b1
        L18e:
            j8.o.A(r9)
            r5 = r13
            goto L1f1
        L193:
            f8.i.I0(r23)
            xg.e r0 = qg.c0.f11038a
            xg.d r0 = xg.d.f21615i
            wb.ln r4 = new wb.ln
            java.lang.Object r9 = r1.f18145n
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r15 = r1.f18146o
            java.lang.String r15 = (java.lang.String) r15
            r4.<init>(r9, r15, r13, r14)
            r1.f18140i = r14
            java.lang.Object r0 = qg.v.x(r0, r4, r1)
            if (r0 != r10) goto L1b1
            r5 = r10
            goto L1f1
        L1b1:
            sf.g r0 = (sf.g) r0
            java.lang.Object r0 = r0.f12421g
            boolean r4 = r0 instanceof sf.f
            if (r4 != 0) goto L1c7
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            og.k r9 = wb.ho.f16633a
            r11.setValue(r4)
            r8.setValue(r2)
            wb.ho.s(r6, r11, r12, r8, r7)
        L1c7:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L1e2
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "发送短信验证码失败: "
            java.lang.String r0 = wb.en.g(r4, r0)
            og.k r4 = wb.ho.f16633a
            r11.setValue(r0)
            r8.setValue(r2)
            wb.ho.s(r6, r11, r12, r8, r7)
        L1e2:
            og.k r0 = wb.ho.f16633a
            java.lang.Object r0 = r11.getValue()
            java.lang.String r0 = (java.lang.String) r0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r7)
            r0.show()
        L1f1:
            return r5
    }
}
