package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, m115d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ExecutorsKt {
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
            return
    }

    public static final java.util.concurrent.Executor asExecutor(kotlinx.coroutines.CoroutineDispatcher r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcher) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto L11
        Ld:
            java.util.concurrent.Executor r1 = r0.getExecutor()
        L11:
            if (r1 != 0) goto L1b
            kotlinx.coroutines.DispatcherExecutor r0 = new kotlinx.coroutines.DispatcherExecutor
            r0.<init>(r2)
            r1 = r0
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
        L1b:
            return r1
    }

    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.DispatcherExecutor
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.DispatcherExecutor r0 = (kotlinx.coroutines.DispatcherExecutor) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            kotlinx.coroutines.CoroutineDispatcher r1 = r0.dispatcher
        Lf:
            if (r1 != 0) goto L19
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r0.<init>(r2)
            r1 = r0
            kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
        L19:
            return r1
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(java.util.concurrent.ExecutorService r2) {
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r1 = r2
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.<init>(r1)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcher) r0
            return r0
    }
}
