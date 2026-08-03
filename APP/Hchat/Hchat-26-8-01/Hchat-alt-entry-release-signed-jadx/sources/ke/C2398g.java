package ke;

import ae.C0076g;
import be.C0271b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import md.AbstractC2828e;
import md.C2825b;
import md.EnumC2824a;
import md.InterfaceC2832i;
import p038ce.C0561n;
import p077f8.AbstractC1089i;
import p170le.C2557e;
import p199nd.C2970f;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.C4319o;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p350xd.C5775b;
import p350xd.C5776c;
import p350xd.C5777d;
import p351xe.AbstractC5790k;
import p351xe.AbstractC5792m;
import p351xe.C5791l;
import p369yd.C6028b;
import p369yd.C6029c;
import p383zd.C6138c;
import p384ze.C6141c;
import td.C4146b;

/* JADX INFO: renamed from: ke.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2398g extends AbstractC3754e0 implements InterfaceC2395d {

    /* JADX INFO: renamed from: k */
    public static final C2398g f7864k = new C2398g(0);

    /* JADX INFO: renamed from: l */
    public static final C2398g f7865l = new C2398g(1);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7866j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ke.b.g(ud.r):void, ke.c.<clinit>():void, ke.g.<clinit>():void] */
    public /* synthetic */ C2398g(int i9) {
        this.f7866j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ud.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public static boolean m5732t0(InterfaceC4314j interfaceC4314j) {
        if (((AbstractC2828e) interfaceC4314j).f9217g.mo6235a(EnumC2824a.f9166s)) {
            return true;
        }
        if (interfaceC4314j instanceof C4305a) {
            return ((C4305a) interfaceC4314j).f14351l.isEmpty();
        }
        if (((interfaceC4314j instanceof C6138c) && ((C6138c) interfaceC4314j).f24726o == null) || !(interfaceC4314j instanceof InterfaceC4318n)) {
            return false;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            if (!m5732t0((InterfaceC4314j) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static void m5733u0(List list, C4305a c4305a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4305a c4305a2 = (C4305a) it.next();
            if (c4305a2 != c4305a) {
                c4305a2.f14351l.clear();
                c4305a2.m6231w(EnumC2824a.f9168u);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static boolean m5734v0(C4320p c4320p) {
        if (c4320p.f14396k == EnumC3400k.f10966R) {
            return true;
        }
        for (int i9 = 0; i9 < c4320p.f14398m.size(); i9++) {
            AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(i9);
            abstractC3508lMo7179S.getClass();
            if ((abstractC3508lMo7179S instanceof C3509m) && m5734v0(((C3509m) abstractC3508lMo7179S).f11421l)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static C4305a m5735w0(InterfaceC4314j interfaceC4314j) {
        if (!(interfaceC4314j instanceof C5775b)) {
            return null;
        }
        ArrayList arrayList = ((C5775b) interfaceC4314j).f23507k;
        if (arrayList.size() != 1) {
            return null;
        }
        InterfaceC4314j interfaceC4314j2 = (InterfaceC4314j) arrayList.get(0);
        if (!(interfaceC4314j2 instanceof C4305a)) {
            return null;
        }
        C4305a c4305a = (C4305a) interfaceC4314j2;
        if (c4305a.f14351l.size() == 1) {
            return c4305a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static boolean m5736x0(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        C4320p c4320p;
        C3514r c3514r;
        C3406q c3406qM7402f;
        AbstractC3508l abstractC3508lMo7374H;
        if (interfaceC4318n instanceof C6029c) {
            C6029c c6029c = (C6029c) interfaceC4318n;
            if (!c6029c.f9217g.mo6235a(EnumC2824a.f9132R)) {
                InterfaceC4314j interfaceC4314j = c6029c.f24480m;
                InterfaceC4314j interfaceC4314j2 = c6029c.f24481n;
                if (interfaceC4314j != null) {
                    C3514r c3514r2 = null;
                    if (interfaceC4314j2 == null) {
                        C4305a c4305aM5735w0 = m5735w0(interfaceC4314j);
                        if (c4305aM5735w0 != null && (c3514r = (c4320p = (C4320p) c4305aM5735w0.f14351l.get(0)).f14397l) != null && c3514r.f11440m.f11445j.size() == 1 && (c3406qM7402f = c3514r.f11440m.m7402f()) != null) {
                            List list = c3406qM7402f.f14398m;
                            if (list.size() == 2) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    AbstractC3508l abstractC3508l = (AbstractC3508l) it.next();
                                    if (!c3514r.m7396h0(abstractC3508l)) {
                                        c3514r2 = (C3514r) abstractC3508l;
                                        break;
                                    }
                                }
                                if (c3514r2 != null) {
                                    C4320p c4320pM7394f0 = c3514r2.m7394f0();
                                    if (c4322r.m8698W() || ((c4322r.f14411l.m8658c0() && c4322r.f14410k.m6662e()) || (c4320pM7394f0 == null || !c4320pM7394f0.m8686W() ? !c4320p.f14397l.m7395g0(c3514r2) : m5737y0(c4322r, c4320p, c4320pM7394f0)))) {
                                        C4305a c4305a = (C4305a) c6029c.f24476l.get(0);
                                        if (c6029c.f23506i.mo8674l(c6029c, c4305a)) {
                                            if (c4320pM7394f0 == null || !c4320pM7394f0.m8686W()) {
                                                abstractC3508lMo7374H = c3514r2.mo7374H();
                                            } else {
                                                C3515s c3515s = c4320pM7394f0.f14397l.f11440m;
                                                if (c3515s.f11445j.size() == 1 && c3515s.m7402f() == c3406qM7402f) {
                                                    C5791l.m10472d(c4322r, c4320pM7394f0);
                                                }
                                                abstractC3508lMo7374H = AbstractC3508l.m7373a0(c4320pM7394f0);
                                            }
                                            C4146b c4146b = new C4146b(c6029c.f24475k, c3406qM7402f.f14397l.mo7374H(), AbstractC3508l.m7373a0(c4320p), abstractC3508lMo7374H);
                                            c4146b.m8343i0();
                                            C5791l.m10476h(c4322r, c3406qM7402f);
                                            C5791l.m10480l(c4322r, c4320p);
                                            AbstractC5790k.m10471b(c4305aM5735w0, c4320p);
                                            c4305a.f14351l.clear();
                                            c4146b.mo8341Z();
                                            c4305a.f14351l.add(c4146b);
                                            m5733u0(c6029c.f24476l, c4305a);
                                            C0271b.m1089Y(c4322r);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        C4305a c4305aM5735w02 = m5735w0(interfaceC4314j);
                        C4305a c4305aM5735w03 = m5735w0(interfaceC4314j2);
                        if (c4305aM5735w02 != null && c4305aM5735w03 != null) {
                            List list2 = c6029c.f24476l;
                            if (!list2.isEmpty()) {
                                C4305a c4305a2 = (C4305a) list2.get(0);
                                C4320p c4320p2 = (C4320p) c4305aM5735w02.f14351l.get(0);
                                C4320p c4320p3 = (C4320p) c4305aM5735w03.f14351l.get(0);
                                if (m5737y0(c4322r, c4320p2, c4320p3)) {
                                    C3514r c3514r3 = c4320p2.f14397l;
                                    C3514r c3514r4 = c4320p3.f14397l;
                                    if (c3514r3 != null && c3514r4 != null) {
                                        C3406q c3406qM7402f2 = c3514r3.f11440m.m7402f();
                                        C3406q c3406qM7402f3 = c3514r4.f11440m.m7402f();
                                        if (c3406qM7402f2 != null && c3406qM7402f2 == c3406qM7402f3 && c6029c.f23506i.mo8674l(c6029c, c4305a2)) {
                                            AbstractC5790k.m10471b(c4305aM5735w02, c4320p2);
                                            AbstractC5790k.m10471b(c4305aM5735w03, c4320p3);
                                            if (c3406qM7402f2.f14398m.size() == 2) {
                                                c3514r3 = c3406qM7402f2.f14397l;
                                                C5791l.m10480l(c4322r, c4320p2);
                                            } else {
                                                c3406qM7402f2.m7186l0(c3514r4);
                                            }
                                            C4146b c4146b2 = new C4146b(c6029c.f24475k, c3514r3, AbstractC3508l.m7373a0(c4320p2), AbstractC3508l.m7373a0(c4320p3));
                                            c4146b2.f9752i = Math.max(c6029c.m10789H(), Math.max(c4320p2.f9752i, c4320p3.f9752i));
                                            c4320p2.f14397l = null;
                                            C5791l.m10480l(c4322r, c4320p3);
                                            c4305a2.f14351l.clear();
                                            c4146b2.mo8341Z();
                                            c4305a2.f14351l.add(c4146b2);
                                            m5733u0(list2, c4305a2);
                                            return true;
                                        }
                                    } else if (!c4322r.m8701Z()) {
                                        EnumC3400k enumC3400k = c4320p2.f14396k;
                                        EnumC3400k enumC3400k2 = EnumC3400k.f10986p;
                                        if (enumC3400k == enumC3400k2 && c4320p3.f14396k == enumC3400k2) {
                                            AbstractC3508l abstractC3508lMo7179S = c4320p2.mo7179S(0);
                                            AbstractC3508l abstractC3508lMo7179S2 = c4320p3.mo7179S(0);
                                            abstractC3508lMo7179S.getClass();
                                            boolean z9 = abstractC3508lMo7179S instanceof C3510n;
                                            abstractC3508lMo7179S2.getClass();
                                            if (z9 == (abstractC3508lMo7179S2 instanceof C3510n) && c6029c.f23506i.mo8674l(c6029c, c4305a2)) {
                                                AbstractC5790k.m10471b(c4305aM5735w02, c4320p2);
                                                AbstractC5790k.m10471b(c4305aM5735w03, c4320p3);
                                                EnumC2824a enumC2824a = EnumC2824a.f9161n;
                                                c4305aM5735w02.m6227D(enumC2824a);
                                                c4305aM5735w03.m6227D(enumC2824a);
                                                C4146b c4146b3 = new C4146b(c6029c.f24475k, null, abstractC3508lMo7179S, abstractC3508lMo7179S2);
                                                C4320p c4320p4 = new C4320p(enumC3400k2, 1);
                                                AbstractC3508l abstractC3508lM7373a0 = AbstractC3508l.m7373a0(c4146b3);
                                                abstractC3508lM7373a0.mo7386W(abstractC3508lMo7179S.mo7375I());
                                                c4320p4.mo7178I(abstractC3508lM7373a0);
                                                c4305a2.f14351l.clear();
                                                c4320p4.mo8341Z();
                                                c4305a2.f14351l.add(c4320p4);
                                                c4305a2.m6231w(enumC2824a);
                                                m5733u0(list2, c4305a2);
                                                return true;
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
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static boolean m5737y0(C4322r c4322r, C4320p c4320p, C4320p c4320p2) {
        int i9;
        int i10;
        C4320p c4320pM7394f0;
        int i11;
        if (c4322r.f9217g.mo6235a(EnumC2824a.f9144d0) && (i9 = c4320p.f9752i) != (i10 = c4320p2.f9752i)) {
            if (i9 != 0 && i10 != 0) {
                C3514r c3514r = c4320p.f14397l;
                if (c3514r == null || c4320p2.f14397l == null) {
                    return false;
                }
                C3406q c3406qM7402f = c3514r.f11440m.m7402f();
                C3406q c3406qM7402f2 = c4320p2.f14397l.f11440m.m7402f();
                if (c3406qM7402f2 == null || c3406qM7402f != c3406qM7402f2) {
                    return false;
                }
                HashMap map = new HashMap(c3406qM7402f.f14398m.size());
                for (AbstractC3508l abstractC3508l : c3406qM7402f.f14398m) {
                    abstractC3508l.getClass();
                    if ((abstractC3508l instanceof C3514r) && (c4320pM7394f0 = ((C3514r) abstractC3508l).m7394f0()) != null && (i11 = c4320pM7394f0.f9752i) != 0) {
                        map.merge(Integer.valueOf(i11), 1, new C2404m());
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Map.Entry) it.next()).getValue()).intValue() >= 2) {
                    }
                }
                return false;
            }
            if (m5734v0(c4320p) || m5734v0(c4320p2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        C4305a c4305a;
        C6028b c6028bM10792O;
        switch (this.f7866j) {
            case 1:
                if (!m5736x0(c4322r, interfaceC4318n)) {
                    return true;
                }
                c4322r.m6231w(EnumC2824a.f9142b0);
                return true;
            case 2:
                if ((interfaceC4318n instanceof C6138c) && (c4305a = ((C6138c) interfaceC4318n).f24726o) != null && c4305a.f14351l.size() != 1) {
                    c4322r.m6382K("Incorrect condition in loop: ".concat(String.valueOf(c4305a)));
                }
                return true;
            case 3:
                if (!(interfaceC4318n instanceof C5775b)) {
                    return true;
                }
                ((C5775b) interfaceC4318n).f23507k.removeIf(new C0561n(10));
                return true;
            case 4:
                if (interfaceC4318n instanceof C6029c) {
                    C6029c c6029c = (C6029c) interfaceC4318n;
                    if (AbstractC1089i.m2780n0(c6029c.f24481n)) {
                        if (!AbstractC1089i.m2780n0(c6029c.f24480m)) {
                            C2394c.m5720l(c6029c);
                        } else if (c4322r.f9217g.mo6235a(EnumC2824a.f9144d0)) {
                            int iM2720C = AbstractC1089i.m2720C(c6029c.f24480m);
                            int iM2720C2 = AbstractC1089i.m2720C(c6029c.f24481n);
                            if (iM2720C == 0 || iM2720C2 == 0) {
                                C6028b c6028b = c6029c.f24475k;
                                if (c6028b != null && (c6028bM10792O = C6028b.m10792O(c6028b)) != c6029c.f24475k) {
                                    c6029c.f24475k = c6028bM10792O;
                                    if (c6028bM10792O != null && c6028bM10792O.f24477i == 3) {
                                        C2394c.m5720l(c6029c);
                                    }
                                }
                                int iM2747R = AbstractC1089i.m2747R(c6029c.f24480m);
                                int iM2747R2 = AbstractC1089i.m2747R(c6029c.f24481n);
                                if (!C2394c.m5722n(c4322r, c6029c.f24481n)) {
                                    InterfaceC4314j interfaceC4314j = c6029c.f24480m;
                                    boolean zM2737L = interfaceC4314j == null ? false : AbstractC1089i.m2737L(interfaceC4314j, interfaceC4314j);
                                    InterfaceC4314j interfaceC4314j2 = c6029c.f24481n;
                                    if ((interfaceC4314j2 == null ? false : AbstractC1089i.m2737L(interfaceC4314j2, interfaceC4314j2)) && (!zM2737L || iM2747R2 < iM2747R)) {
                                        C2394c.m5720l(c6029c);
                                    } else if ((C2394c.m5721m(c6029c.f24480m) && !C2394c.m5721m(c6029c.f24481n) && !zM2737L) || AbstractC1089i.m2735K(c6029c.f24481n)) {
                                        C2394c.m5720l(c6029c);
                                    }
                                } else if (C2394c.m5722n(c4322r, c6029c.f24480m) && iM2747R2 < iM2747R) {
                                    C2394c.m5720l(c6029c);
                                } else if (iM2747R2 == 1) {
                                    boolean zM2739M = AbstractC1089i.m2739M(c6029c);
                                    if (zM2739M && c4322r.m8701Z()) {
                                        if (AbstractC5792m.m10493j(AbstractC1089i.m2724E(c6029c.f24481n), EnumC3400k.f10988r)) {
                                            C2394c.m5720l(c6029c);
                                        }
                                    } else if (iM2747R > 2 && (!zM2739M || iM2747R >= 4)) {
                                        C2394c.m5720l(c6029c);
                                    }
                                }
                            } else if (iM2720C > iM2720C2) {
                                C2394c.m5720l(c6029c);
                            }
                        }
                    }
                    if (!C2394c.m5722n(c4322r, c6029c.f24480m)) {
                        InterfaceC2832i interfaceC2832i = c6029c.f24481n;
                        if (interfaceC2832i instanceof C5775b) {
                            ArrayList arrayList = ((C5775b) interfaceC2832i).f23507k;
                            if (arrayList.size() == 1 && (arrayList.get(0) instanceof C6029c)) {
                                AbstractC2828e abstractC2828e = (AbstractC2828e) ((InterfaceC4314j) arrayList.get(0));
                                EnumC2824a enumC2824a = EnumC2824a.f9132R;
                                abstractC2828e.m6231w(enumC2824a);
                                ((AbstractC2828e) interfaceC2832i).m6231w(enumC2824a);
                            }
                        }
                    }
                }
                return true;
            default:
                return super.mo2614a(c4322r, interfaceC4318n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        C4305a c4305a;
        switch (this.f7866j) {
            case 0:
                if (interfaceC4318n instanceof C6138c) {
                    C6138c c6138c = (C6138c) interfaceC4318n;
                    C4305a c4305a2 = c6138c.f24727p;
                    if (c4305a2 != null && (c4305a = c6138c.f24726o) != null) {
                        ArrayList arrayList = c4305a.f14351l;
                        ArrayList arrayList2 = c4305a2.f14351l;
                        arrayList2.addAll(arrayList);
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        arrayList2.clear();
                        c6138c.f24727p = null;
                        break;
                    }
                } else if (interfaceC4318n instanceof C5777d) {
                    C5777d c5777d = (C5777d) interfaceC4318n;
                    Iterator it = c5777d.f23512l.iterator();
                    while (it.hasNext()) {
                        InterfaceC4314j interfaceC4314j = ((C5776c) it.next()).f23509b;
                        C6141c c6141c = new C6141c(c4322r);
                        AbstractC5700d.m10279h0(c4322r, new C2392a(new C0076g(c6141c, 6), 3), interfaceC4314j);
                        AbstractC5700d.m10279h0(c4322r, new C2557e(interfaceC4314j, c6141c, c5777d), interfaceC4314j);
                    }
                    break;
                } else if (interfaceC4318n instanceof C5775b) {
                    C5775b c5775b = (C5775b) interfaceC4318n;
                    ArrayList arrayList3 = c5775b.f23507k;
                    if (!arrayList3.isEmpty()) {
                        Object obj = (InterfaceC4314j) arrayList3.get(arrayList3.size() - 1);
                        List listMo6238d = ((AbstractC2828e) obj).f9217g.mo6238d(C2825b.f9174A);
                        if (!listMo6238d.isEmpty()) {
                            C2970f c2970f = (C2970f) listMo6238d.get(0);
                            C4305a c4305a3 = c2970f.f9725g;
                            C4320p c4320p = c2970f.f9727i;
                            if (c4305a3.equals(obj)) {
                                if (obj instanceof C4305a) {
                                    ArrayList arrayList4 = ((C4305a) obj).f14351l;
                                    if (arrayList4.isEmpty()) {
                                        arrayList4.add(c4320p);
                                    }
                                }
                                c5775b.m10464H(new C4319o(Collections.singletonList(c4320p)));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2395d
    /* JADX INFO: renamed from: c */
    public boolean mo193c(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        if (!m5736x0(c4322r, interfaceC4318n)) {
            return false;
        }
        C0271b.m1089Y(c4322r);
        return true;
    }
}
