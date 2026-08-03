package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.AbstractC1588H1;
import io.sentry.C1582G;
import io.sentry.C1597J2;
import io.sentry.C1621P2;
import io.sentry.C1625Q2;
import io.sentry.C1643W0;
import io.sentry.C1874f2;
import io.sentry.C1878g2;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1579F0;
import io.sentry.EnumC1605L2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1930n0;
import io.sentry.InterfaceC1876g0;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1935o0;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1720h;
import io.sentry.android.core.performance.C1736b;
import io.sentry.android.core.performance.C1737c;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.core.performance.C1741g;
import io.sentry.android.core.performance.EnumC1739e;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.EnumC1946C;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p000.C0252Fu;
import p000.C0584Ni;
import p000.C0698Q9;
import p000.C1094Zd;
import p000.C2438r1;
import p000.C2464rl;
import p000.C2648vx;
import p000.RunnableC2260n3;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements InterfaceC1935o0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f5917a;

    /* JADX INFO: renamed from: b */
    public final C1666I f5918b;

    /* JADX INFO: renamed from: c */
    public C2054w1 f5919c;

    /* JADX INFO: renamed from: d */
    public SentryAndroidOptions f5920d;

    /* JADX INFO: renamed from: g */
    public final boolean f5923g;

    /* JADX INFO: renamed from: j */
    public InterfaceC1876g0 f5926j;

    /* JADX INFO: renamed from: q */
    public final C0252Fu f5933q;

    /* JADX INFO: renamed from: e */
    public boolean f5921e = false;

    /* JADX INFO: renamed from: f */
    public boolean f5922f = false;

    /* JADX INFO: renamed from: h */
    public boolean f5924h = false;

    /* JADX INFO: renamed from: i */
    public C1582G f5925i = null;

    /* JADX INFO: renamed from: k */
    public final WeakHashMap f5927k = new WeakHashMap();

    /* JADX INFO: renamed from: l */
    public final WeakHashMap f5928l = new WeakHashMap();

    /* JADX INFO: renamed from: m */
    public final WeakHashMap f5929m = new WeakHashMap();

    /* JADX INFO: renamed from: n */
    public AbstractC1588H1 f5930n = new C1878g2(new Date(0), 0);

    /* JADX INFO: renamed from: o */
    public Future f5931o = null;

    /* JADX INFO: renamed from: p */
    public final WeakHashMap f5932p = new WeakHashMap();

    /* JADX INFO: renamed from: r */
    public final C2029a f5934r = new C2029a();

    /* JADX INFO: renamed from: s */
    public final C2029a f5935s = new C2029a();

    public ActivityLifecycleIntegration(Application application, C1666I c1666i, C0252Fu c0252Fu) {
        this.f5917a = application;
        this.f5918b = c1666i;
        this.f5933q = c0252Fu;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5923g = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3799f(InterfaceC1876g0 interfaceC1876g0, InterfaceC1876g0 interfaceC1876g02) {
        if (interfaceC1876g0 == null || interfaceC1876g0.mo3620f()) {
            return;
        }
        String strMo3623i = interfaceC1876g0.mo3623i();
        if (strMo3623i == null || !strMo3623i.endsWith(" - Deadline Exceeded")) {
            strMo3623i = interfaceC1876g0.mo3623i() + " - Deadline Exceeded";
        }
        interfaceC1876g0.mo3617c(strMo3623i);
        AbstractC1588H1 abstractC1588H1Mo3630p = interfaceC1876g02 != null ? interfaceC1876g02.mo3630p() : null;
        if (abstractC1588H1Mo3630p == null) {
            abstractC1588H1Mo3630p = interfaceC1876g0.mo3635u();
        }
        m3800i(interfaceC1876g0, abstractC1588H1Mo3630p, EnumC1605L2.DEADLINE_EXCEEDED);
    }

    /* JADX INFO: renamed from: i */
    public static void m3800i(InterfaceC1876g0 interfaceC1876g0, AbstractC1588H1 abstractC1588H1, EnumC1605L2 enumC1605L2) {
        if (interfaceC1876g0 == null || interfaceC1876g0.mo3620f()) {
            return;
        }
        if (enumC1605L2 == null) {
            enumC1605L2 = interfaceC1876g0.mo3629o() != null ? interfaceC1876g0.mo3629o() : EnumC1605L2.OK;
        }
        interfaceC1876g0.mo3631q(enumC1605L2, abstractC1588H1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5917a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f5920d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C0252Fu c0252Fu = this.f5933q;
        C1981r c1981rM4173a = ((C2029a) c0252Fu.f824f).m4173a();
        try {
            if (c0252Fu.m531h()) {
                c0252Fu.m532i(new RunnableC1631S1(2, c0252Fu), "FrameMetricsAggregator.stop");
                C0584Ni c0584Ni = ((FrameMetricsAggregator) c0252Fu.f819a).f3910a;
                Object obj = c0584Ni.f1893b;
                c0584Ni.f1893b = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) c0252Fu.f821c).clear();
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

    /* JADX INFO: renamed from: d */
    public final void m3801d() {
        C1874f2 c1874f2;
        C1741g c1741gM3915a = C1740f.m3914b().m3915a(this.f5920d);
        if (c1741gM3915a.f6323d != 0) {
            c1874f2 = new C1874f2((c1741gM3915a.m3919b() ? c1741gM3915a.f6321b + c1741gM3915a.m3918a() : 0L) * 1000000);
        } else {
            c1874f2 = null;
        }
        if (!this.f5921e || c1874f2 == null) {
            return;
        }
        m3800i(this.f5926j, c1874f2, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m3802l(InterfaceC1895i0 interfaceC1895i0, InterfaceC1876g0 interfaceC1876g0, InterfaceC1876g0 interfaceC1876g02) {
        if (interfaceC1895i0 == null || interfaceC1895i0.mo3620f()) {
            return;
        }
        EnumC1605L2 enumC1605L2 = EnumC1605L2.DEADLINE_EXCEEDED;
        if (interfaceC1876g0 != null && !interfaceC1876g0.mo3620f()) {
            interfaceC1876g0.mo3628n(enumC1605L2);
        }
        m3799f(interfaceC1876g02, interfaceC1876g0);
        Future future = this.f5931o;
        if (future != null) {
            future.cancel(false);
            this.f5931o = null;
        }
        EnumC1605L2 enumC1605L2Mo3629o = interfaceC1895i0.mo3629o();
        if (enumC1605L2Mo3629o == null) {
            enumC1605L2Mo3629o = EnumC1605L2.OK;
        }
        interfaceC1895i0.mo3628n(enumC1605L2Mo3629o);
        C2054w1 c2054w1 = this.f5919c;
        if (c2054w1 != null) {
            c2054w1.mo3719m(new C2464rl(this, interfaceC1895i0));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3803m(InterfaceC1876g0 interfaceC1876g0, InterfaceC1876g0 interfaceC1876g02) {
        C1740f c1740fM3914b = C1740f.m3914b();
        C1741g c1741g = c1740fM3914b.f6308c;
        C1741g c1741g2 = c1740fM3914b.f6309d;
        if (c1741g.m3919b() && c1741g.f6323d == 0) {
            c1741g.f6323d = SystemClock.uptimeMillis();
        }
        if (c1741g2.m3919b() && c1741g2.f6323d == 0) {
            c1741g2.f6323d = SystemClock.uptimeMillis();
        }
        m3801d();
        C1981r c1981rM4173a = this.f5935s.m4173a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f5920d;
            if (sentryAndroidOptions != null && interfaceC1876g02 != null) {
                AbstractC1588H1 abstractC1588H1Mo3603a = sentryAndroidOptions.getDateProvider().mo3603a();
                interfaceC1876g02.mo3626l("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(abstractC1588H1Mo3603a.mo3670b(interfaceC1876g02.mo3635u()))), EnumC1579F0.MILLISECOND);
                m3800i(interfaceC1876g02, abstractC1588H1Mo3603a, null);
            } else if (interfaceC1876g02 != null && !interfaceC1876g02.mo3620f()) {
                interfaceC1876g02.mo3632r();
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

    /* JADX INFO: renamed from: o */
    public final void m3804o(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        C1874f2 c1874f2;
        AbstractC1588H1 abstractC1588H1;
        C1094Zd c1094Zd;
        InterfaceC1895i0 interfaceC1895i0;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f5919c != null) {
            WeakHashMap weakHashMap3 = this.f5932p;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f5921e) {
                weakHashMap3.put(activity, C1643W0.f5888a);
                if (this.f5920d.isEnableAutoTraceIdGeneration()) {
                    this.f5919c.mo3719m(new C1676T(5));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.f5928l;
                weakHashMap2 = this.f5927k;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                m3802l((InterfaceC1895i0) entry.getValue(), (InterfaceC1876g0) weakHashMap2.get(entry.getKey()), (InterfaceC1876g0) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            C1741g c1741gM3915a = C1740f.m3914b().m3915a(this.f5920d);
            C2648vx c2648vx = null;
            if (AbstractC1665H.m3826d() && c1741gM3915a.m3919b()) {
                C1874f2 c1874f22 = c1741gM3915a.m3919b() ? new C1874f2(c1741gM3915a.f6321b * 1000000) : null;
                boolValueOf = Boolean.valueOf(C1740f.m3914b().f6306a == EnumC1739e.COLD);
                c1874f2 = c1874f22;
            } else {
                boolValueOf = null;
                c1874f2 = null;
            }
            C1625Q2 c1625q2 = new C1625Q2();
            long deadlineTimeout = this.f5920d.getDeadlineTimeout();
            c1625q2.f5842h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.f5920d.isEnableActivityLifecycleTracingAutoFinish()) {
                c1625q2.f5841g = this.f5920d.getIdleTimeout();
                c1625q2.f3477a = true;
            }
            c1625q2.f5840f = true;
            c1625q2.f5843i = new C1692e(this, weakReference, simpleName);
            if (this.f5924h || c1874f2 == null || boolValueOf == null) {
                abstractC1588H1 = this.f5930n;
            } else {
                C2648vx c2648vx2 = C1740f.m3914b().f6315j;
                C1740f.m3914b().f6315j = null;
                c2648vx = c2648vx2;
                abstractC1588H1 = c1874f2;
            }
            c1625q2.f3478b = abstractC1588H1;
            c1625q2.f5839e = c2648vx != null;
            c1625q2.f3480d = "auto.ui.activity";
            InterfaceC1895i0 interfaceC1895i0Mo3717k = this.f5919c.mo3717k(new C1621P2(simpleName, EnumC1946C.COMPONENT, "ui.load", c2648vx), c1625q2);
            C1094Zd c1094Zd2 = new C1094Zd();
            c1094Zd2.f3480d = "auto.ui.activity";
            if (this.f5924h || c1874f2 == null || boolValueOf == null) {
                c1094Zd = c1094Zd2;
            } else {
                InterfaceC1876g0 interfaceC1876g0Mo3633s = interfaceC1895i0Mo3717k.mo3633s(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", c1874f2, EnumC1930n0.SENTRY, c1094Zd2);
                interfaceC1895i0Mo3717k = interfaceC1895i0Mo3717k;
                c1094Zd = c1094Zd2;
                this.f5926j = interfaceC1876g0Mo3633s;
                m3801d();
            }
            String strConcat = simpleName.concat(" initial display");
            EnumC1930n0 enumC1930n0 = EnumC1930n0.SENTRY;
            AbstractC1588H1 abstractC1588H12 = abstractC1588H1;
            InterfaceC1876g0 interfaceC1876g0Mo3633s2 = interfaceC1895i0Mo3717k.mo3633s("ui.load.initial_display", strConcat, abstractC1588H12, enumC1930n0, c1094Zd);
            weakHashMap2.put(activity, interfaceC1876g0Mo3633s2);
            if (!this.f5922f || this.f5925i == null || this.f5920d == null) {
                interfaceC1895i0 = interfaceC1895i0Mo3717k;
            } else {
                InterfaceC1876g0 interfaceC1876g0Mo3633s3 = interfaceC1895i0Mo3717k.mo3633s("ui.load.full_display", simpleName.concat(" full display"), abstractC1588H12, enumC1930n0, c1094Zd);
                interfaceC1895i0 = interfaceC1895i0Mo3717k;
                try {
                    weakHashMap.put(activity, interfaceC1876g0Mo3633s3);
                    this.f5931o = this.f5920d.getExecutorService().mo3703q(new RunnableC2260n3(this, interfaceC1876g0Mo3633s3, interfaceC1876g0Mo3633s2), 25000L);
                } catch (RejectedExecutionException e) {
                    this.f5920d.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            this.f5919c.mo3719m(new C0698Q9(6, this, interfaceC1895i0));
            weakHashMap3.put(activity, interfaceC1895i0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1582G c1582g;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f5923g) {
            onActivityPreCreated(activity, bundle);
        }
        C1981r c1981rM4173a = this.f5934r.m4173a();
        try {
            if (this.f5919c != null && (sentryAndroidOptions = this.f5920d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f5919c.mo3719m(new C1597J2(AbstractC1856a.m4066l(activity), 1));
            }
            m3804o(activity);
            InterfaceC1876g0 interfaceC1876g0 = (InterfaceC1876g0) this.f5927k.get(activity);
            InterfaceC1876g0 interfaceC1876g02 = (InterfaceC1876g0) this.f5928l.get(activity);
            this.f5924h = true;
            if (this.f5921e && interfaceC1876g0 != null && interfaceC1876g02 != null && (c1582g = this.f5925i) != null) {
                c1582g.f5713a.add(new C2438r1(24));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.f5928l;
        WeakHashMap weakHashMap2 = this.f5927k;
        WeakHashMap weakHashMap3 = this.f5929m;
        C1981r c1981rM4173a = this.f5934r.m4173a();
        try {
            C1736b c1736b = (C1736b) weakHashMap3.remove(activity);
            if (c1736b != null) {
                InterfaceC1876g0 interfaceC1876g0 = c1736b.f6297d;
                if (interfaceC1876g0 != null && !interfaceC1876g0.mo3620f()) {
                    c1736b.f6297d.mo3628n(EnumC1605L2.CANCELLED);
                }
                c1736b.f6297d = null;
                InterfaceC1876g0 interfaceC1876g02 = c1736b.f6298e;
                if (interfaceC1876g02 != null && !interfaceC1876g02.mo3620f()) {
                    c1736b.f6298e.mo3628n(EnumC1605L2.CANCELLED);
                }
                c1736b.f6298e = null;
            }
            boolean z = this.f5921e;
            WeakHashMap weakHashMap4 = this.f5932p;
            if (z) {
                InterfaceC1876g0 interfaceC1876g03 = this.f5926j;
                EnumC1605L2 enumC1605L2 = EnumC1605L2.CANCELLED;
                if (interfaceC1876g03 != null && !interfaceC1876g03.mo3620f()) {
                    interfaceC1876g03.mo3628n(enumC1605L2);
                }
                InterfaceC1876g0 interfaceC1876g04 = (InterfaceC1876g0) weakHashMap2.get(activity);
                InterfaceC1876g0 interfaceC1876g05 = (InterfaceC1876g0) weakHashMap.get(activity);
                EnumC1605L2 enumC1605L22 = EnumC1605L2.DEADLINE_EXCEEDED;
                if (interfaceC1876g04 != null && !interfaceC1876g04.mo3620f()) {
                    interfaceC1876g04.mo3628n(enumC1605L22);
                }
                m3799f(interfaceC1876g05, interfaceC1876g04);
                Future future = this.f5931o;
                if (future != null) {
                    future.cancel(false);
                    this.f5931o = null;
                }
                if (this.f5921e) {
                    m3802l((InterfaceC1895i0) weakHashMap4.get(activity), null, null);
                }
                this.f5926j = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.f5924h = false;
                this.f5930n = new C1878g2(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1981r c1981rM4173a = this.f5934r.m4173a();
        try {
            if (!this.f5923g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        C1736b c1736b = (C1736b) this.f5929m.get(activity);
        if (c1736b != null) {
            InterfaceC1876g0 interfaceC1876g0 = this.f5926j;
            if (interfaceC1876g0 == null) {
                interfaceC1876g0 = (InterfaceC1876g0) this.f5932p.get(activity);
            }
            if (c1736b.f6295b == null || interfaceC1876g0 == null) {
                return;
            }
            InterfaceC1876g0 interfaceC1876g0M3913a = C1736b.m3913a(interfaceC1876g0, c1736b.f6294a.concat(".onCreate"), c1736b.f6295b);
            c1736b.f6297d = interfaceC1876g0M3913a;
            interfaceC1876g0M3913a.mo3632r();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        C1736b c1736b = (C1736b) this.f5929m.get(activity);
        if (c1736b != null) {
            InterfaceC1876g0 interfaceC1876g0 = this.f5926j;
            if (interfaceC1876g0 == null) {
                interfaceC1876g0 = (InterfaceC1876g0) this.f5932p.get(activity);
            }
            if (c1736b.f6296c != null && interfaceC1876g0 != null) {
                InterfaceC1876g0 interfaceC1876g0M3913a = C1736b.m3913a(interfaceC1876g0, c1736b.f6294a.concat(".onStart"), c1736b.f6296c);
                c1736b.f6298e = interfaceC1876g0M3913a;
                interfaceC1876g0M3913a.mo3632r();
            }
            InterfaceC1876g0 interfaceC1876g02 = c1736b.f6297d;
            if (interfaceC1876g02 == null || c1736b.f6298e == null) {
                return;
            }
            AbstractC1588H1 abstractC1588H1Mo3630p = interfaceC1876g02.mo3630p();
            AbstractC1588H1 abstractC1588H1Mo3630p2 = c1736b.f6298e.mo3630p();
            if (abstractC1588H1Mo3630p == null || abstractC1588H1Mo3630p2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            AbstractC1700i.f6159a.getClass();
            C1878g2 c1878g2 = new C1878g2();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(c1878g2.mo3670b(c1736b.f6297d.mo3635u()));
            long millis2 = timeUnit.toMillis(c1878g2.mo3670b(abstractC1588H1Mo3630p));
            long millis3 = timeUnit.toMillis(c1878g2.mo3670b(c1736b.f6298e.mo3635u()));
            long millis4 = timeUnit.toMillis(c1878g2.mo3670b(abstractC1588H1Mo3630p2));
            C1737c c1737c = new C1737c();
            String strMo3623i = c1736b.f6297d.mo3623i();
            long millis5 = timeUnit.toMillis(c1736b.f6297d.mo3635u().mo3672d());
            C1741g c1741g = c1737c.f6299a;
            c1741g.f6320a = strMo3623i;
            c1741g.f6321b = millis5;
            c1741g.f6322c = jUptimeMillis - millis;
            c1741g.f6323d = jUptimeMillis - millis2;
            String strMo3623i2 = c1736b.f6298e.mo3623i();
            long millis6 = timeUnit.toMillis(c1736b.f6298e.mo3635u().mo3672d());
            C1741g c1741g2 = c1737c.f6300b;
            c1741g2.f6320a = strMo3623i2;
            c1741g2.f6321b = millis6;
            c1741g2.f6322c = jUptimeMillis - millis3;
            c1741g2.f6323d = jUptimeMillis - millis4;
            C1740f.m3914b().f6312g.add(c1737c);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1588H1 c1878g2;
        C1736b c1736b = new C1736b(activity.getClass().getName());
        this.f5929m.put(activity, c1736b);
        if (this.f5924h) {
            return;
        }
        C2054w1 c2054w1 = this.f5919c;
        if (c2054w1 != null) {
            c1878g2 = c2054w1.mo3718l().getDateProvider().mo3603a();
        } else {
            AbstractC1700i.f6159a.getClass();
            c1878g2 = new C1878g2();
        }
        this.f5930n = c1878g2;
        c1736b.f6295b = c1878g2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        AbstractC1588H1 c1878g2;
        this.f5924h = true;
        C2054w1 c2054w1 = this.f5919c;
        if (c2054w1 != null) {
            c1878g2 = c2054w1.mo3718l().getDateProvider().mo3603a();
        } else {
            AbstractC1700i.f6159a.getClass();
            c1878g2 = new C1878g2();
        }
        this.f5930n = c1878g2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        AbstractC1588H1 c1878g2;
        C1736b c1736b = (C1736b) this.f5929m.get(activity);
        if (c1736b != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f5920d;
            if (sentryAndroidOptions != null) {
                c1878g2 = sentryAndroidOptions.getDateProvider().mo3603a();
            } else {
                AbstractC1700i.f6159a.getClass();
                c1878g2 = new C1878g2();
            }
            c1736b.f6296c = c1878g2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1981r c1981rM4173a = this.f5934r.m4173a();
        try {
            if (!this.f5923g) {
                onActivityPostStarted(activity);
            }
            if (this.f5921e) {
                final InterfaceC1876g0 interfaceC1876g0 = (InterfaceC1876g0) this.f5927k.get(activity);
                final InterfaceC1876g0 interfaceC1876g02 = (InterfaceC1876g0) this.f5928l.get(activity);
                if (activity.getWindow() != null) {
                    final int i = 0;
                    ViewTreeObserverOnDrawListenerC1720h.m3905a(activity, new Runnable(this) { // from class: io.sentry.android.core.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ActivityLifecycleIntegration f6097b;

                        {
                            this.f6097b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.f6097b.m3803m(interfaceC1876g02, interfaceC1876g0);
                                    break;
                                default:
                                    this.f6097b.m3803m(interfaceC1876g02, interfaceC1876g0);
                                    break;
                            }
                        }
                    }, this.f5918b);
                } else {
                    final int i2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ActivityLifecycleIntegration f6097b;

                        {
                            this.f6097b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f6097b.m3803m(interfaceC1876g02, interfaceC1876g0);
                                    break;
                                default:
                                    this.f6097b.m3803m(interfaceC1876g02, interfaceC1876g0);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C1981r c1981rM4173a = this.f5934r.m4173a();
        try {
            if (!this.f5923g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f5921e) {
                this.f5933q.m528a(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f5920d = sentryAndroidOptions;
        this.f5919c = C2054w1.f7276a;
        this.f5921e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f5925i = this.f5920d.getFullyDisplayedReporter();
        this.f5922f = this.f5920d.isEnableTimeToFullDisplayTracing();
        this.f5917a.registerActivityLifecycleCallbacks(this);
        this.f5920d.getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("ActivityLifecycle");
    }
}
