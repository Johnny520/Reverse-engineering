package be;

import ae.C0073d;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p012ah.C0086a;
import p020b5.C0192k;
import p083fe.C1214a;
import p199nd.AbstractC2963b0;
import p199nd.C2991w;
import p199nd.C2992x;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p233pd.AbstractC3391b;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;

/* JADX INFO: renamed from: be.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0277e extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f812g;

    /* JADX INFO: renamed from: h */
    public Object f813h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ud.u.<init>(bc.k):void] */
    public /* synthetic */ C0277e(int i9) {
        this.f812g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1118i(AbstractC2963b0 abstractC2963b0, int i9) {
        String str;
        C0192k c0192kMo6386O = abstractC2963b0.mo6386O();
        int i10 = c0192kMo6386O.f488b;
        int i11 = c0192kMo6386O.f488b;
        int i12 = c0192kMo6386O.f489c;
        C0192k c0192k = (i10 & 7) == i9 ? c0192kMo6386O : new C0192k(i9 | (i10 & (-8)), i12, 3);
        if (c0192k != c0192kMo6386O) {
            abstractC2963b0.mo6388Q(c0192k);
            if ((i11 & 7) == 0) {
                str = "package-private";
            } else if (c0192kMo6386O.m855g()) {
                str = "public";
            } else if (c0192kMo6386O.m853e()) {
                str = "private";
            } else {
                if (!c0192kMo6386O.m854f()) {
                    C0086a.m452k("Unknown visibility flags: ".concat(String.valueOf(new C0192k(i11 & 7, i12, 3))));
                    return;
                }
                str = "protected";
            }
            abstractC2963b0.m6381J("Access modifiers changed from: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C3131d m1119j(C4325u c4325u, AbstractC3506j abstractC3506j, String str) {
        AbstractC3506j abstractC3506jM7360x = AbstractC3506j.m7360x(str);
        return C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, abstractC3506jM7360x), "valueOf", Collections.singletonList(abstractC3506j), abstractC3506jM7360x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0123 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Map] */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        ?? map;
        switch (this.f812g) {
            case 0:
                this.f813h = c4325u.f14442h;
                break;
            case 1:
                HashSet hashSet = new HashSet();
                this.f813h = hashSet;
                hashSet.add(m1119j(c4325u, AbstractC3506j.f11385b, "java.lang.Integer"));
                ((HashSet) this.f813h).add(m1119j(c4325u, AbstractC3506j.f11386c, "java.lang.Boolean"));
                ((HashSet) this.f813h).add(m1119j(c4325u, AbstractC3506j.f11387d, "java.lang.Byte"));
                ((HashSet) this.f813h).add(m1119j(c4325u, AbstractC3506j.f11388e, "java.lang.Short"));
                ((HashSet) this.f813h).add(m1119j(c4325u, AbstractC3506j.f11389f, "java.lang.Character"));
                ((HashSet) this.f813h).add(m1119j(c4325u, AbstractC3506j.f11392i, "java.lang.Long"));
                break;
            case 2:
                HashMap map2 = new HashMap();
                for (C4309e c4309e : c4325u.f14448n) {
                    ArrayList<C4311g> arrayList = new ArrayList();
                    HashSet hashSet2 = new HashSet();
                    C4309e c4309eM8716g = c4309e;
                    while (true) {
                        if (c4309eM8716g != null) {
                            if (hashSet2.add(c4309eM8716g)) {
                                for (C4311g c4311g : c4309eM8716g.f14381u) {
                                    if (!c4311g.f14391m.m856h()) {
                                        arrayList.add(c4311g);
                                    }
                                }
                                AbstractC3506j abstractC3506j = c4309eM8716g.f14376p;
                                if (abstractC3506j != null) {
                                    c4309eM8716g = c4309e.f14371k.m8716g(abstractC3506j);
                                }
                            } else {
                                hashSet2.forEach(new C0286i0("Found 'super' loop in classes: ".concat(String.valueOf(hashSet2)), 0));
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map3 = new HashMap(arrayList.size());
                        for (C4311g c4311g2 : arrayList) {
                            ((List) map3.computeIfAbsent(c4311g2.f14390l.f10147h, new C0073d(16))).add(c4311g2);
                        }
                        map3.entrySet().removeIf(new C0019b(20));
                        if (map3.isEmpty()) {
                            map = Collections.EMPTY_MAP;
                        } else {
                            map = new HashMap();
                            for (List<C4311g> list : map3.values()) {
                                if (((C4311g) list.get(0)).f14389k == c4309e && list.size() == 2) {
                                    C4311g c4311g3 = (C4311g) list.get(1);
                                    if (c4311g3.f14389k != c4309e) {
                                        map.put(c4311g3.f14390l, EnumC0290k0.f843g);
                                    }
                                } else {
                                    for (C4311g c4311g4 : list) {
                                        if (c4311g4.f14389k != c4309e) {
                                            map.put(c4311g4.f14390l, EnumC0290k0.f844h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        C0288j0 c0288j0 = new C0288j0();
                        c0288j0.f837a = map;
                        map2.put(c4309e.m8655Z(), c0288j0);
                    }
                }
                this.f813h = map2;
                break;
            default:
                this.f813h = new C1214a(c4325u);
                c4325u.f14435a.getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ff, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0293  */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        Iterator it;
        int i9;
        int i10;
        int i11;
        boolean z9;
        EnumC3400k enumC3400k;
        int i12;
        int i13;
        C4320p c4320p;
        C0288j0 c0288j0;
        EnumC0290k0 enumC0290k0;
        switch (this.f812g) {
            case 0:
                if (!c4322r.f14415p) {
                    for (C4320p c4320p2 : c4322r.f14424y) {
                        if (c4320p2 instanceof AbstractC3391b) {
                            AbstractC3391b abstractC3391b = (AbstractC3391b) c4320p2;
                            InterfaceC4317m interfaceC4317mM3341f = ((C1214a) this.f813h).m3341f(abstractC3391b.mo7169i0());
                            if (interfaceC4317mM3341f != null) {
                                abstractC3391b.m6233y(interfaceC4317mM3341f);
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (!c4322r.f14415p) {
                    Iterator it2 = c4322r.f14425z.iterator();
                    int i14 = 0;
                    int i15 = 0;
                    while (it2.hasNext()) {
                        C4305a c4305a = (C4305a) it2.next();
                        ArrayList arrayList = c4305a.f14351l;
                        int size = arrayList.size();
                        int i16 = i14;
                        while (i16 < size) {
                            C4320p c4320p3 = (C4320p) arrayList.get(i16);
                            EnumC3400k enumC3400k2 = c4320p3.f14396k;
                            EnumC3400k enumC3400k3 = EnumC3400k.f10963O;
                            if (enumC3400k2 == enumC3400k3) {
                                C3403n c3403n = (C3403n) c4320p3;
                                C4320p c4320p4 = null;
                                if (c3403n.f11004o != 1 || c3403n.f14397l == null) {
                                    it = it2;
                                    i9 = i15;
                                    i10 = 1;
                                    if (c4320p4 == null) {
                                        AbstractC0000a.m18J0(c4322r, c4305a, i16, c4320p4);
                                        i15 = i10;
                                    }
                                } else {
                                    C3131d c3131d = c3403n.f11005p;
                                    if (((HashSet) this.f813h).contains(c3131d)) {
                                        C3514r c3514r = c3403n.f14397l;
                                        AbstractC3508l abstractC3508lMo7179S = c3403n.mo7179S(i14);
                                        abstractC3508lMo7179S.getClass();
                                        if (abstractC3508lMo7179S instanceof C3510n) {
                                            AbstractC3506j abstractC3506j = (AbstractC3506j) c3131d.f10152i.get(i14);
                                            AbstractC3506j abstractC3506j2 = c3131d.f10151h;
                                            if (abstractC3506j == AbstractC3506j.f11392i) {
                                                it = it2;
                                                z9 = true;
                                                i11 = 1;
                                            } else if (abstractC3506j != AbstractC3506j.f11385b) {
                                                HashSet hashSet = new HashSet();
                                                i11 = 1;
                                                for (C3514r c3514r2 : c3514r.f11440m.f11445j) {
                                                    hashSet.add(c3514r2.mo7375I());
                                                    hashSet.add(c3514r2.f11419i);
                                                    it2 = it2;
                                                }
                                                it = it2;
                                                hashSet.add(c3514r.mo7375I());
                                                hashSet.remove(abstractC3506j2);
                                                hashSet.remove(abstractC3506j);
                                                z9 = !hashSet.isEmpty();
                                            } else {
                                                it = it2;
                                                i11 = 1;
                                                z9 = false;
                                            }
                                            if (z9) {
                                                abstractC3508lMo7179S.m6231w(EnumC2824a.f9137W);
                                            }
                                            abstractC3508lMo7179S.mo7386W(abstractC3506j);
                                            Iterator it3 = c3514r.f11440m.m7398b().f11413c.iterator();
                                            while (true) {
                                                boolean zHasNext = it3.hasNext();
                                                enumC3400k = EnumC3400k.f10977g;
                                                if (zHasNext) {
                                                    C3515s c3515s = (C3515s) it3.next();
                                                    if (c3515s.m7404i() || (c4320p = c3515s.f11444i.f11420j) == null) {
                                                        break;
                                                    } else {
                                                        Iterator it4 = it3;
                                                        EnumC3400k enumC3400k4 = c4320p.f14396k;
                                                        i9 = i15;
                                                        if (enumC3400k4 == enumC3400k || enumC3400k4 == EnumC3400k.f10983m) {
                                                            i12 = 0;
                                                            if (c4320p.mo7179S(0).mo7375I().mo7351v()) {
                                                            }
                                                        } else {
                                                            i12 = 0;
                                                        }
                                                        AbstractC3506j abstractC3506j3 = c4320p.f14397l.f11419i;
                                                        if (!abstractC3506j3.mo7351v() || abstractC3506j3.equals(abstractC3506j2)) {
                                                            for (C3514r c3514r3 : c3515s.f11445j) {
                                                                C4320p c4320p5 = c3514r3.f11420j;
                                                                if (c4320p5 != null) {
                                                                    if (c4320p5.f14396k != enumC3400k3 || !c3514r3.equals(((C3403n) c4320p5).mo7171k0())) {
                                                                        i12 = 0;
                                                                    }
                                                                }
                                                            }
                                                            it3 = it4;
                                                            i15 = i9;
                                                        }
                                                    }
                                                } else {
                                                    i9 = i15;
                                                    i12 = i11;
                                                }
                                            }
                                            i12 = 0;
                                            if (i12 != 0) {
                                                c3514r.mo7386W(abstractC3506j);
                                                i13 = 0;
                                            } else {
                                                i13 = i11;
                                            }
                                            i10 = i11;
                                            c4320p4 = new C4320p(enumC3400k, i10);
                                            c4320p4.mo7178I(abstractC3508lMo7179S);
                                            c4320p4.m8688d0(c3514r);
                                            if (i13 != 0) {
                                                c4320p4.m6231w(EnumC2824a.f9164q);
                                            }
                                        }
                                        if (c4320p4 == null) {
                                        }
                                    }
                                }
                                i16++;
                                it2 = it;
                                i14 = 0;
                            } else {
                                it = it2;
                                i9 = i15;
                            }
                            i15 = i9;
                            i16++;
                            it2 = it;
                            i14 = 0;
                        }
                    }
                    if (i15 != 0) {
                        C0271b.m1082R(c4322r);
                    }
                    break;
                }
                break;
            case 2:
                if (!c4322r.f14415p) {
                    HashMap map = (HashMap) this.f813h;
                    Iterator it5 = c4322r.f14425z.iterator();
                    while (it5.hasNext()) {
                        for (C4320p c4320p6 : ((C4305a) it5.next()).f14351l) {
                            int iOrdinal = c4320p6.f14396k.ordinal();
                            C3130c c3130c = (iOrdinal == 30 || iOrdinal == 31) ? (C3130c) ((C3399j) c4320p6).f10948o : null;
                            if (c3130c != null) {
                                AbstractC3508l abstractC3508lMo7179S2 = c4320p6.mo7179S(c4320p6.f14398m.size() - 1);
                                AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S2.mo7375I();
                                if (abstractC3506jMo7375I.mo7345w() && abstractC3506jMo7375I.mo7351v() && (c0288j0 = (C0288j0) map.get(abstractC3506jMo7375I.mo7350l())) != null && (enumC0290k0 = (EnumC0290k0) c0288j0.f837a.get(c3130c)) != null) {
                                    if (enumC0290k0 == EnumC0290k0.f843g && abstractC3508lMo7179S2.m7380N()) {
                                        abstractC3508lMo7179S2.m6231w(EnumC2824a.f9125K);
                                    } else {
                                        C3399j c3399j = new C3399j(EnumC3400k.f10985o, c3130c.f10146g.f10138g, 1);
                                        c3399j.mo7178I(abstractC3508lMo7179S2.mo7374H());
                                        c3399j.m6231w(EnumC2824a.f9159m);
                                        c3399j.m6231w(EnumC2824a.f9138X);
                                        abstractC3508lMo7179S2.m7388b0(c4322r, c3399j, false);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (!c4322r.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    C0192k c0192k = c4322r.f14412m;
                    C2992x c2992x = (C2992x) c4322r.f9217g.mo6237c(C2825b.f9203r);
                    if (c2992x != null) {
                        List list = c2992x.f9765g;
                        if (!list.isEmpty()) {
                            int iMo2221o = ((InterfaceC4317m) list.get(0)).mo2221o();
                            int i17 = c0192k.f488b & 7;
                            int i18 = iMo2221o & 7;
                            if (i17 != i18 && C0192k.m848k(i17) < C0192k.m848k(i18)) {
                                m1118i(c4322r, i18);
                            }
                        }
                    }
                    Iterator it6 = c4322r.f14408H.iterator();
                    while (it6.hasNext()) {
                        ((C1214a) this.f813h).m3339a(c4322r, (C4322r) it6.next(), new C0086a(27));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public boolean mo1054h(C4309e c4309e) {
        switch (this.f812g) {
            case 3:
                C0192k c0192k = c4309e.f14375o;
                if (c4309e.f14384x != c4309e || !c0192k.m855g()) {
                    if (c4309e.f14384x == c4309e && (c0192k.m853e() || c0192k.m854f())) {
                        m1118i(c4309e, 1);
                    } else {
                        Iterator it = c4309e.f14367B.iterator();
                        while (it.hasNext()) {
                            ((C1214a) this.f813h).m3339a(c4309e, (C4309e) it.next(), new C0086a(25));
                        }
                        for (C4322r c4322r : c4309e.f14368C) {
                            C2991w c2991w = (C2991w) c4322r.f9217g.mo6237c(C2825b.f9199n);
                            boolean z9 = (c2991w == null || c2991w.f9763g == null) ? false : true;
                            boolean zMo6235a = c4322r.f9217g.mo6235a(EnumC2824a.f9143c0);
                            if (z9 || zMo6235a) {
                                Iterator it2 = ((Set) c4322r.f14408H.stream().map(new C0640b(22)).collect(Collectors.toSet())).iterator();
                                while (it2.hasNext()) {
                                    ((C1214a) this.f813h).m3339a(c4309e, (C4309e) it2.next(), new C0086a(26));
                                }
                            }
                        }
                    }
                }
                return true;
            default:
                return super.mo1054h(c4309e);
        }
    }
}
