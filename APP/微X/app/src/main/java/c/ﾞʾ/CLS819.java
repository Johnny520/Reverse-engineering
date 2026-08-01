// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import c.ᐧᵎ.CLS265;
import c.ᐧᵎ.CLS270;
import com.google.zxing.NotFoundException;

public class CLS819 extends CLS270 {
    public final int[] FLD1651;
    public static final byte[] FLD1652;
    public byte[] FLD1653;

    static {
        CLS819.FLD1652 = new byte[0];
    }

    public CLS819(CLS265 ʾʻ0) {
        super(ʾʻ0);
        this.FLD1653 = CLS819.FLD1652;
        this.FLD1651 = new int[0x20];
    }

    @Override  // c.ᐧᵎ.CLS270
    public CLS365 MTH3475(int v, CLS365 ⁱˋ0) {
        CLS265 ʾʻ0 = ((CLS270)this).MTH3476();
        int v1 = ʾʻ0.MTH3450();
        if(ⁱˋ0 == null || ⁱˋ0.MTH5007() < v1) {
            ⁱˋ0 = new CLS365(v1);
        }
        else {
            ⁱˋ0.MTH5006();
        }
        this.MTH5023(v1);
        byte[] arr_b = ʾʻ0.MTH3448(v, this.FLD1653);
        int[] arr_v = this.FLD1651;
        for(int v3 = 0; v3 < v1; ++v3) {
            int v4 = (arr_b[v3] & 0xFF) >> 3;
            ++arr_v[v4];
        }
        int v5 = CLS819.MTH5024(arr_v);
        if(v1 < 3) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if((arr_b[v2] & 0xFF) < v5) {
                    ⁱˋ0.MTH5017(v2);
                }
            }
            return ⁱˋ0;
        }
        int v6 = 1;
        int v7 = arr_b[0] & 0xFF;
        for(int v8 = arr_b[1] & 0xFF; v6 < v1 - 1; v8 = v9) {
            int v9 = arr_b[v6 + 1] & 0xFF;
            if(((v8 << 2) - v7 - v9) / 2 < v5) {
                ⁱˋ0.MTH5017(v6);
            }
            v7 = v8;
            ++v6;
        }
        return ⁱˋ0;
    }

    public final void MTH5023(int v) {
        if(this.FLD1653.length < v) {
            this.FLD1653 = new byte[v];
        }
        for(int v1 = 0; v1 < 0x20; ++v1) {
            this.FLD1651[v1] = 0;
        }
    }

    public static int MTH5024(int[] arr_v) {
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v5 = arr_v[v1];
            if(v5 > v2) {
                v4 = v1;
                v2 = v5;
            }
            if(v5 > v3) {
                v3 = v5;
            }
        }
        int v6 = 0;
        int v7 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v8 = arr_v[v] * (v - v4) * (v - v4);
            if(v8 > v7) {
                v6 = v;
                v7 = v8;
            }
        }
        if(v4 <= v6) {
            int v9 = v4;
            v4 = v6;
            v6 = v9;
        }
        if(v4 - v6 <= arr_v.length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v10 = v4 - 1;
        int v11 = v10;
        int v12 = -1;
        while(v10 > v6) {
            int v13 = (v10 - v6) * (v10 - v6) * (v4 - v10) * (v3 - arr_v[v10]);
            if(v13 > v12) {
                v11 = v10;
                v12 = v13;
            }
            --v10;
        }
        return v11 << 3;
    }

    @Override  // c.ᐧᵎ.CLS270
    public CLS366 MTH3480() {
        CLS265 ʾʻ0 = ((CLS270)this).MTH3476();
        int v = ʾʻ0.MTH3450();
        int v1 = ʾʻ0.MTH3452();
        CLS366 ﾞⁱ0 = new CLS366(v, v1);
        this.MTH5023(v);
        int[] arr_v = this.FLD1651;
        for(int v2 = 1; v2 < 5; ++v2) {
            byte[] arr_b = ʾʻ0.MTH3448(v1 * v2 / 5, this.FLD1653);
            for(int v3 = v / 5; v3 < (v << 2) / 5; ++v3) {
                int v4 = (arr_b[v3] & 0xFF) >> 3;
                ++arr_v[v4];
            }
        }
        int v5 = CLS819.MTH5024(arr_v);
        byte[] arr_b1 = ʾʻ0.MTH3453();
        for(int v6 = 0; v6 < v1; ++v6) {
            int v7 = v6 * v;
            for(int v8 = 0; v8 < v; ++v8) {
                if((arr_b1[v7 + v8] & 0xFF) < v5) {
                    ﾞⁱ0.MTH5035(v8, v6);
                }
            }
        }
        return ﾞⁱ0;
    }
}

