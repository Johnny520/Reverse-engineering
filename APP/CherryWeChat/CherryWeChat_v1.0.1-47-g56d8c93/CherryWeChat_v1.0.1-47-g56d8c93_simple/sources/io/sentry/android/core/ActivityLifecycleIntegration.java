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

    /* JADX INFO: renamed from: e */
    public boolean f5921e;

    /* JADX INFO: renamed from: f */
    public boolean f5922f;

    /* JADX INFO: renamed from: g */
    public final boolean f5923g;

    /* JADX INFO: renamed from: h */
    public boolean f5924h;

    /* JADX INFO: renamed from: i */
    public C1582G f5925i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1876g0 f5926j;

    /* JADX INFO: renamed from: k */
    public final WeakHashMap f5927k;

    /* JADX INFO: renamed from: l */
    public final WeakHashMap f5928l;

    /* JADX INFO: renamed from: m */
    public final WeakHashMap f5929m;

    /* JADX INFO: renamed from: n */
    public AbstractC1588H1 f5930n;

    /* JADX INFO: renamed from: o */
    public Future f5931o;

    /* JADX INFO: renamed from: p */
    public final WeakHashMap f5932p;

    /* JADX INFO: renamed from: q */
    public final C0252Fu f5933q;

    /* JADX INFO: renamed from: r */
    public final C2029a f5934r;

    /* JADX INFO: renamed from: s */
    public final C2029a f5935s;

    public ActivityLifecycleIntegration(Application r6, C1666I r7, C0252Fu r8) {
        this.f5921e = false;
        this.f5922f = false;
        this.f5924h = false;
        this.f5925i = null;
        this.f5927k = new WeakHashMap();
        this.f5928l = new WeakHashMap();
        this.f5929m = new WeakHashMap();
        this.f5930n = new C1878g2(new Date(0), 0);
        this.f5931o = null;
        this.f5932p = new WeakHashMap();
        this.f5934r = new C2029a();
        this.f5935s = new C2029a();
        this.f5917a = r6;
        this.f5918b = r7;
        this.f5933q = r8;
        if (Build.VERSION.SDK_INT < 29) goto L6;
        this.f5923g = true;
        return;
    }

    /* JADX INFO: renamed from: f */
    public static void m3799f(InterfaceC1876g0 r3, InterfaceC1876g0 r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.mo3620f() == true) goto L22;
        String r0 = r3.mo3623i();
        if (r0 != null) goto L9;
    L11:
        r0 = r3.mo3623i() + " - Deadline Exceeded";
    L12:
        r3.mo3617c(r0);
        if (r4 == null) goto L15;
        AbstractC1588H1 r42 = r4.mo3630p();
    L16:
        if (r42 != null) goto L19;
        r42 = r3.mo3635u();
    L19:
        m3800i(r3, r42, EnumC1605L2.DEADLINE_EXCEEDED);
        return;
    L15:
        r42 = null;
        goto L16
    L9:
        if (r0.endsWith(" - Deadline Exceeded") == false) goto L11;
    }

    /* JADX INFO: renamed from: i */
    public static void m3800i(InterfaceC1876g0 r1, AbstractC1588H1 r2, EnumC1605L2 r3) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (r1.mo3620f() == true) goto L14;
        if (r3 == null) goto L8;
    L11:
        r1.mo3631q(r3, r2);
        return;
    L8:
        if (r1.mo3629o() == null) goto L10;
        r3 = r1.mo3629o();
        goto L11
    L10:
        r3 = EnumC1605L2.f5786OK;
        goto L11
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5917a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions r0 = this.f5920d;
        if (r0 == null) goto L5;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
    L5:
        C0252Fu r02 = this.f5933q;
        C1981r r1 = ((C2029a) r02.f824f).m4173a();
    L9:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L16
    L18:
        throw th;
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L7:
        if (r02.m531h() == false) goto L11;
        r02.m532i(new RunnableC1631S1(2, r02), "FrameMetricsAggregator.stop");     // Catch: Throwable -> L9
        C0584Ni r2 = ((FrameMetricsAggregator) r02.f819a).f3910a;     // Catch: Throwable -> L9
        Object r3 = r2.f1893b;     // Catch: Throwable -> L9
        r2.f1893b = new SparseIntArray[9];     // Catch: Throwable -> L9
    L11:
        ((ConcurrentHashMap) r02.f821c).clear();     // Catch: Throwable -> L9
        r1.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m3801d() {
        C1741g r0 = C1740f.m3914b().m3915a(this.f5920d);
        long r3 = 0;
        if (r0.f6323d != 0) goto L5;
        C1874f2 r1 = null;
    L10:
        if (this.f5921e == false) goto L14;
        if (r1 == null) goto L15;
        m3800i(this.f5926j, r1, null);
        return;
    L15:
        return;
    L14:
        return;
    L5:
        if (r0.m3919b() == false) goto L7;
        r3 = r0.f6321b + r0.m3918a();
    L7:
        r1 = new C1874f2(r3 * 1000000);
        goto L10
    }

    /* JADX INFO: renamed from: l */
    public final void m3802l(InterfaceC1895i0 r3, InterfaceC1876g0 r4, InterfaceC1876g0 r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.mo3620f() == true) goto L23;
        EnumC1605L2 r0 = EnumC1605L2.DEADLINE_EXCEEDED;
        if (r4 != null) goto L9;
    L11:
        m3799f(r5, r4);
        Future r42 = this.f5931o;
        if (r42 == null) goto L14;
        r42.cancel(false);
        this.f5931o = null;
    L14:
        EnumC1605L2 r43 = r3.mo3629o();
        if (r43 != null) goto L17;
        r43 = EnumC1605L2.f5786OK;
    L17:
        r3.mo3628n(r43);
        C2054w1 r44 = this.f5919c;
        if (r44 == null) goto L22;
        r44.mo3719m(new C2464rl(this, r3));
        return;
    L22:
        return;
    L9:
        if (r4.mo3620f() == true) goto L11;
        r4.mo3628n(r0);
        goto L11
    }

    /* JADX INFO: renamed from: m */
    public final void m3803m(InterfaceC1876g0 r7, InterfaceC1876g0 r8) {
        C1740f r72 = C1740f.m3914b();
        C1741g r0 = r72.f6308c;
        C1741g r73 = r72.f6309d;
        if (r0.m3919b() == false) goto L8;
        if (r0.f6323d != 0) goto L8;
        r0.f6323d = SystemClock.uptimeMillis();
    L8:
        if (r73.m3919b() == true) goto L10;
    L12:
        m3801d();
        C1981r r74 = this.f5935s.m4173a();
        SentryAndroidOptions r02 = this.f5920d;     // Catch: Throwable -> L17
        if (r02 == null) goto L19;
        if (r8 == null) goto L19;
        AbstractC1588H1 r03 = r02.getDateProvider().mo3603a();     // Catch: Throwable -> L17
        long r1 = r03.mo3670b(r8.mo3635u());     // Catch: Throwable -> L17
        r8.mo3626l("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(r1)), EnumC1579F0.MILLISECOND);     // Catch: Throwable -> L17
        m3800i(r8, r03, null);     // Catch: Throwable -> L17
    L23:
        r74.close();
        return;
    L19:
        if (r8 == null) goto L23;
        if (r8.mo3620f() == true) goto L23;
        r8.mo3632r();     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r74.close();     // Catch: Throwable -> L27
    L29:
        throw th;
    L27:
        th = move-exception;
        th.addSuppressed(th);
        goto L29
    L10:
        if (r73.f6323d != 0) goto L12;
        r73.f6323d = SystemClock.uptimeMillis();
        goto L12
    }

    /* JADX INFO: renamed from: o */
    public final void m3804o(Activity r23) {
        WeakReference r0 = new WeakReference(r23);
        if (this.f5919c == null) goto L79;
        WeakHashMap r3 = this.f5932p;
        if (r3.containsKey(r23) == false) goto L7;
        return;
    L7:
        if (this.f5921e == true) goto L12;
        r3.put(r23, C1643W0.f5888a);
        if (this.f5920d.isEnableAutoTraceIdGeneration() == false) goto L81;
        this.f5919c.mo3719m(new C1676T(5));
        return;
    L81:
        return;
    L12:
        Iterator r4 = r3.entrySet().iterator();
    L13:
        boolean r5 = r4.hasNext();
        WeakHashMap r6 = this.f5928l;
        WeakHashMap r7 = this.f5927k;
        if (r5 == false) goto L16;
        Map.Entry r52 = (Map.Entry) r4.next();
        m3802l((InterfaceC1895i0) r52.getValue(), (InterfaceC1876g0) r7.get(r52.getKey()), (InterfaceC1876g0) r6.get(r52.getKey()));
        goto L13
    L16:
        String r42 = r23.getClass().getSimpleName();
        C1741g r53 = C1740f.m3914b().m3915a(this.f5920d);
        boolean r9 = false;
        C2648vx r11 = null;
        if (AbstractC1665H.m3826d() == true) goto L19;
    L29:
        Boolean r54 = null;
        C1874f2 r15 = null;
    L30:
        C1625Q2 r8 = new C1625Q2();
        long r12 = this.f5920d.getDeadlineTimeout();
        if (r12 > 0) goto L33;
        Long r122 = null;
    L34:
        r8.f5842h = r122;
        if (this.f5920d.isEnableActivityLifecycleTracingAutoFinish() == false) goto L37;
        r8.f5841g = this.f5920d.getIdleTimeout();
        r8.f3477a = true;
    L37:
        r8.f5840f = true;
        r8.f5843i = new C1692e(this, r0, r42);
        if (this.f5924h == true) goto L42;
        if (r15 == null) goto L42;
        if (r54 == null) goto L42;
        C2648vx r02 = C1740f.m3914b().f6315j;
        C1740f.m3914b().f6315j = null;
        r11 = r02;
        AbstractC1588H1 r03 = r15;
    L43:
        r8.f3478b = r03;
        if (r11 == null) goto L46;
        r9 = true;
    L46:
        r8.f5839e = r9;
        r8.f3480d = "auto.ui.activity";
        InterfaceC1895i0 r16 = this.f5919c.mo3717k(new C1621P2(r42, EnumC1946C.COMPONENT, "ui.load", r11), r8);
        C1094Zd r82 = new C1094Zd();
        r82.f3480d = "auto.ui.activity";
        if (this.f5924h == true) goto L61;
        if (r15 == null) goto L61;
        if (r54 == null) goto L61;
        if (r54.booleanValue() == false) goto L54;
        String r92 = "app.start.cold";
    L53:
        String r13 = r92;
        if (r54.booleanValue() == false) goto L59;
        String r55 = "Cold Start";
    L60:
        InterfaceC1876g0 r56 = r16.mo3633s(r13, r55, r15, EnumC1930n0.SENTRY, r82);
        r16 = r16;
        C1094Zd r21 = r82;
        this.f5926j = r56;
        m3801d();
    L62:
        String r18 = r42.concat(" initial display");
        EnumC1930n0 r20 = EnumC1930n0.SENTRY;
        AbstractC1588H1 r19 = r03;
        InterfaceC1876g0 r04 = r16.mo3633s("ui.load.initial_display", r18, r19, r20, r21);
        r7.put(r23, r04);
        if (this.f5922f == true) goto L65;
    L73:
        InterfaceC1895i0 r123 = r16;
    L74:
        this.f5919c.mo3719m(new C0698Q9(6, this, r123));
        r3.put(r23, r123);
        return;
    L65:
        if (this.f5925i == null) goto L73;
        if (this.f5920d == null) goto L73;
        InterfaceC1876g0 r43 = r16.mo3633s("ui.load.full_display", r42.concat(" full display"), r19, r20, r21);
        r123 = r16;
        r6.put(r23, r43);     // Catch: RejectedExecutionException -> L71
        this.f5931o = this.f5920d.getExecutorService().mo3703q(new RunnableC2260n3(this, r43, r04), 25000);     // Catch: RejectedExecutionException -> L71
    L71:
        e = move-exception;
        this.f5920d.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
        goto L74
    L59:
        r55 = "Warm Start";
        goto L60
    L54:
        r92 = "app.start.warm";
    L61:
        r21 = r82;
    L42:
        r03 = this.f5930n;
        goto L43
    L33:
        r122 = Long.valueOf(r12);
        goto L34
    L19:
        if (r53.m3919b() == false) goto L29;
        if (r53.m3919b() == false) goto L23;
        C1874f2 r83 = new C1874f2(r53.f6321b * 1000000);
    L25:
        if (C1740f.m3914b().f6306a != EnumC1739e.COLD) goto L27;
        boolean r57 = true;
    L28:
        r54 = Boolean.valueOf(r57);
        r15 = r83;
        goto L30
    L27:
        r57 = false;
        goto L28
    L23:
        r83 = null;
        goto L25
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r5, Bundle r6) {
        if (this.f5923g == true) goto L5;
        onActivityPreCreated(r5, r6);
    L5:
        C1981r r62 = this.f5934r.m4173a();
    L13:
        th = move-exception;
        r62.close();     // Catch: Throwable -> L26
    L28:
        throw th;
    L26:
        th = move-exception;
        th.addSuppressed(th);
        goto L28
    L7:
        if (this.f5919c == null) goto L15;
        SentryAndroidOptions r0 = this.f5920d;     // Catch: Throwable -> L13
        if (r0 == null) goto L15;
        if (r0.isEnableScreenTracking() == false) goto L15;
        String r02 = AbstractC1856a.m4066l(r5);     // Catch: Throwable -> L13
        this.f5919c.mo3719m(new C1597J2(r02, 1));     // Catch: Throwable -> L13
    L15:
        m3804o(r5);     // Catch: Throwable -> L13
        InterfaceC1876g0 r03 = (InterfaceC1876g0) this.f5927k.get(r5);     // Catch: Throwable -> L13
        InterfaceC1876g0 r52 = (InterfaceC1876g0) this.f5928l.get(r5);     // Catch: Throwable -> L13
        this.f5924h = true;     // Catch: Throwable -> L13
        if (this.f5921e == false) goto L22;
        if (r03 == null) goto L22;
        if (r52 == null) goto L22;
        C1582G r53 = this.f5925i;     // Catch: Throwable -> L13
        if (r53 == null) goto L22;
        C2438r1 r04 = new C2438r1(24);     // Catch: Throwable -> L13
        r53.f5713a.add(r04);     // Catch: Throwable -> L13
    L22:
        r62.close();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r12) {
        WeakHashMap r0 = this.f5928l;
        WeakHashMap r1 = this.f5927k;
        WeakHashMap r2 = this.f5929m;
        C1981r r3 = this.f5934r.m4173a();
        C1736b r4 = (C1736b) r2.remove(r12);     // Catch: Throwable -> L36
        if (r4 == null) goto L16;
        InterfaceC1876g0 r6 = r4.f6297d;     // Catch: Throwable -> L36
        if (r6 != null) goto L8;
    L10:
        r4.f6297d = null;     // Catch: Throwable -> L36
        InterfaceC1876g0 r62 = r4.f6298e;     // Catch: Throwable -> L36
        if (r62 != null) goto L13;
    L15:
        r4.f6298e = null;     // Catch: Throwable -> L36
        goto L16
    L13:
        if (r62.mo3620f() == true) goto L15;
        r4.f6298e.mo3628n(EnumC1605L2.CANCELLED);     // Catch: Throwable -> L36
        goto L15
    L8:
        if (r6.mo3620f() == true) goto L10;
        r4.f6297d.mo3628n(EnumC1605L2.CANCELLED);     // Catch: Throwable -> L36
    L16:
        boolean r42 = this.f5921e;     // Catch: Throwable -> L36
        WeakHashMap r7 = this.f5932p;
        if (r42 == false) goto L38;
        InterfaceC1876g0 r43 = this.f5926j;     // Catch: Throwable -> L36
        EnumC1605L2 r8 = EnumC1605L2.CANCELLED;     // Catch: Throwable -> L36
        if (r43 != null) goto L22;
    L24:
        InterfaceC1876g0 r44 = (InterfaceC1876g0) r1.get(r12);     // Catch: Throwable -> L36
        InterfaceC1876g0 r82 = (InterfaceC1876g0) r0.get(r12);     // Catch: Throwable -> L36
        EnumC1605L2 r9 = EnumC1605L2.DEADLINE_EXCEEDED;     // Catch: Throwable -> L36
        if (r44 != null) goto L27;
    L29:
        m3799f(r82, r44);     // Catch: Throwable -> L36
        Future r45 = this.f5931o;     // Catch: Throwable -> L36
        if (r45 == null) goto L33;
        r45.cancel(false);     // Catch: Throwable -> L36
        this.f5931o = null;     // Catch: Throwable -> L36
    L33:
        if (this.f5921e == false) goto L35;
        m3802l((InterfaceC1895i0) r7.get(r12), null, null);     // Catch: Throwable -> L36
    L35:
        this.f5926j = null;     // Catch: Throwable -> L36
        r1.remove(r12);     // Catch: Throwable -> L36
        r0.remove(r12);     // Catch: Throwable -> L36
        goto L38
    L27:
        if (r44.mo3620f() == true) goto L29;
        r44.mo3628n(r9);     // Catch: Throwable -> L36
        goto L29
    L22:
        if (r43.mo3620f() == true) goto L24;
        r43.mo3628n(r8);     // Catch: Throwable -> L36
    L38:
        r7.remove(r12);     // Catch: Throwable -> L36
        if (r7.isEmpty() == true) goto L41;
    L43:
        r3.close();
        return;
    L41:
        if (r12.isChangingConfigurations() == true) goto L43;
        this.f5924h = false;     // Catch: Throwable -> L36
        this.f5930n = new C1878g2(new Date(0), 0);     // Catch: Throwable -> L36
        r2.clear();     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L47
    L49:
        throw th;
    L47:
        th = move-exception;
        th.addSuppressed(th);
        goto L49
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r3) {
        C1981r r0 = this.f5934r.m4173a();
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L4:
        if (this.f5923g == true) goto L9;
        onActivityPrePaused(r3);     // Catch: Throwable -> L7
    L9:
        r0.close();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity r3, Bundle r4) {
        C1736b r42 = (C1736b) this.f5929m.get(r3);
        if (r42 == null) goto L13;
        InterfaceC1876g0 r0 = this.f5926j;
        if (r0 != null) goto L9;
        r0 = (InterfaceC1876g0) this.f5932p.get(r3);
    L9:
        if (r42.f6295b == null) goto L14;
        if (r0 == null) goto L15;
        InterfaceC1876g0 r32 = C1736b.m3913a(r0, r42.f6294a.concat(".onCreate"), r42.f6295b);
        r42.f6297d = r32;
        r32.mo3632r();
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity r19) {
        C1736b r2 = (C1736b) this.f5929m.get(r19);
        if (r2 == null) goto L23;
        InterfaceC1876g0 r3 = this.f5926j;
        if (r3 != null) goto L9;
        r3 = (InterfaceC1876g0) this.f5932p.get(r19);
    L9:
        if (r2.f6296c == null) goto L12;
        if (r3 == null) goto L12;
        InterfaceC1876g0 r1 = C1736b.m3913a(r3, r2.f6294a.concat(".onStart"), r2.f6296c);
        r2.f6298e = r1;
        r1.mo3632r();
    L12:
        InterfaceC1876g0 r12 = r2.f6297d;
        if (r12 != null) goto L15;
        return;
    L15:
        if (r2.f6298e == null) goto L26;
        AbstractC1588H1 r13 = r12.mo3630p();
        AbstractC1588H1 r32 = r2.f6298e.mo3630p();
        if (r13 == null) goto L25;
        if (r32 == null) goto L27;
        long r4 = SystemClock.uptimeMillis();
        AbstractC1700i.f6159a.getClass();
        C1878g2 r6 = new C1878g2();
        TimeUnit r7 = TimeUnit.NANOSECONDS;
        long r8 = r7.toMillis(r6.mo3670b(r2.f6297d.mo3635u()));
        long r10 = r7.toMillis(r6.mo3670b(r13));
        long r122 = r7.toMillis(r6.mo3670b(r2.f6298e.mo3635u()));
        long r14 = r7.toMillis(r6.mo3670b(r32));
        C1737c r15 = new C1737c();
        String r33 = r2.f6297d.mo3623i();
        long r42 = r7.toMillis(r2.f6297d.mo3635u().mo3672d());
        C1741g r62 = r15.f6299a;
        r62.f6320a = r33;
        r62.f6321b = r42;
        r62.f6322c = r4 - r8;
        r62.f6323d = r4 - r10;
        String r34 = r2.f6298e.mo3623i();
        long r43 = r7.toMillis(r2.f6298e.mo3635u().mo3672d());
        C1741g r22 = r15.f6300b;
        r22.f6320a = r34;
        r22.f6321b = r43;
        r22.f6322c = r4 - r122;
        r22.f6323d = r4 - r14;
        C1740f.m3914b().f6312g.add(r15);
        return;
    L27:
        return;
    L25:
        return;
    L26:
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity r2, Bundle r3) {
        C1736b r32 = new C1736b(r2.getClass().getName());
        this.f5929m.put(r2, r32);
        if (this.f5924h == false) goto L5;
        return;
    L5:
        C2054w1 r22 = this.f5919c;
        if (r22 == null) goto L8;
        AbstractC1588H1 r23 = r22.mo3718l().getDateProvider().mo3603a();
    L9:
        this.f5930n = r23;
        r32.f6295b = r23;
        return;
    L8:
        AbstractC1700i.f6159a.getClass();
        r23 = new C1878g2();
        goto L9
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity r1) {
        this.f5924h = true;
        C2054w1 r12 = this.f5919c;
        if (r12 == null) goto L5;
        AbstractC1588H1 r13 = r12.mo3718l().getDateProvider().mo3603a();
    L6:
        this.f5930n = r13;
        return;
    L5:
        AbstractC1700i.f6159a.getClass();
        r13 = new C1878g2();
        goto L6
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity r2) {
        C1736b r22 = (C1736b) this.f5929m.get(r2);
        if (r22 == null) goto L10;
        SentryAndroidOptions r0 = this.f5920d;
        if (r0 == null) goto L7;
        AbstractC1588H1 r02 = r0.getDateProvider().mo3603a();
    L8:
        r22.f6296c = r02;
        return;
    L7:
        AbstractC1700i.f6159a.getClass();
        r02 = new C1878g2();
        goto L8
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r6) {
        C1981r r0 = this.f5934r.m4173a();
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L18
    L20:
        throw th;
    L18:
        th = move-exception;
        th.addSuppressed(th);
        goto L20
    L4:
        if (this.f5923g == true) goto L9;
        onActivityPostStarted(r6);     // Catch: Throwable -> L6
    L9:
        if (this.f5921e == false) goto L14;
        final InterfaceC1876g0 r1 = (InterfaceC1876g0) this.f5927k.get(r6);     // Catch: Throwable -> L6
        final InterfaceC1876g0 r2 = (InterfaceC1876g0) this.f5928l.get(r6);     // Catch: Throwable -> L6
        if (r6.getWindow() == null) goto L13;
        final int r4 = 0;
        ViewTreeObserverOnDrawListenerC1720h.m3905a(r6, new RunnableC1690d(this, r2, r1, r4), this.f5918b);     // Catch: Throwable -> L6
        goto L14
    L13:
        final int r42 = 1;
        new Handler(Looper.getMainLooper()).post(new RunnableC1690d(this, r2, r1, r42));     // Catch: Throwable -> L6
    L14:
        r0.close();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r3) {
        C1981r r0 = this.f5934r.m4173a();
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    L4:
        if (this.f5923g == true) goto L9;
        onActivityPostCreated(r3, null);     // Catch: Throwable -> L6
        onActivityPreStarted(r3);     // Catch: Throwable -> L6
    L9:
        if (this.f5921e == false) goto L11;
        this.f5933q.m528a(r3);     // Catch: Throwable -> L6
    L11:
        r0.close();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r4) {
        if ((r4 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r42 = (SentryAndroidOptions) r4;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r42);
        this.f5920d = r42;
        this.f5919c = C2054w1.f7276a;
        if (r42.isTracingEnabled() == true) goto L9;
    L11:
        boolean r43 = false;
    L12:
        this.f5921e = r43;
        this.f5925i = this.f5920d.getFullyDisplayedReporter();
        this.f5922f = this.f5920d.isEnableTimeToFullDisplayTracing();
        this.f5917a.registerActivityLifecycleCallbacks(this);
        this.f5920d.getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("ActivityLifecycle");
        return;
    L9:
        if (r42.isEnableAutoActivityLifecycleTracing() == false) goto L11;
        r43 = true;
        goto L12
    L5:
        r42 = null;
        goto L6
    }
}
