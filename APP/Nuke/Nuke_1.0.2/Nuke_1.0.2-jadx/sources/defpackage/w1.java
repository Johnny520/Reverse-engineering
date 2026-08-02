package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w1(in0 in0Var) {
        this.h = 2;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        in0 in0Var = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                te.b(in0Var, (px) obj, pp0.N(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rg3.g(in0Var, (px) obj, pp0.N(1));
                break;
            default:
                in0Var.j(obj);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ w1(int i, int i2, in0 in0Var) {
        this.h = i2;
        this.i = in0Var;
    }
}
