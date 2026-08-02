package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd1 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ kz2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cd1(kz2 kz2Var, int i) {
        this.h = i;
        this.i = kz2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        kz2 kz2Var = this.i;
        switch (i) {
            case 0:
                kz2Var.b(((rs1) obj).a, gd3.H);
                break;
            case 1:
                o12 o12Var = (o12) obj;
                kz2Var.e(tp0.E(o12Var, false));
                o12Var.a();
                break;
            default:
                o12 o12Var2 = (o12) obj;
                kz2Var.e(tp0.E(o12Var2, false));
                o12Var2.a();
                break;
        }
        return a83Var;
    }
}
