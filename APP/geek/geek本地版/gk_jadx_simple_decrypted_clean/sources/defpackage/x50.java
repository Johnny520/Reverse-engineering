package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class x50 {
    public static final String a = null;
    public static final long b = 0;
    public static final int c = 0;
    public static final int d = 0;
    public static final long e = 0;
    public static final vh f = null;
    public static final v50 g = null;
    public static final v50 h = null;

    static {
        int r1 = r50.a;
        String r0 = System.getProperty("kotlinx.coroutines.scheduler.default.name");     // Catch: SecurityException -> L5
    L6:
        if (r0 != null) goto L8;
        r0 = "DefaultDispatcher";
    L8:
        a = r0;
        b = gt.E("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
        int r02 = r50.a;
        if (r02 >= 2) goto L11;
        r02 = 2;
    L11:
        c = gt.F("kotlinx.coroutines.scheduler.core.pool.size", r02, 8);
        d = gt.F("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(gt.E("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
        f = vh.i;
        g = new v50(0);
        h = new v50(1);
        return;
    L5:
        r0 = null;
        goto L6
    }
}
