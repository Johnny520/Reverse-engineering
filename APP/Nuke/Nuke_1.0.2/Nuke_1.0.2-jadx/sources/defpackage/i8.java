package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i8 extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ un0 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ un0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(un0 un0Var, Object obj, un0 un0Var2, int i, int i2) {
        super(2);
        this.i = i2;
        this.k = un0Var;
        this.l = obj;
        this.m = un0Var2;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        int i2 = this.j;
        un0 un0Var = this.m;
        Object obj3 = this.l;
        un0 un0Var2 = this.k;
        px pxVar = (px) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                te.f((xm0) un0Var2, (n80) obj3, (kw) un0Var, pxVar, pp0.N(i2 | 1));
                break;
            default:
                pp0.a((in0) un0Var2, (uh1) obj3, (in0) un0Var, pxVar, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
