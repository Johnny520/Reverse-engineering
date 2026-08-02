package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vv1 {
    public final long a;
    public final jw1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vv1() {
        long jC = sp0.c(4284900966L);
        jw1 jw1VarG = fg1.g(3);
        this.a = jC;
        this.b = jw1VarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vv1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vv1 vv1Var = (vv1) obj;
        return ju.c(this.a, vv1Var.a) && t11.l(this.b, vv1Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        hk1.l(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
