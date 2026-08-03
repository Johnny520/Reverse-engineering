package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends v1.b1 implements v1.m0, x1.a, x1.y0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public final x1.g0 D;
    public final j0.b E;
    public boolean F;
    public boolean G;
    public long H;
    public final x1.u0 I;
    public final x1.u0 J;
    public float K;
    public boolean L;
    public fg.l M;
    public i1.b N;
    public long O;
    public float P;
    public final x1.u0 Q;
    public boolean R;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x1.j0 f21076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x1.d0 f21082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fg.l f21084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i1.b f21085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f21086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.Object f21088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21089y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21090z;

    public v0(x1.j0 r5) {
            r4 = this;
            r4.<init>()
            r4.f21076l = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4.f21078n = r5
            r4.f21079o = r5
            x1.d0 r5 = x1.d0.f20870i
            r4.f21082r = r5
            r0 = 0
            r4.f21083s = r0
            r5 = 1
            r4.f21087w = r5
            x1.g0 r2 = new x1.g0
            r3 = 0
            r2.<init>(r4, r3)
            r4.D = r2
            j0.b r2 = new j0.b
            r3 = 16
            x1.v0[] r3 = new x1.v0[r3]
            r2.<init>(r3)
            r4.E = r2
            r4.F = r5
            r5 = 0
            r2 = 15
            long r2 = u2.b.b(r5, r5, r5, r5, r2)
            r4.H = r2
            x1.u0 r5 = new x1.u0
            r2 = 1
            r5.<init>(r4, r2)
            r4.I = r5
            x1.u0 r5 = new x1.u0
            r2 = 0
            r5.<init>(r4, r2)
            r4.J = r5
            r4.O = r0
            x1.u0 r5 = new x1.u0
            r0 = 2
            r5.<init>(r4, r0)
            r4.Q = r5
            return
    }

    @Override // x1.a
    public final x1.r A() {
            r1 = this;
            x1.j0 r0 = r1.f21076l
            x1.f0 r0 = r0.f20951a
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            return r0
    }

    @Override // v1.b1
    public final void A0(long r7, float r9, fg.l r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r0.T0(r1, r3, r4, r5)
            return
    }

    @Override // x1.a
    public final x1.a B() {
            r1 = this;
            x1.j0 r0 = r1.f21076l
            x1.f0 r0 = r0.f20951a
            x1.f0 r0 = r0.u()
            if (r0 == 0) goto L11
            x1.j0 r0 = r0.M
            if (r0 == 0) goto L11
            x1.v0 r0 = r0.f20966p
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // v1.b1
    public final void B0(long r7, float r9, i1.b r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            r0.T0(r1, r3, r4, r5)
            return
    }

    @Override // v1.m0
    public final int G(int r3) {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.f0 r1 = r0.f20951a
            boolean r1 = x1.k.q(r1)
            if (r1 == 0) goto L14
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            int r3 = r0.G(r3)
            return r3
        L14:
            r2.N0()
            x1.i1 r0 = r0.a()
            int r3 = r0.G(r3)
            return r3
    }

    @Override // x1.a
    public final int H() {
            r1 = this;
            int r0 = r1.f21079o
            return r0
    }

    public final java.util.List J0() {
            r9 = this;
            x1.j0 r0 = r9.f21076l
            x1.f0 r1 = r0.f20951a
            r1.f0()
            boolean r1 = r9.F
            j0.b r2 = r9.E
            if (r1 != 0) goto L12
            java.util.List r0 = r2.f()
            return r0
        L12:
            x1.f0 r0 = r0.f20951a
            j0.b r1 = r0.y()
            java.lang.Object[] r3 = r1.f6671g
            int r1 = r1.f6673i
            r4 = 0
            r5 = r4
        L1e:
            if (r5 >= r1) goto L3d
            r6 = r3[r5]
            x1.f0 r6 = (x1.f0) r6
            int r7 = r2.f6673i
            if (r7 > r5) goto L30
            x1.j0 r6 = r6.M
            x1.v0 r6 = r6.f20966p
            r2.b(r6)
            goto L3a
        L30:
            x1.j0 r6 = r6.M
            x1.v0 r6 = r6.f20966p
            java.lang.Object[] r7 = r2.f6671g
            r8 = r7[r5]
            r7[r5] = r6
        L3a:
            int r5 = r5 + 1
            goto L1e
        L3d:
            java.util.List r0 = r0.n()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r0 = r0.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            int r1 = r2.f6673i
            r2.l(r0, r1)
            r9.F = r4
            java.util.List r0 = r2.f()
            return r0
    }

    public final void K0() {
            r6 = this;
            boolean r0 = r6.f21089y
            r1 = 1
            r6.f21089y = r1
            x1.j0 r2 = r6.f21076l
            x1.f0 r3 = r2.f20951a
            x1.b1 r4 = r3.L
            if (r0 != 0) goto L35
            x1.r r0 = r4.f20841c
            r0.C1()
            x1.r1 r0 = x1.i0.a(r3)
            y1.t r0 = (y1.t) r0
            g2.b r0 = r0.getRectManager()
            x1.f0 r2 = r2.f20951a
            r0.f(r2)
            boolean r0 = r3.q()
            r2 = 6
            if (r0 == 0) goto L2c
            x1.f0.V(r3, r1, r2)
            goto L35
        L2c:
            x1.j0 r0 = r3.M
            boolean r0 = r0.f20955e
            if (r0 == 0) goto L35
            x1.f0.T(r3, r1, r2)
        L35:
            x1.i1 r0 = r4.f20842d
            x1.r r1 = r4.f20841c
            x1.i1 r1 = r1.f20944v
        L3b:
            boolean r2 = gg.l.a(r0, r1)
            if (r2 != 0) goto L4d
            if (r0 == 0) goto L4d
            boolean r2 = r0.Q
            if (r2 == 0) goto L4a
            r0.y1()
        L4a:
            x1.i1 r0 = r0.f20944v
            goto L3b
        L4d:
            j0.b r0 = r3.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L56:
            if (r2 >= r0) goto L72
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            int r4 = r3.v()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L6f
            x1.j0 r4 = r3.M
            x1.v0 r4 = r4.f20966p
            r4.K0()
            x1.f0.W(r3)
        L6f:
            int r2 = r2 + 1
            goto L56
        L72:
            return
    }

    @Override // v1.m0
    public final int M(int r3) {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.f0 r1 = r0.f20951a
            boolean r1 = x1.k.q(r1)
            if (r1 == 0) goto L14
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            int r3 = r0.M(r3)
            return r3
        L14:
            r2.N0()
            x1.i1 r0 = r0.a()
            int r3 = r0.M(r3)
            return r3
    }

    public final void M0() {
            r5 = this;
            boolean r0 = r5.f21089y
            if (r0 == 0) goto L4b
            r0 = 0
            r5.f21089y = r0
            x1.j0 r1 = r5.f21076l
            x1.f0 r2 = r1.f20951a
            x1.f0 r1 = r1.f20951a
            x1.r1 r2 = x1.i0.a(r2)
            y1.t r2 = (y1.t) r2
            g2.b r2 = r2.getRectManager()
            r2.g(r1)
            x1.b1 r2 = r1.L
            x1.i1 r3 = r2.f20842d
            x1.r r2 = r2.f20841c
            x1.i1 r2 = r2.f20944v
        L22:
            boolean r4 = gg.l.a(r3, r2)
            if (r4 != 0) goto L33
            if (r3 == 0) goto L33
            r3.E1()
            r3.J1()
            x1.i1 r3 = r3.f20944v
            goto L22
        L33:
            j0.b r1 = r1.y()
            java.lang.Object[] r2 = r1.f6671g
            int r1 = r1.f6673i
        L3b:
            if (r0 >= r1) goto L4b
            r3 = r2[r0]
            x1.f0 r3 = (x1.f0) r3
            x1.j0 r3 = r3.M
            x1.v0 r3 = r3.f20966p
            r3.M0()
            int r0 = r0 + 1
            goto L3b
        L4b:
            return
    }

    public final void N0() {
            r4 = this;
            x1.j0 r0 = r4.f21076l
            x1.f0 r1 = r0.f20951a
            r2 = 0
            r3 = 7
            x1.f0.V(r1, r2, r3)
            x1.f0 r0 = r0.f20951a
            x1.f0 r1 = r0.u()
            if (r1 == 0) goto L2e
            x1.d0 r2 = r0.I
            x1.d0 r3 = x1.d0.f20870i
            if (r2 != r3) goto L2e
            x1.j0 r2 = r1.M
            x1.b0 r2 = r2.f20954d
            int r2 = r2.ordinal()
            if (r2 == 0) goto L2a
            r3 = 2
            if (r2 == r3) goto L27
            x1.d0 r1 = r1.I
            goto L2c
        L27:
            x1.d0 r1 = x1.d0.f20869h
            goto L2c
        L2a:
            x1.d0 r1 = x1.d0.f20868g
        L2c:
            r0.I = r1
        L2e:
            return
    }

    @Override // v1.m0
    public final v1.b1 Q(long r6) {
            r5 = this;
            x1.j0 r0 = r5.f21076l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            x1.d0 r3 = r1.I
            x1.d0 r4 = x1.d0.f20870i
            if (r3 != r4) goto Lf
            r1.e()
        Lf:
            boolean r1 = x1.k.q(r2)
            if (r1 == 0) goto L1f
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            r0.f21029p = r4
            r0.Q(r6)
        L1f:
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L51
            x1.j0 r0 = r0.M
            x1.d0 r1 = r5.f21082r
            if (r1 == r4) goto L35
            boolean r1 = r2.K
            if (r1 == 0) goto L30
            goto L35
        L30:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            u1.a.b(r1)
        L35:
            x1.b0 r1 = r0.f20954d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4c
            r2 = 2
            if (r1 != r2) goto L43
            x1.d0 r0 = x1.d0.f20869h
            goto L4e
        L43:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            x1.b0 r7 = r0.f20954d
            okio.a.l(r7, r6)
            r6 = 0
            return r6
        L4c:
            x1.d0 r0 = x1.d0.f20868g
        L4e:
            r5.f21082r = r0
            goto L53
        L51:
            r5.f21082r = r4
        L53:
            r5.X0(r6)
            return r5
    }

    public final void R0() {
            r7 = this;
            r0 = 1
            r7.L = r0
            x1.j0 r1 = r7.f21076l
            x1.f0 r2 = r1.f20951a
            x1.f0 r2 = r2.u()
            x1.r r3 = r7.A()
            float r3 = r3.G
            x1.f0 r1 = r1.f20951a
            x1.b1 r4 = r1.L
            x1.i1 r5 = r4.f20842d
            x1.r r4 = r4.f20841c
        L19:
            if (r5 == r4) goto L26
            r5.getClass()
            x1.x r5 = (x1.x) r5
            float r6 = r5.G
            float r3 = r3 + r6
            x1.i1 r5 = r5.f20944v
            goto L19
        L26:
            float r4 = r7.K
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L2d
            goto L39
        L2d:
            r7.K = r3
            if (r2 == 0) goto L34
            r2.O()
        L34:
            if (r2 == 0) goto L39
            r2.B()
        L39:
            x1.r r3 = r7.A()
            boolean r3 = r3.f20999q
            r4 = 0
            if (r3 != 0) goto L69
            boolean r3 = r7.f21089y
            if (r3 == 0) goto L4e
            x1.g0 r5 = r7.D
            boolean r5 = r5.d()
            if (r5 == 0) goto L51
        L4e:
            r7.K0()
        L51:
            if (r3 != 0) goto L62
            if (r2 == 0) goto L58
            r2.B()
        L58:
            boolean r1 = r7.f21077m
            if (r1 == 0) goto L69
            if (r2 == 0) goto L69
            r2.U(r4)
            goto L69
        L62:
            x1.b1 r1 = r1.L
            x1.r r1 = r1.f20841c
            r1.C1()
        L69:
            if (r2 == 0) goto L8c
            x1.j0 r1 = r2.M
            boolean r2 = r7.f21077m
            if (r2 != 0) goto L8e
            x1.b0 r2 = r1.f20954d
            x1.b0 r3 = x1.b0.f20835i
            if (r2 != r3) goto L8e
            int r2 = r7.f21079o
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L7f
            goto L84
        L7f:
            java.lang.String r2 = "Place was called on a node which was placed already"
            u1.a.b(r2)
        L84:
            int r2 = r1.f20959i
            r7.f21079o = r2
            int r2 = r2 + r0
            r1.f20959i = r2
            goto L8e
        L8c:
            r7.f21079o = r4
        L8e:
            r7.h0()
            return
    }

    public final void S0(long r9, float r11, fg.l r12, i1.b r13) {
            r8 = this;
            x1.j0 r6 = r8.f21076l
            x1.f0 r0 = r6.f20951a
            x1.f0 r1 = r6.f20951a
            boolean r0 = r0.W
            if (r0 == 0) goto Lf
            java.lang.String r0 = "place is called on a deactivated node"
            u1.a.a(r0)
        Lf:
            x1.b0 r0 = x1.b0.f20835i
            r6.f20954d = r0
            r8.f21083s = r9
            r8.f21086v = r11
            r8.f21084t = r12
            r8.f21085u = r13
            r0 = 0
            r8.L = r0
            x1.r1 r2 = x1.i0.a(r1)
            boolean r3 = r8.B
            if (r3 != 0) goto L3e
            boolean r3 = r8.f21089y
            if (r3 == 0) goto L3e
            x1.i1 r0 = r6.a()
            long r1 = r0.f13904k
            long r1 = u2.j.d(r9, r1)
            r3 = r11
            r4 = r12
            r5 = r13
            r0.H1(r1, r3, r4, r5)
            r8.R0()
            goto L5c
        L3e:
            x1.g0 r7 = r8.D
            r7.f20919e = r0
            r6.f(r0)
            r8.M = r12
            r8.O = r9
            r8.P = r11
            r8.N = r13
            y1.t r2 = (y1.t) r2
            x1.t1 r9 = r2.getSnapshotObserver()
            x1.d r10 = r9.f21071f
            w0.s r9 = r9.f21066a
            x1.u0 r11 = r8.Q
            r9.c(r1, r10, r11)
        L5c:
            x1.b0 r9 = x1.b0.f20837k
            r6.f20954d = r9
            x1.i1 r9 = r6.a()
            boolean r9 = r9.f20999q
            if (r9 == 0) goto L73
            boolean r9 = r6.f20961k
            if (r9 != 0) goto L70
            boolean r9 = r6.f20960j
            if (r9 == 0) goto L73
        L70:
            r8.requestLayout()
        L73:
            r9 = 1
            r8.f21081q = r9
            return
    }

    public final void T0(long r9, float r11, fg.l r12, i1.b r13) {
            r8 = this;
            x1.j0 r0 = r8.f21076l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            r3 = 1
            r8.f21090z = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.f21083s     // Catch: java.lang.Throwable -> L1b
            boolean r4 = u2.j.b(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1f
            fg.l r4 = r8.f21084t     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1f
            boolean r4 = r8.R     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
            goto L1f
        L1b:
            r0 = move-exception
            r9 = r0
            goto L9f
        L1f:
            boolean r4 = r0.f20961k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r0.f20960j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r8.R     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
        L2b:
            r8.B = r3     // Catch: java.lang.Throwable -> L1b
            r8.R = r5     // Catch: java.lang.Throwable -> L1b
        L2f:
            x1.r0 r4 = r0.f20967q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L46
            x1.j0 r6 = r4.f21025l     // Catch: java.lang.Throwable -> L1b
            x1.p0 r4 = r4.f21036w     // Catch: java.lang.Throwable -> L1b
            x1.p0 r7 = x1.p0.f21020i     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L46
            x1.f0 r4 = r6.f20951a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = x1.k.q(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L44
            goto L46
        L44:
            r6.f20953c = r3     // Catch: java.lang.Throwable -> L1b
        L46:
            x1.r0 r4 = r0.f20967q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L89
            boolean r4 = r4.J0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L89
            x1.i1 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            x1.i1 r3 = r3.f20945w     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5c
            v1.k0 r3 = r3.f21000r     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L66
        L5c:
            x1.r1 r3 = x1.i0.a(r2)     // Catch: java.lang.Throwable -> L1b
            y1.t r3 = (y1.t) r3     // Catch: java.lang.Throwable -> L1b
            v1.a1 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L66:
            x1.r0 r4 = r0.f20967q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            x1.f0 r2 = r2.u()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L75
            x1.j0 r2 = r2.M     // Catch: java.lang.Throwable -> L1b
            r2.f20958h = r5     // Catch: java.lang.Throwable -> L1b
        L75:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.f21028o = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            v1.a1.B(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L89:
            x1.r0 r0 = r0.f20967q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L96
            boolean r0 = r0.f21030q     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L96
            java.lang.String r0 = "Error: Placement happened before lookahead."
            u1.a.b(r0)     // Catch: java.lang.Throwable -> L1b
        L96:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.S0(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            return
        L9f:
            r1.Y(r9)
            r9 = 0
            throw r9
    }

    @Override // v1.b1, v1.m0
    public final java.lang.Object X() {
            r1 = this;
            java.lang.Object r0 = r1.f21088x
            return r0
    }

    public final boolean X0(long r11) {
            r10 = this;
            x1.j0 r0 = r10.f21076l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            boolean r3 = r1.W     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            u1.a.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r11 = move-exception
            goto Lde
        L13:
            x1.r1 r3 = x1.i0.a(r2)     // Catch: java.lang.Throwable -> L10
            x1.f0 r4 = r2.u()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r2.K     // Catch: java.lang.Throwable -> L10
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L28
            boolean r4 = r4.K     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r7
            goto L2b
        L2a:
            r4 = r6
        L2b:
            r2.K = r4     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.q()     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L45
            long r4 = r10.f13903j     // Catch: java.lang.Throwable -> L10
            boolean r4 = u2.a.b(r4, r11)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L3c
            goto L45
        L3c:
            y1.t r3 = (y1.t) r3     // Catch: java.lang.Throwable -> L10
            r3.n(r2, r7)     // Catch: java.lang.Throwable -> L10
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r7
        L45:
            x1.g0 r3 = r10.D     // Catch: java.lang.Throwable -> L10
            r3.f20918d = r7     // Catch: java.lang.Throwable -> L10
            j0.b r3 = r2.y()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r4 = r3.f6671g     // Catch: java.lang.Throwable -> L10
            int r3 = r3.f6673i     // Catch: java.lang.Throwable -> L10
            r5 = r7
        L52:
            if (r5 >= r3) goto L64
            r8 = r4[r5]     // Catch: java.lang.Throwable -> L10
            x1.f0 r8 = (x1.f0) r8     // Catch: java.lang.Throwable -> L10
            x1.j0 r8 = r8.M     // Catch: java.lang.Throwable -> L10
            x1.v0 r8 = r8.f20966p     // Catch: java.lang.Throwable -> L10
            x1.g0 r8 = r8.D     // Catch: java.lang.Throwable -> L10
            r8.getClass()     // Catch: java.lang.Throwable -> L10
            int r5 = r5 + 1
            goto L52
        L64:
            r10.f21080p = r6     // Catch: java.lang.Throwable -> L10
            x1.i1 r3 = r0.a()     // Catch: java.lang.Throwable -> L10
            long r3 = r3.f13902i     // Catch: java.lang.Throwable -> L10
            r10.E0(r11)     // Catch: java.lang.Throwable -> L10
            x1.b0 r5 = r0.f20954d     // Catch: java.lang.Throwable -> L10
            x1.b0 r8 = x1.b0.f20837k     // Catch: java.lang.Throwable -> L10
            if (r5 != r8) goto L76
            goto L7b
        L76:
            java.lang.String r5 = "layout state is not idle before measure starts"
            u1.a.b(r5)     // Catch: java.lang.Throwable -> L10
        L7b:
            r10.H = r11     // Catch: java.lang.Throwable -> L10
            x1.b0 r11 = x1.b0.f20833g     // Catch: java.lang.Throwable -> L10
            r0.f20954d = r11     // Catch: java.lang.Throwable -> L10
            r10.A = r7     // Catch: java.lang.Throwable -> L10
            x1.r1 r12 = x1.i0.a(r2)     // Catch: java.lang.Throwable -> L10
            y1.t r12 = (y1.t) r12     // Catch: java.lang.Throwable -> L10
            x1.t1 r12 = r12.getSnapshotObserver()     // Catch: java.lang.Throwable -> L10
            x1.u0 r5 = r10.I     // Catch: java.lang.Throwable -> L10
            x1.d r9 = r12.f21068c     // Catch: java.lang.Throwable -> L10
            w0.s r12 = r12.f21066a     // Catch: java.lang.Throwable -> L10
            r12.c(r2, r9, r5)     // Catch: java.lang.Throwable -> L10
            x1.b0 r12 = r0.f20954d     // Catch: java.lang.Throwable -> L10
            if (r12 != r11) goto La0
            r10.B = r6     // Catch: java.lang.Throwable -> L10
            r10.C = r6     // Catch: java.lang.Throwable -> L10
            r0.f20954d = r8     // Catch: java.lang.Throwable -> L10
        La0:
            x1.i1 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            long r11 = r11.f13902i     // Catch: java.lang.Throwable -> L10
            boolean r11 = u2.l.a(r11, r3)     // Catch: java.lang.Throwable -> L10
            if (r11 == 0) goto Lc2
            x1.i1 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.f13900g     // Catch: java.lang.Throwable -> L10
            int r12 = r10.f13900g     // Catch: java.lang.Throwable -> L10
            if (r11 != r12) goto Lc2
            x1.i1 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.f13901h     // Catch: java.lang.Throwable -> L10
            int r12 = r10.f13901h     // Catch: java.lang.Throwable -> L10
            if (r11 == r12) goto Lc1
            goto Lc2
        Lc1:
            r6 = r7
        Lc2:
            x1.i1 r11 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r11 = r11.f13900g     // Catch: java.lang.Throwable -> L10
            x1.i1 r12 = r0.a()     // Catch: java.lang.Throwable -> L10
            int r12 = r12.f13901h     // Catch: java.lang.Throwable -> L10
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L10
            r11 = 32
            long r2 = r2 << r11
            long r11 = (long) r12     // Catch: java.lang.Throwable -> L10
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r4
            long r11 = r11 | r2
            r10.C0(r11)     // Catch: java.lang.Throwable -> L10
            return r6
        Lde:
            r1.Y(r11)
            r11 = 0
            throw r11
    }

    public final void Y0() {
            r4 = this;
            x1.j0 r0 = r4.f21076l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            boolean r1 = r1.H()
            if (r1 == 0) goto L3c
            int r0 = r0.f20962l
            if (r0 <= 0) goto L3c
            x1.j0 r0 = r2.M
            boolean r1 = r0.f20960j
            r3 = 0
            if (r1 != 0) goto L1b
            boolean r1 = r0.f20961k
            if (r1 == 0) goto L24
        L1b:
            x1.v0 r0 = r0.f20966p
            boolean r0 = r0.B
            if (r0 != 0) goto L24
            r2.U(r3)
        L24:
            j0.b r0 = r2.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
        L2c:
            if (r3 >= r0) goto L3c
            r2 = r1[r3]
            x1.f0 r2 = (x1.f0) r2
            x1.j0 r2 = r2.M
            x1.v0 r2 = r2.f20966p
            r2.Y0()
            int r3 = r3 + 1
            goto L2c
        L3c:
            return
    }

    @Override // x1.a
    public final void c0(b1.f r5) {
            r4 = this;
            x1.j0 r0 = r4.f21076l
            x1.f0 r0 = r0.f20951a
            j0.b r0 = r0.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.j0 r3 = r3.M
            x1.v0 r3 = r3.f20966p
            r5.invoke(r3)
            int r2 = r2 + 1
            goto Ld
        L1d:
            return
    }

    @Override // x1.a
    public final x1.g0 e() {
            r1 = this;
            x1.g0 r0 = r1.D
            return r0
    }

    @Override // x1.y0
    public final void f0(boolean r3) {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.i1 r1 = r0.a()
            boolean r1 = r1.f20997o
            if (r3 == r1) goto L13
            x1.i1 r0 = r0.a()
            r0.f20997o = r3
            r3 = 1
            r2.R = r3
        L13:
            return
    }

    @Override // x1.a
    public final void h0() {
            r11 = this;
            r0 = 1
            r11.G = r0
            x1.g0 r0 = r11.D
            r0.h()
            boolean r1 = r11.B
            x1.j0 r2 = r11.f21076l
            r3 = 0
            if (r1 == 0) goto L5f
            x1.f0 r1 = r2.f20951a
            j0.b r1 = r1.y()
            java.lang.Object[] r4 = r1.f6671g
            int r1 = r1.f6673i
            r5 = r3
        L1a:
            if (r5 >= r1) goto L5f
            r6 = r4[r5]
            x1.f0 r6 = (x1.f0) r6
            boolean r7 = r6.q()
            x1.j0 r8 = r6.M
            if (r7 == 0) goto L5c
            x1.d0 r7 = r6.r()
            x1.d0 r9 = x1.d0.f20868g
            if (r7 != r9) goto L5c
            x1.v0 r7 = r8.f20966p
            boolean r9 = r7.f21080p
            if (r9 == 0) goto L3e
            long r9 = r7.f13903j
            u2.a r7 = new u2.a
            r7.<init>(r9)
            goto L3f
        L3e:
            r7 = 0
        L3f:
            if (r7 == 0) goto L53
            x1.d0 r9 = r6.I
            x1.d0 r10 = x1.d0.f20870i
            if (r9 != r10) goto L4a
            r6.e()
        L4a:
            x1.v0 r6 = r8.f20966p
            long r7 = r7.f13338a
            boolean r6 = r6.X0(r7)
            goto L54
        L53:
            r6 = r3
        L54:
            if (r6 == 0) goto L5c
            x1.f0 r6 = r2.f20951a
            r7 = 7
            x1.f0.V(r6, r3, r7)
        L5c:
            int r5 = r5 + 1
            goto L1a
        L5f:
            boolean r1 = r11.C
            if (r1 != 0) goto L6f
            x1.r r1 = r11.A()
            boolean r1 = r1.f20999q
            if (r1 != 0) goto L93
            boolean r1 = r11.B
            if (r1 == 0) goto L93
        L6f:
            r11.B = r3
            x1.b0 r1 = r2.f20954d
            x1.b0 r4 = x1.b0.f20835i
            r2.f20954d = r4
            r2.g(r3)
            x1.f0 r4 = r2.f20951a
            x1.r1 r5 = x1.i0.a(r4)
            y1.t r5 = (y1.t) r5
            x1.t1 r5 = r5.getSnapshotObserver()
            x1.d r6 = r5.f21070e
            w0.s r5 = r5.f21066a
            x1.u0 r7 = r11.J
            r5.c(r4, r6, r7)
            r2.f20954d = r1
            r11.C = r3
        L93:
            boolean r1 = r0.f20916b
            if (r1 == 0) goto La0
            boolean r1 = r0.e()
            if (r1 == 0) goto La0
            r0.g()
        La0:
            r11.G = r3
            return
    }

    @Override // v1.m0
    public final int j(int r3) {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.f0 r1 = r0.f20951a
            boolean r1 = x1.k.q(r1)
            if (r1 == 0) goto L14
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            int r3 = r0.j(r3)
            return r3
        L14:
            r2.N0()
            x1.i1 r0 = r0.a()
            int r3 = r0.j(r3)
            return r3
    }

    @Override // x1.a
    public final void o0() {
            r3 = this;
            x1.j0 r0 = r3.f21076l
            x1.f0 r0 = r0.f20951a
            r1 = 0
            r2 = 7
            x1.f0.V(r0, r1, r2)
            return
    }

    @Override // v1.m0
    public final int p0(int r3) {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.f0 r1 = r0.f20951a
            boolean r1 = x1.k.q(r1)
            if (r1 == 0) goto L14
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            int r3 = r0.p0(r3)
            return r3
        L14:
            r2.N0()
            x1.i1 r0 = r0.a()
            int r3 = r0.p0(r3)
            return r3
    }

    @Override // v1.b1
    public final int r0() {
            r1 = this;
            x1.j0 r0 = r1.f21076l
            x1.i1 r0 = r0.a()
            int r0 = r0.r0()
            return r0
    }

    @Override // x1.a
    public final void requestLayout() {
            r2 = this;
            x1.j0 r0 = r2.f21076l
            x1.f0 r0 = r0.f20951a
            r1 = 0
            r0.U(r1)
            return
    }

    @Override // v1.b1
    public final int w0() {
            r1 = this;
            x1.j0 r0 = r1.f21076l
            x1.i1 r0 = r0.a()
            int r0 = r0.w0()
            return r0
    }
}
