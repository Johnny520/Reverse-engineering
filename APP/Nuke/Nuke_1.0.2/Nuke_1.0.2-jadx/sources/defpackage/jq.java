package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jq extends tw2 implements mn0 {
    public final /* synthetic */ int l = 0;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mq o;
    public final /* synthetic */ ak0 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(mq mqVar, ak0 ak0Var, Object obj, t00 t00Var) {
        super(2, t00Var);
        this.o = mqVar;
        this.p = ak0Var;
        this.n = obj;
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
        return ((jq) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        ak0 ak0Var = this.p;
        mq mqVar = this.o;
        switch (i) {
            case 0:
                return new jq(mqVar, ak0Var, this.n, t00Var);
            default:
                jq jqVar = new jq(mqVar, ak0Var, t00Var);
                jqVar.n = obj;
                return jqVar;
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
                if (i2 == 0) {
                    fg1.T(obj);
                    nn0 nn0Var = this.o.l;
                    Object obj2 = this.n;
                    this.m = 1;
                    if (nn0Var.e(this.p, obj2, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                j20 j20Var = (j20) this.n;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    o72 o72Var = new o72();
                    mq mqVar = this.o;
                    zj0 zj0Var = mqVar.k;
                    lq lqVar = new lq(o72Var, j20Var, mqVar, this.p, 0);
                    this.n = null;
                    this.m = 1;
                    if (zj0Var.a(lqVar, this) == k20Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(mq mqVar, ak0 ak0Var, t00 t00Var) {
        super(2, t00Var);
        this.o = mqVar;
        this.p = ak0Var;
    }
}
