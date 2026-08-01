package org.luckypray.dexkit;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5744 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f15733;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f15734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ScheduledThreadPoolExecutor f15735;

    static {
        new AtomicReference(null);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5741());
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        f15735 = scheduledThreadPoolExecutor;
        new ReentrantReadWriteLock();
        f15734 = new CopyOnWriteArraySet();
        f15733 = 5000L;
        DexKitCacheBridge$CacheFailurePolicy.NONE.getClass();
    }
}
