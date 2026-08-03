package p006D;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: D.t */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0127t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f314a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f315b;

    /* JADX INFO: renamed from: c */
    public final Runnable f316c;

    public ViewTreeObserverOnPreDrawListenerC0127t(View view, Runnable runnable) {
        this.f314a = view;
        this.f315b = view.getViewTreeObserver();
        this.f316c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f315b.isAlive();
        View view = this.f314a;
        if (zIsAlive) {
            this.f315b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f316c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f315b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f315b.isAlive();
        View view2 = this.f314a;
        if (zIsAlive) {
            this.f315b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
