package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends v1.b1 implements v1.m0, x1.a, x1.y0 {
    public boolean A;
    public final x1.q0 B;
    public boolean C;
    public java.lang.Object D;
    public long E;
    public final x1.q0 F;
    public final x1.q0 G;
    public boolean H;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x1.j0 f21025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x1.d0 f21029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u2.a f21032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.l f21034u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i1.b f21035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x1.p0 f21036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x1.g0 f21037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j0.b f21038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21039z;

    public r0(x1.j0 r4) {
            r3 = this;
            r3.<init>()
            r3.f21025l = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.f21027n = r0
            r3.f21028o = r0
            x1.d0 r0 = x1.d0.f20870i
            r3.f21029p = r0
            r0 = 0
            r3.f21033t = r0
            x1.p0 r0 = x1.p0.f21020i
            r3.f21036w = r0
            x1.g0 r0 = new x1.g0
            r1 = 1
            r0.<init>(r3, r1)
            r3.f21037x = r0
            j0.b r0 = new j0.b
            r1 = 16
            x1.r0[] r1 = new x1.r0[r1]
            r0.<init>(r1)
            r3.f21038y = r0
            r0 = 1
            r3.f21039z = r0
            x1.q0 r1 = new x1.q0
            r2 = 0
            r1.<init>(r3, r2)
            r3.B = r1
            r3.C = r0
            x1.v0 r4 = r4.f20966p
            java.lang.Object r4 = r4.f21088x
            r3.D = r4
            r4 = 0
            r0 = 15
            long r0 = u2.b.b(r4, r4, r4, r4, r0)
            r3.E = r0
            x1.q0 r4 = new x1.q0
            r0 = 2
            r4.<init>(r3, r0)
            r3.F = r4
            x1.q0 r4 = new x1.q0
            r0 = 1
            r4.<init>(r3, r0)
            r3.G = r4
            return
    }

    @Override // x1.a
    public final x1.r A() {
            r1 = this;
            x1.j0 r0 = r1.f21025l
            x1.f0 r0 = r0.f20951a
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            return r0
    }

    @Override // v1.b1
    public final void A0(long r1, float r3, fg.l r4) {
            r0 = this;
            r3 = 0
            r0.T0(r1, r4, r3)
            return
    }

    @Override // x1.a
    public final x1.a B() {
            r1 = this;
            x1.j0 r0 = r1.f21025l
            x1.f0 r0 = r0.f20951a
            x1.f0 r0 = r0.u()
            if (r0 == 0) goto L11
            x1.j0 r0 = r0.M
            if (r0 == 0) goto L11
            x1.r0 r0 = r0.f20967q
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // v1.b1
    public final void B0(long r1, float r3, i1.b r4) {
            r0 = this;
            r3 = 0
            r0.T0(r1, r3, r4)
            return
    }

    @Override // v1.m0
    public final int G(int r2) {
            r1 = this;
            r1.R0()
            x1.j0 r0 = r1.f21025l
            x1.i1 r0 = r0.a()
            x1.o0 r0 = r0.p1()
            r0.getClass()
            int r2 = r0.G(r2)
            return r2
    }

    @Override // x1.a
    public final int H() {
            r1 = this;
            int r0 = r1.f21028o
            return r0
    }

    public final boolean J0() {
            r2 = this;
            x1.j0 r0 = r2.f21025l
            x1.f0 r1 = r0.f20951a
            boolean r1 = x1.k.q(r1)
            if (r1 != 0) goto L11
            boolean r0 = r0.f20953c
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public final void K0(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L8
            boolean r0 = r4.J0()
            if (r0 != 0) goto L36
        L8:
            if (r5 != 0) goto L11
            boolean r5 = r4.J0()
            if (r5 != 0) goto L11
            goto L36
        L11:
            x1.p0 r5 = x1.p0.f21020i
            r4.f21036w = r5
            x1.j0 r5 = r4.f21025l
            x1.f0 r5 = r5.f20951a
            j0.b r5 = r5.y()
            java.lang.Object[] r0 = r5.f6671g
            int r5 = r5.f6673i
            r1 = 0
        L22:
            if (r1 >= r5) goto L36
            r2 = r0[r1]
            x1.f0 r2 = (x1.f0) r2
            x1.j0 r2 = r2.M
            x1.r0 r2 = r2.f20967q
            r2.getClass()
            r3 = 1
            r2.K0(r3)
            int r1 = r1 + 1
            goto L22
        L36:
            return
    }

    @Override // v1.m0
    public final int M(int r2) {
            r1 = this;
            r1.R0()
            x1.j0 r0 = r1.f21025l
            x1.i1 r0 = r0.a()
            x1.o0 r0 = r0.p1()
            r0.getClass()
            int r2 = r0.M(r2)
            return r2
    }

    public final void M0() {
            r7 = this;
            x1.p0 r0 = r7.f21036w
            x1.j0 r1 = r7.f21025l
            boolean r2 = r1.f20953c
            x1.f0 r3 = r1.f20951a
            x1.p0 r4 = x1.p0.f21018g
            if (r2 == 0) goto L11
            x1.p0 r2 = x1.p0.f21019h
            r7.f21036w = r2
            goto L13
        L11:
            r7.f21036w = r4
        L13:
            if (r0 == r4) goto L1e
            boolean r0 = r1.f20955e
            if (r0 == 0) goto L1e
            r0 = 6
            r1 = 1
            x1.f0.T(r3, r1, r0)
        L1e:
            j0.b r0 = r3.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L27:
            if (r2 >= r0) goto L48
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.j0 r4 = r3.M
            x1.r0 r4 = r4.f20967q
            if (r4 == 0) goto L43
            int r5 = r4.f21028o
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L40
            r4.M0()
            x1.f0.W(r3)
        L40:
            int r2 = r2 + 1
            goto L27
        L43:
            java.lang.String r0 = "Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope."
            j8.o.t(r0)
        L48:
            return
    }

    public final void N0() {
            r7 = this;
            x1.j0 r0 = r7.f21025l
            int r1 = r0.f20965o
            if (r1 <= 0) goto L33
            x1.f0 r0 = r0.f20951a
            j0.b r0 = r0.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r0) goto L33
            r4 = r1[r3]
            x1.f0 r4 = (x1.f0) r4
            x1.j0 r5 = r4.M
            boolean r6 = r5.f20963m
            if (r6 != 0) goto L22
            boolean r6 = r5.f20964n
            if (r6 == 0) goto L29
        L22:
            boolean r6 = r5.f20956f
            if (r6 != 0) goto L29
            r4.S(r2)
        L29:
            x1.r0 r4 = r5.f20967q
            if (r4 == 0) goto L30
            r4.N0()
        L30:
            int r3 = r3 + 1
            goto L12
        L33:
            return
    }

    @Override // v1.m0
    public final v1.b1 Q(long r6) {
            r5 = this;
            x1.j0 r0 = r5.f21025l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            x1.f0 r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            x1.j0 r1 = r1.M
            x1.b0 r1 = r1.f20954d
            goto L13
        L12:
            r1 = r3
        L13:
            x1.b0 r4 = x1.b0.f20834h
            if (r1 == r4) goto L25
            x1.f0 r1 = r2.u()
            if (r1 == 0) goto L21
            x1.j0 r1 = r1.M
            x1.b0 r3 = r1.f20954d
        L21:
            x1.b0 r1 = x1.b0.f20836j
            if (r3 != r1) goto L28
        L25:
            r1 = 0
            r0.f20952b = r1
        L28:
            x1.f0 r0 = r2.u()
            x1.d0 r1 = x1.d0.f20870i
            if (r0 == 0) goto L63
            x1.j0 r0 = r0.M
            x1.d0 r3 = r5.f21029p
            if (r3 == r1) goto L40
            boolean r3 = r2.K
            if (r3 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r3 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            u1.a.b(r3)
        L40:
            x1.b0 r3 = r0.f20954d
            int r3 = r3.ordinal()
            if (r3 == 0) goto L5e
            r4 = 1
            if (r3 == r4) goto L5e
            r4 = 2
            if (r3 == r4) goto L5b
            r4 = 3
            if (r3 != r4) goto L52
            goto L5b
        L52:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            x1.b0 r7 = r0.f20954d
            okio.a.l(r7, r6)
            r6 = 0
            return r6
        L5b:
            x1.d0 r0 = x1.d0.f20869h
            goto L60
        L5e:
            x1.d0 r0 = x1.d0.f20868g
        L60:
            r5.f21029p = r0
            goto L65
        L63:
            r5.f21029p = r1
        L65:
            x1.d0 r0 = r2.I
            if (r0 != r1) goto L6c
            r2.e()
        L6c:
            r5.X0(r6)
            return r5
    }

    public final void R0() {
            r4 = this;
            x1.j0 r0 = r4.f21025l
            x1.f0 r1 = r0.f20951a
            r2 = 0
            r3 = 7
            x1.f0.T(r1, r2, r3)
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

    public final void S0() {
            r6 = this;
            r0 = 1
            r6.H = r0
            x1.j0 r1 = r6.f21025l
            x1.f0 r2 = r1.f20951a
            x1.f0 r2 = r2.u()
            x1.p0 r3 = r6.f21036w
            x1.p0 r4 = x1.p0.f21018g
            r5 = 0
            if (r3 == r4) goto L16
            boolean r4 = r1.f20953c
            if (r4 == 0) goto L1e
        L16:
            x1.p0 r4 = x1.p0.f21019h
            if (r3 == r4) goto L2a
            boolean r1 = r1.f20953c
            if (r1 == 0) goto L2a
        L1e:
            r6.M0()
            boolean r1 = r6.f21026m
            if (r1 == 0) goto L2a
            if (r2 == 0) goto L2a
            r2.S(r5)
        L2a:
            if (r2 == 0) goto L51
            x1.j0 r1 = r2.M
            boolean r2 = r6.f21026m
            if (r2 != 0) goto L53
            x1.b0 r2 = r1.f20954d
            x1.b0 r3 = x1.b0.f20835i
            if (r2 == r3) goto L3c
            x1.b0 r3 = x1.b0.f20836j
            if (r2 != r3) goto L53
        L3c:
            int r2 = r6.f21028o
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L44
            goto L49
        L44:
            java.lang.String r2 = "Place was called on a node which was placed already"
            u1.a.b(r2)
        L49:
            int r2 = r1.f20958h
            r6.f21028o = r2
            int r2 = r2 + r0
            r1.f20958h = r2
            goto L53
        L51:
            r6.f21028o = r5
        L53:
            r6.h0()
            return
    }

    public final void T0(long r10, fg.l r12, i1.b r13) {
            r9 = this;
            x1.j0 r0 = r9.f21025l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            r3 = 0
            x1.f0 r4 = r1.u()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            x1.j0 r4 = r4.M     // Catch: java.lang.Throwable -> L1b
            x1.b0 r4 = r4.f20954d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            x1.b0 r5 = x1.b0.f20836j     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1e
            r0.f20953c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L8e
        L1e:
            boolean r4 = r2.W     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L27
            java.lang.String r4 = "place is called on a deactivated node"
            u1.a.a(r4)     // Catch: java.lang.Throwable -> L1b
        L27:
            r0.f20954d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.f21030q = r4     // Catch: java.lang.Throwable -> L1b
            r9.H = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f21033t     // Catch: java.lang.Throwable -> L1b
            boolean r5 = u2.j.b(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L43
            boolean r5 = r0.f20964n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3e
            boolean r5 = r0.f20963m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L40
        L3e:
            r0.f20956f = r4     // Catch: java.lang.Throwable -> L1b
        L40:
            r9.N0()     // Catch: java.lang.Throwable -> L1b
        L43:
            x1.r1 r5 = x1.i0.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f21033t = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f20956f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6f
            x1.p0 r7 = r9.f21036w     // Catch: java.lang.Throwable -> L1b
            x1.p0 r8 = x1.p0.f21020i     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L54
            goto L55
        L54:
            r4 = r6
        L55:
            if (r4 == 0) goto L6f
            x1.i1 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            x1.o0 r2 = r2.p1()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f13904k     // Catch: java.lang.Throwable -> L1b
            long r10 = u2.j.d(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.i1(r10)     // Catch: java.lang.Throwable -> L1b
            r9.S0()     // Catch: java.lang.Throwable -> L1b
            goto L85
        L6f:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            x1.g0 r10 = r9.f21037x     // Catch: java.lang.Throwable -> L1b
            r10.f20919e = r6     // Catch: java.lang.Throwable -> L1b
            y1.t r5 = (y1.t) r5     // Catch: java.lang.Throwable -> L1b
            x1.t1 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            x1.q0 r11 = r9.G     // Catch: java.lang.Throwable -> L1b
            x1.d r4 = r10.f21072g     // Catch: java.lang.Throwable -> L1b
            w0.s r10 = r10.f21066a     // Catch: java.lang.Throwable -> L1b
            r10.c(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L85:
            r9.f21034u = r12     // Catch: java.lang.Throwable -> L1b
            r9.f21035v = r13     // Catch: java.lang.Throwable -> L1b
            x1.b0 r10 = x1.b0.f20837k     // Catch: java.lang.Throwable -> L1b
            r0.f20954d = r10     // Catch: java.lang.Throwable -> L1b
            return
        L8e:
            r1.Y(r10)
            throw r3
    }

    @Override // v1.b1, v1.m0
    public final java.lang.Object X() {
            r1 = this;
            java.lang.Object r0 = r1.D
            return r0
    }

    public final boolean X0(long r13) {
            r12 = this;
            x1.j0 r0 = r12.f21025l
            x1.f0 r1 = r0.f20951a
            x1.f0 r2 = r0.f20951a
            boolean r3 = r1.W     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            u1.a.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lc2
        L13:
            x1.f0 r3 = r2.u()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.K     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.K     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.K = r3     // Catch: java.lang.Throwable -> L10
            x1.j0 r3 = r2.M     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.f20955e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            u2.a r3 = r12.f21032s     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.f13338a     // Catch: java.lang.Throwable -> L10
            boolean r3 = u2.a.b(r3, r13)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            x1.r1 r13 = r2.f20902t     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            y1.t r13 = (y1.t) r13     // Catch: java.lang.Throwable -> L10
            r13.n(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            u2.a r3 = new u2.a     // Catch: java.lang.Throwable -> L10
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L10
            r12.f21032s = r3     // Catch: java.lang.Throwable -> L10
            r12.E0(r13)     // Catch: java.lang.Throwable -> L10
            x1.g0 r3 = r12.f21037x     // Catch: java.lang.Throwable -> L10
            r3.f20918d = r6     // Catch: java.lang.Throwable -> L10
            j0.b r2 = r2.y()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.f6671g     // Catch: java.lang.Throwable -> L10
            int r2 = r2.f6673i     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L77
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            x1.f0 r7 = (x1.f0) r7     // Catch: java.lang.Throwable -> L10
            x1.j0 r7 = r7.M     // Catch: java.lang.Throwable -> L10
            x1.r0 r7 = r7.f20967q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            x1.g0 r7 = r7.f21037x     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L77:
            boolean r2 = r12.f21031r     // Catch: java.lang.Throwable -> L10
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r2 == 0) goto L85
            long r8 = r12.f13902i     // Catch: java.lang.Throwable -> L10
            goto L8c
        L85:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L10
            long r10 = r8 << r7
            long r8 = r8 & r3
            long r8 = r8 | r10
        L8c:
            r12.f21031r = r5     // Catch: java.lang.Throwable -> L10
            x1.i1 r2 = r0.a()     // Catch: java.lang.Throwable -> L10
            x1.o0 r2 = r2.p1()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L9a
            r10 = r5
            goto L9b
        L9a:
            r10 = r6
        L9b:
            if (r10 != 0) goto La2
            java.lang.String r10 = "Lookahead result from lookaheadRemeasure cannot be null"
            u1.a.b(r10)     // Catch: java.lang.Throwable -> L10
        La2:
            r0.c(r13)     // Catch: java.lang.Throwable -> L10
            int r13 = r2.f13900g     // Catch: java.lang.Throwable -> L10
            int r14 = r2.f13901h     // Catch: java.lang.Throwable -> L10
            long r10 = (long) r13     // Catch: java.lang.Throwable -> L10
            long r10 = r10 << r7
            long r13 = (long) r14     // Catch: java.lang.Throwable -> L10
            long r13 = r13 & r3
            long r13 = r13 | r10
            r12.C0(r13)     // Catch: java.lang.Throwable -> L10
            long r13 = r8 >> r7
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r2.f13900g     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lc1
            long r13 = r8 & r3
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r2.f13901h     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lc0
            goto Lc1
        Lc0:
            return r6
        Lc1:
            return r5
        Lc2:
            r1.Y(r13)
            r13 = 0
            throw r13
    }

    @Override // x1.a
    public final void c0(b1.f r5) {
            r4 = this;
            x1.j0 r0 = r4.f21025l
            x1.f0 r0 = r0.f20951a
            j0.b r0 = r0.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        Ld:
            if (r2 >= r0) goto L20
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.j0 r3 = r3.M
            x1.r0 r3 = r3.f20967q
            r3.getClass()
            r5.invoke(r3)
            int r2 = r2 + 1
            goto Ld
        L20:
            return
    }

    @Override // x1.a
    public final x1.g0 e() {
            r1 = this;
            x1.g0 r0 = r1.f21037x
            return r0
    }

    @Override // x1.y0
    public final void f0(boolean r4) {
            r3 = this;
            x1.j0 r0 = r3.f21025l
            x1.i1 r1 = r0.a()
            x1.o0 r1 = r1.p1()
            if (r1 == 0) goto L13
            boolean r1 = r1.f20997o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2a
            x1.i1 r0 = r0.a()
            x1.o0 r0 = r0.p1()
            if (r0 == 0) goto L2a
            r0.f20997o = r4
        L2a:
            return
    }

    @Override // x1.a
    public final void h0() {
            r10 = this;
            r0 = 1
            r10.A = r0
            x1.g0 r0 = r10.f21037x
            r0.h()
            x1.j0 r1 = r10.f21025l
            boolean r2 = r1.f20956f
            x1.f0 r3 = r1.f20951a
            r4 = 0
            if (r2 == 0) goto L4d
            j0.b r2 = r3.y()
            java.lang.Object[] r5 = r2.f6671g
            int r2 = r2.f6673i
            r6 = r4
        L1a:
            if (r6 >= r2) goto L4d
            r7 = r5[r6]
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r8 = r7.M
            boolean r9 = r8.f20955e
            if (r9 == 0) goto L4a
            x1.d0 r7 = r7.s()
            x1.d0 r9 = x1.d0.f20868g
            if (r7 != r9) goto L4a
            x1.r0 r7 = r8.f20967q
            r7.getClass()
            x1.r0 r8 = r8.f20967q
            if (r8 == 0) goto L3a
            u2.a r8 = r8.f21032s
            goto L3b
        L3a:
            r8 = 0
        L3b:
            r8.getClass()
            long r8 = r8.f13338a
            boolean r7 = r7.X0(r8)
            if (r7 == 0) goto L4a
            r7 = 7
            x1.f0.T(r3, r4, r7)
        L4a:
            int r6 = r6 + 1
            goto L1a
        L4d:
            x1.r r2 = r10.A()
            x1.q r2 = r2.Z
            r2.getClass()
            boolean r5 = r1.f20957g
            if (r5 != 0) goto L62
            boolean r5 = r2.f20999q
            if (r5 != 0) goto L8f
            boolean r5 = r1.f20956f
            if (r5 == 0) goto L8f
        L62:
            r1.f20956f = r4
            x1.b0 r5 = r1.f20954d
            x1.b0 r6 = x1.b0.f20836j
            r1.f20954d = r6
            r1.i(r4)
            x1.r1 r6 = x1.i0.a(r3)
            y1.t r6 = (y1.t) r6
            x1.t1 r6 = r6.getSnapshotObserver()
            x1.d r7 = r6.f21073h
            w0.s r6 = r6.f21066a
            x1.q0 r8 = r10.B
            r6.c(r3, r7, r8)
            r1.f20954d = r5
            boolean r3 = r1.f20963m
            if (r3 == 0) goto L8d
            boolean r2 = r2.f20999q
            if (r2 == 0) goto L8d
            r10.requestLayout()
        L8d:
            r1.f20957g = r4
        L8f:
            boolean r1 = r0.f20916b
            if (r1 == 0) goto L9c
            boolean r1 = r0.e()
            if (r1 == 0) goto L9c
            r0.g()
        L9c:
            r10.A = r4
            return
    }

    @Override // v1.m0
    public final int j(int r2) {
            r1 = this;
            r1.R0()
            x1.j0 r0 = r1.f21025l
            x1.i1 r0 = r0.a()
            x1.o0 r0 = r0.p1()
            r0.getClass()
            int r2 = r0.j(r2)
            return r2
    }

    @Override // x1.a
    public final void o0() {
            r3 = this;
            x1.j0 r0 = r3.f21025l
            x1.f0 r0 = r0.f20951a
            r1 = 0
            r2 = 7
            x1.f0.T(r0, r1, r2)
            return
    }

    @Override // v1.m0
    public final int p0(int r2) {
            r1 = this;
            r1.R0()
            x1.j0 r0 = r1.f21025l
            x1.i1 r0 = r0.a()
            x1.o0 r0 = r0.p1()
            r0.getClass()
            int r2 = r0.p0(r2)
            return r2
    }

    @Override // x1.a
    public final void requestLayout() {
            r2 = this;
            x1.j0 r0 = r2.f21025l
            x1.f0 r0 = r0.f20951a
            r1 = 0
            r0.S(r1)
            return
    }
}
