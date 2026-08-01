package p027E4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: E4.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0312a implements Executor {

    /* JADX INFO: renamed from: d */
    public final Handler f1028d = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1028d.post(runnable);
    }
}
