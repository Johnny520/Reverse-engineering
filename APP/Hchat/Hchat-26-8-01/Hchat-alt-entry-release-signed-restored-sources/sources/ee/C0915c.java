package ee;

import ae.C0074e;
import ae.C0075f;
import ae.C0077h;
import be.AbstractC0269a;
import be.AbstractC0283h;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import md.C2825b;
import md.C2827d;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p038ce.C0561n;
import p038ce.C0562o;
import p199nd.C2967d0;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4306b;
import p302ud.C4320p;
import p302ud.C4322r;
import p345x8.C5715h;
import p351xe.AbstractC5790k;
import p351xe.AbstractC5798s;
import p351xe.C5787h;
import p384ze.C6139a;

/* JADX INFO: renamed from: ee.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915c extends AbstractC0269a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0915c.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2227i(C4305a c4305a, C4305a c4305a2, C0914b c0914b, C0913a c0913a, HashMap map) {
        boolean z9;
        List list;
        C0914b c0914b2 = c0913a.f2849e;
        C6139a c6139a = new C6139a(c4305a, c4305a2);
        Boolean bool = (Boolean) map.get(c6139a);
        if (bool != null) {
            return bool.booleanValue();
        }
        C2829f c2829f = c4305a2.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9157l;
        List list2 = c2829f.mo6235a(enumC2824a) ? c4305a2.f14354o : c4305a2.f14353n;
        List list3 = c4305a.f9217g.mo6235a(enumC2824a) ? c4305a.f14354o : c4305a.f14353n;
        if (list2.size() == list3.size()) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (i10 < list2.size()) {
                C4305a c4305a3 = (C4305a) list2.get(i10);
                C4305a c4305a4 = (C4305a) list3.get(i10);
                if (c0913a.f2846b.contains(c4305a3)) {
                    ArrayList arrayList = c4305a4.f14351l;
                    ArrayList arrayList2 = c4305a3.f14351l;
                    int size = arrayList.size();
                    int size2 = arrayList2.size();
                    if (size2 != 0) {
                        if (size >= size2) {
                            c0913a.f2852h = arrayList;
                            c0913a.f2853i = i9;
                            while (i9 < size2) {
                                List list4 = list3;
                                if (!m2233o(c0913a, (C4320p) arrayList.get(i9), (C4320p) arrayList2.get(i9))) {
                                    break loop0;
                                }
                                i9++;
                                list3 = list4;
                            }
                            list = list3;
                            if (size > size2) {
                                ArrayList arrayList3 = c4305a4.f14351l;
                                for (int i11 = 0; i11 < size2; i11++) {
                                    c0914b.m2226b(c4305a4, (C4320p) arrayList3.get(i11));
                                }
                                c0914b.f2856c = true;
                                c0914b2.m2225a(c4305a3);
                                c0914b2.f2856c = true;
                            }
                            if (m2227i(c4305a4, c4305a3, c0914b, c0913a, map)) {
                            }
                        }
                        z9 = false;
                        break;
                    }
                    if (size != 0) {
                        z9 = false;
                        break;
                    }
                    list = list3;
                    if (m2227i(c4305a4, c4305a3, c0914b, c0913a, map)) {
                        z9 = false;
                        break;
                    }
                    c0914b.m2225a(c4305a4);
                    c0914b2.m2225a(c4305a3);
                } else {
                    list = list3;
                }
                i10++;
                list3 = list;
                i9 = 0;
            }
            z9 = true;
        } else {
            z9 = true;
        }
        map.put(c6139a, Boolean.valueOf(z9));
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m2228j(C0913a c0913a, ArrayList arrayList, ArrayList arrayList2, int i9) {
        c0913a.f2852h = arrayList;
        c0913a.f2853i = i9;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            if (!m2233o(c0913a, (C4320p) arrayList.get(i9 + size), (C4320p) arrayList2.get(size))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m2229k(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        if (abstractC3508l == null || abstractC3508l2 == null || !(abstractC3508l instanceof C3514r) || !(abstractC3508l2 instanceof C3514r)) {
            return;
        }
        ((C3514r) abstractC3508l2).f11440m.m7408m(((C3514r) abstractC3508l).f11440m.m7398b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2230l(C0914b c0914b, EnumC2824a enumC2824a) {
        Iterator it = c0914b.f2854a.iterator();
        while (it.hasNext()) {
            ((C4320p) it.next()).m6231w(enumC2824a);
        }
        LinkedHashSet<C4305a> linkedHashSet = new LinkedHashSet();
        Iterator it2 = c0914b.f2854a.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add((C4305a) c0914b.f2855b.get((C4320p) it2.next()));
        }
        for (C4305a c4305a : linkedHashSet) {
            Iterator it3 = c4305a.f14351l.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (!((C4320p) it3.next()).f9217g.mo6235a(enumC2824a)) {
                        break;
                    }
                } else {
                    c4305a.m6231w(enumC2824a);
                    break;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x00e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:189:0x0327 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19, types: [ud.p] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [ud.p] */
    /* JADX INFO: renamed from: m */
    public static boolean m2231m(C4322r c4322r, C0077h c0077h) {
        C0075f c0075f;
        C4320p c4320p;
        boolean z9;
        ?? arrayList;
        boolean z10;
        C0914b c0914b;
        C4305a c4305aM19K;
        C4305a c4305aM60d0;
        Iterator it;
        boolean z11;
        boolean z12 = c0077h.f248l;
        List list = c0077h.f244h;
        boolean z13 = false;
        if (!z12) {
            Iterator it2 = list.iterator();
            while (true) {
                c0075f = null;
                C4320p c4320pM57c0 = null;
                if (!it2.hasNext()) {
                    c4320p = null;
                    break;
                }
                C0075f c0075f2 = (C0075f) it2.next();
                if (c0075f2.m444c()) {
                    for (C4305a c4305a : c0075f2.f235d) {
                        C4320p c4320pM57c02 = AbstractC0000a.m57c0(c4305a);
                        if (c4320pM57c02 != null && c4320pM57c02.f14396k == EnumC3400k.f10988r) {
                            c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
                        }
                    }
                    c4320p = c4320pM57c0;
                    c0075f = c0075f2;
                }
            }
            if (c0075f != null) {
                ArrayList arrayList2 = c0075f.f235d;
                if (c4320p != null) {
                    C4305a c4305a2 = c0075f.f234c;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    boolean z14 = true;
                    AbstractC0000a.m102z(c4305a2, c4305a2, linkedHashSet, AbstractC0000a.m6D0(c4322r), true);
                    ArrayList arrayList3 = new ArrayList(linkedHashSet);
                    arrayList3.remove(c4305a2);
                    List listM1184v = AbstractC0283h.m1184v(arrayList3, new C0561n(5));
                    if (listM1184v.size() != 1) {
                        c4322r.m6380I("Finally have unexpected throw blocks count: " + listM1184v.size() + ", expect 1");
                    } else {
                        C4305a c4305a3 = (C4305a) listM1184v.get(0);
                        arrayList3.remove(c4305a3);
                        m2232n(arrayList3, c4305a3);
                    }
                    boolean zIsEmpty = arrayList3.isEmpty();
                    EnumC2824a enumC2824a = EnumC2824a.f9166s;
                    if (zIsEmpty || AbstractC0000a.m75l0(arrayList3)) {
                        c0075f.f238g.f244h.remove(c0075f);
                        z9 = true;
                        c0075f.f240i = true;
                        arrayList2.forEach(new C0074e(0));
                    } else {
                        C0913a c0913a = new C0913a(c4322r, (C4305a) AbstractC5798s.m10512f(c4305a2.f14354o), arrayList3);
                        boolean zIsEmpty2 = c0077h.f247k.isEmpty();
                        boolean z15 = !zIsEmpty2;
                        if (zIsEmpty2) {
                            arrayList = list;
                        } else {
                            arrayList = new ArrayList(list);
                            Iterator it3 = c0077h.f247k.iterator();
                            while (it3.hasNext()) {
                                arrayList.addAll(((C0077h) it3.next()).f244h);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                boolean zHasNext = it4.hasNext();
                                z10 = z13;
                                c0914b = c0913a.f2849e;
                                if (!zHasNext) {
                                    break;
                                }
                                C0075f c0075f3 = (C0075f) it4.next();
                                if (c0075f3 == c0075f) {
                                    z13 = z10;
                                } else {
                                    Iterator it5 = c0075f3.f235d.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            z11 = z14;
                                            break;
                                        }
                                        z11 = z14;
                                        if (m2234p((C4305a) it5.next(), c0913a)) {
                                            break;
                                        }
                                        if (!c0914b.f2856c) {
                                            c0914b.f2854a.clear();
                                            c0914b.f2855b.clear();
                                        }
                                        z14 = z11;
                                    }
                                    z13 = z10;
                                    z14 = z11;
                                }
                            }
                            boolean z16 = z14;
                            ArrayList arrayList4 = c0913a.f2847c;
                            int size = arrayList4.size();
                            if (size != arrayList.size() - 1) {
                                if (zIsEmpty2 || size != list.size() - 1) {
                                    return z10;
                                }
                                z15 = z10;
                            }
                            List list2 = c0075f.f238g.f245i;
                            C4305a c4305aM41V = AbstractC0000a.m41V(arrayList2);
                            if (c4305aM41V == null || (c4305aM60d0 = AbstractC0000a.m60d0((c4305aM19K = AbstractC0000a.m19K(c4305aM41V)))) == null) {
                                return z10;
                            }
                            Stream streamFilter = c4305aM60d0.f14352m.stream().filter(new C0562o(c4305aM19K, 2));
                            if (c4305aM60d0 == c4322r.f14403C) {
                                streamFilter = streamFilter.flatMap(new C0640b(17));
                            }
                            Iterator it6 = ((List) streamFilter.collect(Collectors.toList())).iterator();
                            boolean z17 = z10;
                            while (it6.hasNext()) {
                                C4305a c4305a4 = (C4305a) it6.next();
                                BitSet bitSetM6D0 = AbstractC0000a.m6D0(c4322r);
                                if (list2.isEmpty()) {
                                    it = it6;
                                } else {
                                    BitSet bitSetM6D02 = AbstractC0000a.m6D0(c4322r);
                                    Iterator it7 = list2.iterator();
                                    while (it7.hasNext()) {
                                        bitSetM6D02.set(((C4305a) it7.next()).f14349j);
                                        it6 = it6;
                                    }
                                    it = it6;
                                    bitSetM6D0.or(bitSetM6D02);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                boolean z18 = z17;
                                AbstractC0000a.m40U0(c4305a4, bitSetM6D0, new C5715h(arrayList5, 1));
                                if (arrayList5.size() < arrayList3.size()) {
                                    z17 = z18;
                                } else {
                                    Iterator it8 = arrayList5.iterator();
                                    while (it8.hasNext()) {
                                        if (m2234p((C4305a) it8.next(), c0913a)) {
                                            z17 = z16;
                                            break;
                                        }
                                        if (!c0914b.f2856c) {
                                            c0914b.f2854a.clear();
                                            c0914b.f2855b.clear();
                                        }
                                    }
                                    z17 = z18;
                                }
                                it6 = it;
                            }
                            if (!z17) {
                                return z10;
                            }
                            ArrayList arrayList6 = c0914b.f2854a;
                            Iterator it9 = arrayList4.iterator();
                            while (true) {
                                boolean zHasNext2 = it9.hasNext();
                                C4322r c4322r2 = c0913a.f2845a;
                                if (zHasNext2) {
                                    C0914b c0914b2 = (C0914b) it9.next();
                                    Iterator it10 = it9;
                                    if (c0914b2.f2854a.size() != arrayList6.size()) {
                                        c4322r2.m6380I("Incorrect finally slice size: " + String.valueOf(c0914b2) + ", expected: " + String.valueOf(c0914b));
                                        break;
                                    }
                                    it9 = it10;
                                } else {
                                    ?? r72 = z10;
                                    while (r72 < arrayList6.size()) {
                                        C4320p c4320p2 = (C4320p) arrayList6.get(r72 == true ? 1 : 0);
                                        Iterator it11 = arrayList4.iterator();
                                        ?? r73 = r72;
                                        while (it11.hasNext()) {
                                            C4320p c4320p3 = (C4320p) ((C0914b) it11.next()).f2854a.get(r73);
                                            ArrayList arrayList7 = arrayList6;
                                            ?? r19 = r73;
                                            if (c4320p2.f14396k != c4320p3.f14396k) {
                                                c4322r2.m6380I("Incorrect finally slice insn: " + String.valueOf(c4320p3) + ", expected: " + String.valueOf(c4320p2));
                                            } else {
                                                arrayList6 = arrayList7;
                                                r73 = r19 == true ? 1 : 0;
                                            }
                                        }
                                        r72 = (r73 == true ? 1 : 0) + 1;
                                    }
                                    m2230l(c0914b, EnumC2824a.f9117C);
                                    Iterator it12 = arrayList4.iterator();
                                    while (it12.hasNext()) {
                                        m2230l((C0914b) it12.next(), enumC2824a);
                                    }
                                    ?? r02 = c0914b.f2854a;
                                    for (?? r42 = z10; r42 < r02.size(); r42++) {
                                        ?? r5 = (C4320p) r02.get(r42);
                                        Iterator it13 = arrayList4.iterator();
                                        while (it13.hasNext()) {
                                            ?? r82 = (C4320p) ((C0914b) it13.next()).f2854a.get(r42);
                                            m2229k(r5.f14397l, r82.f14397l);
                                            int size2 = r5.f14398m.size();
                                            for (?? r13 = z10; r13 < size2; r13++) {
                                                m2229k(r5.mo7179S(r13), r82.mo7179S(r13));
                                            }
                                        }
                                    }
                                    c0075f.f239h = z16;
                                    if (z15) {
                                        List<C0077h> list3 = c0077h.f247k;
                                        for (C0077h c0077h2 : list3) {
                                            list.addAll(c0077h2.f244h);
                                            c0077h.f245i.addAll(c0077h2.f245i);
                                            c0077h2.f248l = true;
                                        }
                                        c0077h.f245i = new ArrayList(new LinkedHashSet(c0077h.f245i));
                                        list3.clear();
                                    }
                                    z9 = true;
                                }
                            }
                            c4322r.m6383L("Finally extract failed");
                            return z10;
                        }
                    }
                    c4320p.m6231w(enumC2824a);
                    return z9;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m2232n(ArrayList arrayList, C4305a c4305a) {
        for (C4305a c4305a2 : c4305a.f14352m) {
            if (c4305a2.f14351l.isEmpty() && arrayList.remove(c4305a2)) {
                if (!(c4305a2.f14354o.contains(c4305a) ? false : c4305a2.f14353n.contains(c4305a))) {
                    m2232n(arrayList, c4305a2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2233o(C0913a c0913a, C4320p c4320p, C4320p c4320p2) {
        boolean z9;
        if (c4320p.mo7168Y(c4320p2)) {
            int i9 = 0;
            while (true) {
                boolean z10 = true;
                if (i9 >= c4320p.f14398m.size()) {
                    return true;
                }
                AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(i9);
                AbstractC3508l abstractC3508lMo7179S2 = c4320p2.mo7179S(i9);
                abstractC3508lMo7179S.getClass();
                boolean z11 = abstractC3508lMo7179S instanceof C3514r;
                abstractC3508lMo7179S2.getClass();
                if (z11 == (abstractC3508lMo7179S2 instanceof C3514r)) {
                    if (z11) {
                        C3514r c3514r = (C3514r) abstractC3508lMo7179S;
                        C3514r c3514r2 = (C3514r) abstractC3508lMo7179S2;
                        if (!c3514r.m7395g0(c3514r2)) {
                            C2829f c2829f = c3514r2.f9217g;
                            C2825b c2825b = C2825b.f9185L;
                            C2967d0 c2967d0 = (C2967d0) c2829f.mo6237c(c2825b);
                            C2967d0 c2967d02 = (C2967d0) c3514r.f9217g.mo6237c(c2825b);
                            if ((c2967d0 == null || c2967d02 == null) ? false : c2967d02.equals(c2967d0)) {
                                boolean zM7377K = abstractC3508lMo7179S.m7377K();
                                if (zM7377K == abstractC3508lMo7179S2.m7377K()) {
                                    if (zM7377K) {
                                        if (!((abstractC3508lMo7179S.m7377K() && abstractC3508lMo7179S2.m7377K()) ? abstractC3508lMo7179S.equals(abstractC3508lMo7179S2) : false)) {
                                            z10 = false;
                                        }
                                    }
                                    if (!z10) {
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                if (AbstractC5790k.m10470a(c0913a.f2849e.f2854a, c3514r2.m7394f0(), 0) != -1) {
                                    z9 = false;
                                    if (!z9) {
                                        C4320p c4320pM7394f0 = c3514r2.m7394f0();
                                        C4320p c4320pM7394f02 = c3514r.m7394f0();
                                        if ((c4320pM7394f0 == null || c4320pM7394f02 == null || !c4320pM7394f0.mo7168Y(c4320pM7394f02)) ? true : (c4320pM7394f0.m8686W() && c4320pM7394f02.m8686W()) ? !c4320pM7394f0.m8687X(c4320pM7394f02) : false) {
                                        }
                                    }
                                } else {
                                    C4320p c4320pM7394f03 = c3514r.m7394f0();
                                    C0914b c0914b = c0913a.f2851g;
                                    if (c0914b == null) {
                                        List list = c0913a.f2852h;
                                        if (!AbstractC5798s.m10520n(list) || AbstractC5790k.m10470a(list, c4320pM7394f03, c0913a.f2853i) == -1) {
                                            z9 = true;
                                        }
                                        if (!z9) {
                                        }
                                    } else {
                                        if (AbstractC5790k.m10470a(c0914b.f2854a, c4320pM7394f03, 0) != -1) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2234p(C4305a c4305a, C0913a c0913a) {
        int i9;
        int i10;
        boolean z9;
        C0914b c0914b;
        boolean z10;
        ArrayList arrayList;
        if (c0913a.f2848d.add(c4305a)) {
            C4305a c4305a2 = c0913a.f2850f;
            C0914b c0914b2 = null;
            c0913a.f2851g = null;
            C0914b c0914b3 = c0913a.f2849e;
            ArrayList arrayList2 = c4305a.f14351l;
            ArrayList arrayList3 = c4305a2.f14351l;
            int size = arrayList2.size();
            int size2 = arrayList3.size();
            if (size >= size2) {
                if (size == size2) {
                    if (m2228j(c0913a, arrayList2, arrayList3, 0)) {
                        i10 = 0;
                        i9 = 0;
                        c0914b = new C0914b();
                        c0913a.f2851g = c0914b;
                        if (i10 == 0) {
                            size = i10 + 1;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        while (i9 < size) {
                            c0914b.m2226b(c4305a, (C4320p) arrayList2.get(i9));
                            i9++;
                        }
                        if (c0914b3.f2856c) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                c0914b3.m2226b(c4305a2, (C4320p) it.next());
                            }
                        } else if (c0914b3.f2854a.size() != c0914b.f2854a.size()) {
                            c0913a.f2845a.m6380I("Another duplicated slice has different insns count: " + String.valueOf(c0914b) + ", finally: " + String.valueOf(c0914b3));
                        }
                        if (z10) {
                            c0914b.f2856c = true;
                            c0914b3.f2856c = true;
                        }
                        if (c0914b != null) {
                            if (c0914b.f2856c) {
                                arrayList = c0914b.f2854a;
                                if (!arrayList.isEmpty() && (arrayList.size() != 1 || ((C4320p) arrayList.get(0)).f14396k != EnumC3400k.f10992v)) {
                                    c0914b2 = c0914b;
                                }
                            } else if (m2227i(c4305a, c4305a2, c0914b, c0913a, new HashMap())) {
                                c0914b.f2856c = true;
                                c0914b3.f2856c = true;
                                arrayList = c0914b.f2854a;
                                if (!arrayList.isEmpty()) {
                                    c0914b2 = c0914b;
                                }
                            }
                        }
                        if (c0914b2 != null) {
                            c0913a.f2847c.add(c0914b2);
                            return true;
                        }
                    }
                    c0914b = null;
                    if (c0914b != null) {
                    }
                    if (c0914b2 != null) {
                    }
                } else {
                    i9 = size - size2;
                    if (m2228j(c0913a, arrayList2, arrayList3, i9)) {
                        i10 = 0;
                    } else {
                        int i11 = 1;
                        while (true) {
                            if (i11 >= i9) {
                                i10 = 0;
                                z9 = false;
                                break;
                            }
                            if (m2228j(c0913a, arrayList2, arrayList3, i11)) {
                                i10 = size2 + i11;
                                i9 = i11;
                                z9 = true;
                                break;
                            }
                            i11++;
                        }
                        if (!z9) {
                            c0914b = null;
                            if (c0914b != null) {
                            }
                            if (c0914b2 != null) {
                            }
                        }
                    }
                    c0914b = new C0914b();
                    c0913a.f2851g = c0914b;
                    if (i10 == 0) {
                    }
                    while (i9 < size) {
                    }
                    if (c0914b3.f2856c) {
                    }
                    if (z10) {
                    }
                    if (c0914b != null) {
                    }
                    if (c0914b2 != null) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        C2825b c2825b = C2825b.f9205t;
        if (c4322r.f14415p || c4322r.f14405E.isEmpty()) {
            return;
        }
        try {
            List listMo6238d = c4322r.f9217g.mo6238d(c2825b);
            Iterator it = listMo6238d.iterator();
            boolean zM2231m = false;
            while (it.hasNext()) {
                zM2231m |= m2231m(c4322r, (C0077h) it.next());
            }
            if (zM2231m) {
                c4322r.f14405E.removeIf(new C4306b(1));
                ArrayList arrayList = new ArrayList(listMo6238d);
                if (arrayList.removeIf(new C0561n(4))) {
                    c4322r.m6228E(c2825b);
                    arrayList.forEach(new C2827d(c4322r.m6226C(), 0));
                }
            }
        } catch (Exception e6) {
            c4322r.m6384M("Undo finally extract visitor", e6);
            try {
                c4322r.m8706e0();
                c4322r.m8702a0();
                for (AbstractC0269a abstractC0269a : c4322r.f14411l.f14371k.f14452r.f2324a) {
                    if (abstractC0269a instanceof C0915c) {
                        return;
                    } else {
                        AbstractC0283h.m1164i0(abstractC0269a, c4322r);
                    }
                }
            } catch (Exception e7) {
                C5787h.m10468a(c4322r, "Undo finally extract failed", e7);
            }
        }
    }
}
