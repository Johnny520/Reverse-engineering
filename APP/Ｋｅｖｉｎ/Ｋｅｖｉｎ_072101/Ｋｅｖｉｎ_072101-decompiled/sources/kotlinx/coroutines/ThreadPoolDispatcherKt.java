package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, m115d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ThreadPoolDispatcherKt {
    public static /* synthetic */ java.lang.Thread $r8$lambda$Hvo_A1RS2PU7rVE9OhBtvm0S7Js(int r0, java.lang.String r1, java.util.concurrent.atomic.AtomicInteger r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = m10166newFixedThreadPoolContext$lambda1(r0, r1, r2, r3)
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(int r3, java.lang.String r4) {
            r0 = 1
            if (r3 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L1d
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0 r1 = new kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            r1.<init>(r3, r4, r0)
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r1)
            r2 = r1
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            kotlinx.coroutines.ExecutorCoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
            return r2
        L1d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected at least one thread, but "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " specified"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: newFixedThreadPoolContext$lambda-1, reason: not valid java name */
    private static final java.lang.Thread m10166newFixedThreadPoolContext$lambda1(int r4, java.lang.String r5, java.util.concurrent.atomic.AtomicInteger r6, java.lang.Runnable r7) {
            java.lang.Thread r0 = new java.lang.Thread
            r1 = 1
            if (r4 != r1) goto L7
            r2 = r5
            goto L22
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            r3 = 45
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r6.incrementAndGet()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L22:
            r0.<init>(r7, r2)
            r0.setDaemon(r1)
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String r1) {
            r0 = 1
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = newFixedThreadPoolContext(r0, r1)
            return r0
    }
}
