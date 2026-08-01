package p000;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010a9 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f39a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f40b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final ThreadPoolExecutor f41c;

    /* JADX INFO: renamed from: d */
    public static final ThreadPoolExecutor f42d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        ThreadFactoryC0345n7 threadFactoryC0345n7 = new ThreadFactoryC0345n7("Elaris-KkTtsCatalog");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 20L, timeUnit, arrayBlockingQueue, threadFactoryC0345n7, discardOldestPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f41c = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 20L, timeUnit, new ArrayBlockingQueue(1), new ThreadFactoryC0345n7("Elaris-KkTts"), new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f42d = threadPoolExecutor2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m72a(C0314l8 c0314l8) {
        AtomicReference atomicReference;
        do {
            atomicReference = f39a;
            if (atomicReference.compareAndSet(c0314l8, null)) {
                break;
            }
        } while (atomicReference.get() == c0314l8);
        c0314l8.m754c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m73b() {
        f40b.set(false);
    }
}
