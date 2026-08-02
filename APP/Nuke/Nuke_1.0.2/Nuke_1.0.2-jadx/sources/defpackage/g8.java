package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g8 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ p80 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8(p80 p80Var, int i) {
        super(1);
        this.i = i;
        this.j = p80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        p80 p80Var = this.j;
        switch (i) {
            case 0:
                p80Var.show();
                return new f8(0, p80Var);
            default:
                if (p80Var.m.a) {
                    p80Var.l.a();
                }
                return a83.a;
        }
    }
}
