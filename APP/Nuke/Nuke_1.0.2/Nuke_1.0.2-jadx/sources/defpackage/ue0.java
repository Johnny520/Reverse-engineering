package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends te0 implements Comparable {
    public final n30 i;
    public final yt j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ue0(n30 n30Var, int i, kj1 kj1Var, d63 d63Var) {
        super(i);
        if (n30Var == null) {
            um2.f("method == null");
            throw null;
        }
        this.i = n30Var;
        if (kj1Var == null) {
            this.j = null;
        } else {
            this.j = new yt(n30Var, kj1Var, (i & 8) != 0, d63Var);
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
        return this.i.compareTo(((ue0) obj).i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.te0
    public final int d(z70 z70Var, yn ynVar, int i, int i2) {
        xg1 xg1Var = (xg1) z70Var.l;
        n30 n30Var = this.i;
        int iL = xg1Var.l(n30Var);
        int i3 = iL - i;
        yt ytVar = this.j;
        int iF = ytVar == null ? 0 : ytVar.f();
        boolean z = iF != 0;
        int i4 = this.h;
        if (z != ((i4 & 1280) == 0)) {
            c80.t("code vs. access_flags mismatch");
            return 0;
        }
        if (ynVar.d()) {
            ynVar.c(String.format("  [%x] %s", Integer.valueOf(i2), n30Var.b()), 0);
            ynVar.c("    method_idx:   ".concat(pp0.K(iL)), pp0.M(i3));
            ynVar.c("    access_flags: " + up0.x(i4, 204287, 3), pp0.M(i4));
            ynVar.c("    code_off:     ".concat(pp0.K(iF)), pp0.M(iF));
        }
        ynVar.m(i3);
        ynVar.m(i4);
        ynVar.m(iF);
        return iL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ue0) && this.i.compareTo(((ue0) obj).i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(ue0.class.getName());
        sb.append('{');
        sb.append(pp0.J(this.h));
        sb.append(' ');
        sb.append(this.i);
        yt ytVar = this.j;
        if (ytVar != null) {
            sb.append(' ');
            sb.append(ytVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
