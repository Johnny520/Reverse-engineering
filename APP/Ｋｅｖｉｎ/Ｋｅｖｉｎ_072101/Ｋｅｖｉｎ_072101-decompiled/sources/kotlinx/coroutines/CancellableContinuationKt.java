package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m115d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class CancellableContinuationKt {
    public static final void disposeOnCancellation(kotlinx.coroutines.CancellableContinuation<?> r2, kotlinx.coroutines.DisposableHandle r3) {
            kotlinx.coroutines.DisposeOnCancel r0 = new kotlinx.coroutines.DisposeOnCancel
            r0.<init>(r3)
            kotlinx.coroutines.CancelHandlerBase r0 = (kotlinx.coroutines.CancelHandlerBase) r0
            r1 = 0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.invokeOnCancellation(r0)
            return
    }

    public static final <T> kotlinx.coroutines.CancellableContinuationImpl<T> getOrCreateCancellableContinuation(kotlin.coroutines.Continuation<? super T> r4) {
            boolean r0 = r4 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 != 0) goto Lb
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 1
            r0.<init>(r4, r1)
            return r0
        Lb:
            r0 = r4
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.claimReusableCancellableContinuation()
            r1 = 0
            if (r0 != 0) goto L17
        L15:
            r0 = r1
            goto L1f
        L17:
            r2 = r0
            r3 = 0
            boolean r2 = r2.resetStateReusable()
            if (r2 == 0) goto L15
        L1f:
            if (r0 != 0) goto L28
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 2
            r0.<init>(r4, r1)
            return r0
        L28:
            return r0
    }

    public static final void removeOnCancellation(kotlinx.coroutines.CancellableContinuation<?> r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            kotlinx.coroutines.RemoveOnCancel r0 = new kotlinx.coroutines.RemoveOnCancel
            r0.<init>(r3)
            kotlinx.coroutines.CancelHandlerBase r0 = (kotlinx.coroutines.CancelHandlerBase) r0
            r1 = 0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.invokeOnCancellation(r0)
            return
    }

    public static final <T> java.lang.Object suspendCancellableCoroutine(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = r7
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r6.invoke(r3)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L20
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L20:
            return r1
    }

    private static final <T> java.lang.Object suspendCancellableCoroutine$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r1 = r7
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r6.invoke(r3)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L24
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L24:
            kotlin.jvm.internal.InlineMarker.mark(r5)
            return r1
    }

    public static final <T> java.lang.Object suspendCancellableCoroutineReusable(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r4, kotlin.coroutines.Continuation<? super T> r5) {
            r0 = 0
            r1 = r5
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = getOrCreateCancellableContinuation(r3)
            r4.invoke(r3)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L1b:
            return r1
    }

    private static final <T> java.lang.Object suspendCancellableCoroutineReusable$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r4, kotlin.coroutines.Continuation<? super T> r5) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r1 = r5
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = getOrCreateCancellableContinuation(r3)
            r4.invoke(r3)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L1f:
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }
}
