package p095;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5358;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7212 f19264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f19265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f19267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f19268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f19269;

    static {
        String property;
        int i = AbstractC5358.f14941;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f19269 = property;
        f19268 = AbstractC5352.m10368("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC5358.f14941;
        if (i2 < 2) {
            i2 = 2;
        }
        f19267 = AbstractC5352.m10369(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f19266 = AbstractC5352.m10369(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19265 = TimeUnit.SECONDS.toNanos(AbstractC5352.m10368("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19264 = C7212.f19255;
    }
}
