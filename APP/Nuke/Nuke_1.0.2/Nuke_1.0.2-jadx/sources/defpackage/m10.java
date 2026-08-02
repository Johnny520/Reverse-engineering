package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements mn0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m10(b03 b03Var, boolean z, int i) {
        this.j = b03Var;
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj3 = this.j;
        boolean z = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gf1.c((b03) obj3, z, (px) obj, pp0.N(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xe1.a(z, (mn0) obj3, (px) obj, pp0.N(1));
                break;
            default:
                kw kwVar = (kw) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    ci0.a(lu.i.a(z ? lu.h : lu.g), kwVar, go0Var, 8);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ m10(boolean z, kw kwVar) {
        this.i = z;
        this.j = kwVar;
    }

    public /* synthetic */ m10(boolean z, mn0 mn0Var, int i) {
        this.i = z;
        this.j = mn0Var;
    }
}
