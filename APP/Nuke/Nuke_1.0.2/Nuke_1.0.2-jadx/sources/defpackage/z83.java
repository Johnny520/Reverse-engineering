package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z83 {
    public final ji0 a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z83(ji0 ji0Var, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = ji0Var;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z83)) {
            return false;
        }
        z83 z83Var = (z83) obj;
        return this.a.equals(z83Var.a) && this.b == z83Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return vi0.u(this.b) + (this.a.k.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("UsingFieldData(field=");
        sb.append(this.a);
        sb.append(", usingType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "Write" : "Read");
        sb.append(")");
        return sb.toString();
    }
}
