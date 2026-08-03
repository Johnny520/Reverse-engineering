package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.f0 f20951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1.b0 f20954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1.v0 f20966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x1.r0 f20967q;

    public j0(x1.f0 r1) {
            r0 = this;
            r0.<init>()
            r0.f20951a = r1
            x1.b0 r1 = x1.b0.f20837k
            r0.f20954d = r1
            x1.v0 r1 = new x1.v0
            r1.<init>(r0)
            r0.f20966p = r1
            return
    }

    public final x1.i1 a() {
            r1 = this;
            x1.f0 r0 = r1.f20951a
            x1.b1 r0 = r0.L
            x1.i1 r0 = r0.f20842d
            return r0
    }

    public final void b() {
            r4 = this;
            x1.f0 r0 = r4.f20951a
            x1.j0 r0 = r0.M
            x1.b0 r0 = r0.f20954d
            x1.b0 r1 = x1.b0.f20835i
            x1.b0 r2 = x1.b0.f20836j
            r3 = 1
            if (r0 == r1) goto Lf
            if (r0 != r2) goto L1c
        Lf:
            x1.v0 r1 = r4.f20966p
            boolean r1 = r1.G
            if (r1 == 0) goto L19
            r4.g(r3)
            goto L1c
        L19:
            r4.f(r3)
        L1c:
            if (r0 != r2) goto L2d
            x1.r0 r0 = r4.f20967q
            if (r0 == 0) goto L2a
            boolean r0 = r0.A
            if (r0 != r3) goto L2a
            r4.i(r3)
            return
        L2a:
            r4.h(r3)
        L2d:
            return
    }

    public final void c(long r5) {
            r4 = this;
            x1.r0 r0 = r4.f20967q
            if (r0 == 0) goto L3c
            x1.j0 r1 = r0.f21025l
            x1.b0 r2 = x1.b0.f20834h
            r1.f20954d = r2
            x1.f0 r2 = r1.f20951a
            r3 = 0
            r1.f20955e = r3
            r0.E = r5
            x1.r1 r5 = x1.i0.a(r2)
            y1.t r5 = (y1.t) r5
            x1.t1 r5 = r5.getSnapshotObserver()
            x1.q0 r6 = r0.F
            x1.d r0 = r5.f21067b
            w0.s r5 = r5.f21066a
            r5.c(r2, r0, r6)
            r5 = 1
            r1.f20956f = r5
            r1.f20957g = r5
            boolean r6 = x1.k.q(r2)
            x1.v0 r0 = r1.f20966p
            if (r6 == 0) goto L36
            r0.B = r5
            r0.C = r5
            goto L38
        L36:
            r0.A = r5
        L38:
            x1.b0 r5 = x1.b0.f20837k
            r1.f20954d = r5
        L3c:
            return
    }

    public final void d(int r4) {
            r3 = this;
            int r0 = r3.f20962l
            r3.f20962l = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            x1.f0 r0 = r3.f20951a
            x1.f0 r0 = r0.u()
            if (r0 == 0) goto L1b
            x1.j0 r0 = r0.M
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L2c
            int r1 = r0.f20962l
            if (r4 != 0) goto L28
            int r1 = r1 + (-1)
            r0.d(r1)
            return
        L28:
            int r1 = r1 + r2
            r0.d(r1)
        L2c:
            return
    }

    public final void e(int r4) {
            r3 = this;
            int r0 = r3.f20965o
            r3.f20965o = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            x1.f0 r0 = r3.f20951a
            x1.f0 r0 = r0.u()
            if (r0 == 0) goto L1b
            x1.j0 r0 = r0.M
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L2c
            int r1 = r0.f20965o
            if (r4 != 0) goto L28
            int r1 = r1 + (-1)
            r0.e(r1)
            return
        L28:
            int r1 = r1 + r2
            r0.e(r1)
        L2c:
            return
    }

    public final void f(boolean r2) {
            r1 = this;
            boolean r0 = r1.f20961k
            if (r0 == r2) goto L21
            r1.f20961k = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f20960j
            if (r0 != 0) goto L14
            int r2 = r1.f20962l
            int r2 = r2 + 1
            r1.d(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f20960j
            if (r2 != 0) goto L21
            int r2 = r1.f20962l
            int r2 = r2 + (-1)
            r1.d(r2)
        L21:
            return
    }

    public final void g(boolean r2) {
            r1 = this;
            boolean r0 = r1.f20960j
            if (r0 == r2) goto L21
            r1.f20960j = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f20961k
            if (r0 != 0) goto L14
            int r2 = r1.f20962l
            int r2 = r2 + 1
            r1.d(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f20961k
            if (r2 != 0) goto L21
            int r2 = r1.f20962l
            int r2 = r2 + (-1)
            r1.d(r2)
        L21:
            return
    }

    public final void h(boolean r2) {
            r1 = this;
            boolean r0 = r1.f20964n
            if (r0 == r2) goto L21
            r1.f20964n = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f20963m
            if (r0 != 0) goto L14
            int r2 = r1.f20965o
            int r2 = r2 + 1
            r1.e(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f20963m
            if (r2 != 0) goto L21
            int r2 = r1.f20965o
            int r2 = r2 + (-1)
            r1.e(r2)
        L21:
            return
    }

    public final void i(boolean r2) {
            r1 = this;
            boolean r0 = r1.f20963m
            if (r0 == r2) goto L21
            r1.f20963m = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f20964n
            if (r0 != 0) goto L14
            int r2 = r1.f20965o
            int r2 = r2 + 1
            r1.e(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f20964n
            if (r2 != 0) goto L21
            int r2 = r1.f20965o
            int r2 = r2 + (-1)
            r1.e(r2)
        L21:
            return
    }

    public final void j() {
            r6 = this;
            x1.v0 r0 = r6.f20966p
            x1.j0 r1 = r0.f21076l
            java.lang.Object r2 = r0.f21088x
            r3 = 7
            x1.f0 r4 = r6.f20951a
            r5 = 0
            if (r2 != 0) goto L17
            x1.i1 r2 = r1.a()
            java.lang.Object r2 = r2.X()
            if (r2 != 0) goto L17
            goto L31
        L17:
            boolean r2 = r0.f21087w
            if (r2 != 0) goto L1c
            goto L31
        L1c:
            r0.f21087w = r5
            x1.i1 r1 = r1.a()
            java.lang.Object r1 = r1.X()
            r0.f21088x = r1
            x1.f0 r0 = r4.u()
            if (r0 == 0) goto L31
            x1.f0.V(r0, r5, r3)
        L31:
            x1.r0 r0 = r6.f20967q
            if (r0 == 0) goto L82
            x1.j0 r1 = r0.f21025l
            java.lang.Object r2 = r0.D
            if (r2 != 0) goto L4f
            x1.i1 r2 = r1.a()
            x1.o0 r2 = r2.p1()
            r2.getClass()
            x1.i1 r2 = r2.f21007u
            java.lang.Object r2 = r2.X()
            if (r2 != 0) goto L4f
            goto L82
        L4f:
            boolean r2 = r0.C
            if (r2 != 0) goto L54
            goto L82
        L54:
            r0.C = r5
            x1.i1 r1 = r1.a()
            x1.o0 r1 = r1.p1()
            r1.getClass()
            x1.i1 r1 = r1.f21007u
            java.lang.Object r1 = r1.X()
            r0.D = r1
            boolean r0 = x1.k.q(r4)
            if (r0 == 0) goto L79
            x1.f0 r0 = r4.u()
            if (r0 == 0) goto L82
            x1.f0.V(r0, r5, r3)
            return
        L79:
            x1.f0 r0 = r4.u()
            if (r0 == 0) goto L82
            x1.f0.T(r0, r5, r3)
        L82:
            return
    }
}
