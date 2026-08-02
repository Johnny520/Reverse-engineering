package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ o72 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(o72 o72Var, int i) {
        super(1);
        this.i = i;
        this.j = o72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        boolean z;
        int i = this.i;
        o72 o72Var = this.j;
        switch (i) {
            case 0:
                o72Var.i = (pl0) obj;
                return Boolean.TRUE;
            case 1:
                wu0 wu0Var = (wu0) obj;
                Object obj2 = o72Var.i;
                if (obj2 == null && wu0Var.x) {
                    o72Var.i = wu0Var;
                } else if (obj2 != null) {
                    wu0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (d43) obj;
                if (((th1) obj3).h.u) {
                    o72Var.i = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
