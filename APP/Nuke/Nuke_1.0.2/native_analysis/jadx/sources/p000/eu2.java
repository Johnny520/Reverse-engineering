package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eu2 extends tw2 implements nn0 {

    /* JADX INFO: renamed from: l */
    public int f2645l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ ak0 f2646m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ int f2647n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ fu2 f2648o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu2(fu2 fu2Var, t00 t00Var) {
        super(3, t00Var);
        this.f2648o = fu2Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        eu2 eu2Var = new eu2(this.f2648o, (t00) obj3);
        eu2Var.f2646m = (ak0) obj;
        eu2Var.f2647n = iIntValue;
        return eu2Var.mo7r(a83.f116a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.mo181m(p000.nq2.f7284h, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.mo181m(p000.nq2.f7286j, r10) != r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        ak0 ak0Var = this.f2646m;
        int i = this.f2647n;
        int i2 = this.f2645l;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            if (i > 0) {
                this.f2646m = null;
                this.f2647n = i;
                this.f2645l = 1;
            } else {
                this.f2646m = ak0Var;
                this.f2647n = i;
                this.f2645l = 2;
                if (AbstractC0179eu.m1425F(0L, this) != k20Var) {
                    this.f2646m = ak0Var;
                    this.f2647n = i;
                    this.f2645l = 3;
                    if (ak0Var.mo181m(nq2.f7285i, this) != k20Var) {
                    }
                }
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(obj);
                this.f2646m = ak0Var;
                this.f2647n = i;
                this.f2645l = 3;
                if (ak0Var.mo181m(nq2.f7285i, this) != k20Var) {
                    this.f2646m = ak0Var;
                    this.f2647n = i;
                    this.f2645l = 4;
                    if (AbstractC0179eu.m1425F(Long.MAX_VALUE, this) != k20Var) {
                    }
                }
                return k20Var;
            }
            if (i2 == 3) {
                fg1.m1627T(obj);
                this.f2646m = ak0Var;
                this.f2647n = i;
                this.f2645l = 4;
                if (AbstractC0179eu.m1425F(Long.MAX_VALUE, this) != k20Var) {
                    this.f2646m = null;
                    this.f2647n = i;
                    this.f2645l = 5;
                }
                return k20Var;
            }
            if (i2 == 4) {
                fg1.m1627T(obj);
                this.f2646m = null;
                this.f2647n = i;
                this.f2645l = 5;
            } else if (i2 != 5) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        fg1.m1627T(obj);
        return a83.f116a;
    }
}
