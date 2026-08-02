package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 {
    public final boolean a = true;
    public final boolean b = true;
    public final km2 c = km2.h;
    public final boolean d = true;
    public final boolean e = true;
    public final String f = "";
    public final int g = 2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return this.a == n80Var.a && this.b == n80Var.b && this.c == n80Var.c && this.d == n80Var.d && this.e == n80Var.e && this.g == n80Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (hk1.d(hk1.d((this.c.hashCode() + hk1.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
