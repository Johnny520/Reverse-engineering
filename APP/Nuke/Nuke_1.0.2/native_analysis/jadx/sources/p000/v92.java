package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v92 extends AbstractC0658rj {
    public v92(t00 t00Var) {
        super(t00Var);
        if (t00Var == null || t00Var.mo2508f() == zd0.f13837h) {
            return;
        }
        C0676s.m4651j("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return zd0.f13837h;
    }
}
