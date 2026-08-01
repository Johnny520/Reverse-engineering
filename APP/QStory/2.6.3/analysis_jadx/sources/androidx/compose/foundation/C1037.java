package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1781;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1037 extends AbstractC2128 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f3045;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3046;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f3047;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3048;

    public C1037(InterfaceC0579 interfaceC0579) {
        this.f3045 = interfaceC0579;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC5399.m10477(m3867(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        C1758 c1758 = (C1758) interfaceC1506;
        c1758.m3311();
        C1507 c1507 = c1758.f5176;
        if (this.f3048) {
            InterfaceC1504.m2696(c1758, C1599.m2950(0.3f, C1599.f4696), c1507.mo2705(), 0.0f, null, 122);
        } else if (this.f3047 || this.f3046) {
            InterfaceC1504.m2696(c1758, C1599.m2950(0.1f, C1599.f4696), c1507.mo2705(), 0.0f, null, 122);
        }
    }
}
