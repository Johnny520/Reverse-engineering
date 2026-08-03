package io.sentry.android.core;

import io.sentry.AbstractC1588H1;
import io.sentry.AbstractC2066z1;
import io.sentry.C1615O0;
import io.sentry.C1617O2;
import io.sentry.C1863d1;
import io.sentry.C1878g2;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1877g1;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.InterfaceC1618P;
import io.sentry.InterfaceC1651Z;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1925m;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2020o;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1696g implements InterfaceC1618P, InterfaceC2020o {

    /* JADX INFO: renamed from: a */
    public final ILogger f6120a;

    /* JADX INFO: renamed from: b */
    public final String f6121b;

    /* JADX INFO: renamed from: c */
    public final int f6122c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1833c0 f6123d;

    /* JADX INFO: renamed from: e */
    public final C1666I f6124e;

    /* JADX INFO: renamed from: g */
    public final C1727o f6126g;

    /* JADX INFO: renamed from: j */
    public InterfaceC1651Z f6129j;

    /* JADX INFO: renamed from: k */
    public Future f6130k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1925m f6131l;

    /* JADX INFO: renamed from: n */
    public C1970t f6133n;

    /* JADX INFO: renamed from: o */
    public C1970t f6134o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f6135p;

    /* JADX INFO: renamed from: q */
    public AbstractC1588H1 f6136q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f6137r;

    /* JADX INFO: renamed from: s */
    public boolean f6138s;

    /* JADX INFO: renamed from: t */
    public boolean f6139t;

    /* JADX INFO: renamed from: u */
    public int f6140u;

    /* JADX INFO: renamed from: v */
    public final C2029a f6141v;

    /* JADX INFO: renamed from: w */
    public final C2029a f6142w;

    /* JADX INFO: renamed from: f */
    public boolean f6125f = false;

    /* JADX INFO: renamed from: h */
    public C1734p f6127h = null;

    /* JADX INFO: renamed from: i */
    public boolean f6128i = false;

    /* JADX INFO: renamed from: m */
    public final ArrayList f6132m = new ArrayList();

    public C1696g(C1666I c1666i, C1727o c1727o, ILogger iLogger, String str, int i, InterfaceC1833c0 interfaceC1833c0) {
        C1970t c1970t = C1970t.f7011b;
        this.f6133n = c1970t;
        this.f6134o = c1970t;
        this.f6135p = new AtomicBoolean(false);
        this.f6136q = new C1878g2();
        this.f6137r = true;
        this.f6138s = false;
        this.f6139t = false;
        this.f6140u = 0;
        this.f6141v = new C2029a();
        this.f6142w = new C2029a();
        this.f6120a = iLogger;
        this.f6126g = c1727o;
        this.f6124e = c1666i;
        this.f6121b = str;
        this.f6122c = i;
        this.f6123d = interfaceC1833c0;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: a */
    public final void mo3690a(boolean z) {
        C1981r c1981rM4173a = this.f6141v.m4173a();
        try {
            this.f6140u = 0;
            this.f6138s = true;
            if (z) {
                m3876e(false);
                this.f6135p.set(true);
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

    /* JADX INFO: renamed from: b */
    public final void m3874b() {
        InterfaceC1651Z interfaceC1651Z = this.f6129j;
        if ((interfaceC1651Z == null || interfaceC1651Z == C1615O0.f5812b) && AbstractC2066z1.m4233b() != C1615O0.f5812b) {
            this.f6129j = AbstractC2066z1.m4233b();
            this.f6131l = AbstractC2066z1.m4233b().mo3718l().getCompositePerformanceCollector();
            C2021p c2021pMo3709c = this.f6129j.mo3709c();
            if (c2021pMo3709c != null) {
                c2021pMo3709c.f7207d.add(this);
            }
        }
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: c */
    public final void mo3692c(EnumC1877g1 enumC1877g1) {
        C1981r c1981rM4173a = this.f6141v.m4173a();
        try {
            int i = AbstractC1694f.f6110a[enumC1877g1.ordinal()];
            if (i == 1) {
                int i2 = this.f6140u - 1;
                this.f6140u = i2;
                if (i2 > 0) {
                    c1981rM4173a.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.f6140u = 0;
                    }
                    this.f6138s = true;
                }
            } else if (i == 2) {
                this.f6138s = true;
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

    /* JADX INFO: renamed from: d */
    public final void m3875d() {
        m3874b();
        this.f6124e.getClass();
        boolean z = this.f6125f;
        ILogger iLogger = this.f6120a;
        if (!z) {
            this.f6125f = true;
            String str = this.f6121b;
            if (str == null) {
                iLogger.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.f6122c;
                if (i <= 0) {
                    iLogger.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.f6127h = new C1734p(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.f6126g, null, this.f6120a);
                }
            }
        }
        if (this.f6127h == null) {
            return;
        }
        InterfaceC1651Z interfaceC1651Z = this.f6129j;
        if (interfaceC1651Z != null) {
            C2021p c2021pMo3709c = interfaceC1651Z.mo3709c();
            if (c2021pMo3709c != null && (c2021pMo3709c.m4170f(EnumC1929n.All) || c2021pMo3709c.m4170f(EnumC1929n.ProfileChunkUi))) {
                iLogger.mo3680e(EnumC1657a2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                m3876e(false);
                return;
            } else {
                if (this.f6129j.mo3718l().getConnectionStatusProvider().mo3684g() == EnumC1606M.DISCONNECTED) {
                    iLogger.mo3680e(EnumC1657a2.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    m3876e(false);
                    return;
                }
                this.f6136q = this.f6129j.mo3718l().getDateProvider().mo3603a();
            }
        } else {
            this.f6136q = new C1878g2();
        }
        if (this.f6127h.m3912c() == null) {
            return;
        }
        this.f6128i = true;
        C1970t c1970t = this.f6133n;
        C1970t c1970t2 = C1970t.f7011b;
        if (c1970t == c1970t2) {
            this.f6133n = new C1970t();
        }
        if (this.f6134o == c1970t2) {
            this.f6134o = new C1970t();
        }
        InterfaceC1925m interfaceC1925m = this.f6131l;
        if (interfaceC1925m != null) {
            interfaceC1925m.mo3676c(this.f6134o.toString());
        }
        try {
            this.f6130k = this.f6123d.mo3703q(new RunnableC1631S1(3, this), 60000L);
        } catch (RejectedExecutionException e) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.f6138s = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3876e(boolean z) {
        m3874b();
        C1981r c1981rM4173a = this.f6141v.m4173a();
        try {
            Future future = this.f6130k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f6127h != null && this.f6128i) {
                this.f6124e.getClass();
                InterfaceC1925m interfaceC1925m = this.f6131l;
                C1733o c1733oM3910a = this.f6127h.m3910a(interfaceC1925m != null ? interfaceC1925m.mo3679f(this.f6134o.toString()) : null, false);
                ILogger iLogger = this.f6120a;
                if (c1733oM3910a == null) {
                    iLogger.mo3680e(EnumC1657a2.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    C1981r c1981rM4173a2 = this.f6142w.m4173a();
                    try {
                        this.f6132m.add(new C1863d1(this.f6133n, this.f6134o, c1733oM3910a.f6277d, c1733oM3910a.f6276c, this.f6136q));
                        c1981rM4173a2.close();
                    } finally {
                    }
                }
                this.f6128i = false;
                this.f6134o = C1970t.f7011b;
                InterfaceC1651Z interfaceC1651Z = this.f6129j;
                if (interfaceC1651Z != null) {
                    C2046v2 c2046v2Mo3718l = interfaceC1651Z.mo3718l();
                    try {
                        c2046v2Mo3718l.getExecutorService().submit(new RunnableC1684a0(this, c2046v2Mo3718l, interfaceC1651Z, 2));
                    } catch (Throwable th) {
                        c2046v2Mo3718l.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to send profile chunks.", th);
                    }
                }
                if (!z || this.f6138s) {
                    this.f6133n = C1970t.f7011b;
                    iLogger.mo3680e(EnumC1657a2.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.mo3680e(EnumC1657a2.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    m3875d();
                }
                c1981rM4173a.close();
                return;
            }
            C1970t c1970t = C1970t.f7011b;
            this.f6133n = c1970t;
            this.f6134o = c1970t;
            c1981rM4173a.close();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: h */
    public final void mo3696h(EnumC1877g1 enumC1877g1, C1617O2 c1617o2) {
        C1981r c1981rM4173a = this.f6141v.m4173a();
        try {
            if (this.f6137r) {
                double dM4179c = AbstractC2036h.m4180a().m4179c();
                Double profileSessionSampleRate = c1617o2.f5819a.getProfileSessionSampleRate();
                this.f6139t = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM4179c;
                this.f6137r = false;
            }
            if (!this.f6139t) {
                this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                c1981rM4173a.close();
                return;
            }
            int i = AbstractC1694f.f6110a[enumC1877g1.ordinal()];
            if (i == 1) {
                if (this.f6140u < 0) {
                    this.f6140u = 0;
                }
                this.f6140u++;
            } else if (i == 2 && this.f6128i) {
                this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Profiler is already running.", new Object[0]);
                c1981rM4173a.close();
                return;
            }
            if (!this.f6128i) {
                this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Started Profiler.", new Object[0]);
                m3875d();
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

    @Override // io.sentry.transport.InterfaceC2020o
    /* JADX INFO: renamed from: m */
    public final void mo3877m(C2021p c2021p) {
        if (c2021p.m4170f(EnumC1929n.All) || c2021p.m4170f(EnumC1929n.ProfileChunkUi)) {
            this.f6120a.mo3680e(EnumC1657a2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            m3876e(false);
        }
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: p */
    public final void mo3702p() {
        this.f6137r = true;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: s */
    public final C1970t mo3704s() {
        return this.f6133n;
    }
}
