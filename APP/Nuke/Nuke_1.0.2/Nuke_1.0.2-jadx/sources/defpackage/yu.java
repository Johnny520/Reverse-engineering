package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yu {
    public static final av a = new av(tp0.c, sn.u);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final av a(yf yfVar, pk pkVar, px pxVar, int i) {
        if (yfVar.equals(tp0.c) && pkVar.equals(sn.u)) {
            go0 go0Var = (go0) pxVar;
            go0Var.W(-1446604504);
            go0Var.p(false);
            return a;
        }
        go0 go0Var2 = (go0) pxVar;
        go0Var2.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go0Var2.f(yfVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go0Var2.f(pkVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objL = go0Var2.L();
        if (z3 || objL == nx.a) {
            objL = new av(yfVar, pkVar);
            go0Var2.f0(objL);
        }
        av avVar = (av) objL;
        go0Var2.p(false);
        return avVar;
    }
}
