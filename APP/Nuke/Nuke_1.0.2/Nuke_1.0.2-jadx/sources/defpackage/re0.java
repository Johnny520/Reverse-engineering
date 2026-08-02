package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class re0 extends xs1 {
    public final x20 l;
    public byte[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public re0(x20 x20Var) {
        super(1, -1);
        this.l = x20Var;
        this.m = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        dq1.q(z70Var, this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_ENCODED_ARRAY_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final int e(xs1 xs1Var) {
        return this.l.compareTo(((re0) xs1Var).l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void i(eh1 eh1Var, int i) {
        yn ynVar = new yn();
        new dq1(eh1Var.b, ynVar).X(this.l, false);
        int i2 = ynVar.c;
        byte[] bArr = new byte[i2];
        System.arraycopy(ynVar.b, 0, bArr, 0, i2);
        this.m = bArr;
        j(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void k(z70 z70Var, yn ynVar) {
        if (!ynVar.d()) {
            ynVar.h(this.m);
        } else {
            ynVar.c(g().concat(" encoded array"), 0);
            new dq1(z70Var, ynVar).X(this.l, true);
        }
    }
}
