package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class re3 extends qe3 {
    public zz0 s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public re3(cf3 cf3Var, re3 re3Var) {
        super(cf3Var, re3Var);
        this.s = null;
        this.s = re3Var.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public cf3 b() {
        return cf3.c(null, this.c.consumeStableInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public cf3 c() {
        return cf3.c(null, this.c.consumeSystemWindowInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public final zz0 l() {
        if (this.s == null) {
            WindowInsets windowInsets = this.c;
            this.s = zz0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public boolean s() {
        return this.c.isConsumed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void z(zz0 zz0Var) {
        this.s = zz0Var;
    }

    public re3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
        this.s = null;
    }
}
