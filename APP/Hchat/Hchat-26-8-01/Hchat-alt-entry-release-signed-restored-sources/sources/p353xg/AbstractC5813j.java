package p353xg;

import java.util.concurrent.TimeUnit;
import vg.AbstractC4552a;
import vg.AbstractC4570s;

/* JADX INFO: renamed from: xg.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5813j {

    /* JADX INFO: renamed from: a */
    public static final String f23591a;

    /* JADX INFO: renamed from: b */
    public static final long f23592b;

    /* JADX INFO: renamed from: c */
    public static final int f23593c;

    /* JADX INFO: renamed from: d */
    public static final int f23594d;

    /* JADX INFO: renamed from: e */
    public static final long f23595e;

    /* JADX INFO: renamed from: f */
    public static final C5810g f23596f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i9 = AbstractC4570s.f15055a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f23591a = property;
        f23592b = AbstractC4552a.m8990i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = AbstractC4570s.f15055a;
        if (i10 < 2) {
            i10 = 2;
        }
        f23593c = AbstractC4552a.m8991j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f23594d = AbstractC4552a.m8991j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f23595e = TimeUnit.SECONDS.toNanos(AbstractC4552a.m8990i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f23596f = C5810g.f23587a;
    }
}
