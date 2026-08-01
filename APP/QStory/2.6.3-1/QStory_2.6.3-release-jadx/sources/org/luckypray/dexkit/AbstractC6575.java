package org.luckypray.dexkit;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f16078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f16079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ScheduledThreadPoolExecutor f16080;

    static {
        new AtomicReference(null);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6572());
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        f16080 = scheduledThreadPoolExecutor;
        new ReentrantReadWriteLock();
        f16079 = new CopyOnWriteArraySet();
        f16078 = 5000L;
        DexKitCacheBridge$CacheFailurePolicy.NONE.getClass();
    }
}
