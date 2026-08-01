// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ˋﾞ.CLS103;
import c.ˋﾞ.CLS105;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS366;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

public final class CLS322 {
    public final CLS103 FLD1529;

    public CLS322() {
        this.FLD1529 = new CLS103(CLS105.FLD354);
    }

    public CLS360 MTH4708(CLS366 ﾞⁱ0, Map map0) {
        CLS328 ⁱˋ0 = new CLS328(ﾞⁱ0);
        FormatException formatException0 = null;
        try {
            return this.MTH4710(ⁱˋ0, map0);
        }
        catch(FormatException formatException1) {
            checksumException0 = null;
            formatException0 = formatException1;
        }
        catch(ChecksumException checksumException0) {
        }
        try {
            ⁱˋ0.MTH4754();
            ⁱˋ0.MTH4756(true);
            ⁱˋ0.MTH4752();
            ⁱˋ0.MTH4753();
            ⁱˋ0.MTH4757();
            CLS360 ˉˎ0 = this.MTH4710(ⁱˋ0, map0);
            ˉˎ0.MTH4967(new CLS329(true));
            return ˉˎ0;
        }
        catch(FormatException | ChecksumException formatException2) {
            if(formatException0 != null) {
                throw formatException0;
            }
            if(checksumException0 != null) {
                throw checksumException0;
            }
            throw formatException2;
        }
    }

    public final void MTH4709(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        try {
            this.FLD1529.MTH1406(arr_v, arr_b.length - v);
        }
        catch(ReedSolomonException unused_ex) {
            throw ChecksumException.getChecksumInstance();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)arr_v[v1];
        }
    }

    public final CLS360 MTH4710(CLS328 ⁱˋ0, Map map0) {
        CLS327 ᵔʼ0 = ⁱˋ0.MTH4752();
        ErrorCorrectionLevel errorCorrectionLevel0 = ⁱˋ0.MTH4753().MTH4726();
        CLS330[] arr_ﾞⁱ = CLS330.MTH4763(ⁱˋ0.MTH4751(), ᵔʼ0, errorCorrectionLevel0);
        int v1 = 0;
        for(int v = 0; v < arr_ﾞⁱ.length; ++v) {
            v1 += arr_ﾞⁱ[v].MTH4761();
        }
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < arr_ﾞⁱ.length; ++v2) {
            CLS330 ﾞⁱ0 = arr_ﾞⁱ[v2];
            byte[] arr_b1 = ﾞⁱ0.MTH4762();
            int v4 = ﾞⁱ0.MTH4761();
            this.MTH4709(arr_b1, v4);
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                arr_b[v3] = arr_b1[v5];
                ++v5;
            }
        }
        return CLS323.MTH4717(arr_b, ᵔʼ0, errorCorrectionLevel0, map0);
    }
}

