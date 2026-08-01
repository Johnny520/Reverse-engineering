package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1177;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2616;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6890 extends AbstractC2961 implements InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C6249 f16906;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C6249 f16907;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC1420 f16908;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1177 f16909;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f16910;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f16911;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f16912;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f16913;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f16914;

    public C6890(InterfaceC1420 interfaceC1420, long j) {
        interfaceC1420.getClass();
        this.f16908 = interfaceC1420;
        this.f16914 = j;
        this.f16909 = AbstractC1176.m1572(0.0f);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC6231.m11036(m4427(), null, null, new MiuixIndication$MiuixIndicationInstance$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        C2593 c2593 = (C2593) interfaceC2341;
        c2593.m3871();
        float fFloatValue = ((Number) this.f16909.m1593()).floatValue();
        if (fFloatValue > 0.0f) {
            InterfaceC2339.m3256(interfaceC2341, this.f16914, c2593.f5521.mo3265(), fFloatValue, null, 114);
        }
    }
}
