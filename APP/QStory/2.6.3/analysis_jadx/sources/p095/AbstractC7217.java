package p095;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.AbstractC5359;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7213 f19259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f19260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f19262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f19263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f19264;

    static {
        String property;
        int i = AbstractC5359.f14941;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f19264 = property;
        f19263 = AbstractC5353.m10372("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC5359.f14941;
        if (i2 < 2) {
            i2 = 2;
        }
        f19262 = AbstractC5353.m10373(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f19261 = AbstractC5353.m10373(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19260 = TimeUnit.SECONDS.toNanos(AbstractC5353.m10372("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19259 = C7213.f19250;
    }
}
