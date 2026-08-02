package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f71 f2337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2338c;

    public /* synthetic */ e71(f71 f71Var, Object obj, int i) {
        this.f2336a = i;
        this.f2337b = f71Var;
        this.f2338c = obj;
    }

    /* JADX INFO: renamed from: b */
    public x61 m1286b() {
        f71 f71Var = this.f2337b;
        r61 r61Var = (r61) f71Var.f2835q.m4505g(this.f2338c);
        if (r61Var != null) {
            return (x61) f71Var.f2831m.m4505g(r61Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1287c() {
        sy1 sy1Var;
        switch (this.f2336a) {
            case 0:
                return true;
            default:
                x61 x61VarM1286b = m1286b();
                if (x61VarM1286b == null || (sy1Var = x61VarM1286b.f12847f) == null) {
                    return true;
                }
                return sy1Var.m5021c();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1285a() {
    }
}
