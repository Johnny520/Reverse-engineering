package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yf1 {
    public final Class a;
    public final Object b;
    public boolean c = false;
    public final xf1 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yf1(Class cls, Object obj, xf1 xf1Var) {
        this.a = cls;
        this.b = obj;
        this.d = xf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf1)) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        return t11.l(this.a, yf1Var.a) && t11.l(this.b, yf1Var.b) && this.c == yf1Var.c && this.d == yf1Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.d.hashCode() + hk1.d((iHashCode + (obj == null ? 0 : obj.hashCode())) * 961, 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Configuration(declaringClass=" + this.a + ", memberInstance=" + this.b + ", processorResolver=null, superclass=" + this.c + ", optional=" + this.d + ")";
    }
}
