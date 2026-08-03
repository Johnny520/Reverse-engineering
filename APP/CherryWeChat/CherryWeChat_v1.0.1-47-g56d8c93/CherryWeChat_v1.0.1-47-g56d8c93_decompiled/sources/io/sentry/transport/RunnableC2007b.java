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
    public final C2023r f7179d = new C2023r(-1);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2008c f7180e;

    public RunnableC2007b(C2008c c2008c, C1901c c1901c, C1586H c1586h, InterfaceC1839d interfaceC1839d) {
        this.f7180e = c2008c;
        AbstractC1856a.m4048D("Envelope is required.", c1901c);
        this.f7176a = c1901c;
        this.f7177b = c1586h;
        AbstractC1856a.m4048D("EnvelopeCache is required.", interfaceC1839d);
        this.f7178c = interfaceC1839d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4157a(RunnableC2007b runnableC2007b, AbstractC1856a abstractC1856a, InterfaceC1892j interfaceC1892j) {
        runnableC2007b.f7180e.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC1856a.mo4080x()));
        interfaceC1892j.mo3847b(abstractC1856a.mo4080x());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1856a m4158b() {
        C1901c c1901c = this.f7176a;
        ((C1596J1) c1901c.f6781b).f5758d = null;
        InterfaceC1839d interfaceC1839d = this.f7178c;
        C1586H c1586h = this.f7177b;
        boolean zMo3868i = interfaceC1839d.mo3868i(c1901c, c1586h);
        Object objM4072s = AbstractC1856a.m4072s(c1586h);
        boolean zIsInstance = AbstractC1885c.class.isInstance(AbstractC1856a.m4072s(c1586h));
        C2008c c2008c = this.f7180e;
        if (zIsInstance && objM4072s != null) {
            AbstractC1885c abstractC1885c = (AbstractC1885c) objM4072s;
            C2046v2 c2046v2 = c2008c.f7183c;
            if (abstractC1885c.mo3740f(((C1596J1) c1901c.f6781b).f5755a)) {
                abstractC1885c.f6761a.countDown();
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        C2046v2 c2046v22 = c2008c.f7183c;
        if (!c2008c.f7185e.mo3833a()) {
            Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
            boolean zIsInstance2 = InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h));
            C2023r c2023r = this.f7179d;
            if (zIsInstance2 && objM4072s2 != null) {
                ((InterfaceC1889g) objM4072s2).mo3850e(true);
                return c2023r;
            }
            if (!zMo3868i) {
                AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s2, c2046v22.getLogger());
                c2046v22.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, c1901c);
            }
            return c2023r;
        }
        C1901c c1901cMo4044g = c2046v22.getClientReportRecorder().mo4044g(c1901c);
        try {
            AbstractC1588H1 abstractC1588H1Mo3603a = c2046v22.getDateProvider().mo3603a();
            ((C1596J1) c1901cMo4044g.f6781b).f5758d = AbstractC1856a.m4068n(Double.valueOf(abstractC1588H1Mo3603a.mo3672d() / 1000000.0d).longValue());
            AbstractC1856a abstractC1856aM4167d = c2008c.f7186f.m4167d(c1901cMo4044g);
            if (abstractC1856aM4167d.mo4080x()) {
                interfaceC1839d.mo4011p(c1901c);
                return abstractC1856aM4167d;
            }
            String str = "The transport failed to send the envelope with response code " + abstractC1856aM4167d.mo4079r();
            c2046v22.getLogger().mo3680e(EnumC1657a2.ERROR, str, new Object[0]);
            if (abstractC1856aM4167d.mo4079r() >= 400 && abstractC1856aM4167d.mo4079r() != 429 && !zMo3868i) {
                Object objM4072s3 = AbstractC1856a.m4072s(c1586h);
                if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s3 == null) {
                    c2046v22.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, c1901cMo4044g);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objM4072s4 = AbstractC1856a.m4072s(c1586h);
            if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s4 != null) {
                ((InterfaceC1889g) objM4072s4).mo3850e(true);
            } else if (!zMo3868i) {
                AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s4, c2046v22.getLogger());
                c2046v22.getClientReportRecorder().mo4040a(EnumC1853d.NETWORK_ERROR, c1901cMo4044g);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7180e.f7187g = this;
        AbstractC1856a abstractC1856aM4158b = this.f7179d;
        try {
            abstractC1856aM4158b = m4158b();
            this.f7180e.f7183c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th) {
            try {
                this.f7180e.f7183c.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } finally {
                C1586H c1586h = this.f7177b;
                Object objM4072s = AbstractC1856a.m4072s(c1586h);
                if (InterfaceC1892j.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s != null) {
                    m4157a(this, abstractC1856aM4158b, (InterfaceC1892j) objM4072s);
                }
                this.f7180e.f7187g = null;
            }
        }
    }
}
