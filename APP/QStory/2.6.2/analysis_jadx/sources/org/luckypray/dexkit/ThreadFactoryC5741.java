package org.luckypray.dexkit;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC5741 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "DexKit-Reaper");
        thread.setDaemon(true);
        return thread;
    }
}
