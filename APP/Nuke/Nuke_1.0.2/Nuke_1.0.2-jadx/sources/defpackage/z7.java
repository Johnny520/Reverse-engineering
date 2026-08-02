package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ uh1 i;
    public final /* synthetic */ long j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z7(long j, uh1 uh1Var) {
        this.h = 0;
        this.j = j;
        this.i = uh1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        uh1 uh1Var = this.i;
        a83 a83Var = a83.a;
        long j = this.j;
        px pxVar = (px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    uh1 uh1Var2 = this.i;
                    if (j == 9205357640488583168L) {
                        go0Var.W(-1243644858);
                        e8.b(uh1Var2, go0Var, 0, 0);
                        go0Var.p(false);
                    } else {
                        go0Var.W(-1244013944);
                        uh1 uh1VarB0 = te.b0(uh1Var2, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), 0.0f, 0.0f, 12);
                        nf1 nf1VarD = dm.d(sn.k, false);
                        int iHashCode = Long.hashCode(go0Var.T);
                        yy1 yy1VarL = go0Var.l();
                        uh1 uh1VarM = tl.M(go0Var, uh1VarB0);
                        hx.c.getClass();
                        jy jyVar = gx.b;
                        go0Var.Z();
                        if (go0Var.S) {
                            go0Var.k(jyVar);
                        } else {
                            go0Var.i0();
                        }
                        yf3.c(go0Var, gx.e, nf1VarD);
                        yf3.c(go0Var, gx.d, yy1VarL);
                        yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                        yf3.b(go0Var, gx.g);
                        yf3.c(go0Var, gx.c, uh1VarM);
                        e8.b(null, go0Var, 0, 1);
                        go0Var.p(true);
                        go0Var.p(false);
                    }
                }
                break;
            case 1:
                num.getClass();
                qp0.g(uh1Var, j, pxVar, pp0.N(1));
                break;
            case 2:
                num.getClass();
                eu.k(uh1Var, j, pxVar, pp0.N(1));
                break;
            case 3:
                num.getClass();
                eu.l(uh1Var, j, pxVar, pp0.N(1));
                break;
            default:
                num.getClass();
                tp0.e(uh1Var, j, pxVar, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ z7(uh1 uh1Var, long j, int i, int i2) {
        this.h = i2;
        this.i = uh1Var;
        this.j = j;
    }
}
