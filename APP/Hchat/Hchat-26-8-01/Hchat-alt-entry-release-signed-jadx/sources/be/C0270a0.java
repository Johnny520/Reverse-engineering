package be;

import ae.C0071b;
import ae.C0073d;
import ae.C0075f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import md.C2825b;
import md.EnumC2824a;
import p007a7.C0019b;
import p066ed.C0909b;
import p066ed.C0910c;
import p066ed.C0911d;
import p083fe.C1214a;
import p157kd.AbstractC2390d;
import p199nd.C2994z;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3131d;
import p232pc.C3383e;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3501e;
import p246qd.C3509m;
import p246qd.C3514r;
import p247qe.EnumC3529l;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p318vd.C4548a;
import p351xe.AbstractC5798s;
import p351xe.C5796q;

/* JADX INFO: renamed from: be.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0270a0 extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f796g;

    /* JADX INFO: renamed from: h */
    public C4325u f797h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ud.u.<init>(bc.k):void] */
    public /* synthetic */ C0270a0(int i9) {
        this.f796g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0049 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX INFO: renamed from: k */
    public static List m1055k(C4309e c4309e, List list, AbstractC3506j abstractC3506j, List list2) {
        ?? arrayList;
        if (!list2.isEmpty() || !abstractC3506j.equals(AbstractC3506j.f11394k)) {
            HashSet hashSet = new HashSet();
            abstractC3506j.m7363C(new C0292l0(hashSet, 0));
            list2.forEach(new C0308z(hashSet, 2));
            if (!hashSet.isEmpty()) {
                if (c4309e.m8659d0()) {
                    arrayList = new ArrayList(list);
                    C4309e c4309e2 = c4309e;
                    for (C4309e c4309e3 = c4309e.f14384x; c4309e3 != c4309e2; c4309e3 = c4309e3.f14384x) {
                        arrayList.addAll(c4309e3.f14378r);
                        c4309e2 = c4309e3;
                    }
                } else {
                    arrayList = list;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((AbstractC3506j) it.next()).mo7350l());
                }
                if (!hashSet.isEmpty()) {
                    c4309e.m6381J("Add missing generic type declarations: ".concat(String.valueOf(hashSet)));
                    ArrayList arrayList2 = new ArrayList(hashSet.size() + list.size());
                    arrayList2.addAll(list);
                    hashSet.stream().sorted().map(new C0073d(17)).forEach(new C0294m0(0, arrayList2));
                    return arrayList2;
                }
            }
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static List m1056m(C4309e c4309e, List list) {
        List list2 = c4309e.f14377q;
        if (list.isEmpty()) {
            return list2;
        }
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(size2);
        int iMin = Math.min(size2, size);
        for (int i9 = 0; i9 < size2; i9++) {
            if (i9 < iMin) {
                AbstractC3506j abstractC3506j = (AbstractC3506j) list.get(i9);
                AbstractC3506j abstractC3506j2 = (AbstractC3506j) list2.get(i9);
                if (abstractC3506j != null) {
                    if (!abstractC3506j.mo7351v()) {
                        c4309e.m6383L("Incorrect class signature, class is not an object: ".concat(String.valueOf(abstractC3506j)));
                        abstractC3506j = abstractC3506j2;
                    }
                    arrayList.add(abstractC3506j);
                } else {
                    abstractC3506j = abstractC3506j2;
                    arrayList.add(abstractC3506j);
                }
            } else {
                arrayList.add((AbstractC3506j) list2.get(i9));
            }
        }
        if (size2 < size) {
            c4309e.m6383L("Unexpected interfaces in signature: ".concat(String.valueOf(list.subList(size2, size))));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public String mo1051e() {
        switch (this.f796g) {
            case 1:
                return "SignatureProcessor";
            default:
                return super.mo1051e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        switch (this.f796g) {
            case 0:
                this.f797h = c4325u;
                break;
            default:
                this.f797h = c4325u;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public void mo1053g(C4322r c4322r) {
        List<C4305a> list;
        boolean z9;
        switch (this.f796g) {
            case 0:
                C2994z c2994z = (C2994z) c4322r.f9217g.mo6237c(C2825b.f9207v);
                if (c2994z == null) {
                    c2994z = new C2994z(new HashSet());
                    c4322r.m6233y(c2994z);
                }
                HashSet<String> hashSet = c2994z.f9769g;
                if (!c2994z.f9770h) {
                    c2994z.f9770h = true;
                    if (!c4322r.f14415p && (list = c4322r.f14425z) != null) {
                        try {
                            for (C4305a c4305a : list) {
                                if (!c4305a.f9217g.mo6235a(EnumC2824a.f9168u)) {
                                    z9 = c4305a.f9217g.mo6235a(EnumC2824a.f9166s);
                                }
                                HashSet hashSet2 = new HashSet();
                                C0071b c0071b = (C0071b) c4305a.f9217g.mo6237c(C2825b.f9179F);
                                if (c0071b != null) {
                                    for (C0075f c0075f : c0071b.f228g) {
                                        if (!c0075f.m444c()) {
                                            hashSet2.add(c0075f.m443b().toString());
                                        }
                                        break;
                                    }
                                }
                                Iterator it = c4305a.f14351l.iterator();
                                while (it.hasNext()) {
                                    m1058j(c4322r, (C4320p) it.next(), hashSet2, z9);
                                }
                            }
                        } catch (Exception e6) {
                            c4322r.m6384M("Failed to analyze thrown exceptions", e6);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                C3383e c3383e = (C3383e) c4322r.f9217g.mo6237c(C3126c.f10136i);
                if (c3383e != null) {
                    List list2 = c3383e.f10917g;
                    if (!list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            AbstractC3506j abstractC3506jM7360x = AbstractC3506j.m7360x((String) it2.next());
                            if (m1061o(abstractC3506jM7360x) == 4) {
                                arrayList.add(abstractC3506jM7360x);
                            } else {
                                hashSet.add(((C3501e) abstractC3506jM7360x).f11369K);
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    c4322r.m6383L("Byte code manipulation detected: skipped illegal throws declarations: ".concat(String.valueOf(arrayList)));
                }
                if (hashSet.contains("java.lang.Exception")) {
                    hashSet.removeIf(new C0019b(13));
                } else if (hashSet.contains("java.lang.Throwable")) {
                    hashSet.removeIf(new C0019b(14));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : hashSet) {
                        for (String str2 : hashSet) {
                            if (!str.equals(str2)) {
                                if (str.equals(str2) ? true : this.f797h.f14453s.m2215d(str).contains(str2)) {
                                    arrayList2.add(str);
                                }
                            }
                        }
                    }
                    arrayList2.forEach(new C0308z(hashSet, 0));
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x00ef */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.HashSet, java.util.Set] */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public boolean mo1054h(C4309e c4309e) {
        ?? hashSet;
        switch (this.f796g) {
            case 1:
                C4548a c4548aM8972g = C4548a.m8972g(c4309e);
                if (c4548aM8972g != null) {
                    try {
                        List listM8974b = c4548aM8972g.m8974b();
                        AbstractC3506j abstractC3506jM8977e = c4548aM8972g.m8977e();
                        AbstractC3506j abstractC3506j = c4309e.f14376p;
                        if (Objects.equals(abstractC3506jM8977e.mo7350l(), c4309e.f14373m.f10138g.mo7350l())) {
                            c4309e.m6383L("Incorrect class signature: super class is equals to this class");
                        } else {
                            if (!abstractC3506jM8977e.mo7351v()) {
                                c4309e.m6383L("Incorrect class signature, class is not an object: ".concat(String.valueOf(abstractC3506jM8977e)));
                                abstractC3506jM8977e = abstractC3506j;
                            }
                            abstractC3506j = abstractC3506jM8977e;
                        }
                        List arrayList = null;
                        while (true) {
                            AbstractC3506j abstractC3506jM8977e2 = c4548aM8972g.m8977e();
                            if (abstractC3506jM8977e2 == null) {
                                if (arrayList == null) {
                                    arrayList = Collections.EMPTY_LIST;
                                }
                                List listM1056m = m1056m(c4309e, arrayList);
                                c4309e.f14378r = m1055k(c4309e, listM8974b, abstractC3506j, listM1056m);
                                c4309e.f14376p = abstractC3506j;
                                c4309e.f14377q = listM1056m;
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(abstractC3506jM8977e2);
                            }
                        }
                    } catch (Exception e6) {
                        c4309e.m6384M("Failed to parse class signature: " + c4548aM8972g.f15004a, e6);
                    }
                    break;
                }
                for (C4311g c4311g : c4309e.f14381u) {
                    C4548a c4548aM8972g2 = C4548a.m8972g(c4311g);
                    if (c4548aM8972g2 != null) {
                        String str = c4548aM8972g2.f15004a;
                        C4309e c4309e2 = c4311g.f14389k;
                        try {
                            AbstractC3506j abstractC3506jM8977e3 = c4548aM8972g2.m8977e();
                            if (abstractC3506jM8977e3 != null) {
                                if (m1062p(abstractC3506jM8977e3)) {
                                    this.f797h.f14443i.getClass();
                                    if (abstractC3506jM8977e3.m7365c()) {
                                        if (c4309e2.m8659d0()) {
                                            hashSet = new HashSet(c4309e2.f14378r);
                                            C4309e c4309e3 = c4309e2;
                                            for (C4309e c4309e4 = c4309e2.f14384x; c4309e4 != c4309e3; c4309e4 = c4309e4.f14384x) {
                                                hashSet.addAll(c4309e4.f14378r);
                                                c4309e3 = c4309e4;
                                            }
                                        } else {
                                            hashSet = c4309e2.f14378r;
                                        }
                                        C1214a.m3334b(c4309e2, abstractC3506jM8977e3, hashSet);
                                    }
                                    if (m1063q(abstractC3506jM8977e3, c4311g.f14392n)) {
                                        c4311g.f14392n = abstractC3506jM8977e3;
                                    } else {
                                        c4311g.m6381J("Incorrect field signature: " + str);
                                    }
                                } else {
                                    c4311g.m6383L("Incorrect inner types in field signature: " + str);
                                }
                            }
                        } catch (Exception e7) {
                            c4309e2.m6384M("Field signature parse error: " + c4311g.f14390l.f10147h, e7);
                        }
                    }
                }
                for (C4322r c4322r : c4309e.f14380t) {
                    C4548a c4548aM8972g3 = C4548a.m8972g(c4322r);
                    if (c4548aM8972g3 != null) {
                        try {
                            List listM8974b2 = c4548aM8972g3.m8974b();
                            List listM8975c = c4548aM8972g3.m8975c(c4322r.f14410k.f10152i.size());
                            AbstractC3506j abstractC3506jM8977e4 = c4548aM8972g3.m8977e();
                            if (m1062p(abstractC3506jM8977e4)) {
                                Iterator it = listM8975c.iterator();
                                while (it.hasNext()) {
                                    if (!m1062p((AbstractC3506j) it.next())) {
                                    }
                                }
                                c4322r.f14421v = listM8974b2;
                                C1214a c1214a = this.f797h.f14443i;
                                c1214a.getClass();
                                C1214a.m3335c(c4322r, abstractC3506jM8977e4);
                                if (!m1060n(c4322r, c4548aM8972g3, abstractC3506jM8977e4, AbstractC5798s.m10509c(listM8975c, new C0293m(c1214a, 1, c4322r)))) {
                                    c4322r.f14421v = Collections.EMPTY_LIST;
                                }
                            }
                            c4322r.m6383L("Incorrect inner types in method signature: " + c4548aM8972g3.f15004a);
                        } catch (Exception e10) {
                            c4322r.m6384M("Failed to parse method signature: " + c4548aM8972g3.f15004a, e10);
                        }
                    }
                }
                return true;
            default:
                return super.mo1054h(c4309e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public List m1057i(C4322r c4322r, C4548a c4548a, List list) {
        String str = c4548a.f15004a;
        C3131d c3131d = c4322r.f14410k;
        List list2 = c3131d.f10152i;
        int size = list.size();
        if (size == list2.size()) {
            for (int i9 = 0; i9 < size; i9++) {
                if (!m1063q((AbstractC3506j) list.get(i9), (AbstractC3506j) list2.get(i9))) {
                    c4322r.m6383L("Incorrect types in method signature: " + str);
                    return null;
                }
            }
            return list;
        }
        if (c4322r.f14411l.f14375o.m850b()) {
            return null;
        }
        if (c3131d.m6663f() && !list2.isEmpty() && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(0, (AbstractC3506j) list2.get(0));
            if (arrayList.size() == list2.size()) {
                return arrayList;
            }
        }
        c4322r.m6380I("Incorrect args count in method signature: " + str);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m1058j(C4322r c4322r, C4320p c4320p, HashSet hashSet, boolean z9) {
        List list;
        C4320p c4320pM7394f0;
        if (!z9 && c4320p.f14396k == EnumC3400k.f10988r) {
            if (!c4320p.f9217g.mo6235a(EnumC2824a.f9166s)) {
                AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                if (!(abstractC3508lMo7179S instanceof C3514r)) {
                    if (abstractC3508lMo7179S instanceof C3509m) {
                        m1064r(c4322r, ((C3509m) abstractC3508lMo7179S).f11419i, hashSet);
                        return;
                    }
                    return;
                }
                C3514r c3514r = (C3514r) abstractC3508lMo7179S;
                AbstractC3506j abstractC3506jMo7375I = c3514r.mo7375I();
                if (abstractC3506jMo7375I.equals(AbstractC3506j.f11398o) && (c4320pM7394f0 = c3514r.m7394f0()) != null && c4320pM7394f0.f14396k == EnumC3400k.f10989s) {
                    if (c4320pM7394f0.f14397l.f9217g.mo6235a(EnumC2824a.f9130P)) {
                        return;
                    }
                }
                m1064r(c4322r, abstractC3506jMo7375I, hashSet);
                return;
            }
        }
        if (c4320p.f14396k == EnumC3400k.f10963O) {
            C3131d c3131d = ((C3403n) c4320p).f11005p;
            String strM6665j = c3131d.m6665j(false, true);
            C3128a c3128a = c3131d.f10153j;
            C4309e c4309eM8715f = this.f797h.m8715f(c3128a);
            C2825b c2825b = C2825b.f9207v;
            C0911d c0911d = null;
            C4322r c4322r2 = null;
            if (c4309eM8715f == null) {
                C0909b c0909bM2214c = this.f797h.f14453s.m2214c(c3128a.f10138g);
                if (c0909bM2214c != null) {
                    Iterator it = c0909bM2214c.f2829d.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((String) entry.getKey()).startsWith(strM6665j)) {
                            c0911d = (C0911d) entry.getValue();
                            break;
                        }
                    }
                    if (c0911d == null || (list = c0911d.f2842k) == null || list.isEmpty() || ((C2994z) c4322r.f9217g.mo6237c(c2825b)) == null) {
                        return;
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        m1064r(c4322r, (AbstractC3506j) it2.next(), hashSet);
                    }
                    return;
                }
                return;
            }
            String str = c3131d.f10154k;
            Iterator it3 = c4309eM8715f.f14380t.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    Iterator it4 = c4309eM8715f.f14380t.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C4322r c4322r3 = (C4322r) it4.next();
                        if (c4322r3.f14410k.f10154k.startsWith(strM6665j) && !c4322r3.f14412m.m856h() && c4309eM8715f.f14371k.f14441g.f11519c.m7432d(c4322r3.f14410k.f10151h, c3131d.f10151h).m7436d()) {
                            c4322r2 = c4322r3;
                            break;
                        }
                    }
                } else {
                    C4322r c4322r4 = (C4322r) it3.next();
                    if (c4322r4.f14410k.f10154k.equals(str)) {
                        c4322r2 = c4322r4;
                        break;
                    }
                }
            }
            if (c4322r2 == null) {
                return;
            }
            mo1053g(c4322r2);
            C2994z c2994z = (C2994z) c4322r2.f9217g.mo6237c(c2825b);
            if (((C2994z) c4322r.f9217g.mo6237c(c2825b)) == null || c2994z == null) {
                return;
            }
            HashSet hashSet2 = c2994z.f9769g;
            if (hashSet2.isEmpty()) {
                return;
            }
            Iterator it5 = hashSet2.iterator();
            while (it5.hasNext()) {
                m1064r(c4322r, AbstractC3506j.m7360x((String) it5.next()), hashSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public boolean m1059l(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        if (abstractC3506j.equals(abstractC3506j2)) {
            return true;
        }
        C0910c c0910c = this.f797h.f14453s;
        String strMo7350l = abstractC3506j.mo7350l();
        return c0910c.m2215d(strMo7350l).contains(abstractC3506j2.mo7350l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public boolean m1060n(C4322r c4322r, C4548a c4548a, AbstractC3506j abstractC3506j, List list) {
        String str = c4548a.f15004a;
        try {
            if (!m1063q(abstractC3506j, c4322r.f14410k.f10151h)) {
                c4322r.m6383L("Incorrect return type in method signature: " + str);
                return false;
            }
            List listM1057i = m1057i(c4322r, c4548a, list);
            if (listM1057i == null) {
                return false;
            }
            c4322r.f14420u = Collections.unmodifiableList(listM1057i);
            c4322r.f14419t = abstractC3506j;
            return true;
        } catch (Exception e6) {
            c4322r.m6384M("Type validation failed for signature: " + str, e6);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public int m1061o(AbstractC3506j abstractC3506j) {
        if (abstractC3506j == null || abstractC3506j.equals(AbstractC3506j.f11394k)) {
            return 4;
        }
        if (!abstractC3506j.mo7345w()) {
            return 3;
        }
        if (!this.f797h.f14453s.f2834b.containsKey(abstractC3506j.mo7350l())) {
            return 3;
        }
        if (m1059l(abstractC3506j, AbstractC3506j.f11401r) || m1059l(abstractC3506j, AbstractC3506j.f11399p)) {
            return 2;
        }
        return (m1059l(abstractC3506j, AbstractC3506j.f11398o) || m1059l(abstractC3506j, AbstractC3506j.f11400q)) ? 1 : 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public boolean m1062p(AbstractC3506j abstractC3506j) {
        AbstractC3506j abstractC3506jMo7352k = abstractC3506j.mo7352k();
        if (abstractC3506jMo7352k != null) {
            C4309e c4309eM8716g = this.f797h.m8716g(abstractC3506j.mo7353m());
            if (c4309eM8716g != null) {
                String str = abstractC3506jMo7352k.mo7353m() != null ? ((C3501e) abstractC3506jMo7352k.mo7353m()).f11369K : ((C3501e) abstractC3506jMo7352k).f11369K;
                if (!str.contains(".")) {
                    Iterator it = c4309eM8716g.f14382v.iterator();
                    while (it.hasNext()) {
                        if (((C4309e) it.next()).f14373m.m6646k().equals(str)) {
                        }
                    }
                    return false;
                }
                C4325u c4325u = this.f797h;
                c4325u.getClass();
                C4309e c4309eM8715f = c4325u.m8715f(C3128a.m6637e(c4325u, AbstractC3506j.m7360x(str)));
                if (c4309eM8715f == null) {
                    return false;
                }
                if (!c4309eM8715f.f14384x.equals(c4309eM8716g)) {
                    if (c4309eM8716g.f14382v.isEmpty()) {
                        c4309eM8716g.f14382v = new ArrayList(5);
                    }
                    c4309eM8716g.f14382v.add(c4309eM8715f);
                    c4309eM8715f.f14384x = c4309eM8716g;
                    C3128a c3128a = c4309eM8715f.f14373m;
                    c3128a.getClass();
                    c3128a.m6652r(c4309eM8716g.f14371k, c3128a.f10138g, true);
                    c3128a.f10142k = c4309eM8716g.f14373m;
                }
                return m1062p(abstractC3506jMo7352k);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1063q(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        EnumC3529l enumC3529lM7432d = this.f797h.f14441g.f11519c.m7432d(abstractC3506j, abstractC3506j2);
        if (enumC3529lM7432d == EnumC3529l.f11488n && abstractC3506j.mo7351v()) {
            String strMo7350l = abstractC3506j.mo7350l();
            Pattern pattern = AbstractC2390d.f7853a;
            C5796q c5796q = C5796q.f23542b;
            if (strMo7350l == null || strMo7350l.isEmpty() || AbstractC2390d.f7855c.contains(strMo7350l) || !AbstractC2390d.f7854b.matcher(strMo7350l).matches()) {
                return false;
            }
            if (strMo7350l.indexOf(46) > 0) {
                for (String str : strMo7350l.split("\\.")) {
                    if (!AbstractC2390d.m5715d(str)) {
                        break;
                    }
                }
                if (enumC3529lM7432d == EnumC3529l.f11486l) {
                    break;
                }
            }
        } else if (enumC3529lM7432d == EnumC3529l.f11486l) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m1064r(C4322r c4322r, AbstractC3506j abstractC3506j, HashSet hashSet) {
        if (abstractC3506j.mo7345w()) {
            int iM1061o = m1061o(abstractC3506j);
            if (iM1061o == 3) {
                c4322r.m6381J("Thrown type has an unknown type hierarchy: ".concat(String.valueOf(abstractC3506j)));
            } else if (iM1061o != 1) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String strMo7350l = abstractC3506j.mo7350l();
                if (strMo7350l.equals(str) ? true : this.f797h.f14453s.m2215d(strMo7350l).contains(str)) {
                    return;
                }
            }
            ((C2994z) c4322r.f9217g.mo6237c(C2825b.f9207v)).f9769g.add(abstractC3506j.mo7350l());
        }
    }
}
