package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n03 {
    public static final n03 c = new n03(rg3.D(0), rg3.D(0));
    public final long a;
    public final long b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n03(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        return p13.a(this.a, n03Var.a) && p13.a(this.b, n03Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        q13[] q13VarArr = p13.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) p13.d(this.a)) + ", restLine=" + ((Object) p13.d(this.b)) + ')';
    }
}
