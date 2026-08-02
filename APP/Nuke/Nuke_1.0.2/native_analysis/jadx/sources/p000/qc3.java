package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public xk1 f8893l;

    /* JADX INFO: renamed from: m */
    public int f8894m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ xk1 f8895n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f8896o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc3(xk1 xk1Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.f8895n = xk1Var;
        this.f8896o = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((qc3) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new qc3(this.f8895n, this.f8896o, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        xk1 xk1Var;
        int i = this.f8894m;
        if (i == 0) {
            fg1.m1627T(obj);
            mc3 mc3Var = mc3.f6566a;
            xk1 xk1Var2 = this.f8895n;
            xk1Var2.setValue(mc3Var);
            c60 c60Var = o90.f7590a;
            t50 t50Var = t50.f10560j;
            pc3 pc3Var = new pc3(this.f8896o, null);
            this.f8893l = xk1Var2;
            this.f8894m = 1;
            obj = AbstractC0570p7.m3762R(t50Var, pc3Var, this);
            k20 k20Var = k20.f5323h;
            if (obj == k20Var) {
                return k20Var;
            }
            xk1Var = xk1Var2;
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xk1Var = this.f8893l;
            fg1.m1627T(obj);
        }
        xk1Var.setValue((nc3) obj);
        return a83.f116a;
    }
}
