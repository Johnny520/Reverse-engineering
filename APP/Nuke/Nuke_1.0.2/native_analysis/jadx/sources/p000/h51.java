package p000;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 extends th1 implements g51 {

    /* JADX INFO: renamed from: v */
    public in0 f3824v;

    /* JADX INFO: renamed from: w */
    public in0 f3825w;

    @Override // p000.g51
    /* JADX INFO: renamed from: X */
    public final boolean mo221X(KeyEvent keyEvent) {
        in0 in0Var = this.f3824v;
        if (in0Var != null) {
            return ((Boolean) in0Var.mo5j(new d51(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: k */
    public final boolean mo231k(KeyEvent keyEvent) {
        in0 in0Var = this.f3825w;
        if (in0Var != null) {
            return ((Boolean) in0Var.mo5j(new d51(keyEvent))).booleanValue();
        }
        return false;
    }
}
