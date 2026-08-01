package p205;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7896 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m13292(int i, long j) {
        int iM13312 = C7897.m13312(j);
        int iM13310 = C7897.m13310(j);
        if (i < iM13312) {
            i = iM13312;
        }
        return i > iM13310 ? iM13310 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m13293(long j, long j2) {
        int iM13313 = C7897.m13313(j);
        int iM13309 = C7897.m13309(j);
        int iM13312 = C7897.m13312(j);
        int iM13310 = C7897.m13310(j);
        int iM133132 = C7897.m13313(j2);
        if (iM133132 < iM13313) {
            iM133132 = iM13313;
        }
        if (iM133132 > iM13309) {
            iM133132 = iM13309;
        }
        int iM133092 = C7897.m13309(j2);
        if (iM133092 >= iM13313) {
            iM13313 = iM133092;
        }
        if (iM13313 <= iM13309) {
            iM13309 = iM13313;
        }
        int iM133122 = C7897.m13312(j2);
        if (iM133122 < iM13312) {
            iM133122 = iM13312;
        }
        if (iM133122 > iM13310) {
            iM133122 = iM13310;
        }
        int iM133102 = C7897.m13310(j2);
        if (iM133102 >= iM13312) {
            iM13312 = iM133102;
        }
        if (iM13312 <= iM13310) {
            iM13310 = iM13312;
        }
        return m13297(iM133132, iM13309, iM133122, iM13310);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m13294(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM13313 = C7897.m13313(j);
        int iM13309 = C7897.m13309(j);
        if (i < iM13313) {
            i = iM13313;
        }
        if (i <= iM13309) {
            iM13309 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM13312 = C7897.m13312(j);
        int iM13310 = C7897.m13310(j);
        if (i2 < iM13312) {
            i2 = iM13312;
        }
        if (i2 <= iM13310) {
            iM13310 = i2;
        }
        return (((long) iM13309) << 32) | (((long) iM13310) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m13295(int i) {
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
    public static /* synthetic */ long m13296(int i, int i2, int i3, int i4, int i5) {
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
        return m13297(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m13297(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC7906.m13332("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m13298(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m13298(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM13295 = m13295(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM132952 = m13295(i6);
        if (iM13295 + iM132952 > 31) {
            m13302(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM132952 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM132952 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM132952 + 33));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13299(int i, long j) {
        int iM13313 = C7897.m13313(j);
        int iM13309 = C7897.m13309(j);
        if (i < iM13313) {
            i = iM13313;
        }
        return i > iM13309 ? iM13309 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Void m13300(int i) {
        throw new IllegalArgumentException(AbstractC0053.m161(i, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m13301(int i, int i2, long j) {
        int iM13313 = C7897.m13313(j) + i;
        if (iM13313 < 0) {
            iM13313 = 0;
        }
        int iM13309 = C7897.m13309(j);
        if (iM13309 != Integer.MAX_VALUE && (iM13309 = iM13309 + i) < 0) {
            iM13309 = 0;
        }
        int iM13312 = C7897.m13312(j) + i2;
        if (iM13312 < 0) {
            iM13312 = 0;
        }
        int iM13310 = C7897.m13310(j);
        return m13297(iM13313, iM13309, iM13312, (iM13310 == Integer.MAX_VALUE || (iM13310 = iM13310 + i2) >= 0) ? iM13310 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13302(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }
}
