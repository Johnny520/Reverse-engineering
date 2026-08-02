package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 {
    public final Object a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ou0(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou0)) {
            return false;
        }
        ou0 ou0Var = (ou0) obj;
        return t11.l(this.a, ou0Var.a) && this.b == ou0Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.a;
        return Integer.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConvertedArgument(value=" + this.a + ", score=" + this.b + ")";
    }
}
