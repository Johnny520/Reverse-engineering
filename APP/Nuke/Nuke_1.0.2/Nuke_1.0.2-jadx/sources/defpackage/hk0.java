package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hk0 extends tw2 implements nn0 {
    public ak0 l;
    public int m;
    public /* synthetic */ ak0 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ mn0 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(mn0 mn0Var, t00 t00Var) {
        super(3, t00Var);
        this.p = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        hk0 hk0Var = new hk0(this.p, (t00) obj3);
        hk0Var.n = (ak0) obj;
        hk0Var.o = obj2;
        return hk0Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.m(r8, r7) == r6) goto L15;
     */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        ak0 ak0Var = this.n;
        Object obj2 = this.o;
        int i = this.m;
        k20 k20Var = k20.h;
        if (i == 0) {
            fg1.T(obj);
            this.n = null;
            this.o = null;
            this.l = ak0Var;
            this.m = 1;
            obj = this.p.g(obj2, this);
            if (obj != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i == 2) {
                fg1.T(obj);
                return a83.a;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ak0Var = this.l;
        fg1.T(obj);
        this.n = null;
        this.o = null;
        this.l = null;
        this.m = 2;
    }
}
