package pg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l3.w f10555g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f10556h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f10557i = 0;

    static {
            l3.w r0 = new l3.w
            r1 = 16
            r0.<init>(r1)
            pg.a.f10555g = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = oh.h.v(r0)
            pg.a.f10556h = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = oh.h.v(r0)
            pg.a.f10557i = r0
            return
    }

    public static final long a(long r6, long r8) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r8 / r0
            long r6 = oh.h.e(r6, r2)
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L25
            r4 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L25
            long r2 = r2 * r0
            long r8 = r8 - r2
            long r6 = r6 * r0
            long r6 = r6 + r8
            r8 = 1
            long r6 = r6 << r8
            int r8 = pg.b.f10558a
            return r6
        L25:
            long r6 = oh.h.v(r6)
            return r6
    }
}
