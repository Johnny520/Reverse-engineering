package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2913 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static int m6362(byte[] bArr, int i, byte[] bArr2) {
        int i2;
        int i3;
        int length = bArr2.length;
        if (length <= 47) {
            i3 = i + 1;
            bArr[i] = (byte) (length + 73);
        } else if (length <= 2047) {
            bArr[i] = 121;
            AbstractC2849.m5760(bArr, i + 1, (short) (length + 14336));
            i3 = i + 3;
        } else {
            if (length <= 262143) {
                AbstractC2849.m5762(i, bArr, 2034499584 + length);
                i2 = i + 4;
            } else {
                AbstractC2849.m5760(bArr, i, (short) 31048);
                AbstractC2849.m5762(i + 2, bArr, length);
                i2 = i + 6;
            }
            i3 = i2;
        }
        System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
        return i3 + length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static int m6363(int i, byte[] bArr, int i2) {
        boolean z = i2 <= 15;
        int i3 = i + 1;
        bArr[i] = z ? (byte) (i2 - 108) : (byte) -92;
        return !z ? m6366(i3, bArr, i2) : i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static int m6364(byte[] bArr, int i, float f) {
        int i2 = (int) f;
        if (i2 == f && ((262144 + i2) & (-524288)) == 0) {
            bArr[i] = -74;
            return m6366(i + 1, bArr, i2);
        }
        bArr[i] = -73;
        AbstractC2849.m5762(i + 1, bArr, Float.floatToIntBits(f));
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static int m6365(byte[] bArr, int i, double d) {
        if (d == 0.0d || d == 1.0d) {
            bArr[i] = d == 0.0d ? (byte) -78 : (byte) -77;
            return i + 1;
        }
        if (d >= -2.147483648E9d && d <= 2.147483647E9d) {
            long j = (long) d;
            if (j == d) {
                bArr[i] = -76;
                return m6367(j, bArr, i + 1);
            }
        }
        bArr[i] = -75;
        AbstractC2849.m5749(Double.doubleToLongBits(d), bArr, i + 1);
        return i + 9;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static int m6366(int i, byte[] bArr, int i2) {
        if (((i2 + 16) & (-64)) == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        if (((i2 + 2048) & (-4096)) == 0) {
            AbstractC2849.m5760(bArr, i, (short) (i2 + 14336));
            return i + 2;
        }
        if (((262144 + i2) & (-524288)) == 0) {
            bArr[i] = (byte) ((i2 >> 16) + 68);
            AbstractC2849.m5760(bArr, i + 1, (short) i2);
            return i + 3;
        }
        bArr[i] = 72;
        AbstractC2849.m5762(i + 1, bArr, i2);
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static int m6367(long j, byte[] bArr, int i) {
        if (j >= -8 && j <= 15) {
            int i2 = i + 1;
            bArr[i] = (byte) (j - 32);
            return i2;
        }
        if (((2048 + j) & (-4096)) == 0) {
            AbstractC2849.m5760(bArr, i, (short) (j - 12288));
            return i + 2;
        }
        if (((262144 + j) & (-524288)) == 0) {
            bArr[i] = (byte) ((j >> 16) - 60);
            AbstractC2849.m5760(bArr, i + 1, (short) j);
            return i + 3;
        }
        if (((2147483648L + j) & (-4294967296L)) == 0) {
            bArr[i] = -65;
            AbstractC2849.m5762(i + 1, bArr, (int) j);
            return i + 5;
        }
        bArr[i] = -66;
        AbstractC2849.m5749(j, bArr, i + 1);
        return i + 9;
    }
}
