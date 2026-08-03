package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends w0.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0.b f14830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public fg.l f14833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public fg.l f14834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f14835t;

    public y(w0.b r8, fg.l r9, fg.l r10, boolean r11, boolean r12) {
            r7 = this;
            w0.l r0 = w0.m.f14784a
            if (r8 == 0) goto La
            fg.l r0 = r8.y()
            if (r0 != 0) goto Le
        La:
            w0.a r0 = w0.m.f14793j
            fg.l r0 = r0.f14748e
        Le:
            fg.l r5 = w0.m.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            fg.l r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            w0.a r9 = w0.m.f14793j
            fg.l r9 = r9.f14749f
        L1e:
            fg.l r6 = w0.m.l(r10, r9)
            r2 = 0
            w0.j r4 = w0.j.f14775k
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.f14830o = r8
            r1.f14831p = r11
            r1.f14832q = r12
            fg.l r8 = r1.f14748e
            r1.f14833r = r8
            fg.l r8 = r1.f14749f
            r1.f14834s = r8
            long r8 = s0.i.c()
            r1.f14835t = r8
            return
    }

    @Override // w0.b
    public final void B(f.l0 r1) {
            r0 = this;
            w0.q.l()
            r1 = 0
            throw r1
    }

    @Override // w0.b
    public final w0.b C(fg.l r9, fg.l r10) {
            r8 = this;
            fg.l r0 = r8.f14833r
            r1 = 1
            fg.l r4 = w0.m.k(r9, r0, r1)
            fg.l r9 = r8.f14834s
            fg.l r5 = w0.m.l(r10, r9)
            boolean r9 = r8.f14831p
            if (r9 != 0) goto L22
            w0.b r9 = r8.D()
            r10 = 0
            w0.b r3 = r9.C(r10, r5)
            w0.y r2 = new w0.y
            r6 = 0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L22:
            w0.b r9 = r8.D()
            w0.b r9 = r9.C(r4, r5)
            return r9
    }

    public final w0.b D() {
            r1 = this;
            w0.b r0 = r1.f14830o
            if (r0 != 0) goto L6
            w0.a r0 = w0.m.f14793j
        L6:
            return r0
    }

    @Override // w0.b, w0.f
    public final void c() {
            r1 = this;
            r0 = 1
            r1.f14765c = r0
            boolean r0 = r1.f14832q
            if (r0 == 0) goto Le
            w0.b r0 = r1.f14830o
            if (r0 == 0) goto Le
            r0.c()
        Le:
            return
    }

    @Override // w0.f
    public final w0.j d() {
            r1 = this;
            w0.b r0 = r1.D()
            w0.j r0 = r0.d()
            return r0
    }

    @Override // w0.b, w0.f
    public final fg.l e() {
            r1 = this;
            fg.l r0 = r1.f14833r
            return r0
    }

    @Override // w0.b, w0.f
    public final boolean f() {
            r1 = this;
            w0.b r0 = r1.D()
            boolean r0 = r0.f()
            return r0
    }

    @Override // w0.f
    public final long g() {
            r2 = this;
            w0.b r0 = r2.D()
            long r0 = r0.g()
            return r0
    }

    @Override // w0.b, w0.f
    public final int h() {
            r1 = this;
            w0.b r0 = r1.D()
            int r0 = r0.h()
            return r0
    }

    @Override // w0.b, w0.f
    public final fg.l i() {
            r1 = this;
            fg.l r0 = r1.f14834s
            return r0
    }

    @Override // w0.b, w0.f
    public final void k() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.b, w0.f
    public final void l() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.b, w0.f
    public final void m() {
            r1 = this;
            w0.b r0 = r1.D()
            r0.m()
            return
    }

    @Override // w0.b, w0.f
    public final void n(w0.u r2) {
            r1 = this;
            w0.b r0 = r1.D()
            r0.n(r2)
            return
    }

    @Override // w0.f
    public final void r(w0.j r1) {
            r0 = this;
            w0.q.l()
            r1 = 0
            throw r1
    }

    @Override // w0.f
    public final void s(long r1) {
            r0 = this;
            w0.q.l()
            r1 = 0
            throw r1
    }

    @Override // w0.b, w0.f
    public final void t(int r2) {
            r1 = this;
            w0.b r0 = r1.D()
            r0.t(r2)
            return
    }

    @Override // w0.b, w0.f
    public final w0.f u(fg.l r4) {
            r3 = this;
            fg.l r0 = r3.f14833r
            r1 = 1
            fg.l r4 = w0.m.k(r4, r0, r1)
            boolean r0 = r3.f14831p
            if (r0 != 0) goto L19
            w0.b r0 = r3.D()
            r2 = 0
            w0.f r0 = r0.u(r2)
            w0.f r4 = w0.m.g(r0, r4, r1)
            return r4
        L19:
            w0.b r0 = r3.D()
            w0.f r4 = r0.u(r4)
            return r4
    }

    @Override // w0.b
    public final w0.q w() {
            r1 = this;
            w0.b r0 = r1.D()
            w0.q r0 = r0.w()
            return r0
    }

    @Override // w0.b
    public final f.l0 x() {
            r1 = this;
            w0.b r0 = r1.D()
            f.l0 r0 = r0.x()
            return r0
    }

    @Override // w0.b
    public final fg.l y() {
            r1 = this;
            fg.l r0 = r1.f14833r
            return r0
    }
}
