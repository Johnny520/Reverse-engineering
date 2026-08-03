package oh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements mh.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f9845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile mh.b f9846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f9847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.reflect.Method f9848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nh.a f9849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Queue f9850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9851m;

    public e(java.lang.String r1, java.util.concurrent.LinkedBlockingQueue r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f9845g = r1
            r0.f9850l = r2
            r0.f9851m = r3
            return
    }

    public final mh.b A() {
            r3 = this;
            mh.b r0 = r3.f9846h
            if (r0 == 0) goto L7
            mh.b r0 = r3.f9846h
            return r0
        L7:
            boolean r0 = r3.f9851m
            if (r0 == 0) goto Le
            oh.b r0 = oh.b.f9840g
            return r0
        Le:
            nh.a r0 = r3.f9849k
            if (r0 != 0) goto L23
            nh.a r0 = new nh.a
            java.util.Queue r1 = r3.f9850l
            r0.<init>()
            r0.f9462h = r3
            java.lang.String r2 = r3.f9845g
            r0.f9461g = r2
            r0.f9463i = r1
            r3.f9849k = r0
        L23:
            nh.a r0 = r3.f9849k
            return r0
    }

    public final boolean B() {
            r3 = this;
            java.lang.Boolean r0 = r3.f9847i
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            mh.b r0 = r3.f9846h     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.String r1 = "log"
            java.lang.Class<nh.b> r2 = nh.b.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f9848j = r0     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L22
            r3.f9847i = r0     // Catch: java.lang.NoSuchMethodException -> L22
            goto L26
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.f9847i = r0
        L26:
            java.lang.Boolean r0 = r3.f9847i
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // mh.b
    public final void a(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.a(r2, r3)
            return
    }

    @Override // mh.b
    public final void b() {
            r1 = this;
            mh.b r0 = r1.A()
            r0.b()
            return
    }

    @Override // mh.b
    public final boolean c() {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r0 = r0.c()
            return r0
    }

    @Override // mh.b
    public final boolean d() {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r0 = r0.d()
            return r0
    }

    @Override // mh.b
    public final void e(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.e(r2, r3)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            if (r3 == 0) goto L1d
            java.lang.Class<oh.e> r0 = oh.e.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L1d
        Le:
            oh.e r3 = (oh.e) r3
            java.lang.String r0 = r2.f9845g
            java.lang.String r3 = r3.f9845g
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1b
            goto L1d
        L1b:
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    @Override // mh.b
    public final void f(java.lang.Integer r2, java.lang.Object r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.f(r2, r3)
            return
    }

    @Override // mh.b
    public final boolean g() {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r0 = r0.g()
            return r0
    }

    @Override // mh.b
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f9845g
            return r0
    }

    @Override // mh.b
    public final void h(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.h(r2, r3)
            return
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f9845g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // mh.b
    public final void i(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.i(r2, r3)
            return
    }

    @Override // mh.b
    public final boolean j() {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r0 = r0.j()
            return r0
    }

    @Override // mh.b
    public final void k(java.lang.String r2, java.lang.Long r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.k(r2, r3)
            return
    }

    @Override // mh.b
    public final void l(java.lang.String r2) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.l(r2)
            return
    }

    @Override // mh.b
    public final boolean m() {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r0 = r0.m()
            return r0
    }

    @Override // mh.b
    public final void n(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.n(r2, r3, r4)
            return
    }

    @Override // mh.b
    public final void o(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.o(r2, r3)
            return
    }

    @Override // mh.b
    public final void p(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.p(r2, r3, r4)
            return
    }

    @Override // mh.b
    public final void q(java.lang.Object... r2) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.q(r2)
            return
    }

    @Override // mh.b
    public final void r(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.r(r2, r3)
            return
    }

    @Override // mh.b
    public final void s(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.s(r2, r3, r4)
            return
    }

    @Override // mh.b
    public final void t(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.t(r2, r3)
            return
    }

    @Override // mh.b
    public final void u(java.lang.Exception r2) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.u(r2)
            return
    }

    @Override // mh.b
    public final void v(java.lang.String r2) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.v(r2)
            return
    }

    @Override // mh.b
    public final boolean w(int r2) {
            r1 = this;
            mh.b r0 = r1.A()
            boolean r2 = r0.w(r2)
            return r2
    }

    @Override // mh.b
    public final void x(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.x(r2, r3)
            return
    }

    @Override // mh.b
    public final void y(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.y(r2, r3, r4)
            return
    }

    @Override // mh.b
    public final void z(java.lang.Object... r2) {
            r1 = this;
            mh.b r0 = r1.A()
            r0.z(r2)
            return
    }
}
