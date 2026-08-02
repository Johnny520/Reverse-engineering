package p000;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r03 implements Executor {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Choreographer f9311h;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.f9311h.postFrameCallback(new Choreographer.FrameCallback() { // from class: s03
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
