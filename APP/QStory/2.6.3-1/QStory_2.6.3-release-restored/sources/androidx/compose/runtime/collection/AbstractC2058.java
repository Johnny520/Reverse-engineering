package androidx.compose.runtime.collection;

import androidx.activity.AbstractC0900;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.runtime.collection.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2058 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private static final void m2597(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private static final void m2598(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private static final void m2599(int i) {
        throw new IndexOutOfBoundsException(AbstractC0900.m722(i, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private static final void m2600(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2601(List list, int i, int i2) {
        if (i > i2) {
            m2597(i, i2);
        }
        if (i < 0) {
            m2599(i);
        }
        if (i2 > list.size()) {
            m2598(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2602(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m2600(i, size);
        }
    }
}
