package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.InterfaceC2957;
import androidx.compose.p001ui.node.AbstractC2589;
import p221.AbstractC8726;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2503 extends InterfaceC2957 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    default int m3655(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo2432(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2489(interfaceC2533, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height, 0), AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    default int m3656(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo2432(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2489(interfaceC2533, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width, 0), AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    default int m3657(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo2432(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2489(interfaceC2533, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height, 0), AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    default int m3658(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return mo2432(new C2525(abstractC2589, abstractC2589.getLayoutDirection()), new C2489(interfaceC2533, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width, 0), AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    InterfaceC2492 mo2432(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j);
}
