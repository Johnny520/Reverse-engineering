package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qz2 extends tw2 implements nn0 {

    /* JADX INFO: renamed from: l */
    public int f9296l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ x22 f9297m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ long f9298n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ j20 f9299o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ xk1 f9300p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(j20 j20Var, xk1 xk1Var, t00 t00Var) {
        super(3, t00Var);
        this.f9299o = j20Var;
        this.f9300p = xk1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        long j = ((rs1) obj2).f9744a;
        qz2 qz2Var = new qz2(this.f9299o, this.f9300p, (t00) obj3);
        qz2Var.f9297m = (x22) obj;
        qz2Var.f9298n = j;
        return qz2Var.mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f9296l;
        xk1 xk1Var = this.f9300p;
        j20 j20Var = this.f9299o;
        if (i == 0) {
            fg1.m1627T(obj);
            x22 x22Var = this.f9297m;
            AbstractC0570p7.m3745A(j20Var, null, new xl2(xk1Var, this.f9298n, null), 3);
            this.f9296l = 1;
            obj = x22Var.m6028f(this);
            k20 k20Var = k20.f5323h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        AbstractC0570p7.m3745A(j20Var, null, new up1(xk1Var, ((Boolean) obj).booleanValue(), (t00) null), 3);
        return a83.f116a;
    }
}
