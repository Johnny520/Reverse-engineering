// Decompiled by JEB v5.42.0.202606242140

package c.יʾ;

import c.ˋﾞ.CLS103;
import c.ˋﾞ.CLS105;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS366;
import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS243 {
    public final CLS103 FLD966;

    public CLS243() {
        this.FLD966 = new CLS103(CLS105.FLD356);
    }

    public final void MTH3237(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        try {
            this.FLD966.MTH1406(arr_v, arr_b.length - v);
        }
        catch(ReedSolomonException unused_ex) {
            throw ChecksumException.getChecksumInstance();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)arr_v[v1];
        }
    }

    public CLS360 MTH3238(CLS366 ﾞⁱ0) {
        CLS244 ⁱˋ0 = new CLS244(ﾞⁱ0);
        CLS245[] arr_ﾞⁱ = CLS245.MTH3253(ⁱˋ0.MTH3240(), ⁱˋ0.MTH3249());
        int v1 = 0;
        for(int v = 0; v < arr_ﾞⁱ.length; ++v) {
            v1 += arr_ﾞⁱ[v].MTH3251();
        }
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < arr_ﾞⁱ.length; ++v2) {
            CLS245 ﾞⁱ1 = arr_ﾞⁱ[v2];
            byte[] arr_b1 = ﾞⁱ1.MTH3252();
            int v3 = ﾞⁱ1.MTH3251();
            this.MTH3237(arr_b1, v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                arr_b[v4 * arr_ﾞⁱ.length + v2] = arr_b1[v4];
            }
        }
        return CLS238.MTH3211(arr_b);
    }
}

