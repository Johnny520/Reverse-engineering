package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gc extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public /* synthetic */ long n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(long j, yw2 yw2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.n = j;
        this.o = yw2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((gc) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((gc) p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).r(a83Var);
            case 2:
                return ((gc) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((gc) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new gc((ic) obj2, this.n, t00Var, 0);
            case 1:
                gc gcVar = new gc((ep1) obj2, t00Var);
                gcVar.n = ((Number) obj).longValue();
                return gcVar;
            case 2:
                return new gc((sc) obj2, this.n, t00Var, 2);
            default:
                return new gc(this.n, (yw2) obj2, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.eu.F(8, r13) == r5) goto L16;
     */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.o;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 != 0) {
                    if (i2 == 1) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                tm1 tm1Var = ((ic) obj2).h;
                long j = this.n;
                this.m = 1;
                return tm1Var.b(j, this) == k20Var ? k20Var : a83Var;
            case 1:
                long j2 = this.n;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    this.n = j2;
                    this.m = 1;
                    return ep1.a((ep1) obj2, j2, this) == k20Var ? k20Var : a83Var;
                }
                if (i3 == 1) {
                    fg1.T(obj);
                    return a83Var;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.m;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                sc scVar = (sc) obj2;
                rs1 rs1Var = new rs1(this.n);
                qt2 qt2Var = in2.d;
                this.m = 1;
                return sc.c(scVar, rs1Var, qt2Var, null, this, 12) == k20Var ? k20Var : a83Var;
            default:
                long j3 = this.n;
                int i5 = this.m;
                if (i5 == 0) {
                    fg1.T(obj);
                    this.m = 1;
                    if (eu.F(j3 - 8, this) != k20Var) {
                    }
                    return k20Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    mp mpVar = ((yw2) obj2).j;
                    if (mpVar == null) {
                        return a83Var;
                    }
                    mpVar.h(new x92(new j12(j3)));
                    return a83Var;
                }
                fg1.T(obj);
                this.m = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(ep1 ep1Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 1;
        this.o = ep1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc(Object obj, long j, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = obj;
        this.n = j;
    }
}
