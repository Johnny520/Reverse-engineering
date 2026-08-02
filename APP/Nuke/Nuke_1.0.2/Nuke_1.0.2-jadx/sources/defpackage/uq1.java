package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 {
    public final th2 a;
    public final lf2 b;
    public final rf2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uq1(th2 th2Var, lf2 lf2Var, rf2 rf2Var) {
        th2Var.getClass();
        this.a = th2Var;
        this.b = lf2Var;
        this.c = rf2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq1)) {
            return false;
        }
        uq1 uq1Var = (uq1) obj;
        return t11.l(this.a, uq1Var.a) && this.b.equals(uq1Var.b) && this.c.equals(uq1Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NukeScriptSettings(manifest=" + this.a + ", schema=" + this.b + ", snapshot=" + this.c + ")";
    }
}
