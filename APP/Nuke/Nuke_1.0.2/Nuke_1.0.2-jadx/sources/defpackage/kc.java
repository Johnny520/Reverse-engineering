package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kc extends w51 implements mn0 {
    public final /* synthetic */ in0 i;
    public final /* synthetic */ uh1 j;
    public final /* synthetic */ in0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(in0 in0Var, uh1 uh1Var, in0 in0Var2, int i, int i2) {
        super(2);
        this.i = in0Var;
        this.j = uh1Var;
        this.k = in0Var2;
        this.l = i;
        this.m = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pp0.b(this.i, this.j, this.k, (px) obj, pp0.N(this.l | 1), this.m);
        return a83.a;
    }
}
