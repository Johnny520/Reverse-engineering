package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2068 f6126 = new C2068("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3792(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m3793(C2068 c2068, int i, int i2, C2057 c2057) {
        List list;
        if (i == i2 || (list = c2068.f6130) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c2068.f6128.length()) {
            if (c2057 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c2057.invoke(((C2050) obj).f6076)).booleanValue()) {
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
            if (c2057 != null ? ((Boolean) c2057.invoke(c2050.f6076)).booleanValue() : true) {
                int i4 = c2050.f6075;
                int i5 = c2050.f6074;
                if (m3792(i, i2, i4, i5)) {
                    arrayList2.add(new C2050(c2050.f6073, AbstractC6087.m11420(c2050.f6075, i, i2) - i, (InterfaceC2053) c2050.f6076, AbstractC6087.m11420(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }
}
