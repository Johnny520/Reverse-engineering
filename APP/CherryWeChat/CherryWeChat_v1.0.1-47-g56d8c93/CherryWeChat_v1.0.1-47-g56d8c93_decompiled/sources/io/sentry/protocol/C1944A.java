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

    public C1944A(ArrayList arrayList, HashMap map, C1864d2 c1864d2) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f6842s = arrayList2;
        HashMap map2 = new HashMap();
        this.f6843t = map2;
        this.f6839p = "";
        this.f6840q = dValueOf;
        this.f6841r = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f6843t.putAll(((C1973w) it.next()).f7031l);
        }
        this.f6844u = c1864d2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6839p != null) {
            c1901c.m4106p("transaction");
            c1901c.m4115z(this.f6839p);
        }
        c1901c.m4106p("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f6840q.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c1901c.m4112w(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.f6841r != null) {
            c1901c.m4106p("timestamp");
            c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f6841r.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.f6842s;
        if (!arrayList.isEmpty()) {
            c1901c.m4106p("spans");
            c1901c.m4112w(iLogger, arrayList);
        }
        c1901c.m4106p("type");
        c1901c.m4115z("transaction");
        HashMap map = this.f6843t;
        if (!map.isEmpty()) {
            c1901c.m4106p("measurements");
            c1901c.m4112w(iLogger, map);
        }
        c1901c.m4106p("transaction_info");
        c1901c.m4112w(iLogger, this.f6844u);
        AbstractC1856a.m4049E(this, c1901c, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f6845v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6845v, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1944A(C1573D2 c1573d2) {
        super(c1573d2.f5628a);
        this.f6842s = new ArrayList();
        this.f6843t = new HashMap();
        C1585G2 c1585g2 = c1573d2.f5629b;
        this.f6840q = Double.valueOf(c1585g2.f5717a.mo3672d() / 1.0E9d);
        this.f6841r = Double.valueOf(c1585g2.f5717a.mo3671c(c1585g2.f5718b) / 1.0E9d);
        this.f6839p = c1573d2.f5632e;
        for (C1585G2 c1585g22 : c1573d2.f5630c) {
            if (Boolean.TRUE.equals(c1585g22.m3665v())) {
                this.f6842s.add(new C1973w(c1585g22));
            }
        }
        C1953c c1953c = this.f5605b;
        c1953c.mo4129k(c1573d2.f5643p);
        C1589H2 c1589h2 = c1585g2.f5719c;
        ConcurrentHashMap concurrentHashMap = c1585g2.f5726j;
        C1589H2 c1589h22 = new C1589H2(c1589h2.f5738a, c1589h2.f5739b, c1589h2.f5740c, c1589h2.f5742e, c1589h2.f5743f, c1589h2.f5741d, c1589h2.f5744g, c1589h2.f5746i);
        for (Map.Entry entry : c1589h2.f5745h.entrySet()) {
            m3606b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        c1589h22.f5747j.remove(str);
                    } else {
                        c1589h22.f5747j.put(str, value);
                    }
                }
            }
        }
        c1953c.mo4138t(c1589h22);
        this.f6844u = new C1864d2(1, c1573d2.f5641n.apiName());
    }
}
