package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class te3 extends se3 {
    public zz0 t;
    public zz0 u;
    public zz0 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public te3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public zz0 k() {
        if (this.u == null) {
            this.u = zz0.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public zz0 m() {
        if (this.t == null) {
            this.t = zz0.c(this.c.getSystemGestureInsets());
        }
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public zz0 o() {
        if (this.v == null) {
            this.v = zz0.c(this.c.getTappableElementInsets());
        }
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public cf3 r(int i, int i2, int i3, int i4) {
        return cf3.c(null, this.c.inset(i, i2, i3, i4));
    }

    public te3(cf3 cf3Var, te3 te3Var) {
        super(cf3Var, te3Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.re3, defpackage.ye3
    public void z(zz0 zz0Var) {
    }
}
