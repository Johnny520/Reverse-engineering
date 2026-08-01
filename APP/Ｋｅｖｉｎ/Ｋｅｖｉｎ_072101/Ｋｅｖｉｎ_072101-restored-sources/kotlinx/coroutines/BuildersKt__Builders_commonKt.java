package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aU\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00152)\b\b\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086Jø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aO\u0010\u0017\u001a\u00020\u0018*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m115d2 = {"RESUMED", "", "SUSPENDED", "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "invoke", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/BuildersKt")
final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.CoroutineStart r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r3, r4)
            boolean r1 = r5.isLazy()
            if (r1 == 0) goto L12
            kotlinx.coroutines.LazyDeferredCoroutine r1 = new kotlinx.coroutines.LazyDeferredCoroutine
            r1.<init>(r0, r6)
            kotlinx.coroutines.DeferredCoroutine r1 = (kotlinx.coroutines.DeferredCoroutine) r1
            goto L18
        L12:
            kotlinx.coroutines.DeferredCoroutine r1 = new kotlinx.coroutines.DeferredCoroutine
            r2 = 1
            r1.<init>(r0, r2)
        L18:
            r1.start(r5, r1, r6)
            r2 = r1
            kotlinx.coroutines.Deferred r2 = (kotlinx.coroutines.Deferred) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            r1 = r2
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)
            return r1
    }

    private static final <T> java.lang.Object invoke$$forInline(kotlinx.coroutines.CoroutineDispatcher r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super T> r5) {
            r0 = 0
            r1 = r3
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            r2 = 0
            kotlin.jvm.internal.InlineMarker.mark(r2)
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r5)
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.CoroutineStart r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r3, r4)
            boolean r1 = r5.isLazy()
            if (r1 == 0) goto L12
            kotlinx.coroutines.LazyStandaloneCoroutine r1 = new kotlinx.coroutines.LazyStandaloneCoroutine
            r1.<init>(r0, r6)
            kotlinx.coroutines.StandaloneCoroutine r1 = (kotlinx.coroutines.StandaloneCoroutine) r1
            goto L18
        L12:
            kotlinx.coroutines.StandaloneCoroutine r1 = new kotlinx.coroutines.StandaloneCoroutine
            r2 = 1
            r1.<init>(r0, r2)
        L18:
            r1.start(r5, r1, r6)
            r2 = r1
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext r11, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r12, kotlin.coroutines.Continuation<? super T> r13) {
            r0 = r13
            r1 = 0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlin.coroutines.CoroutineContext r3 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r2, r11)
            kotlinx.coroutines.JobKt.ensureActive(r3)
            if (r3 != r2) goto L1a
            kotlinx.coroutines.internal.ScopeCoroutine r4 = new kotlinx.coroutines.internal.ScopeCoroutine
            r4.<init>(r3, r0)
            java.lang.Object r5 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r4, r4, r12)
            goto L62
        L1a:
            kotlin.coroutines.ContinuationInterceptor$Key r4 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r4 = (kotlin.coroutines.CoroutineContext.Key) r4
            kotlin.coroutines.CoroutineContext$Element r4 = r3.get(r4)
            kotlin.coroutines.ContinuationInterceptor$Key r5 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5
            kotlin.coroutines.CoroutineContext$Element r5 = r2.get(r5)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L4e
            kotlinx.coroutines.UndispatchedCoroutine r4 = new kotlinx.coroutines.UndispatchedCoroutine
            r4.<init>(r3, r0)
            r5 = 0
            r6 = 0
            java.lang.Object r7 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r5)
            r8 = 0
            r9 = r4
            kotlinx.coroutines.internal.ScopeCoroutine r9 = (kotlinx.coroutines.internal.ScopeCoroutine) r9     // Catch: java.lang.Throwable -> L49
            java.lang.Object r9 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r9, r4, r12)     // Catch: java.lang.Throwable -> L49
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r7)
            r5 = r9
            goto L62
        L49:
            r8 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r7)
            throw r8
        L4e:
            kotlinx.coroutines.DispatchedCoroutine r4 = new kotlinx.coroutines.DispatchedCoroutine
            r4.<init>(r3, r0)
            r7 = r4
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r12
            r6 = r4
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r5, r6, r7, r8, r9, r10)
            java.lang.Object r5 = r4.getResult()
        L62:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L6b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        L6b:
            return r5
    }
}
