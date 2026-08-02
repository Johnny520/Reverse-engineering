package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rf0 j;
    public final /* synthetic */ long k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(rf0 rf0Var, long j, int i) {
        super(1);
        this.i = i;
        this.j = rf0Var;
        this.k = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int iOrdinal;
        int i = this.i;
        rf0 rf0Var = this.j;
        switch (i) {
            case 0:
                int iOrdinal2 = ((if0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        c80.s();
                        return null;
                    }
                    z33 z33Var = rf0Var.z.a;
                }
                return new h11(this.k);
            default:
                if0 if0Var = (if0) obj;
                if (rf0Var.D != null && rf0Var.M0() != null && !t11.l(rf0Var.D, rf0Var.M0()) && (iOrdinal = if0Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c80.s();
                        return null;
                    }
                    z33 z33Var2 = rf0Var.z.a;
                }
                return new z01(0L);
        }
    }
}
