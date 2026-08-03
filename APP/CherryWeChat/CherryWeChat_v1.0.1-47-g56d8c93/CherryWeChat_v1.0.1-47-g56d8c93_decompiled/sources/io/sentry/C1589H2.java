package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import io.sentry.util.AbstractC2038j;
import io.sentry.util.thread.InterfaceC2040a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.H2 */
/* JADX INFO: loaded from: classes.dex */
public class C1589H2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final C1970t f5738a;

    /* JADX INFO: renamed from: b */
    public final C1601K2 f5739b;

    /* JADX INFO: renamed from: c */
    public final C1601K2 f5740c;

    /* JADX INFO: renamed from: d */
    public transient C2648vx f5741d;

    /* JADX INFO: renamed from: e */
    public final String f5742e;

    /* JADX INFO: renamed from: f */
    public String f5743f;

    /* JADX INFO: renamed from: g */
    public EnumC1605L2 f5744g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap f5745h;

    /* JADX INFO: renamed from: i */
    public String f5746i;

    /* JADX INFO: renamed from: j */
    public Map f5747j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap f5748k;

    /* JADX INFO: renamed from: l */
    public EnumC1930n0 f5749l;

    /* JADX INFO: renamed from: m */
    public C1832c f5750m;

    public C1589H2(C1970t c1970t, C1601K2 c1601k2, String str, C1601K2 c1601k22) {
        this(c1970t, c1601k2, c1601k22, str, null, null, null, "manual");
    }

    /* JADX INFO: renamed from: a */
    public final void m3673a(C2648vx c2648vx) {
        this.f5741d = c2648vx;
        C1832c c1832c = this.f5750m;
        if (c1832c == null || c2648vx == null) {
            return;
        }
        Boolean bool = (Boolean) c2648vx.f9162a;
        Charset charset = AbstractC2038j.f7226a;
        c1832c.m3996b("sentry-sampled", bool == null ? null : bool.toString());
        Double d = (Double) c2648vx.f9164c;
        if (d != null && c1832c.f6622e) {
            c1832c.f6621d = d;
        }
        Double d2 = (Double) c2648vx.f9163b;
        if (d2 != null) {
            c1832c.f6620c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1589H2)) {
            return false;
        }
        C1589H2 c1589h2 = (C1589H2) obj;
        return this.f5738a.equals(c1589h2.f5738a) && this.f5739b.equals(c1589h2.f5739b) && AbstractC1856a.m4063i(this.f5740c, c1589h2.f5740c) && this.f5742e.equals(c1589h2.f5742e) && AbstractC1856a.m4063i(this.f5743f, c1589h2.f5743f) && this.f5744g == c1589h2.f5744g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5738a, this.f5739b, this.f5740c, this.f5742e, this.f5743f, this.f5744g});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("trace_id");
        this.f5738a.serialize(c1901c, iLogger);
        c1901c.m4106p("span_id");
        this.f5739b.serialize(c1901c, iLogger);
        C1601K2 c1601k2 = this.f5740c;
        if (c1601k2 != null) {
            c1901c.m4106p("parent_span_id");
            c1601k2.serialize(c1901c, iLogger);
        }
        c1901c.m4106p("op");
        c1901c.m4115z(this.f5742e);
        if (this.f5743f != null) {
            c1901c.m4106p("description");
            c1901c.m4115z(this.f5743f);
        }
        if (this.f5744g != null) {
            c1901c.m4106p("status");
            c1901c.m4112w(iLogger, this.f5744g);
        }
        if (this.f5746i != null) {
            c1901c.m4106p("origin");
            c1901c.m4112w(iLogger, this.f5746i);
        }
        if (!this.f5745h.isEmpty()) {
            c1901c.m4106p("tags");
            c1901c.m4112w(iLogger, this.f5745h);
        }
        if (!this.f5747j.isEmpty()) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f5747j);
        }
        ConcurrentHashMap concurrentHashMap = this.f5748k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f5748k, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1589H2(C1970t c1970t, C1601K2 c1601k2, C1601K2 c1601k22, String str, String str2, C2648vx c2648vx, EnumC1605L2 enumC1605L2, String str3) {
        this.f5745h = new ConcurrentHashMap();
        this.f5746i = "manual";
        this.f5747j = new ConcurrentHashMap();
        this.f5749l = EnumC1930n0.SENTRY;
        AbstractC1856a.m4048D("traceId is required", c1970t);
        this.f5738a = c1970t;
        AbstractC1856a.m4048D("spanId is required", c1601k2);
        this.f5739b = c1601k2;
        AbstractC1856a.m4048D("operation is required", str);
        this.f5742e = str;
        this.f5740c = c1601k22;
        this.f5743f = str2;
        this.f5744g = enumC1605L2;
        this.f5746i = str3;
        m3673a(c2648vx);
        InterfaceC2040a threadChecker = AbstractC2066z1.m4233b().mo3718l().getThreadChecker();
        this.f5747j.put("thread.id", String.valueOf(threadChecker.mo3901b()));
        this.f5747j.put("thread.name", threadChecker.mo3900a());
    }

    public C1589H2(C1589H2 c1589h2) {
        this.f5745h = new ConcurrentHashMap();
        this.f5746i = "manual";
        this.f5747j = new ConcurrentHashMap();
        this.f5749l = EnumC1930n0.SENTRY;
        this.f5738a = c1589h2.f5738a;
        this.f5739b = c1589h2.f5739b;
        this.f5740c = c1589h2.f5740c;
        m3673a(c1589h2.f5741d);
        this.f5742e = c1589h2.f5742e;
        this.f5743f = c1589h2.f5743f;
        this.f5744g = c1589h2.f5744g;
        ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A(c1589h2.f5745h);
        if (concurrentHashMapM4045A != null) {
            this.f5745h = concurrentHashMapM4045A;
        }
        ConcurrentHashMap concurrentHashMapM4045A2 = AbstractC1856a.m4045A(c1589h2.f5748k);
        if (concurrentHashMapM4045A2 != null) {
            this.f5748k = concurrentHashMapM4045A2;
        }
        this.f5750m = c1589h2.f5750m;
        ConcurrentHashMap concurrentHashMapM4045A3 = AbstractC1856a.m4045A(c1589h2.f5747j);
        if (concurrentHashMapM4045A3 != null) {
            this.f5747j = concurrentHashMapM4045A3;
        }
    }
}
