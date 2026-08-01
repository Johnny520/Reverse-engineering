package p170h1;

import android.content.Context;
import android.view.View;
import p002A1.InterfaceC0145r;
import p008B1.AbstractC0219g;
import p011B4.AbstractC0231b;
import p029F0.C0405i0;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0691Q;
import p047I0.AbstractC0757q0;
import p048I1.InterfaceC0782g;
import p052J1.AbstractC0831a;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1379p;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p110W0.C1577b;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p152e0.AbstractC2001h;
import p152e0.InterfaceC1999f;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2207p;
import p198m0.C2595z;

/* JADX INFO: renamed from: h1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2219j {

    /* JADX INFO: renamed from: a */
    public static final C1577b f7254a = new C1577b(26);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4029a(InterfaceC1601c interfaceC1601c, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c2, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1783766393);
        int i6 = (c1383r.m2582f(interfaceC2207p) ? 32 : 16) | i5 | (c1383r.m2586h(interfaceC1601c2) ? 256 : 128);
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            m4030b(interfaceC1601c, interfaceC2207p, interfaceC1601c2, c1383r, ((i6 << 6) & 57344) | (i6 & 112) | 3078);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0405i0(interfaceC1601c, interfaceC2207p, interfaceC1601c2, i5, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4030b(InterfaceC1601c interfaceC1601c, InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c2, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        InterfaceC0782g interfaceC0782g;
        EnumC2017m enumC2017m;
        InterfaceC0145r interfaceC0145r;
        InterfaceC2007c interfaceC2007c;
        C2211b c2211b = C2211b.f7207i;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-180024211);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(interfaceC1601c) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 32 : 16;
        }
        int i7 = i6 | 384;
        if ((i5 & 3072) == 0) {
            i7 |= c1383r.m2586h(c2211b) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c1383r.m2586h(interfaceC1601c2) ? 16384 : 8192;
        }
        if (c1383r.m2560O(i7 & 1, (i7 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207p.mo4021c(C2225p.f7277a).mo4021c(C2595z.f8256a).mo4021c(C2231v.f7287a).mo4021c(C2228s.f7283a));
            InterfaceC2007c interfaceC2007c2 = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
            EnumC2017m enumC2017m2 = (EnumC2017m) c1383r.m2590j(AbstractC0757q0.f2364n);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC0145r interfaceC0145r2 = (InterfaceC0145r) c1383r.m2590j(AbstractC0219g.f765a);
            InterfaceC0782g interfaceC0782g2 = (InterfaceC0782g) c1383r.m2590j(AbstractC0831a.f2692a);
            c1383r.m2568W(1314774735);
            int i8 = i7 & 14;
            int iHashCode2 = Long.hashCode(c1383r.f4882T);
            Context context = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
            C1379p c1379pM2632v = AbstractC1385s.m2632v(c1383r);
            InterfaceC1999f interfaceC1999f = (InterfaceC1999f) c1383r.m2590j(AbstractC2001h.f6721a);
            View view = (View) c1383r.m2590j(AbstractC0691Q.f2215f);
            boolean zM2586h = c1383r.m2586h(context) | ((((i8 & 14) ^ 6) > 4 && c1383r.m2582f(interfaceC1601c)) || (i8 & 6) == 4) | c1383r.m2586h(c1379pM2632v) | c1383r.m2586h(interfaceC1999f) | c1383r.m2578d(iHashCode2) | c1383r.m2586h(view);
            Object objM2558L = c1383r.m2558L();
            if (zM2586h || objM2558L == C1371l.f4833a) {
                interfaceC0782g = interfaceC0782g2;
                enumC2017m = enumC2017m2;
                interfaceC0145r = interfaceC0145r2;
                interfaceC2007c = interfaceC2007c2;
                C2222m c2222m = new C2222m(context, interfaceC1601c, c1379pM2632v, interfaceC1999f, iHashCode2, view);
                c1383r.m2585g0(c2222m);
                objM2558L = c2222m;
            } else {
                interfaceC0782g = interfaceC0782g2;
                enumC2017m = enumC2017m2;
                interfaceC2007c = interfaceC2007c2;
                interfaceC0145r = interfaceC0145r2;
            }
            InterfaceC1599a interfaceC1599a = (InterfaceC1599a) objM2558L;
            c1383r.m2564S(125, 1, null, null);
            c1383r.f4901r = true;
            InterfaceC0145r interfaceC0145r3 = interfaceC0145r;
            if (c1383r.f4881S) {
                c1383r.m2592k(interfaceC1599a);
            } else {
                c1383r.m2591j0();
            }
            InterfaceC0593g.f1909a.getClass();
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2635y(c1383r, C2220k.f7257h, interfaceC2207pM4016c);
            AbstractC1385s.m2635y(c1383r, C2220k.f7258i, interfaceC2007c);
            AbstractC1385s.m2635y(c1383r, C2220k.f7259j, interfaceC0145r3);
            AbstractC1385s.m2635y(c1383r, C2220k.f7260k, interfaceC0782g);
            AbstractC1385s.m2635y(c1383r, C2220k.f7261l, enumC2017m);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2635y(c1383r, C2220k.f7255f, interfaceC1601c2);
            AbstractC1385s.m2635y(c1383r, C2220k.f7256g, c2211b);
            c1383r.m2597p(true);
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2221l(interfaceC1601c, interfaceC2207p, interfaceC1601c2, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final View m4031c(AbstractC2206o abstractC2206o) {
        C2233x c2233x = AbstractC0601k.m1044t(abstractC2206o.f7186d).f1726s;
        View interopView = c2233x != null ? c2233x.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4032d(C2233x c2233x, C0564I c0564i) {
        long jMo638R = c0564i.f1699J.f1893c.mo638R(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo638R >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo638R & 4294967295L)));
        c2233x.layout(iRound, iRound2, c2233x.getMeasuredWidth() + iRound, c2233x.getMeasuredHeight() + iRound2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C2233x m4033e(C0564I c0564i) {
        C2233x c2233x = c0564i.f1726s;
        if (c2233x != null) {
            return c2233x;
        }
        throw AbstractC0231b.m396g("Required value was null.");
    }
}
