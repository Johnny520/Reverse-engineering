package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eu2 extends tw2 implements nn0 {
    public int l;
    public /* synthetic */ ak0 m;
    public /* synthetic */ int n;
    public final /* synthetic */ fu2 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu2(fu2 fu2Var, t00 t00Var) {
        super(3, t00Var);
        this.o = fu2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        eu2 eu2Var = new eu2(this.o, (t00) obj3);
        eu2Var.m = (ak0) obj;
        eu2Var.n = iIntValue;
        return eu2Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.m(defpackage.nq2.h, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.m(defpackage.nq2.j, r10) != r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        ak0 ak0Var = this.m;
        int i = this.n;
        int i2 = this.l;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            if (i > 0) {
                this.m = null;
                this.n = i;
                this.l = 1;
            } else {
                this.m = ak0Var;
                this.n = i;
                this.l = 2;
                if (eu.F(0L, this) != k20Var) {
                    this.m = ak0Var;
                    this.n = i;
                    this.l = 3;
                    if (ak0Var.m(nq2.i, this) != k20Var) {
                    }
                }
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(obj);
                this.m = ak0Var;
                this.n = i;
                this.l = 3;
                if (ak0Var.m(nq2.i, this) != k20Var) {
                    this.m = ak0Var;
                    this.n = i;
                    this.l = 4;
                    if (eu.F(Long.MAX_VALUE, this) != k20Var) {
                    }
                }
                return k20Var;
            }
            if (i2 == 3) {
                fg1.T(obj);
                this.m = ak0Var;
                this.n = i;
                this.l = 4;
                if (eu.F(Long.MAX_VALUE, this) != k20Var) {
                    this.m = null;
                    this.n = i;
                    this.l = 5;
                }
                return k20Var;
            }
            if (i2 == 4) {
                fg1.T(obj);
                this.m = null;
                this.n = i;
                this.l = 5;
            } else if (i2 != 5) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        fg1.T(obj);
        return a83.a;
    }
}
