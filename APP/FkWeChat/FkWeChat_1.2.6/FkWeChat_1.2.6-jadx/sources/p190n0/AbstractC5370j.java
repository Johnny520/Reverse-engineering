package p190n0;

import p010a9.InterfaceC0184l;
import p015b0.AbstractC0726a3;
import p015b0.AbstractC0734b3;
import p018b3.InterfaceC0956i0;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p104h3.EnumC2856i;
import p215oc.C5725t;
import p250r1.C6455e;
import p319w2.AbstractC9142u3;
import p319w2.C9058e;
import p319w2.C9122q3;
import p319w2.C9137t3;

/* JADX INFO: renamed from: n0.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5370j {

    /* JADX INFO: renamed from: h */
    public static final a f16542h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final int f16543i = 8;

    /* JADX INFO: renamed from: a */
    public final C9058e f16544a;

    /* JADX INFO: renamed from: b */
    public final long f16545b;

    /* JADX INFO: renamed from: c */
    public final C9122q3 f16546c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0956i0 f16547d;

    /* JADX INFO: renamed from: e */
    public final C5323b5 f16548e;

    /* JADX INFO: renamed from: f */
    public long f16549f;

    /* JADX INFO: renamed from: g */
    public C9058e f16550g;

    public AbstractC5370j(C9058e c9058e, long j10, C9122q3 c9122q3, InterfaceC0956i0 interfaceC0956i0, C5323b5 c5323b5) {
        this.f16544a = c9058e;
        this.f16545b = j10;
        this.f16546c = c9122q3;
        this.f16547d = interfaceC0956i0;
        this.f16548e = c5323b5;
        this.f16549f = j10;
        this.f16550g = c9058e;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m21867h(AbstractC5370j abstractC5370j, C9122q3 c9122q3, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
            return 0;
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC5370j.m21894X();
        }
        return abstractC5370j.m21902g(c9122q3, i10);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m21868k(AbstractC5370j abstractC5370j, C9122q3 c9122q3, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
            return 0;
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC5370j.m21895Y();
        }
        return abstractC5370j.m21904j(c9122q3, i10);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m21869o(AbstractC5370j abstractC5370j, C9122q3 c9122q3, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
            return 0;
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC5370j.m21893W();
        }
        return abstractC5370j.m21907n(c9122q3, i10);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m21870t(AbstractC5370j abstractC5370j, C9122q3 c9122q3, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
            return 0;
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC5370j.m21893W();
        }
        return abstractC5370j.m21911s(c9122q3, i10);
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC5370j m21871A() {
        C9122q3 c9122q3;
        if (m21915x().length() > 0 && (c9122q3 = this.f16546c) != null) {
            m21891U(m21917z(c9122q3, 1));
        }
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC5370j m21872B() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21877G();
            } else {
                m21874D();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC5370j m21873C() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21879I();
            } else {
                m21876F();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final AbstractC5370j m21874D() {
        int iM21905l;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (iM21905l = m21905l()) != -1) {
            m21891U(iM21905l);
        }
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final AbstractC5370j m21875E() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            int iM2837a = AbstractC0726a3.m2837a(m21915x(), C9137t3.m35520k(this.f16549f));
            if (iM2837a == C9137t3.m35520k(this.f16549f) && iM2837a != m21915x().length()) {
                iM2837a = AbstractC0726a3.m2837a(m21915x(), iM2837a + 1);
            }
            m21891U(iM2837a);
        }
        return this;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC5370j m21876F() {
        Integer numM21906m;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (numM21906m = m21906m()) != null) {
            m21891U(numM21906m.intValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC5370j m21877G() {
        int iM21909q;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (iM21909q = m21909q()) != -1) {
            m21891U(iM21909q);
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC5370j m21878H() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            int iM2838b = AbstractC0726a3.m2838b(m21915x(), C9137t3.m35521l(this.f16549f));
            if (iM2838b == C9137t3.m35521l(this.f16549f) && iM2838b != 0) {
                iM2838b = AbstractC0726a3.m2838b(m21915x(), iM2838b - 1);
            }
            m21891U(iM2838b);
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final AbstractC5370j m21879I() {
        Integer numM21912u;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (numM21912u = m21912u()) != null) {
            m21891U(numM21912u.intValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final AbstractC5370j m21880J() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21874D();
            } else {
                m21877G();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC5370j m21881K() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21876F();
            } else {
                m21879I();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final AbstractC5370j m21882L() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            m21891U(m21915x().length());
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC5370j m21883M() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            m21891U(0);
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC5370j m21884N() {
        Integer numM21901f;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (numM21901f = m21901f()) != null) {
            m21891U(numM21901f.intValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC5370j m21885O() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21887Q();
            } else {
                m21884N();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final AbstractC5370j m21886P() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (m21916y()) {
                m21884N();
            } else {
                m21887Q();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public final AbstractC5370j m21887Q() {
        Integer numM21903i;
        m21914w().m21767b();
        if (m21915x().length() > 0 && (numM21903i = m21903i()) != null) {
            m21891U(numM21903i.intValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final AbstractC5370j m21888R() {
        C9122q3 c9122q3;
        if (m21915x().length() > 0 && (c9122q3 = this.f16546c) != null) {
            m21891U(m21917z(c9122q3, -1));
        }
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final AbstractC5370j m21889S() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            m21892V(0, m21915x().length());
        }
        return this;
    }

    /* JADX INFO: renamed from: T */
    public final AbstractC5370j m21890T() {
        if (m21915x().length() > 0) {
            this.f16549f = AbstractC9142u3.m35530b(C9137t3.m35523n(this.f16545b), C9137t3.m35518i(this.f16549f));
        }
        return this;
    }

    /* JADX INFO: renamed from: U */
    public final void m21891U(int i10) {
        m21892V(i10, i10);
    }

    /* JADX INFO: renamed from: V */
    public final void m21892V(int i10, int i11) {
        this.f16549f = AbstractC9142u3.m35530b(i10, i11);
    }

    /* JADX INFO: renamed from: W */
    public final int m21893W() {
        return this.f16547d.mo3268b(C9137t3.m35518i(this.f16549f));
    }

    /* JADX INFO: renamed from: X */
    public final int m21894X() {
        return this.f16547d.mo3268b(C9137t3.m35520k(this.f16549f));
    }

    /* JADX INFO: renamed from: Y */
    public final int m21895Y() {
        return this.f16547d.mo3268b(C9137t3.m35521l(this.f16549f));
    }

    /* JADX INFO: renamed from: a */
    public final int m21896a(int i10) {
        return AbstractC2368o.m8582i(i10, m21915x().length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5370j m21897b(InterfaceC0184l interfaceC0184l) {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (C9137t3.m35517h(this.f16549f)) {
                interfaceC0184l.mo27m(this);
            } else {
                boolean zM21916y = m21916y();
                long j10 = this.f16549f;
                if (zM21916y) {
                    m21891U(C9137t3.m35521l(j10));
                } else {
                    m21891U(C9137t3.m35520k(j10));
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5370j m21898c(InterfaceC0184l interfaceC0184l) {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            if (C9137t3.m35517h(this.f16549f)) {
                interfaceC0184l.mo27m(this);
            } else {
                boolean zM21916y = m21916y();
                long j10 = this.f16549f;
                if (zM21916y) {
                    m21891U(C9137t3.m35520k(j10));
                } else {
                    m21891U(C9137t3.m35521l(j10));
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC5370j m21899d() {
        m21914w().m21767b();
        if (m21915x().length() > 0) {
            m21891U(C9137t3.m35518i(this.f16549f));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C9058e m21900e() {
        return this.f16550g;
    }

    /* JADX INFO: renamed from: f */
    public final Integer m21901f() {
        C9122q3 c9122q3 = this.f16546c;
        if (c9122q3 != null) {
            return Integer.valueOf(m21867h(this, c9122q3, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m21902g(C9122q3 c9122q3, int i10) {
        return this.f16547d.mo3267a(c9122q3.m35396o(c9122q3.m35397q(i10), true));
    }

    /* JADX INFO: renamed from: i */
    public final Integer m21903i() {
        C9122q3 c9122q3 = this.f16546c;
        if (c9122q3 != null) {
            return Integer.valueOf(m21868k(this, c9122q3, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final int m21904j(C9122q3 c9122q3, int i10) {
        return this.f16547d.mo3267a(c9122q3.m35401u(c9122q3.m35397q(i10)));
    }

    /* JADX INFO: renamed from: l */
    public final int m21905l() {
        return AbstractC0734b3.m2845c(this.f16550g.m35156k(), C9137t3.m35518i(this.f16549f));
    }

    /* JADX INFO: renamed from: m */
    public final Integer m21906m() {
        C9122q3 c9122q3 = this.f16546c;
        if (c9122q3 != null) {
            return Integer.valueOf(m21869o(this, c9122q3, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final int m21907n(C9122q3 c9122q3, int i10) {
        while (i10 < this.f16544a.length()) {
            long jM35382C = c9122q3.m35382C(m21896a(i10));
            if (C9137t3.m35518i(jM35382C) > i10) {
                return this.f16547d.mo3267a(C9137t3.m35518i(jM35382C));
            }
            i10++;
        }
        return this.f16544a.length();
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC0956i0 m21908p() {
        return this.f16547d;
    }

    /* JADX INFO: renamed from: q */
    public final int m21909q() {
        return AbstractC0734b3.m2846d(this.f16550g.m35156k(), C9137t3.m35518i(this.f16549f));
    }

    /* JADX INFO: renamed from: r */
    public final int m21910r() {
        return AbstractC0734b3.m2844b(this.f16550g.m35156k(), C9137t3.m35518i(this.f16549f), -1);
    }

    /* JADX INFO: renamed from: s */
    public final int m21911s(C9122q3 c9122q3, int i10) {
        while (i10 > 0) {
            long jM35382C = c9122q3.m35382C(m21896a(i10));
            if (C9137t3.m35523n(jM35382C) < i10) {
                return this.f16547d.mo3267a(C9137t3.m35523n(jM35382C));
            }
            i10--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final Integer m21912u() {
        C9122q3 c9122q3 = this.f16546c;
        if (c9122q3 != null) {
            return Integer.valueOf(m21870t(this, c9122q3, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final long m21913v() {
        return this.f16549f;
    }

    /* JADX INFO: renamed from: w */
    public final C5323b5 m21914w() {
        return this.f16548e;
    }

    /* JADX INFO: renamed from: x */
    public final String m21915x() {
        return this.f16550g.m35156k();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m21916y() {
        C9122q3 c9122q3 = this.f16546c;
        return (c9122q3 != null ? c9122q3.m35405y(m21893W()) : null) != EnumC2856i.f7468r;
    }

    /* JADX INFO: renamed from: z */
    public final int m21917z(C9122q3 c9122q3, int i10) {
        int iM21893W = m21893W();
        if (this.f16548e.m21766a() == null) {
            this.f16548e.m21768c(Float.valueOf(c9122q3.m35386e(iM21893W).m25583l()));
        }
        int iM35397q = c9122q3.m35397q(iM21893W) + i10;
        if (iM35397q < 0) {
            return 0;
        }
        if (iM35397q >= c9122q3.m35395n()) {
            return m21915x().length();
        }
        float fM35394m = c9122q3.m35394m(iM35397q) - 1;
        Float fM21766a = this.f16548e.m21766a();
        fM21766a.getClass();
        float fFloatValue = fM21766a.floatValue();
        if ((m21916y() && fFloatValue >= c9122q3.m35400t(iM35397q)) || (!m21916y() && fFloatValue <= c9122q3.m35399s(iM35397q))) {
            return c9122q3.m35396o(iM35397q, true);
        }
        return this.f16547d.mo3267a(c9122q3.m35404x(C6455e.m25551e((((long) Float.floatToRawIntBits(fM21766a.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fM35394m)) & 4294967295L))));
    }

    /* JADX INFO: renamed from: n0.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC5370j(C9058e c9058e, long j10, C9122q3 c9122q3, InterfaceC0956i0 interfaceC0956i0, C5323b5 c5323b5, AbstractC1043k abstractC1043k) {
        this(c9058e, j10, c9122q3, interfaceC0956i0, c5323b5);
    }
}
