package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4766l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xk1 f4767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir1(xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f4766l = i;
        this.f4767m = xk1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4766l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((ir1) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 1:
                ((ir1) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            default:
                ((ir1) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f4766l) {
            case 0:
                return new ir1(this.f4767m, t00Var, 0);
            case 1:
                return new ir1(this.f4767m, t00Var, 1);
            default:
                return new ir1(this.f4767m, t00Var, 2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f4766l;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f4767m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                fg1.m1627T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
            default:
                fg1.m1627T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
        }
        return a83Var;
    }
}
