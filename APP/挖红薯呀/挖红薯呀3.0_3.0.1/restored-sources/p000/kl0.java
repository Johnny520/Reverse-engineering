package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final kl0 f3216c = new kl0(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        C0788u2 c0788u2 = (C0788u2) rm0Var.m3517b(0);
        Object objM3517b = rm0Var.m3517b(1);
        if (objM3517b instanceof ku0) {
            ku0 ku0Var = (ku0) objM3517b;
            iu0Var.f2622e.m4072b(ku0Var);
            iu0Var.f2621d.m1890a(ku0Var);
        }
        if (z11Var.f7764n != 0) {
            AbstractC0653qi.m3252a("Can only append a slot if not current inserting");
        }
        int i = z11Var.f7759i;
        int i2 = z11Var.f7760j;
        int iM5390c = z11Var.m5390c(c0788u2);
        int iM5394g = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(iM5390c + 1));
        z11Var.f7759i = iM5394g;
        z11Var.f7760j = iM5394g;
        z11Var.m5410x(1, iM5390c);
        if (i >= iM5394g) {
            i++;
            i2++;
        }
        z11Var.f7753c[iM5394g] = objM3517b;
        z11Var.f7759i = i;
        z11Var.f7760j = i2;
    }
}
