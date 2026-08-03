package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: mA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2224mA {

    /* JADX INFO: renamed from: a */
    public static final String f7736a;

    /* JADX INFO: renamed from: b */
    public static final long f7737b;

    /* JADX INFO: renamed from: c */
    public static final int f7738c;

    /* JADX INFO: renamed from: d */
    public static final int f7739d;

    /* JADX INFO: renamed from: e */
    public static final long f7740e;

    /* JADX INFO: renamed from: f */
    public static final C1456gf f7741f;

    static {
        String property;
        int i = AbstractC1356eA.f4858a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7736a = property;
        f7737b = AbstractC0714Qj.m1476G("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC1356eA.f4858a;
        if (i2 < 2) {
            i2 = 2;
        }
        f7738c = AbstractC0714Qj.m1477H("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        f7739d = AbstractC0714Qj.m1477H("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7740e = TimeUnit.SECONDS.toNanos(AbstractC0714Qj.m1476G("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7741f = C1456gf.f5164h;
    }
}
