package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends b12 {
    public final cp2 l;
    public final hx2 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wf0(String str, int i) {
        super(str, null, i);
        this.l = cp2.g;
        this.m = new hx2(new vf0(i, str, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12, defpackage.yo2
    public final s11 c() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yo2)) {
            return false;
        }
        yo2 yo2Var = (yo2) obj;
        return yo2Var.c() == cp2.g && this.a.equals(yo2Var.b()) && t11.l(tl.m(this), tl.m(yo2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        t2 t2Var = new t2(this);
        int iHashCode2 = 1;
        while (t2Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) t2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12, defpackage.yo2
    public final yo2 j(int i) {
        return ((yo2[]) this.m.getValue())[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12
    public final String toString() {
        return du.u0(new ky0(2, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
