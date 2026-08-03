package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements w.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f5027a;

    public y0(h0.d1 r1) {
            r0 = this;
            r0.<init>()
            r0.f5027a = r1
            return
    }

    @Override // w.y0
    public final void a(long r3, g1.d r5) {
            r2 = this;
            r3 = 1
            h0.d1 r4 = r2.f5027a
            long r0 = r4.l(r3)
            long r0 = h0.h0.a(r0)
            w.q0 r3 = r4.f4850d
            if (r3 == 0) goto L35
            w.m1 r3 = r3.d()
            if (r3 != 0) goto L16
            goto L35
        L16:
            long r0 = r3.e(r0)
            r4.f4860n = r0
            e1.b r3 = new e1.b
            r3.<init>(r0)
            i0.j1 r5 = r4.f4864r
            r5.setValue(r3)
            r0 = 0
            r4.f4862p = r0
            w.g0 r3 = w.g0.f14460g
            i0.j1 r5 = r4.f4863q
            r5.setValue(r3)
            r3 = 0
            r4.t(r3)
        L35:
            return
    }

    @Override // w.y0
    public final void b() {
            r3 = this;
            h0.d1 r0 = r3.f5027a
            i0.j1 r1 = r0.f4863q
            r2 = 0
            r1.setValue(r2)
            i0.j1 r0 = r0.f4864r
            r0.setValue(r2)
            return
    }

    @Override // w.y0
    public final void c() {
            r3 = this;
            h0.d1 r0 = r3.f5027a
            i0.j1 r1 = r0.f4863q
            r2 = 0
            r1.setValue(r2)
            i0.j1 r0 = r0.f4864r
            r0.setValue(r2)
            return
    }

    @Override // w.y0
    public final void d() {
            r0 = this;
            return
    }

    @Override // w.y0
    public final void e(long r6) {
            r5 = this;
            h0.d1 r0 = r5.f5027a
            long r1 = r0.f4862p
            long r6 = e1.b.e(r1, r6)
            r0.f4862p = r6
            w.q0 r6 = r0.f4850d
            if (r6 == 0) goto L7e
            w.m1 r6 = r6.d()
            if (r6 == 0) goto L7e
            long r1 = r0.f4860n
            long r3 = r0.f4862p
            long r1 = e1.b.e(r1, r3)
            e1.b r7 = new e1.b
            r7.<init>(r1)
            i0.j1 r1 = r0.f4864r
            r1.setValue(r7)
            b5.k r7 = r0.f4848b
            e1.b r1 = r0.i()
            r1.getClass()
            long r1 = r1.f2294a
            r3 = 1
            int r6 = r6.b(r1, r3)
            r7.n(r6)
            long r6 = i2.e0.b(r6, r6)
            n2.s r1 = r0.n()
            long r1 = r1.f8977b
            boolean r1 = i2.m0.b(r6, r1)
            if (r1 == 0) goto L4a
            goto L7e
        L4a:
            w.q0 r1 = r0.f4850d
            if (r1 == 0) goto L5d
            i0.j1 r1 = r1.f14616q
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5d
            goto L68
        L5d:
            n1.a r1 = r0.f4856j
            if (r1 == 0) goto L68
            r2 = 9
            n1.c r1 = (n1.c) r1
            r1.a(r2)
        L68:
            fg.l r1 = r0.f4849c
            n2.s r2 = r0.n()
            i2.g r2 = r2.f8976a
            n2.s r2 = h0.d1.e(r2, r6)
            r1.invoke(r2)
            i2.m0 r1 = new i2.m0
            r1.<init>(r6)
            r0.f4868v = r1
        L7e:
            return
    }

    @Override // w.y0
    public final void onCancel() {
            r0 = this;
            return
    }
}
