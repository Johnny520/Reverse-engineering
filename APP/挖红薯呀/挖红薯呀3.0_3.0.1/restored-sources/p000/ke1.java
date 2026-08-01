package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f3088d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ot0 f3089e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ke1(View view, ot0 ot0Var) {
        this.f3088d = view;
        this.f3089e = ot0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3088d.removeOnAttachStateChangeListener(this);
        this.f3089e.m2955x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
