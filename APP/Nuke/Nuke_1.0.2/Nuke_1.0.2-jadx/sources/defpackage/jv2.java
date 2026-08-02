package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jv2 extends iy0 implements Comparable {
    public final q30 i;
    public iv2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jv2(q30 q30Var) {
        if (q30Var == null) {
            um2.f("value == null");
            throw null;
        }
        this.i = q30Var;
        this.j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        if (this.j == null) {
            eh1 eh1Var = (eh1) z70Var.e;
            iv2 iv2Var = new iv2(this.i);
            this.j = iv2Var;
            eh1Var.k(iv2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_STRING_ID_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.i.compareTo(((jv2) obj).i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        String str;
        int iF = this.j.f();
        if (ynVar.d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append(' ');
            String strB = this.i.b();
            if (strB.length() <= 98) {
                str = "";
            } else {
                strB = strB.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strB + str + '\"');
            ynVar.c(sb.toString(), 0);
            ynVar.c("  string_data_off: ".concat(pp0.K(iF)), 4);
        }
        ynVar.j(iF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof jv2) {
            return this.i.equals(((jv2) obj).i);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.h.hashCode();
    }
}
