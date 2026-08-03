package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2346p3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8224a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8224a) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                AbstractC2622vD.m5135f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
