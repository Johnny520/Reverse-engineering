package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m115d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class ResumeAwaitOnCompletion<T> extends kotlinx.coroutines.JobNode {
    private final kotlinx.coroutines.CancellableContinuationImpl<T> continuation;

    public ResumeAwaitOnCompletion(kotlinx.coroutines.CancellableContinuationImpl<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.continuation = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r2) {
            r1 = this;
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.invoke2(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r4) {
            r3 = this;
            kotlinx.coroutines.JobSupport r0 = r3.getJob()
            java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L1a
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1a:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L35
            kotlinx.coroutines.CancellableContinuationImpl<T> r1 = r3.continuation
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            r2 = r0
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r2)
            goto L46
        L35:
            kotlinx.coroutines.CancellableContinuationImpl<T> r1 = r3.continuation
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            java.lang.Object r2 = kotlin.Result.m8669constructorimpl(r2)
            r1.resumeWith(r2)
        L46:
            return
    }
}
