// Decompiled by JEB v5.42.0.202606242140

package c.ʾﹳ;

import c.יʾ.CLS243;
import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ᴵـ.CLS294;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS362;
import c.ﾞʾ.CLS366;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

public final class CLS409 implements CLS267 {
    public final CLS243 FLD130;
    public static final CLS268[] FLD131;

    static {
        CLS409.FLD131 = new CLS268[0];
    }

    public CLS409() {
        this.FLD130 = new CLS243();
    }

    public static int MTH863(int[] arr_v, CLS366 ﾞⁱ0) {
        int v = ﾞⁱ0.MTH5044();
        int v1 = arr_v[0];
        int v2 = arr_v[1];
        while(v1 < v && ﾞⁱ0.MTH5038(v1, v2)) {
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

    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        CLS268[] arr_ᵔʼ;
        CLS360 ˉˎ0;
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            CLS362 ˋʼ0 = new CLS294(ﾞⁱ0.MTH3499()).MTH3750();
            arr_ᵔʼ = ˋʼ0.MTH4980();
            ˉˎ0 = this.FLD130.MTH3238(ˋʼ0.MTH4979());
        }
        else {
            CLS366 ﾞⁱ1 = CLS409.MTH865(ﾞⁱ0.MTH3499());
            ˉˎ0 = this.FLD130.MTH3238(ﾞⁱ1);
            arr_ᵔʼ = CLS409.FLD131;
        }
        CLS271 ﾞʿ0 = new CLS271(ˉˎ0.MTH4971(), ˉˎ0.MTH4966(), arr_ᵔʼ, BarcodeFormat.DATA_MATRIX);
        List list0 = ˉˎ0.MTH4973();
        if(list0 != null) {
            ﾞʿ0.MTH3489(ResultMetadataType.BYTE_SEGMENTS, list0);
        }
        String s = ˉˎ0.MTH4975();
        if(s != null) {
            ﾞʿ0.MTH3489(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        return ﾞʿ0;
    }

    public static CLS366 MTH865(CLS366 ﾞⁱ0) {
        int[] arr_v = ﾞⁱ0.MTH5034();
        int[] arr_v1 = ﾞⁱ0.MTH5036();
        if(arr_v == null || arr_v1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v = CLS409.MTH863(arr_v, ﾞⁱ0);
        int v1 = arr_v[1];
        int v2 = arr_v1[1];
        int v3 = arr_v[0];
        int v4 = (arr_v1[0] - v3 + 1) / v;
        int v5 = (v2 - v1 + 1) / v;
        if(v4 <= 0 || v5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS366 ﾞⁱ1 = new CLS366(v4, v5);
        for(int v6 = 0; v6 < v5; ++v6) {
            int v7 = v6 * v + (v1 + v / 2);
            for(int v8 = 0; v8 < v4; ++v8) {
                if(ﾞⁱ0.MTH5038(v8 * v + (v3 + v / 2), v7)) {
                    ﾞⁱ1.MTH5035(v8, v6);
                }
            }
        }
        return ﾞⁱ1;
    }
}

