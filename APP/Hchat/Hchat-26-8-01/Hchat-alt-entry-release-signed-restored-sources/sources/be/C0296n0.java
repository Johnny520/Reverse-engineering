package be;

import ae.C0073d;
import ae.C0076g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p082fd.AbstractC1213j;
import p157kd.AbstractC2390d;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p233pd.C3390a;
import p233pd.C3393d;
import p233pd.C3396g;
import p233pd.C3398i;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3501e;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p281t3.AbstractC4106c;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.AbstractC5790k;
import p351xe.AbstractC5798s;
import p351xe.C5791l;
import p369yd.C6028b;
import td.C4145a;
import td.C4146b;

/* JADX INFO: renamed from: be.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296n0 extends AbstractC0269a {

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2844b f860h = AbstractC2846d.m6274b(C0296n0.class);

    /* JADX INFO: renamed from: g */
    public C3131d f861g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m1213i(List list) {
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            boolean zM7377K = ((AbstractC3508l) it.next()).m7377K();
            if (zM7377K && z9) {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                ArrayList arrayList2 = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    AbstractC3508l abstractC3508l = (AbstractC3508l) list.get(i9);
                    abstractC3508l.getClass();
                    String strValueOf = null;
                    if (abstractC3508l instanceof C3510n) {
                        C3510n c3510n = (C3510n) abstractC3508l;
                        InterfaceC2844b interfaceC2844b = AbstractC1213j.f4074a;
                        AbstractC3506j abstractC3506j = c3510n.f11419i;
                        if (abstractC3506j != null) {
                            long j3 = c3510n.f11422l;
                            switch (abstractC3506j.mo7343o()) {
                                case BOOLEAN:
                                    strValueOf = j3 == 0 ? "false" : "true";
                                    break;
                                case CHAR:
                                    strValueOf = String.valueOf((char) j3);
                                    break;
                                case BYTE:
                                case SHORT:
                                case INT:
                                case LONG:
                                    strValueOf = Long.toString(j3);
                                    break;
                                case FLOAT:
                                    strValueOf = Float.toString(Float.intBitsToFloat((int) j3));
                                    break;
                                case DOUBLE:
                                    strValueOf = Double.toString(Double.longBitsToDouble(j3));
                                    break;
                                case OBJECT:
                                case ARRAY:
                                    if (j3 != 0) {
                                        AbstractC1213j.f4074a.mo6265s(Long.valueOf(j3), "Wrong object literal: {} for type: {}", abstractC3506j);
                                        strValueOf = Long.toString(j3);
                                    } else {
                                        strValueOf = "null";
                                    }
                                    break;
                            }
                        }
                    } else if (abstractC3508l instanceof C3509m) {
                        C4320p c4320p = ((C3509m) abstractC3508l).f11421l;
                        if (c4320p instanceof C3393d) {
                            strValueOf = ((C3393d) c4320p).f10930o;
                        }
                    }
                    if (strValueOf != null) {
                        arrayList2.add(strValueOf);
                    } else {
                        if (!arrayList2.isEmpty()) {
                            arrayList.add(m1215k(arrayList2, list, i9));
                            arrayList2.clear();
                        }
                        arrayList.add(abstractC3508l);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(m1215k(arrayList2, list, size));
                }
                return arrayList;
            }
            z9 = zM7377K;
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0001, B:6:0x000a, B:9:0x001d, B:11:0x0028, B:14:0x0039, B:19:0x0047, B:21:0x0053, B:23:0x005b, B:25:0x006c, B:27:0x0076, B:31:0x007f, B:32:0x0085, B:33:0x0089, B:35:0x008f, B:37:0x00a1, B:39:0x00c0, B:41:0x00ca, B:43:0x00d7, B:42:0x00d2, B:45:0x00e1), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: Exception -> 0x0041, LOOP:0: B:18:0x0045->B:31:0x007f, LOOP_END, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0001, B:6:0x000a, B:9:0x001d, B:11:0x0028, B:14:0x0039, B:19:0x0047, B:21:0x0053, B:23:0x005b, B:25:0x006c, B:27:0x0076, B:31:0x007f, B:32:0x0085, B:33:0x0089, B:35:0x008f, B:37:0x00a1, B:39:0x00c0, B:41:0x00ca, B:43:0x00d7, B:42:0x00d2, B:45:0x00e1), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0001, B:6:0x000a, B:9:0x001d, B:11:0x0028, B:14:0x0039, B:19:0x0047, B:21:0x0053, B:23:0x005b, B:25:0x006c, B:27:0x0076, B:31:0x007f, B:32:0x0085, B:33:0x0089, B:35:0x008f, B:37:0x00a1, B:39:0x00c0, B:41:0x00ca, B:43:0x00d7, B:42:0x00d2, B:45:0x00e1), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0001, B:6:0x000a, B:9:0x001d, B:11:0x0028, B:14:0x0039, B:19:0x0047, B:21:0x0053, B:23:0x005b, B:25:0x006c, B:27:0x0076, B:31:0x007f, B:32:0x0085, B:33:0x0089, B:35:0x008f, B:37:0x00a1, B:39:0x00c0, B:41:0x00ca, B:43:0x00d7, B:42:0x00d2, B:45:0x00e1), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4320p m1214j(C4322r c4322r, C3403n c3403n, List list) {
        int i9;
        Iterator it;
        AbstractC3508l abstractC3508lMo7179S;
        try {
            int size = list.size();
            if (size >= 2) {
                ArrayList arrayList = new ArrayList(size);
                C4320p c4320p = (C4320p) list.get(0);
                if (c4320p.f14396k == EnumC3400k.f10967S) {
                    C4145a c4145a = (C4145a) c4320p;
                    if (c4145a.f14398m.size() != 1) {
                        for (i9 = 1; i9 < size; i9++) {
                            C4320p c4320p2 = (C4320p) list.get(i9);
                            if (c4320p2.f14396k == EnumC3400k.f10963O && c4320p2.f14398m.size() == 2) {
                                C3131d c3131d = ((C3403n) c4320p2).f11005p;
                                if (c3131d.f10153j.f10141j.equals("java.lang.StringBuilder") && c3131d.f10150g.equals("append")) {
                                    abstractC3508lMo7179S = c4320p2.mo7179S(1);
                                }
                                if (abstractC3508lMo7179S == null) {
                                }
                            } else {
                                abstractC3508lMo7179S = null;
                                if (abstractC3508lMo7179S == null) {
                                    arrayList.add(abstractC3508lMo7179S);
                                }
                            }
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractC3506j abstractC3506jMo7375I = ((AbstractC3508l) it.next()).mo7375I();
                            C3501e c3501e = AbstractC3506j.f11396m;
                            if (abstractC3506jMo7375I.equals(c3501e)) {
                                C4320p c4320p3 = new C4320p(EnumC3400k.f10970V, m1213i(AbstractC5798s.m10509c(arrayList, new C0073d(19))));
                                c4320p3.m6231w(EnumC2824a.f9159m);
                                if (c3403n.f14397l == null) {
                                    if (c3403n.f9217g.mo6235a(EnumC2824a.f9133S)) {
                                        c4320p3.m8688d0(c3403n.f14397l);
                                    } else {
                                        c4320p3.m8688d0(c4322r.m8704c0(c3501e));
                                    }
                                }
                                c4320p3.m6225B(c3403n);
                                c4320p3.m6393H(c3403n);
                                m1216l(c4322r, c3403n, list);
                                return c4320p3;
                            }
                        }
                        c4322r.m6380I("TODO: convert one arg to string using `String.valueOf()`, args: " + AbstractC5798s.m10517k(arrayList, ", ", new C0073d(18)));
                        return null;
                    }
                    if (((AbstractC3506j) c4145a.f13662o.f10152i.get(0)).mo7351v()) {
                        arrayList.add(c4145a.mo7179S(0));
                        while (i9 < size) {
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        c4322r.m6380I("TODO: convert one arg to string using `String.valueOf()`, args: " + AbstractC5798s.m10517k(arrayList, ", ", new C0073d(18)));
                        return null;
                    }
                }
            }
            return null;
        } catch (Exception e6) {
            c4322r.m6384M("String concatenation convert failed", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static AbstractC3508l m1215k(ArrayList arrayList, List list, int i9) {
        String string;
        if (arrayList.size() == 1) {
            return (AbstractC3508l) list.get(i9 - 1);
        }
        if (AbstractC5798s.m10514h(arrayList)) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else if (arrayList.size() == 1) {
            string = (String) arrayList.get(0);
        } else {
            StringBuilder sb2 = new StringBuilder();
            arrayList.forEach(new C0076g(sb2, 22));
            string = sb2.toString();
        }
        return AbstractC3508l.m7372Z(new C3393d(string));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m1216l(C4322r c4322r, C3403n c3403n, List list) {
        C5791l.m10476h(c4322r, c3403n);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5791l.m10476h(c4322r, (C4320p) it.next());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C4320p c4320p = (C4320p) it2.next();
            if (c4320p != c3403n) {
                arrayList.add(c4320p);
                C5791l.m10478j(c4322r, c4320p);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C5791l.m10472d(c4322r, (C4320p) it3.next());
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m1217n(C4322r c4322r, C3398i c3398i) {
        AbstractC3508l abstractC3508lMo7179S = c3398i.mo7179S(0);
        abstractC3508lMo7179S.getClass();
        if (abstractC3508lMo7179S instanceof C3509m) {
            C4320p c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
            EnumC3400k enumC3400k = c4320p.f14396k;
            if (enumC3400k == EnumC3400k.f10990t || enumC3400k == EnumC3400k.f10991u) {
                if (!c3398i.mo7179S(1).mo7384R()) {
                    f860h.mo6254h(c3398i, "TODO: cmp {}");
                    return;
                }
                int i9 = c3398i.f10945p;
                AbstractC3508l abstractC3508lMo7374H = c4320p.mo7179S(0).mo7374H();
                AbstractC3508l abstractC3508lMo7374H2 = c4320p.mo7179S(1).mo7374H();
                c3398i.f10945p = i9;
                c3398i.mo7182c0(0, abstractC3508lMo7374H);
                c3398i.mo7182c0(1, abstractC3508lMo7374H2);
                C5791l.m10478j(c4322r, c4320p);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f861g = C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, AbstractC3506j.f11396m), "getBytes", Collections.EMPTY_LIST, new C3497a(AbstractC3506j.f11387d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p) {
            return;
        }
        Iterator it = c4322r.f14425z.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (m1218m(c4322r, (C4305a) it.next())) {
                z9 = true;
            }
        }
        if (!z9) {
            if (!c4322r.f9217g.mo6235a(EnumC2824a.f9142b0)) {
                return;
            }
        }
        C0271b.m1089Y(c4322r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m1218m(C4322r c4322r, C4305a c4305a) {
        ArrayList arrayList = c4305a.f14351l;
        boolean z9 = false;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C4320p c4320p = (C4320p) arrayList.get(i9);
            int size = arrayList.size();
            C4320p c4320pM1219o = m1219o(c4322r, c4320p, null);
            if (c4320pM1219o != null) {
                c4320pM1219o.mo8341Z();
                if (i9 >= arrayList.size() || arrayList.get(i9) != c4320p) {
                    int iM10470a = AbstractC5790k.m10470a(arrayList, c4320p, 0);
                    if (iM10470a == -1) {
                        C0086a.m452k("Failed to replace insn");
                        return false;
                    }
                    arrayList.set(iM10470a, c4320pM1219o);
                } else {
                    arrayList.set(i9, c4320pM1219o);
                }
                if (arrayList.size() < size) {
                    m1218m(c4322r, c4305a);
                    return true;
                }
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:302:0x023c */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03d9, code lost:
    
        if (r7 != false) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ec  */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.util.List] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4320p m1219o(C4322r c4322r, C4320p c4320p, C4320p c4320p2) {
        int i9;
        C3510n c3510n;
        C3510n c3510n2;
        long jDoubleToLongBits;
        C3515s c3515s;
        C4320p c4320p3;
        ?? arrayList;
        AbstractC3506j abstractC3506j;
        C4320p c4320p4;
        C4320p c4320pM1219o;
        C2829f c2829f = c4320p.f9217g;
        EnumC3400k enumC3400k = c4320p.f14396k;
        if (!c2829f.mo6235a(EnumC2824a.f9166s)) {
            Iterator it = c4320p.f14398m.iterator();
            boolean zM7435c = false;
            boolean z9 = false;
            while (true) {
                i9 = 1;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC3508l abstractC3508l = (AbstractC3508l) it.next();
                abstractC3508l.getClass();
                if ((abstractC3508l instanceof C3509m) && (c4320pM1219o = m1219o(c4322r, (c4320p4 = ((C3509m) abstractC3508l).f11421l), c4320p)) != null) {
                    abstractC3508l.m7388b0(c4322r, c4320pM1219o, false);
                    C5791l.m10478j(c4322r, c4320p4);
                    z9 = true;
                }
            }
            if (z9) {
                c4320p.mo8341Z();
                c4322r.m6231w(EnumC2824a.f9142b0);
            }
            int iOrdinal = enumC3400k.ordinal();
            EnumC3400k enumC3400k2 = EnumC3400k.f10983m;
            EnumC3400k enumC3400k3 = EnumC3400k.f10977g;
            if (iOrdinal == 3) {
                C3390a c3390a = (C3390a) c4320p;
                if (c3390a.f14398m.size() == 2) {
                    AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3509m) {
                        C4320p c4320p5 = ((C3509m) abstractC3508lMo7179S).f11421l;
                        if (c4320p5.f14396k == enumC3400k3) {
                            AbstractC3508l abstractC3508lMo7179S2 = c4320p5.mo7179S(0);
                            abstractC3508lMo7179S2.getClass();
                            c3510n = abstractC3508lMo7179S2 instanceof C3510n ? (C3510n) abstractC3508lMo7179S2 : null;
                            if (c3510n != null) {
                                long j3 = c3510n.f11422l;
                                int iM8279b = AbstractC4106c.m8279b(c3390a.f10928o);
                                if (iM8279b != 0) {
                                    if (iM8279b == 7) {
                                        AbstractC3508l abstractC3508lMo7179S3 = c3390a.mo7179S(0);
                                        if (abstractC3508lMo7179S3.mo7375I() == AbstractC3506j.f11386c && (j3 == 0 || j3 == 1)) {
                                            if (j3 != 0) {
                                                enumC3400k2 = EnumC3400k.f10982l;
                                            }
                                            C4320p c4320p6 = new C4320p(enumC3400k2, 1);
                                            c4320p6.m8688d0(c3390a.f14397l);
                                            c4320p6.mo7178I(abstractC3508lMo7179S3);
                                            return c4320p6;
                                        }
                                    }
                                } else if (!c3510n.m7389c0()) {
                                    AbstractC3506j abstractC3506j2 = c3510n.f11419i;
                                    if (abstractC3506j2 == AbstractC3506j.f11390g) {
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
                                        if (fIntBitsToFloat < 0.0f && Float.isFinite(fIntBitsToFloat)) {
                                        }
                                    } else if (abstractC3506j2 == AbstractC3506j.f11391h) {
                                        double dLongBitsToDouble = Double.longBitsToDouble(j3);
                                        if (dLongBitsToDouble < 0.0d && Double.isFinite(dLongBitsToDouble)) {
                                        }
                                    }
                                } else if (j3 < 0) {
                                    if (c3510n.m7389c0()) {
                                        jDoubleToLongBits = -j3;
                                    } else {
                                        AbstractC3506j abstractC3506j3 = c3510n.f11419i;
                                        if (abstractC3506j3 == AbstractC3506j.f11390g) {
                                            jDoubleToLongBits = Float.floatToIntBits(-Float.intBitsToFloat((int) j3));
                                        } else if (abstractC3506j3 == AbstractC3506j.f11391h) {
                                            jDoubleToLongBits = Double.doubleToLongBits(-Double.longBitsToDouble(j3));
                                        } else {
                                            c3510n2 = null;
                                            if (c3510n2 != null) {
                                                return new C3390a(2, c3390a.f14397l, c3390a.mo7179S(0), c3510n2);
                                            }
                                        }
                                    }
                                    c3510n2 = new C3510n(jDoubleToLongBits, c3510n.f11419i);
                                    if (c3510n2 != null) {
                                    }
                                }
                            }
                        }
                    } else {
                        if (abstractC3508lMo7179S instanceof C3510n) {
                            c3510n = (C3510n) abstractC3508lMo7179S;
                        }
                        if (c3510n != null) {
                        }
                    }
                }
            } else if (iOrdinal != 6) {
                EnumC3400k enumC3400k4 = EnumC3400k.f10980j;
                if (iOrdinal == 8) {
                    C3399j c3399j = (C3399j) c4320p;
                    if (!c3399j.f9217g.mo6235a(EnumC2824a.f9138X)) {
                        AbstractC3508l abstractC3508lMo7179S4 = c3399j.mo7179S(0);
                        AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S4.mo7375I();
                        if (abstractC3508lMo7179S4 instanceof C3509m) {
                            C4320p c4320p7 = ((C3509m) abstractC3508lMo7179S4).f11421l;
                            if (c4320p7.f14396k == EnumC3400k.f10963O) {
                                abstractC3506jMo7375I = ((C3403n) c4320p7).f11005p.f10151h;
                            }
                        }
                        AbstractC3506j abstractC3506j4 = (AbstractC3506j) c3399j.f10948o;
                        if (c4320p2 == null || c4320p2.f14396k != enumC3400k4) {
                            C4325u c4325u = c4322r.f14411l.f14371k;
                            C3503g c3503g = AbstractC3506j.f11385b;
                            if (abstractC3506jMo7375I.equals(abstractC3506j4) ? false : !c4325u.f14441g.f11519c.m7432d(abstractC3506jMo7375I, abstractC3506j4).m7435c()) {
                                AbstractC3508l abstractC3508lMo7179S5 = c3399j.mo7179S(0);
                                abstractC3508lMo7179S5.getClass();
                                if (!((!(abstractC3508lMo7179S5 instanceof C3514r) || (c3515s = ((C3514r) abstractC3508lMo7179S5).f11440m) == null || c3515s.f11445j.size() != 1 || c3515s.m7405j() || (c4320p3 = c3515s.f11444i.f11420j) == null || c4320p3.f14396k != EnumC3400k.f10949A) ? false : ((AbstractC3506j) ((C3399j) c4320p3).f10948o).equals(c3399j.f10948o))) {
                                    C4325u c4325u2 = c4322r.f14411l.f14371k;
                                    if (c4320p2 != null && c4320p2.f14396k == EnumC3400k.f10985o) {
                                        zM7435c = c4325u2.f14441g.f11519c.m7432d((AbstractC3506j) ((C3399j) c4320p2).f10948o, abstractC3506j4).m7435c();
                                    }
                                }
                            }
                            C4320p c4320p8 = new C4320p(enumC3400k2, 1);
                            c4320p8.f14399n = c3399j.f14399n;
                            c4320p8.m8688d0(c3399j.f14397l);
                            c4320p8.mo7178I(abstractC3508lMo7179S4);
                            return c4320p8;
                        }
                        abstractC3506jMo7375I.getClass();
                        if (abstractC3506jMo7375I instanceof C3503g) {
                            abstractC3506j4.getClass();
                            if (!(abstractC3506j4 instanceof C3503g) || abstractC3506j4.m7366p() <= abstractC3506jMo7375I.m7366p()) {
                            }
                        }
                    }
                } else {
                    if (iOrdinal == 15) {
                        m1217n(c4322r, (C3398i) c4320p);
                        return null;
                    }
                    if (iOrdinal != 20) {
                        if (iOrdinal == 31 || iOrdinal == 33) {
                            AbstractC3508l abstractC3508lMo7179S6 = c4320p.mo7179S(0);
                            abstractC3508lMo7179S6.getClass();
                            if (abstractC3508lMo7179S6 instanceof C3509m) {
                                C4320p c4320p9 = ((C3509m) abstractC3508lMo7179S6).f11421l;
                                EnumC3400k enumC3400k5 = c4320p9.f14396k;
                                EnumC3400k enumC3400k6 = EnumC3400k.f10970V;
                                if (enumC3400k5 == enumC3400k4 || enumC3400k5 == enumC3400k6) {
                                    AbstractC3508l abstractC3508lMo7179S7 = c4320p9.mo7179S(0);
                                    abstractC3508lMo7179S7.getClass();
                                    if (abstractC3508lMo7179S7 instanceof C3509m) {
                                        AbstractC3508l abstractC3508lMo7179S8 = c4320p9.mo7179S(0);
                                        C4320p c4320p10 = ((C3509m) abstractC3508lMo7179S8).f11421l;
                                        EnumC3400k enumC3400k7 = c4320p10.f14396k;
                                        EnumC3400k enumC3400k8 = EnumC3400k.f10959K;
                                        if (enumC3400k7 == enumC3400k8 || enumC3400k7 == EnumC3400k.f10961M) {
                                            if (((C3130c) ((C3399j) c4320p).f10948o).equals((C3130c) ((C3399j) c4320p10).f10948o)) {
                                                EnumC3400k enumC3400k9 = EnumC3400k.f10960L;
                                                if (enumC3400k7 == enumC3400k8 && enumC3400k == enumC3400k9) {
                                                    try {
                                                        if (!c4320p10.mo7179S(0).equals(c4320p.mo7179S(1))) {
                                                        }
                                                    } catch (Exception e6) {
                                                        f860h.mo6261o("Can't convert field arith insn: {}, mth: {}", c4320p, c4322r, e6);
                                                        return null;
                                                    }
                                                }
                                                AbstractC3508l abstractC3508lMo7374H = abstractC3508lMo7179S8.mo7374H();
                                                C5791l.m10478j(c4322r, c4320p10);
                                                if (enumC3400k == enumC3400k9) {
                                                    C5791l.m10477i(c4322r, c4320p.mo7179S(1));
                                                }
                                                EnumC2824a enumC2824a = EnumC2824a.f9134T;
                                                if (enumC3400k5 == enumC3400k4) {
                                                    C3390a c3390a2 = (C3390a) c4320p9;
                                                    C3390a c3390a3 = new C3390a(c3390a2.f10928o, null, abstractC3508lMo7374H, c3390a2.mo7179S(1));
                                                    c3390a3.m6231w(enumC2824a);
                                                    return c3390a3;
                                                }
                                                int size = c4320p9.f14398m.size();
                                                C4320p c4320p11 = new C4320p(enumC3400k6, size - 1);
                                                for (int i10 = 1; i10 < size; i10++) {
                                                    c4320p11.mo7178I(c4320p9.mo7179S(i10));
                                                }
                                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c4320p11);
                                                c3509mM7372Z.f11419i = AbstractC3506j.f11396m;
                                                C3390a c3390a4 = new C3390a(1, null, abstractC3508lMo7374H, c3509mM7372Z);
                                                c3390a4.m6231w(enumC2824a);
                                                return c3390a4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (iOrdinal == 34) {
                            C3403n c3403n = (C3403n) c4320p;
                            C3131d c3131d = c3403n.f11005p;
                            if (c3131d.f10153j.f10141j.equals("java.lang.StringBuilder") && c3131d.f10154k.equals("toString()Ljava/lang/String;")) {
                                AbstractC3508l abstractC3508lMo7179S9 = c3403n.mo7179S(0);
                                abstractC3508lMo7179S9.getClass();
                                if (abstractC3508lMo7179S9 instanceof C3509m) {
                                    ArrayList arrayList2 = new ArrayList();
                                    AbstractC3508l abstractC3508lMo7179S10 = c3403n.mo7179S(0);
                                    while (true) {
                                        abstractC3508lMo7179S10.getClass();
                                        if (!(abstractC3508lMo7179S10 instanceof C3509m)) {
                                            break;
                                        }
                                        C4320p c4320p12 = ((C3509m) abstractC3508lMo7179S10).f11421l;
                                        arrayList2.add(c4320p12);
                                        if (c4320p12.f14396k == EnumC3400k.f10967S || c4320p12.f14398m.size() == 0) {
                                            break;
                                        }
                                        abstractC3508lMo7179S10 = c4320p12.mo7179S(0);
                                    }
                                    Collections.reverse(arrayList2);
                                    return m1214j(c4322r, c3403n, arrayList2);
                                }
                                if (abstractC3508lMo7179S9 instanceof C3514r) {
                                    C3515s c3515s2 = ((C3514r) abstractC3508lMo7179S9).f11440m;
                                    boolean zM7405j = c3515s2.m7405j();
                                    ArrayList arrayList3 = c3515s2.f11445j;
                                    if (zM7405j || arrayList3.size() == 0) {
                                        arrayList = Collections.EMPTY_LIST;
                                    } else {
                                        arrayList = new ArrayList(arrayList3.size() + 1);
                                        C4320p c4320p13 = c3515s2.f11444i.f11420j;
                                        if (c4320p13 == null) {
                                            arrayList = Collections.EMPTY_LIST;
                                        } else {
                                            arrayList.add(c4320p13);
                                            Iterator it2 = arrayList3.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    C4320p c4320p14 = ((C3514r) it2.next()).f11420j;
                                                    if (c4320p14 == null) {
                                                        arrayList = Collections.EMPTY_LIST;
                                                        break;
                                                    }
                                                    arrayList.add(c4320p14);
                                                } else {
                                                    int iM10470a = AbstractC5790k.m10470a(arrayList, c3403n, 0);
                                                    if (arrayList.size() - 1 != iM10470a) {
                                                        arrayList = Collections.EMPTY_LIST;
                                                    } else {
                                                        arrayList.remove(iM10470a);
                                                        C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p13, c4322r.f14425z);
                                                        if (c4305aM35S == null) {
                                                            arrayList = Collections.EMPTY_LIST;
                                                        } else {
                                                            ArrayList arrayList4 = c4305aM35S.f14351l;
                                                            int iM10470a2 = AbstractC5790k.m10470a(arrayList4, c4320p13, 0);
                                                            int size2 = arrayList.size();
                                                            if (arrayList4.size() - iM10470a2 < size2) {
                                                                arrayList = Collections.EMPTY_LIST;
                                                            } else {
                                                                while (true) {
                                                                    if (i9 >= size2) {
                                                                        break;
                                                                    }
                                                                    if (arrayList4.get(iM10470a2 + i9) != arrayList.get(i9)) {
                                                                        arrayList = Collections.EMPTY_LIST;
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return m1214j(c4322r, c3403n, arrayList);
                                }
                            }
                        } else {
                            if (iOrdinal == 37) {
                                C4146b c4146b = (C4146b) c4320p;
                                C6028b c6028b = c4146b.f13664o;
                                if (c6028b.m10796L()) {
                                    m1217n(c4322r, (C3398i) c6028b.f24479k.f23527b);
                                    return null;
                                }
                                c4146b.m8343i0();
                                return null;
                            }
                            if (iOrdinal == 38) {
                                C4145a c4145a = (C4145a) c4320p;
                                C3131d c3131d2 = c4145a.f13662o;
                                List list = c4145a.f14398m;
                                if (c3131d2.f10153j.f10138g.equals(AbstractC3506j.f11396m) && list.size() != 0) {
                                    AbstractC3508l abstractC3508lMo7179S11 = c4145a.mo7179S(0);
                                    abstractC3508lMo7179S11.getClass();
                                    if (abstractC3508lMo7179S11 instanceof C3509m) {
                                        C4320p c4320p15 = ((C3509m) c4145a.mo7179S(0)).f11421l;
                                        EnumC3400k enumC3400k10 = c4320p15.f14396k;
                                        List list2 = c4320p15.f14398m;
                                        if (enumC3400k10 == EnumC3400k.f10954F && list2.size() != 0 && ((abstractC3506j = ((C3396g) c4320p15).f10941o) == AbstractC3506j.f11387d || abstractC3506j == AbstractC3506j.f11389f)) {
                                            int size3 = list2.size();
                                            byte[] bArr = new byte[size3];
                                            int i11 = 0;
                                            int i12 = 0;
                                            while (true) {
                                                if (i11 < size3) {
                                                    AbstractC3508l abstractC3508lMo7179S12 = c4320p15.mo7179S(i11);
                                                    abstractC3508lMo7179S12.getClass();
                                                    if (!(abstractC3508lMo7179S12 instanceof C3510n)) {
                                                        break;
                                                    }
                                                    byte b10 = (byte) ((C3510n) abstractC3508lMo7179S12).f11422l;
                                                    bArr[i11] = b10;
                                                    char c10 = (char) b10;
                                                    Pattern pattern = AbstractC2390d.f7853a;
                                                    if (' ' <= c10 && c10 <= '~') {
                                                        i12++;
                                                    }
                                                    i11++;
                                                } else if (i12 >= size3 - i12) {
                                                    C3393d c3393d = new C3393d(new String(bArr));
                                                    if (list.size() == 1) {
                                                        c3393d.m8688d0(c4145a.f14397l);
                                                        c3393d.m6225B(c4145a);
                                                        c3393d.m6393H(c4145a);
                                                        C5791l.m10477i(c4322r, c4145a.mo7179S(0));
                                                        return c3393d;
                                                    }
                                                    C3403n c3403n2 = new C3403n(this.f861g, 3, 1);
                                                    c3403n2.mo7178I(AbstractC3508l.m7372Z(c3393d));
                                                    C3509m c3509mM7372Z2 = AbstractC3508l.m7372Z(c3403n2);
                                                    c3509mM7372Z2.f11419i = this.f861g.f10151h;
                                                    c4145a.mo7182c0(0, c3509mM7372Z2);
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                AbstractC3508l abstractC3508lMo7179S13 = c4320p.mo7179S(0);
                abstractC3508lMo7179S13.getClass();
                if (abstractC3508lMo7179S13 instanceof C3510n) {
                    C4320p c4320p16 = new C4320p(enumC3400k3, 1);
                    c4320p16.m8688d0(c4320p.f14397l);
                    c4320p16.mo7178I(abstractC3508lMo7179S13);
                    c4320p16.m6225B(c4320p);
                    c4320p16.m6393H(c4320p);
                    return c4320p16;
                }
            }
            return null;
        }
        return null;
    }
}
