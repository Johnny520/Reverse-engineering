package p205;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7897 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m13320(int i, long j) {
        int iM13340 = C7898.m13340(j);
        int iM13338 = C7898.m13338(j);
        if (i < iM13340) {
            i = iM13340;
        }
        return i > iM13338 ? iM13338 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m13321(long j, long j2) {
        int iM13341 = C7898.m13341(j);
        int iM13337 = C7898.m13337(j);
        int iM13340 = C7898.m13340(j);
        int iM13338 = C7898.m13338(j);
        int iM133412 = C7898.m13341(j2);
        if (iM133412 < iM13341) {
            iM133412 = iM13341;
        }
        if (iM133412 > iM13337) {
            iM133412 = iM13337;
        }
        int iM133372 = C7898.m13337(j2);
        if (iM133372 >= iM13341) {
            iM13341 = iM133372;
        }
        if (iM13341 <= iM13337) {
            iM13337 = iM13341;
        }
        int iM133402 = C7898.m13340(j2);
        if (iM133402 < iM13340) {
            iM133402 = iM13340;
        }
        if (iM133402 > iM13338) {
            iM133402 = iM13338;
        }
        int iM133382 = C7898.m13338(j2);
        if (iM133382 >= iM13340) {
            iM13340 = iM133382;
        }
        if (iM13340 <= iM13338) {
            iM13338 = iM13340;
        }
        return m13325(iM133412, iM13337, iM133402, iM13338);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m13322(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM13341 = C7898.m13341(j);
        int iM13337 = C7898.m13337(j);
        if (i < iM13341) {
            i = iM13341;
        }
        if (i <= iM13337) {
            iM13337 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM13340 = C7898.m13340(j);
        int iM13338 = C7898.m13338(j);
        if (i2 < iM13340) {
            i2 = iM13340;
        }
        if (i2 <= iM13338) {
            iM13338 = i2;
        }
        return (((long) iM13337) << 32) | (((long) iM13338) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m13323(int i) {
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
    public static /* synthetic */ long m13324(int i, int i2, int i3, int i4, int i5) {
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
        return m13325(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m13325(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC7907.m13360("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m13326(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long m13326(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM13323 = m13323(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM133232 = m13323(i6);
        if (iM13323 + iM133232 > 31) {
            m13330(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM133232 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM133232 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM133232 + 33));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m13327(int i, long j) {
        int iM13341 = C7898.m13341(j);
        int iM13337 = C7898.m13337(j);
        if (i < iM13341) {
            i = iM13341;
        }
        return i > iM13337 ? iM13337 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Void m13328(int i) {
        throw new IllegalArgumentException(AbstractC0053.m162(i, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m13329(int i, int i2, long j) {
        int iM13341 = C7898.m13341(j) + i;
        if (iM13341 < 0) {
            iM13341 = 0;
        }
        int iM13337 = C7898.m13337(j);
        if (iM13337 != Integer.MAX_VALUE && (iM13337 = iM13337 + i) < 0) {
            iM13337 = 0;
        }
        int iM13340 = C7898.m13340(j) + i2;
        if (iM13340 < 0) {
            iM13340 = 0;
        }
        int iM13338 = C7898.m13338(j);
        return m13325(iM13341, iM13337, iM13340, (iM13338 == Integer.MAX_VALUE || (iM13338 = iM13338 + i2) >= 0) ? iM13338 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13330(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }
}
