package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f11884j = 0;

    /* JADX INFO: renamed from: k */
    public int f11885k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f11886l;

    /* JADX INFO: renamed from: m */
    public Object f11887m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f11888n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ un0 f11889o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ un0 f11890p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f11891q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(C0146dy c0146dy, wt0 wt0Var, C0686s9 c0686s9, dd1 dd1Var, C0792v c0792v, t00 t00Var) {
        super(2, t00Var);
        this.f11887m = c0146dy;
        this.f11888n = wt0Var;
        this.f11889o = c0686s9;
        this.f11890p = dd1Var;
        this.f11891q = c0792v;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11884j;
        a83 a83Var = a83.f116a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((vb0) mo13p(t00Var, yw2Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11884j;
        Object obj2 = this.f11891q;
        un0 un0Var = this.f11890p;
        un0 un0Var2 = this.f11889o;
        Object obj3 = this.f11888n;
        switch (i) {
            case 0:
                vb0 vb0Var = new vb0((C0146dy) this.f11887m, (wt0) obj3, (C0686s9) un0Var2, (dd1) un0Var, (C0792v) obj2, t00Var);
                vb0Var.f11886l = obj;
                return vb0Var;
            default:
                vb0 vb0Var2 = new vb0((j20) obj3, (qz2) un0Var2, (C0590pr) un0Var, (x22) obj2, t00Var);
                vb0Var2.f11886l = obj;
                return vb0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        yw2 yw2Var;
        Object objM304a;
        yw2 yw2Var2;
        k21 k21VarM3745A;
        Object objM305b;
        t00 t00Var;
        Object objM311h;
        int i = this.f11884j;
        a83 a83Var = a83.f116a;
        un0 un0Var = this.f11890p;
        un0 un0Var2 = this.f11889o;
        k20 k20Var = k20.f5323h;
        Object obj2 = this.f11891q;
        Object obj3 = this.f11888n;
        switch (i) {
            case 0:
                int i2 = this.f11885k;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    yw2Var = (yw2) this.f11886l;
                    this.f11886l = yw2Var;
                    this.f11885k = 1;
                    objM304a = ay2.m304a(yw2Var, false, i12.f4216h, this);
                    if (objM304a != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yw2Var = (yw2) this.f11886l;
                fg1.m1627T(obj);
                objM304a = obj;
                this.f11886l = null;
                this.f11885k = 2;
                if (yb0.m6247g(yw2Var, (o12) objM304a, (C0146dy) this.f11887m, (wt0) obj3, (C0686s9) un0Var2, (dd1) un0Var, (C0792v) obj2, this) != k20Var) {
                    return a83Var;
                }
                return k20Var;
            default:
                j20 j20Var = (j20) obj3;
                x22 x22Var = (x22) obj2;
                int i3 = this.f11885k;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    yw2Var2 = (yw2) this.f11886l;
                    k21VarM3745A = AbstractC0570p7.m3745A(j20Var, null, new vx2(x22Var, null, 0), 1);
                    this.f11886l = yw2Var2;
                    this.f11887m = k21VarM3745A;
                    this.f11885k = 1;
                    objM305b = ay2.m305b(yw2Var2, this, 3);
                    if (objM305b != k20Var) {
                    }
                    return k20Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k21VarM3745A = (k21) this.f11886l;
                    fg1.m1627T(obj);
                    objM311h = obj;
                    t00Var = null;
                    o12 o12Var = (o12) objM311h;
                    if (o12Var == null) {
                        ay2.m308e(j20Var, k21VarM3745A, new ux2(x22Var, t00Var, 0));
                        return a83Var;
                    }
                    o12Var.m3463a();
                    ay2.m308e(j20Var, k21VarM3745A, new ux2(x22Var, t00Var, 1));
                    ((C0590pr) un0Var).mo5j(new rs1(o12Var.f7422c));
                    return a83Var;
                }
                k21VarM3745A = (zt2) this.f11887m;
                yw2Var2 = (yw2) this.f11886l;
                fg1.m1627T(obj);
                objM305b = obj;
                o12 o12Var2 = (o12) objM305b;
                o12Var2.m3463a();
                qz2 qz2Var = (qz2) un0Var2;
                if (qz2Var != ay2.f444a) {
                    t00Var = null;
                    ay2.m308e(j20Var, k21VarM3745A, new C0040b2(qz2Var, x22Var, o12Var2, null, 21));
                } else {
                    t00Var = null;
                }
                this.f11886l = k21VarM3745A;
                this.f11887m = t00Var;
                this.f11885k = 2;
                objM311h = ay2.m311h(yw2Var2, i12.f4217i, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(j20 j20Var, qz2 qz2Var, C0590pr c0590pr, x22 x22Var, t00 t00Var) {
        super(2, t00Var);
        this.f11888n = j20Var;
        this.f11889o = qz2Var;
        this.f11890p = c0590pr;
        this.f11891q = x22Var;
    }
}
