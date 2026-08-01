package defpackage;

/* JADX INFO: renamed from: ᛶᲁᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1155 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final long f5249 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int f5250 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int f5251 = 0;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.String f5252 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final long f5253 = 0;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1654 f5254 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = defpackage.AbstractC1249.f5578
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            defpackage.AbstractC1155.f5252 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            long r0 = defpackage.AbstractC0397.m1150(r1, r2, r4, r6)
            defpackage.AbstractC1155.f5253 = r0
            int r0 = defpackage.AbstractC1249.f5578
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = defpackage.AbstractC0397.m1147(r2, r0, r1)
            defpackage.AbstractC1155.f5251 = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = defpackage.AbstractC0397.m1147(r2, r0, r1)
            defpackage.AbstractC1155.f5250 = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            long r0 = defpackage.AbstractC0397.m1150(r1, r2, r4, r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toNanos(r0)
            defpackage.AbstractC1155.f5249 = r0
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7359
            defpackage.AbstractC1155.f5254 = r0
            return
    }
}
