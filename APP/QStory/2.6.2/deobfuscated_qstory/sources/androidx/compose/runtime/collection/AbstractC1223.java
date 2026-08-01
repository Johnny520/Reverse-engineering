package androidx.compose.runtime.collection;

import androidx.activity.AbstractC0053;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1223 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private static final void m2027(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private static final void m2028(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private static final void m2029(int i) {
        throw new IndexOutOfBoundsException(AbstractC0053.m161(i, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private static final void m2030(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2031(List list, int i, int i2) {
        if (i > i2) {
            m2027(i, i2);
        }
        if (i < 0) {
            m2029(i);
        }
        if (i2 > list.size()) {
            m2028(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2032(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m2030(i, size);
        }
    }
}
