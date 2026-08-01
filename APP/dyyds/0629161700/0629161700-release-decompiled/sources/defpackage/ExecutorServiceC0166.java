package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC0166 implements java.util.concurrent.ExecutorService, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static volatile int f1141;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.ThreadPoolExecutor f1142;

    public ExecutorServiceC0166(java.util.concurrent.ThreadPoolExecutor r1) {
            r0 = this;
            r0.<init>()
            r0.f1142 = r1
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            boolean r0 = r0.awaitTermination(r1, r3)
            return r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r6 != r0) goto L7
            goto L2e
        L7:
            java.util.concurrent.ThreadPoolExecutor r0 = r6.f1142
            boolean r1 = r0.isTerminated()
            if (r1 != 0) goto L2e
            r6.shutdown()
            r2 = 0
        L13:
            if (r1 != 0) goto L25
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L1e
            r4 = 1
            boolean r1 = r0.awaitTermination(r4, r3)     // Catch: java.lang.InterruptedException -> L1e
            goto L13
        L1e:
            if (r2 != 0) goto L13
            r6.shutdownNow()
            r2 = 1
            goto L13
        L25:
            if (r2 == 0) goto L2e
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L2e:
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            r0.execute(r1)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r1) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.List r0 = r0.invokeAll(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.List r0 = r0.invokeAll(r1, r2, r4)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r1) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.lang.Object r0 = r0.invokeAny(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.lang.Object r0 = r0.invokeAny(r1, r2, r4)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.concurrent.Future r0 = r0.submit(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.concurrent.Future r0 = r0.submit(r1, r2)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.util.concurrent.Future r0 = r0.submit(r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f1142
            java.lang.String r0 = r0.toString()
            return r0
    }
}
