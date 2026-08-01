package androidx.compose.p001ui.node;

import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2540;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2533;
import net.bytebuddy.asm.Advice;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2627 implements InterfaceC2490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicMinMax f5576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight f5577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2533 f5578;

    public C2627(InterfaceC2533 interfaceC2533, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.f5578 = interfaceC2533;
        this.f5576 = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.f5577 = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        return this.f5578.mo3614(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC2559 mo3615(long j) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        int iM13896 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
        InterfaceC2533 interfaceC2533 = this.f5578;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = this.f5577;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.f5576;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight2 == nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
            int iMo3618 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC2533.mo3618(C8727.m13897(j)) : interfaceC2533.mo3619(C8727.m13897(j));
            if (C8727.m13893(j)) {
                iM13896 = C8727.m13897(j);
            }
            return new C2540(iMo3618, iM13896, 2);
        }
        int iMo3617 = nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC2533.mo3617(C8727.m13896(j)) : interfaceC2533.mo3614(C8727.m13896(j));
        if (C8727.m13892(j)) {
            iM13896 = C8727.m13896(j);
        }
        return new C2540(iM13896, iMo3617, 2);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3616() {
        return this.f5578.mo3616();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        return this.f5578.mo3617(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        return this.f5578.mo3618(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        return this.f5578.mo3619(i);
    }
}
