package p195l2;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2502f implements Executor {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8014d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8014d) {
            case 0:
                AbstractC2511o.m4457f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
