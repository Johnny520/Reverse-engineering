package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k23 extends i01 {
    public final d63 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k23(za2 za2Var, kt2 kt2Var, s72 s72Var, d63 d63Var) {
        super(za2Var, kt2Var, null, s72Var);
        int i = za2Var.e;
        if (i != 6) {
            s.j(vi0.g("opcode with invalid branchingness: ", i));
            throw null;
        }
        if (d63Var != null) {
            this.l = d63Var;
        } else {
            um2.f("catches == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
    public static String g(d63 d63Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int length = ((kj0) d63Var).i.length;
        for (int i = 0; i < length; i++) {
            sb.append(" ");
            sb.append(d63Var.getType(i).b());
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public final void d(h01 h01Var) {
        h01Var.h(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public final d63 e() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public final String f() {
        return g(this.l);
    }
}
