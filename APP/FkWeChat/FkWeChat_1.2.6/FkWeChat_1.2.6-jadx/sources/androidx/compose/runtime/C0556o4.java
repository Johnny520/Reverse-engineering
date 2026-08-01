package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC0572r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p117i.AbstractC3081r;
import p117i.C3055g0;
import p117i.C3058h0;
import p117i.C3061i0;
import p117i.C3076o0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: androidx.compose.runtime.o4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0556o4 {

    /* JADX INFO: renamed from: y */
    public static final a f1521y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final int f1522z = 8;

    /* JADX INFO: renamed from: a */
    public final C0535l4 f1523a;

    /* JADX INFO: renamed from: b */
    public int[] f1524b;

    /* JADX INFO: renamed from: c */
    public Object[] f1525c;

    /* JADX INFO: renamed from: d */
    public ArrayList f1526d;

    /* JADX INFO: renamed from: e */
    public HashMap f1527e;

    /* JADX INFO: renamed from: f */
    public C3058h0 f1528f;

    /* JADX INFO: renamed from: g */
    public int f1529g;

    /* JADX INFO: renamed from: h */
    public int f1530h;

    /* JADX INFO: renamed from: i */
    public int f1531i;

    /* JADX INFO: renamed from: j */
    public int f1532j;

    /* JADX INFO: renamed from: k */
    public int f1533k;

    /* JADX INFO: renamed from: l */
    public int f1534l;

    /* JADX INFO: renamed from: m */
    public int f1535m;

    /* JADX INFO: renamed from: n */
    public int f1536n;

    /* JADX INFO: renamed from: o */
    public int f1537o;

    /* JADX INFO: renamed from: s */
    public C3058h0 f1541s;

    /* JADX INFO: renamed from: t */
    public int f1542t;

    /* JADX INFO: renamed from: u */
    public int f1543u;

    /* JADX INFO: renamed from: w */
    public boolean f1545w;

    /* JADX INFO: renamed from: x */
    public C3055g0 f1546x;

    /* JADX INFO: renamed from: p */
    public final C0546n1 f1538p = new C0546n1();

    /* JADX INFO: renamed from: q */
    public final C0546n1 f1539q = new C0546n1();

    /* JADX INFO: renamed from: r */
    public final C0546n1 f1540r = new C0546n1();

    /* JADX INFO: renamed from: v */
    public int f1544v = -1;

    public C0556o4(C0535l4 c0535l4) {
        this.f1523a = c0535l4;
        this.f1524b = c0535l4.m1906t();
        this.f1525c = c0535l4.m1908v();
        this.f1526d = c0535l4.m1904r();
        this.f1527e = c0535l4.m1910x();
        this.f1528f = c0535l4.m1905s();
        this.f1529g = c0535l4.m1907u();
        this.f1530h = (this.f1524b.length / 5) - c0535l4.m1907u();
        this.f1533k = c0535l4.m1909w();
        this.f1534l = this.f1525c.length - c0535l4.m1909w();
        this.f1535m = c0535l4.m1907u();
        this.f1543u = c0535l4.m1907u();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m2002u0(C0556o4 c0556o4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c0556o4.f1544v;
        }
        c0556o4.m2098t0(i10);
    }

    /* JADX INFO: renamed from: A */
    public final void m2008A(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            AbstractC0468c0.m1548b("Cannot seek backwards");
        }
        if (!(this.f1536n <= 0)) {
            AbstractC0464b3.m1536b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f1542t + i10;
        if (i11 >= this.f1544v && i11 <= this.f1543u) {
            z10 = true;
        }
        if (!z10) {
            AbstractC0468c0.m1548b("Cannot seek outside the current group (" + this.f1544v + '-' + this.f1543u + ')');
        }
        this.f1542t = i11;
        int iM2038P = m2038P(this.f1524b, m2070f0(i11));
        this.f1531i = iM2038P;
        this.f1532j = iM2038P;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m2009A0(int i10, int i11) {
        int i12 = this.f1534l;
        int i13 = this.f1533k;
        int i14 = this.f1535m;
        if (i13 != i10) {
            Object[] objArr = this.f1525c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, m2064c0());
        if (i14 != iMin) {
            int length = this.f1525c.length - i12;
            if (iMin < i14) {
                int iM2070f0 = m2070f0(iMin);
                int iM2070f02 = m2070f0(i14);
                int i16 = this.f1529g;
                while (iM2070f0 < iM2070f02) {
                    int i17 = (iM2070f0 * 5) + 4;
                    int i18 = this.f1524b[i17];
                    if (!(i18 >= 0)) {
                        AbstractC0468c0.m1548b("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f1524b[i17] = -((length - i18) + 1);
                    iM2070f0++;
                    if (iM2070f0 == i16) {
                        iM2070f0 += this.f1530h;
                    }
                }
            } else {
                int iM2070f03 = m2070f0(i14);
                int iM2070f04 = m2070f0(iMin);
                while (iM2070f03 < iM2070f04) {
                    int i19 = (iM2070f03 * 5) + 4;
                    int i20 = this.f1524b[i19];
                    if (!(i20 < 0)) {
                        AbstractC0468c0.m1548b("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f1524b[i19] = i20 + length + 1;
                    iM2070f03++;
                    if (iM2070f03 == this.f1529g) {
                        iM2070f03 += this.f1530h;
                    }
                }
            }
            this.f1535m = iMin;
        }
        this.f1533k = i10;
    }

    /* JADX INFO: renamed from: B */
    public final C0460b m2010B(int i10) {
        ArrayList arrayList = this.f1526d;
        int iM1960s = AbstractC0549n4.m1960s(arrayList, i10, m2064c0());
        if (iM1960s >= 0) {
            return (C0460b) arrayList.get(iM1960s);
        }
        if (i10 > this.f1529g) {
            i10 = -(m2064c0() - i10);
        }
        C0460b c0460b = new C0460b(i10);
        arrayList.add(-(iM1960s + 1), c0460b);
        return c0460b;
    }

    /* JADX INFO: renamed from: B0 */
    public final Object m2011B0(int i10) {
        int iM2070f0 = m2070f0(i10);
        int[] iArr = this.f1524b;
        if ((iArr[(iM2070f0 * 5) + 1] & 1073741824) != 0) {
            return this.f1525c[m2040Q(m2017E0(iArr, iM2070f0))];
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final int m2012C(C0460b c0460b) {
        int iM1527a = c0460b.m1527a();
        return iM1527a < 0 ? m2064c0() + iM1527a : iM1527a;
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m2013C0(C0460b c0460b) {
        return m2011B0(c0460b.m1531e(this));
    }

    /* JADX INFO: renamed from: D */
    public final void m2014D(C0460b c0460b, Object obj) {
        if (!(this.f1536n == 0)) {
            AbstractC0468c0.m1548b("Can only append a slot if not current inserting");
        }
        int i10 = this.f1531i;
        int i11 = this.f1532j;
        int iM2012C = m2012C(c0460b);
        int iM2038P = m2038P(this.f1524b, m2070f0(iM2012C + 1));
        this.f1531i = iM2038P;
        this.f1532j = iM2038P;
        m2090p0(1, iM2012C);
        if (i10 >= iM2038P) {
            i10++;
            i11++;
        }
        this.f1525c[iM2038P] = obj;
        this.f1531i = i10;
        this.f1532j = i11;
    }

    /* JADX INFO: renamed from: D0 */
    public final int m2015D0(int i10) {
        return this.f1524b[(m2070f0(i10) * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: E */
    public final int m2016E(int[] iArr, int i10) {
        return m2038P(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    /* JADX INFO: renamed from: E0 */
    public final int m2017E0(int[] iArr, int i10) {
        return m2038P(iArr, i10);
    }

    /* JADX INFO: renamed from: F */
    public final void m2018F() {
        int i10 = this.f1536n;
        this.f1536n = i10 + 1;
        if (i10 == 0) {
            m2043R0();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final int m2019F0(int i10) {
        return m2021G0(this.f1524b, i10);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m2020G(int i10) {
        int iM2076i0 = i10 + 1;
        int iM2076i02 = i10 + m2076i0(i10);
        while (iM2076i0 < iM2076i02) {
            if ((this.f1524b[(m2070f0(iM2076i0) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iM2076i0 += m2076i0(iM2076i0);
        }
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    public final int m2021G0(int[] iArr, int i10) {
        return m2023H0(iArr[(m2070f0(i10) * 5) + 2]);
    }

    /* JADX INFO: renamed from: H */
    public final int m2022H(int i10, int i11) {
        int iM2076i0 = m2076i0(i10) + i10;
        int iM1956o = i10 + 1;
        int i12 = 0;
        while (iM1956o < iM2076i0 && i12 < i11) {
            int iM2070f0 = m2070f0(iM1956o);
            iM1956o += AbstractC0549n4.m1956o(this.f1524b, iM2070f0);
            if (iM1956o < iM2076i0 && (this.f1524b[(iM2070f0 * 5) + 1] & 536870912) == 0) {
                i12++;
            }
        }
        return iM1956o;
    }

    /* JADX INFO: renamed from: H0 */
    public final int m2023H0(int i10) {
        return i10 > -2 ? i10 : (m2064c0() + i10) - (-2);
    }

    /* JADX INFO: renamed from: I */
    public final Object m2024I(int i10) {
        int iM2040Q = m2040Q(i10);
        Object[] objArr = this.f1525c;
        Object obj = objArr[iM2040Q];
        objArr[iM2040Q] = InterfaceC0572r.f1573a.m2191a();
        return obj;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m2025I0(int i10, int i11) {
        return i10 < i11 ? i10 : -((m2064c0() - i10) + 2);
    }

    /* JADX INFO: renamed from: J */
    public final void m2026J() {
        int i10 = this.f1533k;
        AbstractC5102r.m20672x(this.f1525c, null, i10, this.f1534l + i10);
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m2027J0(Object obj) {
        Object objM2051V0 = m2051V0();
        m2049U0(obj);
        return objM2051V0;
    }

    /* JADX INFO: renamed from: K */
    public final void m2028K(boolean z10) {
        this.f1545w = true;
        if (z10 && this.f1538p.f1500b == 0) {
            m2105y0(m2064c0());
            m2009A0(this.f1525c.length - this.f1534l, this.f1529g);
            m2026J();
            m2029K0();
        }
        this.f1523a.m1900l(this, this.f1524b, this.f1529g, this.f1525c, this.f1533k, this.f1526d, this.f1527e, this.f1528f);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2029K0() {
        C3055g0 c3055g0 = this.f1546x;
        if (c3055g0 != null) {
            while (AbstractC0485e3.m1637d(c3055g0)) {
                m2093q1(AbstractC0485e3.m1639f(c3055g0), c3055g0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m2030L(int i10) {
        return i10 >= 0 && (this.f1524b[(m2070f0(i10) * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m2031L0(int i10, int i11, HashMap map) {
        int i12 = i11 + i10;
        int iM1958q = AbstractC0549n4.m1958q(this.f1526d, i12, m2056Y() - this.f1530h);
        if (iM1958q >= this.f1526d.size()) {
            iM1958q--;
        }
        int i13 = iM1958q + 1;
        int i14 = 0;
        while (iM1958q >= 0) {
            C0460b c0460b = (C0460b) this.f1526d.get(iM1958q);
            int iM2012C = m2012C(c0460b);
            if (iM2012C < i10) {
                break;
            }
            if (iM2012C < i12) {
                c0460b.m1529c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i14 == 0) {
                    i14 = iM1958q + 1;
                }
                i13 = iM1958q;
            }
            iM1958q--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f1526d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m2032M(int i10) {
        return i10 >= 0 && (this.f1524b[(m2070f0(i10) * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m2033M0() {
        if (!(this.f1536n == 0)) {
            AbstractC0468c0.m1548b("Cannot remove group while inserting");
        }
        int i10 = this.f1542t;
        int i11 = this.f1531i;
        int iM2038P = m2038P(this.f1524b, m2070f0(i10));
        int iM2053W0 = m2053W0();
        m2069e1(this.f1544v);
        C3055g0 c3055g0 = this.f1546x;
        if (c3055g0 != null) {
            while (AbstractC0485e3.m1637d(c3055g0) && AbstractC0485e3.m1638e(c3055g0) >= i10) {
                AbstractC0485e3.m1639f(c3055g0);
            }
        }
        boolean zM2035N0 = m2035N0(i10, this.f1542t - i10);
        m2037O0(iM2038P, this.f1531i - iM2038P, i10 - 1);
        this.f1542t = i10;
        this.f1531i = i11;
        this.f1537o -= iM2053W0;
        return zM2035N0;
    }

    /* JADX INFO: renamed from: N */
    public final int m2034N(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m2035N0(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f1526d;
            m2105y0(i10);
            zM2031L0 = arrayList.isEmpty() ? false : m2031L0(i10, i11, this.f1527e);
            this.f1529g = i10;
            this.f1530h += i11;
            int i12 = this.f1535m;
            if (i12 > i10) {
                this.f1535m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f1543u;
            if (i13 >= this.f1529g) {
                this.f1543u = i13 - i11;
            }
            int i14 = this.f1544v;
            if (m2032M(i14)) {
                m2091p1(i14);
            }
        }
        return zM2031L0;
    }

    /* JADX INFO: renamed from: O */
    public final int m2036O(int i10) {
        return m2038P(this.f1524b, m2070f0(i10));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2037O0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f1534l;
            int i14 = i10 + i11;
            m2009A0(i14, i12);
            this.f1533k = i10;
            this.f1534l = i13 + i11;
            AbstractC5102r.m20672x(this.f1525c, null, i10, i14);
            int i15 = this.f1532j;
            if (i15 >= i10) {
                this.f1532j = i15 - i11;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final int m2038P(int[] iArr, int i10) {
        return i10 >= m2056Y() ? this.f1525c.length - this.f1534l : m2034N(iArr[(i10 * 5) + 4], this.f1534l, this.f1525c.length);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2039P0() {
        if (!(this.f1536n == 0)) {
            AbstractC0468c0.m1548b("Cannot reset when inserting");
        }
        m2029K0();
        this.f1542t = 0;
        this.f1543u = m2056Y() - this.f1530h;
        this.f1531i = 0;
        this.f1532j = 0;
        this.f1537o = 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m2040Q(int i10) {
        return i10 + (this.f1534l * (i10 < this.f1533k ? 0 : 1));
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m2041Q0() {
        int iM2056Y = (m2056Y() - this.f1530h) - this.f1539q.m1939g();
        this.f1543u = iM2056Y;
        return iM2056Y;
    }

    /* JADX INFO: renamed from: R */
    public final int m2042R(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m2043R0() {
        this.f1539q.m1940h((m2056Y() - this.f1530h) - this.f1543u);
    }

    /* JADX INFO: renamed from: S */
    public final int m2044S() {
        C3076o0 c3076o0;
        boolean z10 = this.f1536n > 0;
        int i10 = this.f1542t;
        int i11 = this.f1543u;
        int i12 = this.f1544v;
        int iM2070f0 = m2070f0(i12);
        int i13 = this.f1537o;
        int i14 = i10 - i12;
        int i15 = (iM2070f0 * 5) + 1;
        boolean z11 = (this.f1524b[i15] & 1073741824) != 0;
        if (z10) {
            C3058h0 c3058h0 = this.f1541s;
            if (c3058h0 != null && (c3076o0 = (C3076o0) c3058h0.m11449b(i12)) != null) {
                Object[] objArr = c3076o0.f8235a;
                int i16 = c3076o0.f8236b;
                for (int i17 = 0; i17 < i16; i17++) {
                    m2027J0(objArr[i17]);
                }
            }
            AbstractC0549n4.m1964w(this.f1524b, iM2070f0, i14);
            AbstractC0549n4.m1966y(this.f1524b, iM2070f0, i13);
            this.f1537o = this.f1540r.m1939g() + (z11 ? 1 : i13);
            int iM2021G0 = m2021G0(this.f1524b, i12);
            this.f1544v = iM2021G0;
            int iM2064c0 = iM2021G0 < 0 ? m2064c0() : m2070f0(iM2021G0 + 1);
            int iM2038P = iM2064c0 >= 0 ? m2038P(this.f1524b, iM2064c0) : 0;
            this.f1531i = iM2038P;
            this.f1532j = iM2038P;
            return i13;
        }
        if (!(i10 == i11)) {
            AbstractC0468c0.m1548b("Expected to be at the end of a group");
        }
        int iM1956o = AbstractC0549n4.m1956o(this.f1524b, iM2070f0);
        int[] iArr = this.f1524b;
        int i18 = iArr[i15] & 67108863;
        AbstractC0549n4.m1964w(iArr, iM2070f0, i14);
        AbstractC0549n4.m1966y(this.f1524b, iM2070f0, i13);
        int iM1939g = this.f1538p.m1939g();
        m2041Q0();
        this.f1544v = iM1939g;
        int iM2021G02 = m2021G0(this.f1524b, i12);
        int iM1939g2 = this.f1540r.m1939g();
        this.f1537o = iM1939g2;
        if (iM2021G02 == iM1939g) {
            this.f1537o = iM1939g2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iM1956o;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iM2021G02 != 0 && iM2021G02 != iM1939g && (i20 != 0 || i19 != 0)) {
                int iM2070f02 = m2070f0(iM2021G02);
                if (i19 != 0) {
                    AbstractC0549n4.m1964w(this.f1524b, iM2070f02, AbstractC0549n4.m1956o(this.f1524b, iM2070f02) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.f1524b;
                    AbstractC0549n4.m1966y(iArr2, iM2070f02, (iArr2[(iM2070f02 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr3 = this.f1524b;
                if ((iArr3[(iM2070f02 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iM2021G02 = m2021G0(iArr3, iM2021G02);
            }
        }
        this.f1537o += i20;
        return i13;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m2045S0(C0460b c0460b) {
        m2008A(c0460b.m1531e(this) - this.f1542t);
    }

    /* JADX INFO: renamed from: T */
    public final void m2046T() {
        if (!(this.f1536n > 0)) {
            AbstractC0464b3.m1536b("Unbalanced begin/end insert");
        }
        int i10 = this.f1536n - 1;
        this.f1536n = i10;
        if (i10 == 0) {
            if (!(this.f1540r.f1500b == this.f1538p.f1500b)) {
                AbstractC0468c0.m1548b("startGroup/endGroup mismatch while inserting");
            }
            m2041Q0();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final Object m2047T0(int i10, int i11, Object obj) {
        int iM2040Q = m2040Q(m2063b1(i10, i11));
        Object[] objArr = this.f1525c;
        Object obj2 = objArr[iM2040Q];
        objArr[iM2040Q] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: U */
    public final void m2048U(int i10) {
        boolean z10 = false;
        if (!(this.f1536n <= 0)) {
            AbstractC0468c0.m1548b("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f1544v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f1543u) {
                z10 = true;
            }
            if (!z10) {
                AbstractC0468c0.m1548b("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f1542t;
            int i13 = this.f1531i;
            int i14 = this.f1532j;
            this.f1542t = i10;
            m2073g1();
            this.f1542t = i12;
            this.f1531i = i13;
            this.f1532j = i14;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m2049U0(Object obj) {
        if (!(this.f1531i <= this.f1532j)) {
            AbstractC0468c0.m1548b("Writing to an invalid slot");
        }
        this.f1525c[m2040Q(this.f1531i - 1)] = obj;
    }

    /* JADX INFO: renamed from: V */
    public final void m2050V(C0460b c0460b) {
        m2048U(c0460b.m1531e(this));
    }

    /* JADX INFO: renamed from: V0 */
    public final Object m2051V0() {
        if (this.f1536n > 0) {
            m2090p0(1, this.f1544v);
        }
        Object[] objArr = this.f1525c;
        int i10 = this.f1531i;
        this.f1531i = i10 + 1;
        return objArr[m2040Q(i10)];
    }

    /* JADX INFO: renamed from: W */
    public final void m2052W(int i10, int i11, int i12) {
        int iM2025I0 = m2025I0(i10, this.f1529g);
        while (i12 < i11) {
            this.f1524b[(m2070f0(i12) * 5) + 2] = iM2025I0;
            int iM1956o = AbstractC0549n4.m1956o(this.f1524b, m2070f0(i12)) + i12;
            m2052W(i12, iM1956o, i12 + 1);
            i12 = iM1956o;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final int m2053W0() {
        int iM2070f0 = m2070f0(this.f1542t);
        int iM1956o = this.f1542t + AbstractC0549n4.m1956o(this.f1524b, iM2070f0);
        this.f1542t = iM1956o;
        this.f1531i = m2038P(this.f1524b, m2070f0(iM1956o));
        int i10 = this.f1524b[(iM2070f0 * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    /* JADX INFO: renamed from: X */
    public final void m2054X(int i10, InterfaceC0188p interfaceC0188p) {
        int i11;
        int i12;
        int iM1600a;
        InterfaceC0188p interfaceC0188p2 = interfaceC0188p;
        int iM2019F0 = m2019F0(i10);
        int iM2064c0 = m2064c0();
        int iM2076i0 = m2076i0(i10) + i10;
        AbstractC1043k abstractC1043k = null;
        int i13 = i10;
        C3061i0 c3061i0M11514b = null;
        C3055g0 c3055g0 = null;
        while (i13 < iM2076i0) {
            int iM2036O = m2036O(i13);
            int i14 = i13 + 1;
            int iM2036O2 = m2036O(i14);
            while (true) {
                i11 = 0;
                if (iM2036O >= iM2036O2) {
                    break;
                }
                Object obj = this.f1525c[m2040Q(iM2036O)];
                if (!(obj instanceof C0479d4) || (iM1600a = ((C0479d4) obj).m1600a()) < 0) {
                    interfaceC0188p2.invoke(Integer.valueOf(iM2036O), obj);
                } else {
                    int iM2022H = m2022H(i13, iM1600a);
                    if (c3061i0M11514b == null) {
                        c3061i0M11514b = AbstractC3081r.m11514b();
                    }
                    if (c3055g0 == null) {
                        c3055g0 = new C3055g0(i11, 1, abstractC1043k);
                    }
                    c3061i0M11514b.m11336g(iM2022H);
                    c3055g0.m11303j(iM2022H);
                    c3055g0.m11303j(iM2036O);
                }
                iM2036O++;
            }
            int iM2019F02 = i14 < iM2064c0 ? m2019F0(i14) : -1;
            if (iM2019F02 != i13) {
                while (true) {
                    if (c3055g0 == null || c3061i0M11514b == null || !c3061i0M11514b.m11348s(i13)) {
                        i12 = iM2064c0;
                    } else {
                        int i15 = c3055g0.f8151b;
                        int i16 = i15 / 2;
                        int i17 = i11;
                        int i18 = i17;
                        while (i18 < i16) {
                            int i19 = i18 * 2;
                            int i20 = iM2064c0;
                            int iM11417e = c3055g0.m11417e(i19);
                            if (iM11417e == i13) {
                                int iM11417e2 = c3055g0.m11417e(i19 + 1);
                                interfaceC0188p2.invoke(Integer.valueOf(iM11417e2), this.f1525c[m2040Q(iM11417e2)]);
                            } else if (i19 != i17) {
                                int i21 = i17 + 1;
                                c3055g0.m11309p(i17, iM11417e);
                                i17 += 2;
                                c3055g0.m11309p(i21, c3055g0.m11417e(i19 + 1));
                            } else {
                                i17 += 2;
                            }
                            i18++;
                            interfaceC0188p2 = interfaceC0188p;
                            iM2064c0 = i20;
                        }
                        i12 = iM2064c0;
                        if (i17 != i15) {
                            c3055g0.m11308o(i17, i15);
                        }
                    }
                    if (i13 == i10 || iM2019F0 == iM2019F02) {
                        break;
                    }
                    i13 = iM2019F0;
                    iM2064c0 = i12;
                    i11 = 0;
                    iM2019F0 = m2019F0(iM2019F0);
                    interfaceC0188p2 = interfaceC0188p;
                }
            } else {
                i12 = iM2064c0;
            }
            interfaceC0188p2 = interfaceC0188p;
            iM2019F0 = iM2019F02;
            i13 = i14;
            iM2064c0 = i12;
            abstractC1043k = null;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m2055X0() {
        int i10 = this.f1543u;
        this.f1542t = i10;
        this.f1531i = m2038P(this.f1524b, m2070f0(i10));
    }

    /* JADX INFO: renamed from: Y */
    public final int m2056Y() {
        return this.f1524b.length / 5;
    }

    /* JADX INFO: renamed from: Y0 */
    public final Object m2057Y0(int i10, int i11) {
        int iM2061a1 = m2061a1(this.f1524b, m2070f0(i10));
        int iM2038P = m2038P(this.f1524b, m2070f0(i10 + 1));
        int i12 = i11 + iM2061a1;
        if (iM2061a1 > i12 || i12 >= iM2038P) {
            return InterfaceC0572r.f1573a.m2191a();
        }
        return this.f1525c[m2040Q(i12)];
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2058Z() {
        return this.f1545w;
    }

    /* JADX INFO: renamed from: Z0 */
    public final Object m2059Z0(C0460b c0460b, int i10) {
        return m2057Y0(m2012C(c0460b), i10);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m2060a0() {
        return this.f1542t;
    }

    /* JADX INFO: renamed from: a1 */
    public final int m2061a1(int[] iArr, int i10) {
        return i10 >= m2056Y() ? this.f1525c.length - this.f1534l : m2034N(AbstractC0549n4.m1961t(iArr, i10), this.f1534l, this.f1525c.length);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m2062b0() {
        return this.f1544v;
    }

    /* JADX INFO: renamed from: b1 */
    public final int m2063b1(int i10, int i11) {
        int iM2061a1 = m2061a1(this.f1524b, m2070f0(i10));
        int i12 = iM2061a1 + i11;
        if (!(i12 >= iM2061a1 && i12 < m2038P(this.f1524b, m2070f0(i10 + 1)))) {
            AbstractC0468c0.m1548b("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m2064c0() {
        return m2056Y() - this.f1530h;
    }

    /* JADX INFO: renamed from: c1 */
    public final int m2065c1(int i10) {
        return m2038P(this.f1524b, m2070f0(i10 + 1));
    }

    /* JADX INFO: renamed from: d0 */
    public final C0535l4 m2066d0() {
        return this.f1523a;
    }

    /* JADX INFO: renamed from: d1 */
    public final int m2067d1(int i10) {
        return m2061a1(this.f1524b, m2070f0(i10));
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m2068e0(int i10) {
        int iM2070f0 = m2070f0(i10);
        int[] iArr = this.f1524b;
        return (iArr[(iM2070f0 * 5) + 1] & 268435456) != 0 ? this.f1525c[m2016E(iArr, iM2070f0)] : InterfaceC0572r.f1573a.m2191a();
    }

    /* JADX INFO: renamed from: e1 */
    public final AbstractC0539m1 m2069e1(int i10) {
        C0460b c0460bM2083l1;
        HashMap map = this.f1527e;
        if (map == null || (c0460bM2083l1 = m2083l1(i10)) == null) {
            return null;
        }
        return (AbstractC0539m1) map.get(c0460bM2083l1);
    }

    /* JADX INFO: renamed from: f0 */
    public final int m2070f0(int i10) {
        return i10 + (this.f1530h * (i10 < this.f1529g ? 0 : 1));
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2071f1(int i10, Object obj, Object obj2) {
        m2077i1(i10, obj, false, obj2);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m2072g0(int i10) {
        return this.f1524b[m2070f0(i10) * 5];
    }

    /* JADX INFO: renamed from: g1 */
    public final void m2073g1() {
        if (!(this.f1536n == 0)) {
            AbstractC0468c0.m1548b("Key must be supplied when inserting");
        }
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        m2077i1(0, aVar.m2191a(), false, aVar.m2191a());
    }

    /* JADX INFO: renamed from: h0 */
    public final Object m2074h0(int i10) {
        int iM2070f0 = m2070f0(i10);
        int[] iArr = this.f1524b;
        if ((iArr[(iM2070f0 * 5) + 1] & 536870912) != 0) {
            return this.f1525c[AbstractC0549n4.m1959r(iArr, iM2070f0)];
        }
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2075h1(int i10, Object obj) {
        m2077i1(i10, obj, false, InterfaceC0572r.f1573a.m2191a());
    }

    /* JADX INFO: renamed from: i0 */
    public final int m2076i0(int i10) {
        return AbstractC0549n4.m1956o(this.f1524b, m2070f0(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX INFO: renamed from: i1 */
    public final void m2077i1(int i10, Object obj, boolean z10, Object obj2) {
        int iM1956o;
        int i11 = this.f1544v;
        Object[] objArr = this.f1536n > 0;
        this.f1540r.m1940h(this.f1537o);
        if (objArr == true) {
            int i12 = this.f1542t;
            int iM2038P = m2038P(this.f1524b, m2070f0(i12));
            m2088o0(1);
            this.f1531i = iM2038P;
            this.f1532j = iM2038P;
            int iM2070f0 = m2070f0(i12);
            InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
            ?? r12 = obj != aVar.m2191a() ? 1 : 0;
            ?? r13 = (z10 || obj2 == aVar.m2191a()) ? 0 : 1;
            int iM2042R = m2042R(iM2038P, this.f1533k, this.f1534l, this.f1525c.length);
            if (iM2042R >= 0 && this.f1535m < i12) {
                iM2042R = -(((this.f1525c.length - this.f1534l) - iM2042R) + 1);
            }
            AbstractC0549n4.m1957p(this.f1524b, iM2070f0, i10, z10, r12, r13, this.f1544v, iM2042R);
            int i13 = (z10 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                m2090p0(i13, i12);
                Object[] objArr2 = this.f1525c;
                int i14 = this.f1531i;
                if (z10) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f1531i = i14;
            }
            this.f1537o = 0;
            iM1956o = i12 + 1;
            this.f1544v = i12;
            this.f1542t = iM1956o;
            if (i11 >= 0) {
                m2069e1(i11);
            }
        } else {
            this.f1538p.m1940h(i11);
            m2043R0();
            int i15 = this.f1542t;
            int iM2070f02 = m2070f0(i15);
            if (!AbstractC1061t.m3842c(obj2, InterfaceC0572r.f1573a.m2191a())) {
                if (z10) {
                    m2099t1(obj2);
                } else {
                    m2089o1(obj2);
                }
            }
            this.f1531i = m2061a1(this.f1524b, iM2070f02);
            this.f1532j = m2038P(this.f1524b, m2070f0(this.f1542t + 1));
            int[] iArr = this.f1524b;
            this.f1537o = iArr[(iM2070f02 * 5) + 1] & 67108863;
            this.f1544v = i15;
            this.f1542t = i15 + 1;
            iM1956o = i15 + AbstractC0549n4.m1956o(iArr, iM2070f02);
        }
        this.f1543u = iM1956o;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m2078j0(int i10) {
        C3076o0 c3076o0;
        int iM2067d1 = this.f1531i - m2067d1(i10);
        C3058h0 c3058h0 = this.f1541s;
        return iM2067d1 + ((c3058h0 == null || (c3076o0 = (C3076o0) c3058h0.m11449b(i10)) == null) ? 0 : c3076o0.m11587e());
    }

    /* JADX INFO: renamed from: j1 */
    public final void m2079j1(int i10, Object obj) {
        m2077i1(i10, obj, true, InterfaceC0572r.f1573a.m2191a());
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m2080k0(int i10) {
        return (this.f1524b[(m2070f0(i10) * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m2081k1(int i10) {
        if (!(i10 > 0)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        int i11 = this.f1544v;
        int iM2061a1 = m2061a1(this.f1524b, m2070f0(i11));
        int iM2038P = m2038P(this.f1524b, m2070f0(i11 + 1)) - i10;
        if (!(iM2038P >= iM2061a1)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        m2037O0(iM2038P, i10, i11);
        int i12 = this.f1531i;
        if (i12 >= iM2061a1) {
            this.f1531i = i12 - i10;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m2082l0(int i10) {
        return m2084m0(i10, this.f1542t);
    }

    /* JADX INFO: renamed from: l1 */
    public final C0460b m2083l1(int i10) {
        if (i10 < 0 || i10 >= m2064c0()) {
            return null;
        }
        return AbstractC0549n4.m1955n(this.f1526d, i10, m2064c0());
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m2084m0(int i10, int i11) {
        int iM1934b;
        int iM2056Y;
        if (i11 == this.f1544v) {
            iM2056Y = this.f1543u;
        } else if (i11 <= this.f1538p.m1938f(0) && (iM1934b = this.f1538p.m1934b(i11)) >= 0) {
            iM2056Y = (m2056Y() - this.f1530h) - this.f1539q.m1936d(iM1934b);
        } else {
            int iM2076i0 = m2076i0(i11);
            iM2056Y = iM2076i0 + i11;
        }
        return i10 > i11 && i10 < iM2056Y;
    }

    /* JADX INFO: renamed from: m1 */
    public final Object m2085m1(Object obj) {
        if (this.f1536n <= 0 || this.f1531i == this.f1533k) {
            return m2027J0(obj);
        }
        C3058h0 c3058h0 = this.f1541s;
        AbstractC1043k abstractC1043k = null;
        int i10 = 1;
        int i11 = 0;
        if (c3058h0 == null) {
            c3058h0 = new C3058h0(i11, i10, abstractC1043k);
        }
        this.f1541s = c3058h0;
        int i12 = this.f1544v;
        Object objM11449b = c3058h0.m11449b(i12);
        if (objM11449b == null) {
            objM11449b = new C3076o0(i11, i10, abstractC1043k);
            c3058h0.m11326r(i12, objM11449b);
        }
        ((C3076o0) objM11449b).m11461n(obj);
        return InterfaceC0572r.f1573a.m2191a();
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m2086n0(int i10) {
        int i11 = this.f1544v;
        if (i10 <= i11 || i10 >= this.f1543u) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m2087n1(int i10, int i11) {
        C0460b c0460b;
        int iM1527a;
        C0460b c0460b2;
        int iM1527a2;
        int i12;
        int iM2056Y = m2056Y() - this.f1530h;
        ArrayList arrayList = this.f1526d;
        if (i10 >= i11) {
            for (int iM1958q = AbstractC0549n4.m1958q(arrayList, i11, iM2056Y); iM1958q < this.f1526d.size() && (iM1527a = (c0460b = (C0460b) this.f1526d.get(iM1958q)).m1527a()) >= 0; iM1958q++) {
                c0460b.m1529c(-(iM2056Y - iM1527a));
            }
            return;
        }
        for (int iM1958q2 = AbstractC0549n4.m1958q(arrayList, i10, iM2056Y); iM1958q2 < this.f1526d.size() && (iM1527a2 = (c0460b2 = (C0460b) this.f1526d.get(iM1958q2)).m1527a()) < 0 && (i12 = iM1527a2 + iM2056Y) < i11; iM1958q2++) {
            c0460b2.m1529c(i12);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2088o0(int i10) {
        if (i10 > 0) {
            int i11 = this.f1542t;
            m2105y0(i11);
            int i12 = this.f1529g;
            int i13 = this.f1530h;
            int[] iArr = this.f1524b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC5102r.m20658j(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC5102r.m20658j(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f1524b = iArr2;
                i13 = i15;
            }
            int i16 = this.f1543u;
            if (i16 >= i12) {
                this.f1543u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f1529g = i17;
            this.f1530h = i13 - i10;
            int iM2042R = m2042R(i14 > 0 ? m2036O(i11 + i10) : 0, this.f1535m >= i12 ? this.f1533k : 0, this.f1534l, this.f1525c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f1524b[(i18 * 5) + 4] = iM2042R;
            }
            int i19 = this.f1535m;
            if (i19 >= i12) {
                this.f1535m = i19 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m2089o1(Object obj) {
        int iM2070f0 = m2070f0(this.f1542t);
        if (!((this.f1524b[(iM2070f0 * 5) + 1] & 268435456) != 0)) {
            AbstractC0468c0.m1548b("Updating the data of a group that was not created with a data slot");
        }
        this.f1525c[m2040Q(m2016E(this.f1524b, iM2070f0))] = obj;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2090p0(int i10, int i11) {
        if (i10 > 0) {
            m2009A0(this.f1531i, i11);
            int i12 = this.f1533k;
            int i13 = this.f1534l;
            if (i13 < i10) {
                Object[] objArr = this.f1525c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f1525c = objArr2;
                i13 = i16;
            }
            int i18 = this.f1532j;
            if (i18 >= i12) {
                this.f1532j = i18 + i10;
            }
            this.f1533k = i12 + i10;
            this.f1534l = i13 - i10;
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m2091p1(int i10) {
        if (i10 >= 0) {
            C3055g0 c3055g0M1636c = this.f1546x;
            if (c3055g0M1636c == null) {
                c3055g0M1636c = AbstractC0485e3.m1636c(null, 1, null);
                this.f1546x = c3055g0M1636c;
            }
            AbstractC0485e3.m1634a(c3055g0M1636c, i10);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m2092q0() {
        int i10 = this.f1542t;
        return i10 < this.f1543u && (this.f1524b[(m2070f0(i10) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m2093q1(int i10, C3055g0 c3055g0) {
        int iM2070f0 = m2070f0(i10);
        boolean zM2020G = m2020G(i10);
        int[] iArr = this.f1524b;
        if (((iArr[(iM2070f0 * 5) + 1] & 67108864) != 0) != zM2020G) {
            AbstractC0549n4.m1963v(iArr, iM2070f0, zM2020G);
            int iM2019F0 = m2019F0(i10);
            if (iM2019F0 >= 0) {
                AbstractC0485e3.m1634a(c3055g0, iM2019F0);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m2094r0(int i10) {
        return (this.f1524b[(m2070f0(i10) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m2095r1(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = m2042R(i11, this.f1533k, this.f1534l, this.f1525c.length);
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m2096s0(int i10) {
        return m2070f0(i10) * 5 < this.f1524b.length;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m2097s1(C0460b c0460b, Object obj) {
        m2100u1(c0460b.m1531e(this), obj);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m2098t0(int i10) {
        int iM2070f0 = m2070f0(i10);
        int[] iArr = this.f1524b;
        int i11 = (iM2070f0 * 5) + 1;
        if ((iArr[i11] & 134217728) != 0) {
            return;
        }
        AbstractC0549n4.m1965x(iArr, iM2070f0, true);
        if ((this.f1524b[i11] & 67108864) != 0) {
            return;
        }
        m2091p1(m2019F0(i10));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m2099t1(Object obj) {
        m2100u1(this.f1542t, obj);
    }

    public String toString() {
        return "SlotWriter(current = " + this.f1542t + " end=" + this.f1543u + " size = " + m2064c0() + " gap=" + this.f1529g + '-' + (this.f1529g + this.f1530h) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2100u1(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.m2070f0(r5)
            int[] r1 = r4.f1524b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.AbstractC0468c0.m1548b(r5)
        L2e:
            java.lang.Object[] r5 = r4.f1525c
            int[] r1 = r4.f1524b
            int r0 = r4.m2017E0(r1, r0)
            int r0 = r4.m2040Q(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0556o4.m2100u1(int, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m2101v0(int i10, int i11, int i12) {
        C0460b c0460b;
        int iM2012C;
        int i13 = i12 + i10;
        int iM2064c0 = m2064c0();
        int iM1958q = AbstractC0549n4.m1958q(this.f1526d, i10, iM2064c0);
        ArrayList arrayList = new ArrayList();
        if (iM1958q >= 0) {
            while (iM1958q < this.f1526d.size() && (iM2012C = m2012C((c0460b = (C0460b) this.f1526d.get(iM1958q)))) >= i10 && iM2012C < i13) {
                arrayList.add(c0460b);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            C0460b c0460b2 = (C0460b) arrayList.get(i15);
            int iM2012C2 = m2012C(c0460b2) + i14;
            if (iM2012C2 >= this.f1529g) {
                c0460b2.m1529c(-(iM2064c0 - iM2012C2));
            } else {
                c0460b2.m1529c(iM2012C2);
            }
            this.f1526d.add(AbstractC0549n4.m1958q(this.f1526d, iM2012C2, iM2064c0), c0460b2);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m2102v1() {
        this.f1527e = this.f1523a.m1910x();
        this.f1528f = this.f1523a.m1905s();
    }

    /* JADX INFO: renamed from: w0 */
    public final List m2103w0(C0535l4 c0535l4, int i10, boolean z10) {
        if (!(this.f1536n > 0)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        if (i10 != 0 || this.f1542t != 0 || this.f1523a.m1907u() != 0 || AbstractC0549n4.m1956o(c0535l4.m1906t(), i10) != c0535l4.m1907u()) {
            C0556o4 c0556o4M1892C = c0535l4.m1892C();
            try {
                List listM2109b = f1521y.m2109b(c0556o4M1892C, i10, this, true, true, z10);
                c0556o4M1892C.m2028K(true);
                return listM2109b;
            } catch (Throwable th) {
                c0556o4M1892C.m2028K(false);
                throw th;
            }
        }
        int[] iArr = this.f1524b;
        Object[] objArr = this.f1525c;
        ArrayList arrayList = this.f1526d;
        HashMap map = this.f1527e;
        C3058h0 c3058h0 = this.f1528f;
        int[] iArrM1906t = c0535l4.m1906t();
        int iM1907u = c0535l4.m1907u();
        Object[] objArrM1908v = c0535l4.m1908v();
        int iM1909w = c0535l4.m1909w();
        HashMap mapM1910x = c0535l4.m1910x();
        C3058h0 c3058h0M1905s = c0535l4.m1905s();
        this.f1524b = iArrM1906t;
        this.f1525c = objArrM1908v;
        this.f1526d = c0535l4.m1904r();
        this.f1529g = iM1907u;
        this.f1530h = (iArrM1906t.length / 5) - iM1907u;
        this.f1533k = iM1909w;
        this.f1534l = objArrM1908v.length - iM1909w;
        this.f1535m = iM1907u;
        this.f1527e = mapM1910x;
        this.f1528f = c3058h0M1905s;
        c0535l4.m1894E(iArr, 0, objArr, 0, arrayList, map, c3058h0);
        return this.f1526d;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m2104x0(int i10) {
        int[] iArr;
        boolean z10 = true;
        if (!(this.f1536n == 0)) {
            AbstractC0468c0.m1548b("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            AbstractC0468c0.m1548b("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f1542t;
        int i12 = this.f1544v;
        int i13 = this.f1543u;
        int i14 = i10;
        int iM1956o = i11;
        while (true) {
            iArr = this.f1524b;
            if (i14 <= 0) {
                break;
            }
            iM1956o += AbstractC0549n4.m1956o(iArr, m2070f0(iM1956o));
            if (!(iM1956o <= i13)) {
                AbstractC0468c0.m1548b("Parameter offset is out of bounds");
            }
            i14--;
        }
        int iM1956o2 = AbstractC0549n4.m1956o(iArr, m2070f0(iM1956o));
        int iM2038P = m2038P(this.f1524b, m2070f0(this.f1542t));
        int iM2038P2 = m2038P(this.f1524b, m2070f0(iM1956o));
        int i15 = iM1956o + iM1956o2;
        int iM2038P3 = m2038P(this.f1524b, m2070f0(i15));
        int i16 = iM2038P3 - iM2038P2;
        m2090p0(i16, Math.max(this.f1542t - 1, 0));
        m2088o0(iM1956o2);
        int[] iArr2 = this.f1524b;
        int iM2070f0 = m2070f0(i15) * 5;
        AbstractC5102r.m20658j(iArr2, iArr2, m2070f0(i11) * 5, iM2070f0, (iM1956o2 * 5) + iM2070f0);
        if (i16 > 0) {
            Object[] objArr = this.f1525c;
            int iM2040Q = m2040Q(iM2038P2 + i16);
            System.arraycopy(objArr, iM2040Q, objArr, iM2038P, m2040Q(iM2038P3 + i16) - iM2040Q);
        }
        int i17 = iM2038P2 + i16;
        int i18 = i17 - iM2038P;
        int i19 = this.f1533k;
        int i20 = this.f1534l;
        int length = this.f1525c.length;
        int i21 = this.f1535m;
        int i22 = i11 + iM1956o2;
        int i23 = i11;
        while (i23 < i22) {
            boolean z11 = z10;
            int iM2070f02 = m2070f0(i23);
            int i24 = i23;
            int i25 = i18;
            m2095r1(iArr2, iM2070f02, m2042R(m2038P(iArr2, iM2070f02) - i18, i21 < iM2070f02 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        m2101v0(i15, i11, iM1956o2);
        if (m2035N0(i15, iM1956o2)) {
            AbstractC0468c0.m1548b("Unexpectedly removed anchors");
        }
        m2052W(i12, this.f1543u, i11);
        if (i16 > 0) {
            m2037O0(i17, i16, i15 - 1);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m2105y0(int i10) {
        int i11 = this.f1530h;
        int i12 = this.f1529g;
        if (i12 != i10) {
            if (!this.f1526d.isEmpty()) {
                m2087n1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f1524b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC5102r.m20658j(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC5102r.m20658j(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iM2056Y = m2056Y();
            if (!(i12 < iM2056Y)) {
                AbstractC0468c0.m1548b("Check failed");
            }
            while (i12 < iM2056Y) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f1524b[i16];
                int iM2025I0 = m2025I0(m2023H0(i17), i10);
                if (iM2025I0 != i17) {
                    this.f1524b[i16] = iM2025I0;
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f1529g = i10;
    }

    /* JADX INFO: renamed from: z0 */
    public final List m2106z0(int i10, C0535l4 c0535l4, int i11) {
        if (!(this.f1536n <= 0 && m2076i0(this.f1542t + i10) == 1)) {
            AbstractC0468c0.m1548b("Check failed");
        }
        int i12 = this.f1542t;
        int i13 = this.f1531i;
        int i14 = this.f1532j;
        m2008A(i10);
        m2073g1();
        m2018F();
        C0556o4 c0556o4M1892C = c0535l4.m1892C();
        try {
            List listM2108c = a.m2108c(f1521y, c0556o4M1892C, i11, this, false, true, false, 32, null);
            c0556o4M1892C.m2028K(true);
            m2046T();
            m2044S();
            this.f1542t = i12;
            this.f1531i = i13;
            this.f1532j = i14;
            return listM2108c;
        } catch (Throwable th) {
            c0556o4M1892C.m2028K(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.o4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ List m2108c(a aVar, C0556o4 c0556o4, int i10, C0556o4 c0556o42, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.m2109b(c0556o4, i10, c0556o42, z10, z11, z12);
        }

        /* JADX INFO: renamed from: b */
        public final List m2109b(C0556o4 c0556o4, int i10, C0556o4 c0556o42, boolean z10, boolean z11, boolean z12) {
            boolean zM2035N0;
            List listM20800o;
            int iM2076i0 = c0556o4.m2076i0(i10);
            int i11 = i10 + iM2076i0;
            int iM2036O = c0556o4.m2036O(i10);
            int iM2036O2 = c0556o4.m2036O(i11);
            int i12 = iM2036O2 - iM2036O;
            boolean zM2030L = c0556o4.m2030L(i10);
            c0556o42.m2088o0(iM2076i0);
            c0556o42.m2090p0(i12, c0556o42.m2060a0());
            if (c0556o4.f1529g < i11) {
                c0556o4.m2105y0(i11);
            }
            if (c0556o4.f1533k < iM2036O2) {
                c0556o4.m2009A0(iM2036O2, i11);
            }
            int[] iArr = c0556o42.f1524b;
            int iM2060a0 = c0556o42.m2060a0();
            int i13 = iM2060a0 * 5;
            AbstractC5102r.m20658j(c0556o4.f1524b, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = c0556o42.f1525c;
            int i14 = c0556o42.f1531i;
            System.arraycopy(c0556o4.f1525c, iM2036O, objArr, i14, i12);
            int iM2062b0 = c0556o42.m2062b0();
            iArr[i13 + 2] = iM2062b0;
            int i15 = iM2060a0 - i10;
            int i16 = iM2060a0 + iM2076i0;
            int iM2038P = i14 - c0556o42.m2038P(iArr, iM2060a0);
            int i17 = c0556o42.f1535m;
            int i18 = c0556o42.f1534l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = iM2060a0;
            while (true) {
                zM2035N0 = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != iM2060a0) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = iM2060a0;
                iArr2[(i20 * 5) + 4] = c0556o42.m2042R(c0556o42.m2038P(iArr, i20) + iM2038P, i19 >= i20 ? c0556o42.f1533k : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                iM2060a0 = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            c0556o42.f1535m = i19;
            int iM1958q = AbstractC0549n4.m1958q(c0556o4.f1526d, i10, c0556o4.m2064c0());
            int iM1958q2 = AbstractC0549n4.m1958q(c0556o4.f1526d, i11, c0556o4.m2064c0());
            if (iM1958q < iM1958q2) {
                ArrayList arrayList = c0556o4.f1526d;
                ArrayList arrayList2 = new ArrayList(iM1958q2 - iM1958q);
                for (int i23 = iM1958q; i23 < iM1958q2; i23++) {
                    C0460b c0460b = (C0460b) arrayList.get(i23);
                    c0460b.m1529c(c0460b.m1527a() + i15);
                    arrayList2.add(c0460b);
                }
                c0556o42.f1526d.addAll(AbstractC0549n4.m1958q(c0556o42.f1526d, c0556o42.m2060a0(), c0556o42.m2064c0()), arrayList2);
                arrayList.subList(iM1958q, iM1958q2).clear();
                listM20800o = arrayList2;
            } else {
                listM20800o = AbstractC5114x.m20800o();
            }
            if (!listM20800o.isEmpty()) {
                HashMap map = c0556o4.f1527e;
                HashMap map2 = c0556o42.f1527e;
                if (map != null && map2 != null) {
                    int size = listM20800o.size();
                    for (int i24 = 0; i24 < size; i24++) {
                    }
                }
            }
            c0556o42.m2062b0();
            c0556o42.m2069e1(iM2062b0);
            int iM2019F0 = c0556o4.m2019F0(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iM2019F0 >= 0;
                    if (z13) {
                        c0556o4.m2073g1();
                        c0556o4.m2008A(iM2019F0 - c0556o4.m2060a0());
                        c0556o4.m2073g1();
                    }
                    c0556o4.m2008A(i10 - c0556o4.m2060a0());
                    boolean zM2033M0 = c0556o4.m2033M0();
                    if (z13) {
                        c0556o4.m2055X0();
                        c0556o4.m2044S();
                        c0556o4.m2055X0();
                        c0556o4.m2044S();
                    }
                    zM2035N0 = zM2033M0;
                } else {
                    zM2035N0 = c0556o4.m2035N0(i10, iM2076i0);
                    c0556o4.m2037O0(iM2036O, i12, i10 - 1);
                }
            }
            if (zM2035N0) {
                AbstractC0468c0.m1548b("Unexpectedly removed anchors");
            }
            int i25 = c0556o42.f1537o;
            int i26 = iArr3[i13 + 1];
            c0556o42.f1537o = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
            if (z11) {
                c0556o42.f1542t = i16;
                c0556o42.f1531i = i14 + i12;
            }
            if (zM2030L) {
                c0556o42.m2091p1(iM2062b0);
            }
            return listM20800o;
        }

        public a() {
        }
    }
}
