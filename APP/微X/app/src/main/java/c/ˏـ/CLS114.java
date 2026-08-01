// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

public final class CLS114 {
    public final int[] FLD426;
    public final StringBuilder FLD427;

    public CLS114() {
        this.FLD426 = new int[4];
        this.FLD427 = new StringBuilder();
    }

    public static Map MTH1664(String s) {
        if(s.length() != 2) {
            return null;
        }
        EnumMap enumMap0 = new EnumMap(ResultMetadataType.class);
        Integer integer0 = Integer.valueOf(s);
        enumMap0.put(ResultMetadataType.ISSUE_NUMBER, integer0);
        return enumMap0;
    }

    public final int MTH1665(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD426;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ⁱˋ0.MTH5007();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 2 && v1 < v; ++v2) {
            int v4 = CLS833.MTH1728(ⁱˋ0, arr_v1, v1, CLS833.FLD460);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 1 - v2;
            }
            if(v2 != 1) {
                v1 = ⁱˋ0.MTH5015(ⁱˋ0.MTH5002(v1));
            }
        }
        if(stringBuilder0.length() != 2 || Integer.parseInt(stringBuilder0.toString()) % 4 != v3) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    public CLS271 MTH1666(int v, CLS365 ⁱˋ0, int[] arr_v) {
        this.FLD427.setLength(0);
        int v1 = this.MTH1665(ⁱˋ0, arr_v, this.FLD427);
        String s = this.FLD427.toString();
        Map map0 = CLS114.MTH1664(s);
        CLS271 ﾞʿ0 = new CLS271(s, null, new CLS268[]{new CLS268(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)), new CLS268(((float)v1), ((float)v))}, BarcodeFormat.UPC_EAN_EXTENSION);
        if(map0 != null) {
            ﾞʿ0.MTH3491(map0);
        }
        return ﾞʿ0;
    }
}

