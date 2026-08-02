package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h91 extends zt2 {
    public final t00 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h91(a20 a20Var, mn0 mn0Var) {
        super(a20Var, false);
        this.k = gf1.p(this, this, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final void Z() throws Throwable {
        try {
            p40.Q(gf1.z(this.k), a83.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof j90) {
                th = ((j90) th).h;
            }
            h(fg1.s(th));
            throw th;
        }
    }
}
