package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 {
    public static final bq2 d = new bq2(sp0.c(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bq2(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq2)) {
            return false;
        }
        bq2 bq2Var = (bq2) obj;
        return ju.c(this.a, bq2Var.a) && rs1.b(this.b, bq2Var.b) && this.c == bq2Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return Float.hashCode(this.c) + hk1.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        hk1.l(this.a, sb, ", offset=");
        sb.append((Object) rs1.g(this.b));
        sb.append(", blurRadius=");
        return vi0.l(sb, this.c, ')');
    }
}
