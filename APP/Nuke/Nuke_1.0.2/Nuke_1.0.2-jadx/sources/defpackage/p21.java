package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 extends n21 {
    public final r21 l;
    public final q21 m;
    public final ns n;
    public final Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p21(r21 r21Var, q21 q21Var, ns nsVar, Object obj) {
        this.l = r21Var;
        this.m = q21Var;
        this.n = nsVar;
        this.o = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final void l(Throwable th) {
        ns nsVar = this.n;
        ns nsVarW = r21.W(nsVar);
        r21 r21Var = this.l;
        q21 q21Var = this.m;
        Object obj = this.o;
        if (nsVarW == null || !r21Var.f0(q21Var, nsVarW, obj)) {
            q21Var.h.e(new qb1(2), 2);
            ns nsVarW2 = r21.W(nsVar);
            if (nsVarW2 == null || !r21Var.f0(q21Var, nsVarW2, obj)) {
                r21Var.x(r21Var.J(q21Var, obj));
            }
        }
    }
}
