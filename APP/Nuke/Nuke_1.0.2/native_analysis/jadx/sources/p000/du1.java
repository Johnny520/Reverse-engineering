package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final du1 f2228c = new du1(0, 2, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        ao0 ao0Var = (ao0) bo0Var.m579d(0);
        Object objM579d = bo0Var.m579d(1);
        if (objM579d instanceof lo0) {
            lo0 lo0Var = (lo0) objM579d;
            z72Var.f13772e.m6423b(lo0Var);
            z72Var.f13771d.m4882a(lo0Var);
        }
        if (tr2Var.f10926n != 0) {
            AbstractC0752tx.m5443a("Can only append a slot if not current inserting");
        }
        int i = tr2Var.f10921i;
        int i2 = tr2Var.f10922j;
        int iM5412c = tr2Var.m5412c(ao0Var);
        int iM5416g = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(iM5412c + 1));
        tr2Var.f10921i = iM5416g;
        tr2Var.f10922j = iM5416g;
        tr2Var.m5432x(1, iM5412c);
        if (i >= iM5416g) {
            i++;
            i2++;
        }
        tr2Var.f10915c[iM5416g] = objM579d;
        tr2Var.f10921i = i;
        tr2Var.f10922j = i2;
    }
}
