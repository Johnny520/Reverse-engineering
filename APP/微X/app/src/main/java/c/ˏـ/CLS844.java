// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

public final class CLS844 extends CLS833 {
    public final int[] FLD424;
    public static final int[] FLD425;

    static {
        CLS844.FLD425 = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    }

    public CLS844() {
        this.FLD424 = new int[4];
    }

    @Override  // c.ˏـ.CLS833
    public int MTH1731(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD424;
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
        CLS844.MTH1661(stringBuilder0, v3);
        int v6 = CLS833.MTH1730(ⁱˋ0, v1, true, CLS833.FLD457)[1];
        for(int v7 = 0; v7 < 6 && v6 < v; ++v7) {
            stringBuilder0.append(((char)(CLS833.MTH1728(ⁱˋ0, arr_v1, v6, CLS833.FLD462) + 0x30)));
            for(int v8 = 0; v8 < arr_v1.length; ++v8) {
                v6 += arr_v1[v8];
            }
        }
        return v6;
    }

    public static void MTH1661(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            if(v == CLS844.FLD425[v1]) {
                stringBuilder0.insert(0, ((char)(v1 + 0x30)));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override  // c.ˏـ.CLS833
    public BarcodeFormat MTH1736() {
        return BarcodeFormat.EAN_13;
    }
}

