package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ y62 h;
    public final /* synthetic */ l80 i;
    public final /* synthetic */ o72 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ku0(y62 y62Var, l80 l80Var, o72 o72Var) {
        this.h = y62Var;
        this.i = l80Var;
        this.j = o72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        y62 y62Var = this.h;
        if (y62Var.h) {
            return;
        }
        y62Var.h = true;
        this.i.a();
        this.j.i = null;
    }
}
