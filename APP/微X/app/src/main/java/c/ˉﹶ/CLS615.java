// Decompiled by JEB v5.42.0.202606242140

package c.ˉﹶ;

import c.ˎˊ.CLS117;
import c.ˎˊ.CLS124;
import c.ⁱʽ.CLS358;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import c.ﾞﹶ.CLS381;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

public final class CLS615 implements CLS381 {
    public static final CLS380[] FLD494;
    public final CLS358 FLD495;

    static {
        CLS615.FLD494 = new CLS380[0];
    }

    public CLS615() {
        this.FLD495 = new CLS358();
    }

    public static CLS117 MTH2048(CLS117 ʻᵢ0) {
        int[] arr_v = ʻᵢ0.MTH2330();
        if(arr_v == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = arr_v[2];
        int v3 = arr_v[3];
        CLS117 ʻᵢ1 = new CLS117(30, 33);
        for(int v4 = 0; v4 < 33; ++v4) {
            int v5 = (v4 * v3 + v3 / 2) / 33 + v1;
            for(int v6 = 0; v6 < 30; ++v6) {
                if(ʻᵢ0.MTH2331((v6 * v2 + v2 / 2 + (v4 & 1) * v2 / 2) / 30 + v, v5)) {
                    ʻᵢ1.MTH2318(v6, v4);
                }
            }
        }
        return ʻᵢ1;
    }

    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS117 ʻᵢ1 = CLS615.MTH2048(ʻᵢ0.MTH5087());
        CLS124 ᵔﹶ0 = this.FLD495.MTH4919(ʻᵢ1, map0);
        CLS379 ٴˑ0 = new CLS379(ᵔﹶ0.MTH2409(), ᵔﹶ0.MTH2401(), CLS615.FLD494, BarcodeFormat.MAXICODE);
        String s = ᵔﹶ0.MTH2399();
        if(s != null) {
            ٴˑ0.MTH5120(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        return ٴˑ0;
    }
}

