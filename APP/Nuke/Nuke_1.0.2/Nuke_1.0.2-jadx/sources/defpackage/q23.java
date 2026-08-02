package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q23 extends hd2 implements Runnable {
    public final long l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q23(long j, u00 u00Var) {
        super(u00Var, u00Var.f());
        this.l = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final String V() {
        return super.V() + "(timeMillis=" + this.l + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        a20 a20Var = this.j;
        eu.K(a20Var);
        if (a20Var.o(f20.i) != null) {
            c80.g();
            return;
        }
        z(new p23("Timed out waiting for " + this.l + " ms", this));
    }
}
