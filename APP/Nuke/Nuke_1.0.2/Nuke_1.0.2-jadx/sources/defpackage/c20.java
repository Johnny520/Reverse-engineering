package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c20 extends q2 implements y10 {
    public static final b20 i = new b20(gd3.p, new gs(9));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c20() {
        super(gd3.p);
    }

    public abstract void D(a20 a20Var, Runnable runnable);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean E(a20 a20Var) {
        return !(this instanceof u73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c20 F(int i2) {
        sp0.t(i2);
        return new sa1(this, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q2, defpackage.a20
    public final y10 o(z10 z10Var) {
        y10 y10Var;
        z10Var.getClass();
        if (z10Var instanceof b20) {
            b20 b20Var = (b20) z10Var;
            z10 z10Var2 = this.h;
            if ((z10Var2 == b20Var || b20Var.i == z10Var2) && (y10Var = (y10) b20Var.h.j(this)) != null) {
                return y10Var;
            }
        } else if (gd3.p == z10Var) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + '@' + p40.x(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q2, defpackage.a20
    public final a20 u(z10 z10Var) {
        z10Var.getClass();
        if (z10Var instanceof b20) {
            b20 b20Var = (b20) z10Var;
            z10 z10Var2 = this.h;
            if ((z10Var2 != b20Var && b20Var.i != z10Var2) || ((y10) b20Var.h.j(this)) == null) {
                return this;
            }
        } else if (gd3.p != z10Var) {
            return this;
        }
        return zd0.h;
    }
}
