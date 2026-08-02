package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends th1 implements fl0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fl0
    public final void W(dl0 dl0Var) {
        View viewJ = pp0.j(this);
        dl0Var.d(this.h.u && pp0.j(this).hasFocusable());
        View viewFindFocus = viewJ.findFocus();
        if (viewFindFocus != null) {
            dl0Var.e(vk0.a(viewFindFocus, viewJ));
        }
    }
}
