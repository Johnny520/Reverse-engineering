package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 extends tw2 implements in0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw0(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(1, t00Var);
        this.l = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                return new hw0((jw0) obj4, (k82) obj3, (tw0) obj2, (t00) obj, 0).r(a83Var);
            default:
                return new hw0((vn1) obj4, (ih2) obj3, (String) obj2, (t00) obj, 1).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        Object obj2 = this.p;
        Object obj3 = this.n;
        k20 k20Var = k20.h;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    jw0 jw0Var = (jw0) obj3;
                    tw0 tw0Var = (tw0) obj2;
                    gw0 gw0Var = new gw0(jw0Var, tw0Var, null);
                    this.m = 1;
                    Object objA = jw0.a(jw0Var, (k82) obj4, tw0Var, gw0Var, this);
                    if (objA == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                ih2 ih2Var = (ih2) obj4;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    vn1 vn1Var = (vn1) obj3;
                    gh2 gh2Var = ((df2) vn1Var.d).h;
                    String str = ih2Var.b;
                    th2 th2Var = ((u22) vn1Var.b).a;
                    hh2 hh2Var = new hh2(th2Var.c, th2Var.d, str);
                    Object obj5 = ih2Var.a;
                    String str2 = (String) obj2;
                    rp0.R(str2, "property");
                    this.m = 1;
                    Object objJ = gh2Var.j(hh2Var, obj5, str2, this);
                    if (objJ == k20Var) {
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
