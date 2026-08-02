package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 extends fb1 {
    public final String a;
    public final b13 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eb1(String str, b13 b13Var) {
        this.a = str;
        this.b = b13Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb1)) {
            return false;
        }
        eb1 eb1Var = (eb1) obj;
        return this.a.equals(eb1Var.a) && t11.l(this.b, eb1Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b13 b13Var = this.b;
        return (iHashCode + (b13Var != null ? b13Var.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.i(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
