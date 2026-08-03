package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;

/* JADX INFO: renamed from: io.sentry.android.replay.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1756A implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1758C f6364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f6365b;

    public ViewTreeObserverOnPreDrawListenerC1756A(C1758C r1, View r2) {
        this.f6364a = r1;
        this.f6365b = r2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1758C r0 = this.f6364a;
        Point r1 = r0.f6375h;
        WeakReference r2 = (WeakReference) AbstractC2453ra.m4903m0(r0.f6374g);
        if (r2 == null) goto L5;
        View r22 = (View) r2.get();
    L6:
        View r3 = this.f6365b;
        if (AbstractC0585Nj.m1134a(r3, r22) == true) goto L17;
        if (r3 != null) goto L10;
    L31:
        return true;
    L10:
        if (r3.getViewTreeObserver() == null) goto L31;
        if (r3.getViewTreeObserver().isAlive() == false) goto L31;
        r3.getViewTreeObserver().removeOnPreDrawListener(this);     // Catch: IllegalStateException -> L32
        return true;
    L17:
        if (r3.getWidth() <= 0) goto L31;
        if (r3.getHeight() <= 0) goto L31;
        if (r3.getViewTreeObserver() == null) goto L27;
        if (r3.getViewTreeObserver().isAlive() == false) goto L27;
        r3.getViewTreeObserver().removeOnPreDrawListener(this);     // Catch: IllegalStateException -> L33
    L27:
        if (r3.getWidth() == r1.x) goto L31;
        if (r3.getHeight() == r1.y) goto L31;
        r1.set(r3.getWidth(), r3.getHeight());
        r0.f6370c.m3948u(r3.getWidth(), r3.getHeight());
        goto L31
    L5:
        r22 = null;
        goto L6
    }
}
