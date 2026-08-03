package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1960j;
import io.sentry.util.AbstractC2037i;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Iterator;
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

    /* JADX INFO: renamed from: f */
    public boolean f5722f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f5723g;

    /* JADX INFO: renamed from: h */
    public final C1094Zd f5724h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1593I2 f5725i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f5726j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f5727k;

    public C1585G2(C1573D2 r3, C2045v1 r4, C1589H2 r5, C1094Zd r6, C2464rl r7) {
        this.f5722f = false;
        this.f5723g = new AtomicBoolean(false);
        this.f5726j = new ConcurrentHashMap();
        this.f5727k = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new C2029a();
        this.f5719c = r5;
        r5.f5746i = (String) r6.f3480d;
        AbstractC1856a.m4048D("transaction is required", r3);
        this.f5720d = r3;
        AbstractC1856a.m4048D("Scopes are required", r4);
        this.f5721e = r4;
        this.f5724h = r6;
        this.f5725i = r7;
        AbstractC1588H1 r32 = (AbstractC1588H1) r6.f3478b;
        if (r32 == null) goto L6;
        this.f5717a = r32;
        return;
    L6:
        this.f5717a = r4.mo3718l().getDateProvider().mo3603a();
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: c */
    public final void mo3617c(String r2) {
        this.f5719c.f5743f = r2;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: d */
    public final void mo3618d(String r2, Object r3) {
        ConcurrentHashMap r0 = this.f5726j;
        if (r3 != null) goto L6;
        r0.remove(r2);
        return;
    L6:
        r0.put(r2, r3);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: e */
    public final InterfaceC1876g0 mo3619e(String r7, AbstractC1588H1 r8, EnumC1930n0 r9) {
        return mo3633s("activity.load", r7, r8, r9, new C1094Zd());
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
    public final void mo3624j(Number r3, String r4) {
        if (this.f5722f == false) goto L6;
        this.f5721e.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The span is already finished. Measurement %s cannot be set", new Object[]{r4});
        return;
    L6:
        C1960j r0 = new C1960j(r3, null);
        this.f5727k.put(r4, r0);
        C1573D2 r02 = this.f5720d;
        C1585G2 r1 = r02.f5629b;
        if (r1 != this) goto L9;
        return;
    L9:
        if (r1.f5727k.containsKey(r4) == true) goto L13;
        r02.mo3624j(r3, r4);
        return;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: l */
    public final void mo3626l(String r3, Long r4, InterfaceC1583G0 r5) {
        if (this.f5722f == false) goto L6;
        this.f5721e.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The span is already finished. Measurement %s cannot be set", new Object[]{r3});
        return;
    L6:
        C1960j r0 = new C1960j(r4, r5.apiName());
        this.f5727k.put(r3, r0);
        C1573D2 r02 = this.f5720d;
        C1585G2 r1 = r02.f5629b;
        if (r1 != this) goto L9;
        return;
    L9:
        if (r1.f5727k.containsKey(r3) == true) goto L13;
        r02.mo3626l(r3, r4, r5);
        return;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: m */
    public final C1589H2 mo3627m() {
        return this.f5719c;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: n */
    public final void mo3628n(EnumC1605L2 r2) {
        mo3631q(r2, this.f5721e.mo3718l().getDateProvider().mo3603a());
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
    public final void mo3631q(EnumC1605L2 r9, AbstractC1588H1 r10) {
        if (this.f5722f == false) goto L5;
        return;
    L5:
        if (this.f5723g.compareAndSet(false, true) == false) goto L69;
        C1589H2 r0 = this.f5719c;
        r0.f5744g = r9;
        C1601K2 r92 = r0.f5739b;
        if (r10 != null) goto L10;
        r10 = this.f5721e.mo3718l().getDateProvider().mo3603a();
    L10:
        this.f5718b = r10;
        C1094Zd r102 = this.f5724h;
        r102.getClass();
        if (r102.f3477a == false) goto L48;
        C1573D2 r02 = this.f5720d;
        C1585G2 r1 = r02.f5629b;
        CopyOnWriteArrayList r03 = r02.f5630c;
        List r04 = r03;
        if (r1.f5719c.f5739b.equals(r92) == true) goto L24;
        ArrayList r12 = new ArrayList();
        Iterator r05 = r03.iterator();
    L17:
        if (r05.hasNext() == false) goto L23;
        C1585G2 r3 = (C1585G2) r05.next();
        C1601K2 r4 = r3.f5719c.f5740c;
        if (r4 == null) goto L17;
        if (r4.equals(r92) == false) goto L17;
        r12.add(r3);
        goto L17
    L23:
        r04 = r12;
    L24:
        Iterator r93 = r04.iterator();
        AbstractC1588H1 r06 = null;
        AbstractC1588H1 r13 = null;
    L26:
        if (r93.hasNext() == false) goto L39;
        C1585G2 r32 = (C1585G2) r93.next();
        if (r06 != null) goto L30;
    L31:
        r06 = r32.f5717a;
    L32:
        if (r13 == null) goto L37;
        AbstractC1588H1 r6 = r32.f5718b;
        if (r6 == null) goto L26;
        if (r6.mo3670b(r13) <= 0) goto L26;
    L37:
        r13 = r32.f5718b;
        goto L26
    L30:
        if (r32.f5717a.mo3670b(r06) >= 0) goto L32;
    L39:
        if (r102.f3477a == false) goto L48;
        if (r13 == null) goto L48;
        AbstractC1588H1 r94 = this.f5718b;
        if (r94 == null) goto L46;
        if (r94.mo3670b(r13) <= 0) goto L48;
    L46:
        if (this.f5718b == null) goto L48;
        this.f5718b = r13;
    L48:
        InterfaceC1593I2 r95 = this.f5725i;
        if (r95 == null) goto L51;
        r95.mo3614d(this);
    L51:
        this.f5722f = true;
        return;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: r */
    public final void mo3632r() {
        mo3628n(this.f5719c.f5744g);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: s */
    public final InterfaceC1876g0 mo3633s(String r15, String r16, AbstractC1588H1 r17, EnumC1930n0 r18, C1094Zd r19) {
        boolean r1 = this.f5722f;
        C1637U0 r2 = C1637U0.f5870a;
        if (r1 == true) goto L13;
        C1601K2 r8 = this.f5719c.f5739b;
        C1573D2 r12 = this.f5720d;
        C1585G2 r3 = r12.f5629b;
        C1589H2 r5 = r3.f5719c;
        C1589H2 r6 = new C1589H2(r5.f5738a, new C1601K2(), r8, r15, null, r5.f5741d, null, "manual");
        r6.f5743f = r16;
        r6.f5749l = r18;
        r19.f3478b = r17;
        CopyOnWriteArrayList r152 = r12.f5630c;
        C2045v1 r62 = r12.f5631d;
        if (r3.f5722f == true) goto L13;
        if (r12.f5642o.equals(r18) == false) goto L13;
        List<C1578F> r0 = r62.mo3718l().getIgnoredSpanOrigins();
        if (AbstractC2037i.m4181a((String) r19.f3480d, r0) == true) goto L13;
        String r02 = r6.f5743f;
        int r32 = r152.size();
        int r7 = r62.mo3718l().getMaxSpans();
        String r82 = r6.f5742e;
        if (r32 >= r7) goto L20;
        AbstractC1856a.m4048D("parentSpanId is required", r6.f5740c);
        AbstractC1856a.m4048D("operation is required", r82);
        r12.m3637w();
        C1585G2 r03 = new C1585G2(r12, r12.f5631d, r6, r19, new C2464rl(6, r12));
        r12.m3639y(r03);
        r152.add(r03);
        InterfaceC1925m r153 = r12.f5644q;
        if (r153 == null) goto L19;
        r153.mo3674a(r03);
    L19:
        return r03;
    L20:
        r62.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", new Object[]{r82, r02});
        return r2;
    L13:
        return r2;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: u */
    public final AbstractC1588H1 mo3635u() {
        return this.f5717a;
    }

    /* JADX INFO: renamed from: v */
    public final Boolean m3665v() {
        C2648vx r0 = this.f5719c.f5741d;
        if (r0 != null) goto L7;
        return null;
    L7:
        return (Boolean) r0.f9162a;
    }

    public C1585G2(C1621P2 r3, C1573D2 r4, C2045v1 r5, C1625Q2 r6) {
        this.f5722f = false;
        this.f5723g = new AtomicBoolean(false);
        this.f5726j = new ConcurrentHashMap();
        this.f5727k = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new C2029a();
        this.f5719c = r3;
        r3.f5746i = (String) r6.f3480d;
        this.f5720d = r4;
        this.f5721e = r5;
        this.f5725i = null;
        AbstractC1588H1 r32 = (AbstractC1588H1) r6.f3478b;
        if (r32 == null) goto L5;
        this.f5717a = r32;
    L6:
        this.f5724h = r6;
        return;
    L5:
        this.f5717a = r5.mo3718l().getDateProvider().mo3603a();
        goto L6
    }
}
