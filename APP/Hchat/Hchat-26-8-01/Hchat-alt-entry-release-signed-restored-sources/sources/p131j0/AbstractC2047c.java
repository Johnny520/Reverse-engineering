package p131j0;

import java.util.List;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: j0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2047c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5068a(int i9, List list) {
        int size = list.size();
        if (i9 < 0 || i9 >= size) {
            m5070c(i9, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5069b(List list, int i9, int i10) {
        if (i9 > i10) {
            m5073f(i9, i10);
        }
        if (i9 < 0) {
            m5071d(i9);
        }
        if (i10 > list.size()) {
            m5072e(i10, list.size());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private static final void m5070c(int i9, int i10) {
        throw new IndexOutOfBoundsException(AbstractC0921a.m2248k(i9, i10, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private static final void m5071d(int i9) {
        throw new IndexOutOfBoundsException(AbstractC0921a.m2250m(i9, "fromIndex (", ") is less than 0."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private static final void m5072e(int i9, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + i10 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private static final void m5073f(int i9, int i10) {
        throw new IllegalArgumentException(AbstractC0921a.m2248k(i9, i10, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
