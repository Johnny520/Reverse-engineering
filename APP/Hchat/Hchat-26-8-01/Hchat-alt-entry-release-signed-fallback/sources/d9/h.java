package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2106k;

    public /* synthetic */ h(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.f2102g = r1
            r0.f2104i = r2
            r0.f2103h = r5
            r0.f2105j = r3
            r0.f2106k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ h(i0.a1 r2, java.util.ArrayList r3, java.util.List r4, boolean r5) {
            r1 = this;
            r0 = 2
            r1.f2102g = r0
            r1.<init>()
            r1.f2104i = r2
            r1.f2105j = r3
            r1.f2106k = r4
            r1.f2103h = r5
            return
    }

    public /* synthetic */ h(java.lang.Object r1, java.io.Serializable r2, boolean r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f2102g = r5
            r0.f2104i = r1
            r0.f2105j = r2
            r0.f2103h = r3
            r0.f2106k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ h(boolean r1, fg.l r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f2102g = r5
            r0.f2103h = r1
            r0.f2104i = r2
            r0.f2105j = r3
            r0.f2106k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f2102g
            r1 = 0
            r2 = 3
            r3 = 1
            switch(r0) {
                case 0: goto L1e5;
                case 1: goto L176;
                case 2: goto L138;
                case 3: goto Lda;
                case 4: goto Lb1;
                case 5: goto L68;
                case 6: goto L3d;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r13.f2104i
            x8.k r0 = (x8.k) r0
            java.lang.Object r1 = r13.f2105j
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r2 = r13.f2103h
            java.lang.Object r3 = r13.f2106k
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            okio.ByteString r14 = (okio.ByteString) r14
            r14.getClass()
            if (r0 == 0) goto L20
            r0.i()
        L20:
            boolean r0 = r1.get()
            if (r0 == 0) goto L3a
            byte[] r14 = r14.toByteArray()
            if (r2 == 0) goto L3a
            int r0 = r14.length
            if (r0 != 0) goto L30
            goto L3a
        L30:
            monitor-enter(r3)
            r3.add(r14)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            goto L3a
        L36:
            r0 = move-exception
            r14 = r0
            monitor-exit(r3)
            throw r14
        L3a:
            sf.n r14 = sf.n.f12433a
            return r14
        L3d:
            java.lang.Object r0 = r13.f2104i
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            boolean r4 = r13.f2103h
            java.lang.Object r5 = r13.f2105j
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r13.f2106k
            i0.a1 r6 = (i0.a1) r6
            r.h r14 = (r.h) r14
            r14.getClass()
            s0.d r7 = wb.p0.S4
            r.h.a(r14, r1, r7, r2)
            wb.wl r7 = new wb.wl
            r7.<init>(r0, r4, r5, r6)
            s0.d r0 = new s0.d
            r4 = -227850278(0xfffffffff26b47da, float:-4.6602138E30)
            r0.<init>(r4, r7, r3)
            r.h.a(r14, r1, r0, r2)
        L65:
            sf.n r14 = sf.n.f12433a
            return r14
        L68:
            boolean r0 = r13.f2103h
            java.lang.Object r1 = r13.f2104i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r13.f2105j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r13.f2106k
            i0.a1 r3 = (i0.a1) r3
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            sf.e r0 = wb.ho.Y4(r0)
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La5
            java.lang.Object r0 = r0.f12418g
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r2 = r0.length()
            if (r2 != 0) goto L9e
            r0 = r14
        L9e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = wb.ho.a5(r0, r14)
            goto Lad
        La5:
            java.lang.Object r0 = r0.f12419h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = wb.ho.a5(r14, r0)
        Lad:
            r1.invoke(r14)
            goto L65
        Lb1:
            boolean r0 = r13.f2103h
            java.lang.Object r4 = r13.f2104i
            fg.l r4 = (fg.l) r4
            java.lang.Object r5 = r13.f2105j
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r13.f2106k
            fg.a r6 = (fg.a) r6
            r.h r14 = (r.h) r14
            r14.getClass()
            s0.d r7 = wb.p0.K0
            r.h.a(r14, r1, r7, r2)
            hb.j0 r7 = new hb.j0
            r7.<init>(r0, r4, r5, r6)
            s0.d r0 = new s0.d
            r4 = -7471039(0xffffffffff8e0041, float:NaN)
            r0.<init>(r4, r7, r3)
            r.h.a(r14, r1, r0, r2)
            goto L65
        Lda:
            java.lang.Object r0 = r13.f2104i
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r13.f2103h
            java.lang.Object r5 = r13.f2105j
            fg.l r5 = (fg.l) r5
            java.lang.Object r6 = r13.f2106k
            fg.l r6 = (fg.l) r6
            r.h r14 = (r.h) r14
            r14.getClass()
            s0.d r7 = wb.p0.f18323p4
            r.h.a(r14, r1, r7, r2)
            wb.yd r7 = new wb.yd
            r7.<init>(r4, r5, r0)
            s0.d r4 = new s0.d
            r5 = 1130585210(0x43635c7a, float:227.36124)
            r4.<init>(r5, r7, r3)
            r.h.a(r14, r1, r4, r2)
            s0.d r4 = wb.p0.f18329q4
            r.h.a(r14, r1, r4, r2)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L113
            s0.d r0 = wb.p0.f18343s4
            r.h.a(r14, r1, r0, r2)
            goto L135
        L113:
            java.util.Iterator r0 = r0.iterator()
        L117:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L135
            java.lang.Object r4 = r0.next()
            db.c r4 = (db.c) r4
            wb.wc r5 = new wb.wc
            r7 = 2
            r5.<init>(r7, r4, r6)
            s0.d r4 = new s0.d
            r7 = 660479474(0x275e1df2, float:3.0824922E-15)
            r4.<init>(r7, r5, r3)
            r.h.a(r14, r1, r4, r2)
            goto L117
        L135:
            sf.n r14 = sf.n.f12433a
            return r14
        L138:
            java.lang.Object r0 = r13.f2104i
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r13.f2105j
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r13.f2106k
            boolean r4 = r13.f2103h
            v1.a1 r14 = (v1.a1) r14
            r14.f13890g = r3
            int r3 = r1.size()
            r5 = 0
            r6 = r5
        L14e:
            if (r6 >= r3) goto L15c
            java.lang.Object r7 = r1.get(r6)
            r.q r7 = (r.q) r7
            r7.c(r14, r4)
            int r6 = r6 + 1
            goto L14e
        L15c:
            int r1 = r2.size()
            r3 = r5
        L161:
            if (r3 >= r1) goto L16f
            java.lang.Object r6 = r2.get(r3)
            r.q r6 = (r.q) r6
            r6.c(r14, r4)
            int r3 = r3 + 1
            goto L161
        L16f:
            r14.f13890g = r5
            r0.getValue()
            goto L65
        L176:
            java.lang.Object r0 = r13.f2104i
            fg.a r0 = (fg.a) r0
            boolean r1 = r13.f2103h
            java.lang.Object r2 = r13.f2105j
            r4 = r2
            f1.g r4 = (f1.g) r4
            java.lang.Object r2 = r13.f2106k
            r8 = r2
            f1.n r8 = (f1.n) r8
            r3 = r14
            x1.h0 r3 = (x1.h0) r3
            r3.e()
            h1.b r14 = r3.f20932g
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L19b
            goto L1e2
        L19b:
            if (r1 == 0) goto L1d9
            long r0 = r14.I0()
            b5.c r14 = r14.f5038h
            long r11 = r14.v()
            f1.u r2 = r14.p()
            r2.e()
            java.lang.Object r2 = r14.f469a     // Catch: java.lang.Throwable -> L1cd
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2     // Catch: java.lang.Throwable -> L1cd
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.S(r5, r6, r0)     // Catch: java.lang.Throwable -> L1cd
            r9 = 0
            r10 = 46
            r5 = 0
            r7 = 0
            h1.d.U(r3, r4, r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1cd
            f1.u r0 = r14.p()
            r0.p()
            r14.U(r11)
            goto L1e2
        L1cd:
            r0 = move-exception
            f1.u r1 = r14.p()
            r1.p()
            r14.U(r11)
            throw r0
        L1d9:
            r9 = 0
            r10 = 46
            r5 = 0
            r7 = 0
            h1.d.U(r3, r4, r5, r7, r8, r9, r10)
        L1e2:
            sf.n r14 = sf.n.f12433a
            return r14
        L1e5:
            java.lang.Object r0 = r13.f2104i
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r13.f2105j
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r13.f2103h
            java.lang.Object r5 = r13.f2106k
            d9.m r5 = (d9.m) r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r14 != 0) goto L210
            c9.i r14 = new c9.i
            r2 = 11
            r14.<init>(r5, r2, r0)
            d9.f r2 = d9.f.f2096a
            r0.getClass()
            r1.getClass()
            d9.f r2 = d9.f.f2096a
            r2.b(r0, r14, r1, r3)
            goto L22e
        L210:
            if (r4 == 0) goto L22e
            r8.g r14 = r5.f2121a
            android.content.Context r14 = r14.f11620a
            d9.o.g(r14, r1)
            java.lang.String r14 = "已恢复微信头像"
            if (r0 == 0) goto L22e
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            c9.t r3 = new c9.t
            r3.<init>(r0, r14, r2)
            r1.post(r3)
        L22e:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
