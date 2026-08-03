package io.sentry;

import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.EnumC1946C;
import io.sentry.util.C2029a;
import io.sentry.util.thread.InterfaceC2040a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0698Q9;
import p000.C1094Zd;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.D2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1573D2 implements InterfaceC1895i0 {

    /* JADX INFO: renamed from: a */
    public final C1970t f5628a;

    /* JADX INFO: renamed from: b */
    public final C1585G2 f5629b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f5630c;

    /* JADX INFO: renamed from: d */
    public final C2045v1 f5631d;

    /* JADX INFO: renamed from: e */
    public final String f5632e;

    /* JADX INFO: renamed from: f */
    public C1569C2 f5633f;

    /* JADX INFO: renamed from: g */
    public volatile C1565B2 f5634g;

    /* JADX INFO: renamed from: h */
    public volatile C1565B2 f5635h;

    /* JADX INFO: renamed from: i */
    public volatile Timer f5636i;

    /* JADX INFO: renamed from: j */
    public final C2029a f5637j;

    /* JADX INFO: renamed from: k */
    public final C2029a f5638k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f5639l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f5640m;

    /* JADX INFO: renamed from: n */
    public final EnumC1946C f5641n;

    /* JADX INFO: renamed from: o */
    public final EnumC1930n0 f5642o;

    /* JADX INFO: renamed from: p */
    public final C1953c f5643p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1925m f5644q;

    /* JADX INFO: renamed from: r */
    public final C1625Q2 f5645r;

    public C1573D2(C1621P2 r8, C2045v1 r9, C1625Q2 r10, InterfaceC1925m r11) {
        this.f5628a = new C1970t();
        this.f5630c = new CopyOnWriteArrayList();
        this.f5633f = C1569C2.f5619c;
        this.f5636i = null;
        C2029a r1 = new C2029a();
        this.f5637j = r1;
        this.f5638k = new C2029a();
        this.f5639l = new AtomicBoolean(false);
        AtomicBoolean r2 = new AtomicBoolean(false);
        this.f5640m = r2;
        C1953c r4 = new C1953c();
        this.f5643p = r4;
        C1585G2 r5 = new C1585G2(r8, this, r9, r10);
        this.f5629b = r5;
        this.f5632e = r8.f5826n;
        this.f5642o = r8.f5749l;
        this.f5631d = r9;
        this.f5644q = r11;
        this.f5641n = r8.f5827o;
        this.f5645r = r10;
        m3639y(r5);
        C1970t r82 = r9.mo3718l().getContinuousProfiler().mo3704s();
        if (r82.equals(C1970t.f7011b) == false) goto L5;
    L7:
        if (r11 == null) goto L10;
        r11.mo3675b(this);
    L10:
        if (r10.f5841g == null) goto L12;
    L15:
        boolean r92 = true;
        this.f5636i = new Timer(true);
        Long r83 = r10.f5842h;
        if (r83 == null) goto L42;
        C1981r r102 = r1.m4173a();
    L34:
        th = move-exception;
        r102.close();     // Catch: Throwable -> L39
    L41:
        throw th;
    L39:
        th = move-exception;
        th.addSuppressed(th);
        goto L41
    L19:
        if (this.f5636i == null) goto L36;
        m3636v();     // Catch: Throwable -> L34
        r2.set(true);     // Catch: Throwable -> L34
        this.f5635h = new C1565B2(this, 1);     // Catch: Throwable -> L34
        this.f5636i.schedule(this.f5635h, r83.longValue());     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        this.f5631d.mo3718l().getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to schedule finish timer", th);     // Catch: Throwable -> L34
        EnumC1605L2 r84 = mo3629o();     // Catch: Throwable -> L34
        if (r84 != null) goto L29;
        r84 = EnumC1605L2.DEADLINE_EXCEEDED;     // Catch: Throwable -> L34
    L29:
        if (this.f5645r.f5841g != null) goto L32;
        r92 = false;
    L32:
        mo3622h(r84, r92, null);     // Catch: Throwable -> L34
        this.f5640m.set(false);     // Catch: Throwable -> L34
    L36:
        r102.close();
    L42:
        mo3625k();
        return;
    L12:
        if (r10.f5842h != null) goto L15;
        return;
    L5:
        if (Boolean.TRUE.equals(r5.m3665v()) == false) goto L7;
        r4.mo4128j("profile", new C1873f1(r82));
        goto L7
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: a */
    public final InterfaceC1876g0 mo3615a() {
        CopyOnWriteArrayList r0 = new CopyOnWriteArrayList(this.f5630c);
        ListIterator r02 = r0.listIterator(r0.size());
    L4:
        if (r02.hasPrevious() == false) goto L8;
        C1585G2 r1 = (C1585G2) r02.previous();
        if (r1.f5722f == true) goto L4;
        return r1;
    L8:
        return null;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: b */
    public final C1613N2 mo3616b() {
        C2045v1 r1 = this.f5631d;
        if (r1.mo3718l().isTraceSampling() == false) goto L28;
        C1585G2 r0 = this.f5629b;
        C1589H2 r3 = r0.f5719c;
        C1589H2 r4 = r0.f5719c;
        C1832c r5 = r3.f5750m;
        if (r5 == null) goto L28;
        C1981r r32 = this.f5638k.m4173a();
    L19:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L25
        throw th;
    L25:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L8:
        if (r5.f6622e == false) goto L21;
        AtomicReference r6 = new AtomicReference();     // Catch: Throwable -> L19
        if (r1.isEnabled() == true) goto L33;
        r1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);     // Catch: Throwable -> L19
    L17:
        r5.m3997c(r4.f5738a, (C1970t) r6.get(), r1.mo3718l(), r4.f5741d, this.f5632e, this.f5641n);     // Catch: Throwable -> L19
        r5.f6622e = false;     // Catch: Throwable -> L19
        goto L21
    L33:
        r6.set(r1.f7244e.m4141b(null).mo3754D());     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r1.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);     // Catch: Throwable -> L19
    L21:
        r32.close();
        return r5.m3998d();
    L28:
        return null;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: c */
    public final void mo3617c(String r4) {
        C1585G2 r0 = this.f5629b;
        if (r0.f5722f == false) goto L6;
        this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The transaction is already finished. Description %s cannot be set", new Object[]{r4});
        return;
    L6:
        r0.f5719c.f5743f = r4;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: d */
    public final void mo3618d(String r3, Object r4) {
        C1585G2 r0 = this.f5629b;
        if (r0.f5722f == false) goto L6;
        this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The transaction is already finished. Data %s cannot be set", new Object[]{r3});
        return;
    L6:
        r0.mo3618d(r3, r4);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: e */
    public final InterfaceC1876g0 mo3619e(String r7, AbstractC1588H1 r8, EnumC1930n0 r9) {
        return mo3633s("activity.load", r7, r8, r9, new C1094Zd());
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: f */
    public final boolean mo3620f() {
        return this.f5629b.f5722f;
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: g */
    public final C1970t mo3621g() {
        return this.f5628a;
    }

    @Override // io.sentry.InterfaceC1895i0
    public final String getName() {
        return this.f5632e;
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: h */
    public final void mo3622h(EnumC1605L2 r5, boolean r6, C1586H r7) {
        if (this.f5629b.f5722f == false) goto L5;
        return;
    L5:
        AbstractC1588H1 r0 = this.f5631d.mo3718l().getDateProvider().mo3603a();
        CopyOnWriteArrayList r1 = new CopyOnWriteArrayList(this.f5630c);
        ListIterator r12 = r1.listIterator(r1.size());
    L7:
        if (r12.hasPrevious() == false) goto L9;
        C1585G2 r2 = (C1585G2) r12.previous();
        r2.f5725i = null;
        r2.mo3631q(r5, r0);
        goto L7
    L9:
        m3638x(r5, r0, r6, r7);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: i */
    public final String mo3623i() {
        return this.f5629b.f5719c.f5743f;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: j */
    public final void mo3624j(Number r2, String r3) {
        this.f5629b.mo3624j(r2, r3);
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: k */
    public final void mo3625k() {
        C1981r r0 = this.f5637j.m4173a();
    L17:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L23
    L25:
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        goto L25
    L4:
        if (this.f5636i == null) goto L19;
        Long r1 = this.f5645r.f5841g;     // Catch: Throwable -> L17
        if (r1 == null) goto L19;
        m3637w();     // Catch: Throwable -> L17
        this.f5639l.set(true);     // Catch: Throwable -> L17
        this.f5634g = new C1565B2(this, 0);     // Catch: Throwable -> L17
        this.f5636i.schedule(this.f5634g, r1.longValue());     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        this.f5631d.mo3718l().getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to schedule finish timer", th);     // Catch: Throwable -> L17
        EnumC1605L2 r12 = mo3629o();     // Catch: Throwable -> L17
        if (r12 != null) goto L15;
        r12 = EnumC1605L2.f5786OK;     // Catch: Throwable -> L17
    L15:
        mo3631q(r12, null);     // Catch: Throwable -> L17
        this.f5639l.set(false);     // Catch: Throwable -> L17
    L19:
        r0.close();
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: l */
    public final void mo3626l(String r2, Long r3, InterfaceC1583G0 r4) {
        this.f5629b.mo3626l(r2, r3, r4);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: m */
    public final C1589H2 mo3627m() {
        return this.f5629b.f5719c;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: n */
    public final void mo3628n(EnumC1605L2 r2) {
        mo3631q(r2, null);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: o */
    public final EnumC1605L2 mo3629o() {
        return this.f5629b.f5719c.f5744g;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: p */
    public final AbstractC1588H1 mo3630p() {
        return this.f5629b.f5718b;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: q */
    public final void mo3631q(EnumC1605L2 r3, AbstractC1588H1 r4) {
        m3638x(r3, r4, true, null);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: r */
    public final void mo3632r() {
        mo3631q(mo3629o(), null);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: s */
    public final InterfaceC1876g0 mo3633s(String r11, String r12, AbstractC1588H1 r13, EnumC1930n0 r14, C1094Zd r15) {
        boolean r0 = this.f5629b.f5722f;
        C1637U0 r1 = C1637U0.f5870a;
        if (r0 == false) goto L6;
    L7:
        return r1;
    L6:
        if (this.f5642o.equals(r14) == false) goto L7;
        int r02 = this.f5630c.size();
        C2045v1 r2 = this.f5631d;
        if (r02 < r2.mo3718l().getMaxSpans()) goto L11;
        r2.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", new Object[]{r11, r12});
        return r1;
    L11:
        return this.f5629b.mo3633s(r11, r12, r13, r14, r15);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: t */
    public final void mo3634t() {
        C2045v1 r0 = this.f5631d;
        if (r0.isEnabled() == true) goto L10;
        r0.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        return;
    L10:
        r0.f7244e.m4141b(null).mo3779w(this);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        r0.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: u */
    public final AbstractC1588H1 mo3635u() {
        return this.f5629b.f5717a;
    }

    /* JADX INFO: renamed from: v */
    public final void m3636v() {
        C1981r r0 = this.f5637j.m4173a();
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L4:
        if (this.f5635h == null) goto L9;
        this.f5635h.cancel();     // Catch: Throwable -> L7
        this.f5640m.set(false);     // Catch: Throwable -> L7
        this.f5635h = null;     // Catch: Throwable -> L7
    L9:
        r0.close();
    }

    /* JADX INFO: renamed from: w */
    public final void m3637w() {
        C1981r r0 = this.f5637j.m4173a();
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L4:
        if (this.f5634g == null) goto L9;
        this.f5634g.cancel();     // Catch: Throwable -> L7
        this.f5639l.set(false);     // Catch: Throwable -> L7
        this.f5634g = null;     // Catch: Throwable -> L7
    L9:
        r0.close();
    }

    /* JADX INFO: renamed from: x */
    public final void m3638x(EnumC1605L2 r5, AbstractC1588H1 r6, boolean r7, C1586H r8) {
        AbstractC1588H1 r0 = this.f5629b.f5718b;
        if (r6 != null) goto L6;
        r6 = r0;
    L6:
        if (r6 != null) goto L8;
        r6 = this.f5631d.mo3718l().getDateProvider().mo3603a();
    L8:
        Iterator r02 = this.f5630c.iterator();
    L10:
        if (r02.hasNext() == false) goto L12;
        ((C1585G2) r02.next()).f5724h.getClass();
        goto L10
    L12:
        this.f5633f = new C1569C2(true, r5);
        if (this.f5629b.f5722f == false) goto L15;
        return;
    L15:
        if (this.f5645r.f5840f == false) goto L24;
        ListIterator r52 = this.f5630c.listIterator();
    L18:
        if (r52.hasNext() == false) goto L24;
        C1585G2 r03 = (C1585G2) r52.next();
        if (r03.f5722f == true) goto L18;
        if (r03.f5718b != null) goto L18;
        return;
    L24:
        AtomicReference r53 = new AtomicReference();
        C1585G2 r04 = this.f5629b;
        r04.f5725i = new C1572D1(this, r04.f5725i, r53);
        r04.mo3631q(this.f5633f.f5621b, r6);
        Boolean r62 = Boolean.TRUE;
        if (r62.equals(this.f5629b.m3665v()) == false) goto L33;
        C2648vx r05 = this.f5629b.f5719c.f5741d;
        if (r05 != null) goto L29;
        Boolean r06 = null;
    L31:
        if (r62.equals(r06) == false) goto L33;
        C1881h1 r63 = this.f5631d.mo3718l().getTransactionProfiler().mo3691b(this, (List) r53.get(), this.f5631d.mo3718l());
    L35:
        if (this.f5631d.mo3718l().isContinuousProfilingEnabled() == false) goto L40;
        EnumC1877g1 r07 = this.f5631d.mo3718l().getProfileLifecycle();
        EnumC1877g1 r2 = EnumC1877g1.TRACE;
        if (r07 != r2) goto L40;
        this.f5631d.mo3718l().getContinuousProfiler().mo3692c(r2);
    L40:
        if (r53.get() == null) goto L42;
        ((List) r53.get()).clear();
    L42:
        C2045v1 r54 = this.f5631d;
        if (r54.isEnabled() == true) goto L75;
        r54.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
    L49:
        C1944A r55 = new C1944A(this);
        if (this.f5636i == null) goto L64;
        C1981r r08 = this.f5637j.m4173a();
    L56:
        th = move-exception;
        r08.close();     // Catch: Throwable -> L61
    L63:
        throw th;
    L61:
        th = move-exception;
        th.addSuppressed(th);
        goto L63
    L53:
        if (this.f5636i == null) goto L58;
        m3637w();     // Catch: Throwable -> L56
        m3636v();     // Catch: Throwable -> L56
        this.f5636i.cancel();     // Catch: Throwable -> L56
        this.f5636i = null;     // Catch: Throwable -> L56
    L58:
        r08.close();
    L64:
        if (r7 == true) goto L66;
    L71:
        r55.f6843t.putAll(this.f5629b.f5727k);
        this.f5631d.mo3720o(r55, mo3616b(), r8, r63);
        return;
    L66:
        if (this.f5630c.isEmpty() == false) goto L71;
        if (this.f5645r.f5841g == null) goto L71;
        this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Dropping idle transaction %s because it has no child spans", new Object[]{this.f5632e});
        return;
    L75:
        InterfaceC1645X r09 = r54.f7244e.m4141b(null);     // Catch: Throwable -> L47
        r09.mo3777u(new C0698Q9(4, this, r09));     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        r54.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
        goto L49
    L29:
        r06 = (Boolean) r05.f9165d;
    L33:
        r63 = null;
        goto L35
    }

    /* JADX INFO: renamed from: y */
    public final void m3639y(C1585G2 r5) {
        C2045v1 r0 = this.f5631d;
        InterfaceC2040a r1 = r0.mo3718l().getThreadChecker();
        C1970t r02 = r0.mo3718l().getContinuousProfiler().mo3704s();
        if (r02.equals(C1970t.f7011b) == false) goto L5;
    L7:
        r5.mo3618d("thread.id", String.valueOf(r1.mo3901b()));
        r5.mo3618d("thread.name", r1.mo3900a());
        return;
    L5:
        if (Boolean.TRUE.equals(r5.m3665v()) == false) goto L7;
        r5.mo3618d("profiler_id", r02.toString());
        goto L7
    }
}
