package p034S;

import android.view.Choreographer;

/* JADX INFO: renamed from: S.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0331k {
    /* JADX INFO: renamed from: a */
    public static void m749a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: S.j
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
