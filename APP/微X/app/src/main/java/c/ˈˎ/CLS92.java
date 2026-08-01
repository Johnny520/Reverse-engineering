// Decompiled by JEB v5.42.0.202606242140

package c.ˈˎ;

import c.ˆᵢ.CLS80;
import c.ˆᵢ.CLS81;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS124;
import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS92 {
    public final CLS81 FLD471;

    public CLS92() {
        this.FLD471 = new CLS81(CLS80.FLD431);
    }

    public CLS124 MTH1961(CLS117 ʻᵢ0) {
        CLS88 ˆٴ0 = new CLS88(ʻᵢ0);
        CLS83[] arr_ʻᵢ = CLS83.MTH1909(ˆٴ0.MTH1940(), ˆٴ0.MTH1935());
        int v1 = 0;
        for(int v = 0; v < arr_ʻᵢ.length; ++v) {
            v1 += arr_ʻᵢ[v].MTH1911();
        }
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < arr_ʻᵢ.length; ++v2) {
            CLS83 ʻᵢ1 = arr_ʻᵢ[v2];
            byte[] arr_b1 = ʻᵢ1.MTH1910();
            int v3 = ʻᵢ1.MTH1911();
            this.MTH1962(arr_b1, v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                arr_b[v4 * arr_ʻᵢ.length + v2] = arr_b1[v4];
            }
        }
        return CLS91.MTH1953(arr_b);
    }

    public final void MTH1962(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        try {
            this.FLD471.MTH1902(arr_v, arr_b.length - v);
        }
        catch(ReedSolomonException unused_ex) {
            throw ChecksumException.getChecksumInstance();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)arr_v[v1];
        }
    }
}

