package p099y;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: y.s */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1087s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final View f3722b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver f3723c;

    /* JADX INFO: renamed from: d */
    public final Runnable f3724d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC1087s(View view, Runnable runnable) {
        this.f3722b = view;
        this.f3723c = view.getViewTreeObserver();
        this.f3724d = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2360a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1087s viewTreeObserverOnPreDrawListenerC1087s = new ViewTreeObserverOnPreDrawListenerC1087s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1087s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1087s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f3723c.isAlive();
        View view = this.f3722b;
        if (zIsAlive) {
            this.f3723c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3724d.run();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3723c = view.getViewTreeObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f3723c.isAlive();
        View view2 = this.f3722b;
        if (zIsAlive) {
            this.f3723c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
