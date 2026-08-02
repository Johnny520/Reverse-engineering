package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hm1 {
    public t11 a;
    public boolean b;
    public fm1 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(em1 em1Var);

    public abstract void d(em1 em1Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        fm1 fm1Var = this.c;
        if (fm1Var == null || !fm1Var.c.remove(this)) {
            return;
        }
        km1 km1Var = fm1Var.b;
        km1Var.getClass();
        if (equals(km1Var.f)) {
            if (km1Var.g == -1) {
                a();
            }
            km1Var.f = null;
            km1Var.g = 0;
            km1Var.h = null;
        }
        km1Var.d.remove(this);
        km1Var.e.remove(this);
        this.c = null;
        km1Var.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z) {
        km1 km1Var;
        if (this.b == z) {
            return;
        }
        this.b = z;
        fm1 fm1Var = this.c;
        if (fm1Var == null || (km1Var = fm1Var.b) == null) {
            return;
        }
        km1Var.b();
    }
}
