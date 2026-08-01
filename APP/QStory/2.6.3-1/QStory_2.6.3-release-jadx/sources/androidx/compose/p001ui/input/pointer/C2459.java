package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.C2729;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459 extends AbstractC2465 {
    @Override // androidx.compose.p001ui.input.pointer.AbstractC2465
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final boolean mo3563(int i) {
        return i == 3 || i == 4;
    }

    @Override // androidx.compose.p001ui.input.pointer.AbstractC2465
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void mo3564(InterfaceC2476 interfaceC2476) {
        InterfaceC2480 interfaceC2480 = (InterfaceC2480) AbstractC2620.m3916(this, AbstractC2737.f5926);
        if (interfaceC2480 != null) {
            ((C2729) interfaceC2480).f5907 = interfaceC2476;
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final /* bridge */ /* synthetic */ Object mo1919() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
