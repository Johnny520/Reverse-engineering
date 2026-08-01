package lc;

import java.util.concurrent.TimeUnit;
import p080f9.AbstractC2368o;
import p145jc.AbstractC3803e0;
import p145jc.AbstractC3807g0;

/* JADX INFO: renamed from: lc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4744j {

    /* JADX INFO: renamed from: a */
    public static final String f14058a = AbstractC3803e0.m15156e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    public static final long f14059b = AbstractC3807g0.m15168f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f14060c = AbstractC3807g0.m15167e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC2368o.m8578e(AbstractC3803e0.m15152a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    public static final int f14061d = AbstractC3807g0.m15167e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    public static final long f14062e = TimeUnit.SECONDS.toNanos(AbstractC3807g0.m15168f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    public static AbstractC4741g f14063f = C4739e.f14049a;

    /* JADX INFO: renamed from: b */
    public static final AbstractRunnableC4742h m18979b(Runnable runnable, long j10, boolean z10) {
        return new C4743i(runnable, j10, z10);
    }

    /* JADX INFO: renamed from: c */
    public static final String m18980c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
