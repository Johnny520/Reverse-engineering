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

    public ViewTreeObserverOnPreDrawListenerC1756A(C1758C c1758c, View view) {
        this.f6364a = c1758c;
        this.f6365b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1758C c1758c = this.f6364a;
        Point point = c1758c.f6375h;
        WeakReference weakReference = (WeakReference) AbstractC2453ra.m4903m0(c1758c.f6374g);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.f6365b;
        if (AbstractC0585Nj.m1134a(view2, view)) {
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                    try {
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }
                if (view2.getWidth() != point.x && view2.getHeight() != point.y) {
                    point.set(view2.getWidth(), view2.getHeight());
                    c1758c.f6370c.m3948u(view2.getWidth(), view2.getHeight());
                }
            }
        } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
            try {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            } catch (IllegalStateException unused2) {
            }
        }
        return true;
    }
}
