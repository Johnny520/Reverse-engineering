package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
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
    public final void serialize(InterfaceC1652Z0 r5, ILogger r6) {
        C1901c r52 = (C1901c) r5;
        r52.m4101h();
        r52.m4106p("type");
        r52.m4112w(r6, this.f7115a);
        r52.m4106p("timestamp");
        r52.m4111v(this.f7116b);
        r52.m4106p("data");
        r52.m4101h();
        r52.m4106p("tag");
        r52.m4115z(this.f7105c);
        r52.m4106p("payload");
        r52.m4101h();
        if (this.f7107e == null) goto L5;
        r52.m4106p("type");
        r52.m4115z(this.f7107e);
    L5:
        r52.m4106p("timestamp");
        r52.m4112w(r6, BigDecimal.valueOf(this.f7106d));
        if (this.f7108f == null) goto L9;
        r52.m4106p("category");
        r52.m4115z(this.f7108f);
    L9:
        if (this.f7109g == null) goto L12;
        r52.m4106p("message");
        r52.m4115z(this.f7109g);
    L12:
        if (this.f7110h == null) goto L15;
        r52.m4106p("level");
        r52.m4112w(r6, this.f7110h);
    L15:
        if (this.f7111i == null) goto L17;
        r52.m4106p("data");
        r52.m4112w(r6, this.f7111i);
    L17:
        ConcurrentHashMap r0 = this.f7113k;
        if (r0 == null) goto L23;
        Iterator r02 = r0.keySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L23;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7113k, r1, r52, r1, r6);
    L23:
        r52.m4102k();
        ConcurrentHashMap r03 = this.f7114l;
        if (r03 == null) goto L29;
        Iterator r04 = r03.keySet().iterator();
    L27:
        if (r04.hasNext() == false) goto L29;
        String r12 = (String) r04.next();
        AbstractC1861d.m4087b(this.f7114l, r12, r52, r12, r6);
    L29:
        r52.m4102k();
        HashMap r05 = this.f7112j;
        if (r05 == null) goto L35;
        Iterator r06 = r05.keySet().iterator();
    L33:
        if (r06.hasNext() == false) goto L35;
        String r13 = (String) r06.next();
        AbstractC1861d.m4086a(this.f7112j, r13, r52, r13, r6);
    L35:
        r52.m4102k();
    }
}
