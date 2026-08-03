package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: st */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2515st implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f8804a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f8805b;

    /* JADX INFO: renamed from: c */
    public final Runnable f8806c;

    public ViewTreeObserverOnPreDrawListenerC2515st(View view, Runnable runnable) {
        this.f8804a = view;
        this.f8805b = view.getViewTreeObserver();
        this.f8806c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m4996a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC2515st viewTreeObserverOnPreDrawListenerC2515st = new ViewTreeObserverOnPreDrawListenerC2515st(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2515st);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2515st);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f8805b.isAlive();
        View view = this.f8804a;
        if (zIsAlive) {
            this.f8805b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f8806c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f8805b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f8805b.isAlive();
        View view2 = this.f8804a;
        if (zIsAlive) {
            this.f8805b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
