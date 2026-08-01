package p207;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8633 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicInteger f21617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f21618;

    public ThreadFactoryC8633(int i) {
        this.f21618 = i;
        switch (i) {
            case 1:
                this.f21617 = new AtomicInteger(1);
                break;
            default:
                this.f21617 = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f21618;
        AtomicInteger atomicInteger = this.f21617;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                "r";
                runnable.getClass();
                return new Thread(runnable, "appExecutor-" + atomicInteger.getAndIncrement());
        }
    }
}
