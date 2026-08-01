package p022L;

import android.view.Choreographer;

/* JADX INFO: renamed from: L.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0180j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m383a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: L.i
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
