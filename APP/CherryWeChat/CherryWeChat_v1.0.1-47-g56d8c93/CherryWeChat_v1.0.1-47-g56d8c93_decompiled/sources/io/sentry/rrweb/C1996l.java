package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
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
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("type");
        c1901c.m4112w(iLogger, this.f7115a);
        c1901c.m4106p("timestamp");
        c1901c.m4111v(this.f7116b);
        c1901c.m4106p("data");
        c1901c.m4101h();
        c1901c.m4106p("tag");
        c1901c.m4115z(this.f7141c);
        c1901c.m4106p("payload");
        c1901c.m4101h();
        if (this.f7142d != null) {
            c1901c.m4106p("op");
            c1901c.m4115z(this.f7142d);
        }
        if (this.f7143e != null) {
            c1901c.m4106p("description");
            c1901c.m4115z(this.f7143e);
        }
        c1901c.m4106p("startTimestamp");
        c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f7144f));
        c1901c.m4106p("endTimestamp");
        c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f7145g));
        if (this.f7146h != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f7146h);
        }
        ConcurrentHashMap concurrentHashMap = this.f7148j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7148j, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        ConcurrentHashMap concurrentHashMap2 = this.f7149k;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC1861d.m4087b(this.f7149k, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
        HashMap map = this.f7147i;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC1861d.m4086a(this.f7147i, str3, c1901c, str3, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
