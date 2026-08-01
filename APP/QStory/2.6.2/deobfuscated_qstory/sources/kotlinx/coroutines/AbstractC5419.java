package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f15059 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5393 m10515() {
        ThreadLocal threadLocal = f15059;
        AbstractC5393 abstractC5393 = (AbstractC5393) threadLocal.get();
        if (abstractC5393 != null) {
            return abstractC5393;
        }
        C5442 c5442 = new C5442(Thread.currentThread());
        threadLocal.set(c5442);
        return c5442;
    }
}
