package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.internal.gestures.WindowCallbackC1703b;
import io.sentry.android.core.performance.C1742h;
import java.util.concurrent.atomic.AtomicReference;
import p000.RunnableC0586Nk;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1720h implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    public final Handler f6235a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final AtomicReference f6236b;

    /* JADX INFO: renamed from: c */
    public final Runnable f6237c;

    public ViewTreeObserverOnDrawListenerC1720h(View view, Runnable runnable) {
        this.f6236b = new AtomicReference(view);
        this.f6237c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m3905a(Activity activity, Runnable runnable, C1666I c1666i) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView == null) {
                Window.Callback callback = window.getCallback();
                window.setCallback(new C1742h(callback != null ? callback : new WindowCallbackC1703b(), new RunnableC0586Nk(window, callback, runnable, c1666i, 3)));
            } else {
                ViewTreeObserverOnDrawListenerC1720h viewTreeObserverOnDrawListenerC1720h = new ViewTreeObserverOnDrawListenerC1720h(viewPeekDecorView, runnable);
                c1666i.getClass();
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC1720h);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f6236b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.g
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC1720h viewTreeObserverOnDrawListenerC1720h = this.f6233a;
                viewTreeObserverOnDrawListenerC1720h.getClass();
                view.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC1720h);
            }
        });
        this.f6235a.postAtFrontOfQueue(this.f6237c);
    }
}
