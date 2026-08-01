package p191;

import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC7803 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicInteger f21275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f21276;

    public ThreadFactoryC7803(int i) {
        this.f21276 = i;
        switch (i) {
            case 1:
                this.f21275 = new AtomicInteger(1);
                break;
            default:
                this.f21275 = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f21276;
        AtomicInteger atomicInteger = this.f21275;
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
