package be;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import md.C2825b;
import md.EnumC2824a;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p012ah.C0086a;
import p020b5.C0192k;
import p068eh.AbstractC0921a;
import p082fd.AbstractC1213j;
import p157kd.AbstractC2390d;
import p199nd.C2971f0;
import p199nd.C2972g;
import p199nd.C2973g0;
import p199nd.C2974h;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3501e;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4321q;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4314j;
import p350xd.C5775b;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5781b;
import p351xe.C5791l;
import td.C4145a;

/* JADX INFO: renamed from: be.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0291l extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f846g = 0;

    /* JADX INFO: renamed from: h */
    public Comparable f847h;

    /* JADX INFO: renamed from: i */
    public Object f848i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0291l(String str, Consumer consumer) {
        this.f847h = str;
        this.f848i = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: td.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: td.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: td.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2972g m1208j(C0289k c0289k, C4311g c4311g, C4145a c4145a) {
        Object obj;
        C3130c c3130c;
        C3130c c3130c2;
        C4145a c4145a2 = c4145a;
        C4309e c4309e = (C4309e) c0289k.f839b;
        List list = c4145a2.f14398m;
        C3131d c3131d = c4145a2.f13662o;
        if (list.size() < 1) {
            return null;
        }
        ArrayList arrayList = (ArrayList) c0289k.f840c;
        C4309e c4309eM8715f = c4309e.f14371k.m8715f(c3131d.f10153j);
        if (c4309eM8715f == null) {
            return null;
        }
        if (!c4309eM8715f.equals(c4309e)) {
            if (!c4309eM8715f.f9217g.mo6236b(C2825b.f9193h)) {
                return null;
            }
        }
        if (c4309e.f14371k.m8718i(c3131d) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        c4145a2.mo8340U(arrayList2);
        C4145a c4145a3 = c4145a2;
        if (!arrayList2.isEmpty()) {
            C4145a c4145a4 = (C4145a) c4145a2.mo7167O();
            ArrayList<C3514r> arrayList3 = new ArrayList();
            c4145a4.mo8340U(arrayList3);
            for (C3514r c3514r : arrayList3) {
                C3515s c3515s = c3514r.f11440m;
                C4320p c4320pM10484a = AbstractC5792m.m10484a(c3515s.f11444i.f11420j, EnumC3400k.f10967S);
                if (c4320pM10484a != null) {
                    C3128a c3128a = ((C4145a) c4320pM10484a).f13662o.f10153j;
                    C3128a c3128a2 = c4309e.f14373m;
                    if (c3128a.equals(c3128a2)) {
                        Iterator it = c3515s.f11445j.iterator();
                        c3130c2 = null;
                        while (true) {
                            if (it.hasNext()) {
                                C4320p c4320p = ((C3514r) it.next()).f11420j;
                                if (c4320p == null) {
                                    c3130c2 = null;
                                    c3130c = null;
                                    break;
                                }
                                int iOrdinal = c4320p.f14396k.ordinal();
                                c3130c = null;
                                if (iOrdinal != 25) {
                                    if (iOrdinal != 33) {
                                        if (iOrdinal != 38 || !((C4145a) c4320p).f13662o.f10153j.equals(c3128a2)) {
                                            break;
                                        }
                                    } else {
                                        c3130c2 = (C3130c) ((C3399j) c4320p).f10948o;
                                        if (!c3130c2.f10146g.equals(c3128a2) || !c3130c2.f10148i.equals(c4309e.m8657b0())) {
                                            break;
                                        }
                                    }
                                } else {
                                    AbstractC3508l abstractC3508lMo7179S = ((C4320p) c0289k.f842e).mo7179S(0);
                                    abstractC3508lMo7179S.getClass();
                                    if (!(abstractC3508lMo7179S instanceof C3509m ? ((C3509m) abstractC3508lMo7179S).f11421l : null).equals(c4320p)) {
                                        break;
                                    }
                                }
                            } else {
                                c3130c = null;
                                if (c3130c2 != null) {
                                    arrayList.add(c4320pM10484a);
                                }
                            }
                        }
                    } else {
                        c3130c = null;
                    }
                    c3130c2 = c3130c;
                    if (c3130c2 == null || !c4145a4.mo7181b0(c3514r, AbstractC3508l.m7372Z(new C3399j(EnumC3400k.f10961M, c3130c2, 0)))) {
                        obj = c3130c;
                        break;
                    }
                }
            }
            obj = c4145a4;
            if (obj == null) {
                C0086a.m452k(AbstractC0921a.m2251n("Init of enum field '", c4311g.f14390l.f10147h, "' uses external variables"));
                return null;
            }
            arrayList.add(c4145a2);
            c4145a3 = obj;
        }
        return new C2972g(c4311g, c4145a3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155 A[LOOP:0: B:26:0x0070->B:68:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m1209k(C0289k c0289k, C4320p c4320p) {
        C4320p c4320p2;
        C4311g c4311g;
        C2972g c2972gM1208j;
        C4320p c4320pM10491h;
        ArrayList arrayList = (ArrayList) c0289k.f840c;
        C4309e c4309e = (C4309e) c0289k.f839b;
        int iOrdinal = c4320p.f14396k.ordinal();
        if (iOrdinal == 25) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
                abstractC3508l.getClass();
                boolean z9 = abstractC3508l instanceof C3509m;
                EnumC2824a enumC2824a = EnumC2824a.f9159m;
                EnumC3400k enumC3400k = EnumC3400k.f10967S;
                EnumC3400k enumC3400k2 = EnumC3400k.f10961M;
                if (z9) {
                    C4320p c4320p3 = ((C3509m) abstractC3508l).f11421l;
                    EnumC3400k enumC3400k3 = c4320p3.f14396k;
                    if (enumC3400k3 == enumC3400k2) {
                        c2972gM1208j = m1210m(c0289k, c4320p3);
                    } else {
                        C4145a c4145a = enumC3400k3 == enumC3400k ? (C4145a) c4320p3 : null;
                        if (c4145a != null) {
                            C4311g c4311g2 = new C4311g(c4309e, c4309e.f14371k.f14439e.m1199h(new C3130c(c4309e.f14373m, AbstractC0921a.m2249l(c4145a.f14399n, "EF"), c4309e.m8657b0())), 0);
                            c4311g2.m6231w(enumC2824a);
                            c4311g2.m6381J("Fake field, exist only in values array");
                            c4309e.m8648R(c4311g2);
                            c2972gM1208j = m1208j(c0289k, c4311g2, c4145a);
                        } else {
                            c2972gM1208j = null;
                        }
                    }
                    if (c2972gM1208j == null) {
                        arrayList2.add(c2972gM1208j);
                    }
                } else if (abstractC3508l instanceof C3514r) {
                    C3514r c3514r = (C3514r) abstractC3508l;
                    C4320p c4320pM7394f0 = c3514r.m7394f0();
                    if (c4320pM7394f0 == null || c4320pM7394f0.f14396k != enumC3400k2) {
                        C3515s c3515s = c3514r.f11440m;
                        if (c3515s.f11445j.size() != 0 && (c4320p2 = c3515s.f11444i.f11420j) != null && c4320p2.f14396k == enumC3400k) {
                            C4320p c4320p4 = ((C3514r) c3515s.f11445j.get(0)).f11420j;
                            if (c4320p4 == null || c4320p4.f14396k != EnumC3400k.f10962N || (c4311g = c4309e.m8665l0((C3130c) ((C3399j) c4320p4).f10948o)) == null) {
                                c4311g = null;
                            } else {
                                arrayList.add(c4320p4);
                            }
                            if (c4311g == null) {
                                c4311g = new C4311g(c4309e, c4309e.f14371k.f14439e.m1199h(new C3130c(c4309e.f14373m, AbstractC0921a.m2249l(c3514r.f11439l, "EF"), c4309e.m8657b0())), 0);
                                c4311g.m6231w(enumC2824a);
                                c4311g.m6381J("Fake field, exist only in values array");
                                c4309e.m8648R(c4311g);
                            }
                            c2972gM1208j = m1208j(c0289k, c4311g, (C4145a) c4320p2);
                        }
                    } else {
                        c2972gM1208j = m1210m(c0289k, c4320pM7394f0);
                    }
                    if (c2972gM1208j == null) {
                    }
                }
            }
            arrayList.add(c4320p);
            return arrayList2;
        }
        if (iOrdinal != 28) {
            if (iOrdinal == 34) {
                C4322r c4322rM8718i = c4309e.f14371k.m8718i(((C3403n) c4320p).f11005p);
                if (c4322rM8718i != null && !c4322rM8718i.m8701Z() && (c4320pM10491h = AbstractC5792m.m10491h(AbstractC5792m.m10490g(AbstractC0000a.m57c0((C4305a) AbstractC5798s.m10512f(c4322rM8718i.f14403C.f14352m))))) != null) {
                    List listM1209k = m1209k(c0289k, c4320pM10491h);
                    if (listM1209k != null) {
                        c4322rM8718i.m6231w(EnumC2824a.f9166s);
                    }
                    return listM1209k;
                }
            }
        } else if (c4320p.mo7179S(0).mo7384R()) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2972g m1210m(C0289k c0289k, C4320p c4320p) {
        C4320p c4320pM7394f0;
        C4145a c4145a;
        C4309e c4309e = (C4309e) c0289k.f839b;
        if (c4320p.f14396k == EnumC3400k.f10961M) {
            C3130c c3130c = (C3130c) ((C3399j) c4320p).f10948o;
            ArrayList arrayList = (ArrayList) c0289k.f840c;
            C4311g c4311gM8665l0 = c4309e.m8665l0(c3130c);
            if (c4311gM8665l0 != null) {
                Iterator it = ((ArrayList) c0289k.f838a).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        c4320p = null;
                        break;
                    }
                    for (C4320p c4320p2 : ((C4305a) it.next()).f14351l) {
                        if (c4320p2 != null && c4320p2.f14396k == EnumC3400k.f10962N && Objects.equals(c4309e.m8665l0((C3130c) ((C3399j) c4320p2).f10948o), c4311gM8665l0)) {
                            break loop0;
                        }
                    }
                }
                if (c4320p2 != null) {
                    if (c4320p2.f14398m.size() != 1) {
                        c4145a = null;
                        if (c4145a != null) {
                            C3514r c3514r = c4320p.f14397l;
                            if (c3514r == null || c3514r.f11440m.f11445j.size() == 1) {
                                arrayList.add(c4320p);
                            }
                            arrayList.add(c4320p2);
                            return m1208j(c0289k, c4311gM8665l0, c4145a);
                        }
                    } else {
                        AbstractC3508l abstractC3508lMo7179S = c4320p2.mo7179S(0);
                        abstractC3508lMo7179S.getClass();
                        boolean z9 = abstractC3508lMo7179S instanceof C3509m;
                        EnumC3400k enumC3400k = EnumC3400k.f10967S;
                        if (z9) {
                            C4320p c4320p3 = ((C3509m) abstractC3508lMo7179S).f11421l;
                            if (c4320p3 != null && c4320p3.f14396k == enumC3400k) {
                                c4145a = (C4145a) c4320p3;
                            }
                            if (c4145a != null) {
                            }
                        } else {
                            if ((abstractC3508lMo7179S instanceof C3514r) && (c4320pM7394f0 = ((C3514r) abstractC3508lMo7179S).m7394f0()) != null && c4320pM7394f0.f14396k == enumC3400k) {
                                c4145a = (C4145a) c4320pM7394f0;
                            }
                            if (c4145a != null) {
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public String mo1051e() {
        switch (this.f846g) {
            case 1:
                return (String) this.f847h;
            default:
                return super.mo1051e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public void mo1052f(C4325u c4325u) {
        switch (this.f846g) {
            case 0:
                C3501e c3501e = AbstractC3506j.f11397n;
                this.f847h = C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, c3501e), "valueOf", Arrays.asList(AbstractC3506j.f11395l, AbstractC3506j.f11396m), c3501e);
                C3501e c3501e2 = AbstractC3506j.f11394k;
                this.f848i = C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, c3501e2), "clone", Collections.EMPTY_LIST, c3501e2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public void mo1053g(C4322r c4322r) {
        switch (this.f846g) {
            case 1:
                ((Consumer) this.f848i).accept(c4322r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public boolean mo1054h(C4309e c4309e) {
        boolean zM1211i;
        switch (this.f846g) {
            case 0:
                if (!c4309e.m8658c0()) {
                    return true;
                }
                try {
                    zM1211i = m1211i(c4309e);
                    break;
                } catch (Exception e6) {
                    c4309e.m6384M("Enum visitor error", e6);
                    zM1211i = false;
                }
                if (zM1211i) {
                    return true;
                }
                C0192k c0192k = c4309e.f14375o;
                if (!c0192k.m850b()) {
                    return true;
                }
                c4309e.f14375o = c0192k.m860m(16384);
                c4309e.m6383L("Failed to restore enum class, 'enum' modifier and super class removed");
                return true;
            default:
                return super.mo1054h(c4309e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1211i(C4309e c4309e) {
        C5781b c5781b;
        EnumC3400k enumC3400k;
        EnumC2824a enumC2824a;
        long jSum;
        C4322r c4322r;
        C3130c c3130c;
        long jSum2;
        C3399j c3399j;
        C3403n c3403n;
        String str;
        Iterator it;
        C4309e c4309eM8715f;
        C0291l c0291l = this;
        AbstractC3506j abstractC3506j = c4309e.f14376p;
        C4325u c4325u = c4309e.f14371k;
        if (abstractC3506j != null && abstractC3506j.mo7350l().equals(AbstractC3506j.f11397n.f11369K)) {
            c4309e.m6231w(EnumC2824a.f9169v);
        }
        C4322r c4322rM8667m0 = c4309e.m8667m0("<clinit>()V");
        int i9 = 0;
        if (c4322rM8667m0 == null) {
            c4309e.m6383L("Enum class init method not found");
            return false;
        }
        C5775b c5775b = c4322rM8667m0.f14407G;
        if (c5775b != null && !c4322rM8667m0.f14425z.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC4314j interfaceC4314j : c5775b.f23507k) {
                if (!(interfaceC4314j instanceof C4305a)) {
                    break;
                }
                arrayList.add((C4305a) interfaceC4314j);
            }
            if (arrayList.isEmpty()) {
                c4309e.m6383L("Unexpected branching in enum static init block");
                return false;
            }
            C0289k c0289k = new C0289k(c4309e, arrayList);
            C4309e c4309e2 = (C4309e) c0289k.f839b;
            ArrayList arrayList2 = (ArrayList) c0289k.f840c;
            C3128a c3128a = c4309e2.f14373m;
            C4325u c4325u2 = c4309e2.f14371k;
            List list = (List) c4309e2.f14381u.stream().filter(new C0019b(3)).filter(new C0019b(4)).filter(new C0285i(c3128a.f10138g, 1)).collect(Collectors.toList());
            if (list.isEmpty()) {
                c4309e2.m6383L("$VALUES field not found");
                return false;
            }
            if (list.size() > 1) {
                list.removeIf(new C0019b(5));
            }
            if (list.size() > 1) {
                Optional optionalFindAny = list.stream().filter(new C0019b(6)).findAny();
                if (optionalFindAny.isPresent()) {
                    list.clear();
                    list.add((C4311g) optionalFindAny.get());
                }
            }
            if (list.size() != 1) {
                c4309e2.m6383L("Found several \"values\" enum fields: ".concat(String.valueOf(list)));
                return false;
            }
            C4311g c4311g = (C4311g) list.get(0);
            c0289k.f841d = c4311g;
            C3130c c3130c2 = c4311g.f14390l;
            Iterator it2 = ((ArrayList) c0289k.f838a).iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    c5781b = null;
                    break;
                }
                C4305a c4305a = (C4305a) it2.next();
                for (C4320p c4320p : c4305a.f14351l) {
                    if (c4320p.f14396k == EnumC3400k.f10962N) {
                        C3399j c3399j2 = (C3399j) c4320p;
                        if (((C3130c) c3399j2.f10948o).equals(c3130c2)) {
                            c5781b = new C5781b(c4305a, c3399j2);
                            break loop1;
                        }
                    }
                }
            }
            if (c5781b != null) {
                C4320p c4320p2 = c5781b.f23521b;
                c0289k.f842e = c4320p2;
                AbstractC3508l abstractC3508lMo7179S = c4320p2.mo7179S(0);
                abstractC3508lMo7179S.getClass();
                List listM1209k = abstractC3508lMo7179S instanceof C3509m ? m1209k(c0289k, ((C3509m) abstractC3508lMo7179S).f11421l) : null;
                if (listM1209k == null) {
                    c4309e.m6383L("Unknown enum class pattern. Please report as an issue!");
                    return false;
                }
                arrayList2.add((C4320p) c0289k.f842e);
                C2974h c2974h = new C2974h(listM1209k);
                c2974h.f9734h = c4322rM8667m0;
                c4309e.m6233y(c2974h);
                Iterator it3 = listM1209k.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    enumC3400k = EnumC3400k.f10961M;
                    enumC2824a = EnumC2824a.f9166s;
                    if (!zHasNext) {
                        break;
                    }
                    C2972g c2972g = (C2972g) it3.next();
                    C4145a c4145a = c2972g.f9730b;
                    C4311g c4311g2 = c2972g.f9729a;
                    C3130c c3130c3 = c4311g2.f14390l;
                    AbstractC3508l abstractC3508lMo7179S2 = c4145a.mo7179S(i9);
                    abstractC3508lMo7179S2.getClass();
                    if (abstractC3508lMo7179S2 instanceof C3509m) {
                        Object objM10489f = AbstractC5792m.m10489f(c4325u, ((C3509m) abstractC3508lMo7179S2).f11421l);
                        str = objM10489f instanceof String ? (String) objM10489f : null;
                    }
                    if (str != null && !c3130c3.f10149j.equals(str) && AbstractC2390d.m5714c(str) && c4325u.f14435a.m1036a()) {
                        c3130c3.f10149j = str;
                    }
                    c4311g2.m6231w(enumC2824a);
                    C4145a c4145a2 = c2972g.f9730b;
                    C3131d c3131d = c4145a2.f13662o;
                    C3128a c3128a2 = c3131d.f10153j;
                    C4325u c4325u3 = c4325u;
                    if (c3128a2.equals(c4309e2.f14373m) || (c4309eM8715f = c4325u2.m8715f(c3128a2)) == null) {
                        it = it3;
                    } else {
                        Iterator it4 = c4309eM8715f.f14380t.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it3;
                            C4322r c4322r2 = (C4322r) it4.next();
                            Iterator it6 = it4;
                            if (c4322r2.f14412m.m849a()) {
                                c4322r2.m6231w(enumC2824a);
                            }
                            it4 = it6;
                            it3 = it5;
                        }
                        it = it3;
                        c2972g.f9731c = c4309eM8715f;
                        if (!c4309eM8715f.f14384x.equals(c4309e2)) {
                            c4309e2.m8649S(c4309eM8715f);
                            c4309eM8715f.m6231w(enumC2824a);
                        }
                    }
                    C4322r c4322rM8718i = c4325u2.m8718i(c3131d);
                    if (c4322rM8718i != null) {
                        C2973g0.m6391b(c4322rM8718i, 0);
                        if (c4322rM8718i.f14410k.f10152i.size() > 1) {
                            C2973g0.m6391b(c4322rM8718i, 1);
                        }
                    }
                    C3514r c3514r = c4145a2.f14397l;
                    if (c3514r == null || c3514r.f11440m.f11445j.size() <= 2) {
                        arrayList2.add(c4145a2);
                    } else if (c3514r.f11440m.f11445j.stream().anyMatch(new C0285i(c0289k, 0))) {
                        C3399j c3399j3 = new C3399j(enumC3400k, c3130c3, 0);
                        c3399j3.m8688d0(c3514r.mo7374H());
                        Iterator it7 = c4322rM8667m0.f14425z.iterator();
                        while (it7.hasNext() && !AbstractC0000a.m20K0(c4322rM8667m0, (C4305a) it7.next(), c4145a2, c3399j3)) {
                        }
                    }
                    c4325u = c4325u3;
                    it3 = it;
                    i9 = 0;
                }
                ((C4311g) c0289k.f841d).m6231w(enumC2824a);
                C5791l.m10479k(c4322rM8667m0, arrayList2);
                Iterator it8 = c4322rM8667m0.f14425z.iterator();
                while (it8.hasNext()) {
                    C5791l.m10473e(((C4305a) it8.next()).f14351l, arrayList2);
                }
                C4320p[] c4320pArr = c4322rM8667m0.f14424y;
                if (c4320pArr != null) {
                    jSum = c4320pArr.length;
                } else {
                    List list2 = c4322rM8667m0.f14425z;
                    jSum = list2 != null ? list2.stream().mapToLong(new C4321q()).sum() : -1L;
                }
                if (jSum == 0) {
                    c4322rM8667m0.m6231w(enumC2824a);
                } else if (!arrayList2.isEmpty()) {
                    C0271b.m1089Y(c4322rM8667m0);
                }
                C4311g c4311g3 = (C4311g) c0289k.f841d;
                AbstractC3506j abstractC3506j2 = c4309e.f14373m.f10138g;
                C3503g c3503g = AbstractC3506j.f11385b;
                String strConcat = "values()".concat(AbstractC1213j.m3333b(new C3497a(abstractC3506j2)));
                C4322r c4322r3 = null;
                for (C4322r c4322r4 : c4309e.f14380t) {
                    C3131d c3131d2 = c4322r4.f14410k;
                    boolean zM6662e = c3131d2.m6662e();
                    String str2 = c3131d2.f10154k;
                    if (!zM6662e && !c4322r4.f14415p) {
                        if (c3131d2.m6663f()) {
                            if (str2.equals("<init>(Ljava/lang/String;I)V") || str2.equals("<init>(Ljava/lang/String;)V")) {
                                C4320p[] c4320pArr2 = c4322r4.f14424y;
                                if (c4320pArr2 != null) {
                                    jSum2 = c4320pArr2.length;
                                } else {
                                    List list3 = c4322r4.f14425z;
                                    jSum2 = list3 != null ? list3.stream().mapToLong(new C4321q()).sum() : -1L;
                                }
                                if (jSum2 == 0) {
                                    c4322r4.m6231w(enumC2824a);
                                }
                            }
                            C2973g0.m6391b(c4322r4, 0);
                            if (c4322r4.f14410k.f10152i.size() > 1) {
                                C2973g0.m6391b(c4322r4, 1);
                            }
                        } else if (str2.equals(strConcat)) {
                            if (c0291l.m1212l(c4322r4, abstractC3506j2)) {
                                c4322r4.m6231w(enumC2824a);
                                c4322r3 = c4322r4;
                            } else {
                                c3131d2.f10157n = "valuesCustom";
                                C2971f0 c2971f0 = new C2971f0(c4322r4);
                                c2971f0.m6390b("to resolve conflict with enum method");
                                c4322r4.m6233y(c2971f0);
                            }
                        } else if (c0291l.m1212l(c4322r4, abstractC3506j2)) {
                            if (!c3131d2.f10157n.equals("values") && !c4322r4.f14408H.isEmpty()) {
                                c3131d2.f10157n = "values";
                                C2971f0 c2971f02 = new C2971f0(c4322r4);
                                c2971f02.m6390b("to match enum method name");
                                c4322r4.m6233y(c2971f02);
                                c4322r4.m6231w(EnumC2824a.f9171x);
                            }
                            c4322r4.m6231w(enumC2824a);
                            c4322r3 = c4322r4;
                        } else {
                            C0019b c0019b = new C0019b(7);
                            InterfaceC2844b interfaceC2844b = AbstractC5792m.f23539a;
                            C4320p c4320pM10496m = (c4322r4.f14415p || c4322r4.f14403C.f14352m.size() != 1) ? null : AbstractC5792m.m10496m(c4322r4, EnumC3400k.f10986p, c0019b);
                            if (c4320pM10496m != null && (c3399j = (C3399j) AbstractC5792m.m10484a(AbstractC5792m.m10491h(AbstractC5792m.m10490g(c4320pM10496m)), EnumC3400k.f10949A)) != null && Objects.equals(c3399j.f10948o, abstractC3506j2) && (c3403n = (C3403n) AbstractC5792m.m10484a(AbstractC5792m.m10491h(AbstractC5792m.m10490g(c3399j)), EnumC3400k.f10963O)) != null && c3403n.f11005p.equals((C3131d) c0291l.f847h)) {
                                c4322r4.m6231w(enumC2824a);
                            }
                        }
                    }
                }
                C3130c c3130c4 = c4311g3.f14390l;
                for (C4322r c4322r5 : c4309e.f14380t) {
                    C3131d c3131d3 = c4322r5.f14410k;
                    if (c3131d3.m6663f() || c3131d3.m6662e() || c4322r5.f14415p || c4322r5 == c4322r3) {
                        c4322r = c4322r3;
                    } else {
                        C0285i c0285i = new C0285i(c3130c4, 2);
                        if (AbstractC5792m.m10496m(c4322r5, enumC3400k, c0285i) == null) {
                            c4322r = c4322r3;
                        } else {
                            c4322r = c4322r3;
                            c3130c = c3130c4;
                            C0287j c0287j = new C0287j(c0291l, c0285i, c4322r, c4322r5, abstractC3506j2, c3130c);
                            for (C4305a c4305a2 : c4322r5.f14425z) {
                                ArrayList arrayList3 = c4305a2.f14351l;
                                int size = arrayList3.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    C4320p c4320p3 = (C4320p) arrayList3.get(i10);
                                    AbstractC5792m.m10495l(c4322r5, c4320p3, c0287j);
                                    C4320p c4320p4 = (C4320p) c0287j.apply(c4320p3);
                                    if (c4320p4 != null) {
                                        AbstractC0000a.m18J0(c4322r5, c4305a2, i10, c4320p4);
                                    }
                                }
                            }
                            c0291l = this;
                            c3130c4 = c3130c;
                            c4322r3 = c4322r;
                        }
                    }
                    c3130c = c3130c4;
                    c0291l = this;
                    c3130c4 = c3130c;
                    c4322r3 = c4322r;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public boolean m1212l(C4322r c4322r, AbstractC3506j abstractC3506j) {
        C4320p c4320pM64f0;
        C3399j c3399j;
        C3403n c3403n;
        AbstractC3506j abstractC3506j2 = c4322r.f14419t;
        abstractC3506j2.getClass();
        return (abstractC3506j2 instanceof C3497a) && abstractC3506j2.mo7340g().equals(abstractC3506j) && (c4320pM64f0 = AbstractC0000a.m64f0(c4322r)) != null && c4320pM64f0.f14396k == EnumC3400k.f10986p && c4320pM64f0.f14398m.size() == 1 && (c3399j = (C3399j) AbstractC5792m.m10484a(AbstractC5792m.m10491h(AbstractC5792m.m10490g(c4320pM64f0)), EnumC3400k.f10949A)) != null && Objects.equals(c3399j.f10948o, new C3497a(abstractC3506j)) && (c3403n = (C3403n) AbstractC5792m.m10484a(AbstractC5792m.m10491h(AbstractC5792m.m10490g(c3399j)), EnumC3400k.f10963O)) != null && c3403n.f11005p.equals((C3131d) this.f848i);
    }

    public /* synthetic */ C0291l() {
    }
}
