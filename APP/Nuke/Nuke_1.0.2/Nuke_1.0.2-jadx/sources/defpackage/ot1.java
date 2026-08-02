package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {
    public final Runnable a;
    public final hx2 b = new hx2(new ta(17, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ot1(Runnable runnable) {
        this.a = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fm1 a() {
        return ((mt1) this.b.getValue()).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().c(new ht1(onBackInvokedDispatcher, 0), 1);
        a().c(new ht1(onBackInvokedDispatcher, 1000000), 0);
    }
}
