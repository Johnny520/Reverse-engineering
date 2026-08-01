package androidx.compose.p001ui.text;

import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2901 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2902 f6472 = new C2902("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m4362(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m4363(C2902 c2902, int i, int i2, C2891 c2891) {
        List list;
        if (i == i2 || (list = c2902.f6476) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c2902.f6474.length()) {
            if (c2891 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c2891.invoke(((C2884) obj).f6422)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            C2884 c2884 = (C2884) list.get(i3);
            if (c2891 != null ? ((Boolean) c2891.invoke(c2884.f6422)).booleanValue() : true) {
                int i4 = c2884.f6421;
                int i5 = c2884.f6420;
                if (m4362(i, i2, i4, i5)) {
                    arrayList2.add(new C2884(c2884.f6419, AbstractC3400.m5650(c2884.f6421, i, i2) - i, (InterfaceC2887) c2884.f6422, AbstractC3400.m5650(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }
}
