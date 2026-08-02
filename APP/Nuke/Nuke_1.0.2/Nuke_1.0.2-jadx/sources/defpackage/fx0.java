package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fx0 {
    public static final uh1 a = te.g0(rh1.a, te.i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(sx0 sx0Var, uh1 uh1Var, long j, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-126890956);
        if ((i & 6) == 0) {
            i2 = (go0Var.f(sx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.e(j) ? 2048 : 1024;
        }
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            b(v93.c(sx0Var, go0Var), uh1Var, j, go0Var, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new et0((Object) sx0Var, uh1Var, j, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(lw1 lw1Var, uh1 uh1Var, long j, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2142239481);
        if ((i & 6) == 0) {
            i2 = (go0Var.h(lw1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.e(j) ? 2048 : 1024;
        }
        boolean z = true;
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !go0Var.e(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                cl clVar = ju.c(j, ju.g) ? null : new cl(j, 5);
                go0Var.f0(clVar);
                objL = clVar;
            }
            cl clVar2 = (cl) objL;
            go0Var.W(-536832197);
            go0Var.p(false);
            boolean zA = gr2.a(lw1Var.d(), 9205357640488583168L);
            rh1 rh1Var = rh1.a;
            if (!zA) {
                long jD = lw1Var.d();
                uh1 uh1Var2 = (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) ? a : rh1Var;
                dm.a(xe1.Z(uh1Var.c(uh1Var2), lw1Var, clVar2).c(rh1Var), go0Var, 0);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new et0(lw1Var, uh1Var, j, i, 2);
        }
    }
}
