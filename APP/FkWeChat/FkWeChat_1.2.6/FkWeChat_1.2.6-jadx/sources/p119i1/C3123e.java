package p119i1;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p117i.C3084s0;
import p119i1.AbstractC3141n;
import p134j1.AbstractC3498b;
import p172l8.C4700i0;

/* JADX INFO: renamed from: i1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3123e extends C3121d {

    /* JADX INFO: renamed from: s */
    public final C3121d f8323s;

    /* JADX INFO: renamed from: t */
    public boolean f8324t;

    public C3123e(long j10, C3147q c3147q, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, C3121d c3121d) {
        super(j10, c3147q, interfaceC0184l, interfaceC0184l2);
        this.f8323s = c3121d;
        c3121d.mo11660m(this);
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: C */
    public AbstractC3141n mo11655C() throws Throwable {
        C3123e c3123e;
        if (this.f8323s.m11698D() || this.f8323s.m11754e()) {
            return new AbstractC3141n.a(this);
        }
        C3084s0 c3084s0Mo11666E = mo11666E();
        long jMo11678i = mo11678i();
        Map mapM11891T = c3084s0Mo11666E != null ? AbstractC3159w.m11891T(this.f8323s.mo11678i(), this, this.f8323s.mo11675f()) : null;
        synchronized (AbstractC3159w.m11883L()) {
            try {
                AbstractC3159w.m11915i0(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c3084s0Mo11666E == null || c3084s0Mo11666E.m11270c() == 0) {
                    c3123e = this;
                    m11753b();
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } else {
                    c3123e = this;
                    AbstractC3141n abstractC3141nM11702J = c3123e.m11702J(this.f8323s.mo11678i(), c3084s0Mo11666E, mapM11891T, this.f8323s.mo11675f());
                    if (!AbstractC1061t.m3842c(abstractC3141nM11702J, AbstractC3141n.b.f8380a)) {
                        return abstractC3141nM11702J;
                    }
                    C3084s0 c3084s0Mo11666E2 = c3123e.f8323s.mo11666E();
                    if (c3084s0Mo11666E2 != null) {
                        c3084s0Mo11666E2.m11537i(c3084s0Mo11666E);
                    } else {
                        c3123e.f8323s.mo11668Q(c3084s0Mo11666E);
                        mo11668Q(null);
                    }
                }
                if (AbstractC1061t.m3844e(c3123e.f8323s.mo11678i(), jMo11678i) < 0) {
                    c3123e.f8323s.m11697B();
                }
                C3121d c3121d = c3123e.f8323s;
                c3121d.mo11682u(c3121d.mo11675f().m11846q(jMo11678i).m11845p(m11699F()));
                c3123e.f8323s.m11703K(jMo11678i);
                c3123e.f8323s.m11705M(m11759y());
                c3123e.f8323s.m11704L(m11699F());
                c3123e.f8323s.m11706N(m11700G());
                C4700i0 c4700i02 = C4700i0.f13910a;
                m11708P(true);
                m11713U();
                AbstractC3498b.m13033c(this, c3084s0Mo11666E);
                return AbstractC3141n.b.f8380a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11713U() {
        if (this.f8324t) {
            return;
        }
        this.f8324t = true;
        this.f8323s.mo11661n(this);
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        if (m11754e()) {
            return;
        }
        super.mo11659d();
        m11713U();
    }
}
