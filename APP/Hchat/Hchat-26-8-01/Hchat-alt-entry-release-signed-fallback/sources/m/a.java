package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k7.f, r7.g, s5.a, r1.a, t3.e, tg.d, okhttp3.CookieJar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f8069h;

    public a(int r2) {
            r1 = this;
            r1.f8068g = r2
            switch(r2) {
                case 15: goto L55;
                case 17: goto L4a;
                case 21: goto L36;
                case 28: goto L29;
                case 29: goto L1e;
                default: goto L5;
            }
        L5:
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 < r0) goto L15
            l3.w r2 = new l3.w
            r0 = 6
            r2.<init>(r0)
            goto L1b
        L15:
            l3.w r2 = new l3.w
            r0 = 7
            r2.<init>(r0)
        L1b:
            r1.f8069h = r2
            return
        L1e:
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f8069h = r2
            return
        L29:
            r1.<init>()
            x1.a2 r2 = new x1.a2
            x1.o1 r0 = x1.k.f20969a
            r2.<init>(r0)
            r1.f8069h = r2
            return
        L36:
            r1.<init>()
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            r1.f8069h = r2
            d.b r2 = new d.b
            r0 = 1
            r2.<init>(r0)
            java.util.concurrent.Executors.newSingleThreadExecutor(r2)
            return
        L4a:
            r1.<init>()
            t1.b r2 = new t1.b
            r2.<init>()
            r1.f8069h = r2
            return
        L55:
            r1.<init>()
            f.p r2 = new f.p
            r2.<init>()
            r1.f8069h = r2
            return
    }

    public /* synthetic */ a(int r1, boolean r2) {
            r0 = this;
            r0.f8068g = r1
            r0.<init>()
            return
    }

    public a(fg.p r2) {
            r1 = this;
            r0 = 19
            r1.f8068g = r0
            r1.<init>()
            yf.i r2 = (yf.i) r2
            r1.f8069h = r2
            return
    }

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f8068g = r2
            r0.f8069h = r1
            r0.<init>()
            return
    }

    public a(long[] r6) {
            r5 = this;
            r0 = 24
            r5.f8068g = r0
            r5.<init>()
            if (r6 == 0) goto L50
            int r0 = r6.length
            long[] r6 = java.util.Arrays.copyOf(r6, r0)
            f.y r0 = new f.y
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r0.f2924b
            if (r1 < 0) goto L49
            int r2 = r6.length
            if (r2 != 0) goto L1c
            goto L55
        L1c:
            int r2 = r6.length
            int r2 = r2 + r1
            long[] r3 = r0.f2923a
            int r4 = r3.length
            if (r4 >= r2) goto L32
            int r4 = r3.length
            int r4 = r4 * 3
            int r4 = r4 / 2
            int r2 = java.lang.Math.max(r2, r4)
            long[] r2 = java.util.Arrays.copyOf(r3, r2)
            r0.f2923a = r2
        L32:
            long[] r2 = r0.f2923a
            int r3 = r0.f2924b
            if (r1 == r3) goto L3d
            int r4 = r6.length
            int r4 = r4 + r1
            tf.l.q0(r2, r2, r4, r1, r3)
        L3d:
            r3 = 0
            int r4 = r6.length
            tf.l.q0(r6, r2, r1, r3, r4)
            int r1 = r0.f2924b
            int r6 = r6.length
            int r1 = r1 + r6
            r0.f2924b = r1
            goto L55
        L49:
            java.lang.String r6 = ""
            okio.a.i(r6)
            r6 = 0
            throw r6
        L50:
            f.y r0 = new f.y
            r0.<init>()
        L55:
            r5.f8069h = r0
            return
    }

    public static s.l0 v(m.a r8, int r9) {
            java.lang.Object r8 = r8.f8069h
            r.z r8 = (r.z) r8
            w0.f r0 = w0.q.e()
            if (r0 == 0) goto Lf
            fg.l r1 = r0.e()
            goto L10
        Lf:
            r1 = 0
        L10:
            w0.f r2 = w0.q.h(r0)
            i0.j1 r3 = r8.f11285f     // Catch: java.lang.Throwable -> L85
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L85
            r.p r3 = (r.p) r3     // Catch: java.lang.Throwable -> L85
            w0.q.k(r0, r2, r1)
            s.m0 r0 = r8.f11296q
            long r1 = r3.f11228j
            boolean r8 = r8.f11283d
            o9.e r4 = new o9.e
            r4.<init>(r9, r3)
            j8.f r3 = r0.f12043c
            if (r3 == 0) goto L82
            b5.c r0 = r0.f12042b
            s.z0 r5 = new s.z0
            java.lang.Object r6 = r3.f6783d
            s.a1 r6 = (s.a1) r6
            boolean r7 = r6 instanceof s.b
            r5.<init>(r3, r9, r0, r4)
            u2.a r0 = new u2.a
            r0.<init>(r1)
            r5.f12160d = r0
            if (r7 == 0) goto L78
            r0 = 1
            if (r8 == 0) goto L5f
            s.b r6 = (s.b) r6
            java.util.PriorityQueue r8 = r6.f11974h
            s.d1 r1 = new s.d1
            r1.<init>(r0, r5)
            r8.add(r1)
            boolean r8 = r6.f11975i
            if (r8 != 0) goto L7b
            r6.f11975i = r0
            android.view.View r8 = r6.f11973g
            r8.post(r6)
            goto L7b
        L5f:
            s.b r6 = (s.b) r6
            java.util.PriorityQueue r8 = r6.f11974h
            s.d1 r1 = new s.d1
            r2 = 0
            r1.<init>(r2, r5)
            r8.add(r1)
            boolean r8 = r6.f11975i
            if (r8 != 0) goto L7b
            r6.f11975i = r0
            android.view.View r8 = r6.f11973g
            r8.post(r6)
            goto L7b
        L78:
            r6.a(r5)
        L7b:
            java.lang.String r8 = "compose:lazy:schedule_prefetch:index"
            long r0 = (long) r9
            f8.i.K0(r0, r8)
            return r5
        L82:
            s.h r8 = s.h.f12017a
            return r8
        L85:
            r8 = move-exception
            w0.q.k(r0, r2, r1)
            throw r8
    }

    @Override // r1.a
    public long M0(long r6, long r8, int r10) {
            r5 = this;
            java.lang.Object r10 = r5.f8069h
            sh.x r10 = (sh.x) r10
            sh.e2 r0 = r10.f12893a
            fg.a r10 = r10.f12896d
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L15
            goto L74
        L15:
            i0.f1 r10 = r0.f12573b
            float r10 = r10.g()
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r1
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r7 = r7 + r10
            i0.f1 r10 = r0.f12573b
            r10.h(r7)
            long r7 = r8 & r1
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            r10 = 32
            if (r8 < 0) goto L77
            float r8 = java.lang.Float.intBitsToFloat(r6)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L43
            goto L77
        L43:
            float r6 = java.lang.Float.intBitsToFloat(r7)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L74
            i0.f1 r6 = r0.f12574c
            float r6 = r6.g()
            i0.f1 r8 = r0.f12574c
            float r8 = r8.g()
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 + r8
            r0.b(r7)
            i0.f1 r7 = r0.f12574c
            float r7 = r7.g()
            float r7 = r7 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            long r8 = r8 << r10
            long r6 = r6 & r1
            long r6 = r6 | r8
            return r6
        L74:
            r6 = 0
            return r6
        L77:
            i0.f1 r7 = r0.f12574c
            float r7 = r7.g()
            i0.f1 r8 = r0.f12574c
            float r8 = r8.g()
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r8
            r0.b(r6)
            i0.f1 r6 = r0.f12574c
            float r6 = r6.g()
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r9)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r3 = (long) r6
            long r6 = r7 << r10
            long r8 = r3 & r1
            long r6 = r6 | r8
            return r6
    }

    @Override // t3.e
    public void a() {
            r2 = this;
            java.lang.String r0 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r1 = "ProfileInstaller"
            android.util.Log.d(r1, r0)
            return
    }

    @Override // tg.d
    public java.lang.Object b(tg.e r6, wf.c r7) {
            r5 = this;
            boolean r0 = r7 instanceof tg.a
            if (r0 == 0) goto L13
            r0 = r7
            tg.a r0 = (tg.a) r0
            int r1 = r0.f13178j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13178j = r1
            goto L18
        L13:
            tg.a r0 = new tg.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13176h
            int r1 = r0.f13178j
            sf.n r2 = sf.n.f12433a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            ug.k r6 = r0.f13175g
            f8.i.I0(r7)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            return r6
        L32:
            f8.i.I0(r7)
            ug.k r7 = new ug.k
            wf.g r1 = r0.getContext()
            r7.<init>(r6, r1)
            r0.f13175g = r7     // Catch: java.lang.Throwable -> L5c
            r0.f13178j = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r5.f8069h     // Catch: java.lang.Throwable -> L5c
            yf.i r6 = (yf.i) r6     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5c
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto L4f
            goto L50
        L4f:
            r6 = r2
        L50:
            if (r6 != r0) goto L53
            return r0
        L53:
            r6 = r7
        L54:
            r6.releaseIntercepted()
            return r2
        L58:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L5e
        L5c:
            r6 = move-exception
            goto L58
        L5e:
            r6.releaseIntercepted()
            throw r7
    }

    @Override // t3.e
    public void c(int r4, java.lang.Object r5) {
            r3 = this;
            switch(r4) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L33
            r1 = 7
            if (r4 == r1) goto L33
            r1 = 8
            if (r4 == r1) goto L33
            android.util.Log.d(r2, r0)
            goto L38
        L33:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L38:
            java.lang.Object r5 = r3.f8069h
            androidx.profileinstaller.ProfileInstallReceiver r5 = (androidx.profileinstaller.ProfileInstallReceiver) r5
            r5.setResultCode(r4)
            return
    }

    @Override // s5.a
    public java.lang.String e() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void f(x1.f0 r2) {
            r1 = this;
            boolean r0 = r2.G()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "DepthSortedSet.add called on an unattached node"
            u1.a.b(r0)
        Lb:
            java.lang.Object r0 = r1.f8069h
            x1.a2 r0 = (x1.a2) r0
            r0.add(r2)
            return
    }

    @Override // r1.a
    public long f0(int r5, long r6) {
            r4 = this;
            java.lang.Object r5 = r4.f8069h
            sh.x r5 = (sh.x) r5
            sh.e2 r0 = r5.f12893a
            fg.a r5 = r5.f12896d
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4a
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r6
            int r5 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r5)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L25
            goto L4a
        L25:
            i0.f1 r1 = r0.f12574c
            float r1 = r1.g()
            i0.f1 r3 = r0.f12574c
            float r3 = r3.g()
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r3
            r0.b(r5)
            i0.f1 r5 = r0.f12574c
            float r5 = r5.g()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L44
            goto L4a
        L44:
            r5 = 2
            long r5 = e1.b.a(r6, r2, r5)
            return r5
        L4a:
            r5 = 0
            return r5
    }

    public void g(int r3, java.lang.String r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r2.f8069h
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r1 = 45
            r0.append(r1)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "dp"
            r0.append(r3)
            return
    }

    @Override // r7.g
    public int get() {
            r2 = this;
            int r0 = r2.f8068g
            switch(r0) {
                case 3: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f8069h
            p7.l r0 = (p7.l) r0
            r7.f r1 = r0.f10270o
            int r1 = r1.f11560n
            r7.a r0 = r0.f10269n
            int r0 = r0.f11551o
            int r1 = r1 - r0
            int r1 = r1 / 4
            return r1
        L15:
            java.lang.Object r0 = r2.f8069h
            m7.t r0 = (m7.t) r0
            p7.a r1 = r0.f7869m
            p7.m r1 = (p7.m) r1
            r7.a r1 = r1.f10269n
            int r1 = r1.f11551o
            r7.a r0 = r0.f8763q
            int r0 = r0.f11551o
            int r1 = r1 + r0
            return r1
    }

    @Override // s5.a
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "this"
            return r0
    }

    @Override // s5.a
    public java.lang.String getType() {
            r1 = this;
            java.lang.Object r0 = r1.f8069h
            o5.h r0 = (o5.h) r0
            ac.k r0 = r0.f9524i
            java.lang.Object r0 = r0.f179j
            k5.z r0 = (k5.z) r0
            k5.o r0 = r0.f7303k
            java.lang.String r0 = r0.getType()
            return r0
    }

    public void h(v7.k r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r2.f8069h
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r1 = 45
            r0.append(r1)
            java.lang.String r3 = r3.f14163g
            r0.append(r3)
            return
    }

    public void i(int r3, java.lang.String r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r2.f8069h
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r1 = 45
            r0.append(r1)
            r0.append(r4)
            r0.append(r3)
            return
    }

    public long j(long r4) {
            r3 = this;
            java.lang.Object r0 = r3.f8069h
            t1.b r0 = (t1.b) r0
            r0.getClass()
            float r1 = u2.q.b(r4)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19
            float r1 = u2.q.c(r4)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19
            goto L2e
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "maximumVelocity should be a positive value. You specified="
            r1.<init>(r2)
            java.lang.String r2 = u2.q.g(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            u1.a.b(r1)
        L2e:
            t1.d r1 = r0.f12980a
            float r2 = u2.q.b(r4)
            float r1 = r1.b(r2)
            t1.d r0 = r0.f12981b
            float r4 = u2.q.c(r4)
            float r4 = r0.b(r4)
            long r4 = a.a.d(r1, r4)
            return r4
    }

    @Override // r7.g
    public void k(int r3) {
            r2 = this;
            int r0 = r2.f8068g
            switch(r0) {
                case 3: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f8069h
            p7.l r0 = (p7.l) r0
            int r3 = r3 * 4
            r7.a r1 = r0.f10269n
            int r1 = r1.f11551o
            int r3 = r3 + r1
            r7.f r0 = r0.f10270o
            r0.k(r3)
            return
        L16:
            java.lang.Object r0 = r2.f8069h
            m7.t r0 = (m7.t) r0
            r7.a r1 = r0.f8763q
            p7.a r0 = r0.f7869m
            p7.m r0 = (p7.m) r0
            int r0 = r0.p()
            int r3 = r3 - r0
            r1.k(r3)
            return
    }

    public android.os.Bundle l(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f8069h
            pa.c r0 = (pa.c) r0
            boolean r1 = r0.f10453b
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.f10458g
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            boolean r3 = r1.containsKey(r5)
            if (r3 == 0) goto L1b
            android.os.Bundle r3 = a7.a.x(r5, r1)
            goto L1c
        L1b:
            r3 = r2
        L1c:
            r1.remove(r5)
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L27
            r0.f10458g = r2
        L27:
            return r3
        L28:
            java.lang.String r5 = "You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state"
            j8.o.A(r5)
            r5 = 0
            return r5
    }

    @Override // okhttp3.CookieJar
    public java.util.List loadForRequest(okhttp3.HttpUrl r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r0 = r6.f8069h
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.String r7 = r7.host()
            java.lang.Object r7 = r0.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L15
            tf.t r7 = tf.t.f13167g
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r7.next()
            r2 = r1
            okhttp3.Cookie r2 = (okhttp3.Cookie) r2
            long r2 = r2.expiresAt()
            long r4 = java.lang.System.currentTimeMillis()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = 0
        L3a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1e
            r0.add(r1)
            goto L1e
        L48:
            return r0
    }

    public nf.b m(java.io.File r5, qf.b r6) {
            r4 = this;
            java.lang.Object r0 = r4.f8069h
            b.e r0 = (b.e) r0
            java.lang.Object r1 = r0.f333i
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = ".apk"
            boolean r2 = r2.endsWith(r3)
            if (r2 != 0) goto L56
            nf.d r2 = nf.d.f9421j
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L1d
            goto L56
        L1d:
            r6.c()     // Catch: java.lang.Exception -> L47
            int r2 = r6.h()     // Catch: java.lang.Exception -> L47
            java.nio.ByteBuffer r3 = r6.f11028o     // Catch: java.lang.Exception -> L47
            int r2 = r2 + 4
            java.nio.Buffer r2 = r3.position(r2)     // Catch: java.lang.Exception -> L47
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Exception -> L47
            short r2 = r3.getShort()     // Catch: java.lang.Exception -> L47
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            if (r2 != r3) goto L39
            goto L51
        L39:
            nf.d r2 = nf.d.f9420i
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L56
            of.b r6 = new of.b
            r6.<init>(r5, r0)
            return r6
        L47:
            r1 = move-exception
            mh.b r2 = qf.b.f11019r
            java.lang.String r3 = "Jadx parser can't open zip file: {}"
            java.io.File r6 = r6.f11020g
            r2.s(r6, r3, r1)
        L51:
            of.b r6 = new of.b
            r6.<init>(r5, r0)
        L56:
            return r6
    }

    @Override // r1.a
    public java.lang.Object m0(long r14, long r16, yf.c r18) {
            r13 = this;
            r0 = r18
            java.lang.Object r1 = r13.f8069h
            sh.x r1 = (sh.x) r1
            sh.e2 r2 = r1.f12893a
            boolean r3 = r0 instanceof sh.w
            if (r3 == 0) goto L1c
            r3 = r0
            sh.w r3 = (sh.w) r3
            int r4 = r3.f12878l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f12878l = r4
        L1a:
            r9 = r3
            goto L22
        L1c:
            sh.w r3 = new sh.w
            r3.<init>(r13, r0)
            goto L1a
        L22:
            java.lang.Object r0 = r9.f12876j
            int r3 = r9.f12878l
            r10 = 2
            r4 = 1
            xf.a r11 = xf.a.f21579g
            if (r3 == 0) goto L45
            if (r3 == r4) goto L3d
            if (r3 != r10) goto L36
            long r1 = r9.f12875i
            f8.i.I0(r0)
            goto L86
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L3d:
            long r3 = r9.f12874h
            long r5 = r9.f12873g
            f8.i.I0(r0)
            goto L6a
        L45:
            f8.i.I0(r0)
            float r0 = u2.q.c(r16)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            i0.f1 r0 = r2.f12573b
            r0.h(r3)
        L56:
            r9.f12873g = r14
            r7 = r16
            r9.f12874h = r7
            r9.f12878l = r4
            r4 = r13
            r5 = r14
            java.lang.Object r0 = super.m0(r5, r7, r9)
            if (r0 != r11) goto L67
            goto L84
        L67:
            r5 = r14
            r3 = r16
        L6a:
            u2.q r0 = (u2.q) r0
            long r7 = r0.f13362a
            float r0 = u2.q.c(r3)
            i.u r12 = r1.f12895c
            i.r0 r1 = r1.f12894b
            r9.f12873g = r5
            r9.f12874h = r3
            r9.f12875i = r7
            r9.f12878l = r10
            java.lang.Object r0 = sh.s.r(r2, r0, r12, r1, r9)
            if (r0 != r11) goto L85
        L84:
            return r11
        L85:
            r1 = r7
        L86:
            u2.q r0 = (u2.q) r0
            long r3 = r0.f13362a
            long r0 = u2.q.e(r1, r3)
            u2.q r2 = new u2.q
            r2.<init>(r0)
            return r2
    }

    @Override // k7.d
    public k7.a n() {
            r6 = this;
            m7.c r0 = new m7.c
            r1 = 20
            r2 = 12
            r0.<init>(r1, r2)
            byte[] r1 = r0.f11553k
            r3 = 0
            r4 = -1
            k7.a.D(r1, r3, r4)
            r5 = 4
            k7.a.D(r1, r5, r4)
            r5 = 8
            k7.a.D(r1, r5, r4)
            java.lang.Object r1 = r6.f8069h
            b.e r1 = (b.e) r1
            int r1 = r1.get()
            r0.M(r1, r3)
            int r1 = r0.p()
            int r1 = r1 - r2
            byte[] r3 = r0.f11553k
            short r1 = (short) r1
            k7.a.F(r3, r2, r1)
            return r0
    }

    public i0.l2 o() {
            r7 = this;
            l3.i r0 = l3.i.a()
            int r1 = r0.c()
            r2 = 1
            if (r1 != r2) goto L11
            q2.k r0 = new q2.k
            r0.<init>(r2)
            return r0
        L11:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r1 = i0.r.u(r1)
            q2.g r3 = new q2.g
            r3.<init>(r1, r7)
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r0.f7793a
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.lock()
            int r4 = r0.f7795c     // Catch: java.lang.Throwable -> L35
            if (r4 == r2) goto L37
            int r2 = r0.f7795c     // Catch: java.lang.Throwable -> L35
            r4 = 2
            if (r2 != r4) goto L2f
            goto L37
        L2f:
            f.f r2 = r0.f7794b     // Catch: java.lang.Throwable -> L35
            r2.add(r3)     // Catch: java.lang.Throwable -> L35
            goto L4c
        L35:
            r1 = move-exception
            goto L56
        L37:
            android.os.Handler r2 = r0.f7796d     // Catch: java.lang.Throwable -> L35
            l3.g r4 = new l3.g     // Catch: java.lang.Throwable -> L35
            int r5 = r0.f7795c     // Catch: java.lang.Throwable -> L35
            q2.g[] r3 = new q2.g[]{r3}     // Catch: java.lang.Throwable -> L35
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L35
            r6 = 0
            r4.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L35
            r2.post(r4)     // Catch: java.lang.Throwable -> L35
        L4c:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return r1
        L56:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r1
    }

    public m.a p() {
            r7 = this;
            v7.b r0 = v7.b.f14145h
            java.lang.Object r1 = r7.f8069h
            m.a[] r1 = (m.a[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L9:
            if (r4 >= r2) goto L1b
            r5 = r1[r4]
            java.lang.Object r6 = r5.f8069h
            v7.e0 r6 = (v7.e0) r6
            v7.b r6 = r6.a0()
            if (r6 != r0) goto L18
            goto L1c
        L18:
            int r4 = r4 + 1
            goto L9
        L1b:
            r5 = 0
        L1c:
            if (r5 != 0) goto L21
            r0 = r1[r3]
            return r0
        L21:
            return r5
    }

    public int q(v4.a r5) {
            r4 = this;
            java.lang.Object r0 = r4.f8069h
            r4.p r0 = (r4.p) r0
            r4.w r1 = r0.f11484i
            boolean r2 = r5 instanceof v4.c0
            java.lang.String r3 = "not found"
            if (r2 == 0) goto L26
            r4.h0 r0 = r0.f11481f
            r0.f()
            java.lang.Object r0 = r0.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            v4.c0 r5 = (v4.c0) r5
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto L21
            goto Le7
        L21:
            j8.o.t(r3)
        L24:
            r5 = 0
            return r5
        L26:
            boolean r2 = r5 instanceof v4.d0
            if (r2 == 0) goto L49
            r4.h0 r0 = r0.f11482g
            r0.f()
            r1 = r5
            v4.d0 r1 = (v4.d0) r1
            w4.c r1 = r1.f14088g
            java.lang.Object r0 = r0.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r0 = r0.get(r1)
            r4.z r0 = (r4.z) r0
            if (r0 == 0) goto L43
            r5 = r0
            goto Le7
        L43:
            java.lang.String r0 = "not found: "
            g1.d.f(r5, r0)
            goto L24
        L49:
            boolean r2 = r5 instanceof v4.e
            if (r2 == 0) goto L64
            r4.j0 r0 = r0.f11485j
            r0.f()
            java.util.TreeMap r0 = r0.f11423f
            v4.e r5 = (v4.e) r5
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto L60
            goto Le7
        L60:
            j8.o.t(r3)
            goto L24
        L64:
            boolean r2 = r5 instanceof v4.m
            if (r2 == 0) goto L7d
            r1.f()
            java.util.TreeMap r0 = r1.f11514f
            v4.m r5 = (v4.m) r5
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto L79
            goto Le7
        L79:
            j8.o.t(r3)
            goto L24
        L7d:
            boolean r2 = r5 instanceof v4.l
            if (r2 == 0) goto L8c
            v4.l r5 = (v4.l) r5
            v4.m r5 = r5.k()
            r4.v r5 = r1.m(r5)
            goto Le7
        L8c:
            boolean r1 = r5 instanceof v4.a0
            if (r1 == 0) goto Lae
            r4.h0 r0 = r0.f11483h
            r0.getClass()
            r0.f()
            v4.a0 r5 = (v4.a0) r5
            java.lang.Object r0 = r0.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            w4.a r5 = r5.f14064g
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto La9
            goto Le7
        La9:
            j8.o.t(r3)
            goto L24
        Lae:
            boolean r1 = r5 instanceof v4.x
            if (r1 == 0) goto Lcb
            r4.h0 r0 = r0.f11489n
            r0.f()
            java.lang.Object r0 = r0.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            v4.x r5 = (v4.x) r5
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto Lc6
            goto Le7
        Lc6:
            j8.o.t(r3)
            goto L24
        Lcb:
            boolean r1 = r5 instanceof v4.i
            if (r1 == 0) goto Le6
            r4.g r0 = r0.f11488m
            r0.f()
            java.util.TreeMap r0 = r0.f11403g
            v4.i r5 = (v4.i) r5
            java.lang.Object r5 = r0.get(r5)
            r4.z r5 = (r4.z) r5
            if (r5 == 0) goto Le1
            goto Le7
        Le1:
            j8.o.t(r3)
            goto L24
        Le6:
            r5 = 0
        Le7:
            if (r5 != 0) goto Leb
            r5 = -1
            return r5
        Leb:
            int r5 = r5.e()
            return r5
    }

    public nf.c r(java.io.File r5) {
            r4 = this;
            java.lang.Object r0 = r4.f8069h
            b.e r0 = (b.e) r0
            qf.b r1 = new qf.b     // Catch: java.lang.Exception -> L13
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> L13
            nf.b r2 = r4.m(r5, r1)     // Catch: java.lang.Exception -> L13
            if (r2 == r1) goto L15
            r1.close()     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L1a
        L15:
            nf.c r5 = r2.d()     // Catch: java.lang.Exception -> L13
            return r5
        L1a:
            java.lang.Object r2 = r0.f333i
            java.util.Set r2 = (java.util.Set) r2
            nf.d r3 = nf.d.f9421j
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L30
            of.b r1 = new of.b
            r1.<init>(r5, r0)
            nf.c r5 = r1.d()
            return r5
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Failed to open zip: "
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5, r1)
            throw r0
    }

    public void s() {
            r2 = this;
            java.lang.Object r0 = r2.f8069h
            r6.c r0 = (r6.c) r0
            r6.b r1 = r6.b.f11539i
            r0.f11542b = r1
            return
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(okhttp3.HttpUrl r4, java.util.List r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r0 = r3.f8069h
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.String r4 = r4.host()
            og.u r1 = new og.u
            r2 = 1
            r1.<init>(r2, r5)
            eb.v r5 = new eb.v
            r2 = 3
            r5.<init>(r2, r1)
            r0.compute(r4, r5)
            return
    }

    public h0.q0 t(p4.t r42, y1.t r43) {
            r41 = this;
            r0 = r42
            r1 = r41
            java.lang.Object r2 = r1.f8069h
            f.p r2 = (f.p) r2
            f.p r3 = new f.p
            java.lang.Object r4 = r0.f10224h
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r3.<init>(r5)
            int r5 = r4.size()
            r7 = 0
        L1a:
            if (r7 >= r5) goto Lbe
            java.lang.Object r8 = r4.get(r7)
            s1.v r8 = (s1.v) r8
            long r9 = r8.f12311a
            long[] r11 = r2.f2879h
            int r12 = r2.f2881j
            int r11 = g.a.b(r11, r12, r9)
            if (r11 < 0) goto L36
            java.lang.Object[] r12 = r2.f2880i
            r11 = r12[r11]
            java.lang.Object r12 = f.q.f2884a
            if (r11 != r12) goto L37
        L36:
            r11 = 0
        L37:
            s1.u r11 = (s1.u) r11
            if (r11 != 0) goto L4a
            long r11 = r8.f12312b
            long r13 = r8.f12314d
            r16 = r7
            r26 = r11
            r28 = r13
            r30 = 0
            r11 = r43
            goto L5e
        L4a:
            long r12 = r11.f12308a
            boolean r14 = r11.f12310c
            r16 = r7
            long r6 = r11.f12309b
            r11 = r43
            long r6 = r11.J(r6)
            r28 = r6
            r26 = r12
            r30 = r14
        L5e:
            long r6 = r8.f12311a
            s1.t r17 = new s1.t
            long r12 = r8.f12312b
            r14 = r4
            r40 = r5
            long r4 = r8.f12314d
            boolean r15 = r8.f12315e
            float r1 = r8.f12316f
            r25 = r1
            int r1 = r8.f12317g
            r31 = r1
            java.util.ArrayList r1 = r8.f12319i
            r22 = r4
            long r4 = r8.f12320j
            r32 = r1
            float r1 = r8.f12321k
            r33 = r4
            long r4 = r8.f12322l
            r36 = r4
            long r4 = r8.f12323m
            r35 = r1
            r38 = r4
            r18 = r6
            r20 = r12
            r24 = r15
            r17.<init>(r18, r20, r22, r24, r25, r26, r28, r30, r31, r32, r33, r35, r36, r38)
            r1 = r17
            r4 = r18
            r3.b(r1, r4)
            boolean r1 = r8.f12315e
            if (r1 == 0) goto Lb2
            s1.u r17 = new s1.u
            long r4 = r8.f12312b
            long r6 = r8.f12313c
            r22 = r1
            r18 = r4
            r20 = r6
            r17.<init>(r18, r20, r22)
            r1 = r17
            r2.b(r1, r9)
            goto Lb5
        Lb2:
            r2.c(r9)
        Lb5:
            int r7 = r16 + 1
            r1 = r41
            r4 = r14
            r5 = r40
            goto L1a
        Lbe:
            h0.q0 r1 = new h0.q0
            r1.<init>(r3, r0)
            return r1
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f8068g
            r1 = 0
            switch(r0) {
                case 3: goto Ldc;
                case 11: goto Ld3;
                case 25: goto L69;
                case 26: goto L14;
                case 28: goto Lb;
                default: goto L6;
            }
        L6:
            java.lang.String r0 = super.toString()
            return r0
        Lb:
            java.lang.Object r0 = r6.f8069h
            x1.a2 r0 = (x1.a2) r0
            java.lang.String r0 = r0.toString()
            return r0
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r2 = r6.f8069h
            v7.e0 r2 = (v7.e0) r2
            v7.b r3 = r2.a0()
            if (r3 == 0) goto L24
            goto L41
        L24:
            int r3 = r2.Z()
            l7.f r4 = r2.i()
            if (r4 != 0) goto L2f
            goto L35
        L2f:
            l7.l r5 = r4.Y()
            if (r5 != 0) goto L37
        L35:
            r3 = r1
            goto L3b
        L37:
            t7.b r3 = r5.X(r4, r3)
        L3b:
            if (r3 == 0) goto L41
            java.lang.String r1 = r3.b()
        L41:
            if (r1 != 0) goto L4f
            int r1 = r2.Z()
            java.util.HashMap r3 = n7.g.f9048a
            java.lang.String r3 = "r0x"
            java.lang.String r1 = y7.a.p(r1, r3)
        L4f:
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            int r1 = r2.O()
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L69:
            java.lang.Object r0 = r6.f8069h
            m.a[] r0 = (m.a[]) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            m.a r3 = r6.p()
            java.lang.Object r3 = r3.f8069h
            v7.e0 r3 = (v7.e0) r3
            java.lang.Class<v7.d> r4 = v7.d.class
            k7.a r3 = r3.u(r4)
            v7.d r3 = (v7.d) r3
            if (r3 == 0) goto La9
            v7.g0 r4 = r3.f14150k
            if (r4 == 0) goto L8f
            v7.i0 r4 = r4.f14153k
            int r4 = r4.N()
            goto L90
        L8f:
            r4 = -1
        L90:
            if (r4 >= 0) goto L93
            goto La6
        L93:
            java.lang.Class<l7.f> r5 = l7.f.class
            k7.a r3 = r3.u(r5)
            l7.f r3 = (l7.f) r3
            if (r3 != 0) goto L9e
            goto La6
        L9e:
            u7.b r1 = r3.f7877p
            r7.s r1 = r1.V(r4)
            r7.q r1 = (r7.q) r1
        La6:
            r2.append(r1)
        La9:
            int r1 = r0.length
            java.lang.String r3 = ", childes="
            r2.append(r3)
            r2.append(r1)
            r3 = 0
        Lb3:
            if (r3 >= r1) goto Lce
            r4 = r0[r3]
            java.lang.String r5 = "\n    ["
            r2.append(r5)
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r5 = "]  "
            r2.append(r5)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            goto Lb3
        Lce:
            java.lang.String r0 = r2.toString()
            return r0
        Ld3:
            int r0 = r6.get()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        Ldc:
            int r0 = r6.get()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    public boolean u(x1.f0 r2) {
            r1 = this;
            boolean r0 = r2.G()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "DepthSortedSet.remove called on an unattached node"
            u1.a.b(r0)
        Lb:
            java.lang.Object r0 = r1.f8069h
            x1.a2 r0 = (x1.a2) r0
            boolean r2 = r0.remove(r2)
            return r2
    }
}
