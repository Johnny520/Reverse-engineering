package androidx.recyclerview.widget;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2499 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2498 c2498 = (C2498) obj;
        C2498 c24982 = (C2498) obj2;
        RecyclerView recyclerView = c2498.f7482;
        if ((recyclerView == null) == (c24982.f7482 == null)) {
            boolean z = c2498.f7485;
            if (z == c24982.f7485) {
                int i = c24982.f7484 - c2498.f7484;
                if (i != 0) {
                    return i;
                }
                int i2 = c2498.f7483 - c24982.f7483;
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
