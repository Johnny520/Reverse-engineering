package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ d22 j;
    public final /* synthetic */ xk1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa(d22 d22Var, xk1 xk1Var, int i) {
        super(2);
        this.i = i;
        this.j = d22Var;
        this.k = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.k;
        d22 d22Var = this.j;
        int i2 = 0;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    Object objL = go0Var.L();
                    eb ebVar = nx.a;
                    if (objL == ebVar) {
                        objL = v6.q;
                        go0Var.f0(objL);
                    }
                    uh1 uh1VarA = nn2.a(rh1.a, false, (in0) objL);
                    boolean zH = go0Var.h(d22Var);
                    Object objL2 = go0Var.L();
                    if (zH || objL2 == ebVar) {
                        objL2 = new la(d22Var, 1);
                        go0Var.f0(objL2);
                    }
                    uh1 uh1VarG = gf1.G(uh1VarA, (in0) objL2);
                    float f = d22Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        uh1VarG = te.N(uh1VarG, 0.0f, 0.0f, f, null, 520187);
                    }
                    my myVar = pa.a;
                    mn0 mn0Var = (mn0) xk1Var.getValue();
                    Object objL3 = go0Var.L();
                    if (objL3 == ebVar) {
                        objL3 = k8.c;
                        go0Var.f0(objL3);
                    }
                    nf1 nf1Var = (nf1) objL3;
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, uh1VarG);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, nf1Var);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    mn0Var.g(go0Var, 0);
                    go0Var.p(true);
                }
                break;
            default:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    ci0.a(pa.b.a(Boolean.TRUE), xe1.i0(1022273628, new oa(d22Var, xk1Var, i2), go0Var2), go0Var2, 56);
                }
                break;
        }
        return a83Var;
    }
}
