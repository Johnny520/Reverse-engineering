package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly {
    public static void a(java.lang.Runnable r2) {
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            ky r1 = new ky
            r1.<init>(r2)
            r0.postFrameCallback(r1)
            return
    }
}
