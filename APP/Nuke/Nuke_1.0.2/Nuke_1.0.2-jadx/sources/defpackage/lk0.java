package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.l = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((lk0) p((t00) obj2, Integer.valueOf(((Number) obj).intValue()))).r(a83Var);
            case 1:
                return ((lk0) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((lk0) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = 2;
        switch (this.l) {
            case 0:
                lk0 lk0Var = new lk0(i, t00Var, 0);
                lk0Var.m = ((Number) obj).intValue();
                return lk0Var;
            case 1:
                return new lk0(i, t00Var, 1);
            default:
                return new lk0(i, t00Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                fg1.T(obj);
                return Boolean.valueOf(i2 > 0);
            case 1:
                int i3 = this.m;
                if (i3 != 0) {
                    if (i3 == 1) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                sq1 sq1Var = sq1.a;
                hv hvVar = sq1.p;
                if (hvVar == null) {
                    t11.S("messageDispatchReady");
                    throw null;
                }
                jn jnVar = sq1.o;
                if (jnVar != null) {
                    this.m = 1;
                    return sq1.a(hvVar, jnVar, this) == k20Var ? k20Var : a83Var;
                }
                t11.S("messageQueue");
                throw null;
            default:
                int i4 = this.m;
                if (i4 == 0) {
                    fg1.T(obj);
                    sq1 sq1Var2 = sq1.a;
                    this.m = 1;
                    return sq1Var2.h(this) == k20Var ? k20Var : a83Var;
                }
                if (i4 == 1) {
                    fg1.T(obj);
                    return a83Var;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
