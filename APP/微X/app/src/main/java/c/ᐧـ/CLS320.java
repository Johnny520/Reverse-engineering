// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

public final class CLS320 {
    public final StringBuilder FLD1461;
    public final int[] FLD1462;

    public CLS320() {
        this.FLD1462 = new int[4];
        this.FLD1461 = new StringBuilder();
    }

    public CLS379 MTH4651(int v, CLS118 ˆٴ0, int[] arr_v) {
        this.FLD1461.setLength(0);
        int v1 = this.MTH4652(ˆٴ0, arr_v, this.FLD1461);
        String s = this.FLD1461.toString();
        Map map0 = CLS320.MTH4653(s);
        CLS379 ٴˑ0 = new CLS379(s, null, new CLS380[]{new CLS380(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)), new CLS380(((float)v1), ((float)v))}, BarcodeFormat.UPC_EAN_EXTENSION);
        if(map0 != null) {
            ٴˑ0.MTH5119(map0);
        }
        return ٴˑ0;
    }

    public final int MTH4652(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD1462;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ˆٴ0.MTH2347();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 2 && v1 < v; ++v2) {
            int v4 = CLS836.MTH4634(ˆٴ0, arr_v1, v1, CLS836.FLD1453);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 1 - v2;
            }
            if(v2 != 1) {
                v1 = ˆٴ0.MTH2352(ˆٴ0.MTH2349(v1));
            }
        }
        if(stringBuilder0.length() != 2 || Integer.parseInt(stringBuilder0.toString()) % 4 != v3) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    public static Map MTH4653(String s) {
        if(s.length() != 2) {
            return null;
        }
        EnumMap enumMap0 = new EnumMap(ResultMetadataType.class);
        Integer integer0 = Integer.valueOf(s);
        enumMap0.put(ResultMetadataType.ISSUE_NUMBER, integer0);
        return enumMap0;
    }
}

