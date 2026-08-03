package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f3992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.n0 f3993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m2.d f3994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u2.c f4000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i2.a f4001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g0.b f4004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i2.t f4005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u2.m f4006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4010s;

    public e(java.lang.String r1, i2.n0 r2, m2.d r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.f3992a = r1
            r0.f3993b = r2
            r0.f3994c = r3
            r0.f3995d = r4
            r0.f3996e = r5
            r0.f3997f = r6
            r0.f3998g = r7
            long r1 = g0.a.f3963a
            r0.f3999h = r1
            r1 = 0
            long r2 = (long) r1
            r4 = 32
            long r4 = r2 << r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            r0.f4003l = r2
            long r1 = u2.b.h(r1, r1, r1, r1)
            r0.f4007p = r1
            r1 = -1
            r0.f4008q = r1
            r0.f4009r = r1
            return
    }

    public static long g(g0.e r4, long r5, u2.m r7) {
            i2.n0 r0 = r4.f3993b
            g0.b r1 = r4.f4004m
            u2.c r2 = r4.f4000i
            r2.getClass()
            m2.d r3 = r4.f3994c
            g0.b r7 = be.h.y(r1, r7, r0, r2, r3)
            r4.f4004m = r7
            int r4 = r4.f3998g
            long r4 = r7.a(r4, r5)
            return r4
    }

    public final int a(int r13, u2.m r14) {
            r12 = this;
            int r0 = r12.f4008q
            int r1 = r12.f4009r
            if (r13 != r0) goto La
            r2 = -1
            if (r0 == r2) goto La
            return r1
        La:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            long r0 = u2.b.a(r1, r13, r1, r0)
            int r2 = r12.f3998g
            r3 = 1
            if (r2 <= r3) goto L1b
            long r0 = g(r12, r0, r14)
        L1b:
            i2.t r14 = r12.e(r14)
            boolean r2 = r12.f3996e
            int r4 = r12.f3995d
            float r5 = r14.c()
            long r10 = ac.p.q(r0, r2, r4, r5)
            boolean r2 = r12.f3996e
            int r9 = r12.f3995d
            int r4 = r12.f3997f
            if (r2 != 0) goto L40
            r2 = 2
            if (r9 != r2) goto L37
            goto L3e
        L37:
            r2 = 4
            if (r9 != r2) goto L3b
            goto L3e
        L3b:
            r2 = 5
            if (r9 != r2) goto L40
        L3e:
            r8 = r3
            goto L44
        L40:
            if (r4 >= r3) goto L43
            goto L3e
        L43:
            r8 = r4
        L44:
            i2.a r6 = new i2.a
            r7 = r14
            q2.d r7 = (q2.d) r7
            r6.<init>(r7, r8, r9, r10)
            float r14 = r6.b()
            int r14 = w.s.n(r14)
            int r0 = u2.a.i(r0)
            if (r14 >= r0) goto L5b
            r14 = r0
        L5b:
            r12.f4008q = r13
            r12.f4009r = r14
            return r14
    }

    public final boolean b(long r21, u2.m r23) {
            r20 = this;
            r0 = r20
            r1 = r23
            long r2 = r0.f4010s
            r4 = 2
            long r2 = r2 << r4
            r5 = 3
            long r2 = r2 | r5
            r0.f4010s = r2
            int r2 = r0.f3998g
            r3 = 1
            if (r2 <= r3) goto L17
            long r5 = g(r20, r21, r23)
            goto L19
        L17:
            r5 = r21
        L19:
            i2.a r2 = r0.f4001j
            r7 = 3
            r8 = 0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r2 != 0) goto L28
            goto Lcb
        L28:
            i2.t r12 = r0.f4005n
            if (r12 != 0) goto L2e
            goto Lcb
        L2e:
            boolean r12 = r12.a()
            if (r12 == 0) goto L36
            goto Lcb
        L36:
            u2.m r12 = r0.f4006o
            if (r1 == r12) goto L3c
            goto Lcb
        L3c:
            long r12 = r0.f4007p
            boolean r12 = u2.a.b(r5, r12)
            if (r12 == 0) goto L45
            goto L74
        L45:
            int r12 = u2.a.h(r5)
            long r13 = r0.f4007p
            int r13 = u2.a.h(r13)
            if (r12 == r13) goto L53
            goto Lcb
        L53:
            int r12 = u2.a.j(r5)
            long r13 = r0.f4007p
            int r13 = u2.a.j(r13)
            if (r12 == r13) goto L60
            goto Lcb
        L60:
            int r12 = u2.a.g(r5)
            float r12 = (float) r12
            float r13 = r2.b()
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto Lcb
            j2.k r2 = r2.f6248d
            boolean r2 = r2.f6698d
            if (r2 == 0) goto L74
            goto Lcb
        L74:
            long r1 = r0.f4007p
            boolean r1 = u2.a.b(r5, r1)
            if (r1 != 0) goto Lca
            i2.a r1 = r0.f4001j
            r1.getClass()
            q2.d r2 = r1.f6245a
            j2.f r2 = r2.f10613i
            float r2 = r2.c()
            float r4 = r1.d()
            float r2 = java.lang.Math.min(r2, r4)
            int r2 = w.s.n(r2)
            float r4 = r1.b()
            int r4 = w.s.n(r4)
            long r12 = (long) r2
            long r12 = r12 << r11
            long r14 = (long) r4
            long r14 = r14 & r9
            long r12 = r12 | r14
            long r12 = u2.b.d(r5, r12)
            r0.f4003l = r12
            int r2 = r0.f3995d
            if (r2 != r7) goto Lad
            goto Lc5
        Lad:
            long r14 = r12 >> r11
            int r2 = (int) r14
            float r2 = (float) r2
            float r4 = r1.d()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lc6
            long r9 = r9 & r12
            int r2 = (int) r9
            float r2 = (float) r2
            float r1 = r1.b()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lc5
            goto Lc6
        Lc5:
            r3 = r8
        Lc6:
            r0.f4002k = r3
            r0.f4007p = r5
        Lca:
            return r8
        Lcb:
            i2.t r1 = r0.e(r1)
            boolean r2 = r0.f3996e
            int r12 = r0.f3995d
            float r13 = r1.c()
            long r18 = ac.p.q(r5, r2, r12, r13)
            boolean r2 = r0.f3996e
            int r12 = r0.f3995d
            int r13 = r0.f3997f
            if (r2 != 0) goto Lf0
            if (r12 != r4) goto Le6
            goto Led
        Le6:
            r2 = 4
            if (r12 != r2) goto Lea
            goto Led
        Lea:
            r2 = 5
            if (r12 != r2) goto Lf0
        Led:
            r16 = r3
            goto Lf5
        Lf0:
            if (r13 >= r3) goto Lf3
            goto Led
        Lf3:
            r16 = r13
        Lf5:
            i2.a r14 = new i2.a
            r15 = r1
            q2.d r15 = (q2.d) r15
            r17 = r12
            r14.<init>(r15, r16, r17, r18)
            r0.f4007p = r5
            float r1 = r14.d()
            int r1 = w.s.n(r1)
            float r2 = r14.b()
            int r2 = w.s.n(r2)
            long r12 = (long) r1
            long r12 = r12 << r11
            long r1 = (long) r2
            long r1 = r1 & r9
            long r1 = r1 | r12
            long r1 = u2.b.d(r5, r1)
            r0.f4003l = r1
            int r4 = r0.f3995d
            if (r4 != r7) goto L121
            goto L139
        L121:
            long r4 = r1 >> r11
            int r4 = (int) r4
            float r4 = (float) r4
            float r5 = r14.d()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L138
            long r1 = r1 & r9
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r14.b()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L139
        L138:
            r8 = r3
        L139:
            r0.f4002k = r8
            r0.f4001j = r14
            return r3
    }

    public final void c() {
            r7 = this;
            r0 = 0
            r7.f4001j = r0
            r7.f4005n = r0
            r7.f4006o = r0
            r0 = -1
            r7.f4008q = r0
            r7.f4009r = r0
            r0 = 0
            long r1 = u2.b.h(r0, r0, r0, r0)
            r7.f4007p = r1
            long r1 = (long) r0
            r3 = 32
            long r3 = r1 << r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = r1 | r3
            r7.f4003l = r1
            r7.f4002k = r0
            return
    }

    public final void d(u2.c r6) {
            r5 = this;
            u2.c r0 = r5.f4000i
            if (r6 == 0) goto L13
            int r1 = g0.a.f3964b
            float r1 = r6.d()
            float r2 = r6.q0()
            long r1 = g0.a.a(r1, r2)
            goto L15
        L13:
            long r1 = g0.a.f3963a
        L15:
            if (r0 != 0) goto L1c
            r5.f4000i = r6
            r5.f3999h = r1
            return
        L1c:
            if (r6 == 0) goto L25
            long r3 = r5.f3999h
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            return
        L25:
            r5.f4000i = r6
            r5.f3999h = r1
            long r0 = r5.f4010s
            r6 = 2
            long r0 = r0 << r6
            r2 = 1
            long r0 = r0 | r2
            r5.f4010s = r0
            r5.c()
            return
    }

    public final i2.t e(u2.m r10) {
            r9 = this;
            i2.t r0 = r9.f4005n
            if (r0 == 0) goto Le
            u2.m r1 = r9.f4006o
            if (r10 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L28
        Le:
            r9.f4006o = r10
            java.lang.String r3 = r9.f3992a
            i2.n0 r0 = r9.f3993b
            i2.n0 r4 = i2.e0.h(r0, r10)
            u2.c r8 = r9.f4000i
            r8.getClass()
            m2.d r7 = r9.f3994c
            q2.d r2 = new q2.d
            tf.t r5 = tf.t.f13167g
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = r2
        L28:
            r9.f4005n = r0
            return r0
    }

    public final void f(java.lang.String r1, i2.n0 r2, m2.d r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.f3992a = r1
            r0.f3993b = r2
            r0.f3994c = r3
            r0.f3995d = r4
            r0.f3996e = r5
            r0.f3997f = r6
            r0.f3998g = r7
            long r1 = r0.f4010s
            r3 = 2
            long r1 = r1 << r3
            r3 = 2
            long r1 = r1 | r3
            r0.f4010s = r1
            r0.c()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphLayoutCache(paragraph="
            r0.<init>(r1)
            i2.a r1 = r4.f4001j
            if (r1 == 0) goto Le
            java.lang.String r1 = "<paragraph>"
            goto L10
        Le:
            java.lang.String r1 = "null"
        L10:
            r0.append(r1)
            java.lang.String r1 = ", lastDensity="
            r0.append(r1)
            long r1 = r4.f3999h
            java.lang.String r1 = g0.a.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", history="
            r0.append(r1)
            long r1 = r4.f4010s
            java.lang.String r3 = ", constraints=$)"
            java.lang.String r0 = eh.a.p(r0, r1, r3)
            return r0
    }
}
