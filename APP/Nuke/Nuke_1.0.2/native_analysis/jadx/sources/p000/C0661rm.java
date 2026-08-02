package p000;

/* JADX INFO: renamed from: rm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661rm extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f9635l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0699sm f9636m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ zn1 f9637n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0723t6 f9638o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0678s1 f9639p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661rm(C0699sm c0699sm, zn1 zn1Var, C0723t6 c0723t6, C0678s1 c0678s1, t00 t00Var) {
        super(2, t00Var);
        this.f9636m = c0699sm;
        this.f9637n = zn1Var;
        this.f9638o = c0723t6;
        this.f9639p = c0678s1;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((C0661rm) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        C0661rm c0661rm = new C0661rm(this.f9636m, this.f9637n, this.f9638o, this.f9639p, t00Var);
        c0661rm.f9635l = obj;
        return c0661rm;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        fg1.m1627T(obj);
        j20 j20Var = (j20) this.f9635l;
        C0723t6 c0723t6 = this.f9638o;
        C0699sm c0699sm = this.f9636m;
        AbstractC0570p7.m3745A(j20Var, null, new C0040b2(c0699sm, this.f9637n, c0723t6, null, 3), 3);
        return AbstractC0570p7.m3745A(j20Var, null, new C0003a2(c0699sm, this.f9639p, null, 7), 3);
    }
}
