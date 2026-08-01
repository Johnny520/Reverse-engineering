package p264s0;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0491f2;
import androidx.compose.runtime.InterfaceC0498g2;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.InterfaceC2359f;
import p172l8.C4700i0;

/* JADX INFO: renamed from: s0.b8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6664b8 {

    /* JADX INFO: renamed from: t */
    public static final a f20890t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final int f20891u = 8;

    /* JADX INFO: renamed from: a */
    public final int f20892a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0173a f20893b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2359f f20894c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0491f2 f20895d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0491f2 f20896e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0184l f20897f;

    /* JADX INFO: renamed from: g */
    public final float[] f20898g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0491f2 f20899h = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: i */
    public final InterfaceC0491f2 f20900i = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: j */
    public final InterfaceC0491f2 f20901j = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: k */
    public final InterfaceC0491f2 f20902k = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: l */
    public final InterfaceC0498g2 f20903l = AbstractC0570q4.m2141a(0);

    /* JADX INFO: renamed from: m */
    public final InterfaceC0491f2 f20904m = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: n */
    public final InterfaceC0491f2 f20905n = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: o */
    public final InterfaceC0512i2 f20906o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0512i2 f20907p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0184l f20908q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0491f2 f20909r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0491f2 f20910s;

    public C6664b8(float f10, float f11, int i10, InterfaceC0173a interfaceC0173a, InterfaceC2359f interfaceC2359f) {
        this.f20892a = i10;
        this.f20893b = interfaceC0173a;
        this.f20894c = interfaceC2359f;
        this.f20895d = AbstractC0471c3.m1561a(f10);
        this.f20896e = AbstractC0471c3.m1561a(f11);
        this.f20898g = AbstractC6778ia.m26910c0(i10);
        Boolean bool = Boolean.FALSE;
        this.f20906o = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f20907p = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f20908q = new InterfaceC0184l() { // from class: s0.a8
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6664b8.m26392a(this.f20806q, ((Boolean) obj).booleanValue());
            }
        };
        this.f20909r = AbstractC0471c3.m1561a(0.0f);
        this.f20910s = AbstractC0471c3.m1561a(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m26392a(C6664b8 c6664b8, boolean z10) {
        InterfaceC0173a interfaceC0173a = c6664b8.f20893b;
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: A */
    public final void m26393A(boolean z10, float f10) {
        long jM26882D;
        if (z10) {
            m26408P(m26429q() + f10);
            m26407O(m26394B(m26425m(), m26424l(), m26414b()));
            float fM26428p = m26428p();
            jM26882D = AbstractC6778ia.m26882D(AbstractC2368o.m8581h(AbstractC6778ia.m26908b0(AbstractC2368o.m8585l(m26429q(), m26425m(), fM26428p), this.f20898g, m26425m(), m26424l()), fM26428p), fM26428p);
        } else {
            m26407O(m26428p() + f10);
            m26408P(m26394B(m26425m(), m26424l(), m26416d()));
            float fM26429q = m26429q();
            jM26882D = AbstractC6778ia.m26882D(fM26429q, AbstractC2368o.m8577d(AbstractC6778ia.m26908b0(AbstractC2368o.m8585l(m26428p(), fM26429q, m26424l()), this.f20898g, m26425m(), m26424l()), fM26429q));
        }
        long jM26395C = m26395C(z10, m26425m(), m26424l(), jM26882D);
        if (C6858na.m27252e(jM26395C, AbstractC6778ia.m26882D(m26416d(), m26414b()))) {
            return;
        }
        InterfaceC0184l interfaceC0184l = this.f20897f;
        if (interfaceC0184l == null) {
            m26398F(C6858na.m27254g(jM26395C));
            m26396D(C6858na.m27253f(jM26395C));
        } else if (interfaceC0184l != null) {
            interfaceC0184l.mo27m(C6858na.m27249b(jM26395C));
        }
    }

    /* JADX INFO: renamed from: B */
    public final float m26394B(float f10, float f11, float f12) {
        return AbstractC6778ia.m26901W(((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue(), f12, f10, f11);
    }

    /* JADX INFO: renamed from: C */
    public final long m26395C(boolean z10, float f10, float f11, long j10) {
        return AbstractC6778ia.m26902X(z10, f10, f11, j10, ((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue());
    }

    /* JADX INFO: renamed from: D */
    public final void m26396D(float f10) {
        m26397E(AbstractC6778ia.m26908b0(AbstractC2368o.m8585l(f10, m26416d(), ((Number) this.f20894c.mo8559l()).floatValue()), this.f20898g, ((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue()));
    }

    /* JADX INFO: renamed from: E */
    public final void m26397E(float f10) {
        this.f20896e.mo1664h(f10);
    }

    /* JADX INFO: renamed from: F */
    public final void m26398F(float f10) {
        m26399G(AbstractC6778ia.m26908b0(AbstractC2368o.m8585l(f10, ((Number) this.f20894c.mo8554c()).floatValue(), m26414b()), this.f20898g, ((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue()));
    }

    /* JADX INFO: renamed from: G */
    public final void m26399G(float f10) {
        this.f20895d.mo1664h(f10);
    }

    /* JADX INFO: renamed from: H */
    public final void m26400H(boolean z10) {
        this.f20906o.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: I */
    public final void m26401I(float f10) {
        this.f20902k.mo1664h(f10);
    }

    /* JADX INFO: renamed from: J */
    public final void m26402J(float f10) {
        this.f20901j.mo1664h(f10);
    }

    /* JADX INFO: renamed from: K */
    public final void m26403K(float f10) {
        this.f20909r.mo1664h(f10);
    }

    /* JADX INFO: renamed from: L */
    public final void m26404L(float f10) {
        this.f20910s.mo1664h(f10);
    }

    /* JADX INFO: renamed from: M */
    public final void m26405M(InterfaceC0184l interfaceC0184l) {
        this.f20897f = interfaceC0184l;
    }

    /* JADX INFO: renamed from: N */
    public final void m26406N(InterfaceC0173a interfaceC0173a) {
        this.f20893b = interfaceC0173a;
    }

    /* JADX INFO: renamed from: O */
    public final void m26407O(float f10) {
        this.f20905n.mo1664h(f10);
    }

    /* JADX INFO: renamed from: P */
    public final void m26408P(float f10) {
        this.f20904m.mo1664h(f10);
    }

    /* JADX INFO: renamed from: Q */
    public final void m26409Q(boolean z10) {
        this.f20907p.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: R */
    public final void m26410R(float f10) {
        this.f20900i.mo1664h(f10);
    }

    /* JADX INFO: renamed from: S */
    public final void m26411S(float f10) {
        this.f20899h.mo1664h(f10);
    }

    /* JADX INFO: renamed from: T */
    public final void m26412T(int i10) {
        this.f20903l.mo1687j(i10);
    }

    /* JADX INFO: renamed from: U */
    public final void m26413U() {
        float f10 = 2;
        float fMax = Math.max(m26435w() - (m26422j() / f10), 0.0f);
        float fMin = Math.min(m26432t() / f10, fMax);
        if (m26437y()) {
            return;
        }
        if (m26425m() == fMin && m26424l() == fMax && m26416d() == m26414b()) {
            return;
        }
        m26404L(fMin);
        m26403K(fMax);
        m26408P(m26394B(m26425m(), m26424l(), m26416d()));
        m26407O(m26394B(m26425m(), m26424l(), m26414b()));
    }

    /* JADX INFO: renamed from: b */
    public final float m26414b() {
        return m26415c();
    }

    /* JADX INFO: renamed from: c */
    public final float m26415c() {
        return this.f20896e.mo1663b();
    }

    /* JADX INFO: renamed from: d */
    public final float m26416d() {
        return m26417e();
    }

    /* JADX INFO: renamed from: e */
    public final float m26417e() {
        return this.f20895d.mo1663b();
    }

    /* JADX INFO: renamed from: f */
    public final float m26418f() {
        return AbstractC6778ia.m26893O(((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue(), m26414b());
    }

    /* JADX INFO: renamed from: g */
    public final float m26419g() {
        return AbstractC6778ia.m26893O(((Number) this.f20894c.mo8554c()).floatValue(), ((Number) this.f20894c.mo8559l()).floatValue(), m26416d());
    }

    /* JADX INFO: renamed from: h */
    public final int m26420h() {
        return (int) Math.floor(this.f20892a * (1.0f - m26419g()));
    }

    /* JADX INFO: renamed from: i */
    public final float m26421i() {
        return this.f20902k.mo1663b();
    }

    /* JADX INFO: renamed from: j */
    public final float m26422j() {
        return this.f20901j.mo1663b();
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0184l m26423k() {
        return this.f20908q;
    }

    /* JADX INFO: renamed from: l */
    public final float m26424l() {
        return this.f20909r.mo1663b();
    }

    /* JADX INFO: renamed from: m */
    public final float m26425m() {
        return this.f20910s.mo1663b();
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC0184l m26426n() {
        return this.f20897f;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC0173a m26427o() {
        return this.f20893b;
    }

    /* JADX INFO: renamed from: p */
    public final float m26428p() {
        return this.f20905n.mo1663b();
    }

    /* JADX INFO: renamed from: q */
    public final float m26429q() {
        return this.f20904m.mo1663b();
    }

    /* JADX INFO: renamed from: r */
    public final int m26430r() {
        return (int) Math.floor(this.f20892a * m26418f());
    }

    /* JADX INFO: renamed from: s */
    public final float m26431s() {
        return this.f20900i.mo1663b();
    }

    /* JADX INFO: renamed from: t */
    public final float m26432t() {
        return this.f20899h.mo1663b();
    }

    /* JADX INFO: renamed from: u */
    public final int m26433u() {
        return this.f20892a;
    }

    /* JADX INFO: renamed from: v */
    public final float[] m26434v() {
        return this.f20898g;
    }

    /* JADX INFO: renamed from: w */
    public final int m26435w() {
        return this.f20903l.mo1686f();
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC2359f m26436x() {
        return this.f20894c;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m26437y() {
        return ((Boolean) this.f20906o.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m26438z() {
        return ((Boolean) this.f20907p.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: s0.b8$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
