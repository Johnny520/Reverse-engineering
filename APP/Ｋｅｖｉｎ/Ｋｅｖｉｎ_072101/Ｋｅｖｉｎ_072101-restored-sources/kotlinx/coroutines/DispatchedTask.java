package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m115d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public DispatchedTask(int r1) {
            r0 = this;
            r0.<init>()
            r0.resumeMode = r1
            return
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            return
    }

    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            java.lang.Throwable r1 = r0.cause
        Lf:
            return r1
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void handleFatalException(java.lang.Throwable r5, java.lang.Throwable r6) {
            r4 = this;
            if (r5 != 0) goto L5
            if (r6 != 0) goto L5
            return
        L5:
            if (r5 == 0) goto Le
            if (r6 == 0) goto Le
            r0 = r5
            r1 = 0
            kotlin.ExceptionsKt.addSuppressed(r0, r6)
        Le:
            if (r5 != 0) goto L12
            r0 = r6
            goto L13
        L12:
            r0 = r5
        L13:
            kotlinx.coroutines.CoroutinesInternalError r1 = new kotlinx.coroutines.CoroutinesInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fatal exception in coroutines machinery for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r2, r0)
            kotlin.coroutines.Continuation r2 = r4.getDelegate$kotlinx_coroutines_core()
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r3)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r1 = r21
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1a
            r0 = 0
            int r2 = r1.resumeMode
            r3 = -1
            if (r2 == r3) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1a:
            kotlinx.coroutines.scheduling.TaskContext r2 = r1.taskContext
            r3 = 0
            kotlin.coroutines.Continuation r0 = r21.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L116
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0     // Catch: java.lang.Throwable -> L116
            r4 = r0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> L116
            r5 = r0
            java.lang.Object r0 = r4.countOrElement     // Catch: java.lang.Throwable -> L116
            r6 = r0
            r7 = 0
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()     // Catch: java.lang.Throwable -> L116
            r8 = r0
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r8, r6)     // Catch: java.lang.Throwable -> L116
            r9 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L116
            r10 = 0
            if (r9 == r0) goto L40
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r5, r8, r9)     // Catch: java.lang.Throwable -> L116
            goto L44
        L40:
            r0 = r10
            kotlinx.coroutines.UndispatchedCoroutine r0 = (kotlinx.coroutines.UndispatchedCoroutine) r0     // Catch: java.lang.Throwable -> L116
            r0 = r10
        L44:
            r11 = r0
            r0 = 0
            kotlin.coroutines.CoroutineContext r12 = r5.getContext()     // Catch: java.lang.Throwable -> L104
            java.lang.Object r13 = r21.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L104
            java.lang.Throwable r14 = r1.getExceptionalResult$kotlinx_coroutines_core(r13)     // Catch: java.lang.Throwable -> L104
            if (r14 != 0) goto L6f
            int r15 = r1.resumeMode     // Catch: java.lang.Throwable -> L68
            boolean r15 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r15)     // Catch: java.lang.Throwable -> L68
            if (r15 == 0) goto L6f
            kotlinx.coroutines.Job$Key r10 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.CoroutineContext$Element r10 = r12.get(r10)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10     // Catch: java.lang.Throwable -> L68
            goto L6f
        L68:
            r0 = move-exception
            r19 = r4
            r20 = r6
            goto L109
        L6f:
            if (r10 == 0) goto Lbe
            boolean r15 = r10.isActive()     // Catch: java.lang.Throwable -> L104
            if (r15 != 0) goto Lbe
            java.util.concurrent.CancellationException r15 = r10.getCancellationException()     // Catch: java.lang.Throwable -> L104
            r16 = r0
            r0 = r15
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L104
            r1.cancelCompletedResult$kotlinx_coroutines_core(r13, r0)     // Catch: java.lang.Throwable -> L104
            r0 = r5
            r17 = 0
            kotlin.Result$Companion r18 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L104
            r18 = 0
            boolean r19 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()     // Catch: java.lang.Throwable -> L104
            if (r19 == 0) goto Laa
            r19 = r4
            boolean r4 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L99
            r20 = r6
            goto Lae
        L99:
            r4 = r15
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> La6
            r20 = r6
            r6 = r0
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6     // Catch: java.lang.Throwable -> L102
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r6)     // Catch: java.lang.Throwable -> L102
            goto Lb1
        La6:
            r0 = move-exception
            r20 = r6
            goto L109
        Laa:
            r19 = r4
            r20 = r6
        Lae:
            r4 = r15
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L102
        Lb1:
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Throwable -> L102
            java.lang.Object r4 = kotlin.Result.m8669constructorimpl(r4)     // Catch: java.lang.Throwable -> L102
            r0.resumeWith(r4)     // Catch: java.lang.Throwable -> L102
            goto Le1
        Lbe:
            r16 = r0
            r19 = r4
            r20 = r6
            if (r14 == 0) goto Ld4
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L102
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r14)     // Catch: java.lang.Throwable -> L102
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)     // Catch: java.lang.Throwable -> L102
            r5.resumeWith(r0)     // Catch: java.lang.Throwable -> L102
            goto Le1
        Ld4:
            java.lang.Object r0 = r1.getSuccessfulResult$kotlinx_coroutines_core(r13)     // Catch: java.lang.Throwable -> L102
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L102
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)     // Catch: java.lang.Throwable -> L102
            r5.resumeWith(r0)     // Catch: java.lang.Throwable -> L102
        Le1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L102
            if (r11 == 0) goto Lec
            boolean r0 = r11.clearThreadContext()     // Catch: java.lang.Throwable -> L116
            if (r0 == 0) goto Lef
        Lec:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)     // Catch: java.lang.Throwable -> L116
        Lef:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L100
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0     // Catch: java.lang.Throwable -> L100
            r4 = 0
            r2.afterTask()     // Catch: java.lang.Throwable -> L100
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L100
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)     // Catch: java.lang.Throwable -> L100
            goto L133
        L100:
            r0 = move-exception
            goto L129
        L102:
            r0 = move-exception
            goto L109
        L104:
            r0 = move-exception
            r19 = r4
            r20 = r6
        L109:
            if (r11 == 0) goto L111
            boolean r4 = r11.clearThreadContext()     // Catch: java.lang.Throwable -> L116
            if (r4 == 0) goto L114
        L111:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)     // Catch: java.lang.Throwable -> L116
        L114:
            throw r0     // Catch: java.lang.Throwable -> L116
        L116:
            r0 = move-exception
            r3 = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L128
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0     // Catch: java.lang.Throwable -> L128
            r4 = 0
            r2.afterTask()     // Catch: java.lang.Throwable -> L128
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L128
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)     // Catch: java.lang.Throwable -> L128
            goto L133
        L128:
            r0 = move-exception
        L129:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L133:
            java.lang.Throwable r4 = kotlin.Result.m8672exceptionOrNullimpl(r0)
            r1.handleFatalException(r3, r4)
            return
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();
}
