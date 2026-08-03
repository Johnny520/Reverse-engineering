package f8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m1.f f3350a;

    public static final float A0(long r4, float r6, u2.c r7) {
            long r0 = u2.o.b(r4)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = u2.p.a(r0, r2)
            if (r2 == 0) goto L31
            float r0 = r7.q0()
            double r0 = (double) r0
            r2 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            long r0 = r7.e0(r6)
            float r4 = u2.o.c(r4)
            float r5 = u2.o.c(r0)
            float r4 = r4 / r5
        L2a:
            float r4 = r4 * r6
            return r4
        L2c:
            float r4 = r7.O0(r4)
            return r4
        L31:
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r7 = u2.p.a(r0, r2)
            if (r7 == 0) goto L41
            float r4 = u2.o.c(r4)
            goto L2a
        L41:
            r4 = 2143289344(0x7fc00000, float:NaN)
            return r4
    }

    public static final long B(long r5) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 / r2
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r0 = r1 << r0
            long r5 = r5 & r3
            long r5 = r5 | r0
            return r5
    }

    public static void B0(android.content.SharedPreferences r2, java.lang.String r3, java.lang.String r4, java.util.List r5) {
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lc
            e8.b r0 = e8.b.f2358a
            r0.j(r2, r3, r4, r5)
            return
        Lc:
            java.lang.String r5 = "cache.key"
            android.content.SharedPreferences$Editor r0 = r2.edit()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r5, r1)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L25
            android.content.SharedPreferences$Editor r2 = r0.clear()     // Catch: java.lang.Throwable -> L2c
            r2.putString(r5, r3)     // Catch: java.lang.Throwable -> L2c
        L25:
            android.content.SharedPreferences$Editor r2 = r0.remove(r4)     // Catch: java.lang.Throwable -> L2c
            r2.apply()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    public static int C(ud.j r2) {
            boolean r0 = r2 instanceof ud.h
            r1 = 0
            if (r0 == 0) goto L20
            ud.h r2 = (ud.h) r2
            java.util.List r2 = r2.g()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            ud.p r0 = (ud.p) r0
            int r0 = r0.f9389i
            if (r0 == 0) goto Lf
            return r0
        L20:
            boolean r0 = r2 instanceof yd.a
            if (r0 == 0) goto L2b
            yd.a r2 = (yd.a) r2
            int r2 = r2.H()
            return r2
        L2b:
            boolean r0 = r2 instanceof ud.i
            if (r0 == 0) goto L54
            ud.i r2 = (ud.i) r2
            java.util.List r2 = r2.i()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3c
            goto L53
        L3c:
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r2.next()
            ud.j r0 = (ud.j) r0
            int r0 = C(r0)
            if (r0 == 0) goto L40
            return r0
        L53:
            return r1
        L54:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L7c
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L65
            goto L7c
        L65:
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            ud.j r0 = (ud.j) r0
            int r0 = C(r0)
            if (r0 == 0) goto L69
            return r0
        L7c:
            return r1
    }

    public static final void C0(android.text.Spannable r2, long r3, int r5, int r6) {
            r0 = 16
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r3 = f1.c0.w(r3)
            r0.<init>(r3)
            r3 = 33
            r2.setSpan(r0, r5, r6, r3)
        L14:
            return
    }

    public static ud.h D(ud.j r2) {
            boolean r0 = r2 instanceof ud.h
            if (r0 == 0) goto L7
            ud.h r2 = (ud.h) r2
            return r2
        L7:
            boolean r0 = r2 instanceof ud.i
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L2f
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            ud.j r2 = (ud.j) r2
            ud.h r2 = D(r2)
            return r2
        L2f:
            java.lang.String r2 = M0(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static final void D0(android.text.Spannable r6, long r7, u2.c r9, int r10, int r11) {
            long r0 = u2.o.b(r7)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = u2.p.a(r0, r2)
            r3 = 33
            if (r2 == 0) goto L23
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r7 = r9.O0(r7)
            int r7 = ig.a.X(r7)
            r8 = 0
            r0.<init>(r7, r8)
            r6.setSpan(r0, r10, r11, r3)
            return
        L23:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = u2.p.a(r0, r4)
            if (r9 == 0) goto L3a
            android.text.style.RelativeSizeSpan r9 = new android.text.style.RelativeSizeSpan
            float r7 = u2.o.c(r7)
            r9.<init>(r7)
            r6.setSpan(r9, r10, r11, r3)
        L3a:
            return
    }

    public static ud.p E(ud.j r2) {
            boolean r0 = r2 instanceof ud.h
            r1 = 0
            if (r0 == 0) goto L1f
            ud.h r2 = (ud.h) r2
            java.util.List r2 = r2.g()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            goto L34
        L12:
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            ud.p r2 = (ud.p) r2
            return r2
        L1f:
            boolean r0 = r2 instanceof ud.i
            if (r0 == 0) goto L24
            return r1
        L24:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L46
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L35
        L34:
            return r1
        L35:
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            ud.j r2 = (ud.j) r2
            ud.p r2 = E(r2)
            return r2
        L46:
            java.lang.String r2 = M0(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static final void E0(android.text.Spannable r2, p2.b r3, int r4, int r5) {
            if (r3 == 0) goto L42
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.lang.Object r3 = r3.f10087g
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r3.next()
            p2.a r1 = (p2.a) r1
            java.util.Locale r1 = r1.f10085a
            r0.add(r1)
            goto L11
        L23:
            r3 = 0
            java.util.Locale[] r3 = new java.util.Locale[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r3)
            android.text.style.LocaleSpan r3 = new android.text.style.LocaleSpan
            r3.<init>(r0)
            r0 = 33
            r2.setSpan(r3, r4, r5, r0)
        L42:
            return
    }

    public static xe.b F(ud.j r4) {
            boolean r0 = r4 instanceof ud.h
            if (r0 == 0) goto L19
            ud.h r4 = (ud.h) r4
            java.util.List r0 = r4.g()
            java.lang.Object r0 = be.h.F(r0)
            ud.p r0 = (ud.p) r0
            if (r0 != 0) goto L13
            goto L62
        L13:
            xe.b r1 = new xe.b
            r1.<init>(r4, r0)
            return r1
        L19:
            boolean r0 = r4 instanceof ud.i
            if (r0 == 0) goto L52
            ud.i r4 = (ud.i) r4
            java.util.List r4 = r4.i()
            java.util.stream.Stream r0 = r4.stream()
            ud.b r1 = new ud.b
            r2 = 7
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            long r0 = r0.count()
            r2 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L62
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            ud.j r0 = (ud.j) r0
            if (r0 == 0) goto L3f
            xe.b r4 = F(r0)
            return r4
        L52:
            boolean r0 = r4 instanceof ud.n
            if (r0 == 0) goto L6f
            ud.n r4 = (ud.n) r4
            java.util.List r4 = r4.u()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L64
        L62:
            r4 = 0
            return r4
        L64:
            java.lang.Object r4 = be.h.F(r4)
            ud.j r4 = (ud.j) r4
            xe.b r4 = F(r4)
            return r4
        L6f:
            java.lang.String r4 = M0(r4)
            ah.a.k(r4)
            r4 = 0
            return r4
    }

    public static final void F0(m0.l0 r3, int r4, java.lang.Object r5) {
            java.lang.Object[] r0 = r3.f8476g
            int r1 = r3.f8477h
            m0.j0[] r2 = r3.f8472c
            int r3 = r3.f8473d
            int r3 = r3 + (-1)
            r3 = r2[r3]
            int r3 = r3.f8469b
            int r1 = r1 - r3
            int r1 = r1 + r4
            r0[r1] = r5
            return
    }

    public static int G(int r1, int r2) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 >= r0) goto Lf
            int r0 = ac.o.A
            if (r2 > r0) goto L9
            return r0
        L9:
            if (r1 >= r2) goto Le
            int r1 = r1 << 1
            goto L9
        Le:
            return r1
        Lf:
            java.lang.String r1 = "data size out of limit"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final void G0(m0.l0 r3, int r4, java.lang.Object r5, int r6, java.lang.Object r7) {
            int r0 = r3.f8477h
            m0.j0[] r1 = r3.f8472c
            int r2 = r3.f8473d
            int r2 = r2 + (-1)
            r1 = r1[r2]
            int r1 = r1.f8469b
            int r0 = r0 - r1
            java.lang.Object[] r3 = r3.f8476g
            int r4 = r4 + r0
            r3[r4] = r5
            int r0 = r0 + r6
            r3[r0] = r7
            return
    }

    public static java.util.LinkedHashSet H(ac.o r6, ac.h r7) {
            java.lang.String r0 = r6.f192b
            java.lang.String r1 = "FastKV"
            java.lang.String r2 = "No encoder for tag:"
            java.lang.Object r7 = r7.f172b
            java.lang.String r7 = (java.lang.String) r7
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r4.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = r6.f191a     // Catch: java.lang.Exception -> L44
            r4.append(r5)     // Catch: java.lang.Exception -> L44
            r4.append(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L44
            r3.<init>(r4, r7)     // Catch: java.lang.Exception -> L44
            byte[] r7 = ig.a.u(r3)     // Catch: java.lang.Exception -> L44
            if (r7 == 0) goto L53
            r3 = 0
            r3 = r7[r3]     // Catch: java.lang.Exception -> L44
            r3 = r3 & 255(0xff, float:3.57E-43)
            ac.k r4 = r6.f198h     // Catch: java.lang.Exception -> L44
            r5 = 1
            java.lang.String r4 = r4.h(r7, r5, r3)     // Catch: java.lang.Exception -> L44
            java.util.HashMap r6 = r6.f193c     // Catch: java.lang.Exception -> L44
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Exception -> L44
            ac.s r6 = (ac.s) r6     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L46
            int r3 = r3 + r5
            int r6 = r7.length     // Catch: java.lang.Exception -> L44
            int r6 = r6 - r3
            java.util.LinkedHashSet r6 = ac.s.a(r7, r3, r6)     // Catch: java.lang.Exception -> L44
            return r6
        L44:
            r6 = move-exception
            goto L5e
        L46:
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r2.concat(r4)     // Catch: java.lang.Exception -> L44
            r6.<init>(r7)     // Catch: java.lang.Exception -> L44
            android.util.Log.w(r1, r0, r6)     // Catch: java.lang.Exception -> L44
            goto L61
        L53:
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = "Read object data failed"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L44
            android.util.Log.w(r1, r0, r6)     // Catch: java.lang.Exception -> L44
            goto L61
        L5e:
            android.util.Log.e(r1, r0, r6)
        L61:
            r6 = 0
            return r6
    }

    public static long H0(int r2, long r3) {
            r2 = r2 & 7
            int r2 = r2 << 3
            long r0 = r3 << r2
            int r2 = 64 - r2
            long r2 = r3 >>> r2
            long r2 = r2 | r0
            return r2
    }

    public static final void I0(java.lang.Object r1) {
            boolean r0 = r1 instanceof sf.f
            if (r0 != 0) goto L5
            return
        L5:
            sf.f r1 = (sf.f) r1
            java.lang.Throwable r1 = r1.f12420g
            throw r1
    }

    public static java.lang.String J(ac.o r4, ac.i r5) {
            java.lang.String r0 = r4.f192b
            java.lang.Object r5 = r5.f172b
            java.lang.String r5 = (java.lang.String) r5
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r3.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r4.f191a     // Catch: java.lang.Exception -> L2b
            r3.append(r4)     // Catch: java.lang.Exception -> L2b
            r3.append(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L2b
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L2b
            byte[] r4 = ig.a.u(r2)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L2d
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L2b
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L2b
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L2b
            return r5
        L2b:
            r4 = move-exception
            goto L2e
        L2d:
            return r1
        L2e:
            java.lang.String r5 = "FastKV"
            android.util.Log.e(r5, r0, r4)
            return r1
    }

    public static void J0(ac.o r1) {
            r0 = 1
            r1.f213w = r0
            java.nio.channels.FileChannel r0 = r1.f208r
            ig.a.j(r0)
            java.nio.channels.FileChannel r0 = r1.f209s
            ig.a.j(r0)
            r0 = 0
            r1.f208r = r0
            r1.f209s = r0
            r1.f210t = r0
            r1.f211u = r0
            return
    }

    public static boolean K(ud.j r2) {
            boolean r0 = r2 instanceof ud.h
            if (r0 == 0) goto Ld
            ud.h r2 = (ud.h) r2
            pd.k r0 = pd.k.T
            boolean r2 = a.a.v(r2, r0)
            return r2
        Ld:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L32
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L30
            int r0 = r2.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r2 = r2.get(r0)
            ud.j r2 = (ud.j) r2
            boolean r2 = K(r2)
            if (r2 == 0) goto L30
            return r1
        L30:
            r2 = 0
            return r2
        L32:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unknown container type: "
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static final void K0(long r2, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            j2.b.h(r2, r4)
        L9:
            return
    }

    public static boolean L(ud.j r4, ud.j r5) {
            boolean r0 = r5 instanceof ud.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            r0 = r5
            ud.a r0 = (ud.a) r0
            java.util.List r0 = r0.f13676n
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L13
            r1 = r2
            goto L25
        L13:
            int r3 = r0.size()
            if (r3 != r2) goto L25
            java.lang.Object r0 = r0.get(r1)
            ud.a r0 = (ud.a) r0
            java.util.List r0 = r0.f13676n
            boolean r1 = r0.isEmpty()
        L25:
            if (r1 == 0) goto L28
            goto L70
        L28:
            ud.h r5 = (ud.h) r5
            boolean r4 = U(r5, r4)
            return r4
        L2f:
            boolean r0 = r5 instanceof ud.i
            if (r0 == 0) goto L44
            ud.i r5 = (ud.i) r5
            java.util.List r4 = r5.i()
            ud.b r5 = new ud.b
            r0 = 6
            r5.<init>(r0)
            boolean r4 = be.h.g(r4, r5)
            return r4
        L44:
            boolean r0 = r5 instanceof ud.h
            if (r0 == 0) goto L4f
            ud.h r5 = (ud.h) r5
            boolean r4 = U(r5, r4)
            return r4
        L4f:
            boolean r0 = r5 instanceof ud.n
            if (r0 == 0) goto L72
            ud.n r5 = (ud.n) r5
            java.util.List r5 = r5.u()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L71
            int r0 = r5.size()
            int r0 = r0 - r2
            java.lang.Object r5 = r5.get(r0)
            ud.j r5 = (ud.j) r5
            boolean r4 = L(r4, r5)
            if (r4 == 0) goto L71
        L70:
            return r2
        L71:
            return r1
        L72:
            java.lang.String r4 = M0(r5)
            ah.a.k(r4)
            r4 = 0
            return r4
    }

    public static void L0(ac.o r2, java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "FastKV"
            java.lang.String r1 = r2.f192b
            boolean r3 = h0(r2, r3)     // Catch: java.io.IOException -> Lb
            if (r3 == 0) goto Lf
            goto L18
        Lb:
            r3 = move-exception
            android.util.Log.w(r0, r1, r3)
        Lf:
            z0(r2)
            boolean r3 = h0(r2, r4)     // Catch: java.io.IOException -> L19
            if (r3 == 0) goto L1d
        L18:
            return
        L19:
            r3 = move-exception
            android.util.Log.w(r0, r1, r3)
        L1d:
            z0(r2)
            return
    }

    public static boolean M(ud.j r1) {
            boolean r0 = r1 instanceof ud.h
            if (r0 == 0) goto Lb
            ud.h r1 = (ud.h) r1
            boolean r1 = a.a.A(r1)
            return r1
        Lb:
            boolean r0 = r1 instanceof ud.i
            if (r0 == 0) goto L2e
            ud.i r1 = (ud.i) r1
            java.util.List r1 = r1.i()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            ud.j r0 = (ud.j) r0
            if (r0 == 0) goto L48
            boolean r0 = M(r0)
            if (r0 != 0) goto L19
            goto L48
        L2e:
            boolean r0 = r1 instanceof ud.n
            if (r0 == 0) goto L4a
            ud.n r1 = (ud.n) r1
            java.util.List r1 = r1.u()
            java.lang.Object r1 = xe.s.i(r1)
            ud.j r1 = (ud.j) r1
            if (r1 == 0) goto L48
            boolean r1 = M(r1)
            if (r1 == 0) goto L48
        L46:
            r1 = 1
            return r1
        L48:
            r1 = 0
            return r1
        L4a:
            java.lang.String r1 = M0(r1)
            ah.a.k(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String M0(ud.j r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Null container variable"
            return r1
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Unknown container type: "
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public static final boolean N(i2.g r6) {
            java.lang.String r0 = r6.f6314h
            int r0 = r0.length()
            java.util.List r6 = r6.f6313g
            r1 = 0
            if (r6 == 0) goto L2d
            int r2 = r6.size()
            r3 = r1
        L10:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            i2.e r4 = (i2.e) r4
            java.lang.Object r5 = r4.f6288a
            boolean r5 = r5 instanceof i2.m
            if (r5 == 0) goto L2a
            int r5 = r4.f6289b
            int r4 = r4.f6290c
            boolean r4 = i2.h.b(r1, r0, r5, r4)
            if (r4 == 0) goto L2a
            r6 = 1
            return r6
        L2a:
            int r3 = r3 + 1
            goto L10
        L2d:
            return r1
    }

    public static boolean N0(int r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean O(ud.a r2, ud.j r3) {
            if (r2 != r3) goto L3
            goto L34
        L3:
            boolean r0 = r3 instanceof ud.a
            if (r0 == 0) goto Le
            ud.a r3 = (ud.a) r3
            boolean r2 = a.a.s0(r2, r3)
            return r2
        Le:
            boolean r0 = r3 instanceof ud.h
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            boolean r0 = r3 instanceof ud.n
            if (r0 == 0) goto L37
            ud.n r3 = (ud.n) r3
            java.util.List r3 = r3.u()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r3.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = O(r2, r0)
            if (r0 == 0) goto L22
        L34:
            r2 = 1
            return r2
        L36:
            return r1
        L37:
            java.lang.String r2 = M0(r3)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static boolean O0(int r1) {
            r0 = r1 & 15
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean P0(int r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static final long Q0(long r7, long r9) {
            int r0 = i2.m0.f(r7)
            int r1 = i2.m0.e(r7)
            int r2 = i2.m0.f(r9)
            int r3 = i2.m0.e(r7)
            r4 = 0
            r5 = 1
            if (r2 >= r3) goto L16
            r2 = r5
            goto L17
        L16:
            r2 = r4
        L17:
            int r3 = i2.m0.f(r7)
            int r6 = i2.m0.e(r9)
            if (r3 >= r6) goto L23
            r3 = r5
            goto L24
        L23:
            r3 = r4
        L24:
            r2 = r2 & r3
            if (r2 == 0) goto L86
            int r2 = i2.m0.f(r9)
            int r3 = i2.m0.f(r7)
            if (r2 > r3) goto L33
            r2 = r5
            goto L34
        L33:
            r2 = r4
        L34:
            int r3 = i2.m0.e(r7)
            int r6 = i2.m0.e(r9)
            if (r3 > r6) goto L40
            r3 = r5
            goto L41
        L40:
            r3 = r4
        L41:
            r2 = r2 & r3
            if (r2 == 0) goto L4a
            int r0 = i2.m0.f(r9)
            r1 = r0
            goto L96
        L4a:
            int r2 = i2.m0.f(r7)
            int r3 = i2.m0.f(r9)
            if (r2 > r3) goto L56
            r2 = r5
            goto L57
        L56:
            r2 = r4
        L57:
            int r3 = i2.m0.e(r9)
            int r7 = i2.m0.e(r7)
            if (r3 > r7) goto L62
            r4 = r5
        L62:
            r7 = r2 & r4
            if (r7 == 0) goto L6c
            int r7 = i2.m0.d(r9)
        L6a:
            int r1 = r1 - r7
            goto L96
        L6c:
            int r7 = i2.m0.f(r9)
            int r8 = i2.m0.e(r9)
            if (r0 >= r8) goto L81
            if (r7 > r0) goto L81
            int r0 = i2.m0.f(r9)
            int r7 = i2.m0.d(r9)
            goto L6a
        L81:
            int r1 = i2.m0.f(r9)
            goto L96
        L86:
            int r7 = i2.m0.f(r9)
            if (r1 <= r7) goto L96
            int r7 = i2.m0.d(r9)
            int r0 = r0 - r7
            int r7 = i2.m0.d(r9)
            goto L6a
        L96:
            long r7 = i2.e0.b(r0, r1)
            return r7
    }

    public static int R(ud.j r3) {
            boolean r0 = r3 instanceof ud.h
            r1 = 0
            if (r0 == 0) goto L2a
            ud.h r3 = (ud.h) r3
            java.util.List r3 = r3.g()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            ud.p r0 = (ud.p) r0
            md.a r2 = md.a.f8838s
            md.f r0 = r0.f8877g
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L26
            goto Lf
        L26:
            int r1 = r1 + 1
            goto Lf
        L29:
            return r1
        L2a:
            boolean r0 = r3 instanceof ud.n
            if (r0 == 0) goto L4b
            ud.n r3 = (ud.n) r3
            java.util.List r3 = r3.u()
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.next()
            ud.j r0 = (ud.j) r0
            int r0 = R(r0)
            int r1 = r1 + r0
            goto L38
        L4a:
            return r1
        L4b:
            java.lang.String r3 = M0(r3)
            ah.a.k(r3)
            r3 = 0
            return r3
    }

    public static boolean S0(ac.o r16, ac.k r17) {
            r1 = r16
            r0 = r17
            java.lang.String r2 = r1.f192b
            java.lang.String r3 = r1.f191a
            java.lang.String r4 = "rw"
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r0.f179j     // Catch: java.lang.Exception -> L9d
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Exception -> L9d
            int r7 = r7.length     // Catch: java.lang.Exception -> L9d
            java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r9.<init>()     // Catch: java.lang.Exception -> L9d
            r9.append(r2)     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = ".kva"
            r9.append(r10)     // Catch: java.lang.Exception -> L9d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L9d
            r8.<init>(r3, r9)     // Catch: java.lang.Exception -> L9d
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r10.<init>()     // Catch: java.lang.Exception -> L9d
            r10.append(r2)     // Catch: java.lang.Exception -> L9d
            java.lang.String r11 = ".kvb"
            r10.append(r11)     // Catch: java.lang.Exception -> L9d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L9d
            r9.<init>(r3, r10)     // Catch: java.lang.Exception -> L9d
            boolean r3 = ig.a.L(r8)     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto La1
            boolean r3 = ig.a.L(r9)     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto La1
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L9d
            r3.<init>(r8, r4)     // Catch: java.lang.Exception -> L9d
            long r14 = (long) r7
            r3.setLength(r14)     // Catch: java.lang.Exception -> L9a
            java.nio.channels.FileChannel r10 = r3.getChannel()     // Catch: java.lang.Exception -> L9a
            r1.f208r = r10     // Catch: java.lang.Exception -> L9a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> L9a
            r12 = 0
            java.nio.MappedByteBuffer r7 = r10.map(r11, r12, r14)     // Catch: java.lang.Exception -> L9a
            r1.f210t = r7     // Catch: java.lang.Exception -> L9a
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L9a
            r7.order(r8)     // Catch: java.lang.Exception -> L9a
            java.nio.MappedByteBuffer r7 = r1.f210t     // Catch: java.lang.Exception -> L9a
            java.lang.Object r10 = r0.f179j     // Catch: java.lang.Exception -> L9a
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Exception -> L9a
            int r12 = r1.f194d     // Catch: java.lang.Exception -> L9a
            r7.put(r10, r5, r12)     // Catch: java.lang.Exception -> L9a
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L9a
            r7.<init>(r9, r4)     // Catch: java.lang.Exception -> L9a
            r7.setLength(r14)     // Catch: java.lang.Exception -> L98
            java.nio.channels.FileChannel r10 = r7.getChannel()     // Catch: java.lang.Exception -> L98
            r1.f209s = r10     // Catch: java.lang.Exception -> L98
            r12 = 0
            java.nio.MappedByteBuffer r4 = r10.map(r11, r12, r14)     // Catch: java.lang.Exception -> L98
            r1.f211u = r4     // Catch: java.lang.Exception -> L98
            r4.order(r8)     // Catch: java.lang.Exception -> L98
            java.nio.MappedByteBuffer r4 = r1.f211u     // Catch: java.lang.Exception -> L98
            java.lang.Object r0 = r0.f179j     // Catch: java.lang.Exception -> L98
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L98
            int r8 = r1.f194d     // Catch: java.lang.Exception -> L98
            r4.put(r0, r5, r8)     // Catch: java.lang.Exception -> L98
            r0 = 1
            return r0
        L98:
            r0 = move-exception
            goto La9
        L9a:
            r0 = move-exception
            r7 = r6
            goto La9
        L9d:
            r0 = move-exception
            r3 = r6
            r7 = r3
            goto La9
        La1:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = "open file failed"
            r0.<init>(r3)     // Catch: java.lang.Exception -> L9d
            throw r0     // Catch: java.lang.Exception -> L9d
        La9:
            ig.a.j(r3)
            ig.a.j(r7)
            r1.f208r = r6
            r1.f209s = r6
            r1.f210t = r6
            r1.f211u = r6
            java.lang.String r1 = "FastKV"
            android.util.Log.e(r1, r2, r0)
            return r5
    }

    public static final boolean T(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "Hchat_quick_terminate_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r1)
            java.lang.String r1 = "quick_terminate_enable"
            boolean r2 = r2.getBoolean(r1, r0)
            return r2
    }

    public static boolean T0(ac.o r10) {
            java.lang.String r0 = "FastKV"
            java.lang.String r1 = r10.f192b
            java.lang.String r2 = r10.f191a
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r5.<init>()     // Catch: java.lang.Exception -> Laf
            r5.append(r1)     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = ".tmp"
            r5.append(r6)     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Laf
            r4.<init>(r2, r5)     // Catch: java.lang.Exception -> Laf
            boolean r5 = ig.a.L(r4)     // Catch: java.lang.Exception -> Laf
            if (r5 == 0) goto Lbb
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch: java.lang.Exception -> Laf
            int r6 = r10.f194d     // Catch: java.lang.Throwable -> Lb1
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lb1
            r5.setLength(r6)     // Catch: java.lang.Throwable -> Lb1
            ac.k r6 = r10.f198h     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r6 = r6.f179j     // Catch: java.lang.Throwable -> Lb1
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> Lb1
            int r7 = r10.f194d     // Catch: java.lang.Throwable -> Lb1
            r5.write(r6, r3, r7)     // Catch: java.lang.Throwable -> Lb1
            java.io.FileDescriptor r6 = r5.getFD()     // Catch: java.lang.Throwable -> Lb1
            r6.sync()     // Catch: java.lang.Throwable -> Lb1
            r5.close()     // Catch: java.lang.Exception -> Laf
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r6.<init>()     // Catch: java.lang.Exception -> Laf
            r6.append(r1)     // Catch: java.lang.Exception -> Laf
            java.lang.String r7 = ".kvc"
            r6.append(r7)     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Laf
            r5.<init>(r2, r6)     // Catch: java.lang.Exception -> Laf
            boolean r2 = r4.renameTo(r5)     // Catch: java.lang.Exception -> Laf
            r6 = 1
            if (r2 == 0) goto L63
            goto L75
        L63:
            boolean r2 = r5.exists()     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L6f
            boolean r2 = r5.delete()     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L77
        L6f:
            boolean r2 = r4.renameTo(r5)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L77
        L75:
            r2 = r6
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto La4
            java.util.ArrayList r2 = r10.f201k     // Catch: java.lang.Exception -> Laf
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Exception -> Laf
            if (r4 != 0) goto La3
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Exception -> Laf
        L86:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Laf
            if (r5 == 0) goto La0
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Laf
            java.util.concurrent.Executor r7 = ac.p.w()     // Catch: java.lang.Exception -> Laf
            a1.d r8 = new a1.d     // Catch: java.lang.Exception -> Laf
            r9 = 1
            r8.<init>(r10, r9, r5)     // Catch: java.lang.Exception -> Laf
            r7.execute(r8)     // Catch: java.lang.Exception -> Laf
            goto L86
        La0:
            r2.clear()     // Catch: java.lang.Exception -> Laf
        La3:
            return r6
        La4:
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = "rename failed"
            r10.<init>(r2)     // Catch: java.lang.Exception -> Laf
            android.util.Log.w(r0, r1, r10)     // Catch: java.lang.Exception -> Laf
            return r3
        Laf:
            r10 = move-exception
            goto Lbc
        Lb1:
            r10 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lba
        Lb6:
            r2 = move-exception
            r10.addSuppressed(r2)     // Catch: java.lang.Exception -> Laf
        Lba:
            throw r10     // Catch: java.lang.Exception -> Laf
        Lbb:
            return r3
        Lbc:
            android.util.Log.e(r0, r1, r10)
            return r3
    }

    public static boolean U(ud.h r2, ud.j r3) {
            ud.p r2 = a.a.c0(r2)
            if (r2 != 0) goto L8
            goto L7d
        L8:
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.f10507p
            if (r0 != r1) goto Lf
            goto L7b
        Lf:
            pd.k r1 = pd.k.f10509r
            if (r0 != r1) goto L3a
            md.b r0 = md.b.F
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r0)
            ae.b r2 = (ae.b) r2
            if (r2 == 0) goto L7b
            java.util.List r2 = r2.f228g
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r2.next()
            ae.f r0 = (ae.f) r0
            ud.a r0 = r0.f234c
            boolean r0 = Z(r0, r3)
            if (r0 == 0) goto L25
            goto L7d
        L3a:
            pd.k r1 = pd.k.T
            if (r0 != r1) goto L7d
            md.b r0 = md.b.f8871z
            md.f r1 = r2.f8877g
            oc.b r0 = r1.c(r0)
            md.c r0 = (md.c) r0
            if (r0 == 0) goto L65
            java.util.ArrayList r0 = r0.f8873h
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            nd.t r1 = (nd.t) r1
            ud.a r1 = r1.f9392a
            boolean r1 = Z(r1, r3)
            if (r1 != 0) goto L50
            goto L7b
        L65:
            md.b r0 = md.b.G
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r0)
            nd.u r2 = (nd.u) r2
            if (r2 == 0) goto L7d
            nd.t r2 = r2.f9397g
            ud.a r2 = r2.f9392a
            boolean r2 = Z(r2, r3)
            if (r2 != 0) goto L7d
        L7b:
            r2 = 1
            return r2
        L7d:
            r2 = 0
            return r2
    }

    public static boolean V(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L51
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L51
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L51
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L51
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L51
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            r3 = r0[r2]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L51
            r1 = 1
            r0 = r0[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L51
            java.lang.String r0 = "com.tencent.mm.ui.chatting.viewitems."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L51
            return r1
        L51:
            return r2
    }

    public static boolean W(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L60
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L60
            java.lang.Class r1 = r5.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L60
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L60
            int r1 = r0.length
            r3 = 3
            if (r1 != r3) goto L60
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            r3 = r0[r2]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L60
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r3 = 1
            r4 = r0[r3]
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L60
            r1 = 2
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "android.view.ContextMenu$ContextMenuInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = "com.tencent.mm.ui.chatting.viewitems."
            boolean r5 = eh.a.A(r5, r2, r0)
            if (r5 == 0) goto L60
            return r3
        L60:
            return r2
    }

    public static boolean Y(u4.p r6) {
            java.lang.Object[] r0 = r6.f22543h
            int r0 = r0.length
            r1 = 2
            if (r0 >= r1) goto L7
            goto L26
        L7:
            r1 = 0
            java.lang.Object r2 = r6.l(r1)
            u4.o r2 = (u4.o) r2
            int r2 = r2.f13400g
            r3 = r1
        L11:
            if (r3 >= r0) goto L26
            java.lang.Object r4 = r6.l(r3)
            u4.o r4 = (u4.o) r4
            int r5 = r4.f13400g
            if (r5 == r2) goto L1e
            return r1
        L1e:
            int r4 = r4.j()
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L11
        L26:
            r6 = 1
            return r6
    }

    public static boolean Z(ud.a r1, ud.j r2) {
            boolean r0 = r2 instanceof ud.h
            if (r0 == 0) goto L7
            if (r2 != r1) goto L29
            goto L27
        L7:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L2b
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = Z(r1, r0)
            if (r0 == 0) goto L15
        L27:
            r1 = 1
            return r1
        L29:
            r1 = 0
            return r1
        L2b:
            java.lang.String r1 = M0(r2)
            ah.a.k(r1)
            r1 = 0
            return r1
    }

    public static final void a(boolean r17, t2.j r18, h0.d1 r19, i0.h0 r20, int r21) {
            r1 = r17
            r10 = r19
            r8 = r20
            r11 = r21
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            r8.b0(r0)
            r0 = r11 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r8.g(r1)
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r11
            goto L1f
        L1e:
            r0 = r11
        L1f:
            r3 = r11 & 48
            r4 = 32
            if (r3 != 0) goto L34
            int r3 = r18.ordinal()
            boolean r3 = r8.d(r3)
            if (r3 == 0) goto L31
            r3 = r4
            goto L33
        L31:
            r3 = 16
        L33:
            r0 = r0 | r3
        L34:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L44
            boolean r3 = r8.h(r10)
            if (r3 == 0) goto L41
            r3 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r3 = 128(0x80, float:1.8E-43)
        L43:
            r0 = r0 | r3
        L44:
            r3 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 0
            r7 = 1
            if (r3 == r5) goto L4e
            r3 = r7
            goto L4f
        L4e:
            r3 = r6
        L4f:
            r5 = r0 & 1
            boolean r3 = r8.S(r5, r3)
            if (r3 == 0) goto L13c
            r3 = r0 & 14
            if (r3 != r2) goto L5d
            r5 = r7
            goto L5e
        L5d:
            r5 = r6
        L5e:
            boolean r9 = r8.f(r10)
            r5 = r5 | r9
            java.lang.Object r9 = r8.P()
            i0.e r12 = i0.l.f5952a
            if (r5 != 0) goto L6d
            if (r9 != r12) goto L75
        L6d:
            h0.z0 r9 = new h0.z0
            r9.<init>(r10, r1)
            r8.k0(r9)
        L75:
            w.y0 r9 = (w.y0) r9
            boolean r5 = r8.h(r10)
            if (r3 != r2) goto L7f
            r2 = r7
            goto L80
        L7f:
            r2 = r6
        L80:
            r2 = r2 | r5
            java.lang.Object r3 = r8.P()
            if (r2 != 0) goto L89
            if (r3 != r12) goto L91
        L89:
            h0.e1 r3 = new h0.e1
            r3.<init>(r10, r1)
            r8.k0(r3)
        L91:
            h0.l r3 = (h0.l) r3
            n2.s r2 = r10.n()
            long r13 = r2.f8977b
            boolean r2 = i2.m0.g(r13)
            if (r1 == 0) goto La9
            n2.s r5 = r10.n()
            long r13 = r5.f8977b
            long r4 = r13 >> r4
        La7:
            int r4 = (int) r4
            goto Lb6
        La9:
            n2.s r4 = r10.n()
            long r4 = r4.f8977b
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r13
            goto La7
        Lb6:
            w.q0 r5 = r10.f4850d
            r13 = 0
            if (r5 == 0) goto L110
            w.m1 r5 = r5.d()
            if (r5 == 0) goto L110
            i2.k0 r5 = r5.f14569a
            if (r4 < 0) goto L110
            i2.j0 r14 = r5.f6346a
            i2.o r5 = r5.f6347b
            i2.g r14 = r14.f6334a
            java.lang.String r14 = r14.f6314h
            int r14 = r14.length()
            if (r14 != 0) goto Ld4
            goto L110
        Ld4:
            int r14 = r5.d(r4)
            int r15 = r5.f6369b
            int r15 = r15 - r7
            r16 = r7
            int r7 = r5.f6373f
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r15, r7)
            int r7 = java.lang.Math.min(r14, r7)
            int r6 = r5.c(r7, r6)
            if (r4 <= r6) goto Lf0
            goto L110
        Lf0:
            r5.m(r7)
            java.util.ArrayList r4 = r5.f6375h
            int r5 = i2.e0.e(r7, r4)
            java.lang.Object r4 = r4.get(r5)
            i2.r r4 = (i2.r) r4
            i2.a r5 = r4.f6381a
            int r4 = r4.f6384d
            int r7 = r7 - r4
            j2.k r4 = r5.f6248d
            float r5 = r4.e(r7)
            float r4 = r4.g(r7)
            float r13 = r5 - r4
        L110:
            r6 = r13
            boolean r4 = r8.h(r9)
            java.lang.Object r5 = r8.P()
            if (r4 != 0) goto L11d
            if (r5 != r12) goto L126
        L11d:
            c0.g r5 = new c0.g
            r4 = 4
            r5.<init>(r9, r4)
            r8.k0(r5)
        L126:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r5
            y0.l r4 = y0.l.f21818a
            y0.o r7 = s1.h0.a(r4, r9, r5)
            int r0 = r0 << 3
            r9 = r0 & 1008(0x3f0, float:1.413E-42)
            r4 = 0
            r0 = r3
            r3 = r2
            r2 = r18
            oh.h.b(r0, r1, r2, r3, r4, r6, r7, r8, r9)
            goto L13f
        L13c:
            r20.V()
        L13f:
            i0.r1 r0 = r20.t()
            if (r0 == 0) goto L14e
            h0.e r2 = new h0.e
            r3 = r18
            r2.<init>(r1, r3, r10, r11)
            r0.f6035d = r2
        L14e:
            return
    }

    public static boolean a0(ud.j r4, ud.n r5) {
            if (r4 != r5) goto L4
            goto L7b
        L4:
            if (r5 != 0) goto L8
            goto L73
        L8:
            r0 = r5
            xd.a r0 = (xd.a) r0
            ud.n r0 = r0.f21538i
        Ld:
            r3 = r0
            r0 = r5
            r5 = r3
            if (r4 == r5) goto L7b
            if (r5 != 0) goto L75
            r5 = r0
            md.e r5 = (md.e) r5
            md.f r5 = r5.f8877g
            md.b r1 = md.b.E
            boolean r5 = r5.b(r1)
            if (r5 == 0) goto L73
            if (r4 != r0) goto L24
            goto L7b
        L24:
            boolean r5 = r4 instanceof ud.n
            if (r5 == 0) goto L73
            ud.n r4 = (ud.n) r4
            java.util.List r4 = r4.u()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r4.next()
            ud.j r5 = (ud.j) r5
            r1 = r5
            md.e r1 = (md.e) r1
            md.f r1 = r1.f8877g
            md.b r2 = md.b.D
            oc.b r1 = r1.c(r2)
            ae.h r1 = (ae.h) r1
            if (r1 == 0) goto L6c
            boolean r2 = r5 instanceof ud.n
            if (r2 == 0) goto L6c
            java.util.List r1 = r1.f244h
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r1.next()
            ae.f r2 = (ae.f) r2
            xd.b r2 = r2.f236e
            boolean r2 = a0(r2, r0)
            if (r2 == 0) goto L57
            goto L7b
        L6c:
            boolean r5 = a0(r5, r0)
            if (r5 == 0) goto L32
            goto L7b
        L73:
            r4 = 0
            return r4
        L75:
            r0 = r5
            xd.a r0 = (xd.a) r0
            ud.n r0 = r0.f21538i
            goto Ld
        L7b:
            r4 = 1
            return r4
    }

    public static final boolean b(java.lang.reflect.Method r3) {
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L27
            int r0 = r3.getParameterCount()
            r2 = 1
            if (r0 != r2) goto L27
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3 = r3[r1]
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "com.tencent.mm.plugin.appbrand."
            boolean r3 = og.t.d0(r3, r0, r1)
            if (r3 == 0) goto L27
            return r2
        L27:
            return r1
    }

    public static boolean b0(int r1, boolean r2) {
            if (r2 != 0) goto L8
            boolean r2 = kd.d.b(r1)
            if (r2 == 0) goto L2c
        L8:
            r2 = 880(0x370, float:1.233E-42)
            r0 = 46
            if (r1 >= r2) goto L1b
            boolean r2 = java.lang.Character.isUnicodeIdentifierPart(r1)
            if (r2 == 0) goto L1b
            boolean r2 = java.lang.Character.isIdentifierIgnorable(r1)
            if (r2 != 0) goto L1b
            goto L21
        L1b:
            if (r1 == r0) goto L21
            r2 = 45
            if (r1 != r2) goto L29
        L21:
            java.util.regex.Pattern r2 = kd.d.f7584a
            boolean r2 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r2 != 0) goto L2e
        L29:
            if (r1 != r0) goto L2c
            goto L2e
        L2c:
            r1 = 0
            return r1
        L2e:
            r1 = 1
            return r1
    }

    public static final void c(f.k0 r4, java.lang.Object r5, java.lang.Object r6) {
            int r0 = r4.f(r5)
            if (r0 >= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            java.lang.Object[] r2 = r4.f2850c
            r2 = r2[r0]
        L11:
            if (r2 != 0) goto L14
            goto L2f
        L14:
            boolean r3 = r2 instanceof f.l0
            if (r3 == 0) goto L1f
            r3 = r2
            f.l0 r3 = (f.l0) r3
            r3.a(r6)
            goto L2e
        L1f:
            if (r2 == r6) goto L2e
            f.l0 r3 = new f.l0
            r3.<init>()
            r3.a(r2)
            r3.a(r6)
            r6 = r3
            goto L2f
        L2e:
            r6 = r2
        L2f:
            if (r1 == 0) goto L3b
            int r0 = ~r0
            java.lang.Object[] r1 = r4.f2849b
            r1[r0] = r5
            java.lang.Object[] r4 = r4.f2850c
            r4[r0] = r6
            return
        L3b:
            java.lang.Object[] r4 = r4.f2850c
            r4[r0] = r6
            return
    }

    public static boolean c0(java.lang.StringBuilder r1) {
            int r1 = r1.length()
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 < r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static void d(java.lang.StringBuilder r8, java.lang.StringBuilder r9, b8.j r10) {
            boolean r0 = c0(r9)
            if (r0 == 0) goto L8
            goto L153
        L8:
            boolean r0 = r10 instanceof b8.e
            if (r0 == 0) goto L70
            b8.e r10 = (b8.e) r10
            boolean r0 = c0(r9)
            if (r0 == 0) goto L15
            goto L6f
        L15:
            int r0 = r8.length()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 <= r2) goto L3a
            int r0 = r8.length()
            if (r0 != 0) goto L26
            r3 = r1
            goto L37
        L26:
            if (r0 <= r2) goto L2d
            java.lang.String r3 = r8.toString()
            goto L2e
        L2d:
            r3 = r1
        L2e:
            r4 = 10
            if (r0 >= r4) goto L37
            r0 = 32
            r8.append(r0)
        L37:
            r9.append(r3)
        L3a:
            a2.a r0 = r10.f508k
            z7.l r0 = new z7.l
            r0.<init>(r10)
            r10 = 0
        L42:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L59
            boolean r3 = c0(r9)
            if (r3 != 0) goto L59
            java.lang.Object r10 = r0.next()
            b8.j r10 = (b8.j) r10
            d(r8, r9, r10)
            r10 = r2
            goto L42
        L59:
            int r0 = r8.length()
            if (r0 != 0) goto L60
            goto L6a
        L60:
            if (r0 <= r2) goto L66
            int r0 = r0 - r2
            r8.deleteCharAt(r0)
        L66:
            java.lang.String r1 = r8.toString()
        L6a:
            if (r10 == 0) goto L6f
            r9.append(r1)
        L6f:
            return
        L70:
            boolean r0 = r10 instanceof b8.f
            r1 = 0
            if (r0 == 0) goto L122
            b8.f r10 = (b8.f) r10
            boolean r0 = c0(r9)
            if (r0 == 0) goto L7f
            goto L153
        L7f:
            int r0 = r8.length()
            r2 = 32
            java.lang.String r3 = ""
            r4 = 1
            if (r0 != 0) goto L8c
            r5 = r3
            goto L9b
        L8c:
            if (r0 <= r4) goto L93
            java.lang.String r5 = r8.toString()
            goto L94
        L93:
            r5 = r3
        L94:
            r6 = 10
            if (r0 >= r6) goto L9b
            r8.append(r2)
        L9b:
            r9.append(r5)
            r0 = 60
            r9.append(r0)
            java.lang.String r0 = r10.f512l
            if (r0 != 0) goto La9
            java.lang.String r0 = "null"
        La9:
            r9.append(r0)
            z7.l r5 = new z7.l
            androidx.lifecycle.x r6 = new androidx.lifecycle.x
            r7 = 3
            r6.<init>(r10, r7)
            r5.<init>(r6)
        Lb7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lce
            boolean r6 = c0(r9)
            if (r6 != 0) goto Lce
            r9.append(r2)
            java.lang.Object r6 = r5.next()
            r9.append(r6)
            goto Lb7
        Lce:
            z7.l r2 = new z7.l
            r2.<init>(r10)
            r10 = r1
        Ld4:
            boolean r5 = r2.hasNext()
            r6 = 62
            if (r5 == 0) goto Lf8
            java.lang.Object r5 = r2.next()
            b8.j r5 = (b8.j) r5
            if (r1 != 0) goto Le9
            r9.append(r6)
            r10 = r4
            r1 = r10
        Le9:
            if (r10 == 0) goto Led
            boolean r10 = r5 instanceof b8.h
        Led:
            boolean r7 = c0(r9)
            if (r7 == 0) goto Lf4
            goto Lf8
        Lf4:
            d(r8, r9, r5)
            goto Ld4
        Lf8:
            int r2 = r8.length()
            if (r2 != 0) goto Lff
            goto L109
        Lff:
            if (r2 <= r4) goto L105
            int r2 = r2 - r4
            r8.deleteCharAt(r2)
        L105:
            java.lang.String r3 = r8.toString()
        L109:
            if (r1 == 0) goto L11c
            if (r10 != 0) goto L110
            r9.append(r3)
        L110:
            java.lang.String r8 = "</"
            r9.append(r8)
            r9.append(r0)
            r9.append(r6)
            return
        L11c:
            java.lang.String r8 = "/>"
            r9.append(r8)
            return
        L122:
            boolean r8 = r10 instanceof b8.h
            if (r8 == 0) goto L14e
            b8.h r10 = (b8.h) r10
            boolean r8 = c0(r9)
            if (r8 == 0) goto L12f
            goto L153
        L12f:
            java.lang.String r8 = r10.f517h
            int r10 = r9.length()
            int r10 = 300 - r10
            if (r10 > 0) goto L13a
            goto L153
        L13a:
            int r0 = r8.length()
            if (r10 >= r0) goto L14a
            java.lang.String r8 = r8.substring(r1, r10)
            java.lang.String r10 = " ..."
            java.lang.String r8 = r8.concat(r10)
        L14a:
            r9.append(r8)
            return
        L14e:
            if (r10 == 0) goto L153
            r9.append(r10)
        L153:
            return
    }

    public static java.lang.String d0(v4.u r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            boolean r1 = r4 instanceof v4.t
            if (r1 == 0) goto L15
            v4.t r4 = (v4.t) r4
            long r1 = r4.f14122g
            goto L1a
        L15:
            int r4 = r4.l()
            long r1 = (long) r4
        L1a:
            r4 = 4
            r3 = 16
            if (r5 == r4) goto L57
            r4 = 8
            if (r5 == r4) goto L4e
            if (r5 == r3) goto L45
            r4 = 32
            if (r5 == r4) goto L3c
            r4 = 64
            if (r5 != r4) goto L35
            java.lang.String r4 = a.a.Z0(r1)
            r0.append(r4)
            goto L6c
        L35:
            java.lang.String r4 = "shouldn't happen"
            bsh.j.g(r4)
            r4 = 0
            return r4
        L3c:
            int r4 = (int) r1
            java.lang.String r4 = a.a.Y0(r4)
            r0.append(r4)
            goto L6c
        L45:
            int r4 = (int) r1
            java.lang.String r4 = a.a.X0(r4)
            r0.append(r4)
            goto L6c
        L4e:
            int r4 = (int) r1
            java.lang.String r4 = a.a.W0(r4)
            r0.append(r4)
            goto L6c
        L57:
            int r4 = (int) r1
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r3)
            r5 = 1
            char[] r5 = new char[r5]
            r1 = 0
            r5[r1] = r4
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            r0.append(r4)
        L6c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String e(p4.l r6) {
            p4.b0 r6 = (p4.b0) r6
            int r6 = r6.m()
            short r0 = (short) r6
            if (r6 != r0) goto L32
            r0 = 5
            char[] r0 = new char[r0]
            r1 = 0
            if (r6 >= 0) goto L15
            r2 = 45
            r0[r1] = r2
            int r6 = -r6
            goto L19
        L15:
            r2 = 43
            r0[r1] = r2
        L19:
            r2 = 4
            if (r1 >= r2) goto L2c
            int r3 = 4 - r1
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r0[r3] = r4
            int r6 = r6 >> r2
            int r1 = r1 + 1
            goto L19
        L2c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
        L32:
            java.lang.String r6 = a.a.L0(r6)
            return r6
    }

    public static java.lang.String e0(v4.u r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            r1 = 35
            r0.append(r1)
            boolean r1 = r2 instanceof v4.r
            if (r1 == 0) goto L16
            java.lang.String r2 = "null"
            r0.append(r2)
            goto L29
        L16:
            java.lang.String r1 = r2.j()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r2.a()
            r0.append(r2)
        L29:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void f0(ac.o r20) {
            r1 = r20
            java.lang.String r0 = "rw"
            java.lang.String r2 = "FastKV"
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.f191a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.f192b
            java.lang.String r7 = ".kva"
            java.lang.String r5 = eh.a.r(r5, r6, r7)
            r3.<init>(r4, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r7 = ".kvb"
            java.lang.String r7 = bc.e.i(r6, r7)
            r5.<init>(r4, r7)
            boolean r4 = ig.a.L(r3)     // Catch: java.lang.Exception -> La2
            if (r4 == 0) goto Lb3
            boolean r4 = ig.a.L(r5)     // Catch: java.lang.Exception -> La2
            if (r4 != 0) goto L33
            goto Lb3
        L33:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> La2
            r4.<init>(r3, r0)     // Catch: java.lang.Exception -> La2
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> La2
            r7.<init>(r5, r0)     // Catch: java.lang.Exception -> La2
            long r8 = r4.length()     // Catch: java.lang.Exception -> La2
            long r10 = r7.length()     // Catch: java.lang.Exception -> La2
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch: java.lang.Exception -> La2
            r1.f208r = r0     // Catch: java.lang.Exception -> La2
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch: java.lang.Exception -> La2
            r1.f209s = r0     // Catch: java.lang.Exception -> La2
            java.nio.channels.FileChannel r12 = r1.f208r     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            java.nio.channels.FileChannel$MapMode r13 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r18 = 0
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 <= 0) goto L5e
            r16 = r8
            goto L63
        L5e:
            int r4 = ac.o.A     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            long r14 = (long) r4     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r16 = r14
        L63:
            r14 = 0
            java.nio.MappedByteBuffer r4 = r12.map(r13, r14, r16)     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r1.f210t = r4     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r4.order(r7)     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r14 = r13
            java.nio.channels.FileChannel r13 = r1.f209s     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            int r4 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r4 <= 0) goto L7a
            r17 = r10
            goto L81
        L7a:
            int r12 = ac.o.A     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r15 = r13
            long r12 = (long) r12     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r17 = r12
            r13 = r15
        L81:
            r15 = 0
            java.nio.MappedByteBuffer r12 = r13.map(r14, r15, r17)     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r1.f211u = r12     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            r12.order(r7)     // Catch: java.lang.Exception -> La2 java.io.IOException -> La8
            ac.k r3 = new ac.k     // Catch: java.lang.Exception -> La2
            java.nio.MappedByteBuffer r5 = r1.f210t     // Catch: java.lang.Exception -> La2
            int r5 = r5.capacity()     // Catch: java.lang.Exception -> La2
            r3.<init>(r5)     // Catch: java.lang.Exception -> La2
            r1.f198h = r3     // Catch: java.lang.Exception -> La2
            if (r0 != 0) goto La4
            if (r4 != 0) goto La4
            r0 = 12
            r1.f194d = r0     // Catch: java.lang.Exception -> La2
            return
        La2:
            r0 = move-exception
            goto Lc1
        La4:
            r0(r1, r8, r10)     // Catch: java.lang.Exception -> La2
            return
        La8:
            r0 = move-exception
            android.util.Log.e(r2, r6, r0)     // Catch: java.lang.Exception -> La2
            J0(r1)     // Catch: java.lang.Exception -> La2
            L0(r1, r3, r5)     // Catch: java.lang.Exception -> La2
            return
        Lb3:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = "open file failed"
            r0.<init>(r3)     // Catch: java.lang.Exception -> La2
            android.util.Log.e(r2, r6, r0)     // Catch: java.lang.Exception -> La2
            J0(r1)     // Catch: java.lang.Exception -> La2
            return
        Lc1:
            android.util.Log.e(r2, r6, r0)
            z0(r1)
            J0(r1)
            return
    }

    public static java.lang.String g(p4.l r1) {
            p4.b0 r1 = (p4.b0) r1
            p4.f r1 = r1.f10103f
            int r1 = r1.e()
            char r0 = (char) r1
            if (r1 != r0) goto L10
            java.lang.String r1 = a.a.X0(r1)
            return r1
        L10:
            java.lang.String r1 = a.a.Y0(r1)
            return r1
    }

    public static boolean g0(ac.o r7) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r7.f191a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.f192b
            java.lang.String r4 = ".kvc"
            java.lang.String r2 = eh.a.r(r2, r3, r4)
            r0.<init>(r1, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ".tmp"
            java.lang.String r4 = bc.e.i(r3, r4)
            r2.<init>(r1, r4)
            r4 = 0
            boolean r5 = r0.exists()     // Catch: java.lang.Exception -> L51
            if (r5 == 0) goto L27
            goto L30
        L27:
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L5d
            boolean r0 = h0(r7, r0)     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L56
            int r0 = r7.f213w     // Catch: java.lang.Exception -> L51
            if (r0 != 0) goto L9c
            ac.k r0 = r7.f198h     // Catch: java.lang.Exception -> L51
            boolean r0 = S0(r7, r0)     // Catch: java.lang.Exception -> L51
            r1 = 1
            if (r0 == 0) goto L53
            java.lang.String r0 = "recover from c file"
            g4.a.y(r7, r0)     // Catch: java.lang.Exception -> L51
            r(r7)     // Catch: java.lang.Exception -> L4e
            return r1
        L4e:
            r7 = move-exception
            r4 = r1
            goto L9d
        L51:
            r7 = move-exception
            goto L9d
        L53:
            r7.f213w = r1     // Catch: java.lang.Exception -> L51
            return r4
        L56:
            z0(r7)     // Catch: java.lang.Exception -> L51
            r(r7)     // Catch: java.lang.Exception -> L51
            return r4
        L5d:
            int r0 = r7.f213w     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L9c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            r2.append(r3)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = ".kva"
            r2.append(r5)     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L51
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L51
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r5.<init>()     // Catch: java.lang.Exception -> L51
            r5.append(r3)     // Catch: java.lang.Exception -> L51
            java.lang.String r6 = ".kvb"
            r5.append(r6)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L51
            r2.<init>(r1, r5)     // Catch: java.lang.Exception -> L51
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L9c
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L9c
            L0(r7, r0, r2)     // Catch: java.lang.Exception -> L51
        L9c:
            return r4
        L9d:
            java.lang.String r0 = "FastKV"
            android.util.Log.e(r0, r3, r7)
            return r4
    }

    public static ud.a[] h(java.util.ArrayList r12, java.util.function.Function r13) {
            int r0 = r12.size()
            ud.a[] r1 = new ud.a[r0]
            r2 = 0
            java.lang.Object r3 = r12.get(r2)
            ud.a r3 = (ud.a) r3
            r1[r2] = r3
            r3 = 1
            r4 = r3
        L11:
            if (r4 == 0) goto L8a
            r4 = r2
            r5 = r3
        L15:
            if (r5 >= r0) goto L11
            java.lang.Object r6 = r12.get(r5)
            ud.a r6 = (ud.a) r6
            java.lang.Object r7 = r13.apply(r6)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r8 = r7.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L3a
            java.lang.Object r9 = r8.next()
            ud.a r9 = (ud.a) r9
            int r10 = r9.f13672j
            r11 = r1[r10]
            if (r11 == 0) goto L27
            goto L3c
        L3a:
            r10 = -1
            r9 = 0
        L3c:
            if (r9 == 0) goto L7b
            java.util.Iterator r6 = r7.iterator()
        L42:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r6.next()
            ud.a r7 = (ud.a) r7
            int r7 = r7.f13672j
            if (r7 != r10) goto L53
            goto L42
        L53:
            r8 = r1[r7]
            if (r8 == 0) goto L42
            int r8 = r9.f13672j
        L59:
            if (r7 == r8) goto L69
        L5b:
            if (r7 <= r8) goto L62
            r7 = r1[r7]
            int r7 = r7.f13672j
            goto L5b
        L62:
            if (r8 <= r7) goto L59
            r8 = r1[r8]
            int r8 = r8.f13672j
            goto L62
        L69:
            java.lang.Object r7 = r12.get(r7)
            ud.a r7 = (ud.a) r7
            r9 = r7
            goto L42
        L71:
            r6 = r1[r5]
            if (r6 == r9) goto L78
            r1[r5] = r9
            r4 = r3
        L78:
            int r5 = r5 + 1
            goto L15
        L7b:
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r13 = "No immediate dominator for block: "
            java.lang.String r12 = r13.concat(r12)
            ah.a.k(r12)
            r12 = 0
            return r12
        L8a:
            return r1
    }

    public static boolean h0(ac.o r8, java.io.File r9) {
            long r0 = r9.length()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L74
            r4 = 268435456(0x10000000, double:1.32624737E-315)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L13
            goto L74
        L13:
            int r0 = (int) r0
            int r1 = ac.o.A
            int r1 = G(r1, r0)
            ac.k r2 = r8.f198h
            if (r2 == 0) goto L28
            java.lang.Object r4 = r2.f179j
            byte[] r4 = (byte[]) r4
            int r4 = r4.length
            if (r4 != r1) goto L28
            r2.f177h = r3
            goto L31
        L28:
            ac.k r2 = new ac.k
            byte[] r1 = new byte[r1]
            r2.<init>(r1, r3)
            r8.f198h = r2
        L31:
            java.lang.Object r1 = r2.f179j
            byte[] r1 = (byte[]) r1
            ig.a.U(r9, r1, r0)
            int r9 = r2.q()
            if (r9 >= 0) goto L3f
            goto L74
        L3f:
            r1 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r9
            r4 = 1073741824(0x40000000, float:2.0)
            r9 = r9 & r4
            r4 = 1
            if (r9 == 0) goto L4b
            r9 = r4
            goto L4c
        L4b:
            r9 = r3
        L4c:
            int r5 = r2.f177h
            long r5 = r2.r(r5)
            int r7 = r2.f177h
            int r7 = r7 + 8
            r2.f177h = r7
            int r7 = r1 + 12
            r8.f194d = r7
            if (r1 < 0) goto L74
            r7 = 12
            int r0 = r0 - r7
            if (r1 > r0) goto L74
            long r0 = r2.m(r7, r1)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L74
            boolean r9 = be.h.O(r8, r9)
            if (r9 == 0) goto L74
            r8.f195e = r5
            return r4
        L74:
            return r3
    }

    public static void i(ac.o r3) {
            int r0 = r3.f213w
            if (r0 != 0) goto L12
            java.nio.MappedByteBuffer r0 = r3.f210t     // Catch: java.lang.Exception -> Lf
            y0(r3, r0)     // Catch: java.lang.Exception -> Lf
            java.nio.MappedByteBuffer r0 = r3.f211u     // Catch: java.lang.Exception -> Lf
            y0(r3, r0)     // Catch: java.lang.Exception -> Lf
            goto L12
        Lf:
            J0(r3)
        L12:
            z0(r3)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f191a
            r1.append(r2)
            java.lang.String r3 = r3.f192b
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            ig.a.n(r0)
            return
    }

    public static int i0(int r1, int r2) {
            r0 = r1 & 15
            if (r0 != r1) goto L13
            r0 = r2 & 15
            if (r0 != r2) goto Lc
            int r2 = r2 << 4
            r1 = r1 | r2
            return r1
        Lc:
            java.lang.String r1 = "high out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
        L13:
            java.lang.String r1 = "low out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static final java.util.List j0(r8.g r9, fg.p r10) {
            r9.getClass()
            r10.getClass()
            android.content.Context r0 = r9.f11620a
            java.lang.String r1 = "Hchat_single_message_menu_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r0, r1)
            java.lang.ClassLoader r2 = r9.f11622c
            java.lang.String r0 = e8.b.g(r0, r2)
            java.lang.String r3 = "menu_click_v1"
            java.util.List r4 = e8.b.f(r1, r0, r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L3a
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = V(r7)
            if (r7 == 0) goto L23
            r5.add(r6)
            goto L23
        L3a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.toGenericString()
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto L48
            r6.add(r7)
            goto L48
        L63:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L6a
            return r6
        L6a:
            org.luckypray.dexkit.DexKitBridge r9 = r9.f11623d     // Catch: java.lang.Throwable -> Ld3
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> Ld3
            r4.<init>()     // Catch: java.lang.Throwable -> Ld3
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> Ld3
            r5.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = "com.tencent.mm.ui.chatting.viewitems."
            r7 = 1
            r5.l0(r7, r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = "void"
            fh.k.q0(r5, r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = "android.view.MenuItem"
            java.lang.String r7 = "int"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> Ld3
            r5.o0(r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = "MicroMsg.ChattingItem"
            java.lang.String r7 = "context item select failed, null dataTag"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> Ld3
            r5.r0(r6)     // Catch: java.lang.Throwable -> Ld3
            r4.f1666h = r5     // Catch: java.lang.Throwable -> Ld3
            hh.p r9 = r9.findMethod(r4)     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld3
            r4.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Ld3
        La6:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto Ld5
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> Ld3
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> Ld3
            r5.getClass()     // Catch: java.lang.Throwable -> Lbe
            lh.d r5 = r5.p()     // Catch: java.lang.Throwable -> Lbe
            java.lang.reflect.Method r5 = r5.b(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc5
        Lbe:
            r5 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> Ld3
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Ld3
            r5 = r6
        Lc5:
            boolean r6 = r5 instanceof sf.f     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lcb
            r5 = 0
        Lcb:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto La6
            r4.add(r5)     // Catch: java.lang.Throwable -> Ld3
            goto La6
        Ld3:
            r9 = move-exception
            goto L11e
        Ld5:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld3
            r9.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> Ld3
        Lde:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Lf5
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Ld3
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Ld3
            boolean r5 = V(r5)     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto Lde
            r9.add(r4)     // Catch: java.lang.Throwable -> Ld3
            goto Lde
        Lf5:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Ld3
            r2.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld3
            r4.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Ld3
        L103:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto L123
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> Ld3
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r6.toGenericString()     // Catch: java.lang.Throwable -> Ld3
            boolean r6 = r2.add(r6)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto L103
            r4.add(r5)     // Catch: java.lang.Throwable -> Ld3
            goto L103
        L11e:
            sf.f r4 = new sf.f
            r4.<init>(r9)
        L123:
            java.lang.Throwable r9 = sf.g.b(r4)
            if (r9 == 0) goto L12e
            java.lang.String r2 = "定位单消息菜单点击方法失败"
            r10.invoke(r2, r9)
        L12e:
            boolean r9 = r4 instanceof sf.f
            if (r9 == 0) goto L134
            tf.t r4 = tf.t.f13167g
        L134:
            java.util.List r4 = (java.util.List) r4
            B0(r1, r0, r3, r4)
            return r4
    }

    public static short k(int r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L14
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto Ld
            int r2 = r2 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        Ld:
            java.lang.String r1 = "high out of range 0..255"
            j8.o.t(r1)
            r1 = 0
            return r1
        L14:
            java.lang.String r1 = "low out of range 0..255"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static final java.util.List k0(r8.g r9, fg.p r10) {
            r9.getClass()
            r10.getClass()
            android.content.Context r0 = r9.f11620a
            java.lang.String r1 = "Hchat_single_message_menu_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r0, r1)
            java.lang.ClassLoader r2 = r9.f11622c
            java.lang.String r0 = e8.b.g(r0, r2)
            java.lang.String r3 = "menu_create_v1"
            java.util.List r4 = e8.b.f(r1, r0, r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L3a
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = W(r7)
            if (r7 == 0) goto L23
            r5.add(r6)
            goto L23
        L3a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.toGenericString()
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto L48
            r6.add(r7)
            goto L48
        L63:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L6a
            return r6
        L6a:
            org.luckypray.dexkit.DexKitBridge r9 = r9.f11623d     // Catch: java.lang.Throwable -> Lcc
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> Lcc
            r4.<init>()     // Catch: java.lang.Throwable -> Lcc
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> Lcc
            r5.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = "com.tencent.mm.ui.chatting.viewitems."
            r7 = 1
            r5.l0(r7, r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = "void"
            fh.k.q0(r5, r6)     // Catch: java.lang.Throwable -> Lcc
            r6 = 3
            r5.m0(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = "MicroMsg.ChattingItem"
            java.lang.String r7 = "msg is null!"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> Lcc
            r5.r0(r6)     // Catch: java.lang.Throwable -> Lcc
            r4.f1666h = r5     // Catch: java.lang.Throwable -> Lcc
            hh.p r9 = r9.findMethod(r4)     // Catch: java.lang.Throwable -> Lcc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc
            r4.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lcc
        L9f:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto Lce
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> Lcc
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> Lcc
            r5.getClass()     // Catch: java.lang.Throwable -> Lb7
            lh.d r5 = r5.p()     // Catch: java.lang.Throwable -> Lb7
            java.lang.reflect.Method r5 = r5.b(r2)     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r5 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> Lcc
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lcc
            r5 = r6
        Lbe:
            boolean r6 = r5 instanceof sf.f     // Catch: java.lang.Throwable -> Lcc
            if (r6 == 0) goto Lc4
            r5 = 0
        Lc4:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L9f
            r4.add(r5)     // Catch: java.lang.Throwable -> Lcc
            goto L9f
        Lcc:
            r9 = move-exception
            goto L117
        Lce:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc
            r9.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> Lcc
        Ld7:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lcc
            if (r4 == 0) goto Lee
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lcc
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Lcc
            boolean r5 = W(r5)     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto Ld7
            r9.add(r4)     // Catch: java.lang.Throwable -> Lcc
            goto Ld7
        Lee:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc
            r4.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lcc
        Lfc:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L11c
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> Lcc
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = r6.toGenericString()     // Catch: java.lang.Throwable -> Lcc
            boolean r6 = r2.add(r6)     // Catch: java.lang.Throwable -> Lcc
            if (r6 == 0) goto Lfc
            r4.add(r5)     // Catch: java.lang.Throwable -> Lcc
            goto Lfc
        L117:
            sf.f r4 = new sf.f
            r4.<init>(r9)
        L11c:
            java.lang.Throwable r9 = sf.g.b(r4)
            if (r9 == 0) goto L127
            java.lang.String r2 = "定位单消息菜单创建方法失败"
            r10.invoke(r2, r9)
        L127:
            boolean r9 = r4 instanceof sf.f
            if (r9 == 0) goto L12d
            tf.t r4 = tf.t.f13167g
        L12d:
            java.util.List r4 = (java.util.List) r4
            B0(r1, r0, r3, r4)
            return r4
    }

    public static short l(int r1, int r2, int r3, int r4) {
            r0 = r1 & 15
            if (r0 != r1) goto L30
            r0 = r2 & 15
            if (r0 != r2) goto L29
            r0 = r3 & 15
            if (r0 != r3) goto L22
            r0 = r4 & 15
            if (r0 != r4) goto L1b
            int r2 = r2 << 4
            r1 = r1 | r2
            int r2 = r3 << 8
            r1 = r1 | r2
            int r2 = r4 << 12
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        L1b:
            java.lang.String r1 = "n3 out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
        L22:
            java.lang.String r1 = "n2 out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
        L29:
            java.lang.String r1 = "n1 out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
        L30:
            java.lang.String r1 = "n0 out of range 0..15"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static wf.g l0(wf.e r1, wf.f r2) {
            r2.getClass()
            wf.f r0 = r1.getKey()
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto Lf
            wf.h r1 = wf.h.f20786g
        Lf:
            return r1
    }

    public static java.lang.String m0(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "="
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L49
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lf
            goto L49
        Lf:
            if (r4 == 0) goto L49
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 63
            r1 = 6
            r2 = 0
            int r0 = og.m.q0(r4, r0, r2, r1)     // Catch: java.lang.Throwable -> L49
            if (r0 < 0) goto L22
            int r0 = r0 + 1
            goto L23
        L22:
            r0 = r2
        L23:
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L49
            if (r0 >= r1) goto L49
            r1 = 38
            r3 = 4
            int r1 = og.m.q0(r4, r1, r0, r3)     // Catch: java.lang.Throwable -> L49
            if (r1 >= 0) goto L36
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L49
        L36:
            boolean r3 = og.t.c0(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L46
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + r5
            java.lang.String r4 = r4.substring(r0, r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L46:
            int r0 = r1 + 1
            goto L23
        L49:
            java.lang.String r4 = ""
            return r4
    }

    public static void n(ud.r r8) {
            java.util.List r8 = r8.f13732z
            java.util.Iterator r0 = r8.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            r2 = 0
            r1.f13680r = r2
            goto L6
        L16:
            int r0 = r8.size()
            java.util.Iterator r1 = r8.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.List r3 = r2.f13675m
            int r4 = r3.size()
            r5 = 2
            if (r4 < r5) goto L1e
            ud.a r4 = r2.f13681s
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r3.next()
            ud.a r5 = (ud.a) r5
        L45:
            if (r5 == r4) goto L39
            java.util.BitSet r6 = r5.f13680r
            if (r6 != 0) goto L52
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>(r0)
            r5.f13680r = r6
        L52:
            int r7 = r2.f13672j
            r6.set(r7)
            ud.a r5 = r5.f13681s
            goto L45
        L5a:
            java.util.Iterator r8 = r8.iterator()
        L5e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r8.next()
            ud.a r0 = (ud.a) r0
            java.util.BitSet r1 = r0.f13680r
            if (r1 == 0) goto L74
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5e
        L74:
            xe.g r1 = xe.g.f21560g
            r0.f13680r = r1
            goto L5e
        L79:
            return
    }

    public static boolean n0(ud.j r3) {
            if (r3 != 0) goto L3
            goto L4f
        L3:
            boolean r0 = r3 instanceof ud.h
            r1 = 1
            if (r0 == 0) goto L29
            ud.h r3 = (ud.h) r3
            java.util.List r3 = r3.g()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            ud.p r0 = (ud.p) r0
            md.a r2 = md.a.f8838s
            md.f r0 = r0.f8877g
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L12
            goto L4e
        L29:
            boolean r0 = r3 instanceof zd.c
            if (r0 == 0) goto L2e
            return r1
        L2e:
            boolean r0 = r3 instanceof ud.n
            if (r0 == 0) goto L51
            ud.n r3 = (ud.n) r3
            java.util.List r3 = r3.u()
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = n0(r0)
            if (r0 == 0) goto L3c
        L4e:
            return r1
        L4f:
            r3 = 0
            return r3
        L51:
            java.lang.String r3 = M0(r3)
            ah.a.k(r3)
            r3 = 0
            return r3
    }

    public static f.k0 o() {
            long[] r0 = f.r0.f2895a
            f.k0 r0 = new f.k0
            r0.<init>()
            return r0
    }

    public static java.lang.String o0(int r1) {
            switch(r1) {
                case 1: goto Lb9;
                case 2: goto Lb6;
                case 3: goto Lb3;
                case 4: goto Lb0;
                case 5: goto Lad;
                case 6: goto Laa;
                case 7: goto La7;
                case 8: goto La4;
                case 9: goto La1;
                case 10: goto L9e;
                case 11: goto L9b;
                case 12: goto L98;
                case 13: goto L95;
                case 14: goto L92;
                case 15: goto L8f;
                case 16: goto L8c;
                case 17: goto L89;
                case 18: goto L86;
                case 19: goto L83;
                case 20: goto L80;
                case 21: goto L7d;
                case 22: goto L7a;
                case 23: goto L77;
                case 24: goto L74;
                case 25: goto L71;
                case 26: goto L6e;
                case 27: goto L6b;
                case 28: goto L68;
                case 29: goto L65;
                case 30: goto L62;
                case 31: goto L5f;
                case 32: goto L5c;
                case 33: goto L59;
                case 34: goto L56;
                case 35: goto L53;
                case 36: goto L50;
                case 37: goto L4d;
                case 38: goto L4a;
                case 39: goto L47;
                case 40: goto L44;
                case 41: goto L41;
                case 42: goto L3e;
                case 43: goto L3b;
                case 44: goto L38;
                case 45: goto L35;
                case 46: goto L32;
                case 47: goto L2f;
                case 48: goto L2c;
                case 49: goto L29;
                case 50: goto L26;
                case 51: goto L23;
                case 52: goto L20;
                case 53: goto L1d;
                case 54: goto L3;
                case 55: goto L1a;
                case 56: goto L17;
                case 57: goto L14;
                case 58: goto L11;
                case 59: goto Le;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = a.a.W0(r1)
            java.lang.String r0 = "unknown-"
            java.lang.String r1 = r0.concat(r1)
            return r1
        Le:
            java.lang.String r1 = "invoke-custom"
            return r1
        L11:
            java.lang.String r1 = "invoke-polymorphic"
            return r1
        L14:
            java.lang.String r1 = "fill-array-data"
            return r1
        L17:
            java.lang.String r1 = "move-result-pseudo"
            return r1
        L1a:
            java.lang.String r1 = "move-result"
            return r1
        L1d:
            java.lang.String r1 = "invoke-interface"
            return r1
        L20:
            java.lang.String r1 = "invoke-direct"
            return r1
        L23:
            java.lang.String r1 = "invoke-super"
            return r1
        L26:
            java.lang.String r1 = "invoke-virtual"
            return r1
        L29:
            java.lang.String r1 = "invoke-static"
            return r1
        L2c:
            java.lang.String r1 = "put-static"
            return r1
        L2f:
            java.lang.String r1 = "put-field"
            return r1
        L32:
            java.lang.String r1 = "get-static"
            return r1
        L35:
            java.lang.String r1 = "get-field"
            return r1
        L38:
            java.lang.String r1 = "instance-of"
            return r1
        L3b:
            java.lang.String r1 = "check-cast"
            return r1
        L3e:
            java.lang.String r1 = "filled-new-array"
            return r1
        L41:
            java.lang.String r1 = "new-array"
            return r1
        L44:
            java.lang.String r1 = "new-instance"
            return r1
        L47:
            java.lang.String r1 = "aput"
            return r1
        L4a:
            java.lang.String r1 = "aget"
            return r1
        L4d:
            java.lang.String r1 = "monitor-exit"
            return r1
        L50:
            java.lang.String r1 = "monitor-enter"
            return r1
        L53:
            java.lang.String r1 = "throw"
            return r1
        L56:
            java.lang.String r1 = "array-length"
            return r1
        L59:
            java.lang.String r1 = "return"
            return r1
        L5c:
            java.lang.String r1 = "to-short"
            return r1
        L5f:
            java.lang.String r1 = "to-char"
            return r1
        L62:
            java.lang.String r1 = "to-byte"
            return r1
        L65:
            java.lang.String r1 = "conv"
            return r1
        L68:
            java.lang.String r1 = "cmpg"
            return r1
        L6b:
            java.lang.String r1 = "cmpl"
            return r1
        L6e:
            java.lang.String r1 = "not"
            return r1
        L71:
            java.lang.String r1 = "ushr"
            return r1
        L74:
            java.lang.String r1 = "shr"
            return r1
        L77:
            java.lang.String r1 = "shl"
            return r1
        L7a:
            java.lang.String r1 = "xor"
            return r1
        L7d:
            java.lang.String r1 = "or"
            return r1
        L80:
            java.lang.String r1 = "and"
            return r1
        L83:
            java.lang.String r1 = "neg"
            return r1
        L86:
            java.lang.String r1 = "rem"
            return r1
        L89:
            java.lang.String r1 = "div"
            return r1
        L8c:
            java.lang.String r1 = "mul"
            return r1
        L8f:
            java.lang.String r1 = "sub"
            return r1
        L92:
            java.lang.String r1 = "add"
            return r1
        L95:
            java.lang.String r1 = "switch"
            return r1
        L98:
            java.lang.String r1 = "if-gt"
            return r1
        L9b:
            java.lang.String r1 = "if-le"
            return r1
        L9e:
            java.lang.String r1 = "if-ge"
            return r1
        La1:
            java.lang.String r1 = "if-lt"
            return r1
        La4:
            java.lang.String r1 = "if-ne"
            return r1
        La7:
            java.lang.String r1 = "if-eq"
            return r1
        Laa:
            java.lang.String r1 = "goto"
            return r1
        Lad:
            java.lang.String r1 = "const"
            return r1
        Lb0:
            java.lang.String r1 = "move-exception"
            return r1
        Lb3:
            java.lang.String r1 = "move-param"
            return r1
        Lb6:
            java.lang.String r1 = "move"
            return r1
        Lb9:
            java.lang.String r1 = "nop"
            return r1
    }

    public static void p(ac.o r2, java.nio.MappedByteBuffer r3, java.nio.MappedByteBuffer r4, int r5) {
            int r0 = r3.capacity()
            int r1 = r4.capacity()
            if (r0 == r1) goto L39
            java.nio.MappedByteBuffer r0 = r2.f211u
            if (r4 != r0) goto L11
            java.nio.channels.FileChannel r0 = r2.f209s
            goto L13
        L11:
            java.nio.channels.FileChannel r0 = r2.f208r
        L13:
            int r1 = r3.capacity()
            java.nio.MappedByteBuffer r0 = v0(r0, r1)
            if (r0 != 0) goto L2f
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "map failed"
            r3.<init>(r4)
            java.lang.String r4 = "FastKV"
            java.lang.String r5 = r2.f192b
            android.util.Log.e(r4, r5, r3)
            J0(r2)
            return
        L2f:
            java.nio.MappedByteBuffer r1 = r2.f211u
            if (r4 != r1) goto L36
            r2.f211u = r0
            goto L38
        L36:
            r2.f210t = r0
        L38:
            r4 = r0
        L39:
            r3.rewind()
            r4.rewind()
            r3.limit(r5)
            r4.put(r3)
            int r2 = r3.capacity()
            r3.limit(r2)
            return
    }

    public static short p0(p4.h r1, int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L18
            p4.j r1 = r1.f10114b
            int r1 = r1.f10118a
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L11
            int r2 = r2 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        L11:
            java.lang.String r1 = "opcode out of range 0..255"
            j8.o.t(r1)
            r1 = 0
            return r1
        L18:
            java.lang.String r1 = "arg out of range 0..255"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static final sf.f q(java.lang.Throwable r1) {
            r1.getClass()
            sf.f r0 = new sf.f
            r0.<init>(r1)
            return r0
    }

    public static wf.g q0(wf.e r2, wf.g r3) {
            r3.getClass()
            wf.h r0 = wf.h.f20786g
            if (r3 != r0) goto L8
            return r2
        L8:
            wb.m0 r0 = new wb.m0
            r1 = 10
            r0.<init>(r1)
            java.lang.Object r2 = r3.k(r0, r2)
            wf.g r2 = (wf.g) r2
            return r2
    }

    public static void r(ac.o r4) {
            java.lang.String r0 = r4.f192b
            java.lang.String r4 = r4.f191a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r2.<init>()     // Catch: java.lang.Exception -> L37
            r2.append(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = ".kvc"
            r2.append(r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L37
            ig.a.n(r1)     // Catch: java.lang.Exception -> L37
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r2.<init>()     // Catch: java.lang.Exception -> L37
            r2.append(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = ".tmp"
            r2.append(r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L37
            ig.a.n(r1)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r4 = move-exception
            java.lang.String r1 = "FastKV"
            android.util.Log.e(r1, r0, r4)
            return
    }

    public static void r0(ac.o r19, long r20, long r22) {
            r0 = r19
            java.nio.MappedByteBuffer r1 = r0.f210t
            java.lang.String r2 = r0.f192b
            int r1 = r1.getInt()
            r3 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r4 = r1 & r3
            r5 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r5
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L18
            r1 = r6
            goto L19
        L18:
            r1 = r7
        L19:
            java.nio.MappedByteBuffer r8 = r0.f210t
            long r8 = r8.getLong()
            java.nio.MappedByteBuffer r10 = r0.f211u
            int r10 = r10.getInt()
            r3 = r3 & r10
            r5 = r5 & r10
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r6 = r7
        L2b:
            java.nio.MappedByteBuffer r5 = r0.f211u
            long r10 = r5.getLong()
            java.lang.String r5 = "FastKV"
            r14 = 12
            if (r4 < 0) goto Laa
            r15 = 12
            long r12 = (long) r4
            long r17 = r20 - r15
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 > 0) goto La7
            int r12 = r4 + 12
            r0.f194d = r12
            java.nio.MappedByteBuffer r12 = r0.f210t
            r12.rewind()
            java.nio.MappedByteBuffer r12 = r0.f210t
            ac.k r13 = r0.f198h
            java.lang.Object r13 = r13.f179j
            byte[] r13 = (byte[]) r13
            r17 = r15
            int r15 = r0.f194d
            r12.get(r13, r7, r15)
            ac.k r12 = r0.f198h
            long r12 = r12.m(r14, r4)
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto Lac
            boolean r1 = be.h.O(r0, r1)
            if (r1 == 0) goto Lac
            r0.f195e = r8
            int r1 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r1 != 0) goto L93
            int r1 = r0.f194d
            byte[] r1 = new byte[r1]
            java.nio.MappedByteBuffer r3 = r0.f211u
            r3.rewind()
            java.nio.MappedByteBuffer r3 = r0.f211u
            int r4 = r0.f194d
            r3.get(r1, r7, r4)
            ac.k r3 = r0.f198h
            java.lang.Object r3 = r3.f179j
            byte[] r3 = (byte[]) r3
        L84:
            int r4 = r0.f194d
            if (r7 >= r4) goto L92
            r4 = r3[r7]
            r6 = r1[r7]
            if (r4 == r6) goto L8f
            goto L93
        L8f:
            int r7 = r7 + 1
            goto L84
        L92:
            return
        L93:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r3 = "B file error"
            r1.<init>(r3)
            android.util.Log.w(r5, r2, r1)
            java.nio.MappedByteBuffer r1 = r0.f210t
            java.nio.MappedByteBuffer r2 = r0.f211u
            int r3 = r0.f194d
            p(r0, r1, r2, r3)
            return
        La7:
            r17 = r15
            goto Lac
        Laa:
            r17 = 12
        Lac:
            if (r3 < 0) goto L119
            long r8 = (long) r3
            long r12 = r22 - r17
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 > 0) goto L119
            java.util.HashMap r1 = r0.f196f
            r1.clear()
            r0.f204n = r7
            java.util.ArrayList r1 = r0.f205o
            r1.clear()
            int r1 = r3 + 12
            r0.f194d = r1
            ac.k r1 = r0.f198h
            java.lang.Object r1 = r1.f179j
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            java.nio.MappedByteBuffer r4 = r0.f211u
            int r4 = r4.capacity()
            if (r1 == r4) goto Le1
            ac.k r1 = new ac.k
            java.nio.MappedByteBuffer r4 = r0.f211u
            int r4 = r4.capacity()
            r1.<init>(r4)
            r0.f198h = r1
        Le1:
            java.nio.MappedByteBuffer r1 = r0.f211u
            r1.rewind()
            java.nio.MappedByteBuffer r1 = r0.f211u
            ac.k r4 = r0.f198h
            java.lang.Object r4 = r4.f179j
            byte[] r4 = (byte[]) r4
            int r8 = r0.f194d
            r1.get(r4, r7, r8)
            ac.k r1 = r0.f198h
            long r3 = r1.m(r14, r3)
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L119
            boolean r1 = be.h.O(r0, r6)
            if (r1 == 0) goto L119
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r3 = "A file error"
            r1.<init>(r3)
            android.util.Log.w(r5, r2, r1)
            java.nio.MappedByteBuffer r1 = r0.f211u
            java.nio.MappedByteBuffer r2 = r0.f210t
            int r3 = r0.f194d
            p(r0, r1, r2, r3)
            r0.f195e = r10
            return
        L119:
            java.lang.String r1 = "both files error"
            g4.a.m(r0, r1)
            i(r0)
            return
    }

    public static java.lang.String s(java.lang.String r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L69
            r1 = 0
            r2 = r1
        Ld:
            int r3 = r12.length()
            if (r2 >= r3) goto L69
            int r3 = java.lang.Character.codePointAt(r12, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\u"
            r4.<init>(r5)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r5 = "0"
            boolean r6 = r3.startsWith(r5)
            r7 = 1
            if (r6 == 0) goto L2f
            java.lang.String r3 = r3.substring(r7)
        L2f:
            int r6 = r3.length()
            r8 = 4
            if (r6 > r8) goto L51
            int r6 = r3.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r1
        L40:
            int r11 = 4 - r6
            if (r10 >= r11) goto L4a
            r9.append(r5)
            int r10 = r10 + 1
            goto L40
        L4a:
            java.lang.String r5 = r9.toString()
            r4.append(r5)
        L51:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.append(r3)
            char r3 = r12.charAt(r2)
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto L67
            int r2 = r2 + 1
        L67:
            int r2 = r2 + r7
            goto Ld
        L69:
            java.lang.String r12 = r0.toString()
            return r12
    }

    public static java.lang.String s0(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r0 = "sendid"
            java.lang.String r0 = m0(r2, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.lang.String r0 = "sendId"
            java.lang.String r2 = m0(r2, r0)
            return r2
        L1c:
            return r0
    }

    public static long t(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r6 = java.lang.Math.min(r6, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r1) goto Le
            r7 = r1
            goto L12
        Le:
            int r7 = java.lang.Math.min(r7, r0)
        L12:
            if (r7 != r1) goto L16
            r2 = r6
            goto L17
        L16:
            r2 = r7
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r5 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r5)
        L3a:
            int r4 = java.lang.Math.min(r0, r4)
            long r4 = u2.b.a(r4, r1, r6, r7)
            return r4
        L43:
            u2.b.k(r2)
            okio.a.c()
            r4 = 0
            return r4
    }

    public static java.lang.String t0(u4.p r4) {
            java.lang.Object[] r0 = r4.f22543h
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 5
            int r2 = r2 + 2
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            r2 = 0
        L12:
            if (r2 >= r0) goto L2b
            if (r2 == 0) goto L1b
            java.lang.String r3 = ", "
            r1.append(r3)
        L1b:
            java.lang.Object r3 = r4.l(r2)
            u4.o r3 = (u4.o) r3
            java.lang.String r3 = r3.m()
            r1.append(r3)
            int r2 = r2 + 1
            goto L12
        L2b:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static long u(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r4, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto Le
            r5 = r1
            goto L12
        Le:
            int r5 = java.lang.Math.min(r5, r0)
        L12:
            if (r5 != r1) goto L16
            r2 = r4
            goto L17
        L16:
            r2 = r5
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r7 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r7)
        L3a:
            int r6 = java.lang.Math.min(r0, r6)
            long r4 = u2.b.a(r4, r5, r6, r1)
            return r4
        L43:
            u2.b.k(r2)
            okio.a.c()
            r4 = 0
            return r4
    }

    public static java.lang.String u0(u4.p r6) {
            java.lang.Object[] r0 = r6.f22543h
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 30
            r1.<init>(r2)
            java.lang.String r2 = "{"
            r1.append(r2)
            if (r0 == 0) goto L51
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L44
            int r0 = r0 - r3
            java.lang.Object r0 = r6.l(r0)
            u4.o r0 = (u4.o) r0
            int r4 = r0.j()
            r5 = 2
            if (r4 != r5) goto L2a
            int r4 = r0.f13400g
            int r4 = r4 + r3
            u4.o r0 = r0.o(r4)
        L2a:
            java.lang.Object r6 = r6.l(r2)
            u4.o r6 = (u4.o) r6
            java.lang.String r6 = r6.m()
            r1.append(r6)
            java.lang.String r6 = ".."
            r1.append(r6)
            java.lang.String r6 = r0.m()
            r1.append(r6)
            goto L51
        L44:
            java.lang.Object r6 = r6.l(r2)
            u4.o r6 = (u4.o) r6
            java.lang.String r6 = r6.m()
            r1.append(r6)
        L51:
            java.lang.String r6 = "}"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static hh.i v(org.luckypray.dexkit.DexKitBridge r17, jh.d r18) {
            r0 = r18
            r17.getClass()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L18
            java.nio.ByteBuffer r3 = r0.f4332b
            int r4 = r0.f4331a
            int r1 = r1 + r4
            int r1 = r3.getInt(r1)
            r5 = r1
            goto L19
        L18:
            r5 = r2
        L19:
            r1 = 6
            int r1 = r0.b(r1)
            if (r1 == 0) goto L2b
            java.nio.ByteBuffer r3 = r0.f4332b
            int r4 = r0.f4331a
            int r1 = r1 + r4
            int r1 = r3.getInt(r1)
            r6 = r1
            goto L2c
        L2b:
            r6 = r2
        L2c:
            r1 = 8
            int r1 = r0.b(r1)
            r3 = 0
            if (r1 == 0) goto L3d
            int r4 = r0.f4331a
            int r1 = r1 + r4
            java.lang.String r1 = r0.d(r1)
            goto L3e
        L3d:
            r1 = r3
        L3e:
            java.lang.String r4 = ""
            if (r1 != 0) goto L44
            r7 = r4
            goto L45
        L44:
            r7 = r1
        L45:
            r1 = 10
            int r1 = r0.b(r1)
            if (r1 == 0) goto L58
            java.nio.ByteBuffer r8 = r0.f4332b
            int r9 = r0.f4331a
            int r1 = r1 + r9
            int r1 = r8.getInt(r1)
            r8 = r1
            goto L59
        L58:
            r8 = r2
        L59:
            r1 = 12
            int r1 = r0.b(r1)
            if (r1 == 0) goto L69
            int r9 = r0.f4331a
            int r1 = r1 + r9
            java.lang.String r1 = r0.d(r1)
            goto L6a
        L69:
            r1 = r3
        L6a:
            if (r1 != 0) goto L6e
            r9 = r4
            goto L6f
        L6e:
            r9 = r1
        L6f:
            r1 = 14
            int r1 = r0.b(r1)
            if (r1 == 0) goto L81
            java.nio.ByteBuffer r4 = r0.f4332b
            int r10 = r0.f4331a
            int r1 = r1 + r10
            int r1 = r4.getInt(r1)
            goto L82
        L81:
            r1 = r2
        L82:
            r4 = -1
            if (r1 != r4) goto L87
        L85:
            r10 = r3
            goto L8c
        L87:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L85
        L8c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 16
            int r3 = r0.b(r1)
            if (r3 == 0) goto L9e
            int r3 = r0.f(r3)
            goto L9f
        L9e:
            r3 = r2
        L9f:
            r4 = r2
        La0:
            if (r4 >= r3) goto Lc1
            int r12 = r0.b(r1)
            if (r12 == 0) goto Lb6
            java.nio.ByteBuffer r13 = r0.f4332b
            int r12 = r0.e(r12)
            int r14 = r4 * 4
            int r14 = r14 + r12
            int r12 = r13.getInt(r14)
            goto Lb7
        Lb6:
            r12 = r2
        Lb7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            int r4 = r4 + 1
            goto La0
        Lc1:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r1 = 18
            int r3 = r0.b(r1)
            if (r3 == 0) goto Ld3
            int r3 = r0.f(r3)
            goto Ld4
        Ld3:
            r3 = r2
        Ld4:
            r4 = r2
        Ld5:
            if (r4 >= r3) goto Lf6
            int r13 = r0.b(r1)
            if (r13 == 0) goto Leb
            java.nio.ByteBuffer r14 = r0.f4332b
            int r13 = r0.e(r13)
            int r15 = r4 * 4
            int r15 = r15 + r13
            int r13 = r14.getInt(r15)
            goto Lec
        Leb:
            r13 = r2
        Lec:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            int r4 = r4 + 1
            goto Ld5
        Lf6:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r1 = 20
            int r3 = r0.b(r1)
            if (r3 == 0) goto L108
            int r3 = r0.f(r3)
            goto L109
        L108:
            r3 = r2
        L109:
            r4 = r2
        L10a:
            if (r4 >= r3) goto L12c
            int r14 = r0.b(r1)
            if (r14 == 0) goto L121
            java.nio.ByteBuffer r15 = r0.f4332b
            int r14 = r0.e(r14)
            int r16 = r4 * 4
            int r14 = r16 + r14
            int r14 = r15.getInt(r14)
            goto L122
        L121:
            r14 = r2
        L122:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            int r4 = r4 + 1
            goto L10a
        L12c:
            hh.i r3 = new hh.i
            r4 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
    }

    public static java.nio.MappedByteBuffer v0(java.nio.channels.FileChannel r6, int r7) {
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.io.IOException -> L10
            r2 = 0
            long r4 = (long) r7     // Catch: java.io.IOException -> L10
            r0 = r6
            java.nio.MappedByteBuffer r6 = r0.map(r1, r2, r4)     // Catch: java.io.IOException -> L10
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L10
            r6.order(r7)     // Catch: java.io.IOException -> L10
            return r6
        L10:
            r6 = 0
            return r6
    }

    public static wf.e w(wf.e r1, wf.f r2) {
            r2.getClass()
            wf.f r0 = r1.getKey()
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static final boolean w0(f.k0 r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.Object r0 = r3.g(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof f.l0
            if (r2 == 0) goto L1e
            f.l0 r0 = (f.l0) r0
            boolean r5 = r0.l(r5)
            if (r5 == 0) goto L1d
            boolean r0 = r0.g()
            if (r0 == 0) goto L1d
            r3.k(r4)
        L1d:
            return r5
        L1e:
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L29
            r3.k(r4)
            r3 = 1
            return r3
        L29:
            return r1
    }

    public static final void x0(f.k0 r13, java.lang.Object r14) {
            long[] r0 = r13.f2848a
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
            r2 = 0
            r3 = r2
        L9:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L23:
            if (r8 >= r6) goto L55
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L51
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Object[] r10 = r13.f2849b
            r10 = r10[r9]
            java.lang.Object[] r10 = r13.f2850c
            r10 = r10[r9]
            boolean r11 = r10 instanceof f.l0
            if (r11 == 0) goto L47
            f.l0 r10 = (f.l0) r10
            r10.l(r14)
            boolean r10 = r10.g()
            goto L4c
        L47:
            if (r10 != r14) goto L4b
            r10 = 1
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L51
            r13.l(r9)
        L51:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L23
        L55:
            if (r6 != r7) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto L9
        L5c:
            return
    }

    public static void y(ud.j r1, java.util.HashSet r2) {
            boolean r0 = r1 instanceof ud.h
            if (r0 == 0) goto La
            ud.h r1 = (ud.h) r1
            r2.add(r1)
            return
        La:
            boolean r0 = r1 instanceof ud.n
            if (r0 == 0) goto L29
            ud.n r1 = (ud.n) r1
            java.util.List r1 = r1.u()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.next()
            ud.j r0 = (ud.j) r0
            y(r0, r2)
            goto L18
        L28:
            return
        L29:
            java.lang.String r1 = M0(r1)
            ah.a.k(r1)
            return
    }

    public static void y0(ac.o r4, java.nio.MappedByteBuffer r5) {
            int r0 = r5.capacity()
            int r1 = ac.o.A
            if (r0 == r1) goto L2e
            java.nio.MappedByteBuffer r0 = r4.f210t
            if (r5 != r0) goto Lf
            java.nio.channels.FileChannel r0 = r4.f208r
            goto L11
        Lf:
            java.nio.channels.FileChannel r0 = r4.f209s
        L11:
            long r2 = (long) r1
            r0.truncate(r2)     // Catch: java.io.IOException -> L1a
            java.nio.MappedByteBuffer r0 = v0(r0, r1)     // Catch: java.io.IOException -> L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L28
            java.nio.MappedByteBuffer r1 = r4.f210t
            if (r5 != r1) goto L24
            r4.f210t = r0
            goto L26
        L24:
            r4.f211u = r0
        L26:
            r5 = r0
            goto L2e
        L28:
            java.lang.String r4 = "Failed to truncate and remap buffer"
            j8.o.y(r4)
            return
        L2e:
            r4 = 0
            r5.putInt(r4, r4)
            r4 = 4
            r0 = 0
            r5.putLong(r4, r0)
            return
    }

    public static ud.j z(ud.h r2, ud.j r3) {
            boolean r0 = r3 instanceof ud.h
            if (r0 == 0) goto L7
            if (r3 != r2) goto L2d
            return r3
        L7:
            boolean r0 = r3 instanceof ud.n
            if (r0 == 0) goto L2f
            ud.n r3 = (ud.n) r3
            java.util.List r0 = r3.u()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            ud.j r1 = (ud.j) r1
            ud.j r1 = z(r2, r1)
            if (r1 == 0) goto L15
            boolean r2 = r1 instanceof ud.h
            if (r2 == 0) goto L2c
            return r3
        L2c:
            return r1
        L2d:
            r2 = 0
            return r2
        L2f:
            java.lang.String r2 = M0(r3)
            ah.a.k(r2)
            r2 = 0
            return r2
    }

    public static void z0(ac.o r6) {
            r0 = 12
            r6.f194d = r0
            r0 = 0
            r6.f195e = r0
            java.util.HashMap r2 = r6.f196f
            r2.clear()
            r2 = 0
            r6.f204n = r2
            java.util.ArrayList r3 = r6.f205o
            r3.clear()
            ac.k r3 = r6.f198h
            if (r3 == 0) goto L28
            java.lang.Object r4 = r3.f179j
            byte[] r4 = (byte[]) r4
            int r4 = r4.length
            int r5 = ac.o.A
            if (r4 == r5) goto L23
            goto L28
        L23:
            r4 = 4
            r3.F(r4, r0)
            goto L31
        L28:
            ac.k r0 = new ac.k
            int r1 = ac.o.A
            r0.<init>(r1)
            r6.f198h = r0
        L31:
            ac.k r6 = r6.f198h
            r6.E(r2, r2)
            return
    }

    public abstract java.lang.reflect.Constructor A(java.lang.Class r1);

    public abstract java.lang.String[] I(java.lang.Class r1);

    public abstract java.lang.String P(p4.l r1);

    public abstract java.lang.String Q(p4.l r1);

    public abstract void R0(z4.d r1, p4.l r2);

    public abstract boolean S(p4.h r1);

    public abstract boolean X(java.lang.Class r1);

    public boolean f(p4.b0 r1) {
            r0 = this;
            boolean r1 = r0 instanceof q4.b
            return r1
    }

    public abstract int j();

    public java.util.BitSet m(p4.h r1) {
            r0 = this;
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            return r1
    }

    public abstract java.lang.reflect.Method x(java.lang.Class r1, java.lang.reflect.Field r2);
}
