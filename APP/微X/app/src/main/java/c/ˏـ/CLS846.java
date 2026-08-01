// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

public final class CLS846 extends CLS833 {
    public final int[] FLD437;
    public static final int[][] FLD438;
    public static final int[] FLD439;
    public static final int[] FLD440;

    static {
        CLS846.FLD440 = new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
        CLS846.FLD439 = new int[]{1, 1, 1, 1, 1, 1};
        CLS846.FLD438 = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    }

    public CLS846() {
        this.FLD437 = new int[4];
    }

    @Override  // c.ˏـ.CLS833
    public int MTH1731(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD437;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ⁱˋ0.MTH5007();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 6 && v1 < v; ++v2) {
            int v4 = CLS833.MTH1728(ⁱˋ0, arr_v1, v1, CLS833.FLD460);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 5 - v2;
            }
        }
        CLS846.MTH1698(stringBuilder0, v3);
        return v1;
    }

    public static String MTH1697(String s) {
        char[] arr_c = new char[6];
        s.getChars(1, 7, arr_c, 0);
        StringBuilder stringBuilder0 = new StringBuilder(12);
        stringBuilder0.append(s.charAt(0));
        int v = arr_c[5];
        switch(v) {
            case 0x30: 
            case 49: 
            case 50: {
                stringBuilder0.append(arr_c, 0, 2);
                stringBuilder0.append(((char)v));
                stringBuilder0.append("0000");
                stringBuilder0.append(arr_c, 2, 3);
                break;
            }
            case 51: {
                stringBuilder0.append(arr_c, 0, 3);
                stringBuilder0.append("00000");
                stringBuilder0.append(arr_c, 3, 2);
                break;
            }
            case 52: {
                stringBuilder0.append(arr_c, 0, 4);
                stringBuilder0.append("00000");
                stringBuilder0.append(arr_c[4]);
                break;
            }
            default: {
                stringBuilder0.append(arr_c, 0, 5);
                stringBuilder0.append("0000");
                stringBuilder0.append(((char)v));
            }
        }
        stringBuilder0.append(s.charAt(7));
        return stringBuilder0.toString();
    }

    public static void MTH1698(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 <= 1; ++v1) {
            for(int v2 = 0; v2 < 10; ++v2) {
                if(v == CLS846.FLD438[v1][v2]) {
                    stringBuilder0.insert(0, ((char)(v1 + 0x30)));
                    stringBuilder0.append(((char)(v2 + 0x30)));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override  // c.ˏـ.CLS833
    public int[] MTH1735(CLS365 ⁱˋ0, int v) {
        return CLS833.MTH1730(ⁱˋ0, v, true, CLS846.FLD439);
    }

    @Override  // c.ˏـ.CLS833
    public BarcodeFormat MTH1736() {
        return BarcodeFormat.UPC_E;
    }

    @Override  // c.ˏـ.CLS833
    public boolean MTH1737(String s) {
        return ((CLS833)this).super.MTH1737(CLS846.MTH1697(s));
    }
}

