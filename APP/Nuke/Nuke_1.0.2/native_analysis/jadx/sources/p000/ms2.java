package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6811l;

    /* JADX INFO: renamed from: m */
    public int f6812m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f6813n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ mn0 f6814o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ xk1 f6815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms2(mn0 mn0Var, xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f6811l = i;
        this.f6814o = mn0Var;
        this.f6815p = xk1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6811l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ms2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f6811l) {
            case 0:
                ms2 ms2Var = new ms2(this.f6814o, this.f6815p, t00Var, 0);
                ms2Var.f6813n = obj;
                return ms2Var;
            default:
                ms2 ms2Var2 = new ms2(this.f6814o, this.f6815p, t00Var, 1);
                ms2Var2.f6813n = obj;
                return ms2Var2;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f6811l;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f6815p;
        mn0 mn0Var = this.f6814o;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f6812m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    n32 n32Var = new n32(xk1Var, ((j20) this.f6813n).mo705g());
                    this.f6812m = 1;
                    if (mn0Var.mo12g(n32Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i3 = this.f6812m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    n32 n32Var2 = new n32(xk1Var, ((j20) this.f6813n).mo705g());
                    this.f6812m = 1;
                    if (mn0Var.mo12g(n32Var2, this) == k20Var) {
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
