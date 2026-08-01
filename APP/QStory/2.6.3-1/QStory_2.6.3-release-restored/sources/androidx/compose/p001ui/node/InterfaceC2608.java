package androidx.compose.p001ui.node;

import androidx.compose.p001ui.layout.C2525;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import p221.AbstractC8726;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2608 extends InterfaceC2622 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    default int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo1662(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2627(interfaceC2533, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    default int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo1662(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2627(interfaceC2533, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo1662(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2627(interfaceC2533, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo1662(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2627(interfaceC2533, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j);
}
