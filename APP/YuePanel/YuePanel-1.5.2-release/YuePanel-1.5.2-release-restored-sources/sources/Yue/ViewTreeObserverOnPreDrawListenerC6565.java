package Yue;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: Yue.ۥۣۣۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC6565 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final View f16862;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ViewTreeObserver f16863;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Runnable f16864;

    public ViewTreeObserverOnPreDrawListenerC6565(View view, Runnable runnable) {
        this.f16862 = view;
        this.f16863 = view.getViewTreeObserver();
        this.f16864 = runnable;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static ViewTreeObserverOnPreDrawListenerC6565 m3026(@InterfaceC6391 View view, @InterfaceC6391 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC6565 viewTreeObserverOnPreDrawListenerC6565 = new ViewTreeObserverOnPreDrawListenerC6565(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6565);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC6565);
        return viewTreeObserverOnPreDrawListenerC6565;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m3027();
        this.f16864.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@InterfaceC6391 View view) {
        this.f16863 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@InterfaceC6391 View view) {
        m3027();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3027() {
        if (this.f16863.isAlive()) {
            this.f16863.removeOnPreDrawListener(this);
        } else {
            this.f16862.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16862.removeOnAttachStateChangeListener(this);
    }
}
