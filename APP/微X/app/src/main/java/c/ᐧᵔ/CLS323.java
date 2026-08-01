// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import c.ˆᵢ.CLS80;
import c.ˆᵢ.CLS81;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS124;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

public final class CLS323 {
    public final CLS81 FLD1484;

    public CLS323() {
        this.FLD1484 = new CLS81(CLS80.FLD423);
    }

    public CLS124 MTH4694(CLS117 ʻᵢ0, Map map0) {
        CLS324 ˆٴ0 = new CLS324(ʻᵢ0);
        FormatException formatException0 = null;
        try {
            return this.MTH4696(ˆٴ0, map0);
        }
        catch(FormatException formatException1) {
            checksumException0 = null;
            formatException0 = formatException1;
        }
        catch(ChecksumException checksumException0) {
        }
        try {
            ˆٴ0.MTH4703();
            ˆٴ0.MTH4702(true);
            ˆٴ0.MTH4699();
            ˆٴ0.MTH4704();
            ˆٴ0.MTH4698();
            CLS124 ᵔﹶ0 = this.MTH4696(ˆٴ0, map0);
            ᵔﹶ0.MTH2406(new CLS326(true));
            return ᵔﹶ0;
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

    public final void MTH4695(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        try {
            this.FLD1484.MTH1902(arr_v, arr_b.length - v);
        }
        catch(ReedSolomonException unused_ex) {
            throw ChecksumException.getChecksumInstance();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)arr_v[v1];
        }
    }

    public final CLS124 MTH4696(CLS324 ˆٴ0, Map map0) {
        CLS329 ٴⁱ0 = ˆٴ0.MTH4699();
        ErrorCorrectionLevel errorCorrectionLevel0 = ˆٴ0.MTH4704().MTH4759();
        CLS322[] arr_ʻᵢ = CLS322.MTH4690(ˆٴ0.MTH4701(), ٴⁱ0, errorCorrectionLevel0);
        int v1 = 0;
        for(int v = 0; v < arr_ʻᵢ.length; ++v) {
            v1 += arr_ʻᵢ[v].MTH4692();
        }
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < arr_ʻᵢ.length; ++v2) {
            CLS322 ʻᵢ0 = arr_ʻᵢ[v2];
            byte[] arr_b1 = ʻᵢ0.MTH4691();
            int v4 = ʻᵢ0.MTH4692();
            this.MTH4695(arr_b1, v4);
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                arr_b[v3] = arr_b1[v5];
                ++v5;
            }
        }
        return CLS331.MTH4763(arr_b, ٴⁱ0, errorCorrectionLevel0, map0);
    }
}

