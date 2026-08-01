package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class km0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final km0 f3219c = new km0(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        int iM3516a = rm0Var.m3516a(0);
        int i = z11Var.f7772v;
        int iM5380N = z11Var.m5380N(z11Var.f7752b, z11Var.m5404r(i));
        int iM5394g = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(i + 1));
        for (int iMax = Math.max(iM5380N, iM5394g - iM3516a); iMax < iM5394g; iMax++) {
            Object obj = z11Var.f7753c[z11Var.m5395h(iMax)];
            if (obj instanceof ku0) {
                iu0Var.m1602e((ku0) obj);
            } else if (obj instanceof ht0) {
                ((ht0) obj).m1505c();
            }
        }
        if (iM3516a <= 0) {
            AbstractC0653qi.m3252a("Check failed");
        }
        int i2 = z11Var.f7772v;
        int iM5380N2 = z11Var.m5380N(z11Var.f7752b, z11Var.m5404r(i2));
        int iM5394g2 = z11Var.m5394g(z11Var.f7752b, z11Var.m5404r(i2 + 1)) - iM3516a;
        if (iM5394g2 < iM5380N2) {
            AbstractC0653qi.m3252a("Check failed");
        }
        z11Var.m5376J(iM5394g2, iM3516a, i2);
        int i3 = z11Var.f7759i;
        if (i3 >= iM5380N2) {
            z11Var.f7759i = i3 - iM3516a;
        }
    }
}
