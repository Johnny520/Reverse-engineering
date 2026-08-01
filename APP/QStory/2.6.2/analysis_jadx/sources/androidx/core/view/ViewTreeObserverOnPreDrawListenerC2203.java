package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import bsh.C2632;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2203 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ViewTreeObserver f6482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f6483;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f6484;

    public ViewTreeObserverOnPreDrawListenerC2203(View view, Runnable runnable) {
        this.f6484 = view;
        this.f6482 = view.getViewTreeObserver();
        this.f6483 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4000(View view, Runnable runnable) {
        if (view == null) {
            C2632.m5298("view == null");
            return;
        }
        ViewTreeObserverOnPreDrawListenerC2203 viewTreeObserverOnPreDrawListenerC2203 = new ViewTreeObserverOnPreDrawListenerC2203(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2203);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2203);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6482.isAlive();
        View view = this.f6484;
        if (zIsAlive) {
            this.f6482.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6483.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6482 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f6482.isAlive();
        View view2 = this.f6484;
        if (zIsAlive) {
            this.f6482.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
