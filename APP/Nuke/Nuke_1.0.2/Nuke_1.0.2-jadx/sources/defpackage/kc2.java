package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kc2 implements fa1, AutoCloseable {
    public final String h;
    public final jc2 i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kc2(String str, jc2 jc2Var) {
        this.h = str;
        this.i = jc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            this.j = false;
            ia1Var.getLifecycle().b(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(ba1 ba1Var, qc2 qc2Var) {
        qc2Var.getClass();
        ba1Var.getClass();
        if (this.j) {
            s.l("Already attached to lifecycleOwner");
            return;
        }
        this.j = true;
        ba1Var.a(this);
        qc2Var.c(this.h, (uv) this.i.a.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
