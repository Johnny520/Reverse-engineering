package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m43 implements bd0 {
    public final int a;
    public final gd0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m43(int i, gd0 gd0Var) {
        this.a = i;
        this.b = gd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd
    public final x93 a(n43 n43Var) {
        return new dk(this.a, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof m43)) {
            return false;
        }
        m43 m43Var = (m43) obj;
        return m43Var.a == this.a && t11.l(m43Var.b, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.b.hashCode() + (this.a * 31)) * 31;
    }

    @Override // defpackage.bd0, defpackage.hd
    public final z93 a(n43 n43Var) {
        return new dk(this.a, this.b);
    }
}
