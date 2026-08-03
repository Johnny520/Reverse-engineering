package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends w0.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0.f f14836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fg.l f14839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14840i;

    public z(w0.f r4, fg.l r5, boolean r6, boolean r7) {
            r3 = this;
            w0.l r0 = w0.m.f14784a
            r0 = 0
            w0.j r2 = w0.j.f14775k
            r3.<init>(r0, r2)
            r3.f14836e = r4
            r3.f14837f = r6
            r3.f14838g = r7
            if (r4 == 0) goto L17
            fg.l r4 = r4.e()
            if (r4 != 0) goto L1b
        L17:
            w0.a r4 = w0.m.f14793j
            fg.l r4 = r4.f14748e
        L1b:
            fg.l r4 = w0.m.k(r5, r4, r6)
            r3.f14839h = r4
            long r4 = s0.i.c()
            r3.f14840i = r4
            return
    }

    @Override // w0.f
    public final void c() {
            r1 = this;
            r0 = 1
            r1.f14765c = r0
            boolean r0 = r1.f14838g
            if (r0 == 0) goto Le
            w0.f r0 = r1.f14836e
            if (r0 == 0) goto Le
            r0.c()
        Le:
            return
    }

    @Override // w0.f
    public final w0.j d() {
            r1 = this;
            w0.f r0 = r1.v()
            w0.j r0 = r0.d()
            return r0
    }

    @Override // w0.f
    public final fg.l e() {
            r1 = this;
            fg.l r0 = r1.f14839h
            return r0
    }

    @Override // w0.f
    public final boolean f() {
            r1 = this;
            w0.f r0 = r1.v()
            boolean r0 = r0.f()
            return r0
    }

    @Override // w0.f
    public final long g() {
            r2 = this;
            w0.f r0 = r2.v()
            long r0 = r0.g()
            return r0
    }

    @Override // w0.f
    public final fg.l i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // w0.f
    public final void k() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.f
    public final void l() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.f
    public final void m() {
            r1 = this;
            w0.f r0 = r1.v()
            r0.m()
            return
    }

    @Override // w0.f
    public final void n(w0.u r2) {
            r1 = this;
            w0.f r0 = r1.v()
            r0.n(r2)
            return
    }

    @Override // w0.f
    public final w0.f u(fg.l r4) {
            r3 = this;
            fg.l r0 = r3.f14839h
            r1 = 1
            fg.l r4 = w0.m.k(r4, r0, r1)
            boolean r0 = r3.f14837f
            if (r0 != 0) goto L19
            w0.f r0 = r3.v()
            r2 = 0
            w0.f r0 = r0.u(r2)
            w0.f r4 = w0.m.g(r0, r4, r1)
            return r4
        L19:
            w0.f r0 = r3.v()
            w0.f r4 = r0.u(r4)
            return r4
    }

    public final w0.f v() {
            r1 = this;
            w0.f r0 = r1.f14836e
            if (r0 != 0) goto L6
            w0.a r0 = w0.m.f14793j
        L6:
            return r0
    }
}
