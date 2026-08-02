package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f71 b;
    public final /* synthetic */ Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e71(f71 f71Var, Object obj, int i) {
        this.a = i;
        this.b = f71Var;
        this.c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x61 b() {
        f71 f71Var = this.b;
        r61 r61Var = (r61) f71Var.q.g(this.c);
        if (r61Var != null) {
            return (x61) f71Var.m.g(r61Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        sy1 sy1Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                x61 x61VarB = b();
                if (x61VarB == null || (sy1Var = x61VarB.f) == null) {
                    return true;
                }
                return sy1Var.c();
        }
    }

    private final void a() {
    }
}
