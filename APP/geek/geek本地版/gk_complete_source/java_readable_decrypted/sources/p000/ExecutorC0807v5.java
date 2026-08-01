package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0807v5 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
