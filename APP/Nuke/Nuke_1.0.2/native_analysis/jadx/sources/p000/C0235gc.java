package p000;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235gc extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3392l;

    /* JADX INFO: renamed from: m */
    public int f3393m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ long f3394n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f3395o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235gc(long j, yw2 yw2Var, t00 t00Var) {
        super(2, t00Var);
        this.f3392l = 3;
        this.f3394n = j;
        this.f3395o = yw2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3392l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0235gc) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((C0235gc) mo13p((t00) obj2, Long.valueOf(((Number) obj).longValue()))).mo7r(a83Var);
            case 2:
                return ((C0235gc) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((C0235gc) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f3392l;
        Object obj2 = this.f3395o;
        switch (i) {
            case 0:
                return new C0235gc((AbstractC0309ic) obj2, this.f3394n, t00Var, 0);
            case 1:
                C0235gc c0235gc = new C0235gc((ep1) obj2, t00Var);
                c0235gc.f3394n = ((Number) obj).longValue();
                return c0235gc;
            case 2:
                return new C0235gc((C0689sc) obj2, this.f3394n, t00Var, 2);
            default:
                return new C0235gc(this.f3394n, (yw2) obj2, t00Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (p000.AbstractC0179eu.m1425F(8, r13) == r5) goto L16;
     */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        int i = this.f3392l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f3395o;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f3393m;
                if (i2 != 0) {
                    if (i2 == 1) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                tm1 tm1Var = ((AbstractC0309ic) obj2).f4532h;
                long j = this.f3394n;
                this.f3393m = 1;
                return tm1Var.m5330b(j, this) == k20Var ? k20Var : a83Var;
            case 1:
                long j2 = this.f3394n;
                int i3 = this.f3393m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    this.f3394n = j2;
                    this.f3393m = 1;
                    return ep1.m1403a((ep1) obj2, j2, this) == k20Var ? k20Var : a83Var;
                }
                if (i3 == 1) {
                    fg1.m1627T(obj);
                    return a83Var;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.f3393m;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fg1.m1627T(obj);
                        return a83Var;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                C0689sc c0689sc = (C0689sc) obj2;
                rs1 rs1Var = new rs1(this.f3394n);
                qt2 qt2Var = in2.f4707d;
                this.f3393m = 1;
                return C0689sc.m4787c(c0689sc, rs1Var, qt2Var, null, this, 12) == k20Var ? k20Var : a83Var;
            default:
                long j3 = this.f3394n;
                int i5 = this.f3393m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    this.f3393m = 1;
                    if (AbstractC0179eu.m1425F(j3 - 8, this) != k20Var) {
                    }
                    return k20Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    C0469mp c0469mp = ((yw2) obj2).f13655j;
                    if (c0469mp == null) {
                        return a83Var;
                    }
                    c0469mp.mo2509h(new x92(new j12(j3)));
                    return a83Var;
                }
                fg1.m1627T(obj);
                this.f3393m = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235gc(ep1 ep1Var, t00 t00Var) {
        super(2, t00Var);
        this.f3392l = 1;
        this.f3395o = ep1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0235gc(Object obj, long j, t00 t00Var, int i) {
        super(2, t00Var);
        this.f3392l = i;
        this.f3395o = obj;
        this.f3394n = j;
    }
}
