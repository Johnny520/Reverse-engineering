package p160;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p064.C7348;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8385 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f20797;

    public C8385(int i, List list) {
        this.f20797 = list;
        this.f20796 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        C8376.m13332(AbstractC0900.m710(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new C7348(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8385.class != obj.getClass()) {
            return false;
        }
        C8385 c8385 = (C8385) obj;
        return this.f20796 == c8385.f20796 && AbstractC5227.m9466(this.f20797, c8385.f20797);
    }

    public final int hashCode() {
        return this.f20797.hashCode() + (this.f20796 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f20796 + ", mergedHistory=" + this.f20797 + ')';
    }

    public C8385() {
        this(-1, EmptyList.INSTANCE);
    }
}
