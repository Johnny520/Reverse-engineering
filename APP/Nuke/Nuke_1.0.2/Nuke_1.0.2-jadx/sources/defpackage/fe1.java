package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe1 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ ge1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fe1(ge1 ge1Var, int i) {
        this.h = i;
        this.i = ge1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        ge1 ge1Var = this.i;
        switch (i) {
            case 0:
                ge1Var.O0();
                return a83.a;
            case 1:
                return new rs1(ge1Var.D);
            default:
                c61 c61Var = (c61) ge1Var.B.getValue();
                return new rs1(c61Var != null ? c61Var.M(0L) : 9205357640488583168L);
        }
    }
}
