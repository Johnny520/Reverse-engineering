package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.runtime.k4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0528k4 {

    /* JADX INFO: renamed from: a */
    public final C0535l4 f1441a;

    /* JADX INFO: renamed from: b */
    public final int[] f1442b;

    /* JADX INFO: renamed from: c */
    public final int f1443c;

    /* JADX INFO: renamed from: d */
    public Object[] f1444d;

    /* JADX INFO: renamed from: e */
    public final int f1445e;

    /* JADX INFO: renamed from: f */
    public HashMap f1446f;

    /* JADX INFO: renamed from: g */
    public boolean f1447g;

    /* JADX INFO: renamed from: h */
    public int f1448h;

    /* JADX INFO: renamed from: i */
    public int f1449i;

    /* JADX INFO: renamed from: j */
    public int f1450j;

    /* JADX INFO: renamed from: k */
    public final C0546n1 f1451k;

    /* JADX INFO: renamed from: l */
    public int f1452l;

    /* JADX INFO: renamed from: m */
    public int f1453m;

    /* JADX INFO: renamed from: n */
    public int f1454n;

    /* JADX INFO: renamed from: o */
    public boolean f1455o;

    public C0528k4(C0535l4 c0535l4) {
        this.f1441a = c0535l4;
        this.f1442b = c0535l4.m1906t();
        int iM1907u = c0535l4.m1907u();
        this.f1443c = iM1907u;
        this.f1444d = c0535l4.m1908v();
        this.f1445e = c0535l4.m1909w();
        this.f1449i = iM1907u;
        this.f1450j = -1;
        this.f1451k = new C0546n1();
    }

    /* JADX INFO: renamed from: A */
    public final Object m1784A(int i10) {
        return m1809b(this.f1442b, i10);
    }

    /* JADX INFO: renamed from: B */
    public final Object m1785B(int i10) {
        return m1786C(this.f1448h, i10);
    }

    /* JADX INFO: renamed from: C */
    public final Object m1786C(int i10, int i11) {
        int iM1961t = AbstractC0549n4.m1961t(this.f1442b, i10);
        int i12 = i10 + 1;
        int i13 = iM1961t + i11;
        return i13 < (i12 < this.f1443c ? this.f1442b[(i12 * 5) + 4] : this.f1445e) ? this.f1444d[i13] : InterfaceC0572r.f1573a.m2191a();
    }

    /* JADX INFO: renamed from: D */
    public final int m1787D(int i10) {
        return this.f1442b[i10 * 5];
    }

    /* JADX INFO: renamed from: E */
    public final Object m1788E(int i10) {
        return m1799P(this.f1442b, i10);
    }

    /* JADX INFO: renamed from: F */
    public final int m1789F(int i10) {
        return AbstractC0549n4.m1956o(this.f1442b, i10);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m1790G(int i10) {
        return (this.f1442b[(i10 * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1791H(int i10) {
        return (this.f1442b[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1792I() {
        return m1827t() || this.f1448h == this.f1449i;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m1793J() {
        return (this.f1442b[(this.f1448h * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m1794K(int i10) {
        return (this.f1442b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final Object m1795L() {
        int i10;
        if (this.f1452l > 0 || (i10 = this.f1453m) >= this.f1454n) {
            this.f1455o = false;
            return InterfaceC0572r.f1573a.m2191a();
        }
        this.f1455o = true;
        Object[] objArr = this.f1444d;
        this.f1453m = i10 + 1;
        return objArr[i10];
    }

    /* JADX INFO: renamed from: M */
    public final Object m1796M(int i10) {
        int[] iArr = this.f1442b;
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return m1797N(iArr, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final Object m1797N(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.f1444d[iArr[i11 + 4]] : InterfaceC0572r.f1573a.m2191a();
    }

    /* JADX INFO: renamed from: O */
    public final int m1798O(int i10) {
        return this.f1442b[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: P */
    public final Object m1799P(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.f1444d[AbstractC0549n4.m1959r(iArr, i10)];
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final int m1800Q(int i10) {
        return this.f1442b[(i10 * 5) + 2];
    }

    /* JADX INFO: renamed from: R */
    public final void m1801R(int i10) {
        if (!(this.f1452l == 0)) {
            AbstractC0468c0.m1548b("Cannot reposition while in an empty region");
        }
        this.f1448h = i10;
        int i11 = this.f1443c;
        int i12 = i10 < i11 ? this.f1442b[(i10 * 5) + 2] : -1;
        if (i12 != this.f1450j) {
            this.f1450j = i12;
            if (i12 < 0) {
                this.f1449i = i11;
            } else {
                this.f1449i = i12 + AbstractC0549n4.m1956o(this.f1442b, i12);
            }
            this.f1453m = 0;
            this.f1454n = 0;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m1802S(int i10) {
        int iM1956o = AbstractC0549n4.m1956o(this.f1442b, i10) + i10;
        int i11 = this.f1448h;
        if (!(i11 >= i10 && i11 <= iM1956o)) {
            AbstractC0468c0.m1548b("Index " + i10 + " is not a parent of " + i11);
        }
        this.f1450j = i10;
        this.f1449i = iM1956o;
        this.f1453m = 0;
        this.f1454n = 0;
    }

    /* JADX INFO: renamed from: T */
    public final int m1803T() {
        if (!(this.f1452l == 0)) {
            AbstractC0468c0.m1548b("Cannot skip while in an empty region");
        }
        int[] iArr = this.f1442b;
        int i10 = this.f1448h;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f1448h = i10 + AbstractC0549n4.m1956o(iArr, i10);
        return i11;
    }

    /* JADX INFO: renamed from: U */
    public final void m1804U() {
        if (!(this.f1452l == 0)) {
            AbstractC0468c0.m1548b("Cannot skip the enclosing group while in an empty region");
        }
        this.f1448h = this.f1449i;
        this.f1453m = 0;
        this.f1454n = 0;
    }

    /* JADX INFO: renamed from: V */
    public final int m1805V(int i10) {
        int iM1961t = AbstractC0549n4.m1961t(this.f1442b, i10);
        int i11 = i10 + 1;
        return (i11 < this.f1443c ? this.f1442b[(i11 * 5) + 4] : this.f1445e) - iM1961t;
    }

    /* JADX INFO: renamed from: W */
    public final void m1806W() {
        if (this.f1452l <= 0) {
            int i10 = this.f1450j;
            int i11 = this.f1448h;
            if (!(this.f1442b[(i11 * 5) + 2] == i10)) {
                AbstractC0464b3.m1535a("Invalid slot table detected");
            }
            HashMap map = this.f1446f;
            if (map != null) {
            }
            C0546n1 c0546n1 = this.f1451k;
            int i12 = this.f1453m;
            int i13 = this.f1454n;
            if (i12 == 0 && i13 == 0) {
                c0546n1.m1940h(-1);
            } else {
                c0546n1.m1940h(i12);
            }
            this.f1450j = i11;
            this.f1449i = AbstractC0549n4.m1956o(this.f1442b, i11) + i11;
            int i14 = i11 + 1;
            this.f1448h = i14;
            this.f1453m = AbstractC0549n4.m1961t(this.f1442b, i11);
            this.f1454n = i11 >= this.f1443c - 1 ? this.f1445e : this.f1442b[(i14 * 5) + 4];
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m1807X() {
        if (this.f1452l <= 0) {
            if (!((this.f1442b[(this.f1448h * 5) + 1] & 1073741824) != 0)) {
                AbstractC0464b3.m1535a("Expected a node group");
            }
            m1806W();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0460b m1808a(int i10) {
        ArrayList arrayListM1904r = this.f1441a.m1904r();
        int iM1960s = AbstractC0549n4.m1960s(arrayListM1904r, i10, this.f1443c);
        if (iM1960s >= 0) {
            return (C0460b) arrayListM1904r.get(iM1960s);
        }
        C0460b c0460b = new C0460b(i10);
        arrayListM1904r.add(-(iM1960s + 1), c0460b);
        return c0460b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1809b(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f1444d[AbstractC0549n4.m1954m(iArr, i10)] : InterfaceC0572r.f1573a.m2191a();
    }

    /* JADX INFO: renamed from: c */
    public final void m1810c() {
        this.f1452l++;
    }

    /* JADX INFO: renamed from: d */
    public final void m1811d() {
        this.f1447g = true;
        this.f1441a.m1899e(this, this.f1446f);
        this.f1444d = new Object[0];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1812e(int i10) {
        return (this.f1442b[(i10 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1813f() {
        if (!(this.f1452l > 0)) {
            AbstractC0464b3.m1535a("Unbalanced begin/end empty");
        }
        this.f1452l--;
    }

    /* JADX INFO: renamed from: g */
    public final void m1814g() {
        if (this.f1452l == 0) {
            if (!(this.f1448h == this.f1449i)) {
                AbstractC0468c0.m1548b("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f1442b;
            int i10 = iArr[(this.f1450j * 5) + 2];
            this.f1450j = i10;
            this.f1449i = i10 < 0 ? this.f1443c : AbstractC0549n4.m1956o(iArr, i10) + i10;
            int iM1939g = this.f1451k.m1939g();
            if (iM1939g < 0) {
                this.f1453m = 0;
                this.f1454n = 0;
            } else {
                this.f1453m = iM1939g;
                this.f1454n = i10 >= this.f1443c - 1 ? this.f1445e : this.f1442b[((i10 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List m1815h() {
        ArrayList arrayList = new ArrayList();
        if (this.f1452l <= 0) {
            int i10 = 0;
            int iM1956o = this.f1448h;
            while (true) {
                int i11 = i10;
                if (iM1956o >= this.f1449i) {
                    break;
                }
                int[] iArr = this.f1442b;
                int i12 = iM1956o * 5;
                int i13 = iArr[i12];
                Object objM1799P = m1799P(iArr, iM1956o);
                int i14 = 1;
                int i15 = this.f1442b[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & 67108863;
                }
                i10 = i11 + 1;
                arrayList.add(new C0581s1(i13, objM1799P, iM1956o, i14, i11));
                iM1956o += AbstractC0549n4.m1956o(this.f1442b, iM1956o);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1816i() {
        return this.f1447g;
    }

    /* JADX INFO: renamed from: j */
    public final int m1817j() {
        return this.f1449i;
    }

    /* JADX INFO: renamed from: k */
    public final int m1818k() {
        return this.f1448h;
    }

    /* JADX INFO: renamed from: l */
    public final Object m1819l() {
        int i10 = this.f1448h;
        if (i10 < this.f1449i) {
            return m1809b(this.f1442b, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m1820m() {
        return this.f1449i;
    }

    /* JADX INFO: renamed from: n */
    public final int m1821n() {
        int i10 = this.f1448h;
        if (i10 < this.f1449i) {
            return this.f1442b[i10 * 5];
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final Object m1822o() {
        int i10 = this.f1448h;
        if (i10 < this.f1449i) {
            return m1799P(this.f1442b, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final int m1823p() {
        return AbstractC0549n4.m1956o(this.f1442b, this.f1448h);
    }

    /* JADX INFO: renamed from: q */
    public final int m1824q() {
        return this.f1453m - AbstractC0549n4.m1961t(this.f1442b, this.f1450j);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1825r() {
        return this.f1455o;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1826s() {
        int i10 = this.f1448h;
        return i10 < this.f1449i && (this.f1442b[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1827t() {
        return this.f1452l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f1448h + ", key=" + m1821n() + ", parent=" + this.f1450j + ", end=" + this.f1449i + ')';
    }

    /* JADX INFO: renamed from: u */
    public final int m1828u() {
        return this.f1450j;
    }

    /* JADX INFO: renamed from: v */
    public final int m1829v() {
        int i10 = this.f1450j;
        if (i10 >= 0) {
            return this.f1442b[(i10 * 5) + 1] & 67108863;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m1830w() {
        return this.f1454n - this.f1453m;
    }

    /* JADX INFO: renamed from: x */
    public final int m1831x() {
        return this.f1443c;
    }

    /* JADX INFO: renamed from: y */
    public final int m1832y() {
        return this.f1453m - AbstractC0549n4.m1961t(this.f1442b, this.f1450j);
    }

    /* JADX INFO: renamed from: z */
    public final C0535l4 m1833z() {
        return this.f1441a;
    }
}
