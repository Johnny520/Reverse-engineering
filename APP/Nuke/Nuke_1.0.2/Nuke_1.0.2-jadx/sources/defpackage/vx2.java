package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vx2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ x22 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx2(x22 x22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = x22Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((vx2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        x22 x22Var = this.n;
        switch (i) {
            case 0:
                return new vx2(x22Var, t00Var, 0);
            default:
                return new vx2(x22Var, t00Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        x22 x22Var = this.n;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    this.m = 1;
                    if (x22Var.e(this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    this.m = 1;
                    if (x22Var.e(this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
        }
        return k20Var;
    }
}
