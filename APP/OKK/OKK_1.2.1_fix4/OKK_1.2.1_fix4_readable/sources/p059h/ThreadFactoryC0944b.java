package p059h;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0944b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f3353a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f3353a.getAndIncrement());
        return thread;
    }
}
