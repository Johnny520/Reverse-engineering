package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public ro0 f7193j;

    /* JADX INFO: renamed from: k */
    public ok1 f7194k;

    /* JADX INFO: renamed from: l */
    public long[] f7195l;

    /* JADX INFO: renamed from: m */
    public int f7196m;

    /* JADX INFO: renamed from: n */
    public int f7197n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f7198o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ok1 f7199p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ro0 f7200q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(ok1 ok1Var, ro0 ro0Var, t00 t00Var) {
        super(2, t00Var);
        this.f7199p = ok1Var;
        this.f7200q = ro0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((nk1) mo13p((t00) obj2, (vo2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        nk1 nk1Var = new nk1(this.f7199p, this.f7200q, t00Var);
        nk1Var.f7198o = obj;
        return nk1Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        vo2 vo2Var;
        ok1 ok1Var;
        long[] jArr;
        int i;
        ro0 ro0Var;
        int i2 = this.f7197n;
        if (i2 == 0) {
            fg1.m1627T(obj);
            vo2Var = (vo2) this.f7198o;
            ok1Var = this.f7199p;
            mk1 mk1Var = ok1Var.f7703i;
            jArr = mk1Var.f6704c;
            i = mk1Var.f6706e;
            ro0Var = this.f7200q;
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f7196m;
            jArr = this.f7195l;
            ok1Var = this.f7194k;
            ro0Var = this.f7193j;
            vo2Var = (vo2) this.f7198o;
            fg1.m1627T(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return a83.f116a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        ro0Var.f9654i = i;
        Object obj2 = ok1Var.f7703i.f6703b[i];
        this.f7198o = vo2Var;
        this.f7193j = ro0Var;
        this.f7194k = ok1Var;
        this.f7195l = jArr;
        this.f7196m = i3;
        this.f7197n = 1;
        vo2Var.m5746b(this, obj2);
        return k20.f5323h;
    }
}
