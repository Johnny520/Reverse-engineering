package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m.i2 f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.k1 f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m.p f8307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m.p1 f8308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r1.d f8310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m.h2 f8311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m.c2 f8312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m.u1 f8315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m.m2 f8316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0.d0 f8317m;

    public o2(m.i2 r1, k.k1 r2, m.p r3, m.p1 r4, boolean r5, r1.d r6, m.h2 r7, m.c2 r8) {
            r0 = this;
            r0.<init>()
            r0.f8305a = r1
            r0.f8306b = r2
            r0.f8307c = r3
            r0.f8308d = r4
            r0.f8309e = r5
            r0.f8310f = r6
            r0.f8311g = r7
            r0.f8312h = r8
            r1 = 1
            r0.f8314j = r1
            m.x1 r1 = m.a2.f8074b
            r0.f8315k = r1
            m.m2 r1 = new m.m2
            r1.<init>(r0)
            r0.f8316l = r1
            b0.d0 r1 = new b0.d0
            r2 = 27
            r1.<init>(r0, r2)
            r0.f8317m = r1
            return
    }

    public final java.lang.Object a(long r11, yf.c r13) {
            r10 = this;
            boolean r0 = r13 instanceof m.j2
            if (r0 == 0) goto L13
            r0 = r13
            m.j2 r0 = (m.j2) r0
            int r1 = r0.f8232j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8232j = r1
            goto L18
        L13:
            m.j2 r0 = new m.j2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f8230h
            int r1 = r0.f8232j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            gg.t r11 = r0.f8229g
            f8.i.I0(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L34:
            f8.i.I0(r13)
            gg.t r6 = new gg.t
            r6.<init>()
            r6.f4563g = r11
            r10.f8313i = r3
            k.d1 r13 = k.d1.f6939g     // Catch: java.lang.Throwable -> L65
            m.l2 r4 = new m.l2     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.f8229g = r6     // Catch: java.lang.Throwable -> L62
            r0.f8232j = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r11 = r10.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            xf.a r12 = xf.a.f21579g
            if (r11 != r12) goto L57
            return r12
        L57:
            r11 = r6
        L58:
            r5.f8313i = r2
            long r11 = r11.f4563g
            u2.q r13 = new u2.q
            r13.<init>(r11)
            return r13
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.f8313i = r2
            throw r11
    }

    public final java.lang.Object b(long r5, boolean r7, yf.i r8) {
            r4 = this;
            sf.n r0 = sf.n.f12433a
            if (r7 == 0) goto Ld
            m.p r7 = r4.f8307c
            i2.z r1 = m.a2.f8073a
            boolean r7 = r7 instanceof m.p
            if (r7 == 0) goto Ld
            goto L4d
        Ld:
            m.p1 r7 = r4.f8308d
            m.p1 r1 = m.p1.f8325h
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = u2.q.a(r2, r2, r7, r5)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            m.n2 r7 = new m.n2
            r1 = 0
            r7.<init>(r4, r1)
            k.k1 r1 = r4.f8306b
            xf.a r2 = xf.a.f21579g
            if (r1 == 0) goto L3f
            m.i2 r3 = r4.f8305a
            boolean r3 = r3.d()
            if (r3 != 0) goto L38
            m.i2 r3 = r4.f8305a
            boolean r3 = r3.c()
            if (r3 == 0) goto L3f
        L38:
            java.lang.Object r5 = r1.a(r5, r7, r8)
            if (r5 != r2) goto L4d
            return r5
        L3f:
            m.n2 r7 = new m.n2
            r7.<init>(r4, r8)
            r7.f8286j = r5
            java.lang.Object r5 = r7.invokeSuspend(r0)
            if (r5 != r2) goto L4d
            return r5
        L4d:
            return r0
    }

    public final long c(m.u1 r12, long r13, int r15) {
            r11 = this;
            r1.d r0 = r11.f8310f
            long r0 = r0.d(r15, r13)
            long r13 = e1.b.d(r13, r0)
            m.p1 r2 = r11.f8308d
            m.p1 r3 = m.p1.f8325h
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L17
            long r2 = e1.b.a(r13, r5, r4)
            goto L1c
        L17:
            r2 = 2
            long r2 = e1.b.a(r13, r5, r2)
        L1c:
            long r2 = r11.e(r2)
            float r2 = r11.g(r2)
            float r12 = r12.a(r2)
            long r2 = r11.h(r12)
            long r6 = r11.e(r2)
            m.h2 r12 = r11.f8311g
            boolean r2 = r12.f21832t
            if (r2 != 0) goto L37
            goto L5c
        L37:
            x1.r1 r12 = x1.k.x(r12)
            y1.t r12 = (y1.t) r12
            android.view.ViewTreeObserver r12 = r12.getViewTreeObserver()
            java.lang.reflect.Method r2 = y1.t.Y0     // Catch: java.lang.Exception -> L5c
            r3 = 0
            if (r2 != 0) goto L55
            java.lang.Class r2 = r12.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r5 = "dispatchOnScrollChanged"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch: java.lang.Exception -> L5c
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L5c
            y1.t.Y0 = r2     // Catch: java.lang.Exception -> L5c
        L55:
            java.lang.reflect.Method r2 = y1.t.Y0     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L5c
            r2.invoke(r12, r3)     // Catch: java.lang.Exception -> L5c
        L5c:
            long r8 = e1.b.d(r13, r6)
            r1.d r5 = r11.f8310f
            r10 = r15
            long r12 = r5.b(r6, r8, r10)
            long r14 = e1.b.e(r0, r6)
            long r12 = e1.b.e(r14, r12)
            return r12
    }

    public final float d(float r2) {
            r1 = this;
            boolean r0 = r1.f8309e
            if (r0 == 0) goto L7
            r0 = -1
            float r0 = (float) r0
            float r2 = r2 * r0
        L7:
            return r2
    }

    public final long e(long r2) {
            r1 = this;
            boolean r0 = r1.f8309e
            if (r0 == 0) goto La
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r2 = e1.b.f(r2, r0)
        La:
            return r2
    }

    public final java.lang.Object f(k.d1 r5, fg.p r6, yf.c r7) {
            r4 = this;
            m.i2 r0 = r4.f8305a
            c0.m r1 = new c0.m
            r2 = 0
            r3 = 14
            r1.<init>(r4, r6, r2, r3)
            java.lang.Object r5 = r0.b(r5, r1, r7)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L13
            return r5
        L13:
            sf.n r5 = sf.n.f12433a
            return r5
    }

    public final float g(long r3) {
            r2 = this;
            m.p1 r0 = r2.f8308d
            m.p1 r1 = m.p1.f8325h
            if (r0 != r1) goto Lf
            r0 = 32
            long r3 = r3 >> r0
        L9:
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            return r3
        Lf:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            goto L9
    }

    public final long h(float r9) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            m.p1 r1 = r8.f8308d
            m.p1 r2 = m.p1.f8325h
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r1 != r2) goto L25
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r9
            long r0 = r1 << r5
        L21:
            long r2 = r6 & r3
            long r0 = r0 | r2
            return r0
        L25:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r6 = (long) r9
            long r0 = r0 << r5
            goto L21
    }

    public final float i(long r6) {
            r5 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Math.abs(r1)
            r2 = 32
            long r6 = r6 >> r2
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r7 = java.lang.Math.abs(r7)
            double r1 = (double) r1
            double r3 = (double) r7
            double r1 = java.lang.Math.atan2(r1, r3)
            float r7 = (float) r1
            double r1 = (double) r7
            r3 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            m.p1 r1 = r5.f8308d
            r2 = 0
            if (r7 < 0) goto L39
            m.p1 r6 = m.p1.f8324g
            if (r1 != r6) goto L38
            float r6 = java.lang.Float.intBitsToFloat(r0)
            return r6
        L38:
            return r2
        L39:
            m.p1 r7 = m.p1.f8325h
            if (r1 != r7) goto L42
            float r6 = java.lang.Float.intBitsToFloat(r6)
            return r6
        L42:
            return r2
    }
}
