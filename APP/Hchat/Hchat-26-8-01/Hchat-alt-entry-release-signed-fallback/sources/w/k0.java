package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends y0.n implements x1.h, x1.v, x1.m1 {
    public i2.n0 A;
    public m2.r B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i2.n0 f14519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14524z;

    @Override // x1.m1
    public final void C0() {
            r2 = this;
            m2.r r0 = r2.B
            if (r0 == 0) goto Ld
            w.j0 r0 = new w.j0
            r1 = 1
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
        Ld:
            r0 = 1
            r2.f14522x = r0
            x1.k.m(r2)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r5 = this;
            i0.m2 r0 = y1.h1.f21949k
            java.lang.Object r0 = x1.k.h(r5, r0)
            m2.d r0 = (m2.d) r0
            i2.n0 r1 = r5.f14519u
            x1.f0 r2 = x1.k.w(r5)
            u2.m r2 = r2.F
            i2.n0 r1 = i2.e0.h(r1, r2)
            r5.A = r1
            i2.n0 r1 = r5.k1()
            i2.f0 r1 = r1.f6365a
            m2.p r1 = r1.f6303f
            i2.n0 r2 = r5.k1()
            i2.f0 r2 = r2.f6365a
            m2.k r2 = r2.f6300c
            if (r2 != 0) goto L2a
            m2.k r2 = m2.k.f8697i
        L2a:
            i2.n0 r3 = r5.k1()
            i2.f0 r3 = r3.f6365a
            m2.i r3 = r3.f6301d
            if (r3 == 0) goto L37
            int r3 = r3.f8694a
            goto L38
        L37:
            r3 = 0
        L38:
            i2.n0 r4 = r5.k1()
            i2.f0 r4 = r4.f6365a
            m2.j r4 = r4.f6302e
            if (r4 == 0) goto L45
            int r4 = r4.f8695a
            goto L48
        L45:
            r4 = 65535(0xffff, float:9.1834E-41)
        L48:
            m2.e r0 = (m2.e) r0
            m2.r r0 = r0.b(r1, r2, r3, r4)
            r5.B = r0
            w.j0 r0 = new w.j0
            r1 = 0
            r0.<init>(r5, r1)
            x1.k.r(r5, r0)
            r0 = 1
            r5.f14522x = r0
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.B = r0
            r0 = 0
            r1.f14522x = r0
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r11, v1.m0 r12, long r13) {
            r10 = this;
            boolean r0 = r10.f14522x
            r1 = -1
            if (r0 == 0) goto L59
            i2.n0 r0 = r10.k1()
            i0.m2 r2 = y1.h1.f21949k
            java.lang.Object r2 = x1.k.h(r10, r2)
            m2.d r2 = (m2.d) r2
            java.lang.String r3 = w.a1.f14402a
            r4 = 1
            long r5 = w.a1.a(r0, r11, r2, r3, r4)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r9 = 10
            r6.append(r9)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r6 = 2
            long r2 = w.a1.a(r0, r11, r2, r3, r6)
            long r2 = r2 & r7
            int r0 = (int) r2
            int r0 = r0 - r5
            int r2 = r10.f14520v
            if (r2 != r4) goto L41
            r2 = r1
            goto L45
        L41:
            int r2 = p.a.z(r2, r4, r0, r5)
        L45:
            r10.f14523y = r2
            int r2 = r10.f14521w
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L50
            r0 = r1
            goto L54
        L50:
            int r0 = p.a.z(r2, r4, r0, r5)
        L54:
            r10.f14524z = r0
            r0 = 0
            r10.f14522x = r0
        L59:
            int r0 = r10.f14523y
            if (r0 == r1) goto L6b
            int r2 = u2.a.i(r13)
            int r3 = u2.a.g(r13)
            int r0 = r9.e0.r(r0, r2, r3)
        L69:
            r6 = r0
            goto L70
        L6b:
            int r0 = u2.a.i(r13)
            goto L69
        L70:
            int r0 = r10.f14524z
            if (r0 == r1) goto L82
            int r1 = u2.a.i(r13)
            int r2 = u2.a.g(r13)
            int r0 = r9.e0.r(r0, r1, r2)
        L80:
            r7 = r0
            goto L87
        L82:
            int r0 = u2.a.g(r13)
            goto L80
        L87:
            r5 = 0
            r8 = 3
            r4 = 0
            r2 = r13
            long r13 = u2.a.a(r2, r4, r5, r6, r7, r8)
            v1.b1 r12 = r12.Q(r13)
            int r13 = r12.f13900g
            int r14 = r12.f13901h
            g0.g r0 = new g0.g
            r1 = 7
            r0.<init>(r12, r1)
            tf.u r12 = tf.u.f13168g
            v1.o0 r11 = r11.z(r13, r14, r12, r0)
            return r11
    }

    @Override // x1.i
    public final void k0() {
            r2 = this;
            i2.n0 r0 = r2.f14519u
            x1.f0 r1 = x1.k.w(r2)
            u2.m r1 = r1.F
            i2.n0 r0 = i2.e0.h(r0, r1)
            r2.A = r0
            r0 = 1
            r2.f14522x = r0
            x1.k.m(r2)
            return
    }

    public final i2.n0 k1() {
            r1 = this;
            i2.n0 r0 = r1.A
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Resolved style is not set."
            o.b.b(r0)
            okio.a.c()
            r0 = 0
            return r0
    }

    @Override // x1.i
    public final void m() {
            r1 = this;
            r0 = 1
            r1.f14522x = r0
            x1.k.m(r1)
            return
    }
}
