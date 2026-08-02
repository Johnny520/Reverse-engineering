package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 extends w51 implements in0 {
    public final /* synthetic */ o72 i;
    public final /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(o72 o72Var, int i) {
        super(1);
        this.i = o72Var;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((pl0) obj).T0(this.j));
        this.i.i = boolValueOf;
        return boolValueOf;
    }
}
