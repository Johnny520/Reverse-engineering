package p115X0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X0.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1650y implements Executor {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Choreographer f5674d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f5674d.postFrameCallback(new Choreographer.FrameCallback() { // from class: X0.z
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                runnable.run();
            }
        });
    }
}
