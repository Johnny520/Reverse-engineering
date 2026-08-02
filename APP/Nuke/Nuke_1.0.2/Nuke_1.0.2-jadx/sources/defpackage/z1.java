package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ uh1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z1(String str, uh1 uh1Var, int i, int i2) {
        this.h = i2;
        this.i = str;
        this.j = uh1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        uh1 uh1Var = this.j;
        String str = this.i;
        px pxVar = (px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                te.a(str, uh1Var, pxVar, pp0.N(49));
                break;
            default:
                ci0.q(str, uh1Var, pxVar, pp0.N(1));
                break;
        }
        return a83Var;
    }
}
