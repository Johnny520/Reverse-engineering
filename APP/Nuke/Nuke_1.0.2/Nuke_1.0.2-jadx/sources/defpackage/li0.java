package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 {
    public final a63 a;
    public final String b;
    public final c30 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public li0(a63 a63Var, a63 a63Var2, String str) {
        if (a63Var2 == null) {
            throw null;
        }
        this.a = a63Var;
        this.b = str;
        this.c = new c30(a63Var.c, new o30(new q30(str), new q30(a63Var2.a)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return li0Var.a.equals(this.a) && li0Var.b.equals(this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.b.hashCode() * 37) + this.a.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.a + "." + this.b;
    }
}
