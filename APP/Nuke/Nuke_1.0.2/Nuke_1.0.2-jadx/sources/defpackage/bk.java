package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bk extends kj0 {
    public final v01 j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bk(int i) {
        super(i);
        this.j = new v01(i);
        this.k = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h() {
        v01 v01Var = this.j;
        int i = v01Var.j - 1;
        while (i >= 0 && v01Var.f(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        if (i2 < 0) {
            v01Var.getClass();
            s.j("newSize < 0");
            return 0;
        }
        if (i2 > v01Var.j) {
            s.j("newSize > size");
            return 0;
        }
        v01Var.d();
        v01Var.j = i2;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zj i(int i) {
        v01 v01Var = this.j;
        int iF = i >= v01Var.j ? -1 : v01Var.f(i);
        if (iF >= 0) {
            return (zj) e(iF);
        }
        s.j("no such label: ".concat(pp0.J(i)));
        return null;
    }
}
