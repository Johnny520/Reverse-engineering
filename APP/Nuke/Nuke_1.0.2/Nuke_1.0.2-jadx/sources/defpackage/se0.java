package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends te0 implements Comparable {
    public final c30 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public se0(c30 c30Var, int i) {
        super(i);
        if (c30Var != null) {
            this.i = c30Var;
        } else {
            um2.f("field == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return this.i.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.i.compareTo(((se0) obj).i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.te0
    public final int d(z70 z70Var, yn ynVar, int i, int i2) {
        ni0 ni0Var = (ni0) z70Var.k;
        c30 c30Var = this.i;
        int iL = ni0Var.l(c30Var);
        int i3 = iL - i;
        boolean zD = ynVar.d();
        int i4 = this.h;
        if (zD) {
            ynVar.c(String.format("  [%x] %s", Integer.valueOf(i2), c30Var.b()), 0);
            ynVar.c("    field_idx:    ".concat(pp0.K(iL)), pp0.M(i3));
            ynVar.c("    access_flags: " + up0.x(i4, 20703, 2), pp0.M(i4));
        }
        ynVar.m(i3);
        ynVar.m(i4);
        return iL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof se0) && this.i.compareTo(((se0) obj).i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(se0.class.getName());
        sb.append('{');
        sb.append(pp0.J(this.h));
        sb.append(' ');
        sb.append(this.i);
        sb.append('}');
        return sb.toString();
    }
}
