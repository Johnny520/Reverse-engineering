package p229;

import com.kongzue.dialogx.interfaces.RunnableC3742;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p004.C6096;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8045 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadFactoryC8046 f22212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicInteger f22208 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8044 f22210 = C8044.f22207;

    public ThreadFactoryC8045(ThreadFactoryC8046 threadFactoryC8046, String str, boolean z) {
        this.f22212 = threadFactoryC8046;
        this.f22211 = str;
        this.f22209 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3742 runnableC3742 = new RunnableC3742(this, 15, runnable);
        this.f22212.getClass();
        C6096 c6096 = new C6096(runnableC3742);
        c6096.setName("glide-" + this.f22211 + "-thread-" + this.f22208.getAndIncrement());
        return c6096;
    }
}
