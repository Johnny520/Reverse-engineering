package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ y62 f5816h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ l80 f5817i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o72 f5818j;

    public ku0(y62 y62Var, l80 l80Var, o72 o72Var) {
        this.f5816h = y62Var;
        this.f5817i = l80Var;
        this.f5818j = o72Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        y62 y62Var = this.f5816h;
        if (y62Var.f13324h) {
            return;
        }
        y62Var.f13324h = true;
        this.f5817i.m2875a();
        this.f5818j.f7574i = null;
    }
}
