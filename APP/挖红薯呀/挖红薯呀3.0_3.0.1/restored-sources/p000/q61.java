package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q61 {

    /* JADX INFO: renamed from: a */
    public static final String f5072a;

    /* JADX INFO: renamed from: b */
    public static final long f5073b;

    /* JADX INFO: renamed from: c */
    public static final int f5074c;

    /* JADX INFO: renamed from: d */
    public static final int f5075d;

    /* JADX INFO: renamed from: e */
    public static final long f5076e;

    /* JADX INFO: renamed from: f */
    public static final C0496n2 f5077f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i = a61.f60a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5072a = property;
        f5073b = j50.m1673w("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = a61.f60a;
        if (i2 < 2) {
            i2 = 2;
        }
        f5074c = j50.m1674x(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f5075d = j50.m1674x(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f5076e = TimeUnit.SECONDS.toNanos(j50.m1673w("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5077f = C0496n2.f4132L;
    }
}
