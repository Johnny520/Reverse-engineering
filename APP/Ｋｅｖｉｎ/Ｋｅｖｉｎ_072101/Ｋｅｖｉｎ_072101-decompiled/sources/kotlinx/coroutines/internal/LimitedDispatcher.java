package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0016J#\u0010\u001a\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0082\bJ\u001c\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0017J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010!\u001a\u00020\u0013H\u0016J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130$H\u0096\u0001J\b\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m115d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "runningWorkers", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "addAndTryDispatching", "", "block", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchInternal", "Lkotlin/Function0;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "run", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements java.lang.Runnable, kotlinx.coroutines.Delay {
    private final /* synthetic */ kotlinx.coroutines.Delay $$delegate_0;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> queue;
    private volatile int runningWorkers;
    private final java.lang.Object workerAllocationLock;

    public LimitedDispatcher(kotlinx.coroutines.CoroutineDispatcher r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.dispatcher = r3
            r2.parallelism = r4
            boolean r0 = r3 instanceof kotlinx.coroutines.Delay
            if (r0 == 0) goto Lf
            r0 = r3
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L16
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
        L16:
            r2.$$delegate_0 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueue r0 = new kotlinx.coroutines.internal.LockFreeTaskQueue
            r1 = 0
            r0.<init>(r1)
            r2.queue = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.workerAllocationLock = r0
            return
    }

    private final boolean addAndTryDispatching(java.lang.Runnable r3) {
            r2 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r0 = r2.queue
            r0.addLast(r3)
            int r0 = r2.runningWorkers
            int r1 = r2.parallelism
            if (r0 < r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private final void dispatchInternal(java.lang.Runnable r3, kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            r2 = this;
            r0 = 0
            boolean r1 = r2.addAndTryDispatching(r3)
            if (r1 == 0) goto L8
            return
        L8:
            boolean r1 = r2.tryAllocateWorker()
            if (r1 != 0) goto Lf
            return
        Lf:
            r4.invoke()
            return
    }

    private final boolean tryAllocateWorker() {
            r5 = this;
            java.lang.Object r0 = r5.workerAllocationLock
            r1 = 0
            monitor-enter(r0)
            r2 = 0
            int r3 = r5.runningWorkers     // Catch: java.lang.Throwable -> L17
            int r4 = r5.parallelism     // Catch: java.lang.Throwable -> L17
            if (r3 < r4) goto Le
            monitor-exit(r0)
            r0 = 0
            return r0
        Le:
            int r3 = r5.runningWorkers     // Catch: java.lang.Throwable -> L17
            r4 = 1
            int r3 = r3 + r4
            r5.runningWorkers = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r4
        L17:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            java.lang.Object r0 = r0.delay(r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10220dispatch(kotlin.coroutines.CoroutineContext r7, java.lang.Runnable r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            boolean r2 = r0.addAndTryDispatching(r8)
            if (r2 == 0) goto L9
            goto L1e
        L9:
            boolean r2 = r0.tryAllocateWorker()
            if (r2 != 0) goto L10
            goto L1e
        L10:
            r2 = 0
            kotlinx.coroutines.CoroutineDispatcher r3 = r6.dispatcher
            r4 = r6
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            r5 = r6
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r3.mo10220dispatch(r4, r5)
        L1e:
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r7, java.lang.Runnable r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            boolean r2 = r0.addAndTryDispatching(r8)
            if (r2 == 0) goto L9
            goto L1e
        L9:
            boolean r2 = r0.tryAllocateWorker()
            if (r2 != 0) goto L10
            goto L1e
        L10:
            r2 = 0
            kotlinx.coroutines.CoroutineDispatcher r3 = r6.dispatcher
            r4 = r6
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            r5 = r6
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r3.dispatchYield(r4, r5)
        L1e:
            return
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnTimeout(r2, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            int r0 = r1.parallelism
            if (r2 < r0) goto Lb
            r0 = r1
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            return r0
        Lb:
            kotlinx.coroutines.CoroutineDispatcher r0 = super.limitedParallelism(r2)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
            r0 = 0
        L1:
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r1 = r6.queue
            java.lang.Object r1 = r1.removeFirstOrNull()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L37
        Ld:
            r1.run()     // Catch: java.lang.Throwable -> L11
            goto L19
        L11:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r2)
        L19:
            int r0 = r0 + 1
            r2 = 16
            if (r0 < r2) goto L36
            kotlinx.coroutines.CoroutineDispatcher r2 = r6.dispatcher
            r3 = r6
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            boolean r2 = r2.isDispatchNeeded(r3)
            if (r2 == 0) goto L36
            kotlinx.coroutines.CoroutineDispatcher r2 = r6.dispatcher
            r3 = r6
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            r4 = r6
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.mo10220dispatch(r3, r4)
            return
        L36:
            goto L1
        L37:
            java.lang.Object r2 = r6.workerAllocationLock
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.runningWorkers     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-1)
            r6.runningWorkers = r5     // Catch: java.lang.Throwable -> L59
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r5 = r6.queue     // Catch: java.lang.Throwable -> L59
            int r5 = r5.getSize()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L4c
            monitor-exit(r2)
            return
        L4c:
            int r5 = r6.runningWorkers     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + 1
            r6.runningWorkers = r5     // Catch: java.lang.Throwable -> L59
            r0 = 0
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r2)
            goto L1
        L59:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10221scheduleResumeAfterDelay(long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            r0.mo10221scheduleResumeAfterDelay(r2, r4)
            return
    }
}
