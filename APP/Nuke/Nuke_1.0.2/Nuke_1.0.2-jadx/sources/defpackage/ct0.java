package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ct0(int i, String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    uh1 uh1VarD = fg1.D(te.e, 18.0f, 18.0f);
                    av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, uh1VarD);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, avVarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    tu2 tu2Var = ur1.a;
                    eu.a(this.i, null, new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(15), im0.l, 0L, 0, rg3.D(20), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
                    eu.a(this.j, fg1.G(rh1.a, 0.0f, 5.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(13), im0.j, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 48, 1016);
                    go0Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ci0.o(this.i, this.j, (px) obj, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ ct0(String str, String str2) {
        this.i = str;
        this.j = str2;
    }
}
