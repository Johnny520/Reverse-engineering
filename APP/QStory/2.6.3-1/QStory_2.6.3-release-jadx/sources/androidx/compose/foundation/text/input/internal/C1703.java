package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.InterfaceC2617;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.platform.InterfaceC2692;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1703 extends AbstractC2961 implements InterfaceC2692, InterfaceC2618, InterfaceC2617, InterfaceC1691 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1698 f2766;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC2230 f2767 = AbstractC2202.m3034(null);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1720 f2768;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1781 f2769;

    public C1703(C1698 c1698, C1781 c1781, C1720 c1720) {
        this.f2766 = c1698;
        this.f2769 = c1781;
        this.f2768 = c1720;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2617
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo2198(AbstractC2629 abstractC2629) {
        ((AbstractC2182) this.f2767).setValue(abstractC2629);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f2766.m2249(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C1698 c1698 = this.f2766;
        if (c1698.f2761 != null) {
            AbstractC8570.m13654("Expected textInputModifierNode to be null");
        }
        c1698.f2761 = this;
    }
}
