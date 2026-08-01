package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: kx */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0427kx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f2876a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f2877b;

    /* JADX INFO: renamed from: c */
    public final Runnable f2878c;

    public ViewTreeObserverOnPreDrawListenerC0427kx(View view, Runnable runnable) {
        this.f2876a = view;
        this.f2877b = view.getViewTreeObserver();
        this.f2878c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m1722a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0427kx viewTreeObserverOnPreDrawListenerC0427kx = new ViewTreeObserverOnPreDrawListenerC0427kx(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0427kx);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0427kx);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2877b.isAlive();
        View view = this.f2876a;
        if (zIsAlive) {
            this.f2877b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2878c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2877b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f2877b.isAlive();
        View view2 = this.f2876a;
        if (zIsAlive) {
            this.f2877b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
