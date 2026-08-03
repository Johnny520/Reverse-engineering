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

    public ViewTreeObserverOnPreDrawListenerC0127t(View r1, Runnable r2) {
        this.f314a = r1;
        this.f315b = r1.getViewTreeObserver();
        this.f316c = r2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean r02 = this.f315b.isAlive();
        View r1 = this.f314a;
        if (r02 == false) goto L5;
        this.f315b.removeOnPreDrawListener(this);
    L6:
        r1.removeOnAttachStateChangeListener(this);
        this.f316c.run();
        return true;
    L5:
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.f315b = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        boolean r22 = this.f315b.isAlive();
        View r02 = this.f314a;
        if (r22 == false) goto L5;
        this.f315b.removeOnPreDrawListener(this);
    L6:
        r02.removeOnAttachStateChangeListener(this);
        return;
    L5:
        r02.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }
}
