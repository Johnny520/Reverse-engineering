package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h.c f4620h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h.c f4621i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h.c f4622j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h.c f4623k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h.c f4624l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h.c f4625m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h.c f4626n = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4627g;

    static {
            h.c r0 = new h.c
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            h.c.f4620h = r0
            h.c r0 = new h.c
            r2 = 1
            r0.<init>(r1, r2)
            h.c.f4621i = r0
            h.c r0 = new h.c
            r2 = 2
            r0.<init>(r1, r2)
            h.c.f4622j = r0
            h.c r0 = new h.c
            r2 = 3
            r0.<init>(r1, r2)
            h.c.f4623k = r0
            h.c r0 = new h.c
            r2 = 4
            r0.<init>(r1, r2)
            h.c.f4624l = r0
            h.c r0 = new h.c
            r2 = 5
            r0.<init>(r1, r2)
            h.c.f4625m = r0
            h.c r0 = new h.c
            r2 = 6
            r0.<init>(r1, r2)
            h.c.f4626n = r0
            return
    }

    public /* synthetic */ c(int r1, int r2) {
            r0 = this;
            r0.f4627g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f4627g
            switch(r0) {
                case 0: goto L67;
                case 1: goto L62;
                case 2: goto L42;
                case 3: goto L24;
                case 4: goto L14;
                case 5: goto La;
                default: goto L5;
            }
        L5:
            i.e1 r6 = (i.e1) r6
            i.r0 r6 = h.m0.f4719c
            return r6
        La:
            i.e1 r6 = (i.e1) r6
            r6 = 0
            r0 = 7
            r1 = 0
            i.r0 r6 = i.d.o(r1, r1, r6, r0)
            return r6
        L14:
            i.n r6 = (i.n) r6
            float r0 = r6.f5732a
            float r6 = r6.f5733b
            long r0 = f1.c0.g(r0, r6)
            f1.u0 r6 = new f1.u0
            r6.<init>(r0)
            return r6
        L24:
            f1.u0 r6 = (f1.u0) r6
            long r0 = r6.f3124a
            i.n r6 = new i.n
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r6.<init>(r2, r0)
            return r6
        L42:
            f1.w r6 = (f1.w) r6
            long r0 = r6.f3133a
            g1.m r6 = g1.e.f4091x
            long r0 = f1.w.a(r0, r6)
            float r6 = f1.w.h(r0)
            float r2 = f1.w.g(r0)
            float r3 = f1.w.e(r0)
            float r0 = f1.w.d(r0)
            i.p r1 = new i.p
            r1.<init>(r0, r6, r2, r3)
            return r1
        L62:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
        L67:
            return r6
    }
}
