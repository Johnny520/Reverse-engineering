// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʽ;

import c.ˑˏ.CLS230;
import c.ˑˏ.CLS233;
import c.ˑˏ.CLS235;
import c.ᐧᵎ.CLS269;
import c.ﾞʾ.CLS366;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

public final class CLS593 implements CLS269 {
    @Override  // c.ᐧᵎ.CLS269
    public CLS366 MTH3473(String s, BarcodeFormat barcodeFormat0, int v, int v1, Map map0) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if(barcodeFormat0 != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat0);
        }
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + v + 'x' + v1);
        }
        ErrorCorrectionLevel errorCorrectionLevel0 = ErrorCorrectionLevel.L;
        int v2 = 4;
        if(map0 != null) {
            EncodeHintType encodeHintType0 = EncodeHintType.ERROR_CORRECTION;
            if(map0.containsKey(encodeHintType0)) {
                errorCorrectionLevel0 = ErrorCorrectionLevel.valueOf(map0.get(encodeHintType0).toString());
            }
            EncodeHintType encodeHintType1 = EncodeHintType.MARGIN;
            if(map0.containsKey(encodeHintType1)) {
                v2 = Integer.parseInt(map0.get(encodeHintType1).toString());
            }
        }
        return CLS593.MTH3596(CLS230.MTH3136(s, errorCorrectionLevel0, map0), v, v1, v2);
    }

    public static CLS366 MTH3596(CLS233 ˋʼ0, int v, int v1, int v2) {
        CLS235 ﾞⁱ0 = ˋʼ0.MTH3184();
        if(ﾞⁱ0 == null) {
            throw new IllegalStateException();
        }
        int v3 = ﾞⁱ0.MTH3193();
        int v4 = ﾞⁱ0.MTH3194();
        int v5 = v3 + (v2 << 1);
        int v6 = (v2 << 1) + v4;
        int v7 = Math.max(v, v5);
        int v8 = Math.max(v1, v6);
        int v9 = Math.min(v7 / v5, v8 / v6);
        int v10 = (v8 - v4 * v9) / 2;
        CLS366 ﾞⁱ1 = new CLS366(v7, v8);
        int v11 = 0;
        while(v11 < v4) {
            int v12 = (v7 - v3 * v9) / 2;
            int v13 = 0;
            while(v13 < v3) {
                if(ﾞⁱ0.MTH3198(v13, v11) == 1) {
                    ﾞⁱ1.MTH5037(v12, v10, v9, v9);
                }
                ++v13;
                v12 += v9;
            }
            ++v11;
            v10 += v9;
        }
        return ﾞⁱ1;
    }
}

