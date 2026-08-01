package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: cx */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0130cx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f1330a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f1331b;

    /* JADX INFO: renamed from: c */
    public final Runnable f1332c;

    public ViewTreeObserverOnPreDrawListenerC0130cx(View view, Runnable runnable) {
        this.f1330a = view;
        this.f1331b = view.getViewTreeObserver();
        this.f1332c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m832a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0130cx viewTreeObserverOnPreDrawListenerC0130cx = new ViewTreeObserverOnPreDrawListenerC0130cx(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0130cx);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0130cx);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f1331b.isAlive();
        View view = this.f1330a;
        if (zIsAlive) {
            this.f1331b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1332c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1331b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f1331b.isAlive();
        View view2 = this.f1330a;
        if (zIsAlive) {
            this.f1331b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
