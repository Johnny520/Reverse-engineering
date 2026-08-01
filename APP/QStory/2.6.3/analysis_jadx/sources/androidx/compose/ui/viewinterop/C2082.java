package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.focus.AbstractC1481;
import androidx.compose.ui.focus.InterfaceC1469;
import androidx.compose.ui.focus.InterfaceC1476;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2082 extends AbstractC2128 implements InterfaceC1469 {
    @Override // androidx.compose.ui.focus.InterfaceC1469
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo2633(InterfaceC1476 interfaceC1476) {
        View viewM3818 = AbstractC2075.m3818(this);
        interfaceC1476.mo2634(this.f6292.f6279 && AbstractC2075.m3818(this).hasFocusable());
        View viewFindFocus = viewM3818.findFocus();
        if (viewFindFocus != null) {
            interfaceC1476.mo2637(AbstractC1481.m2653(viewFindFocus, viewM3818));
        }
    }
}
