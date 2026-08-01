// Decompiled by JEB v5.42.0.202606242140

package c.ᵢᴵ;

import c.ʻˎ.CLS20;
import c.ˈˎ.CLS92;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS123;
import c.ˎˊ.CLS124;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import c.ﾞﹶ.CLS381;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

public final class CLS816 implements CLS381 {
    public static final CLS380[] FLD1574;
    public final CLS92 FLD1575;

    static {
        CLS816.FLD1574 = new CLS380[0];
    }

    public CLS816() {
        this.FLD1575 = new CLS92();
    }

    public static CLS117 MTH4902(CLS117 ʻᵢ0) {
        int[] arr_v = ʻᵢ0.MTH2324();
        int[] arr_v1 = ʻᵢ0.MTH2319();
        if(arr_v == null || arr_v1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = CLS816.MTH4904(arr_v, ʻᵢ0);
        int v1 = arr_v[1];
        int v2 = arr_v1[1];
        int v3 = arr_v[0];
        int v4 = (arr_v1[0] - v3 + 1) / v;
        int v5 = (v2 - v1 + 1) / v;
        if(v4 <= 0 || v5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS117 ʻᵢ1 = new CLS117(v4, v5);
        for(int v6 = 0; v6 < v5; ++v6) {
            int v7 = v6 * v + (v1 + v / 2);
            for(int v8 = 0; v8 < v4; ++v8) {
                if(ʻᵢ0.MTH2331(v8 * v + (v3 + v / 2), v7)) {
                    ʻᵢ1.MTH2318(v8, v6);
                }
            }
        }
        return ʻᵢ1;
    }

    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        CLS380[] arr_ٴⁱ;
        CLS124 ᵔﹶ0;
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            CLS123 ᴵⁱ0 = new CLS20(ʻᵢ0.MTH5087()).MTH751();
            arr_ٴⁱ = ᴵⁱ0.MTH2395();
            ᵔﹶ0 = this.FLD1575.MTH1961(ᴵⁱ0.MTH2396());
        }
        else {
            CLS117 ʻᵢ1 = CLS816.MTH4902(ʻᵢ0.MTH5087());
            ᵔﹶ0 = this.FLD1575.MTH1961(ʻᵢ1);
            arr_ٴⁱ = CLS816.FLD1574;
        }
        CLS379 ٴˑ0 = new CLS379(ᵔﹶ0.MTH2409(), ᵔﹶ0.MTH2401(), arr_ٴⁱ, BarcodeFormat.DATA_MATRIX);
        List list0 = ᵔﹶ0.MTH2402();
        if(list0 != null) {
            ٴˑ0.MTH5120(ResultMetadataType.BYTE_SEGMENTS, list0);
        }
        String s = ᵔﹶ0.MTH2399();
        if(s != null) {
            ٴˑ0.MTH5120(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        return ٴˑ0;
    }

    public static int MTH4904(int[] arr_v, CLS117 ʻᵢ0) {
        int v = ʻᵢ0.MTH2325();
        int v1 = arr_v[0];
        int v2 = arr_v[1];
        while(v1 < v && ʻᵢ0.MTH2331(v1, v2)) {
            ++v1;
        }
        if(v1 == v) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v3 = v1 - arr_v[0];
        if(v3 == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v3;
    }
}

