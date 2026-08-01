package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624 extends AbstractC1630 {
    @Override // androidx.compose.ui.input.pointer.AbstractC1630
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final boolean mo2993(int i) {
        return i == 3 || i == 4;
    }

    @Override // androidx.compose.ui.input.pointer.AbstractC1630
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void mo2994(InterfaceC1641 interfaceC1641) {
        InterfaceC1645 interfaceC1645 = (InterfaceC1645) AbstractC1785.m3346(this, AbstractC1902.f5580);
        if (interfaceC1645 != null) {
            ((C1894) interfaceC1645).f5561 = interfaceC1641;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final /* bridge */ /* synthetic */ Object mo1349() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
