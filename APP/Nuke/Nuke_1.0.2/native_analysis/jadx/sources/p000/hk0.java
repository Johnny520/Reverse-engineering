package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hk0 extends tw2 implements nn0 {

    /* JADX INFO: renamed from: l */
    public ak0 f4055l;

    /* JADX INFO: renamed from: m */
    public int f4056m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ ak0 f4057n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f4058o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ mn0 f4059p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(mn0 mn0Var, t00 t00Var) {
        super(3, t00Var);
        this.f4059p = mn0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        hk0 hk0Var = new hk0(this.f4059p, (t00) obj3);
        hk0Var.f4057n = (ak0) obj;
        hk0Var.f4058o = obj2;
        return hk0Var.mo7r(a83.f116a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.mo181m(r8, r7) == r6) goto L15;
     */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        ak0 ak0Var = this.f4057n;
        Object obj2 = this.f4058o;
        int i = this.f4056m;
        k20 k20Var = k20.f5323h;
        if (i == 0) {
            fg1.m1627T(obj);
            this.f4057n = null;
            this.f4058o = null;
            this.f4055l = ak0Var;
            this.f4056m = 1;
            obj = this.f4059p.mo12g(obj2, this);
            if (obj != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i == 2) {
                fg1.m1627T(obj);
                return a83.f116a;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ak0Var = this.f4055l;
        fg1.m1627T(obj);
        this.f4057n = null;
        this.f4058o = null;
        this.f4055l = null;
        this.f4056m = 2;
    }
}
