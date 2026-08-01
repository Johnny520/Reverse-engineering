// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS322 {
    public final byte[] FLD1482;
    public final int FLD1483;

    public CLS322(int v, byte[] arr_b) {
        this.FLD1483 = v;
        this.FLD1482 = arr_b;
    }

    public static CLS322[] MTH4690(byte[] arr_b, CLS329 ٴⁱ0, ErrorCorrectionLevel errorCorrectionLevel0) {
        if(arr_b.length != ٴⁱ0.MTH4748()) {
            throw new IllegalArgumentException();
        }
        CLS327 ٴⁱ$ʻᵢ0 = ٴⁱ0.MTH4749(errorCorrectionLevel0);
        CLS328[] arr_ٴⁱ$ˆٴ = ٴⁱ$ʻᵢ0.MTH4732();
        int v1 = 0;
        for(int v = 0; v < arr_ٴⁱ$ˆٴ.length; ++v) {
            v1 += arr_ٴⁱ$ˆٴ[v].MTH4737();
        }
        CLS322[] arr_ʻᵢ = new CLS322[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ٴⁱ$ˆٴ.length; ++v2) {
            CLS328 ٴⁱ$ˆٴ0 = arr_ٴⁱ$ˆٴ[v2];
            int v4 = 0;
            while(v4 < ٴⁱ$ˆٴ0.MTH4737()) {
                int v5 = ٴⁱ$ˆٴ0.MTH4736();
                arr_ʻᵢ[v3] = new CLS322(v5, new byte[ٴⁱ$ʻᵢ0.MTH4731() + v5]);
                ++v4;
                ++v3;
            }
        }
        int v6 = arr_ʻᵢ[0].FLD1482.length;
        int v7;
        for(v7 = v1 - 1; v7 >= 0 && arr_ʻᵢ[v7].FLD1482.length != v6; --v7) {
        }
        int v8 = v6 - ٴⁱ$ʻᵢ0.MTH4731();
        int v10 = 0;
        for(int v9 = 0; v9 < v8; ++v9) {
            int v11 = 0;
            while(v11 < v3) {
                arr_ʻᵢ[v11].FLD1482[v9] = arr_b[v10];
                ++v11;
                ++v10;
            }
        }
        int v12 = v7 + 1;
        while(v12 < v3) {
            arr_ʻᵢ[v12].FLD1482[v8] = arr_b[v10];
            ++v12;
            ++v10;
        }
        while(v8 < arr_ʻᵢ[0].FLD1482.length) {
            int v13 = 0;
            while(v13 < v3) {
                arr_ʻᵢ[v13].FLD1482[(v13 >= v7 + 1 ? v8 + 1 : v8)] = arr_b[v10];
                ++v13;
                ++v10;
            }
            ++v8;
        }
        return arr_ʻᵢ;
    }

    public byte[] MTH4691() {
        return this.FLD1482;
    }

    public int MTH4692() {
        return this.FLD1483;
    }
}

