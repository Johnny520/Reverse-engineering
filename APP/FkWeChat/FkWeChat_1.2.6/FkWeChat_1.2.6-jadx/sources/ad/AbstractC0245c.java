package ad;

import bd.AbstractC1109b;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p172l8.C4699i;
import p215oc.C5706c;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8625h0;
import p300uc.AbstractC8654h;
import p300uc.C8661o;
import p300uc.InterfaceC8645a;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.AbstractC9225m;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9487e;
import p361yc.AbstractC9671b;
import p361yc.AbstractC9748q1;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9961n;
import p375zc.C9936a0;
import p375zc.C9941d;
import p375zc.C9944e0;
import p375zc.C9950h0;
import p375zc.C9951i;
import p375zc.InterfaceC9955k;

/* JADX INFO: renamed from: ad.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0245c extends AbstractC9748q1 implements InterfaceC9955k {

    /* JADX INFO: renamed from: d */
    public final AbstractC9939c f607d;

    /* JADX INFO: renamed from: e */
    public final AbstractC9957l f608e;

    /* JADX INFO: renamed from: f */
    public final String f609f;

    /* JADX INFO: renamed from: g */
    public final C9951i f610g;

    public AbstractC0245c(AbstractC9939c abstractC9939c, AbstractC9957l abstractC9957l, String str) {
        this.f607d = abstractC9939c;
        this.f608e = abstractC9957l;
        this.f609f = str;
        this.f610g = mo673b().m38514f();
    }

    /* JADX INFO: renamed from: A0 */
    public final Void m658A0(AbstractC9956k0 abstractC9956k0, String str, String str2) {
        StringBuilder sb2 = AbstractC8611a0.m33075T(str, "i", false, 2, null) ? new StringBuilder("an ") : new StringBuilder("a ");
        sb2.append(str);
        throw AbstractC0246c0.m700f(-1, "Failed to parse literal '" + abstractC9956k0 + "' as " + sb2.toString() + " value at element: " + m694z0(str2), m679l0().toString());
    }

    @Override // p361yc.AbstractC9680c3, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: B */
    public InterfaceC9487e mo659B(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return m37835X() != null ? super.mo659B(interfaceC9218f) : new C0267j0(mo673b(), mo693y0(), this.f609f).mo659B(interfaceC9218f);
    }

    @Override // p361yc.AbstractC9680c3, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: D */
    public Object mo660D(InterfaceC8645a interfaceC8645a) {
        AbstractC9956k0 abstractC9956k0M38583j;
        interfaceC8645a.getClass();
        if (!(interfaceC8645a instanceof AbstractC9671b) || mo673b().m38514f().m38563p()) {
            return interfaceC8645a.mo15956d(this);
        }
        AbstractC9671b abstractC9671b = (AbstractC9671b) interfaceC8645a;
        String strM861c = AbstractC0293v0.m861c(abstractC9671b.mo15953a(), mo673b());
        AbstractC9957l abstractC9957lMo677h = mo677h();
        String strMo35888a = abstractC9671b.mo15953a().mo35888a();
        if (abstractC9957lMo677h instanceof C9950h0) {
            C9950h0 c9950h0 = (C9950h0) abstractC9957lMo677h;
            AbstractC9957l abstractC9957l = (AbstractC9957l) c9950h0.get(strM861c);
            try {
                InterfaceC8645a interfaceC8645aM33262a = AbstractC8654h.m33262a((AbstractC9671b) interfaceC8645a, this, (abstractC9957l == null || (abstractC9956k0M38583j = AbstractC9961n.m38583j(abstractC9957l)) == null) ? null : AbstractC9961n.m38579f(abstractC9956k0M38583j));
                interfaceC8645aM33262a.getClass();
                return AbstractC0259g1.m759b(mo673b(), strM861c, c9950h0, interfaceC8645aM33262a);
            } catch (C8661o e10) {
                String message = e10.getMessage();
                message.getClass();
                throw AbstractC0246c0.m700f(-1, message, c9950h0.toString());
            }
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9950h0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo677h.getClass()).mo3794w() + " as the serialized body of " + strMo35888a + " at element: " + m38019h0(), abstractC9957lMo677h.toString());
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: a */
    public AbstractC1109b mo672a() {
        return mo673b().mo33269a();
    }

    @Override // p375zc.InterfaceC9955k
    /* JADX INFO: renamed from: b */
    public AbstractC9939c mo673b() {
        return this.f607d;
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: c */
    public InterfaceC9485c mo674c(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        AbstractC9957l abstractC9957lM679l0 = m679l0();
        AbstractC9224l abstractC9224lMo35896j = interfaceC9218f.mo35896j();
        if (AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.b.f31487a) || (abstractC9224lMo35896j instanceof AbstractC9216d)) {
            AbstractC9939c abstractC9939cMo673b = mo673b();
            String strMo35888a = interfaceC9218f.mo35888a();
            if (abstractC9957lM679l0 instanceof C9941d) {
                return new C0283q0(abstractC9939cMo673b, (C9941d) abstractC9957lM679l0);
            }
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9941d.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lM679l0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a + " at element: " + m38019h0(), abstractC9957lM679l0.toString());
        }
        if (!AbstractC1061t.m3842c(abstractC9224lMo35896j, AbstractC9225m.c.f31488a)) {
            AbstractC9939c abstractC9939cMo673b2 = mo673b();
            String strMo35888a2 = interfaceC9218f.mo35888a();
            if (abstractC9957lM679l0 instanceof C9950h0) {
                return new C0279o0(abstractC9939cMo673b2, (C9950h0) abstractC9957lM679l0, this.f609f, null, 8, null);
            }
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9950h0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lM679l0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a2 + " at element: " + m38019h0(), abstractC9957lM679l0.toString());
        }
        AbstractC9939c abstractC9939cMo673b3 = mo673b();
        InterfaceC9218f interfaceC9218fM793a = AbstractC0271k1.m793a(interfaceC9218f.mo35894h(0), abstractC9939cMo673b3.mo33269a());
        AbstractC9224l abstractC9224lMo35896j2 = interfaceC9218fM793a.mo35896j();
        if ((abstractC9224lMo35896j2 instanceof AbstractC9217e) || AbstractC1061t.m3842c(abstractC9224lMo35896j2, AbstractC9224l.b.f31485a)) {
            AbstractC9939c abstractC9939cMo673b4 = mo673b();
            String strMo35888a3 = interfaceC9218f.mo35888a();
            if (abstractC9957lM679l0 instanceof C9950h0) {
                return new C0287s0(abstractC9939cMo673b4, (C9950h0) abstractC9957lM679l0);
            }
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9950h0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lM679l0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a3 + " at element: " + m38019h0(), abstractC9957lM679l0.toString());
        }
        if (!abstractC9939cMo673b3.m38514f().m38550c()) {
            throw AbstractC0246c0.m698d(interfaceC9218fM793a);
        }
        AbstractC9939c abstractC9939cMo673b5 = mo673b();
        String strMo35888a4 = interfaceC9218f.mo35888a();
        if (abstractC9957lM679l0 instanceof C9941d) {
            return new C0283q0(abstractC9939cMo673b5, (C9941d) abstractC9957lM679l0);
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9941d.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lM679l0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a4 + " at element: " + m38019h0(), abstractC9957lM679l0.toString());
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: d */
    public void mo675d(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
    }

    @Override // p361yc.AbstractC9748q1
    /* JADX INFO: renamed from: d0 */
    public String mo676d0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str2;
    }

    @Override // p375zc.InterfaceC9955k
    /* JADX INFO: renamed from: h */
    public AbstractC9957l mo677h() {
        return m679l0();
    }

    /* JADX INFO: renamed from: k0 */
    public abstract AbstractC9957l mo678k0(String str);

    /* JADX INFO: renamed from: l0 */
    public final AbstractC9957l m679l0() {
        AbstractC9957l abstractC9957lMo678k0;
        String str = (String) m37835X();
        return (str == null || (abstractC9957lMo678k0 = mo678k0(str)) == null) ? mo693y0() : abstractC9957lMo678k0;
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public boolean mo661M(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of boolean at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            Boolean boolM38578e = AbstractC9961n.m38578e(abstractC9956k0);
            if (boolM38578e != null) {
                return boolM38578e.booleanValue();
            }
            m658A0(abstractC9956k0, "boolean", str);
            throw new C4699i();
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "boolean", str);
            C5706c.m23089a();
            return false;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public byte mo662N(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of byte at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            long jM38586m = AbstractC9961n.m38586m(abstractC9956k0);
            Byte bValueOf = (-128 > jM38586m || jM38586m > 127) ? null : Byte.valueOf((byte) jM38586m);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m658A0(abstractC9956k0, "byte", str);
            throw new C4699i();
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "byte", str);
            C5706c.m23089a();
            return (byte) 0;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public char mo663O(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (abstractC9957lMo678k0 instanceof AbstractC9956k0) {
            AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
            try {
                return AbstractC8625h0.m33173A1(abstractC9956k0.mo38506a());
            } catch (IllegalArgumentException unused) {
                m658A0(abstractC9956k0, "char", str);
                C5706c.m23089a();
                return (char) 0;
            }
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of char at element: " + m694z0(str), abstractC9957lMo678k0.toString());
    }

    @Override // p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: p */
    public boolean mo683p() {
        return !(m679l0() instanceof C9944e0);
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public double mo664P(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of double at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            double dM38580g = AbstractC9961n.m38580g(abstractC9956k0);
            if (mo673b().m38514f().m38549b() || Math.abs(dM38580g) <= Double.MAX_VALUE) {
                return dM38580g;
            }
            throw AbstractC0246c0.m695a(Double.valueOf(dM38580g), str, m679l0().toString());
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "double", str);
            C5706c.m23089a();
            return 0.0d;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public int mo665Q(String str, InterfaceC9218f interfaceC9218f) {
        str.getClass();
        interfaceC9218f.getClass();
        AbstractC9939c abstractC9939cMo673b = mo673b();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        String strMo35888a = interfaceC9218f.mo35888a();
        if (abstractC9957lMo678k0 instanceof AbstractC9956k0) {
            return AbstractC0261h0.m770j(interfaceC9218f, abstractC9939cMo673b, ((AbstractC9956k0) abstractC9957lMo678k0).mo38506a(), null, 4, null);
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a + " at element: " + m694z0(str), abstractC9957lMo678k0.toString());
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public float mo666R(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of float at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            float fM38581h = AbstractC9961n.m38581h(abstractC9956k0);
            if (mo673b().m38514f().m38549b() || Math.abs(fM38581h) <= Float.MAX_VALUE) {
                return fM38581h;
            }
            throw AbstractC0246c0.m695a(Float.valueOf(fM38581h), str, m679l0().toString());
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "float", str);
            C5706c.m23089a();
            return 0.0f;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public InterfaceC9487e mo667S(String str, InterfaceC9218f interfaceC9218f) {
        str.getClass();
        interfaceC9218f.getClass();
        if (!AbstractC0244b1.m655b(interfaceC9218f)) {
            return super.mo667S(str, interfaceC9218f);
        }
        AbstractC9939c abstractC9939cMo673b = mo673b();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        String strMo35888a = interfaceC9218f.mo35888a();
        if (abstractC9957lMo678k0 instanceof AbstractC9956k0) {
            return new C0296x(AbstractC0250d1.m708a(abstractC9939cMo673b, ((AbstractC9956k0) abstractC9957lMo678k0).mo38506a()), mo673b());
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a + " at element: " + m694z0(str), abstractC9957lMo678k0.toString());
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public int mo668T(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of int at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            long jM38586m = AbstractC9961n.m38586m(abstractC9956k0);
            Integer numValueOf = (-2147483648L > jM38586m || jM38586m > 2147483647L) ? null : Integer.valueOf((int) jM38586m);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m658A0(abstractC9956k0, "int", str);
            throw new C4699i();
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "int", str);
            C5706c.m23089a();
            return 0;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public long mo669U(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (abstractC9957lMo678k0 instanceof AbstractC9956k0) {
            AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
            try {
                return AbstractC9961n.m38586m(abstractC9956k0);
            } catch (IllegalArgumentException unused) {
                m658A0(abstractC9956k0, "long", str);
                C5706c.m23089a();
                return 0L;
            }
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of long at element: " + m694z0(str), abstractC9957lMo678k0.toString());
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public short mo670V(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of short at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        try {
            long jM38586m = AbstractC9961n.m38586m(abstractC9956k0);
            Short shValueOf = (-32768 > jM38586m || jM38586m > 32767) ? null : Short.valueOf((short) jM38586m);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m658A0(abstractC9956k0, "short", str);
            throw new C4699i();
        } catch (IllegalArgumentException unused) {
            m658A0(abstractC9956k0, "short", str);
            C5706c.m23089a();
            return (short) 0;
        }
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public String mo671W(String str) {
        str.getClass();
        AbstractC9957l abstractC9957lMo678k0 = mo678k0(str);
        if (!(abstractC9957lMo678k0 instanceof AbstractC9956k0)) {
            throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(AbstractC9956k0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lMo678k0.getClass()).mo3794w() + " as the serialized body of string at element: " + m694z0(str), abstractC9957lMo678k0.toString());
        }
        AbstractC9956k0 abstractC9956k0 = (AbstractC9956k0) abstractC9957lMo678k0;
        if (!(abstractC9956k0 instanceof C9936a0)) {
            throw AbstractC0246c0.m700f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + m694z0(str), m679l0().toString());
        }
        C9936a0 c9936a0 = (C9936a0) abstractC9956k0;
        if (c9936a0.mo38507c() || mo673b().m38514f().m38564q()) {
            return c9936a0.mo38506a();
        }
        throw AbstractC0246c0.m700f(-1, "String literal for key '" + str + "' should be quoted at element: " + m694z0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m679l0().toString());
    }

    /* JADX INFO: renamed from: x0 */
    public final String m692x0() {
        return this.f609f;
    }

    /* JADX INFO: renamed from: y0 */
    public abstract AbstractC9957l mo693y0();

    /* JADX INFO: renamed from: z0 */
    public final String m694z0(String str) {
        str.getClass();
        return m38019h0() + '.' + str;
    }

    public /* synthetic */ AbstractC0245c(AbstractC9939c abstractC9939c, AbstractC9957l abstractC9957l, String str, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC9939c, abstractC9957l, (i10 & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ AbstractC0245c(AbstractC9939c abstractC9939c, AbstractC9957l abstractC9957l, String str, AbstractC1043k abstractC1043k) {
        this(abstractC9939c, abstractC9957l, str);
    }
}
