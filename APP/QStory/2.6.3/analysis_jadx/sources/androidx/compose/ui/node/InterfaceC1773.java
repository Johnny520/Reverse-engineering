package androidx.compose.ui.node;

import androidx.compose.ui.layout.C1690;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import p205.AbstractC7897;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1773 extends InterfaceC1787 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    default int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1102(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1792(interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), AbstractC7897.m13324(0, i, 0, 0, 13)).mo1474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    default int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1102(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1792(interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), AbstractC7897.m13324(0, 0, 0, i, 7)).mo1473();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1102(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1792(interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height), AbstractC7897.m13324(0, i, 0, 0, 13)).mo1474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default int mo1077(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1102(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1792(interfaceC1698, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width), AbstractC7897.m13324(0, 0, 0, i, 7)).mo1473();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j);
}
