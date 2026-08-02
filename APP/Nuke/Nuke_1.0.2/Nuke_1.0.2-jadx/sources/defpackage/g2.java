package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ bk1 n;
    public final /* synthetic */ z22 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(z22 z22Var, bk1 bk1Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 0;
        this.o = z22Var;
        this.n = bk1Var;
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
        return ((g2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        z22 z22Var = this.o;
        bk1 bk1Var = this.n;
        switch (i) {
            case 0:
                return new g2(z22Var, bk1Var, t00Var);
            case 1:
                return new g2(bk1Var, z22Var, t00Var, 1);
            default:
                return new g2(bk1Var, z22Var, t00Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        z22 z22Var = this.o;
        bk1 bk1Var = this.n;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    a32 a32Var = new a32(z22Var);
                    this.m = 1;
                    if (bk1Var.a(a32Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            case 1:
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    this.m = 1;
                    if (bk1Var.a(z22Var, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                int i4 = this.m;
                if (i4 == 0) {
                    fg1.T(obj);
                    this.m = 1;
                    if (bk1Var.a(z22Var, this) == k20Var) {
                    }
                } else if (i4 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(bk1 bk1Var, z22 z22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = bk1Var;
        this.o = z22Var;
    }
}
