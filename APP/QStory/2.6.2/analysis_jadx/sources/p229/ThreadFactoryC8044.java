package p229;

import com.kongzue.dialogx.interfaces.RunnableC3741;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p005.C6105;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8044 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ThreadFactoryC8045 f22215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicInteger f22211 = new AtomicInteger();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8043 f22213 = C8043.f22210;

    public ThreadFactoryC8044(ThreadFactoryC8045 threadFactoryC8045, String str, boolean z) {
        this.f22215 = threadFactoryC8045;
        this.f22214 = str;
        this.f22212 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3741 runnableC3741 = new RunnableC3741(this, 15, runnable);
        this.f22215.getClass();
        C6105 c6105 = new C6105(runnableC3741);
        c6105.setName("glide-" + this.f22214 + "-thread-" + this.f22211.getAndIncrement());
        return c6105;
    }
}
