package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class we3 extends ve3 {
    public static final cf3 x = cf3.c(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public we3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ue3, defpackage.qe3, defpackage.ye3
    public zz0 i(int i) {
        return zz0.c(this.c.getInsets(bf3.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ue3, defpackage.qe3, defpackage.ye3
    public zz0 j(int i) {
        return zz0.c(this.c.getInsetsIgnoringVisibility(bf3.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ue3, defpackage.qe3, defpackage.ye3
    public boolean u(int i) {
        return this.c.isVisible(bf3.a(i));
    }

    public we3(cf3 cf3Var, we3 we3Var) {
        super(cf3Var, we3Var);
    }

    @Override // defpackage.qe3, defpackage.ye3
    public void p(View view) {
    }
}
