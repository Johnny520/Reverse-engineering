package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge0 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ int i;
    public final /* synthetic */ in0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ge0(int i, int i2, in0 in0Var) {
        this.i = i;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        in0 in0Var = this.j;
        a83 a83Var = a83.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    yi0 yi0Var = te.g;
                    av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, yi0Var);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    lc lcVar = gx.e;
                    yf3.c(go0Var, lcVar, avVarA);
                    lc lcVar2 = gx.d;
                    yf3.c(go0Var, lcVar2, yy1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    lc lcVar3 = gx.f;
                    yf3.c(go0Var, lcVar3, numValueOf);
                    v6 v6Var = gx.g;
                    yf3.b(go0Var, v6Var);
                    lc lcVar4 = gx.c;
                    yf3.c(go0Var, lcVar4, uh1VarM);
                    tp0.c(rg3.P(i2, go0Var), null, null, this.j, go0Var, 0, 30);
                    uh1 uh1VarD = fg1.D(yi0Var, 18.0f, 14.0f);
                    nf1 nf1VarD = dm.d(sn.j, false);
                    int iHashCode2 = Long.hashCode(go0Var.T);
                    yy1 yy1VarL2 = go0Var.l();
                    uh1 uh1VarM2 = tl.M(go0Var, uh1VarD);
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, lcVar, nf1VarD);
                    yf3.c(go0Var, lcVar2, yy1VarL2);
                    vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
                    yf3.c(go0Var, lcVar4, uh1VarM2);
                    ci0.g(null, rg3.P(i2, go0Var), rg3.P(R.string.home_settings_empty_page_message, go0Var), go0Var, 0, 1);
                    go0Var.p(true);
                    go0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                up0.b(i2, in0Var, (px) obj, pp0.N(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.d(in0Var, (px) obj, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ ge0(int i, in0 in0Var) {
        this.i = i;
        this.j = in0Var;
    }

    public /* synthetic */ ge0(in0 in0Var, int i) {
        this.j = in0Var;
        this.i = i;
    }
}
