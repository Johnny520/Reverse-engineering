package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends x1.j implements x1.w1, q1.e, x1.z1, x1.e2, x1.h, x1.m1, p1.c, k.k0 {
    public static final k.b Q = null;
    public f2.i A;
    public boolean B;
    public fg.a C;
    public final k.i0 D;
    public k.y0 E;
    public s1.l0 F;
    public k.l0 G;
    public x1.i H;
    public n.m I;
    public n.h J;
    public final f.z K;
    public n.m L;
    public n.k M;
    public boolean N;
    public qg.e1 O;
    public final k.b P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n.k f6954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k.y0 f6955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.lang.String f6957z;

    static {
            k.b r0 = new k.b
            r0.<init>()
            k.g.Q = r0
            return
    }

    public g(n.k r10, k.y0 r11, boolean r12, boolean r13, java.lang.String r14, f2.i r15, fg.a r16) {
            r9 = this;
            r9.<init>()
            r9.f6954w = r10
            r9.f6955x = r11
            r9.f6956y = r12
            r9.f6957z = r14
            r9.A = r15
            r9.B = r13
            r11 = r16
            r9.C = r11
            k.i0 r11 = new k.i0
            c0.f r0 = new c0.f
            r7 = 0
            r8 = 26
            r1 = 1
            java.lang.Class<k.g> r3 = k.g.class
            java.lang.String r4 = "onFocusChange"
            java.lang.String r5 = "onFocusChange(Z)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            r11.<init>(r10, r12, r0)
            r9.D = r11
            int r10 = f.n.f2873a
            f.z r10 = new f.z
            r11 = 6
            r10.<init>(r11)
            r9.K = r10
            n.k r10 = r9.f6954w
            r9.M = r10
            if (r10 != 0) goto L3d
            r12 = 1
        L3d:
            r9.N = r12
            k.b r10 = k.g.Q
            r9.P = r10
            return
    }

    @Override // q1.e
    public final boolean C(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // x1.m1
    public final void C0() {
            r2 = this;
            boolean r0 = r2.f6956y
            if (r0 == 0) goto Ld
            k.a r0 = new k.a
            r1 = 0
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
        Ld:
            return
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            k.b r0 = r1.P
            return r0
    }

    public void P(s1.k r9, s1.l r10, long r11) {
            r8 = this;
            r0 = 33
            long r1 = r11 >> r0
            r3 = 32
            long r1 = r1 << r3
            long r4 = r11 << r3
            long r4 = r4 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r0 = r1 | r4
            long r2 = r0 >> r3
            int r2 = (int) r2
            float r2 = (float) r2
            long r0 = r0 & r6
            int r0 = (int) r0
            float r0 = (float) r0
            java.lang.Float.floatToRawIntBits(r2)
            java.lang.Float.floatToRawIntBits(r0)
            r8.v1()
            boolean r0 = r8.B
            if (r0 == 0) goto L5d
            k.l0 r0 = r8.G
            if (r0 != 0) goto L34
            k.l0 r0 = new k.l0
            r0.<init>(r8)
            r8.k1(r0)
            r8.G = r0
        L34:
            s1.l r0 = s1.l.f12275h
            if (r10 != r0) goto L5d
            int r0 = r9.f12267f
            r1 = 4
            r2 = 3
            r3 = 0
            if (r0 != r1) goto L4d
            qg.t r0 = r8.Y0()
            k.f r1 = new k.f
            r4 = 0
            r1.<init>(r8, r3, r4)
            qg.v.q(r0, r3, r1, r2)
            goto L5d
        L4d:
            r1 = 5
            if (r0 != r1) goto L5d
            qg.t r0 = r8.Y0()
            k.f r1 = new k.f
            r4 = 1
            r1.<init>(r8, r3, r4)
            qg.v.q(r0, r3, r1, r2)
        L5d:
            s1.l0 r0 = r8.F
            if (r0 != 0) goto L6c
            s1.l0 r0 = r8.o1()
            if (r0 == 0) goto L6c
            r8.k1(r0)
            r8.F = r0
        L6c:
            s1.l0 r0 = r8.F
            if (r0 == 0) goto L73
            r0.P(r9, r10, r11)
        L73:
            return
    }

    @Override // x1.z1
    public final boolean S0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // q1.e
    public final boolean W(android.view.KeyEvent r10) {
            r9 = this;
            r9.v1()
            long r0 = q1.d.b(r10)
            boolean r2 = r9.B
            r3 = 3
            r4 = 0
            f.z r5 = r9.K
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L49
            int r2 = q1.d.c(r10)
            r8 = 2
            if (r2 != r8) goto L49
            boolean r2 = k.n.o(r10)
            if (r2 == 0) goto L49
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L3f
            n.m r2 = new n.m
            r2.<init>()
            r5.g(r2, r0)
            n.k r0 = r9.f6954w
            if (r0 == 0) goto L3d
            qg.t r0 = r9.Y0()
            k.e r1 = new k.e
            r5 = 2
            r1.<init>(r9, r2, r4, r5)
            qg.v.q(r0, r4, r1, r3)
        L3d:
            r0 = r6
            goto L40
        L3f:
            r0 = r7
        L40:
            boolean r10 = r9.x1(r10)
            if (r10 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L49:
            boolean r2 = r9.B
            if (r2 == 0) goto L78
            int r2 = q1.d.c(r10)
            if (r2 != r6) goto L78
            boolean r2 = k.n.o(r10)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            n.m r0 = (n.m) r0
            if (r0 == 0) goto L75
            n.k r1 = r9.f6954w
            if (r1 == 0) goto L72
            qg.t r1 = r9.Y0()
            k.e r2 = new k.e
            r5 = 3
            r2.<init>(r9, r0, r4, r5)
            qg.v.q(r1, r4, r2, r3)
        L72:
            r9.y1(r10)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
    }

    @Override // x1.z1
    public final void X0(f2.y r5) {
            r4 = this;
            f2.i r0 = r4.A
            if (r0 == 0) goto L9
            int r0 = r0.f3155a
            f2.w.c(r5, r0)
        L9:
            java.lang.String r0 = r4.f6957z
            k.a r1 = new k.a
            r2 = 1
            r1.<init>(r4, r2)
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.l.f3179b
            f2.a r3 = new f2.a
            r3.<init>(r0, r1)
            r5.a(r2, r3)
            boolean r0 = r4.B
            if (r0 == 0) goto L27
            k.i0 r0 = r4.D
            r0.X0(r5)
            goto L2e
        L27:
            f2.x r0 = f2.u.f3232j
            sf.n r1 = sf.n.f12433a
            r5.a(r0, r1)
        L2e:
            r4.n1(r5)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void b0() {
            r3 = this;
            n.k r0 = r3.f6954w
            if (r0 == 0) goto L10
            n.h r1 = r3.J
            if (r1 == 0) goto L10
            n.i r2 = new n.i
            r2.<init>(r1)
            r0.b(r2)
        L10:
            r0 = 0
            r3.J = r0
            s1.l0 r0 = r3.F
            if (r0 == 0) goto L1a
            r0.b0()
        L1a:
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            r1.C0()
            boolean r0 = r1.N
            if (r0 != 0) goto La
            r1.v1()
        La:
            boolean r0 = r1.B
            if (r0 == 0) goto L13
            k.i0 r0 = r1.D
            r1.k1(r0)
        L13:
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            r2.p1()
            n.k r0 = r2.M
            r1 = 0
            if (r0 != 0) goto La
            r2.f6954w = r1
        La:
            x1.i r0 = r2.H
            if (r0 == 0) goto L11
            r2.l1(r0)
        L11:
            r2.H = r1
            k.l0 r0 = r2.G
            if (r0 == 0) goto L1a
            r2.l1(r0)
        L1a:
            r2.G = r1
            return
    }

    public void n1(f2.y r1) {
            r0 = this;
            return
    }

    public s1.l0 o1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void p1() {
            r17 = this;
            r0 = r17
            n.k r1 = r0.f6954w
            f.z r2 = r0.K
            if (r1 == 0) goto L76
            n.m r3 = r0.I
            if (r3 == 0) goto L14
            n.l r4 = new n.l
            r4.<init>(r3)
            r1.b(r4)
        L14:
            n.m r3 = r0.L
            if (r3 == 0) goto L20
            n.l r4 = new n.l
            r4.<init>(r3)
            r1.b(r4)
        L20:
            n.h r3 = r0.J
            if (r3 == 0) goto L2c
            n.i r4 = new n.i
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.f2927c
            long[] r4 = r2.f2925a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            n.m r13 = (n.m) r13
            n.l r14 = new n.l
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.I = r1
            r0.L = r1
            r0.J = r1
            r2.a()
            return
    }

    public final long q1(long r9) {
            r8 = this;
            i0.m2 r0 = y1.h1.f21958t
            java.lang.Object r0 = x1.k.h(r8, r0)
            y1.l2 r0 = (y1.l2) r0
            long r0 = r0.d()
            x1.f0 r2 = x1.k.w(r8)
            u2.c r2 = r2.E
            long r0 = r2.L0(r0)
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r9 >> r2
            int r4 = (int) r4
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 0
            float r3 = java.lang.Math.max(r4, r3)
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r9 = r9 & r6
            int r9 = (int) r9
            float r9 = (float) r9
            float r0 = r0 - r9
            float r9 = java.lang.Math.max(r4, r0)
            float r9 = r9 / r5
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            long r0 = r0 << r2
            long r9 = r9 & r6
            long r9 = r9 | r0
            return r9
    }

    public final void r1(boolean r8) {
            r7 = this;
            n.k r1 = r7.f6954w
            if (r1 == 0) goto L5b
            qg.e1 r0 = r7.O
            r4 = 0
            if (r0 == 0) goto L18
            boolean r0 = r0.b()
            r2 = 1
            if (r0 != r2) goto L18
            qg.e1 r0 = r7.O
            if (r0 == 0) goto L54
            r0.a(r4)
            goto L54
        L18:
            if (r8 == 0) goto L1d
            n.m r0 = r7.L
            goto L1f
        L1d:
            n.m r0 = r7.I
        L1f:
            if (r0 == 0) goto L54
            n.l r2 = new n.l
            r2.<init>(r0)
            qg.t r0 = r7.Y0()
            vg.c r0 = (vg.c) r0
            wf.g r0 = r0.f14326g
            qg.q r3 = qg.q.f11090h
            wf.e r0 = r0.s(r3)
            qg.r0 r0 = (qg.r0) r0
            if (r0 == 0) goto L45
            c9.i r3 = new c9.i
            r5 = 24
            r3.<init>(r1, r5, r2)
            qg.d0 r0 = r0.o(r3)
            r3 = r0
            goto L46
        L45:
            r3 = r4
        L46:
            qg.t r6 = r7.Y0()
            c0.m r0 = new c0.m
            r5 = 7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 3
            qg.v.q(r6, r4, r0, r1)
        L54:
            if (r8 == 0) goto L59
            r7.L = r4
            return
        L59:
            r7.I = r4
        L5b:
            return
    }

    public final void s1(long r11, boolean r13) {
            r10 = this;
            n.k r4 = r10.f6954w
            if (r4 == 0) goto L40
            qg.e1 r1 = r10.O
            r7 = 3
            r8 = 0
            if (r1 == 0) goto L24
            boolean r0 = r1.b()
            r2 = 1
            if (r0 != r2) goto L24
            r1.a(r8)
            qg.t r9 = r10.Y0()
            c0.i r0 = new c0.i
            r5 = 0
            r6 = 3
            r2 = r11
            r0.<init>(r1, r2, r4, r5, r6)
            qg.v.q(r9, r8, r0, r7)
            goto L39
        L24:
            if (r13 == 0) goto L29
            n.m r11 = r10.L
            goto L2b
        L29:
            n.m r11 = r10.I
        L2b:
            if (r11 == 0) goto L39
            qg.t r12 = r10.Y0()
            k.c r0 = new k.c
            r0.<init>(r11, r4, r8)
            qg.v.q(r12, r8, r0, r7)
        L39:
            if (r13 == 0) goto L3e
            r10.L = r8
            return
        L3e:
            r10.I = r8
        L40:
            return
    }

    public final void t1(p1.b r8) {
            r7 = this;
            n.k r1 = r7.f6954w
            if (r1 == 0) goto L4f
            n.m r2 = new n.m
            r2.<init>()
            gg.q r0 = new gg.q
            r0.<init>()
            c9.i r3 = new c9.i
            r4 = 27
            r3.<init>(r8, r4, r0)
            i.x0 r8 = new i.x0
            r4 = 1
            r8.<init>(r3, r4)
            k.b r3 = k.l0.f7008v
            x1.k.z(r7, r3, r8)
            boolean r8 = r0.f4560g
            r6 = 3
            r4 = 0
            if (r8 != 0) goto L3d
            boolean r8 = k.x.a(r7)
            if (r8 == 0) goto L2d
            goto L3d
        L2d:
            r7.L = r2
            qg.t r8 = r7.Y0()
            k.c r0 = new k.c
            r3 = 1
            r0.<init>(r1, r2, r4, r3)
            qg.v.q(r8, r4, r0, r6)
            return
        L3d:
            qg.t r8 = r7.Y0()
            k.d r0 = new k.d
            r5 = 0
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            qg.e1 r8 = qg.v.q(r8, r4, r0, r6)
            r3.O = r8
            return
        L4f:
            r3 = r7
            return
    }

    public final void u1(s1.t r8) {
            r7 = this;
            n.k r1 = r7.f6954w
            if (r1 == 0) goto L60
            n.m r2 = new n.m
            r2.<init>()
            r0 = 0
            r3 = 1
            if (r8 != 0) goto L17
            k.k0 r8 = k.n.m(r7)
            if (r8 == 0) goto L15
            r8 = r3
            goto L30
        L15:
            r8 = r0
            goto L30
        L17:
            gg.q r4 = new gg.q
            r4.<init>()
            c9.i r5 = new c9.i
            r6 = 28
            r5.<init>(r8, r6, r4)
            i.x0 r8 = new i.x0
            r6 = 1
            r8.<init>(r5, r6)
            k.b r5 = k.l0.f7008v
            x1.k.z(r7, r5, r8)
            boolean r8 = r4.f4560g
        L30:
            if (r8 != 0) goto L38
            boolean r8 = k.x.a(r7)
            if (r8 == 0) goto L39
        L38:
            r0 = r3
        L39:
            r8 = 3
            r4 = 0
            if (r0 == 0) goto L4f
            qg.t r6 = r7.Y0()
            k.d r0 = new k.d
            r5 = 1
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            qg.e1 r8 = qg.v.q(r6, r4, r0, r8)
            r3.O = r8
            return
        L4f:
            r3 = r7
            r3.I = r2
            qg.t r0 = r7.Y0()
            k.c r5 = new k.c
            r6 = 2
            r5.<init>(r1, r2, r4, r6)
            qg.v.q(r0, r4, r5, r8)
            return
        L60:
            r3 = r7
            return
    }

    public final void v1() {
            r3 = this;
            x1.i r0 = r3.H
            if (r0 == 0) goto L5
            goto L30
        L5:
            boolean r0 = r3.f6956y
            if (r0 == 0) goto Lc
            k.y0 r0 = r3.E
            goto Le
        Lc:
            k.y0 r0 = r3.f6955x
        Le:
            if (r0 == 0) goto L30
            n.k r1 = r3.f6954w
            if (r1 != 0) goto L1b
            n.k r1 = new n.k
            r1.<init>()
            r3.f6954w = r1
        L1b:
            k.i0 r1 = r3.D
            n.k r2 = r3.f6954w
            r1.o1(r2)
            n.k r1 = r3.f6954w
            r1.getClass()
            x1.i r0 = r0.a(r1)
            r3.k1(r0)
            r3.H = r0
        L30:
            return
    }

    public void w1() {
            r0 = this;
            return
    }

    public abstract boolean x1(android.view.KeyEvent r1);

    public abstract void y1(android.view.KeyEvent r1);

    public final void z1(n.k r4, k.y0 r5, boolean r6, boolean r7, java.lang.String r8, f2.i r9, fg.a r10) {
            r3 = this;
            n.k r0 = r3.M
            boolean r0 = gg.l.a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.p1()
            r3.M = r4
            r3.f6954w = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            k.y0 r0 = r3.f6955x
            boolean r0 = gg.l.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f6955x = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f6956y
            if (r5 == r6) goto L2b
            r3.f6956y = r6
            if (r6 == 0) goto L2a
            r3.C0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.B
            k.i0 r6 = r3.D
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.k1(r6)
            goto L3d
        L37:
            r3.l1(r6)
            r3.p1()
        L3d:
            x1.k.n(r3)
            r3.B = r7
        L42:
            java.lang.String r5 = r3.f6957z
            boolean r5 = gg.l.a(r5, r8)
            if (r5 != 0) goto L4f
            r3.f6957z = r8
            x1.k.n(r3)
        L4f:
            f2.i r5 = r3.A
            boolean r5 = gg.l.a(r5, r9)
            if (r5 != 0) goto L5c
            r3.A = r9
            x1.k.n(r3)
        L5c:
            r3.C = r10
            boolean r5 = r3.N
            n.k r7 = r3.M
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.N = r2
            if (r2 != 0) goto L75
            x1.i r5 = r3.H
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            x1.i r4 = r3.H
            if (r4 != 0) goto L80
            boolean r5 = r3.N
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.l1(r4)
        L85:
            r4 = 0
            r3.H = r4
            r3.v1()
        L8b:
            n.k r4 = r3.f6954w
            r6.o1(r4)
            return
    }
}
