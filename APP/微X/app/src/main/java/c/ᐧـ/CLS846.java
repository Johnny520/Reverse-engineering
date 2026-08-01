// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

public final class CLS846 extends CLS836 {
    public final int[] FLD1433;
    public static final int[] FLD1434;

    static {
        CLS846.FLD1434 = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    }

    public CLS846() {
        this.FLD1433 = new int[4];
    }

    @Override  // c.ᐧـ.CLS836
    public int MTH4632(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD1433;
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
        CLS846.MTH4597(stringBuilder0, v3);
        int v6 = CLS836.MTH4637(ˆٴ0, v1, true, CLS836.FLD1449)[1];
        for(int v7 = 0; v7 < 6 && v6 < v; ++v7) {
            stringBuilder0.append(((char)(CLS836.MTH4634(ˆٴ0, arr_v1, v6, CLS836.FLD1452) + 0x30)));
            for(int v8 = 0; v8 < arr_v1.length; ++v8) {
                v6 += arr_v1[v8];
            }
        }
        return v6;
    }

    @Override  // c.ᐧـ.CLS836
    public BarcodeFormat MTH4635() {
        return BarcodeFormat.EAN_13;
    }

    public static void MTH4597(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            if(v == CLS846.FLD1434[v1]) {
                stringBuilder0.insert(0, ((char)(v1 + 0x30)));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

