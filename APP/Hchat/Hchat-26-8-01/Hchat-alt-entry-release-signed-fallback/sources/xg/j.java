package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f21623a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f21624b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21625c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21626d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f21627e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xg.g f21628f = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = vg.s.f14359a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            xg.j.f21623a = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            long r0 = vg.a.i(r1, r2, r4, r6)
            xg.j.f21624b = r0
            int r0 = vg.s.f14359a
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = vg.a.j(r0, r1, r2)
            xg.j.f21625c = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = vg.a.j(r0, r1, r2)
            xg.j.f21626d = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            long r0 = vg.a.i(r1, r2, r4, r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toNanos(r0)
            xg.j.f21627e = r0
            xg.g r0 = xg.g.f21619a
            xg.j.f21628f = r0
            return
    }
}
