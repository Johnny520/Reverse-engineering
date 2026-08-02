package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vx2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f12209l;

    /* JADX INFO: renamed from: m */
    public int f12210m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ x22 f12211n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx2(x22 x22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f12209l = i;
        this.f12211n = x22Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f12209l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((vx2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f12209l;
        x22 x22Var = this.f12211n;
        switch (i) {
            case 0:
                return new vx2(x22Var, t00Var, 0);
            default:
                return new vx2(x22Var, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f12209l;
        a83 a83Var = a83.f116a;
        x22 x22Var = this.f12211n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f12210m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    this.f12210m = 1;
                    if (x22Var.m6027e(this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i3 = this.f12210m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    this.f12210m = 1;
                    if (x22Var.m6027e(this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }
}
