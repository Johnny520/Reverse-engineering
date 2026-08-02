package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ c73 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hf(in0 in0Var, c73 c73Var, int i) {
        this.h = i;
        this.i = in0Var;
        this.j = c73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        in0 in0Var = this.i;
        switch (i) {
            case 0:
                x51 x51Var = (x51) obj;
                x51Var.getClass();
                in0Var.j(c73.a(this.j, 0, x51Var.h, false, null, 13));
                break;
            case 1:
                pf pfVar = (pf) obj;
                pfVar.getClass();
                in0Var.j(c73.a(this.j, pfVar.h, 0, false, null, 14));
                break;
            default:
                in0Var.j(c73.a(this.j, 0, 0, ((Boolean) obj).booleanValue(), null, 11));
                break;
        }
        return a83Var;
    }
}
