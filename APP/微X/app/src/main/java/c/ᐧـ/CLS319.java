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

public final class CLS319 {
    public final StringBuilder FLD1444;
    public final int[] FLD1445;
    public static final int[] FLD1446;

    static {
        CLS319.FLD1446 = new int[]{24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    }

    public CLS319() {
        this.FLD1445 = new int[4];
        this.FLD1444 = new StringBuilder();
    }

    public CLS379 MTH4619(int v, CLS118 ˆٴ0, int[] arr_v) {
        this.FLD1444.setLength(0);
        int v1 = this.MTH4621(ˆٴ0, arr_v, this.FLD1444);
        String s = this.FLD1444.toString();
        Map map0 = CLS319.MTH4623(s);
        CLS379 ٴˑ0 = new CLS379(s, null, new CLS380[]{new CLS380(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)), new CLS380(((float)v1), ((float)v))}, BarcodeFormat.UPC_EAN_EXTENSION);
        if(map0 != null) {
            ٴˑ0.MTH5119(map0);
        }
        return ٴˑ0;
    }

    public static String MTH4620(String s) {
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

    public final int MTH4621(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        int[] arr_v1 = this.FLD1445;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        arr_v1[2] = 0;
        arr_v1[3] = 0;
        int v = ˆٴ0.MTH2347();
        int v1 = arr_v[1];
        int v3 = 0;
        for(int v2 = 0; v2 < 5 && v1 < v; ++v2) {
            int v4 = CLS836.MTH4634(ˆٴ0, arr_v1, v1, CLS836.FLD1453);
            stringBuilder0.append(((char)(v4 % 10 + 0x30)));
            for(int v5 = 0; v5 < arr_v1.length; ++v5) {
                v1 += arr_v1[v5];
            }
            if(v4 >= 10) {
                v3 |= 1 << 4 - v2;
            }
            if(v2 != 4) {
                v1 = ˆٴ0.MTH2352(ˆٴ0.MTH2349(v1));
            }
        }
        if(stringBuilder0.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v6 = CLS319.MTH4622(v3);
        if(CLS319.MTH4624(stringBuilder0.toString()) != v6) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    public static int MTH4622(int v) {
        for(int v1 = 0; v1 < 10; ++v1) {
            if(v == CLS319.FLD1446[v1]) {
                return v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static Map MTH4623(String s) {
        if(s.length() != 5) {
            return null;
        }
        String s1 = CLS319.MTH4620(s);
        if(s1 == null) {
            return null;
        }
        EnumMap enumMap0 = new EnumMap(ResultMetadataType.class);
        enumMap0.put(ResultMetadataType.SUGGESTED_PRICE, s1);
        return enumMap0;
    }

    public static int MTH4624(CharSequence charSequence0) {
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
}

