package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 {
    public final a63 a;
    public final a63 b;
    public final String c;
    public final e63 d;
    public final n30 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vg1(a63 a63Var, a63 a63Var2, String str, e63 e63Var) {
        if (a63Var2 == null || str == null) {
            throw null;
        }
        this.a = a63Var;
        this.b = a63Var2;
        this.c = str;
        this.d = e63Var;
        this.e = new n30(a63Var.c, new o30(new q30(str), new q30(a(false))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder("(");
        if (z) {
            sb.append(this.a.a);
        }
        for (a63 a63Var : this.d.a) {
            sb.append(a63Var.a);
        }
        sb.append(")");
        sb.append(this.b.a);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof vg1)) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        return vg1Var.a.equals(this.a) && vg1Var.c.equals(this.c) && vg1Var.d.equals(this.d) && vg1Var.b.equals(this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.b.a.hashCode() + ((Arrays.hashCode(this.d.a) + hk1.f(this.c, hk1.f(this.a.a, 527, 31), 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.a + "." + this.c + "(" + this.d + ")";
    }
}
