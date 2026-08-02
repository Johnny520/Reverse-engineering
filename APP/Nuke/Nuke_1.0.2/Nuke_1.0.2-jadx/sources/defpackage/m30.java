package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m30 extends k63 {
    public final r30 h;
    public final o30 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m30(r30 r30Var, o30 o30Var) {
        if (r30Var == null) {
            um2.f("definingClass == null");
            throw null;
        }
        this.h = r30Var;
        this.i = o30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return this.h.h.b() + '.' + this.i.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m30 m30Var = (m30) obj;
        return this.h.equals(m30Var.h) && this.i.equals(m30Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode() ^ (this.h.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return f() + '{' + b() + '}';
    }
}
