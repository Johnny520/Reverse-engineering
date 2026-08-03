package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements i.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.n1 f5838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.m1 f5839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f5840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f5841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.q f5842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i.q f5843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.q f5844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.q f5846i;

    public z0(i.k r1, i.m1 r2, java.lang.Object r3, java.lang.Object r4, i.q r5) {
            r0 = this;
            i.n1 r1 = r1.a(r2)
            r0.<init>()
            r0.f5838a = r1
            r0.f5839b = r2
            r0.f5840c = r4
            r0.f5841d = r3
            fg.l r1 = r2.f5730a
            java.lang.Object r1 = r1.invoke(r3)
            i.q r1 = (i.q) r1
            r0.f5842e = r1
            fg.l r1 = r2.f5730a
            java.lang.Object r2 = r1.invoke(r4)
            i.q r2 = (i.q) r2
            r0.f5843f = r2
            if (r5 == 0) goto L2a
            i.q r1 = i.d.i(r5)
            goto L34
        L2a:
            java.lang.Object r1 = r1.invoke(r3)
            i.q r1 = (i.q) r1
            i.q r1 = r1.c()
        L34:
            r0.f5844g = r1
            r1 = -1
            r0.f5845h = r1
            return
    }

    @Override // i.g
    public final boolean a() {
            r1 = this;
            i.n1 r0 = r1.f5838a
            boolean r0 = r0.a()
            return r0
    }

    @Override // i.g
    public final long b() {
            r4 = this;
            long r0 = r4.f5845h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            i.q r0 = r4.f5843f
            i.q r1 = r4.f5844g
            i.n1 r2 = r4.f5838a
            i.q r3 = r4.f5842e
            long r0 = r2.b(r3, r0, r1)
            r4.f5845h = r0
        L16:
            long r0 = r4.f5845h
            return r0
    }

    @Override // i.g
    public final i.m1 c() {
            r1 = this;
            i.m1 r0 = r1.f5839b
            return r0
    }

    @Override // i.g
    public final i.q d(long r8) {
            r7 = this;
            boolean r0 = r7.e(r8)
            if (r0 != 0) goto L14
            i.q r5 = r7.f5843f
            i.q r6 = r7.f5844g
            i.n1 r1 = r7.f5838a
            i.q r4 = r7.f5842e
            r2 = r8
            i.q r8 = r1.n(r2, r4, r5, r6)
            return r8
        L14:
            i.q r8 = r7.f5846i
            if (r8 != 0) goto L26
            i.q r8 = r7.f5843f
            i.q r9 = r7.f5844g
            i.n1 r0 = r7.f5838a
            i.q r1 = r7.f5842e
            i.q r8 = r0.g(r1, r8, r9)
            r7.f5846i = r8
        L26:
            return r8
    }

    @Override // i.g
    public final java.lang.Object f(long r8) {
            r7 = this;
            boolean r0 = r7.e(r8)
            if (r0 != 0) goto L51
            i.q r5 = r7.f5843f
            i.q r6 = r7.f5844g
            i.n1 r1 = r7.f5838a
            i.q r4 = r7.f5842e
            r2 = r8
            i.q r8 = r1.w(r2, r4, r5, r6)
            int r9 = r8.b()
            r0 = 0
        L18:
            if (r0 >= r9) goto L48
            float r1 = r8.a(r0)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "AnimationVector cannot contain a NaN. "
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r4 = ". Animation: "
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = ", playTimeNanos: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            i.o0.b(r1)
        L45:
            int r0 = r0 + 1
            goto L18
        L48:
            i.m1 r9 = r7.f5839b
            fg.l r9 = r9.f5731b
            java.lang.Object r8 = r9.invoke(r8)
            return r8
        L51:
            java.lang.Object r8 = r7.f5840c
            return r8
    }

    @Override // i.g
    public final java.lang.Object g() {
            r1 = this;
            java.lang.Object r0 = r1.f5840c
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TargetBasedAnimation: "
            r0.<init>(r1)
            java.lang.Object r1 = r5.f5841d
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.Object r1 = r5.f5840c
            r0.append(r1)
            java.lang.String r1 = ",initial velocity: "
            r0.append(r1)
            i.q r1 = r5.f5844g
            r0.append(r1)
            java.lang.String r1 = ", duration: "
            r0.append(r1)
            long r1 = r5.b()
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " ms,animationSpec: "
            r0.append(r1)
            i.n1 r1 = r5.f5838a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
