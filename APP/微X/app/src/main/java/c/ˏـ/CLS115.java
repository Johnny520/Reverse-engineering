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

public final class CLS115 {
    public static final int[] FLD434;
    public final int[] FLD435;
    public final StringBuilder FLD436;

    static {
        CLS115.FLD434 = new int[]{24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    }

    public CLS115() {
        this.FLD435 = new int[4];
        this.FLD436 = new StringBuilder();
    }

    public static int MTH1688(int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            if(v == CLS115.FLD434[v1]) {
                return v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static String MTH1689(String s) {
        String s1 = "";
        switch(s.charAt(0)) {
            case 0x30: {
                s1 = "£";
                break;
            }
            case 53: {
                s1 = "$";
                break;
            }
            case 57: {
                if("90000".equals(s)) {
                    return null;
                }
                if("99991".equals(s)) {
                    return "0.00";
                }
                if("99990".equals(s)) {
                    return "Used";
                }
            }
        }
        int v = Integer.parseInt(s.substring(1));
        String s2 = String.valueOf(v / 100);
        return v % 100 >= 10 ? s1 + s2 + '.' + v % 100 : s1 + s2 + '.' + ("0" + v % 100);
    }

    public static int MTH1690(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = v - 2;
        int v2 = 0;
        while(v1 >= 0) {
            v2 += charSequence0.charAt(v1) - 0x30;
            v1 -= 2;
        }
        int v3 = v2 * 3;
        for(int v4 = v - 1; v4 >= 0; v4 -= 2) {
            v3 += charSequence0.charAt(v4) - 0x30;
        }
        return v3 * 3 % 10;
    }

    public static Map MTH1691(String s) {
        if(s.length() != 5) {
            return null;
        }
        String s1 = CLS115.MTH1689(s);
        if(s1 == null) {
            return null;
        }
        EnumMap enumMap0 = new EnumMap(ResultMetadataType.class);
        enumMap0.put(ResultMetadataType.SUGGESTED_PRICE, s1);
        return enumMap0;
    }

    public final int MTH1692(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD435;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ⁱˋ0.MTH5007();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 5 && v1 < v; ++v2) {
            int v4 = CLS833.MTH1728(ⁱˋ0, arr_v1, v1, CLS833.FLD460);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 4 - v2;
            }
            if(v2 != 4) {
                v1 = ⁱˋ0.MTH5015(ⁱˋ0.MTH5002(v1));
            }
        }
        if(stringBuilder0.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v6 = CLS115.MTH1688(v3);
        if(CLS115.MTH1690(stringBuilder0.toString()) != v6) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    public CLS271 MTH1693(int v, CLS365 ⁱˋ0, int[] arr_v) {
        this.FLD436.setLength(0);
        int v1 = this.MTH1692(ⁱˋ0, arr_v, this.FLD436);
        String s = this.FLD436.toString();
        Map map0 = CLS115.MTH1691(s);
        CLS271 ﾞʿ0 = new CLS271(s, null, new CLS268[]{new CLS268(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)), new CLS268(((float)v1), ((float)v))}, BarcodeFormat.UPC_EAN_EXTENSION);
        if(map0 != null) {
            ﾞʿ0.MTH3491(map0);
        }
        return ﾞʿ0;
    }
}

