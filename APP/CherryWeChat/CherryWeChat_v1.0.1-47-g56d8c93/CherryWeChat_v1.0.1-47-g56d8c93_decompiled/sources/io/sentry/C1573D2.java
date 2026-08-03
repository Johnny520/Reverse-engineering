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

    /* JADX INFO: renamed from: b */
    public final C1585G2 f5629b;

    /* JADX INFO: renamed from: d */
    public final C2045v1 f5631d;

    /* JADX INFO: renamed from: e */
    public final String f5632e;

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

    /* JADX INFO: renamed from: a */
    public final C1970t f5628a = new C1970t();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f5630c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public C1569C2 f5633f = C1569C2.f5619c;

    public C1573D2(C1621P2 c1621p2, C2045v1 c2045v1, C1625Q2 c1625q2, InterfaceC1925m interfaceC1925m) {
        this.f5636i = null;
        C2029a c2029a = new C2029a();
        this.f5637j = c2029a;
        this.f5638k = new C2029a();
        this.f5639l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5640m = atomicBoolean;
        C1953c c1953c = new C1953c();
        this.f5643p = c1953c;
        C1585G2 c1585g2 = new C1585G2(c1621p2, this, c2045v1, c1625q2);
        this.f5629b = c1585g2;
        this.f5632e = c1621p2.f5826n;
        this.f5642o = c1621p2.f5749l;
        this.f5631d = c2045v1;
        this.f5644q = interfaceC1925m;
        this.f5641n = c1621p2.f5827o;
        this.f5645r = c1625q2;
        m3639y(c1585g2);
        C1970t c1970tMo3704s = c2045v1.mo3718l().getContinuousProfiler().mo3704s();
        if (!c1970tMo3704s.equals(C1970t.f7011b) && Boolean.TRUE.equals(c1585g2.m3665v())) {
            c1953c.mo4128j("profile", new C1873f1(c1970tMo3704s));
        }
        if (interfaceC1925m != null) {
            interfaceC1925m.mo3675b(this);
        }
        if (c1625q2.f5841g == null && c1625q2.f5842h == null) {
            return;
        }
        boolean z = true;
        this.f5636i = new Timer(true);
        Long l = c1625q2.f5842h;
        if (l != null) {
            C1981r c1981rM4173a = c2029a.m4173a();
            try {
                if (this.f5636i != null) {
                    m3636v();
                    atomicBoolean.set(true);
                    this.f5635h = new C1565B2(this, 1);
                    try {
                        this.f5636i.schedule(this.f5635h, l.longValue());
                    } catch (Throwable th) {
                        this.f5631d.mo3718l().getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to schedule finish timer", th);
                        EnumC1605L2 enumC1605L2Mo3629o = mo3629o();
                        if (enumC1605L2Mo3629o == null) {
                            enumC1605L2Mo3629o = EnumC1605L2.DEADLINE_EXCEEDED;
                        }
                        if (this.f5645r.f5841g == null) {
                            z = false;
                        }
                        mo3622h(enumC1605L2Mo3629o, z, null);
                        this.f5640m.set(false);
                    }
                }
                c1981rM4173a.close();
            } catch (Throwable th2) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        mo3625k();
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: a */
    public final InterfaceC1876g0 mo3615a() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f5630c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C1585G2 c1585g2 = (C1585G2) listIterator.previous();
            if (!c1585g2.f5722f) {
                return c1585g2;
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: b */
    public final C1613N2 mo3616b() {
        C2045v1 c2045v1 = this.f5631d;
        if (c2045v1.mo3718l().isTraceSampling()) {
            C1585G2 c1585g2 = this.f5629b;
            C1589H2 c1589h2 = c1585g2.f5719c;
            C1589H2 c1589h22 = c1585g2.f5719c;
            C1832c c1832c = c1589h2.f5750m;
            if (c1832c != null) {
                C1981r c1981rM4173a = this.f5638k.m4173a();
                try {
                    if (c1832c.f6622e) {
                        AtomicReference atomicReference = new AtomicReference();
                        if (c2045v1.isEnabled()) {
                            try {
                                atomicReference.set(c2045v1.f7244e.m4141b(null).mo3754D());
                            } catch (Throwable th) {
                                c2045v1.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
                            }
                        } else {
                            c2045v1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
                        c1832c.m3997c(c1589h22.f5738a, (C1970t) atomicReference.get(), c2045v1.mo3718l(), c1589h22.f5741d, this.f5632e, this.f5641n);
                        c1832c.f6622e = false;
                    }
                    c1981rM4173a.close();
                    return c1832c.m3998d();
                } finally {
                }
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: c */
    public final void mo3617c(String str) {
        C1585G2 c1585g2 = this.f5629b;
        if (c1585g2.f5722f) {
            this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            c1585g2.f5719c.f5743f = str;
        }
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: d */
    public final void mo3618d(String str, Object obj) {
        C1585G2 c1585g2 = this.f5629b;
        if (c1585g2.f5722f) {
            this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            c1585g2.mo3618d(str, obj);
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
    public final void mo3622h(EnumC1605L2 enumC1605L2, boolean z, C1586H c1586h) {
        if (this.f5629b.f5722f) {
            return;
        }
        AbstractC1588H1 abstractC1588H1Mo3603a = this.f5631d.mo3718l().getDateProvider().mo3603a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f5630c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C1585G2 c1585g2 = (C1585G2) listIterator.previous();
            c1585g2.f5725i = null;
            c1585g2.mo3631q(enumC1605L2, abstractC1588H1Mo3603a);
        }
        m3638x(enumC1605L2, abstractC1588H1Mo3603a, z, c1586h);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: i */
    public final String mo3623i() {
        return this.f5629b.f5719c.f5743f;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: j */
    public final void mo3624j(Number number, String str) {
        this.f5629b.mo3624j(number, str);
    }

    @Override // io.sentry.InterfaceC1895i0
    /* JADX INFO: renamed from: k */
    public final void mo3625k() {
        Long l;
        C1981r c1981rM4173a = this.f5637j.m4173a();
        try {
            if (this.f5636i != null && (l = this.f5645r.f5841g) != null) {
                m3637w();
                this.f5639l.set(true);
                this.f5634g = new C1565B2(this, 0);
                try {
                    this.f5636i.schedule(this.f5634g, l.longValue());
                } catch (Throwable th) {
                    this.f5631d.mo3718l().getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to schedule finish timer", th);
                    EnumC1605L2 enumC1605L2Mo3629o = mo3629o();
                    if (enumC1605L2Mo3629o == null) {
                        enumC1605L2Mo3629o = EnumC1605L2.OK;
                    }
                    mo3631q(enumC1605L2Mo3629o, null);
                    this.f5639l.set(false);
                }
            }
            c1981rM4173a.close();
        } catch (Throwable th2) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: l */
    public final void mo3626l(String str, Long l, InterfaceC1583G0 interfaceC1583G0) {
        this.f5629b.mo3626l(str, l, interfaceC1583G0);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: m */
    public final C1589H2 mo3627m() {
        return this.f5629b.f5719c;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: n */
    public final void mo3628n(EnumC1605L2 enumC1605L2) {
        mo3631q(enumC1605L2, null);
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
    public final void mo3631q(EnumC1605L2 enumC1605L2, AbstractC1588H1 abstractC1588H1) {
        m3638x(enumC1605L2, abstractC1588H1, true, null);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: r */
    public final void mo3632r() {
        mo3631q(mo3629o(), null);
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: s */
    public final InterfaceC1876g0 mo3633s(String str, String str2, AbstractC1588H1 abstractC1588H1, EnumC1930n0 enumC1930n0, C1094Zd c1094Zd) {
        boolean z = this.f5629b.f5722f;
        C1637U0 c1637u0 = C1637U0.f5870a;
        if (z || !this.f5642o.equals(enumC1930n0)) {
            return c1637u0;
        }
        int size = this.f5630c.size();
        C2045v1 c2045v1 = this.f5631d;
        if (size < c2045v1.mo3718l().getMaxSpans()) {
            return this.f5629b.mo3633s(str, str2, abstractC1588H1, enumC1930n0, c1094Zd);
        }
        c2045v1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c1637u0;
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: t */
    public final void mo3634t() {
        C2045v1 c2045v1 = this.f5631d;
        if (!c2045v1.isEnabled()) {
            c2045v1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            c2045v1.f7244e.m4141b(null).mo3779w(this);
        } catch (Throwable th) {
            c2045v1.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC1876g0
    /* JADX INFO: renamed from: u */
    public final AbstractC1588H1 mo3635u() {
        return this.f5629b.f5717a;
    }

    /* JADX INFO: renamed from: v */
    public final void m3636v() {
        C1981r c1981rM4173a = this.f5637j.m4173a();
        try {
            if (this.f5635h != null) {
                this.f5635h.cancel();
                this.f5640m.set(false);
                this.f5635h = null;
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3637w() {
        C1981r c1981rM4173a = this.f5637j.m4173a();
        try {
            if (this.f5634g != null) {
                this.f5634g.cancel();
                this.f5639l.set(false);
                this.f5634g = null;
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3638x(EnumC1605L2 enumC1605L2, AbstractC1588H1 abstractC1588H1, boolean z, C1586H c1586h) {
        C1881h1 c1881h1Mo3691b;
        AbstractC1588H1 abstractC1588H12 = this.f5629b.f5718b;
        if (abstractC1588H1 == null) {
            abstractC1588H1 = abstractC1588H12;
        }
        if (abstractC1588H1 == null) {
            abstractC1588H1 = this.f5631d.mo3718l().getDateProvider().mo3603a();
        }
        Iterator it = this.f5630c.iterator();
        while (it.hasNext()) {
            ((C1585G2) it.next()).f5724h.getClass();
        }
        this.f5633f = new C1569C2(true, enumC1605L2);
        if (this.f5629b.f5722f) {
            return;
        }
        if (this.f5645r.f5840f) {
            ListIterator listIterator = this.f5630c.listIterator();
            while (listIterator.hasNext()) {
                C1585G2 c1585g2 = (C1585G2) listIterator.next();
                if (!c1585g2.f5722f && c1585g2.f5718b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        C1585G2 c1585g22 = this.f5629b;
        c1585g22.f5725i = new C1572D1(this, c1585g22.f5725i, atomicReference);
        c1585g22.mo3631q(this.f5633f.f5621b, abstractC1588H1);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f5629b.m3665v())) {
            C2648vx c2648vx = this.f5629b.f5719c.f5741d;
            if (bool.equals(c2648vx == null ? null : (Boolean) c2648vx.f9165d)) {
                c1881h1Mo3691b = this.f5631d.mo3718l().getTransactionProfiler().mo3691b(this, (List) atomicReference.get(), this.f5631d.mo3718l());
            }
        } else {
            c1881h1Mo3691b = null;
        }
        if (this.f5631d.mo3718l().isContinuousProfilingEnabled()) {
            EnumC1877g1 profileLifecycle = this.f5631d.mo3718l().getProfileLifecycle();
            EnumC1877g1 enumC1877g1 = EnumC1877g1.TRACE;
            if (profileLifecycle == enumC1877g1) {
                this.f5631d.mo3718l().getContinuousProfiler().mo3692c(enumC1877g1);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        C2045v1 c2045v1 = this.f5631d;
        if (c2045v1.isEnabled()) {
            try {
                InterfaceC1645X interfaceC1645XM4141b = c2045v1.f7244e.m4141b(null);
                interfaceC1645XM4141b.mo3777u(new C0698Q9(4, this, interfaceC1645XM4141b));
            } catch (Throwable th) {
                c2045v1.mo3718l().getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            c2045v1.mo3718l().getLogger().mo3680e(EnumC1657a2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        C1944A c1944a = new C1944A(this);
        if (this.f5636i != null) {
            C1981r c1981rM4173a = this.f5637j.m4173a();
            try {
                if (this.f5636i != null) {
                    m3637w();
                    m3636v();
                    this.f5636i.cancel();
                    this.f5636i = null;
                }
                c1981rM4173a.close();
            } catch (Throwable th2) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.f5630c.isEmpty() && this.f5645r.f5841g != null) {
            this.f5631d.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f5632e);
        } else {
            c1944a.f6843t.putAll(this.f5629b.f5727k);
            this.f5631d.mo3720o(c1944a, mo3616b(), c1586h, c1881h1Mo3691b);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3639y(C1585G2 c1585g2) {
        C2045v1 c2045v1 = this.f5631d;
        InterfaceC2040a threadChecker = c2045v1.mo3718l().getThreadChecker();
        C1970t c1970tMo3704s = c2045v1.mo3718l().getContinuousProfiler().mo3704s();
        if (!c1970tMo3704s.equals(C1970t.f7011b) && Boolean.TRUE.equals(c1585g2.m3665v())) {
            c1585g2.mo3618d("profiler_id", c1970tMo3704s.toString());
        }
        c1585g2.mo3618d("thread.id", String.valueOf(threadChecker.mo3901b()));
        c1585g2.mo3618d("thread.name", threadChecker.mo3900a());
    }
}
