package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 extends u00 {

    /* JADX INFO: renamed from: k */
    public int f11598k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ mn0 f11599l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ t00 f11600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(t00 t00Var, a20 a20Var, mn0 mn0Var, t00 t00Var2) {
        super(t00Var, a20Var);
        this.f11599l = mn0Var;
        this.f11600m = t00Var2;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f11598k;
        if (i != 0) {
            if (i != 1) {
                C0676s.m4653l("This coroutine had already completed");
                return null;
            }
            this.f11598k = 2;
            fg1.m1627T(obj);
            return obj;
        }
        this.f11598k = 1;
        fg1.m1627T(obj);
        mn0 mn0Var = this.f11599l;
        mn0Var.getClass();
        xe1.m6119f(2, mn0Var);
        return mn0Var.mo12g(this.f11600m, this);
    }
}
