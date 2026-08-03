package be;

import ae.C0072c;
import ae.C0074e;
import ae.C0075f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.UnaryOperator;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p012ah.C0086a;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p199nd.C2973g0;
import p214oc.C3126c;
import p215od.C3130c;
import p232pc.C3382d;
import p233pd.C3390a;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.C3395f;
import p233pd.C3396g;
import p233pd.C3398i;
import p233pd.C3399j;
import p233pd.C3405p;
import p233pd.C3408s;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3512p;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3528k;
import p247qe.EnumC3529l;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4316l;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5792m;
import p351xe.C5784e;
import p351xe.C5791l;
import p369yd.C6028b;
import td.C4145a;
import td.C4146b;

/* JADX INFO: renamed from: be.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0276d0 extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f809g = AbstractC2846d.m6274b(C0276d0.class);

    /* JADX INFO: renamed from: h */
    public static final long f810h = Double.doubleToLongBits(1.0d);

    /* JADX INFO: renamed from: i */
    public static final long f811i = Float.floatToIntBits(1.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1113i(InterfaceC4316l interfaceC4316l, C4322r c4322r) {
        if (interfaceC4316l instanceof C4311g) {
            C4311g c4311g = (C4311g) interfaceC4316l;
            synchronized (c4311g) {
                c4311g.f14393o = AbstractC0283h.m1145Y(c4311g.f14393o, c4322r);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C4320p m1114j(C3514r c3514r) {
        C4320p c4320p;
        C3515s c3515s = c3514r.f11440m;
        int size = c3515s.f11445j.size();
        if (size == 0 || (c4320p = ((C3514r) c3515s.f11445j.get(0)).f11420j) == null) {
            return null;
        }
        return (size == 1 && c4320p.f14396k == EnumC3400k.f10983m) ? m1114j(c4320p.f14397l) : c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C4146b m1115k(C3514r c3514r, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        return new C4146b(new C6028b(new C5784e(new C3398i(1, abstractC3508l, new C3510n(1L, AbstractC3506j.f11386c)))), c3514r, new C3510n(abstractC3506j == AbstractC3506j.f11391h ? f810h : abstractC3506j == AbstractC3506j.f11390g ? f811i : 1L, abstractC3506j), new C3510n(0L, abstractC3506j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
    
        if ((r6 instanceof p246qd.C3499c) == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        int i9;
        C3514r c3514r;
        Iterator it;
        ArrayList arrayList;
        int i10;
        EnumC3400k enumC3400k;
        int i11;
        InterfaceC4316l interfaceC4316lM8654Y;
        InterfaceC4316l interfaceC4316lM8654Y2;
        EnumC3400k enumC3400k2;
        int i12;
        boolean z9;
        C4320p c4320p;
        C3515s c3515s;
        AbstractC3506j abstractC3506j;
        if (c4322r.f14415p) {
            return;
        }
        int i13 = 0;
        C5791l c5791l = new C5791l(c4322r, 0);
        C4309e c4309e = c4322r.f14411l;
        Iterator it2 = c4322r.f14425z.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            int i14 = 1;
            EnumC3400k enumC3400k3 = EnumC3400k.f10983m;
            if (!zHasNext) {
                int i15 = i13;
                Iterator it3 = c4322r.f14425z.iterator();
                while (it3.hasNext()) {
                    ArrayList<C4320p> arrayList2 = ((C4305a) it3.next()).f14351l;
                    c5791l.f23536a = arrayList2;
                    for (C4320p c4320p2 : arrayList2) {
                        int iOrdinal = c4320p2.f14396k.ordinal();
                        if (iOrdinal == 10 || iOrdinal == 29 || iOrdinal == 36) {
                            c5791l.m10481a(c4320p2);
                        } else if (c4320p2.f9217g.mo6235a(EnumC2824a.f9168u)) {
                            c5791l.m10481a(c4320p2);
                        }
                    }
                    c5791l.m10483c();
                }
                do {
                    i9 = i15;
                    for (C4305a c4305a : c4322r.f14425z) {
                        Iterator it4 = c4305a.f14351l.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                C4320p c4320p3 = (C4320p) it4.next();
                                if (c4320p3.f14396k == enumC3400k3 && c4320p3.f9217g.mo6240f() && (c3514r = c4320p3.f14397l) != null && c3514r.f11440m.f11445j.size() == 0) {
                                    C5791l.m10478j(c4322r, c4320p3);
                                    C5791l.m10475g(c4322r, c4305a, c4320p3);
                                    i9 = 1;
                                }
                            }
                        }
                    }
                } while (i9 != 0);
                return;
            }
            C4305a c4305a2 = (C4305a) it2.next();
            ArrayList arrayList3 = c4305a2.f14351l;
            c5791l.f23536a = arrayList3;
            int size = arrayList3.size();
            int i16 = i13;
            while (i16 < size) {
                C4320p c4320p4 = (C4320p) arrayList3.get(i16);
                int iOrdinal2 = c4320p4.f14396k.ordinal();
                EnumC3400k enumC3400k4 = EnumC3400k.f10961M;
                if (iOrdinal2 == 0 || iOrdinal2 == i14 || iOrdinal2 == 2) {
                    it = it2;
                    arrayList = arrayList3;
                    i10 = size;
                    enumC3400k = enumC3400k3;
                    EnumC3400k enumC3400k5 = c4320p4.f14396k;
                    if (enumC3400k5 == EnumC3400k.f10978h) {
                        i14 = 1;
                        interfaceC4316lM8654Y = c4309e.m8653X(((C3393d) c4320p4).f10930o, true);
                    } else {
                        i14 = 1;
                        if (enumC3400k5 == EnumC3400k.f10979i) {
                            interfaceC4316lM8654Y = c4309e.m8653X(((C3392c) c4320p4).f10929o, true);
                        } else {
                            i11 = 0;
                            interfaceC4316lM8654Y = c4309e.m8654Y((C3510n) c4320p4.mo7179S(0));
                            if (interfaceC4316lM8654Y == null) {
                                C3399j c3399j = new C3399j(enumC3400k4, interfaceC4316lM8654Y.mo6656f(), i11);
                                c3399j.m8688d0(c4320p4.f14397l);
                                AbstractC0000a.m18J0(c4322r, c4305a2, i16, c3399j);
                                m1113i(interfaceC4316lM8654Y, c4322r);
                            }
                        }
                    }
                    i11 = 0;
                    if (interfaceC4316lM8654Y == null) {
                    }
                } else {
                    if (iOrdinal2 == 3) {
                        it = it2;
                        arrayList = arrayList3;
                        i10 = size;
                        enumC3400k = enumC3400k3;
                        C3390a c3390a = (C3390a) c4320p4;
                        if (c3390a.f14398m.size() != 2) {
                            C0086a.m452k("Invalid args count in insn: ".concat(String.valueOf(c3390a)));
                            return;
                        }
                        AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(1);
                        abstractC3508lMo7179S.getClass();
                        if ((abstractC3508lMo7179S instanceof C3510n) && (interfaceC4316lM8654Y2 = c4309e.m8654Y((C3510n) abstractC3508lMo7179S)) != null && c3390a.mo7181b0(abstractC3508lMo7179S, AbstractC3508l.m7372Z(new C3399j(enumC3400k4, interfaceC4316lM8654Y2.mo6656f(), 0)))) {
                            m1113i(interfaceC4316lM8654Y2, c4322r);
                        }
                    } else if (iOrdinal2 == 8) {
                        it = it2;
                        arrayList = arrayList3;
                        i10 = size;
                        enumC3400k = enumC3400k3;
                        AbstractC3508l abstractC3508lMo7179S2 = c4320p4.mo7179S(i13);
                        if (abstractC3508lMo7179S2.mo7375I() == AbstractC3506j.f11386c) {
                            AbstractC3506j abstractC3506jMo7375I = c4320p4.f14397l.mo7375I();
                            abstractC3506jMo7375I.getClass();
                            if (abstractC3506jMo7375I instanceof C3503g) {
                                AbstractC0000a.m18J0(c4322r, c4305a2, i16, m1115k(c4320p4.f14397l, abstractC3508lMo7179S2, abstractC3506jMo7375I));
                            }
                        }
                    } else if (iOrdinal2 != 16) {
                        EnumC2824a enumC2824a = EnumC2824a.f9138X;
                        if (iOrdinal2 != 20) {
                            if (iOrdinal2 == 28) {
                                it = it2;
                                arrayList = arrayList3;
                                i10 = size;
                                C3405p c3405p = (C3405p) c4320p4;
                                C4320p c4320pM1114j = m1114j(c4320p4.f14397l);
                                if (c4320pM1114j != null && c4320pM1114j.f14396k == EnumC3400k.f10952D) {
                                    C3395f c3395f = (C3395f) c4320pM1114j;
                                    int i17 = c3395f.f10940p.f10936p;
                                    Object objM10488e = AbstractC5792m.m10488e(c4309e.f14371k, c3405p.mo7179S(0));
                                    if ((objM10488e instanceof C3510n) && i17 == ((int) ((C3510n) objM10488e).f11422l)) {
                                        AbstractC3506j abstractC3506j2 = c3405p.f11008o;
                                        AbstractC3506j abstractC3506jMo7340g = abstractC3506j2.mo7340g();
                                        AbstractC3506j abstractC3506j3 = c3395f.f10940p.f10938r;
                                        abstractC3506j3.getClass();
                                        abstractC3506jMo7340g.getClass();
                                        if ((abstractC3506jMo7340g instanceof C3503g) && abstractC3506j3.mo7349a(abstractC3506jMo7340g.mo7343o())) {
                                            abstractC3506j3 = abstractC3506jMo7340g;
                                        }
                                        if (abstractC3506j3.equals(abstractC3506jMo7340g) || abstractC3506j2.equals(AbstractC3506j.f11394k)) {
                                            enumC3400k2 = enumC3400k3;
                                            abstractC3506j = abstractC3506jMo7340g;
                                        } else {
                                            String strM10487d = AbstractC5792m.m10487d(c3395f.f14399n);
                                            String strValueOf = String.valueOf(abstractC3506j3);
                                            String strValueOf2 = String.valueOf(abstractC3506jMo7340g);
                                            abstractC3506j = abstractC3506jMo7340g;
                                            enumC3400k2 = enumC3400k3;
                                            StringBuilder sbM1027p = AbstractC0255e.m1027p("Incorrect type for fill-array insn ", strM10487d, ", element type: ", strValueOf, ", insn element type: ");
                                            sbM1027p.append(strValueOf2);
                                            c4322r.m6382K(sbM1027p.toString());
                                        }
                                        if (!abstractC3506j3.mo7345w()) {
                                            f809g.mo6265s(abstractC3506j3, "Unknown array element type: {} in mth: {}", c4322r);
                                            AbstractC3506j abstractC3506jMo7338A = abstractC3506j.mo7345w() ? abstractC3506j : abstractC3506j3.mo7338A();
                                            if (abstractC3506jMo7338A == null) {
                                                C0086a.m452k("Null array element type");
                                                return;
                                            }
                                            abstractC3506j3 = abstractC3506jMo7338A;
                                        }
                                        ArrayList<C3510n> arrayList4 = (ArrayList) c3395f.m7172i0(abstractC3506j3);
                                        C3396g c3396g = new C3396g(arrayList4.size(), abstractC3506j3);
                                        c3396g.m8688d0(c3405p.f14397l.mo7374H());
                                        for (C3510n c3510n : arrayList4) {
                                            InterfaceC4316l interfaceC4316lM8654Y3 = c4309e.m8654Y(c3510n);
                                            if (interfaceC4316lM8654Y3 != null) {
                                                c3396g.mo7178I(AbstractC3508l.m7372Z(new C3399j(enumC3400k4, interfaceC4316lM8654Y3.mo6656f(), 0)));
                                                m1113i(interfaceC4316lM8654Y3, c4322r);
                                            } else {
                                                c3396g.mo7178I(c3510n.mo7374H());
                                            }
                                        }
                                        AbstractC0000a.m18J0(c4322r, c4305a2, i16, c3396g);
                                        c5791l.m10481a(c4320pM1114j);
                                    } else {
                                        enumC3400k2 = enumC3400k3;
                                    }
                                    enumC3400k = enumC3400k2;
                                }
                            } else if (iOrdinal2 == 38) {
                                it = it2;
                                arrayList = arrayList3;
                                i10 = size;
                                C4145a c4145a = (C4145a) c4320p4;
                                InterfaceC4317m interfaceC4317mM3342g = c4309e.f14371k.f14442h.m3342g(c4145a);
                                List list = c4145a.f14398m;
                                if (interfaceC4317mM3342g instanceof C4322r) {
                                    C4322r c4322r2 = (C4322r) interfaceC4317mM3342g;
                                    if (c4322r2.f9217g.mo6235a(EnumC2824a.f9122H)) {
                                        if (!c4322r2.f9217g.mo6235a(EnumC2824a.f9121G)) {
                                            C2973g0 c2973g0 = (C2973g0) c4322r2.f9217g.mo6237c(C2825b.f9202q);
                                            if (c2973g0 != null) {
                                                int iMin = Math.min(c4322r2.f14410k.f10152i.size(), list.size());
                                                for (int i18 = 0; i18 < iMin; i18++) {
                                                    if (c2973g0.f9732g.get(i18)) {
                                                        AbstractC3508l abstractC3508lMo7179S3 = c4145a.mo7179S(i18);
                                                        abstractC3508lMo7179S3.m6231w(EnumC2824a.f9164q);
                                                        if (abstractC3508lMo7179S3 instanceof C3514r) {
                                                            ((C3514r) abstractC3508lMo7179S3).f11440m.m7398b().f11414d = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                list.forEach(new C0074e(4));
                                            }
                                        }
                                    }
                                }
                            } else if (iOrdinal2 == 30 || iOrdinal2 == 31) {
                                C3399j c3399j2 = (C3399j) c4320p4;
                                AbstractC3508l abstractC3508lMo7179S4 = c3399j2.mo7179S(c3399j2.f14396k == EnumC3400k.f10959K ? 0 : i14);
                                if (abstractC3508lMo7179S4.f9217g.mo6235a(EnumC2824a.f9125K)) {
                                    it = it2;
                                    arrayList = arrayList3;
                                    i10 = size;
                                } else {
                                    boolean z10 = abstractC3508lMo7179S4 instanceof C3509m;
                                    EnumC3400k enumC3400k6 = EnumC3400k.f10985o;
                                    if (!z10 || ((C3509m) abstractC3508lMo7179S4).f11421l.f14396k != enumC3400k6) {
                                        C3130c c3130c = (C3130c) c3399j2.f10948o;
                                        AbstractC3506j abstractC3506j4 = c3130c.f10146g.f10138g;
                                        AbstractC3506j abstractC3506jMo7375I2 = abstractC3508lMo7179S4.mo7375I();
                                        if (!Objects.equals(abstractC3506j4, abstractC3506jMo7375I2)) {
                                            it = it2;
                                            C4325u c4325u = c4309e.f14371k;
                                            C4311g c4311gM8717h = c4325u.m8717h(c3130c);
                                            if (c4311gM8717h == null) {
                                                EnumC3529l enumC3529lM7432d = c4325u.f14441g.f11519c.m7432d(abstractC3506jMo7375I2, abstractC3506j4);
                                                if (!enumC3529lM7432d.m7434b()) {
                                                    if (enumC3529lM7432d == EnumC3529l.f11483i) {
                                                        abstractC3506jMo7375I2.getClass();
                                                    }
                                                    arrayList = arrayList3;
                                                    i10 = size;
                                                    C3399j c3399j3 = new C3399j(enumC3400k6, abstractC3506j4, 1);
                                                    c3399j3.mo7178I(abstractC3508lMo7179S4.mo7374H());
                                                    c3399j3.m6231w(EnumC2824a.f9159m);
                                                    c3399j3.m6231w(enumC2824a);
                                                    AbstractC3508l abstractC3508lM7373a0 = AbstractC3508l.m7373a0(c3399j3);
                                                    abstractC3508lM7373a0.mo7386W(abstractC3506j4);
                                                    c3399j2.mo7181b0(abstractC3508lMo7179S4, abstractC3508lM7373a0);
                                                    C5791l.m10477i(c4322r, abstractC3508lMo7179S4);
                                                }
                                            } else {
                                                C0192k c0192k = c4311gM8717h.f14391m;
                                                if (!c0192k.m855g()) {
                                                    C4309e c4309e2 = c4311gM8717h.f14389k;
                                                    if (c4309e.equals(c4309e2)) {
                                                        arrayList = arrayList3;
                                                        if (!c4322r.f14412m.m856h()) {
                                                        }
                                                    } else {
                                                        arrayList = arrayList3;
                                                    }
                                                    if (c0192k.m853e()) {
                                                        i10 = size;
                                                    } else {
                                                        i10 = size;
                                                        if (!Objects.equals(c4309e.f14373m.m6647l(), c4309e2.f14373m.m6647l())) {
                                                            if ((c0192k.f488b & 7) != 0) {
                                                                C3528k c3528k = c4325u.f14441g.f11519c;
                                                                c3528k.getClass();
                                                                AbstractC3506j abstractC3506jM8657b0 = c4309e.m8657b0();
                                                                AbstractC3506j abstractC3506jM8657b02 = c4309e2.m8657b0();
                                                                if (((abstractC3506jM8657b0 == abstractC3506jM8657b02 || Objects.equals(abstractC3506jM8657b0, abstractC3506jM8657b02)) ? EnumC3529l.f11481g : c3528k.m7431c(abstractC3506jM8657b0, abstractC3506jM8657b02)) != EnumC3529l.f11482h) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C3399j c3399j32 = new C3399j(enumC3400k6, abstractC3506j4, 1);
                                                    c3399j32.mo7178I(abstractC3508lMo7179S4.mo7374H());
                                                    c3399j32.m6231w(EnumC2824a.f9159m);
                                                    c3399j32.m6231w(enumC2824a);
                                                    AbstractC3508l abstractC3508lM7373a02 = AbstractC3508l.m7373a0(c3399j32);
                                                    abstractC3508lM7373a02.mo7386W(abstractC3506j4);
                                                    c3399j2.mo7181b0(abstractC3508lMo7179S4, abstractC3508lM7373a02);
                                                    C5791l.m10477i(c4322r, abstractC3508lMo7179S4);
                                                }
                                                i10 = size;
                                            }
                                        }
                                        arrayList = arrayList3;
                                        i10 = size;
                                    }
                                }
                            } else {
                                switch (iOrdinal2) {
                                    case 12:
                                        C0072c c0072c = (C0072c) c4305a2.f9217g.mo6237c(C2825b.f9178E);
                                        if (c0072c != null) {
                                            C0075f c0075f = c0072c.f229g;
                                            C3514r c3514r2 = c4320p4.f14397l;
                                            AbstractC3506j abstractC3506jM443b = c0075f.m443b();
                                            String str = c0075f.m444c() ? "th" : "e";
                                            if (c3514r2.getName() == null) {
                                                c3514r2.mo7390p(str);
                                            }
                                            C3515s c3515s2 = c4320p4.f14397l.f11440m;
                                            if (c3515s2.f11445j.size() == 0) {
                                                c0075f.f237f = new C3512p(str, abstractC3506jM443b);
                                                c5791l.m10481a(c4320p4);
                                            } else if (c3515s2.m7405j()) {
                                                C4320p c4320p5 = new C4320p(enumC3400k3, i14);
                                                c4320p5.m8688d0(c4320p4.f14397l);
                                                C3512p c3512p = new C3512p(str, abstractC3506jM443b);
                                                c4320p5.mo7178I(c3512p);
                                                c0075f.f237f = c3512p;
                                                AbstractC0000a.m18J0(c4322r, c4305a2, 0, c4320p5);
                                            }
                                            c4305a2.m6224A(c4320p4, C2825b.f9186a);
                                        }
                                        it = it2;
                                        arrayList = arrayList3;
                                        i10 = size;
                                        i11 = 0;
                                        break;
                                    case 13:
                                    case 14:
                                        ArrayList arrayList5 = c4320p4.f14397l.f11440m.f11445j;
                                        if (AbstractC0283h.m1159g(arrayList5, new C0019b(15))) {
                                            Iterator it5 = new ArrayList(arrayList5).iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    c5791l.m10481a(c4320p4);
                                                    break;
                                                } else {
                                                    C3514r c3514r3 = (C3514r) it5.next();
                                                    C4320p c4320p6 = c3514r3.f11420j;
                                                    if (c4320p6 != null && !c4320p6.mo7181b0(c3514r3, AbstractC3508l.m7373a0(c4320p4.mo7167O()))) {
                                                        c4322r.m6383L("Failed to inline CMP insn: " + String.valueOf(c4320p4) + " into " + String.valueOf(c4320p6));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    default:
                                        i11 = i13;
                                        it = it2;
                                        arrayList = arrayList3;
                                        i10 = size;
                                        break;
                                }
                                enumC3400k = enumC3400k3;
                            }
                            enumC3400k = enumC3400k3;
                        } else {
                            it = it2;
                            enumC3400k2 = enumC3400k3;
                            arrayList = arrayList3;
                            i10 = size;
                            C3399j c3399j4 = (C3399j) c4320p4;
                            AbstractC3508l abstractC3508lMo7179S5 = c3399j4.mo7179S(0);
                            if (abstractC3508lMo7179S5.mo7384R()) {
                                c3399j4.m6231w(enumC2824a);
                                enumC3400k = enumC3400k2;
                            } else {
                                AbstractC3506j abstractC3506j5 = (AbstractC3506j) c3399j4.f10948o;
                                C4325u c4325u2 = c4309e.f14371k;
                                AbstractC3506j abstractC3506jMo7375I3 = abstractC3508lMo7179S5.mo7375I();
                                C3503g c3503g = AbstractC3506j.f11385b;
                                if (abstractC3506jMo7375I3.equals(abstractC3506j5)) {
                                    z9 = false;
                                    i12 = 1;
                                } else {
                                    boolean zM7435c = c4325u2.f14441g.f11519c.m7432d(abstractC3506jMo7375I3, abstractC3506j5).m7435c();
                                    i12 = 1;
                                    z9 = !zM7435c;
                                }
                                if (z9) {
                                    enumC3400k = enumC3400k2;
                                    AbstractC3508l abstractC3508lMo7179S6 = c3399j4.mo7179S(0);
                                    abstractC3508lMo7179S6.getClass();
                                    if (!(abstractC3508lMo7179S6 instanceof C3514r) || (c3515s = ((C3514r) abstractC3508lMo7179S6).f11440m) == null || c3515s.f11445j.size() != 1 || c3515s.m7405j() || (c4320p = c3515s.f11444i.f11420j) == null || c4320p.f14396k != EnumC3400k.f10949A || !((AbstractC3506j) ((C3399j) c4320p).f10948o).equals(c3399j4.f10948o)) {
                                        c4320p = null;
                                    }
                                    if (c4320p != null) {
                                        C4320p c4320p7 = new C4320p(enumC3400k, 1);
                                        c4320p7.m8688d0(c4320p.f14397l);
                                        c4320p7.mo7178I(c4320p.mo7179S(0));
                                        AbstractC0000a.m20K0(c4322r, c4305a2, c4320p, c4320p7);
                                    }
                                } else {
                                    C3514r c3514r4 = c3399j4.f14397l;
                                    c3514r4.mo7386W(abstractC3508lMo7179S5.mo7375I());
                                    enumC3400k = enumC3400k2;
                                    C4320p c4320p8 = new C4320p(enumC3400k, i12);
                                    c4320p8.m8688d0(c3514r4);
                                    c4320p8.mo7178I(abstractC3508lMo7179S5);
                                    AbstractC0000a.m18J0(c4322r, c4305a2, i16, c4320p8);
                                }
                            }
                        }
                    } else {
                        it = it2;
                        arrayList = arrayList3;
                        i10 = size;
                        enumC3400k = enumC3400k3;
                        C3408s c3408s = (C3408s) c4320p4;
                        int[] iArr = c3408s.m7188l0().f11011p;
                        int length = iArr.length;
                        for (int i19 = 0; i19 < length; i19++) {
                            InterfaceC4316l interfaceC4316lM8653X = c4309e.m8653X(Integer.valueOf(iArr[i19]), true);
                            if (interfaceC4316lM8653X != null) {
                                c3408s.m7189m0(i19, interfaceC4316lM8653X);
                                m1113i(interfaceC4316lM8653X, c4322r);
                            }
                        }
                    }
                    i14 = 1;
                    i11 = 0;
                }
                i16++;
                enumC3400k3 = enumC3400k;
                i13 = i11;
                it2 = it;
                arrayList3 = arrayList;
                size = i10;
            }
            c5791l.m10483c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public final boolean mo1054h(C4309e c4309e) {
        if (!c4309e.f14371k.f14435a.f716B) {
            return true;
        }
        m1117m(c4309e, (C3382d) c4309e.f9217g.mo6237c(C3126c.f10128a));
        c4309e.f14381u.forEach(new C0272b0(this, c4309e, 0));
        c4309e.f14380t.forEach(new C0272b0(this, c4309e, 1));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C2958a m1116l(final C4309e c4309e, C2958a c2958a) {
        int i9 = c2958a.f9704g;
        Object obj = c2958a.f9705h;
        if (i9 == 18) {
            for (Map.Entry entry : ((C2959b) obj).f9708c.entrySet()) {
                entry.setValue(m1116l(c4309e, (C2958a) entry.getValue()));
            }
            return c2958a;
        }
        if (i9 != 17) {
            InterfaceC4316l interfaceC4316lM8653X = c4309e.m8653X(obj, true);
            return interfaceC4316lM8653X != null ? new C2958a(13, interfaceC4316lM8653X.mo6656f()) : c2958a;
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            list.replaceAll(new UnaryOperator() { // from class: be.c0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return this.f806a.m1116l(c4309e, (C2958a) obj2);
                }
            });
        }
        return new C2958a(17, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1117m(C4309e c4309e, C3382d c3382d) {
        if (c3382d == null) {
            return;
        }
        for (C2959b c2959b : c3382d.f10916g.values()) {
            if (c2959b.f9706a != 3) {
                for (Map.Entry entry : c2959b.f9708c.entrySet()) {
                    entry.setValue(m1116l(c4309e, (C2958a) entry.getValue()));
                }
            }
        }
    }
}
