package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 extends th1 implements g51 {
    public in0 v;
    public in0 w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean X(KeyEvent keyEvent) {
        in0 in0Var = this.v;
        if (in0Var != null) {
            return ((Boolean) in0Var.j(new d51(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean k(KeyEvent keyEvent) {
        in0 in0Var = this.w;
        if (in0Var != null) {
            return ((Boolean) in0Var.j(new d51(keyEvent))).booleanValue();
        }
        return false;
    }
}
