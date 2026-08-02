package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3329l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f3330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g62(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.f3329l = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3329l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((g62) mo13p((t00) obj2, (f62) obj)).mo7r(a83Var);
            default:
                return ((g62) mo13p((t00) obj2, (nq2) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f3329l) {
            case 0:
                g62 g62Var = new g62(2, t00Var, 0);
                g62Var.f3330m = obj;
                return g62Var;
            default:
                g62 g62Var2 = new g62(2, t00Var, 1);
                g62Var2.f3330m = obj;
                return g62Var2;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        switch (this.f3329l) {
            case 0:
                fg1.m1627T(obj);
                return Boolean.valueOf(((f62) this.f3330m) == f62.f2816h);
            default:
                nq2 nq2Var = (nq2) this.f3330m;
                fg1.m1627T(obj);
                return Boolean.valueOf(nq2Var != nq2.f7284h);
        }
    }
}
