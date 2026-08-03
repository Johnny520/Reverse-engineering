package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.q1 f4847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b5.k f4848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg.l f4849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.q0 f4850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.j1 f4851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fg.a f4852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.y0 f4853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qg.t f4854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0.p f4855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1.a f4856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d1.v f4857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0.j1 f4858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0.j1 f4859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i2.m0 f4861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0.j1 f4863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0.j1 f4864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n2.s f4866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h0.q0 f4867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i2.m0 f4868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i0.j1 f4869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b.e f4870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h0.b1 f4871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h0.q0 f4872z;

    public d1(w.q1 r6) {
            r5 = this;
            r5.<init>()
            r5.f4847a = r6
            b5.k r6 = w.s.f14646f
            r5.f4848b = r6
            r9.p r6 = new r9.p
            r0 = 19
            r6.<init>(r0)
            r5.f4849c = r6
            n2.s r6 = new n2.s
            r0 = 7
            r1 = 0
            r2 = 0
            r6.<init>(r0, r1, r2)
            i0.j1 r6 = i0.r.u(r6)
            r5.f4851e = r6
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            i0.j1 r4 = i0.r.u(r6)
            r5.f4858l = r4
            i0.j1 r6 = i0.r.u(r6)
            r5.f4859m = r6
            r5.f4860n = r2
            r5.f4862p = r2
            i0.j1 r6 = i0.r.u(r1)
            r5.f4863q = r6
            i0.j1 r6 = i0.r.u(r1)
            r5.f4864r = r6
            r6 = -1
            r5.f4865s = r6
            n2.s r6 = new n2.s
            r6.<init>(r0, r1, r2)
            r5.f4866t = r6
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            i0.j1 r6 = i0.r.u(r6)
            r5.f4869w = r6
            b.e r6 = new b.e
            r0 = 3
            r1 = 0
            r6.<init>(r0, r1)
            c0.o r0 = c0.o.f969g
            r6.f333i = r0
            r5.f4870x = r6
            h0.b1 r6 = new h0.b1
            r6.<init>(r5)
            r5.f4871y = r6
            h0.q0 r6 = new h0.q0
            r6.<init>(r5)
            r5.f4872z = r6
            return
    }

    public static final sf.e a(h0.d1 r7) {
            i2.g r0 = r7.m()
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.f6314h
            if (r0 != 0) goto Lb
            goto L36
        Lb:
            i2.m0 r1 = r7.f4868v
            if (r1 == 0) goto L36
            long r1 = r1.f6360a
            b5.k r3 = r7.f4848b
            r4 = 32
            long r4 = r1 >> r4
            int r4 = (int) r4
            r3.l(r4)
            b5.k r7 = r7.f4848b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            r7.l(r1)
            long r1 = i2.e0.b(r4, r1)
            sf.e r7 = new sf.e
            i2.m0 r3 = new i2.m0
            r3.<init>(r1)
            r7.<init>(r0, r3)
            return r7
        L36:
            r7 = 0
            return r7
    }

    public static final void b(h0.d1 r11, i2.m0 r12) {
            if (r12 != 0) goto L3
            goto L4a
        L3:
            long r0 = r12.f6360a
            h0.p r3 = r11.f4855i
            if (r3 != 0) goto La
            goto L4a
        La:
            i2.g r2 = r11.m()
            if (r2 == 0) goto L4a
            java.lang.String r4 = r2.f6314h
            if (r4 != 0) goto L15
            goto L4a
        L15:
            b5.k r9 = r11.f4848b
            r2 = 32
            long r5 = r0 >> r2
            int r2 = (int) r5
            r9.l(r2)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            r9.l(r0)
            long r5 = i2.e0.b(r2, r0)
            int r0 = r4.length()
            if (r0 <= 0) goto L4a
            boolean r0 = i2.m0.c(r5)
            if (r0 != 0) goto L4a
            qg.t r0 = r11.f4854h
            if (r0 == 0) goto L4a
            h0.a1 r2 = new h0.a1
            r10 = 0
            r8 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            r11 = 3
            r12 = 0
            qg.v.q(r0, r12, r2, r11)
        L4a:
            return
    }

    public static final long c(h0.d1 r21, n2.s r22, long r23, boolean r25, boolean r26, g1.d r27, boolean r28, n1.b r29) {
            r0 = r21
            r1 = r22
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L2f7
            w.m1 r4 = r4.d()
            if (r4 != 0) goto L10
            goto L2f7
        L10:
            b5.k r5 = r0.f4848b
            long r6 = r1.f8977b
            i2.g r1 = r1.f8976a
            int r8 = i2.m0.f6359c
            r8 = 32
            long r9 = r6 >> r8
            int r9 = (int) r9
            r5.l(r9)
            b5.k r5 = r0.f4848b
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r6 & r10
            int r12 = (int) r12
            r5.l(r12)
            long r12 = i2.e0.b(r9, r12)
            r5 = 0
            r14 = r23
            int r9 = r4.b(r14, r5)
            if (r26 != 0) goto L41
            if (r25 == 0) goto L3d
            goto L41
        L3d:
            long r14 = r12 >> r8
            int r14 = (int) r14
            goto L42
        L41:
            r14 = r9
        L42:
            if (r26 == 0) goto L46
            if (r25 == 0) goto L48
        L46:
            r15 = r10
            goto L4d
        L48:
            r15 = r10
            long r10 = r12 & r15
            int r10 = (int) r10
            goto L4e
        L4d:
            r10 = r9
        L4e:
            h0.q0 r11 = r0.f4867u
            r22 = r8
            r8 = -1
            if (r25 != 0) goto L60
            if (r11 == 0) goto L60
            r23 = r15
            int r15 = r0.f4865s
            if (r15 != r8) goto L5e
            goto L62
        L5e:
            r8 = r15
            goto L62
        L60:
            r23 = r15
        L62:
            i2.k0 r4 = r4.f14569a
            h0.q0 r15 = new h0.q0
            if (r25 == 0) goto L6d
            r13 = r1
            r19 = r6
            r5 = 0
            goto L97
        L6d:
            h0.v r5 = new h0.v
            r17 = r12
            h0.u r12 = new h0.u
            r19 = r6
            long r6 = r17 >> r22
            int r6 = (int) r6
            t2.j r7 = a7.a.y(r4, r6)
            r13 = r1
            r0 = 1
            r12.<init>(r7, r6, r0)
            h0.u r6 = new h0.u
            long r0 = r17 & r23
            int r0 = (int) r0
            t2.j r1 = a7.a.y(r4, r0)
            r2 = 1
            r6.<init>(r1, r0, r2)
            boolean r0 = i2.m0.g(r17)
            r5.<init>(r12, r6, r0)
        L97:
            h0.s r0 = new h0.s
            r0.<init>(r14, r10, r8, r4)
            r2 = r26
            r15.<init>(r2, r5, r0)
            if (r5 == 0) goto Lba
            if (r11 == 0) goto Lba
            boolean r0 = r11.f4970b
            if (r2 != r0) goto Lba
            java.lang.Object r0 = r11.f4972d
            h0.s r0 = (h0.s) r0
            int r1 = r0.f4979b
            if (r14 != r1) goto Lba
            int r0 = r0.f4980c
            if (r10 == r0) goto Lb6
            goto Lba
        Lb6:
            r4 = r19
            goto L22e
        Lba:
            r0 = r21
            r0.f4867u = r15
            r0.f4865s = r9
            r1 = r27
            int r1 = r1.f4067g
            h0.h r2 = h0.h.f4898g
            r3 = 1
            java.lang.Object r4 = r15.f4972d
            switch(r1) {
                case 8: goto L1f4;
                case 9: goto L1ed;
                case 10: goto L1e6;
                default: goto Lcc;
            }
        Lcc:
            java.lang.Object r1 = r15.f4971c
            h0.v r1 = (h0.v) r1
            r5 = r4
            h0.s r5 = (h0.s) r5
            if (r1 != 0) goto Ldd
            h0.w r1 = h0.w.f5008c
            h0.v r1 = x6.d.i(r15, r1)
            goto L210
        Ldd:
            h0.u r6 = r1.f5003b
            h0.u r7 = r1.f5002a
            boolean r8 = r15.f4970b
            if (r8 == 0) goto Lee
            h0.u r5 = x6.d.k(r15, r5, r7)
            r8 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto Lf4
        Lee:
            h0.u r5 = x6.d.k(r15, r5, r6)
            r8 = r7
            r7 = r5
        Lf4:
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Lfc
            goto L210
        Lfc:
            h0.h r1 = r15.d()
            if (r1 == r2) goto L113
            h0.h r1 = r15.d()
            h0.h r2 = h0.h.f4900i
            if (r1 != r2) goto L111
            int r1 = r8.f4997b
            int r2 = r7.f4997b
            if (r1 <= r2) goto L111
            goto L113
        L111:
            r1 = 0
            goto L114
        L113:
            r1 = r3
        L114:
            h0.v r2 = new h0.v
            r2.<init>(r8, r7, r1)
            h0.s r4 = (h0.s) r4
            h0.u r1 = r2.f5002a
            long r5 = r1.f4998c
            h0.u r7 = r2.f5003b
            long r8 = r7.f4998c
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L12e
            int r5 = r1.f4997b
            int r6 = r7.f4997b
            if (r5 != r6) goto L1e4
            goto L154
        L12e:
            boolean r5 = r2.f5004c
            if (r5 == 0) goto L134
            r6 = r1
            goto L135
        L134:
            r6 = r7
        L135:
            int r6 = r6.f4997b
            if (r6 == 0) goto L13b
            goto L1e4
        L13b:
            if (r5 == 0) goto L13f
            r5 = r7
            goto L140
        L13f:
            r5 = r1
        L140:
            java.lang.Object r6 = r4.f4982e
            i2.k0 r6 = (i2.k0) r6
            i2.j0 r6 = r6.f6346a
            i2.g r6 = r6.f6334a
            java.lang.String r6 = r6.f6314h
            int r6 = r6.length()
            int r5 = r5.f4997b
            if (r6 == r5) goto L154
            goto L1e4
        L154:
            java.lang.Object r5 = r15.f4971c
            h0.v r5 = (h0.v) r5
            java.lang.Object r6 = r4.f4982e
            i2.k0 r6 = (i2.k0) r6
            i2.j0 r6 = r6.f6346a
            i2.g r6 = r6.f6334a
            java.lang.String r6 = r6.f6314h
            if (r5 == 0) goto L1e4
            int r6 = r6.length()
            if (r6 != 0) goto L16c
            goto L1e4
        L16c:
            boolean r6 = r15.f4970b
            java.lang.Object r8 = r4.f4982e
            i2.k0 r8 = (i2.k0) r8
            i2.j0 r8 = r8.f6346a
            i2.g r8 = r8.f6334a
            java.lang.String r8 = r8.f6314h
            int r9 = r4.f4979b
            int r10 = r8.length()
            r11 = 2
            if (r9 != 0) goto L19e
            r12 = 0
            int r5 = w.s.q(r12, r8)
            if (r6 == 0) goto L193
            h0.u r1 = x6.d.o(r1, r4, r5)
            r14 = 0
            h0.v r1 = h0.v.a(r2, r1, r14, r3, r11)
            goto L210
        L193:
            r14 = 0
            h0.u r1 = x6.d.o(r7, r4, r5)
            h0.v r1 = h0.v.a(r2, r14, r1, r12, r3)
            goto L210
        L19e:
            r12 = 0
            r14 = 0
            if (r9 != r10) goto L1ba
            int r5 = w.s.t(r10, r8)
            if (r6 == 0) goto L1b1
            h0.u r1 = x6.d.o(r1, r4, r5)
            h0.v r1 = h0.v.a(r2, r1, r14, r12, r11)
            goto L210
        L1b1:
            h0.u r1 = x6.d.o(r7, r4, r5)
            h0.v r1 = h0.v.a(r2, r14, r1, r3, r3)
            goto L210
        L1ba:
            boolean r5 = r5.f5004c
            if (r5 != r3) goto L1c0
            r12 = r3
            goto L1c1
        L1c0:
            r12 = 0
        L1c1:
            r5 = r6 ^ r12
            if (r5 == 0) goto L1ca
            int r5 = w.s.t(r9, r8)
            goto L1ce
        L1ca:
            int r5 = w.s.q(r9, r8)
        L1ce:
            if (r6 == 0) goto L1da
            h0.u r1 = x6.d.o(r1, r4, r5)
            r14 = 0
            h0.v r1 = h0.v.a(r2, r1, r14, r12, r11)
            goto L210
        L1da:
            r14 = 0
            h0.u r1 = x6.d.o(r7, r4, r5)
            h0.v r1 = h0.v.a(r2, r14, r1, r12, r3)
            goto L210
        L1e4:
            r1 = r2
            goto L210
        L1e6:
            h0.w r1 = h0.w.f5007b
            h0.v r1 = x6.d.i(r15, r1)
            goto L210
        L1ed:
            h0.w r1 = h0.w.f5008c
            h0.v r1 = x6.d.i(r15, r1)
            goto L210
        L1f4:
            h0.v r1 = new h0.v
            h0.s r4 = (h0.s) r4
            int r5 = r4.f4979b
            h0.u r5 = r4.a(r5)
            int r6 = r4.f4980c
            h0.u r4 = r4.a(r6)
            h0.h r6 = r15.d()
            if (r6 != r2) goto L20c
            r12 = r3
            goto L20d
        L20c:
            r12 = 0
        L20d:
            r1.<init>(r5, r4, r12)
        L210:
            b5.k r2 = r0.f4848b
            h0.u r4 = r1.f5002a
            int r4 = r4.f4997b
            r2.n(r4)
            b5.k r2 = r0.f4848b
            h0.u r1 = r1.f5003b
            int r1 = r1.f4997b
            r2.n(r1)
            long r1 = i2.e0.b(r4, r1)
            r4 = r19
            boolean r6 = i2.m0.b(r1, r4)
            if (r6 == 0) goto L22f
        L22e:
            return r4
        L22f:
            boolean r6 = i2.m0.g(r1)
            boolean r7 = i2.m0.g(r4)
            if (r6 == r7) goto L24b
            long r6 = r1 & r23
            int r6 = (int) r6
            long r7 = r1 >> r22
            int r7 = (int) r7
            long r6 = i2.e0.b(r6, r7)
            boolean r6 = i2.m0.b(r6, r4)
            if (r6 == 0) goto L24b
            r12 = r3
            goto L24c
        L24b:
            r12 = 0
        L24c:
            boolean r6 = i2.m0.c(r1)
            if (r6 == 0) goto L25a
            boolean r4 = i2.m0.c(r4)
            if (r4 == 0) goto L25a
            r4 = r3
            goto L25b
        L25a:
            r4 = 0
        L25b:
            if (r28 == 0) goto L278
            java.lang.String r5 = r13.f6314h
            int r5 = r5.length()
            if (r5 <= 0) goto L278
            if (r12 != 0) goto L278
            if (r4 != 0) goto L278
            if (r29 == 0) goto L278
            n1.a r4 = r0.f4856j
            if (r4 == 0) goto L278
            r5 = r29
            int r5 = r5.f8917a
            n1.c r4 = (n1.c) r4
            r4.a(r5)
        L278:
            n2.s r4 = e(r13, r1)
            fg.l r5 = r0.f4849c
            r5.invoke(r4)
            i2.m0 r4 = new i2.m0
            r4.<init>(r1)
            r0.f4868v = r4
            if (r28 != 0) goto L292
            boolean r4 = i2.m0.c(r1)
            r4 = r4 ^ r3
            r0.t(r4)
        L292:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L29f
            i0.j1 r4 = r4.f14616q
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r28)
            r4.setValue(r5)
        L29f:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L2bb
            boolean r5 = i2.m0.c(r1)
            if (r5 != 0) goto L2b1
            boolean r5 = fb.v0.z(r0, r3)
            if (r5 == 0) goto L2b1
            r12 = r3
            goto L2b2
        L2b1:
            r12 = 0
        L2b2:
            i0.j1 r4 = r4.f14612m
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)
            r4.setValue(r5)
        L2bb:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L2d9
            boolean r5 = i2.m0.c(r1)
            r12 = 0
            if (r5 != 0) goto L2ce
            boolean r5 = fb.v0.z(r0, r12)
            if (r5 == 0) goto L2ce
            r5 = r3
            goto L2cf
        L2ce:
            r5 = r12
        L2cf:
            i0.j1 r4 = r4.f14613n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.setValue(r5)
            goto L2da
        L2d9:
            r12 = 0
        L2da:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L2f6
            boolean r5 = i2.m0.c(r1)
            if (r5 == 0) goto L2ec
            boolean r0 = fb.v0.z(r0, r3)
            if (r0 == 0) goto L2ec
            r5 = r3
            goto L2ed
        L2ec:
            r5 = r12
        L2ed:
            i0.j1 r0 = r4.f14614o
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r0.setValue(r3)
        L2f6:
            return r1
        L2f7:
            long r0 = i2.m0.f6358b
            return r0
    }

    public static n2.s e(i2.g r2, long r3) {
            n2.s r0 = new n2.s
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public final qg.e1 d(boolean r4) {
            r3 = this;
            qg.t r0 = r3.f4854h
            r1 = 0
            if (r0 == 0) goto L10
            h0.x0 r2 = new h0.x0
            r2.<init>(r3, r4, r1)
            r4 = 1
            qg.e1 r4 = qg.v.q(r0, r1, r2, r4)
            return r4
        L10:
            return r1
    }

    public final void f() {
            r4 = this;
            qg.t r0 = r4.f4854h
            if (r0 == 0) goto Le
            h0.u0 r1 = new h0.u0
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            qg.v.q(r0, r3, r1, r2)
        Le:
            return
    }

    public final void g(e1.b r7) {
            r6 = this;
            n2.s r0 = r6.n()
            long r0 = r0.f8977b
            boolean r0 = i2.m0.c(r0)
            if (r0 != 0) goto L4d
            w.q0 r0 = r6.f4850d
            r1 = 0
            if (r0 == 0) goto L16
            w.m1 r0 = r0.d()
            goto L17
        L16:
            r0 = r1
        L17:
            if (r7 == 0) goto L28
            if (r0 == 0) goto L28
            b5.k r2 = r6.f4848b
            long r3 = r7.f2294a
            r5 = 1
            int r0 = r0.b(r3, r5)
            r2.n(r0)
            goto L32
        L28:
            n2.s r0 = r6.n()
            long r2 = r0.f8977b
            int r0 = i2.m0.e(r2)
        L32:
            n2.s r2 = r6.n()
            long r3 = i2.e0.b(r0, r0)
            r0 = 5
            n2.s r0 = n2.s.a(r2, r1, r3, r0)
            fg.l r1 = r6.f4849c
            r1.invoke(r0)
            long r0 = r0.f8977b
            i2.m0 r2 = new i2.m0
            r2.<init>(r0)
            r6.f4868v = r2
        L4d:
            if (r7 == 0) goto L60
            n2.s r7 = r6.n()
            i2.g r7 = r7.f8976a
            java.lang.String r7 = r7.f6314h
            int r7 = r7.length()
            if (r7 <= 0) goto L60
            w.h0 r7 = w.h0.f14486i
            goto L62
        L60:
            w.h0 r7 = w.h0.f14484g
        L62:
            r6.q(r7)
            r7 = 0
            r6.t(r7)
            return
    }

    public final void h(boolean r2) {
            r1 = this;
            w.q0 r0 = r1.f4850d
            if (r0 == 0) goto L11
            boolean r0 = r0.b()
            if (r0 != 0) goto L11
            d1.v r0 = r1.f4857k
            if (r0 == 0) goto L11
            d1.v.a(r0)
        L11:
            n2.s r0 = r1.n()
            r1.f4866t = r0
            r1.t(r2)
            w.h0 r2 = w.h0.f14485h
            r1.q(r2)
            return
    }

    public final e1.b i() {
            r1 = this;
            i0.j1 r0 = r1.f4864r
            java.lang.Object r0 = r0.getValue()
            e1.b r0 = (e1.b) r0
            return r0
    }

    public final boolean j() {
            r1 = this;
            i0.j1 r0 = r1.f4858l
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final boolean k() {
            r1 = this;
            i0.j1 r0 = r1.f4859m
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final long l(boolean r12) {
            r11 = this;
            w.q0 r0 = r11.f4850d
            if (r0 == 0) goto Ld2
            w.m1 r0 = r0.d()
            if (r0 == 0) goto Ld2
            i2.k0 r0 = r0.f14569a
            i2.o r1 = r0.f6347b
            i2.g r2 = r11.m()
            if (r2 != 0) goto L16
            goto Ld2
        L16:
            i2.j0 r3 = r0.f6346a
            i2.g r3 = r3.f6334a
            java.lang.String r3 = r3.f6314h
            java.lang.String r2 = r2.f6314h
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L26
            goto Ld2
        L26:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            n2.s r5 = r11.n()
            if (r12 == 0) goto L3a
            long r5 = r5.f8977b
            int r7 = i2.m0.f6359c
            long r5 = r5 >> r4
        L38:
            int r5 = (int) r5
            goto L40
        L3a:
            long r5 = r5.f8977b
            int r7 = i2.m0.f6359c
            long r5 = r5 & r2
            goto L38
        L40:
            b5.k r6 = r11.f4848b
            r6.l(r5)
            n2.s r6 = r11.n()
            long r6 = r6.f8977b
            boolean r6 = i2.m0.g(r6)
            long r7 = r0.f6348c
            int r9 = r1.d(r5)
            int r10 = r1.f6373f
            if (r9 < r10) goto L5b
            goto Ld2
        L5b:
            r10 = 0
            if (r12 == 0) goto L60
            if (r6 == 0) goto L64
        L60:
            if (r12 != 0) goto L66
            if (r6 == 0) goto L66
        L64:
            r12 = r5
            goto L6c
        L66:
            int r12 = r5 + (-1)
            int r12 = java.lang.Math.max(r12, r10)
        L6c:
            t2.j r12 = r0.a(r12)
            t2.j r0 = r0.h(r5)
            if (r12 != r0) goto L78
            r12 = 1
            goto L79
        L78:
            r12 = r10
        L79:
            r1.l(r5)
            be.k r0 = r1.f6368a
            java.lang.Object r0 = r0.f813b
            i2.g r0 = (i2.g) r0
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            java.util.ArrayList r6 = r1.f6375h
            if (r5 != r0) goto L91
            int r0 = a.a.b0(r6)
            goto L95
        L91:
            int r0 = i2.e0.d(r5, r6)
        L95:
            java.lang.Object r0 = r6.get(r0)
            i2.r r0 = (i2.r) r0
            i2.a r6 = r0.f6381a
            int r0 = r0.d(r5)
            j2.k r5 = r6.f6248d
            if (r12 == 0) goto Laa
            float r12 = r5.h(r0, r10)
            goto Lae
        Laa:
            float r12 = r5.i(r0, r10)
        Lae:
            long r5 = r7 >> r4
            int r0 = (int) r5
            float r0 = (float) r0
            r5 = 0
            float r12 = r9.e0.q(r12, r5, r0)
            float r0 = r1.b(r9)
            long r6 = r7 & r2
            int r1 = (int) r6
            float r1 = (float) r1
            float r0 = r9.e0.q(r0, r5, r1)
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r5 = (long) r12
            int r12 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r12
            long r4 = r5 << r4
            long r0 = r0 & r2
            long r0 = r0 | r4
            return r0
        Ld2:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r0
    }

    public final i2.g m() {
            r1 = this;
            w.q0 r0 = r1.f4850d
            if (r0 == 0) goto L9
            w.x0 r0 = r0.f14600a
            i2.g r0 = r0.f14710a
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final n2.s n() {
            r1 = this;
            i0.j1 r0 = r1.f4851e
            java.lang.Object r0 = r0.getValue()
            n2.s r0 = (n2.s) r0
            return r0
    }

    public final void o() {
            r3 = this;
            b.e r0 = r3.f4870x
            java.lang.Object r0 = r0.f332h
            c0.n r0 = (c0.n) r0
            if (r0 == 0) goto L13
            qg.e1 r1 = r0.A
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            r2 = 0
            r1.a(r2)
            r0.A = r2
        L13:
            return
    }

    public final void p() {
            r4 = this;
            qg.t r0 = r4.f4854h
            if (r0 == 0) goto Lf
            h0.u0 r1 = new h0.u0
            r2 = 2
            r3 = 0
            r1.<init>(r4, r3, r2)
            r2 = 1
            qg.v.q(r0, r3, r1, r2)
        Lf:
            return
    }

    public final void q(w.h0 r3) {
            r2 = this;
            w.q0 r0 = r2.f4850d
            if (r0 == 0) goto L12
            w.h0 r1 = r0.a()
            if (r1 != r3) goto Lb
            r0 = 0
        Lb:
            if (r0 == 0) goto L12
            i0.j1 r0 = r0.f14610k
            r0.setValue(r3)
        L12:
            return
    }

    public final void r() {
            r7 = this;
            w0.f r0 = w0.q.e()
            r1 = 0
            if (r0 == 0) goto Lc
            fg.l r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            w0.f r3 = w0.q.h(r0)
            boolean r4 = r7.k()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L71
            w.q0 r4 = r7.f4850d     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L2a
            i0.j1 r4 = r4.f14616q     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L2a
            goto L71
        L2a:
            w0.q.k(r0, r3, r2)
            b.e r0 = r7.f4870x
            java.lang.Object r2 = r0.f333i
            c0.o r2 = (c0.o) r2
            c0.o r3 = c0.o.f969g
            if (r2 == r3) goto L38
            goto L3d
        L38:
            java.lang.String r2 = "ToolbarRequester is not initialized."
            o.b.c(r2)
        L3d:
            java.lang.Object r0 = r0.f332h
            c0.n r0 = (c0.n) r0
            if (r0 == 0) goto L6e
            boolean r2 = r0.f21832t
            if (r2 == 0) goto L6e
            qg.e1 r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L53
            boolean r2 = r2.b()
            if (r2 != r3) goto L53
            goto L6e
        L53:
            i0.u r2 = d0.f.f1895b
            java.lang.Object r2 = x1.k.h(r0, r2)
            d0.e r2 = (d0.e) r2
            if (r2 != 0) goto L5e
            goto L6e
        L5e:
            qg.t r4 = r0.Y0()
            c0.m r5 = new c0.m
            r6 = 0
            r5.<init>(r0, r2, r1, r6)
            qg.e1 r1 = qg.v.q(r4, r1, r5, r3)
            r0.A = r1
        L6e:
            return
        L6f:
            r1 = move-exception
            goto L75
        L71:
            w0.q.k(r0, r3, r2)
            return
        L75:
            w0.q.k(r0, r3, r2)
            throw r1
    }

    public final java.lang.Object s(yf.c r5) {
            r4 = this;
            boolean r0 = r5 instanceof h0.c1
            if (r0 == 0) goto L13
            r0 = r5
            h0.c1 r0 = (h0.c1) r0
            int r1 = r0.f4839j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4839j = r1
            goto L18
        L13:
            h0.c1 r0 = new h0.c1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4837h
            int r1 = r0.f4839j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            h0.d1 r0 = r0.f4836g
            f8.i.I0(r5)
            goto L5c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2e:
            f8.i.I0(r5)
            y1.y0 r5 = r4.f4853g
            if (r5 == 0) goto L66
            r0.f4836g = r4
            r0.f4839j = r2
            y1.h r5 = (y1.h) r5
            y1.i r5 = r5.f21918a
            android.content.ClipboardManager r5 = r5.a()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L51
            java.lang.String r1 = "text/*"
            boolean r5 = r5.hasMimeType(r1)
            if (r5 != r2) goto L51
            goto L52
        L51:
            r2 = r0
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L5b
            return r0
        L5b:
            r0 = r4
        L5c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            i0.j1 r0 = r0.f4869w
            r0.setValue(r5)
        L66:
            sf.n r5 = sf.n.f12433a
            return r5
    }

    public final void t(boolean r3) {
            r2 = this;
            w.q0 r0 = r2.f4850d
            if (r0 == 0) goto Ld
            i0.j1 r0 = r0.f14611l
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r1)
        Ld:
            if (r3 == 0) goto L13
            r2.r()
            return
        L13:
            r2.o()
            return
    }
}
