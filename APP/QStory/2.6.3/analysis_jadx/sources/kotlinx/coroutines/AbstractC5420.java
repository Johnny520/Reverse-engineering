package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f15059 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5394 m10519() {
        ThreadLocal threadLocal = f15059;
        AbstractC5394 abstractC5394 = (AbstractC5394) threadLocal.get();
        if (abstractC5394 != null) {
            return abstractC5394;
        }
        C5443 c5443 = new C5443(Thread.currentThread());
        threadLocal.set(c5443);
        return c5443;
    }
}
