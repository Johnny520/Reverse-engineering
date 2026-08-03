package io.sentry;

import io.sentry.clientreport.EnumC1853d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;
import io.sentry.util.AbstractC2037i;
import java.io.Closeable;
import java.util.ArrayList;
import p000.C2648vx;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2045v1 implements InterfaceC1651Z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1645X f7240a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1645X f7241b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1645X f7242c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1925m f7243d;

    /* JADX INFO: renamed from: e */
    public final C1918l f7244e;

    public C2045v1(InterfaceC1645X interfaceC1645X, InterfaceC1645X interfaceC1645X2, InterfaceC1645X interfaceC1645X3) {
        this.f7244e = new C1918l(interfaceC1645X3, interfaceC1645X2, interfaceC1645X);
        this.f7240a = interfaceC1645X;
        this.f7241b = interfaceC1645X2;
        this.f7242c = interfaceC1645X3;
        C2046v2 c2046v2Mo3718l = mo3718l();
        AbstractC1856a.m4048D("SentryOptions is required.", c2046v2Mo3718l);
        if (c2046v2Mo3718l.getDsn() == null || c2046v2Mo3718l.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f7243d = c2046v2Mo3718l.getCompositePerformanceCollector();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean z) {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC1935o0 interfaceC1935o0 : mo3718l().getIntegrations()) {
                if (interfaceC1935o0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC1935o0).close();
                    } catch (Throwable th) {
                        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to close the integration {}.", interfaceC1935o0, th);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            C1918l c1918l = this.f7244e;
            if (zIsEnabled) {
                try {
                    c1918l.m4141b(null).clear();
                } catch (Throwable th2) {
                    mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th2);
                }
            } else {
                mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC2027u1 enumC2027u1 = EnumC2027u1.ISOLATION;
            if (isEnabled()) {
                try {
                    c1918l.m4141b(enumC2027u1).clear();
                } catch (Throwable th3) {
                    mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            mo3718l().getBackpressureMonitor().close();
            mo3718l().getTransactionProfiler().close();
            mo3718l().getContinuousProfiler().mo3690a(true);
            mo3718l().getCompositePerformanceCollector().close();
            mo3718l().getConnectionStatusProvider().close();
            InterfaceC1833c0 executorService = mo3718l().getExecutorService();
            if (z) {
                executorService.submit(new RunnableC2260n3(20, this, executorService));
            } else {
                executorService.mo3695g(mo3718l().getShutdownTimeoutMillis());
            }
            EnumC2027u1 enumC2027u12 = EnumC2027u1.CURRENT;
            if (isEnabled()) {
                try {
                    c1918l.m4141b(enumC2027u12).mo3760J().mo3643a(z);
                } catch (Throwable th4) {
                    mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            if (isEnabled()) {
                try {
                    c1918l.m4141b(enumC2027u1).mo3760J().mo3643a(z);
                } catch (Throwable th5) {
                    mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            EnumC2027u1 enumC2027u13 = EnumC2027u1.GLOBAL;
            if (!isEnabled()) {
                mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                c1918l.m4141b(enumC2027u13).mo3760J().mo3643a(z);
            } catch (Throwable th6) {
                mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th6);
            }
        } catch (Throwable th7) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while closing the Scopes.", th7);
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long j) {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f7244e.mo3760J().mo3644b(j);
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return this.f7244e.mo3760J().mo3645c();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3710d() {
        if (isEnabled()) {
            return this.f7244e.mo3763d();
        }
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: e */
    public final boolean mo3711e() {
        return this.f7244e.mo3760J().mo3647e();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: f */
    public final void mo3712f(C1871f c1871f, C1586H c1586h) {
        if (isEnabled()) {
            this.f7244e.mo3764f(c1871f, c1586h);
        } else {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c c1901c, C1586H c1586h) {
        C1970t c1970t = C1970t.f7011b;
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c1970t;
        }
        try {
            C1970t c1970tMo3649g = this.f7244e.mo3760J().mo3649g(c1901c, c1586h);
            return c1970tMo3649g != null ? c1970tMo3649g : c1970t;
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing envelope.", th);
            return c1970t;
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 c1867e1) {
        AbstractC1856a.m4048D("profilingContinuousData is required", c1867e1);
        C1970t c1970t = C1970t.f7011b;
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c1970t;
        }
        try {
            return this.f7244e.mo3760J().mo3650h(c1867e1);
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing profile chunk with id: " + c1867e1.f6693c, th);
            return c1970t;
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: i */
    public final void mo3715i() {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C1918l c1918l = this.f7244e;
        C1581F2 c1581f2Mo3765i = c1918l.mo3765i();
        if (c1581f2Mo3765i != null) {
            c1918l.mo3760J().mo3646d(c1581f2Mo3765i, AbstractC1856a.m4059e(new C1891i()));
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    public final boolean isEnabled() {
        return this.f7244e.mo3760J().isEnabled();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: j */
    public final void mo3716j() {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C1918l c1918l = this.f7244e;
        C1901c c1901cMo3766j = c1918l.mo3766j();
        if (c1901cMo3766j == null) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        C1581F2 c1581f2 = (C1581F2) c1901cMo3766j.f6781b;
        if (c1581f2 != null) {
            c1918l.mo3760J().mo3646d(c1581f2, AbstractC1856a.m4059e(new C1891i()));
        }
        c1918l.mo3760J().mo3646d((C1581F2) c1901cMo3766j.f6782c, AbstractC1856a.m4059e(new C1891i()));
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: k */
    public final InterfaceC1895i0 mo3717k(C1621P2 c1621p2, C1625Q2 c1625q2) {
        Double dValueOf;
        c1621p2.f5746i = (String) c1625q2.f3480d;
        boolean zIsEnabled = isEnabled();
        InterfaceC1895i0 interfaceC1895i0Mo3748a = C1643W0.f5888a;
        if (!zIsEnabled) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (AbstractC2037i.m4181a(c1621p2.f5746i, mo3718l().getIgnoredSpanOrigins())) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", c1621p2.f5746i);
        } else if (!mo3718l().getInstrumenter().equals(c1621p2.f5749l)) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c1621p2.f5749l, mo3718l().getInstrumenter());
        } else if (mo3718l().isTracingEnabled()) {
            C1832c c1832c = c1621p2.f5750m;
            if (c1832c == null || (dValueOf = c1832c.f6621d) == null) {
                Double d = ((C1832c) this.f7244e.mo3755E().f6807d).f6621d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            C2648vx c2648vxM3726a = mo3718l().getInternalTracesSampler().m3726a(new C1918l(c1621p2, dValueOf));
            c1621p2.m3673a(c2648vxM3726a);
            interfaceC1895i0Mo3748a = mo3718l().getSpanFactory().mo3748a(c1621p2, this, c1625q2, this.f7243d);
            if (((Boolean) c2648vxM3726a.f9162a).booleanValue()) {
                if (((Boolean) c2648vxM3726a.f9165d).booleanValue()) {
                    InterfaceC1911j0 transactionProfiler = mo3718l().getTransactionProfiler();
                    if (!transactionProfiler.isRunning()) {
                        transactionProfiler.start();
                        transactionProfiler.mo3706u(interfaceC1895i0Mo3748a);
                    } else if (c1625q2.f5839e) {
                        transactionProfiler.mo3706u(interfaceC1895i0Mo3748a);
                    }
                }
                if (mo3718l().isContinuousProfilingEnabled()) {
                    EnumC1877g1 profileLifecycle = mo3718l().getProfileLifecycle();
                    EnumC1877g1 enumC1877g1 = EnumC1877g1.TRACE;
                    if (profileLifecycle == enumC1877g1) {
                        mo3718l().getContinuousProfiler().mo3696h(enumC1877g1, mo3718l().getInternalTracesSampler());
                    }
                }
            }
        } else {
            mo3718l().getLogger().mo3680e(EnumC1657a2.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (EnumC1983r1.ON == ((EnumC1983r1) c1625q2.f3479c)) {
            interfaceC1895i0Mo3748a.mo3634t();
        }
        return interfaceC1895i0Mo3748a;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return ((InterfaceC1645X) this.f7244e.f6805b).mo3768l();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 interfaceC2000s1) {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC2000s1.mo1424b(this.f7244e.m4141b(null));
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A c1944a, C1613N2 c1613n2, C1586H c1586h, C1881h1 c1881h1) {
        C1944A c1944a2;
        InterfaceC1645X interfaceC1645X = this.f7244e;
        ArrayList arrayList = c1944a.f6842s;
        C1970t c1970t = C1970t.f7011b;
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c1970t;
        }
        if (c1944a.f6841r == null) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c1944a.f5604a);
            return c1970t;
        }
        Boolean bool = Boolean.TRUE;
        C1589H2 c1589h2Mo4126h = c1944a.f5605b.mo4126h();
        C2648vx c2648vx = c1589h2Mo4126h == null ? null : c1589h2Mo4126h.f5741d;
        if (bool.equals(Boolean.valueOf(c2648vx != null ? ((Boolean) c2648vx.f9162a).booleanValue() : false))) {
            try {
                c1944a2 = c1944a;
            } catch (Throwable th) {
                th = th;
                c1944a2 = c1944a;
            }
            try {
                return interfaceC1645X.mo3760J().mo3651i(c1944a2, c1613n2, interfaceC1645X, c1586h, c1881h1);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing transaction with id: " + c1944a2.f5604a, th3);
                return c1970t;
            }
        }
        mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction %s was dropped due to sampling decision.", c1944a.f5604a);
        if (mo3718l().getBackpressureMonitor().mo3993a() > 0) {
            InterfaceC1855f clientReportRecorder = mo3718l().getClientReportRecorder();
            EnumC1853d enumC1853d = EnumC1853d.BACKPRESSURE;
            clientReportRecorder.mo4041b(enumC1853d, EnumC1929n.Transaction);
            mo3718l().getClientReportRecorder().mo4042c(enumC1853d, EnumC1929n.Span, arrayList.size() + 1);
            return c1970t;
        }
        InterfaceC1855f clientReportRecorder2 = mo3718l().getClientReportRecorder();
        EnumC1853d enumC1853d2 = EnumC1853d.SAMPLE_RATE;
        clientReportRecorder2.mo4041b(enumC1853d2, EnumC1929n.Transaction);
        mo3718l().getClientReportRecorder().mo4042c(enumC1853d2, EnumC1929n.Span, arrayList.size() + 1);
        return c1970t;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 c2059x2, C1586H c1586h) {
        InterfaceC1645X interfaceC1645X = this.f7244e;
        C1970t c1970t = C1970t.f7011b;
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return c1970t;
        }
        try {
            return interfaceC1645X.mo3760J().mo3648f(c2059x2, interfaceC1645X, c1586h);
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing replay", th);
            return c1970t;
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String str) {
        return new C2045v1(this.f7240a.clone(), this.f7241b.clone(), this.f7242c);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 c1627r1, C1586H c1586h) {
        InterfaceC1645X interfaceC1645X = this.f7244e;
        C1970t c1970tMo3652j = C1970t.f7011b;
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c1970tMo3652j;
        }
        try {
            interfaceC1645X.mo3772p(c1627r1);
            c1970tMo3652j = interfaceC1645X.mo3760J().mo3652j(c1627r1, interfaceC1645X, c1586h);
            interfaceC1645X.mo3778v(c1970tMo3652j);
            return c1970tMo3652j;
        } catch (Throwable th) {
            mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing event with id: " + c1627r1.f5604a, th);
            return c1970tMo3652j;
        }
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1629S m5485clone() {
        if (!isEnabled()) {
            mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new C1602L((C2045v1) mo3722q("scopes clone"));
    }
}
