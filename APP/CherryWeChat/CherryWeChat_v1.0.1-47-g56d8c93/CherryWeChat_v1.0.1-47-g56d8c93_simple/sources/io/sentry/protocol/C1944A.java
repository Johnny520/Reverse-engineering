package io.sentry.protocol;

import io.sentry.AbstractC1568C1;
import io.sentry.AbstractC1861d;
import io.sentry.C1573D2;
import io.sentry.C1585G2;
import io.sentry.C1589H2;
import io.sentry.C1864d2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1944A extends AbstractC1568C1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: p */
    public String f6839p;

    /* JADX INFO: renamed from: q */
    public Double f6840q;

    /* JADX INFO: renamed from: r */
    public Double f6841r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f6842s;

    /* JADX INFO: renamed from: t */
    public final HashMap f6843t;

    /* JADX INFO: renamed from: u */
    public C1864d2 f6844u;

    /* JADX INFO: renamed from: v */
    public ConcurrentHashMap f6845v;

    public C1944A(ArrayList r5, HashMap r6, C1864d2 r7) {
        Double r0 = Double.valueOf(0.0d);
        ArrayList r1 = new ArrayList();
        this.f6842s = r1;
        HashMap r2 = new HashMap();
        this.f6843t = r2;
        this.f6839p = "";
        this.f6840q = r0;
        this.f6841r = null;
        r1.addAll(r5);
        r2.putAll(r6);
        Iterator r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        C1973w r62 = (C1973w) r52.next();
        this.f6843t.putAll(r62.f7031l);
        goto L4
    L6:
        this.f6844u = r7;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r7, ILogger r8) {
        C1901c r72 = (C1901c) r7;
        r72.m4101h();
        if (this.f6839p == null) goto L5;
        r72.m4106p("transaction");
        r72.m4115z(this.f6839p);
    L5:
        r72.m4106p("start_timestamp");
        BigDecimal r0 = BigDecimal.valueOf(this.f6840q.doubleValue());
        RoundingMode r2 = RoundingMode.DOWN;
        r72.m4112w(r8, r0.setScale(6, r2));
        if (this.f6841r == null) goto L8;
        r72.m4106p("timestamp");
        r72.m4112w(r8, BigDecimal.valueOf(this.f6841r.doubleValue()).setScale(6, r2));
    L8:
        ArrayList r02 = this.f6842s;
        if (r02.isEmpty() == true) goto L11;
        r72.m4106p("spans");
        r72.m4112w(r8, r02);
    L11:
        r72.m4106p("type");
        r72.m4115z("transaction");
        HashMap r03 = this.f6843t;
        if (r03.isEmpty() == true) goto L14;
        r72.m4106p("measurements");
        r72.m4112w(r8, r03);
    L14:
        r72.m4106p("transaction_info");
        r72.m4112w(r8, this.f6844u);
        AbstractC1856a.m4049E(this, r72, r8);
        ConcurrentHashMap r04 = this.f6845v;
        if (r04 == null) goto L20;
        Iterator r05 = r04.keySet().iterator();
    L18:
        if (r05.hasNext() == false) goto L20;
        String r1 = (String) r05.next();
        AbstractC1861d.m4087b(this.f6845v, r1, r72, r1, r8);
    L20:
        r72.m4102k();
    }

    public C1944A(C1573D2 r13) {
        super(r13.f5628a);
        this.f6842s = new ArrayList();
        this.f6843t = new HashMap();
        C1585G2 r0 = r13.f5629b;
        this.f6840q = Double.valueOf(r0.f5717a.mo3672d() / 1.0E9d);
        this.f6841r = Double.valueOf(r0.f5717a.mo3671c(r0.f5718b) / 1.0E9d);
        this.f6839p = r13.f5632e;
        Iterator r1 = r13.f5630c.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        C1585G2 r2 = (C1585G2) r1.next();
        if (Boolean.TRUE.equals(r2.m3665v()) == false) goto L4;
        this.f6842s.add(new C1973w(r2));
        goto L4
    L8:
        C1953c r12 = this.f5605b;
        r12.mo4129k(r13.f5643p);
        C1589H2 r22 = r0.f5719c;
        ConcurrentHashMap r02 = r0.f5726j;
        C1589H2 r3 = new C1589H2(r22.f5738a, r22.f5739b, r22.f5740c, r22.f5742e, r22.f5743f, r22.f5741d, r22.f5744g, r22.f5746i);
        Iterator r23 = r22.f5745h.entrySet().iterator();
    L10:
        if (r23.hasNext() == false) goto L12;
        Map.Entry r4 = (Map.Entry) r23.next();
        m3606b((String) r4.getKey(), (String) r4.getValue());
        goto L10
    L12:
        if (r02 == null) goto L22;
        Iterator r03 = r02.entrySet().iterator();
    L15:
        if (r03.hasNext() == false) goto L22;
        Map.Entry r24 = (Map.Entry) r03.next();
        String r42 = (String) r24.getKey();
        Object r25 = r24.getValue();
        if (r42 == null) goto L15;
        if (r25 == null) goto L20;
        r3.f5747j.put(r42, r25);
        goto L15
    L20:
        r3.f5747j.remove(r42);
    L22:
        r12.mo4138t(r3);
        this.f6844u = new C1864d2(1, r13.f5641n.apiName());
    }
}
