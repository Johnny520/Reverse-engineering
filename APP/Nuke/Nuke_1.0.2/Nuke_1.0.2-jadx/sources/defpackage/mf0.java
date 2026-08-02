package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends w51 implements in0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ xm0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(boolean z, xm0 xm0Var) {
        super(1);
        this.i = z;
        this.j = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        ((ca2) obj).g(!this.i && ((Boolean) this.j.a()).booleanValue());
        return a83.a;
    }
}
