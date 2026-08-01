package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class si0 {

    /* JADX INFO: renamed from: a */
    public final List f5771a;

    /* JADX INFO: renamed from: b */
    public final int f5772b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public si0(int i, List list) {
        this.f5771a = list;
        this.f5772b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + o30.m2777q(list) + "'.").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || si0.class != obj.getClass()) {
            return false;
        }
        si0 si0Var = (si0) obj;
        return this.f5772b == si0Var.f5772b && p30.m3002l(this.f5771a, si0Var.f5771a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5771a.hashCode() + (this.f5772b * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f5772b + ", mergedHistory=" + this.f5771a + ')';
    }

    public si0() {
        this(-1, C0294hs.f2354d);
    }
}
