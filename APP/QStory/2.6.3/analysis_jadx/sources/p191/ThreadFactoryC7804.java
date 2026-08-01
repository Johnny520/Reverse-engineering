package p191;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7804 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicInteger f21272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f21273;

    public ThreadFactoryC7804(int i) {
        this.f21273 = i;
        switch (i) {
            case 1:
                this.f21272 = new AtomicInteger(1);
                break;
            default:
                this.f21272 = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f21273;
        AtomicInteger atomicInteger = this.f21272;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                AbstractC8405.m13973("喵喵喵喵喵喵喵呜");
                runnable.getClass();
                return new Thread(runnable, AbstractC8405.m13972(1468) + atomicInteger.getAndIncrement());
        }
    }
}
