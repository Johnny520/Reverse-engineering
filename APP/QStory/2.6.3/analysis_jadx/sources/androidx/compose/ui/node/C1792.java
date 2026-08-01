package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1705;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1698;
import net.bytebuddy.asm.Advice;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicMinMax f5231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight f5232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1698 f5233;

    public C1792(InterfaceC1698 interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.f5233 = interfaceC1698;
        this.f5231 = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.f5232 = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        return this.f5233.mo3054(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3055(long j) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        int iM13337 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
        InterfaceC1698 interfaceC1698 = this.f5233;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = this.f5232;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.f5231;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight2 == nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
            int iMo3058 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3058(C7898.m13338(j)) : interfaceC1698.mo3059(C7898.m13338(j));
            if (C7898.m13334(j)) {
                iM13337 = C7898.m13338(j);
            }
            return new C1705(iMo3058, iM13337, 2);
        }
        int iMo3057 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3057(C7898.m13337(j)) : interfaceC1698.mo3054(C7898.m13337(j));
        if (C7898.m13333(j)) {
            iM13337 = C7898.m13337(j);
        }
        return new C1705(iM13337, iMo3057, 2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3056() {
        return this.f5233.mo3056();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        return this.f5233.mo3057(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        return this.f5233.mo3058(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        return this.f5233.mo3059(i);
    }
}
