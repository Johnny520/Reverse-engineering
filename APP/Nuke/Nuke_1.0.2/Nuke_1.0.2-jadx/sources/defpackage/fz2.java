package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fz2 extends u60 implements gy, ry2 {
    public j10 A;
    public zt2 B;
    public final n70 C = op0.m(new ta(28, this));
    public o62 D = o62.e;
    public dq1 x;
    public vz2 y;
    public wz2 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fz2(dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        this.x = dq1Var;
        this.y = vz2Var;
        this.z = wz2Var;
        this.A = j10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        dq1 dq1Var = this.x;
        dq1Var.j = w23.j;
        dq1Var.i = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        dq1 dq1Var = this.x;
        dq1Var.j = w23.i;
        dq1Var.i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final long h(c61 c61Var) {
        return n(c61Var).d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final o62 n(c61 c61Var) {
        if (!this.u) {
            return this.D;
        }
        o62 o62Var = (o62) this.A.j(c61Var);
        if (o62Var == null) {
            return this.D;
        }
        this.D = o62Var;
        return o62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final qy2 v0() {
        return (qy2) this.C.getValue();
    }
}
