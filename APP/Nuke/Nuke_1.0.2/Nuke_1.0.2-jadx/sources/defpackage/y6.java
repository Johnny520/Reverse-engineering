package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6(int i, int i2) {
        super(1);
        this.i = i2;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                return Boolean.valueOf(((pl0) obj).T0(i2));
            case 1:
                return Boolean.valueOf(((pl0) obj).T0(i2));
            case 2:
                return Boolean.valueOf(((pl0) obj).T0(i2));
            case 3:
                return Boolean.valueOf(((pl0) obj).T0(i2));
            default:
                return Boolean.valueOf(((pl0) obj).M0(i2));
        }
    }
}
