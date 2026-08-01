package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: sy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0724sy {
    /* JADX INFO: renamed from: a */
    public static void m2384a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ry
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
