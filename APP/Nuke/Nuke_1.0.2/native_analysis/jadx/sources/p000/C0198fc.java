package p000;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0198fc extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public int f2899l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f2900m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0309ic f2901n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f2902o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198fc(boolean z, AbstractC0309ic abstractC0309ic, long j, t00 t00Var) {
        super(2, t00Var);
        this.f2900m = z;
        this.f2901n = abstractC0309ic;
        this.f2902o = j;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((C0198fc) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new C0198fc(this.f2900m, this.f2901n, this.f2902o, t00Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f2899l;
        if (i == 0) {
            fg1.m1627T(obj);
            tm1 tm1Var = this.f2901n.f4532h;
            k20 k20Var = k20.f5323h;
            if (this.f2900m) {
                this.f2899l = 2;
                Object objM5329a = tm1Var.m5329a(this.f2902o, 0L, this);
                if (objM5329a != k20Var) {
                    obj = objM5329a;
                    ((da3) obj).getClass();
                }
            } else {
                this.f2899l = 1;
                Object objM5329a2 = tm1Var.m5329a(0L, this.f2902o, this);
                if (objM5329a2 != k20Var) {
                    obj = objM5329a2;
                    ((da3) obj).getClass();
                }
            }
            return k20Var;
        }
        if (i == 1) {
            fg1.m1627T(obj);
            ((da3) obj).getClass();
        } else {
            if (i != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            ((da3) obj).getClass();
        }
        return a83.f116a;
    }
}
