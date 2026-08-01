// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import com.google.zxing.BarcodeFormat;

public final class CLS848 extends CLS836 {
    public final int[] FLD1476;

    public CLS848() {
        this.FLD1476 = new int[4];
    }

    @Override  // c.ᐧـ.CLS836
    public int MTH4632(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD1476;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ˆٴ0.MTH2347();
        int v1 = arr_v[1];
        for(int v2 = 0; v2 < 4 && v1 < v; ++v2) {
            stringBuilder0.append(((char)(CLS836.MTH4634(ˆٴ0, arr_v1, v1, CLS836.FLD1452) + 0x30)));
            for(int v3 = 0; v3 < arr_v1.length; ++v3) {
                v1 += arr_v1[v3];
            }
        }
        int v4 = CLS836.MTH4637(ˆٴ0, v1, true, CLS836.FLD1449)[1];
        for(int v5 = 0; v5 < 4 && v4 < v; ++v5) {
            stringBuilder0.append(((char)(CLS836.MTH4634(ˆٴ0, arr_v1, v4, CLS836.FLD1452) + 0x30)));
            for(int v6 = 0; v6 < arr_v1.length; ++v6) {
                v4 += arr_v1[v6];
            }
        }
        return v4;
    }

    @Override  // c.ᐧـ.CLS836
    public BarcodeFormat MTH4635() {
        return BarcodeFormat.EAN_8;
    }
}

