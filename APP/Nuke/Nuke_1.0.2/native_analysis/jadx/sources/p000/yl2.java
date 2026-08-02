package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f13511l;

    /* JADX INFO: renamed from: m */
    public int f13512m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ am2 f13513n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ long f13514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl2(am2 am2Var, long j, t00 t00Var, int i) {
        super(2, t00Var);
        this.f13511l = i;
        this.f13513n = am2Var;
        this.f13514o = j;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13511l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((yl2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((yl2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((yl2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                long j = ((rs1) obj).f9744a;
                yl2 yl2Var = new yl2(this.f13513n, (t00) obj2);
                yl2Var.f13514o = j;
                return yl2Var.mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f13511l) {
            case 0:
                return new yl2(this.f13513n, this.f13514o, t00Var, 0);
            case 1:
                return new yl2(this.f13513n, this.f13514o, t00Var, 1);
            case 2:
                return new yl2(this.f13513n, this.f13514o, t00Var, 2);
            default:
                yl2 yl2Var = new yl2(this.f13513n, t00Var);
                yl2Var.f13514o = ((rs1) obj).f9744a;
                return yl2Var;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f13511l;
        a83 a83Var = a83.f116a;
        am2 am2Var = this.f13513n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f13512m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    im2 im2Var = am2Var.f276U;
                    xl2 xl2Var = new xl2(this.f13514o, null);
                    this.f13512m = 1;
                    if (im2Var.m2369f(bl1.f933i, xl2Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            case 1:
                int i3 = this.f13512m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    im2 im2Var2 = am2Var.f276U;
                    long j = this.f13514o;
                    this.f13512m = 1;
                    if (im2Var2.m2365b(j, false, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            case 2:
                int i4 = this.f13512m;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    im2 im2Var3 = am2Var.f276U;
                    long j2 = this.f13514o;
                    this.f13512m = 1;
                    if (im2Var3.m2365b(j2, true, this) == k20Var) {
                    }
                } else if (i4 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i5 = this.f13512m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    long j3 = this.f13514o;
                    im2 im2Var4 = am2Var.f276U;
                    this.f13512m = 1;
                    Object objM5511a = ul2.m5511a(im2Var4, j3, this);
                    if (objM5511a == k20Var) {
                    }
                } else if (i5 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl2(am2 am2Var, t00 t00Var) {
        super(2, t00Var);
        this.f13511l = 3;
        this.f13513n = am2Var;
    }
}
