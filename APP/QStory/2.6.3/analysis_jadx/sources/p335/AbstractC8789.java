package p335;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p191.ThreadFactoryC7804;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世子楪哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorService f24756;

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), new ThreadFactoryC7804(1));
        AbstractC8405.m13972(1469);
        executorServiceNewFixedThreadPool.getClass();
        f24756 = executorServiceNewFixedThreadPool;
    }
}
