package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bR\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m115d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            if (r0 != 0) goto L13
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlin.coroutines.CoroutineContext r0 = r2.plus(r0)
            goto L14
        L13:
            r0 = r2
        L14:
            r1.<init>(r0, r3)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.threadStateToRecover = r0
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r10) {
            r9 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r9.threadStateToRecover
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L21
        Lc:
            r2 = 0
            java.lang.Object r3 = r0.component1()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            java.lang.Object r4 = r0.component2()
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r5 = r9.threadStateToRecover
            r5.set(r1)
        L21:
            kotlin.coroutines.Continuation<T> r0 = r9.uCont
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.recoverResult(r10, r0)
            kotlin.coroutines.Continuation<T> r2 = r9.uCont
            r3 = 0
            r4 = 0
            kotlin.coroutines.CoroutineContext r5 = r2.getContext()
            java.lang.Object r6 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r3)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r6 == r7) goto L3c
            kotlinx.coroutines.UndispatchedCoroutine r1 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r2, r5, r6)
            goto L3f
        L3c:
            r7 = r1
            kotlinx.coroutines.UndispatchedCoroutine r7 = (kotlinx.coroutines.UndispatchedCoroutine) r7
        L3f:
            r7 = 0
            kotlin.coroutines.Continuation<T> r8 = r9.uCont     // Catch: java.lang.Throwable -> L57
            r8.resumeWith(r0)     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L52
            boolean r7 = r1.clearThreadContext()
            if (r7 == 0) goto L55
        L52:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r6)
        L55:
            return
        L57:
            r7 = move-exception
            if (r1 == 0) goto L60
            boolean r8 = r1.clearThreadContext()
            if (r8 == 0) goto L63
        L60:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r6)
        L63:
            throw r7
    }

    public final boolean clearThreadContext() {
            r2 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            r1 = 0
            r0.set(r1)
            r0 = 1
            return r0
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext r3, java.lang.Object r4) {
            r2 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r3, r4)
            r0.set(r1)
            return
    }
}
