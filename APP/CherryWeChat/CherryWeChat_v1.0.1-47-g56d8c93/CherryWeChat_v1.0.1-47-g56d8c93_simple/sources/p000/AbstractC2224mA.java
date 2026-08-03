package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: mA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2224mA {

    /* JADX INFO: renamed from: a */
    public static final String f7736a = null;

    /* JADX INFO: renamed from: b */
    public static final long f7737b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f7738c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f7739d = 0;

    /* JADX INFO: renamed from: e */
    public static final long f7740e = 0;

    /* JADX INFO: renamed from: f */
    public static final C1456gf f7741f = null;

    static {
        int r1 = AbstractC1356eA.f4858a;
        String r0 = System.getProperty("kotlinx.coroutines.scheduler.default.name");     // Catch: SecurityException -> L5
    L6:
        if (r0 != null) goto L8;
        r0 = "DefaultDispatcher";
    L8:
        f7736a = r0;
        f7737b = AbstractC0714Qj.m1476G("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
        int r02 = AbstractC1356eA.f4858a;
        if (r02 >= 2) goto L11;
        r02 = 2;
    L11:
        f7738c = AbstractC0714Qj.m1477H("kotlinx.coroutines.scheduler.core.pool.size", r02, 8);
        f7739d = AbstractC0714Qj.m1477H("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7740e = TimeUnit.SECONDS.toNanos(AbstractC0714Qj.m1476G("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
        f7741f = C1456gf.f5164h;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
