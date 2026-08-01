package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p20 extends k20 implements r50 {

    /* JADX INFO: renamed from: t */
    public fd1 f4696t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        int iMo678d = this.f2996s.mo678d(zd0Var, zd0Var.getLayoutDirection()) - this.f2995r.mo678d(zd0Var, zd0Var.getLayoutDirection());
        int iMo676b = this.f2996s.mo676b(zd0Var) - this.f2995r.mo676b(zd0Var);
        int iMo677c = (this.f2996s.mo677c(zd0Var, zd0Var.getLayoutDirection()) - this.f2995r.mo677c(zd0Var, zd0Var.getLayoutDirection())) + iMo678d;
        int iMo675a = (this.f2996s.mo675a(zd0Var) - this.f2995r.mo675a(zd0Var)) + iMo676b;
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3261h(j, -iMo677c, -iMo675a));
        return zd0Var.mo1279Q(AbstractC0654qj.m3259f(xq0VarMo184e.f7400d + iMo677c, j), AbstractC0654qj.m3258e(xq0VarMo184e.f7401e + iMo675a, j), C0330is.f2614d, new o20(xq0VarMo184e, iMo678d, iMo676b, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.k20
    /* JADX INFO: renamed from: w0 */
    public final fd1 mo1761w0(fd1 fd1Var) {
        return new ma1(fd1Var, this.f4696t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.k20
    /* JADX INFO: renamed from: x0 */
    public final void mo1762x0() {
        super.mo1762x0();
        v50.m4407m(this);
    }
}
