package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1985a extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7105c;

    /* JADX INFO: renamed from: d */
    public double f7106d;

    /* JADX INFO: renamed from: e */
    public String f7107e;

    /* JADX INFO: renamed from: f */
    public String f7108f;

    /* JADX INFO: renamed from: g */
    public String f7109g;

    /* JADX INFO: renamed from: h */
    public EnumC1657a2 f7110h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap f7111i;

    /* JADX INFO: renamed from: j */
    public HashMap f7112j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap f7113k;

    /* JADX INFO: renamed from: l */
    public ConcurrentHashMap f7114l;

    public C1985a() {
        super(EnumC1987c.Custom);
        this.f7105c = "breadcrumb";
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
        c1901c.m4115z(this.f7105c);
        c1901c.m4106p("payload");
        c1901c.m4101h();
        if (this.f7107e != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.f7107e);
        }
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f7106d));
        if (this.f7108f != null) {
            c1901c.m4106p("category");
            c1901c.m4115z(this.f7108f);
        }
        if (this.f7109g != null) {
            c1901c.m4106p("message");
            c1901c.m4115z(this.f7109g);
        }
        if (this.f7110h != null) {
            c1901c.m4106p("level");
            c1901c.m4112w(iLogger, this.f7110h);
        }
        if (this.f7111i != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f7111i);
        }
        ConcurrentHashMap concurrentHashMap = this.f7113k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7113k, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        ConcurrentHashMap concurrentHashMap2 = this.f7114l;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC1861d.m4087b(this.f7114l, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
        HashMap map = this.f7112j;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC1861d.m4086a(this.f7112j, str3, c1901c, str3, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
