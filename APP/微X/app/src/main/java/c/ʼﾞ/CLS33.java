// Decompiled by JEB v5.42.0.202606242140

package c.ʼﾞ;

import c.ˎˊ.CLS118;
import c.ᐧᵔ.CLS329;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS33 {
    public static final int[][] FLD133;
    public static final int[][] FLD134;
    public static final int[][] FLD135;
    public static final int[][] FLD136;

    static {
        CLS33.FLD134 = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        CLS33.FLD133 = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        CLS33.FLD135 = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 0x20, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 0x30, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 0x20, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 0x72, -1, -1}, new int[]{6, 34, 62, 90, 0x76, -1, -1}, new int[]{6, 26, 50, 74, 98, 0x7A, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 0x86, -1}, new int[]{6, 34, 60, 86, 0x70, 0x8A, -1}, new int[]{6, 30, 58, 86, 0x72, 0x8E, -1}, new int[]{6, 34, 62, 90, 0x76, 0x92, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}};
        CLS33.FLD136 = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    }

    public static int MTH841(int v, int v1) {
        if(v1 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int v2 = CLS33.MTH847(v1);
        int v3;
        for(v3 = v << v2 - 1; CLS33.MTH847(v3) >= v2; v3 ^= v1 << CLS33.MTH847(v3) - v2) {
        }
        return v3;
    }

    public static void MTH842(ErrorCorrectionLevel errorCorrectionLevel0, int v, CLS32 ʻᵢ0) {
        CLS118 ˆٴ0 = new CLS118();
        CLS33.MTH849(errorCorrectionLevel0, v, ˆٴ0);
        for(int v1 = 0; v1 < ˆٴ0.MTH2347(); ++v1) {
            boolean z = ˆٴ0.MTH2357(ˆٴ0.MTH2347() - 1 - v1);
            int[] arr_v = CLS33.FLD136[v1];
            ʻᵢ0.MTH837(arr_v[0], arr_v[1], z);
            if(v1 < 8) {
                ʻᵢ0.MTH837(ʻᵢ0.MTH834() - v1 - 1, 8, z);
            }
            else {
                ʻᵢ0.MTH837(8, ʻᵢ0.MTH839() - 7 + (v1 - 8), z);
            }
        }
    }

    public static void MTH843(CLS32 ʻᵢ0) {
        if(ʻᵢ0.MTH833(8, ʻᵢ0.MTH839() - 8) == 0) {
            throw new WriterException();
        }
        ʻᵢ0.MTH838(8, ʻᵢ0.MTH839() - 8, 1);
    }

    public static boolean MTH844(int v) {
        return v == -1;
    }

    public static void MTH845(CLS118 ˆٴ0, ErrorCorrectionLevel errorCorrectionLevel0, CLS329 ٴⁱ0, int v, CLS32 ʻᵢ0) {
        CLS33.MTH854(ʻᵢ0);
        CLS33.MTH859(ٴⁱ0, ʻᵢ0);
        CLS33.MTH842(errorCorrectionLevel0, v, ʻᵢ0);
        CLS33.MTH853(ٴⁱ0, ʻᵢ0);
        CLS33.MTH858(ˆٴ0, v, ʻᵢ0);
    }

    public static void MTH846(CLS32 ʻᵢ0) {
        for(int v = 8; v < ʻᵢ0.MTH834() - 8; ++v) {
            int v1 = (v + 1) % 2;
            if(CLS33.MTH844(ʻᵢ0.MTH833(v, 6))) {
                ʻᵢ0.MTH838(v, 6, v1);
            }
            if(CLS33.MTH844(ʻᵢ0.MTH833(6, v))) {
                ʻᵢ0.MTH838(6, v, v1);
            }
        }
    }

    public static int MTH847(int v) {
        return 0x20 - Integer.numberOfLeadingZeros(v);
    }

    public static void MTH848(int v, int v1, CLS32 ʻᵢ0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            for(int v3 = 0; v3 < 7; ++v3) {
                ʻᵢ0.MTH838(v + v3, v1 + v2, CLS33.FLD134[v2][v3]);
            }
        }
    }

    public static void MTH849(ErrorCorrectionLevel errorCorrectionLevel0, int v, CLS118 ˆٴ0) {
        if(!CLS37.MTH889(v)) {
            throw new WriterException("Invalid mask pattern");
        }
        int v1 = errorCorrectionLevel0.getBits() << 3 | v;
        ˆٴ0.MTH2355(v1, 5);
        ˆٴ0.MTH2355(CLS33.MTH841(v1, 0x537), 10);
        CLS118 ˆٴ1 = new CLS118();
        ˆٴ1.MTH2355(0x5412, 15);
        ˆٴ0.MTH2354(ˆٴ1);
        if(ˆٴ0.MTH2347() != 15) {
            throw new WriterException("should not happen but we got: " + ˆٴ0.MTH2347());
        }
    }

    public static void MTH850(CLS329 ٴⁱ0, CLS118 ˆٴ0) {
        ˆٴ0.MTH2355(ٴⁱ0.MTH4745(), 6);
        ˆٴ0.MTH2355(CLS33.MTH841(ٴⁱ0.MTH4745(), 0x1F25), 12);
        if(ˆٴ0.MTH2347() != 18) {
            throw new WriterException("should not happen but we got: " + ˆٴ0.MTH2347());
        }
    }

    public static void MTH851(CLS32 ʻᵢ0) {
        int v = CLS33.FLD134[0].length;
        CLS33.MTH848(0, 0, ʻᵢ0);
        CLS33.MTH848(ʻᵢ0.MTH834() - v, 0, ʻᵢ0);
        CLS33.MTH848(0, ʻᵢ0.MTH834() - v, ʻᵢ0);
        CLS33.MTH856(0, 7, ʻᵢ0);
        CLS33.MTH856(ʻᵢ0.MTH834() - 8, 7, ʻᵢ0);
        CLS33.MTH856(0, ʻᵢ0.MTH834() - 8, ʻᵢ0);
        CLS33.MTH852(7, 0, ʻᵢ0);
        CLS33.MTH852(ʻᵢ0.MTH839() - 8, 0, ʻᵢ0);
        CLS33.MTH852(7, ʻᵢ0.MTH839() - 7, ʻᵢ0);
    }

    public static void MTH852(int v, int v1, CLS32 ʻᵢ0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            int v3 = v1 + v2;
            if(!CLS33.MTH844(ʻᵢ0.MTH833(v, v3))) {
                throw new WriterException();
            }
            ʻᵢ0.MTH838(v, v3, 0);
        }
    }

    public static void MTH853(CLS329 ٴⁱ0, CLS32 ʻᵢ0) {
        if(ٴⁱ0.MTH4745() < 7) {
            return;
        }
        CLS118 ˆٴ0 = new CLS118();
        CLS33.MTH850(ٴⁱ0, ˆٴ0);
        int v = 17;
        for(int v1 = 0; v1 < 6; ++v1) {
            for(int v2 = 0; v2 < 3; ++v2) {
                boolean z = ˆٴ0.MTH2357(v);
                --v;
                ʻᵢ0.MTH837(v1, ʻᵢ0.MTH839() - 11 + v2, z);
                ʻᵢ0.MTH837(ʻᵢ0.MTH839() - 11 + v2, v1, z);
            }
        }
    }

    public static void MTH854(CLS32 ʻᵢ0) {
        ʻᵢ0.MTH835(-1);
    }

    public static void MTH855(CLS329 ٴⁱ0, CLS32 ʻᵢ0) {
        if(ٴⁱ0.MTH4745() < 2) {
            return;
        }
        int[] arr_v = CLS33.FLD135[ٴⁱ0.MTH4745() - 1];
        for(int v = 0; v < arr_v.length; ++v) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                int v2 = arr_v[v];
                int v3 = arr_v[v1];
                if(v3 != -1 && v2 != -1 && CLS33.MTH844(ʻᵢ0.MTH833(v3, v2))) {
                    CLS33.MTH857(v3 - 2, v2 - 2, ʻᵢ0);
                }
            }
        }
    }

    public static void MTH856(int v, int v1, CLS32 ʻᵢ0) {
        for(int v2 = 0; v2 < 8; ++v2) {
            int v3 = v + v2;
            if(!CLS33.MTH844(ʻᵢ0.MTH833(v3, v1))) {
                throw new WriterException();
            }
            ʻᵢ0.MTH838(v3, v1, 0);
        }
    }

    public static void MTH857(int v, int v1, CLS32 ʻᵢ0) {
        for(int v2 = 0; v2 < 5; ++v2) {
            for(int v3 = 0; v3 < 5; ++v3) {
                ʻᵢ0.MTH838(v + v3, v1 + v2, CLS33.FLD133[v2][v3]);
            }
        }
    }

    public static void MTH858(CLS118 ˆٴ0, int v, CLS32 ʻᵢ0) {
        boolean z;
        int v1 = ʻᵢ0.MTH834() - 1;
        int v2 = ʻᵢ0.MTH839() - 1;
        int v3 = 0;
        int v4 = -1;
        while(v1 > 0) {
            if(v1 == 6) {
                v1 = 5;
            }
            while(v2 >= 0 && v2 < ʻᵢ0.MTH839()) {
                for(int v5 = 0; v5 < 2; ++v5) {
                    int v6 = v1 - v5;
                    if(CLS33.MTH844(ʻᵢ0.MTH833(v6, v2))) {
                        if(v3 < ˆٴ0.MTH2347()) {
                            z = ˆٴ0.MTH2357(v3);
                            ++v3;
                        }
                        else {
                            z = false;
                        }
                        if(v != -1 && CLS38.MTH902(v, v6, v2)) {
                            z = !z;
                        }
                        ʻᵢ0.MTH837(v6, v2, z);
                    }
                }
                v2 += v4;
            }
            v4 = -v4;
            v2 += v4;
            v1 -= 2;
        }
        if(v3 != ˆٴ0.MTH2347()) {
            throw new WriterException("Not all bits consumed: " + v3 + '/' + ˆٴ0.MTH2347());
        }
    }

    public static void MTH859(CLS329 ٴⁱ0, CLS32 ʻᵢ0) {
        CLS33.MTH851(ʻᵢ0);
        CLS33.MTH843(ʻᵢ0);
        CLS33.MTH855(ٴⁱ0, ʻᵢ0);
        CLS33.MTH846(ʻᵢ0);
    }
}

