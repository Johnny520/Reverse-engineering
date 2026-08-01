package p190n0;

import p010a9.InterfaceC0173a;
import p015b0.AbstractC0734b3;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p190n0.C5419r0;
import p319w2.C9122q3;
import p319w2.C9137t3;

/* JADX INFO: renamed from: n0.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5312a1 {
    /* JADX INFO: renamed from: a */
    public static int m21644a(C5407p0 c5407p0, int i10) {
        return c5407p0.m21999k().m35397q(i10);
    }

    /* JADX INFO: renamed from: b */
    public static C5419r0.a m21645b(C5407p0 c5407p0, int i10, int i11, InterfaceC5426s1 interfaceC5426s1, InterfaceC4705l interfaceC4705l) {
        return m21654k(c5407p0, m21656m(interfaceC4705l), i10, i11, interfaceC5426s1.mo22134b(), interfaceC5426s1.mo22141i() == EnumC5388m.f16584q);
    }

    /* JADX INFO: renamed from: e */
    public static final C5419r0 m21648e(InterfaceC5426s1 interfaceC5426s1, InterfaceC5376k interfaceC5376k) {
        boolean z10 = interfaceC5426s1.mo22141i() == EnumC5388m.f16584q;
        return new C5419r0(m21649f(interfaceC5426s1.mo22144l(), z10, true, interfaceC5426s1.mo22145m(), interfaceC5376k), m21649f(interfaceC5426s1.mo22140h(), z10, false, interfaceC5426s1.mo22139g(), interfaceC5376k), z10);
    }

    /* JADX INFO: renamed from: f */
    public static final C5419r0.a m21649f(C5407p0 c5407p0, boolean z10, boolean z11, int i10, InterfaceC5376k interfaceC5376k) {
        int iM21995g = z11 ? c5407p0.m21995g() : c5407p0.m21993e();
        if (i10 != c5407p0.m21997i()) {
            return c5407p0.m21989a(iM21995g);
        }
        long jMo21919a = interfaceC5376k.mo21919a(c5407p0, iM21995g);
        return c5407p0.m21989a(z10 ^ z11 ? C9137t3.m35523n(jMo21919a) : C9137t3.m35518i(jMo21919a));
    }

    /* JADX INFO: renamed from: g */
    public static final C5419r0.a m21650g(C5419r0.a aVar, C5407p0 c5407p0, int i10) {
        return C5419r0.a.m22117b(aVar, c5407p0.m21999k().m35384c(i10), i10, 0L, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public static final C5419r0 m21651h(C5419r0 c5419r0, InterfaceC5426s1 interfaceC5426s1) {
        if (AbstractC5444v1.m22179c(c5419r0, interfaceC5426s1)) {
            return (interfaceC5426s1.mo22133a() > 1 || interfaceC5426s1.mo22136d() == null || interfaceC5426s1.mo22135c().m21991c().length() == 0) ? c5419r0 : m21652i(c5419r0, interfaceC5426s1);
        }
        return c5419r0;
    }

    /* JADX INFO: renamed from: i */
    public static final C5419r0 m21652i(C5419r0 c5419r0, InterfaceC5426s1 interfaceC5426s1) {
        C5407p0 c5407p0Mo22135c = interfaceC5426s1.mo22135c();
        String strM21991c = c5407p0Mo22135c.m21991c();
        int iM21995g = c5407p0Mo22135c.m21995g();
        int length = strM21991c.length();
        if (iM21995g == 0) {
            int iM2845c = AbstractC0734b3.m2845c(strM21991c, 0);
            return interfaceC5426s1.mo22134b() ? C5419r0.m22111b(c5419r0, m21650g(c5419r0.m22115e(), c5407p0Mo22135c, iM2845c), null, true, 2, null) : C5419r0.m22111b(c5419r0, null, m21650g(c5419r0.m22113c(), c5407p0Mo22135c, iM2845c), false, 1, null);
        }
        if (iM21995g == length) {
            int iM2846d = AbstractC0734b3.m2846d(strM21991c, length);
            return interfaceC5426s1.mo22134b() ? C5419r0.m22111b(c5419r0, m21650g(c5419r0.m22115e(), c5407p0Mo22135c, iM2846d), null, false, 2, null) : C5419r0.m22111b(c5419r0, null, m21650g(c5419r0.m22113c(), c5407p0Mo22135c, iM2846d), true, 1, null);
        }
        C5419r0 c5419r0Mo22136d = interfaceC5426s1.mo22136d();
        boolean z10 = c5419r0Mo22136d != null && c5419r0Mo22136d.m22114d();
        int iM2846d2 = interfaceC5426s1.mo22134b() ^ z10 ? AbstractC0734b3.m2846d(strM21991c, iM21995g) : AbstractC0734b3.m2845c(strM21991c, iM21995g);
        return interfaceC5426s1.mo22134b() ? C5419r0.m22111b(c5419r0, m21650g(c5419r0.m22115e(), c5407p0Mo22135c, iM2846d2), null, z10, 2, null) : C5419r0.m22111b(c5419r0, null, m21650g(c5419r0.m22113c(), c5407p0Mo22135c, iM2846d2), z10, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m21653j(C5407p0 c5407p0, int i10, boolean z10) {
        if (c5407p0.m21994f() == -1) {
            return true;
        }
        if (i10 == c5407p0.m21994f()) {
            return false;
        }
        return z10 ^ (c5407p0.m21992d() == EnumC5388m.f16584q) ? i10 < c5407p0.m21994f() : i10 > c5407p0.m21994f();
    }

    /* JADX INFO: renamed from: k */
    public static final C5419r0.a m21654k(C5407p0 c5407p0, int i10, int i11, int i12, boolean z10, boolean z11) {
        long jM35382C = c5407p0.m21999k().m35382C(i11);
        int iM35523n = c5407p0.m21999k().m35397q(C9137t3.m35523n(jM35382C)) == i10 ? C9137t3.m35523n(jM35382C) : i10 >= c5407p0.m21999k().m35395n() ? c5407p0.m21999k().m35401u(c5407p0.m21999k().m35395n() - 1) : c5407p0.m21999k().m35401u(i10);
        int iM35518i = c5407p0.m21999k().m35397q(C9137t3.m35518i(jM35382C)) == i10 ? C9137t3.m35518i(jM35382C) : i10 >= c5407p0.m21999k().m35395n() ? C9122q3.m35379p(c5407p0.m21999k(), c5407p0.m21999k().m35395n() - 1, false, 2, null) : C9122q3.m35379p(c5407p0.m21999k(), i10, false, 2, null);
        if (iM35523n == i12) {
            return c5407p0.m21989a(iM35518i);
        }
        if (iM35518i == i12) {
            return c5407p0.m21989a(iM35523n);
        }
        if (!(z10 ^ z11) ? i11 >= iM35523n : i11 > iM35518i) {
            iM35523n = iM35518i;
        }
        return c5407p0.m21989a(iM35523n);
    }

    /* JADX INFO: renamed from: l */
    public static final C5419r0.a m21655l(final InterfaceC5426s1 interfaceC5426s1, final C5407p0 c5407p0, C5419r0.a aVar) {
        final int iM21995g = interfaceC5426s1.mo22134b() ? c5407p0.m21995g() : c5407p0.m21993e();
        if ((interfaceC5426s1.mo22134b() ? interfaceC5426s1.mo22145m() : interfaceC5426s1.mo22139g()) != c5407p0.m21997i()) {
            return c5407p0.m21989a(iM21995g);
        }
        EnumC4708o enumC4708o = EnumC4708o.f13923s;
        final InterfaceC4705l interfaceC4705lM18788b = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: n0.y0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Integer.valueOf(AbstractC5312a1.m21644a(c5407p0, iM21995g));
            }
        });
        final int iM21993e = interfaceC5426s1.mo22134b() ? c5407p0.m21993e() : c5407p0.m21995g();
        InterfaceC4705l interfaceC4705lM18788b2 = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: n0.z0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC5312a1.m21645b(c5407p0, iM21995g, iM21993e, interfaceC5426s1, interfaceC4705lM18788b);
            }
        });
        if (c5407p0.m21996h() != aVar.m22121e()) {
            return m21657n(interfaceC4705lM18788b2);
        }
        int iM21994f = c5407p0.m21994f();
        if (iM21995g == iM21994f) {
            return aVar;
        }
        if (m21656m(interfaceC4705lM18788b) != c5407p0.m21999k().m35397q(iM21994f)) {
            return m21657n(interfaceC4705lM18788b2);
        }
        int iM22120d = aVar.m22120d();
        long jM35382C = c5407p0.m21999k().m35382C(iM22120d);
        return !m21653j(c5407p0, iM21995g, interfaceC5426s1.mo22134b()) ? c5407p0.m21989a(iM21995g) : (iM22120d == C9137t3.m35523n(jM35382C) || iM22120d == C9137t3.m35518i(jM35382C)) ? m21657n(interfaceC4705lM18788b2) : c5407p0.m21989a(iM21995g);
    }

    /* JADX INFO: renamed from: m */
    public static final int m21656m(InterfaceC4705l interfaceC4705l) {
        return ((Number) interfaceC4705l.getValue()).intValue();
    }

    /* JADX INFO: renamed from: n */
    public static final C5419r0.a m21657n(InterfaceC4705l interfaceC4705l) {
        return (C5419r0.a) interfaceC4705l.getValue();
    }
}
