// Decompiled by JEB v5.42.0.202606242140

package c.ʼˊ;

import c.ʻˆ.CLS19;
import c.ˉᵎ.CLS95;
import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS362;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

public final class CLS408 implements CLS267 {
    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        FormatException formatException1;
        CLS268[] arr_ᵔʼ1;
        CLS268[] arr_ᵔʼ;
        CLS407 ⁱˋ1;
        CLS95 ⁱˋ0 = new CLS95(ﾞⁱ0.MTH3499());
        CLS360 ˉˎ0 = null;
        try {
            try {
                ⁱˋ1 = ⁱˋ0.MTH1254(false);
                arr_ᵔʼ = null;
                arr_ᵔʼ = ((CLS362)ⁱˋ1).MTH4980();
            }
            catch(NotFoundException notFoundException0) {
                arr_ᵔʼ = null;
                goto label_16;
            }
            try {
                arr_ᵔʼ1 = arr_ᵔʼ;
                formatException1 = null;
                ˉˎ0 = new CLS19().MTH744(ⁱˋ1);
                notFoundException0 = null;
                goto label_22;
            }
            catch(NotFoundException notFoundException0) {
            }
        label_16:
            arr_ᵔʼ1 = arr_ᵔʼ;
        }
        catch(FormatException formatException0) {
            arr_ᵔʼ1 = arr_ᵔʼ;
            formatException1 = formatException0;
            notFoundException0 = null;
        }
    label_22:
        if(ˉˎ0 == null) {
            try {
                CLS407 ⁱˋ2 = ⁱˋ0.MTH1254(true);
                arr_ᵔʼ1 = ((CLS362)ⁱˋ2).MTH4980();
                ˉˎ0 = new CLS19().MTH744(ⁱˋ2);
            }
            catch(NotFoundException | FormatException notFoundException1) {
                if(notFoundException0 != null) {
                    throw notFoundException0;
                }
                if(formatException1 == null) {
                    throw notFoundException1;
                }
                throw formatException1;
            }
        }
        if(map0 != null) {
            CLS266 ʾᐧ0 = (CLS266)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if(ʾᐧ0 != null) {
                for(int v = 0; v < arr_ᵔʼ1.length; ++v) {
                    ʾᐧ0.MTH3454(arr_ᵔʼ1[v]);
                }
            }
        }
        CLS271 ﾞʿ0 = new CLS271(ˉˎ0.MTH4971(), ˉˎ0.MTH4966(), ˉˎ0.MTH4963(), arr_ᵔʼ1, BarcodeFormat.AZTEC, System.currentTimeMillis());
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
}

