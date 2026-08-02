package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {
    public final bl0 a;
    public final b7 b;
    public final sk1 c;
    public final sk1 d;
    public boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk0(bl0 bl0Var, b7 b7Var) {
        this.a = bl0Var;
        this.b = b7Var;
        sk1 sk1Var = fd2.a;
        this.c = new sk1();
        this.d = new sk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.e) {
            return;
        }
        r6 r6Var = new r6(0, this, wk0.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        lk1 lk1Var = this.b.G0;
        if (lk1Var.g(r6Var) < 0) {
            lk1Var.a(r6Var);
        }
        this.e = true;
    }
}
