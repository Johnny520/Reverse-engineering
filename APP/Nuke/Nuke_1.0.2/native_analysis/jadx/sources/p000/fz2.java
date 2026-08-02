package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fz2 extends u60 implements InterfaceC0257gy, ry2 {

    /* JADX INFO: renamed from: A */
    public j10 f3200A;

    /* JADX INFO: renamed from: B */
    public zt2 f3201B;

    /* JADX INFO: renamed from: C */
    public final n70 f3202C = op0.m3590m(new C0727ta(28, this));

    /* JADX INFO: renamed from: D */
    public o62 f3203D = o62.f7535e;

    /* JADX INFO: renamed from: x */
    public dq1 f3204x;

    /* JADX INFO: renamed from: y */
    public vz2 f3205y;

    /* JADX INFO: renamed from: z */
    public wz2 f3206z;

    public fz2(dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        this.f3204x = dq1Var;
        this.f3205y = vz2Var;
        this.f3206z = wz2Var;
        this.f3200A = j10Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        dq1 dq1Var = this.f3204x;
        dq1Var.f2148j = w23.f12279j;
        dq1Var.f2147i = this;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        dq1 dq1Var = this.f3204x;
        dq1Var.f2148j = w23.f12278i;
        dq1Var.f2147i = null;
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: h */
    public final long mo1767h(c61 c61Var) {
        return mo1768n(c61Var).m3516d();
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: n */
    public final o62 mo1768n(c61 c61Var) {
        if (!this.f10770u) {
            return this.f3203D;
        }
        o62 o62Var = (o62) this.f3200A.mo5j(c61Var);
        if (o62Var == null) {
            return this.f3203D;
        }
        this.f3203D = o62Var;
        return o62Var;
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: v0 */
    public final qy2 mo1769v0() {
        return (qy2) this.f3202C.getValue();
    }
}
