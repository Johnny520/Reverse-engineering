package org.luckypray.dexkit;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC6572 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "DexKit-Reaper");
        thread.setDaemon(true);
        return thread;
    }
}
