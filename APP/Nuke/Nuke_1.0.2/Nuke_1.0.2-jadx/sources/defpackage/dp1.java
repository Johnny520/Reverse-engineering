package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public /* synthetic */ long n;
    public final /* synthetic */ ep1 o;
    public final /* synthetic */ un0 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp1(mn0 mn0Var, long j, ep1 ep1Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 2;
        this.p = mn0Var;
        this.n = j;
        this.o = ep1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((dp1) p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).r(a83Var);
            case 1:
                return ((dp1) p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).r(a83Var);
            default:
                return ((dp1) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        ep1 ep1Var = this.o;
        un0 un0Var = this.p;
        switch (i) {
            case 0:
                dp1 dp1Var = new dp1(ep1Var, (xm0) un0Var, t00Var, 0);
                dp1Var.n = ((Number) obj).longValue();
                return dp1Var;
            case 1:
                dp1 dp1Var2 = new dp1(ep1Var, (xm0) un0Var, t00Var, 1);
                dp1Var2.n = ((Number) obj).longValue();
                return dp1Var2;
            default:
                return new dp1((mn0) un0Var, this.n, this.o, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
    
        if (r14.e(r13, r0) == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        un0 un0Var = this.p;
        k20 k20Var = k20.h;
        ep1 ep1Var = this.o;
        t00 t00Var = null;
        switch (i) {
            case 0:
                long j = this.n;
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    this.n = j;
                    this.m = 1;
                    ep1Var.getClass();
                    Object objU = te.u(new b2(ep1Var, t00Var, 11), this);
                    if (objU != k20Var) {
                        objU = a83Var;
                    }
                    if (objU != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    ep1Var.i.setValue(Boolean.FALSE);
                    ((xm0) un0Var).a();
                    return a83Var;
                }
                fg1.T(obj);
                if (ep1Var.e != j) {
                    return a83Var;
                }
                sc scVar = ep1Var.b;
                Float f = new Float(0.0f);
                this.n = j;
                this.m = 2;
                break;
            case 1:
                long j2 = this.n;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    sc scVar2 = ep1Var.b;
                    Float f2 = new Float(0.0f);
                    this.n = j2;
                    this.m = 1;
                    if (scVar2.e(this, f2) != k20Var) {
                    }
                    return k20Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            fg1.T(obj);
                            return a83Var;
                        }
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    this.n = j2;
                    this.m = 3;
                    if (ep1.a(ep1Var, j2, this) != k20Var) {
                        return a83Var;
                    }
                    return k20Var;
                }
                fg1.T(obj);
                ((xm0) un0Var).a();
                ep1Var.i.setValue(Boolean.TRUE);
                nx0 nx0Var = new nx0(24);
                this.n = j2;
                this.m = 2;
                a20 a20Var = this.i;
                a20Var.getClass();
                if (qp0.A(a20Var).a(nx0Var, this) != k20Var) {
                    this.n = j2;
                    this.m = 3;
                    if (ep1.a(ep1Var, j2, this) != k20Var) {
                    }
                }
                return k20Var;
            default:
                long j3 = this.n;
                int i4 = this.m;
                try {
                    if (i4 == 0) {
                        fg1.T(obj);
                        Long l = new Long(j3);
                        this.m = 1;
                        if (((mn0) un0Var).g(l, this) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    if (ep1Var.e != j3) {
                        return a83Var;
                    }
                    ep1Var.d = null;
                    ep1Var.f = null;
                    ep1Var.g(false);
                    ep1Var.f(false);
                    return a83Var;
                } finally {
                    if (ep1Var.e == j3) {
                        ep1Var.d = null;
                        ep1Var.f = null;
                        ep1Var.g(false);
                        ep1Var.f(false);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp1(ep1 ep1Var, xm0 xm0Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = ep1Var;
        this.p = xm0Var;
    }
}
