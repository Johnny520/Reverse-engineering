package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends te {
    public final db2 j;
    public final y9 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uv1(db2 db2Var) {
        y9 y9VarA;
        this.j = db2Var;
        if (p7.z(db2Var)) {
            y9VarA = null;
        } else {
            y9VarA = aa.a();
            y9.b(y9VarA, db2Var);
        }
        this.k = y9VarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.te
    public final o62 D() {
        db2 db2Var = this.j;
        return new o62(db2Var.a, db2Var.b, db2Var.c, db2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv1) {
            return this.j.equals(((uv1) obj).j);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode();
    }
}
