package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lp1 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lp1(boolean z, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return this.a == lp1Var.a && ju.c(this.b, lp1Var.b) && ju.c(this.c, lp1Var.c) && ju.c(this.d, lp1Var.d) && ju.c(this.e, lp1Var.e) && ju.c(this.f, lp1Var.f) && ju.c(this.g, lp1Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        int i = ju.h;
        return Long.hashCode(this.g) + hk1.c(hk1.c(hk1.c(hk1.c(hk1.c(iHashCode, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strI = ju.i(this.b);
        String strI2 = ju.i(this.c);
        String strI3 = ju.i(this.d);
        String strI4 = ju.i(this.e);
        String strI5 = ju.i(this.f);
        String strI6 = ju.i(this.g);
        StringBuilder sb = new StringBuilder("NukeColors(isLight=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(strI);
        sb.append(", surface=");
        hk1.o(sb, strI2, ", border=", strI3, ", textPrimary=");
        hk1.o(sb, strI4, ", textSecondary=", strI5, ", accent=");
        return hk1.j(sb, strI6, ")");
    }
}
