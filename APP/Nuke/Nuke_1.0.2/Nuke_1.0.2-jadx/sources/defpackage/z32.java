package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z32 extends bp implements v41 {
    public final boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z32(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.n = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z32) {
            z32 z32Var = (z32) obj;
            return f().equals(z32Var.f()) && this.k.equals(z32Var.k) && this.l.equals(z32Var.l) && t11.l(this.i, z32Var.i);
        }
        if (obj instanceof v41) {
            return obj.equals(h());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p41 h() {
        if (this.n) {
            return this;
        }
        p41 p41Var = this.h;
        if (p41Var != null) {
            return p41Var;
        }
        p41 p41VarD = d();
        this.h = p41VarD;
        return p41VarD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.l.hashCode() + hk1.f(this.k, f().hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        p41 p41VarH = h();
        return p41VarH != this ? p41VarH.toString() : hk1.j(new StringBuilder("property "), this.k, " (Kotlin reflection is not available)");
    }
}
