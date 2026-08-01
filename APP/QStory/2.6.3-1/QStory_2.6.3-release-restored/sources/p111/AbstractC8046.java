package p111;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.AbstractC6191;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8046 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8042 f19604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f19605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f19606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f19607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f19608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f19609;

    static {
        String property;
        int i = AbstractC6191.f15286;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f19609 = property;
        f19608 = AbstractC6185.m10931("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC6191.f15286;
        if (i2 < 2) {
            i2 = 2;
        }
        f19607 = AbstractC6185.m10932(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f19606 = AbstractC6185.m10932(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19605 = TimeUnit.SECONDS.toNanos(AbstractC6185.m10931("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19604 = C8042.f19595;
    }
}
