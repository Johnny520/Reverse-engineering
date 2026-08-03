package io.sentry.transport;

import io.sentry.AbstractC1588H1;
import io.sentry.C1586H;
import io.sentry.C1596J1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.AbstractC1885c;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.transport.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2007b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C1901c f7176a;

    /* JADX INFO: renamed from: b */
    public final C1586H f7177b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1839d f7178c;

    /* JADX INFO: renamed from: d */
    public final C2023r f7179d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2008c f7180e;

    public RunnableC2007b(C2008c r2, C1901c r3, C1586H r4, InterfaceC1839d r5) {
        this.f7180e = r2;
        this.f7179d = new C2023r(-1);
        AbstractC1856a.m4048D("Envelope is required.", r3);
        this.f7176a = r3;
        this.f7177b = r4;
        AbstractC1856a.m4048D("EnvelopeCache is required.", r5);
        this.f7178c = r5;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4157a(RunnableC2007b r3, AbstractC1856a r4, InterfaceC1892j r5) {
        r3.f7180e.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Marking envelope submission result: %s", new Object[]{Boolean.valueOf(r4.mo4080x())});
        r5.mo3847b(r4.mo4080x());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1856a m4158b() {
        C1901c r2 = this.f7176a;
        ((C1596J1) r2.f6781b).f5758d = null;
        InterfaceC1839d r3 = this.f7178c;
        C1586H r4 = this.f7177b;
        boolean r5 = r3.mo3868i(r2, r4);
        Object r6 = AbstractC1856a.m4072s(r4);
        boolean r7 = AbstractC1885c.class.isInstance(AbstractC1856a.m4072s(r4));
        C2008c r8 = this.f7180e;
        if (r7 == false) goto L9;
        if (r6 == null) goto L9;
        AbstractC1885c r62 = (AbstractC1885c) r6;
        C2046v2 r72 = r8.f7183c;
        if (r62.mo3740f(((C1596J1) r2.f6781b).f5755a) == false) goto L8;
        r62.f6761a.countDown();
        r72.getLogger().mo3680e(EnumC1657a2.DEBUG, "Disk flush envelope fired", new Object[0]);
        goto L9
    L8:
        r72.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
    L9:
        C2046v2 r63 = r8.f7183c;
        if (r8.f7185e.mo3833a() == false) goto L39;
        C1901c r73 = r63.getClientReportRecorder().mo4044g(r2);
        AbstractC1588H1 r12 = r63.getDateProvider().mo3603a();     // Catch: IOException -> L16
        ((C1596J1) r73.f6781b).f5758d = AbstractC1856a.m4068n(Double.valueOf(r12.mo3672d() / 1000000.0d).longValue());     // Catch: IOException -> L16
        AbstractC1856a r82 = r8.f7186f.m4167d(r73);     // Catch: IOException -> L16
        if (r82.mo4080x() == false) goto L18;
        r3.mo4011p(r2);     // Catch: IOException -> L16
        return r82;
    L18:
        String r0 = "The transport failed to send the envelope with response code " + r82.mo4079r();     // Catch: IOException -> L16
        r63.getLogger().mo3680e(EnumC1657a2.ERROR, r0, new Object[0]);     // Catch: IOException -> L16
        if (r82.mo4079r() < 400) goto L29;
        if (r82.mo4079r() == 429) goto L29;
        if (r5 == true) goto L29;
        Object r22 = AbstractC1856a.m4072s(r4);     // Catch: IOException -> L16
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r4)) == false) goto L27;
        if (r22 != null) goto L29;
    L27:
        r63.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, r73);     // Catch: IOException -> L16
    L29:
        throw new IllegalStateException(r0);     // Catch: IOException -> L16
    L16:
        e = move-exception;
        Object r23 = AbstractC1856a.m4072s(r4);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r4)) == false) goto L35;
        if (r23 == null) goto L35;
        ((InterfaceC1889g) r23).mo3850e(true);
    L38:
        throw new IllegalStateException("Sending the event failed.", e);
    L35:
        if (r5 == true) goto L38;
        AbstractC1856a.m4078z(InterfaceC1889g.class, r23, r63.getLogger());
        r63.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, r73);
        goto L38
    L39:
        Object r02 = AbstractC1856a.m4072s(r4);
        boolean r32 = InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r4));
        C2023r r42 = this.f7179d;
        if (r32 == false) goto L44;
        if (r02 == null) goto L44;
        ((InterfaceC1889g) r02).mo3850e(true);
        return r42;
    L44:
        if (r5 == true) goto L46;
        AbstractC1856a.m4078z(InterfaceC1889g.class, r02, r63.getLogger());
        r63.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, r2);
    L46:
        return r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7180e.f7187g = this;
        AbstractC1856a r1 = this.f7179d;
        r1 = m4158b();     // Catch: Throwable -> L10
        this.f7180e.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope flushed", new Object[0]);     // Catch: Throwable -> L10
        C1586H r3 = this.f7177b;
        Object r4 = AbstractC1856a.m4072s(r3);
        if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(r3)) == false) goto L8;
        if (r4 == null) goto L8;
        m4157a(this, r1, (InterfaceC1892j) r4);
    L8:
        this.f7180e.f7187g = null;
        return;
    L10:
        th = move-exception;
        this.f7180e.f7183c.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Envelope submission failed", new Object[0]);     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        C1586H r42 = this.f7177b;
        Object r5 = AbstractC1856a.m4072s(r42);
        if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(r42)) == false) goto L18;
        if (r5 == null) goto L18;
        m4157a(this, r1, (InterfaceC1892j) r5);
    L18:
        this.f7180e.f7187g = null;
        throw th;
    }
}
