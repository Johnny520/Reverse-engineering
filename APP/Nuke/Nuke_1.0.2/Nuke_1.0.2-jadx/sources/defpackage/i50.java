package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 extends th1 implements mc0 {
    public final bk1 v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i50(bk1 bk1Var) {
        this.v = bk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        p7.A(A0(), null, new h50(this, (t00) null, 0), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        t61Var.a();
        sp spVar = t61Var.h;
        if (this.w) {
            nc0.i0(t61Var, ju.b(0.3f, ju.b), 0L, spVar.d(), 122);
        } else if (this.x || this.y) {
            nc0.i0(t61Var, ju.b(0.1f, ju.b), 0L, spVar.d(), 122);
        }
    }
}
