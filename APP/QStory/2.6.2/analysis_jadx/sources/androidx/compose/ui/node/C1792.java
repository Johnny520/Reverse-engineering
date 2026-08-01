package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1705;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1698;
import net.bytebuddy.asm.Advice;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicMinMax f5230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight f5231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1698 f5232;

    public C1792(InterfaceC1698 interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.f5232 = interfaceC1698;
        this.f5230 = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.f5231 = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3044(int i) {
        return this.f5232.mo3044(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3045(long j) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        int iM13309 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
        InterfaceC1698 interfaceC1698 = this.f5232;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = this.f5231;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.f5230;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight2 == nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
            int iMo3048 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3048(C7897.m13310(j)) : interfaceC1698.mo3049(C7897.m13310(j));
            if (C7897.m13306(j)) {
                iM13309 = C7897.m13310(j);
            }
            return new C1705(iMo3048, iM13309, 2);
        }
        int iMo3047 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3047(C7897.m13309(j)) : interfaceC1698.mo3044(C7897.m13309(j));
        if (C7897.m13305(j)) {
            iM13309 = C7897.m13309(j);
        }
        return new C1705(iM13309, iMo3047, 2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3046() {
        return this.f5232.mo3046();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3047(int i) {
        return this.f5232.mo3047(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3048(int i) {
        return this.f5232.mo3048(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3049(int i) {
        return this.f5232.mo3049(i);
    }
}
