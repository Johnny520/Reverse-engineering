package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 extends th1 implements on2 {
    public final n81 A = new n81(this, 0);
    public n81 B;
    public xm0 v;
    public l81 w;
    public qv1 x;
    public boolean y;
    public el2 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q81(xm0 xm0Var, l81 l81Var, qv1 qv1Var, boolean z) {
        this.v = xm0Var;
        this.w = l81Var;
        this.x = qv1Var;
        this.y = z;
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0() {
        this.z = new el2(new o81(this, 0), new o81(this, 1));
        this.B = this.y ? new n81(this, 1) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        v41[] v41VarArr = xn2.a;
        yn2 yn2Var = vn2.n;
        v41[] v41VarArr2 = xn2.a;
        v41 v41Var = v41VarArr2[6];
        zn2Var.a(yn2Var, Boolean.TRUE);
        zn2Var.a(vn2.N, this.A);
        qv1 qv1Var = this.x;
        el2 el2Var = this.z;
        if (qv1Var == qv1.h) {
            if (el2Var == null) {
                t11.S("scrollAxisRange");
                throw null;
            }
            yn2 yn2Var2 = vn2.w;
            v41 v41Var2 = v41VarArr2[13];
            zn2Var.a(yn2Var2, el2Var);
        } else {
            if (el2Var == null) {
                t11.S("scrollAxisRange");
                throw null;
            }
            yn2 yn2Var3 = vn2.v;
            v41 v41Var3 = v41VarArr2[12];
            zn2Var.a(yn2Var3, el2Var);
        }
        n81 n81Var = this.B;
        if (n81Var != null) {
            zn2Var.a(kn2.f, new q3(null, n81Var));
        }
        zn2Var.a(kn2.C, new q3(null, new v5(19, new o81(this, 2))));
        l81 l81Var = this.w;
        l81Var.getClass();
        zt ztVar = new zt(((Number) l81Var.a.getValue()).intValue(), 1);
        yn2 yn2Var4 = vn2.f;
        v41 v41Var4 = v41VarArr2[24];
        zn2Var.a(yn2Var4, ztVar);
    }
}
