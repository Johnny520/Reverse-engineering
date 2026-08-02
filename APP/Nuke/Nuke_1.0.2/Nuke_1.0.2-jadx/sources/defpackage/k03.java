package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k03 {
    public final sd a;
    public final long b;
    public final f13 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k03(sd sdVar, long j, f13 f13Var) {
        this.a = sdVar;
        this.b = fg1.r(j, sdVar.i.length());
        this.c = f13Var != null ? new f13(fg1.r(f13Var.a, sdVar.i.length())) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k03 a(k03 k03Var, sd sdVar, long j, int i) {
        if ((i & 1) != 0) {
            sdVar = k03Var.a;
        }
        if ((i & 2) != 0) {
            j = k03Var.b;
        }
        f13 f13Var = (i & 4) != 0 ? k03Var.c : null;
        k03Var.getClass();
        return new k03(sdVar, j, f13Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k03)) {
            return false;
        }
        k03 k03Var = (k03) obj;
        return f13.b(this.b, k03Var.b) && t11.l(this.c, k03Var.c) && t11.l(this.a, k03Var.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = f13.c;
        int iC = hk1.c(iHashCode, 31, this.b);
        f13 f13Var = this.c;
        return iC + (f13Var != null ? Long.hashCode(f13Var.a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) f13.h(this.b)) + ", composition=" + this.c + ')';
    }

    public k03(String str, long j, int i) {
        this(new sd((i & 1) != 0 ? "" : str), (i & 2) != 0 ? f13.b : j, (f13) null);
    }
}
