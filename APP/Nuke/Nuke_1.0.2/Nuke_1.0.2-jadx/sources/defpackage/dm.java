package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm {
    public static final rk1 a = c(true);
    public static final rk1 b = c(false);
    public static final k8 c = k8.d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(uh1 uh1Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-211209833);
        int i2 = (go0Var.f(uh1Var) ? 4 : 2) | i;
        int i3 = 0;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(go0Var.T);
            uh1 uh1VarM = tl.M(go0Var, uh1Var);
            yy1 yy1VarL = go0Var.l();
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, c);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new cm(uh1Var, i, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(rz1 rz1Var, sz1 sz1Var, if1 if1Var, d61 d61Var, int i, int i2, r5 r5Var) {
        rk rkVar;
        Object objI = if1Var.i();
        bm bmVar = objI instanceof bm ? (bm) objI : null;
        rz1.h(rz1Var, sz1Var, ((bmVar == null || (rkVar = bmVar.v) == null) ? r5Var : rkVar).a((((long) sz1Var.h) << 32) | (((long) sz1Var.i) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), d61Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final rk1 c(boolean z) {
        rk1 rk1Var = new rk1(9);
        rk rkVar = sn.j;
        rk1Var.m(rkVar, new gm(rkVar, z));
        rk rkVar2 = sn.k;
        rk1Var.m(rkVar2, new gm(rkVar2, z));
        rk rkVar3 = sn.l;
        rk1Var.m(rkVar3, new gm(rkVar3, z));
        rk rkVar4 = sn.m;
        rk1Var.m(rkVar4, new gm(rkVar4, z));
        rk rkVar5 = sn.n;
        rk1Var.m(rkVar5, new gm(rkVar5, z));
        rk rkVar6 = sn.o;
        rk1Var.m(rkVar6, new gm(rkVar6, z));
        rk rkVar7 = sn.p;
        rk1Var.m(rkVar7, new gm(rkVar7, z));
        rk rkVar8 = sn.q;
        rk1Var.m(rkVar8, new gm(rkVar8, z));
        rk rkVar9 = sn.r;
        rk1Var.m(rkVar9, new gm(rkVar9, z));
        return rk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final nf1 d(r5 r5Var, boolean z) {
        nf1 nf1Var = (nf1) (z ? a : b).g(r5Var);
        return nf1Var == null ? new gm(r5Var, z) : nf1Var;
    }
}
