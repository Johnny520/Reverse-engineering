package p017;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC6232 implements ThreadFactory {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f17178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ String f17179;

    public /* synthetic */ ThreadFactoryC6232(String str, boolean z) {
        this.f17179 = str;
        this.f17178 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f17179);
        thread.setDaemon(this.f17178);
        return thread;
    }
}
