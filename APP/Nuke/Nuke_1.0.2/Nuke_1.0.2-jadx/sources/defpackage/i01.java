package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i01 implements t23 {
    public final za2 h;
    public final kt2 i;
    public final r72 j;
    public final s72 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i01(za2 za2Var, kt2 kt2Var, r72 r72Var, s72 s72Var) {
        if (za2Var == null) {
            um2.f("opcode == null");
            throw null;
        }
        if (kt2Var == null) {
            um2.f("position == null");
            throw null;
        }
        if (s72Var == null) {
            um2.f("sources == null");
            throw null;
        }
        this.h = za2Var;
        this.i = kt2Var;
        this.j = r72Var;
        this.k = s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        String strF = f();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.i);
        sb.append(": ");
        za2 za2Var = this.h;
        String string = za2Var.g;
        if (string == null) {
            string = za2Var.toString();
        }
        sb.append(string);
        if (strF != null) {
            sb.append("(");
            sb.append(strF);
            sb.append(")");
        }
        r72 r72Var = this.j;
        if (r72Var == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(r72Var.h(true));
        }
        sb.append(" <-");
        s72 s72Var = this.k;
        int length = s72Var.i.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((r72) s72Var.e(i)).h(true));
            }
        }
        return sb.toString();
    }

    public abstract void d(h01 h01Var);

    public abstract d63 e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String f() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strF = f();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.i);
        sb.append(' ');
        sb.append(this.h);
        if (strF != null) {
            sb.append(' ');
            sb.append(strF);
        }
        sb.append(" :: ");
        r72 r72Var = this.j;
        if (r72Var != null) {
            sb.append(r72Var);
            sb.append(" <- ");
        }
        sb.append(this.k);
        sb.append('}');
        return sb.toString();
    }
}
