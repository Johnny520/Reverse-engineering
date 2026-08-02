package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class al1 {
    /* JADX INFO: renamed from: a */
    public static final void m193a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m195c(i, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m194b(List list, int i, int i2) {
        if (i > i2) {
            m198f(i, i2);
        }
        if (i < 0) {
            m196d(i);
        }
        if (i2 > list.size()) {
            m197e(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m195c(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    /* JADX INFO: renamed from: d */
    private static final void m196d(int i) {
        throw new IndexOutOfBoundsException(hk1.m2208g(i, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m197e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m198f(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
