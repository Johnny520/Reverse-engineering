package p022L;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0175e implements Executor {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
