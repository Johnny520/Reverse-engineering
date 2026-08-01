package p203n;

import p000A.C0073m;
import p047I0.C0724e1;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p172h3.AbstractC2250j;
import p172h3.InterfaceC2247g;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2651e {

    /* JADX INFO: renamed from: a */
    public static final C2626I f8458a = AbstractC2649d.m4617j(0.0f, 0.0f, null, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object obj = AbstractC2668m0.f8504a;
        AbstractC2649d.m4617j(0.0f, 0.0f, new C2010f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1339T0 m4620a(float f2, InterfaceC2677v interfaceC2677v, String str, InterfaceC1373m interfaceC1373m) {
        return m4622c(new C2010f(f2), AbstractC2649d.f8448l, interfaceC2677v, null, str, interfaceC1373m, 24960, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC1339T0 m4621b(float f2, InterfaceC2677v interfaceC2677v, String str, InterfaceC1373m interfaceC1373m, int i5) {
        InterfaceC2677v interfaceC2677v2;
        Float fValueOf = Float.valueOf(0.01f);
        if (interfaceC2677v == f8458a) {
            C1383r c1383r = (C1383r) interfaceC1373m;
            c1383r.m2568W(1144089983);
            boolean zM2576c = c1383r.m2576c(0.01f);
            Object objM2558L = c1383r.m2558L();
            if (zM2576c || objM2558L == C1371l.f4833a) {
                objM2558L = AbstractC2649d.m4617j(0.0f, 0.0f, fValueOf, 3);
                c1383r.m2585g0(objM2558L);
            }
            c1383r.m2597p(false);
            interfaceC2677v2 = (C2626I) objM2558L;
        } else {
            C1383r c1383r2 = (C1383r) interfaceC1373m;
            c1383r2.m2568W(1144199909);
            c1383r2.m2597p(false);
            interfaceC2677v2 = interfaceC2677v;
        }
        return m4622c(Float.valueOf(f2), AbstractC2649d.f8446j, interfaceC2677v2, fValueOf, str, interfaceC1373m, 24576, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC1339T0 m4622c(Object obj, C2652e0 c2652e0, InterfaceC2659i interfaceC2659i, Float f2, String str, InterfaceC1373m interfaceC1373m, int i5, int i6) {
        if ((i6 & 8) != 0) {
            f2 = null;
        }
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (objM2558L == c1357e) {
            objM2558L = AbstractC1385s.m2629s(null);
            c1383r.m2585g0(objM2558L);
        }
        InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L;
        Object objM2558L2 = c1383r.m2558L();
        if (objM2558L2 == c1357e) {
            objM2558L2 = new C2647c(obj, c2652e0, f2);
            c1383r.m2585g0(objM2558L2);
        }
        C2647c c2647c = (C2647c) objM2558L2;
        InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(null, c1383r);
        if (f2 != null && (interfaceC2659i instanceof C2626I)) {
            C2626I c2626i = (C2626I) interfaceC2659i;
            if (!AbstractC1665j.m2981a(c2626i.f8341c, f2)) {
                interfaceC2659i = new C2626I(c2626i.f8339a, c2626i.f8340b, f2);
            }
        }
        InterfaceC1347Y interfaceC1347YM2633w2 = AbstractC1385s.m2633w(interfaceC2659i, c1383r);
        Object objM2558L3 = c1383r.m2558L();
        if (objM2558L3 == c1357e) {
            objM2558L3 = AbstractC2250j.m4101a(-1, 6, null);
            c1383r.m2585g0(objM2558L3);
        }
        InterfaceC2247g interfaceC2247g = (InterfaceC2247g) objM2558L3;
        boolean zM2586h = c1383r.m2586h(interfaceC2247g) | c1383r.m2586h(obj);
        Object objM2558L4 = c1383r.m2558L();
        if (zM2586h || objM2558L4 == c1357e) {
            objM2558L4 = new C0073m(24, interfaceC2247g, obj);
            c1383r.m2585g0(objM2558L4);
        }
        AbstractC1385s.m2617g((InterfaceC1599a) objM2558L4, c1383r);
        boolean zM2586h2 = c1383r.m2586h(interfaceC2247g) | c1383r.m2586h(c2647c) | c1383r.m2582f(interfaceC1347YM2633w2) | c1383r.m2582f(interfaceC1347YM2633w);
        Object objM2558L5 = c1383r.m2558L();
        if (zM2586h2 || objM2558L5 == c1357e) {
            C0724e1 c0724e1 = new C0724e1(interfaceC2247g, c2647c, interfaceC1347YM2633w2, interfaceC1347YM2633w, null);
            c1383r.m2585g0(c0724e1);
            objM2558L5 = c0724e1;
        }
        AbstractC1385s.m2615e(c1383r, (InterfaceC1603e) objM2558L5, interfaceC2247g);
        InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) interfaceC1347Y.getValue();
        return interfaceC1339T0 == null ? c2647c.f8428c : interfaceC1339T0;
    }
}
