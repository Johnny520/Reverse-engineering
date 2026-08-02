package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aw2 extends u60 implements r12, pk0, il0 {

    /* JADX INFO: renamed from: x */
    public xm0 f421x;

    /* JADX INFO: renamed from: y */
    public boolean f422y;

    /* JADX INFO: renamed from: z */
    public final zw2 f423z;

    public aw2(xm0 xm0Var) {
        this.f421x = xm0Var;
        C0647r8 c0647r8 = new C0647r8(2, this);
        h12 h12Var = vw2.f12207a;
        zw2 zw2Var = new zw2(null, null, c0647r8);
        m5468M0(zw2Var);
        this.f423z = zw2Var;
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
        this.f423z.mo215J(h12Var, i12Var, j);
    }

    @Override // p000.pk0
    /* JADX INFO: renamed from: Z */
    public final void mo299Z(kl0 kl0Var) {
        this.f422y = kl0Var.m2718a();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        this.f423z.mo233m0();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: s */
    public final long mo300s() {
        db0 db0Var = qp0.f9075q;
        e70 e70Var = sp0.m4933c0(this).f9365F;
        db0Var.getClass();
        int i = x23.f12781b;
        return jx2.m2595e(e70Var.mo692T(10.0f), e70Var.mo692T(40.0f), e70Var.mo692T(10.0f), e70Var.mo692T(40.0f));
    }
}
