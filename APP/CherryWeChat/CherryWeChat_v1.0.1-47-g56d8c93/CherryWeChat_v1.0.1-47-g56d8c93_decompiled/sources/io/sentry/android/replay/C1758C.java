package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import io.sentry.C1563B0;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2711xa;
import p000.RunnableC2069iq;

/* JADX INFO: renamed from: io.sentry.android.replay.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1758C implements Closeable, InterfaceC1781e {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6368a;

    /* JADX INFO: renamed from: b */
    public final ReplayIntegration f6369b;

    /* JADX INFO: renamed from: c */
    public final ReplayIntegration f6370c;

    /* JADX INFO: renamed from: d */
    public final C1563B0 f6371d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f6372e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f6373f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final ArrayList f6374g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Point f6375h = new Point();

    /* JADX INFO: renamed from: i */
    public final C2029a f6376i = new C2029a();

    /* JADX INFO: renamed from: j */
    public final C2029a f6377j = new C2029a();

    /* JADX INFO: renamed from: k */
    public volatile RunnableC2069iq f6378k;

    public C1758C(C2046v2 c2046v2, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, C1563B0 c1563b0, ScheduledExecutorService scheduledExecutorService) {
        this.f6368a = c2046v2;
        this.f6369b = replayIntegration;
        this.f6370c = replayIntegration2;
        this.f6371d = c1563b0;
        this.f6372e = scheduledExecutorService;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3942l();
        C1563B0 c1563b0 = this.f6371d;
        RunnableC2069iq runnableC2069iq = this.f6378k;
        Handler handler = (Handler) c1563b0.f5600a;
        if (runnableC2069iq != null) {
            handler.removeCallbacks(runnableC2069iq);
        }
        m3944o();
    }

    @Override // io.sentry.android.replay.InterfaceC1781e
    /* JADX INFO: renamed from: d */
    public final void mo3939d(View view, boolean z) {
        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v;
        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v2;
        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v3;
        C1981r c1981rM4173a = this.f6376i.m4173a();
        try {
            if (z) {
                this.f6374g.add(new WeakReference(view));
                RunnableC2069iq runnableC2069iq = this.f6378k;
                if (runnableC2069iq != null && (viewTreeObserverOnDrawListenerC1810v3 = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d) != null) {
                    viewTreeObserverOnDrawListenerC1810v3.m3979a(view);
                }
                m3940f(view);
            } else {
                RunnableC2069iq runnableC2069iq2 = this.f6378k;
                if (runnableC2069iq2 != null && (viewTreeObserverOnDrawListenerC1810v2 = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq2.f7321d) != null) {
                    viewTreeObserverOnDrawListenerC1810v2.m3981c(view);
                }
                AbstractC2711xa.m5283e0(this.f6374g, new C1757B(view, 0));
                WeakReference weakReference = (WeakReference) AbstractC2453ra.m4903m0(this.f6374g);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    RunnableC2069iq runnableC2069iq3 = this.f6378k;
                    if (runnableC2069iq3 != null && (viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq3.f7321d) != null) {
                        viewTreeObserverOnDrawListenerC1810v.m3979a(view2);
                    }
                    m3940f(view2);
                }
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0714Qj.m1489k(c1981rM4173a, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3940f(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            ViewTreeObserverOnPreDrawListenerC1756A viewTreeObserverOnPreDrawListenerC1756A = new ViewTreeObserverOnPreDrawListenerC1756A(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1756A);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.f6375h;
        if (width == point.x || view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.f6370c.m3948u(view.getWidth(), view.getHeight());
    }

    /* JADX INFO: renamed from: i */
    public final void m3941i() {
        RunnableC2069iq runnableC2069iq = this.f6378k;
        if (runnableC2069iq != null) {
            ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d;
            if (viewTreeObserverOnDrawListenerC1810v != null) {
                viewTreeObserverOnDrawListenerC1810v.f6553m.set(false);
                WeakReference weakReference = viewTreeObserverOnDrawListenerC1810v.f6546f;
                viewTreeObserverOnDrawListenerC1810v.m3981c(weakReference != null ? (View) weakReference.get() : null);
            }
            ((AtomicBoolean) runnableC2069iq.f7323f).getAndSet(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3942l() {
        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v;
        this.f6375h.set(0, 0);
        C1981r c1981rM4173a = this.f6376i.m4173a();
        try {
            for (WeakReference weakReference : this.f6374g) {
                RunnableC2069iq runnableC2069iq = this.f6378k;
                if (runnableC2069iq != null && (viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d) != null) {
                    viewTreeObserverOnDrawListenerC1810v.m3981c((View) weakReference.get());
                }
            }
            this.f6374g.clear();
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3943m() {
        View view;
        RunnableC2069iq runnableC2069iq = this.f6378k;
        if (runnableC2069iq != null) {
            C1563B0 c1563b0 = (C1563B0) runnableC2069iq.f7320c;
            C2046v2 c2046v2 = (C2046v2) runnableC2069iq.f7319b;
            if (c2046v2.getSessionReplay().f7316l) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d;
            if (viewTreeObserverOnDrawListenerC1810v != null) {
                WeakReference weakReference = viewTreeObserverOnDrawListenerC1810v.f6546f;
                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                    try {
                        view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC1810v);
                    } catch (IllegalStateException unused) {
                    }
                }
                viewTreeObserverOnDrawListenerC1810v.f6553m.set(true);
            }
            ((AtomicBoolean) runnableC2069iq.f7323f).getAndSet(true);
            ((Handler) c1563b0.f5600a).removeCallbacks(runnableC2069iq);
            if (((Handler) c1563b0.f5600a).post(runnableC2069iq)) {
                return;
            }
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3944o() {
        RunnableC2069iq runnableC2069iq = this.f6378k;
        if (runnableC2069iq != null) {
            ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d;
            if (viewTreeObserverOnDrawListenerC1810v != null) {
                Bitmap bitmap = viewTreeObserverOnDrawListenerC1810v.f6549i;
                WeakReference weakReference = viewTreeObserverOnDrawListenerC1810v.f6546f;
                viewTreeObserverOnDrawListenerC1810v.m3981c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = viewTreeObserverOnDrawListenerC1810v.f6546f;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                viewTreeObserverOnDrawListenerC1810v.f6553m.set(false);
            }
            runnableC2069iq.f7321d = null;
            ((AtomicBoolean) runnableC2069iq.f7323f).getAndSet(false);
        }
        C1981r c1981rM4173a = this.f6377j.m4173a();
        try {
            this.f6378k = null;
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
            this.f6373f.set(false);
        } finally {
        }
    }
}
