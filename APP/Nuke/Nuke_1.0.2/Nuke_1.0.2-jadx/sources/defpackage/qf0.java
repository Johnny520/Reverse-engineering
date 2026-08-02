package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rf0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(rf0 rf0Var, int i) {
        super(1);
        this.i = i;
        this.j = rf0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        if0 if0Var = if0.j;
        if0 if0Var2 = if0.i;
        if0 if0Var3 = if0.h;
        rf0 rf0Var = this.j;
        switch (i) {
            case 0:
                v33 v33Var = (v33) obj;
                boolean zA = v33Var.a(if0Var3, if0Var2);
                qt2 qt2Var = null;
                if (!zA) {
                    if (v33Var.a(if0Var2, if0Var)) {
                        z33 z33Var = rf0Var.z.a;
                    } else {
                        qt2Var = nf0.d;
                    }
                }
                return qt2Var == null ? nf0.d : qt2Var;
            default:
                v33 v33Var2 = (v33) obj;
                if (v33Var2.a(if0Var3, if0Var2)) {
                    return nf0.c;
                }
                if (!v33Var2.a(if0Var2, if0Var)) {
                    return nf0.c;
                }
                z33 z33Var2 = rf0Var.z.a;
                return nf0.c;
        }
    }
}
