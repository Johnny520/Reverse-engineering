package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jy2 {

    /* JADX INFO: renamed from: a */
    public static final String f5277a;

    /* JADX INFO: renamed from: b */
    public static final long f5278b;

    /* JADX INFO: renamed from: c */
    public static final int f5279c;

    /* JADX INFO: renamed from: d */
    public static final int f5280d;

    /* JADX INFO: renamed from: e */
    public static final long f5281e;

    /* JADX INFO: renamed from: f */
    public static final gd3 f5282f;

    static {
        String property;
        int i = nx2.f7364a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5277a = property;
        f5278b = AbstractC0738tl.m5295X("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = nx2.f7364a;
        if (i2 < 2) {
            i2 = 2;
        }
        f5279c = AbstractC0738tl.m5296Y("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        f5280d = AbstractC0738tl.m5296Y("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f5281e = TimeUnit.SECONDS.toNanos(AbstractC0738tl.m5295X("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5282f = gd3.f3415B;
    }
}
