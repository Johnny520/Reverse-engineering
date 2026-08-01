package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f15404 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC6226 m11078() {
        ThreadLocal threadLocal = f15404;
        AbstractC6226 abstractC6226 = (AbstractC6226) threadLocal.get();
        if (abstractC6226 != null) {
            return abstractC6226;
        }
        C6275 c6275 = new C6275(Thread.currentThread());
        threadLocal.set(c6275);
        return c6275;
    }
}
