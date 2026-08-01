package p176i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import p000A.C0039U;
import p007B0.C0171D;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0691Q;
import p047I0.AbstractC0757q0;
import p074O2.InterfaceC1046d;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1379p;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p152e0.AbstractC2004k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: i1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2298n {

    /* JADX INFO: renamed from: a */
    public static final C1305C f7490a = new C1305C(C2288d.f7458h);

    /* JADX INFO: renamed from: b */
    public static final C1305C f7491b = new C1305C(C2288d.f7457g);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4122a(InterfaceC2282C interfaceC2282C, InterfaceC1599a interfaceC1599a, C2283D c2283d, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5, int i6) {
        int i7;
        InterfaceC1599a interfaceC1599a2;
        C2283D c2283d2;
        int i8;
        InterfaceC1599a interfaceC1599a3;
        C1388t0 c1388t0M2599r;
        String str;
        InterfaceC1046d interfaceC1046d;
        boolean z5;
        int i9;
        EnumC2017m enumC2017m;
        InterfaceC2282C interfaceC2282C2 = interfaceC2282C;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1772091631);
        if ((i5 & 6) == 0) {
            i7 = (c1383r.m2582f(interfaceC2282C2) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 == 0) {
            if ((i5 & 48) == 0) {
                interfaceC1599a2 = interfaceC1599a;
                i7 |= c1383r.m2586h(interfaceC1599a2) ? 32 : 16;
            }
            if ((i5 & 384) != 0) {
                c2283d2 = c2283d;
                i7 |= c1383r.m2582f(c2283d2) ? 256 : 128;
            } else {
                c2283d2 = c2283d;
            }
            if ((i5 & 3072) == 0) {
                i7 |= c1383r.m2586h(c1843e) ? 2048 : 1024;
            }
            i8 = i7;
            if (c1383r.m2560O(i8 & 1, (i8 & 1171) == 1170)) {
                c1383r.m2563R();
                interfaceC1599a3 = interfaceC1599a2;
            } else {
                InterfaceC1599a interfaceC1599a4 = i10 != 0 ? null : interfaceC1599a2;
                View view = (View) c1383r.m2590j(AbstractC0691Q.f2215f);
                InterfaceC2007c interfaceC2007c = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
                String str2 = (String) c1383r.m2590j(f7490a);
                EnumC2017m enumC2017m2 = (EnumC2017m) c1383r.m2590j(AbstractC0757q0.f2364n);
                C1379p c1379pM2632v = AbstractC1385s.m2632v(c1383r);
                InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(c1843e, c1383r);
                Object[] objArr = new Object[0];
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (objM2558L == c1357e) {
                    objM2558L = C2288d.f7459i;
                    c1383r.m2585g0(objM2558L);
                }
                UUID uuid = (UUID) AbstractC2004k.m3670b(objArr, (InterfaceC1599a) objM2558L, c1383r, 48);
                boolean zBooleanValue = ((Boolean) c1383r.m2590j(f7491b)).booleanValue();
                Object objM2558L2 = c1383r.m2558L();
                if (objM2558L2 == c1357e) {
                    str = str2;
                    interfaceC1046d = null;
                    z5 = false;
                    C2310z c2310z = new C2310z(interfaceC1599a4, c2283d2, str, view, interfaceC2007c, interfaceC2282C2, uuid, zBooleanValue);
                    interfaceC2282C2 = interfaceC2282C2;
                    c2310z.m4138j(c1379pM2632v, new C1843e(-297523940, true, new C2297m(c2310z, interfaceC1347YM2633w, 1)));
                    c1383r.m2585g0(c2310z);
                    objM2558L2 = c2310z;
                } else {
                    str = str2;
                    interfaceC1046d = null;
                    z5 = false;
                }
                C2310z c2310z2 = (C2310z) objM2558L2;
                int i11 = i8 & 112;
                int i12 = i8 & 896;
                boolean zM2586h = c1383r.m2586h(c2310z2) | (i11 == 32 ? true : z5) | (i12 == 256 ? true : z5) | c1383r.m2582f(str) | c1383r.m2578d(enumC2017m2.ordinal());
                Object objM2558L3 = c1383r.m2558L();
                if (zM2586h || objM2558L3 == c1357e) {
                    i9 = i8;
                    C2291g c2291g = new C2291g(c2310z2, interfaceC1599a4, c2283d, str, enumC2017m2);
                    c1383r.m2585g0(c2291g);
                    objM2558L3 = c2291g;
                } else {
                    i9 = i8;
                }
                AbstractC1385s.m2613c(c2310z2, (InterfaceC1601c) objM2558L3, c1383r);
                boolean zM2586h2 = (i11 == 32 ? true : z5) | c1383r.m2586h(c2310z2) | (i12 == 256 ? true : z5) | c1383r.m2582f(str) | c1383r.m2578d(enumC2017m2.ordinal());
                Object objM2558L4 = c1383r.m2558L();
                if (zM2586h2 || objM2558L4 == c1357e) {
                    C2292h c2292h = new C2292h(c2310z2, interfaceC1599a4, c2283d, str, enumC2017m2);
                    enumC2017m = enumC2017m2;
                    c1383r.m2585g0(c2292h);
                    objM2558L4 = c2292h;
                } else {
                    enumC2017m = enumC2017m2;
                }
                AbstractC1385s.m2617g((InterfaceC1599a) objM2558L4, c1383r);
                boolean zM2586h3 = c1383r.m2586h(c2310z2);
                if ((i9 & 14) == 4) {
                    z5 = true;
                }
                boolean z6 = zM2586h3 | z5;
                Object objM2558L5 = c1383r.m2558L();
                if (z6 || objM2558L5 == c1357e) {
                    objM2558L5 = new C0171D(9, c2310z2, interfaceC2282C2);
                    c1383r.m2585g0(objM2558L5);
                }
                AbstractC1385s.m2613c(interfaceC2282C2, (InterfaceC1601c) objM2558L5, c1383r);
                boolean zM2586h4 = c1383r.m2586h(c2310z2);
                Object objM2558L6 = c1383r.m2558L();
                if (zM2586h4 || objM2558L6 == c1357e) {
                    objM2558L6 = new C0039U(c2310z2, interfaceC1046d, 14);
                    c1383r.m2585g0(objM2558L6);
                }
                AbstractC1385s.m2615e(c1383r, (InterfaceC1603e) objM2558L6, c2310z2);
                boolean zM2586h5 = c1383r.m2586h(c2310z2);
                Object objM2558L7 = c1383r.m2558L();
                if (zM2586h5 || objM2558L7 == c1357e) {
                    objM2558L7 = new C2294j(c2310z2, 0);
                    c1383r.m2585g0(objM2558L7);
                }
                InterfaceC2207p interfaceC2207pM696i = AbstractC0435z.m696i(C2204m.f7185a, (InterfaceC1601c) objM2558L7);
                boolean zM2586h6 = c1383r.m2586h(c2310z2) | c1383r.m2578d(enumC2017m.ordinal());
                Object objM2558L8 = c1383r.m2558L();
                if (zM2586h6 || objM2558L8 == c1357e) {
                    objM2558L8 = new C2295k(c2310z2, enumC2017m);
                    c1383r.m2585g0(objM2558L8);
                }
                InterfaceC0377O interfaceC0377O = (InterfaceC0377O) objM2558L8;
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
                AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377O);
                AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
                AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
                AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
                AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
                c1383r.m2597p(true);
                interfaceC1599a3 = interfaceC1599a4;
            }
            c1388t0M2599r = c1383r.m2599r();
            if (c1388t0M2599r == null) {
                c1388t0M2599r.f4928d = new C2296l(interfaceC2282C2, interfaceC1599a3, c2283d, c1843e, i5, i6);
                return;
            }
            return;
        }
        i7 |= 48;
        interfaceC1599a2 = interfaceC1599a;
        if ((i5 & 384) != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i8 = i7;
        if (c1383r.m2560O(i8 & 1, (i8 & 1171) == 1170)) {
        }
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m4123b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
