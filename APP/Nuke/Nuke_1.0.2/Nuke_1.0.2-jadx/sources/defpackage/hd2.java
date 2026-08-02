package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class hd2 extends p2 implements l20 {
    public final t00 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hd2(t00 t00Var, a20 a20Var) {
        super(a20Var, true);
        this.k = t00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final boolean S() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l20
    public final l20 d() {
        t00 t00Var = this.k;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public void x(Object obj) throws j90 {
        p40.Q(gf1.z(this.k), fg1.L(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public void y(Object obj) {
        this.k.h(fg1.L(obj));
    }

    public void j0() {
    }
}
