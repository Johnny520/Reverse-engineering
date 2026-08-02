package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends v92 {

    /* JADX INFO: renamed from: i */
    public int f11053i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ mn0 f11054j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t00 f11055k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(t00 t00Var, t00 t00Var2, mn0 mn0Var) {
        super(t00Var);
        this.f11054j = mn0Var;
        this.f11055k = t00Var2;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f11053i;
        if (i != 0) {
            if (i != 1) {
                C0676s.m4653l("This coroutine had already completed");
                return null;
            }
            this.f11053i = 2;
            fg1.m1627T(obj);
            return obj;
        }
        this.f11053i = 1;
        fg1.m1627T(obj);
        mn0 mn0Var = this.f11054j;
        mn0Var.getClass();
        xe1.m6119f(2, mn0Var);
        return mn0Var.mo12g(this.f11055k, this);
    }
}
