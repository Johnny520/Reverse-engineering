package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public long f4080l;

    /* JADX INFO: renamed from: m */
    public int f4081m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ long f4082n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ im2 f4083o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(im2 im2Var, t00 t00Var) {
        super(2, t00Var);
        this.f4083o = im2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        long j = ((da3) obj).f1950a;
        hm2 hm2Var = new hm2(this.f4083o, (t00) obj2);
        hm2Var.f4082n = j;
        return hm2Var.mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        hm2 hm2Var = new hm2(this.f4083o, t00Var);
        hm2Var.f4082n = ((da3) obj).f1950a;
        return hm2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f4081m;
        im2 im2Var = this.f4083o;
        k20 k20Var = k20.f5323h;
        if (i == 0) {
            fg1.m1627T(obj);
            j = this.f4082n;
            tm1 tm1Var = im2Var.f4692f;
            this.f4082n = j;
            this.f4081m = 1;
            obj = tm1Var.m5330b(j, this);
            if (obj != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.f4080l;
                j3 = this.f4082n;
                fg1.m1627T(obj);
                return new da3(da3.m987d(j3, da3.m987d(j4, ((da3) obj).f1950a)));
            }
            j2 = this.f4080l;
            j = this.f4082n;
            fg1.m1627T(obj);
            long j5 = ((da3) obj).f1950a;
            tm1 tm1Var2 = im2Var.f4692f;
            long jM987d = da3.m987d(j2, j5);
            this.f4082n = j;
            this.f4080l = j5;
            this.f4081m = 3;
            obj = tm1Var2.m5329a(jM987d, j5, this);
            if (obj != k20Var) {
                j3 = j;
                j4 = j5;
                return new da3(da3.m987d(j3, da3.m987d(j4, ((da3) obj).f1950a)));
            }
            return k20Var;
        }
        j = this.f4082n;
        fg1.m1627T(obj);
        long jM987d2 = da3.m987d(j, ((da3) obj).f1950a);
        this.f4082n = j;
        this.f4080l = jM987d2;
        this.f4081m = 2;
        obj = im2Var.m2364a(jM987d2, this);
        if (obj != k20Var) {
            j2 = jM987d2;
            long j52 = ((da3) obj).f1950a;
            tm1 tm1Var22 = im2Var.f4692f;
            long jM987d3 = da3.m987d(j2, j52);
            this.f4082n = j;
            this.f4080l = j52;
            this.f4081m = 3;
            obj = tm1Var22.m5329a(jM987d3, j52, this);
            if (obj != k20Var) {
            }
        }
        return k20Var;
    }
}
