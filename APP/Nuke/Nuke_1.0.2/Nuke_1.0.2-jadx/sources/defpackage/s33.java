package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s33 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ y33 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s33(y33 y33Var, int i) {
        this.h = i;
        this.i = y33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        y33 y33Var = this.i;
        switch (i) {
            case 0:
                return Boolean.valueOf((t11.l(y33Var.d.getValue(), y33Var.c()) && y33Var.g.g() == Long.MIN_VALUE && !((Boolean) y33Var.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(y33Var.b());
        }
    }
}
