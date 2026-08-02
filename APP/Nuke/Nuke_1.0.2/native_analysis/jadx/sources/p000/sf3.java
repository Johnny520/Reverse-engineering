package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sf3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f10106h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ i62 f10107i;

    public sf3(View view, i62 i62Var) {
        this.f10106h = view;
        this.f10107i = i62Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10106h.removeOnAttachStateChangeListener(this);
        this.f10107i.m2293x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
