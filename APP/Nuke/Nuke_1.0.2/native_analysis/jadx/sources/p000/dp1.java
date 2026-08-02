package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2140l;

    /* JADX INFO: renamed from: m */
    public int f2141m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ long f2142n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ep1 f2143o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ un0 f2144p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp1(mn0 mn0Var, long j, ep1 ep1Var, t00 t00Var) {
        super(2, t00Var);
        this.f2140l = 2;
        this.f2144p = mn0Var;
        this.f2142n = j;
        this.f2143o = ep1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2140l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((dp1) mo13p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).mo7r(a83Var);
            case 1:
                return ((dp1) mo13p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).mo7r(a83Var);
            default:
                return ((dp1) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f2140l;
        ep1 ep1Var = this.f2143o;
        un0 un0Var = this.f2144p;
        switch (i) {
            case 0:
                dp1 dp1Var = new dp1(ep1Var, (xm0) un0Var, t00Var, 0);
                dp1Var.f2142n = ((Number) obj).longValue();
                return dp1Var;
            case 1:
                dp1 dp1Var2 = new dp1(ep1Var, (xm0) un0Var, t00Var, 1);
                dp1Var2.f2142n = ((Number) obj).longValue();
                return dp1Var2;
            default:
                return new dp1((mn0) un0Var, this.f2142n, this.f2143o, t00Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
    
        if (r14.m4789e(r13, r0) == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        int i = this.f2140l;
        a83 a83Var = a83.f116a;
        un0 un0Var = this.f2144p;
        k20 k20Var = k20.f5323h;
        ep1 ep1Var = this.f2143o;
        t00 t00Var = null;
        switch (i) {
            case 0:
                long j = this.f2142n;
                int i2 = this.f2141m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    this.f2142n = j;
                    this.f2141m = 1;
                    ep1Var.getClass();
                    Object objM5238u = AbstractC0731te.m5238u(new C0040b2(ep1Var, t00Var, 11), this);
                    if (objM5238u != k20Var) {
                        objM5238u = a83Var;
                    }
                    if (objM5238u != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    ep1Var.f2556i.setValue(Boolean.FALSE);
                    ((xm0) un0Var).mo6a();
                    return a83Var;
                }
                fg1.m1627T(obj);
                if (ep1Var.f2552e != j) {
                    return a83Var;
                }
                C0689sc c0689sc = ep1Var.f2549b;
                Float f = new Float(0.0f);
                this.f2142n = j;
                this.f2141m = 2;
                break;
            case 1:
                long j2 = this.f2142n;
                int i3 = this.f2141m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    C0689sc c0689sc2 = ep1Var.f2549b;
                    Float f2 = new Float(0.0f);
                    this.f2142n = j2;
                    this.f2141m = 1;
                    if (c0689sc2.m4789e(this, f2) != k20Var) {
                    }
                    return k20Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            fg1.m1627T(obj);
                            return a83Var;
                        }
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    this.f2142n = j2;
                    this.f2141m = 3;
                    if (ep1.m1403a(ep1Var, j2, this) != k20Var) {
                        return a83Var;
                    }
                    return k20Var;
                }
                fg1.m1627T(obj);
                ((xm0) un0Var).mo6a();
                ep1Var.f2556i.setValue(Boolean.TRUE);
                nx0 nx0Var = new nx0(24);
                this.f2142n = j2;
                this.f2141m = 2;
                a20 a20Var = this.f11029i;
                a20Var.getClass();
                if (qp0.m4220A(a20Var).m6080a(nx0Var, this) != k20Var) {
                    this.f2142n = j2;
                    this.f2141m = 3;
                    if (ep1.m1403a(ep1Var, j2, this) != k20Var) {
                    }
                }
                return k20Var;
            default:
                long j3 = this.f2142n;
                int i4 = this.f2141m;
                try {
                    if (i4 == 0) {
                        fg1.m1627T(obj);
                        Long l = new Long(j3);
                        this.f2141m = 1;
                        if (((mn0) un0Var).mo12g(l, this) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    if (ep1Var.f2552e != j3) {
                        return a83Var;
                    }
                    ep1Var.f2551d = null;
                    ep1Var.f2553f = null;
                    ep1Var.m1409g(false);
                    ep1Var.m1408f(false);
                    return a83Var;
                } finally {
                    if (ep1Var.f2552e == j3) {
                        ep1Var.f2551d = null;
                        ep1Var.f2553f = null;
                        ep1Var.m1409g(false);
                        ep1Var.m1408f(false);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp1(ep1 ep1Var, xm0 xm0Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f2140l = i;
        this.f2143o = ep1Var;
        this.f2144p = xm0Var;
    }
}
