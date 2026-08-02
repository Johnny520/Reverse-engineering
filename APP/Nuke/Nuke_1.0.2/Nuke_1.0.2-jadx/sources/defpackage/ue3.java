package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class ue3 extends te3 {
    public static final cf3 w = cf3.c(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ue3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public zz0 i(int i) {
        return zz0.c(this.c.getInsets(af3.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public zz0 j(int i) {
        return zz0.c(this.c.getInsetsIgnoringVisibility(af3.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public boolean u(int i) {
        return this.c.isVisible(af3.a(i));
    }

    public ue3(cf3 cf3Var, ue3 ue3Var) {
        super(cf3Var, ue3Var);
    }

    @Override // defpackage.qe3, defpackage.ye3
    public final void d(View view) {
    }
}
