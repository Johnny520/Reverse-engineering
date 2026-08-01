// Decompiled by JEB v5.42.0.202606242140

package c.ٴʻ;

import c.ˊﹳ.CLS97;
import c.ˎˊ.CLS123;
import c.ˎˊ.CLS124;
import c.ٴᵔ.CLS304;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import c.ﾞﹶ.CLS381;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

public final class CLS787 implements CLS381 {
    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        FormatException formatException1;
        CLS380[] arr_ٴⁱ1;
        CLS380[] arr_ٴⁱ;
        CLS788 ˆٴ1;
        CLS97 ˆٴ0 = new CLS97(ʻᵢ0.MTH5087());
        CLS124 ᵔﹶ0 = null;
        try {
            try {
                ˆٴ1 = ˆٴ0.MTH2061(false);
                arr_ٴⁱ = null;
                arr_ٴⁱ = ((CLS123)ˆٴ1).MTH2395();
            }
            catch(NotFoundException notFoundException0) {
                arr_ٴⁱ = null;
                goto label_16;
            }
            try {
                arr_ٴⁱ1 = arr_ٴⁱ;
                formatException1 = null;
                ᵔﹶ0 = new CLS304().MTH4438(ˆٴ1);
                notFoundException0 = null;
                goto label_22;
            }
            catch(NotFoundException notFoundException0) {
            }
        label_16:
            arr_ٴⁱ1 = arr_ٴⁱ;
        }
        catch(FormatException formatException0) {
            arr_ٴⁱ1 = arr_ٴⁱ;
            formatException1 = formatException0;
            notFoundException0 = null;
        }
    label_22:
        if(ᵔﹶ0 == null) {
            try {
                CLS788 ˆٴ2 = ˆٴ0.MTH2061(true);
                arr_ٴⁱ1 = ((CLS123)ˆٴ2).MTH2395();
                ᵔﹶ0 = new CLS304().MTH4438(ˆٴ2);
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
            CLS376 ˋᵎ0 = (CLS376)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if(ˋᵎ0 != null) {
                for(int v = 0; v < arr_ٴⁱ1.length; ++v) {
                    ˋᵎ0.MTH5101(arr_ٴⁱ1[v]);
                }
            }
        }
        CLS379 ٴˑ0 = new CLS379(ᵔﹶ0.MTH2409(), ᵔﹶ0.MTH2401(), ᵔﹶ0.MTH2407(), arr_ٴⁱ1, BarcodeFormat.AZTEC, System.currentTimeMillis());
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
}

