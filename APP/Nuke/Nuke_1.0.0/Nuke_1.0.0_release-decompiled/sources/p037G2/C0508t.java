package p037G2;

import android.view.View;
import com.bumptech.glide.AbstractC1926h;
import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p000A.AbstractC0070k0;
import p000A.C0013G0;
import p000A.C0020K;
import p000A.C0075n;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0377O;
import p040H.C0545c;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p056K2.C0891q;
import p061L2.AbstractC0984x;
import p076P.AbstractC1061G;
import p076P.C1077X;
import p076P.C1093g0;
import p076P.C1104q;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p099T3.C1427f;
import p104U3.EnumC1477a;
import p108V3.EnumC1546T;
import p108V3.EnumC1549b;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;
import p136b0.C1843e;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p211o0.AbstractC2767z;
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
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: G2.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0508t implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1612d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1613e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1614f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1615g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1616h;

    public /* synthetic */ C0508t(C1104q c1104q, C1077X c1077x, C1093g0 c1093g0, C1843e c1843e, int i5) {
        this.f1612d = 2;
        this.f1613e = c1104q;
        this.f1614f = c1077x;
        this.f1615g = c1093g0;
        this.f1616h = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1612d) {
            case 0:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f1613e;
                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) this.f1615g;
                InterfaceC1339T0 interfaceC1339T02 = (InterfaceC1339T0) this.f1616h;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10110a, C2194c.f7170n, c1383r, 48);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    C2204m c2204m = C2204m.f7185a;
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, c2204m);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b);
                    } else {
                        c1383r.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r, C0591f.f1905e, c3256zM5504a);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                    AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                    String str = (String) interfaceC1601c.mo1h(this.f1614f);
                    c1383r.m2568W(-2020066745);
                    C1341U0 c1341u0 = AbstractC0653e.f2072a;
                    long j5 = ((C0650b) c1383r.m2590j(c1341u0)).f2066g;
                    c1383r.m2597p(false);
                    AbstractC0070k0.m74a(str, null, new C1260M(j5, AbstractC1926h.m3579v(14), C1587l.f5503g, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, c1383r, 0, 1018);
                    AbstractC3261c.m5516c(c1383r, AbstractC3261c.m5539z(6));
                    boolean zM2582f = c1383r.m2582f(interfaceC1339T0) | c1383r.m2582f(interfaceC1339T02);
                    Object objM2558L = c1383r.m2558L();
                    if (zM2582f || objM2558L == C1371l.f4833a) {
                        objM2558L = new C0512x(interfaceC1339T0, interfaceC1339T02, 0);
                        c1383r.m2585g0(objM2558L);
                    }
                    InterfaceC2207p interfaceC2207pM4941l = AbstractC2767z.m4941l(c2204m, (InterfaceC1601c) objM2558L);
                    c1383r.m2568W(-2020047698);
                    long j6 = ((C0650b) c1383r.m2590j(c1341u0)).f2065f;
                    c1383r.m2597p(false);
                    AbstractC0489a.m763m(interfaceC2207pM4941l, j6, c1383r, 0);
                    c1383r.m2597p(true);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) this.f1613e;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f1614f;
                C1843e c1843e = (C1843e) this.f1615g;
                C0545c c0545c = (C0545c) this.f1616h;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM2558L2 = c1383r2.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (objM2558L2 == c1357e) {
                        objM2558L2 = new C0013G0(interfaceC1347Y, 6);
                        c1383r2.m2585g0(objM2558L2);
                    }
                    InterfaceC2207p interfaceC2207pM696i = AbstractC0435z.m696i(interfaceC2207p, (InterfaceC1601c) objM2558L2);
                    InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, true);
                    int iHashCode2 = Long.hashCode(c1383r2.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r2.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r2, interfaceC2207pM696i);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b2 = C0591f.f1902b;
                    c1383r2.m2571Z();
                    if (c1383r2.f4881S) {
                        c1383r2.m2592k(c0551b2);
                    } else {
                        c1383r2.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, interfaceC0377OM5561d);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l2);
                    AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode2), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c2);
                    c1843e.mo0g(c1383r2, 0);
                    Object objM2558L3 = c1383r2.m2558L();
                    if (objM2558L3 == c1357e) {
                        objM2558L3 = new C0020K(interfaceC1347Y, 3);
                        c1383r2.m2585g0(objM2558L3);
                    }
                    c0545c.m774b((InterfaceC1599a) objM2558L3, c1383r2, 6);
                    c1383r2.m2597p(true);
                } else {
                    c1383r2.m2563R();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1061G.m2127b((C1104q) this.f1613e, (C1077X) this.f1614f, (C1093g0) this.f1615g, (C1843e) this.f1616h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(3457));
                break;
            case 3:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f1613e;
                String str2 = (String) this.f1614f;
                List list = (List) this.f1615g;
                List list2 = (List) this.f1616h;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3293z c3293z = AbstractC3261c.f10088d;
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r3, 0);
                    int iHashCode3 = Long.hashCode(c1383r3.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l3 = c1383r3.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c3 = AbstractC2192a.m4016c(c1383r3, c3293z);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b3 = C0591f.f1902b;
                    c1383r3.m2571Z();
                    if (c1383r3.f4881S) {
                        c1383r3.m2592k(c0551b3);
                    } else {
                        c1383r3.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1905e, c3289vM5564a);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1904d, interfaceC1378o0M2593l3);
                    AbstractC1385s.m2627q(c1383r3, Integer.valueOf(iHashCode3), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r3, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r3, C0591f.f1903c, interfaceC2207pM4016c3);
                    AbstractC0489a.m769s(AbstractC2352g.m4185H(R.string.home_settings_about_module, c1383r3), null, interfaceC1599a, null, c1383r3, 0, 26);
                    C3293z c3293z2 = AbstractC3261c.f10087c;
                    if (1.0f <= 0.0d) {
                        AbstractC3349a.m5598a("invalid weight; must be greater than zero");
                    }
                    InterfaceC2207p interfaceC2207pMo4021c = c3293z2.mo4021c(new C3244M(1.0f, true));
                    float f2 = 18;
                    C3251U c3251uM5515b = AbstractC3261c.m5515b(f2, f2, 20, 2);
                    C3269g c3269gM5549g = AbstractC3273i.m5549g(12);
                    boolean zM2582f2 = c1383r3.m2582f(str2) | c1383r3.m2586h(list) | c1383r3.m2586h(list2);
                    Object objM2558L4 = c1383r3.m2558L();
                    if (zM2582f2 || objM2558L4 == C1371l.f4833a) {
                        objM2558L4 = new C0075n(str2, list, list2, 10);
                        c1383r3.m2585g0(objM2558L4);
                    }
                    AbstractC1785a.m3242b(24960, 490, c1383r3, (InterfaceC1601c) objM2558L4, null, interfaceC2207pMo4021c, null, null, c3269gM5549g, c3251uM5515b, null, false);
                    c1383r3.m2597p(true);
                } else {
                    c1383r3.m2563R();
                }
                break;
            case 4:
                EnumC1477a enumC1477a = (EnumC1477a) this.f1613e;
                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) this.f1614f;
                List list3 = (List) this.f1615g;
                View view = (View) this.f1616h;
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C1383r c1383r4 = (C1383r) interfaceC1373m4;
                if (c1383r4.m2560O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C3293z c3293z3 = AbstractC3261c.f10088d;
                    C3289v c3289vM5564a2 = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r4, 0);
                    int iHashCode4 = Long.hashCode(c1383r4.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l4 = c1383r4.m2593l();
                    InterfaceC2207p interfaceC2207pM4016c4 = AbstractC2192a.m4016c(c1383r4, c3293z3);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b4 = C0591f.f1902b;
                    c1383r4.m2571Z();
                    if (c1383r4.f4881S) {
                        c1383r4.m2592k(c0551b4);
                    } else {
                        c1383r4.m2591j0();
                    }
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1905e, c3289vM5564a2);
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1904d, interfaceC1378o0M2593l4);
                    AbstractC1385s.m2627q(c1383r4, Integer.valueOf(iHashCode4), C0591f.f1906f);
                    AbstractC1385s.m2631u(c1383r4, C0591f.f1907g);
                    AbstractC1385s.m2635y(c1383r4, C0591f.f1903c, interfaceC2207pM4016c4);
                    AbstractC0489a.m769s(AbstractC2352g.m4185H(enumC1477a.f5168d, c1383r4), null, interfaceC1599a2, null, c1383r4, 0, 26);
                    C3293z c3293z4 = AbstractC3261c.f10087c;
                    if (1.0f <= 0.0d) {
                        AbstractC3349a.m5598a("invalid weight; must be greater than zero");
                    }
                    InterfaceC2207p interfaceC2207pMo4021c2 = c3293z4.mo4021c(new C3244M(1.0f, true));
                    float f5 = 18;
                    C3251U c3251uM5515b2 = AbstractC3261c.m5515b(f5, f5, 20, 2);
                    C3269g c3269gM5549g2 = AbstractC3273i.m5549g(12);
                    boolean zM2586h = c1383r4.m2586h(list3) | c1383r4.m2578d(enumC1477a.ordinal()) | c1383r4.m2586h(view);
                    Object objM2558L5 = c1383r4.m2558L();
                    if (zM2586h || objM2558L5 == C1371l.f4833a) {
                        objM2558L5 = new C0075n(list3, enumC1477a, view, 9);
                        c1383r4.m2585g0(objM2558L5);
                    }
                    AbstractC1785a.m3242b(24960, 490, c1383r4, (InterfaceC1601c) objM2558L5, null, interfaceC2207pMo4021c2, null, null, c3269gM5549g2, c3251uM5515b2, null, false);
                    c1383r4.m2597p(true);
                } else {
                    c1383r4.m2563R();
                }
                break;
            case 5:
                EnumC1549b enumC1549b = (EnumC1549b) this.f1614f;
                final InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f1613e;
                final C1427f c1427f = (C1427f) this.f1615g;
                final LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1616h;
                InterfaceC1373m interfaceC1373m5 = (InterfaceC1373m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C1383r c1383r5 = (C1383r) interfaceC1373m5;
                if (c1383r5.m2560O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strM4185H = AbstractC2352g.m4185H(R.string.home_settings_theme, c1383r5);
                    String strM4185H2 = AbstractC2352g.m4185H(R.string.home_settings_theme_subtitle, c1383r5);
                    boolean zM2582f3 = c1383r5.m2582f(interfaceC1601c2) | c1383r5.m2582f(c1427f);
                    Object objM2558L6 = c1383r5.m2558L();
                    C1357e c1357e2 = C1371l.f4833a;
                    if (zM2582f3 || objM2558L6 == c1357e2) {
                        final int i5 = 0;
                        objM2558L6 = new InterfaceC1601c() { // from class: V3.k
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                switch (i5) {
                                    case 0:
                                        EnumC1549b enumC1549b2 = (EnumC1549b) obj3;
                                        AbstractC1665j.m2985e(enumC1549b2, "mode");
                                        interfaceC1601c2.mo1h(C1427f.m2721a(c1427f, enumC1549b2.f5392d, 0, null, 6));
                                        break;
                                    default:
                                        EnumC1546T enumC1546T = (EnumC1546T) obj3;
                                        AbstractC1665j.m2985e(enumC1546T, "mode");
                                        interfaceC1601c2.mo1h(C1427f.m2721a(c1427f, 0, enumC1546T.f5380d, null, 5));
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        };
                        c1383r5.m2585g0(objM2558L6);
                    }
                    InterfaceC1601c interfaceC1601c3 = (InterfaceC1601c) objM2558L6;
                    boolean zM2586h2 = c1383r5.m2586h(linkedHashMap);
                    Object objM2558L7 = c1383r5.m2558L();
                    if (zM2586h2 || objM2558L7 == c1357e2) {
                        final int i6 = 1;
                        objM2558L7 = new InterfaceC1601c() { // from class: V3.f
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                switch (i6) {
                                    case 0:
                                        EnumC1546T enumC1546T = (EnumC1546T) obj3;
                                        AbstractC1665j.m2985e(enumC1546T, "mode");
                                        return (String) AbstractC0984x.m2033E(enumC1546T, linkedHashMap);
                                    default:
                                        EnumC1549b enumC1549b2 = (EnumC1549b) obj3;
                                        AbstractC1665j.m2985e(enumC1549b2, "mode");
                                        return (String) AbstractC0984x.m2033E(enumC1549b2, linkedHashMap);
                                }
                            }
                        };
                        c1383r5.m2585g0(objM2558L7);
                    }
                    AbstractC0489a.m764n(strM4185H, EnumC1549b.f5391i, enumC1549b, interfaceC1601c3, null, strM4185H2, (InterfaceC1601c) objM2558L7, false, c1383r5, 0);
                } else {
                    c1383r5.m2563R();
                }
                break;
            default:
                EnumC1546T enumC1546T = (EnumC1546T) this.f1614f;
                final InterfaceC1601c interfaceC1601c4 = (InterfaceC1601c) this.f1613e;
                final C1427f c1427f2 = (C1427f) this.f1615g;
                final LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f1616h;
                InterfaceC1373m interfaceC1373m6 = (InterfaceC1373m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C1383r c1383r6 = (C1383r) interfaceC1373m6;
                if (c1383r6.m2560O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strM4185H3 = AbstractC2352g.m4185H(R.string.home_settings_language, c1383r6);
                    String strM4185H4 = AbstractC2352g.m4185H(R.string.home_settings_language_subtitle, c1383r6);
                    boolean zM2582f4 = c1383r6.m2582f(interfaceC1601c4) | c1383r6.m2582f(c1427f2);
                    Object objM2558L8 = c1383r6.m2558L();
                    C1357e c1357e3 = C1371l.f4833a;
                    if (zM2582f4 || objM2558L8 == c1357e3) {
                        final int i7 = 1;
                        objM2558L8 = new InterfaceC1601c() { // from class: V3.k
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                switch (i7) {
                                    case 0:
                                        EnumC1549b enumC1549b2 = (EnumC1549b) obj3;
                                        AbstractC1665j.m2985e(enumC1549b2, "mode");
                                        interfaceC1601c4.mo1h(C1427f.m2721a(c1427f2, enumC1549b2.f5392d, 0, null, 6));
                                        break;
                                    default:
                                        EnumC1546T enumC1546T2 = (EnumC1546T) obj3;
                                        AbstractC1665j.m2985e(enumC1546T2, "mode");
                                        interfaceC1601c4.mo1h(C1427f.m2721a(c1427f2, 0, enumC1546T2.f5380d, null, 5));
                                        break;
                                }
                                return C0891q.f2780a;
                            }
                        };
                        c1383r6.m2585g0(objM2558L8);
                    }
                    InterfaceC1601c interfaceC1601c5 = (InterfaceC1601c) objM2558L8;
                    boolean zM2586h3 = c1383r6.m2586h(linkedHashMap2);
                    Object objM2558L9 = c1383r6.m2558L();
                    if (zM2586h3 || objM2558L9 == c1357e3) {
                        final int i8 = 0;
                        objM2558L9 = new InterfaceC1601c() { // from class: V3.f
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                switch (i8) {
                                    case 0:
                                        EnumC1546T enumC1546T2 = (EnumC1546T) obj3;
                                        AbstractC1665j.m2985e(enumC1546T2, "mode");
                                        return (String) AbstractC0984x.m2033E(enumC1546T2, linkedHashMap2);
                                    default:
                                        EnumC1549b enumC1549b2 = (EnumC1549b) obj3;
                                        AbstractC1665j.m2985e(enumC1549b2, "mode");
                                        return (String) AbstractC0984x.m2033E(enumC1549b2, linkedHashMap2);
                                }
                            }
                        };
                        c1383r6.m2585g0(objM2558L9);
                    }
                    AbstractC0489a.m764n(strM4185H3, EnumC1546T.f5379i, enumC1546T, interfaceC1601c5, null, strM4185H4, (InterfaceC1601c) objM2558L9, false, c1383r6, 0);
                } else {
                    c1383r6.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0508t(Enum r12, InterfaceC1601c interfaceC1601c, C1427f c1427f, LinkedHashMap linkedHashMap, int i5) {
        this.f1612d = i5;
        this.f1614f = r12;
        this.f1613e = interfaceC1601c;
        this.f1615g = c1427f;
        this.f1616h = linkedHashMap;
    }

    public /* synthetic */ C0508t(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f1612d = i5;
        this.f1613e = obj;
        this.f1614f = obj2;
        this.f1615g = obj3;
        this.f1616h = obj4;
    }
}
