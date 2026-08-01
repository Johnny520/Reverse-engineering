package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1826;
import androidx.compose.ui.platform.C1894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1650 extends AbstractC1630 {
    @Override // androidx.compose.ui.input.pointer.AbstractC1630
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final boolean mo3003(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    @Override // androidx.compose.ui.input.pointer.AbstractC1630
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo3004(InterfaceC1641 interfaceC1641) {
        InterfaceC1645 interfaceC1645 = (InterfaceC1645) AbstractC1785.m3356(this, AbstractC1902.f5581);
        if (interfaceC1645 != null) {
            C1894 c1894 = (C1894) interfaceC1645;
            if (interfaceC1641 == null) {
                InterfaceC1641.f4802.getClass();
                interfaceC1641 = AbstractC1646.f4826;
            }
            C1826.f5318.m3459(c1894.f5561, interfaceC1641);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final /* bridge */ /* synthetic */ Object mo1359() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
