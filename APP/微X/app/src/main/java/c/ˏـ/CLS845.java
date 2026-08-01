// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;

public final class CLS845 extends CLS833 {
    public final int[] FLD433;

    public CLS845() {
        this.FLD433 = new int[4];
    }

    @Override  // c.ˏـ.CLS833
    public int MTH1731(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD433;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ⁱˋ0.MTH5007();
        int v1 = arr_v[1];
        for(int v2 = 0; v2 < 4 && v1 < v; ++v2) {
            stringBuilder0.append(((char)(CLS833.MTH1728(ⁱˋ0, arr_v1, v1, CLS833.FLD462) + 0x30)));
            for(int v3 = 0; v3 < arr_v1.length; ++v3) {
                v1 += arr_v1[v3];
            }
        }
        int v4 = CLS833.MTH1730(ⁱˋ0, v1, true, CLS833.FLD457)[1];
        for(int v5 = 0; v5 < 4 && v4 < v; ++v5) {
            stringBuilder0.append(((char)(CLS833.MTH1728(ⁱˋ0, arr_v1, v4, CLS833.FLD462) + 0x30)));
            for(int v6 = 0; v6 < arr_v1.length; ++v6) {
                v4 += arr_v1[v6];
            }
        }
        return v4;
    }

    @Override  // c.ˏـ.CLS833
    public BarcodeFormat MTH1736() {
        return BarcodeFormat.EAN_8;
    }
}

