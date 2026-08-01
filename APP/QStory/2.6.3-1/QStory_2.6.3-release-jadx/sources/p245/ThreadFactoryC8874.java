package p245;

import com.kongzue.dialogx.interfaces.RunnableC4574;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p020.C6925;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8874 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadFactoryC8875 f22557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicInteger f22553 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8873 f22555 = C8873.f22552;

    public ThreadFactoryC8874(ThreadFactoryC8875 threadFactoryC8875, String str, boolean z) {
        this.f22557 = threadFactoryC8875;
        this.f22556 = str;
        this.f22554 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC4574 runnableC4574 = new RunnableC4574(this, 15, runnable);
        this.f22557.getClass();
        C6925 c6925 = new C6925(runnableC4574);
        c6925.setName("glide-" + this.f22556 + "-thread-" + this.f22553.getAndIncrement());
        return c6925;
    }
}
