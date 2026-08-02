package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y70 {
    public final String a;
    public final String b;
    public final String c;
    public final hx2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y70(String str) {
        str.getClass();
        this.d = new hx2(new ea(7, this));
        int iQ0 = pv2.q0(str, "->", 0, false, 6);
        int iQ02 = pv2.q0(str, ":", iQ0 + 1, false, 4);
        if (iQ0 == -1 || iQ02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.a = i80.c(str.substring(0, iQ0));
        this.b = str.substring(iQ0 + 2, iQ02);
        this.c = i80.c(str.substring(iQ02 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return t11.l(this.a, y70Var.a) && t11.l(this.b, y70Var.b) && t11.l(this.c, y70Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return i80.e(this.a) + "->" + this.b + ":" + ((String) this.d.getValue());
    }
}
