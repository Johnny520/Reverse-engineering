package p000;

import com.p001mr.elaris.HookEntry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0361o7 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f643a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f644b = Executors.newSingleThreadExecutor(new ThreadFactoryC0345n7());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m769a(String str, Runnable runnable) {
        int iHotReloadGeneration = HookEntry.hotReloadGeneration();
        AtomicReference atomicReference = new AtomicReference();
        FutureTask futureTask = new FutureTask(new RunnableC0177d2(iHotReloadGeneration, runnable, str, atomicReference), null);
        atomicReference.set(futureTask);
        Future future = (Future) f643a.put(str, futureTask);
        if (future != null) {
            future.cancel(true);
        }
        f644b.execute(futureTask);
    }
}
