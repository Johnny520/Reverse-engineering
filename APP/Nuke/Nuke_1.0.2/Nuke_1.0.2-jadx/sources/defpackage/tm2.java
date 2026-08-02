package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 {
    public final sm2 a;
    public final sm2 b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tm2(sm2 sm2Var, sm2 sm2Var2, boolean z) {
        this.a = sm2Var;
        this.b = sm2Var2;
        this.c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tm2 a(tm2 tm2Var, sm2 sm2Var, sm2 sm2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            sm2Var = tm2Var.a;
        }
        if ((i & 2) != 0) {
            sm2Var2 = tm2Var.b;
        }
        tm2Var.getClass();
        return new tm2(sm2Var, sm2Var2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm2)) {
            return false;
        }
        tm2 tm2Var = (tm2) obj;
        return t11.l(this.a, tm2Var.a) && t11.l(this.b, tm2Var.b) && this.c == tm2Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
