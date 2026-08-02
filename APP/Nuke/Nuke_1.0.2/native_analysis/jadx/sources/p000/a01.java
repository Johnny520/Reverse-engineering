package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a01 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ f01 f9i;

    public /* synthetic */ a01(f01 f01Var, int i) {
        this.f8h = i;
        this.f9i = f01Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f8h;
        f01 f01Var = this.f9i;
        d43 d43Var = (d43) obj;
        switch (i) {
            case 0:
                d43Var.getClass();
                f01 f01Var2 = (f01) d43Var;
                vd3 vd3Var = f01Var.f2709w;
                if (!t11.m5086l(f01Var2.f2708v, vd3Var)) {
                    f01Var2.f2708v = vd3Var;
                    f01Var2.m1487M0();
                }
                return c43.f1147i;
            default:
                d43Var.getClass();
                f01Var.f2708v = ((f01) d43Var).f2709w;
                return Boolean.FALSE;
        }
    }
}
