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

    /* JADX INFO: renamed from: g */
    public final Object f6547g;

    /* JADX INFO: renamed from: h */
    public final Object f6548h;

    /* JADX INFO: renamed from: i */
    public final Bitmap f6549i;

    /* JADX INFO: renamed from: j */
    public final Object f6550j;

    /* JADX INFO: renamed from: k */
    public final Object f6551k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f6552l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f6553m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f6554n;

    public ViewTreeObserverOnDrawListenerC1810v(C1821w r1, C2046v2 r2, C1563B0 r3, ScheduledExecutorService r4, ReplayIntegration r5) {
        this.f6541a = r1;
        this.f6542b = r2;
        this.f6543c = r3;
        this.f6544d = r4;
        this.f6545e = r5;
        this.f6547g = AbstractC0148Dc.m280n(3, C1760a.f6402g);
        this.f6548h = AbstractC0148Dc.m280n(3, C1760a.f6403h);
        this.f6549i = Bitmap.createBitmap(r1.f6589a, r1.f6590b, Bitmap.Config.ARGB_8888);
        this.f6550j = AbstractC0148Dc.m280n(3, new C1800u(this, 1));
        this.f6551k = AbstractC0148Dc.m280n(3, new C1800u(this, 0));
        this.f6552l = new AtomicBoolean(false);
        this.f6553m = new AtomicBoolean(true);
        this.f6554n = new AtomicBoolean(false);
        new C1802b();
    }

    /* JADX INFO: renamed from: a */
    public final void m3979a(View r2) {
        WeakReference r0 = this.f6546f;
        if (r0 == null) goto L5;
        View r02 = (View) r0.get();
    L6:
        m3981c(r02);
        WeakReference r03 = this.f6546f;
        if (r03 == null) goto L9;
        r03.clear();
    L9:
        this.f6546f = new WeakReference(r2);
        if (r2 != null) goto L12;
    L17:
        this.f6552l.set(true);
        return;
    L12:
        if (r2.getViewTreeObserver() == null) goto L17;
        if (r2.getViewTreeObserver().isAlive() == false) goto L17;
        r2.getViewTreeObserver().addOnDrawListener(this);     // Catch: IllegalStateException -> L19
        goto L17
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m3980b() {
        C2046v2 r0 = this.f6542b;
        boolean r1 = r0.getSessionReplay().f7316l;
        AtomicBoolean r2 = this.f6553m;
        if (r1 == false) goto L6;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing screenshot, isCapturing: %s", new Object[]{Boolean.valueOf(r2.get())});
    L6:
        if (r2.get() == false) goto L8;
        boolean r12 = r0.getSessionReplay().f7316l;
        AtomicBoolean r3 = this.f6554n;
        AtomicBoolean r4 = this.f6552l;
        if (r12 == false) goto L14;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", new Object[]{Boolean.valueOf(r4.get()), Boolean.valueOf(r3.get())});
    L14:
        boolean r13 = r4.get();
        Bitmap r5 = this.f6549i;
        if (r13 == false) goto L17;
    L20:
        WeakReference r14 = this.f6546f;
        if (r14 == null) goto L23;
        View r15 = (View) r14.get();
    L24:
        if (r15 != null) goto L26;
    L41:
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        return;
    L26:
        if (r15.getWidth() <= 0) goto L41;
        if (r15.getHeight() <= 0) goto L41;
        if (r15.isShown() == false) goto L41;
        Window r6 = AbstractC1856a.m4071q(r15);
        if (r6 != null) goto L43;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
        return;
    L43:
        r4.set(false);     // Catch: Throwable -> L38
        PixelCopy.request(r6, r5, new PixelCopyOnPixelCopyFinishedListenerC1722j(1, this, r15), (Handler) this.f6543c.f5600a);     // Catch: Throwable -> L38
        return;
    L38:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to capture replay recording", th);
        r3.set(false);
        return;
    L23:
        r15 = null;
        goto L24
    L17:
        if (r3.get() == false) goto L20;
        this.f6545e.m3947s(r5);
        return;
    L8:
        if (r0.getSessionReplay().f7316l == false) goto L45;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m3981c(View r2) {
        this.f6542b.getReplayController().getClass();
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.getViewTreeObserver() != null) goto L7;
        return;
    L7:
        if (r2.getViewTreeObserver().isAlive() == false) goto L16;
        r2.getViewTreeObserver().removeOnDrawListener(this);     // Catch: IllegalStateException -> L11
        return;
    L17:
        return;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f6553m.get() == true) goto L5;
        return;
    L5:
        WeakReference r0 = this.f6546f;
        if (r0 == null) goto L8;
        View r02 = (View) r0.get();
    L9:
        if (r02 != null) goto L11;
    L19:
        this.f6542b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        return;
    L11:
        if (r02.getWidth() <= 0) goto L19;
        if (r02.getHeight() <= 0) goto L19;
        if (r02.isShown() == false) goto L19;
        this.f6552l.set(true);
        return;
    L8:
        r02 = null;
        goto L9
    }
}
