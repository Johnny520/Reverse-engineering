package p201m3;

import java.util.concurrent.TimeUnit;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2472t;

/* JADX INFO: renamed from: m3.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2614k {

    /* JADX INFO: renamed from: a */
    public static final String f8311a;

    /* JADX INFO: renamed from: b */
    public static final long f8312b;

    /* JADX INFO: renamed from: c */
    public static final int f8313c;

    /* JADX INFO: renamed from: d */
    public static final int f8314d;

    /* JADX INFO: renamed from: e */
    public static final long f8315e;

    /* JADX INFO: renamed from: f */
    public static final C2610g f8316f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i5 = AbstractC2472t.f7960a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f8311a = property;
        f8312b = AbstractC2453a.m4381i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i6 = AbstractC2472t.f7960a;
        if (i6 < 2) {
            i6 = 2;
        }
        f8313c = AbstractC2453a.m4382j(i6, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f8314d = AbstractC2453a.m4382j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f8315e = TimeUnit.SECONDS.toNanos(AbstractC2453a.m4381i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f8316f = C2610g.f8306a;
    }
}
