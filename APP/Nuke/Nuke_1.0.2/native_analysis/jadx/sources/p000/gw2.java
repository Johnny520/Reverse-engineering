package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gw2 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3724i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ hw2 f3725j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw2(hw2 hw2Var, int i) {
        super(2);
        this.f3724i = i;
        this.f3725j = hw2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3724i;
        a83 a83Var = a83.f116a;
        hw2 hw2Var = this.f3725j;
        switch (i) {
            case 0:
                hw2Var.m2233a().f2827i = (AbstractC0941yx) obj2;
                break;
            case 1:
                f71 f71VarM2233a = hw2Var.m2233a();
                ((r61) obj).m4369c0(new b71(f71VarM2233a, (mn0) obj2, f71VarM2233a.f2841w));
                break;
            default:
                r61 r61Var = (r61) obj;
                sz0 sz0Var = hw2Var.f4161a;
                f71 f71Var = r61Var.f9374O;
                if (f71Var == null) {
                    f71Var = new f71(r61Var, sz0Var);
                    r61Var.f9374O = f71Var;
                }
                hw2Var.f4162b = f71Var;
                hw2Var.m2233a().m1542h();
                f71 f71VarM2233a2 = hw2Var.m2233a();
                if (f71VarM2233a2.f2828j != sz0Var) {
                    f71VarM2233a2.f2828j = sz0Var;
                    f71VarM2233a2.m1543i(false);
                    r61.m4341V(f71VarM2233a2.f2826h, false, 7);
                }
                break;
        }
        return a83Var;
    }
}
