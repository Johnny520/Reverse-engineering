// Decompiled by JEB v5.42.0.202606242140

package c.ˑˏ;

import c.ᵢˎ.CLS327;
import c.ﾞʾ.CLS365;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS231 {
    public static final int[][] FLD926;
    public static final int[][] FLD927;
    public static final int[][] FLD928;
    public static final int[][] FLD929;

    static {
        CLS231.FLD928 = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        CLS231.FLD929 = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        CLS231.FLD926 = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 0x20, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 0x30, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 0x20, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 0x72, -1, -1}, new int[]{6, 34, 62, 90, 0x76, -1, -1}, new int[]{6, 26, 50, 74, 98, 0x7A, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 0x86, -1}, new int[]{6, 34, 60, 86, 0x70, 0x8A, -1}, new int[]{6, 30, 58, 86, 0x72, 0x8E, -1}, new int[]{6, 34, 62, 90, 0x76, 0x92, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}};
        CLS231.FLD927 = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    }

    public static void MTH3151(CLS235 ﾞⁱ0) {
        ﾞⁱ0.MTH3196(-1);
    }

    public static void MTH3152(int v, int v1, CLS235 ﾞⁱ0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            for(int v3 = 0; v3 < 7; ++v3) {
                ﾞⁱ0.MTH3195(v + v3, v1 + v2, CLS231.FLD928[v2][v3]);
            }
        }
    }

    public static void MTH3153(ErrorCorrectionLevel errorCorrectionLevel0, int v, CLS235 ﾞⁱ0) {
        CLS365 ⁱˋ0 = new CLS365();
        CLS231.MTH3167(errorCorrectionLevel0, v, ⁱˋ0);
        for(int v1 = 0; v1 < ⁱˋ0.MTH5007(); ++v1) {
            boolean z = ⁱˋ0.MTH5018(ⁱˋ0.MTH5007() - 1 - v1);
            int[] arr_v = CLS231.FLD927[v1];
            ﾞⁱ0.MTH3197(arr_v[0], arr_v[1], z);
            if(v1 < 8) {
                ﾞⁱ0.MTH3197(ﾞⁱ0.MTH3193() - v1 - 1, 8, z);
            }
            else {
                ﾞⁱ0.MTH3197(8, ﾞⁱ0.MTH3194() - 7 + (v1 - 8), z);
            }
        }
    }

    public static void MTH3154(CLS235 ﾞⁱ0) {
        if(ﾞⁱ0.MTH3198(8, ﾞⁱ0.MTH3194() - 8) == 0) {
            throw new WriterException();
        }
        ﾞⁱ0.MTH3195(8, ﾞⁱ0.MTH3194() - 8, 1);
    }

    public static void MTH3155(int v, int v1, CLS235 ﾞⁱ0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            int v3 = v1 + v2;
            if(!CLS231.MTH3163(ﾞⁱ0.MTH3198(v, v3))) {
                throw new WriterException();
            }
            ﾞⁱ0.MTH3195(v, v3, 0);
        }
    }

    public static void MTH3156(CLS327 ᵔʼ0, CLS235 ﾞⁱ0) {
        CLS231.MTH3165(ﾞⁱ0);
        CLS231.MTH3154(ﾞⁱ0);
        CLS231.MTH3162(ᵔʼ0, ﾞⁱ0);
        CLS231.MTH3157(ﾞⁱ0);
    }

    public static void MTH3157(CLS235 ﾞⁱ0) {
        for(int v = 8; v < ﾞⁱ0.MTH3193() - 8; ++v) {
            int v1 = (v + 1) % 2;
            if(CLS231.MTH3163(ﾞⁱ0.MTH3198(v, 6))) {
                ﾞⁱ0.MTH3195(v, 6, v1);
            }
            if(CLS231.MTH3163(ﾞⁱ0.MTH3198(6, v))) {
                ﾞⁱ0.MTH3195(6, v, v1);
            }
        }
    }

    public static void MTH3158(CLS365 ⁱˋ0, int v, CLS235 ﾞⁱ0) {
        boolean z;
        int v1 = ﾞⁱ0.MTH3193() - 1;
        int v2 = ﾞⁱ0.MTH3194() - 1;
        int v3 = 0;
        int v4 = -1;
        while(v1 > 0) {
            if(v1 == 6) {
                v1 = 5;
            }
            while(v2 >= 0 && v2 < ﾞⁱ0.MTH3194()) {
                for(int v5 = 0; v5 < 2; ++v5) {
                    int v6 = v1 - v5;
                    if(CLS231.MTH3163(ﾞⁱ0.MTH3198(v6, v2))) {
                        if(v3 < ⁱˋ0.MTH5007()) {
                            z = ⁱˋ0.MTH5018(v3);
                            ++v3;
                        }
                        else {
                            z = false;
                        }
                        if(v != -1 && CLS232.MTH3173(v, v6, v2)) {
                            z = !z;
                        }
                        ﾞⁱ0.MTH3197(v6, v2, z);
                    }
                }
                v2 += v4;
            }
            v4 = -v4;
            v2 += v4;
            v1 -= 2;
        }
        if(v3 != ⁱˋ0.MTH5007()) {
            throw new WriterException("Not all bits consumed: " + v3 + '/' + ⁱˋ0.MTH5007());
        }
    }

    public static int MTH3159(int v) {
        return 0x20 - Integer.numberOfLeadingZeros(v);
    }

    public static void MTH3160(CLS327 ᵔʼ0, CLS235 ﾞⁱ0) {
        if(ᵔʼ0.MTH4746() < 7) {
            return;
        }
        CLS365 ⁱˋ0 = new CLS365();
        CLS231.MTH3161(ᵔʼ0, ⁱˋ0);
        int v = 17;
        for(int v1 = 0; v1 < 6; ++v1) {
            for(int v2 = 0; v2 < 3; ++v2) {
                boolean z = ⁱˋ0.MTH5018(v);
                --v;
                ﾞⁱ0.MTH3197(v1, ﾞⁱ0.MTH3194() - 11 + v2, z);
                ﾞⁱ0.MTH3197(ﾞⁱ0.MTH3194() - 11 + v2, v1, z);
            }
        }
    }

    public static void MTH3161(CLS327 ᵔʼ0, CLS365 ⁱˋ0) {
        ⁱˋ0.MTH5001(ᵔʼ0.MTH4746(), 6);
        ⁱˋ0.MTH5001(CLS231.MTH3169(ᵔʼ0.MTH4746(), 0x1F25), 12);
        if(ⁱˋ0.MTH5007() != 18) {
            throw new WriterException("should not happen but we got: " + ⁱˋ0.MTH5007());
        }
    }

    public static void MTH3162(CLS327 ᵔʼ0, CLS235 ﾞⁱ0) {
        if(ᵔʼ0.MTH4746() < 2) {
            return;
        }
        int[] arr_v = CLS231.FLD926[ᵔʼ0.MTH4746() - 1];
        for(int v = 0; v < arr_v.length; ++v) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                int v2 = arr_v[v];
                int v3 = arr_v[v1];
                if(v3 != -1 && v2 != -1 && CLS231.MTH3163(ﾞⁱ0.MTH3198(v3, v2))) {
                    CLS231.MTH3164(v3 - 2, v2 - 2, ﾞⁱ0);
                }
            }
        }
    }

    public static boolean MTH3163(int v) {
        return v == -1;
    }

    public static void MTH3164(int v, int v1, CLS235 ﾞⁱ0) {
        for(int v2 = 0; v2 < 5; ++v2) {
            for(int v3 = 0; v3 < 5; ++v3) {
                ﾞⁱ0.MTH3195(v + v3, v1 + v2, CLS231.FLD929[v2][v3]);
            }
        }
    }

    public static void MTH3165(CLS235 ﾞⁱ0) {
        int v = CLS231.FLD928[0].length;
        CLS231.MTH3152(0, 0, ﾞⁱ0);
        CLS231.MTH3152(ﾞⁱ0.MTH3193() - v, 0, ﾞⁱ0);
        CLS231.MTH3152(0, ﾞⁱ0.MTH3193() - v, ﾞⁱ0);
        CLS231.MTH3168(0, 7, ﾞⁱ0);
        CLS231.MTH3168(ﾞⁱ0.MTH3193() - 8, 7, ﾞⁱ0);
        CLS231.MTH3168(0, ﾞⁱ0.MTH3193() - 8, ﾞⁱ0);
        CLS231.MTH3155(7, 0, ﾞⁱ0);
        CLS231.MTH3155(ﾞⁱ0.MTH3194() - 8, 0, ﾞⁱ0);
        CLS231.MTH3155(7, ﾞⁱ0.MTH3194() - 7, ﾞⁱ0);
    }

    public static void MTH3166(CLS365 ⁱˋ0, ErrorCorrectionLevel errorCorrectionLevel0, CLS327 ᵔʼ0, int v, CLS235 ﾞⁱ0) {
        CLS231.MTH3151(ﾞⁱ0);
        CLS231.MTH3156(ᵔʼ0, ﾞⁱ0);
        CLS231.MTH3153(errorCorrectionLevel0, v, ﾞⁱ0);
        CLS231.MTH3160(ᵔʼ0, ﾞⁱ0);
        CLS231.MTH3158(ⁱˋ0, v, ﾞⁱ0);
    }

    public static void MTH3167(ErrorCorrectionLevel errorCorrectionLevel0, int v, CLS365 ⁱˋ0) {
        if(!CLS233.MTH3186(v)) {
            throw new WriterException("Invalid mask pattern");
        }
        int v1 = errorCorrectionLevel0.getBits() << 3 | v;
        ⁱˋ0.MTH5001(v1, 5);
        ⁱˋ0.MTH5001(CLS231.MTH3169(v1, 0x537), 10);
        CLS365 ⁱˋ1 = new CLS365();
        ⁱˋ1.MTH5001(0x5412, 15);
        ⁱˋ0.MTH5010(ⁱˋ1);
        if(ⁱˋ0.MTH5007() != 15) {
            throw new WriterException("should not happen but we got: " + ⁱˋ0.MTH5007());
        }
    }

    public static void MTH3168(int v, int v1, CLS235 ﾞⁱ0) {
        for(int v2 = 0; v2 < 8; ++v2) {
            int v3 = v + v2;
            if(!CLS231.MTH3163(ﾞⁱ0.MTH3198(v3, v1))) {
                throw new WriterException();
            }
            ﾞⁱ0.MTH3195(v3, v1, 0);
        }
    }

    public static int MTH3169(int v, int v1) {
        if(v1 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int v2 = CLS231.MTH3159(v1);
        int v3;
        for(v3 = v << v2 - 1; CLS231.MTH3159(v3) >= v2; v3 ^= v1 << CLS231.MTH3159(v3) - v2) {
        }
        return v3;
    }
}

