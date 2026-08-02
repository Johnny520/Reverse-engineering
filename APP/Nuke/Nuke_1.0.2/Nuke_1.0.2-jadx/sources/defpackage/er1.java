package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ gu2 i;
    public final /* synthetic */ gu2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ er1(gu2 gu2Var, gu2 gu2Var2, int i) {
        this.h = i;
        this.i = gu2Var;
        this.j = gu2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        gu2 gu2Var = this.j;
        gu2 gu2Var2 = this.i;
        ca2 ca2Var = (ca2) obj;
        ca2Var.getClass();
        switch (i) {
            case 0:
                ca2Var.j(((Number) gu2Var2.getValue()).floatValue());
                ca2Var.k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.l(((Number) gu2Var.getValue()).floatValue());
                break;
            case 1:
                ca2Var.k(((Number) gu2Var2.getValue()).floatValue());
                ca2Var.l(((Number) gu2Var.getValue()).floatValue());
                break;
            default:
                ca2Var.s(ca2Var.x.b() * ((za0) gu2Var2.getValue()).h);
                ca2Var.k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.l(((Number) gu2Var.getValue()).floatValue());
                break;
        }
        return a83Var;
    }
}
