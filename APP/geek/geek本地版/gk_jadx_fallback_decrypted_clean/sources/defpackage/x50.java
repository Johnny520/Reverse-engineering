package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x50 {
    public static final java.lang.String a = null;
    public static final long b = 0;
    public static final int c = 0;
    public static final int d = 0;
    public static final long e = 0;
    public static final defpackage.vh f = null;
    public static final defpackage.v50 g = null;
    public static final defpackage.v50 h = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = defpackage.r50.a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            defpackage.x50.a = r0
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            long r0 = defpackage.gt.E(r1, r2, r4, r6)
            defpackage.x50.b = r0
            int r0 = defpackage.r50.a
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = defpackage.gt.F(r2, r0, r1)
            defpackage.x50.c = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = defpackage.gt.F(r2, r0, r1)
            defpackage.x50.d = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            long r1 = defpackage.gt.E(r1, r2, r4, r6)
            long r0 = r0.toNanos(r1)
            defpackage.x50.e = r0
            vh r0 = defpackage.vh.i
            defpackage.x50.f = r0
            v50 r0 = new v50
            r1 = 0
            r0.<init>(r1)
            defpackage.x50.g = r0
            v50 r0 = new v50
            r1 = 1
            r0.<init>(r1)
            defpackage.x50.h = r0
            return
    }
}
