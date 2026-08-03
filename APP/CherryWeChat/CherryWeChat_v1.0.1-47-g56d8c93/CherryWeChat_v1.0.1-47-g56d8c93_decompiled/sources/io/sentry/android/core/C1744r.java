package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC2066z1;
import io.sentry.C1573D2;
import io.sentry.C1881h1;
import io.sentry.C1896i1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.CallableC1590I;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1911j0;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000.C0118Cp;

/* JADX INFO: renamed from: io.sentry.android.core.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1744r implements InterfaceC1911j0 {

    /* JADX INFO: renamed from: a */
    public final Context f6328a;

    /* JADX INFO: renamed from: b */
    public final ILogger f6329b;

    /* JADX INFO: renamed from: c */
    public final String f6330c;

    /* JADX INFO: renamed from: d */
    public final boolean f6331d;

    /* JADX INFO: renamed from: e */
    public final int f6332e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1833c0 f6333f;

    /* JADX INFO: renamed from: g */
    public final C1666I f6334g;

    /* JADX INFO: renamed from: j */
    public final C1727o f6337j;

    /* JADX INFO: renamed from: k */
    public C1896i1 f6338k;

    /* JADX INFO: renamed from: m */
    public long f6340m;

    /* JADX INFO: renamed from: n */
    public long f6341n;

    /* JADX INFO: renamed from: o */
    public Date f6342o;

    /* JADX INFO: renamed from: h */
    public boolean f6335h = false;

    /* JADX INFO: renamed from: i */
    public int f6336i = 0;

    /* JADX INFO: renamed from: l */
    public C1734p f6339l = null;

    /* JADX INFO: renamed from: p */
    public final C2029a f6343p = new C2029a();

    public C1744r(Context context, C1666I c1666i, C1727o c1727o, ILogger iLogger, String str, boolean z, int i, InterfaceC1833c0 interfaceC1833c0) {
        Context applicationContext = context.getApplicationContext();
        this.f6328a = applicationContext != null ? applicationContext : context;
        AbstractC1856a.m4048D("ILogger is required", iLogger);
        this.f6329b = iLogger;
        this.f6337j = c1727o;
        AbstractC1856a.m4048D("The BuildInfoProvider is required.", c1666i);
        this.f6334g = c1666i;
        this.f6330c = str;
        this.f6331d = z;
        this.f6332e = i;
        AbstractC1856a.m4048D("The ISentryExecutorService is required.", interfaceC1833c0);
        this.f6333f = interfaceC1833c0;
        this.f6342o = AbstractC1856a.m4067m();
    }

    /* JADX INFO: renamed from: a */
    public final void m3921a() {
        if (this.f6335h) {
            return;
        }
        this.f6335h = true;
        boolean z = this.f6331d;
        ILogger iLogger = this.f6329b;
        if (!z) {
            iLogger.mo3680e(EnumC1657a2.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f6330c;
        if (str == null) {
            iLogger.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.f6332e;
        if (i <= 0) {
            iLogger.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
            return;
        }
        this.f6339l = new C1734p(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.f6337j, this.f6333f, this.f6329b);
    }

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: b */
    public final C1881h1 mo3691b(C1573D2 c1573d2, List list, C2046v2 c2046v2) {
        C1981r c1981rM4173a = this.f6343p.m4173a();
        try {
            C1881h1 c1881h1M3922c = m3922c(c1573d2.f5632e, c1573d2.f5628a.toString(), c1573d2.f5629b.f5719c.f5738a.toString(), false, list, c2046v2);
            c1981rM4173a.close();
            return c1881h1M3922c;
        } finally {
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1881h1 m3922c(String str, String str2, String str3, boolean z, List list, C2046v2 c2046v2) {
        C1666I c1666i = this.f6334g;
        C1981r c1981rM4173a = this.f6343p.m4173a();
        try {
            if (this.f6339l == null) {
                c1981rM4173a.close();
                return null;
            }
            c1666i.getClass();
            C1896i1 c1896i1 = this.f6338k;
            ILogger iLogger = this.f6329b;
            if (c1896i1 != null && c1896i1.f6765a.equals(str2)) {
                int i = this.f6336i;
                if (i > 0) {
                    this.f6336i = i - 1;
                }
                iLogger.mo3680e(EnumC1657a2.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f6336i != 0) {
                    C1896i1 c1896i12 = this.f6338k;
                    if (c1896i12 != null) {
                        c1896i12.m4097a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f6340m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f6341n));
                    }
                    c1981rM4173a.close();
                    return null;
                }
                boolean z2 = false;
                C1733o c1733oM3910a = this.f6339l.m3910a(list, false);
                if (c1733oM3910a == null) {
                    c1981rM4173a.close();
                    return null;
                }
                long j = c1733oM3910a.f6274a;
                long j2 = j - this.f6340m;
                ArrayList arrayList = new ArrayList(1);
                C1896i1 c1896i13 = this.f6338k;
                if (c1896i13 != null) {
                    arrayList.add(c1896i13);
                }
                this.f6338k = null;
                this.f6336i = 0;
                Long l = c2046v2 instanceof SentryAndroidOptions ? C1670M.m3842c(this.f6328a, (SentryAndroidOptions) c2046v2).f5989h : null;
                String string = l != null ? Long.toString(l.longValue()) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1896i1) it.next()).m4097a(Long.valueOf(j), Long.valueOf(this.f6340m), Long.valueOf(c1733oM3910a.f6275b), Long.valueOf(this.f6341n));
                    it = it;
                    z2 = z2;
                }
                C1881h1 c1881h1 = new C1881h1(c1733oM3910a.f6276c, this.f6342o, arrayList, str, str2, str3, Long.toString(j2), Build.VERSION.SDK_INT, (strArr == null || strArr.length <= 0) ? "" : strArr[z2 ? 1 : 0], new CallableC1590I(3), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, c1666i.m3834b(), string, c2046v2.getProguardUuid(), c2046v2.getRelease(), c2046v2.getEnvironment(), (c1733oM3910a.f6278e || z) ? "timeout" : "normal", c1733oM3910a.f6277d);
                c1981rM4173a.close();
                return c1881h1;
            }
            iLogger.mo3680e(EnumC1657a2.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            c1981rM4173a.close();
            return null;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC1911j0
    public final void close() {
        C1744r c1744r;
        C1896i1 c1896i1 = this.f6338k;
        if (c1896i1 != null) {
            c1744r = this;
            c1744r.m3922c(c1896i1.f6767c, c1896i1.f6765a, c1896i1.f6766b, true, null, AbstractC2066z1.m4233b().mo3718l());
        } else {
            c1744r = this;
            int i = c1744r.f6336i;
            if (i != 0) {
                c1744r.f6336i = i - 1;
            }
        }
        C1734p c1734p = c1744r.f6339l;
        if (c1734p == null) {
            return;
        }
        C1981r c1981rM4173a = c1734p.f6293o.m4173a();
        try {
            Future future = c1734p.f6282d;
            if (future != null) {
                future.cancel(true);
                c1734p.f6282d = null;
            }
            if (c1734p.f6292n) {
                c1734p.m3910a(null, true);
            }
            c1981rM4173a.close();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1911j0
    public final boolean isRunning() {
        return this.f6336i != 0;
    }

    @Override // io.sentry.InterfaceC1911j0
    public final void start() {
        C1734p c1734p;
        C0118Cp c0118CpM3912c;
        C1981r c1981rM4173a = this.f6343p.m4173a();
        try {
            this.f6334g.getClass();
            m3921a();
            int i = this.f6336i + 1;
            this.f6336i = i;
            ILogger iLogger = this.f6329b;
            if (i != 1 || (c1734p = this.f6339l) == null || (c0118CpM3912c = c1734p.m3912c()) == null) {
                this.f6336i--;
                iLogger.mo3680e(EnumC1657a2.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            } else {
                this.f6340m = c0118CpM3912c.f287a;
                this.f6341n = c0118CpM3912c.f288b;
                this.f6342o = (Date) c0118CpM3912c.f289c;
                iLogger.mo3680e(EnumC1657a2.DEBUG, "Profiler started.", new Object[0]);
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

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: u */
    public final void mo3706u(InterfaceC1895i0 interfaceC1895i0) {
        C1981r c1981rM4173a = this.f6343p.m4173a();
        try {
            if (this.f6336i > 0 && this.f6338k == null) {
                this.f6338k = new C1896i1(interfaceC1895i0, Long.valueOf(this.f6340m), Long.valueOf(this.f6341n));
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
}
