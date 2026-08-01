package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p117i.C3058h0;
import p150k1.InterfaceC3914g;
import p172l8.C4700i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.runtime.l4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0535l4 implements InterfaceC3914g, Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: A */
    public C3058h0 f1472A;

    /* JADX INFO: renamed from: r */
    public int f1474r;

    /* JADX INFO: renamed from: t */
    public int f1476t;

    /* JADX INFO: renamed from: u */
    public int f1477u;

    /* JADX INFO: renamed from: w */
    public boolean f1479w;

    /* JADX INFO: renamed from: x */
    public int f1480x;

    /* JADX INFO: renamed from: z */
    public HashMap f1482z;

    /* JADX INFO: renamed from: q */
    public int[] f1473q = new int[0];

    /* JADX INFO: renamed from: s */
    public Object[] f1475s = new Object[0];

    /* JADX INFO: renamed from: v */
    public final Object f1478v = new Object();

    /* JADX INFO: renamed from: y */
    public ArrayList f1481y = new ArrayList();

    /* JADX INFO: renamed from: A */
    public final boolean m1890A(int i10, C0460b c0460b) {
        if (this.f1479w) {
            AbstractC0468c0.m1548b("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f1474r)) {
            AbstractC0468c0.m1548b("Invalid group index");
        }
        if (m1893D(c0460b)) {
            int iM1956o = AbstractC0549n4.m1956o(this.f1473q, i10) + i10;
            int iM1527a = c0460b.m1527a();
            if (i10 <= iM1527a && iM1527a < iM1956o) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final C0528k4 m1891B() {
        if (this.f1479w) {
            C10010p0.m38820a("Cannot read while a writer is pending");
            return null;
        }
        this.f1477u++;
        return new C0528k4(this);
    }

    /* JADX INFO: renamed from: C */
    public final C0556o4 m1892C() {
        if (this.f1479w) {
            AbstractC0468c0.m1548b("Cannot start a writer when another writer is pending");
        }
        if (!(this.f1477u <= 0)) {
            AbstractC0468c0.m1548b("Cannot start a writer when a reader is pending");
        }
        this.f1479w = true;
        this.f1480x++;
        return new C0556o4(this);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1893D(C0460b c0460b) {
        int iM1960s;
        return c0460b.m1528b() && (iM1960s = AbstractC0549n4.m1960s(this.f1481y, c0460b.m1527a(), this.f1474r)) >= 0 && AbstractC1061t.m3842c(this.f1481y.get(iM1960s), c0460b);
    }

    /* JADX INFO: renamed from: E */
    public final void m1894E(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, C3058h0 c3058h0) {
        this.f1473q = iArr;
        this.f1474r = i10;
        this.f1475s = objArr;
        this.f1476t = i11;
        this.f1481y = arrayList;
        this.f1482z = map;
        this.f1472A = c3058h0;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC0539m1 m1895F(int i10) {
        C0460b c0460bM1896G;
        HashMap map = this.f1482z;
        if (map == null || (c0460bM1896G = m1896G(i10)) == null) {
            return null;
        }
        return (AbstractC0539m1) map.get(c0460bM1896G);
    }

    /* JADX INFO: renamed from: G */
    public final C0460b m1896G(int i10) {
        int i11;
        if (this.f1479w) {
            AbstractC0468c0.m1548b("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f1474r)) {
            return null;
        }
        return AbstractC0549n4.m1955n(this.f1481y, i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public final C0460b m1897a(int i10) {
        if (this.f1479w) {
            AbstractC0468c0.m1548b("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f1474r) {
            z10 = true;
        }
        if (!z10) {
            AbstractC0464b3.m1535a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f1481y;
        int iM1960s = AbstractC0549n4.m1960s(arrayList, i10, this.f1474r);
        if (iM1960s >= 0) {
            return (C0460b) arrayList.get(iM1960s);
        }
        C0460b c0460b = new C0460b(i10);
        arrayList.add(-(iM1960s + 1), c0460b);
        return c0460b;
    }

    /* JADX INFO: renamed from: c */
    public final int m1898c(C0460b c0460b) {
        if (this.f1479w) {
            AbstractC0468c0.m1548b("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0460b.m1528b()) {
            AbstractC0464b3.m1535a("Anchor refers to a group that was removed");
        }
        return c0460b.m1527a();
    }

    /* JADX INFO: renamed from: e */
    public final void m1899e(C0528k4 c0528k4, HashMap map) {
        if (!(c0528k4.m1833z() == this && this.f1477u > 0)) {
            AbstractC0468c0.m1548b("Unexpected reader close()");
        }
        this.f1477u--;
        if (map != null) {
            synchronized (this.f1478v) {
                try {
                    HashMap map2 = this.f1482z;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f1482z = map;
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.f1474r == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0525k1(this, 0, this.f1474r);
    }

    /* JADX INFO: renamed from: l */
    public final void m1900l(C0556o4 c0556o4, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, C3058h0 c3058h0) {
        if (!(c0556o4.m2066d0() == this && this.f1479w)) {
            AbstractC0464b3.m1535a("Unexpected writer close()");
        }
        this.f1479w = false;
        m1894E(iArr, i10, objArr, i11, arrayList, map, c3058h0);
    }

    /* JADX INFO: renamed from: o */
    public final void m1901o() {
        this.f1472A = new C3058h0(0, 1, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m1902p() {
        this.f1482z = new HashMap();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1903q() {
        return this.f1474r > 0 && (this.f1473q[1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final ArrayList m1904r() {
        return this.f1481y;
    }

    /* JADX INFO: renamed from: s */
    public final C3058h0 m1905s() {
        return this.f1472A;
    }

    /* JADX INFO: renamed from: t */
    public final int[] m1906t() {
        return this.f1473q;
    }

    /* JADX INFO: renamed from: u */
    public final int m1907u() {
        return this.f1474r;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m1908v() {
        return this.f1475s;
    }

    /* JADX INFO: renamed from: w */
    public final int m1909w() {
        return this.f1476t;
    }

    /* JADX INFO: renamed from: x */
    public final HashMap m1910x() {
        return this.f1482z;
    }

    /* JADX INFO: renamed from: y */
    public final int m1911y() {
        return this.f1480x;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1912z() {
        return this.f1479w;
    }
}
