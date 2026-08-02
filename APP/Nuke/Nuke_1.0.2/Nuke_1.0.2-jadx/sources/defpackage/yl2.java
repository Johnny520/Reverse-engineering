package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ am2 n;
    public /* synthetic */ long o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl2(am2 am2Var, long j, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = am2Var;
        this.o = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((yl2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((yl2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 2:
                return ((yl2) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                long j = ((rs1) obj).a;
                yl2 yl2Var = new yl2(this.n, (t00) obj2);
                yl2Var.o = j;
                return yl2Var.r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new yl2(this.n, this.o, t00Var, 0);
            case 1:
                return new yl2(this.n, this.o, t00Var, 1);
            case 2:
                return new yl2(this.n, this.o, t00Var, 2);
            default:
                yl2 yl2Var = new yl2(this.n, t00Var);
                yl2Var.o = ((rs1) obj).a;
                return yl2Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        am2 am2Var = this.n;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    im2 im2Var = am2Var.U;
                    xl2 xl2Var = new xl2(this.o, null);
                    this.m = 1;
                    if (im2Var.f(bl1.i, xl2Var, this) == k20Var) {
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
                    im2 im2Var2 = am2Var.U;
                    long j = this.o;
                    this.m = 1;
                    if (im2Var2.b(j, false, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            case 2:
                int i4 = this.m;
                if (i4 == 0) {
                    fg1.T(obj);
                    im2 im2Var3 = am2Var.U;
                    long j2 = this.o;
                    this.m = 1;
                    if (im2Var3.b(j2, true, this) == k20Var) {
                    }
                } else if (i4 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                int i5 = this.m;
                if (i5 == 0) {
                    fg1.T(obj);
                    long j3 = this.o;
                    im2 im2Var4 = am2Var.U;
                    this.m = 1;
                    Object objA = ul2.a(im2Var4, j3, this);
                    if (objA == k20Var) {
                    }
                } else if (i5 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl2(am2 am2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.n = am2Var;
    }
}
