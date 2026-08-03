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

    /* JADX INFO: renamed from: p */
    public static volatile C1740f f6304p;

    /* JADX INFO: renamed from: o */
    public static long f6303o = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: q */
    public static final C2029a f6305q = new C2029a();

    /* JADX INFO: renamed from: a */
    public EnumC1739e f6306a = EnumC1739e.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public C1744r f6313h = null;

    /* JADX INFO: renamed from: i */
    public C1696g f6314i = null;

    /* JADX INFO: renamed from: j */
    public C2648vx f6315j = null;

    /* JADX INFO: renamed from: k */
    public boolean f6316k = false;

    /* JADX INFO: renamed from: l */
    public boolean f6317l = true;

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f6318m = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f6319n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final C1741g f6308c = new C1741g();

    /* JADX INFO: renamed from: d */
    public final C1741g f6309d = new C1741g();

    /* JADX INFO: renamed from: e */
    public final C1741g f6310e = new C1741g();

    /* JADX INFO: renamed from: f */
    public final HashMap f6311f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final ArrayList f6312g = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f6307b = AbstractC1665H.m3826d();

    /* JADX INFO: renamed from: b */
    public static C1740f m3914b() {
        if (f6304p == null) {
            C1981r c1981rM4173a = f6305q.m4173a();
            try {
                if (f6304p == null) {
                    f6304p = new C1740f();
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return f6304p;
    }

    /* JADX INFO: renamed from: a */
    public final C1741g m3915a(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f6306a != EnumC1739e.UNKNOWN && this.f6307b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                C1741g c1741g = this.f6308c;
                if (c1741g.m3919b() && c1741g.m3918a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return c1741g;
                }
            }
            C1741g c1741g2 = this.f6309d;
            if (c1741g2.m3919b() && c1741g2.m3918a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return c1741g2;
            }
        }
        return new C1741g();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3916c() {
        if (!this.f6319n.getAndSet(true)) {
            C1740f c1740fM3914b = m3914b();
            C1741g c1741g = c1740fM3914b.f6309d;
            c1741g.getClass();
            c1741g.f6323d = SystemClock.uptimeMillis();
            C1741g c1741g2 = c1740fM3914b.f6308c;
            c1741g2.getClass();
            c1741g2.f6323d = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3917d(Application application) {
        if (this.f6316k) {
            return;
        }
        boolean z = true;
        this.f6316k = true;
        if (!this.f6307b && !AbstractC1665H.m3826d()) {
            z = false;
        }
        this.f6307b = z;
        application.registerActivityLifecycleCallbacks(f6304p);
        new Handler(Looper.getMainLooper()).post(new RunnableC1738d(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1666I.f5973b.m3835c(activity);
        if (this.f6318m.incrementAndGet() == 1 && !this.f6319n.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1741g c1741g = this.f6308c;
            long j = jUptimeMillis - c1741g.f6322c;
            if (!this.f6307b || j > TimeUnit.MINUTES.toMillis(1L)) {
                this.f6306a = EnumC1739e.WARM;
                this.f6317l = true;
                c1741g.f6320a = null;
                c1741g.f6322c = 0L;
                c1741g.f6323d = 0L;
                c1741g.f6321b = 0L;
                c1741g.f6322c = SystemClock.uptimeMillis();
                c1741g.f6321b = System.currentTimeMillis();
                c1741g.m3920c(jUptimeMillis);
                f6303o = jUptimeMillis;
                this.f6311f.clear();
                C1741g c1741g2 = this.f6310e;
                c1741g2.f6320a = null;
                c1741g2.f6322c = 0L;
                c1741g2.f6323d = 0L;
                c1741g2.f6321b = 0L;
            } else {
                this.f6306a = bundle == null ? EnumC1739e.COLD : EnumC1739e.WARM;
            }
        }
        this.f6307b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1666I c1666i = C1666I.f5973b;
        WeakReference weakReference = (WeakReference) c1666i.f5974a;
        if (weakReference == null || weakReference.get() == activity) {
            c1666i.f5974a = null;
        }
        if (this.f6318m.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f6307b = false;
        this.f6317l = true;
        this.f6319n.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1666I c1666i = C1666I.f5973b;
        WeakReference weakReference = (WeakReference) c1666i.f5974a;
        if (weakReference == null || weakReference.get() == activity) {
            c1666i.f5974a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1666I.f5973b.m3835c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C1666I.f5973b.m3835c(activity);
        if (this.f6319n.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            ViewTreeObserverOnDrawListenerC1720h.m3905a(activity, new RunnableC1738d(this, 1), new C1666I(C1611N0.f5797a));
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC1738d(this, 2));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1666I c1666i = C1666I.f5973b;
        WeakReference weakReference = (WeakReference) c1666i.f5974a;
        if (weakReference == null || weakReference.get() == activity) {
            c1666i.f5974a = null;
        }
    }
}
