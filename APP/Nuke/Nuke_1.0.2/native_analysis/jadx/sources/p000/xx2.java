package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xx2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f13227l;

    /* JADX INFO: renamed from: m */
    public int f13228m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ nn0 f13229n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ x22 f13230o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ o12 f13231p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx2(nn0 nn0Var, x22 x22Var, o12 o12Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f13227l = i;
        this.f13229n = nn0Var;
        this.f13230o = x22Var;
        this.f13231p = o12Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13227l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((xx2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f13227l) {
            case 0:
                return new xx2(this.f13229n, this.f13230o, this.f13231p, t00Var, 0);
            default:
                return new xx2(this.f13229n, this.f13230o, this.f13231p, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f13227l;
        a83 a83Var = a83.f116a;
        o12 o12Var = this.f13231p;
        x22 x22Var = this.f13230o;
        nn0 nn0Var = this.f13229n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f13228m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    rs1 rs1Var = new rs1(o12Var.f7422c);
                    this.f13228m = 1;
                    if (nn0Var.mo489e(x22Var, rs1Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i3 = this.f13228m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    rs1 rs1Var2 = new rs1(o12Var.f7422c);
                    this.f13228m = 1;
                    if (nn0Var.mo489e(x22Var, rs1Var2, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }
}
