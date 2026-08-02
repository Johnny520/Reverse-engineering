package p000;

import java.util.Map;

/* JADX INFO: renamed from: uc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0768uc {

    /* JADX INFO: renamed from: a */
    public static final qt2 f11225a = up0.m5528G(0.0f, 0.0f, null, 7);

    static {
        Map map = vb3.f11894a;
        up0.m5528G(0.0f, 0.0f, new za0(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final gu2 m5480a(float f, fj0 fj0Var, String str, InterfaceC0596px interfaceC0596px) {
        return m5482c(new za0(f), rg3.f9574p, fj0Var, null, str, interfaceC0596px, 24960, 8);
    }

    /* JADX INFO: renamed from: b */
    public static final gu2 m5481b(float f, fj0 fj0Var, String str, InterfaceC0596px interfaceC0596px, int i) {
        fj0 fj0Var2;
        if (fj0Var == f11225a) {
            go0 go0Var = (go0) interfaceC0596px;
            go0Var.m1966W(1144115775);
            boolean zM1974c = go0Var.m1974c(0.01f);
            Object objM1956L = go0Var.m1956L();
            if (zM1974c || objM1956L == C0520nx.f7360a) {
                objM1956L = up0.m5528G(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                go0Var.m1981f0(objM1956L);
            }
            go0Var.m1994p(false);
            fj0Var2 = (qt2) objM1956L;
        } else {
            go0 go0Var2 = (go0) interfaceC0596px;
            go0Var2.m1966W(1144225701);
            go0Var2.m1994p(false);
            fj0Var2 = fj0Var;
        }
        return m5482c(Float.valueOf(f), rg3.f9572n, fj0Var2, null, str, interfaceC0596px, 24576, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final gu2 m5482c(Object obj, n43 n43Var, InterfaceC0273hd interfaceC0273hd, Float f, String str, InterfaceC0596px interfaceC0596px, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            objM1956L = op0.m3598u(null);
            go0Var.m1981f0(objM1956L);
        }
        xk1 xk1Var = (xk1) objM1956L;
        Object objM1956L2 = go0Var.m1956L();
        if (objM1956L2 == c0160eb) {
            objM1956L2 = new C0689sc(obj, n43Var, f);
            go0Var.m1981f0(objM1956L2);
        }
        C0689sc c0689sc = (C0689sc) objM1956L2;
        xk1 xk1VarM3601x = op0.m3601x(null, go0Var);
        if (f != null && (interfaceC0273hd instanceof qt2)) {
            qt2 qt2Var = (qt2) interfaceC0273hd;
            if (!t11.m5086l(qt2Var.f9165c, f)) {
                interfaceC0273hd = new qt2(qt2Var.f9163a, qt2Var.f9164b, f);
            }
        }
        xk1 xk1VarM3601x2 = op0.m3601x(interfaceC0273hd, go0Var);
        Object objM1956L3 = go0Var.m1956L();
        if (objM1956L3 == c0160eb) {
            objM1956L3 = fg1.m1630a(-1, 6, null);
            go0Var.m1981f0(objM1956L3);
        }
        InterfaceC0212fq interfaceC0212fq = (InterfaceC0212fq) objM1956L3;
        boolean zM1984h = go0Var.m1984h(interfaceC0212fq) | go0Var.m1984h(obj);
        Object objM1956L4 = go0Var.m1956L();
        if (zM1984h || objM1956L4 == c0160eb) {
            objM1956L4 = new C0640r1(2, interfaceC0212fq, obj);
            go0Var.m1981f0(objM1956L4);
        }
        AbstractC0179eu.m1468r((xm0) objM1956L4, go0Var);
        boolean zM1984h2 = go0Var.m1984h(interfaceC0212fq) | go0Var.m1984h(c0689sc) | go0Var.m1980f(xk1VarM3601x2) | go0Var.m1980f(xk1VarM3601x);
        Object objM1956L5 = go0Var.m1956L();
        if (zM1984h2 || objM1956L5 == c0160eb) {
            C0729tc c0729tc = new C0729tc(interfaceC0212fq, c0689sc, xk1VarM3601x2, xk1VarM3601x, null);
            go0Var.m1981f0(c0729tc);
            objM1956L5 = c0729tc;
        }
        AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L5, interfaceC0212fq);
        gu2 gu2Var = (gu2) xk1Var.getValue();
        return gu2Var == null ? c0689sc.f10024c : gu2Var;
    }
}
