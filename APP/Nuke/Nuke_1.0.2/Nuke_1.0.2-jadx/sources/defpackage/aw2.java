package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 extends u60 implements r12, pk0, il0 {
    public xm0 x;
    public boolean y;
    public final zw2 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aw2(xm0 xm0Var) {
        this.x = xm0Var;
        r8 r8Var = new r8(2, this);
        h12 h12Var = vw2.a;
        zw2 zw2Var = new zw2(null, null, r8Var);
        M0(zw2Var);
        this.z = zw2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void J(h12 h12Var, i12 i12Var, long j) {
        this.z.J(h12Var, i12Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pk0
    public final void Z(kl0 kl0Var) {
        this.y = kl0Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        this.z.m0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final long s() {
        db0 db0Var = qp0.q;
        e70 e70Var = sp0.c0(this).F;
        db0Var.getClass();
        int i = x23.b;
        return jx2.e(e70Var.T(10.0f), e70Var.T(40.0f), e70Var.T(10.0f), e70Var.T(40.0f));
    }
}
