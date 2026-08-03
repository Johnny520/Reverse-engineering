package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import io.sentry.util.AbstractC2038j;
import io.sentry.util.thread.InterfaceC2040a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
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

    public C1589H2(C1970t r10, C1601K2 r11, String r12, C1601K2 r13) {
        this(r10, r11, r13, r12, null, null, null, "manual");
    }

    /* JADX INFO: renamed from: a */
    public final void m3673a(C2648vx r4) {
        this.f5741d = r4;
        C1832c r0 = this.f5750m;
        if (r0 == null) goto L19;
        if (r4 == null) goto L21;
        Boolean r1 = (Boolean) r4.f9162a;
        Charset r2 = AbstractC2038j.f7226a;
        if (r1 != null) goto L9;
        String r12 = null;
    L10:
        r0.m3996b("sentry-sampled", r12);
        Double r13 = (Double) r4.f9164c;
        if (r13 != null) goto L13;
    L15:
        Double r42 = (Double) r4.f9163b;
        if (r42 == null) goto L20;
        r0.f6620c = r42;
        return;
    L20:
        return;
    L13:
        if (r0.f6622e == false) goto L15;
        r0.f6621d = r13;
        goto L15
    L9:
        r12 = r1.toString();
        goto L10
    L21:
        return;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1589H2) == true) goto L8;
        return false;
    L8:
        C1589H2 r52 = (C1589H2) r5;
        if (this.f5738a.equals(r52.f5738a) == true) goto L11;
    L21:
        return false;
    L11:
        if (this.f5739b.equals(r52.f5739b) == false) goto L21;
        if (AbstractC1856a.m4063i(this.f5740c, r52.f5740c) == false) goto L21;
        if (this.f5742e.equals(r52.f5742e) == false) goto L21;
        if (AbstractC1856a.m4063i(this.f5743f, r52.f5743f) == false) goto L21;
        if (this.f5744g != r52.f5744g) goto L21;
        return true;
    }

    public final int hashCode() {
        String r4 = this.f5743f;
        EnumC1605L2 r5 = this.f5744g;
        return Arrays.hashCode(new Object[]{this.f5738a, this.f5739b, this.f5740c, this.f5742e, r4, r5});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("trace_id");
        this.f5738a.serialize(r42, r5);
        r42.m4106p("span_id");
        this.f5739b.serialize(r42, r5);
        C1601K2 r0 = this.f5740c;
        if (r0 == null) goto L5;
        r42.m4106p("parent_span_id");
        r0.serialize(r42, r5);
    L5:
        r42.m4106p("op");
        r42.m4115z(this.f5742e);
        if (this.f5743f == null) goto L9;
        r42.m4106p("description");
        r42.m4115z(this.f5743f);
    L9:
        if (this.f5744g == null) goto L12;
        r42.m4106p("status");
        r42.m4112w(r5, this.f5744g);
    L12:
        if (this.f5746i == null) goto L15;
        r42.m4106p("origin");
        r42.m4112w(r5, this.f5746i);
    L15:
        if (this.f5745h.isEmpty() == true) goto L18;
        r42.m4106p("tags");
        r42.m4112w(r5, this.f5745h);
    L18:
        if (this.f5747j.isEmpty() == true) goto L20;
        r42.m4106p("data");
        r42.m4112w(r5, this.f5747j);
    L20:
        ConcurrentHashMap r02 = this.f5748k;
        if (r02 == null) goto L26;
        Iterator r03 = r02.keySet().iterator();
    L24:
        if (r03.hasNext() == false) goto L26;
        String r1 = (String) r03.next();
        AbstractC1861d.m4087b(this.f5748k, r1, r42, r1, r5);
    L26:
        r42.m4102k();
    }

    public C1589H2(C1970t r2, C1601K2 r3, C1601K2 r4, String r5, String r6, C2648vx r7, EnumC1605L2 r8, String r9) {
        this.f5745h = new ConcurrentHashMap();
        this.f5746i = "manual";
        this.f5747j = new ConcurrentHashMap();
        this.f5749l = EnumC1930n0.SENTRY;
        AbstractC1856a.m4048D("traceId is required", r2);
        this.f5738a = r2;
        AbstractC1856a.m4048D("spanId is required", r3);
        this.f5739b = r3;
        AbstractC1856a.m4048D("operation is required", r5);
        this.f5742e = r5;
        this.f5740c = r4;
        this.f5743f = r6;
        this.f5744g = r8;
        this.f5746i = r9;
        m3673a(r7);
        InterfaceC2040a r22 = AbstractC2066z1.m4233b().mo3718l().getThreadChecker();
        this.f5747j.put("thread.id", String.valueOf(r22.mo3901b()));
        this.f5747j.put("thread.name", r22.mo3900a());
    }

    public C1589H2(C1589H2 r2) {
        this.f5745h = new ConcurrentHashMap();
        this.f5746i = "manual";
        this.f5747j = new ConcurrentHashMap();
        this.f5749l = EnumC1930n0.SENTRY;
        this.f5738a = r2.f5738a;
        this.f5739b = r2.f5739b;
        this.f5740c = r2.f5740c;
        m3673a(r2.f5741d);
        this.f5742e = r2.f5742e;
        this.f5743f = r2.f5743f;
        this.f5744g = r2.f5744g;
        ConcurrentHashMap r0 = AbstractC1856a.m4045A(r2.f5745h);
        if (r0 == null) goto L5;
        this.f5745h = r0;
    L5:
        ConcurrentHashMap r02 = AbstractC1856a.m4045A(r2.f5748k);
        if (r02 == null) goto L8;
        this.f5748k = r02;
    L8:
        this.f5750m = r2.f5750m;
        ConcurrentHashMap r22 = AbstractC1856a.m4045A(r2.f5747j);
        if (r22 == null) goto L12;
        this.f5747j = r22;
        return;
    }
}
