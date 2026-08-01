package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import bsh.C3466;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3036 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ViewTreeObserver f6828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f6829;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f6830;

    public ViewTreeObserverOnPreDrawListenerC3036(View view, Runnable runnable) {
        this.f6830 = view;
        this.f6828 = view.getViewTreeObserver();
        this.f6829 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4570(View view, Runnable runnable) {
        if (view == null) {
            C3466.m5903("view == null");
            return;
        }
        ViewTreeObserverOnPreDrawListenerC3036 viewTreeObserverOnPreDrawListenerC3036 = new ViewTreeObserverOnPreDrawListenerC3036(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3036);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3036);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6828.isAlive();
        View view = this.f6830;
        if (zIsAlive) {
            this.f6828.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6829.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6828 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f6828.isAlive();
        View view2 = this.f6830;
        if (zIsAlive) {
            this.f6828.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
