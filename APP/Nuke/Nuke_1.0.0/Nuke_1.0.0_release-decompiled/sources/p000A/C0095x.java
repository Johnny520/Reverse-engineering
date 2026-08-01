package p000A;

import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p004A3.C0157b;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0377O;
import p037G2.AbstractC0489a;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p058L.C0920W;
import p076P.AbstractC1056B;
import p076P.AbstractC1072S;
import p076P.AbstractC1089e0;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p104U3.EnumC1477a;
import p108V3.AbstractC1543P;
import p108V3.C1544Q;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1672q;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p211o0.C2762u;
import p216p.AbstractC2856m;
import p227r.C2940A0;
import p227r.C3025y0;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3282o;
import p244u.AbstractC3287t;
import p244u.C3244M;
import p244u.C3251U;
import p244u.C3256Z;
import p244u.C3269g;
import p244u.C3289v;
import p244u.C3293z;
import p245u0.C3309f;
import p250v.AbstractC3349a;
import p264x3.C3449a;
import p264x3.C3450b;
import p276z3.AbstractC3518a;

/* JADX INFO: renamed from: A.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0095x implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f429d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f430e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f431f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f432g;

    public /* synthetic */ C0095x(C0038T0 c0038t0, InterfaceC2207p interfaceC2207p, String str, int i5) {
        this.f429d = 3;
        this.f432g = c0038t0;
        this.f430e = interfaceC2207p;
        this.f431f = str;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f429d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0070k0.m78e((InterfaceC2207p) this.f430e, (C0920W) this.f432g, (C1843e) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(385));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) this.f430e;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f432g;
                C1843e c1843e = (C1843e) this.f431f;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2558L = c1383r.m2558L();
                    if (objM2558L == C1371l.f4833a) {
                        objM2558L = new C0013G0(interfaceC1347Y, 2);
                        c1383r.m2585g0(objM2558L);
                    }
                    InterfaceC2207p interfaceC2207pM696i = AbstractC0435z.m696i(interfaceC2207p, (InterfaceC1601c) objM2558L);
                    InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, true);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM696i);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377OM5561d);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    c1843e.mo0g(c1383r, 0);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1784a.m3215b((String) this.f430e, (C0073m) this.f432g, (C0010F) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2352g.m4188a((C0038T0) this.f432g, (InterfaceC2207p) this.f430e, (String) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 4:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f430e;
                List list = (List) this.f432g;
                InterfaceC1347Y interfaceC1347Y2 = (InterfaceC1347Y) this.f431f;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3293z c3293z = AbstractC3261c.f10088d;
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r2, 0);
                    int iHashCode2 = Long.hashCode(c1383r2.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r2.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r2, c3293z);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b2 = C0591f.f1902b;
                    c1383r2.m2571Z();
                    if (c1383r2.f4881S) {
                        c1383r2.m2592k(c0551b2);
                    } else {
                        c1383r2.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, c3289vM5564a);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l2);
                    AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode2), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c2);
                    AbstractC0489a.m769s(AbstractC2352g.m4185H(R.string.home_settings_hooker_debug_title, c1383r2), null, interfaceC1599a, null, c1383r2, 0, 26);
                    C3293z c3293z2 = AbstractC3261c.f10087c;
                    if (1.0f <= 0.0d) {
                        AbstractC3349a.m5598a("invalid weight; must be greater than zero");
                    }
                    InterfaceC2207p interfaceC2207pMo4021c = c3293z2.mo4021c(new C3244M(1.0f, true));
                    float f2 = 18;
                    C3251U c3251uM5515b = AbstractC3261c.m5515b(f2, f2, 20, 2);
                    C3269g c3269gM5549g = AbstractC3273i.m5549g(12);
                    boolean zM2586h = c1383r2.m2586h(list);
                    Object objM2558L2 = c1383r2.m2558L();
                    if (zM2586h || objM2558L2 == C1371l.f4833a) {
                        objM2558L2 = new C0010F(6, list, interfaceC1347Y2);
                        c1383r2.m2585g0(objM2558L2);
                    }
                    AbstractC1785a.m3242b(24960, 490, c1383r2, (InterfaceC1601c) objM2558L2, null, interfaceC2207pMo4021c, null, null, c3269gM5549g, c3251uM5515b, null, false);
                    c1383r2.m2597p(true);
                } else {
                    c1383r2.m2563R();
                }
                return C0891q.f2780a;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2831p((EnumC1477a) this.f430e, (List) this.f432g, (InterfaceC1599a) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2826k((C1544Q) this.f430e, (InterfaceC1599a) this.f432g, (InterfaceC1599a) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(49));
                break;
            case 7:
                InterfaceC1347Y interfaceC1347Y3 = (InterfaceC1347Y) this.f430e;
                String str = (String) this.f432g;
                C2762u c2762u = (C2762u) this.f431f;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strM4185H = AbstractC2352g.m4185H(R.string.home_settings_theme_color, c1383r3);
                    String strM4185H2 = AbstractC2352g.m4185H(R.string.home_settings_theme_color_description, c1383r3);
                    boolean zM2582f = c1383r3.m2582f(interfaceC1347Y3);
                    Object objM2558L3 = c1383r3.m2558L();
                    if (zM2582f || objM2558L3 == C1371l.f4833a) {
                        objM2558L3 = new C0020K(interfaceC1347Y3, 5);
                        c1383r3.m2585g0(objM2558L3);
                    }
                    AbstractC0489a.m761k(strM4185H, (InterfaceC1599a) objM2558L3, null, strM4185H2, AbstractC1848j.m3314c(-2036155557, new C0002B(12, c2762u), c1383r3), str, null, false, c1383r3, 24576, 196);
                } else {
                    c1383r3.m2563R();
                }
                return C0891q.f2780a;
            case 8:
                C1672q c1672q = (C1672q) this.f430e;
                C2940A0 c2940a0 = (C2940A0) this.f432g;
                C3025y0 c3025y0 = (C3025y0) this.f431f;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM5148h = c2940a0.m5148h(c2940a0.m5144d(fFloatValue - c1672q.f5706d));
                C2940A0 c2940a02 = c3025y0.f9592a;
                c1672q.f5706d += c2940a0.m5144d(c2940a0.m5147g(c2940a02.m5143c(c2940a02.f9280k, jM5148h, 1)));
                break;
            case 9:
                C3309f c3309f = (C3309f) this.f430e;
                C0157b c0157b = (C0157b) this.f432g;
                String str2 = (String) this.f431f;
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C1383r c1383r4 = (C1383r) interfaceC1373m4;
                if (c1383r4.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    float f5 = 20;
                    InterfaceC2207p interfaceC2207pM5530q = AbstractC3261c.m5530q(AbstractC3261c.f10088d, f5, 0.0f, 2);
                    C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10113d, C2194c.f7170n, c1383r4, 54);
                    int iHashCode3 = Long.hashCode(c1383r4.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l3 = c1383r4.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c3 = AbstractC2192a.m4016c(c1383r4, interfaceC2207pM5530q);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b3 = C0591f.f1902b;
                    c1383r4.m2571Z();
                    if (c1383r4.f4881S) {
                        c1383r4.m2592k(c0551b3);
                    } else {
                        c1383r4.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1905e, c3256zM5504a);
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1904d, interfaceC1378o0M2593l3);
                    AbstractC1385s.m2627q(c1383r4, Integer.valueOf(iHashCode3), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r4, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1903c, interfaceC2207pM4016c3);
                    C2204m c2204m = C2204m.f7185a;
                    AbstractC1056B.m2125b(c3309f, null, AbstractC3261c.m5533t(c2204m, f5), c0157b.f570g, c1383r4, 432);
                    AbstractC3261c.m5516c(c1383r4, AbstractC3261c.m5533t(c2204m, 10));
                    AbstractC1089e0.m2146b(str2, null, c0157b.f571h, AbstractC1926h.m3579v(16), C1587l.f5504h, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r4, 102260736, 0, 261802);
                    c1383r4.m2597p(true);
                } else {
                    c1383r4.m2563R();
                }
                return C0891q.f2780a;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC2352g.m4189b((String) this.f430e, (C3309f) this.f432g, (InterfaceC1599a) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 11:
                C3293z c3293z3 = AbstractC3261c.f10087c;
                C3449a c3449a = (C3449a) this.f430e;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f432g;
                C0157b c0157b2 = (C0157b) this.f431f;
                InterfaceC1373m interfaceC1373m5 = (InterfaceC1373m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C1383r c1383r5 = (C1383r) interfaceC1373m5;
                if (c1383r5.m2560O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC2207p interfaceC2207pM5060n = AbstractC2856m.m5060n(AbstractC3261c.m5523j(c3293z3, 0.0f, 360, 1), AbstractC2856m.m5057k(c1383r5));
                    C3289v c3289vM5564a2 = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r5, 0);
                    int iHashCode4 = Long.hashCode(c1383r5.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l4 = c1383r5.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c4 = AbstractC2192a.m4016c(c1383r5, interfaceC2207pM5060n);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b4 = C0591f.f1902b;
                    c1383r5.m2571Z();
                    if (c1383r5.f4881S) {
                        c1383r5.m2592k(c0551b4);
                    } else {
                        c1383r5.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r5, C0591f.f1905e, c3289vM5564a2);
                    AbstractC1385s.m2635y(c1383r5, C0591f.f1904d, interfaceC1378o0M2593l4);
                    AbstractC1385s.m2627q(c1383r5, Integer.valueOf(iHashCode4), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r5, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r5, C0591f.f1903c, interfaceC2207pM4016c4);
                    c1383r5.m2568W(342510806);
                    int i5 = 0;
                    for (Object obj3 : c3449a.f10764a) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        C3450b c3450b = (C3450b) obj3;
                        String strM4185H3 = AbstractC2352g.m4185H(c3450b.f10765a, c1383r5);
                        boolean zM2582f2 = c1383r5.m2582f(interfaceC1601c) | c1383r5.m2582f(c3450b);
                        Object objM2558L4 = c1383r5.m2558L();
                        if (zM2582f2 || objM2558L4 == C1371l.f4833a) {
                            objM2558L4 = new C0073m(29, interfaceC1601c, c3450b);
                            c1383r5.m2585g0(objM2558L4);
                        }
                        C1383r c1383r6 = c1383r5;
                        AbstractC1089e0.m2146b(strM4185H3, AbstractC3261c.m5530q(AbstractC2856m.m5053g(c3293z3, false, null, (InterfaceC1599a) objM2558L4, 15), 0.0f, 14, 1), c0157b2.f571h, AbstractC1926h.m3579v(16), C1587l.f5503g, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r6, 102260736, 0, 261800);
                        c1383r5 = c1383r6;
                        if (i5 < AbstractC2352g.m4208u(c3449a.f10764a)) {
                            c1383r5.m2568W(1369388120);
                            AbstractC1072S.m2133c(null, 1, c0157b2.f576m, c1383r5, 48, 1);
                            c1383r5.m2597p(false);
                        } else {
                            c1383r5.m2568W(1369550250);
                            c1383r5.m2597p(false);
                        }
                        i5 = i6;
                    }
                    c1383r5.m2597p(false);
                    c1383r5.m2597p(true);
                } else {
                    c1383r5.m2563R();
                }
                return C0891q.f2780a;
            default:
                ((Integer) obj2).getClass();
                AbstractC3518a.m5768a((C3449a) this.f430e, (InterfaceC1599a) this.f432g, (InterfaceC1601c) this.f431f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(9));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0095x(Object obj, Object obj2, InterfaceC0877c interfaceC0877c, int i5, int i6) {
        this.f429d = i6;
        this.f430e = obj;
        this.f432g = obj2;
        this.f431f = interfaceC0877c;
    }

    public /* synthetic */ C0095x(Object obj, Object obj2, Object obj3, int i5) {
        this.f429d = i5;
        this.f430e = obj;
        this.f432g = obj2;
        this.f431f = obj3;
    }
}
