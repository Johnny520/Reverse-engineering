package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.C1563B0;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC1722j;
import io.sentry.android.replay.util.C1802b;
import io.sentry.config.AbstractC1856a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0148Dc;

/* JADX INFO: renamed from: io.sentry.android.replay.v */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1810v implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    public final C1821w f6541a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f6542b;

    /* JADX INFO: renamed from: c */
    public final C1563B0 f6543c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f6544d;

    /* JADX INFO: renamed from: e */
    public final ReplayIntegration f6545e;

    /* JADX INFO: renamed from: f */
    public WeakReference f6546f;

    /* JADX INFO: renamed from: i */
    public final Bitmap f6549i;

    /* JADX INFO: renamed from: g */
    public final Object f6547g = AbstractC0148Dc.m280n(3, C1760a.f6402g);

    /* JADX INFO: renamed from: h */
    public final Object f6548h = AbstractC0148Dc.m280n(3, C1760a.f6403h);

    /* JADX INFO: renamed from: j */
    public final Object f6550j = AbstractC0148Dc.m280n(3, new C1800u(this, 1));

    /* JADX INFO: renamed from: k */
    public final Object f6551k = AbstractC0148Dc.m280n(3, new C1800u(this, 0));

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f6552l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f6553m = new AtomicBoolean(true);

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f6554n = new AtomicBoolean(false);

    public ViewTreeObserverOnDrawListenerC1810v(C1821w c1821w, C2046v2 c2046v2, C1563B0 c1563b0, ScheduledExecutorService scheduledExecutorService, ReplayIntegration replayIntegration) {
        this.f6541a = c1821w;
        this.f6542b = c2046v2;
        this.f6543c = c1563b0;
        this.f6544d = scheduledExecutorService;
        this.f6545e = replayIntegration;
        this.f6549i = Bitmap.createBitmap(c1821w.f6589a, c1821w.f6590b, Bitmap.Config.ARGB_8888);
        new C1802b();
    }

    /* JADX INFO: renamed from: a */
    public final void m3979a(View view) {
        WeakReference weakReference = this.f6546f;
        m3981c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f6546f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f6546f = new WeakReference(view);
        if (view != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.f6552l.set(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m3980b() {
        C2046v2 c2046v2 = this.f6542b;
        boolean z = c2046v2.getSessionReplay().f7316l;
        AtomicBoolean atomicBoolean = this.f6553m;
        if (z) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (c2046v2.getSessionReplay().f7316l) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = c2046v2.getSessionReplay().f7316l;
        AtomicBoolean atomicBoolean2 = this.f6554n;
        AtomicBoolean atomicBoolean3 = this.f6552l;
        if (z2) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean3.get()), Boolean.valueOf(atomicBoolean2.get()));
        }
        boolean z3 = atomicBoolean3.get();
        Bitmap bitmap = this.f6549i;
        if (!z3 && atomicBoolean2.get()) {
            this.f6545e.m3947s(bitmap);
            return;
        }
        WeakReference weakReference = this.f6546f;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        Window windowM4071q = AbstractC1856a.m4071q(view);
        if (windowM4071q == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean3.set(false);
            PixelCopy.request(windowM4071q, bitmap, new PixelCopyOnPixelCopyFinishedListenerC1722j(1, this, view), (Handler) this.f6543c.f5600a);
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to capture replay recording", th);
            atomicBoolean2.set(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3981c(View view) {
        this.f6542b.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f6553m.get()) {
            WeakReference weakReference = this.f6546f;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f6542b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f6552l.set(true);
            }
        }
    }
}
