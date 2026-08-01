package p013;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC6224 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f17155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ String f17156;

    public /* synthetic */ ThreadFactoryC6224(String str, boolean z) {
        this.f17156 = str;
        this.f17155 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f17156);
        thread.setDaemon(this.f17155);
        return thread;
    }
}
