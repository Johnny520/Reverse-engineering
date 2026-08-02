package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends tw2 implements in0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ b03 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz2(b03 b03Var, t00 t00Var, int i) {
        super(1, t00Var);
        this.l = i;
        this.m = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        b03 b03Var = this.m;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                new wz2(b03Var, t00Var, 0).r(a83Var);
                break;
            case 1:
                new wz2(b03Var, t00Var, 1).r(a83Var);
                break;
            case 2:
                new wz2(b03Var, t00Var, 2).r(a83Var);
                break;
            default:
                new wz2(b03Var, t00Var, 3).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        b03 b03Var = this.m;
        switch (i) {
            case 0:
                fg1.T(obj);
                b03Var.B = false;
                break;
            case 1:
                fg1.T(obj);
                b03Var.f();
                break;
            case 2:
                fg1.T(obj);
                b03Var.d(b03Var.B);
                break;
            default:
                fg1.T(obj);
                b03Var.p();
                break;
        }
        return a83Var;
    }
}
