package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C1611N0;
import io.sentry.C1981r;
import io.sentry.android.core.AbstractC1665H;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1696g;
import io.sentry.android.core.C1744r;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1720h;
import io.sentry.util.C2029a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.android.core.performance.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1740f extends AbstractC1735a {

    /* JADX INFO: renamed from: o */
    public static long f6303o;

    /* JADX INFO: renamed from: p */
    public static volatile C1740f f6304p;

    /* JADX INFO: renamed from: q */
    public static final C2029a f6305q = null;

    /* JADX INFO: renamed from: a */
    public EnumC1739e f6306a;

    /* JADX INFO: renamed from: b */
    public boolean f6307b;

    /* JADX INFO: renamed from: c */
    public final C1741g f6308c;

    /* JADX INFO: renamed from: d */
    public final C1741g f6309d;

    /* JADX INFO: renamed from: e */
    public final C1741g f6310e;

    /* JADX INFO: renamed from: f */
    public final HashMap f6311f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6312g;

    /* JADX INFO: renamed from: h */
    public C1744r f6313h;

    /* JADX INFO: renamed from: i */
    public C1696g f6314i;

    /* JADX INFO: renamed from: j */
    public C2648vx f6315j;

    /* JADX INFO: renamed from: k */
    public boolean f6316k;

    /* JADX INFO: renamed from: l */
    public boolean f6317l;

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f6318m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f6319n;

    static {
        f6303o = SystemClock.uptimeMillis();
        f6305q = new C2029a();
    }

    public C1740f() {
        this.f6306a = EnumC1739e.UNKNOWN;
        this.f6313h = null;
        this.f6314i = null;
        this.f6315j = null;
        this.f6316k = false;
        this.f6317l = true;
        this.f6318m = new AtomicInteger();
        this.f6319n = new AtomicBoolean(false);
        this.f6308c = new C1741g();
        this.f6309d = new C1741g();
        this.f6310e = new C1741g();
        this.f6311f = new HashMap();
        this.f6312g = new ArrayList();
        this.f6307b = AbstractC1665H.m3826d();
    }

    /* JADX INFO: renamed from: b */
    public static C1740f m3914b() {
        if (f6304p != null) goto L18;
        C1981r r0 = f6305q.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L6:
        if (f6304p != null) goto L11;
        f6304p = new C1740f();     // Catch: Throwable -> L9
    L11:
        r0.close();
    L18:
        return f6304p;
    }

    /* JADX INFO: renamed from: a */
    public final C1741g m3915a(SentryAndroidOptions r7) {
        if (this.f6306a == EnumC1739e.UNKNOWN) goto L19;
        if (this.f6307b == false) goto L19;
        if (r7.isEnablePerformanceV2() == false) goto L13;
        C1741g r72 = this.f6308c;
        if (r72.m3919b() == false) goto L13;
        if (r72.m3918a() > TimeUnit.MINUTES.toMillis(1)) goto L13;
        return r72;
    L13:
        C1741g r73 = this.f6309d;
        if (r73.m3919b() == false) goto L19;
        if (r73.m3918a() > TimeUnit.MINUTES.toMillis(1)) goto L19;
        return r73;
    L19:
        return new C1741g();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3916c() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f6319n.getAndSet(true) == true) goto L9;
        C1740f r0 = m3914b();     // Catch: Throwable -> L7
        C1741g r1 = r0.f6309d;     // Catch: Throwable -> L7
        r1.getClass();     // Catch: Throwable -> L7
        r1.f6323d = SystemClock.uptimeMillis();     // Catch: Throwable -> L7
        C1741g r02 = r0.f6308c;     // Catch: Throwable -> L7
        r02.getClass();     // Catch: Throwable -> L7
        r02.f6323d = SystemClock.uptimeMillis();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m3917d(Application r3) {
        if (this.f6316k == false) goto L5;
        return;
    L5:
        boolean r0 = true;
        this.f6316k = true;
        if (this.f6307b == false) goto L8;
    L11:
        this.f6307b = r0;
        r3.registerActivityLifecycleCallbacks(f6304p);
        new Handler(Looper.getMainLooper()).post(new RunnableC1738d(this, 0));
        return;
    L8:
        if (AbstractC1665H.m3826d() == true) goto L11;
        r0 = false;
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r9, Bundle r10) {
        C1666I.f5973b.m3835c(r9);
        if (this.f6318m.incrementAndGet() == 1) goto L5;
    L16:
        this.f6307b = true;
        return;
    L5:
        if (this.f6319n.get() == true) goto L16;
        long r1 = SystemClock.uptimeMillis();
        C1741g r92 = this.f6308c;
        long r3 = r1 - r92.f6322c;
        if (this.f6307b == true) goto L9;
    L15:
        this.f6306a = EnumC1739e.WARM;
        this.f6317l = true;
        r92.f6320a = null;
        r92.f6322c = 0;
        r92.f6323d = 0;
        r92.f6321b = 0;
        r92.f6322c = SystemClock.uptimeMillis();
        r92.f6321b = System.currentTimeMillis();
        r92.m3920c(r1);
        f6303o = r1;
        this.f6311f.clear();
        C1741g r93 = this.f6310e;
        r93.f6320a = null;
        r93.f6322c = 0;
        r93.f6323d = 0;
        r93.f6321b = 0;
        goto L16
    L9:
        if (r3 > TimeUnit.MINUTES.toMillis(1)) goto L15;
        if (r10 != null) goto L13;
        EnumC1739e r94 = EnumC1739e.COLD;
    L14:
        this.f6306a = r94;
        goto L16
    L13:
        r94 = EnumC1739e.WARM;
        goto L14
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r3) {
        C1666I r0 = C1666I.f5973b;
        WeakReference r1 = (WeakReference) r0.f5974a;
        if (r1 != null) goto L5;
    L7:
        r0.f5974a = null;
    L9:
        if (this.f6318m.decrementAndGet() == 0) goto L11;
        return;
    L11:
        if (r3.isChangingConfigurations() == true) goto L15;
        this.f6307b = false;
        this.f6317l = true;
        this.f6319n.set(false);
        return;
    L15:
        return;
    L5:
        if (r1.get() == r3) goto L7;
        goto L7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r3) {
        C1666I r0 = C1666I.f5973b;
        WeakReference r1 = (WeakReference) r0.f5974a;
        if (r1 != null) goto L5;
    L7:
        r0.f5974a = null;
        return;
    L5:
        if (r1.get() == r3) goto L7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r2) {
        C1666I.f5973b.m3835c(r2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r4) {
        C1666I.f5973b.m3835c(r4);
        if (this.f6319n.get() == false) goto L6;
        return;
    L6:
        if (r4.getWindow() == null) goto L9;
        ViewTreeObserverOnDrawListenerC1720h.m3905a(r4, new RunnableC1738d(this, 1), new C1666I(C1611N0.f5797a));
        return;
    L9:
        new Handler(Looper.getMainLooper()).post(new RunnableC1738d(this, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r3) {
        C1666I r0 = C1666I.f5973b;
        WeakReference r1 = (WeakReference) r0.f5974a;
        if (r1 != null) goto L5;
    L7:
        r0.f5974a = null;
        return;
    L5:
        if (r1.get() == r3) goto L7;
    }
}
