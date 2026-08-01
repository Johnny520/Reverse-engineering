package p336x3;

import android.view.View;
import android.view.ViewTreeObserver;
import bsh.C1259t2;

/* JADX INFO: renamed from: x3.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC9398j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q */
    public final View f31970q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver f31971r;

    /* JADX INFO: renamed from: s */
    public final Runnable f31972s;

    public ViewTreeObserverOnPreDrawListenerC9398j(View view, Runnable runnable) {
        this.f31970q = view;
        this.f31971r = view.getViewTreeObserver();
        this.f31972s = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC9398j m36535a(View view, Runnable runnable) {
        if (view == null) {
            C1259t2.m5095a("view == null");
            return null;
        }
        if (runnable == null) {
            C1259t2.m5095a("runnable == null");
            return null;
        }
        ViewTreeObserverOnPreDrawListenerC9398j viewTreeObserverOnPreDrawListenerC9398j = new ViewTreeObserverOnPreDrawListenerC9398j(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC9398j);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC9398j);
        return viewTreeObserverOnPreDrawListenerC9398j;
    }

    /* JADX INFO: renamed from: b */
    public void m36536b() {
        if (this.f31971r.isAlive()) {
            this.f31971r.removeOnPreDrawListener(this);
        } else {
            this.f31970q.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f31970q.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m36536b();
        this.f31972s.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f31971r = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m36536b();
    }
}
