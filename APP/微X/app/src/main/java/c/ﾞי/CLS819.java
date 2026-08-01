// Decompiled by JEB v5.42.0.202606242140

package c.ﾞי;

import c.ˎˊ.CLS117;
import c.ˎˊ.CLS123;
import c.ˎˊ.CLS124;
import c.ˑٴ.CLS137;
import c.ᐧᵔ.CLS323;
import c.ᐧᵔ.CLS326;
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

public class CLS819 implements CLS381 {
    public static final CLS380[] FLD1643;
    public final CLS323 FLD1644;

    static {
        CLS819.FLD1643 = new CLS380[0];
    }

    public CLS819() {
        this.FLD1644 = new CLS323();
    }

    public static CLS117 MTH5080(CLS117 ʻᵢ0) {
        int[] arr_v = ʻᵢ0.MTH2324();
        int[] arr_v1 = ʻᵢ0.MTH2319();
        if(arr_v == null || arr_v1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float f = CLS819.MTH5082(arr_v, ʻᵢ0);
        int v = arr_v[1];
        int v1 = arr_v1[1];
        int v2 = arr_v[0];
        int v3 = arr_v1[0];
        if(v2 >= v3 || v >= v1) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v4 = v1 - v;
        if(v4 != v3 - v2) {
            v3 = v2 + v4;
            if(v3 >= ʻᵢ0.MTH2325()) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        int v5 = Math.round(((float)(v3 - v2 + 1)) / f);
        int v6 = Math.round(((float)(v4 + 1)) / f);
        if(v5 <= 0 || v6 <= 0 || v6 != v5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v7 = v + ((int)(f / 2.0f));
        int v8 = v2 + ((int)(f / 2.0f));
        int v9 = ((int)(((float)(v5 - 1)) * f)) + v8 - v3;
        if(v9 > 0) {
            if(v9 > ((int)(f / 2.0f))) {
                throw NotFoundException.getNotFoundInstance();
            }
            v8 -= v9;
        }
        int v10 = ((int)(((float)(v6 - 1)) * f)) + v7 - v1;
        if(v10 > 0) {
            if(v10 > ((int)(f / 2.0f))) {
                throw NotFoundException.getNotFoundInstance();
            }
            v7 -= v10;
        }
        CLS117 ʻᵢ1 = new CLS117(v5, v6);
        for(int v11 = 0; v11 < v6; ++v11) {
            int v12 = ((int)(((float)v11) * f)) + v7;
            for(int v13 = 0; v13 < v5; ++v13) {
                if(ʻᵢ0.MTH2331(((int)(((float)v13) * f)) + v8, v12)) {
                    ʻᵢ1.MTH2318(v13, v11);
                }
            }
        }
        return ʻᵢ1;
    }

    @Override  // c.ﾞﹶ.CLS381
    public final CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        CLS380[] arr_ٴⁱ;
        CLS124 ᵔﹶ0;
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            CLS123 ᴵⁱ0 = new CLS137(ʻᵢ0.MTH5087()).MTH2544(map0);
            arr_ٴⁱ = ᴵⁱ0.MTH2395();
            ᵔﹶ0 = this.FLD1644.MTH4694(ᴵⁱ0.MTH2396(), map0);
        }
        else {
            CLS117 ʻᵢ1 = CLS819.MTH5080(ʻᵢ0.MTH5087());
            ᵔﹶ0 = this.FLD1644.MTH4694(ʻᵢ1, map0);
            arr_ٴⁱ = CLS819.FLD1643;
        }
        if(ᵔﹶ0.MTH2411() instanceof CLS326) {
            ((CLS326)ᵔﹶ0.MTH2411()).MTH4729(arr_ٴⁱ);
        }
        CLS379 ٴˑ0 = new CLS379(ᵔﹶ0.MTH2409(), ᵔﹶ0.MTH2401(), arr_ٴⁱ, BarcodeFormat.QR_CODE);
        List list0 = ᵔﹶ0.MTH2402();
        if(list0 != null) {
            ٴˑ0.MTH5120(ResultMetadataType.BYTE_SEGMENTS, list0);
        }
        String s = ᵔﹶ0.MTH2399();
        if(s != null) {
            ٴˑ0.MTH5120(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        if(ᵔﹶ0.MTH2404()) {
            ٴˑ0.MTH5120(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, ᵔﹶ0.MTH2408());
            ٴˑ0.MTH5120(ResultMetadataType.STRUCTURED_APPEND_PARITY, ᵔﹶ0.MTH2410());
        }
        return ٴˑ0;
    }

    public static float MTH5082(int[] arr_v, CLS117 ʻᵢ0) {
        int v = ʻᵢ0.MTH2328();
        int v1 = ʻᵢ0.MTH2325();
        int v2 = arr_v[0];
        boolean z = true;
        int v3 = arr_v[1];
        int v4 = 0;
        while(v2 < v1 && v3 < v) {
            if(z != ʻᵢ0.MTH2331(v2, v3)) {
                ++v4;
                if(v4 == 5) {
                    break;
                }
                z = !z;
            }
            ++v2;
            ++v3;
        }
        if(v2 == v1 || v3 == v) {
            throw NotFoundException.getNotFoundInstance();
        }
        return ((float)(v2 - arr_v[0])) / 7.0f;
    }
}

