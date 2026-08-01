package p074k0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0741a implements Executor {

    /* JADX INFO: renamed from: a */
    public Handler f2505a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2505a.post(runnable);
    }
}
