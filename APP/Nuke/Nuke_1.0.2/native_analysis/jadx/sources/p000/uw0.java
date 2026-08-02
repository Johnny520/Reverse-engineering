package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends ww0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f11516d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0930yo f11517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw0(v82 v82Var, et1 et1Var, x00 x00Var, InterfaceC0930yo interfaceC0930yo, int i) {
        super(v82Var, et1Var, x00Var);
        this.f11516d = i;
        this.f11517e = interfaceC0930yo;
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: a */
    public final Object mo5587a(ct1 ct1Var, Object[] objArr) {
        int i = this.f11516d;
        InterfaceC0930yo interfaceC0930yo = this.f11517e;
        switch (i) {
            case 0:
                return interfaceC0930yo.mo2578i(ct1Var);
            default:
                InterfaceC0854wo interfaceC0854wo = (InterfaceC0854wo) interfaceC0930yo.mo2578i(ct1Var);
                t00 t00Var = (t00) objArr[objArr.length - 1];
                try {
                    C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
                    c0469mp.m3151u();
                    c0469mp.m3153w(new r51(interfaceC0854wo, 2));
                    interfaceC0854wo.mo93b(new lw0(c0469mp, 3));
                    return c0469mp.m3150t();
                } catch (Exception e) {
                    tp0.m5352P(e, t00Var);
                    return k20.f5323h;
                }
        }
    }
}
