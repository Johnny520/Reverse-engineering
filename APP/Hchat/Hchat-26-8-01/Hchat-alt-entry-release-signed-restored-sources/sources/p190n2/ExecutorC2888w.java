package p190n2;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n2.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2888w implements Executor {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Choreographer f9340g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9340g.postFrameCallback(new ChoreographerFrameCallbackC2889x(runnable, 0));
    }
}
