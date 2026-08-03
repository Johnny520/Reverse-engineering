package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements x1.q1 {
    public final b1.f A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i1.b f22025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1.z f22026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1.t f22027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fg.p f22028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fg.a f22029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f22032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float[] f22033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u2.c f22035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u2.m f22036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1.b f22037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f22039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f1.c0 f22040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22044z;

    public o1(i1.b r3, f1.z r4, y1.t r5, fg.p r6, fg.a r7) {
            r2 = this;
            r2.<init>()
            r2.f22025g = r3
            r2.f22026h = r4
            r2.f22027i = r5
            r2.f22028j = r6
            r2.f22029k = r7
            r3 = 2147483647(0x7fffffff, float:NaN)
            long r3 = (long) r3
            r5 = 32
            long r5 = r3 << r5
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            long r3 = r3 | r5
            r2.f22030l = r3
            float[] r3 = f1.i0.a()
            r2.f22032n = r3
            u2.d r3 = fb.v0.a()
            r2.f22035q = r3
            u2.m r3 = u2.m.f13354g
            r2.f22036r = r3
            h1.b r3 = new h1.b
            r3.<init>()
            r2.f22037s = r3
            long r3 = f1.u0.f3122b
            r2.f22039u = r3
            r3 = 1
            r2.f22043y = r3
            b1.f r3 = new b1.f
            r4 = 26
            r3.<init>(r2, r4)
            r2.A = r3
            return
    }

    public final float[] a() {
            r5 = this;
            float[] r0 = r5.f22033o
            if (r0 != 0) goto La
            float[] r0 = f1.i0.a()
            r5.f22033o = r0
        La:
            boolean r1 = r5.f22042x
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L19
            r1 = r0[r2]
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L2a
            return r3
        L19:
            r5.f22042x = r2
            float[] r1 = r5.b()
            boolean r4 = r5.f22043y
            if (r4 == 0) goto L24
            return r1
        L24:
            boolean r1 = y1.g0.p(r1, r0)
            if (r1 == 0) goto L2b
        L2a:
            return r0
        L2b:
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0[r2] = r1
            return r3
    }

    public final float[] b() {
            r24 = this;
            r0 = r24
            boolean r1 = r0.f22041w
            float[] r2 = r0.f22032n
            if (r1 == 0) goto L12d
            i1.b r1 = r0.f22025g
            long r3 = r1.f6154v
            i1.d r1 = r1.f6133a
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L27
            long r3 = r0.f22030l
            long r3 = r9.e0.q0(r3)
            long r3 = f8.i.B(r3)
        L27:
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r4 = r1.H()
            float r6 = r1.E()
            float r7 = r1.I()
            float r8 = r1.z()
            float r9 = r1.B()
            float r10 = r1.b()
            float r1 = r1.v()
            double r11 = (double) r7
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r11 = r11 * r13
            r15 = r13
            double r13 = java.lang.Math.sin(r11)
            float r7 = (float) r13
            double r11 = java.lang.Math.cos(r11)
            float r11 = (float) r11
            float r12 = -r7
            float r13 = r6 * r11
            r14 = 0
            float r17 = r14 * r7
            float r13 = r13 - r17
            float r6 = r6 * r7
            float r17 = r14 * r11
            float r17 = r17 + r6
            r6 = r14
            r18 = r15
            double r14 = (double) r8
            double r14 = r14 * r18
            r16 = r6
            r8 = r7
            double r6 = java.lang.Math.sin(r14)
            float r6 = (float) r6
            double r14 = java.lang.Math.cos(r14)
            float r7 = (float) r14
            float r14 = -r6
            float r15 = r8 * r6
            float r8 = r8 * r7
            float r20 = r11 * r6
            float r21 = r11 * r7
            float r22 = r4 * r7
            float r23 = r17 * r6
            float r23 = r23 + r22
            float r4 = -r4
            float r4 = r4 * r6
            float r17 = r17 * r7
            float r17 = r17 + r4
            r6 = r3
            double r3 = (double) r9
            double r3 = r3 * r18
            r18 = r3
            double r3 = java.lang.Math.sin(r18)
            float r3 = (float) r3
            r9 = r6
            r4 = r7
            double r6 = java.lang.Math.cos(r18)
            float r6 = (float) r6
            float r7 = -r3
            float r18 = r7 * r4
            float r19 = r6 * r15
            float r19 = r19 + r18
            float r4 = r4 * r6
            float r15 = r15 * r3
            float r15 = r15 + r4
            float r4 = r3 * r11
            float r11 = r11 * r6
            float r7 = r7 * r14
            float r18 = r6 * r8
            float r18 = r18 + r7
            float r6 = r6 * r14
            float r3 = r3 * r8
            float r3 = r3 + r6
            float r15 = r15 * r10
            float r4 = r4 * r10
            float r3 = r3 * r10
            float r19 = r19 * r1
            float r11 = r11 * r1
            float r18 = r18 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r20 = r20 * r1
            float r12 = r12 * r1
            float r21 = r21 * r1
            int r6 = r2.length
            r7 = 0
            r8 = 16
            if (r6 >= r8) goto Lda
            goto L125
        Lda:
            r2[r7] = r15
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r3
            r6 = 3
            r2[r6] = r16
            r6 = 4
            r2[r6] = r19
            r6 = 5
            r2[r6] = r11
            r6 = 6
            r2[r6] = r18
            r6 = 7
            r2[r6] = r16
            r6 = 8
            r2[r6] = r20
            r6 = 9
            r2[r6] = r12
            r6 = 10
            r2[r6] = r21
            r6 = 11
            r2[r6] = r16
            float r6 = -r5
            float r15 = r15 * r6
            float r8 = r9 * r19
            float r15 = r15 - r8
            float r15 = r15 + r23
            float r15 = r15 + r5
            r5 = 12
            r2[r5] = r15
            float r4 = r4 * r6
            float r5 = r9 * r11
            float r4 = r4 - r5
            float r4 = r4 + r13
            float r4 = r4 + r9
            r5 = 13
            r2[r5] = r4
            float r6 = r6 * r3
            float r3 = r9 * r18
            float r6 = r6 - r3
            float r6 = r6 + r17
            r3 = 14
            r2[r3] = r6
            r3 = 15
            r2[r3] = r1
        L125:
            r0.f22041w = r7
            boolean r1 = f1.c0.o(r2)
            r0.f22043y = r1
        L12d:
            return r2
    }

    public final void c() {
            r1 = this;
            boolean r0 = r1.f22034p
            if (r0 != 0) goto L11
            boolean r0 = r1.f22031m
            if (r0 != 0) goto L11
            y1.t r0 = r1.f22027i
            r0.invalidate()
            r0 = 1
            r1.f(r0)
        L11:
            return
    }

    public final void d(long r3) {
            r2 = this;
            boolean r0 = y1.t.r()
            y1.t r1 = r2.f22027i
            if (r0 == 0) goto Ld
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            r1.P(r0)
        Ld:
            i1.b r0 = r2.f22025g
            r0.i(r3)
            android.view.ViewParent r3 = r1.getParent()
            if (r3 == 0) goto L1b
            r3.onDescendantInvalidated(r1, r1)
        L1b:
            return
    }

    public final void e(long r3) {
            r2 = this;
            long r0 = r2.f22030l
            boolean r0 = u2.l.a(r3, r0)
            if (r0 != 0) goto L1a
            boolean r0 = y1.t.r()
            if (r0 == 0) goto L15
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            y1.t r1 = r2.f22027i
            r1.P(r0)
        L15:
            r2.f22030l = r3
            r2.c()
        L1a:
            return
    }

    public final void f(boolean r4) {
            r3 = this;
            boolean r0 = r3.f22034p
            if (r4 == r0) goto L2f
            r3.f22034p = r4
            y1.t r0 = r3.f22027i
            f.f0 r1 = r0.K
            boolean r2 = r0.M
            if (r4 != 0) goto L1b
            if (r2 != 0) goto L2f
            r1.j(r3)
            f.f0 r4 = r0.L
            if (r4 == 0) goto L2f
            r4.j(r3)
            return
        L1b:
            if (r2 != 0) goto L21
            r1.a(r3)
            return
        L21:
            f.f0 r4 = r0.L
            if (r4 != 0) goto L2c
            f.f0 r4 = new f.f0
            r4.<init>()
            r0.L = r4
        L2c:
            r4.a(r3)
        L2f:
            return
    }

    public final void g() {
            r9 = this;
            y1.t.r()
            boolean r0 = r9.f22034p
            if (r0 == 0) goto L70
            long r0 = r9.f22039u
            long r2 = f1.u0.f3122b
            boolean r0 = f1.u0.a(r0, r2)
            if (r0 != 0) goto L5f
            i1.b r0 = r9.f22025g
            long r0 = r0.f6153u
            long r2 = r9.f22030l
            boolean r0 = u2.l.a(r0, r2)
            if (r0 != 0) goto L5f
            i1.b r0 = r9.f22025g
            long r1 = r9.f22039u
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r4 = r9.f22030l
            long r4 = r4 >> r3
            int r2 = (int) r4
            float r2 = (float) r2
            float r1 = r1 * r2
            long r4 = r9.f22039u
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r4 = r9.f22030l
            long r4 = r4 & r6
            int r4 = (int) r4
            float r4 = (float) r4
            float r2 = r2 * r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            long r3 = r4 << r3
            long r1 = r1 & r6
            long r1 = r1 | r3
            long r3 = r0.f6154v
            boolean r3 = e1.b.b(r3, r1)
            if (r3 != 0) goto L5f
            r0.f6154v = r1
            i1.d r0 = r0.f6133a
            r0.C(r1)
        L5f:
            i1.b r3 = r9.f22025g
            u2.c r4 = r9.f22035q
            u2.m r5 = r9.f22036r
            long r6 = r9.f22030l
            b1.f r8 = r9.A
            r3.e(r4, r5, r6, r8)
            r0 = 0
            r9.f(r0)
        L70:
            return
    }
}
