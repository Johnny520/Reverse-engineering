package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: ly */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0465ly {
    /* JADX INFO: renamed from: a */
    public static void m1767a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ky
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
