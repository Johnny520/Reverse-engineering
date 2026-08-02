package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends w51 implements mn0 {
    public final /* synthetic */ uh1 i;
    public final /* synthetic */ mn0 j;
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(uh1 uh1Var, mn0 mn0Var, int i) {
        super(2);
        this.i = uh1Var;
        this.j = mn0Var;
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iN = pp0.N(this.k | 1);
        te.k(this.i, this.j, (px) obj, iN);
        return a83.a;
    }
}
