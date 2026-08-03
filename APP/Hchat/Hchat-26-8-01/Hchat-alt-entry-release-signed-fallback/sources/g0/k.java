package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f4037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.d f4038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4042g;

    public k(java.lang.String r1, i2.n0 r2, m2.d r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.f4036a = r1
            r0.f4037b = r2
            r0.f4038c = r3
            r0.f4039d = r4
            r0.f4040e = r5
            r0.f4041f = r6
            r0.f4042g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L46
        L3:
            boolean r0 = r3 instanceof g0.k
            if (r0 != 0) goto L8
            goto L48
        L8:
            g0.k r3 = (g0.k) r3
            java.lang.String r0 = r2.f4036a
            java.lang.String r1 = r3.f4036a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L48
        L15:
            i2.n0 r0 = r2.f4037b
            i2.n0 r1 = r3.f4037b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L48
        L20:
            m2.d r0 = r2.f4038c
            m2.d r1 = r3.f4038c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L48
        L2b:
            int r0 = r2.f4039d
            int r1 = r3.f4039d
            if (r0 != r1) goto L48
            boolean r0 = r2.f4040e
            boolean r1 = r3.f4040e
            if (r0 == r1) goto L38
            goto L48
        L38:
            int r0 = r2.f4041f
            int r1 = r3.f4041f
            if (r0 == r1) goto L3f
            goto L48
        L3f:
            int r0 = r2.f4042g
            int r3 = r3.f4042g
            if (r0 == r3) goto L46
            goto L48
        L46:
            r3 = 1
            return r3
        L48:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            g0.n r0 = new g0.n
            r0.<init>()
            java.lang.String r1 = r2.f4036a
            r0.f4049u = r1
            i2.n0 r1 = r2.f4037b
            r0.f4050v = r1
            m2.d r1 = r2.f4038c
            r0.f4051w = r1
            int r1 = r2.f4039d
            r0.f4052x = r1
            boolean r1 = r2.f4040e
            r0.f4053y = r1
            int r1 = r2.f4041f
            r0.f4054z = r1
            int r1 = r2.f4042g
            r0.A = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            g0.n r1 = (g0.n) r1
            r1.getClass()
            i2.n0 r2 = r1.f4050v
            r3 = 0
            r4 = 1
            i2.n0 r5 = r0.f4037b
            if (r5 == r2) goto L1e
            i2.f0 r6 = r5.f6365a
            i2.f0 r2 = r2.f6365a
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            r2 = r4
            goto L22
        L1e:
            r5.getClass()
        L21:
            r2 = r3
        L22:
            java.lang.String r6 = r1.f4049u
            java.lang.String r7 = r0.f4036a
            boolean r6 = gg.l.a(r6, r7)
            r8 = 0
            if (r6 == 0) goto L2e
            goto L33
        L2e:
            r1.f4049u = r7
            r1.F = r8
            r3 = r4
        L33:
            i2.n0 r6 = r1.f4050v
            boolean r6 = r6.b(r5)
            r6 = r6 ^ r4
            r1.f4050v = r5
            int r5 = r1.A
            int r7 = r0.f4042g
            if (r5 == r7) goto L45
            r1.A = r7
            r6 = r4
        L45:
            int r5 = r1.f4054z
            int r7 = r0.f4041f
            if (r5 == r7) goto L4e
            r1.f4054z = r7
            r6 = r4
        L4e:
            boolean r5 = r1.f4053y
            boolean r7 = r0.f4040e
            if (r5 == r7) goto L57
            r1.f4053y = r7
            r6 = r4
        L57:
            m2.d r5 = r1.f4051w
            m2.d r7 = r0.f4038c
            boolean r5 = gg.l.a(r5, r7)
            if (r5 != 0) goto L64
            r1.f4051w = r7
            r6 = r4
        L64:
            int r5 = r1.f4052x
            int r7 = r0.f4039d
            if (r5 != r7) goto L6c
            r4 = r6
            goto L6e
        L6c:
            r1.f4052x = r7
        L6e:
            if (r2 != 0) goto L74
            if (r3 != 0) goto L74
            if (r4 == 0) goto L76
        L74:
            r1.D = r8
        L76:
            if (r3 != 0) goto L7a
            if (r4 == 0) goto L91
        L7a:
            g0.e r9 = r1.k1()
            java.lang.String r10 = r1.f4049u
            i2.n0 r11 = r1.f4050v
            m2.d r12 = r1.f4051w
            int r13 = r1.f4052x
            boolean r14 = r1.f4053y
            int r15 = r1.f4054z
            int r5 = r1.A
            r16 = r5
            r9.f(r10, r11, r12, r13, r14, r15, r16)
        L91:
            boolean r5 = r1.f21832t
            if (r5 != 0) goto L96
            goto Lb0
        L96:
            if (r3 != 0) goto L9e
            if (r2 == 0) goto La1
            g0.l r5 = r1.E
            if (r5 == 0) goto La1
        L9e:
            x1.k.n(r1)
        La1:
            if (r3 != 0) goto La5
            if (r4 == 0) goto Lab
        La5:
            x1.k.m(r1)
            x1.k.l(r1)
        Lab:
            if (r2 == 0) goto Lb0
            x1.k.l(r1)
        Lb0:
            return
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4036a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i2.n0 r2 = r3.f4037b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            m2.d r0 = r3.f4038c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f4039d
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f4040e
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f4041f
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f4042g
            int r0 = r0 + r2
            int r0 = r0 * r1
            return r0
    }
}
