package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y0.n implements x1.m1, c1.a, x1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c1.d f976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg.l f978w;

    public c(c1.d r1, fg.l r2) {
            r0 = this;
            r0.<init>()
            r0.f976u = r1
            r0.f978w = r2
            r1.f979g = r0
            return
    }

    @Override // x1.m
    public final void B(x1.h0 r4) {
            r3 = this;
            boolean r0 = r3.f977v
            c1.d r1 = r3.f976u
            if (r0 != 0) goto L21
            r0 = 0
            r1.f980h = r0
            c1.b r0 = new c1.b
            r2 = 0
            r0.<init>(r3, r2, r1)
            x1.k.r(r3, r0)
            androidx.lifecycle.x r0 = r1.f980h
            if (r0 == 0) goto L1a
            r0 = 1
            r3.f977v = r0
            goto L21
        L1a:
            java.lang.String r4 = "DrawResult not defined, did you forget to call onDraw?"
            af.d r4 = wb.en.a(r4)
            throw r4
        L21:
            androidx.lifecycle.x r0 = r1.f980h
            r0.getClass()
            java.lang.Object r0 = r0.f310h
            fg.l r0 = (fg.l) r0
            r0.invoke(r4)
            return
    }

    @Override // x1.m1
    public final void C0() {
            r0 = this;
            r0.k1()
            return
    }

    @Override // c1.a
    public final long a() {
            r2 = this;
            r0 = 4
            x1.i1 r0 = x1.k.t(r2, r0)
            long r0 = r0.f13902i
            long r0 = r9.e0.q0(r0)
            return r0
    }

    @Override // c1.a
    public final u2.c d() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.c r0 = r0.E
            return r0
    }

    @Override // y0.n
    public final void d1() {
            r0 = this;
            return
    }

    @Override // y0.n
    public final void e1() {
            r0 = this;
            r0.k1()
            return
    }

    @Override // x1.m
    public final void g0() {
            r0 = this;
            r0.k1()
            return
    }

    @Override // c1.a
    public final u2.m getLayoutDirection() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.m r0 = r0.F
            return r0
    }

    @Override // x1.i
    public final void k0() {
            r0 = this;
            r0.k1()
            return
    }

    public final void k1() {
            r2 = this;
            r0 = 0
            r2.f977v = r0
            c1.d r0 = r2.f976u
            r1 = 0
            r0.f980h = r1
            x1.k.l(r2)
            return
    }

    @Override // x1.i
    public final void m() {
            r0 = this;
            r0.k1()
            return
    }
}
