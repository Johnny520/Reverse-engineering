package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements i0.h, x1.s1, x1.g {
    public static final x1.a0 X = null;
    public static final x1.z Y = null;
    public static final b8.c Z = null;
    public final j0.b A;
    public boolean B;
    public v1.n0 C;
    public p4.t D;
    public u2.c E;
    public u2.m F;
    public y1.l2 G;
    public i0.t H;
    public x1.d0 I;
    public x1.d0 J;
    public boolean K;
    public final x1.b1 L;
    public final x1.j0 M;
    public v1.j0 N;
    public x1.i1 O;
    public boolean P;
    public y0.o Q;
    public y0.o R;
    public x2.c S;
    public s1.b0 T;
    public boolean U;
    public int V;
    public boolean W;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1.f0 f20896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p4.t f20898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j0.b f20899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x1.f0 f20901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x1.r1 f20902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2.v f20903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f2.m f20907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20908z;

    static {
            x1.a0 r0 = new x1.a0
            java.lang.String r1 = "Undefined intrinsics block and it is required"
            r0.<init>(r1)
            x1.f0.X = r0
            x1.z r0 = new x1.z
            r0.<init>()
            x1.f0.Y = r0
            b8.c r0 = new b8.c
            r1 = 12
            r0.<init>(r1)
            x1.f0.Z = r0
            return
    }

    public f0(int r3) {
            r2 = this;
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto L6
            r3 = 0
            goto L7
        L6:
            r3 = r0
        L7:
            java.util.concurrent.atomic.AtomicInteger r1 = f2.o.f3208a
            int r0 = r1.addAndGet(r0)
            r2.<init>(r0, r3)
            return
    }

    public f0(int r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r4.f20889g = r6
            r4.f20890h = r5
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r4.f20892j = r5
            r5 = 1
            r4.f20893k = r5
            r4.f20894l = r5
            p4.t r6 = new p4.t
            j0.b r0 = new j0.b
            r1 = 16
            x1.f0[] r2 = new x1.f0[r1]
            r0.<init>(r2)
            d1.c0 r2 = new d1.c0
            r3 = 16
            r2.<init>(r4, r3)
            r3 = 17
            r6.<init>(r0, r3, r2)
            r4.f20898p = r6
            j0.b r6 = new j0.b
            x1.f0[] r0 = new x1.f0[r1]
            r6.<init>(r0)
            r4.A = r6
            r4.B = r5
            x1.a0 r6 = x1.f0.X
            r4.C = r6
            u2.d r6 = x1.i0.f20942a
            r4.E = r6
            u2.m r6 = u2.m.f13354g
            r4.F = r6
            x1.z r6 = x1.f0.Y
            r4.G = r6
            i0.s r6 = i0.t.f6044b
            r6.getClass()
            s0.h r6 = i0.s.f6040b
            r4.H = r6
            x1.d0 r6 = x1.d0.f20870i
            r4.I = r6
            r4.J = r6
            x1.b1 r6 = new x1.b1
            r6.<init>(r4)
            r4.L = r6
            x1.j0 r6 = new x1.j0
            r6.<init>(r4)
            r4.M = r6
            r4.P = r5
            y0.l r5 = y0.l.f21818a
            r4.Q = r5
            return
    }

    public static void T(x1.f0 r4, boolean r5, int r6) {
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r6 & 2
            r2 = 1
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r6 = r6 & 4
            if (r6 == 0) goto L13
            r1 = r2
        L13:
            x1.f0 r6 = r4.f20896n
            if (r6 == 0) goto L18
            goto L1d
        L18:
            java.lang.String r6 = "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"
            u1.a.b(r6)
        L1d:
            x1.r1 r6 = r4.f20902t
            if (r6 != 0) goto L22
            goto L7d
        L22:
            boolean r3 = r4.f20905w
            if (r3 != 0) goto L7d
            boolean r3 = r4.f20889g
            if (r3 != 0) goto L7d
            y1.t r6 = (y1.t) r6
            r6.C(r4, r2, r5, r0)
            if (r1 == 0) goto L7d
            x1.j0 r4 = r4.M
            x1.r0 r4 = r4.f20967q
            r4.getClass()
            x1.j0 r4 = r4.f21025l
            x1.f0 r6 = r4.f20951a
            x1.f0 r6 = r6.u()
            x1.f0 r4 = r4.f20951a
            x1.d0 r4 = r4.I
            if (r6 == 0) goto L7d
            x1.d0 r0 = x1.d0.f20870i
            if (r4 == r0) goto L7d
        L4a:
            x1.d0 r0 = r6.I
            if (r0 != r4) goto L57
            x1.f0 r0 = r6.u()
            if (r0 != 0) goto L55
            goto L57
        L55:
            r6 = r0
            goto L4a
        L57:
            int r4 = r4.ordinal()
            if (r4 == 0) goto L71
            if (r4 != r2) goto L6b
            x1.f0 r4 = r6.f20896n
            if (r4 == 0) goto L67
            r6.S(r5)
            return
        L67:
            r6.U(r5)
            return
        L6b:
            java.lang.String r4 = "Intrinsics isn't used by the parent"
            j8.o.A(r4)
            return
        L71:
            x1.f0 r4 = r6.f20896n
            r0 = 6
            if (r4 == 0) goto L7a
            T(r6, r5, r0)
            return
        L7a:
            V(r6, r5, r0)
        L7d:
            return
    }

    public static void V(x1.f0 r4, boolean r5, int r6) {
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r6 & 2
            r2 = 1
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r6 = r6 & 4
            if (r6 == 0) goto L14
            r6 = r2
            goto L15
        L14:
            r6 = r1
        L15:
            boolean r3 = r4.f20905w
            if (r3 != 0) goto L62
            boolean r3 = r4.f20889g
            if (r3 != 0) goto L62
            x1.r1 r3 = r4.f20902t
            if (r3 != 0) goto L22
            goto L62
        L22:
            y1.t r3 = (y1.t) r3
            r3.C(r4, r1, r5, r0)
            if (r6 == 0) goto L62
            x1.j0 r4 = r4.M
            x1.v0 r4 = r4.f20966p
            x1.j0 r4 = r4.f21076l
            x1.f0 r6 = r4.f20951a
            x1.f0 r6 = r6.u()
            x1.f0 r4 = r4.f20951a
            x1.d0 r4 = r4.I
            if (r6 == 0) goto L62
            x1.d0 r0 = x1.d0.f20870i
            if (r4 == r0) goto L62
        L3f:
            x1.d0 r0 = r6.I
            if (r0 != r4) goto L4c
            x1.f0 r0 = r6.u()
            if (r0 != 0) goto L4a
            goto L4c
        L4a:
            r6 = r0
            goto L3f
        L4c:
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5e
            if (r4 != r2) goto L58
            r6.U(r5)
            return
        L58:
            java.lang.String r4 = "Intrinsics isn't used by the parent"
            j8.o.A(r4)
            return
        L5e:
            r4 = 6
            V(r6, r5, r4)
        L62:
            return
    }

    public static void W(x1.f0 r4) {
            x1.j0 r0 = r4.M
            x1.b0 r0 = r0.f20954d
            int[] r1 = x1.e0.f20881a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            x1.j0 r1 = r4.M
            r2 = 1
            if (r0 != r2) goto L35
            boolean r0 = r1.f20955e
            r3 = 6
            if (r0 == 0) goto L1a
            T(r4, r2, r3)
            return
        L1a:
            boolean r0 = r1.f20956f
            if (r0 == 0) goto L21
            r4.S(r2)
        L21:
            boolean r0 = r4.q()
            if (r0 == 0) goto L2b
            V(r4, r2, r3)
            return
        L2b:
            boolean r0 = r4.p()
            if (r0 == 0) goto L34
            r4.U(r2)
        L34:
            return
        L35:
            java.lang.String r4 = "Unexpected state "
            x1.b0 r0 = r1.f20954d
            okio.a.l(r0, r4)
            return
    }

    private final java.lang.String j(x1.f0 r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot insert "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " because it already has a parent or an owner. This tree: "
            r0.append(r1)
            r1 = 0
            java.lang.String r2 = r3.g(r1)
            r0.append(r2)
            java.lang.String r2 = " Other tree: "
            r0.append(r2)
            x1.f0 r4 = r4.f20901s
            if (r4 == 0) goto L25
            java.lang.String r4 = r4.g(r1)
            goto L26
        L25:
            r4 = 0
        L26:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final void A(int r3, x1.f0 r4) {
            r2 = this;
            x1.f0 r0 = r4.f20901s
            if (r0 == 0) goto L10
            x1.r1 r0 = r4.f20902t
            if (r0 != 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = r2.j(r4)
            u1.a.b(r0)
        L10:
            r4.f20901s = r2
            p4.t r0 = r2.f20898p
            java.lang.Object r1 = r0.f10224h
            j0.b r1 = (j0.b) r1
            r1.a(r3, r4)
            java.lang.Object r3 = r0.f10225i
            d1.c0 r3 = (d1.c0) r3
            r3.invoke()
            r2.O()
            boolean r3 = r4.f20889g
            if (r3 == 0) goto L2f
            int r3 = r2.f20897o
            int r3 = r3 + 1
            r2.f20897o = r3
        L2f:
            r2.F()
            x1.r1 r3 = r2.f20902t
            if (r3 == 0) goto L39
            r4.d(r3)
        L39:
            x1.j0 r3 = r4.M
            int r3 = r3.f20962l
            if (r3 <= 0) goto L48
            x1.j0 r3 = r2.M
            int r0 = r3.f20962l
            int r0 = r0 + 1
            r3.d(r0)
        L48:
            int r3 = r4.V
            if (r3 <= 0) goto L53
            int r3 = r2.V
            int r3 = r3 + 1
            r2.a0(r3)
        L53:
            return
    }

    public final void B() {
            r4 = this;
            boolean r0 = r4.P
            if (r0 == 0) goto L2a
            x1.b1 r0 = r4.L
            x1.r r1 = r0.f20841c
            x1.i1 r0 = r0.f20842d
            x1.i1 r0 = r0.f20945w
            r2 = 0
            r4.O = r2
        Lf:
            boolean r3 = gg.l.a(r1, r0)
            if (r3 != 0) goto L27
            if (r1 == 0) goto L1a
            x1.q1 r3 = r1.R
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L20
            r4.O = r1
            goto L27
        L20:
            if (r1 == 0) goto L25
            x1.i1 r1 = r1.f20945w
            goto Lf
        L25:
            r1 = r2
            goto Lf
        L27:
            r0 = 0
            r4.P = r0
        L2a:
            x1.i1 r0 = r4.O
            if (r0 == 0) goto L3a
            x1.q1 r1 = r0.R
            if (r1 == 0) goto L33
            goto L3a
        L33:
            java.lang.String r0 = "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"
            af.d r0 = wb.en.a(r0)
            throw r0
        L3a:
            if (r0 == 0) goto L40
            r0.y1()
            return
        L40:
            x1.f0 r0 = r4.u()
            if (r0 == 0) goto L4a
            r0.B()
            return
        L4a:
            x1.r1 r0 = r4.f20902t
            if (r0 == 0) goto L53
            y1.t r0 = (y1.t) r0
            r0.invalidate()
        L53:
            return
    }

    public final void C() {
            r4 = this;
            x1.b1 r0 = r4.L
            x1.i1 r1 = r0.f20842d
            x1.r r2 = r0.f20841c
        L6:
            if (r1 == r2) goto L19
            r1.getClass()
            x1.x r1 = (x1.x) r1
            x1.q1 r3 = r1.R
            if (r3 == 0) goto L16
            y1.o1 r3 = (y1.o1) r3
            r3.c()
        L16:
            x1.i1 r1 = r1.f20944v
            goto L6
        L19:
            x1.r r0 = r0.f20841c
            x1.q1 r0 = r0.R
            if (r0 == 0) goto L24
            y1.o1 r0 = (y1.o1) r0
            r0.c()
        L24:
            return
    }

    public final void D() {
            r3 = this;
            boolean r0 = r3.f20889g
            if (r0 == 0) goto Le
            x1.f0 r0 = r3.u()
            if (r0 == 0) goto Ld
            r0.D()
        Ld:
            return
        Le:
            x1.f0 r0 = r3.f20896n
            r1 = 7
            r2 = 0
            if (r0 == 0) goto L18
            T(r3, r2, r1)
            return
        L18:
            V(r3, r2, r1)
            return
    }

    public final void E() {
            r5 = this;
            boolean r0 = r5.f20908z
            if (r0 == 0) goto L5
            return
        L5:
            x1.b1 r0 = r5.L
            x1.a1 r0 = r0.f20840b
            y0.n r0 = r0.f21824l
            r1 = 1
            if (r0 == 0) goto Lf
            goto L13
        Lf:
            y0.o r0 = r5.R
            if (r0 == 0) goto L16
        L13:
            r5.f20906x = r1
            return
        L16:
            f2.m r0 = r5.f20907y
            r5.f20908z = r1
            gg.u r1 = new gg.u
            r1.<init>()
            f2.m r2 = new f2.m
            r2.<init>()
            r1.f4564g = r2
            x1.r1 r2 = x1.i0.a(r5)
            y1.t r2 = (y1.t) r2
            x1.t1 r2 = r2.getSnapshotObserver()
            c1.b r3 = new c1.b
            r4 = 4
            r3.<init>(r5, r4, r1)
            x1.d r4 = r2.f21069d
            w0.s r2 = r2.f21066a
            r2.c(r5, r4, r3)
            r2 = 0
            r5.f20908z = r2
            java.lang.Object r1 = r1.f4564g
            f2.m r1 = (f2.m) r1
            r5.f20907y = r1
            r5.f20906x = r2
            x1.r1 r1 = x1.i0.a(r5)
            y1.t r1 = (y1.t) r1
            f2.s r2 = r1.getSemanticsOwner()
            r2.b(r5, r0)
            r1.E()
            return
    }

    public final void F() {
            r1 = this;
            int r0 = r1.f20897o
            if (r0 <= 0) goto L7
            r0 = 1
            r1.f20900r = r0
        L7:
            boolean r0 = r1.f20889g
            if (r0 == 0) goto L12
            x1.f0 r0 = r1.f20901s
            if (r0 == 0) goto L12
            r0.F()
        L12:
            return
    }

    public final boolean G() {
            r1 = this;
            x1.r1 r0 = r1.f20902t
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean H() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            boolean r0 = r0.f21089y
            return r0
    }

    public final java.lang.Boolean I() {
            r2 = this;
            x1.j0 r0 = r2.M
            x1.r0 r0 = r0.f20967q
            if (r0 == 0) goto L14
            x1.p0 r0 = r0.f21036w
            x1.p0 r1 = x1.p0.f21020i
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final void J() {
            r7 = this;
            x1.d0 r0 = r7.I
            x1.d0 r1 = x1.d0.f20870i
            if (r0 != r1) goto L9
            r7.f()
        L9:
            x1.j0 r0 = r7.M
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            r1 = 1
            r2 = 0
            r0.f21026m = r1     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r0.f21030q     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L20
            java.lang.String r3 = "replace() called on item that was not placed"
            u1.a.b(r3)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r1 = move-exception
            goto L49
        L20:
            r0.H = r2     // Catch: java.lang.Throwable -> L1e
            x1.p0 r3 = r0.f21036w     // Catch: java.lang.Throwable -> L1e
            x1.p0 r4 = x1.p0.f21020i     // Catch: java.lang.Throwable -> L1e
            if (r3 == r4) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            long r3 = r0.f21033t     // Catch: java.lang.Throwable -> L1e
            fg.l r5 = r0.f21034u     // Catch: java.lang.Throwable -> L1e
            i1.b r6 = r0.f21035v     // Catch: java.lang.Throwable -> L1e
            r0.T0(r3, r5, r6)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L46
            boolean r1 = r0.H     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L46
            x1.j0 r1 = r0.f21025l     // Catch: java.lang.Throwable -> L1e
            x1.f0 r1 = r1.f20951a     // Catch: java.lang.Throwable -> L1e
            x1.f0 r1 = r1.u()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L46
            r1.S(r2)     // Catch: java.lang.Throwable -> L1e
        L46:
            r0.f21026m = r2
            return
        L49:
            r0.f21026m = r2
            throw r1
    }

    public final void K(int r7, int r8, int r9) {
            r6 = this;
            if (r7 != r8) goto L3
            return
        L3:
            r0 = 0
        L4:
            if (r0 >= r9) goto L35
            if (r7 <= r8) goto Lb
            int r1 = r7 + r0
            goto Lc
        Lb:
            r1 = r7
        Lc:
            if (r7 <= r8) goto L11
            int r2 = r8 + r0
            goto L15
        L11:
            int r2 = r8 + r9
            int r2 = r2 + (-2)
        L15:
            p4.t r3 = r6.f20898p
            java.lang.Object r4 = r3.f10224h
            j0.b r4 = (j0.b) r4
            java.lang.Object r5 = r3.f10225i
            d1.c0 r5 = (d1.c0) r5
            java.lang.Object r1 = r4.k(r1)
            r5.invoke()
            x1.f0 r1 = (x1.f0) r1
            java.lang.Object r3 = r3.f10224h
            j0.b r3 = (j0.b) r3
            r3.a(r2, r1)
            r5.invoke()
            int r0 = r0 + 1
            goto L4
        L35:
            r6.O()
            r6.F()
            r6.D()
            return
    }

    @Override // x1.s1
    public final boolean L() {
            r1 = this;
            boolean r0 = r1.G()
            return r0
    }

    public final void M(x1.f0 r5) {
            r4 = this;
            x1.j0 r0 = r5.M
            int r0 = r0.f20962l
            if (r0 <= 0) goto Lf
            x1.j0 r0 = r4.M
            int r1 = r0.f20962l
            int r1 = r1 + (-1)
            r0.d(r1)
        Lf:
            x1.r1 r0 = r4.f20902t
            if (r0 == 0) goto L16
            r5.h()
        L16:
            r0 = 0
            r5.f20901s = r0
            int r1 = r5.V
            if (r1 <= 0) goto L24
            int r1 = r4.V
            int r1 = r1 + (-1)
            r4.a0(r1)
        L24:
            x1.b1 r1 = r5.L
            x1.i1 r1 = r1.f20842d
            r1.f20945w = r0
            boolean r1 = r5.f20889g
            if (r1 == 0) goto L4e
            int r1 = r4.f20897o
            int r1 = r1 + (-1)
            r4.f20897o = r1
            p4.t r5 = r5.f20898p
            java.lang.Object r5 = r5.f10224h
            j0.b r5 = (j0.b) r5
            java.lang.Object[] r1 = r5.f6671g
            int r5 = r5.f6673i
            r2 = 0
        L3f:
            if (r2 >= r5) goto L4e
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.b1 r3 = r3.L
            x1.i1 r3 = r3.f20842d
            r3.f20945w = r0
            int r2 = r2 + 1
            goto L3f
        L4e:
            r4.F()
            r4.O()
            return
    }

    public final void N(x1.i1 r12) {
            r11 = this;
            x1.r1 r0 = r11.f20902t
            if (r0 == 0) goto Lb
            y1.t r0 = (y1.t) r0
            g2.b r0 = r0.getRectManager()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            x1.j0 r1 = r11.M
            x1.b0 r2 = r1.f20954d
            x1.b0 r3 = x1.b0.f20837k
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L25
            boolean r2 = r11.q()
            if (r2 != 0) goto L25
            boolean r2 = r11.p()
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = r4
            goto L26
        L25:
            r2 = r5
        L26:
            boolean r3 = r11.f20895m
            if (r3 == 0) goto L8c
            if (r0 == 0) goto L8c
            x1.b1 r3 = r11.L
            x1.i1 r3 = r3.f20842d
            if (r12 != r3) goto L3a
            r11.f20894l = r5
            if (r2 != 0) goto L8c
            r0.f(r11)
            goto L8c
        L3a:
            r11.f20893k = r5
            j0.b r12 = r11.y()
            java.lang.Object[] r3 = r12.f6671g
            int r12 = r12.f6673i
            r6 = r4
        L45:
            if (r6 >= r12) goto L55
            r7 = r3[r6]
            x1.f0 r7 = (x1.f0) r7
            r7.f20894l = r5
            if (r2 != 0) goto L52
            r0.f(r7)
        L52:
            int r6 = r6 + 1
            goto L45
        L55:
            boolean r12 = r11.f20895m
            if (r12 == 0) goto L89
            r0.f4150e = r5
            ac.k r12 = r0.f4147b
            int r2 = r11.f20890h
            r3 = 33554431(0x1ffffff, float:9.403954E-38)
            r2 = r2 & r3
            java.lang.Object r5 = r12.f178i
            long[] r5 = (long[]) r5
            int r12 = r12.f177h
        L69:
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r4 >= r6) goto L89
            if (r4 >= r12) goto L89
            int r6 = r4 + 2
            r7 = r5[r6]
            int r9 = (int) r7
            r9 = r9 & r3
            if (r9 != r2) goto L86
            r12 = 63
            long r2 = r7 >> r12
            r9 = 1
            long r2 = r2 & r9
            r12 = 60
            long r2 = r2 << r12
            long r2 = r2 | r7
            r5[r6] = r2
            goto L89
        L86:
            int r4 = r4 + 3
            goto L69
        L89:
            r0.i()
        L8c:
            x1.v0 r12 = r1.f20966p
            r12.Y0()
            return
    }

    public final void O() {
            r1 = this;
            boolean r0 = r1.f20889g
            if (r0 == 0) goto Le
            x1.f0 r0 = r1.u()
            if (r0 == 0) goto Ld
            r0.O()
        Ld:
            return
        Le:
            r0 = 1
            r1.B = r0
            return
    }

    public final void P() {
            r4 = this;
            p4.t r0 = r4.f20898p
            java.lang.Object r1 = r0.f10224h
            j0.b r1 = (j0.b) r1
            int r1 = r1.f6673i
            int r1 = r1 + (-1)
        La:
            java.lang.Object r2 = r0.f10224h
            j0.b r2 = (j0.b) r2
            r3 = -1
            if (r3 >= r1) goto L1d
            java.lang.Object[] r2 = r2.f6671g
            r2 = r2[r1]
            x1.f0 r2 = (x1.f0) r2
            r4.M(r2)
            int r1 = r1 + (-1)
            goto La
        L1d:
            r2.g()
            java.lang.Object r0 = r0.f10225i
            d1.c0 r0 = (d1.c0) r0
            r0.invoke()
            return
    }

    public final void Q(int r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L3
            goto L19
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "count ("
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ") must be greater than 0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.a(r0)
        L19:
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            if (r3 > r4) goto L43
        L1e:
            p4.t r0 = r2.f20898p
            java.lang.Object r1 = r0.f10224h
            j0.b r1 = (j0.b) r1
            java.lang.Object[] r1 = r1.f6671g
            r1 = r1[r4]
            x1.f0 r1 = (x1.f0) r1
            r2.M(r1)
            java.lang.Object r1 = r0.f10224h
            j0.b r1 = (j0.b) r1
            java.lang.Object r1 = r1.k(r4)
            java.lang.Object r0 = r0.f10225i
            d1.c0 r0 = (d1.c0) r0
            r0.invoke()
            x1.f0 r1 = (x1.f0) r1
            if (r4 == r3) goto L43
            int r4 = r4 + (-1)
            goto L1e
        L43:
            return
    }

    public final void R() {
            r9 = this;
            x1.d0 r0 = r9.I
            x1.d0 r1 = x1.d0.f20870i
            if (r0 != r1) goto L9
            r9.f()
        L9:
            x1.j0 r0 = r9.M
            x1.v0 r1 = r0.f20966p
            x1.j0 r7 = r1.f21076l
            r8 = 0
            r0 = 1
            r1.f21077m = r0     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r1.f21081q     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            java.lang.String r0 = "replace called on unplaced item"
            u1.a.b(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L40
        L1f:
            boolean r0 = r1.f21089y     // Catch: java.lang.Throwable -> L1d
            long r2 = r1.f21083s     // Catch: java.lang.Throwable -> L1d
            float r4 = r1.f21086v     // Catch: java.lang.Throwable -> L1d
            fg.l r5 = r1.f21084t     // Catch: java.lang.Throwable -> L1d
            i1.b r6 = r1.f21085u     // Catch: java.lang.Throwable -> L1d
            r1.S0(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L3d
            boolean r0 = r1.L     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L3d
            x1.f0 r0 = r7.f20951a     // Catch: java.lang.Throwable -> L1d
            x1.f0 r0 = r0.u()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L3d
            r0.U(r8)     // Catch: java.lang.Throwable -> L1d
        L3d:
            r1.f21077m = r8
            return
        L40:
            x1.f0 r2 = r7.f20951a     // Catch: java.lang.Throwable -> L47
            r2.Y(r0)     // Catch: java.lang.Throwable -> L47
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            r1.f21077m = r8
            throw r0
    }

    public final void S(boolean r3) {
            r2 = this;
            boolean r0 = r2.f20889g
            if (r0 != 0) goto Le
            x1.r1 r0 = r2.f20902t
            if (r0 == 0) goto Le
            r1 = 1
            y1.t r0 = (y1.t) r0
            r0.D(r2, r1, r3)
        Le:
            return
    }

    public final void U(boolean r3) {
            r2 = this;
            boolean r0 = r2.f20889g
            if (r0 != 0) goto Le
            x1.r1 r0 = r2.f20902t
            if (r0 == 0) goto Le
            r1 = 0
            y1.t r0 = (y1.t) r0
            r0.D(r2, r1, r3)
        Le:
            return
    }

    public final void X() {
            r6 = this;
            j0.b r0 = r6.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L9:
            if (r2 >= r0) goto L1d
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.d0 r4 = r3.J
            r3.I = r4
            x1.d0 r5 = x1.d0.f20870i
            if (r4 == r5) goto L1a
            r3.X()
        L1a:
            int r2 = r2 + 1
            goto L9
        L1d:
            return
    }

    public final void Y(java.lang.Throwable r4) {
            r3 = this;
            i0.t r0 = r3.H
            i0.m2 r1 = x0.e.f20827a
            s0.h r0 = (s0.h) r0
            r0.getClass()
            java.lang.Object r0 = i0.r.v(r0, r1)
            x0.d r0 = (x0.d) r0
            if (r0 == 0) goto L1b
            wb.xi r1 = new wb.xi
            r2 = 24
            r1.<init>(r0, r2, r3)
            ig.a.b0(r4, r1)
        L1b:
            throw r4
    }

    public final void Z(u2.c r2) {
            r1 = this;
            u2.c r0 = r1.E
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L2f
            r1.E = r2
            r1.D()
            x1.f0 r2 = r1.u()
            if (r2 == 0) goto L17
            r2.B()
            goto L20
        L17:
            x1.r1 r2 = r1.f20902t
            if (r2 == 0) goto L20
            y1.t r2 = (y1.t) r2
            r2.invalidate()
        L20:
            r1.C()
            x1.b1 r2 = r1.L
            y0.n r2 = r2.f20844f
        L27:
            if (r2 == 0) goto L2f
            r2.m()
            y0.n r2 = r2.f21824l
            goto L27
        L2f:
            return
    }

    @Override // i0.h
    public final void a() {
            r3 = this;
            x2.v r0 = r3.f20903u
            if (r0 == 0) goto L7
            r0.a()
        L7:
            v1.j0 r0 = r3.N
            if (r0 == 0) goto Le
            r0.a()
        Le:
            x1.b1 r0 = r3.L
            x1.i1 r1 = r0.f20842d
            x1.r r0 = r0.f20841c
            x1.i1 r0 = r0.f20944v
        L16:
            boolean r2 = gg.l.a(r1, r0)
            if (r2 != 0) goto L24
            if (r1 == 0) goto L24
            r1.D1()
            x1.i1 r1 = r1.f20944v
            goto L16
        L24:
            return
    }

    public final void a0(int r3) {
            r2 = this;
            int r0 = r2.V
            if (r0 == r3) goto L2a
            if (r3 <= 0) goto L15
            if (r0 != 0) goto L15
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L15
            int r1 = r0.V
            int r1 = r1 + 1
            r0.a0(r1)
        L15:
            if (r3 != 0) goto L28
            int r0 = r2.V
            if (r0 <= 0) goto L28
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L28
            int r1 = r0.V
            int r1 = r1 + (-1)
            r0.a0(r1)
        L28:
            r2.V = r3
        L2a:
            return
    }

    @Override // i0.h
    public final void b() {
            r4 = this;
            x2.v r0 = r4.f20903u
            if (r0 == 0) goto L7
            r0.b()
        L7:
            v1.j0 r0 = r4.N
            r1 = 1
            if (r0 == 0) goto Lf
            r0.i(r1)
        Lf:
            r4.W = r1
            x1.b1 r0 = r4.L
            x1.b2 r0 = r0.f20843e
            r1 = r0
        L16:
            if (r1 == 0) goto L22
            boolean r2 = r1.f21832t
            if (r2 == 0) goto L1f
            r1.f1()
        L1f:
            y0.n r1 = r1.f21823k
            goto L16
        L22:
            r1 = r0
        L23:
            if (r1 == 0) goto L2f
            boolean r2 = r1.f21832t
            if (r2 == 0) goto L2c
            r1.h1()
        L2c:
            y0.n r1 = r1.f21823k
            goto L23
        L2f:
            if (r0 == 0) goto L3b
            boolean r1 = r0.f21832t
            if (r1 == 0) goto L38
            r0.b1()
        L38:
            y0.n r0 = r0.f21823k
            goto L2f
        L3b:
            boolean r0 = r4.G()
            r1 = 0
            if (r0 == 0) goto L47
            r0 = 0
            r4.f20907y = r0
            r4.f20906x = r1
        L47:
            x1.r1 r0 = r4.f20902t
            if (r0 == 0) goto L64
            y1.t r0 = (y1.t) r0
            z0.c r0 = r0.T
            if (r0 == 0) goto L64
            f.x r2 = r0.f22485n
            int r3 = r4.f20890h
            boolean r2 = r2.e(r3)
            if (r2 == 0) goto L64
            xe.e r2 = r0.f22478g
            y1.t r0 = r0.f22480i
            int r3 = r4.f20890h
            r2.b(r0, r3, r1)
        L64:
            return
    }

    public final void b0(x1.f0 r3) {
            r2 = this;
            x1.f0 r0 = r2.f20896n
            boolean r0 = gg.l.a(r3, r0)
            if (r0 != 0) goto L3a
            r2.f20896n = r3
            x1.j0 r0 = r2.M
            if (r3 == 0) goto L2f
            x1.r0 r3 = r0.f20967q
            if (r3 != 0) goto L19
            x1.r0 r3 = new x1.r0
            r3.<init>(r0)
            r0.f20967q = r3
        L19:
            x1.b1 r3 = r2.L
            x1.i1 r0 = r3.f20842d
            x1.r r3 = r3.f20841c
            x1.i1 r3 = r3.f20944v
        L21:
            boolean r1 = gg.l.a(r0, r3)
            if (r1 != 0) goto L37
            if (r0 == 0) goto L37
            r0.m1()
            x1.i1 r0 = r0.f20944v
            goto L21
        L2f:
            r3 = 0
            r0.f20967q = r3
            r3 = 0
            r0.f20956f = r3
            r0.f20955e = r3
        L37:
            r2.D()
        L3a:
            return
    }

    public final void c(y0.o r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            x1.b1 r2 = r0.L
            r7 = 16
            boolean r8 = r2.d(r7)
            x1.b2 r9 = r2.f20843e
            r10 = 1024(0x400, float:1.435E-42)
            boolean r11 = r2.d(r10)
            r0.Q = r1
            x1.r r3 = r2.f20841c
            x1.f0 r4 = r2.f20839a
            y0.n r5 = r2.f20844f
            x1.a1 r12 = r2.f20840b
            if (r5 == r12) goto L21
            goto L26
        L21:
            java.lang.String r5 = "padChain called on already padded chain"
            u1.a.b(r5)
        L26:
            y0.n r5 = r2.f20844f
            r5.f21823k = r12
            r12.f21824l = r5
            r5 = r3
            j0.b r3 = r2.f20845g
            if (r3 == 0) goto L34
            int r6 = r3.f6673i
            goto L35
        L34:
            r6 = 0
        L35:
            j0.b r14 = r2.f20846h
            if (r14 != 0) goto L40
            j0.b r14 = new j0.b
            y0.m[] r15 = new y0.m[r7]
            r14.<init>(r15)
        L40:
            j0.b r15 = r2.f20847i
            r15.b(r1)
            r16 = 0
        L47:
            int r1 = r15.f6673i
            if (r1 == 0) goto L80
            int r1 = r1 + (-1)
            java.lang.Object r1 = r15.k(r1)
            y0.o r1 = (y0.o) r1
            boolean r13 = r1 instanceof y0.i
            if (r13 == 0) goto L64
            y0.i r1 = (y0.i) r1
            y0.o r13 = r1.f21815b
            r15.b(r13)
            y0.o r1 = r1.f21814a
            r15.b(r1)
            goto L7d
        L64:
            boolean r13 = r1 instanceof y0.m
            if (r13 == 0) goto L6c
            r14.b(r1)
            goto L7d
        L6c:
            if (r16 != 0) goto L78
            b1.f r13 = new b1.f
            r10 = 17
            r13.<init>(r14, r10)
            r16 = r13
            goto L7a
        L78:
            r13 = r16
        L7a:
            r1.a(r13)
        L7d:
            r10 = 1024(0x400, float:1.435E-42)
            goto L47
        L80:
            int r1 = r14.f6673i
            java.lang.String r13 = "expected prior modifier list to be non-empty"
            if (r1 != r6) goto L108
            y0.n r1 = r12.f21824l
            r5 = r2
            r2 = 0
        L8a:
            if (r1 == 0) goto Ld2
            if (r2 >= r6) goto Ld2
            if (r3 == 0) goto Lcd
            r16 = 2
            java.lang.Object[] r10 = r3.f6671g
            r10 = r10[r2]
            y0.m r10 = (y0.m) r10
            java.lang.Object[] r7 = r14.f6671g
            r7 = r7[r2]
            y0.m r7 = (y0.m) r7
            boolean r17 = gg.l.a(r10, r7)
            if (r17 == 0) goto La9
            r18 = r3
            r3 = r16
            goto Lb8
        La9:
            java.lang.Class r15 = r10.getClass()
            r18 = r3
            java.lang.Class r3 = r7.getClass()
            if (r15 != r3) goto Lb7
            r3 = 1
            goto Lb8
        Lb7:
            r3 = 0
        Lb8:
            if (r3 == 0) goto Lca
            r15 = 1
            if (r3 == r15) goto Lbe
            goto Lc1
        Lbe:
            x1.b1.h(r10, r7, r1)
        Lc1:
            y0.n r1 = r1.f21824l
            int r2 = r2 + 1
            r3 = r18
            r7 = 16
            goto L8a
        Lca:
            y0.n r1 = r1.f21823k
            goto Ld6
        Lcd:
            af.d r1 = wb.en.a(r13)
            throw r1
        Ld2:
            r18 = r3
            r16 = 2
        Ld6:
            if (r2 >= r6) goto L103
            if (r18 == 0) goto Lfe
            if (r1 == 0) goto Lf7
            y0.o r3 = r4.R
            if (r3 == 0) goto Le4
            r17 = 1
        Le2:
            r15 = 1
            goto Le7
        Le4:
            r17 = 0
            goto Le2
        Le7:
            r6 = r17 ^ 1
            r3 = r5
            r5 = r1
            r1 = r3
            r4 = r14
            r3 = r18
            r7 = 0
            r1.f(r2, r3, r4, r5, r6)
            r5 = r12
        Lf4:
            r15 = 1
            goto L185
        Lf7:
            java.lang.String r1 = "structuralUpdate requires a non-null tail"
            af.d r1 = wb.en.a(r1)
            throw r1
        Lfe:
            af.d r1 = wb.en.a(r13)
            throw r1
        L103:
            r2 = r5
            r3 = r18
            r7 = 0
            goto L15d
        L108:
            r7 = 0
            r16 = 2
            y0.o r10 = r4.R
            if (r10 == 0) goto L137
            if (r6 != 0) goto L137
            r4 = r12
            r1 = 0
        L113:
            int r5 = r14.f6673i
            if (r1 >= r5) goto L124
            java.lang.Object[] r5 = r14.f6671g
            r5 = r5[r1]
            y0.m r5 = (y0.m) r5
            y0.n r4 = x1.b1.b(r5, r4)
            int r1 = r1 + 1
            goto L113
        L124:
            y0.n r1 = r9.f21823k
            r4 = 0
        L127:
            if (r1 == 0) goto L133
            if (r1 == r12) goto L133
            int r5 = r1.f21821i
            r4 = r4 | r5
            r1.f21822j = r4
            y0.n r1 = r1.f21823k
            goto L127
        L133:
            r1 = r2
            r5 = r12
            r4 = r14
            goto Lf4
        L137:
            if (r1 != 0) goto L167
            if (r3 == 0) goto L162
            y0.n r1 = r12.f21824l
            r6 = 0
        L13e:
            if (r1 == 0) goto L14d
            int r10 = r3.f6673i
            if (r6 >= r10) goto L14d
            y0.n r1 = x1.b1.c(r1)
            y0.n r1 = r1.f21824l
            int r6 = r6 + 1
            goto L13e
        L14d:
            x1.f0 r1 = r4.u()
            if (r1 == 0) goto L158
            x1.b1 r1 = r1.L
            x1.r r1 = r1.f20841c
            goto L159
        L158:
            r1 = r7
        L159:
            r5.f20945w = r1
            r2.f20842d = r5
        L15d:
            r1 = r2
            r5 = r12
            r4 = r14
            r15 = 0
            goto L185
        L162:
            af.d r1 = wb.en.a(r13)
            throw r1
        L167:
            if (r3 != 0) goto L172
            j0.b r3 = new j0.b
            r1 = 16
            y0.m[] r4 = new y0.m[r1]
            r3.<init>(r4)
        L172:
            if (r10 == 0) goto L178
            r15 = 1
        L175:
            r17 = 1
            goto L17a
        L178:
            r15 = 0
            goto L175
        L17a:
            r6 = r15 ^ 1
            r1 = r2
            r2 = 0
            r5 = r12
            r4 = r14
            r1.f(r2, r3, r4, r5, r6)
            r15 = r17
        L185:
            r1.f20845g = r4
            if (r3 == 0) goto L18d
            r3.g()
            goto L18e
        L18d:
            r3 = r7
        L18e:
            r1.f20846h = r3
            y0.n r2 = r5.f21824l
            if (r2 != 0) goto L195
            goto L196
        L195:
            r9 = r2
        L196:
            r9.f21823k = r7
            r5.f21824l = r7
            r2 = -1
            r5.f21822j = r2
            r5.f21826n = r7
            if (r9 == r5) goto L1a2
            goto L1a7
        L1a2:
            java.lang.String r2 = "trimChain did not update the head"
            u1.a.b(r2)
        L1a7:
            r1.f20844f = r9
            if (r15 == 0) goto L1ae
            r1.g()
        L1ae:
            r2 = 16
            boolean r2 = r1.d(r2)
            r3 = 1024(0x400, float:1.435E-42)
            boolean r3 = r1.d(r3)
            x1.j0 r4 = r0.M
            r4.j()
            x1.f0 r4 = r0.f20896n
            if (r4 != 0) goto L1ce
            r4 = 512(0x200, float:7.17E-43)
            boolean r1 = r1.d(r4)
            if (r1 == 0) goto L1ce
            r0.b0(r0)
        L1ce:
            if (r8 != r2) goto L1d2
            if (r11 == r3) goto L21a
        L1d2:
            x1.r1 r1 = x1.i0.a(r0)
            y1.t r1 = (y1.t) r1
            g2.b r1 = r1.getRectManager()
            r1.getClass()
            boolean r4 = r0.G()
            if (r4 == 0) goto L21a
            ac.k r1 = r1.f4147b
            int r4 = r0.f20890h
            r5 = 33554431(0x1ffffff, float:9.403954E-38)
            r4 = r4 & r5
            java.lang.Object r6 = r1.f178i
            long[] r6 = (long[]) r6
            int r1 = r1.f177h
            r13 = 0
        L1f4:
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r13 >= r7) goto L21a
            if (r13 >= r1) goto L21a
            int r7 = r13 + 2
            r8 = r6[r7]
            int r10 = (int) r8
            r10 = r10 & r5
            if (r10 != r4) goto L217
            r4 = -6917529027641081857(0x9fffffffffffffff, double:-1.4916681462400412E-154)
            long r4 = r4 & r8
            r8 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r10 = (long) r3
            long r10 = r10 * r8
            long r3 = r4 | r10
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = (long) r2
            long r1 = r1 * r8
            long r1 = r1 | r3
            r6[r7] = r1
            return
        L217:
            int r13 = r13 + 3
            goto L1f4
        L21a:
            return
    }

    public final void c0(v1.n0 r2) {
            r1 = this;
            v1.n0 r0 = r1.C
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L18
            r1.C = r2
            p4.t r0 = r1.D
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.f10225i
            i0.j1 r0 = (i0.j1) r0
            r0.setValue(r2)
        L15:
            r1.D()
        L18:
            return
    }

    public final void d(x1.r1 r10) {
            r9 = this;
            x1.r1 r0 = r9.f20902t
            r1 = 0
            if (r0 != 0) goto L6
            goto L23
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot attach "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r2 = " as it already is attached.  Tree: "
            r0.append(r2)
            java.lang.String r2 = r9.g(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L23:
            x1.f0 r0 = r9.f20901s
            r2 = 0
            if (r0 == 0) goto L72
            x1.r1 r0 = r0.f20902t
            boolean r0 = gg.l.a(r0, r10)
            if (r0 == 0) goto L31
            goto L72
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Attaching to a different owner("
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r3 = ") than the parent's owner("
            r0.append(r3)
            x1.f0 r3 = r9.u()
            if (r3 == 0) goto L49
            x1.r1 r3 = r3.f20902t
            goto L4a
        L49:
            r3 = r2
        L4a:
            r0.append(r3)
            java.lang.String r3 = "). This tree: "
            r0.append(r3)
            java.lang.String r3 = r9.g(r1)
            r0.append(r3)
            java.lang.String r3 = " Parent tree: "
            r0.append(r3)
            x1.f0 r3 = r9.f20901s
            if (r3 == 0) goto L67
            java.lang.String r3 = r3.g(r1)
            goto L68
        L67:
            r3 = r2
        L68:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L72:
            x1.f0 r0 = r9.u()
            x1.j0 r3 = r9.M
            r4 = 1
            if (r0 != 0) goto L91
            x1.v0 r5 = r3.f20966p
            r5.f21089y = r4
            r5 = r10
            y1.t r5 = (y1.t) r5
            g2.b r5 = r5.getRectManager()
            r5.f(r9)
            x1.r0 r5 = r3.f20967q
            if (r5 == 0) goto L91
            x1.p0 r6 = x1.p0.f21018g
            r5.f21036w = r6
        L91:
            x1.b1 r5 = r9.L
            x1.i1 r6 = r5.f20842d
            if (r0 == 0) goto L9c
            x1.b1 r7 = r0.L
            x1.r r7 = r7.f20841c
            goto L9d
        L9c:
            r7 = r2
        L9d:
            r6.f20945w = r7
            r9.f20902t = r10
            if (r0 == 0) goto La6
            int r6 = r0.f20904v
            goto La7
        La6:
            r6 = -1
        La7:
            int r6 = r6 + r4
            r9.f20904v = r6
            y0.o r6 = r9.R
            if (r6 == 0) goto Lb1
            r9.c(r6)
        Lb1:
            r9.R = r2
            r2 = r10
            y1.t r2 = (y1.t) r2
            f.w r6 = r2.m184getLayoutNodes()
            int r7 = r9.f20890h
            r6.h(r7, r9)
            x1.f0 r6 = r9.f20901s
            if (r6 == 0) goto Lc7
            x1.f0 r6 = r6.f20896n
            if (r6 != 0) goto Lc9
        Lc7:
            x1.f0 r6 = r9.f20896n
        Lc9:
            r9.b0(r6)
            x1.f0 r6 = r9.f20896n
            if (r6 != 0) goto Ldb
            r6 = 512(0x200, float:7.17E-43)
            boolean r6 = r5.d(r6)
            if (r6 == 0) goto Ldb
            r9.b0(r9)
        Ldb:
            boolean r6 = r9.W
            if (r6 != 0) goto Le9
            y0.n r6 = r5.f20844f
        Le1:
            if (r6 == 0) goto Le9
            r6.a1()
            y0.n r6 = r6.f21824l
            goto Le1
        Le9:
            p4.t r6 = r9.f20898p
            java.lang.Object r6 = r6.f10224h
            j0.b r6 = (j0.b) r6
            java.lang.Object[] r7 = r6.f6671g
            int r6 = r6.f6673i
        Lf3:
            if (r1 >= r6) goto Lff
            r8 = r7[r1]
            x1.f0 r8 = (x1.f0) r8
            r8.d(r10)
            int r1 = r1 + 1
            goto Lf3
        Lff:
            boolean r1 = r9.W
            if (r1 != 0) goto L106
            r5.e()
        L106:
            r9.D()
            if (r0 == 0) goto L10e
            r0.D()
        L10e:
            x2.c r0 = r9.S
            if (r0 == 0) goto L115
            r0.invoke(r10)
        L115:
            r3.j()
            boolean r10 = r9.W
            if (r10 != 0) goto L127
            r10 = 8
            boolean r10 = r5.d(r10)
            if (r10 == 0) goto L127
            r9.E()
        L127:
            z0.c r10 = r2.T
            if (r10 == 0) goto L14b
            f2.m r0 = r9.w()
            if (r0 == 0) goto L14b
            f.k0 r0 = r0.f3204g
            f2.x r1 = f2.u.f3239q
            boolean r0 = r0.b(r1)
            if (r0 != r4) goto L14b
            f.x r0 = r10.f22485n
            int r1 = r9.f20890h
            r0.a(r1)
            xe.e r0 = r10.f22478g
            y1.t r10 = r10.f22480i
            int r1 = r9.f20890h
            r0.b(r10, r1, r4)
        L14b:
            return
    }

    public final void d0(y0.o r3) {
            r2 = this;
            boolean r0 = r2.f20889g
            if (r0 == 0) goto L10
            y0.o r0 = r2.Q
            y0.l r1 = y0.l.f21818a
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "Modifiers are not supported on virtual LayoutNodes"
            u1.a.a(r0)
        L10:
            boolean r0 = r2.W
            if (r0 == 0) goto L19
            java.lang.String r0 = "modifier is updated when deactivated"
            u1.a.a(r0)
        L19:
            boolean r0 = r2.G()
            if (r0 == 0) goto L2a
            r2.c(r3)
            boolean r3 = r2.f20906x
            if (r3 == 0) goto L29
            r2.E()
        L29:
            return
        L2a:
            r2.R = r3
            return
    }

    public final void e() {
            r6 = this;
            x1.d0 r0 = r6.I
            r6.J = r0
            x1.d0 r0 = x1.d0.f20870i
            r6.I = r0
            j0.b r1 = r6.y()
            java.lang.Object[] r2 = r1.f6671g
            int r1 = r1.f6673i
            r3 = 0
        L11:
            if (r3 >= r1) goto L21
            r4 = r2[r3]
            x1.f0 r4 = (x1.f0) r4
            x1.d0 r5 = r4.I
            if (r5 == r0) goto L1e
            r4.e()
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            return
    }

    public final void e0(y1.l2 r9) {
            r8 = this;
            y1.l2 r0 = r8.G
            boolean r0 = gg.l.a(r0, r9)
            if (r0 != 0) goto L6d
            r8.G = r9
            x1.b1 r9 = r8.L
            y0.n r9 = r9.f20844f
            int r0 = r9.f21822j
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L6d
        L15:
            if (r9 == 0) goto L6d
            int r0 = r9.f21821i
            r0 = r0 & r1
            if (r0 == 0) goto L65
            r0 = 0
            r2 = r9
            r3 = r0
        L1f:
            if (r2 == 0) goto L65
            boolean r4 = r2 instanceof x1.w1
            if (r4 == 0) goto L2b
            x1.w1 r2 = (x1.w1) r2
            r2.N0()
            goto L60
        L2b:
            int r4 = r2.f21821i
            r4 = r4 & r1
            if (r4 == 0) goto L60
            boolean r4 = r2 instanceof x1.j
            if (r4 == 0) goto L60
            r4 = r2
            x1.j r4 = (x1.j) r4
            y0.n r4 = r4.f20950v
            r5 = 0
        L3a:
            r6 = 1
            if (r4 == 0) goto L5d
            int r7 = r4.f21821i
            r7 = r7 & r1
            if (r7 == 0) goto L5a
            int r5 = r5 + 1
            if (r5 != r6) goto L48
            r2 = r4
            goto L5a
        L48:
            if (r3 != 0) goto L51
            j0.b r3 = new j0.b
            y0.n[] r6 = new y0.n[r1]
            r3.<init>(r6)
        L51:
            if (r2 == 0) goto L57
            r3.b(r2)
            r2 = r0
        L57:
            r3.b(r4)
        L5a:
            y0.n r4 = r4.f21824l
            goto L3a
        L5d:
            if (r5 != r6) goto L60
            goto L1f
        L60:
            y0.n r2 = x1.k.e(r3)
            goto L1f
        L65:
            int r0 = r9.f21822j
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            y0.n r9 = r9.f21824l
            goto L15
        L6d:
            return
    }

    public final void f() {
            r6 = this;
            x1.d0 r0 = r6.I
            r6.J = r0
            x1.d0 r0 = x1.d0.f20870i
            r6.I = r0
            j0.b r0 = r6.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L11:
            if (r2 >= r0) goto L23
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.d0 r4 = r3.I
            x1.d0 r5 = x1.d0.f20869h
            if (r4 != r5) goto L20
            r3.f()
        L20:
            int r2 = r2 + 1
            goto L11
        L23:
            return
    }

    public final void f0() {
            r6 = this;
            int r0 = r6.f20897o
            if (r0 <= 0) goto L4e
            boolean r0 = r6.f20900r
            if (r0 == 0) goto L4e
            r0 = 0
            r6.f20900r = r0
            j0.b r1 = r6.f20899q
            if (r1 != 0) goto L1a
            j0.b r1 = new j0.b
            r2 = 16
            x1.f0[] r2 = new x1.f0[r2]
            r1.<init>(r2)
            r6.f20899q = r1
        L1a:
            r1.g()
            p4.t r2 = r6.f20898p
            java.lang.Object r2 = r2.f10224h
            j0.b r2 = (j0.b) r2
            java.lang.Object[] r3 = r2.f6671g
            int r2 = r2.f6673i
        L27:
            if (r0 >= r2) goto L41
            r4 = r3[r0]
            x1.f0 r4 = (x1.f0) r4
            boolean r5 = r4.f20889g
            if (r5 == 0) goto L3b
            j0.b r4 = r4.y()
            int r5 = r1.f6673i
            r1.c(r5, r4)
            goto L3e
        L3b:
            r1.b(r4)
        L3e:
            int r0 = r0 + 1
            goto L27
        L41:
            x1.j0 r0 = r6.M
            x1.v0 r1 = r0.f20966p
            r2 = 1
            r1.F = r2
            x1.r0 r0 = r0.f20967q
            if (r0 == 0) goto L4e
            r0.f21039z = r2
        L4e:
            return
    }

    public final java.lang.String g(int r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r8) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            j0.b r2 = r7.y()
            java.lang.Object[] r3 = r2.f6671g
            int r2 = r2.f6673i
            r4 = r1
        L2b:
            if (r4 >= r2) goto L3d
            r5 = r3[r4]
            x1.f0 r5 = (x1.f0) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.g(r6)
            r0.append(r5)
            int r4 = r4 + 1
            goto L2b
        L3d:
            java.lang.String r0 = r0.toString()
            if (r8 != 0) goto L49
            r8 = 1
            java.lang.String r8 = wb.en.f(r8, r1, r0)
            return r8
        L49:
            return r0
    }

    public final void h() {
            r11 = this;
            x1.r1 r0 = r11.f20902t
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot detach node that is already detached!  Tree: "
            r0.<init>(r3)
            x1.f0 r3 = r11.u()
            if (r3 == 0) goto L17
            java.lang.String r1 = r3.g(r2)
        L17:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.c(r0)
            okio.a.c()
            return
        L25:
            x1.f0 r3 = r11.u()
            x1.j0 r4 = r11.M
            if (r3 == 0) goto L3f
            r3.B()
            r3.D()
            x1.v0 r3 = r4.f20966p
            x1.d0 r5 = x1.d0.f20870i
            r3.f21082r = r5
            x1.r0 r3 = r4.f20967q
            if (r3 == 0) goto L3f
            r3.f21029p = r5
        L3f:
            x1.v0 r3 = r4.f20966p
            x1.g0 r3 = r3.D
            r5 = 1
            r3.f20916b = r5
            r3.f20917c = r2
            r3.f20918d = r2
            r3.f20919e = r2
            r3.f20920f = r1
            x1.r0 r3 = r4.f20967q
            if (r3 == 0) goto L60
            x1.g0 r3 = r3.f21037x
            if (r3 == 0) goto L60
            r3.f20916b = r5
            r3.f20917c = r2
            r3.f20918d = r2
            r3.f20919e = r2
            r3.f20920f = r1
        L60:
            x1.b1 r3 = r11.L
            x1.i1 r6 = r3.f20842d
            x1.b2 r7 = r3.f20843e
            x1.r r8 = r3.f20841c
            x1.i1 r8 = r8.f20944v
        L6a:
            boolean r9 = gg.l.a(r6, r8)
            if (r9 != 0) goto L83
            if (r6 == 0) goto L83
            r6.J1()
            x1.f0 r9 = r6.f20943u
            boolean r9 = r9.H()
            if (r9 == 0) goto L80
            r6.E1()
        L80:
            x1.i1 r6 = r6.f20944v
            goto L6a
        L83:
            s1.b0 r6 = r11.T
            if (r6 == 0) goto L8a
            r6.invoke(r0)
        L8a:
            r6 = r7
        L8b:
            if (r6 == 0) goto L97
            boolean r8 = r6.f21832t
            if (r8 == 0) goto L94
            r6.h1()
        L94:
            y0.n r6 = r6.f21823k
            goto L8b
        L97:
            r11.f20905w = r5
            p4.t r6 = r11.f20898p
            java.lang.Object r6 = r6.f10224h
            j0.b r6 = (j0.b) r6
            java.lang.Object[] r8 = r6.f6671g
            int r6 = r6.f6673i
            r9 = r2
        La4:
            if (r9 >= r6) goto Lb0
            r10 = r8[r9]
            x1.f0 r10 = (x1.f0) r10
            r10.h()
            int r9 = r9 + 1
            goto La4
        Lb0:
            r11.f20905w = r2
        Lb2:
            if (r7 == 0) goto Lbe
            boolean r6 = r7.f21832t
            if (r6 == 0) goto Lbb
            r7.b1()
        Lbb:
            y0.n r7 = r7.f21823k
            goto Lb2
        Lbe:
            y1.t r0 = (y1.t) r0
            f.w r6 = r0.m184getLayoutNodes()
            int r7 = r11.f20890h
            r6.g(r7)
            x1.t0 r6 = r0.f22080f0
            b5.c r7 = r6.f21058b
            java.lang.Object r8 = r7.f469a
            m.a r8 = (m.a) r8
            r8.u(r11)
            java.lang.Object r8 = r7.f470b
            m.a r8 = (m.a) r8
            r8.u(r11)
            java.lang.Object r7 = r7.f471c
            m.a r7 = (m.a) r7
            r7.u(r11)
            p4.t r6 = r6.f21061e
            java.lang.Object r6 = r6.f10224h
            j0.b r6 = (j0.b) r6
            r6.j(r11)
            r0.U = r5
            z0.c r5 = r0.T
            if (r5 == 0) goto L104
            f.x r6 = r5.f22485n
            int r7 = r11.f20890h
            boolean r6 = r6.e(r7)
            if (r6 == 0) goto L104
            xe.e r6 = r5.f22478g
            y1.t r5 = r5.f22480i
            int r7 = r11.f20890h
            r6.b(r5, r7, r2)
        L104:
            g2.b r5 = r0.getRectManager()
            r5.g(r11)
            r11.f20902t = r1
            r11.b0(r1)
            r11.f20904v = r2
            x1.v0 r5 = r4.f20966p
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5.f21079o = r6
            r5.f21078n = r6
            r5.f21089y = r2
            x1.r0 r4 = r4.f20967q
            if (r4 == 0) goto L129
            r4.f21028o = r6
            r4.f21027n = r6
            x1.p0 r5 = x1.p0.f21020i
            r4.f21036w = r5
        L129:
            r4 = 8
            boolean r3 = r3.d(r4)
            if (r3 == 0) goto L141
            f2.m r3 = r11.f20907y
            r11.f20907y = r1
            r11.f20906x = r2
            f2.s r1 = r0.getSemanticsOwner()
            r1.b(r11, r3)
            r0.E()
        L141:
            return
    }

    public final void i(f1.u r2, i1.b r3) {
            r1 = this;
            x1.b1 r0 = r1.L     // Catch: java.lang.Throwable -> L8
            x1.i1 r0 = r0.f20842d     // Catch: java.lang.Throwable -> L8
            r0.k1(r2, r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            r1.Y(r2)
            r2 = 0
            throw r2
    }

    public final void k() {
            r3 = this;
            x1.f0 r0 = r3.f20896n
            r1 = 5
            r2 = 0
            if (r0 == 0) goto La
            T(r3, r2, r1)
            goto Ld
        La:
            V(r3, r2, r1)
        Ld:
            x1.j0 r0 = r3.M
            x1.v0 r0 = r0.f20966p
            boolean r1 = r0.f21080p
            if (r1 == 0) goto L1d
            long r0 = r0.f13903j
            u2.a r2 = new u2.a
            r2.<init>(r0)
            goto L1e
        L1d:
            r2 = 0
        L1e:
            x1.r1 r0 = r3.f20902t
            if (r2 == 0) goto L2c
            if (r0 == 0) goto L34
            long r1 = r2.f13338a
            y1.t r0 = (y1.t) r0
            r0.y(r3, r1)
            return
        L2c:
            if (r0 == 0) goto L34
            r1 = 1
            y1.t r0 = (y1.t) r0
            r0.x(r1)
        L34:
            return
    }

    public final java.util.List l() {
            r10 = this;
            x1.j0 r0 = r10.M
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            j0.b r1 = r0.f21038y
            x1.j0 r2 = r0.f21025l
            x1.f0 r3 = r2.f20951a
            r3.n()
            boolean r3 = r0.f21039z
            if (r3 != 0) goto L19
            java.util.List r0 = r1.f()
            return r0
        L19:
            x1.f0 r2 = r2.f20951a
            j0.b r3 = r2.y()
            java.lang.Object[] r4 = r3.f6671g
            int r3 = r3.f6673i
            r5 = 0
            r6 = r5
        L25:
            if (r6 >= r3) goto L4a
            r7 = r4[r6]
            x1.f0 r7 = (x1.f0) r7
            int r8 = r1.f6673i
            if (r8 > r6) goto L3a
            x1.j0 r7 = r7.M
            x1.r0 r7 = r7.f20967q
            r7.getClass()
            r1.b(r7)
            goto L47
        L3a:
            x1.j0 r7 = r7.M
            x1.r0 r7 = r7.f20967q
            r7.getClass()
            java.lang.Object[] r8 = r1.f6671g
            r9 = r8[r6]
            r8[r6] = r7
        L47:
            int r6 = r6 + 1
            goto L25
        L4a:
            java.util.List r2 = r2.n()
            f.d0 r2 = (f.d0) r2
            java.lang.Object r2 = r2.f2789h
            j0.b r2 = (j0.b) r2
            int r2 = r2.f6673i
            int r3 = r1.f6673i
            r1.l(r2, r3)
            r0.f21039z = r5
            java.util.List r0 = r1.f()
            return r0
    }

    public final java.util.List m() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            java.util.List r0 = r0.J0()
            return r0
    }

    public final java.util.List n() {
            r1 = this;
            j0.b r0 = r1.y()
            java.util.List r0 = r0.f()
            return r0
    }

    public final java.util.List o() {
            r1 = this;
            p4.t r0 = r1.f20898p
            java.lang.Object r0 = r0.f10224h
            j0.b r0 = (j0.b) r0
            java.util.List r0 = r0.f()
            return r0
    }

    public final boolean p() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            boolean r0 = r0.B
            return r0
    }

    public final boolean q() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            boolean r0 = r0.A
            return r0
    }

    public final x1.d0 r() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            x1.d0 r0 = r0.f21082r
            return r0
    }

    public final x1.d0 s() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.r0 r0 = r0.f20967q
            if (r0 == 0) goto Lc
            x1.d0 r0 = r0.f21029p
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return r0
        Lc:
            x1.d0 r0 = x1.d0.f20870i
            return r0
    }

    public final p4.t t() {
            r2 = this;
            p4.t r0 = r2.D
            if (r0 != 0) goto Ld
            p4.t r0 = new p4.t
            v1.n0 r1 = r2.C
            r0.<init>(r2, r1)
            r2.D = r0
        Ld:
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = y1.g0.u(r2)
            r0.append(r1)
            java.lang.String r1 = " children: "
            r0.append(r1)
            java.util.List r1 = r2.n()
            f.d0 r1 = (f.d0) r1
            java.lang.Object r1 = r1.f2789h
            j0.b r1 = (j0.b) r1
            int r1 = r1.f6673i
            r0.append(r1)
            java.lang.String r1 = " measurePolicy: "
            r0.append(r1)
            v1.n0 r1 = r2.C
            r0.append(r1)
            java.lang.String r1 = " deactivated: "
            r0.append(r1)
            boolean r1 = r2.W
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final x1.f0 u() {
            r3 = this;
            x1.f0 r0 = r3.f20901s
        L2:
            if (r0 == 0) goto Lc
            boolean r1 = r0.f20889g
            r2 = 1
            if (r1 != r2) goto Lc
            x1.f0 r0 = r0.f20901s
            goto L2
        Lc:
            return r0
    }

    public final int v() {
            r1 = this;
            x1.j0 r0 = r1.M
            x1.v0 r0 = r0.f20966p
            int r0 = r0.f21079o
            return r0
    }

    public final f2.m w() {
            r2 = this;
            boolean r0 = r2.G()
            if (r0 == 0) goto L18
            boolean r0 = r2.W
            if (r0 != 0) goto L18
            x1.b1 r0 = r2.L
            r1 = 8
            boolean r0 = r0.d(r1)
            if (r0 != 0) goto L15
            goto L18
        L15:
            f2.m r0 = r2.f20907y
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final j0.b x() {
            r5 = this;
            boolean r0 = r5.B
            j0.b r1 = r5.A
            if (r0 == 0) goto L1e
            r1.g()
            j0.b r0 = r5.y()
            int r2 = r1.f6673i
            r1.c(r2, r0)
            java.lang.Object[] r0 = r1.f6671g
            int r2 = r1.f6673i
            r3 = 0
            b8.c r4 = x1.f0.Z
            java.util.Arrays.sort(r0, r3, r2, r4)
            r5.B = r3
        L1e:
            return r1
    }

    public final j0.b y() {
            r1 = this;
            r1.f0()
            int r0 = r1.f20897o
            if (r0 != 0) goto Le
            p4.t r0 = r1.f20898p
            java.lang.Object r0 = r0.f10224h
            j0.b r0 = (j0.b) r0
            return r0
        Le:
            j0.b r0 = r1.f20899q
            r0.getClass()
            return r0
    }

    public final void z(long r11, x1.p r13, int r14, boolean r15) {
            r10 = this;
            x1.b1 r0 = r10.L
            x1.i1 r1 = r0.f20842d
            f1.o0 r2 = x1.i1.T
            long r5 = r1.o1(r11)
            x1.i1 r3 = r0.f20842d
            x1.c1 r4 = x1.i1.W
            r7 = r13
            r8 = r14
            r9 = r15
            r3.w1(r4, r5, r7, r8, r9)
            return
    }
}
