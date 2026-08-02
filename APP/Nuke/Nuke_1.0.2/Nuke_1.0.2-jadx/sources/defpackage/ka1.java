package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 {
    public aa1 a;
    public fa1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ia1 ia1Var, z91 z91Var) {
        aa1 aa1VarA = z91Var.a();
        aa1 aa1Var = this.a;
        if (aa1VarA.compareTo(aa1Var) < 0) {
            aa1Var = aa1VarA;
        }
        this.a = aa1Var;
        this.b.g(ia1Var, z91Var);
        this.a = aa1VarA;
    }
}
