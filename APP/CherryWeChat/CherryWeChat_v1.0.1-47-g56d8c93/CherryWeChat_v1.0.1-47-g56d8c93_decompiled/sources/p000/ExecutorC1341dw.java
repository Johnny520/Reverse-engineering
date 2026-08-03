package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: dw */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1341dw implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f4831a;

    public ExecutorC1341dw(Handler handler) {
        this.f4831a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f4831a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
