package p038ce;

import ae.C0071b;
import ae.C0074e;
import ae.C0075f;
import be.AbstractC0269a;
import be.C0305w;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p199nd.C2977i0;
import p199nd.C2985q;
import p233pd.AbstractC3409t;
import p233pd.EnumC3400k;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: ce.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0560m extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final EnumSet f1749g;

    /* JADX INFO: renamed from: h */
    public static final EnumSet f1750h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3400k enumC3400k = EnumC3400k.f10989s;
        EnumC3400k enumC3400k2 = EnumC3400k.f10992v;
        EnumC3400k enumC3400k3 = EnumC3400k.f10993w;
        EnumC3400k enumC3400k4 = EnumC3400k.f10995y;
        EnumC3400k enumC3400k5 = EnumC3400k.f10996z;
        EnumC3400k enumC3400k6 = EnumC3400k.f10988r;
        EnumC3400k[] enumC3400kArr = {enumC3400k2, enumC3400k3, enumC3400k4, enumC3400k5, enumC3400k6, enumC3400k};
        EnumC3400k enumC3400k7 = EnumC3400k.f10986p;
        f1749g = EnumSet.of(enumC3400k7, enumC3400kArr);
        f1750h = EnumSet.of(enumC3400k7, enumC3400k6, EnumC3400k.f10987q, enumC3400k2, enumC3400k3, EnumC3400k.f10974Z, EnumC3400k.f10975a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C4305a m1566i(C4322r c4322r, C4305a c4305a) {
        C4305a c4305aM1576s = m1576s(c4322r, c4305a.f14350k);
        for (C4305a c4305a2 : new ArrayList(c4305a.f14352m)) {
            m1575r(c4305a2, c4305a, c4305aM1576s);
            c4305a2.m8642H();
        }
        m1567j(c4305aM1576s, c4305a);
        c4305aM1576s.m8642H();
        return c4305aM1576s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m1567j(C4305a c4305a, C4305a c4305a2) {
        if (!c4305a.f14353n.contains(c4305a2)) {
            c4305a.f14353n.add(c4305a2);
        }
        if (c4305a2.f14352m.contains(c4305a)) {
            return;
        }
        c4305a2.f14352m.add(c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1568k(C4305a c4305a, C4305a c4305a2) {
        ArrayList arrayList = c4305a2.f14351l;
        Iterator it = c4305a.f14351l.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4320p) it.next()).m8683R());
        }
        c4305a2.m6225B(c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m1569l(C4305a c4305a) {
        for (C4305a c4305a2 : c4305a.f14352m) {
            c4305a2.f14353n.remove(c4305a);
            c4305a2.m8642H();
        }
        Iterator it = c4305a.f14353n.iterator();
        while (it.hasNext()) {
            ((C4305a) it.next()).f14352m.remove(c4305a);
        }
        c4305a.m6231w(EnumC2824a.f9168u);
        c4305a.f14352m.clear();
        c4305a.f14353n.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m1570m(C4322r c4322r) {
        for (C4305a c4305a : c4322r.f14425z) {
            if (c4305a.f9217g.mo6235a(EnumC2824a.f9168u)) {
                m1569l(c4305a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4305a m1571n(int i9, HashMap map) {
        C4305a c4305a = (C4305a) map.get(Integer.valueOf(i9));
        if (c4305a != null) {
            return c4305a;
        }
        C0086a.m452k(AbstractC0921a.m2249l(i9, "Missing block: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C4305a m1572o(C4322r c4322r, C4305a c4305a, C4305a c4305a2) {
        C4305a c4305aM1576s = m1576s(c4322r, c4305a2.f14350k);
        c4305aM1576s.m6231w(EnumC2824a.f9159m);
        m1573p(c4305a, c4305a2);
        m1567j(c4305a, c4305aM1576s);
        m1567j(c4305aM1576s, c4305a2);
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
        if (c4320pM57c0 instanceof AbstractC3409t) {
            ((AbstractC3409t) c4320pM57c0).mo7175j0(c4305a2, c4305aM1576s);
        }
        c4305a.m8642H();
        c4305aM1576s.m8642H();
        return c4305aM1576s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m1573p(C4305a c4305a, C4305a c4305a2) {
        c4305a.f14353n.remove(c4305a2);
        c4305a2.f14352m.remove(c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m1574q(C4305a c4305a) {
        if (c4305a.f14351l.isEmpty() && c4305a.f9217g.mo6240f() && c4305a.f14353n.size() <= 1 && !c4305a.f14352m.isEmpty()) {
            if (!c4305a.f9217g.mo6235a(EnumC2824a.f9147g)) {
                if (!c4305a.f9217g.mo6235a(EnumC2824a.f9149h) && !c4305a.f14353n.contains(c4305a)) {
                    if (c4305a.f14353n.size() == 1) {
                        C4305a c4305a2 = (C4305a) c4305a.f14353n.get(0);
                        c4305a.f14352m.forEach(new C0305w(c4305a, 5, c4305a2));
                        m1573p(c4305a, c4305a2);
                    } else {
                        c4305a.f14352m.forEach(new C0558k(c4305a, 1));
                    }
                    c4305a.m6231w(EnumC2824a.f9168u);
                    c4305a.f14353n.clear();
                    c4305a.f14352m.clear();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m1575r(C4305a c4305a, C4305a c4305a2, C4305a c4305a3) {
        m1573p(c4305a, c4305a2);
        m1567j(c4305a, c4305a3);
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
        if (c4320pM57c0 instanceof AbstractC3409t) {
            ((AbstractC3409t) c4320pM57c0).mo7175j0(c4305a2, c4305a3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C4305a m1576s(C4322r c4322r, int i9) {
        List list = c4322r.f14425z;
        int i10 = c4322r.f14401A;
        c4322r.f14401A = i10 + 1;
        C4305a c4305a = new C4305a(i10, list.size(), i9);
        list.add(c4305a);
        return c4305a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (((p302ud.C4305a) r1.get(java.lang.Integer.valueOf(((p233pd.C3398i) r10).mo7173k0()))) != r2) goto L51;
     */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        C2825b c2825b;
        EnumC3400k enumC3400k;
        C4305a c4305aM1576s;
        if (c4322r.f14415p) {
            return;
        }
        c4322r.f14425z = new ArrayList();
        C4305a c4305aM1576s2 = m1576s(c4322r, -1);
        c4305aM1576s2.m6231w(EnumC2824a.f9147g);
        c4322r.f14402B = c4305aM1576s2;
        C4305a c4305aM1576s3 = m1576s(c4322r, -1);
        c4305aM1576s3.m6231w(EnumC2824a.f9149h);
        c4322r.f14403C = c4305aM1576s3;
        HashMap map = new HashMap();
        C4320p[] c4320pArr = c4322r.f14424y;
        int length = c4320pArr.length;
        C4320p c4320p = null;
        int i9 = 0;
        while (true) {
            c2825b = C2825b.f9181H;
            if (i9 >= length) {
                break;
            }
            C4320p c4320p2 = c4320pArr[i9];
            if (c4320p2 != null && ((enumC3400k = c4320p2.f14396k) != EnumC3400k.f10965Q || !c4320p2.f9217g.mo6240f())) {
                int i10 = c4320p2.f14399n;
                if (c4320p == null) {
                    c4305aM1576s = m1576s(c4322r, i10);
                    m1567j(c4305aM1576s2, c4305aM1576s);
                } else {
                    EnumC3400k enumC3400k2 = c4320p.f14396k;
                    if (f1750h.contains(enumC3400k2)) {
                        c4305aM1576s2 = m1576s(c4322r, i10);
                    } else {
                        EnumSet enumSet = f1749g;
                        if (!enumSet.contains(enumC3400k2) && !enumSet.contains(enumC3400k)) {
                            if (!c4320p2.f9217g.mo6235a(EnumC2824a.f9151i)) {
                                if (!c4320p.f9217g.mo6235a(EnumC2824a.f9153j)) {
                                    if (!c4320p2.f9217g.mo6236b(C2825b.f9178E)) {
                                        Iterator it = c4320p.f9217g.mo6238d(c2825b).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((C2985q) it.next()).f9750a == c4320p.f14399n) {
                                                    break;
                                                }
                                            } else {
                                                Iterator it2 = c4320p2.f9217g.mo6238d(c2825b).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (((C2985q) it2.next()).f9751b == c4320p2.f14399n) {
                                                            break;
                                                        }
                                                    } else if (enumC3400k == EnumC3400k.f10992v) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c4305aM1576s = m1576s(c4322r, i10);
                        m1567j(c4305aM1576s2, c4305aM1576s);
                    }
                    map.put(Integer.valueOf(i10), c4305aM1576s2);
                    c4305aM1576s2.f14351l.add(c4320p2);
                    c4320p = c4320p2;
                }
                c4305aM1576s2 = c4305aM1576s;
                map.put(Integer.valueOf(i10), c4305aM1576s2);
                c4305aM1576s2.f14351l.add(c4320p2);
                c4320p = c4320p2;
            }
            i9++;
        }
        Iterator it3 = c4322r.f14425z.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C4305a) it3.next()).f14351l.iterator();
            while (it4.hasNext()) {
                for (C2985q c2985q : ((C4320p) it4.next()).f9217g.mo6238d(c2825b)) {
                    m1567j(m1571n(c2985q.f9750a, map), m1571n(c2985q.f9751b, map));
                }
            }
        }
        c4322r.f14425z.forEach(new C0074e(15));
        Iterator it5 = c4322r.f14425z.iterator();
        while (it5.hasNext()) {
            ArrayList arrayList = ((C4305a) it5.next()).f14351l;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                C4320p c4320p3 = (C4320p) arrayList.get(i11);
                if (c4320p3.f14396k == EnumC3400k.f10984n) {
                    int size2 = c4320p3.f14398m.size() / 2;
                    for (int i12 = 0; i12 < size2; i12++) {
                        C4320p c4320p4 = new C4320p(EnumC3400k.f10983m, 1);
                        int i13 = i12 * 2;
                        c4320p4.m8688d0((C3514r) c4320p3.mo7179S(i13));
                        c4320p4.mo7178I(c4320p3.mo7179S(i13 + 1));
                        c4320p4.m6225B(c4320p3);
                        c4320p4.m6393H(c4320p3);
                        if (i12 == 0) {
                            c4320p4.f14399n = c4320p3.f14399n;
                            arrayList.set(i11, c4320p4);
                        } else {
                            arrayList.add(i11 + i12, c4320p4);
                        }
                    }
                    i11 += size2 - 1;
                    size = arrayList.size();
                }
                i11++;
            }
        }
        if (c4322r.f9217g.mo6235a(EnumC2824a.f9156k0)) {
            int size3 = c4322r.f14425z.size();
            int i14 = 0;
            loop9: while (true) {
                List<C4305a> list = c4322r.f14425z;
                int size4 = list.size();
                for (C4305a c4305a : list) {
                    if (AbstractC0000a.m94v(c4305a, EnumC3400k.f10975a0)) {
                        AbstractC0000a.m40U0(c4305a, AbstractC0000a.m6D0(c4322r), new C0548a(c4322r, c4305a));
                        if (size4 != c4322r.f14425z.size()) {
                            int i15 = i14 + 1;
                            if (i14 > size3) {
                                C0086a.m452k("Fail to resolve jsr instructions");
                                return;
                            }
                            i14 = i15;
                        }
                    }
                }
                break loop9;
            }
        }
        Iterator it6 = c4322r.f14425z.iterator();
        while (it6.hasNext()) {
            Iterator it7 = ((C4305a) it6.next()).f14351l.iterator();
            while (it7.hasNext()) {
                ((C4320p) it7.next()).m6228E(c2825b);
            }
        }
        Iterator it8 = c4322r.f14425z.iterator();
        while (it8.hasNext()) {
            ((C4305a) it8.next()).f14351l.removeIf(new C0019b(29));
        }
        c4322r.f14425z.removeIf(new C0019b(28));
        c4322r.f14425z.removeIf(new C0019b(27));
        if (!c4322r.f14405E.isEmpty()) {
            for (C4305a c4305a2 : c4322r.f14425z) {
                Iterator it9 = c4305a2.f14351l.iterator();
                while (it9.hasNext()) {
                    C0071b c0071b = (C0071b) ((C4320p) it9.next()).f9217g.mo6237c(C2825b.f9179F);
                    if (c0071b != null) {
                        Iterator it10 = c0071b.f228g.iterator();
                        while (it10.hasNext()) {
                            C4305a c4305aM1571n = m1571n(((C0075f) it10.next()).f233b, map);
                            if (!c4305aM1571n.f9217g.mo6236b(C2825b.f9176C)) {
                                List list2 = c4305a2.f14352m;
                                if (list2.isEmpty()) {
                                    C0086a.m452k("Unexpected missing predecessor for block: ".concat(String.valueOf(c4305a2)));
                                    return;
                                }
                                C4305a c4305a3 = list2.size() == 1 ? (C4305a) list2.get(0) : c4305a2;
                                if (!c4305a3.f14353n.contains(c4305aM1571n)) {
                                    m1567j(c4305a3, c4305aM1571n);
                                    c4305aM1571n.m6233y(new C2977i0(c4305a3));
                                }
                            }
                        }
                    }
                }
            }
        }
        C4305a c4305a4 = c4322r.f14403C;
        for (C4305a c4305a5 : c4322r.f14425z) {
            if (c4305a5.f14353n.isEmpty() && c4305a5 != c4305a4) {
                m1567j(c4305a5, c4305a4);
                if (AbstractC0000a.m94v(c4305a5, EnumC3400k.f10986p)) {
                    c4305a5.m6231w(EnumC2824a.f9161n);
                }
            }
        }
        c4322r.m8707f0();
        c4322r.f14424y = null;
    }
}
