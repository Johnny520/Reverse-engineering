package p170le;

import ae.C0072c;
import ae.C0075f;
import ae.C0076g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p109hb.C1695r;
import p121i4.C1984y;
import p199nd.C2988t;
import p233pd.C3398i;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p351xe.C5784e;
import p369yd.C6028b;
import p384ze.C6140b;
import p384ze.C6141c;

/* JADX INFO: renamed from: le.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2553a {

    /* JADX INFO: renamed from: a */
    public final C4322r f8282a;

    /* JADX INFO: renamed from: b */
    public final C1984y f8283b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C2553a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2553a(C4322r c4322r, C1984y c1984y) {
        this.f8282a = c4322r;
        this.f8283b = c1984y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6001a(C1695r c1695r) {
        C6141c c6141c = (C6141c) c1695r.f5639d;
        Set set = (Set) c1695r.f5642g;
        int iCardinality = c6141c.f24738h.cardinality();
        EnumC2824a enumC2824a = EnumC2824a.f9173z;
        if (iCardinality > 1) {
            Iterator it = ((C6141c) c1695r.f5639d).iterator();
            while (true) {
                C6140b c6140b = (C6140b) it;
                if (!c6140b.hasNext()) {
                    break;
                }
                C4305a c4305a = (C4305a) c6140b.next();
                if (c4305a != c1695r.m4324j()) {
                    c4305a.m6231w(enumC2824a);
                }
            }
        }
        if (!set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((C4305a) it2.next()).m6231w(enumC2824a);
            }
            set.clear();
        }
        Iterator it3 = ((List) c1695r.f5643h).iterator();
        while (it3.hasNext()) {
            ((C4320p) it3.next()).m6231w(EnumC2824a.f9129O);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C4305a m6002b(C4322r c4322r, C4305a c4305a) {
        if (c4305a == null) {
            return null;
        }
        for (C4305a c4305a2 : AbstractC0000a.m84q(c4322r, c4305a.f14357r)) {
            C0072c c0072c = (C0072c) c4305a2.f9217g.mo6237c(C2825b.f9178E);
            if (c0072c != null) {
                C0075f c0075f = c0072c.f229g;
                if (c4305a.f14355p.get(c0075f.f238g.f249m.f14349j)) {
                    return AbstractC0000a.m73k0(c0075f, c4322r);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C4305a m6003c(C4305a c4305a, C4305a c4305a2, Set set, C4322r c4322r) {
        if (c4305a == c4305a2) {
            return c4305a2;
        }
        if (AbstractC0000a.m83p0(c4305a, c4305a2)) {
            set.add(c4305a);
            return c4305a2;
        }
        if (AbstractC0000a.m79n0(c4305a, c4305a2)) {
            c4305a.m6231w(EnumC2824a.f9168u);
            set.add(c4305a);
            return c4305a2;
        }
        C4305a c4305aM67h0 = AbstractC0000a.m67h0(c4322r, c4305a, c4305a2);
        if (c4305aM67h0 != null) {
            Objects.requireNonNull(set);
            AbstractC0000a.m58c1(c4322r, c4305a, c4305aM67h0, new C0076g(set, 10));
            AbstractC0000a.m58c1(c4322r, c4305a2, c4305aM67h0, new C0076g(set, 10));
            set.remove(c4305aM67h0);
            return c4305aM67h0;
        }
        C4305a c4305aM19K = AbstractC0000a.m19K(c4305a);
        C4305a c4305aM19K2 = AbstractC0000a.m19K(c4305a2);
        if (!c4305aM19K.equals(c4305aM19K2) && !AbstractC0000a.m83p0(c4305aM19K, c4305aM19K2)) {
            C0086a.m452k("Unexpected merge pattern");
            return null;
        }
        set.add(c4305a);
        set.add(c4305a2);
        while (true) {
            c4305a = AbstractC0000a.m62e0(c4305a);
            if (c4305a == null) {
                break;
            }
            set.add(c4305a);
        }
        while (true) {
            c4305a2 = AbstractC0000a.m62e0(c4305a2);
            if (c4305a2 == null) {
                return c4305aM19K2;
            }
            set.add(c4305a2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1695r m6004d(C1695r c1695r, C4305a c4305a) {
        if (c4305a.f14352m.size() != 1) {
            C6141c c6141c = (C6141c) c1695r.f5639d;
            List list = c4305a.f14352m;
            c6141c.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!c6141c.m10908b((C4305a) it.next())) {
                    return null;
                }
            }
        }
        return m6005e(c1695r, c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1695r m6005e(C1695r c1695r, C4305a c4305a) {
        ArrayList arrayList;
        int size;
        C4322r c4322r = (C4322r) c1695r.f5637b;
        if (c4305a == null) {
            return null;
        }
        if (c4305a.f9217g.mo6236b(C2825b.f9211z)) {
            return null;
        }
        C2829f c2829f = c4305a.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9173z;
        if (c2829f.mo6235a(enumC2824a)) {
            return null;
        }
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
        if (c4320pM57c0 != null && c4320pM57c0.f14396k == EnumC3400k.f10992v) {
            return m6007g(c4322r, c4305a);
        }
        List list = c4305a.f14353n;
        boolean z9 = true;
        if (list.size() != 1) {
            return null;
        }
        C4305a c4305a2 = (C4305a) list.get(0);
        if (c4305a2.f14352m.size() != 1 || c4305a2.f9217g.mo6235a(enumC2824a)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C4320p> arrayList3 = c4305a.f14351l;
        if (!arrayList3.isEmpty()) {
            boolean z10 = true;
            for (C4320p c4320p : arrayList3) {
                C3514r c3514r = c4320p.f14397l;
                if (c3514r != null && (size = (arrayList = c3514r.f11440m.f11445j).size()) != 0) {
                    C4320p c4320p2 = ((AbstractC3508l) arrayList.get(0)).f11420j;
                    if (AbstractC0000a.m88s(c4305a, c4320p2) || AbstractC0000a.m88s(c4305a2, c4320p2)) {
                        if (size > 1) {
                            arrayList2.add(c4320p);
                        } else {
                            z10 = false;
                        }
                    }
                }
                z9 = false;
            }
            z9 = z10;
        }
        if (!z9) {
            return null;
        }
        C1695r c1695rM6007g = m6007g(c4322r, c4305a2);
        if (c1695rM6007g == null) {
            return m6005e(c1695r, c4305a2);
        }
        ((List) c1695rM6007g.f5643h).addAll(arrayList2);
        return c1695rM6007g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m6006f(C1695r c1695r, C4305a c4305a) {
        C4305a c4305a2;
        boolean zMo6235a = c4305a.f9217g.mo6235a(EnumC2824a.f9155k);
        EnumC2824a enumC2824a = EnumC2824a.f9157l;
        boolean z9 = false;
        if (zMo6235a && c4305a.f14352m.size() == 1) {
            C4305a c4305a3 = (C4305a) c4305a.f14352m.get(0);
            if (c4305a3.f9217g.mo6235a(enumC2824a)) {
                C2829f c2829f = c4305a.f9217g;
                C2825b c2825b = C2825b.f9211z;
                List<C2988t> listMo6238d = c2829f.mo6238d(c2825b);
                List listMo6238d2 = c4305a3.f9217g.mo6238d(c2825b);
                loop0: for (C2988t c2988t : listMo6238d) {
                    Iterator it = listMo6238d2.iterator();
                    while (it.hasNext()) {
                        if (c2988t == ((C2988t) it.next())) {
                            break loop0;
                        }
                    }
                }
                c4305a2 = (C4305a) c1695r.f5644i;
                if (c4305a2 != null) {
                }
            }
        } else {
            c4305a2 = (C4305a) c1695r.f5644i;
            if (c4305a2 != null) {
                List list = c4305a.f14352m;
                C6141c c6141c = (C6141c) c1695r.f5639d;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = true;
                        break;
                    }
                    C4305a c4305a4 = (C4305a) it2.next();
                    if (!c4305a4.f9217g.mo6235a(enumC2824a) && !c6141c.m10908b(AbstractC0000a.m28O0(c4305a4))) {
                        break;
                    }
                }
                return !z9;
            }
            if (c4305a != c4305a2) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C1695r m6007g(C4322r c4322r, C4305a c4305a) {
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
        if (c4320pM57c0 == null || c4320pM57c0.f14396k != EnumC3400k.f10992v) {
            return null;
        }
        C3398i c3398i = (C3398i) c4320pM57c0;
        C1695r c1695r = new C1695r(c4322r, new C6028b(new C5784e(c3398i)), c3398i.f10946q, c3398i.f10947r);
        ((C6141c) c1695r.f5639d).m10907a(c4305a);
        return c1695r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        if ((r6 ? p000a.AbstractC0000a.m81o0(r2, (p302ud.C4305a) r3.f5641f) : p000a.AbstractC0000a.m81o0(r0, (p302ud.C4305a) r3.f5640e)) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1695r m6008h(C1695r c1695r) {
        boolean z9;
        boolean zM81o0;
        int i9;
        C6028b c6028b;
        C6028b c6028b2;
        C6140b c6140b;
        C4305a c4305a = (C4305a) c1695r.f5640e;
        C4305a c4305a2 = (C4305a) c1695r.f5640e;
        C4305a c4305a3 = (C4305a) c1695r.f5641f;
        if (c4305a == c4305a3 || AbstractC0000a.m87r0(c4305a) || AbstractC0000a.m87r0(c4305a3)) {
            return null;
        }
        C1695r c1695rM6004d = m6004d(c1695r, c4305a);
        boolean z10 = false;
        if (c1695rM6004d != null) {
            z9 = true;
        } else {
            c1695rM6004d = m6004d(c1695r, c4305a3);
            if (c1695rM6004d == null) {
                return null;
            }
            z9 = false;
        }
        boolean zIsEmpty = ((List) c1695rM6004d.f5643h).isEmpty();
        if (!zIsEmpty) {
            Iterator it = ((C6141c) c1695r.f5639d).iterator();
            do {
                c6140b = (C6140b) it;
                if (!c6140b.hasNext()) {
                    if (!AbstractC0000a.m81o0(c4305a3, (C4305a) c1695rM6004d.f5640e) || AbstractC0000a.m81o0(c4305a2, (C4305a) c1695rM6004d.f5641f)) {
                        c1695rM6004d = C1695r.m4315l(c1695rM6004d);
                    }
                    zM81o0 = AbstractC0000a.m81o0(c4305a, (C4305a) c1695rM6004d.f5640e);
                    boolean zM81o02 = AbstractC0000a.m81o0(c4305a3, (C4305a) c1695rM6004d.f5641f);
                    if (!zM81o0 || zM81o02) {
                        if (!zIsEmpty) {
                            if ((zM81o0 && !z9) || (zM81o02 && z9)) {
                                z10 = true;
                            }
                            if (!z10) {
                                ((List) c1695r.f5643h).clear();
                                return c1695r;
                            }
                        }
                    } else {
                        if (c4305a.f14354o.size() == 1 && c4305a.f14354o.contains(c4305a3)) {
                            return null;
                        }
                        if (c4305a3.f14354o.size() == 1 && c4305a3.f14354o.contains(c4305a)) {
                            return null;
                        }
                        if (!AbstractC0000a.m89s0(c1695rM6004d.m4324j(), AbstractC0000a.m19K(z9 ? c4305a3 : c4305a))) {
                            C1695r c1695rM6004d2 = m6004d(c1695r, c4305a);
                            C1695r c1695rM6004d3 = m6004d(c1695r, c4305a3);
                            if (c1695rM6004d2 == null || c1695rM6004d3 == null || !c1695rM6004d2.m4324j().f14357r.equals(c1695rM6004d3.m4324j().f14357r)) {
                                return null;
                            }
                            C1695r c1695rM6008h = m6008h(c1695rM6004d2);
                            if (c1695rM6008h != null) {
                                c1695rM6004d2 = c1695rM6008h;
                            }
                            C4305a c4305a4 = (C4305a) c1695rM6004d2.f5641f;
                            C1695r c1695rM6008h2 = m6008h(c1695rM6004d3);
                            if (c1695rM6008h2 != null) {
                                c1695rM6004d3 = c1695rM6008h2;
                            }
                            C4305a c4305a5 = (C4305a) c1695rM6004d3.f5641f;
                            C4305a c4305a6 = (C4305a) c1695rM6004d2.f5640e;
                            C4305a c4305a7 = (C4305a) c1695rM6004d3.f5640e;
                            if (c4305a6 == c4305a7 && c4305a4 == c4305a5) {
                                return m6009i(c1695r, c1695rM6004d2, c1695rM6004d3);
                            }
                            if (c4305a6 == c4305a5 && c4305a4 == c4305a7) {
                                return m6009i(c1695r, c1695rM6004d2, C1695r.m4315l(c1695rM6004d3));
                            }
                            return null;
                        }
                        c1695rM6004d = m6008h(c1695rM6004d);
                        if (c1695rM6004d != null) {
                            if (AbstractC0000a.m81o0(c4305a3, (C4305a) c1695rM6004d.f5640e) || AbstractC0000a.m81o0(c4305a2, (C4305a) c1695rM6004d.f5641f)) {
                                c1695rM6004d = C1695r.m4315l(c1695rM6004d);
                            }
                        }
                    }
                    C4305a c4305aM6003c = (C4305a) c1695rM6004d.f5641f;
                    C4305a c4305aM6003c2 = (C4305a) c1695rM6004d.f5640e;
                    C4322r c4322r = (C4322r) c1695r.f5637b;
                    Set set = (Set) c1695r.f5642g;
                    if (z9) {
                        c4305aM6003c2 = m6003c(c4305a, c4305aM6003c2, set, c4322r);
                    } else {
                        c4305aM6003c = m6003c(c4305a3, c4305aM6003c, set, c4322r);
                    }
                    i9 = !z9 ? 4 : 5;
                    c6028b = (C6028b) c1695r.f5638c;
                    C6028b c6028b3 = (C6028b) c1695rM6004d.f5638c;
                    if (c6028b.f24477i != i9) {
                        c6028b2 = new C6028b(c6028b);
                        c6028b2.f24478j.add(c6028b3);
                    } else {
                        c6028b2 = new C6028b(i9, Arrays.asList(c6028b, c6028b3));
                    }
                    C1695r c1695r2 = new C1695r(c4322r, c6028b2, c4305aM6003c2, c4305aM6003c);
                    c1695r2.m4326m(c1695r, c1695rM6004d);
                    C1695r c1695rM6008h3 = m6008h(c1695r2);
                    return c1695rM6008h3 == null ? c1695rM6008h3 : c1695r2;
                }
            } while (!((C4305a) c6140b.next()).f9217g.mo6235a(EnumC2824a.f9155k));
        } else if (!AbstractC0000a.m81o0(c4305a3, (C4305a) c1695rM6004d.f5640e)) {
            c1695rM6004d = C1695r.m4315l(c1695rM6004d);
            zM81o0 = AbstractC0000a.m81o0(c4305a, (C4305a) c1695rM6004d.f5640e);
            boolean zM81o022 = AbstractC0000a.m81o0(c4305a3, (C4305a) c1695rM6004d.f5641f);
            if (zM81o0) {
                if (!zIsEmpty) {
                }
            }
            C4305a c4305aM6003c3 = (C4305a) c1695rM6004d.f5641f;
            C4305a c4305aM6003c22 = (C4305a) c1695rM6004d.f5640e;
            C4322r c4322r2 = (C4322r) c1695r.f5637b;
            Set set2 = (Set) c1695r.f5642g;
            if (z9) {
            }
            if (!z9) {
            }
            c6028b = (C6028b) c1695r.f5638c;
            C6028b c6028b32 = (C6028b) c1695rM6004d.f5638c;
            if (c6028b.f24477i != i9) {
            }
            C1695r c1695r22 = new C1695r(c4322r2, c6028b2, c4305aM6003c22, c4305aM6003c3);
            c1695r22.m4326m(c1695r, c1695rM6004d);
            C1695r c1695rM6008h32 = m6008h(c1695r22);
            if (c1695rM6008h32 == null) {
            }
        }
        return c1695r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C1695r m6009i(C1695r c1695r, C1695r c1695r2, C1695r c1695r3) {
        C1695r c1695r4 = new C1695r((C4322r) c1695r.f5637b, new C6028b(2, Arrays.asList((C6028b) c1695r.f5638c, (C6028b) c1695r2.f5638c, (C6028b) c1695r3.f5638c)), (C4305a) c1695r2.f5640e, (C4305a) c1695r2.f5641f);
        c1695r4.m4326m(c1695r, c1695r2, c1695r3);
        m6001a(c1695r4);
        return c1695r4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1695r m6010j(C4322r c4322r, C4305a c4305a, C1695r c1695r) {
        C1695r c1695r2;
        C4305a c4305a2;
        C4305a c4305a3 = (C4305a) c1695r.f5640e;
        C4305a c4305a4 = (C4305a) c1695r.f5641f;
        if (Objects.equals(c4305a3, c4305a4)) {
            C1695r c1695r3 = new C1695r(c1695r, (C4305a) null);
            c1695r3.f5644i = c4305a3;
            return c1695r3;
        }
        C2829f c2829f = c4305a3.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9161n;
        if (c2829f.mo6235a(enumC2824a) && c4305a4.f9217g.mo6235a(enumC2824a)) {
            c1695r.f5644i = null;
            return c1695r;
        }
        c1695r.f5644i = AbstractC0000a.m67h0(c4322r, c4305a3, c4305a4);
        boolean zM6006f = m6006f(c1695r, c4305a3);
        boolean zM6006f2 = m6006f(c1695r, c4305a4);
        if (zM6006f && zM6006f2) {
            return null;
        }
        if (!zM6006f2) {
            if (zM6006f) {
                c1695r2 = new C1695r(C1695r.m4315l(c1695r), c4305a4);
                c1695r2.f5644i = c4305a3;
            }
            if (((C4305a) c1695r.f5644i) == null) {
                C4305a c4305aM6002b = m6002b(c4322r, (C4305a) c1695r.f5640e);
                C4305a c4305aM6002b2 = m6002b(c4322r, (C4305a) c1695r.f5641f);
                if (c4305aM6002b == null && c4305aM6002b2 != null) {
                    c1695r.f5644i = c4305aM6002b2;
                } else if (c4305aM6002b != null && c4305aM6002b2 == null) {
                    c1695r.f5644i = c4305aM6002b;
                } else if (c4305aM6002b != null && c4305aM6002b == c4305aM6002b2) {
                    c1695r.f5644i = c4305aM6002b;
                }
            }
            c4305a2 = (C4305a) c1695r.f5644i;
            if ((c4305a2 == null && !c4305a.f14354o.contains(c4305a2)) ? c4305a.f14353n.contains(c4305a2) : false) {
                c1695r.f5644i = null;
            }
            return c1695r;
        }
        c1695r2 = new C1695r(c1695r, c4305a3);
        c1695r2.f5644i = c4305a4;
        c1695r = c1695r2;
        if (((C4305a) c1695r.f5644i) == null) {
        }
        c4305a2 = (C4305a) c1695r.f5644i;
        if ((c4305a2 == null && !c4305a.f14354o.contains(c4305a2)) ? c4305a.f14353n.contains(c4305a2) : false) {
        }
        return c1695r;
    }
}
