package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cd2 {
    public final long a;
    public final m43 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cd2(long j, m43 m43Var) {
        this.a = j;
        this.b = m43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        return Float.compare(0.96f, 0.96f) == 0 && m33.a(this.a, cd2Var.a) && this.b.equals(cd2Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Float.hashCode(0.96f) * 31;
        int i = m33.c;
        return this.b.hashCode() + hk1.c(iHashCode, 31, this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Scale(scale=0.96, transformOrigin=" + ((Object) m33.b(this.a)) + ", animationSpec=" + this.b + ')';
    }
}
