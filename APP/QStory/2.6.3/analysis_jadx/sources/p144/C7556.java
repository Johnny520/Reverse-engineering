package p144;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p048.C6519;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f20452;

    public C7556(int i, List list) {
        this.f20452 = list;
        this.f20451 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        C7547.m12773(AbstractC0053.m150(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new C6519(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7556.class != obj.getClass()) {
            return false;
        }
        C7556 c7556 = (C7556) obj;
        return this.f20451 == c7556.f20451 && AbstractC4395.m8907(this.f20452, c7556.f20452);
    }

    public final int hashCode() {
        return this.f20452.hashCode() + (this.f20451 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f20451 + ", mergedHistory=" + this.f20452 + ')';
    }

    public C7556() {
        this(-1, EmptyList.INSTANCE);
    }
}
