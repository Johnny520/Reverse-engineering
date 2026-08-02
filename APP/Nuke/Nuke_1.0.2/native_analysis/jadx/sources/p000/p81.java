package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p81 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f8031l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ q81 f8032m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f8033n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(q81 q81Var, int i, t00 t00Var) {
        super(2, t00Var);
        this.f8032m = q81Var;
        this.f8033n = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((p81) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new p81(this.f8032m, this.f8033n, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        int i = this.f8031l;
        a83 a83Var = a83.f116a;
        if (i != 0) {
            if (i == 1) {
                fg1.m1627T(obj);
                return a83Var;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(obj);
        l81 l81Var = this.f8032m.f8822w;
        this.f8031l = 1;
        d91 d91Var = l81Var.f5985b;
        dq1 dq1Var = d91.f1915x;
        d91Var.getClass();
        Object objMo570d = d91Var.mo570d(bl1.f932h, new h50(d91Var, this.f8033n, (t00) null), this);
        k20 k20Var = k20.f5323h;
        if (objMo570d != k20Var) {
            objMo570d = a83Var;
        }
        if (objMo570d != k20Var) {
            objMo570d = a83Var;
        }
        return objMo570d == k20Var ? k20Var : a83Var;
    }
}
