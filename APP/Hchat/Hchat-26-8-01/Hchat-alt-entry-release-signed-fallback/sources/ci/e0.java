package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x1.j implements x1.h, x1.v, r1.a {
    public qg.e1 A;
    public final float B;
    public float C;
    public float D;
    public float E;
    public u2.c F;
    public y1.o2 G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r1.d f1697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ci.p0 f1698z;

    public e0() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1695w = r0
            r1.f1696x = r0
            r1.d r0 = new r1.d
            r0.<init>()
            r1.f1697y = r0
            ci.p0 r0 = new ci.p0
            r0.<init>()
            r1.f1698z = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.B = r0
            return
    }

    @Override // r1.a
    public final java.lang.Object M(long r8, wf.c r10) {
            r7 = this;
            boolean r0 = r10 instanceof ci.d0
            if (r0 == 0) goto L13
            r0 = r10
            ci.d0 r0 = (ci.d0) r0
            int r1 = r0.f1688j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1688j = r1
            goto L1a
        L13:
            ci.d0 r0 = new ci.d0
            yf.c r10 = (yf.c) r10
            r0.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r0.f1686h
            int r1 = r0.f1688j
            float r2 = r7.B
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            long r8 = r0.f1685g
            f8.i.I0(r10)
            goto L88
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L35:
            f8.i.I0(r10)
            return r10
        L39:
            f8.i.I0(r10)
            boolean r10 = r7.f21832t
            r5 = 0
            if (r10 != 0) goto L48
            u2.q r8 = new u2.q
            r8.<init>(r5)
            return r8
        L48:
            float r10 = r7.C
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L53
            goto L54
        L53:
            r4 = 0
        L54:
            ci.z r10 = r7.o1()
            boolean r10 = r10.a()
            if (r10 == r4) goto L65
            ci.z r10 = r7.o1()
            r10.b(r4)
        L65:
            i0.u r10 = sh.h0.f12595a
            java.lang.Object r10 = x1.k.h(r7, r10)
            if (r10 != 0) goto L105
            qg.e1 r10 = r7.A
            if (r10 == 0) goto L75
            r1 = 0
            r10.a(r1)
        L75:
            boolean r10 = r7.f1696x
            if (r10 == 0) goto L8c
            r0.f1685g = r8
            r0.f1688j = r3
            r1.d r10 = r7.f1697y
            java.lang.Object r10 = r10.c(r8, r0)
            xf.a r0 = xf.a.f21579g
            if (r10 != r0) goto L88
            return r0
        L88:
            u2.q r10 = (u2.q) r10
            long r5 = r10.f13362a
        L8c:
            long r8 = u2.q.d(r8, r5)
            boolean r10 = r7.f1695w
            if (r10 == 0) goto L99
            float r10 = u2.q.c(r8)
            goto L9d
        L99:
            float r10 = u2.q.b(r8)
        L9d:
            float r0 = r7.C
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lff
            float r0 = java.lang.Math.signum(r10)
            float r1 = r7.C
            float r1 = java.lang.Math.signum(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Ld8
            r7.r1(r10)
            boolean r10 = r7.f1695w
            if (r10 == 0) goto Lc6
            float r8 = u2.q.c(r8)
            long r8 = a.a.d(r1, r8)
            goto Lce
        Lc6:
            float r8 = u2.q.b(r8)
            long r8 = a.a.d(r8, r1)
        Lce:
            long r8 = u2.q.e(r5, r8)
            u2.q r10 = new u2.q
            r10.<init>(r8)
            return r10
        Ld8:
            r7.r1(r10)
            boolean r10 = r7.f1695w
            r0 = 1074301051(0x4008887b, float:2.13333)
            if (r10 == 0) goto Lec
            float r8 = u2.q.c(r8)
            float r8 = r8 / r0
            long r8 = a.a.d(r1, r8)
            goto Lf5
        Lec:
            float r8 = u2.q.b(r8)
            float r8 = r8 / r0
            long r8 = a.a.d(r8, r1)
        Lf5:
            long r8 = u2.q.e(r5, r8)
            u2.q r10 = new u2.q
            r10.<init>(r8)
            return r10
        Lff:
            u2.q r8 = new u2.q
            r8.<init>(r5)
            return r8
        L105:
            ah.a.d()
            r8 = 0
            return r8
    }

    @Override // r1.a
    public final long M0(long r10, long r12, int r14) {
            r9 = this;
            boolean r0 = r9.f21832t
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            float r0 = r9.C
            float r0 = java.lang.Math.abs(r0)
            float r3 = r9.B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = 0
        L17:
            ci.z r4 = r9.o1()
            boolean r4 = r4.a()
            if (r4 == r0) goto L28
            ci.z r4 = r9.o1()
            r4.b(r0)
        L28:
            i0.u r0 = sh.h0.f12595a
            java.lang.Object r0 = x1.k.h(r9, r0)
            if (r0 != 0) goto Lac
            if (r14 != r3) goto La2
            qg.e1 r0 = r9.A
            if (r0 == 0) goto L3a
            r3 = 0
            r0.a(r3)
        L3a:
            boolean r0 = r9.f1696x
            if (r0 == 0) goto L48
            r1.d r3 = r9.f1697y
            r4 = r10
            r6 = r12
            r8 = r14
            long r1 = r3.b(r4, r6, r8)
            goto L49
        L48:
            r6 = r12
        L49:
            long r10 = e1.b.d(r6, r1)
            boolean r12 = r9.f1695w
            r13 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r12 == 0) goto L5f
            long r10 = r10 & r3
        L59:
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            goto L61
        L5f:
            long r10 = r10 >> r13
            goto L59
        L61:
            r9.n1(r10)
            boolean r10 = r9.f1695w
            if (r10 == 0) goto L85
            long r10 = r1 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r11 = r6 & r3
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r0 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r12 = r0 << r13
            long r10 = r10 & r3
            long r10 = r10 | r12
            return r10
        L85:
            long r10 = r6 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r11 = r1 & r3
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r0 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r12 = r0 << r13
            long r10 = r10 & r3
            long r10 = r10 | r12
            return r10
        La2:
            r4 = r10
            r6 = r12
            r8 = r14
            r1.d r3 = r9.f1697y
            long r10 = r3.b(r4, r6, r8)
            return r10
        Lac:
            ah.a.d()
            r10 = 0
            return r10
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            r2.s1()
            r1.i r0 = new r1.i
            r1.d r1 = r2.f1697y
            r0.<init>(r2, r1)
            r2.k1(r0)
            return
    }

    @Override // y0.n
    public final void d1() {
            r0 = this;
            r0.p1()
            return
    }

    @Override // r1.a
    public final long f0(int r9, long r10) {
            r8 = this;
            boolean r0 = r8.f21832t
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            float r0 = r8.C
            float r0 = java.lang.Math.abs(r0)
            float r3 = r8.B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L16
            r0 = r4
            goto L17
        L16:
            r0 = 0
        L17:
            ci.z r5 = r8.o1()
            boolean r5 = r5.a()
            if (r5 == r0) goto L28
            ci.z r5 = r8.o1()
            r5.b(r0)
        L28:
            i0.u r0 = sh.h0.f12595a
            java.lang.Object r0 = x1.k.h(r8, r0)
            if (r0 != 0) goto L130
            r1.d r0 = r8.f1697y
            if (r9 != r4) goto L12b
            qg.e1 r4 = r8.A
            if (r4 == 0) goto L3c
            r5 = 0
            r4.a(r5)
        L3c:
            boolean r4 = r8.f1696x
            if (r4 == 0) goto L44
            long r1 = r0.d(r9, r10)
        L44:
            long r4 = e1.b.d(r10, r1)
            boolean r9 = r8.f1695w
            r0 = 32
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r9 == 0) goto L5a
            long r4 = r4 & r6
        L54:
            int r9 = (int) r4
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L5c
        L5a:
            long r4 = r4 >> r0
            goto L54
        L5c:
            float r4 = r8.C
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L12a
            float r3 = java.lang.Math.signum(r9)
            float r4 = r8.D
            float r4 = java.lang.Math.signum(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L76
            goto L12a
        L76:
            float r3 = java.lang.Math.signum(r9)
            float r4 = r8.D
            float r4 = java.lang.Math.signum(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto Lc3
            r8.n1(r9)
            boolean r9 = r8.f1695w
            if (r9 == 0) goto La6
            long r1 = r1 >> r0
            int r9 = (int) r1
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r10 = r10 & r6
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r0 = r1 << r0
            long r9 = r9 & r6
            long r9 = r9 | r0
            return r9
        La6:
            long r9 = r10 >> r0
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r10 = r1 & r6
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r0 = r1 << r0
            long r9 = r9 & r6
            long r9 = r9 | r0
            return r9
        Lc3:
            float r10 = r8.D
            float r10 = java.lang.Math.abs(r10)
            float r11 = java.lang.Math.abs(r9)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto Ld5
            float r10 = r8.D
            float r10 = -r10
            goto Ld6
        Ld5:
            r10 = r9
        Ld6:
            float r11 = r8.D
            float r11 = java.lang.Math.abs(r11)
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 > 0) goto Le8
            r8.p1()
            goto Leb
        Le8:
            r8.n1(r10)
        Leb:
            boolean r9 = r8.f1695w
            if (r9 == 0) goto L10c
            long r3 = r1 >> r0
            int r9 = (int) r3
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r1 = r1 & r6
            int r11 = (int) r1
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r1 = (long) r11
            long r9 = r9 << r0
            long r0 = r1 & r6
            long r9 = r9 | r0
            return r9
        L10c:
            long r3 = r1 >> r0
            int r9 = (int) r3
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 + r10
            long r10 = r1 & r6
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r0 = r1 << r0
            long r9 = r9 & r6
            long r9 = r9 | r0
            return r9
        L12a:
            return r1
        L12b:
            long r9 = r0.d(r9, r10)
            return r9
        L130:
            ah.a.d()
            r9 = 0
            return r9
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            r4.getClass()
            r2.s1()
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            c9.i r0 = new c9.i
            r1 = 8
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    @Override // r1.a
    public final java.lang.Object m0(long r8, long r10, yf.c r12) {
            r7 = this;
            boolean r0 = r12 instanceof ci.c0
            if (r0 == 0) goto L14
            r0 = r12
            ci.c0 r0 = (ci.c0) r0
            int r1 = r0.f1676j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1676j = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ci.c0 r0 = new ci.c0
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f1674h
            int r0 = r6.f1676j
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2c
            long r10 = r6.f1673g
            f8.i.I0(r12)
            goto L8c
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L33:
            f8.i.I0(r12)
            return r12
        L37:
            f8.i.I0(r12)
            boolean r12 = r7.f21832t
            r3 = 0
            if (r12 != 0) goto L46
            u2.q r8 = new u2.q
            r8.<init>(r3)
            return r8
        L46:
            float r12 = r7.C
            float r12 = java.lang.Math.abs(r12)
            float r0 = r7.B
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            ci.z r12 = r7.o1()
            boolean r12 = r12.a()
            if (r12 == r2) goto L65
            ci.z r12 = r7.o1()
            r12.b(r2)
        L65:
            i0.u r12 = sh.h0.f12595a
            java.lang.Object r12 = x1.k.h(r7, r12)
            if (r12 != 0) goto Lc2
            qg.e1 r12 = r7.A
            if (r12 == 0) goto L75
            r0 = 0
            r12.a(r0)
        L75:
            boolean r12 = r7.f1696x
            if (r12 == 0) goto L91
            r6.f1673g = r10
            r6.f1676j = r1
            r1.d r1 = r7.f1697y
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.a(r2, r4, r6)
            r8 = r4
            xf.a r10 = xf.a.f21579g
            if (r12 != r10) goto L8b
            return r10
        L8b:
            r10 = r8
        L8c:
            u2.q r12 = (u2.q) r12
            long r3 = r12.f13362a
            goto L92
        L91:
            r8 = r10
        L92:
            long r8 = u2.q.d(r10, r3)
            boolean r10 = r7.f1695w
            if (r10 == 0) goto L9f
            float r8 = u2.q.c(r8)
            goto La3
        L9f:
            float r8 = u2.q.b(r8)
        La3:
            r9 = 1069827112(0x3fc44428, float:1.53333)
            float r8 = r8 / r9
            r7.r1(r8)
            boolean r9 = r7.f1695w
            r10 = 0
            if (r9 == 0) goto Lb4
            long r8 = a.a.d(r10, r8)
            goto Lb8
        Lb4:
            long r8 = a.a.d(r8, r10)
        Lb8:
            long r8 = u2.q.e(r3, r8)
            u2.q r10 = new u2.q
            r10.<init>(r8)
            return r10
        Lc2:
            ah.a.d()
            r8 = 0
            return r8
    }

    public final void n1(float r8) {
            r7 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return
        L6:
            float r1 = r7.D
            float r1 = r1 + r8
            r7.D = r1
            float r8 = r7.E
            float r2 = -r8
            float r8 = r9.e0.q(r1, r2, r8)
            r7.D = r8
            float r8 = java.lang.Math.abs(r8)
            float r1 = r7.E
            float r8 = r8 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r1)
            float r2 = r7.E
            float r8 = java.lang.Math.min(r8, r1)
            float r8 = java.lang.Math.max(r0, r8)
            double r0 = (double) r8
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r0, r3)
            double r3 = r0 - r3
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r5)
            double r0 = r0 / r5
            double r0 = r0 + r3
            double r2 = (double) r2
            double r0 = r0 * r2
            float r8 = (float) r0
            float r0 = r7.D
            float r0 = java.lang.Math.signum(r0)
            float r0 = r0 * r8
            r7.q1(r0)
            return
    }

    public final ci.z o1() {
            r1 = this;
            i0.u r0 = ci.b0.f1669a
            java.lang.Object r0 = x1.k.h(r1, r0)
            ci.z r0 = (ci.z) r0
            return r0
    }

    public final void p1() {
            r2 = this;
            r0 = 0
            r2.q1(r0)
            r2.D = r0
            boolean r0 = r2.f21832t
            if (r0 == 0) goto L12
            ci.z r0 = r2.o1()
            r1 = 0
            r0.b(r1)
        L12:
            return
    }

    public final void q1(float r2) {
            r1 = this;
            float r0 = r1.C
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L15
        L7:
            r1.C = r2
            boolean r2 = r1.f21832t
            if (r2 == 0) goto L15
            x1.f0 r2 = x1.k.w(r1)
            r0 = 0
            r2.U(r0)
        L15:
            return
    }

    public final void r1(float r5) {
            r4 = this;
            float r0 = r4.C
            float r0 = java.lang.Math.abs(r0)
            float r1 = r4.B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L15
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r4.p1()
            return
        L15:
            qg.e1 r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L1d
            r0.a(r1)
        L1d:
            qg.t r0 = r4.Y0()
            ci.o r2 = new ci.o
            r3 = 2
            r2.<init>(r4, r5, r1, r3)
            r5 = 3
            qg.e1 r5 = qg.v.q(r0, r1, r2, r5)
            r4.A = r5
            return
    }

    public final void s1() {
            r3 = this;
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = x1.k.h(r3, r0)
            u2.c r0 = (u2.c) r0
            i0.m2 r1 = y1.h1.f21959u
            java.lang.Object r1 = x1.k.h(r3, r1)
            y1.o2 r1 = (y1.o2) r1
            u2.c r2 = r3.F
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L21
            y1.o2 r2 = r3.G
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L21
            return
        L21:
            r3.F = r0
            r3.G = r1
            boolean r2 = r3.f1695w
            if (r2 == 0) goto L38
            y1.v1 r1 = (y1.v1) r1
            long r1 = r1.a()
            float r1 = u2.h.a(r1)
            float r0 = r0.x0(r1)
            goto L46
        L38:
            y1.v1 r1 = (y1.v1) r1
            long r1 = r1.a()
            float r1 = u2.h.b(r1)
            float r0 = r0.x0(r1)
        L46:
            r3.E = r0
            return
    }
}
