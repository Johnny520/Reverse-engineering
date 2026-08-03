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
import java.util.Iterator;
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

    public C1973w(Double r1, Double r2, C1970t r3, C1601K2 r4, C1601K2 r5, String r6, String r7, EnumC1605L2 r8, String r9, Map r10, Map r11, Map r12) {
        this.f7020a = r1;
        this.f7021b = r2;
        this.f7022c = r3;
        this.f7023d = r4;
        this.f7024e = r5;
        this.f7025f = r6;
        this.f7026g = r7;
        this.f7027h = r8;
        this.f7028i = r9;
        this.f7029j = r10;
        this.f7031l = r11;
        this.f7030k = r12;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r6, ILogger r7) {
        C1901c r62 = (C1901c) r6;
        r62.m4101h();
        r62.m4106p("start_timestamp");
        BigDecimal r0 = BigDecimal.valueOf(this.f7020a.doubleValue());
        RoundingMode r1 = RoundingMode.DOWN;
        r62.m4112w(r7, r0.setScale(6, r1));
        Double r02 = this.f7021b;
        if (r02 == null) goto L5;
        r62.m4106p("timestamp");
        r62.m4112w(r7, BigDecimal.valueOf(r02.doubleValue()).setScale(6, r1));
    L5:
        r62.m4106p("trace_id");
        r62.m4112w(r7, this.f7022c);
        r62.m4106p("span_id");
        r62.m4112w(r7, this.f7023d);
        C1601K2 r03 = this.f7024e;
        if (r03 == null) goto L8;
        r62.m4106p("parent_span_id");
        r62.m4112w(r7, r03);
    L8:
        r62.m4106p("op");
        r62.m4115z(this.f7025f);
        String r04 = this.f7026g;
        if (r04 == null) goto L11;
        r62.m4106p("description");
        r62.m4115z(r04);
    L11:
        EnumC1605L2 r05 = this.f7027h;
        if (r05 == null) goto L14;
        r62.m4106p("status");
        r62.m4112w(r7, r05);
    L14:
        String r06 = this.f7028i;
        if (r06 == null) goto L17;
        r62.m4106p("origin");
        r62.m4112w(r7, r06);
    L17:
        Map r07 = this.f7029j;
        if (r07.isEmpty() == true) goto L21;
        r62.m4106p("tags");
        r62.m4112w(r7, r07);
    L21:
        if (this.f7030k == null) goto L23;
        r62.m4106p("data");
        r62.m4112w(r7, this.f7030k);
    L23:
        Map r08 = this.f7031l;
        if (r08.isEmpty() == true) goto L26;
        r62.m4106p("measurements");
        r62.m4112w(r7, r08);
    L26:
        ConcurrentHashMap r09 = this.f7032m;
        if (r09 == null) goto L32;
        Iterator r010 = r09.keySet().iterator();
    L30:
        if (r010.hasNext() == false) goto L32;
        String r12 = (String) r010.next();
        AbstractC1861d.m4087b(this.f7032m, r12, r62, r12, r7);
    L32:
        r62.m4102k();
    }

    public C1973w(C1585G2 r7) {
        ConcurrentHashMap r0 = r7.f5726j;
        C1589H2 r1 = r7.f5719c;
        this.f7026g = r1.f5743f;
        this.f7025f = r1.f5742e;
        this.f7023d = r1.f5739b;
        this.f7024e = r1.f5740c;
        this.f7022c = r1.f5738a;
        this.f7027h = r1.f5744g;
        this.f7028i = r1.f5746i;
        ConcurrentHashMap r12 = AbstractC1856a.m4045A(r1.f5745h);
        if (r12 != null) goto L6;
        r12 = new ConcurrentHashMap();
    L6:
        this.f7029j = r12;
        ConcurrentHashMap r13 = AbstractC1856a.m4045A(r7.f5727k);
        if (r13 != null) goto L10;
        r13 = new ConcurrentHashMap();
    L10:
        this.f7031l = r13;
        if (r7.f5718b != null) goto L13;
        Double r14 = null;
    L14:
        this.f7021b = r14;
        this.f7020a = Double.valueOf(r7.f5717a.mo3672d() / 1.0E9d);
        this.f7030k = r0;
        return;
    L13:
        r14 = Double.valueOf(r7.f5717a.mo3671c(r1) / 1.0E9d);
        goto L14
    }
}
