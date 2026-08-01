package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import bsh.C2633;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2203 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ViewTreeObserver f6483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f6484;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f6485;

    public ViewTreeObserverOnPreDrawListenerC2203(View view, Runnable runnable) {
        this.f6485 = view;
        this.f6483 = view.getViewTreeObserver();
        this.f6484 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4010(View view, Runnable runnable) {
        if (view == null) {
            C2633.m5343("view == null");
            return;
        }
        ViewTreeObserverOnPreDrawListenerC2203 viewTreeObserverOnPreDrawListenerC2203 = new ViewTreeObserverOnPreDrawListenerC2203(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2203);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2203);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6483.isAlive();
        View view = this.f6485;
        if (zIsAlive) {
            this.f6483.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6484.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6483 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f6483.isAlive();
        View view2 = this.f6485;
        if (zIsAlive) {
            this.f6483.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
