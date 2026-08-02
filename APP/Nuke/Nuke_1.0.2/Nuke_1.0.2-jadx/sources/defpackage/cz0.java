package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {
    public final zk1 a = new zk1(new az0[16]);
    public final nx1 b = op0.u(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final nx1 d = op0.u(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-318043801);
        int i2 = (go0Var.h(this) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            Object objL = go0Var.L();
            t00 t00Var = null;
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(null);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                go0Var.W(-144841960);
                boolean zH = go0Var.h(this);
                Object objL2 = go0Var.L();
                if (zH || objL2 == ebVar) {
                    objL2 = new k9(xk1Var, this, t00Var, 6);
                    go0Var.f0(objL2);
                }
                eu.f(go0Var, (mn0) objL2, this);
                go0Var.p(false);
            } else {
                go0Var.W(-143455237);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new s9(i, 10, this);
        }
    }
}
