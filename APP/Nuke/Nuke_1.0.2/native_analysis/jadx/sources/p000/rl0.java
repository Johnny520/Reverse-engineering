package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends th1 implements fl0 {
    @Override // p000.fl0
    /* JADX INFO: renamed from: W */
    public final void mo1661W(dl0 dl0Var) {
        View viewM3912j = pp0.m3912j(this);
        dl0Var.mo1055d(this.f10757h.f10770u && pp0.m3912j(this).hasFocusable());
        View viewFindFocus = viewM3912j.findFocus();
        if (viewFindFocus != null) {
            dl0Var.mo1056e(vk0.m5708a(viewFindFocus, viewM3912j));
        }
    }
}
