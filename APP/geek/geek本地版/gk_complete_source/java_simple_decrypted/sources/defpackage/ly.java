package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly {
    public static void a(final Runnable r2) {
        Choreographer.getInstance().postFrameCallback(new ky(r2));
    }
}
