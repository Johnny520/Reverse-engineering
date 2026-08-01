package androidx.compose.ui.layout;

import androidx.compose.ui.InterfaceC2124;
import androidx.compose.ui.node.AbstractC1754;
import p205.AbstractC7897;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1668 extends InterfaceC2124 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    default int m3095(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1872(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1654(interfaceC1698, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height, 0), AbstractC7897.m13324(0, i, 0, 0, 13)).mo1474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    default int m3096(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1872(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1654(interfaceC1698, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width, 0), AbstractC7897.m13324(0, 0, 0, i, 7)).mo1473();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    default int m3097(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1872(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1654(interfaceC1698, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height, 0), AbstractC7897.m13324(0, i, 0, 0, 13)).mo1474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    default int m3098(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return mo1872(new C1690(abstractC1754, abstractC1754.getLayoutDirection()), new C1654(interfaceC1698, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width, 0), AbstractC7897.m13324(0, 0, 0, i, 7)).mo1473();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    InterfaceC1657 mo1872(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j);
}
