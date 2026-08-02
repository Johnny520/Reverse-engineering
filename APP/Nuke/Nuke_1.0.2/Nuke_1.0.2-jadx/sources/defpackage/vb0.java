package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 extends w92 implements mn0 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ un0 o;
    public final /* synthetic */ un0 p;
    public final /* synthetic */ Object q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(dy dyVar, wt0 wt0Var, s9 s9Var, dd1 dd1Var, v vVar, t00 t00Var) {
        super(2, t00Var);
        this.m = dyVar;
        this.n = wt0Var;
        this.o = s9Var;
        this.p = dd1Var;
        this.q = vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        a83 a83Var = a83.a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((vb0) p(t00Var, yw2Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.q;
        un0 un0Var = this.p;
        un0 un0Var2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                vb0 vb0Var = new vb0((dy) this.m, (wt0) obj3, (s9) un0Var2, (dd1) un0Var, (v) obj2, t00Var);
                vb0Var.l = obj;
                return vb0Var;
            default:
                vb0 vb0Var2 = new vb0((j20) obj3, (qz2) un0Var2, (pr) un0Var, (x22) obj2, t00Var);
                vb0Var2.l = obj;
                return vb0Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        yw2 yw2Var;
        Object objA;
        yw2 yw2Var2;
        k21 k21VarA;
        Object objB;
        t00 t00Var;
        Object objH;
        int i = this.j;
        a83 a83Var = a83.a;
        un0 un0Var = this.p;
        un0 un0Var2 = this.o;
        k20 k20Var = k20.h;
        Object obj2 = this.q;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    fg1.T(obj);
                    yw2Var = (yw2) this.l;
                    this.l = yw2Var;
                    this.k = 1;
                    objA = ay2.a(yw2Var, false, i12.h, this);
                    if (objA != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        fg1.T(obj);
                        return a83Var;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yw2Var = (yw2) this.l;
                fg1.T(obj);
                objA = obj;
                this.l = null;
                this.k = 2;
                if (yb0.g(yw2Var, (o12) objA, (dy) this.m, (wt0) obj3, (s9) un0Var2, (dd1) un0Var, (v) obj2, this) != k20Var) {
                    return a83Var;
                }
                return k20Var;
            default:
                j20 j20Var = (j20) obj3;
                x22 x22Var = (x22) obj2;
                int i3 = this.k;
                if (i3 == 0) {
                    fg1.T(obj);
                    yw2Var2 = (yw2) this.l;
                    k21VarA = p7.A(j20Var, null, new vx2(x22Var, null, 0), 1);
                    this.l = yw2Var2;
                    this.m = k21VarA;
                    this.k = 1;
                    objB = ay2.b(yw2Var2, this, 3);
                    if (objB != k20Var) {
                    }
                    return k20Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k21VarA = (k21) this.l;
                    fg1.T(obj);
                    objH = obj;
                    t00Var = null;
                    o12 o12Var = (o12) objH;
                    if (o12Var == null) {
                        ay2.e(j20Var, k21VarA, new ux2(x22Var, t00Var, 0));
                        return a83Var;
                    }
                    o12Var.a();
                    ay2.e(j20Var, k21VarA, new ux2(x22Var, t00Var, 1));
                    ((pr) un0Var).j(new rs1(o12Var.c));
                    return a83Var;
                }
                k21VarA = (zt2) this.m;
                yw2Var2 = (yw2) this.l;
                fg1.T(obj);
                objB = obj;
                o12 o12Var2 = (o12) objB;
                o12Var2.a();
                qz2 qz2Var = (qz2) un0Var2;
                if (qz2Var != ay2.a) {
                    t00Var = null;
                    ay2.e(j20Var, k21VarA, new b2(qz2Var, x22Var, o12Var2, null, 21));
                } else {
                    t00Var = null;
                }
                this.l = k21VarA;
                this.m = t00Var;
                this.k = 2;
                objH = ay2.h(yw2Var2, i12.i, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(j20 j20Var, qz2 qz2Var, pr prVar, x22 x22Var, t00 t00Var) {
        super(2, t00Var);
        this.n = j20Var;
        this.o = qz2Var;
        this.p = prVar;
        this.q = x22Var;
    }
}
