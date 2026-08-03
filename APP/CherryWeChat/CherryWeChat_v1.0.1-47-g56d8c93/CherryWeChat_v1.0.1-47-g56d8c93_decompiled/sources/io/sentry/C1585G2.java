package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1960j;
import io.sentry.util.AbstractC2037i;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C1094Zd;
import p000.C2464rl;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1585G2 implements InterfaceC1876g0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1588H1 f5717a;

    /* JADX INFO: renamed from: b */
    public AbstractC1588H1 f5718b;

    /* JADX INFO: renamed from: c */
    public final C1589H2 f5719c;

    /* JADX INFO: renamed from: d */
    public final C1573D2 f5720d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1651Z f5721e;

    /* JADX INFO: renamed from: h */
    public final C1094Zd f5724h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1593I2 f5725i;

    /* JADX INFO: renamed from: f */
    public boolean f5722f = false;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f5723g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f5726j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f5727k = new ConcurrentHashMap();

    public C1585G2(C1573D2 c1573d2, C2045v1 c2045v1, C1589H2 c1589h2, C1094Zd c1094Zd, C2464rl c2464rl) {
        new ConcurrentHashMap();
        new C2029a();
        this.f5719c = c1589h2;
        c1589h2.f5746i = (String) c1094Zd.f3480d;
        AbstractC1856a.m4048D("transaction is required", c1573d2);
        this.f5720d = c1573d2;
        AbstractC1856a.m4048D("Scopes are required", c2045v1);
        this.f5721e = c2045v1;
        this.f5724h = c1094Zd;
        this.f5725i = c2464rl;
        AbstractC1588H1 abstractC1588H1 = (AbstractC1588H1) c1094Zd.f3478b;
        if (abstractC1588H1 != null) {
            this.f5717a = abstractC1588H1;
        } else {
            this.f5717a = c2045v1.mo3718l().getDateProvider().mo3603a();
        }
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: c */
    public final void mo3617c(String str) {
        this.f5719c.f5743f = str;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: d */
    public final void mo3618d(String str, Object obj) {
        ConcurrentHashMap concurrentHashMap = this.f5726j;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: e */
    public final InterfaceC1876g0 mo3619e(String str, AbstractC1588H1 abstractC1588H1, EnumC1930n0 enumC1930n0) {
        return mo3633s("activity.load", str, abstractC1588H1, enumC1930n0, new C1094Zd());
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: f */
    public final boolean mo3620f() {
        return this.f5722f;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: i */
    public final String mo3623i() {
        return this.f5719c.f5743f;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: j */
    public final void mo3624j(Number number, String str) {
        if (this.f5722f) {
            this.f5721e.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f5727k.put(str, new C1960j(number, null));
        C1573D2 c1573d2 = this.f5720d;
        C1585G2 c1585g2 = c1573d2.f5629b;
        if (c1585g2 == this || c1585g2.f5727k.containsKey(str)) {
            return;
        }
        c1573d2.mo3624j(number, str);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: l */
    public final void mo3626l(String str, Long l, InterfaceC1583G0 interfaceC1583G0) {
        if (this.f5722f) {
            this.f5721e.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f5727k.put(str, new C1960j(l, interfaceC1583G0.apiName()));
        C1573D2 c1573d2 = this.f5720d;
        C1585G2 c1585g2 = c1573d2.f5629b;
        if (c1585g2 == this || c1585g2.f5727k.containsKey(str)) {
            return;
        }
        c1573d2.mo3626l(str, l, interfaceC1583G0);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: m */
    public final C1589H2 mo3627m() {
        return this.f5719c;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: n */
    public final void mo3628n(EnumC1605L2 enumC1605L2) {
        mo3631q(enumC1605L2, this.f5721e.mo3718l().getDateProvider().mo3603a());
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: o */
    public final EnumC1605L2 mo3629o() {
        return this.f5719c.f5744g;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: p */
    public final AbstractC1588H1 mo3630p() {
        return this.f5718b;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: q */
    public final void mo3631q(EnumC1605L2 enumC1605L2, AbstractC1588H1 abstractC1588H1) {
        AbstractC1588H1 abstractC1588H12;
        AbstractC1588H1 abstractC1588H13;
        if (this.f5722f || !this.f5723g.compareAndSet(false, true)) {
            return;
        }
        C1589H2 c1589h2 = this.f5719c;
        c1589h2.f5744g = enumC1605L2;
        C1601K2 c1601k2 = c1589h2.f5739b;
        if (abstractC1588H1 == null) {
            abstractC1588H1 = this.f5721e.mo3718l().getDateProvider().mo3603a();
        }
        this.f5718b = abstractC1588H1;
        C1094Zd c1094Zd = this.f5724h;
        c1094Zd.getClass();
        if (c1094Zd.f3477a) {
            C1573D2 c1573d2 = this.f5720d;
            C1585G2 c1585g2 = c1573d2.f5629b;
            CopyOnWriteArrayList<C1585G2> copyOnWriteArrayList = c1573d2.f5630c;
            List<C1585G2> list = copyOnWriteArrayList;
            if (!c1585g2.f5719c.f5739b.equals(c1601k2)) {
                ArrayList arrayList = new ArrayList();
                for (C1585G2 c1585g22 : copyOnWriteArrayList) {
                    C1601K2 c1601k22 = c1585g22.f5719c.f5740c;
                    if (c1601k22 != null && c1601k22.equals(c1601k2)) {
                        arrayList.add(c1585g22);
                    }
                }
                list = arrayList;
            }
            AbstractC1588H1 abstractC1588H14 = null;
            AbstractC1588H1 abstractC1588H15 = null;
            for (C1585G2 c1585g23 : list) {
                if (abstractC1588H14 == null || c1585g23.f5717a.mo3670b(abstractC1588H14) < 0) {
                    abstractC1588H14 = c1585g23.f5717a;
                }
                if (abstractC1588H15 == null || ((abstractC1588H13 = c1585g23.f5718b) != null && abstractC1588H13.mo3670b(abstractC1588H15) > 0)) {
                    abstractC1588H15 = c1585g23.f5718b;
                }
            }
            if (c1094Zd.f3477a && abstractC1588H15 != null && (((abstractC1588H12 = this.f5718b) == null || abstractC1588H12.mo3670b(abstractC1588H15) > 0) && this.f5718b != null)) {
                this.f5718b = abstractC1588H15;
            }
        }
        InterfaceC1593I2 interfaceC1593I2 = this.f5725i;
        if (interfaceC1593I2 != null) {
            interfaceC1593I2.mo3614d(this);
        }
        this.f5722f = true;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: r */
    public final void mo3632r() {
        mo3628n(this.f5719c.f5744g);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: s */
    public final InterfaceC1876g0 mo3633s(String str, String str2, AbstractC1588H1 abstractC1588H1, EnumC1930n0 enumC1930n0, C1094Zd c1094Zd) {
        boolean z = this.f5722f;
        C1637U0 c1637u0 = C1637U0.f5870a;
        if (!z) {
            C1601K2 c1601k2 = this.f5719c.f5739b;
            C1573D2 c1573d2 = this.f5720d;
            C1585G2 c1585g2 = c1573d2.f5629b;
            C1589H2 c1589h2 = c1585g2.f5719c;
            C1589H2 c1589h22 = new C1589H2(c1589h2.f5738a, new C1601K2(), c1601k2, str, null, c1589h2.f5741d, null, "manual");
            c1589h22.f5743f = str2;
            c1589h22.f5749l = enumC1930n0;
            c1094Zd.f3478b = abstractC1588H1;
            CopyOnWriteArrayList copyOnWriteArrayList = c1573d2.f5630c;
            C2045v1 c2045v1 = c1573d2.f5631d;
            if (!c1585g2.f5722f && c1573d2.f5642o.equals(enumC1930n0)) {
                if (!AbstractC2037i.m4181a((String) c1094Zd.f3480d, c2045v1.mo3718l().getIgnoredSpanOrigins())) {
                    String str3 = c1589h22.f5743f;
                    int size = copyOnWriteArrayList.size();
                    int maxSpans = c2045v1.mo3718l().getMaxSpans();
                    String str4 = c1589h22.f5742e;
                    if (size >= maxSpans) {
                        c2045v1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str4, str3);
                        return c1637u0;
                    }
                    AbstractC1856a.m4048D("parentSpanId is required", c1589h22.f5740c);
                    AbstractC1856a.m4048D("operation is required", str4);
                    c1573d2.m3637w();
                    C1585G2 c1585g22 = new C1585G2(c1573d2, c1573d2.f5631d, c1589h22, c1094Zd, new C2464rl(6, c1573d2));
                    c1573d2.m3639y(c1585g22);
                    copyOnWriteArrayList.add(c1585g22);
                    InterfaceC1925m interfaceC1925m = c1573d2.f5644q;
                    if (interfaceC1925m != null) {
                        interfaceC1925m.mo3674a(c1585g22);
                    }
                    return c1585g22;
                }
            }
        }
        return c1637u0;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: u */
    public final AbstractC1588H1 mo3635u() {
        return this.f5717a;
    }

    /* JADX INFO: renamed from: v */
    public final Boolean m3665v() {
        C2648vx c2648vx = this.f5719c.f5741d;
        if (c2648vx == null) {
            return null;
        }
        return (Boolean) c2648vx.f9162a;
    }

    public C1585G2(C1621P2 c1621p2, C1573D2 c1573d2, C2045v1 c2045v1, C1625Q2 c1625q2) {
        new ConcurrentHashMap();
        new C2029a();
        this.f5719c = c1621p2;
        c1621p2.f5746i = (String) c1625q2.f3480d;
        this.f5720d = c1573d2;
        this.f5721e = c2045v1;
        this.f5725i = null;
        AbstractC1588H1 abstractC1588H1 = (AbstractC1588H1) c1625q2.f3478b;
        if (abstractC1588H1 != null) {
            this.f5717a = abstractC1588H1;
        } else {
            this.f5717a = c2045v1.mo3718l().getDateProvider().mo3603a();
        }
        this.f5724h = c1625q2;
    }
}
