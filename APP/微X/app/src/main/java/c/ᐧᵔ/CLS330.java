// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS330 {
    public final byte FLD1509;
    public final ErrorCorrectionLevel FLD1510;
    public static final int[][] FLD1511;

    static {
        CLS330.FLD1511 = new int[][]{new int[]{0x5412, 0}, new int[]{20773, 1}, new int[]{0x5E7C, 2}, new int[]{0x5B4B, 3}, new int[]{0x45F9, 4}, new int[]{0x40CE, 5}, new int[]{0x4F97, 6}, new int[]{0x4AA0, 7}, new int[]{30660, 8}, new int[]{0x72F3, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{0x662F, 12}, new int[]{0x6318, 13}, new int[]{0x6C41, 14}, new int[]{0x6976, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{0xD0C, 22}, new int[]{2107, 23}, new int[]{0x355F, 24}, new int[]{0x3068, 25}, new int[]{0x3F31, 26}, new int[]{0x3A06, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{0x2EDA, 30}, new int[]{0x2BED, 0x1F}};
    }

    public CLS330(int v) {
        this.FLD1510 = ErrorCorrectionLevel.forBits(v >> 3 & 3);
        this.FLD1509 = (byte)(v & 7);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS330 ? this.FLD1510 == ((CLS330)object0).FLD1510 && this.FLD1509 == ((CLS330)object0).FLD1509 : false;
    }

    @Override
    public int hashCode() {
        return this.FLD1510.ordinal() << 3 | this.FLD1509;
    }

    public static CLS330 MTH4755(int v, int v1) {
        int[][] arr2_v = CLS330.FLD1511;
        int v2 = 0x7FFFFFFF;
        int v3 = 0;
        int v4 = 0;
        while(v3 < arr2_v.length) {
            int[] arr_v = arr2_v[v3];
            int v5 = arr_v[0];
            if(v5 != v && v5 != v1) {
                int v6 = CLS330.MTH4756(v, v5);
                if(v6 < v2) {
                    v4 = arr_v[1];
                    v2 = v6;
                }
                if(v != v1) {
                    int v7 = CLS330.MTH4756(v1, v5);
                    if(v7 < v2) {
                        v4 = arr_v[1];
                        v2 = v7;
                    }
                }
                ++v3;
                continue;
            }
            return new CLS330(arr_v[1]);
        }
        return v2 > 3 ? null : new CLS330(v4);
    }

    public static int MTH4756(int v, int v1) {
        return Integer.bitCount(v ^ v1);
    }

    public static CLS330 MTH4757(int v, int v1) {
        CLS330 ᴵⁱ0 = CLS330.MTH4755(v, v1);
        return ᴵⁱ0 == null ? CLS330.MTH4755(v ^ 0x5412, v1 ^ 0x5412) : ᴵⁱ0;
    }

    public byte MTH4758() {
        return this.FLD1509;
    }

    public ErrorCorrectionLevel MTH4759() {
        return this.FLD1510;
    }
}

