package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: dw */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1341dw implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f4831a;

    public ExecutorC1341dw(Handler r1) {
        this.f4831a = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        r3.getClass();
        Handler r0 = this.f4831a;
        if (r0.post(r3) == false) goto L6;
        return;
    L6:
        throw new RejectedExecutionException(r0 + " is shutting down");
    }
}
