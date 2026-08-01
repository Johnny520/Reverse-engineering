package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛶᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0662 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final long f2268 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final int f2269 = 0;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final long f2270 = 0;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.String f2271 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final int f2272 = 0;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0263 f2273 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = xhss.AbstractC0903.f2932
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            xhss.AbstractC0662.f2271 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            long r0 = xhss.AbstractC0473.m866(r1, r2, r4, r6)
            xhss.AbstractC0662.f2268 = r0
            int r0 = xhss.AbstractC0903.f2932
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = xhss.AbstractC0473.m864(r2, r0, r1)
            xhss.AbstractC0662.f2269 = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = xhss.AbstractC0473.m864(r2, r0, r1)
            xhss.AbstractC0662.f2272 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            long r0 = xhss.AbstractC0473.m866(r1, r2, r4, r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toNanos(r0)
            xhss.AbstractC0662.f2270 = r0
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f981
            xhss.AbstractC0662.f2273 = r0
            return
    }
}
