package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends v92 {
    public int i;
    public final /* synthetic */ mn0 j;
    public final /* synthetic */ t00 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(t00 t00Var, t00 t00Var2, mn0 mn0Var) {
        super(t00Var);
        this.j = mn0Var;
        this.k = t00Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                s.l("This coroutine had already completed");
                return null;
            }
            this.i = 2;
            fg1.T(obj);
            return obj;
        }
        this.i = 1;
        fg1.T(obj);
        mn0 mn0Var = this.j;
        mn0Var.getClass();
        xe1.f(2, mn0Var);
        return mn0Var.g(this.k, this);
    }
}
