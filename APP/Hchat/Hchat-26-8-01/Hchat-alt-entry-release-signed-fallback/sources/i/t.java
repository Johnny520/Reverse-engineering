package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.c f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.m1 f5787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f5788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.q f5789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.q f5790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i.q f5791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f5792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5793h;

    public t(i.u r22, i.m1 r23, java.lang.Object r24, i.q r25) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r25
            hb.c r4 = new hb.c
            r5 = r22
            androidx.lifecycle.x r5 = r5.f5808a
            r4.<init>(r5)
            r0.<init>()
            r0.f5786a = r4
            r0.f5787b = r1
            r0.f5788c = r2
            fg.l r5 = r1.f5730a
            java.lang.Object r2 = r5.invoke(r2)
            i.q r2 = (i.q) r2
            r0.f5789d = r2
            i.q r5 = i.d.i(r3)
            r0.f5790e = r5
            fg.l r1 = r1.f5731b
            java.lang.Object r5 = r4.f5341j
            i.q r5 = (i.q) r5
            if (r5 != 0) goto L38
            i.q r5 = r2.c()
            r4.f5341j = r5
        L38:
            java.lang.Object r5 = r4.f5341j
            i.q r5 = (i.q) r5
            java.lang.String r7 = "targetVector"
            if (r5 == 0) goto L129
            int r5 = r5.b()
            r9 = 0
        L45:
            java.lang.Object r10 = r4.f5341j
            i.q r10 = (i.q) r10
            if (r9 >= r5) goto L90
            if (r10 == 0) goto L8a
            java.lang.Object r13 = r4.f5338g
            androidx.lifecycle.x r13 = (androidx.lifecycle.x) r13
            float r14 = r2.a(r9)
            float r15 = r3.a(r9)
            java.lang.Object r13 = r13.f310h
            h.v0 r13 = (h.v0) r13
            double r16 = r13.b(r15)
            r22 = 0
            float r6 = h.w0.f4771a
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = (double) r6
            double r18 = r11 - r23
            float r6 = r13.f4765a
            float r13 = r13.f4766b
            float r6 = r6 * r13
            r20 = r9
            double r8 = (double) r6
            double r11 = r11 / r18
            double r11 = r11 * r16
            double r11 = java.lang.Math.exp(r11)
            double r11 = r11 * r8
            float r6 = (float) r11
            float r8 = java.lang.Math.signum(r15)
            float r8 = r8 * r6
            float r8 = r8 + r14
            r6 = r20
            r10.e(r6, r8)
            int r9 = r6 + 1
            goto L45
        L8a:
            r22 = 0
            gg.l.g(r7)
            throw r22
        L90:
            r22 = 0
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r10 == 0) goto L125
            java.lang.Object r1 = r1.invoke(r10)
            r0.f5792g = r1
            hb.c r1 = r0.f5786a
            i.q r2 = r0.f5789d
            java.lang.Object r4 = r1.f5340i
            i.q r4 = (i.q) r4
            if (r4 != 0) goto Lac
            i.q r4 = r2.c()
            r1.f5340i = r4
        Lac:
            java.lang.Object r4 = r1.f5340i
            i.q r4 = (i.q) r4
            if (r4 == 0) goto L11f
            int r4 = r4.b()
            r5 = 0
            r7 = 0
        Lb9:
            if (r7 >= r4) goto Lea
            java.lang.Object r8 = r1.f5338g
            androidx.lifecycle.x r8 = (androidx.lifecycle.x) r8
            r2.getClass()
            float r9 = r3.a(r7)
            java.lang.Object r8 = r8.f310h
            h.v0 r8 = (h.v0) r8
            double r8 = r8.b(r9)
            float r10 = h.w0.f4771a
            double r10 = (double) r10
            double r10 = r10 - r23
            double r8 = r8 / r10
            double r8 = java.lang.Math.exp(r8)
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            long r5 = java.lang.Math.max(r5, r8)
            int r7 = r7 + 1
            goto Lb9
        Lea:
            r0.f5793h = r5
            hb.c r1 = r0.f5786a
            i.q r2 = r0.f5789d
            i.q r1 = r1.k(r5, r2, r3)
            i.q r1 = i.d.i(r1)
            r0.f5791f = r1
            int r1 = r1.b()
            r8 = 0
        Lff:
            if (r8 >= r1) goto L11e
            i.q r2 = r0.f5791f
            float r3 = r2.a(r8)
            hb.c r4 = r0.f5786a
            r4.getClass()
            hb.c r4 = r0.f5786a
            r4.getClass()
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            float r3 = r9.e0.q(r3, r5, r4)
            r2.e(r8, r3)
            int r8 = r8 + 1
            goto Lff
        L11e:
            return
        L11f:
            java.lang.String r1 = "velocityVector"
            gg.l.g(r1)
            throw r22
        L125:
            gg.l.g(r7)
            throw r22
        L129:
            r22 = 0
            gg.l.g(r7)
            throw r22
    }

    @Override // i.g
    public final boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // i.g
    public final long b() {
            r2 = this;
            long r0 = r2.f5793h
            return r0
    }

    @Override // i.g
    public final i.m1 c() {
            r1 = this;
            i.m1 r0 = r1.f5787b
            return r0
    }

    @Override // i.g
    public final i.q d(long r4) {
            r3 = this;
            boolean r0 = r3.e(r4)
            if (r0 != 0) goto L11
            i.q r0 = r3.f5789d
            i.q r1 = r3.f5790e
            hb.c r2 = r3.f5786a
            i.q r4 = r2.k(r4, r0, r1)
            return r4
        L11:
            i.q r4 = r3.f5791f
            return r4
    }

    @Override // i.g
    public final java.lang.Object f(long r19) {
            r18 = this;
            r0 = r18
            boolean r1 = r18.e(r19)
            if (r1 != 0) goto L85
            i.m1 r1 = r0.f5787b
            fg.l r1 = r1.f5731b
            hb.c r2 = r0.f5786a
            java.lang.Object r3 = r2.f5339h
            i.q r3 = (i.q) r3
            i.q r4 = r0.f5789d
            if (r3 != 0) goto L1c
            i.q r3 = r4.c()
            r2.f5339h = r3
        L1c:
            java.lang.Object r3 = r2.f5339h
            i.q r3 = (i.q) r3
            r5 = 0
            java.lang.String r6 = "valueVector"
            if (r3 == 0) goto L81
            int r3 = r3.b()
            r7 = 0
        L2a:
            java.lang.Object r8 = r2.f5339h
            i.q r8 = (i.q) r8
            if (r7 >= r3) goto L76
            if (r8 == 0) goto L72
            java.lang.Object r9 = r2.f5338g
            androidx.lifecycle.x r9 = (androidx.lifecycle.x) r9
            float r10 = r4.a(r7)
            i.q r11 = r0.f5790e
            float r11 = r11.a(r7)
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r19 / r12
            java.lang.Object r9 = r9.f310h
            h.v0 r9 = (h.v0) r9
            h.u0 r9 = r9.a(r11)
            long r14 = r9.f4762c
            r16 = 0
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 <= 0) goto L59
            float r11 = (float) r12
            float r12 = (float) r14
            float r11 = r11 / r12
            goto L5b
        L59:
            r11 = 1065353216(0x3f800000, float:1.0)
        L5b:
            float r12 = r9.f4761b
            float r9 = r9.f4760a
            float r9 = java.lang.Math.signum(r9)
            float r9 = r9 * r12
            h.a r11 = h.b.a(r11)
            float r11 = r11.f4610a
            float r9 = r9 * r11
            float r9 = r9 + r10
            r8.e(r7, r9)
            int r7 = r7 + 1
            goto L2a
        L72:
            gg.l.g(r6)
            throw r5
        L76:
            if (r8 == 0) goto L7d
            java.lang.Object r1 = r1.invoke(r8)
            return r1
        L7d:
            gg.l.g(r6)
            throw r5
        L81:
            gg.l.g(r6)
            throw r5
        L85:
            java.lang.Object r1 = r0.f5792g
            return r1
    }

    @Override // i.g
    public final java.lang.Object g() {
            r1 = this;
            java.lang.Object r0 = r1.f5792g
            return r0
    }
}
