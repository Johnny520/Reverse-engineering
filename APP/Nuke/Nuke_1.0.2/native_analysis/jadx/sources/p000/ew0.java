package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2657l;

    /* JADX INFO: renamed from: m */
    public int f2658m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ in0 f2659n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew0(in0 in0Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f2657l = i;
        this.f2659n = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2657l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ew0) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f2657l;
        in0 in0Var = this.f2659n;
        switch (i) {
            case 0:
                return new ew0(in0Var, t00Var, 0);
            default:
                return new ew0(in0Var, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f2657l;
        in0 in0Var = this.f2659n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f2658m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    this.f2658m = 1;
                    Object objMo5j = in0Var.mo5j(this);
                    return objMo5j == k20Var ? k20Var : objMo5j;
                }
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f2658m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    this.f2658m = 1;
                    if (in0Var.mo5j(this) == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
        }
    }
}
