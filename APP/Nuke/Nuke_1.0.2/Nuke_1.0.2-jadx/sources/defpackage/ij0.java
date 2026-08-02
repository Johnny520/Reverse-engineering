package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ij0 extends a40 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final int b() {
        return this.b.d.v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String g() {
        oa0 oa0Var = this.b;
        sp0 sp0Var = oa0Var.d;
        sp0Var.getClass();
        String strA = oa0Var.a();
        String strH = sp0Var.H(this);
        String strI = sp0Var.I(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strA);
        if (strH.length() != 0) {
            sb.append(' ');
            sb.append(strH);
        }
        if (strI.length() != 0) {
            sb.append(" // ");
            sb.append(strI);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 j(int i) {
        return k(this.d.k(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final void l(yn ynVar) {
        this.b.d.q0(ynVar, this);
    }
}
