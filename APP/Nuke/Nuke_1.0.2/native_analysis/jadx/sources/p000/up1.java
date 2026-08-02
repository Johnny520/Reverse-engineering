package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11408l = 1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xk1 f11409m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f11410n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(xk1 xk1Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.f11409m = xk1Var;
        this.f11410n = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11408l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((up1) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            default:
                ((up1) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f11408l) {
            case 0:
                return new up1(this.f11410n, this.f11409m, t00Var);
            default:
                return new up1(this.f11409m, this.f11410n, t00Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f11408l;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f11409m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                xk1Var.setValue(Boolean.valueOf(this.f11410n));
                break;
            default:
                fg1.m1627T(obj);
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(boolean z, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.f11410n = z;
        this.f11409m = xk1Var;
    }
}
