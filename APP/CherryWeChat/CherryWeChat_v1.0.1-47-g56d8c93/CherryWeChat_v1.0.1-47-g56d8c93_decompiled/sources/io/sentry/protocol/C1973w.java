package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C1585G2;
import io.sentry.C1589H2;
import io.sentry.C1601K2;
import io.sentry.EnumC1605L2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1973w implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final Double f7020a;

    /* JADX INFO: renamed from: b */
    public final Double f7021b;

    /* JADX INFO: renamed from: c */
    public final C1970t f7022c;

    /* JADX INFO: renamed from: d */
    public final C1601K2 f7023d;

    /* JADX INFO: renamed from: e */
    public final C1601K2 f7024e;

    /* JADX INFO: renamed from: f */
    public final String f7025f;

    /* JADX INFO: renamed from: g */
    public final String f7026g;

    /* JADX INFO: renamed from: h */
    public final EnumC1605L2 f7027h;

    /* JADX INFO: renamed from: i */
    public final String f7028i;

    /* JADX INFO: renamed from: j */
    public final Map f7029j;

    /* JADX INFO: renamed from: k */
    public Map f7030k;

    /* JADX INFO: renamed from: l */
    public final Map f7031l;

    /* JADX INFO: renamed from: m */
    public ConcurrentHashMap f7032m;

    public C1973w(Double d, Double d2, C1970t c1970t, C1601K2 c1601k2, C1601K2 c1601k22, String str, String str2, EnumC1605L2 enumC1605L2, String str3, Map map, Map map2, Map map3) {
        this.f7020a = d;
        this.f7021b = d2;
        this.f7022c = c1970t;
        this.f7023d = c1601k2;
        this.f7024e = c1601k22;
        this.f7025f = str;
        this.f7026g = str2;
        this.f7027h = enumC1605L2;
        this.f7028i = str3;
        this.f7029j = map;
        this.f7031l = map2;
        this.f7030k = map3;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f7020a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c1901c.m4112w(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.f7021b;
        if (d != null) {
            c1901c.m4106p("timestamp");
            c1901c.m4112w(iLogger, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        c1901c.m4106p("trace_id");
        c1901c.m4112w(iLogger, this.f7022c);
        c1901c.m4106p("span_id");
        c1901c.m4112w(iLogger, this.f7023d);
        C1601K2 c1601k2 = this.f7024e;
        if (c1601k2 != null) {
            c1901c.m4106p("parent_span_id");
            c1901c.m4112w(iLogger, c1601k2);
        }
        c1901c.m4106p("op");
        c1901c.m4115z(this.f7025f);
        String str = this.f7026g;
        if (str != null) {
            c1901c.m4106p("description");
            c1901c.m4115z(str);
        }
        EnumC1605L2 enumC1605L2 = this.f7027h;
        if (enumC1605L2 != null) {
            c1901c.m4106p("status");
            c1901c.m4112w(iLogger, enumC1605L2);
        }
        String str2 = this.f7028i;
        if (str2 != null) {
            c1901c.m4106p("origin");
            c1901c.m4112w(iLogger, str2);
        }
        Map map = this.f7029j;
        if (!map.isEmpty()) {
            c1901c.m4106p("tags");
            c1901c.m4112w(iLogger, map);
        }
        if (this.f7030k != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f7030k);
        }
        Map map2 = this.f7031l;
        if (!map2.isEmpty()) {
            c1901c.m4106p("measurements");
            c1901c.m4112w(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.f7032m;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7032m, str3, c1901c, str3, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public C1973w(C1585G2 c1585g2) {
        ConcurrentHashMap concurrentHashMap = c1585g2.f5726j;
        C1589H2 c1589h2 = c1585g2.f5719c;
        this.f7026g = c1589h2.f5743f;
        this.f7025f = c1589h2.f5742e;
        this.f7023d = c1589h2.f5739b;
        this.f7024e = c1589h2.f5740c;
        this.f7022c = c1589h2.f5738a;
        this.f7027h = c1589h2.f5744g;
        this.f7028i = c1589h2.f5746i;
        ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A(c1589h2.f5745h);
        this.f7029j = concurrentHashMapM4045A == null ? new ConcurrentHashMap() : concurrentHashMapM4045A;
        ConcurrentHashMap concurrentHashMapM4045A2 = AbstractC1856a.m4045A(c1585g2.f5727k);
        this.f7031l = concurrentHashMapM4045A2 == null ? new ConcurrentHashMap() : concurrentHashMapM4045A2;
        this.f7021b = c1585g2.f5718b == null ? null : Double.valueOf(c1585g2.f5717a.mo3671c(r1) / 1.0E9d);
        this.f7020a = Double.valueOf(c1585g2.f5717a.mo3672d() / 1.0E9d);
        this.f7030k = concurrentHashMap;
    }
}
