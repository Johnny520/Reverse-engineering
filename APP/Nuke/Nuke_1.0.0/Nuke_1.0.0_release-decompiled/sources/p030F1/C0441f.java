package p030F1;

import java.util.List;
import p011B4.AbstractC0231b;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p132a3.C1804d;

/* JADX INFO: renamed from: F1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0441f {

    /* JADX INFO: renamed from: a */
    public final List f1321a;

    /* JADX INFO: renamed from: b */
    public final int f1322b;

    public C0441f(int i5, List list) {
        this.f1321a = list;
        this.f1322b = i5;
        if (list.isEmpty() && i5 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i5 >= 0 && i5 < size) {
                return;
            }
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbM404o.append(new C1804d(0, list.size() - 1, 1));
        sbM404o.append("'.");
        throw new IllegalArgumentException(sbM404o.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0441f.class != obj.getClass()) {
            return false;
        }
        C0441f c0441f = (C0441f) obj;
        return this.f1322b == c0441f.f1322b && AbstractC1665j.m2981a(this.f1321a, c0441f.f1321a);
    }

    public final int hashCode() {
        return this.f1321a.hashCode() + (this.f1322b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f1322b + ", mergedHistory=" + this.f1321a + ')';
    }

    public C0441f() {
        this(-1, C0981u.f3047d);
    }
}
