package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0017¨\u0006\u000b"}, m115d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class UnlimitedIoScheduler extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.UnlimitedIoScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = new kotlinx.coroutines.scheduling.UnlimitedIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE = r0
            return
    }

    private UnlimitedIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10220dispatch(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r1 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r2 = 0
            r0.dispatchWithContext$kotlinx_coroutines_core(r5, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r1 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r2 = 1
            r0.dispatchWithContext$kotlinx_coroutines_core(r5, r1, r2)
            return
    }
}
