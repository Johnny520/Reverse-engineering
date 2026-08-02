package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 {

    /* JADX INFO: renamed from: a */
    public final List f4685a;

    /* JADX INFO: renamed from: b */
    public final int f4686b;

    public im1(int i, List list) {
        this.f4685a = list;
        this.f4686b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        c80.m674r(vi0.m5695n(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new c11(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || im1.class != obj.getClass()) {
            return false;
        }
        im1 im1Var = (im1) obj;
        return this.f4686b == im1Var.f4686b && t11.m5086l(this.f4685a, im1Var.f4685a);
    }

    public final int hashCode() {
        return this.f4685a.hashCode() + (this.f4686b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f4686b + ", mergedHistory=" + this.f4685a + ')';
    }

    public im1() {
        this(-1, be0.f819h);
    }
}
