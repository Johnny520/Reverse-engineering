// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵔ;

import c.ˋﾞ.CLS103;
import c.ˋﾞ.CLS105;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS366;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

public final class CLS23 {
    public final CLS103 FLD115;

    public CLS23() {
        this.FLD115 = new CLS103(CLS105.FLD361);
    }

    public final void MTH784(byte[] arr_b, int v, int v1, int v2, int v3) {
        int v4 = v1 + v2;
        int v5 = v3 == 0 ? 1 : 2;
        int[] arr_v = new int[v4 / v5];
        for(int v7 = 0; v7 < v4; ++v7) {
            if(v3 == 0 || v7 % 2 == v3 - 1) {
                arr_v[v7 / v5] = arr_b[v7 + v] & 0xFF;
            }
        }
        try {
            this.FLD115.MTH1406(arr_v, v2 / v5);
        }
        catch(ReedSolomonException unused_ex) {
            throw ChecksumException.getChecksumInstance();
        }
        for(int v6 = 0; v6 < v1; ++v6) {
            if(v3 == 0 || v6 % 2 == v3 - 1) {
                arr_b[v6 + v] = (byte)arr_v[v6 / v5];
            }
        }
    }

    public CLS360 MTH785(CLS366 ﾞⁱ0, Map map0) {
        int v1;
        byte[] arr_b = new CLS24(ﾞⁱ0).MTH788();
        this.MTH784(arr_b, 0, 10, 10, 0);
        int v = arr_b[0] & 15;
        switch(v) {
            case 2: 
            case 3: 
            case 4: {
                this.MTH784(arr_b, 20, 84, 40, 1);
                this.MTH784(arr_b, 20, 84, 40, 2);
                v1 = 94;
                break;
            }
            case 5: {
                this.MTH784(arr_b, 20, 68, 56, 1);
                this.MTH784(arr_b, 20, 68, 56, 2);
                v1 = 78;
                break;
            }
            default: {
                throw FormatException.getFormatInstance();
            }
        }
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, 0, arr_b1, 0, 10);
        System.arraycopy(arr_b, 20, arr_b1, 10, arr_b1.length - 10);
        return CLS25.MTH796(arr_b1, v);
    }
}

