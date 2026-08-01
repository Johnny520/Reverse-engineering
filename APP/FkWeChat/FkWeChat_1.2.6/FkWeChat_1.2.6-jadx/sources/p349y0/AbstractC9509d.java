package p349y0;

import java.util.List;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9509d {
    /* JADX INFO: renamed from: a */
    public static final void m37057a(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            m37059c(i10, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m37058b(List list, int i10, int i11) {
        if (i10 > i11) {
            m37062f(i10, i11);
        }
        if (i10 < 0) {
            m37060d(i10);
        }
        if (i11 > list.size()) {
            m37061e(i11, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m37059c(int i10, int i11) {
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + i11 + " elements.");
    }

    /* JADX INFO: renamed from: d */
    private static final void m37060d(int i10) {
        throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
    }

    /* JADX INFO: renamed from: e */
    private static final void m37061e(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m37062f(int i10, int i11) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }
}
