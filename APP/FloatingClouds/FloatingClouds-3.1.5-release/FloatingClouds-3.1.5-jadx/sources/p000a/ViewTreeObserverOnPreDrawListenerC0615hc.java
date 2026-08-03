package p000a;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: a.hc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0615hc implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f2275a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f2276b;

    /* JADX INFO: renamed from: c */
    public final Runnable f2277c;

    public ViewTreeObserverOnPreDrawListenerC0615hc(View view, Runnable runnable) {
        this.f2275a = view;
        this.f2276b = view.getViewTreeObserver();
        this.f2277c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m1466a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0615hc viewTreeObserverOnPreDrawListenerC0615hc = new ViewTreeObserverOnPreDrawListenerC0615hc(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0615hc);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0615hc);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2276b.isAlive();
        View view = this.f2275a;
        if (zIsAlive) {
            this.f2276b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2277c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2276b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f2276b.isAlive();
        View view2 = this.f2275a;
        if (zIsAlive) {
            this.f2276b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
