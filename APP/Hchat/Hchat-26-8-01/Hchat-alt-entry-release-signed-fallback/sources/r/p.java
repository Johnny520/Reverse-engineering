package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements v1.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.q f11219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1.o0 f11223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qg.t f11226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u2.c f11227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f11229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m.p1 f11233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11235q;

    public p(r.q r1, int r2, boolean r3, float r4, v1.o0 r5, float r6, boolean r7, qg.t r8, u2.c r9, long r10, java.util.List r12, int r13, int r14, int r15, m.p1 r16, int r17, int r18) {
            r0 = this;
            r0.<init>()
            r0.f11219a = r1
            r0.f11220b = r2
            r0.f11221c = r3
            r0.f11222d = r4
            r0.f11223e = r5
            r0.f11224f = r6
            r0.f11225g = r7
            r0.f11226h = r8
            r0.f11227i = r9
            r0.f11228j = r10
            r0.f11229k = r12
            r0.f11230l = r13
            r0.f11231m = r14
            r0.f11232n = r15
            r1 = r16
            r0.f11233o = r1
            r1 = r17
            r0.f11234p = r1
            r1 = r18
            r0.f11235q = r1
            return
    }

    public final r.p a(int r24, boolean r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.f11225g
            if (r2 != 0) goto L32
            java.lang.Object r2 = r0.f11229k
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L32
            r.q r4 = r0.f11219a
            if (r4 == 0) goto L32
            int r4 = r4.f11252q
            int r5 = r0.f11220b
            int r6 = r5 - r1
            if (r6 < 0) goto L32
            if (r6 >= r4) goto L32
            java.lang.Object r4 = tf.m.t1(r2)
            r.q r4 = (r.q) r4
            java.lang.Object r5 = tf.m.B1(r2)
            r.q r5 = (r.q) r5
            boolean r7 = r4.f11254s
            if (r7 != 0) goto L32
            boolean r7 = r5.f11254s
            if (r7 == 0) goto L36
        L32:
            r18 = 0
            goto L125
        L36:
            int r7 = r4.f11250o
            int r8 = r0.f11231m
            int r9 = r0.f11230l
            if (r1 >= 0) goto L50
            int r4 = r4.f11252q
            int r7 = r7 + r4
            int r7 = r7 - r9
            int r4 = r5.f11250o
            int r5 = r5.f11252q
            int r4 = r4 + r5
            int r4 = r4 - r8
            int r4 = java.lang.Math.min(r7, r4)
            int r5 = -r1
            if (r4 <= r5) goto L32
            goto L5a
        L50:
            int r9 = r9 - r7
            int r4 = r5.f11250o
            int r8 = r8 - r4
            int r4 = java.lang.Math.min(r9, r8)
            if (r4 <= r1) goto L32
        L5a:
            int r4 = r2.size()
            r5 = 0
            r7 = r5
        L60:
            if (r7 >= r4) goto Leb
            java.lang.Object r8 = r2.get(r7)
            r.q r8 = (r.q) r8
            boolean r9 = r8.f11238c
            int[] r10 = r8.f11258w
            boolean r11 = r8.f11254s
            if (r11 == 0) goto L76
        L70:
            r19 = r4
            r18 = 0
            goto Le5
        L76:
            int r11 = r8.f11250o
            int r11 = r11 + r1
            r8.f11250o = r11
            int r11 = r10.length
            r12 = r5
        L7d:
            if (r12 >= r11) goto L91
            r13 = r12 & 1
            if (r9 == 0) goto L85
            if (r13 != 0) goto L89
        L85:
            if (r9 != 0) goto L8e
            if (r13 != 0) goto L8e
        L89:
            r13 = r10[r12]
            int r13 = r13 + r1
            r10[r12] = r13
        L8e:
            int r12 = r12 + 1
            goto L7d
        L91:
            if (r25 == 0) goto L70
            java.util.List r10 = r8.f11237b
            int r10 = r10.size()
            r11 = r5
        L9a:
            if (r11 >= r10) goto L70
            s.z r12 = r8.f11248m
            java.lang.Object r13 = r8.f11246k
            f.k0 r12 = r12.f12146a
            java.lang.Object r12 = r12.g(r13)
            s.x r12 = (s.x) r12
            if (r12 == 0) goto Laf
            s.t[] r12 = r12.f12127a
            r12 = r12[r11]
            goto Lb0
        Laf:
            r12 = 0
        Lb0:
            if (r12 == 0) goto Ldc
            long r13 = r12.f12104j
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r17 = 32
            if (r9 == 0) goto Lce
            r19 = r4
            r18 = 0
            long r3 = r13 >> r17
            int r3 = (int) r3
            long r13 = r13 & r15
            int r4 = (int) r13
            int r4 = r4 + r1
        Lc7:
            long r13 = (long) r3
            long r13 = r13 << r17
            long r3 = (long) r4
            long r3 = r3 & r15
            long r3 = r3 | r13
            goto Ld9
        Lce:
            r19 = r4
            r18 = 0
            long r3 = r13 >> r17
            int r3 = (int) r3
            int r3 = r3 + r1
            long r13 = r13 & r15
            int r4 = (int) r13
            goto Lc7
        Ld9:
            r12.f12104j = r3
            goto Le0
        Ldc:
            r19 = r4
            r18 = 0
        Le0:
            int r11 = r11 + 1
            r4 = r19
            goto L9a
        Le5:
            int r7 = r7 + 1
            r4 = r19
            goto L60
        Leb:
            r.p r4 = new r.p
            boolean r3 = r0.f11221c
            if (r3 != 0) goto Lf6
            if (r1 <= 0) goto Lf4
            goto Lf6
        Lf4:
            r7 = r5
            goto Lf8
        Lf6:
            r5 = 1
            goto Lf4
        Lf8:
            float r8 = (float) r1
            int r1 = r0.f11234p
            int r3 = r0.f11235q
            r.q r5 = r0.f11219a
            v1.o0 r9 = r0.f11223e
            float r10 = r0.f11224f
            boolean r11 = r0.f11225g
            qg.t r12 = r0.f11226h
            u2.c r13 = r0.f11227i
            long r14 = r0.f11228j
            r21 = r1
            int r1 = r0.f11230l
            r17 = r1
            int r1 = r0.f11231m
            r18 = r1
            int r1 = r0.f11232n
            r19 = r1
            m.p1 r1 = r0.f11233o
            r20 = r1
            r16 = r2
            r22 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            return r4
        L125:
            return r18
    }

    public final long b() {
            r7 = this;
            v1.o0 r0 = r7.f11223e
            int r1 = r0.h()
            int r0 = r0.g()
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    @Override // v1.o0
    public final java.util.Map e() {
            r1 = this;
            v1.o0 r0 = r1.f11223e
            java.util.Map r0 = r0.e()
            return r0
    }

    @Override // v1.o0
    public final void f() {
            r1 = this;
            v1.o0 r0 = r1.f11223e
            r0.f()
            return
    }

    @Override // v1.o0
    public final int g() {
            r1 = this;
            v1.o0 r0 = r1.f11223e
            int r0 = r0.g()
            return r0
    }

    @Override // v1.o0
    public final int h() {
            r1 = this;
            v1.o0 r0 = r1.f11223e
            int r0 = r0.h()
            return r0
    }

    @Override // v1.o0
    public final fg.l i() {
            r1 = this;
            v1.o0 r0 = r1.f11223e
            fg.l r0 = r0.i()
            return r0
    }
}
