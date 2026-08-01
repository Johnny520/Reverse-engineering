package p221;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8727 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22210;

    public /* synthetic */ C8727(long j) {
        this.f22210 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13890(long j) {
        int i = (int) (3 & j);
        int iM12133 = (1 << AbstractC7012.m12133((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iM12133;
        int i3 = ((int) (j >> 33)) & iM12133;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13891(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m13892(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << AbstractC7012.m12133((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13893(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13894(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m13895(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = m13900(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m13896(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m13899(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m13897(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC8736.m13919("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC8726.m13885(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m13896(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int iM12133 = i2 & ((1 << AbstractC7012.m12133((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iM12133 == 0) {
            return Integer.MAX_VALUE;
        }
        return iM12133 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13897(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m13898(long j) {
        int iM13896 = m13896(j);
        String strValueOf = iM13896 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM13896);
        int iM13897 = m13897(j);
        String strValueOf2 = iM13897 != Integer.MAX_VALUE ? String.valueOf(iM13897) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m13900(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m13899(j));
        sb.append(", maxHeight = ");
        return AbstractC0900.m708(sb, strValueOf2, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m13899(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m13900(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << AbstractC7012.m12133((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8727) {
            return this.f22210 == ((C8727) obj).f22210;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22210);
    }

    public final String toString() {
        return m13898(this.f22210);
    }
}
