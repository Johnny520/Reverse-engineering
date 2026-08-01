package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m115d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, m116k = 5, m117mv = {1, 6, 0}, m119xi = 48, m120xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__JobKt {
    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.JobImpl r0 = new kotlinx.coroutines.JobImpl
            r0.<init>(r1)
            kotlinx.coroutines.CompletableJob r0 = (kotlinx.coroutines.CompletableJob) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m10162Job(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt.Job(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt.Job(r0)
            return r0
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m10163Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt.m10160Job(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancel(kotlin.coroutines.CoroutineContext r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancel(r1, r0)
            return
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext r1, java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r0.cancel(r2)
        L10:
            return
    }

    public static final void cancel(kotlinx.coroutines.Job r1, java.lang.String r2, java.lang.Throwable r3) {
            java.util.concurrent.CancellationException r0 = kotlinx.coroutines.ExceptionsKt.CancellationException(r2, r3)
            r1.cancel(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(kotlin.coroutines.CoroutineContext r2, java.lang.Throwable r3) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport
            if (r1 == 0) goto Lf
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            java.lang.Throwable r1 = orCancellation$JobKt__JobKt(r3, r1)
            r0.cancelInternal(r1)
            r1 = 1
            return r1
    }

    public static /* synthetic */ void cancel$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancel(r0, r1)
            return
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.JobKt.cancel(r0, r1, r2)
            return
    }

    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            boolean r0 = kotlinx.coroutines.JobKt.cancel(r0, r1)
            return r0
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r0, r1, r0)
            java.lang.Object r0 = r2.join(r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L10
            return r0
        L10:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancelChildren(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r9, java.lang.Throwable r10) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r9.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlin.sequences.Sequence r1 = r0.getChildren()
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r6 = 0
            boolean r7 = r5 instanceof kotlinx.coroutines.JobSupport
            if (r7 == 0) goto L2c
            r7 = r5
            kotlinx.coroutines.JobSupport r7 = (kotlinx.coroutines.JobSupport) r7
            goto L2d
        L2c:
            r7 = 0
        L2d:
            if (r7 != 0) goto L30
            goto L16
        L30:
            java.lang.Throwable r8 = orCancellation$JobKt__JobKt(r10, r0)
            r7.cancelInternal(r8)
            goto L16
        L38:
            return
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext r6, java.util.concurrent.CancellationException r7) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r6.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 != 0) goto Ld
        Lc:
            goto L2c
        Ld:
            kotlin.sequences.Sequence r0 = r0.getChildren()
            if (r0 != 0) goto L14
            goto Lc
        L14:
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r5 = 0
            r4.cancel(r7)
            goto L19
        L2b:
        L2c:
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancelChildren(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r8, java.lang.Throwable r9) {
            kotlin.sequences.Sequence r0 = r8.getChildren()
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.JobSupport
            if (r6 == 0) goto L1f
            r6 = r4
            kotlinx.coroutines.JobSupport r6 = (kotlinx.coroutines.JobSupport) r6
            goto L20
        L1f:
            r6 = 0
        L20:
            if (r6 != 0) goto L23
            goto L9
        L23:
            java.lang.Throwable r7 = orCancellation$JobKt__JobKt(r9, r8)
            r6.cancelInternal(r7)
            goto L9
        L2b:
            return
    }

    public static final void cancelChildren(kotlinx.coroutines.Job r6, java.util.concurrent.CancellationException r7) {
            kotlin.sequences.Sequence r0 = r6.getChildren()
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            r5 = 0
            r4.cancel(r7)
            goto L9
        L1b:
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job r2, kotlinx.coroutines.DisposableHandle r3) {
            kotlinx.coroutines.DisposeOnCompletion r0 = new kotlinx.coroutines.DisposeOnCompletion
            r0.<init>(r3)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r1 = 0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.DisposableHandle r0 = r2.invokeOnCompletion(r0)
            return r0
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            kotlinx.coroutines.JobKt.ensureActive(r0)
        L10:
            return
    }

    public static final void ensureActive(kotlinx.coroutines.Job r1) {
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.CancellationException r0 = r1.getCancellationException()
            throw r0
    }

    public static final kotlinx.coroutines.Job getJob(kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Current context doesn't contain Job in it: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r1 = 0
            if (r0 != 0) goto Le
        Ld:
            goto L16
        Le:
            boolean r0 = r0.isActive()
            r2 = 1
            if (r0 != r2) goto Ld
            r1 = r2
        L16:
            return r1
    }

    private static final java.lang.Throwable orCancellation$JobKt__JobKt(java.lang.Throwable r3, kotlinx.coroutines.Job r4) {
            if (r3 != 0) goto Ld
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = "Job was cancelled"
            r2 = 0
            r0.<init>(r1, r2, r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto Le
        Ld:
            r0 = r3
        Le:
            return r0
    }
}
