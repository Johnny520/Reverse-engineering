package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m00(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return ju.c(this.a, m00Var.a) && ju.c(this.b, m00Var.b) && ju.c(this.c, m00Var.c) && ju.c(this.d, m00Var.d) && ju.c(this.e, m00Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return Long.hashCode(this.e) + hk1.c(hk1.c(hk1.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        hk1.l(this.a, sb, ", textColor=");
        hk1.l(this.b, sb, ", iconColor=");
        hk1.l(this.c, sb, ", disabledTextColor=");
        hk1.l(this.d, sb, ", disabledIconColor=");
        sb.append((Object) ju.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
