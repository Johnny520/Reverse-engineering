package p221;

import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8726 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m13879(int i, long j) {
        int iM13899 = C8727.m13899(j);
        int iM13897 = C8727.m13897(j);
        if (i < iM13899) {
            i = iM13899;
        }
        return i > iM13897 ? iM13897 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m13880(long j, long j2) {
        int iM13900 = C8727.m13900(j);
        int iM13896 = C8727.m13896(j);
        int iM13899 = C8727.m13899(j);
        int iM13897 = C8727.m13897(j);
        int iM139002 = C8727.m13900(j2);
        if (iM139002 < iM13900) {
            iM139002 = iM13900;
        }
        if (iM139002 > iM13896) {
            iM139002 = iM13896;
        }
        int iM138962 = C8727.m13896(j2);
        if (iM138962 >= iM13900) {
            iM13900 = iM138962;
        }
        if (iM13900 <= iM13896) {
            iM13896 = iM13900;
        }
        int iM138992 = C8727.m13899(j2);
        if (iM138992 < iM13899) {
            iM138992 = iM13899;
        }
        if (iM138992 > iM13897) {
            iM138992 = iM13897;
        }
        int iM138972 = C8727.m13897(j2);
        if (iM138972 >= iM13899) {
            iM13899 = iM138972;
        }
        if (iM13899 <= iM13897) {
            iM13897 = iM13899;
        }
        return m13884(iM139002, iM13896, iM138992, iM13897);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m13881(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM13900 = C8727.m13900(j);
        int iM13896 = C8727.m13896(j);
        if (i < iM13900) {
            i = iM13900;
        }
        if (i <= iM13896) {
            iM13896 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM13899 = C8727.m13899(j);
        int iM13897 = C8727.m13897(j);
        if (i2 < iM13899) {
            i2 = iM13899;
        }
        if (i2 <= iM13897) {
            iM13897 = i2;
        }
        return (((long) iM13896) << 32) | (((long) iM13897) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m13882(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        return Opcodes.CONST_METHOD_TYPE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ long m13883(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m13884(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m13884(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC8736.m13919("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m13885(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m13885(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM13882 = m13882(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM138822 = m13882(i6);
        if (iM13882 + iM138822 > 31) {
            m13889(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM138822 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM138822 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM138822 + 33));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13886(int i, long j) {
        int iM13900 = C8727.m13900(j);
        int iM13896 = C8727.m13896(j);
        if (i < iM13900) {
            i = iM13900;
        }
        return i > iM13896 ? iM13896 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Void m13887(int i) {
        throw new IllegalArgumentException(AbstractC0900.m722(i, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m13888(int i, int i2, long j) {
        int iM13900 = C8727.m13900(j) + i;
        if (iM13900 < 0) {
            iM13900 = 0;
        }
        int iM13896 = C8727.m13896(j);
        if (iM13896 != Integer.MAX_VALUE && (iM13896 = iM13896 + i) < 0) {
            iM13896 = 0;
        }
        int iM13899 = C8727.m13899(j) + i2;
        if (iM13899 < 0) {
            iM13899 = 0;
        }
        int iM13897 = C8727.m13897(j);
        return m13884(iM13900, iM13896, iM13899, (iM13897 == Integer.MAX_VALUE || (iM13897 = iM13897 + i2) >= 0) ? iM13897 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13889(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }
}
