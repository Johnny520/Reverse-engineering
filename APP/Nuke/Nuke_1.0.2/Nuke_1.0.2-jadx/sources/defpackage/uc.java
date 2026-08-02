package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc {
    public static final qt2 a = up0.G(0.0f, 0.0f, null, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Map map = vb3.a;
        up0.G(0.0f, 0.0f, new za0(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final gu2 a(float f, fj0 fj0Var, String str, px pxVar) {
        return c(new za0(f), rg3.p, fj0Var, null, str, pxVar, 24960, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final gu2 b(float f, fj0 fj0Var, String str, px pxVar, int i) {
        fj0 fj0Var2;
        if (fj0Var == a) {
            go0 go0Var = (go0) pxVar;
            go0Var.W(1144115775);
            boolean zC = go0Var.c(0.01f);
            Object objL = go0Var.L();
            if (zC || objL == nx.a) {
                objL = up0.G(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                go0Var.f0(objL);
            }
            go0Var.p(false);
            fj0Var2 = (qt2) objL;
        } else {
            go0 go0Var2 = (go0) pxVar;
            go0Var2.W(1144225701);
            go0Var2.p(false);
            fj0Var2 = fj0Var;
        }
        return c(Float.valueOf(f), rg3.n, fj0Var2, null, str, pxVar, 24576, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final gu2 c(Object obj, n43 n43Var, hd hdVar, Float f, String str, px pxVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            objL = op0.u(null);
            go0Var.f0(objL);
        }
        xk1 xk1Var = (xk1) objL;
        Object objL2 = go0Var.L();
        if (objL2 == ebVar) {
            objL2 = new sc(obj, n43Var, f);
            go0Var.f0(objL2);
        }
        sc scVar = (sc) objL2;
        xk1 xk1VarX = op0.x(null, go0Var);
        if (f != null && (hdVar instanceof qt2)) {
            qt2 qt2Var = (qt2) hdVar;
            if (!t11.l(qt2Var.c, f)) {
                hdVar = new qt2(qt2Var.a, qt2Var.b, f);
            }
        }
        xk1 xk1VarX2 = op0.x(hdVar, go0Var);
        Object objL3 = go0Var.L();
        if (objL3 == ebVar) {
            objL3 = fg1.a(-1, 6, null);
            go0Var.f0(objL3);
        }
        fq fqVar = (fq) objL3;
        boolean zH = go0Var.h(fqVar) | go0Var.h(obj);
        Object objL4 = go0Var.L();
        if (zH || objL4 == ebVar) {
            objL4 = new r1(2, fqVar, obj);
            go0Var.f0(objL4);
        }
        eu.r((xm0) objL4, go0Var);
        boolean zH2 = go0Var.h(fqVar) | go0Var.h(scVar) | go0Var.f(xk1VarX2) | go0Var.f(xk1VarX);
        Object objL5 = go0Var.L();
        if (zH2 || objL5 == ebVar) {
            tc tcVar = new tc(fqVar, scVar, xk1VarX2, xk1VarX, null);
            go0Var.f0(tcVar);
            objL5 = tcVar;
        }
        eu.f(go0Var, (mn0) objL5, fqVar);
        gu2 gu2Var = (gu2) xk1Var.getValue();
        return gu2Var == null ? scVar.c : gu2Var;
    }
}
