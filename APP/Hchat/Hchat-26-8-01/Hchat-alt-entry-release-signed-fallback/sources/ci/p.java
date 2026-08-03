package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements k.k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ci.r f1772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ci.p0 f1777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ci.p0 f1778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qg.r0 f1779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qg.r0 f1780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ci.q f1781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ci.r f1782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ci.r f1783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ci.s f1784o;

    public p() {
            r1 = this;
            r1.<init>()
            ci.p0 r0 = new ci.p0
            r0.<init>()
            r1.f1777h = r0
            ci.p0 r0 = new ci.p0
            r0.<init>()
            r1.f1778i = r0
            ci.s r0 = new ci.s
            r0.<init>(r1)
            r1.f1784o = r0
            return
    }

    @Override // k.k1
    public final java.lang.Object a(long r9, m.n2 r11, yf.c r12) {
            r8 = this;
            boolean r0 = r12 instanceof ci.m
            if (r0 == 0) goto L13
            r0 = r12
            ci.m r0 = (ci.m) r0
            int r1 = r0.f1752j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1752j = r1
            goto L18
        L13:
            ci.m r0 = new ci.m
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f1750h
            int r1 = r0.f1752j
            sf.n r2 = sf.n.f12433a
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L2a
            long r9 = r0.f1749g
            f8.i.I0(r12)
            goto L108
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L31:
            f8.i.I0(r12)
            float r12 = r8.f1771b
            float r12 = java.lang.Math.abs(r12)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r4 = 0
            if (r12 <= 0) goto L43
            r12 = r3
            goto L44
        L43:
            r12 = r4
        L44:
            float r5 = r8.f1770a
            float r5 = java.lang.Math.abs(r5)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L4f
            r4 = r3
        L4f:
            ci.r r1 = r8.f1782m
            if (r1 == 0) goto L56
            r1.invoke()
        L56:
            qg.r0 r1 = r8.f1780k
            r5 = 0
            if (r1 == 0) goto L5e
            r1.a(r5)
        L5e:
            qg.r0 r1 = r8.f1779j
            if (r1 == 0) goto L65
            r1.a(r5)
        L65:
            r1 = 1074301051(0x4008887b, float:2.13333)
            r5 = 0
            if (r12 == 0) goto Lab
            float r12 = u2.q.c(r9)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto L74
            goto Lab
        L74:
            float r12 = u2.q.c(r9)
            float r12 = java.lang.Math.signum(r12)
            float r6 = r8.f1771b
            float r6 = java.lang.Math.signum(r6)
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 != 0) goto L96
            float r12 = u2.q.c(r9)
            r8.j(r12)
            float r12 = u2.q.b(r9)
            long r6 = a.a.d(r12, r5)
            goto Lac
        L96:
            float r12 = u2.q.c(r9)
            r8.j(r12)
            float r12 = u2.q.b(r9)
            float r6 = u2.q.c(r9)
            float r6 = r6 / r1
            long r6 = a.a.d(r12, r6)
            goto Lac
        Lab:
            r6 = r9
        Lac:
            if (r4 == 0) goto Lee
            float r12 = u2.q.b(r9)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto Lb7
            goto Lee
        Lb7:
            float r12 = u2.q.b(r9)
            float r12 = java.lang.Math.signum(r12)
            float r4 = r8.f1770a
            float r4 = java.lang.Math.signum(r4)
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 != 0) goto Ld9
            float r9 = u2.q.b(r9)
            r8.i(r9)
            float r9 = u2.q.c(r6)
            long r9 = a.a.d(r5, r9)
            goto Lef
        Ld9:
            float r12 = u2.q.b(r9)
            r8.i(r12)
            float r9 = u2.q.b(r9)
            float r9 = r9 / r1
            float r10 = u2.q.c(r6)
            long r9 = a.a.d(r9, r10)
            goto Lef
        Lee:
            r9 = r6
        Lef:
            r0.f1749g = r9
            r0.f1752j = r3
            r11.getClass()
            m.n2 r12 = new m.n2
            m.o2 r11 = r11.f8287k
            r12.<init>(r11, r0)
            r12.f8286j = r9
            java.lang.Object r12 = r12.invokeSuspend(r2)
            xf.a r11 = xf.a.f21579g
            if (r12 != r11) goto L108
            return r11
        L108:
            u2.q r12 = (u2.q) r12
            long r11 = r12.f13362a
            long r9 = u2.q.d(r9, r11)
            float r11 = u2.q.c(r9)
            r12 = 1069827112(0x3fc44428, float:1.53333)
            float r11 = r11 / r12
            r8.j(r11)
            float r9 = u2.q.b(r9)
            float r9 = r9 / r12
            r8.i(r9)
            r8.k()
            return r2
    }

    @Override // k.k1
    public final long b(long r17, int r19, b0.d0 r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r20.getClass()
            r3 = r20
            java.lang.Object r3 = r3.f355h
            m.o2 r3 = (m.o2) r3
            r4 = 1
            r5 = r19
            if (r5 != r4) goto L19a
            ci.r r4 = r0.f1782m
            if (r4 == 0) goto L19
            r4.invoke()
        L19:
            qg.r0 r4 = r0.f1780k
            r5 = 0
            if (r4 == 0) goto L21
            r4.a(r5)
        L21:
            qg.r0 r4 = r0.f1779j
            if (r4 == 0) goto L28
            r4.a(r5)
        L28:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r1 & r4
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r8 = r0.f1771b
            float r8 = java.lang.Math.abs(r8)
            r9 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            r10 = 0
            if (r8 <= 0) goto La1
            float r8 = java.lang.Float.intBitsToFloat(r6)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4a
            goto La1
        L4a:
            float r8 = java.lang.Float.intBitsToFloat(r6)
            float r8 = java.lang.Math.signum(r8)
            float r11 = r0.f1774e
            float r11 = java.lang.Math.signum(r11)
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto La1
        L5d:
            float r7 = r0.f1774e
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Float.intBitsToFloat(r6)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L73
            float r7 = r0.f1774e
            float r7 = -r7
            goto L77
        L73:
            float r7 = java.lang.Float.intBitsToFloat(r6)
        L77:
            float r8 = r0.f1774e
            float r8 = java.lang.Math.abs(r8)
            float r11 = java.lang.Float.intBitsToFloat(r6)
            float r11 = java.lang.Math.abs(r11)
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 > 0) goto L97
            r0.h(r10)
            r0.f1774e = r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 - r7
            r15 = r7
            r7 = r6
            r6 = r15
            goto La2
        L97:
            r0.f(r7)
            float r7 = java.lang.Float.intBitsToFloat(r6)
            r6 = r7
            r7 = r10
            goto La2
        La1:
            r6 = r10
        La2:
            r8 = 32
            long r1 = r1 >> r8
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            float r11 = r0.f1770a
            float r11 = java.lang.Math.abs(r11)
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 <= 0) goto L114
            float r9 = java.lang.Float.intBitsToFloat(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto Lbd
            goto L114
        Lbd:
            float r9 = java.lang.Float.intBitsToFloat(r1)
            float r9 = java.lang.Math.signum(r9)
            float r11 = r0.f1773d
            float r11 = java.lang.Math.signum(r11)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Ld0
            goto L114
        Ld0:
            float r2 = r0.f1773d
            float r2 = java.lang.Math.abs(r2)
            float r9 = java.lang.Float.intBitsToFloat(r1)
            float r9 = java.lang.Math.abs(r9)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto Le6
            float r2 = r0.f1773d
            float r2 = -r2
            goto Lea
        Le6:
            float r2 = java.lang.Float.intBitsToFloat(r1)
        Lea:
            float r9 = r0.f1773d
            float r9 = java.lang.Math.abs(r9)
            float r11 = java.lang.Float.intBitsToFloat(r1)
            float r11 = java.lang.Math.abs(r11)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L10a
            r0.g(r10)
            r0.f1773d = r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 - r2
            r15 = r2
            r2 = r1
            r1 = r15
            goto L115
        L10a:
            r0.e(r2)
            float r2 = java.lang.Float.intBitsToFloat(r1)
            r1 = r2
            r2 = r10
            goto L115
        L114:
            r1 = r10
        L115:
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r11 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r7)
            long r13 = (long) r2
            long r11 = r11 << r8
            long r13 = r13 & r4
            long r11 = r11 | r13
            m.u1 r2 = r3.f8315k
            int r7 = r3.f8314j
            long r2 = r3.c(r2, r11, r7)
            e1.b r7 = new e1.b
            r7.<init>(r2)
            long r2 = r7.f2294a
            long r11 = e1.b.d(r11, r2)
            long r13 = r11 & r4
            int r7 = (int) r13
            float r9 = java.lang.Float.intBitsToFloat(r7)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L141
            goto L148
        L141:
            float r9 = java.lang.Float.intBitsToFloat(r7)
            r0.f(r9)
        L148:
            long r11 = r11 >> r8
            int r9 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r9)
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 != 0) goto L153
            goto L15a
        L153:
            float r11 = java.lang.Float.intBitsToFloat(r9)
            r0.e(r11)
        L15a:
            r0.k()
            long r11 = r2 >> r8
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r1
            float r1 = java.lang.Float.intBitsToFloat(r9)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L16f
            r1 = r10
            goto L173
        L16f:
            float r1 = java.lang.Float.intBitsToFloat(r9)
        L173:
            float r11 = r11 + r1
            long r1 = r2 & r4
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r6
            float r2 = java.lang.Float.intBitsToFloat(r7)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L185
            goto L189
        L185:
            float r10 = java.lang.Float.intBitsToFloat(r7)
        L189:
            float r1 = r1 + r10
            int r2 = java.lang.Float.floatToRawIntBits(r11)
            long r2 = (long) r2
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r6 = (long) r1
            long r1 = r2 << r8
            long r3 = r6 & r4
            long r1 = r1 | r3
            return r1
        L19a:
            m.u1 r4 = r3.f8315k
            int r5 = r3.f8314j
            long r1 = r3.c(r4, r1, r5)
            e1.b r3 = new e1.b
            r3.<init>(r1)
            r0.k()
            long r1 = r3.f2294a
            return r1
    }

    @Override // k.k1
    public final x1.i c() {
            r1 = this;
            ci.s r0 = r1.f1784o
            return r0
    }

    @Override // k.k1
    public final boolean d() {
            r2 = this;
            float r0 = r2.f1770a
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            float r0 = r2.f1771b
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L19
        L17:
            r0 = 0
            return r0
        L19:
            r0 = 1
            return r0
    }

    public final void e(float r9) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return
        L6:
            float r1 = r8.f1776g
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            return
        Ld:
            float r2 = r8.f1773d
            float r2 = r2 + r9
            r8.f1773d = r2
            float r9 = -r1
            float r9 = r9.e0.q(r2, r9, r1)
            r8.f1773d = r9
            float r9 = java.lang.Math.abs(r9)
            float r1 = r8.f1776g
            float r9 = r9 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r9, r1)
            float r2 = r8.f1773d
            float r2 = java.lang.Math.signum(r2)
            float r3 = r8.f1776g
            float r9 = java.lang.Math.min(r9, r1)
            float r9 = java.lang.Math.max(r0, r9)
            double r0 = (double) r9
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r0, r4)
            double r4 = r0 - r4
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r6)
            double r0 = r0 / r6
            double r0 = r0 + r4
            double r3 = (double) r3
            double r0 = r0 * r3
            float r9 = (float) r0
            float r2 = r2 * r9
            r8.g(r2)
            return
    }

    public final void f(float r9) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return
        L6:
            float r1 = r8.f1775f
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            return
        Ld:
            float r2 = r8.f1774e
            float r2 = r2 + r9
            r8.f1774e = r2
            float r9 = -r1
            float r9 = r9.e0.q(r2, r9, r1)
            r8.f1774e = r9
            float r9 = java.lang.Math.abs(r9)
            float r1 = r8.f1775f
            float r9 = r9 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r9, r1)
            float r2 = r8.f1774e
            float r2 = java.lang.Math.signum(r2)
            float r3 = r8.f1775f
            float r9 = java.lang.Math.min(r9, r1)
            float r9 = java.lang.Math.max(r0, r9)
            double r0 = (double) r9
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r0, r4)
            double r4 = r0 - r4
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r6)
            double r0 = r0 / r6
            double r0 = r0 + r4
            double r3 = (double) r3
            double r0 = r0 * r3
            float r9 = (float) r0
            float r2 = r2 * r9
            r8.h(r2)
            return
    }

    public final void g(float r2) {
            r1 = this;
            float r0 = r1.f1770a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L10
        L7:
            r1.f1770a = r2
            ci.r r2 = r1.f1772c
            if (r2 == 0) goto L10
            r2.invoke()
        L10:
            return
    }

    public final void h(float r2) {
            r1 = this;
            float r0 = r1.f1771b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L10
        L7:
            r1.f1771b = r2
            ci.r r2 = r1.f1772c
            if (r2 == 0) goto L10
            r2.invoke()
        L10:
            return
    }

    public final void i(float r5) {
            r4 = this;
            float r0 = r4.f1770a
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L17
            r4.g(r0)
            r4.f1773d = r0
            return
        L17:
            qg.r0 r0 = r4.f1779j
            r1 = 0
            if (r0 == 0) goto L1f
            r0.a(r1)
        L1f:
            ci.q r0 = r4.f1781l
            if (r0 == 0) goto L30
            ci.o r2 = new ci.o
            r3 = 0
            r2.<init>(r4, r5, r1, r3)
            java.lang.Object r5 = r0.invoke(r2)
            r1 = r5
            qg.r0 r1 = (qg.r0) r1
        L30:
            r4.f1779j = r1
            return
    }

    public final void j(float r5) {
            r4 = this;
            float r0 = r4.f1771b
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L17
            r4.h(r0)
            r4.f1774e = r0
            return
        L17:
            qg.r0 r0 = r4.f1780k
            r1 = 0
            if (r0 == 0) goto L1f
            r0.a(r1)
        L1f:
            ci.q r0 = r4.f1781l
            if (r0 == 0) goto L30
            ci.o r2 = new ci.o
            r3 = 1
            r2.<init>(r4, r5, r1, r3)
            java.lang.Object r5 = r0.invoke(r2)
            r1 = r5
            qg.r0 r1 = (qg.r0) r1
        L30:
            r4.f1780k = r1
            return
    }

    public final void k() {
            r3 = this;
            ci.r r0 = r3.f1783n
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.invoke()
            ci.z r0 = (ci.z) r0
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            boolean r1 = r3.d()
            boolean r2 = r0.a()
            if (r2 == r1) goto L1a
            r0.b(r1)
        L1a:
            return
    }
}
