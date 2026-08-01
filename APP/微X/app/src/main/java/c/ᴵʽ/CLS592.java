// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʽ;

import c.יᵎ.CLS246;
import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ᵢˎ.CLS322;
import c.ᵢˎ.CLS329;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS362;
import c.ﾞʾ.CLS366;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

public class CLS592 implements CLS267 {
    public final CLS322 FLD1099;
    public static final CLS268[] FLD1100;

    static {
        CLS592.FLD1100 = new CLS268[0];
    }

    public CLS592() {
        this.FLD1099 = new CLS322();
    }

    public static float MTH3591(int[] arr_v, CLS366 ﾞⁱ0) {
        int v = ﾞⁱ0.MTH5046();
        int v1 = ﾞⁱ0.MTH5044();
        int v2 = arr_v[0];
        boolean z = true;
        int v3 = arr_v[1];
        int v4 = 0;
        while(v2 < v1 && v3 < v) {
            if(z != ﾞⁱ0.MTH5038(v2, v3)) {
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

    @Override  // c.ᐧᵎ.CLS267
    public final CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        CLS268[] arr_ᵔʼ;
        CLS360 ˉˎ0;
        if(map0 == null || !map0.containsKey(DecodeHintType.PURE_BARCODE)) {
            CLS362 ˋʼ0 = new CLS246(ﾞⁱ0.MTH3499()).MTH3260(map0);
            arr_ᵔʼ = ˋʼ0.MTH4980();
            ˉˎ0 = this.FLD1099.MTH4708(ˋʼ0.MTH4979(), map0);
        }
        else {
            CLS366 ﾞⁱ1 = CLS592.MTH3593(ﾞⁱ0.MTH3499());
            ˉˎ0 = this.FLD1099.MTH4708(ﾞⁱ1, map0);
            arr_ᵔʼ = CLS592.FLD1100;
        }
        if(ˉˎ0.MTH4968() instanceof CLS329) {
            ((CLS329)ˉˎ0.MTH4968()).MTH4759(arr_ᵔʼ);
        }
        CLS271 ﾞʿ0 = new CLS271(ˉˎ0.MTH4971(), ˉˎ0.MTH4966(), arr_ᵔʼ, BarcodeFormat.QR_CODE);
        List list0 = ˉˎ0.MTH4973();
        if(list0 != null) {
            ﾞʿ0.MTH3489(ResultMetadataType.BYTE_SEGMENTS, list0);
        }
        String s = ˉˎ0.MTH4975();
        if(s != null) {
            ﾞʿ0.MTH3489(ResultMetadataType.ERROR_CORRECTION_LEVEL, s);
        }
        if(ˉˎ0.MTH4964()) {
            ﾞʿ0.MTH3489(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, ˉˎ0.MTH4974());
            ﾞʿ0.MTH3489(ResultMetadataType.STRUCTURED_APPEND_PARITY, ˉˎ0.MTH4970());
        }
        return ﾞʿ0;
    }

    public static CLS366 MTH3593(CLS366 ﾞⁱ0) {
        int[] arr_v = ﾞⁱ0.MTH5034();
        int[] arr_v1 = ﾞⁱ0.MTH5036();
        if(arr_v == null || arr_v1 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float f = CLS592.MTH3591(arr_v, ﾞⁱ0);
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
            if(v3 >= ﾞⁱ0.MTH5044()) {
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
        CLS366 ﾞⁱ1 = new CLS366(v5, v6);
        for(int v11 = 0; v11 < v6; ++v11) {
            int v12 = ((int)(((float)v11) * f)) + v7;
            for(int v13 = 0; v13 < v5; ++v13) {
                if(ﾞⁱ0.MTH5038(((int)(((float)v13) * f)) + v8, v12)) {
                    ﾞⁱ1.MTH5035(v13, v11);
                }
            }
        }
        return ﾞⁱ1;
    }
}

