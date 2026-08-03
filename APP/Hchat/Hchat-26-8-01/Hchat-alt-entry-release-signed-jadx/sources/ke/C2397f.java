package ke;

import af.C0083f;
import be.AbstractC0269a;
import be.C0271b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p215od.C3131d;
import p233pd.C3390a;
import p233pd.C3398i;
import p233pd.C3403n;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3498b;
import p246qd.C3499c;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;
import p351xe.C5784e;
import p351xe.C5791l;
import p369yd.C6028b;
import p383zd.C6136a;
import p383zd.C6137b;
import p383zd.C6138c;

/* JADX INFO: renamed from: ke.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2397f extends AbstractC0269a implements InterfaceC2396e {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f7863g = AbstractC2846d.m6274b(C2397f.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m5728i(C4322r c4322r, C6138c c6138c, C3514r c3514r) {
        boolean zM2755Z;
        C4320p c4320pM7394f0 = c3514r.m7394f0();
        if (c4320pM7394f0 == null) {
            return true;
        }
        C4320p c4320p = c4320pM7394f0.f14397l.f11420j;
        if (c4320p != null) {
            C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p, c4322r.f14425z);
            if (c4305aM35S == null) {
                f7863g.mo6271y(c4320p, " LoopRegionVisitor: instruction not found: {}, mth: {}", c4322r);
                zM2755Z = false;
            } else {
                zM2755Z = AbstractC1089i.m2755Z(c4305aM35S, c6138c);
            }
        } else {
            zM2755Z = false;
        }
        if (zM2755Z) {
            if (!(c4320pM7394f0 instanceof C3406q)) {
                return true;
            }
            Iterator it = ((C3406q) c4320pM7394f0).f14398m.iterator();
            while (it.hasNext()) {
                if (!m5728i(c4322r, c6138c, (C3514r) ((AbstractC3508l) it.next()))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m5729j(C4320p c4320p, String str, String str2) {
        if (c4320p == null || c4320p.f14396k != EnumC3400k.f10963O) {
            return false;
        }
        C3403n c3403n = (C3403n) c4320p;
        C3131d c3131d = c3403n.f11005p;
        int i9 = c3403n.f11004o;
        if ((i9 != 4 && i9 != 3) || !c3131d.f10154k.equals(str2)) {
            return false;
        }
        if (str == null) {
            return true;
        }
        return c3131d.f10153j.f10141j.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m5730k(C4322r c4322r, AbstractC3508l abstractC3508l, C3514r c3514r) {
        AbstractC3506j abstractC3506jMo7356r;
        AbstractC3506j abstractC3506jMo7375I = abstractC3508l.mo7375I();
        AbstractC3506j abstractC3506jMo7375I2 = c3514r.mo7375I();
        if (abstractC3506jMo7375I.mo7354t()) {
            List listMo7346j = abstractC3506jMo7375I.mo7346j();
            if (listMo7346j != null && listMo7346j.size() == 1) {
                AbstractC3506j abstractC3506j = (AbstractC3506j) listMo7346j.get(0);
                if (!abstractC3506j.equals(abstractC3506jMo7375I2)) {
                    if (abstractC3506j instanceof C3499c) {
                        c3514r.mo7386W(abstractC3506j);
                        return true;
                    }
                    if (!AbstractC3506j.m7359u(c4322r.f14411l.f14371k, abstractC3506j, abstractC3506jMo7375I2) && ((abstractC3506jMo7356r = abstractC3506j.mo7356r()) == null || abstractC3506j.mo7355q() != 1 || !AbstractC3506j.m7359u(c4322r.f14411l.f14371k, abstractC3506jMo7356r, abstractC3506jMo7375I2))) {
                        f7863g.mo6255i("Generic type differs: '{}' and '{}' in {}", abstractC3506j, abstractC3506jMo7375I2, c4322r);
                    }
                }
            }
            return false;
        }
        boolean z9 = abstractC3508l instanceof C3514r;
        if (z9 && abstractC3506jMo7375I.mo7351v()) {
            C3498b c3498b = new C3498b(AbstractC5798s.m10508b(abstractC3506jMo7375I.mo7350l()), Collections.singletonList(abstractC3506jMo7375I2));
            if (z9) {
                C3514r c3514r2 = (C3514r) abstractC3508l;
                C3515s c3515s = c3514r2.f11440m;
                AbstractC3506j abstractC3506jM7400d = c3515s != null ? c3515s.m7400d() : c3514r2.f9217g.mo6235a(EnumC2824a.f9128N) ? c3514r2.f11419i : null;
                if (abstractC3506jM7400d != null && !abstractC3506jM7400d.equals(c3498b)) {
                    return abstractC3506jMo7375I2.equals(AbstractC3506j.f11394k);
                }
            }
            abstractC3508l.mo7386W(c3498b);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m5731l(C4322r c4322r, C6138c c6138c, C3514r c3514r) {
        boolean zM2755Z;
        Iterator it = c3514r.f11440m.f11445j.iterator();
        while (it.hasNext()) {
            C4320p c4320p = ((C3514r) it.next()).f11420j;
            if (c4320p != null) {
                C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p, c4322r.f14425z);
                if (c4305aM35S == null) {
                    f7863g.mo6271y(c4320p, " LoopRegionVisitor: instruction not found: {}, mth: {}", c4322r);
                    zM2755Z = false;
                } else {
                    zM2755Z = AbstractC1089i.m2755Z(c4305aM35S, c6138c);
                }
            } else {
                zM2755Z = false;
            }
            if (!zM2755Z) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:162:0x0288 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0163 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0389 A[LOOP:5: B:230:0x0383->B:232:0x0389, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039f A[LOOP:6: B:234:0x0399->B:236:0x039f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v3, types: [md.e, ud.p] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [g4.a] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zd.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [zd.a] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        C6028b c6028b;
        ArrayList arrayListM10795J;
        C3514r c3514r;
        C3515s c3515s;
        ArrayList arrayList;
        C4320p c4320pM7394f0;
        C4320p c4320p;
        C4320p c4320p2;
        C3514r c3514r2;
        Iterator it;
        C4320p c4320p3;
        C4320p c4320p4;
        C3514r c3514r3;
        C3515s c3515s2;
        C3514r c3514rM7184j0;
        C4320p c4320pM7394f02;
        C3514r c3514r4;
        C3514r c3514r5;
        C4320p c4320p5;
        C4320p c4320pM7394f03;
        C3514r c3514r6;
        if (interfaceC4318n instanceof C6138c) {
            C6138c c6138c = (C6138c) interfaceC4318n;
            if (!c6138c.f24725n && (c6028b = c6138c.f24475k) != null) {
                ?? M57c0 = AbstractC0000a.m57c0(AbstractC0000a.m28O0(c6138c.f24724m.f9756b));
                ?? c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                c6137b = 0;
                EnumC2824a enumC2824a = EnumC2824a.f9133S;
                EnumC2824a enumC2824a2 = EnumC2824a.f9166s;
                if (M57c0 != null && (c3514r3 = M57c0.f14397l) != null && (c3515s2 = c3514r3.f11440m) != null && c3515s2.m7405j()) {
                    List list = c3514r3.f11440m.f11446k;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    if (list.size() != 1) {
                        arrayListM10795J = c6028b.m10795J();
                        if (arrayListM10795J.size() == 1 && (c3515s = (c3514r = (C3514r) arrayListM10795J.get(0)).f11440m) != null && !c3515s.m7405j()) {
                            arrayList = c3515s.f11445j;
                            c4320pM7394f0 = c3514r.m7394f0();
                            if (arrayList.size() == 2 && m5729j(c4320pM7394f0, null, "iterator()Ljava/util/Iterator;")) {
                                AbstractC3508l abstractC3508lMo7179S = c4320pM7394f0.mo7179S(0);
                                c4320p = ((C3514r) arrayList.get(0)).f11420j;
                                c4320p2 = ((C3514r) arrayList.get(1)).f11420j;
                                if (m5729j(c4320p, "java.util.Iterator", "hasNext()Z") && m5729j(c4320p2, "java.util.Iterator", "next()Ljava/lang/Object;")) {
                                    ArrayList<C4320p> arrayList2 = new ArrayList();
                                    if (c4320p2.f9217g.mo6235a(enumC2824a)) {
                                        c3514r2 = c4320p2.f14397l;
                                        if (c3514r2 != null && m5731l(c4322r, c6138c, c3514r2) && m5728i(c4322r, c6138c, c3514r2)) {
                                            arrayList2.add(c4320p2);
                                            c4320pM7394f0.m6231w(enumC2824a2);
                                            c4320pM7394f0.f14397l.m6231w(enumC2824a2);
                                            while (r2.hasNext()) {
                                            }
                                            it = arrayList.iterator();
                                            while (it.hasNext()) {
                                            }
                                            C6136a c6136a = new C6136a(abstractC3508lMo7179S, c3514r2);
                                            c6136a.m10906P(c6138c);
                                            c6138c.f24729r = c6136a;
                                        }
                                    } else {
                                        AbstractC3508l abstractC3508lM24M0 = AbstractC0000a.m24M0(c4322r, c4320p2);
                                        if (abstractC3508lM24M0 == null || (c4320p3 = abstractC3508lM24M0.f11420j) == null) {
                                            f7863g.mo6265s(c4320p2, " checkIterableForEach: Wrapped insn not found: {}, mth: {}", c4322r);
                                            return true;
                                        }
                                        C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p3, c4322r.f14425z);
                                        if (c4305aM35S != null && AbstractC1089i.m2755Z(c4305aM35S, c6138c)) {
                                            if (c4320p3.f14396k == EnumC3400k.f10949A) {
                                                c3514r2 = c4320p3.f14397l;
                                                if (c3514r2 != null && m5730k(c4322r, abstractC3508lMo7179S, c3514r2)) {
                                                    AbstractC3508l abstractC3508lM24M02 = AbstractC0000a.m24M0(c4322r, c4320p3);
                                                    if (abstractC3508lM24M02 == null || (c4320p4 = abstractC3508lM24M02.f11420j) == null) {
                                                        arrayList2.add(c4320p3);
                                                    } else {
                                                        c4320p4.mo7181b0(abstractC3508lM24M02, c3514r2);
                                                    }
                                                    c4320pM7394f0.m6231w(enumC2824a2);
                                                    c4320pM7394f0.f14397l.m6231w(enumC2824a2);
                                                    for (C4320p c4320p6 : arrayList2) {
                                                        c4320p6.f14397l = null;
                                                        c4320p6.m6231w(enumC2824a2);
                                                    }
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        ((C3514r) it.next()).m6231w(enumC2824a2);
                                                    }
                                                    C6136a c6136a2 = new C6136a(abstractC3508lMo7179S, c3514r2);
                                                    c6136a2.m10906P(c6138c);
                                                    c6138c.f24729r = c6136a2;
                                                }
                                            } else {
                                                C3514r c3514r7 = c4320p2.f14397l;
                                                if (c3514r7 != null) {
                                                    c3514r7.m6227D(EnumC2824a.f9168u);
                                                    c4320p2.m6231w(enumC2824a2);
                                                    if (m5730k(c4322r, abstractC3508lMo7179S, c3514r7)) {
                                                        c4320p3.mo7181b0(abstractC3508lM24M0, c3514r7);
                                                        c3514r2 = c3514r7;
                                                        c4320pM7394f0.m6231w(enumC2824a2);
                                                        c4320pM7394f0.f14397l.m6231w(enumC2824a2);
                                                        while (r2.hasNext()) {
                                                        }
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        C6136a c6136a22 = new C6136a(abstractC3508lMo7179S, c3514r2);
                                                        c6136a22.m10906P(c6138c);
                                                        c6138c.f24729r = c6136a22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c4322r.m6231w(EnumC2824a.f9141a0);
                                }
                            }
                        }
                    } else {
                        C3406q c3406q = (C3406q) list.get(0);
                        if (c3406q.f14398m.size() == 2) {
                            List list2 = c3406q.f14398m;
                            if ((list2.size() == 0 ? false : AbstractC5792m.m10485b(list2, c3514r3)) && c3514r3.f11440m.f11445j.size() == 1) {
                                C3514r c3514r8 = c3406q.f14397l;
                                if (c6028b.m10795J().contains(c3514r8) && !c3514r8.f11440m.m7405j() && (c4320pM7394f02 = (c3514rM7184j0 = c3406q.m7184j0(0)).m7394f0()) != null && !c4320pM7394f02.f9217g.mo6235a(enumC2824a2) && c3514rM7184j0.f11440m.f11445j.size() == 1 && m5731l(c4322r, c6138c, c3514r8)) {
                                    ArrayList arrayList3 = new ArrayList();
                                    M57c0.mo8340U(arrayList3);
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            if (m5728i(c4322r, c6138c, (C3514r) it2.next())) {
                                                arrayListM10795J = c6028b.m10795J();
                                                if (arrayListM10795J.size() == 1) {
                                                    arrayList = c3515s.f11445j;
                                                    c4320pM7394f0 = c3514r.m7394f0();
                                                    if (arrayList.size() == 2) {
                                                        AbstractC3508l abstractC3508lMo7179S2 = c4320pM7394f0.mo7179S(0);
                                                        c4320p = ((C3514r) arrayList.get(0)).f11420j;
                                                        c4320p2 = ((C3514r) arrayList.get(1)).f11420j;
                                                        if (m5729j(c4320p, "java.util.Iterator", "hasNext()Z")) {
                                                            ArrayList<C4320p> arrayList22 = new ArrayList();
                                                            if (c4320p2.f9217g.mo6235a(enumC2824a)) {
                                                            }
                                                            c4322r.m6231w(EnumC2824a.f9141a0);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (StackOverflowError unused) {
                                            throw new C0083f("LoopRegionVisitor.assignOnlyInLoop endless recursion");
                                        }
                                    }
                                    c4320pM7394f02.m6231w(enumC2824a2);
                                    M57c0.m6231w(enumC2824a2);
                                    if ((M57c0 instanceof C3390a) && ((C3390a) M57c0).f10928o == 1) {
                                        AbstractC3508l abstractC3508lMo7179S3 = M57c0.mo7179S(1);
                                        abstractC3508lMo7179S3.getClass();
                                        if ((abstractC3508lMo7179S3 instanceof C3510n) && ((C3510n) abstractC3508lMo7179S3).f11422l == 1 && c4320pM7394f02.f14396k == EnumC3400k.f10977g) {
                                            AbstractC3508l abstractC3508lMo7179S4 = c4320pM7394f02.mo7179S(0);
                                            abstractC3508lMo7179S4.getClass();
                                            if ((abstractC3508lMo7179S4 instanceof C3510n) && ((C3510n) c4320pM7394f02.mo7179S(0)).f11422l == 0) {
                                                AbstractC3508l abstractC3508lMo7179S5 = M57c0.mo7179S(0);
                                                abstractC3508lMo7179S5.getClass();
                                                if (abstractC3508lMo7179S5 instanceof C3514r) {
                                                    ArrayList arrayList4 = ((C3514r) abstractC3508lMo7179S5).f11440m.f11445j;
                                                    if (arrayList4.size() == 3) {
                                                        InterfaceC2844b interfaceC2844b = AbstractC5792m.f23539a;
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                c3514r4 = null;
                                                                break;
                                                            }
                                                            c3514r4 = (C3514r) it3.next();
                                                            C4320p c4320p7 = c3514r4.f11420j;
                                                            if (c4320p7 != null && c4320p7.f14396k == EnumC3400k.f10992v) {
                                                                break;
                                                            }
                                                        }
                                                        if (c3514r4 != null) {
                                                            Iterator it4 = arrayList4.iterator();
                                                            while (true) {
                                                                if (!it4.hasNext()) {
                                                                    c3514r5 = null;
                                                                    break;
                                                                }
                                                                c3514r5 = (C3514r) it4.next();
                                                                C4320p c4320p8 = c3514r5.f11420j;
                                                                if (c4320p8 != null && c4320p8.f14396k == EnumC3400k.f10955G) {
                                                                    break;
                                                                }
                                                            }
                                                            if (c3514r5 != null && (c4320p5 = c3514r5.f11420j) != null) {
                                                                Iterator it5 = c4320p5.f14398m.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        AbstractC3508l abstractC3508l = (AbstractC3508l) it5.next();
                                                                        abstractC3508l.getClass();
                                                                        if (abstractC3508l instanceof C3509m) {
                                                                            break;
                                                                        }
                                                                    } else if (c6028b.m10796L()) {
                                                                        C5784e c5784e = c6028b.f24479k;
                                                                        C3398i c3398i = (C3398i) c5784e.f23527b;
                                                                        if (c3398i.f10945p == 3 && c3398i.mo7179S(0) == c3514r4) {
                                                                            AbstractC3508l abstractC3508lM10466a = c5784e.m10466a();
                                                                            abstractC3508lM10466a.getClass();
                                                                            if (abstractC3508lM10466a instanceof C3509m) {
                                                                                c4320pM7394f03 = ((C3509m) abstractC3508lM10466a).f11421l;
                                                                            } else if (abstractC3508lM10466a instanceof C3514r) {
                                                                                c4320pM7394f03 = ((C3514r) abstractC3508lM10466a).m7394f0();
                                                                            }
                                                                            if (c4320pM7394f03 != null && c4320pM7394f03.f14396k == EnumC3400k.f10951C && c4320pM7394f03.mo7179S(0).equals(c4320p5.mo7179S(0))) {
                                                                                C3514r c3514rM8704c0 = c4320p5.f14397l;
                                                                                if (c3514rM8704c0 != null) {
                                                                                    if (m5731l(c4322r, c6138c, c3514rM8704c0)) {
                                                                                        M57c0.f14397l.m6231w(enumC2824a2);
                                                                                        c3514r4.m6231w(enumC2824a2);
                                                                                        abstractC3508lM10466a.m6231w(enumC2824a2);
                                                                                        c4320p5.m6231w(enumC2824a2);
                                                                                        ((C3398i) c5784e.f23527b).m6231w(enumC2824a2);
                                                                                        c6137b = new C6136a(c4320pM7394f03.mo7179S(0), c3514rM8704c0);
                                                                                        c6137b.m10906P(c6138c);
                                                                                        c3514r6 = c4320pM7394f03.f14397l;
                                                                                        if (c3514r6 == null) {
                                                                                            Iterator it6 = c3514r6.f11440m.f11445j.iterator();
                                                                                            while (it6.hasNext()) {
                                                                                                C4320p c4320p9 = ((C3514r) it6.next()).f11420j;
                                                                                                if (c4320p9 != null && !c4320p9.f9217g.mo6235a(enumC2824a2)) {
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            c4320pM7394f03.m6231w(enumC2824a2);
                                                                                            C5791l.m10472d(c4322r, c4320pM7394f03);
                                                                                            C0271b.m1089Y(c4322r);
                                                                                        } else {
                                                                                            c4320pM7394f03.m6231w(enumC2824a2);
                                                                                            C5791l.m10472d(c4322r, c4320pM7394f03);
                                                                                            C0271b.m1089Y(c4322r);
                                                                                        }
                                                                                    }
                                                                                } else if (c4320p5.f9217g.mo6235a(enumC2824a)) {
                                                                                    AbstractC3508l abstractC3508lM24M03 = AbstractC0000a.m24M0(c4322r, c4320p5);
                                                                                    if (abstractC3508lM24M03 == null || abstractC3508lM24M03.f11420j == null) {
                                                                                        c4322r.m6383L("checkArrayForEach: Wrapped insn not found: ".concat(String.valueOf(c4320p5)));
                                                                                    } else {
                                                                                        c3514rM8704c0 = c4322r.m8704c0(abstractC3508lM24M03.mo7375I());
                                                                                        C4320p c4320p10 = abstractC3508lM24M03.f11420j;
                                                                                        c4320p10.mo7181b0(abstractC3508lM24M03, c3514rM8704c0.mo7374H());
                                                                                        c4320p10.mo8341Z();
                                                                                        M57c0.f14397l.m6231w(enumC2824a2);
                                                                                        c3514r4.m6231w(enumC2824a2);
                                                                                        abstractC3508lM10466a.m6231w(enumC2824a2);
                                                                                        c4320p5.m6231w(enumC2824a2);
                                                                                        ((C3398i) c5784e.f23527b).m6231w(enumC2824a2);
                                                                                        c6137b = new C6136a(c4320pM7394f03.mo7179S(0), c3514rM8704c0);
                                                                                        c6137b.m10906P(c6138c);
                                                                                        c3514r6 = c4320pM7394f03.f14397l;
                                                                                        if (c3514r6 == null) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (c6137b == 0) {
                                        c6137b = new C6137b(c4320pM7394f02, M57c0);
                                    }
                                    c6138c.f24729r = c6137b;
                                    c4322r.m6231w(EnumC2824a.f9141a0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        AbstractC5700d.m10279h0(c4322r, this, c4322r.f14407G);
        C2829f c2829f = c4322r.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9141a0;
        if (c2829f.mo6235a(enumC2824a)) {
            try {
                C2394c.m5726r(c4322r);
            } finally {
                c4322r.m6227D(enumC2824a);
            }
        }
    }

    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public final void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
    }

    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: d */
    public final void mo2617d(C4322r c4322r, InterfaceC4312h interfaceC4312h) {
    }
}
