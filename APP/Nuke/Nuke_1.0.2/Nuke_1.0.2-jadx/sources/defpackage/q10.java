package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ s12 n;
    public final /* synthetic */ kz2 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q10(s12 s12Var, kz2 kz2Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = s12Var;
        this.o = kz2Var;
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
        return ((q10) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new q10(this.n, this.o, t00Var, 0);
            case 1:
                return new q10(this.n, this.o, t00Var, 1);
            default:
                return new q10(this.n, this.o, t00Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        kz2 kz2Var = this.o;
        s12 s12Var = this.n;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 != 0) {
                    if (i2 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    this.m = 1;
                    Object objU = te.u(new u0(s12Var, kz2Var, null), this);
                    if (objU != k20Var) {
                        objU = a83Var;
                    }
                    if (objU == k20Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.m;
                if (i3 != 0) {
                    if (i3 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    this.m = 1;
                    Object objP = sp0.p(s12Var, new lm0(kz2Var, null, 1), this);
                    if (objP != k20Var) {
                        objP = a83Var;
                    }
                    if (objP == k20Var) {
                    }
                }
                break;
            default:
                int i4 = this.m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    this.m = 1;
                    cd1 cd1Var = new cd1(kz2Var, 0);
                    dd1 dd1Var = new dd1(kz2Var, 0);
                    dd1 dd1Var2 = new dd1(kz2Var, 1);
                    s9 s9Var = new s9(11, kz2Var);
                    float f = yb0.a;
                    Object objP2 = sp0.p(s12Var, new vb0(new dy(10), new wt0(4, cd1Var), s9Var, dd1Var2, new v(8, dd1Var), null), this);
                    if (objP2 != k20Var) {
                        objP2 = a83Var;
                    }
                    if (objP2 != k20Var) {
                        objP2 = a83Var;
                    }
                    if (objP2 != k20Var) {
                        objP2 = a83Var;
                    }
                    if (objP2 == k20Var) {
                    }
                }
                break;
        }
        return a83Var;
    }
}
