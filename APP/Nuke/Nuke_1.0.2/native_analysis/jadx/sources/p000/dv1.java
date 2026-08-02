package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final dv1 f2236c = new dv1(1, 0, 2);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int iM578c = bo0Var.m578c(0);
        int i = tr2Var.f10934v;
        int iM5402N = tr2Var.m5402N(tr2Var.f10914b, tr2Var.m5426r(i));
        int iM5416g = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(i + 1));
        for (int iMax = Math.max(iM5402N, iM5416g - iM578c); iMax < iM5416g; iMax++) {
            Object obj = tr2Var.f10915c[tr2Var.m5417h(iMax)];
            if (obj instanceof lo0) {
                z72Var.m6394e((lo0) obj);
            } else if (obj instanceof b62) {
                ((b62) obj).m443c();
            }
        }
        if (iM578c <= 0) {
            AbstractC0752tx.m5443a("Check failed");
        }
        int i2 = tr2Var.f10934v;
        int iM5402N2 = tr2Var.m5402N(tr2Var.f10914b, tr2Var.m5426r(i2));
        int iM5416g2 = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(i2 + 1)) - iM578c;
        if (iM5416g2 < iM5402N2) {
            AbstractC0752tx.m5443a("Check failed");
        }
        tr2Var.m5398J(iM5416g2, iM578c, i2);
        int i3 = tr2Var.f10921i;
        if (i3 >= iM5402N2) {
            tr2Var.f10921i = i3 - iM578c;
        }
    }
}
