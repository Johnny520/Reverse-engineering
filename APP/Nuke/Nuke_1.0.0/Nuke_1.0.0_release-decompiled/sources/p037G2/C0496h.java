package p037G2;

import android.view.View;
import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p000A.AbstractC0070k0;
import p000A.C0095x;
import p041H0.C0551B;
import p041H0.C0587d;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p056K2.C0891q;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p104U3.EnumC1477a;
import p108V3.AbstractC1543P;
import p108V3.C1536I;
import p108V3.C1544Q;
import p108V3.EnumC1545S;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p149d3.AbstractC1976d;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p211o0.C2762u;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3287t;
import p244u.C3256Z;
import p244u.C3258a0;
import p244u.C3286s;
import p244u.C3289v;
import p244u.C3290w;
import p244u.C3293z;
import p255w.C3372c;

/* JADX INFO: renamed from: G2.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0496h implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1541d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1542e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1543f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1544g;

    public /* synthetic */ C0496h(InterfaceC1347Y interfaceC1347Y, String str, C2762u c2762u) {
        this.f1541d = 4;
        this.f1543f = interfaceC1347Y;
        this.f1542e = str;
        this.f1544g = c2762u;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        C0589e c0589e;
        C0587d c0587d;
        C0589e c0589e2;
        C0551B c0551b;
        C0589e c0589e3;
        InterfaceC1604f interfaceC1604f;
        C2204m c2204m;
        C0589e c0589e4;
        boolean z5;
        switch (this.f1541d) {
            case 0:
                String str = (String) this.f1542e;
                C1843e c1843e = (C1843e) this.f1543f;
                InterfaceC1604f interfaceC1604f2 = (InterfaceC1604f) this.f1544g;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3286s) obj, "$this$NukeFluidSurface");
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7171o, c1383r, 0);
                    int iHashCode = Long.hashCode(c1383r.f4882T);
                    InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
                    C2204m c2204m2 = C2204m.f7185a;
                    InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, c2204m2);
                    InterfaceC0593g.f1909a.getClass();
                    C0551B c0551b2 = C0591f.f1902b;
                    c1383r.m2571Z();
                    if (c1383r.f4881S) {
                        c1383r.m2592k(c0551b2);
                    } else {
                        c1383r.m2591j0();
                    }
                    C0589e c0589e5 = C0591f.f1905e;
                    AbstractC1385s.m2635y(c1383r, c0589e5, c3289vM5564a);
                    C0589e c0589e6 = C0591f.f1904d;
                    AbstractC1385s.m2635y(c1383r, c0589e6, interfaceC1378o0M2593l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C0589e c0589e7 = C0591f.f1906f;
                    AbstractC1385s.m2627q(c1383r, numValueOf, c0589e7);
                    C0587d c0587d2 = C0591f.f1907g;
                    AbstractC1385s.m2631u(c1383r, c0587d2);
                    C0589e c0589e8 = C0591f.f1903c;
                    AbstractC1385s.m2635y(c1383r, c0589e8, interfaceC2207pM4016c);
                    if (str != null) {
                        c1383r.m2568W(-1574489982);
                        c0589e2 = c0589e7;
                        c0587d = c0587d2;
                        c0589e3 = c0589e8;
                        c0589e = c0589e6;
                        c0589e4 = c0589e5;
                        c0551b = c0551b2;
                        interfaceC1604f = interfaceC1604f2;
                        c2204m = c2204m2;
                        AbstractC0070k0.m74a(str, null, new C1260M(((C0650b) c1383r.m2590j(AbstractC0653e.f2072a)).f2064e, AbstractC1926h.m3579v(18), C1587l.f5505i, 0L, 0, AbstractC1926h.m3579v(24), null, null, 16646136), 0, false, 0, 0, c1383r, 0, 1018);
                        AbstractC3261c.m5516c(c1383r, AbstractC3261c.m5521h(c2204m, 12));
                        c1383r.m2597p(false);
                    } else {
                        c0589e = c0589e6;
                        c0587d = c0587d2;
                        c0589e2 = c0589e7;
                        c0551b = c0551b2;
                        c0589e3 = c0589e8;
                        interfaceC1604f = interfaceC1604f2;
                        c2204m = c2204m2;
                        c0589e4 = c0589e5;
                        c1383r.m2568W(-1574092128);
                        c1383r.m2597p(false);
                    }
                    c1843e.mo5f(C3290w.f10173a, c1383r, 6);
                    if (interfaceC1604f != null) {
                        c1383r.m2568W(-1574024207);
                        AbstractC3261c.m5516c(c1383r, AbstractC3261c.m5521h(c2204m, 24));
                        C3293z c3293z = AbstractC3261c.f10087c;
                        C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10111b, C2194c.f7170n, c1383r, 54);
                        int iHashCode2 = Long.hashCode(c1383r.f4882T);
                        InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r.m2593l();
                        InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r, c3293z);
                        c1383r.m2571Z();
                        if (c1383r.f4881S) {
                            c1383r.m2592k(c0551b);
                        } else {
                            c1383r.m2591j0();
                        }
                        AbstractC1385s.m2635y(c1383r, c0589e4, c3256zM5504a);
                        AbstractC1385s.m2635y(c1383r, c0589e, interfaceC1378o0M2593l2);
                        AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode2), c0589e2);
                        AbstractC1385s.m2631u(c1383r, c0587d);
                        AbstractC1385s.m2635y(c1383r, c0589e3, interfaceC2207pM4016c2);
                        interfaceC1604f.mo5f(C3258a0.f10078a, c1383r, 6);
                        z5 = true;
                        c1383r.m2597p(true);
                        c1383r.m2597p(false);
                    } else {
                        z5 = true;
                        c1383r.m2568W(-1573702272);
                        c1383r.m2597p(false);
                    }
                    c1383r.m2597p(z5);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f1542e;
                C1544Q c1544q = (C1544Q) this.f1543f;
                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) this.f1544g;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3258a0) obj, "$this$NukeDialog");
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0489a.m757g(AbstractC2352g.m4185H(R.string.home_settings_cancel, c1383r2), interfaceC1599a, null, false, 0, c1383r2, 0);
                    AbstractC3261c.m5516c(c1383r2, AbstractC3261c.m5539z(8));
                    AbstractC0489a.m754d(AbstractC2352g.m4185H(R.string.home_settings_hooker_debug_unlock, c1383r2), interfaceC1599a2, null, c1544q.f5368c == EnumC1545S.f5374f, 0, c1383r2, 0, 52);
                } else {
                    c1383r2.m2563R();
                }
                break;
            case 2:
                String str2 = (String) this.f1542e;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f1543f;
                String str3 = (String) this.f1544g;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r3 = (C1383r) interfaceC1373m3;
                if (c1383r3.m2560O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC1543P.m2835t(str2, interfaceC1601c, AbstractC1976d.m3637e0(str3), c1383r3, 0);
                } else {
                    c1383r3.m2563R();
                }
                break;
            case 3:
                List list = (List) this.f1542e;
                EnumC1477a enumC1477a = (EnumC1477a) this.f1543f;
                View view = (View) this.f1544g;
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r4 = (C1383r) interfaceC1373m4;
                if (!c1383r4.m2560O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c1383r4.m2563R();
                } else if (list.isEmpty()) {
                    c1383r4.m2568W(415107552);
                    AbstractC1543P.m2834s(null, null, null, c1383r4, 0, 7);
                    c1383r4.m2597p(false);
                } else {
                    c1383r4.m2568W(415208488);
                    String strM4185H = AbstractC2352g.m4185H(enumC1477a.f5168d, c1383r4);
                    boolean zM2586h = c1383r4.m2586h(view);
                    Object objM2558L = c1383r4.m2558L();
                    if (zM2586h || objM2558L == C1371l.f4833a) {
                        objM2558L = new C1536I(view, 1);
                        c1383r4.m2585g0(objM2558L);
                    }
                    AbstractC1543P.m2836u(0, c1383r4, (InterfaceC1601c) objM2558L, strM4185H, list);
                    c1383r4.m2597p(false);
                }
                break;
            default:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f1543f;
                String str4 = (String) this.f1542e;
                C2762u c2762u = (C2762u) this.f1544g;
                InterfaceC1373m interfaceC1373m5 = (InterfaceC1373m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r5 = (C1383r) interfaceC1373m5;
                if (c1383r5.m2560O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC0489a.m765o(null, AbstractC2352g.m4185H(R.string.home_settings_theme_color, c1383r5), AbstractC1848j.m3314c(-942696700, new C0095x(interfaceC1347Y, str4, c2762u, 7), c1383r5), c1383r5, 384, 1);
                } else {
                    c1383r5.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0496h(Object obj, Object obj2, Object obj3, int i5) {
        this.f1541d = i5;
        this.f1542e = obj;
        this.f1543f = obj2;
        this.f1544g = obj3;
    }
}
