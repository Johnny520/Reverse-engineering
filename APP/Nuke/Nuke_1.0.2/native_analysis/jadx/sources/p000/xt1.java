package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h */
    public final View f13174h;

    /* JADX INFO: renamed from: i */
    public ViewTreeObserver f13175i;

    /* JADX INFO: renamed from: j */
    public final zd3 f13176j;

    public xt1(View view, zd3 zd3Var) {
        this.f13174h = view;
        this.f13175i = view.getViewTreeObserver();
        this.f13176j = zd3Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f13175i.isAlive();
        View view = this.f13174h;
        if (zIsAlive) {
            this.f13175i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f13176j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f13175i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f13175i.isAlive();
        View view2 = this.f13174h;
        if (zIsAlive) {
            this.f13175i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
