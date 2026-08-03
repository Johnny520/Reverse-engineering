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
import java.util.Iterator;
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
    public final AtomicBoolean f6373f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6374g;

    /* JADX INFO: renamed from: h */
    public final Point f6375h;

    /* JADX INFO: renamed from: i */
    public final C2029a f6376i;

    /* JADX INFO: renamed from: j */
    public final C2029a f6377j;

    /* JADX INFO: renamed from: k */
    public volatile RunnableC2069iq f6378k;

    public C1758C(C2046v2 r1, ReplayIntegration r2, ReplayIntegration r3, C1563B0 r4, ScheduledExecutorService r5) {
        this.f6368a = r1;
        this.f6369b = r2;
        this.f6370c = r3;
        this.f6371d = r4;
        this.f6372e = r5;
        this.f6373f = new AtomicBoolean(false);
        this.f6374g = new ArrayList();
        this.f6375h = new Point();
        this.f6376i = new C2029a();
        this.f6377j = new C2029a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3942l();
        C1563B0 r0 = this.f6371d;
        RunnableC2069iq r1 = this.f6378k;
        Handler r02 = (Handler) r0.f5600a;
        if (r1 == null) goto L6;
        r02.removeCallbacks(r1);
    L6:
        m3944o();
    }

    @Override // io.sentry.android.replay.InterfaceC1781e
    /* JADX INFO: renamed from: d */
    public final void mo3939d(View r5, boolean r6) {
        C1981r r0 = this.f6376i.m4173a();
        if (r6 == false) goto L12;
        this.f6374g.add(new WeakReference(r5));     // Catch: Throwable -> L9
        RunnableC2069iq r62 = this.f6378k;     // Catch: Throwable -> L9
        if (r62 == null) goto L11;
        ViewTreeObserverOnDrawListenerC1810v r63 = (ViewTreeObserverOnDrawListenerC1810v) r62.f7321d;     // Catch: Throwable -> L9
        if (r63 == null) goto L11;
        r63.m3979a(r5);     // Catch: Throwable -> L9
    L11:
        m3940f(r5);     // Catch: Throwable -> L9
    L30:
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L12:
        RunnableC2069iq r64 = this.f6378k;     // Catch: Throwable -> L9
        if (r64 == null) goto L17;
        ViewTreeObserverOnDrawListenerC1810v r65 = (ViewTreeObserverOnDrawListenerC1810v) r64.f7321d;     // Catch: Throwable -> L9
        if (r65 == null) goto L17;
        r65.m3981c(r5);     // Catch: Throwable -> L9
    L17:
        AbstractC2711xa.m5283e0(this.f6374g, new C1757B(r5, 0));     // Catch: Throwable -> L9
        WeakReference r66 = (WeakReference) AbstractC2453ra.m4903m0(this.f6374g);     // Catch: Throwable -> L9
        if (r66 == null) goto L20;
        View r67 = (View) r66.get();     // Catch: Throwable -> L9
    L21:
        if (r67 == null) goto L30;
        if (r5.equals(r67) == true) goto L30;
        RunnableC2069iq r52 = this.f6378k;     // Catch: Throwable -> L9
        if (r52 == null) goto L29;
        ViewTreeObserverOnDrawListenerC1810v r53 = (ViewTreeObserverOnDrawListenerC1810v) r52.f7321d;     // Catch: Throwable -> L9
        if (r53 == null) goto L29;
        r53.m3979a(r67);     // Catch: Throwable -> L9
    L29:
        m3940f(r67);     // Catch: Throwable -> L9
        goto L30
    L20:
        r67 = null;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m3940f(View r4) {
        if (r4.getWidth() > 0) goto L5;
    L12:
        ViewTreeObserverOnPreDrawListenerC1756A r0 = new ViewTreeObserverOnPreDrawListenerC1756A(this, r4);
        if (r4.getViewTreeObserver() != null) goto L15;
        return;
    L15:
        if (r4.getViewTreeObserver().isAlive() == false) goto L25;
        r4.getViewTreeObserver().addOnPreDrawListener(r0);     // Catch: IllegalStateException -> L19
        return;
    L26:
        return;
    L25:
        return;
    L5:
        if (r4.getHeight() <= 0) goto L12;
        int r02 = r4.getWidth();
        Point r1 = this.f6375h;
        if (r02 != r1.x) goto L9;
        return;
    L9:
        if (r4.getHeight() == r1.y) goto L23;
        r1.set(r4.getWidth(), r4.getHeight());
        int r03 = r4.getWidth();
        int r42 = r4.getHeight();
        this.f6370c.m3948u(r03, r42);
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m3941i() {
        RunnableC2069iq r0 = this.f6378k;
        if (r0 == null) goto L13;
        ViewTreeObserverOnDrawListenerC1810v r1 = (ViewTreeObserverOnDrawListenerC1810v) r0.f7321d;
        if (r1 == null) goto L11;
        r1.f6553m.set(false);
        WeakReference r3 = r1.f6546f;
        if (r3 == null) goto L9;
        View r32 = (View) r3.get();
    L10:
        r1.m3981c(r32);
        goto L11
    L9:
        r32 = null;
    L11:
        ((AtomicBoolean) r0.f7323f).getAndSet(false);
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m3942l() {
        this.f6375h.set(0, 0);
        C1981r r0 = this.f6376i.m4173a();
        Iterator r1 = this.f6374g.iterator();     // Catch: Throwable -> L11
    L5:
        if (r1.hasNext() == false) goto L13;
        WeakReference r2 = (WeakReference) r1.next();     // Catch: Throwable -> L11
        RunnableC2069iq r3 = this.f6378k;     // Catch: Throwable -> L11
        if (r3 == null) goto L5;
        ViewTreeObserverOnDrawListenerC1810v r32 = (ViewTreeObserverOnDrawListenerC1810v) r3.f7321d;     // Catch: Throwable -> L11
        if (r32 == null) goto L5;
        r32.m3981c((View) r2.get());     // Catch: Throwable -> L11
        goto L5
    L13:
        this.f6374g.clear();     // Catch: Throwable -> L11
        AbstractC0714Qj.m1489k(r0, null);
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0714Qj.m1489k(r0, th);
        throw th;
    }

    /* JADX INFO: renamed from: m */
    public final void m3943m() {
        RunnableC2069iq r0 = this.f6378k;
        if (r0 == null) goto L27;
        C1563B0 r1 = (C1563B0) r0.f7320c;
        C2046v2 r2 = (C2046v2) r0.f7319b;
        if (r2.getSessionReplay().f7316l == false) goto L7;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Resuming the capture runnable.", new Object[0]);
    L7:
        ViewTreeObserverOnDrawListenerC1810v r3 = (ViewTreeObserverOnDrawListenerC1810v) r0.f7321d;
        if (r3 == null) goto L20;
        WeakReference r6 = r3.f6546f;
        if (r6 == null) goto L19;
        View r62 = (View) r6.get();
        if (r62 == null) goto L19;
        if (r62.getViewTreeObserver() == null) goto L19;
        if (r62.getViewTreeObserver().isAlive() == false) goto L19;
        r62.getViewTreeObserver().addOnDrawListener(r3);     // Catch: IllegalStateException -> L24
    L19:
        r3.f6553m.set(true);
    L20:
        ((AtomicBoolean) r0.f7323f).getAndSet(true);
        ((Handler) r1.f5600a).removeCallbacks(r0);
        if (((Handler) r1.f5600a).post(r0) == true) goto L28;
        r2.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        return;
    L28:
        return;
    }

    /* JADX INFO: renamed from: o */
    public final void m3944o() {
        RunnableC2069iq r0 = this.f6378k;
        if (r0 == null) goto L18;
        ViewTreeObserverOnDrawListenerC1810v r3 = (ViewTreeObserverOnDrawListenerC1810v) r0.f7321d;
        if (r3 == null) goto L17;
        Bitmap r4 = r3.f6549i;
        WeakReference r5 = r3.f6546f;
        if (r5 == null) goto L9;
        View r52 = (View) r5.get();
    L10:
        r3.m3981c(r52);
        WeakReference r53 = r3.f6546f;
        if (r53 == null) goto L14;
        r53.clear();
    L14:
        if (r4.isRecycled() == true) goto L16;
        r4.recycle();
    L16:
        r3.f6553m.set(false);
        goto L17
    L9:
        r52 = null;
    L17:
        r0.f7321d = null;
        ((AtomicBoolean) r0.f7323f).getAndSet(false);
    L18:
        C1981r r02 = this.f6377j.m4173a();
        this.f6378k = null;     // Catch: Throwable -> L22
        AbstractC0714Qj.m1489k(r02, null);
        this.f6373f.set(false);
        return;
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        AbstractC0714Qj.m1489k(r02, th);
        throw th;
    }
}
