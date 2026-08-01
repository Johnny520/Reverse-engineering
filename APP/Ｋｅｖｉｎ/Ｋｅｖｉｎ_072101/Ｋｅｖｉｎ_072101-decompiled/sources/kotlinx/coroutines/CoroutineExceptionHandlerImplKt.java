package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m115d2 = {"handlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> handlers = null;

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r1 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handlers = r0
            return
    }

    public static final void handleCoroutineExceptionImpl(kotlin.coroutines.CoroutineContext r6, java.lang.Throwable r7) {
            java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handlers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            r1.handleException(r6, r7)     // Catch: java.lang.Throwable -> L17
            goto L6
        L17:
            r2 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            java.lang.Throwable r5 = kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(r7, r2)
            r4.uncaughtException(r3, r5)
            goto L6
        L28:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            kotlinx.coroutines.DiagnosticCoroutineContextException r2 = new kotlinx.coroutines.DiagnosticCoroutineContextException     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L3f
            kotlin.ExceptionsKt.addSuppressed(r7, r2)     // Catch: java.lang.Throwable -> L3f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            kotlin.Result.m8669constructorimpl(r1)     // Catch: java.lang.Throwable -> L3f
            goto L49
        L3f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            kotlin.Result.m8669constructorimpl(r1)
        L49:
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r7)
            return
    }
}
