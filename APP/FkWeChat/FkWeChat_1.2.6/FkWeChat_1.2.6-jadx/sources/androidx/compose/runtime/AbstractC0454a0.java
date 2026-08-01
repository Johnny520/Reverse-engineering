package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p117i.AbstractC3050e1;
import p117i.C3082r0;
import p117i.C3084s0;
import p172l8.C4700i0;
import p349y0.C9507b;

/* JADX INFO: renamed from: androidx.compose.runtime.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454a0 {

    /* JADX INFO: renamed from: a */
    public static final Comparator f1298a = new Comparator() { // from class: androidx.compose.runtime.y
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC0454a0.m1485a((C0560p1) obj, (C0560p1) obj2);
        }
    };

    /* JADX INFO: renamed from: A */
    public static final void m1482A(C0556o4 c0556o4, int i10, Object obj) {
        Object objM2024I = c0556o4.m2024I(i10);
        if (obj == objM2024I) {
            return;
        }
        AbstractC0468c0.m1548b("Slot table is out of sync (expected " + obj + ", got " + objM2024I + ')');
    }

    /* JADX INFO: renamed from: B */
    public static final C0560p1 m1483B(List list, int i10) {
        int iM1505u = m1505u(list, i10);
        if (iM1505u >= 0) {
            return (C0560p1) list.remove(iM1505u);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final void m1484C(List list, int i10, int i11) {
        int iM1504t = m1504t(list, i10);
        while (iM1504t < list.size() && ((C0560p1) list.get(iM1504t)).m2124b() < i11) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m1485a(C0560p1 c0560p1, C0560p1 c0560p12) {
        return AbstractC1061t.m3843d(c0560p1.m2124b(), c0560p12.m2124b());
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m1486b(InterfaceC0465b4 interfaceC0465b4, C0556o4 c0556o4, int i10, Object obj) {
        if (obj instanceof InterfaceC0544n) {
            interfaceC0465b4.mo1542f((InterfaceC0544n) obj);
        } else if (!(obj instanceof C0500g4)) {
            if (obj instanceof C0479d4) {
                m1482A(c0556o4, i10, obj);
                interfaceC0465b4.mo1539c((C0479d4) obj);
            } else if (obj instanceof C0534l3) {
                m1482A(c0556o4, i10, obj);
                ((C0534l3) obj).m1850A();
            }
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m1498n(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: renamed from: p */
    public static final List m1500p(C0535l4 c0535l4, C0460b c0460b) {
        ArrayList arrayList = new ArrayList();
        C0528k4 c0528k4M1891B = c0535l4.m1891B();
        try {
            m1501q(c0528k4M1891B, arrayList, c0535l4.m1898c(c0460b));
            C4700i0 c4700i0 = C4700i0.f13910a;
            return arrayList;
        } finally {
            c0528k4M1891B.m1811d();
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m1501q(C0528k4 c0528k4, List list, int i10) {
        if (c0528k4.m1794K(i10)) {
            list.add(c0528k4.m1796M(i10));
            return;
        }
        int iM1789F = i10 + 1;
        int iM1789F2 = i10 + c0528k4.m1789F(i10);
        while (iM1789F < iM1789F2) {
            m1501q(c0528k4, list, iM1789F);
            iM1789F += c0528k4.m1789F(iM1789F);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m1502r(final C0556o4 c0556o4, final InterfaceC0465b4 interfaceC0465b4) {
        c0556o4.m2054X(c0556o4.m2060a0(), new InterfaceC0188p() { // from class: androidx.compose.runtime.z
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC0454a0.m1486b(interfaceC0465b4, c0556o4, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static final int m1503s(C0528k4 c0528k4, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = c0528k4.m1800Q(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: renamed from: t */
    public static final int m1504t(List list, int i10) {
        int iM1505u = m1505u(list, i10);
        return iM1505u < 0 ? -(iM1505u + 1) : iM1505u;
    }

    /* JADX INFO: renamed from: u */
    public static final int m1505u(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iM3843d = AbstractC1061t.m3843d(((C0560p1) list.get(i12)).m2124b(), i10);
            if (iM3843d < 0) {
                i11 = i12 + 1;
            } else {
                if (iM3843d <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: v */
    public static final C0560p1 m1506v(List list, int i10, int i11) {
        int iM1504t = m1504t(list, i10);
        if (iM1504t >= list.size()) {
            return null;
        }
        C0560p1 c0560p1 = (C0560p1) list.get(iM1504t);
        if (c0560p1.m2124b() < i11) {
            return c0560p1;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final Object m1507w(C0581s1 c0581s1) {
        return c0581s1.m2199d() != null ? new C0574r1(Integer.valueOf(c0581s1.m2196a()), c0581s1.m2199d()) : Integer.valueOf(c0581s1.m2196a());
    }

    /* JADX INFO: renamed from: x */
    public static final void m1508x(List list, int i10, C0534l3 c0534l3, Object obj) {
        int iM1505u = m1505u(list, i10);
        if (iM1505u < 0) {
            int i11 = -(iM1505u + 1);
            if (!(obj instanceof InterfaceC0630z0)) {
                obj = null;
            }
            list.add(i11, new C0560p1(c0534l3, i10, obj));
            return;
        }
        C0560p1 c0560p1 = (C0560p1) list.get(iM1505u);
        if (!(obj instanceof InterfaceC0630z0)) {
            c0560p1.m2127e(null);
            return;
        }
        Object objM2123a = c0560p1.m2123a();
        if (objM2123a == null) {
            c0560p1.m2127e(obj);
        } else if (objM2123a instanceof C3084s0) {
            ((C3084s0) objM2123a).m11536h(obj);
        } else {
            c0560p1.m2127e(AbstractC3050e1.m11285c(objM2123a, obj));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final C3082r0 m1509y(int i10) {
        return C9507b.m37015d(new C3082r0(i10));
    }

    /* JADX INFO: renamed from: z */
    public static final int m1510z(C0528k4 c0528k4, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (c0528k4.m1800Q(i10) == i11) {
                return i11;
            }
            if (c0528k4.m1800Q(i11) != i10) {
                if (c0528k4.m1800Q(i10) == c0528k4.m1800Q(i11)) {
                    return c0528k4.m1800Q(i10);
                }
                int iM1503s = m1503s(c0528k4, i10, i12);
                int iM1503s2 = m1503s(c0528k4, i11, i12);
                int i13 = iM1503s - iM1503s2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = c0528k4.m1800Q(i10);
                }
                int i15 = iM1503s2 - iM1503s;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = c0528k4.m1800Q(i11);
                }
                while (i10 != i11) {
                    i10 = c0528k4.m1800Q(i10);
                    i11 = c0528k4.m1800Q(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: o */
    public static final int m1499o(boolean z10) {
        return z10 ? 1 : 0;
    }
}
