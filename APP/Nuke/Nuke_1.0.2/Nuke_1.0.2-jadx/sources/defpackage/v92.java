package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v92 extends rj {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v92(t00 t00Var) {
        super(t00Var);
        if (t00Var == null || t00Var.f() == zd0.h) {
            return;
        }
        s.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return zd0.h;
    }
}
