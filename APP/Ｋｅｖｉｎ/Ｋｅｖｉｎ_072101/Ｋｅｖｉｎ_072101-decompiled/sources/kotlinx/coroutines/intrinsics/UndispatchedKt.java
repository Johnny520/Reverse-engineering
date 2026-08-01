package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m115d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class UndispatchedKt {
    public static final <T> void startCoroutineUndispatched(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super T> r11) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r11)
            r2 = r1
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r11.getContext()     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            r6 = 0
            java.lang.Object r7 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L3c
            r8 = 0
            r9 = 1
            java.lang.Object r9 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r9)     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r9.invoke(r2)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r2 = r9
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L36
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r3)
        L36:
            goto L4b
        L37:
            r8 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L3c
            throw r8     // Catch: java.lang.Throwable -> L3c
        L3c:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r1.resumeWith(r3)
        L4b:
            return
    }

    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, R r11, kotlin.coroutines.Continuation<? super T> r12) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r12)
            r2 = r1
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r12.getContext()     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            r6 = 0
            java.lang.Object r7 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L3c
            r8 = 0
            r9 = 2
            java.lang.Object r9 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r9)     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r9.invoke(r11, r2)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r2 = r9
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L36
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r3)
        L36:
            goto L4b
        L37:
            r8 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L3c
            throw r8     // Catch: java.lang.Throwable -> L3c
        L3c:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r1.resumeWith(r3)
        L4b:
            return
    }

    public static final <T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r6)
            r2 = r1
            r3 = 0
            r4 = 1
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r4)     // Catch: java.lang.Throwable -> L26
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.invoke(r2)     // Catch: java.lang.Throwable -> L26
            r2 = r4
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L25
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r3)
        L25:
            goto L35
        L26:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r1.resumeWith(r3)
        L35:
            return
    }

    public static final <R, T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, R r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r7)
            r2 = r1
            r3 = 0
            r4 = 2
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r4)     // Catch: java.lang.Throwable -> L26
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.invoke(r6, r2)     // Catch: java.lang.Throwable -> L26
            r2 = r4
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L25
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r3)
        L25:
            goto L35
        L26:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r1.resumeWith(r3)
        L35:
            return
    }

    private static final <T> void startDirect(kotlin.coroutines.Continuation<? super T> r4, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r4)
            java.lang.Object r2 = r5.invoke(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L1c
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r3)
        L1c:
            return
        L1d:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r1.resumeWith(r3)
            return
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r8, R r9, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10) {
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = 2
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r3)     // Catch: java.lang.Throwable -> L13
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4     // Catch: java.lang.Throwable -> L13
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r4.invoke(r9, r5)     // Catch: java.lang.Throwable -> L13
            goto L1c
        L13:
            r2 = move-exception
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r5 = 0
            r6 = 0
            r4.<init>(r2, r5, r3, r6)
            r3 = r4
        L1c:
            r2 = r3
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L28
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L63
        L28:
            java.lang.Object r3 = r0.makeCompletingOnce$kotlinx_coroutines_core(r2)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r3 != r4) goto L36
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r3 = r4
            goto L63
        L36:
            boolean r4 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 == 0) goto L5e
        L3b:
            r4 = r3
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            r5 = 0
            r4 = r3
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L5d
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L55
            goto L5d
        L55:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r7)
            r4 = r7
        L5d:
            throw r4
        L5e:
            java.lang.Object r4 = kotlinx.coroutines.JobSupportKt.unboxState(r3)
            r3 = r4
        L63:
            return r3
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r8, R r9, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10) {
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 2
            java.lang.Object r5 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r4)     // Catch: java.lang.Throwable -> L14
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> L14
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = r5.invoke(r9, r6)     // Catch: java.lang.Throwable -> L14
            goto L1c
        L14:
            r2 = move-exception
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r6 = 0
            r5.<init>(r2, r3, r4, r6)
            r4 = r5
        L1c:
            r2 = r4
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r4) goto L29
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L92
        L29:
            java.lang.Object r4 = r0.makeCompletingOnce$kotlinx_coroutines_core(r2)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r4 != r5) goto L36
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L92
        L36:
            boolean r5 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r5 == 0) goto L8d
        L3b:
            r5 = r4
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            java.lang.Throwable r5 = r5.cause
            r6 = 0
            boolean r7 = r5 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r7 == 0) goto L4c
            r7 = r5
            kotlinx.coroutines.TimeoutCancellationException r7 = (kotlinx.coroutines.TimeoutCancellationException) r7
            kotlinx.coroutines.Job r7 = r7.coroutine
            if (r7 == r8) goto L4d
        L4c:
            r3 = 1
        L4d:
            if (r3 == 0) goto L6b
            r3 = r4
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L6a
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L62
            goto L6a
        L62:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r7)
            r3 = r7
        L6a:
            throw r3
        L6b:
            boolean r3 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L8b
            r3 = r2
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L8a
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L82
            goto L8a
        L82:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r7)
            r3 = r7
        L8a:
            throw r3
        L8b:
            r3 = r2
            goto L91
        L8d:
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r4)
        L91:
        L92:
            return r3
    }

    private static final <T> java.lang.Object undispatchedResult(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r8, kotlin.jvm.functions.Function0<? extends java.lang.Object> r9) {
            r0 = 0
            java.lang.Object r1 = r9.invoke()     // Catch: java.lang.Throwable -> L7
            goto L11
        L7:
            r1 = move-exception
            kotlinx.coroutines.CompletedExceptionally r2 = new kotlinx.coroutines.CompletedExceptionally
            r3 = 2
            r4 = 0
            r5 = 0
            r2.<init>(r1, r5, r3, r4)
            r1 = r2
        L11:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r2
        L1d:
            java.lang.Object r2 = r7.makeCompletingOnce$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r2 != r3) goto L2a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r3
        L2a:
            boolean r3 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L7e
        L2f:
            r3 = r2
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            java.lang.Object r3 = r8.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5c
            r3 = r2
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r4 = r7.uCont
            r5 = 0
            boolean r6 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r6 == 0) goto L5b
            boolean r6 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r6 != 0) goto L53
            goto L5b
        L53:
            r6 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r6 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r6)
            r3 = r6
        L5b:
            throw r3
        L5c:
            boolean r3 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L7c
            r3 = r1
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r4 = r7.uCont
            r5 = 0
            boolean r6 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r6 == 0) goto L7b
            boolean r6 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r6 != 0) goto L73
            goto L7b
        L73:
            r6 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r6 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r6)
            r3 = r6
        L7b:
            throw r3
        L7c:
            r3 = r1
            goto L82
        L7e:
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r2)
        L82:
            return r3
    }
}
