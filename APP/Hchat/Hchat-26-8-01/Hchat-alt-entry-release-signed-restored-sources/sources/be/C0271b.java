package be;

import ae.C0070a;
import ae.C0071b;
import ae.C0072c;
import ae.C0073d;
import ae.C0074e;
import ae.C0076g;
import com.alibaba.fastjson2.writer.C0640b;
import gd.AbstractC1400c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ke.C2404m;
import md.C2825b;
import md.C2829f;
import md.C2831h;
import md.EnumC2824a;
import me.C2833a;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import ne.C2997c;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p007a7.C0019b;
import p012ah.C0086a;
import p014b.C0126e;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p038ce.C0561n;
import p066ed.C0909b;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p083fe.C1214a;
import p136j8.C2095f;
import p141jf.C2128d;
import p157kd.AbstractC2390d;
import p171lf.C2560b;
import p199nd.AbstractC2963b0;
import p199nd.C2965c0;
import p199nd.C2967d0;
import p199nd.C2969e0;
import p199nd.C2971f0;
import p199nd.C2973g0;
import p199nd.C2976i;
import p199nd.C2978j;
import p199nd.C2979k;
import p199nd.C2982n;
import p199nd.C2985q;
import p199nd.C2987s;
import p199nd.C2990v;
import p199nd.C2991w;
import p199nd.C2992x;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3129b;
import p215od.C3130c;
import p215od.C3131d;
import p216oe.C3133a;
import p216oe.C3134b;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p232pc.C3382d;
import p232pc.C3389k;
import p233pd.AbstractC3391b;
import p233pd.C3390a;
import p233pd.C3393d;
import p233pd.C3399j;
import p233pd.C3401l;
import p233pd.C3403n;
import p233pd.C3406q;
import p233pd.C3408s;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3499c;
import p246qd.C3503g;
import p246qd.C3504h;
import p246qd.C3507k;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p246qd.EnumC3513q;
import p247qe.C3528k;
import p247qe.EnumC3529l;
import p281t3.AbstractC4106c;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4316l;
import p302ud.InterfaceC4317m;
import p302ud.InterfaceC4318n;
import p318vd.C4548a;
import p332wb.AbstractC4855en;
import p350xd.C5775b;
import p350xd.C5776c;
import p350xd.C5777d;
import p351xe.AbstractC5780a;
import p351xe.AbstractC5790k;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5786g;
import p351xe.C5787h;
import p351xe.C5791l;
import p351xe.C5796q;
import p369yd.C6028b;
import pe.C3410a;
import pe.C3411b;
import td.C4145a;
import td.C4146b;
import ye.AbstractC6030a;

