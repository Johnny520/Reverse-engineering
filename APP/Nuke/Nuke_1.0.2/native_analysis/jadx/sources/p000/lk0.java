package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6161l;

    /* JADX INFO: renamed from: m */
    public int f6162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.f6161l = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6161l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((lk0) mo13p((t00) obj2, Integer.valueOf(((Number) obj).intValue()))).mo7r(a83Var);
            case 1:
                return ((lk0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((lk0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = 2;
        switch (this.f6161l) {
            case 0:
                lk0 lk0Var = new lk0(i, t00Var, 0);
                lk0Var.f6162m = ((Number) obj).intValue();
                return lk0Var;
            case 1:
                return new lk0(i, t00Var, 1);
            default:
                return new lk0(i, t00Var, i);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f6161l;
        a83 a83Var = a83.f116a;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f6162m;
                fg1.m1627T(obj);
                return Boolean.valueOf(i2 > 0);
            case 1:
                int i3 = this.f6162m;
                if (i3 != 0) {
                    if (i3 == 1) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                sq1 sq1Var = sq1.f10305a;
                C0291hv c0291hv = sq1.f10320p;
                if (c0291hv == null) {
                    t11.m5067S("messageDispatchReady");
                    throw null;
                }
                C0356jn c0356jn = sq1.f10319o;
                if (c0356jn != null) {
                    this.f6162m = 1;
                    return sq1.m4974a(c0291hv, c0356jn, this) == k20Var ? k20Var : a83Var;
                }
                t11.m5067S("messageQueue");
                throw null;
            default:
                int i4 = this.f6162m;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    sq1 sq1Var2 = sq1.f10305a;
                    this.f6162m = 1;
                    return sq1Var2.m4982h(this) == k20Var ? k20Var : a83Var;
                }
                if (i4 == 1) {
                    fg1.m1627T(obj);
                    return a83Var;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
