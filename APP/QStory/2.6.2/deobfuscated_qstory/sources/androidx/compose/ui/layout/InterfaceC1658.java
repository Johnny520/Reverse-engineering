package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;
import p205.AbstractC7896;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1658 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    default int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1654((InterfaceC1698) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height, 1));
        }
        return mo1105(new C1690(interfaceC1699, interfaceC1699.getLayoutDirection()), arrayList, AbstractC7896.m13296(0, i, 0, 0, 13)).mo1464();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1654((InterfaceC1698) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width, 1));
        }
        return mo1105(new C1690(interfaceC1699, interfaceC1699.getLayoutDirection()), arrayList, AbstractC7896.m13296(0, 0, 0, i, 7)).mo1463();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    default int mo1106(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1654((InterfaceC1698) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width, 1));
        }
        return mo1105(new C1690(interfaceC1699, interfaceC1699.getLayoutDirection()), arrayList, AbstractC7896.m13296(0, 0, 0, i, 7)).mo1463();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    default int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1654((InterfaceC1698) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height, 1));
        }
        return mo1105(new C1690(interfaceC1699, interfaceC1699.getLayoutDirection()), arrayList, AbstractC7896.m13296(0, i, 0, 0, 13)).mo1464();
    }
}
