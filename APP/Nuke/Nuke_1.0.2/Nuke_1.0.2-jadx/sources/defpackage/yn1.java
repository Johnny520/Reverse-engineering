package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ zn1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn1(zn1 zn1Var, int i) {
        super(0);
        this.i = i;
        this.j = zn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.i;
        a83 a83Var = a83.a;
        zn1 zn1Var = this.j;
        switch (i) {
            case 0:
                qp qpVar = zn1Var.O;
                qpVar.getClass();
                zn1Var.M0(qpVar, zn1Var.N);
                break;
            default:
                zn1 zn1Var2 = zn1Var.x;
                if (zn1Var2 != null) {
                    zn1Var2.Z0();
                }
                break;
        }
        return a83Var;
    }
}
