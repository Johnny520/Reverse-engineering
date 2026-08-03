package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: od */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2319od implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f8165a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f8165a.getAndIncrement());
        return thread;
    }
}
