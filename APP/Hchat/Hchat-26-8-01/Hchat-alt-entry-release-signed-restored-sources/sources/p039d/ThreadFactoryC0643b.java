package p039d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: d.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0643b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2004a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2005b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ThreadFactoryC0643b(int i9) {
        this.f2004a = i9;
        switch (i9) {
            case 1:
                this.f2005b = new AtomicInteger(0);
                break;
            default:
                this.f2005b = new AtomicInteger(0);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2004a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f2005b.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, AbstractC0921a.m2249l(this.f2005b.incrementAndGet(), "jadx-events-thread-"));
        }
    }
}
