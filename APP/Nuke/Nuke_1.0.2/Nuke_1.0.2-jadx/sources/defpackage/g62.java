package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g62(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.l = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((g62) p((t00) obj2, (f62) obj)).r(a83Var);
            default:
                return ((g62) p((t00) obj2, (nq2) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                g62 g62Var = new g62(2, t00Var, 0);
                g62Var.m = obj;
                return g62Var;
            default:
                g62 g62Var2 = new g62(2, t00Var, 1);
                g62Var2.m = obj;
                return g62Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        switch (this.l) {
            case 0:
                fg1.T(obj);
                return Boolean.valueOf(((f62) this.m) == f62.h);
            default:
                nq2 nq2Var = (nq2) this.m;
                fg1.T(obj);
                return Boolean.valueOf(nq2Var != nq2.h);
        }
    }
}
