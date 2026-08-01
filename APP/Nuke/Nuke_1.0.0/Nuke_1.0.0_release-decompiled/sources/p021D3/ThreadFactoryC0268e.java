package p021D3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: D3.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0268e implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f865a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f865a) {
            case 0:
                Thread thread = new Thread(runnable, "NukeServerSync");
                thread.setDaemon(true);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, "NukeNativeWorker");
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
