package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements i0.l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.m1 f5666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.j1 f5667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.j1 f5668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0.j1 f5669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0.j1 f5670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0.f1 f5671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0.j1 f5673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.q f5674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0.h1 f5675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i.r0 f5677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i.k1 f5678s;

    public g1(i.k1 r10, java.lang.Object r11, i.q r12, i.m1 r13) {
            r9 = this;
            r9.<init>()
            r9.f5678s = r10
            r9.f5666g = r13
            i0.j1 r10 = i0.r.u(r11)
            r9.f5667h = r10
            r0 = 7
            r1 = 0
            r2 = 0
            i.r0 r0 = i.d.o(r1, r1, r2, r0)
            i0.j1 r0 = i0.r.u(r0)
            r9.f5668i = r0
            i.z0 r3 = new i.z0
            i.y r4 = r9.c()
            java.lang.Object r7 = r10.getValue()
            r6 = r11
            r8 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            i0.j1 r10 = i0.r.u(r3)
            r9.f5669j = r10
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            i0.j1 r10 = i0.r.u(r10)
            r9.f5670k = r10
            i0.f1 r10 = new i0.f1
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.<init>(r11)
            r9.f5671l = r10
            i0.j1 r10 = i0.r.u(r6)
            r9.f5673n = r10
            r9.f5674o = r8
            i.z0 r10 = r9.a()
            long r10 = r10.b()
            i0.h1 r12 = new i0.h1
            r12.<init>(r10)
            r9.f5675p = r12
            java.lang.Object r10 = i.v1.f5821a
            java.lang.Object r10 = r10.get(r5)
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L83
            float r10 = r10.floatValue()
            fg.l r11 = r5.f5730a
            java.lang.Object r11 = r11.invoke(r6)
            i.q r11 = (i.q) r11
            int r12 = r11.b()
            r13 = 0
        L73:
            if (r13 >= r12) goto L7b
            r11.e(r13, r10)
            int r13 = r13 + 1
            goto L73
        L7b:
            i.m1 r10 = r9.f5666g
            fg.l r10 = r10.f5731b
            java.lang.Object r2 = r10.invoke(r11)
        L83:
            r10 = 3
            i.r0 r10 = i.d.o(r1, r1, r2, r10)
            r9.f5677r = r10
            return
    }

    public final i.z0 a() {
            r1 = this;
            i0.j1 r0 = r1.f5669j
            java.lang.Object r0 = r0.getValue()
            i.z0 r0 = (i.z0) r0
            return r0
    }

    public final i.y c() {
            r1 = this;
            i0.j1 r0 = r1.f5668i
            java.lang.Object r0 = r0.getValue()
            i.y r0 = (i.y) r0
            return r0
    }

    public final void d() {
            r4 = this;
            i0.f1 r0 = r4.f5671l
            float r0 = r0.g()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            r0 = 1
            r4.f5676q = r0
            i.z0 r0 = r4.a()
            java.lang.Object r0 = r0.f5840c
            i.z0 r1 = r4.a()
            java.lang.Object r1 = r1.f5841d
            boolean r0 = gg.l.a(r0, r1)
            i0.j1 r1 = r4.f5673n
            if (r0 == 0) goto L2d
            i.z0 r0 = r4.a()
            java.lang.Object r0 = r0.f5840c
            r1.setValue(r0)
            return
        L2d:
            i.z0 r0 = r4.a()
            r2 = 0
            java.lang.Object r0 = r0.f(r2)
            r1.setValue(r0)
            i.z0 r0 = r4.a()
            i.q r0 = r0.d(r2)
            r4.f5674o = r0
        L44:
            return
    }

    public final void e(java.lang.Object r15, boolean r16) {
            r14 = this;
            i.k1 r0 = r14.f5678s
            i0.j1 r1 = r0.f5714h
            i0.j1 r2 = r14.f5667h
            java.lang.Object r3 = r2.getValue()
            r4 = 0
            boolean r3 = gg.l.a(r4, r3)
            i0.h1 r4 = r14.f5675p
            i0.j1 r5 = r14.f5669j
            if (r3 == 0) goto L38
            i.z0 r6 = new i.z0
            i.q r0 = r14.f5674o
            i.q r11 = r0.c()
            i.r0 r7 = r14.f5677r
            i.m1 r8 = r14.f5666g
            r10 = r15
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            r5.setValue(r6)
            r15 = 1
            r14.f5672m = r15
            i.z0 r15 = r14.a()
            long r0 = r15.b()
            r4.h(r0)
            return
        L38:
            if (r16 == 0) goto L4e
            boolean r3 = r14.f5676q
            if (r3 != 0) goto L4e
            i.y r3 = r14.c()
            boolean r3 = r3 instanceof i.r0
            if (r3 == 0) goto L4b
            i.y r3 = r14.c()
            goto L52
        L4b:
            i.r0 r3 = r14.f5677r
            goto L52
        L4e:
            i.y r3 = r14.c()
        L52:
            long r6 = r0.e()
            r12 = 0
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 > 0) goto L5e
            r7 = r3
            goto L68
        L5e:
            long r6 = r0.e()
            i.s0 r8 = new i.s0
            r8.<init>(r3, r6)
            r7 = r8
        L68:
            i.z0 r6 = new i.z0
            java.lang.Object r10 = r2.getValue()
            i.q r11 = r14.f5674o
            i.m1 r8 = r14.f5666g
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            r5.setValue(r6)
            i.z0 r15 = r14.a()
            long r2 = r15.b()
            r4.h(r2)
            r15 = 0
            r14.f5672m = r15
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            boolean r2 = r0.g()
            if (r2 == 0) goto Lb5
            w0.p r0 = r0.f5715i
            int r2 = r0.size()
        L98:
            if (r15 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r15)
            i.g1 r3 = (i.g1) r3
            i0.h1 r4 = r3.f5675p
            long r4 = r4.g()
            long r12 = java.lang.Math.max(r12, r4)
            r3.d()
            int r15 = r15 + 1
            goto L98
        Lb0:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r1.setValue(r15)
        Lb5:
            return
    }

    public final void f(java.lang.Object r2, java.lang.Object r3, i.y r4) {
            r1 = this;
            i0.j1 r0 = r1.f5667h
            r0.setValue(r3)
            i0.j1 r0 = r1.f5668i
            r0.setValue(r4)
            i.z0 r4 = r1.a()
            java.lang.Object r4 = r4.f5841d
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L23
            i.z0 r4 = r1.a()
            java.lang.Object r4 = r4.f5840c
            boolean r3 = gg.l.a(r4, r3)
            if (r3 == 0) goto L23
            return
        L23:
            r3 = 0
            r1.e(r2, r3)
            return
    }

    public final void g(java.lang.Object r8, i.y r9) {
            r7 = this;
            boolean r0 = r7.f5672m
            if (r0 == 0) goto Lc
            r0 = 0
            boolean r0 = gg.l.a(r8, r0)
            if (r0 == 0) goto Lc
            goto L24
        Lc:
            i0.j1 r0 = r7.f5667h
            java.lang.Object r1 = r0.getValue()
            boolean r1 = gg.l.a(r1, r8)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            i0.f1 r3 = r7.f5671l
            if (r1 == 0) goto L25
            float r1 = r3.g()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L25
        L24:
            return
        L25:
            r0.setValue(r8)
            i0.j1 r0 = r7.f5668i
            r0.setValue(r9)
            float r9 = r3.g()
            r0 = -1069547520(0xffffffffc0400000, float:-3.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            i0.j1 r1 = r7.f5673n
            if (r9 != 0) goto L3b
            r9 = r8
            goto L3f
        L3b:
            java.lang.Object r9 = r1.getValue()
        L3f:
            i0.j1 r4 = r7.f5670k
            java.lang.Object r5 = r4.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 1
            r5 = r5 ^ r6
            r7.e(r9, r5)
            float r9 = r3.g()
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r5 = 0
            if (r9 != 0) goto L5a
            goto L5b
        L5a:
            r6 = r5
        L5b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            r4.setValue(r9)
            float r9 = r3.g()
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L86
            i.z0 r8 = r7.a()
            long r8 = r8.b()
            i.z0 r0 = r7.a()
            float r8 = (float) r8
            float r9 = r3.g()
            float r9 = r9 * r8
            long r8 = (long) r9
            java.lang.Object r8 = r0.f(r8)
            r1.setValue(r8)
            goto L91
        L86:
            float r9 = r3.g()
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L91
            r1.setValue(r8)
        L91:
            r7.f5672m = r5
            r3.h(r2)
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.j1 r0 = r1.f5673n
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "current value: "
            r0.<init>(r1)
            i0.j1 r1 = r2.f5673n
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", target: "
            r0.append(r1)
            i0.j1 r1 = r2.f5667h
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", spec: "
            r0.append(r1)
            i.y r1 = r2.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
