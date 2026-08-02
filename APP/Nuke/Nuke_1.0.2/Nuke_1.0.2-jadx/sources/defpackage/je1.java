package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class je1 implements g22 {
    public final n4 h;
    public h11 i;
    public d61 j;
    public h11 k;
    public z01 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public je1(n4 n4Var) {
        this.h = n4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g22
    public final long a(d11 d11Var, long j, d61 d61Var, long j2) {
        z01 z01Var = this.l;
        if (z01Var != null) {
            h11 h11Var = this.i;
            if ((h11Var == null ? false : h11.a(h11Var.a, j)) && this.j == d61Var) {
                h11 h11Var2 = this.k;
                if (h11Var2 != null ? h11.a(h11Var2.a, j2) : false) {
                    return z01Var.a;
                }
            }
        }
        long jA = this.h.a(d11Var, j, d61Var, j2);
        this.i = new h11(j);
        this.j = d61Var;
        this.k = new h11(j2);
        this.l = new z01(jA);
        return jA;
    }
}
