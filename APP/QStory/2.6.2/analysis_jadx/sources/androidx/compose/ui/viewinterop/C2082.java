package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.focus.AbstractC1481;
import androidx.compose.ui.focus.InterfaceC1469;
import androidx.compose.ui.focus.InterfaceC1476;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2082 extends AbstractC2128 implements InterfaceC1469 {
    @Override // androidx.compose.ui.focus.InterfaceC1469
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo2623(InterfaceC1476 interfaceC1476) {
        View viewM3808 = AbstractC2075.m3808(this);
        interfaceC1476.mo2624(this.f6291.f6278 && AbstractC2075.m3808(this).hasFocusable());
        View viewFindFocus = viewM3808.findFocus();
        if (viewFindFocus != null) {
            interfaceC1476.mo2627(AbstractC1481.m2643(viewFindFocus, viewM3808));
        }
    }
}
