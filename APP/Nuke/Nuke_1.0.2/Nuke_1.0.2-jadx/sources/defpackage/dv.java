package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv implements uh1 {
    public final uh1 a;
    public final uh1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dv(uh1 uh1Var, uh1 uh1Var2) {
        this.a = uh1Var;
        this.b = uh1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uh1
    public final Object a(mn0 mn0Var, Object obj) {
        return this.b.a(mn0Var, this.a.a(mn0Var, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uh1
    public final boolean b(in0 in0Var) {
        return this.a.b(in0Var) && this.b.b(in0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return this.a.equals(dvVar.a) && t11.l(this.b, dvVar.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.i(new StringBuilder("["), (String) a(lc.r, ""), ']');
    }
}
