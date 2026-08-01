// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public final class CLS330 {
    public final int FLD1549;
    public final byte[] FLD1550;

    public CLS330(int v, byte[] arr_b) {
        this.FLD1549 = v;
        this.FLD1550 = arr_b;
    }

    public int MTH4761() {
        return this.FLD1549;
    }

    public byte[] MTH4762() {
        return this.FLD1550;
    }

    public static CLS330[] MTH4763(byte[] arr_b, CLS327 ᵔʼ0, ErrorCorrectionLevel errorCorrectionLevel0) {
        if(arr_b.length != ᵔʼ0.MTH4745()) {
            throw new IllegalArgumentException();
        }
        CLS326 ᵔʼ$ﾞⁱ0 = ᵔʼ0.MTH4744(errorCorrectionLevel0);
        CLS325[] arr_ᵔʼ$ⁱˋ = ᵔʼ$ﾞⁱ0.MTH4735();
        int v1 = 0;
        for(int v = 0; v < arr_ᵔʼ$ⁱˋ.length; ++v) {
            v1 += arr_ᵔʼ$ⁱˋ[v].MTH4730();
        }
        CLS330[] arr_ﾞⁱ = new CLS330[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ᵔʼ$ⁱˋ.length; ++v2) {
            CLS325 ᵔʼ$ⁱˋ0 = arr_ᵔʼ$ⁱˋ[v2];
            int v4 = 0;
            while(v4 < ᵔʼ$ⁱˋ0.MTH4730()) {
                int v5 = ᵔʼ$ⁱˋ0.MTH4731();
                arr_ﾞⁱ[v3] = new CLS330(v5, new byte[ᵔʼ$ﾞⁱ0.MTH4736() + v5]);
                ++v4;
                ++v3;
            }
        }
        int v6 = arr_ﾞⁱ[0].FLD1550.length;
        int v7;
        for(v7 = v1 - 1; v7 >= 0 && arr_ﾞⁱ[v7].FLD1550.length != v6; --v7) {
        }
        int v8 = v6 - ᵔʼ$ﾞⁱ0.MTH4736();
        int v10 = 0;
        for(int v9 = 0; v9 < v8; ++v9) {
            int v11 = 0;
            while(v11 < v3) {
                arr_ﾞⁱ[v11].FLD1550[v9] = arr_b[v10];
                ++v11;
                ++v10;
            }
        }
        int v12 = v7 + 1;
        while(v12 < v3) {
            arr_ﾞⁱ[v12].FLD1550[v8] = arr_b[v10];
            ++v12;
            ++v10;
        }
        while(v8 < arr_ﾞⁱ[0].FLD1550.length) {
            int v13 = 0;
            while(v13 < v3) {
                arr_ﾞⁱ[v13].FLD1550[(v13 >= v7 + 1 ? v8 + 1 : v8)] = arr_b[v10];
                ++v13;
                ++v10;
            }
            ++v8;
        }
        return arr_ﾞⁱ;
    }
}

