package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl2 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ am2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wl2(am2 am2Var, int i) {
        this.h = i;
        this.i = am2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        am2 am2Var = this.i;
        switch (i) {
            case 0:
                return Boolean.valueOf(am2Var.u);
            default:
                pl0 pl0Var = am2Var.W;
                if (!pl0Var.h.u) {
                    return null;
                }
                kl0 kl0VarR0 = pl0Var.R0();
                int iOrdinal = kl0VarR0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    c80.s();
                    return null;
                }
                if (kl0VarR0.a()) {
                    return pl0Var.P0(null);
                }
                pl0 pl0VarF = ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f();
                if (pl0VarF != null) {
                    return pl0VarF.P0(sp0.b0(pl0Var));
                }
                return null;
        }
    }
}
