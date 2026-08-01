// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

public final class CLS847 extends CLS836 {
    public static final int[][] FLD1456;
    public static final int[] FLD1457;
    public final int[] FLD1458;
    public static final int[] FLD1459;

    static {
        CLS847.FLD1459 = new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
        CLS847.FLD1457 = new int[]{1, 1, 1, 1, 1, 1};
        CLS847.FLD1456 = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    }

    public CLS847() {
        this.FLD1458 = new int[4];
    }

    @Override  // c.ᐧـ.CLS836
    public int MTH4632(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD1458;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ˆٴ0.MTH2347();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 6 && v1 < v; ++v2) {
            int v4 = CLS836.MTH4634(ˆٴ0, arr_v1, v1, CLS836.FLD1453);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 5 - v2;
            }
        }
        CLS847.MTH4646(stringBuilder0, v3);
        return v1;
    }

    @Override  // c.ᐧـ.CLS836
    public BarcodeFormat MTH4635() {
        return BarcodeFormat.UPC_E;
    }

    public static String MTH4644(String s) {
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

    @Override  // c.ᐧـ.CLS836
    public int[] MTH4636(CLS118 ˆٴ0, int v) {
        return CLS836.MTH4637(ˆٴ0, v, true, CLS847.FLD1457);
    }

    public static void MTH4646(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 <= 1; ++v1) {
            for(int v2 = 0; v2 < 10; ++v2) {
                if(v == CLS847.FLD1456[v1][v2]) {
                    stringBuilder0.insert(0, ((char)(v1 + 0x30)));
                    stringBuilder0.append(((char)(v2 + 0x30)));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override  // c.ᐧـ.CLS836
    public boolean MTH4638(String s) {
        return ((CLS836)this).super.MTH4638(CLS847.MTH4644(s));
    }
}

