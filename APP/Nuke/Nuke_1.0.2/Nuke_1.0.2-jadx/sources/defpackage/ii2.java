package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii2 {
    public final String a;
    public final String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ii2(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2)) {
            return false;
        }
        ii2 ii2Var = (ii2) obj;
        String str = ii2Var.a;
        o72 o72Var = oi2.i;
        return t11.l(this.a, str) && this.b.equals(ii2Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        o72 o72Var = oi2.i;
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        o72 o72Var = oi2.i;
        return vi0.k("ScriptModule(path=", this.a, ", code=", this.b, ")");
    }
}
