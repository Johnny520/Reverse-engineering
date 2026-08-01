package p000;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0345n7 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f590a;

    /* JADX INFO: renamed from: b */
    public final Serializable f591b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ThreadFactoryC0345n7() {
        this.f590a = 0;
        this.f591b = new AtomicInteger();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f590a;
        Serializable serializable = this.f591b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, "Elaris-hook-worker-" + ((AtomicInteger) serializable).incrementAndGet());
                thread.setDaemon(true);
                thread.setPriority(1);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, (String) serializable);
                thread2.setDaemon(true);
                thread2.setPriority(1);
                return thread2;
        }
    }

    public ThreadFactoryC0345n7(String str) {
        this.f590a = 1;
        this.f591b = str;
    }
}
