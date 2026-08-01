package kotlinx.coroutines.test;

/* JADX INFO: renamed from: kotlinx.coroutines.test.TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1 */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m115d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class C1025x227a8509 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ kotlinx.coroutines.test.TestCoroutineContext this$0;

    public C1025x227a8509(kotlinx.coroutines.CoroutineExceptionHandler.Key r1, kotlinx.coroutines.test.TestCoroutineContext r2) {
            r0 = this;
            r0.this$0 = r2
            r2 = r1
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            r0.<init>(r2)
            return
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.CoroutineContext r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            kotlinx.coroutines.test.TestCoroutineContext r3 = r4.this$0
            java.util.List r3 = kotlinx.coroutines.test.TestCoroutineContext.access$getUncaughtExceptions$p(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
            return
    }
}
