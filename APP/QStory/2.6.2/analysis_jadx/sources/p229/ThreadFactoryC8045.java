package p229;

import java.util.concurrent.ThreadFactory;
import p005.C6105;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8045 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C6105(runnable);
    }
}
