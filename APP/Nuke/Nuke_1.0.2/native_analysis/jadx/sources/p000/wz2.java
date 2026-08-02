package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f12741l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ b03 f12742m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz2(b03 b03Var, t00 t00Var, int i) {
        super(1, t00Var);
        this.f12741l = i;
        this.f12742m = b03Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12741l;
        a83 a83Var = a83.f116a;
        b03 b03Var = this.f12742m;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                new wz2(b03Var, t00Var, 0).mo7r(a83Var);
                break;
            case 1:
                new wz2(b03Var, t00Var, 1).mo7r(a83Var);
                break;
            case 2:
                new wz2(b03Var, t00Var, 2).mo7r(a83Var);
                break;
            default:
                new wz2(b03Var, t00Var, 3).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f12741l;
        a83 a83Var = a83.f116a;
        b03 b03Var = this.f12742m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                b03Var.f479B = false;
                break;
            case 1:
                fg1.m1627T(obj);
                b03Var.m342f();
                break;
            case 2:
                fg1.m1627T(obj);
                b03Var.m341d(b03Var.f479B);
                break;
            default:
                fg1.m1627T(obj);
                b03Var.m352p();
                break;
        }
        return a83Var;
    }
}
