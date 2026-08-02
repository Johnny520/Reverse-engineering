package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sm extends th1 implements jm, a61 {
    public g00 v;
    public boolean w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 M0(sm smVar, zn1 zn1Var, t6 t6Var) {
        o62 o62Var;
        if (smVar.u && smVar.w) {
            zn1 zn1VarB0 = sp0.b0(smVar);
            if (!zn1Var.S0().u) {
                zn1Var = null;
            }
            if (zn1Var != null && (o62Var = (o62) t6Var.a()) != null) {
                return o62Var.i(zn1VarB0.J(zn1Var, false).d());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm
    public final Object f0(zn1 zn1Var, t6 t6Var, u00 u00Var) {
        Object objU = te.u(new rm(this, zn1Var, t6Var, new s1(this, zn1Var, t6Var, 4), null), u00Var);
        return objU == k20.h ? objU : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a61
    public final void q(c61 c61Var) {
        this.w = true;
    }
}
