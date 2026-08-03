package p034S;

import android.view.Choreographer;

/* JADX INFO: renamed from: S.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0331k {
    /* JADX INFO: renamed from: a */
    public static void m749a(final Runnable r2) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0330j(r2));
    }
}
