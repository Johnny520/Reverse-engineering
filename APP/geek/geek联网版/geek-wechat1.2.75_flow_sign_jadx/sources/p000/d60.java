package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class d60 {

    /* JADX INFO: renamed from: a */
    public static final String f1318a;

    /* JADX INFO: renamed from: b */
    public static final long f1319b;

    /* JADX INFO: renamed from: c */
    public static final int f1320c;

    /* JADX INFO: renamed from: d */
    public static final int f1321d;

    /* JADX INFO: renamed from: e */
    public static final long f1322e;

    /* JADX INFO: renamed from: f */
    public static final C0893xh f1323f;

    /* JADX INFO: renamed from: g */
    public static final b60 f1324g;

    /* JADX INFO: renamed from: h */
    public static final b60 f1325h;

    static {
        String property;
        int i = y50.f5358a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1318a = property;
        f1319b = AbstractC0498mu.m1883G("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = y50.f5358a;
        if (i2 < 2) {
            i2 = 2;
        }
        f1320c = AbstractC0498mu.m1884H("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        f1321d = AbstractC0498mu.m1884H("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1322e = TimeUnit.SECONDS.toNanos(AbstractC0498mu.m1883G("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1323f = C0893xh.f5253i;
        f1324g = new b60(0);
        f1325h = new b60(1);
    }
}
