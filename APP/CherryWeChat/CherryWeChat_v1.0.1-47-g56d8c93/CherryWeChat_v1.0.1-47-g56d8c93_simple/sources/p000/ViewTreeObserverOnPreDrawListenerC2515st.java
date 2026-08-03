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

    public ViewTreeObserverOnPreDrawListenerC2515st(View r1, Runnable r2) {
        this.f8804a = r1;
        this.f8805b = r1.getViewTreeObserver();
        this.f8806c = r2;
    }

    /* JADX INFO: renamed from: a */
    public static void m4996a(View r1, Runnable r2) {
        if (r1 == null) goto L6;
        ViewTreeObserverOnPreDrawListenerC2515st r0 = new ViewTreeObserverOnPreDrawListenerC2515st(r1, r2);
        r1.getViewTreeObserver().addOnPreDrawListener(r0);
        r1.addOnAttachStateChangeListener(r0);
        return;
    L6:
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean r0 = this.f8805b.isAlive();
        View r1 = this.f8804a;
        if (r0 == false) goto L5;
        this.f8805b.removeOnPreDrawListener(this);
    L6:
        r1.removeOnAttachStateChangeListener(this);
        this.f8806c.run();
        return true;
    L5:
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.f8805b = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        boolean r22 = this.f8805b.isAlive();
        View r0 = this.f8804a;
        if (r22 == false) goto L5;
        this.f8805b.removeOnPreDrawListener(this);
    L6:
        r0.removeOnAttachStateChangeListener(this);
        return;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }
}
