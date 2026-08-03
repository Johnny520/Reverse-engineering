package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1996l extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7141c;

    /* JADX INFO: renamed from: d */
    public String f7142d;

    /* JADX INFO: renamed from: e */
    public String f7143e;

    /* JADX INFO: renamed from: f */
    public double f7144f;

    /* JADX INFO: renamed from: g */
    public double f7145g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap f7146h;

    /* JADX INFO: renamed from: i */
    public HashMap f7147i;

    /* JADX INFO: renamed from: j */
    public ConcurrentHashMap f7148j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap f7149k;

    public C1996l() {
        super(EnumC1987c.Custom);
        this.f7141c = "performanceSpan";
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4112w(r5, this.f7115a);
        r42.m4106p("timestamp");
        r42.m4111v(this.f7116b);
        r42.m4106p("data");
        r42.m4101h();
        r42.m4106p("tag");
        r42.m4115z(this.f7141c);
        r42.m4106p("payload");
        r42.m4101h();
        if (this.f7142d == null) goto L6;
        r42.m4106p("op");
        r42.m4115z(this.f7142d);
    L6:
        if (this.f7143e == null) goto L8;
        r42.m4106p("description");
        r42.m4115z(this.f7143e);
    L8:
        r42.m4106p("startTimestamp");
        r42.m4112w(r5, BigDecimal.valueOf(this.f7144f));
        r42.m4106p("endTimestamp");
        r42.m4112w(r5, BigDecimal.valueOf(this.f7145g));
        if (this.f7146h == null) goto L11;
        r42.m4106p("data");
        r42.m4112w(r5, this.f7146h);
    L11:
        ConcurrentHashMap r0 = this.f7148j;
        if (r0 == null) goto L17;
        Iterator r02 = r0.keySet().iterator();
    L15:
        if (r02.hasNext() == false) goto L17;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7148j, r1, r42, r1, r5);
    L17:
        r42.m4102k();
        ConcurrentHashMap r03 = this.f7149k;
        if (r03 == null) goto L23;
        Iterator r04 = r03.keySet().iterator();
    L21:
        if (r04.hasNext() == false) goto L23;
        String r12 = (String) r04.next();
        AbstractC1861d.m4087b(this.f7149k, r12, r42, r12, r5);
    L23:
        r42.m4102k();
        HashMap r05 = this.f7147i;
        if (r05 == null) goto L29;
        Iterator r06 = r05.keySet().iterator();
    L27:
        if (r06.hasNext() == false) goto L29;
        String r13 = (String) r06.next();
        AbstractC1861d.m4086a(this.f7147i, r13, r42, r13, r5);
    L29:
        r42.m4102k();
    }
}
