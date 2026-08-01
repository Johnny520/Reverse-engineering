package p105V;

import java.util.List;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: V.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1484f {
    /* JADX INFO: renamed from: a */
    public static final void m2765a(int i5, List list) {
        int size = list.size();
        if (i5 < 0 || i5 >= size) {
            m2767c(i5, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2766b(List list, int i5, int i6) {
        if (i5 > i6) {
            m2770f(i5, i6);
        }
        if (i5 < 0) {
            m2768d(i5);
        }
        if (i6 > list.size()) {
            m2769e(i6, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m2767c(int i5, int i6) {
        throw new IndexOutOfBoundsException("Index " + i5 + " is out of bounds. The list has " + i6 + " elements.");
    }

    /* JADX INFO: renamed from: d */
    private static final void m2768d(int i5) {
        throw new IndexOutOfBoundsException(AbstractC0231b.m397h(i5, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m2769e(int i5, int i6) {
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is more than than the list size (" + i6 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m2770f(int i5, int i6) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
    }
}
