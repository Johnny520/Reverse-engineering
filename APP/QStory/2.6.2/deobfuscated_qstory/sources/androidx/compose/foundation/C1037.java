package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1781;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1037 extends AbstractC2128 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f3044;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3045;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f3046;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3047;

    public C1037(InterfaceC0579 interfaceC0579) {
        this.f3044 = interfaceC0579;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        AbstractC5398.m10473(m3857(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        C1758 c1758 = (C1758) interfaceC1506;
        c1758.m3301();
        C1507 c1507 = c1758.f5175;
        if (this.f3047) {
            InterfaceC1504.m2686(c1758, C1599.m2940(0.3f, C1599.f4695), c1507.mo2695(), 0.0f, null, 122);
        } else if (this.f3046 || this.f3045) {
            InterfaceC1504.m2686(c1758, C1599.m2940(0.1f, C1599.f4695), c1507.mo2695(), 0.0f, null, 122);
        }
    }
}
