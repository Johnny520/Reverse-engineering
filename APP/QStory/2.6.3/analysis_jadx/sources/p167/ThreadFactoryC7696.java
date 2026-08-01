package p167;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC7696 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ String f20879;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f20879);
        thread.setPriority(10);
        return thread;
    }
}
