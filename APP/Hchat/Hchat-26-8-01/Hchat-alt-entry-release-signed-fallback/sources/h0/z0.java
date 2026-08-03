package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements w.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f5031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5032b;

    public z0(h0.d1 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f5031a = r1
            r0.f5032b = r2
            return
    }

    @Override // w.y0
    public final void a(long r1, g1.d r3) {
            r0 = this;
            return
    }

    @Override // w.y0
    public final void b() {
            r3 = this;
            h0.d1 r0 = r3.f5031a
            i0.j1 r1 = r0.f4863q
            r2 = 0
            r1.setValue(r2)
            i0.j1 r1 = r0.f4864r
            r1.setValue(r2)
            r1 = 1
            r0.t(r1)
            return
    }

    @Override // w.y0
    public final void c() {
            r3 = this;
            h0.d1 r0 = r3.f5031a
            i0.j1 r1 = r0.f4863q
            r2 = 0
            r1.setValue(r2)
            i0.j1 r1 = r0.f4864r
            r1.setValue(r2)
            r1 = 1
            r0.t(r1)
            return
    }

    @Override // w.y0
    public final void d() {
            r4 = this;
            boolean r0 = r4.f5032b
            if (r0 == 0) goto L7
            w.g0 r1 = w.g0.f14461h
            goto L9
        L7:
            w.g0 r1 = w.g0.f14462i
        L9:
            h0.d1 r2 = r4.f5031a
            i0.j1 r3 = r2.f4863q
            r3.setValue(r1)
            long r0 = r2.l(r0)
            long r0 = h0.h0.a(r0)
            w.q0 r3 = r2.f4850d
            if (r3 == 0) goto L49
            w.m1 r3 = r3.d()
            if (r3 != 0) goto L23
            goto L49
        L23:
            long r0 = r3.e(r0)
            r2.f4860n = r0
            e1.b r3 = new e1.b
            r3.<init>(r0)
            i0.j1 r0 = r2.f4864r
            r0.setValue(r3)
            r0 = 0
            r2.f4862p = r0
            r0 = -1
            r2.f4865s = r0
            w.q0 r0 = r2.f4850d
            if (r0 == 0) goto L45
            i0.j1 r0 = r0.f14616q
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L45:
            r0 = 0
            r2.t(r0)
        L49:
            return
    }

    @Override // w.y0
    public final void e(long r10) {
            r9 = this;
            h0.d1 r0 = r9.f5031a
            long r1 = r0.f4862p
            long r10 = e1.b.e(r1, r10)
            r0.f4862p = r10
            long r1 = r0.f4860n
            long r10 = e1.b.e(r1, r10)
            e1.b r1 = new e1.b
            r1.<init>(r10)
            i0.j1 r10 = r0.f4864r
            r10.setValue(r1)
            n2.s r1 = r0.n()
            e1.b r10 = r0.i()
            r10.getClass()
            long r2 = r10.f2294a
            g1.d r6 = h0.w.f5012g
            n1.b r8 = new n1.b
            r10 = 9
            r8.<init>(r10)
            r4 = 0
            boolean r5 = r9.f5032b
            r7 = 1
            h0.d1.c(r0, r1, r2, r4, r5, r6, r7, r8)
            r10 = 0
            r0.t(r10)
            return
    }

    @Override // w.y0
    public final void onCancel() {
            r0 = this;
            return
    }
}
