package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e8 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(final ws1 ws1Var, final uh1 uh1Var, long j, px pxVar, final int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1776202187);
        int i3 = (go0Var.f(ws1Var) ? 4 : 2) | i | (go0Var.f(uh1Var) ? 32 : 16) | 128;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            go0Var.T();
            if ((i & 1) == 0 || go0Var.y()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                go0Var.R();
                i2 = i3 & (-897);
            }
            go0Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new v(4, ws1Var);
                go0Var.f0(objL);
            }
            rp0.G(ws1Var, sn.k, xe1.i0(-1653527038, new z7(j, nn2.a(uh1Var, false, (in0) objL)), go0Var), go0Var, i4 | 432);
        } else {
            go0Var.R();
        }
        final long j2 = j;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(uh1Var, j2, i) { // from class: a8
                public final /* synthetic */ uh1 i;
                public final /* synthetic */ long j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(1);
                    e8.a(this.h, this.i, this.j, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(uh1 uh1Var, px pxVar, int i, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                uh1Var = rh1.a;
            }
            rp0.O(go0Var, qp0.t(te.h0(uh1Var, a, 25.0f), new c8(((g13) go0Var.j(h13.a)).a, i5)));
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new b8(uh1Var, i, i2);
        }
    }
}
