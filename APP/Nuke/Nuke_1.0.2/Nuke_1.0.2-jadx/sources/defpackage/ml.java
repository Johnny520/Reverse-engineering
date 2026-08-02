package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ml {
    public d9 a = null;
    public f6 b = null;
    public sp c = null;
    public y9 d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        return t11.l(this.a, mlVar.a) && t11.l(this.b, mlVar.b) && t11.l(this.c, mlVar.c) && t11.l(this.d, mlVar.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        d9 d9Var = this.a;
        int iHashCode = (d9Var == null ? 0 : d9Var.hashCode()) * 31;
        f6 f6Var = this.b;
        int iHashCode2 = (iHashCode + (f6Var == null ? 0 : f6Var.hashCode())) * 31;
        sp spVar = this.c;
        int iHashCode3 = (iHashCode2 + (spVar == null ? 0 : spVar.hashCode())) * 31;
        y9 y9Var = this.d;
        return iHashCode3 + (y9Var != null ? y9Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
