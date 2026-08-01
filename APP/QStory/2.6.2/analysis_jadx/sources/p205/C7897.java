package p205;

import androidx.activity.AbstractC0053;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21868;

    public /* synthetic */ C7897(long j) {
        this.f21868 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13303(long j) {
        int i = (int) (3 & j);
        int iM11541 = (1 << AbstractC6136.m11541((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iM11541;
        int i3 = ((int) (j >> 33)) & iM11541;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13304(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m13305(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << AbstractC6136.m11541((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13306(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13307(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m13308(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = m13313(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m13309(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m13312(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m13310(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC7906.m13332("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC7896.m13298(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m13309(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int iM11541 = i2 & ((1 << AbstractC6136.m11541((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iM11541 == 0) {
            return Integer.MAX_VALUE;
        }
        return iM11541 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13310(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m13311(long j) {
        int iM13309 = m13309(j);
        String strValueOf = iM13309 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM13309);
        int iM13310 = m13310(j);
        String strValueOf2 = iM13310 != Integer.MAX_VALUE ? String.valueOf(iM13310) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m13313(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m13312(j));
        sb.append(", maxHeight = ");
        return AbstractC0053.m155(sb, strValueOf2, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m13312(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m13313(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << AbstractC6136.m11541((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7897) {
            return this.f21868 == ((C7897) obj).f21868;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21868);
    }

    public final String toString() {
        return m13311(this.f21868);
    }
}
