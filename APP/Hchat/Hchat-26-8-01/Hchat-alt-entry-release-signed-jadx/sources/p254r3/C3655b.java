package p254r3;

import gg.AbstractC1416l;
import java.util.List;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import tf.C4173t;

/* JADX INFO: renamed from: r3.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3655b {

    /* JADX INFO: renamed from: a */
    public final List f11855a;

    /* JADX INFO: renamed from: b */
    public final int f11856b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3655b(int i9, List list) {
        this.f11855a = list;
        this.f11856b = i9;
        if (list.isEmpty() && i9 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i9 >= 0 && i9 < size) {
                return;
            }
        }
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbM2257t.append(AbstractC0000a.m45X(list));
        sbM2257t.append("'.");
        throw new IllegalArgumentException(sbM2257t.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3655b.class != obj.getClass()) {
            return false;
        }
        C3655b c3655b = (C3655b) obj;
        return this.f11856b == c3655b.f11856b && AbstractC1416l.m3825a(this.f11855a, c3655b.f11855a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11855a.hashCode() + (this.f11856b * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f11856b + ", mergedHistory=" + this.f11855a + ')';
    }

    public C3655b() {
        this(-1, C4173t.f13710g);
    }
}
