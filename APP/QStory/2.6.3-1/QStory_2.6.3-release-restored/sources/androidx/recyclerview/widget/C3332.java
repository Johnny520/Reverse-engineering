package androidx.recyclerview.widget;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3332 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3331 c3331 = (C3331) obj;
        C3331 c33312 = (C3331) obj2;
        RecyclerView recyclerView = c3331.f7827;
        if ((recyclerView == null) == (c33312.f7827 == null)) {
            boolean z = c3331.f7830;
            if (z == c33312.f7830) {
                int i = c33312.f7829 - c3331.f7829;
                if (i != 0) {
                    return i;
                }
                int i2 = c3331.f7828 - c33312.f7828;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (recyclerView != null) {
            return -1;
        }
        return 1;
    }
}
