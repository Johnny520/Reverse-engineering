package p205;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21865;

    public /* synthetic */ C7898(long j) {
        this.f21865 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13331(long j) {
        int i = (int) (3 & j);
        int iM11574 = (1 << AbstractC6183.m11574((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iM11574;
        int i3 = ((int) (j >> 33)) & iM11574;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13332(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m13333(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << AbstractC6183.m11574((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13334(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13335(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m13336(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = m13341(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m13337(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m13340(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m13338(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC7907.m13360("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC7897.m13326(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m13337(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int iM11574 = i2 & ((1 << AbstractC6183.m11574((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iM11574 == 0) {
            return Integer.MAX_VALUE;
        }
        return iM11574 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13338(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m13339(long j) {
        int iM13337 = m13337(j);
        String strValueOf = iM13337 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM13337);
        int iM13338 = m13338(j);
        String strValueOf2 = iM13338 != Integer.MAX_VALUE ? String.valueOf(iM13338) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m13341(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m13340(j));
        sb.append(", maxHeight = ");
        return AbstractC0053.m148(sb, strValueOf2, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m13340(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m13341(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << AbstractC6183.m11574((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7898) {
            return this.f21865 == ((C7898) obj).f21865;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21865);
    }

    public final String toString() {
        return m13339(this.f21865);
    }
}
