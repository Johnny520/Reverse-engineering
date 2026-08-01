package p150k1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0482e0;
import androidx.compose.runtime.C0460b;
import androidx.compose.runtime.C0479d4;
import androidx.compose.runtime.C0528k4;
import androidx.compose.runtime.C0535l4;
import androidx.compose.runtime.C0556o4;
import androidx.compose.runtime.C0617x;
import androidx.compose.runtime.InterfaceC0472c4;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: k1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3910c {
    /* JADX INFO: renamed from: a */
    public static final List m15572a(C0528k4 c0528k4) {
        if (c0528k4.m1816i() || c0528k4.m1831x() == 0) {
            return AbstractC5114x.m20800o();
        }
        C3930w c3930w = new C3930w(c0528k4);
        int iM1828u = c0528k4.m1828u();
        Object objValueOf = Integer.valueOf(c0528k4.m1832y());
        while (iM1828u >= 0) {
            c3930w.m15569f(c0528k4.m1787D(iM1828u), c0528k4.m1791H(iM1828u) ? c0528k4.m1788E(iM1828u) : InterfaceC0572r.f1573a.m2191a(), c0528k4.m1833z().m1895F(iM1828u), objValueOf);
            objValueOf = c0528k4.m1808a(iM1828u);
            iM1828u = c0528k4.m1800Q(iM1828u);
        }
        return c3930w.m15571i();
    }

    /* JADX INFO: renamed from: b */
    public static final List m15573b(C0556o4 c0556o4, Object obj, int i10, Integer num) {
        int iM2072g0;
        if (c0556o4.m2058Z() || c0556o4.m2064c0() == 0) {
            return AbstractC5114x.m20800o();
        }
        C3908a0 c3908a0 = new C3908a0(c0556o4);
        int iIntValue = num != null ? num.intValue() : c0556o4.m2062b0() < 0 ? c0556o4.m2019F0(i10) : c0556o4.m2062b0();
        if (obj == null) {
            obj = Integer.valueOf(c0556o4.m2078j0(i10));
        }
        if (c0556o4.m2096s0(i10)) {
            iM2072g0 = c0556o4.m2072g0(i10);
        } else {
            int iM2019F0 = iIntValue >= 0 ? c0556o4.m2019F0(iIntValue) : iIntValue;
            iM2072g0 = c0556o4.m2072g0(iIntValue);
            int i11 = iIntValue;
            iIntValue = iM2019F0;
            i10 = i11;
        }
        while (i10 >= 0) {
            c3908a0.m15569f(iM2072g0, c0556o4.m2080k0(i10) ? c0556o4.m2074h0(i10) : InterfaceC0572r.f1573a.m2191a(), c0556o4.m2069e1(i10), obj);
            obj = c0556o4.m2010B(i10);
            if (iIntValue >= 0) {
                int iM2019F02 = c0556o4.m2019F0(iIntValue);
                iM2072g0 = c0556o4.m2072g0(iIntValue);
                int i12 = iIntValue;
                iIntValue = iM2019F02;
                i10 = i12;
            } else {
                i10 = iIntValue;
            }
        }
        return c3908a0.m15571i();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m15574c(C0556o4 c0556o4, Object obj, int i10, Integer num, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            i10 = c0556o4.m2060a0();
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return m15573b(c0556o4, obj, i10, num);
    }

    /* JADX INFO: renamed from: d */
    public static final C3926s m15575d(C0535l4 c0535l4, InterfaceC0184l interfaceC0184l) {
        C0528k4 c0528k4M1891B = c0535l4.m1891B();
        for (int i10 = 0; i10 < c0535l4.m1907u(); i10++) {
            try {
                if (c0528k4M1891B.m1794K(i10) && ((Boolean) interfaceC0184l.mo27m(c0528k4M1891B.m1796M(i10))).booleanValue()) {
                    return new C3926s(i10, null);
                }
                int iM1805V = c0528k4M1891B.m1805V(i10);
                for (int i11 = 0; i11 < iM1805V; i11++) {
                    if (((Boolean) interfaceC0184l.mo27m(c0528k4M1891B.m1786C(i10, i11))).booleanValue()) {
                        return new C3926s(i10, Integer.valueOf(i11));
                    }
                }
            } finally {
                c0528k4M1891B.m1811d();
            }
        }
        C4700i0 c4700i0 = C4700i0.f13910a;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Integer m15576e(C0535l4 c0535l4, AbstractC0482e0 abstractC0482e0) {
        C0528k4 c0528k4M1891B = c0535l4.m1891B();
        try {
            return m15577f(c0528k4M1891B, abstractC0482e0, 0, c0528k4M1891B.m1831x());
        } finally {
            c0528k4M1891B.m1811d();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Integer m15577f(C0528k4 c0528k4, AbstractC0482e0 abstractC0482e0, int i10, int i11) {
        Integer numM15577f;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int iM1789F = c0528k4.m1789F(i10) + i10;
            if (c0528k4.m1790G(i10) && c0528k4.m1787D(i10) == 206 && AbstractC1061t.m3842c(c0528k4.m1788E(i10), AbstractC0468c0.m1555i())) {
                Object objM1786C = c0528k4.m1786C(i10, 0);
                C0479d4 c0479d4 = objM1786C instanceof C0479d4 ? (C0479d4) objM1786C : null;
                InterfaceC0472c4 interfaceC0472c4M1601b = c0479d4 != null ? c0479d4.m1601b() : null;
                C0617x.a aVar = interfaceC0472c4M1601b instanceof C0617x.a ? (C0617x.a) interfaceC0472c4M1601b : null;
                if (aVar != null && AbstractC1061t.m3842c(aVar.m2421a(), abstractC0482e0)) {
                    return Integer.valueOf(i10);
                }
            }
            if (c0528k4.m1812e(i10) && (numM15577f = m15577f(c0528k4, abstractC0482e0, i10 + 1, iM1789F)) != null) {
                return Integer.valueOf(numM15577f.intValue());
            }
            i10 = iM1789F;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final List m15578g(C0528k4 c0528k4, int i10, Object obj) {
        C3930w c3930w = new C3930w(c0528k4);
        int iM1800Q = c0528k4.m1800Q(i10);
        C0460b c0460bM1808a = c0528k4.m1808a(i10);
        while (i10 >= 0) {
            c3930w.m15569f(c0528k4.m1787D(i10), c0528k4.m1791H(i10) ? c0528k4.m1788E(i10) : InterfaceC0572r.f1573a.m2191a(), c0528k4.m1833z().m1895F(i10), obj);
            if (iM1800Q >= 0) {
                C0460b c0460b = c0460bM1808a;
                c0460bM1808a = c0528k4.m1808a(iM1800Q);
                i10 = iM1800Q;
                iM1800Q = c0528k4.m1800Q(iM1800Q);
                obj = c0460b;
            } else {
                i10 = iM1800Q;
                obj = c0460bM1808a;
            }
        }
        return c3930w.m15571i();
    }
}
