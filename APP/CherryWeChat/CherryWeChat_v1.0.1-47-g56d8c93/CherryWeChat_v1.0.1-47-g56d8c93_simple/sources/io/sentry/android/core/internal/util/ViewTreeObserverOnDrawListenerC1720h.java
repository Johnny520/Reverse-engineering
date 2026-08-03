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
    public final Handler f6235a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f6236b;

    /* JADX INFO: renamed from: c */
    public final Runnable f6237c;

    public ViewTreeObserverOnDrawListenerC1720h(View r3, Runnable r4) {
        this.f6235a = new Handler(Looper.getMainLooper());
        this.f6236b = new AtomicReference(r3);
        this.f6237c = r4;
    }

    /* JADX INFO: renamed from: a */
    public static void m3905a(Activity r7, Runnable r8, C1666I r9) {
        Window r1 = r7.getWindow();
        if (r1 == null) goto L14;
        View r72 = r1.peekDecorView();
        if (r72 == null) goto L8;
        ViewTreeObserverOnDrawListenerC1720h r0 = new ViewTreeObserverOnDrawListenerC1720h(r72, r8);
        r9.getClass();
        r72.getViewTreeObserver().addOnDrawListener(r0);
        return;
    L8:
        Window.Callback r2 = r1.getCallback();
        if (r2 == null) goto L11;
        Window.Callback r6 = r2;
    L12:
        r1.setCallback(new C1742h(r6, new RunnableC0586Nk(r1, r2, r8, r9, 3)));
        return;
    L11:
        r6 = new WindowCallbackC1703b();
        goto L12
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View r0 = (View) this.f6236b.getAndSet(null);
        if (r0 != null) goto L5;
        return;
    L5:
        r0.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1719g(this, r0));
        this.f6235a.postAtFrontOfQueue(this.f6237c);
    }
}
