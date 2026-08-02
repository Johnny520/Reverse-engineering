package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hr0 extends ep2 {
    public q43 a = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) {
        q43 q43Var = this.a;
        if (q43Var != null) {
            return q43Var.b(l41Var);
        }
        s.l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) {
        q43 q43Var = this.a;
        if (q43Var != null) {
            q43Var.c(o41Var, obj);
        } else {
            s.l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ep2
    public final q43 d() {
        q43 q43Var = this.a;
        if (q43Var != null) {
            return q43Var;
        }
        s.l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
