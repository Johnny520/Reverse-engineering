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
import java.util.Iterator;
import java.util.List;
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

    public C2045v1(InterfaceC1645X r2, InterfaceC1645X r3, InterfaceC1645X r4) {
        this.f7244e = new C1918l(r4, r3, r2);
        this.f7240a = r2;
        this.f7241b = r3;
        this.f7242c = r4;
        C2046v2 r22 = mo3718l();
        AbstractC1856a.m4048D("SentryOptions is required.", r22);
        if (r22.getDsn() == null) goto L9;
        if (r22.getDsn().isEmpty() == true) goto L9;
        this.f7243d = r22.getCompositePerformanceCollector();
        return;
    L9:
        throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean r9) {
        if (isEnabled() == true) goto L70;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
        return;
    L70:
        Iterator<InterfaceC1935o0> r0 = mo3718l().getIntegrations().iterator();     // Catch: Throwable -> L15
    L8:
        if (r0.hasNext() == false) goto L17;
        InterfaceC1935o0 r2 = r0.next();     // Catch: Throwable -> L15
        if ((r2 instanceof Closeable) == false) goto L8;
        ((Closeable) r2).close();     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to close the integration {}.", new Object[]{r2, th});     // Catch: Throwable -> L15
        goto L8
    L17:
        boolean r02 = isEnabled();     // Catch: Throwable -> L15
        C1918l r3 = this.f7244e;
        if (r02 == true) goto L75;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L15
    L27:
        EnumC2027u1 r03 = EnumC2027u1.ISOLATION;     // Catch: Throwable -> L15
        if (isEnabled() == true) goto L73;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L15
    L35:
        mo3718l().getBackpressureMonitor().close();     // Catch: Throwable -> L15
        mo3718l().getTransactionProfiler().close();     // Catch: Throwable -> L15
        mo3718l().getContinuousProfiler().mo3690a(true);     // Catch: Throwable -> L15
        mo3718l().getCompositePerformanceCollector().close();     // Catch: Throwable -> L15
        mo3718l().getConnectionStatusProvider().close();     // Catch: Throwable -> L15
        InterfaceC1833c0 r5 = mo3718l().getExecutorService();     // Catch: Throwable -> L15
        if (r9 == false) goto L38;
        r5.submit(new RunnableC2260n3(20, this, r5));     // Catch: Throwable -> L15
    L39:
        EnumC2027u1 r52 = EnumC2027u1.CURRENT;     // Catch: Throwable -> L15
        if (isEnabled() == true) goto L66;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L15
    L48:
        if (isEnabled() == true) goto L68;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L15
    L55:
        EnumC2027u1 r04 = EnumC2027u1.GLOBAL;     // Catch: Throwable -> L15
        if (isEnabled() == true) goto L71;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L15
        return;
    L71:
        r3.m4141b(r04).mo3760J().mo3643a(r9);     // Catch: Throwable -> L61
    L85:
        return;
    L61:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L15
        return;
    L68:
        r3.m4141b(r03).mo3760J().mo3643a(r9);     // Catch: Throwable -> L53
    L53:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L15
        goto L55
    L66:
        r3.m4141b(r52).mo3760J().mo3643a(r9);     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L15
        goto L48
    L38:
        r5.mo3695g(mo3718l().getShutdownTimeoutMillis());     // Catch: Throwable -> L15
        goto L39
    L73:
        r3.m4141b(r03).clear();     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L15
        goto L35
    L75:
        r3.m4141b(null).clear();     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while closing the Scopes.", th);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long r3) {
        if (isEnabled() == true) goto L11;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
        return;
    L11:
        this.f7244e.mo3760J().mo3644b(r3);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'client.flush'.", th);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return this.f7244e.mo3760J().mo3645c();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m5485clone() {
        return clone();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3710d() {
        if (isEnabled() == true) goto L7;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    L7:
        return this.f7244e.mo3763d();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: e */
    public final boolean mo3711e() {
        return this.f7244e.mo3760J().mo3647e();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: f */
    public final void mo3712f(C1871f r3, C1586H r4) {
        if (isEnabled() == true) goto L6;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        return;
    L6:
        this.f7244e.mo3764f(r3, r4);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c r4, C1586H r5) {
        C1970t r0 = C1970t.f7011b;
        if (isEnabled() == true) goto L13;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        return r0;
    L13:
        C1970t r42 = this.f7244e.mo3760J().mo3649g(r4, r5);     // Catch: Throwable -> L10
        if (r42 == null) goto L9;
        return r42;
    L9:
        return r0;
    L10:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing envelope.", th);
        return r0;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 r7) {
        AbstractC1856a.m4048D("profilingContinuousData is required", r7);
        C1970t r0 = C1970t.f7011b;
        if (isEnabled() == true) goto L11;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        return r0;
    L11:
        return this.f7244e.mo3760J().mo3650h(r7);
    L8:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing profile chunk with id: " + r7.f6693c, th);
        return r0;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: i */
    public final void mo3715i() {
        if (isEnabled() == true) goto L6;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
        return;
    L6:
        C1918l r0 = this.f7244e;
        C1581F2 r1 = r0.mo3765i();
        if (r1 == null) goto L10;
        C1586H r2 = AbstractC1856a.m4059e(new C1891i());
        r0.mo3760J().mo3646d(r1, r2);
        return;
    }

    @Override // io.sentry.InterfaceC1651Z
    public final boolean isEnabled() {
        return this.f7244e.mo3760J().isEnabled();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: j */
    public final void mo3716j() {
        if (isEnabled() == true) goto L6;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
        return;
    L6:
        C1918l r0 = this.f7244e;
        C1901c r2 = r0.mo3766j();
        if (r2 == null) goto L13;
        C1581F2 r1 = (C1581F2) r2.f6781b;
        if (r1 == null) goto L11;
        C1586H r3 = AbstractC1856a.m4059e(new C1891i());
        r0.mo3760J().mo3646d(r1, r3);
    L11:
        C1586H r12 = AbstractC1856a.m4059e(new C1891i());
        r0.mo3760J().mo3646d((C1581F2) r2.f6782c, r12);
        return;
    L13:
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Session could not be started.", new Object[0]);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: k */
    public final InterfaceC1895i0 mo3717k(C1621P2 r5, C1625Q2 r6) {
        r5.f5746i = (String) r6.f3480d;
        boolean r0 = isEnabled();
        InterfaceC1895i0 r2 = C1643W0.f5888a;
        if (r0 == true) goto L5;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
    L40:
        if (EnumC1983r1.f7104ON != ((EnumC1983r1) r6.f3479c)) goto L42;
        r2.mo3634t();
    L42:
        return r2;
    L5:
        List<C1578F> r02 = mo3718l().getIgnoredSpanOrigins();
        if (AbstractC2037i.m4181a(r5.f5746i, r02) == false) goto L9;
        mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", new Object[]{r5.f5746i});
        goto L40
    L9:
        if (mo3718l().getInstrumenter().equals(r5.f5749l) == true) goto L12;
        mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", new Object[]{r5.f5749l, mo3718l().getInstrumenter()});
        goto L40
    L12:
        if (mo3718l().isTracingEnabled() == true) goto L14;
        mo3718l().getLogger().mo3680e(EnumC1657a2.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        goto L40
    L14:
        C1832c r03 = r5.f5750m;
        if (r03 == null) goto L19;
        Double r04 = r03.f6621d;
        if (r04 == null) goto L19;
    L24:
        C1918l r1 = new C1918l(r5, r04);
        C2648vx r05 = mo3718l().getInternalTracesSampler().m3726a(r1);
        r5.m3673a(r05);
        r2 = mo3718l().getSpanFactory().mo3748a(r5, this, r6, this.f7243d);
        if (((Boolean) r05.f9162a).booleanValue() == false) goto L40;
        if (((Boolean) r05.f9165d).booleanValue() == false) goto L35;
        InterfaceC1911j0 r52 = mo3718l().getTransactionProfiler();
        if (r52.isRunning() == true) goto L32;
        r52.start();
        r52.mo3706u(r2);
        goto L35
    L32:
        if (r6.f5839e == false) goto L35;
        r52.mo3706u(r2);
    L35:
        if (mo3718l().isContinuousProfilingEnabled() == false) goto L40;
        EnumC1877g1 r53 = mo3718l().getProfileLifecycle();
        EnumC1877g1 r06 = EnumC1877g1.TRACE;
        if (r53 != r06) goto L40;
        mo3718l().getContinuousProfiler().mo3696h(r06, mo3718l().getInternalTracesSampler());
    L19:
        Double r07 = ((C1832c) this.f7244e.mo3755E().f6807d).f6621d;
        if (r07 != null) goto L22;
        double r08 = 0.0d;
    L23:
        r04 = Double.valueOf(r08);
        goto L24
    L22:
        r08 = r07.doubleValue();
        goto L23
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return ((InterfaceC1645X) this.f7244e.f6805b).mo3768l();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 r4) {
        if (isEnabled() == true) goto L11;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        return;
    L11:
        r4.mo1424b(this.f7244e.m4141b(null));     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A r8, C1613N2 r9, C1586H r10, C1881h1 r11) {
        InterfaceC1645X r3 = this.f7244e;
        ArrayList r0 = r8.f6842s;
        C1970t r6 = C1970t.f7011b;
        boolean r2 = false;
        if (isEnabled() == true) goto L7;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        return r6;
    L7:
        if (r8.f6841r == null) goto L33;
        Boolean r1 = Boolean.TRUE;
        C1589H2 r4 = r8.f5605b.mo4126h();
        if (r4 != null) goto L11;
        C2648vx r42 = null;
    L12:
        if (r42 == null) goto L16;
        r2 = ((Boolean) r42.f9162a).booleanValue();
    L16:
        if (r1.equals(Boolean.valueOf(r2)) == true) goto L35;
        mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction %s was dropped due to sampling decision.", new Object[]{r8.f5604a});
        if (mo3718l().getBackpressureMonitor().mo3993a() <= 0) goto L21;
        InterfaceC1855f r82 = mo3718l().getClientReportRecorder();
        EnumC1853d r92 = EnumC1853d.BACKPRESSURE;
        r82.mo4041b(r92, EnumC1929n.Transaction);
        mo3718l().getClientReportRecorder().mo4042c(r92, EnumC1929n.Span, r0.size() + 1);
        return r6;
    L21:
        InterfaceC1855f r83 = mo3718l().getClientReportRecorder();
        EnumC1853d r93 = EnumC1853d.SAMPLE_RATE;
        r83.mo4041b(r93, EnumC1929n.Transaction);
        mo3718l().getClientReportRecorder().mo4042c(r93, EnumC1929n.Span, r0.size() + 1);
        return r6;
    L35:
        C1944A r12 = r8;
        return r3.mo3760J().mo3651i(r12, r9, r3, r10, r11);
    L27:
        th = th;
    L28:
        Throwable r84 = th;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing transaction with id: " + r12.f5604a, r84);
        return r6;
    L29:
        th = th;
        r12 = r8;
        goto L28
    L11:
        r42 = r4.f5741d;
        goto L12
    L33:
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", new Object[]{r8.f5604a});
        return r6;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 r4, C1586H r5) {
        InterfaceC1645X r0 = this.f7244e;
        C1970t r1 = C1970t.f7011b;
        if (isEnabled() == true) goto L11;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        return r1;
    L11:
        return r0.mo3760J().mo3648f(r4, r0, r5);
    L8:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing replay", th);
        return r1;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String r4) {
        return new C2045v1(this.f7240a.clone(), this.f7241b.clone(), this.f7242c);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 r6, C1586H r7) {
        InterfaceC1645X r0 = this.f7244e;
        C1970t r1 = C1970t.f7011b;
        if (isEnabled() == true) goto L11;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
        return r1;
    L11:
        r0.mo3772p(r6);     // Catch: Throwable -> L8
        r1 = r0.mo3760J().mo3652j(r6, r0, r7);     // Catch: Throwable -> L8
        r0.mo3778v(r1);     // Catch: Throwable -> L8
        return r1;
    L8:
        th = move-exception;
        mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error while capturing event with id: " + r6.f5604a, th);
        return r1;
    }

    @Override // io.sentry.InterfaceC1651Z
    public final InterfaceC1629S clone() {
        if (isEnabled() == true) goto L6;
        mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Disabled Scopes cloned.", new Object[0]);
    L6:
        return new C1602L((C2045v1) mo3722q("scopes clone"));
    }
}
