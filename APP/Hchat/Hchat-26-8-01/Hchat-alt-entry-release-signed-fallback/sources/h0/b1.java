package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements w.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.m0 f4823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g1.d f4824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f4825d;

    public b1(h0.d1 r1) {
            r0 = this;
            r0.<init>()
            r0.f4825d = r1
            r1 = 1
            r0.f4822a = r1
            g1.d r1 = h0.w.f5009d
            r0.f4824c = r1
            return
    }

    @Override // w.y0
    public final void a(long r10, g1.d r12) {
            r9 = this;
            h0.d1 r0 = r9.f4825d
            i0.j1 r1 = r0.f4863q
            boolean r2 = r0.k()
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r1.getValue()
            w.g0 r2 = (w.g0) r2
            if (r2 == 0) goto L14
            goto Lc6
        L14:
            w.g0 r2 = w.g0.f14462i
            r1.setValue(r2)
            r1 = -1
            r0.f4865s = r1
            r1 = 1
            r9.f4822a = r1
            r9.f4824c = r12
            r0.o()
            w.q0 r12 = r0.f4850d
            r2 = 0
            if (r12 == 0) goto L73
            w.m1 r12 = r12.d()
            if (r12 == 0) goto L73
            boolean r12 = r12.c(r10)
            if (r12 != r1) goto L73
            n2.s r12 = r0.n()
            i2.g r12 = r12.f8976a
            java.lang.String r12 = r12.f6314h
            int r12 = r12.length()
            if (r12 != 0) goto L45
            goto Lc6
        L45:
            r0.h(r2)
            n2.s r12 = r0.n()
            long r3 = i2.m0.f6358b
            r1 = 5
            r5 = 0
            n2.s r1 = n2.s.a(r12, r5, r3, r1)
            g1.d r6 = r9.f4824c
            n1.b r8 = new n1.b
            r8.<init>(r2)
            r4 = 1
            r5 = 0
            r7 = 1
            r2 = r10
            long r10 = h0.d1.c(r0, r1, r2, r4, r5, r6, r7, r8)
            r3 = r2
            i2.m0 r12 = new i2.m0
            r12.<init>(r10)
            r0.f4861o = r12
            i2.m0 r12 = new i2.m0
            r12.<init>(r10)
            r9.f4823b = r12
            goto Lb1
        L73:
            r3 = r10
            w.q0 r10 = r0.f4850d
            if (r10 == 0) goto Laf
            w.m1 r10 = r10.d()
            if (r10 == 0) goto Laf
            int r10 = r10.b(r3, r1)
            b5.k r11 = r0.f4848b
            r11.n(r10)
            n2.s r11 = r0.n()
            i2.g r11 = r11.f8976a
            long r5 = i2.e0.b(r10, r10)
            n2.s r10 = h0.d1.e(r11, r5)
            r0.h(r2)
            n1.a r11 = r0.f4856j
            if (r11 == 0) goto La1
            n1.c r11 = (n1.c) r11
            r11.a(r2)
        La1:
            fg.l r11 = r0.f4849c
            r11.invoke(r10)
            long r10 = r10.f8977b
            i2.m0 r12 = new i2.m0
            r12.<init>(r10)
            r0.f4868v = r12
        Laf:
            r9.f4822a = r2
        Lb1:
            w.h0 r10 = w.h0.f14484g
            r0.q(r10)
            r0.f4860n = r3
            e1.b r10 = new e1.b
            r10.<init>(r3)
            i0.j1 r11 = r0.f4864r
            r11.setValue(r10)
            r10 = 0
            r0.f4862p = r10
        Lc6:
            return
    }

    @Override // w.y0
    public final void b() {
            r0 = this;
            r0.f()
            return
    }

    @Override // w.y0
    public final void c() {
            r0 = this;
            return
    }

    @Override // w.y0
    public final void d() {
            r0 = this;
            return
    }

    @Override // w.y0
    public final void e(long r10) {
            r9 = this;
            h0.d1 r0 = r9.f4825d
            boolean r1 = r0.k()
            if (r1 == 0) goto Le9
            n2.s r1 = r0.n()
            i2.g r1 = r1.f8976a
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Le9
        L18:
            long r1 = r0.f4862p
            long r10 = e1.b.e(r1, r10)
            r0.f4862p = r10
            w.q0 r10 = r0.f4850d
            r11 = 0
            if (r10 == 0) goto Le6
            w.m1 r10 = r10.d()
            if (r10 == 0) goto Le6
            long r1 = r0.f4860n
            long r3 = r0.f4862p
            long r1 = e1.b.e(r1, r3)
            e1.b r3 = new e1.b
            r3.<init>(r1)
            i0.j1 r1 = r0.f4864r
            r1.setValue(r3)
            i2.m0 r1 = r0.f4861o
            r2 = 9
            if (r1 != 0) goto L94
            e1.b r1 = r0.i()
            r1.getClass()
            long r3 = r1.f2294a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L94
            b5.k r1 = r0.f4848b
            long r3 = r0.f4860n
            r5 = 1
            int r3 = r10.b(r3, r5)
            r1.n(r3)
            b5.k r1 = r0.f4848b
            e1.b r4 = r0.i()
            r4.getClass()
            long r6 = r4.f2294a
            int r10 = r10.b(r6, r5)
            r1.n(r10)
            if (r3 != r10) goto L76
            g1.d r10 = h0.w.f5009d
        L74:
            r6 = r10
            goto L79
        L76:
            g1.d r10 = h0.w.f5010e
            goto L74
        L79:
            n2.s r1 = r0.n()
            e1.b r10 = r0.i()
            r10.getClass()
            long r3 = r10.f2294a
            n1.b r8 = new n1.b
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = h0.d1.c(r0, r1, r2, r4, r5, r6, r7, r8)
            goto Ld5
        L94:
            i2.m0 r1 = r0.f4861o
            if (r1 == 0) goto L9f
            long r3 = r1.f6360a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La5
        L9f:
            long r3 = r0.f4860n
            int r1 = r10.b(r3, r11)
        La5:
            e1.b r3 = r0.i()
            r3.getClass()
            long r3 = r3.f2294a
            int r10 = r10.b(r3, r11)
            i2.m0 r3 = r0.f4861o
            if (r3 != 0) goto Lb9
            if (r1 != r10) goto Lb9
            goto Le9
        Lb9:
            n2.s r1 = r0.n()
            e1.b r10 = r0.i()
            r10.getClass()
            long r3 = r10.f2294a
            g1.d r6 = r9.f4824c
            n1.b r8 = new n1.b
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = h0.d1.c(r0, r1, r2, r4, r5, r6, r7, r8)
        Ld5:
            i2.m0 r10 = new i2.m0
            r10.<init>(r1)
            r9.f4823b = r10
            i2.m0 r10 = r0.f4861o
            boolean r10 = i2.m0.a(r10, r1)
            if (r10 != 0) goto Le6
            r9.f4822a = r11
        Le6:
            r0.t(r11)
        Le9:
            return
    }

    public final void f() {
            r7 = this;
            h0.d1 r0 = r7.f4825d
            i0.j1 r1 = r0.f4863q
            r2 = 0
            r1.setValue(r2)
            i0.j1 r1 = r0.f4864r
            r1.setValue(r2)
            g1.d r1 = h0.w.f5009d
            r7.f4824c = r1
            r1 = 1
            r0.t(r1)
            i2.m0 r3 = r7.f4823b
            if (r3 == 0) goto L20
            long r3 = r3.f6360a
        L1b:
            boolean r3 = i2.m0.c(r3)
            goto L27
        L20:
            n2.s r3 = r0.n()
            long r3 = r3.f8977b
            goto L1b
        L27:
            if (r3 == 0) goto L2c
            w.h0 r4 = w.h0.f14486i
            goto L2e
        L2c:
            w.h0 r4 = w.h0.f14485h
        L2e:
            r0.q(r4)
            w.q0 r4 = r0.f4850d
            r5 = 0
            if (r4 == 0) goto L4a
            if (r3 != 0) goto L40
            boolean r6 = fb.v0.z(r0, r1)
            if (r6 == 0) goto L40
            r6 = r1
            goto L41
        L40:
            r6 = r5
        L41:
            i0.j1 r4 = r4.f14612m
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.setValue(r6)
        L4a:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L62
            if (r3 != 0) goto L58
            boolean r6 = fb.v0.z(r0, r5)
            if (r6 == 0) goto L58
            r6 = r1
            goto L59
        L58:
            r6 = r5
        L59:
            i0.j1 r4 = r4.f14613n
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.setValue(r6)
        L62:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L79
            if (r3 == 0) goto L6f
            boolean r3 = fb.v0.z(r0, r1)
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r1 = r5
        L70:
            i0.j1 r3 = r4.f14614o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.setValue(r1)
        L79:
            boolean r1 = r7.f4822a
            if (r1 == 0) goto L82
            i2.m0 r1 = r0.f4861o
            h0.d1.b(r0, r1)
        L82:
            r0.f4861o = r2
            return
    }

    @Override // w.y0
    public final void onCancel() {
            r0 = this;
            r0.f()
            return
    }
}
