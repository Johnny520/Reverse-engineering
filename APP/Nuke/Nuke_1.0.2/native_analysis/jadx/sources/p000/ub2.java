package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends u00 implements ak0 {

    /* JADX INFO: renamed from: k */
    public final ak0 f11209k;

    /* JADX INFO: renamed from: l */
    public final a20 f11210l;

    /* JADX INFO: renamed from: m */
    public final int f11211m;

    /* JADX INFO: renamed from: n */
    public a20 f11212n;

    /* JADX INFO: renamed from: o */
    public t00 f11213o;

    public ub2(ak0 ak0Var, a20 a20Var) {
        super(C0518nv.f7342j, zd0.f13837h);
        this.f11209k = ak0Var;
        this.f11210l = a20Var;
        this.f11211m = ((Number) a20Var.mo16r(new eg1((byte) 0, 15), 0)).intValue();
    }

    @Override // p000.AbstractC0658rj, p000.l20
    /* JADX INFO: renamed from: d */
    public final l20 mo2144d() {
        t00 t00Var = this.f11213o;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    @Override // p000.u00, p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        a20 a20Var = this.f11212n;
        return a20Var == null ? zd0.f13837h : a20Var;
    }

    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    public final Object mo181m(Object obj, t00 t00Var) {
        try {
            Object objM5479t = m5479t(t00Var, obj);
            return objM5479t == k20.f5323h ? objM5479t : a83.f116a;
        } catch (Throwable th) {
            this.f11212n = new ya0(t00Var.mo2508f(), th);
            throw th;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: q */
    public final StackTraceElement mo4495q() {
        return null;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        Throwable thM6237a = y92.m6237a(obj);
        if (thM6237a != null) {
            this.f11212n = new ya0(mo2508f(), thM6237a);
        }
        t00 t00Var = this.f11213o;
        if (t00Var != null) {
            t00Var.mo2509h(obj);
        }
        return k20.f5323h;
    }

    /* JADX INFO: renamed from: t */
    public final Object m5479t(t00 t00Var, Object obj) {
        a20 a20VarMo2508f = t00Var.mo2508f();
        xe1.m6135n(a20VarMo2508f);
        a20 a20Var = this.f11212n;
        if (a20Var != a20VarMo2508f) {
            if (a20Var instanceof ya0) {
                throw new IllegalStateException(qv2.m4289S("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ya0) a20Var).f13379i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) a20VarMo2508f.mo16r(new C0686s9(15, this), 0)).intValue() != this.f11211m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11210l + ",\n\t\tbut emission happened in " + a20VarMo2508f + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f11212n = a20VarMo2508f;
        }
        this.f11213o = t00Var;
        nn0 nn0Var = wb2.f12454a;
        ak0 ak0Var = this.f11209k;
        ak0Var.getClass();
        Object objMo489e = nn0Var.mo489e(ak0Var, obj, this);
        if (!t11.m5086l(objMo489e, k20.f5323h)) {
            this.f11213o = null;
        }
        return objMo489e;
    }
}
