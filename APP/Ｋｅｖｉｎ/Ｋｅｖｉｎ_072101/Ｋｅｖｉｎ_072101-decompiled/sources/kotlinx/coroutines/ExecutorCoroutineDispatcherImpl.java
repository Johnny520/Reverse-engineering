package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020$2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, m115d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "cancelJobOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "Ljava/util/concurrent/RejectedExecutionException;", "close", "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class ExecutorCoroutineDispatcherImpl extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private final java.util.concurrent.Executor executor;

    public ExecutorCoroutineDispatcherImpl(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            r1.executor = r2
            java.util.concurrent.Executor r0 = r1.getExecutor()
            kotlinx.coroutines.internal.ConcurrentKt.removeFutureOnCancel(r0)
            return
    }

    private final void cancelJobOnRejection(kotlin.coroutines.CoroutineContext r3, java.util.concurrent.RejectedExecutionException r4) {
            r2 = this;
            java.lang.String r0 = "The task was rejected"
            r1 = r4
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.ExceptionsKt.CancellationException(r0, r1)
            kotlinx.coroutines.JobKt.cancel(r3, r0)
            return
    }

    private final java.util.concurrent.ScheduledFuture<?> scheduleBlock(java.util.concurrent.ScheduledExecutorService r4, java.lang.Runnable r5, kotlin.coroutines.CoroutineContext r6, long r7) {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L8
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r5, r7, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L8
            goto L11
        L8:
            r0 = move-exception
            r3.cancelJobOnRejection(r6, r0)
            r1 = 0
            r2 = r1
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            r0 = r1
        L11:
            return r0
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L12
        Lf:
            r0.shutdown()
        L12:
            return
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            java.lang.Object r0 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10220dispatch(kotlin.coroutines.CoroutineContext r3, java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            if (r1 != 0) goto Lc
        Lb:
            goto L13
        Lc:
            java.lang.Runnable r1 = r1.wrapTask(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            if (r1 != 0) goto L14
            goto Lb
        L13:
            r1 = r4
        L14:
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            goto L2d
        L18:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L20
            goto L23
        L20:
            r1.unTrackTask()
        L23:
            r2.cancelJobOnRejection(r3, r0)
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            r1.mo10220dispatch(r3, r4)
        L2d:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            if (r0 == 0) goto L13
            r0 = r3
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcherImpl) r0
            java.util.concurrent.Executor r0 = r0.getExecutor()
            java.util.concurrent.Executor r1 = r2.getExecutor()
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r10, java.lang.Runnable r12, kotlin.coroutines.CoroutineContext r13) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 != 0) goto L11
            goto L19
        L11:
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.scheduleBlock(r4, r5, r6, r7)
        L19:
            r0 = r2
            if (r0 == 0) goto L28
            kotlinx.coroutines.DisposableFutureHandle r1 = new kotlinx.coroutines.DisposableFutureHandle
            r2 = r0
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r1.<init>(r2)
            kotlinx.coroutines.DisposableHandle r1 = (kotlinx.coroutines.DisposableHandle) r1
            goto L2e
        L28:
            kotlinx.coroutines.DefaultExecutor r1 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.DisposableHandle r1 = r1.invokeOnTimeout(r10, r12, r13)
        L2e:
            return r1
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10221scheduleResumeAfterDelay(long r10, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r12) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 != 0) goto L11
            goto L27
        L11:
            kotlinx.coroutines.ResumeUndispatchedRunnable r0 = new kotlinx.coroutines.ResumeUndispatchedRunnable
            r1 = r9
            kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
            r0.<init>(r1, r12)
            r5 = r0
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            kotlin.coroutines.CoroutineContext r6 = r12.getContext()
            r3 = r9
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.scheduleBlock(r4, r5, r6, r7)
        L27:
            r0 = r2
            if (r0 == 0) goto L31
            r1 = r0
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            kotlinx.coroutines.JobKt.cancelFutureOnCancellation(r12, r1)
            return
        L31:
            kotlinx.coroutines.DefaultExecutor r1 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r1.mo10221scheduleResumeAfterDelay(r10, r12)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
