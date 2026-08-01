package kotlinx.coroutines.test;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, m115d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class TestCoroutineContextKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @kotlin.ReplaceWith(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void withTestContext(kotlinx.coroutines.test.TestCoroutineContext r9, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.test.TestCoroutineContext, kotlin.Unit> r10) {
            r0 = r9
            r1 = 0
            r10.invoke(r0)
            java.util.List r2 = r0.getExceptions()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            boolean r4 = r2 instanceof java.util.Collection
            r5 = 1
            if (r4 == 0) goto L1b
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1b
            goto L34
        L1b:
            java.util.Iterator r4 = r2.iterator()
        L1f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L33
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r8 = 0
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L1f
            r5 = 0
            goto L34
        L33:
        L34:
            if (r5 == 0) goto L39
        L38:
            return
        L39:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Coroutine encountered unhandled exceptions:\n"
            java.util.List r4 = r0.getExceptions()
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            r2.<init>(r3)
            throw r2
    }

    public static /* synthetic */ void withTestContext$default(kotlinx.coroutines.test.TestCoroutineContext r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto La
            kotlinx.coroutines.test.TestCoroutineContext r0 = new kotlinx.coroutines.test.TestCoroutineContext
            r2 = 0
            r0.<init>(r2, r3, r2)
        La:
            withTestContext(r0, r1)
            return
    }
}
