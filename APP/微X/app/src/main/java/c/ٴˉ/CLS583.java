// Decompiled by JEB v5.42.0.202606242140

package c.ٴˉ;

import c.ʻᵔ.CLS23;
import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS366;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

public final class CLS583 implements CLS267 {
    public final CLS23 FLD1027;
    public static final CLS268[] FLD1028;

    static {
        CLS583.FLD1028 = new CLS268[0];
    }

    public CLS583() {
        this.FLD1027 = new CLS23();
    }

    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS366 ﾞⁱ1 = CLS583.MTH3396(ﾞⁱ0.MTH3499());
        CLS360 ˉˎ0 = this.FLD1027.MTH785(ﾞⁱ1, map0);
        CLS271 ﾞʿ0 = new CLS271(ˉˎ0.MTH4971(), ˉˎ0.MTH4966(), CLS583.FLD1028, BarcodeFormat.MAXICODE);
        String s = ˉˎ0.MTH4975();
        if(s != null) {
            ﾞʿ0.MTH3489(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        return ﾞʿ0;
    }

    public static CLS366 MTH3396(CLS366 ﾞⁱ0) {
        int[] arr_v = ﾞⁱ0.MTH5040();
        if(arr_v == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = arr_v[2];
        int v3 = arr_v[3];
        CLS366 ﾞⁱ1 = new CLS366(30, 33);
        for(int v4 = 0; v4 < 33; ++v4) {
            int v5 = (v4 * v3 + v3 / 2) / 33 + v1;
            for(int v6 = 0; v6 < 30; ++v6) {
                if(ﾞⁱ0.MTH5038((v6 * v2 + v2 / 2 + (v4 & 1) * v2 / 2) / 30 + v, v5)) {
                    ﾞⁱ1.MTH5035(v6, v4);
                }
            }
        }
        return ﾞⁱ1;
    }
}

