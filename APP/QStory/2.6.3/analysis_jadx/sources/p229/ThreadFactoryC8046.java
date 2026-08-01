package p229;

import java.util.concurrent.ThreadFactory;
import p004.C6096;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8046 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C6096(runnable);
    }
}
