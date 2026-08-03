package be;

import ae.C0073d;
import af.C0084g;
import ie.C2042a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p233pd.AbstractC3391b;
import p233pd.C3399j;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p247qe.C3528k;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: be.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307y extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public C4325u f878g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0307y.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1221i(AbstractC3391b abstractC3391b, int i9, ArrayList arrayList, ArrayList arrayList2) {
        int size = abstractC3391b.f14398m.size();
        for (int i10 = i9; i10 < size; i10++) {
            AbstractC3508l abstractC3508lMo7179S = abstractC3391b.mo7179S(i10);
            int i11 = i10 - i9;
            AbstractC3506j abstractC3506j = (AbstractC3506j) arrayList.get(i11);
            AbstractC3506j abstractC3506j2 = (AbstractC3506j) arrayList2.get(i11);
            if (abstractC3506j2 != null) {
                boolean zEquals = abstractC3506j2.equals(abstractC3506j);
                EnumC2824a enumC2824a = EnumC2824a.f9138X;
                EnumC3400k enumC3400k = EnumC3400k.f10949A;
                if (zEquals) {
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3509m) {
                        C4320p c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
                        if (c4320p.f14396k == enumC3400k) {
                            c4320p.m6231w(enumC2824a);
                        }
                    }
                } else {
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3510n) {
                        abstractC3506j.getClass();
                        if ((abstractC3506j instanceof C3503g) && (abstractC3506j2 instanceof C3503g)) {
                            abstractC3508lMo7179S.mo7386W(abstractC3506j2);
                            abstractC3508lMo7179S.m6231w(EnumC2824a.f9137W);
                        } else {
                            InterfaceC2844b interfaceC2844b = AbstractC5792m.f23539a;
                            if ((abstractC3508lMo7179S instanceof C3509m) && ((C3509m) abstractC3508lMo7179S).f11421l.f14396k == enumC3400k) {
                                ((C3399j) ((C3509m) abstractC3508lMo7179S).f11421l).f10948o = abstractC3506j2;
                            } else {
                                C3399j c3399j = new C3399j(EnumC3400k.f10985o, abstractC3506j2, 1);
                                c3399j.mo7178I(abstractC3508lMo7179S);
                                c3399j.m6231w(enumC2824a);
                                C3509m c3509mM7372Z = AbstractC3508l.m7372Z(c3399j);
                                c3509mM7372Z.f11419i = abstractC3506j2;
                                abstractC3391b.mo7182c0(i10, c3509mM7372Z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m1222j(AbstractC3391b abstractC3391b, int i9) {
        AbstractC3506j abstractC3506jMo7375I;
        int size = abstractC3391b.f14398m.size();
        ArrayList arrayList = new ArrayList(size);
        while (i9 < size) {
            AbstractC3508l abstractC3508lMo7179S = abstractC3391b.mo7179S(i9);
            if (abstractC3508lMo7179S instanceof C3510n) {
                C3510n c3510n = (C3510n) abstractC3508lMo7179S;
                AbstractC3506j abstractC3506j = c3510n.f11419i;
                if (c3510n.f11422l == 0 && (abstractC3506j.mo7351v() || (abstractC3506j instanceof C3497a))) {
                    abstractC3506jMo7375I = AbstractC3506j.f11405v;
                } else {
                    abstractC3506j.getClass();
                    if (abstractC3506j instanceof C3503g) {
                        abstractC3506jMo7375I = !abstractC3508lMo7179S.f9217g.mo6235a(EnumC2824a.f9137W) ? AbstractC3506j.f11385b : abstractC3508lMo7179S.f11419i;
                    }
                }
            } else if (abstractC3508lMo7179S instanceof C3514r) {
                abstractC3506jMo7375I = abstractC3508lMo7179S.mo7375I();
            } else {
                if (!(abstractC3508lMo7179S instanceof C3509m)) {
                    C0086a.m452k("Unknown var type for: ".concat(String.valueOf(abstractC3508lMo7179S)));
                    return null;
                }
                C4320p c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
                int iOrdinal = c4320p.f14396k.ordinal();
                if (iOrdinal == 8 || iOrdinal == 20) {
                    abstractC3506jMo7375I = (AbstractC3506j) ((C3399j) c4320p).f10948o;
                } else {
                    C3514r c3514r = c4320p.f14397l;
                    abstractC3506jMo7375I = c3514r != null ? c3514r.mo7375I() : abstractC3508lMo7179S.f11419i;
                }
            }
            arrayList.add(abstractC3506jMo7375I);
            i9++;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m1223m(ArrayList arrayList, List list) {
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            if (!((AbstractC3506j) arrayList.get(i9)).mo7345w()) {
                arrayList.set(i9, (AbstractC3506j) list.get(i9));
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f878g = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p) {
            return;
        }
        for (C4305a c4305a : c4322r.f14425z) {
            C2829f c2829f = c4305a.f9217g;
            EnumC2824a enumC2824a = EnumC2824a.f9166s;
            if (!c2829f.mo6235a(enumC2824a)) {
                for (C4320p c4320p : c4305a.f14351l) {
                    if (!c4320p.f9217g.mo6235a(enumC2824a)) {
                        c4320p.mo8342h0(new C0305w(this, c4322r));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final ArrayList m1224k(ArrayList arrayList, ArrayList arrayList2, Function function) {
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4317m interfaceC4317m = (InterfaceC4317m) it.next();
            List listMo2218c = interfaceC4317m.mo2218c();
            int size = listMo2218c.size();
            if (size == arrayList2.size()) {
                C3528k c3528k = this.f878g.f14441g.f11519c;
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        arrayList3.add(interfaceC4317m);
                        break;
                    }
                    if (!((Boolean) function.apply(c3528k.m7432d((AbstractC3506j) arrayList2.get(i9), (AbstractC3506j) listMo2218c.get(i9)))).booleanValue()) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m1225l(InterfaceC4317m interfaceC4317m, ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayListM1224k = m1224k(arrayList, arrayList2, new C0073d(14));
            if (arrayListM1224k.size() == 1) {
                return ((InterfaceC4317m) arrayListM1224k.get(0)).equals(interfaceC4317m);
            }
            ArrayList arrayListM1224k2 = m1224k(arrayList, arrayList2, new C0073d(15));
            if (arrayListM1224k2.size() == 1) {
                return ((InterfaceC4317m) arrayListM1224k2.get(0)).equals(interfaceC4317m);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final InterfaceC4317m m1226n(InterfaceC4317m interfaceC4317m, Map map) {
        AbstractC3506j abstractC3506jM3346m;
        List listMo2218c = interfaceC4317m.mo2218c();
        int size = listMo2218c.size();
        ArrayList arrayList = new ArrayList(size);
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3506j abstractC3506j = (AbstractC3506j) listMo2218c.get(i9);
            if (abstractC3506j == null) {
                String strValueOf = String.valueOf(interfaceC4317m);
                String strValueOf2 = String.valueOf(listMo2218c);
                StringBuilder sbM2258u = AbstractC0921a.m2258u(i9, "Null arg type in ", strValueOf, " at: ", " in: ");
                sbM2258u.append(strValueOf2);
                throw new C0084g(sbM2258u.toString());
            }
            if (abstractC3506j.m7365c()) {
                AbstractC3506j abstractC3506jM3346m2 = this.f878g.f14443i.m3346m(abstractC3506j, map);
                if (abstractC3506jM3346m2 == null || abstractC3506jM3346m2.equals(abstractC3506j)) {
                    abstractC3506jM3346m2 = (AbstractC3506j) interfaceC4317m.mo2222q().f10152i.get(i9);
                }
                arrayList.add(abstractC3506jM3346m2);
                z9 = true;
            } else {
                arrayList.add(abstractC3506j);
            }
        }
        AbstractC3506j abstractC3506jMo2220e = interfaceC4317m.mo2220e();
        if (abstractC3506jMo2220e.m7365c() && ((abstractC3506jM3346m = this.f878g.f14443i.m3346m(abstractC3506jMo2220e, map)) == null || abstractC3506jM3346m.m7365c())) {
            abstractC3506jMo2220e = interfaceC4317m.mo2222q().f10151h;
            z9 = true;
        }
        if (!z9) {
            return interfaceC4317m;
        }
        C2042a c2042a = new C2042a(interfaceC4317m);
        c2042a.f6884i = arrayList;
        c2042a.f6883h = abstractC3506jMo2220e;
        return c2042a;
    }
}
