// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS324 {
    public static final int[][] FLD1531;
    public final ErrorCorrectionLevel FLD1532;
    public final byte FLD1533;

    static {
        CLS324.FLD1531 = new int[][]{new int[]{0x5412, 0}, new int[]{20773, 1}, new int[]{0x5E7C, 2}, new int[]{0x5B4B, 3}, new int[]{0x45F9, 4}, new int[]{0x40CE, 5}, new int[]{0x4F97, 6}, new int[]{0x4AA0, 7}, new int[]{30660, 8}, new int[]{0x72F3, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{0x662F, 12}, new int[]{0x6318, 13}, new int[]{0x6C41, 14}, new int[]{0x6976, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{0xD0C, 22}, new int[]{2107, 23}, new int[]{0x355F, 24}, new int[]{0x3068, 25}, new int[]{0x3F31, 26}, new int[]{0x3A06, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{0x2EDA, 30}, new int[]{0x2BED, 0x1F}};
    }

    public CLS324(int v) {
        this.FLD1532 = ErrorCorrectionLevel.forBits(v >> 3 & 3);
        this.FLD1533 = (byte)(v & 7);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS324 ? this.FLD1532 == ((CLS324)object0).FLD1532 && this.FLD1533 == ((CLS324)object0).FLD1533 : false;
    }

    @Override
    public int hashCode() {
        return this.FLD1532.ordinal() << 3 | this.FLD1533;
    }

    public byte MTH4724() {
        return this.FLD1533;
    }

    public static int MTH4725(int v, int v1) {
        return Integer.bitCount(v ^ v1);
    }

    public ErrorCorrectionLevel MTH4726() {
        return this.FLD1532;
    }

    public static CLS324 MTH4727(int v, int v1) {
        CLS324 ˋʼ0 = CLS324.MTH4728(v, v1);
        return ˋʼ0 == null ? CLS324.MTH4728(v ^ 0x5412, v1 ^ 0x5412) : ˋʼ0;
    }

    public static CLS324 MTH4728(int v, int v1) {
        int[][] arr2_v = CLS324.FLD1531;
        int v2 = 0x7FFFFFFF;
        int v3 = 0;
        int v4 = 0;
        while(v3 < arr2_v.length) {
            int[] arr_v = arr2_v[v3];
            int v5 = arr_v[0];
            if(v5 != v && v5 != v1) {
                int v6 = CLS324.MTH4725(v, v5);
                if(v6 < v2) {
                    v4 = arr_v[1];
                    v2 = v6;
                }
                if(v != v1) {
                    int v7 = CLS324.MTH4725(v1, v5);
                    if(v7 < v2) {
                        v4 = arr_v[1];
                        v2 = v7;
                    }
                }
                ++v3;
                continue;
            }
            return new CLS324(arr_v[1]);
        }
        return v2 > 3 ? null : new CLS324(v4);
    }
}

