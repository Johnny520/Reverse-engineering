package p071j;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0733b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2487a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2488b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ThreadFactoryC0733b(int i2) {
        this.f2487a = i2;
        switch (i2) {
            case 1:
                this.f2488b = new AtomicInteger(1);
                break;
            default:
                this.f2488b = new AtomicInteger(0);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2487a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f2488b.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, "AppExecutor@IO #" + this.f2488b.getAndIncrement());
        }
    }
}
