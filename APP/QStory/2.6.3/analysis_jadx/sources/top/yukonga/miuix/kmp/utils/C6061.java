package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0331;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1781;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6061 extends AbstractC2128 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C5417 f16561;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C5417 f16562;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC0579 f16563;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C0331 f16564;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f16565;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f16566;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f16567;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f16568;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f16569;

    public C6061(InterfaceC0579 interfaceC0579, long j) {
        interfaceC0579.getClass();
        this.f16563 = interfaceC0579;
        this.f16569 = j;
        this.f16564 = AbstractC0330.m1012(0.0f);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC5399.m10477(m3867(), null, null, new MiuixIndication$MiuixIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        C1758 c1758 = (C1758) interfaceC1506;
        c1758.m3311();
        float fFloatValue = ((Number) this.f16564.m1033()).floatValue();
        if (fFloatValue > 0.0f) {
            InterfaceC1504.m2696(interfaceC1506, this.f16569, c1758.f5176.mo2705(), fFloatValue, null, 114);
        }
    }
}
