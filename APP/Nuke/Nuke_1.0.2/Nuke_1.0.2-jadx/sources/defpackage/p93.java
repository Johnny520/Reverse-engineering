package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p93 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ q93 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p93(q93 q93Var, int i) {
        super(1);
        this.i = i;
        this.j = q93Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        q93 q93Var = this.j;
        switch (i) {
            case 0:
                q93Var.d = true;
                q93Var.f.a();
                return a83Var;
            default:
                nc0 nc0Var = (nc0) obj;
                ar0 ar0Var = q93Var.b;
                float f = q93Var.k;
                float f2 = q93Var.l;
                b5 b5VarE = nc0Var.E();
                long jU = b5VarE.u();
                b5VarE.q().l();
                try {
                    ((n4) b5VarE.i).A(f, f2, 0L);
                    ar0Var.a(nc0Var);
                    return a83Var;
                } finally {
                    vi0.r(b5VarE, jU);
                }
        }
    }
}
