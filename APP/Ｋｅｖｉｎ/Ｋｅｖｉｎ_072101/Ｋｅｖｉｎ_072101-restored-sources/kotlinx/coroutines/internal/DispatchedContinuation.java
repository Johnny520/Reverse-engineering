package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000O2\u00060?j\u0002`@2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJH\u0010+\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u000309¢\u0006\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\nR\u001c\u0010C\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, m115d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "awaitReusability", "()V", "", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "release", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation"
            java.lang.Class<kotlinx.coroutines.internal.DispatchedContinuation> r2 = kotlinx.coroutines.internal.DispatchedContinuation.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU = r0
            return
    }

    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r1._state = r0
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r0)
            r1.countOrElement = r0
            r0 = 0
            r1._reusableCancellableContinuation = r0
            return
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
            r2 = this;
            java.lang.Object r0 = r2._reusableCancellableContinuation
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto L9
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
            return
    }

    public final void awaitReusability() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0._reusableCancellableContinuation
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r2 == r4) goto Lb
            return
        Lb:
            goto L2
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedWithCancellation
            if (r0 == 0) goto Lc
            r0 = r2
            kotlinx.coroutines.CompletedWithCancellation r0 = (kotlinx.coroutines.CompletedWithCancellation) r0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r0.onCancellation
            r0.invoke(r3)
        Lc:
            return
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation() {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0._reusableCancellableContinuation
            r3 = 0
            if (r2 != 0) goto Lf
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r6._reusableCancellableContinuation = r4
            r4 = 0
            return r4
        Lf:
            boolean r4 = r2 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r4 == 0) goto L21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            if (r4 == 0) goto L2a
            r4 = r2
            kotlinx.coroutines.CancellableContinuationImpl r4 = (kotlinx.coroutines.CancellableContinuationImpl) r4
            return r4
        L21:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r2 != r4) goto L26
            goto L2a
        L26:
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L2c
        L2a:
        L2b:
            goto L2
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Inconsistent state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public final void dispatchYield$kotlinx_coroutines_core(kotlin.coroutines.CoroutineContext r3, T r4) {
            r2 = this;
            r2._state = r4
            r0 = 1
            r2.resumeMode = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            r1 = r2
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.dispatchYield(r3, r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.continuation
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isReusable() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean postponeCancellation(java.lang.Throwable r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._reusableCancellableContinuation
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r5 = 1
            if (r4 == 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r6, r8)
            if (r4 == 0) goto L2b
            return r5
        L1b:
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L20
            return r5
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            r5 = 0
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r2, r5)
            if (r4 == 0) goto L2b
            r4 = 0
            return r4
        L2b:
            goto L2
    }

    public final void release() {
            r1 = this;
            r1.awaitReusability()
            kotlinx.coroutines.CancellableContinuationImpl r0 = r1.getReusableCancellableContinuation()
            if (r0 != 0) goto La
            goto Ld
        La:
            r0.detachChild$kotlinx_coroutines_core()
        Ld:
            return
    }

    public final void resumeCancellableWith(java.lang.Object r24, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r25) {
            r23 = this;
            r1 = r23
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState(r24, r25)
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            kotlin.coroutines.CoroutineContext r4 = r23.getContext()
            boolean r0 = r0.isDispatchNeeded(r4)
            r4 = 1
            if (r0 == 0) goto L2c
            r1._state = r3
            r1.resumeMode = r4
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            kotlin.coroutines.CoroutineContext r4 = r23.getContext()
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r0.mo10220dispatch(r4, r5)
            r20 = r2
            r22 = r3
            r3 = r24
            goto L15a
        L2c:
            r5 = 1
            r6 = r23
            r7 = 0
            r8 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L3a
            r0 = 0
        L3a:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r9 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r0 = r9.isUnconfinedLoopActive()
            if (r0 == 0) goto L59
            r6._state = r3
            r6.resumeMode = r5
            r0 = r6
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r9.dispatchUnconfined(r0)
            r20 = r2
            r22 = r3
            r3 = r24
            goto L159
        L59:
            r10 = r6
            kotlinx.coroutines.DispatchedTask r10 = (kotlinx.coroutines.DispatchedTask) r10
            r11 = 0
            r9.incrementUseCount(r4)
            r12 = 0
            r0 = r23
            r13 = 0
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()     // Catch: java.lang.Throwable -> L141
            kotlinx.coroutines.Job$Key r16 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L141
            r4 = r16
            kotlin.coroutines.CoroutineContext$Key r4 = (kotlin.coroutines.CoroutineContext.Key) r4     // Catch: java.lang.Throwable -> L141
            kotlin.coroutines.CoroutineContext$Element r4 = r15.get(r4)     // Catch: java.lang.Throwable -> L141
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4     // Catch: java.lang.Throwable -> L141
            if (r4 == 0) goto La8
            boolean r15 = r4.isActive()     // Catch: java.lang.Throwable -> L9f
            if (r15 != 0) goto La8
            java.util.concurrent.CancellationException r15 = r4.getCancellationException()     // Catch: java.lang.Throwable -> L9f
            r14 = r15
            java.lang.Throwable r14 = (java.lang.Throwable) r14     // Catch: java.lang.Throwable -> L9f
            r0.cancelCompletedResult$kotlinx_coroutines_core(r3, r14)     // Catch: java.lang.Throwable -> L9f
            r14 = r0
            kotlin.coroutines.Continuation r14 = (kotlin.coroutines.Continuation) r14     // Catch: java.lang.Throwable -> L9f
            kotlin.Result$Companion r18 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9f
            r18 = r15
            java.lang.Throwable r18 = (java.lang.Throwable) r18     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r18 = kotlin.ResultKt.createFailure(r18)     // Catch: java.lang.Throwable -> L9f
            r19 = r0
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r18)     // Catch: java.lang.Throwable -> L9f
            r14.resumeWith(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = 1
            goto Lab
        L9f:
            r0 = move-exception
            r20 = r2
            r22 = r3
            r3 = r24
            goto L148
        La8:
            r19 = r0
            r0 = 0
        Lab:
            if (r0 != 0) goto L12c
            r4 = r23
            r13 = 0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> L141
            java.lang.Object r14 = r4.countOrElement     // Catch: java.lang.Throwable -> L141
            r15 = r0
            r18 = 0
            kotlin.coroutines.CoroutineContext r0 = r15.getContext()     // Catch: java.lang.Throwable -> L141
            r19 = r0
            r1 = r19
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r14)     // Catch: java.lang.Throwable -> L141
            r19 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L141
            r20 = r2
            r2 = r19
            if (r2 == r0) goto Ld9
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r15, r1, r2)     // Catch: java.lang.Throwable -> Ld2
            goto Le0
        Ld2:
            r0 = move-exception
            r22 = r3
            r3 = r24
            goto L148
        Ld9:
            r16 = 0
            r0 = r16
            kotlinx.coroutines.UndispatchedCoroutine r0 = (kotlinx.coroutines.UndispatchedCoroutine) r0     // Catch: java.lang.Throwable -> L126
            r0 = 0
        Le0:
            r19 = r0
            r0 = 0
            r21 = r0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> L10b
            r22 = r3
            r3 = r24
            r0.resumeWith(r3)     // Catch: java.lang.Throwable -> L109
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L109
            r17 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r17)     // Catch: java.lang.Throwable -> L13f
            if (r19 == 0) goto Lff
            boolean r0 = r19.clearThreadContext()     // Catch: java.lang.Throwable -> L13f
            if (r0 == 0) goto L102
        Lff:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)     // Catch: java.lang.Throwable -> L13f
        L102:
            r17 = 1
            kotlin.jvm.internal.InlineMarker.finallyEnd(r17)     // Catch: java.lang.Throwable -> L13f
            goto L132
        L109:
            r0 = move-exception
            goto L110
        L10b:
            r0 = move-exception
            r22 = r3
            r3 = r24
        L110:
            r17 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r17)     // Catch: java.lang.Throwable -> L13f
            if (r19 == 0) goto L11d
            boolean r21 = r19.clearThreadContext()     // Catch: java.lang.Throwable -> L13f
            if (r21 == 0) goto L120
        L11d:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)     // Catch: java.lang.Throwable -> L13f
        L120:
            r17 = 1
            kotlin.jvm.internal.InlineMarker.finallyEnd(r17)     // Catch: java.lang.Throwable -> L13f
            throw r0     // Catch: java.lang.Throwable -> L13f
        L126:
            r0 = move-exception
            r22 = r3
            r3 = r24
            goto L148
        L12c:
            r20 = r2
            r22 = r3
            r3 = r24
        L132:
        L133:
            boolean r0 = r9.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L13f
            if (r0 != 0) goto L133
            r1 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            goto L150
        L13f:
            r0 = move-exception
            goto L148
        L141:
            r0 = move-exception
            r20 = r2
            r22 = r3
            r3 = r24
        L148:
            r1 = 0
            r10.handleFatalException(r0, r1)     // Catch: java.lang.Throwable -> L15b
            r1 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
        L150:
            r9.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
        L159:
        L15a:
            return
        L15b:
            r0 = move-exception
            r1 = r0
            r2 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r9.decrementUseCount(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r1
    }

    public final boolean resumeCancelled(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L36
            boolean r2 = r1.isActive()
            if (r2 != 0) goto L36
            java.util.concurrent.CancellationException r2 = r1.getCancellationException()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5.cancelCompletedResult$kotlinx_coroutines_core(r6, r3)
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m8669constructorimpl(r4)
            r3.resumeWith(r4)
            r3 = 1
            return r3
        L36:
            r2 = 0
            return r2
    }

    public final void resumeUndispatchedWith(java.lang.Object r11) {
            r10 = this;
            r0 = 0
            kotlin.coroutines.Continuation<T> r1 = r10.continuation
            java.lang.Object r2 = r10.countOrElement
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            java.lang.Object r5 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r5 == r6) goto L17
            kotlinx.coroutines.UndispatchedCoroutine r6 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r1, r4, r5)
            goto L1b
        L17:
            r6 = 0
            r7 = r6
            kotlinx.coroutines.UndispatchedCoroutine r7 = (kotlinx.coroutines.UndispatchedCoroutine) r7
        L1b:
            r7 = 0
            r8 = 1
            kotlin.coroutines.Continuation<T> r9 = r10.continuation     // Catch: java.lang.Throwable -> L3a
            r9.resumeWith(r11)     // Catch: java.lang.Throwable -> L3a
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3a
            kotlin.jvm.internal.InlineMarker.finallyStart(r8)
            if (r6 == 0) goto L32
            boolean r7 = r6.clearThreadContext()
            if (r7 == 0) goto L35
        L32:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L35:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r8)
            return
        L3a:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r8)
            if (r6 == 0) goto L46
            boolean r9 = r6.clearThreadContext()
            if (r9 == 0) goto L49
        L46:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L49:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r8)
            throw r7
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r19) {
            r18 = this;
            r1 = r18
            r2 = r19
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            r4 = 0
            r5 = 1
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.toState$default(r2, r4, r5, r4)
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            boolean r0 = r0.isDispatchNeeded(r3)
            if (r0 == 0) goto L27
            r1._state = r6
            r0 = 0
            r1.resumeMode = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r0.mo10220dispatch(r3, r4)
            goto L96
        L27:
            r0 = 0
            r7 = r18
            r8 = r0
            r9 = 0
            r10 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L36
            r0 = 0
        L36:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r11 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r0 = r11.isUnconfinedLoopActive()
            if (r0 == 0) goto L4e
            r7._state = r6
            r7.resumeMode = r8
            r0 = r7
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r11.dispatchUnconfined(r0)
            goto L95
        L4e:
            r12 = r7
            kotlinx.coroutines.DispatchedTask r12 = (kotlinx.coroutines.DispatchedTask) r12
            r13 = 0
            r11.incrementUseCount(r5)
            r14 = 0
            kotlin.coroutines.CoroutineContext r0 = r18.getContext()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r15 = r1.countOrElement     // Catch: java.lang.Throwable -> L89
            r16 = r0
            r17 = 0
            r4 = r16
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r15)     // Catch: java.lang.Throwable -> L89
            r16 = r0
            r0 = 0
            kotlin.coroutines.Continuation<T> r5 = r1.continuation     // Catch: java.lang.Throwable -> L82
            r5.resumeWith(r2)     // Catch: java.lang.Throwable -> L82
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L82
            r5 = r16
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L89
        L7a:
            boolean r0 = r11.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L7a
            goto L8e
        L82:
            r0 = move-exception
            r5 = r16
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r4 = 0
            r12.handleFatalException(r0, r4)     // Catch: java.lang.Throwable -> L97
        L8e:
            r4 = 1
            r11.decrementUseCount(r4)
        L95:
        L96:
            return
        L97:
            r0 = move-exception
            r4 = r0
            r5 = 1
            r11.decrementUseCount(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.Object r0 = r3._state
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L1b
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            if (r0 == r2) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r3._state = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DispatchedContinuation["
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.CoroutineDispatcher r1 = r2.dispatcher
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.continuation
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation(kotlinx.coroutines.CancellableContinuation<?> r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._reusableCancellableContinuation
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r5 = 0
            if (r2 != r4) goto L19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r6, r8)
            if (r4 == 0) goto L17
            return r5
        L17:
            goto L2
        L19:
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L35
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r2, r5)
            if (r4 == 0) goto L29
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Inconsistent state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
