package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 extends th1 implements on2 {

    /* JADX INFO: renamed from: A */
    public final n81 f8819A = new n81(this, 0);

    /* JADX INFO: renamed from: B */
    public n81 f8820B;

    /* JADX INFO: renamed from: v */
    public xm0 f8821v;

    /* JADX INFO: renamed from: w */
    public l81 f8822w;

    /* JADX INFO: renamed from: x */
    public qv1 f8823x;

    /* JADX INFO: renamed from: y */
    public boolean f8824y;

    /* JADX INFO: renamed from: z */
    public el2 f8825z;

    public q81(xm0 xm0Var, l81 l81Var, qv1 qv1Var, boolean z) {
        this.f8821v = xm0Var;
        this.f8822w = l81Var;
        this.f8823x = qv1Var;
        this.f8824y = z;
        m4067M0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m4067M0() {
        this.f8825z = new el2(new o81(this, 0), new o81(this, 1));
        this.f8820B = this.f8824y ? new n81(this, 1) : null;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        v41[] v41VarArr = xn2.f13086a;
        yn2 yn2Var = vn2.f12071n;
        v41[] v41VarArr2 = xn2.f13086a;
        v41 v41Var = v41VarArr2[6];
        zn2Var.mo1533a(yn2Var, Boolean.TRUE);
        zn2Var.mo1533a(vn2.f12054N, this.f8819A);
        qv1 qv1Var = this.f8823x;
        el2 el2Var = this.f8825z;
        if (qv1Var == qv1.f9205h) {
            if (el2Var == null) {
                t11.m5067S("scrollAxisRange");
                throw null;
            }
            yn2 yn2Var2 = vn2.f12080w;
            v41 v41Var2 = v41VarArr2[13];
            zn2Var.mo1533a(yn2Var2, el2Var);
        } else {
            if (el2Var == null) {
                t11.m5067S("scrollAxisRange");
                throw null;
            }
            yn2 yn2Var3 = vn2.f12079v;
            v41 v41Var3 = v41VarArr2[12];
            zn2Var.mo1533a(yn2Var3, el2Var);
        }
        n81 n81Var = this.f8820B;
        if (n81Var != null) {
            zn2Var.mo1533a(kn2.f5664f, new C0603q3(null, n81Var));
        }
        zn2Var.mo1533a(kn2.f5658C, new C0603q3(null, new C0798v5(19, new o81(this, 2))));
        l81 l81Var = this.f8822w;
        l81Var.getClass();
        C0974zt c0974zt = new C0974zt(((Number) l81Var.f5984a.getValue()).intValue(), 1);
        yn2 yn2Var4 = vn2.f12063f;
        v41 v41Var4 = v41VarArr2[24];
        zn2Var.mo1533a(yn2Var4, c0974zt);
    }
}
