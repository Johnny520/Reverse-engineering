package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f12093q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12094r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg.t f12095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.z f12096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.e0 f12097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.y f12098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.j1 f12100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.j1 f12101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.j1 f12102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.j1 f12103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f12104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i1.b f12106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i.c f12107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i.c f12108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0.j1 f12109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12110p;

    static {
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            r2 = 32
            long r2 = r0 << r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            s.t.f12093q = r0
            return
    }

    public t(qg.t r7, f1.z r8, i.e0 r9) {
            r6 = this;
            r6.<init>()
            r6.f12095a = r7
            r6.f12096b = r8
            r6.f12097c = r9
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            i0.j1 r9 = i0.r.u(r7)
            r6.f12100f = r9
            i0.j1 r9 = i0.r.u(r7)
            r6.f12101g = r9
            i0.j1 r9 = i0.r.u(r7)
            r6.f12102h = r9
            i0.j1 r7 = i0.r.u(r7)
            r6.f12103i = r7
            long r0 = s.t.f12093q
            r6.f12104j = r0
            r2 = 0
            r6.f12105k = r2
            r7 = 0
            if (r8 == 0) goto L33
            i1.b r8 = r8.c()
            goto L34
        L33:
            r8 = r7
        L34:
            r6.f12106l = r8
            i.c r8 = new i.c
            u2.j r9 = new u2.j
            r9.<init>(r2)
            i.m1 r4 = i.d.f5634p
            r5 = 12
            r8.<init>(r9, r4, r7, r5)
            r6.f12107m = r8
            i.c r8 = new i.c
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            i.m1 r4 = i.d.f5628j
            r8.<init>(r9, r4, r7, r5)
            r6.f12108n = r8
            u2.j r7 = new u2.j
            r7.<init>(r2)
            i0.j1 r7 = i0.r.u(r7)
            r6.f12109o = r7
            r6.f12110p = r0
            return
    }

    public final void a() {
            r4 = this;
            i1.b r0 = r4.f12106l
            i0.j1 r1 = r4.f12101g
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            boolean r1 = r4.b()
            if (r1 == 0) goto L27
            if (r0 == 0) goto L1a
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f(r1)
        L1a:
            s.s r0 = new s.s
            r1 = 0
            r2 = 0
            r0.<init>(r4, r2, r1)
            r1 = 3
            qg.t r3 = r4.f12095a
            qg.v.q(r3, r2, r0, r1)
        L27:
            return
    }

    public final boolean b() {
            r1 = this;
            i0.j1 r0 = r1.f12102h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void c() {
            r6 = this;
            i0.j1 r0 = r6.f12100f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 3
            qg.t r2 = r6.f12095a
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L1f
            r6.d(r3)
            s.s r0 = new s.s
            r5 = 2
            r0.<init>(r6, r4, r5)
            qg.v.q(r2, r4, r0, r1)
        L1f:
            i0.j1 r0 = r6.f12101g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            i0.j1 r0 = r6.f12101g
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r5)
            s.s r0 = new s.s
            r5 = 3
            r0.<init>(r6, r4, r5)
            qg.v.q(r2, r4, r0, r1)
        L3f:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            i0.j1 r0 = r6.f12102h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r5)
            s.s r0 = new s.s
            r5 = 4
            r0.<init>(r6, r4, r5)
            qg.v.q(r2, r4, r0, r1)
        L57:
            r6.f12099e = r3
            r0 = 0
            r6.e(r0)
            long r0 = s.t.f12093q
            r6.f12104j = r0
            i1.b r0 = r6.f12106l
            if (r0 == 0) goto L6d
            f1.z r1 = r6.f12096b
            if (r1 == 0) goto L6d
            r1.a(r0)
        L6d:
            r6.f12106l = r4
            r6.f12098d = r4
            return
    }

    public final void d(boolean r2) {
            r1 = this;
            i0.j1 r0 = r1.f12100f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            return
    }

    public final void e(long r2) {
            r1 = this;
            u2.j r0 = new u2.j
            r0.<init>(r2)
            i0.j1 r2 = r1.f12109o
            r2.setValue(r0)
            return
    }
}
