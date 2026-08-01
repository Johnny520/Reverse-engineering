package p174i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2265b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f7408a = new AtomicInteger(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f7408a.getAndIncrement());
        return thread;
    }
}
