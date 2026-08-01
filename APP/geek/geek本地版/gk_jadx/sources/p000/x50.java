package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class x50 {

    /* JADX INFO: renamed from: a */
    public static final String f5096a;

    /* JADX INFO: renamed from: b */
    public static final long f5097b;

    /* JADX INFO: renamed from: c */
    public static final int f5098c;

    /* JADX INFO: renamed from: d */
    public static final int f5099d;

    /* JADX INFO: renamed from: e */
    public static final long f5100e;

    /* JADX INFO: renamed from: f */
    public static final C0819vh f5101f;

    /* JADX INFO: renamed from: g */
    public static final v50 f5102g;

    /* JADX INFO: renamed from: h */
    public static final v50 f5103h;

    static {
        String property;
        int i = r50.f4212a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5096a = property;
        f5097b = AbstractC0273gt.m1299E("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = r50.f4212a;
        if (i2 < 2) {
            i2 = 2;
        }
        f5098c = AbstractC0273gt.m1300F("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        f5099d = AbstractC0273gt.m1300F("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f5100e = TimeUnit.SECONDS.toNanos(AbstractC0273gt.m1299E("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5101f = C0819vh.f4850i;
        f5102g = new v50(0);
        f5103h = new v50(1);
    }
}
