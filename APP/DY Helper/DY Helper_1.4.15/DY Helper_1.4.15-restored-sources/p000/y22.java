package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class y22 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.String f12429 = null;

    /* JADX INFO: renamed from: β */
    public static final long f12430 = 0;

    /* JADX INFO: renamed from: γ */
    public static final int f12431 = 0;

    /* JADX INFO: renamed from: δ */
    public static final int f12432 = 0;

    /* JADX INFO: renamed from: ε */
    public static final long f12433 = 0;

    /* JADX INFO: renamed from: ζ */
    public static final p000.xn0 f12434 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = p000.j22.f5301
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            p000.y22.f12429 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            long r0 = p000.u81.m5816(r1, r2, r4, r6)
            p000.y22.f12430 = r0
            int r0 = p000.j22.f5301
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = p000.u81.m5817(r0, r1, r2)
            p000.y22.f12431 = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = p000.u81.m5817(r0, r1, r2)
            p000.y22.f12432 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            long r0 = p000.u81.m5816(r1, r2, r4, r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toNanos(r0)
            p000.y22.f12433 = r0
            xn0 r0 = p000.xn0.f12229
            p000.y22.f12434 = r0
            return
    }
}
