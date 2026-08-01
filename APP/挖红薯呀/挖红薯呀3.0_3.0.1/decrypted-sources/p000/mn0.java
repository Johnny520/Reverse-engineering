package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mn0 extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public jn0 f4009r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        float fMo224a = this.f4009r.mo224a(zd0Var.getLayoutDirection());
        float fMo227d = this.f4009r.mo227d();
        float fMo225b = this.f4009r.mo225b(zd0Var.getLayoutDirection());
        float fMo226c = this.f4009r.mo226c();
        if (!((C0520np.m2731a(fMo224a, 0.0f) >= 0) & (C0520np.m2731a(fMo227d, 0.0f) >= 0) & (C0520np.m2731a(fMo225b, 0.0f) >= 0) & (C0520np.m2731a(fMo226c, 0.0f) >= 0))) {
            u10.m4244a("Padding must be non-negative");
        }
        int iMo641F = zd0Var.mo641F(fMo224a);
        int iMo641F2 = zd0Var.mo641F(fMo225b) + iMo641F;
        int iMo641F3 = zd0Var.mo641F(fMo227d);
        int iMo641F4 = zd0Var.mo641F(fMo226c) + iMo641F3;
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3261h(j, -iMo641F2, -iMo641F4));
        return zd0Var.mo1279Q(AbstractC0654qj.m3259f(xq0VarMo184e.f7400d + iMo641F2, j), AbstractC0654qj.m3258e(xq0VarMo184e.f7401e + iMo641F4, j), C0330is.f2614d, new o20(xq0VarMo184e, iMo641F, iMo641F3, 2));
    }
}
