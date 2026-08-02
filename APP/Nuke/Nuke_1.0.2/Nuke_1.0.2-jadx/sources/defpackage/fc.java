package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fc extends tw2 implements mn0 {
    public int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ic n;
    public final /* synthetic */ long o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(boolean z, ic icVar, long j, t00 t00Var) {
        super(2, t00Var);
        this.m = z;
        this.n = icVar;
        this.o = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((fc) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new fc(this.m, this.n, this.o, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        if (i == 0) {
            fg1.T(obj);
            tm1 tm1Var = this.n.h;
            k20 k20Var = k20.h;
            if (this.m) {
                this.l = 2;
                Object objA = tm1Var.a(this.o, 0L, this);
                if (objA != k20Var) {
                    obj = objA;
                    ((da3) obj).getClass();
                }
            } else {
                this.l = 1;
                Object objA2 = tm1Var.a(0L, this.o, this);
                if (objA2 != k20Var) {
                    obj = objA2;
                    ((da3) obj).getClass();
                }
            }
            return k20Var;
        }
        if (i == 1) {
            fg1.T(obj);
            ((da3) obj).getClass();
        } else {
            if (i != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            ((da3) obj).getClass();
        }
        return a83.a;
    }
}
