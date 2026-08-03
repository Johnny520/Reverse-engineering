package p038ce;

import ac.AbstractC0063p;
import ae.C0070a;
import ae.C0071b;
import ae.C0072c;
import ae.C0073d;
import ae.C0074e;
import ae.C0075f;
import ae.C0076g;
import ae.C0077h;
import be.AbstractC0269a;
import be.AbstractC0283h;
import be.C0285i;
import be.C0294m0;
import be.C0298p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import md.C2825b;
import md.C2827d;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p092g4.AbstractC1341a;
import p199nd.C2966d;
import p199nd.C2975h0;
import p199nd.C2977i0;
import p199nd.C2988t;
import p199nd.EnumC2964c;
import p215od.C3128a;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3510n;
import p246qd.C3512p;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4306b;
import p302ud.C4310f;
import p302ud.C4320p;
import p302ud.C4322r;
import p351xe.AbstractC5798s;
import p351xe.C5783d;
import p351xe.C5786g;
import p351xe.C5791l;
import p384ze.C6141c;

/* JADX INFO: renamed from: ce.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559l extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f1748g = AbstractC2846d.m6274b(C0559l.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1558i(C4322r c4322r) {
        for (C4305a c4305a : c4322r.f14425z) {
            if (c4305a.f14352m.isEmpty() && c4305a != c4322r.f14402B) {
                C0086a.m452k("Unreachable block: ".concat(String.valueOf(c4305a)));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m1559j(C4322r c4322r) {
        c4322r.f14425z.forEach(new C0074e(12));
        int size = c4322r.f14425z.size();
        ArrayList arrayList = new ArrayList(size);
        AbstractC0000a.m61d1(c4322r, c4322r.f14402B, new C0073d(28), new C0294m0(3, arrayList));
        if (arrayList.size() != size) {
            C0086a.m452k("Found unreachable blocks");
            return;
        }
        c4322r.f14425z = arrayList;
        c4322r.m8707f0();
        C4305a[] c4305aArrM2769h = AbstractC1089i.m2769h(arrayList, new C0073d(27));
        C4305a c4305a = (C4305a) arrayList.get(0);
        c4305a.f14355p = C5786g.f23528g;
        c4305a.f14358s = null;
        int size2 = arrayList.size();
        for (int i9 = 1; i9 < size2; i9++) {
            C4305a c4305a2 = (C4305a) arrayList.get(i9);
            C4305a c4305a3 = c4305aArrM2769h[i9];
            c4305a2.f14358s = c4305a3;
            c4305a3.f14360u.add(c4305a2);
            BitSet bitSet = new BitSet(c4305aArrM2769h.length);
            while (true) {
                int i10 = c4305a3.f14349j;
                if (bitSet.get(i10)) {
                    break;
                }
                bitSet.set(i10);
                BitSet bitSet2 = c4305a3.f14355p;
                if (bitSet2 != null) {
                    bitSet.or(bitSet2);
                    break;
                }
                c4305a3 = c4305aArrM2769h[i10];
            }
            bitSet.clear(i9);
            c4305a2.f14355p = bitSet;
        }
        c4322r.f14425z.forEach(new C0074e(13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1560k(LinkedHashSet linkedHashSet, C4305a c4305a, C4322r c4322r) {
        C4305a c4305a2;
        if (!c4305a.f14352m.isEmpty() || c4305a == (c4305a2 = c4322r.f14402B)) {
            return;
        }
        EnumSet enumSet = C0560m.f1749g;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c4305a);
        while (!arrayDeque.isEmpty()) {
            C4305a c4305a3 = (C4305a) arrayDeque.pop();
            if (!linkedHashSet.contains(c4305a3)) {
                linkedHashSet.add(c4305a3);
                for (C4305a c4305a4 : c4305a3.f14353n) {
                    if (c4305a4 != c4305a2 && linkedHashSet.containsAll(c4305a4.f14352m)) {
                        arrayDeque.push(c4305a4);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1561l(List list, AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        if (!(abstractC3508l instanceof C3514r)) {
            return false;
        }
        int i9 = ((C3514r) abstractC3508l).f11439l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C4305a) it.next()).f14351l.iterator();
            while (it2.hasNext()) {
                C3514r c3514r = ((C4320p) it2.next()).f14397l;
                if (c3514r != null && c3514r.f11439l == i9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:275:0x042e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6 A[LOOP:7: B:106:0x0214->B:142:0x02c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0376 A[PHI: r4 r6
  0x0376: PHI (r4v7 ??) = (r4v22 ??), (r4v23 ??), (r4v24 ??), (r4v25 ??), (r4v26 ??), (r4v10 ??) binds: [B:180:0x0381, B:183:0x038a, B:186:0x0391, B:188:0x0397, B:196:0x03d2, B:177:0x0375] A[DONT_GENERATE, DONT_INLINE]
  0x0376: PHI (r6v6 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:180:0x0381, B:183:0x038a, B:186:0x0391, B:188:0x0397, B:196:0x03d2, B:177:0x0375] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1562m(C4322r c4322r) {
        boolean z9;
        ?? r42;
        C4320p c4320pM57c0;
        boolean z10;
        List list;
        int size;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Iterator it = c4322r.f14425z.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            EnumC2824a enumC2824a = EnumC2824a.f9159m;
            int i9 = -1;
            int i10 = 0;
            int i11 = 1;
            if (zHasNext) {
                C4305a c4305a = (C4305a) it.next();
                if (c4305a.f9217g.mo6235a(EnumC2824a.f9155k)) {
                    List listMo6238d = c4305a.f9217g.mo6238d(C2825b.f9211z);
                    int size2 = listMo6238d.size();
                    if (size2 != 0) {
                        Iterator it2 = listMo6238d.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ArrayList<C4310f> arrayListM6395a = ((C2988t) it2.next()).m6395a();
                                if (arrayListM6395a.isEmpty()) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    for (C4310f c4310f : arrayListM6395a) {
                                        C4305a c4305a2 = c4310f.f14388b;
                                        C4305a c4305a3 = c4310f.f14387a;
                                        if (!c4305a2.f9217g.mo6235a(enumC2824a) && !c4305a3.f9217g.mo6235a(enumC2824a)) {
                                            C0560m.m1572o(c4322r, c4305a3, c4305a2);
                                            z15 = true;
                                        }
                                    }
                                }
                                if (z15) {
                                    break;
                                }
                            } else if (size2 > 1) {
                                Iterator it3 = listMo6238d.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C2988t) it3.next()).f9755a != c4305a) {
                                            z14 = false;
                                            break;
                                        }
                                    } else {
                                        C4305a c4305aM1576s = C0560m.m1576s(c4322r, c4305a.f14350k);
                                        c4305aM1576s.m6231w(enumC2824a);
                                        C0560m.m1567j(c4305aM1576s, c4305a);
                                        Iterator it4 = listMo6238d.iterator();
                                        while (it4.hasNext()) {
                                            C0560m.m1575r(((C2988t) it4.next()).f9756b, c4305a, c4305aM1576s);
                                        }
                                        z14 = true;
                                    }
                                }
                                if (z14) {
                                    break;
                                }
                                if (size2 == 1) {
                                    C2988t c2988t = (C2988t) listMo6238d.get(0);
                                    C4305a c4305a4 = c2988t.f9756b;
                                    C4305a c4305a5 = c2988t.f9755a;
                                    List list2 = c4305a4.f14352m;
                                    if (list2.size() > 1) {
                                        z11 = false;
                                        for (C4305a c4305a6 : new ArrayList(list2)) {
                                            if (!c4305a6.f9217g.mo6235a(enumC2824a)) {
                                                C0560m.m1572o(c4322r, c4305a6, c4305a4);
                                                z11 = true;
                                            }
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11) {
                                        List list3 = c4305a5.f14352m;
                                        int size3 = list3.size() - 1;
                                        if (size3 == 1) {
                                            z12 = false;
                                        } else {
                                            if (size3 == 0) {
                                                C2829f c2829f = c4305a5.f9217g;
                                                EnumC2824a enumC2824a2 = EnumC2824a.f9147g;
                                                if (!c2829f.mo6235a(enumC2824a2)) {
                                                    c4322r.m6383L("Unexpected block without predecessors: ".concat(String.valueOf(c4305a5)));
                                                }
                                                C4305a c4305aM1576s2 = C0560m.m1576s(c4322r, -1);
                                                c4305aM1576s2.m6231w(enumC2824a);
                                                c4305aM1576s2.m6231w(enumC2824a2);
                                                c4322r.f14402B = c4305aM1576s2;
                                                c4305a5.m6227D(enumC2824a2);
                                                C0560m.m1567j(c4305aM1576s2, c4305a5);
                                            } else {
                                                C4305a c4305aM1576s3 = C0560m.m1576s(c4322r, -1);
                                                c4305aM1576s3.m6231w(enumC2824a);
                                                for (C4305a c4305a7 : new ArrayList(list3)) {
                                                    if (c4305a7 != c4305a4) {
                                                        C0560m.m1575r(c4305a7, c4305a5, c4305aM1576s3);
                                                    }
                                                }
                                                C0560m.m1567j(c4305aM1576s3, c4305a5);
                                            }
                                            z12 = true;
                                        }
                                        if (z12) {
                                            break;
                                        }
                                        if (c4305a4.f14353n.size() <= 1) {
                                            z13 = false;
                                        } else {
                                            C4305a c4305aM1576s4 = C0560m.m1576s(c4322r, -1);
                                            c4305aM1576s4.m6231w(enumC2824a);
                                            c4305aM1576s4.m6231w(EnumC2824a.f9157l);
                                            C0560m.m1575r(c4305a4, c4305a5, c4305aM1576s4);
                                            C0560m.m1567j(c4305aM1576s4, c4305a5);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    break;
                }
            } else {
                boolean zM8701Z = c4322r.m8701Z();
                EnumC2824a enumC2824a3 = EnumC2824a.f9168u;
                if (zM8701Z) {
                    z9 = false;
                } else {
                    z9 = false;
                    for (C4305a c4305a8 : new ArrayList(c4322r.f14403C.f14352m)) {
                        List list4 = c4305a8.f14352m;
                        ArrayList arrayList = c4305a8.f14351l;
                        C4305a c4305a9 = (C4305a) AbstractC5798s.m10512f(list4);
                        if (c4305a9 != null) {
                            ArrayList arrayList2 = c4305a9.f14351l;
                            C4320p c4320p = (C4320p) AbstractC5798s.m10512f(arrayList2);
                            if (c4320p != null && c4320p.m8686W()) {
                                C3514r c3514r = c4320p.f14397l;
                                C4320p c4320pM57c02 = AbstractC0000a.m57c0(c4305a8);
                                if (c4320pM57c02 != null && c4320pM57c02.f14396k == EnumC3400k.f10986p) {
                                    AbstractC3508l abstractC3508lMo7179S = c4320pM57c02.mo7179S(0);
                                    c3514r.getClass();
                                    abstractC3508lMo7179S.getClass();
                                    if ((abstractC3508lMo7179S instanceof C3514r) && c3514r.f11439l == ((C3514r) abstractC3508lMo7179S).f11439l) {
                                        arrayList2.addAll(arrayList);
                                        c4305a9.m6225B(c4305a8);
                                        C0560m.m1573p(c4305a9, c4305a8);
                                        arrayList.clear();
                                        c4305a8.m6231w(enumC2824a3);
                                        C4305a c4305a10 = c4322r.f14403C;
                                        C0560m.m1573p(c4305a8, c4305a10);
                                        C0560m.m1567j(c4305a9, c4305a10);
                                        c4305a9.m8642H();
                                        z9 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z9) {
                        m1564o(c4322r);
                    }
                }
                if (!z9) {
                    if (C2966d.m6389b(c4322r, EnumC2964c.f9716g)) {
                        for (C4305a c4305a11 : c4322r.f14425z) {
                            ArrayList arrayList3 = c4305a11.f14351l;
                            if (arrayList3.size() == 1 && c4305a11.f14353n.size() == 1 && ((C4320p) arrayList3.get(0)).f14396k == EnumC3400k.f10983m && (size = (list = c4305a11.f14352m).size()) >= 3) {
                                Iterator it5 = list.iterator();
                                boolean z16 = false;
                                boolean z17 = false;
                                while (true) {
                                    if (it5.hasNext()) {
                                        C4320p c4320pM57c03 = AbstractC0000a.m57c0((C4305a) it5.next());
                                        if (c4320pM57c03 == null) {
                                            break;
                                        }
                                        int iOrdinal = c4320pM57c03.f14396k.ordinal();
                                        if (iOrdinal == 15) {
                                            z17 = true;
                                        } else {
                                            if (iOrdinal != 16) {
                                                break;
                                            }
                                            z16 = true;
                                        }
                                    } else {
                                        if (!z16 || !z17) {
                                            break;
                                        }
                                        C4305a c4305a12 = (C4305a) c4305a11.f14353n.get(0);
                                        ArrayList arrayList4 = new ArrayList(list);
                                        int i12 = 1;
                                        while (i12 < size) {
                                            C4305a c4305a13 = (C4305a) arrayList4.get(i12);
                                            C4305a c4305aM1576s5 = C0560m.m1576s(c4322r, i9);
                                            c4305aM1576s5.m6231w(enumC2824a);
                                            Iterator it6 = c4305a11.f14351l.iterator();
                                            while (it6.hasNext()) {
                                                C4320p c4320pM8683R = ((C4320p) it6.next()).m8683R();
                                                c4320pM8683R.m6231w(enumC2824a);
                                                c4305aM1576s5.f14351l.add(c4320pM8683R);
                                            }
                                            c4305aM1576s5.m6225B(c4305a11);
                                            C0560m.m1575r(c4305a13, c4305a11, c4305aM1576s5);
                                            C0560m.m1567j(c4305aM1576s5, c4305a12);
                                            i12++;
                                            i9 = -1;
                                        }
                                        z10 = true;
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                }
                            } else {
                                z10 = false;
                                if (z10) {
                                    i9 = -1;
                                }
                            }
                        }
                    }
                    ?? r43 = 0;
                    for (C4305a c4305a14 : c4322r.f14403C.f14352m) {
                        C2829f c2829f2 = c4305a14.f9217g;
                        ArrayList arrayList5 = c4305a14.f14351l;
                        if (!c2829f2.mo6235a(enumC2824a)) {
                            C2829f c2829f3 = c4305a14.f9217g;
                            EnumC2824a enumC2824a4 = EnumC2824a.f9162o;
                            if (!c2829f3.mo6235a(enumC2824a4)) {
                                if (c4305a14.f9217g.mo6236b(C2825b.f9178E)) {
                                    C2829f c2829f4 = c4305a14.f9217g;
                                    EnumC2824a enumC2824a5 = EnumC2824a.f9118D;
                                    r42 = r43;
                                    if (!c2829f4.mo6235a(enumC2824a5)) {
                                        List<C4305a> list5 = c4305a14.f14352m;
                                        r42 = r43;
                                        if (list5.size() >= 2) {
                                            final C4320p c4320pM57c04 = AbstractC0000a.m57c0(c4305a14);
                                            r42 = r43;
                                            if (c4320pM57c04 != null) {
                                                r42 = r43;
                                                if (c4320pM57c04.f14396k == EnumC3400k.f10988r) {
                                                    final HashMap map = new HashMap(list5.size());
                                                    final HashSet hashSet = new HashSet(list5.size());
                                                    for (final C4305a c4305a15 : list5) {
                                                        AbstractC0000a.m40U0(c4305a15, AbstractC0000a.m6D0(c4322r), new Predicate() { // from class: ce.j
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // java.util.function.Predicate
                                                            public final boolean test(Object obj) {
                                                                C4305a c4305a16 = (C4305a) obj;
                                                                C0072c c0072c = (C0072c) c4305a16.f9217g.mo6237c(C2825b.f9178E);
                                                                if (c0072c == null) {
                                                                    return false;
                                                                }
                                                                boolean zContains = c0072c.f229g.f235d.contains(c4305a16);
                                                                if (zContains && C0559l.m1561l(Collections.singletonList(c4305a16), c4320pM57c04.mo7179S(0))) {
                                                                    map.put(c4305a15, c0072c);
                                                                    hashSet.add(c4305a16);
                                                                }
                                                                return zContains;
                                                            }
                                                        });
                                                    }
                                                    i11 = 1;
                                                    if (hashSet.size() == 1) {
                                                        c4305a14.m6231w(enumC2824a5);
                                                        r42 = r43;
                                                    } else {
                                                        boolean z18 = true;
                                                        for (C4305a c4305a16 : new ArrayList(list5)) {
                                                            if (z18) {
                                                                z18 = false;
                                                            } else {
                                                                C4305a c4305aM1576s6 = C0560m.m1576s(c4322r, -1);
                                                                c4305aM1576s6.m6231w(enumC2824a);
                                                                Iterator it7 = arrayList5.iterator();
                                                                while (it7.hasNext()) {
                                                                    C4320p c4320pM8683R2 = ((C4320p) it7.next()).m8683R();
                                                                    c4320pM8683R2.m6231w(enumC2824a);
                                                                    c4305aM1576s6.f14351l.add(c4320pM8683R2);
                                                                }
                                                                c4305aM1576s6.m6225B(c4305a14);
                                                                C0072c c0072c = (C0072c) map.get(c4305a16);
                                                                if (c0072c != null) {
                                                                    c0072c.f229g.f235d.add(c4305aM1576s6);
                                                                }
                                                                C0560m.m1575r(c4305a16, c4305a14, c4305aM1576s6);
                                                            }
                                                        }
                                                        r42 = 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    List list6 = c4305a14.f14352m;
                                    if (list6.size() >= 2 && (c4320pM57c0 = AbstractC0000a.m57c0(c4305a14)) != null && (c4320pM57c0.f14398m.size() != i11 || arrayList5.size() != i11 || m1561l(list6, c4320pM57c0.mo7179S(i10)))) {
                                        int i13 = i11;
                                        for (C4305a c4305a17 : new ArrayList(list6)) {
                                            if (i13 != 0) {
                                                c4305a14.m6231w(enumC2824a4);
                                                i13 = i10;
                                            } else {
                                                C4305a c4305aM1576s7 = C0560m.m1576s(c4322r, -1);
                                                c4305aM1576s7.m6231w(enumC2824a);
                                                c4305aM1576s7.m6231w(EnumC2824a.f9161n);
                                                Iterator it8 = arrayList5.iterator();
                                                while (it8.hasNext()) {
                                                    C4320p c4320pM8683R3 = ((C4320p) it8.next()).m8683R();
                                                    c4320pM8683R3.m6231w(enumC2824a);
                                                    c4305aM1576s7.f14351l.add(c4320pM8683R3);
                                                }
                                                C0560m.m1575r(c4305a17, c4305a14, c4305aM1576s7);
                                            }
                                        }
                                        r42 = i11;
                                    }
                                }
                            }
                        }
                        i10 = 0;
                        r43 = r42;
                    }
                    if (r43 != 0) {
                        C4305a c4305a18 = c4322r.f14403C;
                        EnumSet enumSet = C0560m.f1749g;
                        Iterator it9 = c4305a18.f14352m.iterator();
                        while (it9.hasNext()) {
                            ((C4305a) it9.next()).f14353n.remove(c4305a18);
                        }
                        c4305a18.f14352m.clear();
                        for (C4305a c4305a19 : c4322r.f14425z) {
                            if (c4305a19 != c4305a18 && c4305a19.f14353n.isEmpty() && !c4305a19.f9217g.mo6235a(enumC2824a3)) {
                                C0560m.m1567j(c4305a19, c4305a18);
                            }
                        }
                    }
                    return r43;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m1563n(LinkedHashSet linkedHashSet, C4322r c4322r) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        long jCount = linkedHashSet.stream().filter(new C0019b(26)).count();
        if (jCount != 0) {
            c4322r.m6383L("Unreachable blocks removed: " + jCount + ", instructions: " + linkedHashSet.stream().mapToInt(new C0070a(3)).sum());
        }
        linkedHashSet.forEach(new C0074e(14));
        c4322r.f14425z.removeAll(linkedHashSet);
        c4322r.m8707f0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m1564o(C4322r c4322r) {
        if (c4322r.f14425z.removeIf(new C0556i(c4322r))) {
            c4322r.m8707f0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m1565p(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        if (abstractC3508l == abstractC3508l2) {
            return true;
        }
        if (abstractC3508l == null || abstractC3508l2 == null || !abstractC3508l.getClass().equals(abstractC3508l2.getClass())) {
            return false;
        }
        if (abstractC3508l instanceof C3514r) {
            return ((C3514r) abstractC3508l).f11439l == ((C3514r) abstractC3508l2).f11439l;
        }
        if (abstractC3508l instanceof C3510n) {
            return ((C3510n) abstractC3508l).f11422l == ((C3510n) abstractC3508l2).f11422l;
        }
        C0086a.m452k(AbstractC0255e.m1021j("Unexpected InsnArg types: ", String.valueOf(abstractC3508l), " and ", String.valueOf(abstractC3508l2)));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x00e0 A[EDGE_INSN: B:480:0x00e0->B:57:0x00e0 BREAK  A[LOOP:2: B:31:0x0081->B:59:0x0138], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0086 A[SYNTHETIC] */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        C2825b c2825b;
        List list;
        List list2;
        boolean z9;
        List list3;
        C4305a c4305a;
        C4305a c4305a2;
        boolean z10;
        ArrayDeque arrayDeque;
        C4305a c4305aM1566i;
        List<C4305a> list4;
        C4305a c4305a3;
        C4305a c4305a4;
        Iterator it;
        List list5;
        boolean z11;
        boolean z12;
        C4320p c4320p;
        EnumC3400k enumC3400k;
        C0072c c0072c;
        int i9;
        int i10;
        List listMo6238d;
        List list6;
        C4320p c4320pM57c0;
        if (c4322r.f14415p || c4322r.f14425z.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c4322r.f14425z.iterator();
        while (it2.hasNext()) {
            m1560k(linkedHashSet, (C4305a) it2.next(), c4322r);
        }
        m1563n(linkedHashSet, c4322r);
        m1559j(c4322r);
        List list7 = c4322r.f14425z;
        Iterator it3 = list7.iterator();
        boolean z13 = false;
        while (true) {
            boolean zHasNext = it3.hasNext();
            c2825b = C2825b.f9178E;
            if (!zHasNext) {
                break;
            }
            C4305a c4305a5 = (C4305a) it3.next();
            if (!c4305a5.f9217g.mo6235a(EnumC2824a.f9155k)) {
                if (c4305a5.f9217g.mo6235a(EnumC2824a.f9157l)) {
                }
            }
            List list8 = c4305a5.f14352m;
            if (list8.size() > 1 && ((c4320pM57c0 = AbstractC0000a.m57c0(c4305a5)) == null || c4320pM57c0.f14396k != EnumC3400k.f10992v)) {
                C4320p c4320pM43W = AbstractC0000a.m43W(c4305a5);
                if (c4320pM43W == null || !c4320pM43W.f9217g.mo6236b(c2825b)) {
                    final int i11 = 0;
                    while (true) {
                        Iterator it4 = list8.iterator();
                        C4320p c4320p2 = null;
                        while (it4.hasNext()) {
                            ArrayList arrayList = ((C4305a) it4.next()).f14351l;
                            int size = arrayList.size();
                            C4320p c4320p3 = size <= i11 ? null : (C4320p) arrayList.get((size - i11) - 1);
                            if (c4320p3 == null) {
                                break;
                            }
                            if (c4320p2 == null) {
                                c4320p2 = c4320p3;
                            } else if (c4320p2 != c4320p3) {
                                if (!c4320p2.mo7168Y(c4320p3) || !m1565p(c4320p2.f14397l, c4320p3.f14397l)) {
                                    break;
                                }
                                int size2 = c4320p2.f14398m.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (!m1565p(c4320p2.mo7179S(i12), c4320p3.mo7179S(i12))) {
                                        break;
                                    }
                                }
                                if (c4320p2.m8680N()) {
                                    break;
                                }
                            } else if (c4320p2.m8680N()) {
                            }
                        }
                        i11++;
                    }
                    if (i11 > 0) {
                        ArrayList arrayList2 = ((C4305a) list8.get(0)).f14351l;
                        int size3 = arrayList2.size();
                        List listSubList = arrayList2.subList(size3 - i11, size3);
                        ArrayList arrayList3 = c4305a5.f14351l;
                        ArrayList arrayList4 = new ArrayList(arrayList3.size() + listSubList.size());
                        arrayList4.addAll(listSubList);
                        arrayList4.addAll(arrayList3);
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        list8.forEach(new Consumer() { // from class: ce.h
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ArrayList arrayList5 = ((C4305a) obj).f14351l;
                                int size4 = arrayList5.size();
                                arrayList5.subList(size4 - i11, size4).clear();
                            }
                        });
                        c4322r.m6380I("Move duplicate insns, count: " + i11 + " to block " + String.valueOf(c4305a5));
                        z13 = true;
                    }
                }
            }
        }
        int i13 = AbstractC0554g.f1738a;
        int i14 = 10;
        if (c4322r.f14405E.isEmpty()) {
            list = list7;
            z12 = false;
            z11 = z13;
        } else {
            c4322r.f14425z.forEach(new C0074e(i14));
            AbstractC1089i.m2779n(c4322r);
            Iterator it5 = c4322r.f14425z.iterator();
            while (true) {
                boolean zHasNext2 = it5.hasNext();
                C2825b c2825b2 = C2825b.f9179F;
                if (zHasNext2) {
                    for (C4320p c4320p4 : ((C4305a) it5.next()).f14351l) {
                        if (c4320p4.f9217g.mo6236b(c2825b2)) {
                            int iOrdinal = c4320p4.f14396k.ordinal();
                            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 4 && iOrdinal != 6 && iOrdinal != 36 && iOrdinal != 9 && iOrdinal != 10) {
                                switch (iOrdinal) {
                                }
                            }
                            c4320p4.m6228E(c2825b2);
                        }
                    }
                } else {
                    for (C4305a c4305a6 : c4322r.f14425z) {
                        Iterator it6 = c4305a6.f14351l.iterator();
                        C0071b c0071b = null;
                        while (true) {
                            if (it6.hasNext()) {
                                C0071b c0071b2 = (C0071b) ((C4320p) it6.next()).f9217g.mo6237c(c2825b2);
                                if (c0071b2 != null) {
                                    if (c0071b == null) {
                                        c0071b = c0071b2;
                                    } else if (!c0071b.equals(c0071b2)) {
                                        c0071b = null;
                                    }
                                }
                            }
                        }
                        if (c0071b != null) {
                            c4305a6.m6233y(c0071b);
                            for (C4320p c4320p5 : c4305a6.f14351l) {
                                C2829f c2829f = c4320p5.f9217g;
                                EnumC2824a enumC2824a = EnumC2824a.f9151i;
                                if (c2829f.mo6235a(enumC2824a)) {
                                    c4305a6.m6231w(enumC2824a);
                                }
                                C2829f c2829f2 = c4320p5.f9217g;
                                EnumC2824a enumC2824a2 = EnumC2824a.f9153j;
                                if (c2829f2.mo6235a(enumC2824a2)) {
                                    c4305a6.m6231w(enumC2824a2);
                                }
                            }
                        }
                    }
                    List list9 = c4322r.f14425z;
                    int size4 = list9.size();
                    int i15 = 0;
                    while (true) {
                        EnumC3400k enumC3400k2 = EnumC3400k.f10989s;
                        EnumC2824a enumC2824a3 = EnumC2824a.f9159m;
                        if (i15 < size4) {
                            C4305a c4305a7 = (C4305a) list9.get(i15);
                            C4320p c4320pM43W2 = AbstractC0000a.m43W(c4305a7);
                            if (c4320pM43W2 != null && (c0072c = (C0072c) c4320pM43W2.f9217g.mo6237c(c2825b)) != null) {
                                C0075f c0075f = c0072c.f229g;
                                ArrayList arrayList5 = c0075f.f235d;
                                c4320pM43W2.m6228E(c2825b);
                                C2829f c2829f3 = c4305a7.f9217g;
                                C2825b c2825b3 = C2825b.f9176C;
                                C2977i0 c2977i0 = (C2977i0) c2829f3.mo6237c(c2825b3);
                                if (c2977i0 != null) {
                                    C0560m.m1573p(c2977i0.f9739g, c4305a7);
                                    c4305a7.m6228E(c2825b3);
                                }
                                if (c4305a7.f14352m.isEmpty()) {
                                    c0075f.f234c = c4305a7;
                                    c4305a7.m6233y(c0072c);
                                    arrayList5.add(c4305a7);
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    AbstractC0000a.m102z(c4305a7, c4305a7, linkedHashSet2, AbstractC0000a.m6D0(c4322r), true);
                                    linkedHashSet2.forEach(new C0076g(c0075f, 7));
                                } else {
                                    C4305a c4305aM1576s = C0560m.m1576s(c4322r, c4305a7.f14350k);
                                    c4305aM1576s.m6231w(enumC2824a3);
                                    c4305aM1576s.m6233y(c0072c);
                                    C0560m.m1567j(c4305aM1576s, c4305a7);
                                    c0075f.f234c = c4305aM1576s;
                                    arrayList5.add(c4305aM1576s);
                                }
                                AbstractC3506j abstractC3506jM443b = c0075f.m443b();
                                C4320p c4320pM57c02 = AbstractC0000a.m57c0(c4305a7);
                                if (c4320pM57c02 == null || c4320pM57c02.f14396k != enumC3400k2) {
                                    c0075f.f237f = new C3512p("unused", abstractC3506jM443b);
                                } else {
                                    C3514r c3514r = new C3514r(c4320pM57c02.f14397l.f11439l, abstractC3506jM443b);
                                    c3514r.m6225B(c4320pM57c02);
                                    c4320pM57c02.m8688d0(c3514r);
                                    c4320pM57c02.m6231w(EnumC2824a.f9164q);
                                    c3514r.m6231w(EnumC2824a.f9130P);
                                    c0075f.f237f = c3514r;
                                    c4320pM57c02.m6233y(c0072c);
                                }
                            }
                            i15++;
                        } else {
                            HashMap map = new HashMap();
                            for (C4305a c4305a8 : c4322r.f14425z) {
                                C0071b c0071b3 = (C0071b) c4305a8.f9217g.mo6237c(c2825b2);
                                if (c0071b3 != null) {
                                    Iterator it7 = c0071b3.f228g.iterator();
                                    while (it7.hasNext()) {
                                        ((List) map.computeIfAbsent((C0075f) it7.next(), new C0073d(25))).add(c4305a8);
                                    }
                                }
                            }
                            if (map.isEmpty()) {
                                c4322r.f14405E.forEach(new C0551d(c4322r, 0));
                            } else {
                                map.forEach(new C0552e(c4322r, 0));
                            }
                            C0560m.m1570m(c4322r);
                            c4322r.f14405E.removeIf(new C4306b(1));
                            if (c4322r.f14405E.isEmpty()) {
                                list = list7;
                                list2 = Collections.EMPTY_LIST;
                            } else {
                                map.forEach(new C0553f(0));
                                ArrayList<C0077h> arrayList6 = new ArrayList();
                                map.forEach(new C0552e(arrayList6, 1));
                                int i16 = 24;
                                if (arrayList6.size() > 1) {
                                    while (true) {
                                        Iterator it8 = arrayList6.iterator();
                                        while (it8.hasNext()) {
                                            C0077h c0077h = (C0077h) it8.next();
                                            for (C0077h c0077h2 : arrayList6) {
                                                if (c0077h != c0077h2 && c0077h2.f246j == null) {
                                                    List list10 = c0077h.f245i;
                                                    List list11 = c0077h.f244h;
                                                    List list12 = c0077h2.f245i;
                                                    List list13 = c0077h2.f244h;
                                                    if (list10.equals(list12)) {
                                                        arrayList6.add(new C0077h(arrayList6.size(), AbstractC0063p.m422o(list11, list13), c0077h.f245i));
                                                        arrayList6.remove(c0077h);
                                                        arrayList6.remove(c0077h2);
                                                        list3 = list7;
                                                    } else {
                                                        Set set = (Set) list13.stream().flatMap(new C0073d(i16)).collect(Collectors.toSet());
                                                        list3 = list7;
                                                        boolean zAnyMatch = set.stream().anyMatch(new C0285i(c0077h, 6));
                                                        Iterator it9 = it8;
                                                        boolean zAnyMatch2 = c0077h2.f245i.stream().anyMatch(new C0285i(c0077h, 6));
                                                        boolean zAnyMatch3 = c0077h.f245i.stream().anyMatch(new C0298p(set, 1));
                                                        if (zAnyMatch && (zAnyMatch2 || zAnyMatch3)) {
                                                            List listM422o = AbstractC0063p.m422o(c0077h.f245i, c0077h2.f245i);
                                                            list13.removeAll(list11);
                                                            c0077h2.f246j = c0077h;
                                                            if (c0077h.f247k.isEmpty()) {
                                                                c0077h.f247k = new ArrayList();
                                                            }
                                                            c0077h.f247k.add(c0077h2);
                                                            c0077h.f245i = listM422o;
                                                        } else if (new HashSet(list13).containsAll(list11)) {
                                                            arrayList6.add(new C0077h(arrayList6.size(), AbstractC0063p.m422o(list11, list13), AbstractC0063p.m422o(c0077h.f245i, c0077h2.f245i)));
                                                            arrayList6.remove(c0077h);
                                                            arrayList6.remove(c0077h2);
                                                        }
                                                        list7 = list3;
                                                        it8 = it9;
                                                        i16 = 24;
                                                    }
                                                    list7 = list3;
                                                    i16 = 24;
                                                }
                                            }
                                        }
                                    }
                                }
                                list = list7;
                                Iterator it10 = arrayList6.iterator();
                                boolean z14 = false;
                                while (it10.hasNext()) {
                                    List list14 = ((C0077h) it10.next()).f244h;
                                    if (list14.size() < 2) {
                                        z9 = false;
                                    } else {
                                        Iterator it11 = list14.iterator();
                                        while (true) {
                                            if (it11.hasNext()) {
                                                C0075f c0075f2 = (C0075f) it11.next();
                                                if (c0075f2.f235d.size() == 1) {
                                                    C4305a c4305a9 = c0075f2.f234c;
                                                    if (c4305a9.f14351l.size() != 1 || !AbstractC0000a.m94v(c4305a9, enumC3400k2)) {
                                                    }
                                                }
                                            } else {
                                                List listM1131K = AbstractC0283h.m1131K(list14, new C0073d(26));
                                                List list15 = (List) listM1131K.stream().flatMap(new C0073d(22)).distinct().collect(Collectors.toList());
                                                if (list15.size() == 1) {
                                                    List list16 = ((C4305a) list15.get(0)).f14352m;
                                                    if ((list16.size() != listM1131K.size() ? false : list16.containsAll(listM1131K)) && ((List) list14.stream().map(new C0073d(23)).distinct().collect(Collectors.toList())).size() == 1) {
                                                        list14.removeIf(new C0548a((C0075f) list14.get(0), c4322r));
                                                        z9 = true;
                                                    }
                                                }
                                            }
                                        }
                                        z9 = false;
                                    }
                                    if (z9) {
                                        z14 = true;
                                    }
                                }
                                if (z14) {
                                    C0560m.m1570m(c4322r);
                                    c4322r.f14405E.removeIf(new C4306b(1));
                                }
                                arrayList6.forEach(new C0074e(11));
                                arrayList6.removeIf(new C0019b(24));
                                c4322r.f14405E.removeIf(new C4306b(1));
                                C0560m.m1570m(c4322r);
                                final Comparator comparator = c4322r.f14411l.f14371k.f14441g.f11519c.f11480c;
                                for (final C0077h c0077h3 : arrayList6) {
                                    Iterator it12 = c0077h3.f244h.iterator();
                                    while (it12.hasNext()) {
                                        ((C0075f) it12.next()).f232a.sort(new C0549b(comparator, 0));
                                    }
                                    c0077h3.f244h.sort(new Comparator() { // from class: ce.c
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            C0075f c0075f3 = (C0075f) obj;
                                            C0075f c0075f4 = (C0075f) obj2;
                                            if (c0075f3.equals(c0075f4)) {
                                                C0086a.m452k("Same handlers in try block: ".concat(String.valueOf(c0077h3)));
                                                return 0;
                                            }
                                            if (c0075f3.m444c()) {
                                                return 1;
                                            }
                                            if (c0075f4.m444c()) {
                                                return -1;
                                            }
                                            C3128a c3128a = (C3128a) c0075f3.f232a.get(0);
                                            C3128a c3128a2 = (C3128a) c0075f4.f232a.get(0);
                                            int iCompare = comparator.compare(c3128a.f10138g, c3128a2.f10138g);
                                            return iCompare == -2 ? c3128a.compareTo(c3128a2) : iCompare;
                                        }
                                    });
                                }
                                list2 = arrayList6;
                            }
                            if (!list2.isEmpty()) {
                                int i17 = 3;
                                int size5 = list2.size() * 3;
                                ArrayDeque arrayDeque2 = new ArrayDeque(list2);
                                int i18 = 0;
                                while (!arrayDeque2.isEmpty()) {
                                    C0077h c0077h4 = (C0077h) arrayDeque2.removeFirst();
                                    List<C4305a> list17 = c0077h4.f245i;
                                    List list18 = c0077h4.f244h;
                                    if (list17.size() == 1) {
                                        c4305a = (C4305a) list17.get(0);
                                    } else {
                                        Iterator it13 = list17.iterator();
                                        while (true) {
                                            if (it13.hasNext()) {
                                                c4305a = (C4305a) it13.next();
                                                for (C4305a c4305a10 : list17) {
                                                    if (c4305a == c4305a10 || AbstractC0000a.m77m0(c4305a, c4305a10)) {
                                                    }
                                                }
                                            } else {
                                                c4305a = null;
                                            }
                                        }
                                    }
                                    if (c4305a == null) {
                                        BitSet bitSetM6D0 = AbstractC0000a.m6D0(c4322r);
                                        bitSetM6D0.set(0, c4322r.f14425z.size());
                                        list17.forEach(new C5783d(2, bitSetM6D0));
                                        BitSet bitSetM6D02 = AbstractC0000a.m6D0(c4322r);
                                        bitSetM6D02.or(bitSetM6D0);
                                        AbstractC0000a.m21L(c4322r, bitSetM6D0, new C5783d(i17, bitSetM6D02));
                                        C4305a c4305aM86r = AbstractC0000a.m86r(c4322r, bitSetM6D02);
                                        if (c4305aM86r == null) {
                                            C0086a.m452k("Failed to find top block for try-catch from: ".concat(String.valueOf(list17)));
                                            return;
                                        } else if (c4305aM86r.f14353n.size() == 1) {
                                            c4305a = (C4305a) c4305aM86r.f14353n.get(0);
                                            if (!list17.contains(c4305a)) {
                                                if (c4305aM86r.f14353n.size() == 1 && !c4305aM86r.f9217g.mo6236b(c2825b2)) {
                                                    c4305aM86r = (C4305a) c4305aM86r.f14353n.get(0);
                                                }
                                                c4305a = c4305aM86r;
                                            }
                                        }
                                    } else if (c4305a.f14353n.size() == 1 && !c4305a.f9217g.mo6236b(c2825b2)) {
                                        c4305a = (C4305a) c4305a.f14353n.get(0);
                                    }
                                    if (!c4305a.f14352m.isEmpty() || c4305a == c4322r.f14402B) {
                                        C4305a c4305aM41V = AbstractC0000a.m41V(list17);
                                        if (c4305aM41V == null) {
                                            c4305aM41V = AbstractC0000a.m66g0(c4322r, list17);
                                            if (c4305aM41V == null) {
                                                c4305aM41V = null;
                                            } else {
                                                ArrayList arrayList7 = new ArrayList(c4305aM41V.f14352m);
                                                arrayList7.removeAll(list17);
                                                List list19 = (List) arrayList7.stream().filter(new C0285i(list17, 5)).collect(Collectors.toList());
                                                if (!list19.isEmpty()) {
                                                    C4305a c4305aM1566i2 = C0560m.m1566i(c4322r, c4305aM41V);
                                                    c4305aM1566i2.m6231w(enumC2824a3);
                                                    Iterator it14 = list19.iterator();
                                                    while (it14.hasNext()) {
                                                        C0560m.m1575r((C4305a) it14.next(), c4305aM1566i2, c4305aM41V);
                                                    }
                                                    c4305aM41V = c4305aM1566i2;
                                                }
                                            }
                                        }
                                        if (c4305aM41V != null) {
                                            if (c4305aM41V.f9217g.mo6235a(EnumC2824a.f9161n)) {
                                                C4305a c4305aM1566i3 = C0560m.m1566i(c4322r, c4305aM41V);
                                                c4305aM1566i3.m6231w(enumC2824a3);
                                                C4305a c4305a11 = c4305aM41V;
                                                c4305aM41V = c4305aM1566i3;
                                                c4305a2 = c4305a11;
                                            } else {
                                                c4305a2 = null;
                                            }
                                            C4305a c4305a12 = c4322r.f14402B;
                                            EnumC2824a enumC2824a4 = EnumC2824a.f9115A;
                                            if (c4305a == c4305a12) {
                                                c4305aM1566i = C0560m.m1566i(c4322r, (C4305a) c4305a12.f14353n.get(0));
                                                z10 = z13;
                                                arrayDeque = arrayDeque2;
                                            } else {
                                                C4305a c4305aM39U = AbstractC0000a.m39U(c4305a.f14352m, enumC2824a4);
                                                if (c4305aM39U != null) {
                                                    z10 = z13;
                                                    arrayDeque = arrayDeque2;
                                                } else {
                                                    z10 = z13;
                                                    if (c4305a.f14354o.size() == 1 && c4305a.f14351l.isEmpty() && (c4305aM39U = AbstractC0000a.m39U(c4305a.f14354o, enumC2824a4)) != null) {
                                                        arrayDeque = arrayDeque2;
                                                        if (c4305aM39U.f14352m.size() == 1) {
                                                        }
                                                    } else {
                                                        arrayDeque = arrayDeque2;
                                                    }
                                                    c4305aM1566i = C0560m.m1566i(c4322r, c4305a);
                                                }
                                                c4305aM1566i = c4305aM39U;
                                            }
                                            c4305aM1566i.m6231w(enumC2824a4);
                                            c4305aM1566i.m6231w(enumC2824a3);
                                            int iSum = list18.stream().mapToInt(new C0070a(2)).sum();
                                            if (c4305aM41V == null || iSum == 0) {
                                                list4 = list17;
                                                c4305a3 = null;
                                            } else {
                                                List list20 = c4305aM41V.f14353n;
                                                EnumC2824a enumC2824a5 = EnumC2824a.f9116B;
                                                C4305a c4305aM39U2 = AbstractC0000a.m39U(list20, enumC2824a5);
                                                if (c4305aM39U2 == null) {
                                                    c4305aM39U2 = C0560m.m1576s(c4322r, -1);
                                                }
                                                c4305aM39U2.m6231w(enumC2824a5);
                                                c4305aM39U2.m6231w(enumC2824a3);
                                                C0560m.m1567j(c4305aM41V, c4305aM39U2);
                                                if (c4305a2 != null) {
                                                    List list21 = c4305aM41V.f14352m;
                                                    C6141c c6141c = new C6141c(c4322r);
                                                    c4305a4 = c4305aM39U2;
                                                    list21.forEach(new C0076g(c6141c, 6));
                                                    Iterator it15 = list18.iterator();
                                                    while (it15.hasNext()) {
                                                        C0075f c0075f3 = (C0075f) it15.next();
                                                        Iterator it16 = c0075f3.f235d.iterator();
                                                        while (true) {
                                                            if (!it16.hasNext()) {
                                                                it = it15;
                                                                list5 = list17;
                                                            } else if (c6141c.m10908b((C4305a) it16.next())) {
                                                                ArrayList arrayList8 = c0075f3.f235d;
                                                                C4322r c4322r2 = c6141c.f24737g;
                                                                C6141c c6141c2 = new C6141c(c4322r2);
                                                                it = it15;
                                                                list5 = list17;
                                                                arrayList8.forEach(new C0076g(c6141c2, 6));
                                                                BitSet bitSet = new BitSet(c4322r2.f14425z.size());
                                                                bitSet.or(c6141c.f24738h);
                                                                bitSet.and(c6141c2.f24738h);
                                                                C4305a c4305a13 = bitSet.cardinality() == 1 ? (C4305a) c4322r2.f14425z.get(bitSet.nextSetBit(0)) : null;
                                                                if (c4305a13 != null) {
                                                                    C0560m.m1575r(c4305a13, c4305aM41V, c4305a2);
                                                                }
                                                            }
                                                        }
                                                        it15 = it;
                                                        list17 = list5;
                                                    }
                                                } else {
                                                    c4305a4 = c4305aM39U2;
                                                }
                                                list4 = list17;
                                                c4305a3 = c4305a4;
                                            }
                                            AbstractC0554g.m1557a(c0077h4, c4305aM1566i, c4305a3);
                                            for (C4305a c4305a14 : list4) {
                                                C0077h c0077h5 = (C0077h) c4305a14.f9217g.mo6237c(C2825b.f9177D);
                                                if (c0077h5 == null || c0077h5.f247k.contains(c0077h4)) {
                                                    c4305a14.m6233y(c0077h4);
                                                }
                                            }
                                            c0077h4.f249m = c4305aM1566i;
                                            c4305aM1566i.m8642H();
                                            if (c4305a3 != null) {
                                                c4305a3.m8642H();
                                            }
                                        }
                                    } else {
                                        arrayDeque2.addLast(c0077h4);
                                        z10 = z13;
                                        arrayDeque = arrayDeque2;
                                    }
                                    int i19 = i18 + 1;
                                    if (i18 > size5) {
                                        C0086a.m452k("Try blocks wrapping queue limit reached! Please report as an issue!");
                                        return;
                                    }
                                    i18 = i19;
                                    z13 = z10;
                                    arrayDeque2 = arrayDeque;
                                    i17 = 3;
                                }
                            }
                            z11 = z13;
                            list2.forEach(new C2827d(c4322r.m6226C(), 0));
                            c4322r.f14425z.forEach(new C0074e(10));
                            Iterator it17 = c4322r.f14405E.iterator();
                            while (it17.hasNext()) {
                                for (C4305a c4305a15 : ((C0075f) it17.next()).f235d) {
                                    ArrayList arrayList9 = new ArrayList();
                                    ArrayList arrayList10 = c4305a15 != null ? c4305a15.f14351l : null;
                                    Iterator it18 = c4305a15.f14351l.iterator();
                                    while (it18.hasNext() && (enumC3400k = (c4320p = (C4320p) it18.next()).f14396k) != EnumC3400k.f10995y) {
                                        if (enumC3400k == EnumC3400k.f10996z) {
                                            arrayList9.add(c4320p);
                                            C5791l.m10478j(c4322r, c4320p);
                                        }
                                    }
                                    if (!arrayList9.isEmpty()) {
                                        if (arrayList10 == null) {
                                            Iterator it19 = arrayList9.iterator();
                                            while (it19.hasNext()) {
                                                C5791l.m10472d(c4322r, (C4320p) it19.next());
                                            }
                                        } else {
                                            C5791l.m10479k(c4322r, arrayList9);
                                            C5791l.m10473e(arrayList10, arrayList9);
                                        }
                                        arrayList9.clear();
                                    }
                                }
                            }
                            m1564o(c4322r);
                            C6141c c6141c3 = new C6141c(c4322r);
                            AbstractC0000a.m61d1(c4322r, c4322r.f14402B, new C0073d(28), new C0076g(c6141c3, 6));
                            for (C0075f c0075f4 : c4322r.f14405E) {
                                C4305a c4305a16 = c0075f4.f234c;
                                if (c4305a16 != null && !c6141c3.f24738h.get(c4305a16.f14349j)) {
                                    Iterator it20 = list2.iterator();
                                    while (true) {
                                        if (it20.hasNext()) {
                                            if (((C0077h) it20.next()).f244h.contains(c0075f4)) {
                                                break;
                                            }
                                        } else {
                                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                            m1560k(linkedHashSet3, c4305a16, c4322r);
                                            m1563n(linkedHashSet3, c4322r);
                                        }
                                    }
                                }
                            }
                            z12 = true;
                        }
                    }
                }
            }
        }
        boolean z15 = z12 ? true : z11;
        Iterator it21 = list.iterator();
        boolean z16 = z15;
        while (it21.hasNext()) {
            if (C0560m.m1574q((C4305a) it21.next())) {
                z16 = true;
            }
        }
        EnumSet enumSet = C0560m.f1749g;
        if (c4322r.f14425z.removeIf(new C0019b(28))) {
            z16 = true;
        }
        if (z16) {
            m1558i(c4322r);
            m1559j(c4322r);
        }
        try {
            EnumC0563p[] enumC0563pArr = new EnumC0563p[c4322r.f14425z.size()];
            Arrays.fill(enumC0563pArr, EnumC0563p.f1754g);
            AbstractC1184v0.m3199i(c4322r, enumC0563pArr, c4322r.f14402B);
            listMo6238d = c4322r.f9217g.mo6238d(C2825b.f9175B);
            i9 = 0;
            list6 = (List) listMo6238d.stream().filter(new C0561n(i9)).collect(Collectors.toList());
        } catch (Exception e6) {
            i9 = 0;
            c4322r.m6384M("Failed to detect multi-entry loops", e6);
        }
        if (list6.isEmpty()) {
            i10 = i9;
        } else {
            try {
                List listM1184v = AbstractC0283h.m1184v(listMo6238d, new C0561n(1));
                Iterator it22 = list6.iterator();
                i10 = 0;
                while (it22.hasNext()) {
                    i10 |= AbstractC1184v0.m3206p(c4322r, (C2975h0) it22.next(), listM1184v) ? 1 : 0;
                }
            } catch (Exception e7) {
                c4322r.m6384M("Failed to fix multi-entry loops", e7);
                i10 = i9;
            }
        }
        if (i10 != 0) {
            m1559j(c4322r);
        }
        c4322r.f14425z.forEach(new C0074e(10));
        int size6 = c4322r.f14425z.size();
        int iMax = Math.max(100, size6);
        int i20 = i9;
        while (true) {
            if (m1562m(c4322r)) {
                m1559j(c4322r);
                int i21 = i20 + 1;
                if (i20 > iMax) {
                    c4322r.m6382K("CFG modification limit reached, blocks count: " + size6);
                } else {
                    i20 = i21;
                }
            }
        }
        m1558i(c4322r);
        AbstractC1089i.m2779n(c4322r);
        c4322r.f14406F = new ArrayList();
        c4322r.f14425z.forEach(new C0551d(c4322r, 2));
        if (c4322r.f14406F.size() != 0) {
            for (C2988t c2988t : c4322r.f14406F) {
                for (C2988t c2988t2 : c4322r.f14406F) {
                    if (c2988t != c2988t2 && c2988t.f9757c.containsAll(c2988t2.f9757c)) {
                        C2988t c2988t3 = c2988t2.f9759e;
                        if (c2988t3 == null) {
                            c2988t2.f9759e = c2988t;
                        } else if (c2988t3.f9757c.containsAll(c2988t.f9757c)) {
                            c2988t.f9759e = c2988t3;
                            c2988t2.f9759e = c2988t;
                        } else {
                            c2988t3.f9759e = c2988t;
                        }
                    }
                }
            }
        }
        AbstractC1341a.m3593i(c4322r);
        c4322r.f14425z.forEach(new C0074e(10));
    }
}
