package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final iu1 f4787c = new iu1(0, 2, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int i;
        e11 e11Var = (e11) bo0Var.m579d(0);
        int iM5412c = tr2Var.m5412c((ao0) bo0Var.m579d(1));
        if (tr2Var.f10932t >= iM5412c) {
            AbstractC0752tx.m5443a("Check failed");
        }
        xe1.m6122g0(tr2Var, interfaceC0654rf, iM5412c);
        int i2 = tr2Var.f10932t;
        int iM5393E = tr2Var.f10934v;
        while (iM5393E >= 0 && !tr2Var.m5433y(iM5393E)) {
            iM5393E = tr2Var.m5393E(tr2Var.f10914b, iM5393E);
        }
        int iM5429u = iM5393E + 1;
        int iM5400L = 0;
        while (iM5429u < i2) {
            if (tr2Var.m5430v(i2, iM5429u)) {
                if (tr2Var.m5433y(iM5429u)) {
                    iM5400L = 0;
                }
                iM5429u++;
            } else {
                iM5400L += tr2Var.m5433y(iM5429u) ? 1 : tr2Var.f10914b[(tr2Var.m5426r(iM5429u) * 5) + 1] & 67108863;
                iM5429u += tr2Var.m5429u(iM5429u);
            }
        }
        while (true) {
            i = tr2Var.f10932t;
            if (i >= iM5412c) {
                break;
            }
            if (tr2Var.m5430v(iM5412c, i)) {
                int i3 = tr2Var.f10932t;
                if (i3 < tr2Var.f10933u && (tr2Var.f10914b[(tr2Var.m5426r(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0654rf.mo2457b(tr2Var.m5392D(tr2Var.f10932t));
                    iM5400L = 0;
                }
                tr2Var.m5404P();
            } else {
                iM5400L += tr2Var.m5400L();
            }
        }
        if (i != iM5412c) {
            AbstractC0752tx.m5443a("Check failed");
        }
        e11Var.f2293a = iM5400L;
    }
}
