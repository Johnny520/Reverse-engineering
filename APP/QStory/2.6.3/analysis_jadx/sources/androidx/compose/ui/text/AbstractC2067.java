package androidx.compose.ui.text;

import androidx.window.area.AbstractC2567;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2068 f6127 = new C2068("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3802(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m3803(C2068 c2068, int i, int i2, C2057 c2057) {
        List list;
        if (i == i2 || (list = c2068.f6131) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c2068.f6129.length()) {
            if (c2057 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c2057.invoke(((C2050) obj).f6077)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            C2050 c2050 = (C2050) list.get(i3);
            if (c2057 != null ? ((Boolean) c2057.invoke(c2050.f6077)).booleanValue() : true) {
                int i4 = c2050.f6076;
                int i5 = c2050.f6075;
                if (m3802(i, i2, i4, i5)) {
                    arrayList2.add(new C2050(c2050.f6074, AbstractC2567.m5090(c2050.f6076, i, i2) - i, (InterfaceC2053) c2050.f6077, AbstractC2567.m5090(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }
}
