package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 {
    public final yc3 a;
    public final wc3 b;
    public final String c;
    public final Throwable d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xc3(yc3 yc3Var, wc3 wc3Var, String str, Throwable th) {
        this.a = yc3Var;
        this.b = wc3Var;
        this.c = str;
        this.d = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc3)) {
            return false;
        }
        xc3 xc3Var = (xc3) obj;
        return this.a == xc3Var.a && this.b == xc3Var.b && this.c.equals(xc3Var.c) && this.d.equals(xc3Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + hk1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Error(operation=" + this.a + ", code=" + this.b + ", message=" + this.c + ", cause=" + this.d + ")";
    }
}
