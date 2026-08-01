package androidx.compose.p001ui.layout;

import java.util.ArrayList;
import java.util.List;
import p221.AbstractC8726;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2493 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    default int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C2489((InterfaceC2533) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height, 1));
        }
        return mo1666(new C2525(interfaceC2534, interfaceC2534.getLayoutDirection()), arrayList, AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C2489((InterfaceC2533) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width, 1));
        }
        return mo1666(new C2525(interfaceC2534, interfaceC2534.getLayoutDirection()), arrayList, AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    default int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C2489((InterfaceC2533) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width, 1));
        }
        return mo1666(new C2525(interfaceC2534, interfaceC2534.getLayoutDirection()), arrayList, AbstractC8726.m13883(0, 0, 0, i, 7)).mo2033();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    default int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C2489((InterfaceC2533) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height, 1));
        }
        return mo1666(new C2525(interfaceC2534, interfaceC2534.getLayoutDirection()), arrayList, AbstractC8726.m13883(0, i, 0, 0, 13)).mo2034();
    }
}
