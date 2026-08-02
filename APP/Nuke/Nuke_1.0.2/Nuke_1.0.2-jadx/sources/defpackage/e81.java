package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {
    public final Object a;
    public final g81 b;
    public int d;
    public e81 e;
    public boolean f;
    public int c = -1;
    public final nx1 g = op0.u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e81(Object obj, g81 g81Var) {
        this.a = obj;
        this.b = g81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e81 a() {
        if (this.f) {
            nz0.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.h.add(this);
            e81 e81Var = (e81) this.g.getValue();
            if (e81Var != null) {
                e81Var.a();
            } else {
                e81Var = null;
            }
            this.e = e81Var;
        }
        this.d++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            nz0.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.h.remove(this);
            e81 e81Var = this.e;
            if (e81Var != null) {
                e81Var.b();
            }
            this.e = null;
        }
    }
}
