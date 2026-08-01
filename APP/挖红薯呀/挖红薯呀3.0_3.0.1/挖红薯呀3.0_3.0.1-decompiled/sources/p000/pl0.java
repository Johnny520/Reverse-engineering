package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final pl0 f4924c = new pl0(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        int i;
        b30 b30Var = (b30) rm0Var.m3517b(0);
        int iM5390c = z11Var.m5390c((C0788u2) rm0Var.m3517b(1));
        if (z11Var.f7770t >= iM5390c) {
            AbstractC0653qi.m3252a("Check failed");
        }
        z60.m5424K(z11Var, interfaceC0643q8, iM5390c);
        int i2 = z11Var.f7770t;
        int iM5371E = z11Var.f7772v;
        while (iM5371E >= 0 && !z11Var.m5411y(iM5371E)) {
            iM5371E = z11Var.m5371E(z11Var.f7752b, iM5371E);
        }
        int iM5407u = iM5371E + 1;
        int iM5378L = 0;
        while (iM5407u < i2) {
            if (z11Var.m5408v(i2, iM5407u)) {
                if (z11Var.m5411y(iM5407u)) {
                    iM5378L = 0;
                }
                iM5407u++;
            } else {
                iM5378L += z11Var.m5411y(iM5407u) ? 1 : z11Var.f7752b[(z11Var.m5404r(iM5407u) * 5) + 1] & 67108863;
                iM5407u += z11Var.m5407u(iM5407u);
            }
        }
        while (true) {
            i = z11Var.f7770t;
            if (i >= iM5390c) {
                break;
            }
            if (z11Var.m5408v(iM5390c, i)) {
                int i3 = z11Var.f7770t;
                if (i3 < z11Var.f7771u && (z11Var.f7752b[(z11Var.m5404r(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0643q8.mo1682b(z11Var.m5370D(z11Var.f7770t));
                    iM5378L = 0;
                }
                z11Var.m5382P();
            } else {
                iM5378L += z11Var.m5378L();
            }
        }
        if (i != iM5390c) {
            AbstractC0653qi.m3252a("Check failed");
        }
        b30Var.f365a = iM5378L;
    }
}
