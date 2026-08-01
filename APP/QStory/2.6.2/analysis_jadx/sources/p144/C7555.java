package p144;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p048.C6518;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f20457;

    public C7555(int i, List list) {
        this.f20457 = list;
        this.f20456 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        C7546.m12744(AbstractC0053.m148(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new C6518(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7555.class != obj.getClass()) {
            return false;
        }
        C7555 c7555 = (C7555) obj;
        return this.f20456 == c7555.f20456 && AbstractC4394.m8917(this.f20457, c7555.f20457);
    }

    public final int hashCode() {
        return this.f20457.hashCode() + (this.f20456 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f20456 + ", mergedHistory=" + this.f20457 + ')';
    }

    public C7555() {
        this(-1, EmptyList.INSTANCE);
    }
}
