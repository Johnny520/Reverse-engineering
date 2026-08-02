package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dy2 extends ij0 {
    public final xt e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dy2(oa0 oa0Var, kt2 kt2Var, s72 s72Var, xt xtVar) {
        super(oa0Var, kt2Var, s72Var);
        if (xtVar != null) {
            this.e = xtVar;
        } else {
            um2.f("target == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String a() {
        xt xtVar = this.e;
        return xtVar == null ? "????" : xtVar.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 i(oa0 oa0Var) {
        return new dy2(oa0Var, this.c, this.d, this.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 k(s72 s72Var) {
        return new dy2(this.b, this.c, s72Var, this.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m() {
        return this.e.e() - e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        return this.a >= 0 && this.e.a >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final dy2 o(xt xtVar) {
        oa0 oa0Var;
        oa0 oa0Var2 = this.b;
        switch (oa0Var2.a) {
            case 50:
                oa0Var = pa0.Q;
                break;
            case 51:
                oa0Var = pa0.P;
                break;
            case 52:
                oa0Var = pa0.S;
                break;
            case 53:
                oa0Var = pa0.R;
                break;
            case 54:
                oa0Var = pa0.U;
                break;
            case 55:
                oa0Var = pa0.T;
                break;
            case 56:
                oa0Var = pa0.W;
                break;
            case 57:
                oa0Var = pa0.V;
                break;
            case 58:
                oa0Var = pa0.Y;
                break;
            case 59:
                oa0Var = pa0.X;
                break;
            case 60:
                oa0Var = pa0.a0;
                break;
            case 61:
                oa0Var = pa0.Z;
                break;
            default:
                s.g("bogus opcode: ", oa0Var2);
                return null;
        }
        return new dy2(oa0Var, this.c, this.d, xtVar);
    }
}