/* JADX INFO: renamed from: be.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0271b extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f798g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [dd.a.a():java.util.ArrayList, ud.u.<init>(bc.k):void] */
    public /* synthetic */ C0271b(int i9) {
        this.f798g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1065A(ArrayList arrayList) {
        boolean z9;
        boolean zEquals;
        Set set = (Set) ((Map) arrayList.stream().collect(Collectors.toMap(new C0073d(10), new C0073d(11), new C0297o()))).entrySet().stream().filter(new C0019b(10)).map(new C0073d(12)).collect(Collectors.toSet());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0300r c0300r = (C0300r) it.next();
            if (c0300r.f868c) {
                C3399j c3399j = c0300r.f867b;
                AbstractC3508l abstractC3508lMo7179S = c3399j.mo7179S(0);
                abstractC3508lMo7179S.getClass();
                if (abstractC3508lMo7179S instanceof C3509m) {
                    if (!((C3509m) abstractC3508lMo7179S).f11421l.m8680N()) {
                        if (!c3399j.f9217g.mo6236b(C2825b.f9179F)) {
                            HashSet hashSet = new HashSet();
                            c3399j.mo8340U(hashSet);
                            if (!hashSet.isEmpty()) {
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    if (!((C3514r) it2.next()).m7380N()) {
                                    }
                                }
                            }
                        }
                    }
                } else if ((abstractC3508lMo7179S instanceof C3510n) || abstractC3508lMo7179S.m7380N()) {
                }
            }
            set.add(c0300r.f866a.f14390l);
        }
        if (!set.isEmpty()) {
            do {
                Iterator it3 = arrayList.iterator();
                z9 = false;
                while (it3.hasNext()) {
                    C0300r c0300r2 = (C0300r) it3.next();
                    C3130c c3130c = c0300r2.f866a.f14390l;
                    if (!set.contains(c3130c)) {
                        if (set.isEmpty()) {
                            zEquals = false;
                        } else {
                            C3399j c3399j2 = c0300r2.f867b;
                            zEquals = Objects.equals((Boolean) c3399j2.m8691g0(new C0293m(c3399j2.f14396k == EnumC3400k.f10962N ? EnumC3400k.f10961M : EnumC3400k.f10959K, 0, set)), Boolean.TRUE);
                        }
                        if (zEquals) {
                            set.add(c3130c);
                            z9 = true;
                        }
                    }
                }
            } while (z9);
        }
        if (set.isEmpty()) {
            return;
        }
        arrayList.removeIf(new C0298p(set, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m1066B(final C4309e c4309e, ArrayList arrayList) {
        List<C4311g> listM10509c = AbstractC5798s.m10509c(arrayList, new C0073d(9));
        final HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C0300r c0300r = (C0300r) it.next();
            C3399j c3399j = c0300r.f867b;
            final EnumC3400k enumC3400k = c3399j.f14396k == EnumC3400k.f10962N ? EnumC3400k.f10961M : EnumC3400k.f10959K;
            c3399j.mo8342h0(new Consumer() { // from class: be.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C4311g c4311gM8665l0;
                    C4320p c4320p = (C4320p) obj;
                    if (c4320p.f14396k == enumC3400k) {
                        C3130c c3130c = (C3130c) ((C3399j) c4320p).f10948o;
                        C3128a c3128a = c3130c.f10146g;
                        C4309e c4309e2 = c4309e;
                        if (!c3128a.equals(c4309e2.f14373m) || (c4311gM8665l0 = c4309e2.m8665l0(c3130c)) == null) {
                            return;
                        }
                        ((List) map.computeIfAbsent(c0300r.f866a, new C0073d(8))).add(c4311gM8665l0);
                    }
                }
            });
        }
        if (!map.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (C4311g c4311g : listM10509c) {
                int iIndexOf = arrayList2.indexOf(c4311g);
                List<C4311g> list = (List) map.get(c4311g);
                if (list == null) {
                    if (iIndexOf == -1) {
                        arrayList2.add(c4311g);
                    }
                } else if (iIndexOf == -1) {
                    for (C4311g c4311g2 : list) {
                        if (!arrayList2.contains(c4311g2)) {
                            arrayList2.add(c4311g2);
                        }
                    }
                    arrayList2.add(c4311g);
                } else {
                    for (C4311g c4311g3 : list) {
                        int iIndexOf2 = arrayList2.indexOf(c4311g3);
                        if (iIndexOf2 == -1) {
                            arrayList2.add(iIndexOf, c4311g3);
                        } else if (iIndexOf2 > iIndexOf) {
                            arrayList2.remove(iIndexOf2);
                            arrayList2.add(iIndexOf, c4311g3);
                        }
                    }
                }
            }
            listM10509c = arrayList2;
        }
        List list2 = c4309e.f14381u;
        if (Collections.indexOfSubList(list2, listM10509c) != -1) {
            return;
        }
        list2.removeAll(listM10509c);
        list2.addAll(listM10509c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m1067C(C4322r c4322r, C4320p c4320p) {
        EnumC3400k enumC3400k = c4320p.f14396k;
        if (enumC3400k == EnumC3400k.f10963O) {
            C4322r c4322rM8718i = c4322r.f14411l.f14371k.m8718i(((C3403n) c4320p).f11005p);
            if (c4322rM8718i != null) {
                c4322rM8718i.f14411l.f14371k.f14435a.getClass();
                C0277e.m1118i(c4322rM8718i, 1);
                return true;
            }
        } else {
            if (enumC3400k == EnumC3400k.f10971W) {
                AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                abstractC3508lMo7179S.getClass();
                if (abstractC3508lMo7179S instanceof C3509m) {
                    return m1067C(c4322r, ((C3509m) abstractC3508lMo7179S).f11421l);
                }
                return false;
            }
            if (!(c4320p instanceof C3399j) || !(((C3399j) c4320p).f10948o instanceof C3130c)) {
                c4322r.m6380I("Can't inline method, not implemented redirect type for insn: ".concat(String.valueOf(c4320p)));
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1068D(C3515s c3515s) {
        ArrayList arrayList = c3515s.f11445j;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i9 = 0;
            while (true) {
                boolean zM1068D = true;
                if (!it.hasNext()) {
                    break;
                }
                C3514r c3514r = (C3514r) it.next();
                C4320p c4320p = c3514r.f11420j;
                if (c4320p != null) {
                    EnumC3400k enumC3400k = c4320p.f14396k;
                    if (enumC3400k == EnumC3400k.f10983m) {
                        zM1068D = m1068D(c4320p.f14397l.f11440m);
                    } else {
                        int iOrdinal = enumC3400k.ordinal();
                        if (iOrdinal == 16) {
                            if (c4320p.mo7179S(0) != c3514r) {
                                zM1068D = false;
                            } else {
                                c3514r.m6231w(EnumC2824a.f9165r);
                            }
                        } else if (iOrdinal != 34) {
                            if (iOrdinal != 18 && iOrdinal != 19 && iOrdinal != 21 && iOrdinal != 22 && iOrdinal != 26 && iOrdinal != 27 && iOrdinal != 30) {
                                if (iOrdinal == 31 && c4320p.mo7179S(1) == c3514r) {
                                }
                            }
                        } else if (((C3403n) c4320p).mo7171k0() != c3514r) {
                        }
                    }
                    if (zM1068D) {
                        i9++;
                    }
                }
            }
            if (i9 == arrayList.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static int m1069E(C4320p[] c4320pArr, int i9) {
        int length = c4320pArr.length;
        while (true) {
            i9++;
            if (i9 >= length) {
                return -1;
            }
            C4320p c4320p = c4320pArr[i9];
            if (c4320p != null && c4320p.f14396k != EnumC3400k.f10965Q) {
                return i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static C4320p m1070F(C3514r c3514r) {
        C4320p c4320p;
        C3515s c3515s = c3514r.f11440m;
        if (c3515s.f11445j.size() == 1 && (c4320p = ((C3514r) c3515s.f11445j.get(0)).f11420j) != null) {
            return c4320p.f14396k == EnumC3400k.f10983m ? m1070F(c4320p.f14397l) : c4320p;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static AbstractC3506j m1071G(C4322r c4322r, C2560b c2560b) {
        AbstractC3506j abstractC3506jM7362z = AbstractC3506j.m7362z(c2560b.f8305c);
        String str = c2560b.f8306d;
        if (str != null) {
            try {
                AbstractC3506j abstractC3506jM8977e = new C4548a(str).m8977e();
                c4322r.f14411l.f14371k.f14443i.getClass();
                C1214a.m3335c(c4322r, abstractC3506jM8977e);
                if (m1103u(c4322r, abstractC3506jM7362z, abstractC3506jM8977e)) {
                    return abstractC3506jM8977e;
                }
            } catch (Exception e6) {
                c4322r.m6384M("Can't parse signature for local variable: ".concat(str), e6);
                return abstractC3506jM7362z;
            }
        }
        return abstractC3506jM7362z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1072H(C3515s c3515s) {
        if (c3515s.f11448m != null) {
            return;
        }
        C3507k c3507k = new C3507k();
        C3514r c3514r = c3515s.f11444i;
        if (c3514r.f9217g.mo6235a(EnumC2824a.f9124J)) {
            c3507k.f11411a = "this";
            c3507k.f11415e = true;
        }
        if (!c3514r.f9217g.mo6235a(EnumC2824a.f9127M)) {
            if (c3514r.f9217g.mo6235a(EnumC2824a.f9130P)) {
                c3507k.f11416f = true;
            }
        }
        List listM7403g = c3515s.m7403g();
        if (listM7403g.isEmpty()) {
            c3515s.m7408m(c3507k);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c3515s);
        m1104v(listM7403g, linkedHashSet);
        if (linkedHashSet.size() > 1) {
            List list = (List) linkedHashSet.stream().map(new C0073d(13)).filter(new C0019b(11)).filter(new C0019b(12)).distinct().collect(Collectors.toList());
            int size = list.size();
            if (size == 1) {
                c3507k.f11412b = (AbstractC3506j) list.get(0);
            } else if (size > 1) {
                C0086a.m452k(AbstractC0255e.m1021j("Several immutable types in one variable: ", String.valueOf(list), ", vars: ", String.valueOf(linkedHashSet)));
                return;
            }
        }
        linkedHashSet.forEach(new C0076g(c3507k, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m1073I(C4322r c4322r) {
        C3514r c3514r = c4322r.f14422w;
        if (c3514r != null) {
            C3515s c3515sM8703b0 = c3514r.f11440m;
            if (c3515sM8703b0 == null) {
                c3515sM8703b0 = c4322r.m8703b0(c3514r);
            }
            m1072H(c3515sM8703b0);
        }
        for (C3514r c3514r2 : c4322r.m8694S()) {
            C3515s c3515sM8703b02 = c3514r2.f11440m;
            if (c3515sM8703b02 == null) {
                c3515sM8703b02 = c4322r.m8703b0(c3514r2);
            }
            m1072H(c3515sM8703b02);
        }
        Iterator it = c4322r.f14404D.iterator();
        while (it.hasNext()) {
            m1072H((C3515s) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m1074J(C4322r c4322r, C3514r c3514r, C4320p c4320p, C4305a c4305a) {
        if (c4320p.f9217g.mo6235a(EnumC2824a.f9129O)) {
            m1098o(c4322r, c3514r, c4320p, c4305a);
            return;
        }
        if (c3514r.m7388b0(c4322r, c4320p, false) != null) {
            C4320p c4320p2 = c3514r.f11420j;
            if (c4320p2 != null) {
                c4320p2.m8685V(c4320p);
            }
            C5791l.m10480l(c4322r, c4320p);
            C5791l.m10475g(c4322r, c4305a, c4320p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:0x002f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX INFO: renamed from: K */
    public static C2991w m1075K(C4322r c4322r) {
        List list = c4322r.f14425z;
        ?? arrayList = new ArrayList(2);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ArrayList arrayList2 = ((C4305a) it.next()).f14351l;
            int size = arrayList2.size();
            if (size != 0) {
                if (arrayList.size() + size > 2) {
                    arrayList = Collections.EMPTY_LIST;
                    break;
                }
                arrayList.addAll(arrayList2);
            }
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return null;
        }
        EnumC3400k enumC3400k = EnumC3400k.f10986p;
        if (size2 == 1) {
            C4320p c4320p = (C4320p) arrayList.get(0);
            if (c4320p.f14396k != enumC3400k || c4320p.f14398m.size() != 1) {
                return m1093j(c4322r, c4320p, false);
            }
            AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
            abstractC3508lMo7179S.getClass();
            if (!(abstractC3508lMo7179S instanceof C3509m)) {
                return null;
            }
            C4320p c4320pMo7167O = ((C3509m) abstractC3508lMo7179S).f11421l.mo7167O();
            c4320pMo7167O.m6227D(EnumC2824a.f9133S);
            return m1093j(c4322r, c4320pMo7167O, true);
        }
        if (size2 != 2 || ((C4320p) arrayList.get(1)).f14396k != enumC3400k) {
            return null;
        }
        C4320p c4320p2 = (C4320p) arrayList.get(0);
        C4320p c4320p3 = (C4320p) arrayList.get(1);
        if (c4320p3.f14398m.size() != 0) {
            List listM8694S = c4322r.m8694S();
            switch (c4320p2.f14396k.ordinal()) {
                case 30:
                    if (listM8694S.size() != 1 || !c4320p3.mo7179S(0).m7379M(c4320p2.f14397l) || !c4320p2.mo7179S(0).m7379M((C3514r) listM8694S.get(0))) {
                        return null;
                    }
                    break;
                case 31:
                    if (listM8694S.size() != 2 || !c4320p3.mo7179S(0).m7379M((C3514r) listM8694S.get(1)) || !c4320p2.mo7179S(0).m7379M((C3514r) listM8694S.get(1)) || !c4320p2.mo7179S(1).m7379M((C3514r) listM8694S.get(0))) {
                        return null;
                    }
                    break;
                case 32:
                    if (!listM8694S.isEmpty() || !c4320p3.mo7179S(0).m7379M(c4320p2.f14397l)) {
                        return null;
                    }
                    break;
                case 33:
                    if (listM8694S.size() != 1 || !c4320p3.mo7179S(0).m7379M((C3514r) listM8694S.get(0)) || !c4320p2.mo7179S(0).m7379M((C3514r) listM8694S.get(0))) {
                        return null;
                    }
                    break;
                case 34:
                    if (!c4320p3.mo7179S(0).m7379M(c4320p2.f14397l)) {
                        return null;
                    }
                    List listM8694S2 = c4322r.m8694S();
                    List list2 = c4320p2.f14398m;
                    if (listM8694S2 != list2) {
                        if (listM8694S2.size() != list2.size()) {
                            return null;
                        }
                        Iterator it2 = listM8694S2.iterator();
                        Iterator it3 = list2.iterator();
                        while (it2.hasNext() && it3.hasNext()) {
                            Object next = it2.next();
                            if (!((AbstractC3508l) it3.next()).m7379M((C3514r) next)) {
                                return null;
                            }
                        }
                        if (it2.hasNext() || it3.hasNext()) {
                            return null;
                        }
                    }
                    break;
                default:
                    return null;
            }
        }
        return m1093j(c4322r, c4320p2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m1076L(C4309e c4309e) {
        return c4309e.f14375o.m857i() && c4309e.f14381u.isEmpty() && c4309e.f14380t.isEmpty() && c4309e.f14382v.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m1077M(C3514r c3514r) {
        if (c3514r == null) {
            return;
        }
        c3514r.m6231w(EnumC2824a.f9124J);
        c3514r.m6231w(EnumC2824a.f9128N);
        C4320p c4320p = c3514r.f11420j;
        if (c4320p != null && c4320p.f14396k == EnumC3400k.f10983m && c4320p.mo7179S(0) == c3514r) {
            C3514r c3514r2 = c4320p.f14397l;
            if (c3514r2.f11439l == c3514r.f11439l || c3514r2.f11440m.m7405j()) {
                return;
            }
            m1078N(c3514r2);
            c4320p.m6231w(EnumC2824a.f9166s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m1078N(C3514r c3514r) {
        if (c3514r != null) {
            m1077M(c3514r);
            c3514r.f11440m.f11445j.forEach(new C0074e(24));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m1079O(C4320p[] c4320pArr, int i9, C4320p c4320p, AbstractC3506j abstractC3506j) {
        int iM1069E = m1069E(c4320pArr, i9);
        if (iM1069E == -1) {
            return;
        }
        C4320p c4320p2 = c4320pArr[iM1069E];
        if (c4320p2.f14396k != EnumC3400k.f10964P) {
            return;
        }
        C3514r c3514r = c4320p2.f14397l;
        c4320p.m8688d0(c3514r.m7392d0(c3514r.f11439l, abstractC3506j, c3514r.f11440m));
        c4320p.m6225B(c4320p2);
        c4320p.m6393H(c4320p2);
        c4320pArr[c4320p2.f14399n] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m1080P(C4322r c4322r) {
        AbstractC3508l abstractC3508lMo7374H;
        C2967d0 c2967d0;
        C4320p c4320p;
        ArrayList arrayList = new ArrayList();
        Iterator it = c4322r.f14425z.iterator();
        while (it.hasNext()) {
            ArrayList<C4320p> arrayList2 = ((C4305a) it.next()).f14351l;
            for (C4320p c4320p2 : arrayList2) {
                if (c4320p2.f14396k == EnumC3400k.f10983m) {
                    C3514r c3514r = c4320p2.f14397l;
                    AbstractC3508l abstractC3508lMo7179S = c4320p2.mo7179S(0);
                    if (!c3514r.m7396h0(abstractC3508lMo7179S)) {
                        abstractC3508lMo7179S.getClass();
                        boolean z9 = abstractC3508lMo7179S instanceof C3514r;
                        if (!z9 || (c4320p = ((C3514r) abstractC3508lMo7179S).f11440m.f11444i.f11420j) == null || c4320p.f14396k != EnumC3400k.f10972X) {
                            C3515s c3515s = c3514r.f11440m;
                            ArrayList<C3514r> arrayList3 = c3515s.f11445j;
                            if (!arrayList3.isEmpty()) {
                                if (!c3515s.m7405j()) {
                                    C2829f c2829f = abstractC3508lMo7179S.f9217g;
                                    C2825b c2825b = C2825b.f9185L;
                                    C2967d0 c2967d02 = (C2967d0) c2829f.mo6237c(c2825b);
                                    for (C3514r c3514r2 : arrayList3) {
                                        if (c3514r2.f11420j == null) {
                                            break;
                                        } else if (c2967d02 == null && (c2967d0 = (C2967d0) c3514r2.f9217g.mo6237c(c2825b)) != null) {
                                            c2967d02 = c2967d0;
                                        }
                                    }
                                    for (C3514r c3514r3 : new ArrayList(arrayList3)) {
                                        C4320p c4320p3 = c3514r3.f11420j;
                                        if (c4320p3 != null) {
                                            if (z9) {
                                                C3514r c3514r4 = (C3514r) abstractC3508lMo7179S;
                                                abstractC3508lMo7374H = c3514r4.m7392d0(c3514r4.f11439l, c3514r3.f11419i, c3514r4.f11440m);
                                            } else {
                                                abstractC3508lMo7374H = abstractC3508lMo7179S.mo7374H();
                                            }
                                            c4320p3.m8685V(c4320p2);
                                            abstractC3508lMo7374H.m6225B(c3514r3);
                                            if (c2967d02 != null) {
                                                abstractC3508lMo7374H.m6233y(c2967d02);
                                            }
                                            if (!c4320p3.mo7181b0(c3514r3, abstractC3508lMo7374H)) {
                                                c4322r.m6383L("Failed to replace arg in insn: ".concat(String.valueOf(c4320p3)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList.add(c4320p2);
                    C5791l.m10478j(c4322r, c4320p2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList2 == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C5791l.m10472d(c4322r, (C4320p) it2.next());
                    }
                } else {
                    C5791l.m10479k(c4322r, arrayList);
                    C5791l.m10473e(arrayList2, arrayList);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static C2991w m1081Q(C4322r c4322r) {
        try {
            C2991w c2991w = (C2991w) c4322r.f9217g.mo6237c(C2825b.f9199n);
            if (c2991w != null) {
                return c2991w;
            }
            if (c4322r.f9217g.mo6235a(EnumC2824a.f9143c0)) {
                if (c4322r.f14425z == null) {
                    return null;
                }
                C2991w c2991wM1075K = m1075K(c4322r);
                if (c2991wM1075K != null) {
                    return c2991wM1075K;
                }
            }
        } catch (Exception e6) {
            c4322r.m6384M("Method inline analysis failed", e6);
        }
        C2991w c2991w2 = C2991w.f9762i;
        c4322r.m6233y(c2991w2);
        return c2991w2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0256, code lost:
    
        if (r2.mo7181b0(r14, r7.mo7374H()) == false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1082R(C4322r c4322r) {
        Iterator it;
        Iterator it2;
        C3514r c3514r;
        AbstractC3508l abstractC3508lM7372Z;
        RunnableC0006d runnableC0006d;
        int size;
        Iterator it3;
        EnumC2824a enumC2824a;
        ArrayList arrayList;
        boolean z9;
        int i9;
        C4320p c4320p;
        int i10;
        InterfaceC4316l interfaceC4316lM8653X;
        ArrayList arrayList2 = new ArrayList();
        List list = c4322r.f14425z;
        C4309e c4309e = c4322r.f14411l;
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C4305a c4305a = (C4305a) it4.next();
            arrayList2.clear();
            Iterator it5 = c4305a.f14351l.iterator();
            while (it5.hasNext()) {
                C4320p c4320p2 = (C4320p) it5.next();
                C2829f c2829f = c4320p2.f9217g;
                EnumC2824a enumC2824a2 = EnumC2824a.f9164q;
                if (!c2829f.mo6235a(enumC2824a2)) {
                    C2829f c2829f2 = c4320p2.f9217g;
                    EnumC2824a enumC2824a3 = EnumC2824a.f9166s;
                    if (c2829f2.mo6235a(enumC2824a3) || (c3514r = c4320p2.f14397l) == null) {
                        it = it4;
                        it2 = it5;
                    } else {
                        C3515s c3515s = c3514r.f11440m;
                        int iOrdinal = c4320p2.f14396k.ordinal();
                        EnumC3400k enumC3400k = EnumC3400k.f10961M;
                        if (iOrdinal == 0) {
                            AbstractC3508l abstractC3508lMo7179S = c4320p2.mo7179S(0);
                            abstractC3508lMo7179S.getClass();
                            if ((abstractC3508lMo7179S instanceof C3510n) && (!abstractC3508lMo7179S.mo7384R() || !m1068D(c3515s))) {
                                abstractC3508lM7372Z = abstractC3508lMo7179S;
                                runnableC0006d = null;
                                C3515s c3515s2 = c4320p2.f14397l.f11440m;
                                size = c3515s2.f11445j.size();
                                ArrayList arrayList3 = c3515s2.f11445j;
                                if (size == 0) {
                                    it = it4;
                                    it2 = it5;
                                } else {
                                    ArrayList<C3514r> arrayList4 = new ArrayList(arrayList3);
                                    int i11 = 0;
                                    for (C3514r c3514r2 : arrayList4) {
                                        Iterator it6 = it4;
                                        if (c3514r2.f9217g.mo6235a(EnumC2824a.f9165r) || c3514r2.f9217g.mo6235a(enumC2824a2) || (c4320p = c3514r2.f11420j) == null || c4320p.f9217g.mo6235a(enumC2824a3)) {
                                            it3 = it5;
                                        } else {
                                            it3 = it5;
                                            if (c3514r2.f11440m.m7398b().f11413c.size() <= 1 || c3514r2.f11440m.m7405j()) {
                                                if (c4320p.f14396k == EnumC3400k.f10967S) {
                                                    InterfaceC4317m interfaceC4317mM3342g = c4309e.f14371k.f14442h.m3342g((C4145a) c4320p);
                                                    C4322r c4322r2 = interfaceC4317mM3342g instanceof C4322r ? (C4322r) interfaceC4317mM3342g : null;
                                                    if (c4322r2 != null) {
                                                        if (!c4322r2.f9217g.mo6235a(EnumC2824a.f9143c0)) {
                                                            if (c4322r2.f9217g.mo6235a(EnumC2824a.f9122H)) {
                                                            }
                                                            i11 = i9;
                                                        }
                                                    }
                                                }
                                                C4320p c4320p3 = c3514r2.f11420j;
                                                if (c4320p3 == null || c4320p3.f14396k == EnumC3400k.f10972X) {
                                                    enumC2824a = enumC2824a2;
                                                    arrayList = arrayList3;
                                                } else {
                                                    if (abstractC3508lM7372Z instanceof C3510n) {
                                                        arrayList = arrayList3;
                                                        long j3 = ((C3510n) abstractC3508lM7372Z).f11422l;
                                                        AbstractC3506j abstractC3506jMo7375I = c3514r2.mo7375I();
                                                        enumC2824a = enumC2824a2;
                                                        if (abstractC3506jMo7375I == AbstractC3506j.f11404u) {
                                                            abstractC3506jMo7375I = c3514r2.f11419i;
                                                        }
                                                        if (abstractC3506jMo7375I.mo7351v() && j3 != 0) {
                                                            abstractC3506jMo7375I = AbstractC3506j.f11409z;
                                                        }
                                                        C3510n c3510nM7368S = AbstractC3508l.m7368S(j3, abstractC3506jMo7375I);
                                                        c3510nM7368S.m6225B(abstractC3508lM7372Z);
                                                        if (c4320p3.mo7181b0(c3514r2, c3510nM7368S)) {
                                                            AbstractC3506j abstractC3506j = c3510nM7368S.f11419i;
                                                            if (abstractC3506j.mo7345w()) {
                                                                interfaceC4316lM8653X = c4309e.m8654Y(c3510nM7368S);
                                                                i10 = 0;
                                                            } else if (abstractC3506j.mo7349a(EnumC3513q.INT)) {
                                                                Integer numValueOf = Integer.valueOf((int) j3);
                                                                i10 = 0;
                                                                interfaceC4316lM8653X = c4309e.m8653X(numValueOf, false);
                                                            } else {
                                                                i10 = 0;
                                                                interfaceC4316lM8653X = null;
                                                            }
                                                            if (interfaceC4316lM8653X != null) {
                                                                if (c3510nM7368S.m7388b0(c4322r, new C3399j(enumC3400k, interfaceC4316lM8653X.mo6656f(), i10), true) != null) {
                                                                    C0276d0.m1113i(interfaceC4316lM8653X, c4322r);
                                                                }
                                                            } else if (c4320p3 instanceof AbstractC3391b) {
                                                                AbstractC3391b abstractC3391b = (AbstractC3391b) c4320p3;
                                                                C3131d c3131dMo7169i0 = abstractC3391b.mo7169i0();
                                                                if (abstractC3391b.mo7171k0() != c3510nM7368S) {
                                                                    z9 = true;
                                                                    AbstractC3506j abstractC3506j2 = (AbstractC3506j) c3131dMo7169i0.f10152i.get(c4320p3.m8684T(c3510nM7368S) - abstractC3391b.mo7170j0());
                                                                    abstractC3506j2.getClass();
                                                                    if (abstractC3506j2 instanceof C3503g) {
                                                                        c3510nM7368S.f11419i = abstractC3506j2;
                                                                        if (abstractC3506j2.equals(AbstractC3506j.f11387d)) {
                                                                            c3510nM7368S.m6231w(EnumC2824a.f9137W);
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!c3510nM7368S.mo7384R()) {
                                                                        C0086a.m452k("Unexpected instance arg in invoke");
                                                                        return;
                                                                    }
                                                                    AbstractC3506j abstractC3506j3 = c3131dMo7169i0.f10153j.f10138g;
                                                                    z9 = true;
                                                                    C3399j c3399j = new C3399j(EnumC3400k.f10985o, abstractC3506j3, 1);
                                                                    c3399j.mo7178I(c3510nM7368S);
                                                                    c3399j.m6231w(EnumC2824a.f9138X);
                                                                    C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c3399j);
                                                                    c3509mM7372Z.f11419i = abstractC3506j3;
                                                                    c4320p3.mo7181b0(c3510nM7368S, c3509mM7372Z);
                                                                }
                                                            }
                                                            z9 = true;
                                                        }
                                                    } else {
                                                        enumC2824a = enumC2824a2;
                                                        arrayList = arrayList3;
                                                        z9 = true;
                                                    }
                                                    c4320p3.m8685V(c4320p2);
                                                    i11++;
                                                }
                                                z9 = true;
                                                i9 = i11;
                                                i11 = i9;
                                            }
                                            it4 = it6;
                                            it5 = it3;
                                            arrayList3 = arrayList;
                                            enumC2824a2 = enumC2824a;
                                        }
                                        enumC2824a = enumC2824a2;
                                        arrayList = arrayList3;
                                        i9 = i11;
                                        z9 = true;
                                        i11 = i9;
                                        it4 = it6;
                                        it5 = it3;
                                        arrayList3 = arrayList;
                                        enumC2824a2 = enumC2824a;
                                    }
                                    it = it4;
                                    it2 = it5;
                                    ArrayList arrayList5 = arrayList3;
                                    if (i11 != arrayList4.size()) {
                                        if (arrayList5.stream().allMatch(new C0019b(2))) {
                                            c4320p2.m6231w(enumC2824a3);
                                        }
                                    }
                                }
                                arrayList2.add(c4320p2);
                                if (runnableC0006d != null) {
                                    runnableC0006d.run();
                                }
                            }
                            it = it4;
                            it2 = it5;
                        } else {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 6) {
                                    }
                                } else if (!c3515s.m7405j()) {
                                    abstractC3508lM7372Z = AbstractC3508l.m7372Z(c4320p2.mo7167O());
                                    abstractC3508lM7372Z.f11419i = AbstractC3506j.f11395l;
                                }
                                it = it4;
                                it2 = it5;
                            } else {
                                InterfaceC4316l interfaceC4316lM8653X2 = c4309e.m8653X(((C3393d) c4320p2).f10930o, true);
                                if (interfaceC4316lM8653X2 == null) {
                                    abstractC3508lM7372Z = AbstractC3508l.m7372Z(c4320p2.mo7167O());
                                } else {
                                    C3509m c3509mM7372Z2 = AbstractC3508l.m7372Z(new C3399j(enumC3400k, interfaceC4316lM8653X2.mo6656f(), 0));
                                    c3509mM7372Z2.f11419i = AbstractC3506j.f11396m;
                                    runnableC0006d = new RunnableC0006d(interfaceC4316lM8653X2, 5, c4322r);
                                    abstractC3508lM7372Z = c3509mM7372Z2;
                                    C3515s c3515s22 = c4320p2.f14397l.f11440m;
                                    size = c3515s22.f11445j.size();
                                    ArrayList arrayList32 = c3515s22.f11445j;
                                    if (size == 0) {
                                    }
                                    arrayList2.add(c4320p2);
                                    if (runnableC0006d != null) {
                                    }
                                }
                            }
                            runnableC0006d = null;
                            C3515s c3515s222 = c4320p2.f14397l.f11440m;
                            size = c3515s222.f11445j.size();
                            ArrayList arrayList322 = c3515s222.f11445j;
                            if (size == 0) {
                            }
                            arrayList2.add(c4320p2);
                            if (runnableC0006d != null) {
                            }
                        }
                    }
                }
                it4 = it;
                it5 = it2;
            }
            C5791l.m10479k(c4322r, arrayList2);
            C5791l.m10473e(c4305a.f14351l, arrayList2);
            it4 = it4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static void m1083S(C4322r c4322r, C3315t c3315t) {
        int i9;
        String strConcat;
        C4320p[] c4320pArr = c4322r.f14424y;
        Map map = (Map) c3315t.f10677h;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                try {
                    C4320p c4320p = c4320pArr[((Integer) entry.getKey()).intValue()];
                    if (c4320p != null) {
                        c4320p.f9752i = ((Integer) entry.getValue()).intValue();
                    }
                } catch (Exception e6) {
                    c4322r.m6384M("Error attach source line", e6);
                }
            }
            int iOrElse = map.values().stream().mapToInt(new C0070a(6)).min().orElse(Integer.MAX_VALUE);
            if (iOrElse < 3) {
                strConcat = AbstractC0921a.m2249l(iOrElse, "Lines numbers was adjusted: min line is ");
            } else {
                List list = (List) ((Map) map.values().stream().collect(Collectors.toMap(new C0640b(10), new C0640b(11), new C0297o()))).entrySet().stream().filter(new C0561n(3)).collect(Collectors.toList());
                strConcat = !list.isEmpty() ? "Repeating lines: ".concat(String.valueOf(list)) : null;
            }
            if (strConcat != null) {
                c4322r.m6380I("Don't trust debug lines info. ".concat(strConcat));
            } else {
                c4322r.m6231w(EnumC2824a.f9144d0);
            }
        }
        List<C2560b> list2 = (List) c3315t.f10678i;
        if (!list2.isEmpty()) {
            for (C2560b c2560b : list2) {
                int i10 = c2560b.f8303a;
                int i11 = c2560b.f8308f;
                int i12 = c2560b.f8309g;
                C2967d0 c2967d0 = new C2967d0(c2560b.f8304b, m1071G(c4322r, c2560b));
                if (i11 <= 0) {
                    C3514r c3514r = c4322r.f14422w;
                    if (c3514r != null) {
                        m1099p(c3514r, c2967d0, i10);
                    }
                    Iterator it = c4322r.m8694S().iterator();
                    while (it.hasNext()) {
                        m1099p((C3514r) it.next(), c2967d0, i10);
                    }
                    i11 = 0;
                }
                while (i11 <= i12) {
                    C4320p c4320p2 = c4320pArr[i11];
                    if (c4320p2 != null) {
                        Iterator it2 = c4320p2.f14398m.iterator();
                        int iM1099p = 0;
                        while (it2.hasNext()) {
                            iM1099p += m1099p((AbstractC3508l) it2.next(), c2967d0, i10);
                        }
                        if (iM1099p == 0) {
                            m1099p(c4320p2.f14397l, c2967d0, i10);
                        }
                    }
                    i11++;
                }
            }
            c4322r.m6233y(new C2987s(list2));
        }
        for (C4320p c4320p3 : c4320pArr) {
            if (c4320p3 != null && (i9 = c4320p3.f9752i) != 0) {
                c4322r.f9752i = i9 - 1;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static boolean m1084T(AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        if (abstractC3508l instanceof C3514r) {
            return true;
        }
        if (abstractC3508l instanceof C3509m) {
            C4320p c4320p = ((C3509m) abstractC3508l).f11421l;
            if (c4320p.f14396k == EnumC3400k.f10949A) {
                return m1084T(c4320p.mo7179S(0));
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static C4320p m1085U(C4322r c4322r, C4320p c4320p, C5791l c5791l) {
        if (c4320p == null) {
            return null;
        }
        EnumC3400k enumC3400k = c4320p.f14396k;
        if (enumC3400k == EnumC3400k.f10958J) {
            return c4320p;
        }
        if (c4320p.f9217g.mo6240f()) {
            ((ArrayList) c5791l.f23538c).add(c4320p);
        } else {
            C4320p c4320p2 = new C4320p(EnumC3400k.f10965Q, 0);
            Iterator it = c4322r.f14425z.iterator();
            while (it.hasNext() && !AbstractC0000a.m20K0(c4322r, (C4305a) it.next(), c4320p, c4320p2)) {
            }
        }
        if (enumC3400k == EnumC3400k.f10983m) {
            return m1085U(c4322r, ((C3514r) c4320p.mo7179S(0)).m7394f0(), c5791l);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static void m1086V(C4320p c4320p) {
        EnumC3400k enumC3400k = c4320p.f14396k;
        EnumC2824a enumC2824a = EnumC2824a.f9163p;
        EnumC3400k enumC3400k2 = EnumC3400k.f10980j;
        if (enumC3400k != enumC3400k2) {
            if (enumC3400k == EnumC3400k.f10966R) {
                C6028b c6028b = ((C4146b) c4320p).f13664o;
                int i9 = c6028b.f24477i;
                for (C6028b c6028b2 : c6028b.f24478j) {
                    if (c6028b2.f24477i == i9) {
                        c6028b2.m6231w(enumC2824a);
                    }
                }
            }
            for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
                abstractC3508l.getClass();
                if (abstractC3508l instanceof C3509m) {
                    m1086V(((C3509m) abstractC3508l).f11421l);
                }
            }
            return;
        }
        C3390a c3390a = (C3390a) c4320p;
        int i10 = c3390a.f10928o;
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 7) {
            for (int i11 = 0; i11 < 2; i11++) {
                AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(i11);
                abstractC3508lMo7179S.getClass();
                if (abstractC3508lMo7179S instanceof C3509m) {
                    C4320p c4320p2 = ((C3509m) abstractC3508lMo7179S).f11421l;
                    if (c4320p2.f14396k == enumC3400k2 && ((C3390a) c4320p2).f10928o == i10) {
                        c4320p2.m6231w(enumC2824a);
                    }
                    m1086V(c4320p2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static void m1087W(C4322r c4322r) {
        for (C3515s c3515s : c4322r.f14404D) {
            boolean zM7404i = c3515s.m7404i();
            C3315t c3315t = c3515s.f11447l;
            if (!zM7404i) {
                C3504h c3504h = AbstractC3506j.f11404u;
                c3315t.f10677h = c3504h;
                C3507k c3507k = c3515s.f11448m;
                if (c3507k != null) {
                    c3507k.f11412b = c3504h;
                }
            }
            ((LinkedHashSet) c3315t.f10678i).clear();
            c3515s.f11448m = null;
        }
        m1073I(c4322r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static void m1088X(C4309e c4309e) {
        Iterator it = c4309e.f14382v.iterator();
        while (it.hasNext()) {
            m1088X((C4309e) it.next());
        }
        int iOrElse = Stream.of((Object[]) new List[]{c4309e.f14380t, c4309e.f14382v, c4309e.f14381u}).flatMap(new C0073d(4)).filter(new C0019b(17)).filter(new C0019b(18)).mapToInt(new C0070a(1)).min().orElse(0);
        if (iOrElse != 0) {
            c4309e.f9752i = iOrElse - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0262 A[EDGE_INSN: B:273:0x0262->B:145:0x0262 BREAK  A[LOOP:11: B:163:0x02bc->B:277:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1089Y(C4322r c4322r) {
        Iterator it;
        Iterator it2;
        ArrayList arrayList;
        Iterator it3;
        C4320p c4320p;
        C3515s c3515s;
        C4320p c4320p2;
        EnumC3400k enumC3400k;
        EnumC3400k enumC3400k2;
        int iM10470a;
        boolean z9;
        boolean zContains;
        C3134b c3134b;
        BitSet bitSet;
        AbstractC3508l abstractC3508lMo7171k0;
        if (c4322r.f14415p) {
            return;
        }
        c4322r.m6227D(EnumC2824a.f9142b0);
        Iterator it4 = c4322r.f14425z.iterator();
        while (it4.hasNext()) {
            C4305a c4305a = (C4305a) it4.next();
            ArrayList<C4320p> arrayList2 = c4305a.f14351l;
            boolean zIsEmpty = arrayList2.isEmpty();
            EnumC2824a enumC2824a = EnumC2824a.f9133S;
            if (zIsEmpty) {
                it = it4;
            } else {
                int size = arrayList2.size();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList3.add(new C3133a((C4320p) arrayList2.get(i9), arrayList3, i9));
                }
                ArrayList<C3134b> arrayList4 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    C3133a c3133a = (C3133a) it5.next();
                    ArrayList arrayList5 = c3133a.f10163c;
                    int size2 = arrayList5.size() - 1;
                    while (size2 >= 0) {
                        C3514r c3514r = (C3514r) arrayList5.get(size2);
                        C2829f c2829f = c3514r.f9217g;
                        EnumC2824a enumC2824a2 = EnumC2824a.f9164q;
                        if (c2829f.mo6235a(enumC2824a2) || (c4320p = c3514r.f11420j) == null) {
                            it2 = it4;
                            it3 = it5;
                            arrayList = arrayList5;
                        } else {
                            C2829f c2829f2 = c4320p.f9217g;
                            EnumC2824a enumC2824a3 = EnumC2824a.f9166s;
                            if (!c2829f2.mo6235a(enumC2824a3) && (c3515s = c3514r.f11440m) != null) {
                                ArrayList arrayList6 = c3515s.f11445j;
                                if (!c3515s.f11444i.f9217g.mo6235a(enumC2824a2) && (c4320p2 = c3515s.f11444i.f11420j) != null) {
                                    it2 = it4;
                                    if (!c4320p2.f9217g.mo6235a(enumC2824a2) && !c4320p2.f9217g.mo6235a(enumC2824a)) {
                                        boolean zMo6235a = c4320p2.f9217g.mo6235a(EnumC2824a.f9129O);
                                        if (zMo6235a || !c3515s.m7405j()) {
                                            Iterator it6 = arrayList6.iterator();
                                            int i10 = 0;
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    ArrayList arrayList7 = arrayList6;
                                                    C3514r c3514r2 = (C3514r) it6.next();
                                                    it3 = it5;
                                                    C4320p c4320p3 = c3514r2.f11420j;
                                                    if (c4320p3 == null || !c4320p3.f9217g.mo6235a(enumC2824a3)) {
                                                        if (!zMo6235a) {
                                                            if (c3514r2.f9217g.mo6235a(EnumC2824a.f9165r)) {
                                                                break;
                                                            }
                                                        }
                                                        i10++;
                                                    }
                                                    it5 = it3;
                                                    arrayList6 = arrayList7;
                                                } else {
                                                    ArrayList arrayList8 = arrayList6;
                                                    it3 = it5;
                                                    if (!zMo6235a && i10 != 1) {
                                                        arrayList = arrayList5;
                                                    } else if (zMo6235a || c3515s.m7401e() == null || ((AbstractC3508l) c4320p2.m8689e0(new C2982n(c3515s.m7401e(), 1))) != null) {
                                                        enumC3400k = c4320p2.f14396k;
                                                        enumC3400k2 = EnumC3400k.f10963O;
                                                        if (enumC3400k == enumC3400k2 && (c4320p2 instanceof C3401l)) {
                                                            for (C3514r c3514r3 : c3514r.f11440m.f11445j) {
                                                                C4320p c4320p4 = c3514r3.f11420j;
                                                                if (c4320p4 == null || c4320p4.f14396k != enumC3400k2 || (abstractC3508lMo7171k0 = ((C3403n) c4320p4).mo7171k0()) == null || abstractC3508lMo7171k0 != c3514r3) {
                                                                }
                                                            }
                                                        }
                                                        iM10470a = AbstractC5790k.m10470a(arrayList2, c4320p2, 0);
                                                        if (iM10470a == -1) {
                                                            ArrayList arrayList9 = c3133a.f10162b;
                                                            int i11 = c3133a.f10165e;
                                                            if (iM10470a < i11) {
                                                                C3133a c3133a2 = (C3133a) arrayList9.get(iM10470a);
                                                                int i12 = iM10470a + 1;
                                                                if (i12 != i11) {
                                                                    if (i12 > i11) {
                                                                        C0086a.m452k(AbstractC3199a.m6837j(i12, "Invalid inline insn positions: ", " - ", i11));
                                                                        return;
                                                                    }
                                                                    if (c3133a2.f10163c.isEmpty() && AbstractC5798s.m10514h(c3133a2.f10167g)) {
                                                                        bitSet = C5786g.f23528g;
                                                                    } else {
                                                                        bitSet = new BitSet();
                                                                        c3133a2.m6671c(bitSet);
                                                                    }
                                                                    if (bitSet != C5786g.f23528g || !c3133a2.f10161a.m8686W()) {
                                                                        boolean zM6670b = c3133a2.m6670b();
                                                                        while (i12 < i11) {
                                                                            C3133a c3133a3 = (C3133a) arrayList9.get(i12);
                                                                            arrayList = arrayList5;
                                                                            if (c3133a3.m6672d() != c3133a) {
                                                                                C4320p c4320p5 = c3133a3.f10161a;
                                                                                if (zM6670b) {
                                                                                    if (C3133a.m6669e(c4320p5, bitSet)) {
                                                                                    }
                                                                                } else if (!c4320p5.m8680N() || C3133a.m6669e(c4320p5, bitSet)) {
                                                                                }
                                                                            }
                                                                            i12++;
                                                                            arrayList5 = arrayList;
                                                                        }
                                                                    }
                                                                }
                                                                arrayList = arrayList5;
                                                                c3133a.f10165e = iM10470a;
                                                                C3133a c3133a4 = (C3133a) arrayList9.get(iM10470a);
                                                                c3133a4.f10166f = c3133a;
                                                                if (c3133a.f10167g == null) {
                                                                    c3133a.f10167g = new ArrayList(c3133a.f10163c.size());
                                                                }
                                                                c3133a.f10167g.add(c3133a4);
                                                                c3134b = new C3134b(c3133a4.f10161a, c3514r);
                                                                if (c3134b != null) {
                                                                    arrayList4.add(c3134b);
                                                                }
                                                            } else {
                                                                arrayList = arrayList5;
                                                            }
                                                            c3134b = null;
                                                            if (c3134b != null) {
                                                            }
                                                        } else {
                                                            arrayList = arrayList5;
                                                            C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p2, c4322r.f14425z);
                                                            if (c4305aM35S != null && c4320p2 != c3514r.f11420j) {
                                                                C4320p c4320p6 = c3133a.f10161a;
                                                                if (AbstractC0000a.m89s0(c4305aM35S, c4305a)) {
                                                                    ArrayList arrayList10 = new ArrayList();
                                                                    C3133a.m6668a(c4320p2, arrayList10);
                                                                    BitSet bitSet2 = new BitSet();
                                                                    Iterator it7 = arrayList10.iterator();
                                                                    while (it7.hasNext()) {
                                                                        bitSet2.set(((C3514r) it7.next()).f11439l);
                                                                    }
                                                                    Iterator it8 = c4305aM35S.f14351l.iterator();
                                                                    boolean z10 = false;
                                                                    while (true) {
                                                                        if (it8.hasNext()) {
                                                                            C4320p c4320p7 = (C4320p) it8.next();
                                                                            if (z10 && (!c4320p7.m8680N() || C3133a.m6669e(c4320p7, bitSet2))) {
                                                                                break;
                                                                            } else if (c4320p7 == c4320p2) {
                                                                                z10 = true;
                                                                            }
                                                                        } else {
                                                                            HashSet hashSetM29P = AbstractC0000a.m29P(c4305aM35S, c4305a);
                                                                            hashSetM29P.remove(c4305aM35S);
                                                                            hashSetM29P.remove(c4305a);
                                                                            Iterator it9 = hashSetM29P.iterator();
                                                                            while (true) {
                                                                                if (!it9.hasNext()) {
                                                                                    for (C4320p c4320p8 : arrayList2) {
                                                                                        if (c4320p8 == c4320p6) {
                                                                                            z9 = true;
                                                                                        } else if (!c4320p8.m8680N() || C3133a.m6669e(c4320p8, bitSet2)) {
                                                                                        }
                                                                                    }
                                                                                    C0086a.m452k("Can't process instruction move : ".concat(String.valueOf(c4305aM35S)));
                                                                                    return;
                                                                                }
                                                                                C4305a c4305a2 = (C4305a) it9.next();
                                                                                if (!c4305a2.f9217g.mo6235a(enumC2824a3)) {
                                                                                    for (C4320p c4320p9 : c4305a2.f14351l) {
                                                                                        if (!c4320p9.m8680N() || C3133a.m6669e(c4320p9, bitSet2)) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else if (AbstractC0000a.m94v(c4305a2, EnumC3400k.f10996z)) {
                                                                                    C5775b c5775b = c4322r.f14407G;
                                                                                    if (c5775b == null) {
                                                                                        zContains = false;
                                                                                        if (zContains) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        InterfaceC4314j interfaceC4314jM2802z = AbstractC1089i.m2802z(c4305aM35S, c5775b);
                                                                                        if ((interfaceC4314jM2802z instanceof InterfaceC4318n) && !(interfaceC4314jM2802z instanceof InterfaceC4313i)) {
                                                                                            zContains = ((InterfaceC4318n) interfaceC4314jM2802z).mo8675u().contains(c4305a);
                                                                                        }
                                                                                        if (zContains) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    z9 = false;
                                                                    if (z9) {
                                                                    }
                                                                } else {
                                                                    z9 = false;
                                                                    if (z9) {
                                                                        if (zMo6235a) {
                                                                            m1098o(c4322r, c3514r, c4320p2, c4305aM35S);
                                                                        } else {
                                                                            m1074J(c4322r, c3514r, c4320p2, c4305aM35S);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Iterator it10 = c4322r.f14404D.iterator();
                                                        while (true) {
                                                            if (!it10.hasNext()) {
                                                                break;
                                                            }
                                                            C3515s c3515s2 = (C3515s) it10.next();
                                                            if (c3515s2 != c3515s) {
                                                                if (c3515s2.m7398b() != c3515s.m7398b() && Objects.equals(c3515s2.m7401e(), c3515s.m7401e())) {
                                                                    if (c3515s2.f11445j.size() <= arrayList8.size()) {
                                                                        arrayList = arrayList5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        enumC3400k = c4320p2.f14396k;
                                                        enumC3400k2 = EnumC3400k.f10963O;
                                                        if (enumC3400k == enumC3400k2) {
                                                            while (r1.hasNext()) {
                                                            }
                                                        }
                                                        iM10470a = AbstractC5790k.m10470a(arrayList2, c4320p2, 0);
                                                        if (iM10470a == -1) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        arrayList = arrayList5;
                                    }
                                }
                                it3 = it5;
                                arrayList = arrayList5;
                            }
                        }
                        size2--;
                        it4 = it2;
                        it5 = it3;
                        arrayList5 = arrayList;
                    }
                }
                it = it4;
                if (!arrayList4.isEmpty()) {
                    for (C3134b c3134b2 : arrayList4) {
                        m1074J(c4322r, c3134b2.f10169b, c3134b2.f10168a, c4305a);
                    }
                }
            }
            int size3 = arrayList2.size();
            for (int i13 = 0; i13 < size3; i13++) {
                C4320p c4320p10 = (C4320p) arrayList2.get(i13);
                if (c4320p10.f14396k == EnumC3400k.f10983m) {
                    AbstractC3508l abstractC3508lMo7179S = c4320p10.mo7179S(0);
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3509m) {
                        C4320p c4320p11 = ((C3509m) abstractC3508lMo7179S).f11421l;
                        C5791l.m10480l(c4322r, c4320p11);
                        c4320p11.m8688d0(c4320p10.f14397l.mo7374H());
                        c4320p11.m8685V(c4320p10);
                        c4320p11.f14399n = c4320p10.f14399n;
                        c4320p11.m6227D(enumC2824a);
                        arrayList2.set(i13, c4320p11);
                    }
                }
            }
            it4 = it;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static void m1090Z(C4322r c4322r, AbstractC3508l abstractC3508l) {
        if (abstractC3508l == null || !abstractC3508l.m7383Q()) {
            return;
        }
        AbstractC3506j abstractC3506jMo7375I = abstractC3508l.mo7375I();
        C3399j c3399j = new C3399j(EnumC3400k.f10985o, abstractC3506jMo7375I, 1);
        c3399j.mo7178I(AbstractC3508l.m7368S(0L, abstractC3506jMo7375I));
        abstractC3508l.m7388b0(c4322r, c3399j, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04ae  */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m1091a0(C4322r c4322r) {
        EnumC3400k enumC3400k;
        C4320p c4320p;
        C3515s c3515s;
        int iM10470a;
        EnumC3400k enumC3400k2;
        ArrayList arrayList;
        Iterator it;
        boolean z9;
        C4320p c4320pM7394f0;
        C4320p c4320p2;
        C0072c c0072c;
        boolean z10;
        if (c4322r.f14415p || !c4322r.f14404D.isEmpty()) {
            return;
        }
        C3410a c3410a = new C3410a();
        int size = c4322r.f14425z.size();
        int i9 = c4322r.f14416q;
        c3410a.f11021a = C3410a.m7190a(size, i9);
        c3410a.f11022b = C3410a.m7190a(size, i9);
        c3410a.f11024d = C3410a.m7190a(i9, size);
        for (C4305a c4305a : c4322r.f14425z) {
            int i10 = c4305a.f14349j;
            BitSet bitSet = c3410a.f11021a[i10];
            BitSet bitSet2 = c3410a.f11022b[i10];
            for (C4320p c4320p3 : c4305a.f14351l) {
                for (AbstractC3508l abstractC3508l : c4320p3.f14398m) {
                    abstractC3508l.getClass();
                    if (abstractC3508l instanceof C3514r) {
                        int i11 = ((C3514r) abstractC3508l).f11439l;
                        if (!bitSet2.get(i11)) {
                            bitSet.set(i11);
                        }
                    }
                }
                C3514r c3514r = c4320p3.f14397l;
                if (c3514r != null) {
                    int i12 = c3514r.f11439l;
                    bitSet2.set(i12);
                    c3410a.f11024d[i12].set(i10);
                }
            }
        }
        int size2 = c4322r.f14425z.size();
        int i13 = c4322r.f14416q;
        BitSet[] bitSetArrM7190a = C3410a.m7190a(size2, i13);
        List<C4305a> list = c4322r.f14425z;
        int size3 = list.size();
        int i14 = size3 * 10;
        int i15 = 0;
        while (true) {
            boolean z11 = false;
            for (C4305a c4305a2 : list) {
                int i16 = c4305a2.f14349j;
                BitSet bitSet3 = bitSetArrM7190a[i16];
                BitSet bitSet4 = new BitSet(i13);
                Iterator it2 = c4305a2.f14353n.iterator();
                while (it2.hasNext()) {
                    bitSet4.or(bitSetArrM7190a[((C4305a) it2.next()).f14349j]);
                }
                bitSet4.andNot(c3410a.f11022b[i16]);
                bitSet4.or(c3410a.f11021a[i16]);
                if (!bitSet3.equals(bitSet4)) {
                    bitSetArrM7190a[i16] = bitSet4;
                    z11 = true;
                }
            }
            int i17 = i15 + 1;
            if (i15 > i14) {
                C0086a.m452k(AbstractC0921a.m2249l(size3, "Live variable analysis reach iterations limit, blocks count: "));
                return;
            }
            if (z11) {
                i15 = i17;
            } else {
                c3410a.f11023c = bitSetArrM7190a;
                int i18 = c4322r.f14416q;
                for (int i19 = 0; i19 < i18; i19++) {
                    List list2 = c4322r.f14425z;
                    int size4 = list2.size();
                    BitSet bitSet5 = new BitSet(size4);
                    BitSet bitSet6 = new BitSet(size4);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    BitSet bitSet7 = c3410a.f11024d[i19];
                    for (int iNextSetBit = bitSet7.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet7.nextSetBit(iNextSetBit + 1)) {
                        bitSet6.set(iNextSetBit);
                        arrayDeque.add((C4305a) list2.get(iNextSetBit));
                    }
                    while (!arrayDeque.isEmpty()) {
                        BitSet bitSet8 = ((C4305a) arrayDeque.pop()).f14357r;
                        for (int iNextSetBit2 = bitSet8.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet8.nextSetBit(iNextSetBit2 + 1)) {
                            if (!bitSet5.get(iNextSetBit2)) {
                                BitSet[] bitSetArr = c3410a.f11023c;
                                if (iNextSetBit2 >= bitSetArr.length) {
                                    C3410a.f11020e.mo6265s(Integer.valueOf(iNextSetBit2), "LiveVarAnalysis: out of bounds block: {}, max: {}", Integer.valueOf(c3410a.f11023c.length));
                                    z10 = false;
                                } else {
                                    z10 = bitSetArr[iNextSetBit2].get(i19);
                                }
                                if (z10) {
                                    C4305a c4305a3 = (C4305a) list2.get(iNextSetBit2);
                                    c4305a3.f14351l.add(0, m1095l(c4322r, c4305a3, i19));
                                    bitSet5.set(iNextSetBit2);
                                    if (!bitSet6.get(iNextSetBit2)) {
                                        bitSet6.set(iNextSetBit2);
                                        arrayDeque.add(c4305a3);
                                    }
                                }
                            }
                        }
                    }
                }
                int i20 = c4322r.f14416q;
                C3411b c3411b = new C3411b(c4322r, c4322r.f14402B, new C3515s[i20], new int[i20]);
                C3514r c3514r2 = c4322r.f14422w;
                if (c3514r2 != null) {
                    c3411b.m7191a(c3514r2);
                }
                Iterator it3 = c4322r.m8694S().iterator();
                while (it3.hasNext()) {
                    c3411b.m7191a((C3514r) it3.next());
                }
                C2829f c2829f = c3411b.f11026b.f9217g;
                C2825b c2825b = C2825b.f9209x;
                C2965c0 c2965c0 = (C2965c0) c2829f.mo6237c(c2825b);
                if (c2965c0 != null) {
                    Iterator it4 = c2965c0.f9719g.iterator();
                    while (it4.hasNext()) {
                        m1100q(c3411b, (C3406q) it4.next());
                    }
                }
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(c3411b);
                while (true) {
                    boolean zIsEmpty = arrayDeque2.isEmpty();
                    enumC3400k = EnumC3400k.f10972X;
                    if (zIsEmpty) {
                        break;
                    }
                    C3411b c3411b2 = (C3411b) arrayDeque2.pop();
                    C4305a c4305a4 = c3411b2.f11026b;
                    C3515s[] c3515sArr = c3411b2.f11027c;
                    for (C4320p c4320p4 : c4305a4.f14351l) {
                        if (c4320p4.f14396k != enumC3400k) {
                            for (AbstractC3508l abstractC3508l2 : c4320p4.f14398m) {
                                abstractC3508l2.getClass();
                                if (abstractC3508l2 instanceof C3514r) {
                                    C3514r c3514r3 = (C3514r) abstractC3508l2;
                                    int i21 = c3514r3.f11439l;
                                    C3515s c3515sM7191a = c3515sArr[i21];
                                    if (c3515sM7191a == null) {
                                        c4322r.m6383L("Not initialized variable reg: " + i21 + ", insn: " + String.valueOf(c4320p4) + ", block:" + String.valueOf(c4305a4));
                                        c3515sM7191a = c3411b2.m7191a(c3514r3);
                                    }
                                    c3515sM7191a.m7412q(c3514r3);
                                }
                            }
                        }
                        C3514r c3514r4 = c4320p4.f14397l;
                        if (c3514r4 != null) {
                            c3411b2.m7191a(c3514r4);
                        }
                    }
                    Iterator it5 = c4305a4.f14353n.iterator();
                    while (it5.hasNext()) {
                        C2965c0 c2965c02 = (C2965c0) ((C4305a) it5.next()).f9217g.mo6237c(c2825b);
                        if (c2965c02 != null) {
                            Iterator it6 = c2965c02.f9719g.iterator();
                            while (it6.hasNext()) {
                                m1100q(c3411b2, (C3406q) it6.next());
                            }
                        }
                    }
                    Iterator it7 = c3411b2.f11026b.f14360u.iterator();
                    while (it7.hasNext()) {
                        arrayDeque2.push(new C3411b(c3411b2.f11025a, (C4305a) it7.next(), (C3515s[]) Arrays.copyOf(c3515sArr, c3515sArr.length), c3411b2.f11028d));
                    }
                }
                Iterator it8 = c4322r.f14425z.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    C2825b c2825b2 = C2825b.f9178E;
                    if (zHasNext) {
                        C4305a c4305a5 = (C4305a) it8.next();
                        C2965c0 c2965c03 = (C2965c0) c4305a5.f9217g.mo6237c(c2825b);
                        if (c2965c03 != null && (c0072c = (C0072c) c4305a5.f9217g.mo6237c(c2825b2)) != null) {
                            for (C3406q c3406q : c2965c03.f9719g) {
                                int size5 = c3406q.f14398m.size();
                                int i22 = 0;
                                while (i22 < size5) {
                                    C3514r c3514rM7184j0 = c3406q.m7184j0(i22);
                                    C4320p c4320pM7394f02 = c3514rM7184j0.m7394f0();
                                    if (c4320pM7394f02 != null && c4320pM7394f02.f14397l != null) {
                                        if (c4320pM7394f02.f9217g.mo6235a(EnumC2824a.f9153j)) {
                                            C2829f c2829f2 = c4320pM7394f02.f9217g;
                                            C2825b c2825b3 = C2825b.f9179F;
                                            C0071b c0071b = (C0071b) c2829f2.mo6237c(c2825b3);
                                            if (c0071b == null) {
                                                C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320pM7394f02, c4322r.f14425z);
                                                c0071b = c4305aM35S == null ? null : (C0071b) c4305aM35S.f9217g.mo6237c(c2825b3);
                                            }
                                            if (c0071b != null && c0071b.f228g.contains(c0072c.f229g)) {
                                                c3406q.m7186l0(c3514rM7184j0);
                                                size5--;
                                            }
                                        }
                                    }
                                    i22++;
                                }
                                if (c3406q.f14398m.size() == 0) {
                                    C0086a.m452k("PHI empty after try-catch fix!");
                                    return;
                                }
                            }
                        }
                    } else {
                        for (C4305a c4305a6 : c4322r.f14425z) {
                            C2965c0 c2965c04 = (C2965c0) c4305a6.f9217g.mo6237c(c2825b);
                            if (c2965c04 != null) {
                                for (C3406q c3406q2 : c2965c04.f9719g) {
                                    for (int i23 = 0; i23 < c3406q2.f14398m.size(); i23++) {
                                        C3514r c3514rM7184j02 = c3406q2.m7184j0(i23);
                                        C4320p c4320pM7394f03 = c3514rM7184j02.m7394f0();
                                        if (c4320pM7394f03 != null) {
                                            if (c4320pM7394f03.f9217g.mo6235a(EnumC2824a.f9168u)) {
                                                c3406q2.m7186l0(c3514rM7184j02);
                                                C5791l.m10478j(c4322r, c4320pM7394f03);
                                                C5791l.m10475g(c4322r, c4305a6, c4320pM7394f03);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m1078N(c4322r.f14422w);
                        int size6 = c4322r.f14404D.size() * 2;
                        int i24 = 0;
                        while (true) {
                            ArrayList arrayList2 = new ArrayList();
                            boolean z12 = false;
                            for (C3515s c3515s2 : c4322r.f14404D) {
                                if (c3515s2.f11445j.size() == 0 && (c4320p2 = c3515s2.f11444i.f11420j) != null && c4320p2.f14396k == enumC3400k) {
                                    arrayList2.add((C3406q) c4320p2);
                                    z12 = true;
                                }
                            }
                            Iterator it9 = c4322r.f14425z.iterator();
                            while (it9.hasNext()) {
                                C4305a c4305a7 = (C4305a) it9.next();
                                C2965c0 c2965c05 = (C2965c0) c4305a7.f9217g.mo6237c(c2825b);
                                if (c2965c05 != null) {
                                    Iterator it10 = c2965c05.f9719g.iterator();
                                    while (it10.hasNext()) {
                                        C3406q c3406q3 = (C3406q) it10.next();
                                        List list3 = c3406q3.f14398m;
                                        if (list3.size() == 0) {
                                            for (C3514r c3514r5 : c3406q3.f14397l.f11440m.f11445j) {
                                                C4320p c4320p5 = c3514r5.f11420j;
                                                if (c4320p5 != null && c4320p5.f14396k == enumC3400k) {
                                                    c3406q3.m7186l0(c3514r5);
                                                }
                                            }
                                            C5791l.m10478j(c4322r, c3406q3);
                                            C5791l.m10475g(c4322r, c4305a7, c3406q3);
                                            enumC3400k2 = enumC3400k;
                                            arrayList = arrayList2;
                                            it = it9;
                                            z9 = true;
                                        } else {
                                            if (list3.size() != 1) {
                                                C3515s c3515s3 = null;
                                                for (int i25 = 0; i25 < list3.size(); i25++) {
                                                    C3514r c3514rM7184j03 = c3406q3.m7184j0(i25);
                                                    if (c3515s3 != null) {
                                                        if (c3515s3 != c3514rM7184j03.f11440m) {
                                                            break;
                                                        }
                                                    } else {
                                                        c3515s3 = c3514rM7184j03.f11440m;
                                                    }
                                                }
                                                C3514r c3514rM7184j04 = c3406q3.m7184j0(0);
                                                ArrayList arrayList3 = c4305a7.f14351l;
                                                iM10470a = AbstractC5790k.m10470a(arrayList3, c3406q3, 0);
                                                if (iM10470a != -1) {
                                                    C3515s c3515s4 = c3406q3.f14397l.f11440m;
                                                    C3515s c3515s5 = c3514rM7184j04.f11440m;
                                                    if (c3515s5 != null) {
                                                        c3515s5.m7406k(c3514rM7184j04);
                                                        c3515s5.m7407l(c3406q3);
                                                    }
                                                    C3515s c3515s6 = c3406q3.f14397l.f11440m;
                                                    if (c3515s6 == null) {
                                                        enumC3400k2 = enumC3400k;
                                                        arrayList = arrayList2;
                                                    } else {
                                                        enumC3400k2 = enumC3400k;
                                                        arrayList = arrayList2;
                                                        C3514r c3514rM7184j05 = c3406q3.m7184j0(0);
                                                        if (c3514rM7184j05.f11440m != null) {
                                                            Iterator it11 = new ArrayList(c3515s6.f11445j).iterator();
                                                            while (it11.hasNext()) {
                                                                C3514r c3514r6 = (C3514r) it11.next();
                                                                Iterator it12 = it11;
                                                                C4320p c4320p6 = c3514r6.f11420j;
                                                                if (c4320p6 != null && c4320p6 != c3406q3) {
                                                                    it = it9;
                                                                    if (c3514r6.f11439l != c3514rM7184j05.f11439l) {
                                                                        c3515s4.m7407l(c3406q3);
                                                                        z9 = true;
                                                                        C4320p c4320p7 = new C4320p(EnumC3400k.f10983m, 1);
                                                                        c4320p7.m6231w(EnumC2824a.f9159m);
                                                                        c4320p7.m8688d0(c3406q3.f14397l);
                                                                        c4320p7.mo7178I(c3514rM7184j04);
                                                                        c3514rM7184j04.f11440m.m7412q(c3514rM7184j04);
                                                                        arrayList3.set(iM10470a, c4320p7);
                                                                        break;
                                                                    }
                                                                    c3514r6.f11440m.m7406k(c3514r6);
                                                                    c3514rM7184j05.f11440m.m7412q(c3514r6);
                                                                    it11 = it12;
                                                                    it9 = it;
                                                                }
                                                            }
                                                            it = it9;
                                                            z9 = true;
                                                            if (c4305a7.f9217g.mo6236b(c2825b2) && (c4320pM7394f0 = c3514rM7184j05.m7394f0()) != null && !c4320pM7394f0.m8686W()) {
                                                                c4320pM7394f0.m6231w(EnumC2824a.f9164q);
                                                            }
                                                            C5791l.m10478j(c4322r, c3406q3);
                                                            arrayList3.remove(iM10470a);
                                                        }
                                                    }
                                                    it = it9;
                                                    c3515s4.m7407l(c3406q3);
                                                    z9 = true;
                                                    C4320p c4320p72 = new C4320p(EnumC3400k.f10983m, 1);
                                                    c4320p72.m6231w(EnumC2824a.f9159m);
                                                    c4320p72.m8688d0(c3406q3.f14397l);
                                                    c4320p72.mo7178I(c3514rM7184j04);
                                                    c3514rM7184j04.f11440m.m7412q(c3514rM7184j04);
                                                    arrayList3.set(iM10470a, c4320p72);
                                                    break;
                                                }
                                                enumC3400k2 = enumC3400k;
                                                arrayList = arrayList2;
                                                it = it9;
                                            } else {
                                                C3514r c3514rM7184j042 = c3406q3.m7184j0(0);
                                                ArrayList arrayList32 = c4305a7.f14351l;
                                                iM10470a = AbstractC5790k.m10470a(arrayList32, c3406q3, 0);
                                                if (iM10470a != -1) {
                                                }
                                                enumC3400k2 = enumC3400k;
                                                arrayList = arrayList2;
                                                it = it9;
                                            }
                                            arrayList2 = arrayList;
                                            enumC3400k = enumC3400k2;
                                            it9 = it;
                                        }
                                        it10.remove();
                                        z12 = z9;
                                        arrayList2 = arrayList;
                                        enumC3400k = enumC3400k2;
                                        it9 = it;
                                    }
                                }
                            }
                            EnumC3400k enumC3400k3 = enumC3400k;
                            ArrayList<C3406q> arrayList4 = arrayList2;
                            for (C4305a c4305a8 : c4322r.f14425z) {
                                C2965c0 c2965c06 = (C2965c0) c4305a8.f9217g.mo6237c(c2825b);
                                if (c2965c06 != null) {
                                    ArrayList arrayList5 = c2965c06.f9719g;
                                    for (C3406q c3406q4 : arrayList4) {
                                        if (arrayList5.remove(c3406q4)) {
                                            for (AbstractC3508l abstractC3508l3 : c3406q4.f14398m) {
                                                if (abstractC3508l3 != null && (c3515s = ((C3514r) abstractC3508l3).f11440m) != null) {
                                                    c3515s.m7407l(c3406q4);
                                                }
                                            }
                                            C5791l.m10478j(c4322r, c3406q4);
                                            C5791l.m10475g(c4322r, c4305a8, c3406q4);
                                        }
                                    }
                                    if (arrayList5.isEmpty()) {
                                        c4305a8.m6228E(c2825b);
                                    }
                                }
                            }
                            arrayList4.clear();
                            if (!z12) {
                                Iterator it13 = c4322r.f14425z.iterator();
                                while (it13.hasNext()) {
                                    ((C4305a) it13.next()).f14351l.removeIf(new C0561n(20));
                                }
                                Iterator it14 = c4322r.f14404D.iterator();
                                while (it14.hasNext()) {
                                    C3515s c3515s7 = (C3515s) it14.next();
                                    if (c3515s7.f11445j.size() == 0 && (c4320p = c3515s7.f11444i.f11420j) != null && c4320p.f14396k == EnumC3400k.f10963O) {
                                        c4320p.f14397l = null;
                                        it14.remove();
                                    }
                                }
                                return;
                            }
                            int i26 = i24 + 1;
                            if (i24 > size6) {
                                C0086a.m452k("Phi nodes fix limit reached!");
                                return;
                            } else {
                                i24 = i26;
                                enumC3400k = enumC3400k3;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1092i(C4322r c4322r, C4311g c4311g, C3399j c3399j) {
        C4320p c4320p;
        AbstractC3508l abstractC3508lMo7179S = c3399j.mo7179S(0);
        abstractC3508lMo7179S.getClass();
        if (abstractC3508lMo7179S instanceof C3509m) {
            c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
        } else {
            C4320p c4320p2 = new C4320p(EnumC3400k.f10971W, 1);
            c4320p2.mo7178I(abstractC3508lMo7179S);
            c4320p = c4320p2;
        }
        c4311g.m6233y(new C2831h(c4322r, c4320p));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C2991w m1093j(C4322r c4322r, C4320p c4320p, boolean z9) {
        if (!m1067C(c4322r, c4320p)) {
            if (!z9) {
                return null;
            }
            c4320p.m8690f0(new C0074e(3));
            return null;
        }
        if (!z9) {
            c4320p = c4320p.mo7167O();
        }
        c4320p.m8690f0(new C0074e(3));
        List listM8694S = c4322r.m8694S();
        if (c4322r.f14422w != null) {
            ArrayList arrayList = new ArrayList(listM8694S.size() + 1);
            arrayList.add(c4322r.f14422w);
            arrayList.addAll(listM8694S);
            listM8694S = arrayList;
        }
        int size = listM8694S.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = ((C3514r) listM8694S.get(i9)).f11439l;
        }
        C2991w c2991w = new C2991w(c4320p, iArr);
        c4322r.m6233y(c2991w);
        c4322r.m6380I("Marked for inline");
        return c2991w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1094k(C4322r c4322r, C4320p[] c4320pArr, int i9, int i10) {
        try {
            c4320pArr[i10].m6232x(C2825b.f9181H, new C2985q(i9, i10));
        } catch (Exception e6) {
            String str = "Failed to set jump: " + AbstractC5792m.m10487d(i9) + " -> " + AbstractC5792m.m10487d(i10);
            c4322r.getClass();
            C5787h.m10468a(c4322r, str, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C3406q m1095l(C4322r c4322r, C4305a c4305a, int i9) {
        C2965c0 c2965c0 = (C2965c0) c4305a.f9217g.mo6237c(C2825b.f9209x);
        if (c2965c0 == null) {
            c2965c0 = new C2965c0();
            c4305a.m6233y(c2965c0);
        }
        int size = c4305a.f14352m.size();
        if (c4322r.f14402B == c4305a) {
            C3514r c3514r = c4322r.f14422w;
            if (c3514r != null && c3514r.f11439l == i9) {
                size++;
                break;
            }
            Iterator it = c4322r.m8694S().iterator();
            while (it.hasNext()) {
                if (((C3514r) it.next()).f11439l == i9) {
                    size++;
                    break;
                }
            }
        }
        C3406q c3406q = new C3406q(size);
        C3504h c3504h = AbstractC3506j.f11404u;
        InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
        c3406q.m8688d0(new C3514r(i9, c3504h));
        c3406q.m6231w(EnumC2824a.f9164q);
        c3406q.m6231w(EnumC2824a.f9166s);
        c2965c0.f9719g.add(c3406q);
        c3406q.f14399n = c4305a.f14350k;
        return c3406q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m1096m(C4325u c4325u, LinkedHashSet linkedHashSet, HashSet hashSet, AbstractC3506j abstractC3506j) {
        if (Objects.equals(abstractC3506j, AbstractC3506j.f11394k) || !linkedHashSet.add(abstractC3506j)) {
            return 0;
        }
        C4309e c4309eM8716g = c4325u.m8716g(abstractC3506j);
        if (c4309eM8716g != null) {
            m1106y(c4309eM8716g, linkedHashSet, hashSet);
            return 1;
        }
        C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
        if (c0909bM2214c == null) {
            hashSet.add(abstractC3506j.mo7350l());
            return 1;
        }
        int iM1096m = 0;
        for (AbstractC3506j abstractC3506j2 : c0909bM2214c.f2828c) {
            iM1096m += m1096m(c4325u, linkedHashSet, hashSet, abstractC3506j2);
        }
        if (iM1096m == 0) {
            hashSet.add(abstractC3506j.mo7350l());
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C2992x m1097n(C4322r c4322r, List list, HashSet hashSet, boolean z9) {
        SortedSet treeSet;
        List listSubList;
        C2992x c2992x;
        SortedSet sortedSet;
        boolean zAnyMatch = list.stream().anyMatch(new C0019b(16));
        ArrayList<C4322r> arrayList = new ArrayList(list.size() + 1);
        arrayList.add(c4322r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4317m interfaceC4317m = (InterfaceC4317m) it.next();
            if (interfaceC4317m instanceof C4322r) {
                arrayList.add((C4322r) interfaceC4317m);
            }
        }
        C2825b c2825b = C2825b.f9203r;
        if (z9) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    treeSet = null;
                    break;
                }
                C2992x c2992x2 = (C2992x) ((C4322r) it2.next()).f9217g.mo6237c(c2825b);
                if (c2992x2 != null) {
                    treeSet = c2992x2.f9766h;
                    break;
                }
            }
            if (treeSet != null) {
                treeSet.addAll(arrayList);
            } else {
                treeSet = new TreeSet(arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C2992x c2992x3 = (C2992x) ((C4322r) it3.next()).f9217g.mo6237c(c2825b);
                if (c2992x3 != null && treeSet != (sortedSet = c2992x3.f9766h)) {
                    treeSet.addAll(sortedSet);
                }
            }
        } else {
            treeSet = new TreeSet(arrayList);
        }
        int i9 = 0;
        for (C4322r c4322r2 : arrayList) {
            if (zAnyMatch) {
                c4322r2.m6231w(EnumC2824a.f9171x);
            }
            if (i9 == 0) {
                i9 = 1;
            } else if (!z9 || (c2992x = (C2992x) c4322r2.f9217g.mo6237c(c2825b)) == null) {
                String str = AbstractC5798s.f23545a;
                if (i9 == 0) {
                    listSubList = list;
                } else {
                    int size = list.size();
                    listSubList = i9 >= size ? Collections.EMPTY_LIST : list.subList(i9, size);
                }
                c4322r2.m6233y(new C2992x(listSubList, treeSet, hashSet));
                i9++;
            } else {
                c2992x.f9766h = treeSet;
            }
        }
        return new C2992x(list, treeSet, hashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m1098o(C4322r c4322r, C3514r c3514r, C4320p c4320p, C4305a c4305a) {
        C3514r c3514r2 = (C3514r) c3514r.f11440m.f11445j.get(0);
        C4320p c4320p2 = c3514r2.f11420j;
        if (c4320p2 != null) {
            if (!c4320p2.f9217g.mo6235a(EnumC2824a.f9166s) && C5791l.m10475g(c4322r, c4305a, c4320p)) {
                c4320p2.mo7181b0(c3514r2, AbstractC3508l.m7373a0(c4320p));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m1099p(AbstractC3508l abstractC3508l, C2967d0 c2967d0, int i9) {
        if (!(abstractC3508l instanceof C3514r)) {
            return 0;
        }
        C3514r c3514r = (C3514r) abstractC3508l;
        if (i9 != c3514r.f11439l) {
            return 0;
        }
        c3514r.m6233y(c2967d0);
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m1100q(C3411b c3411b, C3406q c3406q) {
        C3514r c3514r = c3406q.f14397l;
        int i9 = c3514r.f11439l;
        C3515s c3515s = c3411b.f11027c[i9];
        if (c3515s == null) {
            return;
        }
        C4305a c4305a = c3411b.f11026b;
        C3514r c3514r2 = new C3514r(i9, c3514r.f11419i);
        c3406q.m7183i0(c3514r2, c4305a);
        c3515s.m7412q(c3514r2);
        c3515s.m7397a(c3406q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static C2992x m1101r(C4322r c4322r, ArrayList arrayList, HashSet hashSet, C2992x c2992x) {
        Collection collection;
        if (arrayList.isEmpty() && c2992x == null) {
            return null;
        }
        if (c2992x == null) {
            return m1097n(c4322r, (List) arrayList.stream().distinct().collect(Collectors.toList()), hashSet, false);
        }
        List list = c2992x.f9765g;
        if (AbstractC5798s.m10514h(arrayList)) {
            collection = list;
        } else {
            collection = arrayList;
            if (!AbstractC5798s.m10514h(list)) {
                ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(list);
                collection = arrayList2;
            }
        }
        List list2 = (List) collection.stream().distinct().collect(Collectors.toList());
        HashSet hashSet2 = c2992x.f9767i;
        if (AbstractC5798s.m10514h(hashSet)) {
            hashSet = hashSet2;
        } else if (!AbstractC5798s.m10514h(hashSet2)) {
            HashSet hashSet3 = new HashSet(hashSet2.size() + hashSet.size());
            hashSet3.addAll(hashSet);
            hashSet3.addAll(hashSet2);
            hashSet = hashSet3;
        }
        return m1097n(c4322r, list2, hashSet, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C0126e m1102t(C4325u c4325u, C4320p c4320p) {
        C4309e c4309eM8715f;
        C4311g c4311gM8717h;
        AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
        AbstractC3508l abstractC3508lMo7179S2 = c4320p.mo7179S(1);
        abstractC3508lMo7179S.getClass();
        if (!(abstractC3508lMo7179S instanceof C3509m)) {
            return null;
        }
        abstractC3508lMo7179S2.getClass();
        if (!(abstractC3508lMo7179S2 instanceof C3509m)) {
            return null;
        }
        C4320p c4320p2 = ((C3509m) abstractC3508lMo7179S2).f11421l;
        C4320p c4320p3 = ((C3509m) abstractC3508lMo7179S).f11421l;
        if (c4320p2.f14396k != EnumC3400k.f10963O || c4320p3.f14396k != EnumC3400k.f10961M) {
            return null;
        }
        C3403n c3403n = (C3403n) c4320p2;
        C3131d c3131d = c3403n.f11005p;
        if (!c3131d.f10154k.equals("ordinal()I") || (c4309eM8715f = c4325u.m8715f(c3131d.f10153j)) == null || !c4309eM8715f.m8658c0()) {
            return null;
        }
        Object obj = ((C3399j) c4320p3).f10948o;
        if ((obj instanceof C3130c) && (c4311gM8717h = c4325u.m8717h((C3130c) obj)) != null && c4311gM8717h.f14391m.m857i()) {
            return new C0126e(c3403n.mo7179S(0), 1, c4311gM8717h);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m1103u(C4322r c4322r, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        AbstractC3506j abstractC3506jMo7341h = abstractC3506j2.mo7341h();
        if (!abstractC3506jMo7341h.mo7354t()) {
            return abstractC3506jMo7341h instanceof C3499c;
        }
        if (abstractC3506j.mo7341h().mo7350l().equals(abstractC3506jMo7341h.mo7350l())) {
            return true;
        }
        c4322r.m6383L("Generic types in debug info not equals: " + String.valueOf(abstractC3506j) + " != " + String.valueOf(abstractC3506j2));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m1104v(List list, LinkedHashSet linkedHashSet) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3406q c3406q = (C3406q) it.next();
            C3515s c3515s = c3406q.f14397l.f11440m;
            if (linkedHashSet.add(c3515s)) {
                m1104v(c3515s.m7403g(), linkedHashSet);
            }
            c3406q.f14398m.forEach(new C0076g(linkedHashSet, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:7:0x001d, B:8:0x001f], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:7:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:7:0x001d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m1105w(C4309e c4309e, C4322r c4322r, EnumC3400k enumC3400k) {
        C4311g c4311gM8665l0;
        C4305a c4305a;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        C4305a c4305a2 = c4322r.f14402B;
        if (c4305a2 != null) {
            hashSet.add(c4305a2);
            if (c4305a2.f14352m.size() <= 1) {
                List list = c4305a2.f14353n;
                c4305a = list.size() == 1 ? (C4305a) list.get(0) : null;
                while (c4305a != null) {
                    hashSet.add(c4305a);
                    if (c4305a.f14352m.size() <= 1) {
                        List list2 = c4305a.f14353n;
                        if (list2.size() == 1) {
                            c4305a = (C4305a) list2.get(0);
                        }
                    }
                }
            }
            while (c4305a != null) {
            }
        }
        boolean z9 = true;
        for (C4305a c4305a3 : c4322r.f14425z) {
            for (C4320p c4320p : c4305a3.f14351l) {
                if (c4320p.f14396k == enumC3400k) {
                    C3399j c3399j = (C3399j) c4320p;
                    C3130c c3130c = (C3130c) c3399j.f10948o;
                    if (c3130c.f10146g.equals(c4309e.f14373m) && (c4311gM8665l0 = c4309e.m8665l0(c3130c)) != null) {
                        arrayList.add(new C0300r(c4311gM8665l0, c3399j, z9 && hashSet.contains(c4305a3)));
                    }
                }
                if (z9 && !c4320p.m8680N()) {
                    z9 = false;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m1106y(C4309e c4309e, LinkedHashSet linkedHashSet, HashSet hashSet) {
        C4325u c4325u = c4309e.f14371k;
        AbstractC3506j abstractC3506j = c4309e.f14376p;
        int iM1096m = abstractC3506j != null ? m1096m(c4325u, linkedHashSet, hashSet, abstractC3506j) : 0;
        Iterator it = c4309e.f14377q.iterator();
        while (it.hasNext()) {
            iM1096m += m1096m(c4325u, linkedHashSet, hashSet, (AbstractC3506j) it.next());
        }
        if (iM1096m == 0) {
            hashSet.add(c4309e.m8657b0().mo7350l());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m1107z(C3408s c3408s, AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2, IntFunction intFunction) {
        C2969e0 c2969e0 = (C2969e0) c3408s.f9217g.mo6237c(C2825b.f9184K);
        if (c2969e0 == null || !c3408s.mo7181b0(abstractC3508l, abstractC3508l2)) {
            return false;
        }
        final HashMap map = new HashMap();
        int length = c3408s.m7188l0().f11011p.length;
        for (int i9 = 0; i9 < length; i9++) {
            Object objM7187k0 = c3408s.m7187k0(i9);
            Object objApply = intFunction.apply(i9);
            c3408s.m7189m0(i9, objApply);
            map.put(objM7187k0, objApply);
        }
        Iterator it = ((C5777d) c2969e0.f9724g).f23512l.iterator();
        while (it.hasNext()) {
            ((C5776c) it.next()).f23508a.replaceAll(new UnaryOperator() { // from class: be.u
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object obj2 = map.get(obj);
                    String str = AbstractC5798s.f23545a;
                    return obj2 == null ? obj : obj2;
                }
            });
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public String mo1051e() {
        switch (this.f798g) {
            case 11:
                return "OverrideMethodVisitor";
            case 12:
                return "PrepareForCodeGen";
            case 19:
                return "DeobfuscatorVisitor";
            case 20:
                return "SourceFileRename";
            case 23:
                return "FinishTypeInference";
            default:
                return super.mo1051e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public void mo1052f(C4325u c4325u) {
        int i9;
        String strM10465a;
        int iIntValue;
        int i10 = 2;
        switch (this.f798g) {
            case 6:
                if (c4325u.f14435a.f735U == 2) {
                    AbstractC1400c.m3804a(c4325u);
                }
                break;
            case 17:
                if (c4325u.f14435a.f716B && c4325u.m8715f(C3128a.m6637e(c4325u, AbstractC3506j.m7360x("android.R"))) == null) {
                    AbstractC6030a.f24482a.forEach(new C0280f0(c4325u, i10, c4325u.f14438d));
                }
                break;
            case 19:
                c4325u.f14435a.getClass();
                break;
            case 20:
                C0257g c0257g = c4325u.f14435a;
                int i11 = c0257g.f732R;
                if (i11 != 3 && (i9 = c0257g.f755x) > 1) {
                    ArrayList<C4309e> arrayList = c4325u.f14448n;
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        map.put(((C4309e) it.next()).f14373m.f10139h, 1);
                    }
                    ArrayList<C2997c> arrayList2 = new ArrayList();
                    for (C4309e c4309e : arrayList) {
                        if (!c4309e.f9217g.mo6235a(EnumC2824a.f9171x)) {
                            C2829f c2829f = c4309e.f9217g;
                            C3128a c3128a = c4309e.f14373m;
                            C3389k c3389k = (C3389k) c2829f.mo6237c(C3126c.f10130c);
                            String str = null;
                            if (c3389k != null && !c3128a.m6650o()) {
                                String strM9262f = c3389k.f10926g;
                                C5796q c5796q = C5796q.f23542b;
                                if (strM9262f.endsWith(".java")) {
                                    strM9262f = AbstractC4855en.m9262f(5, 0, strM9262f);
                                }
                                if (strM9262f.endsWith(".kt")) {
                                    strM9262f = AbstractC4855en.m9262f(3, 0, strM9262f);
                                }
                                if (AbstractC2390d.m5714c(strM9262f) && !strM9262f.equals(c3128a.f10139h)) {
                                    str = strM9262f;
                                }
                            }
                            if (str != null && (iIntValue = ((Integer) map.merge(str, 1, new C2404m())).intValue()) < i9) {
                                arrayList2.add(new C2997c(c4309e, str, iIntValue));
                            }
                        }
                    }
                    for (C2997c c2997c : arrayList2) {
                        if (((Integer) map.get(c2997c.f9774b)).intValue() < i9) {
                            C4309e c4309e2 = c2997c.f9773a;
                            int i12 = c2997c.f9775c;
                            String str2 = c2997c.f9774b;
                            if (i12 >= 2) {
                                str2 = str2 + i12;
                            }
                            C3128a c3128a2 = c4309e2.f14373m;
                            if (c3128a2.m6649n()) {
                                String strM6646k = c3128a2.m6646k();
                                int iM8279b = AbstractC4106c.m8279b(i11);
                                if (iM8279b == 0) {
                                    strM10465a = str2;
                                } else if (iM8279b == 1) {
                                    strM10465a = AbstractC5780a.m10465a(str2, strM6646k);
                                } else if (iM8279b != 2) {
                                    C0086a.m452k("Unhandled strategy: ".concat(AbstractC0255e.m1035x(i11)));
                                } else {
                                    strM10465a = strM6646k;
                                }
                                if (strM10465a.equals(strM6646k)) {
                                }
                                break;
                            }
                            c3128a2.m6639a(str2);
                            C2971f0 c2971f0 = new C2971f0(c4309e2);
                            c2971f0.m6390b("use source file name");
                            c4309e2.m6233y(c2971f0);
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030e A[PHI: r3 r17 r18 r25 r27 r28 r29
  0x030e: PHI (r3v76 java.util.ArrayList) = 
  (r3v77 java.util.ArrayList)
  (r3v83 java.util.ArrayList)
  (r3v83 java.util.ArrayList)
  (r3v83 java.util.ArrayList)
  (r3v83 java.util.ArrayList)
  (r3v95 java.util.ArrayList)
 binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r17v4 java.util.Iterator) = 
  (r17v5 java.util.Iterator)
  (r17v6 java.util.Iterator)
  (r17v6 java.util.Iterator)
  (r17v6 java.util.Iterator)
  (r17v6 java.util.Iterator)
  (r17v6 java.util.Iterator)
 binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r18v23 int) = (r18v24 int), (r18v25 int), (r18v25 int), (r18v25 int), (r18v25 int), (r18v25 int) binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r25v7 int) = (r25v8 int), (r25v13 int), (r25v13 int), (r25v13 int), (r25v13 int), (r25v13 int) binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r27v13 int) = (r27v14 int), (r27v16 int), (r27v16 int), (r27v16 int), (r27v16 int), (r27v16 int) binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r28v9 md.a) = (r28v10 md.a), (r28v13 md.a), (r28v13 md.a), (r28v13 md.a), (r28v13 md.a), (r28v14 md.a) binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r29v4 int) = (r29v5 int), (r29v8 int), (r29v8 int), (r29v8 int), (r29v8 int), (r29v13 int) binds: [B:53:0x00e9, B:101:0x01ca, B:104:0x01df, B:107:0x01f3, B:724:0x030e, B:720:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07ed A[PHI: r18
  0x07ed: PHI (r18v18 java.util.Iterator) = 
  (r18v11 java.util.Iterator)
  (r18v11 java.util.Iterator)
  (r18v11 java.util.Iterator)
  (r18v11 java.util.Iterator)
  (r18v19 java.util.Iterator)
 binds: [B:455:0x0889, B:464:0x08b1, B:473:0x08db, B:819:0x07ed, B:423:0x07eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0c7d  */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1053g(p302ud.C4322r r37) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            int r0 = r1.f798g
            pd.k r3 = p233pd.EnumC3400k.f10967S
            r6 = 10
            pd.k r7 = p233pd.EnumC3400k.f10965Q
            r11 = 5
            md.a r13 = md.EnumC2824a.f9166s
            r14 = 34
            md.a r15 = md.EnumC2824a.f9168u
            r12 = 2
            r19 = 0
            r4 = 0
            switch(r0) {
                case 1: goto Lc47;
                case 2: goto L1a;
                case 3: goto Lc3e;
                case 4: goto L985;
                case 5: goto L1a;
                case 6: goto L930;
                case 7: goto L79e;
                case 8: goto L79a;
                case 9: goto L796;
                case 10: goto L78d;
                case 11: goto L1a;
                case 12: goto L4be;
                case 13: goto L382;
                case 14: goto L89;
                case 15: goto L57;
                case 16: goto L3b;
                case 17: goto L1a;
                case 18: goto L1a;
                case 19: goto L1a;
                case 20: goto L1a;
                case 21: goto L37;
                case 22: goto L33;
                case 23: goto L1b;
                default: goto L1a;
            }
        L1a:
            return
        L1b:
            boolean r0 = r2.f14415p
            if (r0 != 0) goto L32
            java.util.List r0 = r2.f14404D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            goto L32
        L28:
            java.util.List r0 = r2.f14404D
            ce.d r3 = new ce.d
            r3.<init>(r2, r11)
            r0.forEach(r3)
        L32:
            return
        L33:
            r36.m1091a0(r37)
            return
        L37:
            m1089Y(r2)
            return
        L3b:
            p4.t r0 = r2.m8695T()     // Catch: java.lang.Exception -> L45 af.C0080c -> L47
            if (r0 == 0) goto L56
            m1083S(r2, r0)     // Catch: java.lang.Exception -> L45 af.C0080c -> L47
            goto L56
        L45:
            r0 = move-exception
            goto L49
        L47:
            r0 = move-exception
            goto L4f
        L49:
            java.lang.String r3 = "Failed to parse debug info"
            r2.m6384M(r3, r0)
            goto L56
        L4f:
            java.lang.String r0 = r0.getMessage()
            r2.m6383L(r0)
        L56:
            return
        L57:
            boolean r0 = r2.f14415p
            if (r0 != 0) goto L88
            java.util.List r0 = r2.f14425z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L64
            goto L88
        L64:
            md.a r0 = md.EnumC2824a.f9145e0
            md.f r3 = r2.f9217g
            boolean r0 = r3.mo6235a(r0)
            if (r0 != 0) goto L88
            java.util.List r0 = r2.f14425z
            java.util.List r0 = p351xe.AbstractC5798s.m10519m(r0)
            r2.f14425z = r0
            java.util.List r0 = r2.f14406F
            java.util.List r0 = p351xe.AbstractC5798s.m10519m(r0)
            r2.f14406F = r0
            java.util.List r0 = r2.f14425z
            ud.d r2 = new ud.d
            r2.<init>(r12)
            r0.forEach(r2)
        L88:
            return
        L89:
            nd.c r0 = p199nd.EnumC2964c.f9717h
            boolean r0 = p199nd.C2966d.m6389b(r2, r0)
            if (r0 != 0) goto L93
            goto L381
        L93:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r4
        L99:
            java.util.List r6 = r2.f14425z
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        La0:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L35f
            java.lang.Object r11 = r6.next()
            ud.a r11 = (p302ud.C4305a) r11
            java.util.ArrayList r13 = r11.f14351l
            int r14 = r13.size()
            r8 = r4
        Lb3:
            if (r8 >= r14) goto L332
            java.lang.Object r16 = r13.get(r8)
            r9 = r16
            ud.p r9 = (p302ud.C4320p) r9
            pd.k r10 = r9.f14396k
            pd.k r12 = p233pd.EnumC3400k.f10957I
            if (r10 != r12) goto L310
            md.f r10 = r9.f9217g
            boolean r10 = r10.mo6235a(r15)
            if (r10 != 0) goto L310
            pd.p r9 = (p233pd.C3405p) r9
            ud.e r10 = r2.f14411l
            ud.u r12 = r10.f14371k
            qd.l r5 = r9.mo7179S(r4)
            java.lang.Object r5 = p351xe.AbstractC5792m.m10488e(r12, r5)
            boolean r12 = r5 instanceof p246qd.C3510n
            if (r12 != 0) goto Lec
        Ldd:
            r29 = r3
            r17 = r6
            r18 = r7
        Le3:
            r25 = r8
            r27 = r14
            r28 = r15
        Le9:
            r3 = r0
            goto L30e
        Lec:
            qd.n r5 = (p246qd.C3510n) r5
            long r4 = r5.f11422l
            int r4 = (int) r4
            if (r4 != 0) goto Lf4
            goto Ldd
        Lf4:
            qd.j r5 = r9.f11008o
            qd.j r12 = r5.mo7340g()
            int r5 = r5.mo7339f()
            r17 = r6
            r6 = 1
            if (r5 != r6) goto L10d
            r12.getClass()
            boolean r5 = r12 instanceof p246qd.C3503g
            if (r5 == 0) goto L10d
            int r5 = r4 / 2
            goto L10e
        L10d:
            r5 = r4
        L10e:
            qd.r r6 = r9.f14397l
            r18 = r7
            qd.s r7 = r6.f11440m
            java.util.ArrayList r7 = r7.f11445j
            r20 = r7
            int r7 = r20.size()
            if (r7 >= r5) goto L121
        L11e:
            r29 = r3
            goto Le3
        L121:
            java.util.Iterator r7 = r20.iterator()
        L125:
            boolean r25 = r7.hasNext()
            if (r25 == 0) goto L11e
            java.lang.Object r25 = r7.next()
            r26 = r7
            r7 = r25
            qd.r r7 = (p246qd.C3514r) r7
            ud.p r7 = r7.f11420j
            if (r7 == 0) goto L2fc
            pd.k r7 = r7.f14396k
            r25 = r8
            pd.k r8 = p233pd.EnumC3400k.f10956H
            if (r7 != r8) goto L2f4
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.util.Iterator r20 = r20.iterator()
            r27 = r14
            r14 = r19
        L14e:
            boolean r26 = r20.hasNext()
            if (r26 == 0) goto L1c1
            java.lang.Object r26 = r20.next()
            r28 = r15
            r15 = r26
            qd.r r15 = (p246qd.C3514r) r15
            ud.p r15 = r15.f11420j
            if (r15 == 0) goto L1ab
            pd.k r1 = r15.f14396k
            if (r1 != r8) goto L1ab
            r16 = r8
            r1 = 0
            qd.l r8 = r15.mo7179S(r1)
            boolean r8 = r6.m7396h0(r8)
            if (r8 != 0) goto L177
            r29 = r3
        L175:
            r3 = r0
            goto L1b0
        L177:
            ud.u r8 = r10.f14371k
            r29 = r3
            r1 = 1
            qd.l r3 = r15.mo7179S(r1)
            java.lang.Object r1 = p351xe.AbstractC5792m.m10488e(r8, r3)
            boolean r3 = r1 instanceof p246qd.C3510n
            if (r3 != 0) goto L18a
            goto Le9
        L18a:
            qd.n r1 = (p246qd.C3510n) r1
            r3 = r0
            long r0 = r1.f11422l
            r30 = r0
            long r0 = (long) r4
            int r0 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r0 < 0) goto L198
            goto L30e
        L198:
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L1a3
            goto L1c6
        L1a3:
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            r7.put(r0, r15)
            goto L1bd
        L1ab:
            r29 = r3
            r16 = r8
            goto L175
        L1b0:
            if (r14 != 0) goto L1bd
            r1 = r36
            r0 = r3
            r14 = r15
        L1b6:
            r8 = r16
            r15 = r28
            r3 = r29
            goto L14e
        L1bd:
            r1 = r36
            r0 = r3
            goto L1b6
        L1c1:
            r29 = r3
            r28 = r15
            r3 = r0
        L1c6:
            int r0 = r7.size()
            if (r0 >= r5) goto L1ce
            goto L30e
        L1ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = r7.values()
            r0.<init>(r1)
            int r1 = r0.size()
            int r5 = r13.size()
            if (r5 >= r1) goto L1e3
            goto L30e
        L1e3:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r1.addAll(r13)
            boolean r1 = r1.containsAll(r0)
            if (r1 != 0) goto L1f7
            goto L30e
        L1f7:
            java.util.Iterator r0 = r0.iterator()
        L1fb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L217
            java.lang.Object r1 = r0.next()
            ud.p r1 = (p302ud.C4320p) r1
            r5 = 2
            qd.l r1 = r1.mo7179S(r5)
            r1.getClass()
            boolean r1 = p351xe.AbstractC5792m.m10486c(r1, r6)
            if (r1 == 0) goto L1fb
            goto L30e
        L217:
            pd.g r0 = new pd.g
            r0.<init>(r4, r12)
            qd.r r1 = r6.mo7374H()
            r0.m8688d0(r1)
            r0.m6225B(r9)
            r0.m6393H(r9)
            r0.m8685V(r9)
            int r1 = r9.f14399n
            r0.f14399n = r1
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r5 = -1
        L23a:
            boolean r8 = r1.hasNext()
            r15 = 1
            if (r8 == 0) goto L2b8
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r20 = r8.getKey()
            java.lang.Long r20 = (java.lang.Long) r20
            long r30 = r20.longValue()
            int r20 = (r30 > r5 ? 1 : (r30 == r5 ? 0 : -1))
            if (r20 == 0) goto L26d
            long r5 = r5 + r15
        L257:
            int r20 = (r5 > r30 ? 1 : (r5 == r30 ? 0 : -1))
            if (r20 >= 0) goto L26d
            r32 = r5
            r34 = r15
            r5 = 0
            qd.n r15 = p246qd.AbstractC3508l.m7368S(r5, r12)
            r0.mo7178I(r15)
            long r5 = r32 + r34
            r15 = r34
            goto L257
        L26d:
            java.lang.Object r5 = r8.getValue()
            ud.p r5 = (p302ud.C4320p) r5
            r6 = 2
            qd.l r8 = r5.mo7179S(r6)
            r8.getClass()
            boolean r6 = r8 instanceof p246qd.C3510n
            if (r6 == 0) goto L2a0
            r6 = r8
            qd.n r6 = (p246qd.C3510n) r6
            ud.l r6 = r10.m8654Y(r6)
            if (r6 == 0) goto L2a0
            pd.j r8 = new pd.j
            pd.k r15 = p233pd.EnumC3400k.f10961M
            r16 = r1
            od.c r1 = r6.mo6656f()
            r20 = r3
            r3 = 0
            r8.<init>(r15, r1, r3)
            qd.m r3 = p246qd.AbstractC3508l.m7372Z(r8)
            be.C0276d0.m1113i(r6, r2)
            goto L2a8
        L2a0:
            r16 = r1
            r20 = r3
            qd.l r3 = r8.mo7374H()
        L2a8:
            r0.mo7178I(r3)
            r3 = r20
            r3.add(r5)
            p351xe.C5791l.m10478j(r2, r5)
            r1 = r16
            r5 = r30
            goto L23a
        L2b8:
            r34 = r15
        L2ba:
            long r5 = r5 + r34
            long r1 = (long) r4
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2cb
            r1 = 0
            qd.n r8 = p246qd.AbstractC3508l.m7368S(r1, r12)
            r0.mo7178I(r8)
            goto L2ba
        L2cb:
            r3.add(r9)
            r2 = r37
            p351xe.C5791l.m10478j(r2, r9)
            java.lang.Object r1 = r7.lastKey()
            java.lang.Object r1 = r7.get(r1)
            ud.p r1 = (p302ud.C4320p) r1
            r12 = 0
            int r1 = p351xe.AbstractC5790k.m10470a(r13, r1, r12)
            if (r14 == 0) goto L2ef
            int r4 = p351xe.AbstractC5790k.m10470a(r13, r14, r12)
            r5 = -1
            if (r4 == r5) goto L2ef
            int r1 = java.lang.Math.min(r4, r1)
        L2ef:
            r13.add(r1, r0)
            r0 = 1
            goto L31e
        L2f4:
            r29 = r3
            r27 = r14
            r28 = r15
            r3 = r0
            goto L2ff
        L2fc:
            r25 = r8
            goto L2f4
        L2ff:
            r1 = r36
            r0 = r3
            r8 = r25
            r7 = r26
            r14 = r27
            r15 = r28
            r3 = r29
            goto L125
        L30e:
            r0 = 0
            goto L31e
        L310:
            r29 = r3
            r17 = r6
            r18 = r7
            r25 = r8
            r27 = r14
            r28 = r15
            goto Le9
        L31e:
            r7 = r18 | r0
            int r0 = r25 + 1
            r1 = r36
            r8 = r0
            r0 = r3
            r6 = r17
            r14 = r27
            r15 = r28
            r3 = r29
            r4 = 0
            r12 = 2
            goto Lb3
        L332:
            r29 = r3
            r17 = r6
            r18 = r7
            r28 = r15
            r3 = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L342
            goto L350
        L342:
            java.util.ArrayList r0 = r11.f14351l
            java.util.Objects.requireNonNull(r0)
            p351xe.C5791l.m10479k(r2, r3)
            p351xe.C5791l.m10473e(r0, r3)
            r3.clear()
        L350:
            r1 = r36
            r0 = r3
            r6 = r17
            r7 = r18
            r15 = r28
            r3 = r29
            r4 = 0
            r12 = 2
            goto La0
        L35f:
            r29 = r3
            r28 = r15
            r3 = r0
            if (r7 == 0) goto L381
            m1089Y(r2)
            int r12 = r29 + 1
            r0 = 100
            r4 = r29
            if (r4 <= r0) goto L377
            java.lang.String r0 = "Reached limit for ReplaceNewArray iterations"
            r2.m6383L(r0)
            goto L381
        L377:
            r1 = r36
            r0 = r3
            r3 = r12
            r15 = r28
            r4 = 0
            r12 = 2
            goto L99
        L381:
            return
        L382:
            boolean r0 = r2.f14415p
            if (r0 == 0) goto L388
            goto L4bd
        L388:
            ud.p[] r0 = r2.f14424y
            r12 = 0
        L38b:
            int r1 = r0.length
            if (r12 >= r1) goto L4bd
            r1 = r0[r12]
            if (r1 != 0) goto L395
        L392:
            r5 = -1
            goto L4b9
        L395:
            pd.k r3 = r1.f14396k
            int r3 = r3.ordinal()
            if (r3 == r6) goto L4af
            r4 = 23
            if (r3 == r4) goto L478
            r4 = 25
            if (r3 == r4) goto L467
            if (r3 == r14) goto L455
            r4 = 41
            if (r3 == r4) goto L44a
            r4 = 45
            if (r3 == r4) goto L437
            r4 = 15
            if (r3 == r4) goto L422
            r4 = 16
            if (r3 == r4) goto L3b8
            goto L392
        L3b8:
            pd.s r1 = (p233pd.C3408s) r1
            pd.r r3 = r1.f11015q
            if (r3 != 0) goto L408
            int r3 = m1069E(r0, r12)
            int r4 = r1.f11013o
            int r5 = r0.length
            r9 = r4
        L3c6:
            if (r9 >= r5) goto L3d4
            r10 = r0[r9]
            if (r10 == 0) goto L3d1
            pd.k r11 = r10.f14396k
            if (r11 == r7) goto L3d1
            goto L3d6
        L3d1:
            int r9 = r9 + 1
            goto L3c6
        L3d4:
            r10 = r19
        L3d6:
            if (r10 == 0) goto L3f9
            pd.k r5 = r10.f14396k
            pd.k r9 = p233pd.EnumC3400k.f10994x
            if (r5 != r9) goto L3f9
            r4 = r10
            pd.r r4 = (p233pd.C3407r) r4
            int r5 = r4.f11010o
            int[] r9 = r4.f11012q
            r11 = 0
        L3e6:
            if (r11 >= r5) goto L3f0
            r13 = r9[r11]
            int r13 = r13 + r12
            r9[r11] = r13
            int r11 = r11 + 1
            goto L3e6
        L3f0:
            r1.f11015q = r4
            r1.f11016r = r3
            int r3 = r10.f14399n
            r0[r3] = r19
            goto L408
        L3f9:
            java.lang.String r0 = p351xe.AbstractC5792m.m10487d(r4)
            java.lang.String r1 = "Payload for switch not found at "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m452k(r0)
            goto L4bd
        L408:
            int r3 = r1.f11016r
            r5 = -1
            if (r3 == r5) goto L410
            m1094k(r2, r0, r12, r3)
        L410:
            pd.r r1 = r1.m7188l0()
            int[] r1 = r1.f11012q
            int r3 = r1.length
            r4 = 0
        L418:
            if (r4 >= r3) goto L392
            r5 = r1[r4]
            m1094k(r2, r0, r12, r5)
            int r4 = r4 + 1
            goto L418
        L422:
            int r3 = m1069E(r0, r12)
            r5 = -1
            if (r3 == r5) goto L42c
            m1094k(r2, r0, r12, r3)
        L42c:
            pd.i r1 = (p233pd.C3398i) r1
            int r1 = r1.mo7173k0()
            m1094k(r2, r0, r12, r1)
            goto L392
        L437:
            sd.a r1 = (sd.C3953a) r1
            int r1 = r1.f12957o
            m1094k(r2, r0, r12, r1)
            int r1 = m1069E(r0, r12)
            r5 = -1
            if (r1 == r5) goto L4b9
            m1094k(r2, r0, r12, r1)
            goto L4b9
        L44a:
            r5 = -1
            qd.r r3 = r1.f14397l
            if (r3 != 0) goto L4b9
            qd.e r3 = p246qd.AbstractC3506j.f11396m
            m1079O(r0, r12, r1, r3)
            goto L4b9
        L455:
            r5 = -1
            qd.r r3 = r1.f14397l
            if (r3 != 0) goto L4b9
            r3 = r1
            pd.b r3 = (p233pd.AbstractC3391b) r3
            od.d r3 = r3.mo7169i0()
            qd.j r3 = r3.f10151h
            m1079O(r0, r12, r1, r3)
            goto L4b9
        L467:
            r5 = -1
            r3 = r1
            pd.g r3 = (p233pd.C3396g) r3
            qd.j r3 = r3.f10941o
            qd.g r4 = p246qd.AbstractC3506j.f11385b
            qd.a r4 = new qd.a
            r4.<init>(r3)
            m1079O(r0, r12, r1, r4)
            goto L4b9
        L478:
            r5 = -1
            pd.f r1 = (p233pd.C3395f) r1
            int r3 = r1.f10939o
            int r4 = r0.length
            r9 = r3
        L47f:
            if (r9 >= r4) goto L48d
            r10 = r0[r9]
            if (r10 == 0) goto L48a
            pd.k r11 = r10.f14396k
            if (r11 == r7) goto L48a
            goto L48f
        L48a:
            int r9 = r9 + 1
            goto L47f
        L48d:
            r10 = r19
        L48f:
            if (r10 == 0) goto L4a1
            pd.k r4 = r10.f14396k
            pd.k r9 = p233pd.EnumC3400k.f10953E
            if (r4 != r9) goto L4a1
            r3 = r10
            pd.e r3 = (p233pd.C3394e) r3
            r1.f10940p = r3
            int r1 = r10.f14399n
            r0[r1] = r19
            goto L4b9
        L4a1:
            java.lang.String r0 = p351xe.AbstractC5792m.m10487d(r3)
            java.lang.String r1 = "Payload for fill-array not found at "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m452k(r0)
            goto L4bd
        L4af:
            r5 = -1
            pd.h r1 = (p233pd.C3397h) r1
            int r1 = r1.mo7173k0()
            m1094k(r2, r0, r12, r1)
        L4b9:
            int r12 = r12 + 1
            goto L38b
        L4bd:
            return
        L4be:
            boolean r0 = r2.f14415p
            if (r0 == 0) goto L4c6
        L4c2:
            r1 = r36
            goto L78c
        L4c6:
            java.util.List r0 = r2.f14425z
            java.util.Iterator r0 = r0.iterator()
        L4cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63b
            java.lang.Object r1 = r0.next()
            ud.a r1 = (p302ud.C4305a) r1
            md.f r4 = r1.f9217g
            java.util.ArrayList r1 = r1.f14351l
            boolean r4 = r4.mo6235a(r13)
            if (r4 == 0) goto L4e3
            goto L4cc
        L4e3:
            java.util.Iterator r4 = r1.iterator()
        L4e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54e
            java.lang.Object r5 = r4.next()
            ud.p r5 = (p302ud.C4320p) r5
            pd.k r6 = r5.f14396k
            int r6 = r6.ordinal()
            r7 = 6
            if (r6 == r7) goto L520
            r7 = 12
            if (r6 == r7) goto L51c
            r7 = 36
            if (r6 == r7) goto L51c
            r7 = 38
            if (r6 == r7) goto L511
            r5 = 18
            if (r6 == r5) goto L51c
            r5 = 19
            if (r6 == r5) goto L51c
            goto L4e7
        L511:
            td.a r5 = (td.C4145a) r5
            int r5 = r5.f13663p
            r6 = 4
            if (r5 != r6) goto L4e7
            r4.remove()
            goto L4e7
        L51c:
            r4.remove()
            goto L4e7
        L520:
            qd.r r6 = r5.f14397l
            qd.s r7 = r6.f11440m
            java.util.ArrayList r7 = r7.f11445j
            int r7 = r7.size()
            if (r7 != 0) goto L4e7
            r12 = 0
            qd.l r5 = r5.mo7179S(r12)
            java.lang.String r6 = r6.getName()
            if (r6 == 0) goto L547
            boolean r7 = r5 instanceof p246qd.InterfaceC3511o
            if (r7 != 0) goto L53c
            goto L547
        L53c:
            qd.o r5 = (p246qd.InterfaceC3511o) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r6.equals(r5)
            goto L548
        L547:
            r5 = 0
        L548:
            if (r5 == 0) goto L4e7
            r4.remove()
            goto L4e7
        L54e:
            r4 = 0
        L54f:
            int r5 = r1.size()
            if (r4 >= r5) goto L586
            java.lang.Object r5 = r1.get(r4)
            ud.p r5 = (p302ud.C4320p) r5
            pd.k r6 = r5.f14396k
            pd.k r7 = p233pd.EnumC3400k.f10983m
            if (r6 != r7) goto L583
            r12 = 0
            qd.l r6 = r5.mo7179S(r12)
            r6.getClass()
            boolean r6 = r6 instanceof p246qd.C3509m
            if (r6 == 0) goto L583
            qd.l r6 = r5.mo7179S(r12)
            qd.m r6 = (p246qd.C3509m) r6
            ud.p r6 = r6.f11421l
            qd.r r7 = r5.f14397l
            r6.m8688d0(r7)
            r6.m6225B(r5)
            r6.m6393H(r5)
            r1.set(r4, r6)
        L583:
            int r4 = r4 + 1
            goto L54f
        L586:
            java.util.Iterator r4 = r1.iterator()
        L58a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59a
            java.lang.Object r5 = r4.next()
            ud.p r5 = (p302ud.C4320p) r5
            m1086V(r5)
            goto L58a
        L59a:
            java.util.Iterator r4 = r1.iterator()
        L59e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5ee
            java.lang.Object r5 = r4.next()
            ud.p r5 = (p302ud.C4320p) r5
            pd.k r6 = r5.f14396k
            pd.k r7 = p233pd.EnumC3400k.f10980j
            if (r6 != r7) goto L5eb
            md.f r6 = r5.f9217g
            md.a r7 = md.EnumC2824a.f9134T
            boolean r6 = r6.mo6235a(r7)
            if (r6 != 0) goto L5eb
            md.a r6 = md.EnumC2824a.f9131Q
            md.f r8 = r5.f9217g
            boolean r6 = r8.mo6235a(r6)
            if (r6 != 0) goto L5eb
            qd.r r6 = r5.f14397l
            r12 = 0
            qd.l r8 = r5.mo7179S(r12)
            boolean r9 = r6.equals(r8)
            if (r9 == 0) goto L5d3
            r6 = 1
            goto L5e2
        L5d3:
            r8.getClass()
            boolean r9 = r8 instanceof p246qd.C3514r
            if (r9 == 0) goto L5e1
            qd.r r8 = (p246qd.C3514r) r8
            boolean r6 = r6.m7395g0(r8)
            goto L5e2
        L5e1:
            r6 = 0
        L5e2:
            if (r6 == 0) goto L5eb
            r6 = r19
            r5.f14397l = r6
            r5.m6231w(r7)
        L5eb:
            r19 = 0
            goto L59e
        L5ee:
            java.util.Iterator r4 = r1.iterator()
        L5f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L607
            java.lang.Object r5 = r4.next()
            ud.p r5 = (p302ud.C4320p) r5
            ae.e r6 = new ae.e
            r6.<init>(r11)
            r5.mo8342h0(r6)
            goto L5f2
        L607:
            java.util.Iterator r1 = r1.iterator()
        L60b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L637
            java.lang.Object r4 = r1.next()
            ud.p r4 = (p302ud.C4320p) r4
            pd.k r5 = r4.f14396k
            int r5 = r5.ordinal()
            r6 = 22
            if (r5 == r6) goto L62e
            if (r5 == r14) goto L624
            goto L60b
        L624:
            pd.n r4 = (p233pd.C3403n) r4
            qd.l r4 = r4.mo7171k0()
            m1090Z(r2, r4)
            goto L60b
        L62e:
            r12 = 0
            qd.l r4 = r4.mo7179S(r12)
            m1090Z(r2, r4)
            goto L60b
        L637:
            r19 = 0
            goto L4cc
        L63b:
            boolean r0 = r2.m8698W()
            if (r0 != 0) goto L643
            goto L728
        L643:
            java.util.List r0 = r2.f14425z
            java.util.Iterator r0 = r0.iterator()
        L649:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67f
            java.lang.Object r1 = r0.next()
            ud.a r1 = (p302ud.C4305a) r1
            java.util.ArrayList r1 = r1.f14351l
            java.util.Iterator r1 = r1.iterator()
        L65b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L649
            java.lang.Object r4 = r1.next()
            ud.p r4 = (p302ud.C4320p) r4
            pd.k r5 = r4.f14396k
            if (r5 != r3) goto L65b
            r6 = r4
            td.a r6 = (td.C4145a) r6
            boolean r0 = r6.m8339l0()
            if (r0 != 0) goto L680
            int r0 = r6.f13663p
            r1 = 3
            if (r0 != r1) goto L67b
            r0 = 1
            goto L67c
        L67b:
            r0 = 0
        L67c:
            if (r0 == 0) goto L67f
            goto L680
        L67f:
            r6 = 0
        L680:
            if (r6 == 0) goto L728
            md.f r0 = r6.f9217g
            boolean r0 = r0.mo6235a(r13)
            if (r0 == 0) goto L68c
            goto L728
        L68c:
            ud.a r0 = r2.f14402B
            ud.a r0 = p000a.AbstractC0000a.m19K(r0)
            java.util.ArrayList r0 = r0.f14351l
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6a5
            r12 = 0
            java.lang.Object r0 = r0.get(r12)
            if (r0 != r6) goto L6a3
        L6a1:
            r0 = 1
            goto L6d9
        L6a3:
            r0 = r12
            goto L6d9
        L6a5:
            r12 = 0
            java.util.List r0 = r2.f14425z
            ud.a r0 = p000a.AbstractC0000a.m35S(r2, r6, r0)
            if (r0 == 0) goto L77a
            java.util.ArrayList r1 = r0.f14351l
            java.lang.Object r1 = r1.get(r12)
            if (r1 == r6) goto L6b8
        L6b6:
            r0 = 0
            goto L6d9
        L6b8:
            ud.a r1 = r2.f14402B
            java.util.HashSet r1 = p000a.AbstractC0000a.m29P(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L6c2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6a1
            java.lang.Object r3 = r1.next()
            ud.a r3 = (p302ud.C4305a) r3
            java.util.ArrayList r4 = r3.f14351l
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6c2
            if (r3 == r0) goto L6c2
            goto L6b6
        L6d9:
            xd.b r1 = r2.f14407G
            md.b r3 = md.C2825b.f9208w
            md.f r1 = r1.f9217g
            oc.b r1 = r1.mo6237c(r3)
            nd.e r1 = (p199nd.C2968e) r1
            if (r0 == 0) goto L6ea
            if (r1 != 0) goto L6ea
            goto L728
        L6ea:
            int r1 = r6.f13663p
            r3 = 1
            if (r1 == r3) goto L704
            r5 = 2
            if (r1 == r5) goto L701
            r3 = 3
            if (r1 == r3) goto L6fe
            r3 = 4
            if (r1 != r3) goto L6fb
            java.lang.String r1 = "SELF"
            goto L706
        L6fb:
            r19 = 0
            throw r19
        L6fe:
            java.lang.String r1 = "THIS"
            goto L706
        L701:
            java.lang.String r1 = "SUPER"
            goto L706
        L704:
            java.lang.String r1 = "CONSTRUCTOR"
        L706:
            java.lang.String r1 = r1.toLowerCase()
            java.util.List r3 = r2.f14425z
            ud.a r3 = p000a.AbstractC0000a.m35S(r2, r6, r3)
            if (r3 != 0) goto L72b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to move "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " instruction to top"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.m6382K(r0)
        L728:
            r1 = r36
            goto L789
        L72b:
            if (r0 != 0) goto L769
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.mo8340U(r0)
            qd.r r4 = r2.f14422w
            r0.remove(r4)
            java.util.List r4 = r2.m8694S()
            be.z r5 = new be.z
            r7 = 1
            r5.<init>(r0, r7)
            r4.forEach(r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L753
            java.lang.String r0 = "Illegal instructions before constructor call"
            r2.m6383L(r0)
            goto L728
        L753:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "'"
            r0.<init>(r4)
            r0.append(r1)
            java.lang.String r1 = "' call moved to the top of the method (can break code semantics)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.m6383L(r0)
        L769:
            p351xe.AbstractC5790k.m10471b(r3, r6)
            xd.b r0 = r2.f14407G
            java.util.ArrayList r0 = r0.f23507k
            ud.o r1 = new ud.o
            r1.<init>(r6)
            r12 = 0
            r0.add(r12, r1)
            goto L728
        L77a:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Insn not found in method: "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m452k(r0)
            goto L4c2
        L789:
            r1.m1109x(r2, r2)
        L78c:
            return
        L78d:
            boolean r0 = r2.f14415p
            if (r0 == 0) goto L792
            goto L795
        L792:
            m1080P(r2)
        L795:
            return
        L796:
            m1081Q(r2)
            return
        L79a:
            m1073I(r2)
            return
        L79e:
            r28 = r15
            boolean r0 = r2.f14415p
            ud.e r3 = r2.f14411l
            if (r0 == 0) goto L7a8
            goto L92f
        L7a8:
            java.util.List r0 = r2.f14425z
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L7af:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L92a
            java.lang.Object r5 = r0.next()
            ud.a r5 = (p302ud.C4305a) r5
            java.util.ArrayList r5 = r5.f14351l
            java.util.Iterator r5 = r5.iterator()
        L7c1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L926
            java.lang.Object r6 = r5.next()
            ud.p r6 = (p302ud.C4320p) r6
            pd.k r7 = r6.f14396k
            pd.k r8 = p233pd.EnumC3400k.f10993w
            if (r7 != r8) goto L919
            md.f r7 = r6.f9217g
            r8 = r28
            boolean r7 = r7.mo6235a(r8)
            if (r7 != 0) goto L916
            pd.s r6 = (p233pd.C3408s) r6
            r12 = 0
            qd.l r7 = r6.mo7179S(r12)
            r7.getClass()
            boolean r9 = r7 instanceof p246qd.C3509m
            if (r9 != 0) goto L7f0
        L7eb:
            r18 = r0
        L7ed:
            r12 = 0
            goto L914
        L7f0:
            r9 = r7
            qd.m r9 = (p246qd.C3509m) r9
            ud.p r9 = r9.f11421l
            pd.k r10 = r9.f14396k
            int r10 = r10.ordinal()
            r11 = 26
            if (r10 == r11) goto L881
            if (r10 == r14) goto L802
            goto L7eb
        L802:
            pd.n r9 = (p233pd.C3403n) r9
            od.d r10 = r9.f11005p
            java.lang.String r10 = r10.f10154k
            java.lang.String r11 = "ordinal()I"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L811
            goto L82f
        L811:
            r12 = 0
            qd.l r9 = r9.mo7179S(r12)
            ud.u r10 = r3.f14371k
            qd.j r11 = r9.mo7375I()
            ud.e r10 = r10.m8716g(r11)
            if (r10 != 0) goto L823
            goto L82f
        L823:
            md.b r11 = md.C2825b.f9190e
            md.f r10 = r10.f9217g
            oc.b r10 = r10.mo6237c(r11)
            nd.h r10 = (p199nd.C2974h) r10
            if (r10 != 0) goto L830
        L82f:
            goto L7eb
        L830:
            java.util.List r10 = r10.f9733g
            pd.r r11 = r6.m7188l0()
            int[] r11 = r11.f11011p
            int r11 = r11.length
            int r15 = r10.size()
            if (r15 >= r11) goto L844
            r18 = r0
        L841:
            r15 = r19
            goto L86c
        L844:
            ud.g[] r15 = new p302ud.C4311g[r11]
            r12 = 0
        L847:
            if (r12 >= r11) goto L86a
            java.lang.Object r14 = r6.m7187k0(r12)
            r18 = r0
            boolean r0 = r14 instanceof java.lang.Integer
            if (r0 == 0) goto L841
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r0 = r14.intValue()
            java.lang.Object r14 = r10.get(r0)     // Catch: java.lang.Exception -> L841
            nd.g r14 = (p199nd.C2972g) r14     // Catch: java.lang.Exception -> L841
            ud.g r14 = r14.f9729a     // Catch: java.lang.Exception -> L841
            r15[r0] = r14     // Catch: java.lang.Exception -> L841
            int r12 = r12 + 1
            r0 = r18
            r14 = 34
            goto L847
        L86a:
            r18 = r0
        L86c:
            if (r15 != 0) goto L871
            r16 = 0
            goto L87d
        L871:
            be.s r0 = new be.s
            r12 = 0
            r0.<init>(r12, r15)
            boolean r0 = m1107z(r6, r7, r9, r0)
            r16 = r0
        L87d:
            r12 = r16
            goto L914
        L881:
            r18 = r0
            ud.u r0 = r3.f14371k
            b.e r0 = m1102t(r0, r9)
            if (r0 != 0) goto L88d
            goto L7ed
        L88d:
            java.lang.Object r9 = r0.f333i
            ud.g r9 = (p302ud.C4311g) r9
            ud.e r10 = r9.f14389k
            java.lang.Object r0 = r0.f332h
            qd.l r0 = (p246qd.AbstractC3508l) r0
            md.b r11 = md.C2825b.f9191f
            md.f r14 = r10.f9217g
            oc.b r11 = r14.mo6237c(r11)
            nd.j r11 = (p199nd.C2978j) r11
            if (r11 != 0) goto L8a6
        L8a3:
            r11 = r19
            goto L8b1
        L8a6:
            java.util.HashMap r11 = r11.f9740g
            if (r11 != 0) goto L8ab
            goto L8a3
        L8ab:
            java.lang.Object r11 = r11.get(r9)
            nd.i r11 = (p199nd.C2976i) r11
        L8b1:
            if (r11 != 0) goto L8b5
            goto L7ed
        L8b5:
            pd.r r14 = r6.m7188l0()
            int[] r14 = r14.f11011p
            int r14 = r14.length
            r15 = 0
        L8bd:
            if (r15 >= r14) goto L8d2
            java.lang.Object r12 = r6.m7187k0(r15)
            java.util.HashMap r1 = r11.f9738a
            java.lang.Object r1 = r1.get(r12)
            if (r1 != 0) goto L8cd
            goto L7ed
        L8cd:
            int r15 = r15 + 1
            r1 = r36
            goto L8bd
        L8d2:
            be.t r1 = new be.t
            r1.<init>()
            boolean r0 = m1107z(r6, r7, r0, r1)
            if (r0 == 0) goto L7ed
            r9.m6231w(r13)
            java.util.List r0 = r10.f14381u
            java.util.Iterator r0 = r0.iterator()
        L8e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L910
            java.lang.Object r1 = r0.next()
            ud.g r1 = (p302ud.C4311g) r1
            b5.k r6 = r1.f14391m
            boolean r7 = r6.m857i()
            if (r7 == 0) goto L8e6
            boolean r7 = r6.m856h()
            if (r7 == 0) goto L8e6
            boolean r6 = r6.m851c()
            if (r6 == 0) goto L8e6
            md.f r1 = r1.f9217g
            boolean r1 = r1.mo6235a(r13)
            if (r1 != 0) goto L8e6
        L90e:
            r12 = 1
            goto L914
        L910:
            r10.m6231w(r13)
            goto L90e
        L914:
            r4 = r4 | r12
            goto L91c
        L916:
            r18 = r0
            goto L91c
        L919:
            r8 = r28
            goto L916
        L91c:
            r1 = r36
            r28 = r8
            r0 = r18
            r14 = 34
            goto L7c1
        L926:
            r1 = r36
            goto L7af
        L92a:
            if (r4 == 0) goto L92f
            m1089Y(r2)
        L92f:
            return
        L930:
            boolean r0 = r2.f14415p
            if (r0 == 0) goto L935
            goto L984
        L935:
            ud.p[] r0 = r2.f14424y
            int r1 = r0.length
            r4 = 0
        L939:
            if (r4 >= r1) goto L984
            r2 = r0[r4]
            if (r2 != 0) goto L945
        L93f:
            r7 = 2
            r8 = 4
            r9 = 6
            r10 = 45
            goto L981
        L945:
            md.f r3 = r2.f9217g
            md.b r5 = md.C2825b.f9179F
            oc.b r3 = r3.mo6237c(r5)
            ae.b r3 = (ae.C0071b) r3
            if (r3 == 0) goto L93f
            pd.k r3 = r2.f14396k
            int r3 = r3.ordinal()
            if (r3 == 0) goto L97c
            r7 = 1
            if (r3 == r7) goto L97c
            r7 = 2
            if (r3 == r7) goto L979
            r8 = 3
            if (r3 == r8) goto L979
            r8 = 4
            r9 = 6
            if (r3 == r8) goto L976
            r10 = 45
            if (r3 == r9) goto L97e
            if (r3 == r10) goto L97e
            r11 = 9
            if (r3 == r11) goto L97e
            if (r3 == r6) goto L97e
            switch(r3) {
                case 12: goto L97e;
                case 13: goto L97e;
                case 14: goto L97e;
                case 15: goto L97e;
                default: goto L975;
            }
        L975:
            goto L981
        L976:
            r10 = 45
            goto L97e
        L979:
            r8 = 4
            r9 = 6
            goto L976
        L97c:
            r7 = 2
            goto L979
        L97e:
            r2.m6228E(r5)
        L981:
            int r4 = r4 + 1
            goto L939
        L984:
            return
        L985:
            r8 = r15
            boolean r0 = r2.f14415p
            if (r0 == 0) goto L98c
            goto Lc3d
        L98c:
            xe.l r0 = new xe.l
            r12 = 0
            r0.<init>(r2, r12)
            java.util.List r1 = r2.f14425z
            ud.e r4 = r2.f14411l
            java.util.Iterator r1 = r1.iterator()
            r16 = 0
        L99c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lc38
            java.lang.Object r5 = r1.next()
            ud.a r5 = (p302ud.C4305a) r5
            java.util.ArrayList r6 = r5.f14351l
            r0.f23536a = r6
            int r7 = r6.size()
            r9 = 0
        L9b1:
            if (r9 >= r7) goto Lc2b
            java.lang.Object r10 = r6.get(r9)
            ud.p r10 = (p302ud.C4320p) r10
            pd.k r10 = r10.f14396k
            pd.k r11 = p233pd.EnumC3400k.f10963O
            if (r10 != r11) goto Lc11
            java.lang.Object r10 = r6.get(r9)
            pd.n r10 = (p233pd.C3403n) r10
            od.d r11 = r10.f11005p
            boolean r13 = r11.m6663f()
            if (r13 != 0) goto L9dc
            r18 = r1
        L9cf:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
            r12 = 0
            r22 = 0
            goto Lc0e
        L9dc:
            qd.l r13 = r10.mo7171k0()
            if (r13 == 0) goto L9ff
            boolean r14 = r13 instanceof p246qd.C3514r
            if (r14 != 0) goto L9e7
            goto L9ff
        L9e7:
            qd.r r13 = (p246qd.C3514r) r13
            qd.s r13 = r13.f11440m
            qd.r r13 = r13.f11444i
            ud.p r13 = r13.f11420j
            if (r13 == 0) goto L9ff
            pd.k r14 = r13.f14396k
            pd.k r15 = p233pd.EnumC3400k.f10958J
            if (r14 == r15) goto L9f8
            goto L9ff
        L9f8:
            pd.j r13 = (p233pd.C3399j) r13
            java.lang.Object r13 = r13.f10948o
            qd.j r13 = (p246qd.AbstractC3506j) r13
            goto La01
        L9ff:
            r13 = r19
        La01:
            if (r13 == 0) goto La1f
            od.a r14 = r11.f10153j
            qd.j r14 = r14.f10138g
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto La1f
            ud.u r14 = r4.f14371k
            od.a r13 = p215od.C3128a.m6637e(r14, r13)
            ud.u r14 = r4.f14371k
            java.lang.String r15 = r11.f10150g
            java.util.List r12 = r11.f10152i
            qd.j r11 = r11.f10151h
            od.d r11 = p215od.C3131d.m6657b(r14, r13, r15, r12, r11)
        La1f:
            td.a r12 = new td.a
            r12.<init>(r2, r10, r11)
            boolean r11 = r12.m8339l0()
            java.util.List r13 = r12.f14398m
            if (r11 == 0) goto La3b
            int r11 = r13.size()
            if (r11 == 0) goto La38
            boolean r11 = r4.m8658c0()
            if (r11 == 0) goto La3b
        La38:
            r18 = r1
            goto La6f
        La3b:
            int r11 = r12.f13663p
            od.d r14 = r12.f13662o
            r15 = 3
            if (r11 != r15) goto La55
            int r17 = r13.size()
            if (r17 != 0) goto La55
            java.lang.String r15 = r14.f10154k
            ud.r r15 = r4.m8667m0(r15)
            if (r15 == 0) goto La38
            boolean r15 = r15.f14415p
            if (r15 == 0) goto La55
            goto La38
        La55:
            md.b r15 = md.C2825b.f9193h
            r18 = r1
            md.f r1 = r4.f9217g
            boolean r1 = r1.mo6236b(r15)
            ud.u r15 = r4.f14371k
            if (r1 == 0) goto La74
            boolean r1 = r2.m8699X()
            if (r1 == 0) goto La74
            boolean r1 = r12.m8339l0()
            if (r1 == 0) goto La74
        La6f:
            r0.m10481a(r10)
            goto L9cf
        La74:
            r12.m8685V(r10)
            r1 = 0
            qd.l r10 = r10.mo7179S(r1)
            qd.r r10 = (p246qd.C3514r) r10
            qd.s r1 = r10.f11440m
            r1.m7406k(r10)
            r1 = 1
            if (r11 != r1) goto Lb64
            ud.p r1 = r10.m7394f0()
            if (r1 == 0) goto Lb54
            r20 = r4
            pd.k r4 = r1.f14396k
            if (r4 != r3) goto Lb3a
            td.a r1 = (td.C4145a) r1
            java.util.List r4 = r2.f14425z
            ud.a r4 = p000a.AbstractC0000a.m35S(r2, r1, r4)
            if (r4 == 0) goto Lb2b
            r21 = r3
            ud.a r3 = p000a.AbstractC0000a.m67h0(r2, r5, r4)
            if (r3 != 0) goto Lae8
            qd.r r1 = r10.m7393e0(r2)
            r3 = 1
            java.util.ArrayList r4 = p000a.AbstractC0000a.m100y(r2, r5, r3)
            qd.s r3 = r10.f11440m
            java.util.ArrayList r3 = r3.f11445j
            java.util.Iterator r3 = r3.iterator()
        Lab5:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto Lade
            java.lang.Object r10 = r3.next()
            qd.r r10 = (p246qd.C3514r) r10
            r24 = r1
            ud.p r1 = r10.f11420j
            if (r1 == 0) goto Lad7
            ud.a r25 = p000a.AbstractC0000a.m35S(r2, r1, r4)
            if (r25 == 0) goto Lad7
            r25 = r3
            qd.r r3 = r24.mo7374H()
            r1.mo7181b0(r10, r3)
            goto Lad9
        Lad7:
            r25 = r3
        Lad9:
            r1 = r24
            r3 = r25
            goto Lab5
        Lade:
            r24 = r1
            r27 = r7
            r10 = r24
            r24 = r6
            goto Lb5c
        Lae8:
            qd.r r10 = r10.m7393e0(r2)
            r24 = r6
            qd.r r6 = r1.f14397l
            qd.r r25 = r6.m7393e0(r2)
            r27 = r7
            int r7 = r6.f11439l
            pd.q r7 = m1095l(r2, r3, r7)
            qd.r r6 = r6.mo7374H()
            r7.m8688d0(r6)
            qd.r r6 = r10.mo7374H()
            r28 = r10
            ud.a r10 = p000a.AbstractC0000a.m69i0(r2, r3, r5)
            r7.m7183i0(r6, r10)
            qd.r r6 = r25.mo7374H()
            ud.a r3 = p000a.AbstractC0000a.m69i0(r2, r3, r4)
            r7.m7183i0(r6, r3)
            r7.mo8341Z()
            qd.r r3 = r25.mo7374H()
            r1.m8688d0(r3)
            r1.mo8341Z()
            r10 = r28
            goto Lb5c
        Lb2b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Block not found by insn: "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m452k(r0)
            goto Lc3d
        Lb3a:
            r21 = r3
            r24 = r6
            r27 = r7
            ud.p r1 = m1085U(r2, r1, r0)
            if (r1 == 0) goto Lb5c
            r12.m8685V(r1)
            r1.m6231w(r8)
            java.lang.Object r3 = r0.f23538c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r1)
            goto Lb5c
        Lb54:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
        Lb5c:
            qd.r r1 = r10.mo7374H()
            r12.m8688d0(r1)
            goto Lb6c
        Lb64:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
        Lb6c:
            r12.mo8341Z()
            ud.r r1 = r15.m8718i(r14)
            if (r1 == 0) goto Lbfe
            b5.k r3 = r1.f14412m
            boolean r3 = r3.m857i()
            if (r3 == 0) goto Lbfe
            java.util.Iterator r3 = r13.iterator()
        Lb81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb9f
            java.lang.Object r4 = r3.next()
            qd.l r4 = (p246qd.AbstractC3508l) r4
            r4.getClass()
            boolean r6 = r4 instanceof p246qd.C3510n
            if (r6 == 0) goto Lbfe
            qd.n r4 = (p246qd.C3510n) r4
            long r6 = r4.f11422l
            r22 = 0
            int r4 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r4 == 0) goto Lb81
            goto Lbab
        Lb9f:
            r22 = 0
            ud.e r3 = r1.f14411l
            od.a r3 = r3.f14373m
            ud.e r3 = r15.m8715f(r3)
            if (r3 != 0) goto Lbae
        Lbab:
            r6 = r19
            goto Lc01
        Lbae:
            qd.r r4 = r12.f14397l
            if (r4 != 0) goto Lbb3
            goto Lbab
        Lbb3:
            boolean r6 = r4.m7380N()
            if (r6 == 0) goto Lbc0
            qd.j r4 = r4.f11419i
            java.lang.String r4 = p082fd.AbstractC1213j.m3333b(r4)
            goto Lbc2
        Lbc0:
            java.lang.String r4 = ""
        Lbc2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "<init>("
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ")V"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            ud.r r3 = r3.m8667m0(r4)
            if (r3 == 0) goto Lbab
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto Lbab
            b5.k r1 = r3.f14412m
            boolean r1 = r1.m857i()
            if (r1 == 0) goto Lbea
            goto Lbab
        Lbea:
            td.a r6 = new td.a
            od.d r1 = r3.f14410k
            r6.<init>(r1, r11)
            qd.r r1 = r12.f14397l
            qd.r r1 = r1.mo7374H()
            r6.m8688d0(r1)
            r6.m8685V(r12)
            goto Lc01
        Lbfe:
            r22 = 0
            goto Lbab
        Lc01:
            if (r6 == 0) goto Lc0a
            r0.m10481a(r12)
            p000a.AbstractC0000a.m18J0(r2, r5, r9, r6)
            goto Lc0d
        Lc0a:
            p000a.AbstractC0000a.m18J0(r2, r5, r9, r12)
        Lc0d:
            r12 = 1
        Lc0e:
            r16 = r16 | r12
            goto Lc1d
        Lc11:
            r18 = r1
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
            r22 = 0
        Lc1d:
            int r9 = r9 + 1
            r1 = r18
            r4 = r20
            r3 = r21
            r6 = r24
            r7 = r27
            goto L9b1
        Lc2b:
            r18 = r1
            r21 = r3
            r20 = r4
            r22 = 0
            r0.m10483c()
            goto L99c
        Lc38:
            if (r16 == 0) goto Lc3d
            m1080P(r2)
        Lc3d:
            return
        Lc3e:
            boolean r0 = r2.f14415p
            if (r0 == 0) goto Lc43
            goto Lc46
        Lc43:
            m1082R(r2)
        Lc46:
            return
        Lc47:
            od.d r0 = r2.f14410k
            java.util.List r0 = r0.f10152i
            int r0 = r0.size()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto Lc83
            java.util.List r0 = r2.f14408H
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc5c
            goto Lc7d
        Lc5c:
            ud.p[] r0 = r2.f14424y
            int r1 = r0.length
            if (r1 != 0) goto Lc62
            goto Lc7d
        Lc62:
            int r1 = r0.length
            r3 = 0
        Lc64:
            if (r3 >= r1) goto Lc7d
            r4 = r0[r3]
            if (r4 == 0) goto Lc7a
            pd.k r5 = r4.f14396k
            if (r5 == r7) goto Lc7a
            pd.k r6 = p233pd.EnumC3400k.f10986p
            if (r5 != r6) goto Lc83
            java.util.List r4 = r4.f14398m
            int r4 = r4.size()
            if (r4 != 0) goto Lc83
        Lc7a:
            int r3 = r3 + 1
            goto Lc64
        Lc7d:
            r2.m6231w(r13)
            r1 = 1
            r2.f14415p = r1
        Lc83:
            ud.p[] r0 = r2.f14424y
            java.lang.String r1 = p351xe.AbstractC5798s.f23545a
            if (r0 == 0) goto Lcf4
            int r0 = r0.length
            if (r0 != 0) goto Lc8d
            goto Lcf4
        Lc8d:
            int r0 = r2.f14416q
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ud.p[] r2 = r2.f14424y
            int r3 = r2.length
            r4 = 0
        Lc98:
            if (r4 >= r3) goto Lcf4
            r5 = r2[r4]
            if (r5 != 0) goto Lc9f
            goto Lcf1
        Lc9f:
            r1.clear()
            qd.r r6 = r5.f14397l
            if (r6 == 0) goto Lca9
            r1.add(r6)
        Lca9:
            r5.mo8340U(r1)
            java.util.Iterator r6 = r1.iterator()
        Lcb0:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lcf1
            java.lang.Object r7 = r6.next()
            qd.r r7 = (p246qd.C3514r) r7
            int r7 = r7.f11439l
            if (r7 < 0) goto Lce3
            if (r7 >= r0) goto Lcc3
            goto Lcb0
        Lcc3:
            af.g r1 = new af.g
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect register number in instruction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", expected to be less than "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        Lce3:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Incorrect negative register number in instruction: "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m452k(r0)
            goto Lcf4
        Lcf1:
            int r4 = r4 + 1
            goto Lc98
        Lcf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C0271b.mo1053g(ud.r):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:623:0x06e1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:693:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, qd.j] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, md.e, nd.b0, ud.e] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r5v51, types: [qd.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1054h(C4309e c4309e) {
        int i9;
        C3128a c3128a;
        EnumC3400k enumC3400k;
        C4325u c4325u;
        boolean z9;
        boolean z10;
        C3128a c3128a2;
        EnumC3400k enumC3400k2;
        C4325u c4325u2;
        List list;
        C0126e c0126eM1102t;
        C4311g c4311gM8717h;
        C0126e c0126e;
        HashSet hashSet;
        Iterator it;
        ArrayList<AbstractC3506j> arrayList;
        InterfaceC4317m interfaceC4317m;
        C4322r c4322r;
        Iterator it2;
        InterfaceC4317m interfaceC4317m2;
        AbstractC3506j abstractC3506jM3345l;
        boolean z11;
        int size;
        boolean z12;
        boolean z13;
        HashSet hashSet2;
        InterfaceC4317m interfaceC4317m3;
        boolean z14;
        int i10;
        ?? M3345l;
        ?? r2;
        C4322r c4322r2;
        C2958a c2958a;
        int i11 = this.f798g;
        C2825b c2825b = C2825b.f9193h;
        EnumC2824a enumC2824a = EnumC2824a.f9166s;
        EnumC3400k enumC3400k3 = EnumC3400k.f10960L;
        C3126c c3126c = C3126c.f10133f;
        int i12 = 2;
        boolean z15 = false;
        ?? r11 = 0;
        switch (i11) {
            case 0:
                if (c4309e.f9217g.mo6236b(c2825b)) {
                    Iterator it3 = c4309e.f14380t.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C4322r c4322r3 = (C4322r) it3.next();
                            if (c4322r3.f9217g.mo6235a(EnumC2824a.f9122H)) {
                                ArrayList arrayList2 = new ArrayList();
                                C3131d c3131d = c4322r3.f14410k;
                                C4309e c4309e2 = c4322r3.f14411l;
                                List listM8694S = c4322r3.m8694S();
                                int i13 = (c3131d.f10152i.size() == 0 || !((AbstractC3506j) c3131d.f10152i.get(0)).equals(((C4322r) c4322r3.f14408H.get(0)).f14411l.f14373m.f10138g)) ? 0 : 1;
                                Map linkedHashMap = new LinkedHashMap();
                                int size2 = listM8694S.size();
                                while (true) {
                                    if (i13 < size2) {
                                        C3514r c3514r = (C3514r) listM8694S.get(i13);
                                        C4320p c4320pM1070F = m1070F(c3514r);
                                        if (c4320pM1070F == null) {
                                            linkedHashMap = Collections.EMPTY_MAP;
                                        } else {
                                            int iOrdinal = c4320pM1070F.f14396k.ordinal();
                                            if (iOrdinal == 31) {
                                                C4311g c4311gM8665l0 = c4309e2.m8665l0((C3130c) ((C3399j) c4320pM1070F).f10948o);
                                                if (c4311gM8665l0 != null && c4311gM8665l0.f14391m.m857i()) {
                                                    linkedHashMap.put(c3514r, c4311gM8665l0);
                                                    arrayList2.add(c4320pM1070F);
                                                    i13++;
                                                }
                                            } else if (iOrdinal != 38) {
                                                linkedHashMap = Collections.EMPTY_MAP;
                                            } else if (((C4145a) c4320pM1070F).m8339l0()) {
                                                arrayList2.add(c4320pM1070F);
                                                i13++;
                                            } else {
                                                linkedHashMap = Collections.EMPTY_MAP;
                                            }
                                        }
                                    }
                                }
                                linkedHashMap = Collections.EMPTY_MAP;
                                if (linkedHashMap.isEmpty()) {
                                    c4322r3.m6231w(EnumC2824a.f9121G);
                                } else {
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        C4311g c4311g = (C4311g) entry.getValue();
                                        if (c4311g != null) {
                                            AbstractC3508l abstractC3508l = (AbstractC3508l) entry.getKey();
                                            c4311g.m6233y(new C2979k(abstractC3508l));
                                            c4311g.m6231w(enumC2824a);
                                            abstractC3508l.getClass();
                                            if (abstractC3508l instanceof C3514r) {
                                                abstractC3508l.m6231w(EnumC2824a.f9120F);
                                                C3514r c3514r2 = (C3514r) abstractC3508l;
                                                List listM8694S2 = c4322r3.m8694S();
                                                String str = AbstractC5798s.f23545a;
                                                if (listM8694S2.isEmpty()) {
                                                    i9 = -1;
                                                    if (i9 == -1) {
                                                        C0086a.m452k("Arg not found: ".concat(String.valueOf(c3514r2)));
                                                        return false;
                                                    }
                                                    C2973g0.m6391b(c4322r3, i9);
                                                } else {
                                                    int size3 = listM8694S2.size();
                                                    i9 = 0;
                                                    while (i9 < size3) {
                                                        if (listM8694S2.get(i9) != c3514r2) {
                                                            i9++;
                                                        } else if (i9 == -1) {
                                                        }
                                                    }
                                                    i9 = -1;
                                                    if (i9 == -1) {
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    ((C4320p) it4.next()).m6231w(enumC2824a);
                                }
                            }
                        }
                    }
                }
                return true;
            case 2:
                if (c4309e.f9217g.mo6235a(EnumC2824a.f9126L)) {
                    return false;
                }
                Iterator it5 = c4309e.f14382v.iterator();
                while (it5.hasNext()) {
                    mo1054h((C4309e) it5.next());
                }
                if (m1076L(c4309e)) {
                    c4309e.m6231w(enumC2824a);
                    return false;
                }
                boolean zMo6236b = c4309e.f9217g.mo6236b(c2825b);
                C4325u c4325u3 = c4309e.f14371k;
                C3128a c3128a3 = c4309e.f14373m;
                if (zMo6236b || c3128a3.m6650o()) {
                    for (C4311g c4311g2 : c4309e.f14381u) {
                        AbstractC3506j abstractC3506j = c4311g2.f14392n;
                        if (c4311g2.f14391m.m857i() && abstractC3506j.mo7351v() && !(abstractC3506j instanceof C3499c)) {
                            C4309e c4309eM8715f = c4325u3.m8715f(C3128a.m6637e(c4325u3, abstractC3506j));
                            C3128a c3128a4 = c3128a3.f10142k;
                            if (c4309eM8715f != null) {
                                C3128a c3128a5 = c4309eM8715f.f14373m;
                                boolean zEquals = Objects.equals(c3128a4, c3128a5);
                                if (zMo6236b || zEquals) {
                                    int i14 = 0;
                                    for (C4322r c4322r4 : c4309e.f14380t) {
                                        if (c4322r4.f14415p || !c4322r4.f14412m.m849a()) {
                                            z10 = zMo6236b;
                                            c4325u2 = c4325u3;
                                            enumC3400k2 = enumC3400k3;
                                            c3128a2 = c3128a3;
                                        } else {
                                            List listM8694S3 = c4322r4.m8694S();
                                            if (!listM8694S3.isEmpty()) {
                                                C2829f c2829f = c4322r4.f9217g;
                                                z10 = zMo6236b;
                                                EnumC2824a enumC2824a2 = EnumC2824a.f9119E;
                                                if (!c2829f.mo6235a(enumC2824a2)) {
                                                    C3514r c3514r3 = (C3514r) listM8694S3.get(0);
                                                    if (c3514r3.mo7375I().equals(c3128a5.f10138g)) {
                                                        C4305a c4305a = (C4305a) c4322r4.f14402B.f14354o.get(0);
                                                        ArrayList arrayList3 = c4305a.f14351l;
                                                        if (!arrayList3.isEmpty()) {
                                                            c4325u2 = c4325u3;
                                                            C4320p c4320p = (C4320p) arrayList3.get(0);
                                                            if (c4320p.f14396k == enumC3400k3) {
                                                                C3399j c3399j = (C3399j) c4320p;
                                                                enumC3400k2 = enumC3400k3;
                                                                C3130c c3130c = (C3130c) c3399j.f10948o;
                                                                c3128a2 = c3128a3;
                                                                if (c3130c.equals(c4311g2.f14390l) && c3399j.mo7179S(0).equals(c3514r3)) {
                                                                    c4322r4.m6231w(enumC2824a2);
                                                                    C5791l.m10478j(c4322r4, c4320p);
                                                                    C5791l.m10475g(c4322r4, c4305a, c4320p);
                                                                    if (c3514r3.f11440m.f11445j.size() != 0) {
                                                                        C3399j c3399j2 = new C3399j(EnumC3400k.f10959K, c3130c, 1);
                                                                        c3399j2.mo7178I(c4320p.mo7179S(1));
                                                                        Iterator it6 = new ArrayList(c3514r3.f11440m.f11445j).iterator();
                                                                        while (it6.hasNext()) {
                                                                            ((AbstractC3508l) it6.next()).m7388b0(c4322r4, c3399j2, true);
                                                                        }
                                                                    }
                                                                    i14++;
                                                                }
                                                            }
                                                        }
                                                        enumC3400k2 = enumC3400k3;
                                                        c3128a2 = c3128a3;
                                                    }
                                                }
                                            }
                                            c4325u2 = c4325u3;
                                            enumC3400k2 = enumC3400k3;
                                            c3128a2 = c3128a3;
                                        }
                                        zMo6236b = z10;
                                        c4325u3 = c4325u2;
                                        enumC3400k3 = enumC3400k2;
                                        c3128a3 = c3128a2;
                                    }
                                    z9 = zMo6236b;
                                    c4325u = c4325u3;
                                    enumC3400k = enumC3400k3;
                                    c3128a = c3128a3;
                                    if (i14 != 0) {
                                        if (zEquals) {
                                            c4311g2.m6233y(new C2979k(c3128a5));
                                        }
                                        c4311g2.m6231w(enumC2824a);
                                    }
                                }
                                zMo6236b = z9;
                                c4325u3 = c4325u;
                                enumC3400k3 = enumC3400k;
                                c3128a3 = c3128a;
                            }
                        }
                        z9 = zMo6236b;
                        c4325u = c4325u3;
                        enumC3400k = enumC3400k3;
                        c3128a = c3128a3;
                        zMo6236b = z9;
                        c4325u3 = c4325u;
                        enumC3400k3 = enumC3400k;
                        c3128a3 = c3128a;
                    }
                }
                c4309e.f14380t.forEach(new C0074e(1));
                c4309e.f14380t.forEach(new C0074e(2));
                return false;
            case 5:
                Iterator it7 = c4309e.f14382v.iterator();
                while (it7.hasNext()) {
                    mo1054h((C4309e) it7.next());
                }
                if (c4309e.f14381u.isEmpty()) {
                    return false;
                }
                C4322r c4322rM8667m0 = c4309e.m8667m0("<clinit>()V");
                EnumC2824a enumC2824a3 = EnumC2824a.f9131Q;
                if (c4322rM8667m0 != null && c4322rM8667m0.f14412m.m856h() && !c4322rM8667m0.f14415p && c4322rM8667m0.f14425z != null && AbstractC0283h.m1167k(c4309e.f14381u, new C0019b(8))) {
                    while (true) {
                        ArrayList<C0300r> arrayListM1105w = m1105w(c4309e, c4322rM8667m0, EnumC3400k.f10962N);
                        if (!arrayListM1105w.isEmpty()) {
                            Iterator it8 = arrayListM1105w.iterator();
                            while (it8.hasNext()) {
                                C4311g c4311g3 = ((C0300r) it8.next()).f866a;
                                if (c4311g3.f14391m.m851c()) {
                                    c4311g3.m6228E(c3126c);
                                }
                            }
                            m1065A(arrayListM1105w);
                            if (!arrayListM1105w.isEmpty()) {
                                for (C0300r c0300r : arrayListM1105w) {
                                    C3399j c3399j3 = c0300r.f867b;
                                    AbstractC3508l abstractC3508lMo7179S = c3399j3.mo7179S(0);
                                    if (abstractC3508lMo7179S instanceof C3509m) {
                                        ((C3509m) abstractC3508lMo7179S).f11421l.m6231w(enumC2824a3);
                                    }
                                    C5791l.m10472d(c4322rM8667m0, c3399j3);
                                    m1092i(c4322rM8667m0, c0300r.f866a, c3399j3);
                                }
                                m1066B(c4309e, arrayListM1105w);
                                m1089Y(c4322rM8667m0);
                            }
                        }
                    }
                }
                if (!AbstractC0283h.m1167k(c4309e.f14381u, new C0019b(9))) {
                    return false;
                }
                ?? arrayList4 = new ArrayList();
                for (C4322r c4322r5 : c4309e.f14380t) {
                    C0192k c0192k = c4322r5.f14412m;
                    if (!c0192k.m856h() && c0192k.m849a()) {
                        arrayList4.add(c4322r5);
                        if (c4322r5.f14415p || AbstractC0000a.m75l0(c4322r5.f14425z)) {
                            arrayList4 = Collections.EMPTY_LIST;
                            if (!arrayList4.isEmpty()) {
                                return false;
                            }
                            ArrayList<C0299q> arrayList5 = new ArrayList(arrayList4.size());
                            for (C4322r c4322r6 : arrayList4) {
                                ArrayList arrayListM1105w2 = m1105w(c4309e, c4322r6, enumC3400k3);
                                m1065A(arrayListM1105w2);
                                if (arrayListM1105w2.isEmpty()) {
                                    return false;
                                }
                                arrayList5.add(new C0299q(c4322r6, arrayListM1105w2));
                            }
                            C0299q c0299q = null;
                            for (C0299q c0299q2 : arrayList5) {
                                if (c0299q == null) {
                                    c0299q = c0299q2;
                                } else {
                                    ArrayList arrayList6 = c0299q.f865b;
                                    ArrayList arrayList7 = c0299q2.f865b;
                                    if (arrayList6.size() != arrayList7.size()) {
                                        return false;
                                    }
                                    int size4 = arrayList6.size();
                                    for (int i15 = 0; i15 < size4; i15++) {
                                        if (!((C0300r) arrayList6.get(i15)).f867b.mo7168Y(((C0300r) arrayList7.get(i15)).f867b)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                            if (c0299q == null) {
                                return false;
                            }
                            ArrayList<C0300r> arrayList8 = c0299q.f865b;
                            for (C0299q c0299q3 : arrayList5) {
                                Iterator it9 = c0299q3.f865b.iterator();
                                while (it9.hasNext()) {
                                    C3399j c3399j4 = ((C0300r) it9.next()).f867b;
                                    AbstractC3508l abstractC3508lMo7179S2 = c3399j4.mo7179S(0);
                                    if (abstractC3508lMo7179S2 instanceof C3509m) {
                                        ((C3509m) abstractC3508lMo7179S2).f11421l.m6231w(enumC2824a3);
                                    }
                                    C5791l.m10472d(c0299q3.f864a, c3399j4);
                                }
                            }
                            for (C0300r c0300r2 : arrayList8) {
                                m1092i(c0299q.f864a, c0300r2.f866a, c0300r2.f867b);
                            }
                            m1066B(c4309e, arrayList8);
                            return false;
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                }
                break;
            case 7:
                C4322r c4322rM8667m02 = c4309e.m8667m0("<clinit>()V");
                if (c4322rM8667m02 == null || c4322rM8667m02.f14415p || (list = c4322rM8667m02.f14425z) == null) {
                    return true;
                }
                C2978j c2978j = new C2978j();
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    for (C4320p c4320p2 : ((C4305a) it10.next()).f14351l) {
                        if (c4320p2.f14396k == EnumC3400k.f10956H) {
                            C4325u c4325u4 = c4309e.f14371k;
                            AbstractC3508l abstractC3508lMo7179S3 = c4320p2.mo7179S(2);
                            abstractC3508lMo7179S3.getClass();
                            if ((abstractC3508lMo7179S3 instanceof C3510n) && (c0126eM1102t = m1102t(c4325u4, c4320p2)) != null) {
                                AbstractC3508l abstractC3508l2 = (AbstractC3508l) c0126eM1102t.f332h;
                                C4311g c4311g4 = (C4311g) c0126eM1102t.f333i;
                                abstractC3508l2.getClass();
                                if (abstractC3508l2 instanceof C3509m) {
                                    C4320p c4320p3 = ((C3509m) abstractC3508l2).f11421l;
                                    if (c4320p3 instanceof C3399j) {
                                        Object obj = ((C3399j) c4320p3).f10948o;
                                        if ((obj instanceof C3130c) && (c4311gM8717h = c4325u4.m8717h((C3130c) obj)) != null) {
                                            Integer numValueOf = Integer.valueOf((int) ((C3510n) abstractC3508lMo7179S3).f11422l);
                                            HashMap map = c2978j.f9740g;
                                            C2976i c2976i = map == null ? null : (C2976i) map.get(c4311g4);
                                            if (c2976i == null) {
                                                c2976i = new C2976i();
                                                if (c2978j.f9740g == null) {
                                                    c2978j.f9740g = new HashMap();
                                                }
                                                c2978j.f9740g.put(c4311g4, c2976i);
                                            }
                                            c2976i.f9738a.put(numValueOf, c4311gM8717h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                HashMap map2 = c2978j.f9740g;
                if (map2 == null || map2.isEmpty()) {
                    return true;
                }
                c4309e.m6233y(c2978j);
                return true;
            case 11:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet3 = new HashSet();
                m1106y(c4309e, linkedHashSet, hashSet3);
                if (linkedHashSet.isEmpty()) {
                    c0126e = null;
                } else {
                    if (hashSet3.isEmpty()) {
                        C0086a.m452k("No end types in class hierarchy: ".concat(String.valueOf((Object) c4309e)));
                        return false;
                    }
                    c0126e = new C0126e(new ArrayList(linkedHashSet), i12, hashSet3);
                }
                if (c0126e != null) {
                    HashSet hashSet4 = (HashSet) c0126e.f333i;
                    ArrayList arrayList9 = (ArrayList) c0126e.f332h;
                    Iterator it11 = c4309e.f14380t.iterator();
                    while (it11.hasNext()) {
                        C4322r c4322r7 = (C4322r) it11.next();
                        boolean zM8698W = c4322r7.m8698W();
                        C3131d c3131d2 = c4322r7.f14410k;
                        C4309e c4309e3 = c4322r7.f14411l;
                        if (zM8698W || c4322r7.f14412m.m856h() || c4322r7.f14412m.m853e()) {
                            hashSet = hashSet4;
                            it = it11;
                            arrayList = arrayList9;
                        } else {
                            C2829f c2829f2 = c4322r7.f9217g;
                            C2825b c2825b2 = C2825b.f9203r;
                            C2992x c2992xM1101r = (C2992x) c2829f2.mo6237c(c2825b2);
                            if (c2992xM1101r != null) {
                                it = it11;
                                arrayList = arrayList9;
                            } else {
                                String strM6665j = c3131d2.m6665j(z15, z15);
                                ArrayList arrayList10 = new ArrayList();
                                HashSet hashSet5 = new HashSet();
                                Iterator it12 = arrayList9.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        AbstractC3506j abstractC3506j2 = (AbstractC3506j) it12.next();
                                        C4309e c4309eM8716g = c4309e3.f14371k.m8716g(abstractC3506j2);
                                        if (c4309eM8716g != null) {
                                            String str2 = c3131d2.f10154k;
                                            Iterator it13 = c4309eM8716g.f14380t.iterator();
                                            while (true) {
                                                if (it13.hasNext()) {
                                                    it = it11;
                                                    c4322r = (C4322r) it13.next();
                                                    arrayList = arrayList9;
                                                    if (!c4322r.f14410k.f10154k.equals(str2) || c4322r.f14412m.m856h()) {
                                                        it11 = it;
                                                        arrayList9 = arrayList;
                                                    }
                                                } else {
                                                    it = it11;
                                                    arrayList = arrayList9;
                                                    Iterator it14 = c4309eM8716g.f14380t.iterator();
                                                    while (true) {
                                                        if (it14.hasNext()) {
                                                            C4322r c4322r8 = (C4322r) it14.next();
                                                            C3131d c3131d3 = c4322r8.f14410k;
                                                            if (!c3131d3.f10154k.startsWith(strM6665j) || c4322r8.f14412m.m856h()) {
                                                                it2 = it14;
                                                            } else {
                                                                it2 = it14;
                                                                EnumC3529l enumC3529lM7432d = c4309eM8716g.f14371k.f14441g.f11519c.m7432d(c3131d3.f10151h, c3131d2.f10151h);
                                                                if (enumC3529lM7432d.m7436d()) {
                                                                    c4322r = c4322r8;
                                                                } else if (enumC3529lM7432d == EnumC3529l.f11488n || enumC3529lM7432d == EnumC3529l.f11486l) {
                                                                    c4322r7.m6380I("Possible override for method ".concat(c3131d3.f10153j.f10141j + "." + c3131d3.f10154k));
                                                                }
                                                            }
                                                            it14 = it2;
                                                        } else {
                                                            c4322r = null;
                                                        }
                                                    }
                                                }
                                            }
                                            if (c4322r != null) {
                                                C0192k c0192k2 = c4322r.f14412m;
                                                if (c0192k2.m853e() ? false : (c0192k2.m855g() || c0192k2.m854f()) ? true : Objects.equals(c4322r.f14411l.f14373m.m6645j(), c4309e3.f14373m.m6645j())) {
                                                    arrayList10.add(c4322r);
                                                    C2992x c2992x = (C2992x) c4322r.f9217g.mo6237c(c2825b2);
                                                    if (c2992x != null) {
                                                        if (hashSet4.contains(abstractC3506j2.mo7350l()) && (interfaceC4317m2 = (InterfaceC4317m) AbstractC5798s.m10515i(arrayList10)) != null) {
                                                            hashSet5.add(interfaceC4317m2);
                                                        }
                                                        c2992xM1101r = m1101r(c4322r7, arrayList10, hashSet5, c2992x);
                                                    }
                                                }
                                            }
                                        } else {
                                            it = it11;
                                            arrayList = arrayList9;
                                            C0909b c0909bM2214c = c4309e3.f14371k.f14453s.m2214c(abstractC3506j2);
                                            if (c0909bM2214c != null) {
                                                Iterator it15 = c0909bM2214c.f2829d.entrySet().iterator();
                                                while (true) {
                                                    if (it15.hasNext()) {
                                                        Map.Entry entry2 = (Map.Entry) it15.next();
                                                        if (((String) entry2.getKey()).startsWith(strM6665j)) {
                                                            arrayList10.add((InterfaceC4317m) entry2.getValue());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (hashSet4.contains(abstractC3506j2.mo7350l()) && (interfaceC4317m = (InterfaceC4317m) AbstractC5798s.m10515i(arrayList10)) != null) {
                                            hashSet5.add(interfaceC4317m);
                                        }
                                        it11 = it;
                                        arrayList9 = arrayList;
                                    } else {
                                        it = it11;
                                        arrayList = arrayList9;
                                        c2992xM1101r = m1101r(c4322r7, arrayList10, hashSet5, null);
                                    }
                                }
                            }
                            if (c2992xM1101r != null) {
                                HashSet hashSet6 = c2992xM1101r.f9767i;
                                if (hashSet6.isEmpty()) {
                                    C0086a.m452k("No base methods for override attribute: ".concat(String.valueOf(c2992xM1101r.f9765g)));
                                    return false;
                                }
                                c4322r7.m6233y(c2992xM1101r);
                                String str3 = AbstractC5798s.f23545a;
                                InterfaceC4317m interfaceC4317m4 = (InterfaceC4317m) (hashSet6.size() != 1 ? null : hashSet6.iterator().next());
                                if (interfaceC4317m4 != null) {
                                    AbstractC3506j abstractC3506j3 = c4322r7.f14419t;
                                    C3503g c3503g = AbstractC3506j.f11393j;
                                    EnumC3529l enumC3529l = EnumC3529l.f11483i;
                                    if (abstractC3506j3 == c3503g) {
                                        z11 = false;
                                    } else {
                                        AbstractC3506j abstractC3506jMo2220e = interfaceC4317m4.mo2220e();
                                        if (!c4322r7.f14419t.equals(abstractC3506jMo2220e) && abstractC3506jMo2220e.m7365c()) {
                                            C3528k c3528k = c4309e3.f14371k.f14441g.f11519c;
                                            AbstractC3506j abstractC3506j4 = interfaceC4317m4.mo2222q().f10153j.f10138g;
                                            for (AbstractC3506j abstractC3506j5 : arrayList) {
                                                if (c3528k.m7432d(abstractC3506j5, abstractC3506j4) == enumC3529l && (abstractC3506jM3345l = c4309e3.f14371k.f14443i.m3345l(abstractC3506j5, abstractC3506j5, abstractC3506jMo2220e)) != null && !abstractC3506jM3345l.m7365c() && !abstractC3506jM3345l.equals(c4322r7.f14419t)) {
                                                    c4322r7.f14419t = abstractC3506jM3345l;
                                                    z11 = true;
                                                    if (z11) {
                                                        c4322r7.m6380I("Return type fixed from '" + String.valueOf(abstractC3506j3) + "' to match base method");
                                                    }
                                                }
                                            }
                                            z11 = false;
                                            if (z11) {
                                            }
                                        } else {
                                            z11 = false;
                                            if (z11) {
                                            }
                                        }
                                    }
                                    List listMo2218c = c4322r7.mo2218c();
                                    List listMo2218c2 = interfaceC4317m4.mo2218c();
                                    if (!listMo2218c.equals(listMo2218c2) && (size = listMo2218c.size()) == listMo2218c2.size()) {
                                        ArrayList arrayList11 = new ArrayList(size);
                                        int i16 = 0;
                                        z12 = false;
                                        while (i16 < size) {
                                            ?? r14 = (AbstractC3506j) c4322r7.mo2218c().get(i16);
                                            AbstractC3506j abstractC3506j6 = (AbstractC3506j) interfaceC4317m4.mo2218c().get(i16);
                                            if (!r14.equals(abstractC3506j6) && abstractC3506j6.m7365c()) {
                                                hashSet2 = hashSet4;
                                                C3528k c3528k2 = c4309e3.f14371k.f14441g.f11519c;
                                                interfaceC4317m3 = interfaceC4317m4;
                                                AbstractC3506j abstractC3506j7 = interfaceC4317m3.mo2222q().f10153j.f10138g;
                                                for (AbstractC3506j abstractC3506j8 : arrayList) {
                                                    z14 = z11;
                                                    i10 = size;
                                                    if (c3528k2.m7432d(abstractC3506j8, abstractC3506j7) != enumC3529l || (M3345l = c4309e3.f14371k.f14443i.m3345l(abstractC3506j8, abstractC3506j8, abstractC3506j6)) == null || M3345l.m7365c() || M3345l.equals(r14)) {
                                                        size = i10;
                                                        z11 = z14;
                                                    } else {
                                                        r2 = M3345l;
                                                        if (r2 == null) {
                                                            arrayList11.add(r2);
                                                            z12 = true;
                                                        } else {
                                                            arrayList11.add((AbstractC3506j) listMo2218c.get(i16));
                                                        }
                                                        i16++;
                                                        hashSet4 = hashSet2;
                                                        interfaceC4317m4 = interfaceC4317m3;
                                                        size = i10;
                                                        z11 = z14;
                                                    }
                                                }
                                            } else {
                                                hashSet2 = hashSet4;
                                                interfaceC4317m3 = interfaceC4317m4;
                                            }
                                            z14 = z11;
                                            i10 = size;
                                            r2 = null;
                                            if (r2 == null) {
                                            }
                                            i16++;
                                            hashSet4 = hashSet2;
                                            interfaceC4317m4 = interfaceC4317m3;
                                            size = i10;
                                            z11 = z14;
                                        }
                                        hashSet = hashSet4;
                                        z13 = z11;
                                        if (z12) {
                                            c4322r7.m6380I("Method arguments types fixed to match base method, original types: ".concat(String.valueOf(c4322r7.mo2218c())));
                                            c4322r7.f14420u = Collections.unmodifiableList(arrayList11);
                                            c4322r7.m8697V(arrayList11);
                                        }
                                    } else {
                                        hashSet = hashSet4;
                                        z13 = z11;
                                        z12 = false;
                                    }
                                    if (z13 | z12) {
                                        boolean zM1036a = c4309e3.f14371k.f14435a.m1036a();
                                        String str4 = c3131d2.f10157n;
                                        String strM6660i = C3131d.m6660i(str4, c4322r7.mo2218c(), null);
                                        Iterator it16 = c4309e3.f14380t.iterator();
                                        while (true) {
                                            if (it16.hasNext()) {
                                                C4322r c4322r9 = (C4322r) it16.next();
                                                C3131d c3131d4 = c4322r9.f14410k;
                                                if (c3131d4.f10157n.equals(str4) && c4322r9 != c4322r7 && c3131d4.m6665j(true, false).equals(strM6660i)) {
                                                    if (zM1036a) {
                                                        if (c4322r9.f9217g.mo6235a(EnumC2824a.f9171x) || c4322r9.f9217g.mo6236b(c2825b2)) {
                                                            c4322r9.m6383L("Can't rename method to resolve collision");
                                                        } else {
                                                            C4309e c4309e4 = c4322r9.f14411l;
                                                            String str5 = c3131d4.f10157n;
                                                            int i17 = 2;
                                                            while (true) {
                                                                String str6 = str5 + i17;
                                                                if (c4309e4.m8669n0(str6) == null) {
                                                                    c3131d4.f10157n = str6;
                                                                    c4322r9.m6233y(new C2971f0("avoid collision after fix types in other method"));
                                                                } else {
                                                                    i17++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    c4322r9.m6233y(new C2990v(c4322r7));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    hashSet = hashSet4;
                                }
                            }
                            it11 = it;
                            arrayList9 = arrayList;
                            hashSet4 = hashSet;
                            z15 = false;
                        }
                        it11 = it;
                        arrayList9 = arrayList;
                        hashSet4 = hashSet;
                        z15 = false;
                    }
                }
                return true;
            case 12:
                if (c4309e.f14371k.f14435a.f748q) {
                    m1088X(c4309e);
                }
                Iterator it17 = c4309e.f14380t.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        C4322r c4322r10 = (C4322r) it17.next();
                        if (c4322r10.m8699X()) {
                            c4322r2 = c4322r10;
                        }
                    } else {
                        c4322r2 = null;
                    }
                }
                if (c4322r2 == null && !c4309e.f14380t.isEmpty()) {
                    c4322r2 = (C4322r) c4309e.f14380t.get(0);
                }
                if (c4322r2 != null) {
                    m1109x(c4322r2, c4309e);
                    c4309e.f14381u.forEach(new C0278e0(this, c4322r2, r11 == true ? 1 : 0));
                }
                return true;
            case 18:
                C4325u c4325u5 = c4309e.f14371k;
                if (c4325u5.f14435a.f716B && !c4309e.f14381u.isEmpty()) {
                    C2095f c2095f = c4325u5.f14438d;
                    for (C4311g c4311g5 : c4309e.f14381u) {
                        try {
                            C0192k c0192k3 = c4311g5.f14391m;
                            Object obj2 = (c0192k3.m856h() && c0192k3.m851c() && (c2958a = (C2958a) c4311g5.f9217g.mo6237c(c3126c)) != null && c2958a != C2958a.f9703i && c4311g5.f14393o.isEmpty()) ? c2958a.f9705h : null;
                            if (obj2 != null) {
                                if (c4311g5.f14391m.m855g()) {
                                    ((C3129b) c2095f.f7001b).m6653a(obj2, c4311g5);
                                } else {
                                    c2095f.getClass();
                                    ((C3129b) ((HashMap) c2095f.f7002c).computeIfAbsent(c4311g5.f14389k, new C2833a(5))).m6653a(obj2, c4311g5);
                                }
                            }
                        } catch (Exception e6) {
                            c4309e.m6384M("Failed to process value of field: ".concat(String.valueOf(c4311g5)), e6);
                        }
                    }
                }
                return true;
            default:
                return super.mo1054h(c4309e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m1108s(C4322r c4322r, C2958a c2958a) {
        int i9 = c2958a.f9704g;
        Object obj = c2958a.f9705h;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 12) {
            C4311g c4311gM8717h = c4322r.f14411l.f14371k.m8717h(obj instanceof C2128d ? C3130c.m6654a(c4322r.f14411l.f14371k, (C2128d) obj) : (C3130c) obj);
            if (c4311gM8717h != null) {
                synchronized (c4311gM8717h) {
                    c4311gM8717h.f14393o = AbstractC0283h.m1145Y(c4311gM8717h.f14393o, c4322r);
                }
                return;
            }
            return;
        }
        if (iM8279b == 16) {
            ((List) obj).forEach(new C0278e0(this, c4322r, 1));
        } else {
            if (iM8279b != 17) {
                return;
            }
            ((C2959b) obj).f9708c.forEach(new C0280f0(this, 0, c4322r));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void m1109x(C4322r c4322r, AbstractC2963b0 abstractC2963b0) {
        C3382d c3382d = (C3382d) abstractC2963b0.f9217g.mo6237c(C3126c.f10128a);
        if (c3382d == null) {
            return;
        }
        for (C2959b c2959b : c3382d.f10916g.values()) {
            if (c2959b.f9706a != 3) {
                Iterator it = c2959b.f9708c.entrySet().iterator();
                while (it.hasNext()) {
                    m1108s(c4322r, (C2958a) ((Map.Entry) it.next()).getValue());
                }
            }
        }
    }
}
